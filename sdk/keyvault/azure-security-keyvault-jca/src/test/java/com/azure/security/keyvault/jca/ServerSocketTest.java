// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.security.keyvault.jca;

import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.client5.http.impl.io.PoolingHttpClientConnectionManager;
import org.apache.hc.client5.http.socket.ConnectionSocketFactory;
import org.apache.hc.client5.http.ssl.SSLConnectionSocketFactory;
import org.apache.hc.client5.http.ssl.TrustSelfSignedStrategy;
import org.apache.hc.core5.http.ClassicHttpResponse;
import org.apache.hc.core5.http.config.RegistryBuilder;
import org.apache.hc.core5.http.io.HttpClientResponseHandler;
import org.apache.hc.core5.ssl.PrivateKeyDetails;
import org.apache.hc.core5.ssl.PrivateKeyStrategy;
import org.apache.hc.core5.ssl.SSLContexts;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLServerSocketFactory;
import javax.net.ssl.TrustManagerFactory;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.security.KeyStore;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * The unit test validating the ServerSocket is created using a certificate from Azure Key Vault.
 */
@EnabledIfEnvironmentVariable(named = "AZURE_KEYVAULT_CERTIFICATE_NAME", matches = "myalias")
public class ServerSocketTest {

    private static KeyStore ks;

    private static KeyManagerFactory kmf;

    private static String certificateName;

    @BeforeAll
    public static void beforeEach() throws Exception {
        PropertyConvertorUtils.putEnvironmentPropertyToSystemPropertyForKeyVaultJca();
        /*
         * Add JCA provider.
         */
        KeyVaultJcaProvider provider = new KeyVaultJcaProvider();
        Security.addProvider(provider);

        /**
         *  - Create an Azure Key Vault specific instance of a KeyStore.
         *  - Set the KeyManagerFactory to use that KeyStore.
         */
        ks = PropertyConvertorUtils.getKeyVaultKeyStore();
        kmf = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
        kmf.init(ks, "".toCharArray());
        certificateName = PropertyConvertorUtils.getPropertyValue("AZURE_KEYVAULT_CERTIFICATE_NAME");
    }

    private void startSocket(SSLServerSocket serverSocket) {
        Thread server = new Thread(() -> {
            while (true) {
                try {
                    Socket socket = serverSocket.accept();
                    try (OutputStream outputStream = socket.getOutputStream()) {
                        outputStream.write("HTTP/1.1 204\r\n".getBytes());
                        outputStream.flush();
                    }
                } catch (IOException ioe) {
                    ioe.printStackTrace();
                }
            }
        });
        server.start();
    }

    @Test
    public void testHttpsConnectionWithoutClientTrust() throws Exception {
        SSLContext sslContext = SSLContexts.custom()
            .loadTrustMaterial((final X509Certificate[] chain, final String authType) -> true)
            .build();
        testHttpsConnection(8765, sslContext);

    }

    @Test
    public void testHttpsConnectionWithSelfSignedClientTrust() throws Exception {
        SSLContext sslContext = SSLContexts.custom().loadTrustMaterial(ks, new TrustSelfSignedStrategy()).build();
        testHttpsConnection(8766, sslContext);

    }

    @Test
    public void testServerSocketWithDefaultTrustManager() throws Exception {
        serverSocketWithTrustManager(8768);
    }

    /**
     * Test SSLServerSocket with key vault trust manager.
     *
     * @throws Exception when a serious error occurs.
     */
    @Test
    public void testServerSocketWithKeyVaultTrustManager() throws Exception {
        KeyVaultTrustManagerFactoryProvider provider = new KeyVaultTrustManagerFactoryProvider();
        Security.addProvider(provider);
        serverSocketWithTrustManager(8767);
    }

    private void testHttpsConnection(Integer port, SSLContext sslContext) throws Exception {
        /*
         * Setup server side.
         *
         *  - Set the SSL context to use the KeyManagerFactory.
         *  - Create the SSLServerSocket using th SSL context.
         */

        SSLContext context = SSLContext.getInstance("TLS");
        context.init(kmf.getKeyManagers(), null, null);

        SSLServerSocketFactory factory = context.getServerSocketFactory();
        SSLServerSocket serverSocket = (SSLServerSocket) factory.createServerSocket(port);

        startSocket(serverSocket);

        /*
         * And now execute the test.
         */
        String result = sendRequest(sslContext, port);

        /*
         * And verify all went well.
         */
        assertEquals("Success", result);
    }

    private void serverSocketWithTrustManager(Integer port) throws Exception {
        /*
         * Setup server side.
         *
         *  - Set the SSL context to use the KeyManagerFactory.
         *  - Create the SSLServerSocket using th SSL context.
         */

        TrustManagerFactory tmf = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        tmf.init(ks);
        SSLContext context = SSLContext.getInstance("TLS");
        context.init(kmf.getKeyManagers(), tmf.getTrustManagers(), null);

        SSLServerSocketFactory factory = context.getServerSocketFactory();
        SSLServerSocket serverSocket = (SSLServerSocket) factory.createServerSocket(port);
        serverSocket.setNeedClientAuth(true);

        startSocket(serverSocket);

        /*
         * Setup client side
         *
         * - Create an SSL context.
         * - Set SSL context to trust any certificate.
         */

        SSLContext sslContext = SSLContexts.custom()
            .loadTrustMaterial(ks, new TrustSelfSignedStrategy())
            .loadKeyMaterial(ks, "".toCharArray(), new ClientPrivateKeyStrategy())
            .build();

        /*
         * And now execute the test.
         */
        String result = sendRequest(sslContext, port);

        /*
         * And verify all went well.
         */
        assertEquals("Success", result);
    }

    private String sendRequest(SSLContext sslContext, Integer port) {

        /**
         * - Create SSL connection factory.
         * - Set hostname verifier to trust any hostname.
         */
        SSLConnectionSocketFactory sslConnectionSocketFactory
            = new SSLConnectionSocketFactory(sslContext, (hostname, session) -> true);

        PoolingHttpClientConnectionManager manager = new PoolingHttpClientConnectionManager(
            RegistryBuilder.<ConnectionSocketFactory>create().register("https", sslConnectionSocketFactory).build());

        String result = null;

        try (CloseableHttpClient client = HttpClients.custom().setConnectionManager(manager).build()) {
            HttpGet httpGet = new HttpGet("https://localhost:" + port);
            HttpClientResponseHandler<String> responseHandler = (ClassicHttpResponse response) -> {
                int status = response.getCode();
                String result1 = null;
                if (status == 204) {
                    result1 = "Success";
                }
                return result1;
            };
            result = client.execute(httpGet, responseHandler);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return result;
    }

    private static class ClientPrivateKeyStrategy implements PrivateKeyStrategy {
        @Override
        public String chooseAlias(Map<String, PrivateKeyDetails> aliases, SSLParameters sslParameters) {
            return certificateName; // It should be your certificate alias used in client-side
        }
    }
}
