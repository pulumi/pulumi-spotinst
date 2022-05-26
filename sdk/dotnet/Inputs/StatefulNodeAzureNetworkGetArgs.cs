// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Inputs
{

    public sealed class StatefulNodeAzureNetworkGetArgs : Pulumi.ResourceArgs
    {
        [Input("networkInterfaces", required: true)]
        private InputList<Inputs.StatefulNodeAzureNetworkNetworkInterfaceGetArgs>? _networkInterfaces;
        public InputList<Inputs.StatefulNodeAzureNetworkNetworkInterfaceGetArgs> NetworkInterfaces
        {
            get => _networkInterfaces ?? (_networkInterfaces = new InputList<Inputs.StatefulNodeAzureNetworkNetworkInterfaceGetArgs>());
            set => _networkInterfaces = value;
        }

        [Input("networkResourceGroupName", required: true)]
        public Input<string> NetworkResourceGroupName { get; set; } = null!;

        [Input("virtualNetworkName", required: true)]
        public Input<string> VirtualNetworkName { get; set; } = null!;

        public StatefulNodeAzureNetworkGetArgs()
        {
        }
    }
}
