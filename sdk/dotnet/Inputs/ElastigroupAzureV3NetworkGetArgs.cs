// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Inputs
{

    public sealed class ElastigroupAzureV3NetworkGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("networkInterfaces", required: true)]
        private InputList<Inputs.ElastigroupAzureV3NetworkNetworkInterfaceGetArgs>? _networkInterfaces;
        public InputList<Inputs.ElastigroupAzureV3NetworkNetworkInterfaceGetArgs> NetworkInterfaces
        {
            get => _networkInterfaces ?? (_networkInterfaces = new InputList<Inputs.ElastigroupAzureV3NetworkNetworkInterfaceGetArgs>());
            set => _networkInterfaces = value;
        }

        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        [Input("virtualNetworkName", required: true)]
        public Input<string> VirtualNetworkName { get; set; } = null!;

        public ElastigroupAzureV3NetworkGetArgs()
        {
        }
        public static new ElastigroupAzureV3NetworkGetArgs Empty => new ElastigroupAzureV3NetworkGetArgs();
    }
}