// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.geolocation.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.maps.geolocation.implementation.models.ErrorResponseException;
import com.azure.maps.geolocation.implementation.models.JsonFormat;
import com.azure.maps.geolocation.models.IpAddressToLocationResult;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in Geolocations. */
public final class GeolocationsImpl {
    /** The proxy service used to perform REST calls. */
    private final GeolocationsService service;

    /** The service client containing this operation class. */
    private final GeolocationClientImpl client;

    /**
     * Initializes an instance of GeolocationsImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    GeolocationsImpl(GeolocationClientImpl client) {
        this.service =
                RestProxy.create(GeolocationsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for GeolocationClientGeolocations to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "GeolocationClientGeo")
    private interface GeolocationsService {
        @Get("/geolocation/ip/{format}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<IpAddressToLocationResult>> getLocation(
                @HostParam("$host") String host,
                @HeaderParam("x-ms-client-id") String clientId,
                @QueryParam("api-version") String apiVersion,
                @PathParam("format") JsonFormat format,
                @QueryParam("ip") String ipAddress,
                @HeaderParam("Accept") String accept,
                Context context);
    }

    /**
     * **Applies to:** see pricing [tiers](https://aka.ms/AzureMapsPricingTier).
     *
     * <p>This service will return the ISO country code for the provided IP address. Developers can use this information
     * to block or alter certain content based on geographical locations where the application is being viewed from.
     *
     * @param format Desired format of the response. Only `json` format is supported.
     * @param ipAddress The IP address. Both IPv4 and IPv6 are allowed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful call to IP Address to country/region API along with {@link
     *     Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<IpAddressToLocationResult>> getLocationWithResponseAsync(JsonFormat format, String ipAddress) {
        final String accept = "application/json";
        return FluxUtil.withContext(
                context ->
                        service.getLocation(
                                this.client.getHost(),
                                this.client.getClientId(),
                                this.client.getApiVersion(),
                                format,
                                ipAddress,
                                accept,
                                context));
    }

    /**
     * **Applies to:** see pricing [tiers](https://aka.ms/AzureMapsPricingTier).
     *
     * <p>This service will return the ISO country code for the provided IP address. Developers can use this information
     * to block or alter certain content based on geographical locations where the application is being viewed from.
     *
     * @param format Desired format of the response. Only `json` format is supported.
     * @param ipAddress The IP address. Both IPv4 and IPv6 are allowed.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful call to IP Address to country/region API along with {@link
     *     Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<IpAddressToLocationResult>> getLocationWithResponseAsync(
            JsonFormat format, String ipAddress, Context context) {
        final String accept = "application/json";
        return service.getLocation(
                this.client.getHost(),
                this.client.getClientId(),
                this.client.getApiVersion(),
                format,
                ipAddress,
                accept,
                context);
    }

    /**
     * **Applies to:** see pricing [tiers](https://aka.ms/AzureMapsPricingTier).
     *
     * <p>This service will return the ISO country code for the provided IP address. Developers can use this information
     * to block or alter certain content based on geographical locations where the application is being viewed from.
     *
     * @param format Desired format of the response. Only `json` format is supported.
     * @param ipAddress The IP address. Both IPv4 and IPv6 are allowed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful call to IP Address to country/region API on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<IpAddressToLocationResult> getLocationAsync(JsonFormat format, String ipAddress) {
        return getLocationWithResponseAsync(format, ipAddress).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * **Applies to:** see pricing [tiers](https://aka.ms/AzureMapsPricingTier).
     *
     * <p>This service will return the ISO country code for the provided IP address. Developers can use this information
     * to block or alter certain content based on geographical locations where the application is being viewed from.
     *
     * @param format Desired format of the response. Only `json` format is supported.
     * @param ipAddress The IP address. Both IPv4 and IPv6 are allowed.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful call to IP Address to country/region API on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<IpAddressToLocationResult> getLocationAsync(JsonFormat format, String ipAddress, Context context) {
        return getLocationWithResponseAsync(format, ipAddress, context)
                .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * **Applies to:** see pricing [tiers](https://aka.ms/AzureMapsPricingTier).
     *
     * <p>This service will return the ISO country code for the provided IP address. Developers can use this information
     * to block or alter certain content based on geographical locations where the application is being viewed from.
     *
     * @param format Desired format of the response. Only `json` format is supported.
     * @param ipAddress The IP address. Both IPv4 and IPv6 are allowed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful call to IP Address to country/region API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public IpAddressToLocationResult getLocation(JsonFormat format, String ipAddress) {
        return getLocationAsync(format, ipAddress).block();
    }

    /**
     * **Applies to:** see pricing [tiers](https://aka.ms/AzureMapsPricingTier).
     *
     * <p>This service will return the ISO country code for the provided IP address. Developers can use this information
     * to block or alter certain content based on geographical locations where the application is being viewed from.
     *
     * @param format Desired format of the response. Only `json` format is supported.
     * @param ipAddress The IP address. Both IPv4 and IPv6 are allowed.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful call to IP Address to country/region API along with {@link
     *     Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<IpAddressToLocationResult> getLocationWithResponse(
            JsonFormat format, String ipAddress, Context context) {
        return getLocationWithResponseAsync(format, ipAddress, context).block();
    }
}