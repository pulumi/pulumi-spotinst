// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Azure.Inputs
{

    public sealed class OceanNetworkArgs : global::Pulumi.ResourceArgs
    {
        [Input("networkInterfaces")]
        private InputList<Inputs.OceanNetworkNetworkInterfaceArgs>? _networkInterfaces;

        /// <summary>
        /// A list of virtual network interfaces. The publicIpSku must be identical between all the network interfaces. One network interface must be set as the primary.
        /// </summary>
        public InputList<Inputs.OceanNetworkNetworkInterfaceArgs> NetworkInterfaces
        {
            get => _networkInterfaces ?? (_networkInterfaces = new InputList<Inputs.OceanNetworkNetworkInterfaceArgs>());
            set => _networkInterfaces = value;
        }

        /// <summary>
        /// Vnet resource group name.
        /// </summary>
        [Input("resourceGroupName")]
        public Input<string>? ResourceGroupName { get; set; }

        /// <summary>
        /// Virtual network.
        /// </summary>
        [Input("virtualNetworkName")]
        public Input<string>? VirtualNetworkName { get; set; }

        public OceanNetworkArgs()
        {
        }
        public static new OceanNetworkArgs Empty => new OceanNetworkArgs();
    }
}
