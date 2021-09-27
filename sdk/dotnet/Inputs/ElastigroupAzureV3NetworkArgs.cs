// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Inputs
{

    public sealed class ElastigroupAzureV3NetworkArgs : Pulumi.ResourceArgs
    {
        [Input("networkInterfaces", required: true)]
        private InputList<Inputs.ElastigroupAzureV3NetworkNetworkInterfaceArgs>? _networkInterfaces;

        /// <summary>
        /// -
        /// </summary>
        public InputList<Inputs.ElastigroupAzureV3NetworkNetworkInterfaceArgs> NetworkInterfaces
        {
            get => _networkInterfaces ?? (_networkInterfaces = new InputList<Inputs.ElastigroupAzureV3NetworkNetworkInterfaceArgs>());
            set => _networkInterfaces = value;
        }

        /// <summary>
        /// - The resource group of the Application Security Group.
        /// }
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        /// <summary>
        /// Name of Vnet.
        /// </summary>
        [Input("virtualNetworkName", required: true)]
        public Input<string> VirtualNetworkName { get; set; } = null!;

        public ElastigroupAzureV3NetworkArgs()
        {
        }
    }
}
