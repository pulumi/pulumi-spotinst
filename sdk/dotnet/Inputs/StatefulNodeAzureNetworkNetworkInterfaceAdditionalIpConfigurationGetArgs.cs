// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Inputs
{

    public sealed class StatefulNodeAzureNetworkNetworkInterfaceAdditionalIpConfigurationGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("privateIpAddressVersion", required: true)]
        public Input<string> PrivateIpAddressVersion { get; set; } = null!;

        public StatefulNodeAzureNetworkNetworkInterfaceAdditionalIpConfigurationGetArgs()
        {
        }
        public static new StatefulNodeAzureNetworkNetworkInterfaceAdditionalIpConfigurationGetArgs Empty => new StatefulNodeAzureNetworkNetworkInterfaceAdditionalIpConfigurationGetArgs();
    }
}
