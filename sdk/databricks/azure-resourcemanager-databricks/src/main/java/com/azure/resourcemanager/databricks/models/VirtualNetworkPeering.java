// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databricks.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.databricks.fluent.models.VirtualNetworkPeeringInner;

/**
 * An immutable client-side representation of VirtualNetworkPeering.
 */
public interface VirtualNetworkPeering {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the allowVirtualNetworkAccess property: Whether the VMs in the local virtual network space would be able to
     * access the VMs in remote virtual network space.
     * 
     * @return the allowVirtualNetworkAccess value.
     */
    Boolean allowVirtualNetworkAccess();

    /**
     * Gets the allowForwardedTraffic property: Whether the forwarded traffic from the VMs in the local virtual network
     * will be allowed/disallowed in remote virtual network.
     * 
     * @return the allowForwardedTraffic value.
     */
    Boolean allowForwardedTraffic();

    /**
     * Gets the allowGatewayTransit property: If gateway links can be used in remote virtual networking to link to this
     * virtual network.
     * 
     * @return the allowGatewayTransit value.
     */
    Boolean allowGatewayTransit();

    /**
     * Gets the useRemoteGateways property: If remote gateways can be used on this virtual network. If the flag is set
     * to true, and allowGatewayTransit on remote peering is also true, virtual network will use gateways of remote
     * virtual network for transit. Only one peering can have this flag set to true. This flag cannot be set if virtual
     * network already has a gateway.
     * 
     * @return the useRemoteGateways value.
     */
    Boolean useRemoteGateways();

    /**
     * Gets the databricksVirtualNetwork property: The remote virtual network should be in the same region. See here to
     * learn more
     * (https://docs.microsoft.com/en-us/azure/databricks/administration-guide/cloud-configurations/azure/vnet-peering).
     * 
     * @return the databricksVirtualNetwork value.
     */
    VirtualNetworkPeeringPropertiesFormatDatabricksVirtualNetwork databricksVirtualNetwork();

    /**
     * Gets the databricksAddressSpace property: The reference to the databricks virtual network address space.
     * 
     * @return the databricksAddressSpace value.
     */
    AddressSpace databricksAddressSpace();

    /**
     * Gets the remoteVirtualNetwork property: The remote virtual network should be in the same region. See here to
     * learn more
     * (https://docs.microsoft.com/en-us/azure/databricks/administration-guide/cloud-configurations/azure/vnet-peering).
     * 
     * @return the remoteVirtualNetwork value.
     */
    VirtualNetworkPeeringPropertiesFormatRemoteVirtualNetwork remoteVirtualNetwork();

    /**
     * Gets the remoteAddressSpace property: The reference to the remote virtual network address space.
     * 
     * @return the remoteAddressSpace value.
     */
    AddressSpace remoteAddressSpace();

    /**
     * Gets the peeringState property: The status of the virtual network peering.
     * 
     * @return the peeringState value.
     */
    PeeringState peeringState();

    /**
     * Gets the provisioningState property: The provisioning state of the virtual network peering resource.
     * 
     * @return the provisioningState value.
     */
    PeeringProvisioningState provisioningState();

    /**
     * Gets the name of the resource group.
     * 
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.databricks.fluent.models.VirtualNetworkPeeringInner object.
     * 
     * @return the inner object.
     */
    VirtualNetworkPeeringInner innerModel();

    /**
     * The entirety of the VirtualNetworkPeering definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithParentResource,
        DefinitionStages.WithRemoteVirtualNetwork, DefinitionStages.WithCreate {
    }

    /**
     * The VirtualNetworkPeering definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the VirtualNetworkPeering definition.
         */
        interface Blank extends WithParentResource {
        }

        /**
         * The stage of the VirtualNetworkPeering definition allowing to specify parent resource.
         */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, workspaceName.
             * 
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param workspaceName The name of the workspace.
             * @return the next definition stage.
             */
            WithRemoteVirtualNetwork withExistingWorkspace(String resourceGroupName, String workspaceName);
        }

        /**
         * The stage of the VirtualNetworkPeering definition allowing to specify remoteVirtualNetwork.
         */
        interface WithRemoteVirtualNetwork {
            /**
             * Specifies the remoteVirtualNetwork property: The remote virtual network should be in the same region. See
             * here to learn more
             * (https://docs.microsoft.com/en-us/azure/databricks/administration-guide/cloud-configurations/azure/vnet-peering)..
             * 
             * @param remoteVirtualNetwork The remote virtual network should be in the same region. See here to learn
             * more
             * (https://docs.microsoft.com/en-us/azure/databricks/administration-guide/cloud-configurations/azure/vnet-peering).
             * @return the next definition stage.
             */
            WithCreate withRemoteVirtualNetwork(
                VirtualNetworkPeeringPropertiesFormatRemoteVirtualNetwork remoteVirtualNetwork);
        }

        /**
         * The stage of the VirtualNetworkPeering definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithAllowVirtualNetworkAccess,
            DefinitionStages.WithAllowForwardedTraffic, DefinitionStages.WithAllowGatewayTransit,
            DefinitionStages.WithUseRemoteGateways, DefinitionStages.WithDatabricksVirtualNetwork,
            DefinitionStages.WithDatabricksAddressSpace, DefinitionStages.WithRemoteAddressSpace {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            VirtualNetworkPeering create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            VirtualNetworkPeering create(Context context);
        }

        /**
         * The stage of the VirtualNetworkPeering definition allowing to specify allowVirtualNetworkAccess.
         */
        interface WithAllowVirtualNetworkAccess {
            /**
             * Specifies the allowVirtualNetworkAccess property: Whether the VMs in the local virtual network space
             * would be able to access the VMs in remote virtual network space..
             * 
             * @param allowVirtualNetworkAccess Whether the VMs in the local virtual network space would be able to
             * access the VMs in remote virtual network space.
             * @return the next definition stage.
             */
            WithCreate withAllowVirtualNetworkAccess(Boolean allowVirtualNetworkAccess);
        }

        /**
         * The stage of the VirtualNetworkPeering definition allowing to specify allowForwardedTraffic.
         */
        interface WithAllowForwardedTraffic {
            /**
             * Specifies the allowForwardedTraffic property: Whether the forwarded traffic from the VMs in the local
             * virtual network will be allowed/disallowed in remote virtual network..
             * 
             * @param allowForwardedTraffic Whether the forwarded traffic from the VMs in the local virtual network will
             * be allowed/disallowed in remote virtual network.
             * @return the next definition stage.
             */
            WithCreate withAllowForwardedTraffic(Boolean allowForwardedTraffic);
        }

        /**
         * The stage of the VirtualNetworkPeering definition allowing to specify allowGatewayTransit.
         */
        interface WithAllowGatewayTransit {
            /**
             * Specifies the allowGatewayTransit property: If gateway links can be used in remote virtual networking to
             * link to this virtual network..
             * 
             * @param allowGatewayTransit If gateway links can be used in remote virtual networking to link to this
             * virtual network.
             * @return the next definition stage.
             */
            WithCreate withAllowGatewayTransit(Boolean allowGatewayTransit);
        }

        /**
         * The stage of the VirtualNetworkPeering definition allowing to specify useRemoteGateways.
         */
        interface WithUseRemoteGateways {
            /**
             * Specifies the useRemoteGateways property: If remote gateways can be used on this virtual network. If the
             * flag is set to true, and allowGatewayTransit on remote peering is also true, virtual network will use
             * gateways of remote virtual network for transit. Only one peering can have this flag set to true. This
             * flag cannot be set if virtual network already has a gateway..
             * 
             * @param useRemoteGateways If remote gateways can be used on this virtual network. If the flag is set to
             * true, and allowGatewayTransit on remote peering is also true, virtual network will use gateways of remote
             * virtual network for transit. Only one peering can have this flag set to true. This flag cannot be set if
             * virtual network already has a gateway.
             * @return the next definition stage.
             */
            WithCreate withUseRemoteGateways(Boolean useRemoteGateways);
        }

        /**
         * The stage of the VirtualNetworkPeering definition allowing to specify databricksVirtualNetwork.
         */
        interface WithDatabricksVirtualNetwork {
            /**
             * Specifies the databricksVirtualNetwork property: The remote virtual network should be in the same region.
             * See here to learn more
             * (https://docs.microsoft.com/en-us/azure/databricks/administration-guide/cloud-configurations/azure/vnet-peering)..
             * 
             * @param databricksVirtualNetwork The remote virtual network should be in the same region. See here to
             * learn more
             * (https://docs.microsoft.com/en-us/azure/databricks/administration-guide/cloud-configurations/azure/vnet-peering).
             * @return the next definition stage.
             */
            WithCreate withDatabricksVirtualNetwork(
                VirtualNetworkPeeringPropertiesFormatDatabricksVirtualNetwork databricksVirtualNetwork);
        }

        /**
         * The stage of the VirtualNetworkPeering definition allowing to specify databricksAddressSpace.
         */
        interface WithDatabricksAddressSpace {
            /**
             * Specifies the databricksAddressSpace property: The reference to the databricks virtual network address
             * space..
             * 
             * @param databricksAddressSpace The reference to the databricks virtual network address space.
             * @return the next definition stage.
             */
            WithCreate withDatabricksAddressSpace(AddressSpace databricksAddressSpace);
        }

        /**
         * The stage of the VirtualNetworkPeering definition allowing to specify remoteAddressSpace.
         */
        interface WithRemoteAddressSpace {
            /**
             * Specifies the remoteAddressSpace property: The reference to the remote virtual network address space..
             * 
             * @param remoteAddressSpace The reference to the remote virtual network address space.
             * @return the next definition stage.
             */
            WithCreate withRemoteAddressSpace(AddressSpace remoteAddressSpace);
        }
    }

    /**
     * Begins update for the VirtualNetworkPeering resource.
     * 
     * @return the stage of resource update.
     */
    VirtualNetworkPeering.Update update();

    /**
     * The template for VirtualNetworkPeering update.
     */
    interface Update extends UpdateStages.WithAllowVirtualNetworkAccess, UpdateStages.WithAllowForwardedTraffic,
        UpdateStages.WithAllowGatewayTransit, UpdateStages.WithUseRemoteGateways,
        UpdateStages.WithDatabricksVirtualNetwork, UpdateStages.WithDatabricksAddressSpace,
        UpdateStages.WithRemoteVirtualNetwork, UpdateStages.WithRemoteAddressSpace {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        VirtualNetworkPeering apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        VirtualNetworkPeering apply(Context context);
    }

    /**
     * The VirtualNetworkPeering update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the VirtualNetworkPeering update allowing to specify allowVirtualNetworkAccess.
         */
        interface WithAllowVirtualNetworkAccess {
            /**
             * Specifies the allowVirtualNetworkAccess property: Whether the VMs in the local virtual network space
             * would be able to access the VMs in remote virtual network space..
             * 
             * @param allowVirtualNetworkAccess Whether the VMs in the local virtual network space would be able to
             * access the VMs in remote virtual network space.
             * @return the next definition stage.
             */
            Update withAllowVirtualNetworkAccess(Boolean allowVirtualNetworkAccess);
        }

        /**
         * The stage of the VirtualNetworkPeering update allowing to specify allowForwardedTraffic.
         */
        interface WithAllowForwardedTraffic {
            /**
             * Specifies the allowForwardedTraffic property: Whether the forwarded traffic from the VMs in the local
             * virtual network will be allowed/disallowed in remote virtual network..
             * 
             * @param allowForwardedTraffic Whether the forwarded traffic from the VMs in the local virtual network will
             * be allowed/disallowed in remote virtual network.
             * @return the next definition stage.
             */
            Update withAllowForwardedTraffic(Boolean allowForwardedTraffic);
        }

        /**
         * The stage of the VirtualNetworkPeering update allowing to specify allowGatewayTransit.
         */
        interface WithAllowGatewayTransit {
            /**
             * Specifies the allowGatewayTransit property: If gateway links can be used in remote virtual networking to
             * link to this virtual network..
             * 
             * @param allowGatewayTransit If gateway links can be used in remote virtual networking to link to this
             * virtual network.
             * @return the next definition stage.
             */
            Update withAllowGatewayTransit(Boolean allowGatewayTransit);
        }

        /**
         * The stage of the VirtualNetworkPeering update allowing to specify useRemoteGateways.
         */
        interface WithUseRemoteGateways {
            /**
             * Specifies the useRemoteGateways property: If remote gateways can be used on this virtual network. If the
             * flag is set to true, and allowGatewayTransit on remote peering is also true, virtual network will use
             * gateways of remote virtual network for transit. Only one peering can have this flag set to true. This
             * flag cannot be set if virtual network already has a gateway..
             * 
             * @param useRemoteGateways If remote gateways can be used on this virtual network. If the flag is set to
             * true, and allowGatewayTransit on remote peering is also true, virtual network will use gateways of remote
             * virtual network for transit. Only one peering can have this flag set to true. This flag cannot be set if
             * virtual network already has a gateway.
             * @return the next definition stage.
             */
            Update withUseRemoteGateways(Boolean useRemoteGateways);
        }

        /**
         * The stage of the VirtualNetworkPeering update allowing to specify databricksVirtualNetwork.
         */
        interface WithDatabricksVirtualNetwork {
            /**
             * Specifies the databricksVirtualNetwork property: The remote virtual network should be in the same region.
             * See here to learn more
             * (https://docs.microsoft.com/en-us/azure/databricks/administration-guide/cloud-configurations/azure/vnet-peering)..
             * 
             * @param databricksVirtualNetwork The remote virtual network should be in the same region. See here to
             * learn more
             * (https://docs.microsoft.com/en-us/azure/databricks/administration-guide/cloud-configurations/azure/vnet-peering).
             * @return the next definition stage.
             */
            Update withDatabricksVirtualNetwork(
                VirtualNetworkPeeringPropertiesFormatDatabricksVirtualNetwork databricksVirtualNetwork);
        }

        /**
         * The stage of the VirtualNetworkPeering update allowing to specify databricksAddressSpace.
         */
        interface WithDatabricksAddressSpace {
            /**
             * Specifies the databricksAddressSpace property: The reference to the databricks virtual network address
             * space..
             * 
             * @param databricksAddressSpace The reference to the databricks virtual network address space.
             * @return the next definition stage.
             */
            Update withDatabricksAddressSpace(AddressSpace databricksAddressSpace);
        }

        /**
         * The stage of the VirtualNetworkPeering update allowing to specify remoteVirtualNetwork.
         */
        interface WithRemoteVirtualNetwork {
            /**
             * Specifies the remoteVirtualNetwork property: The remote virtual network should be in the same region. See
             * here to learn more
             * (https://docs.microsoft.com/en-us/azure/databricks/administration-guide/cloud-configurations/azure/vnet-peering)..
             * 
             * @param remoteVirtualNetwork The remote virtual network should be in the same region. See here to learn
             * more
             * (https://docs.microsoft.com/en-us/azure/databricks/administration-guide/cloud-configurations/azure/vnet-peering).
             * @return the next definition stage.
             */
            Update withRemoteVirtualNetwork(
                VirtualNetworkPeeringPropertiesFormatRemoteVirtualNetwork remoteVirtualNetwork);
        }

        /**
         * The stage of the VirtualNetworkPeering update allowing to specify remoteAddressSpace.
         */
        interface WithRemoteAddressSpace {
            /**
             * Specifies the remoteAddressSpace property: The reference to the remote virtual network address space..
             * 
             * @param remoteAddressSpace The reference to the remote virtual network address space.
             * @return the next definition stage.
             */
            Update withRemoteAddressSpace(AddressSpace remoteAddressSpace);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    VirtualNetworkPeering refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    VirtualNetworkPeering refresh(Context context);
}
