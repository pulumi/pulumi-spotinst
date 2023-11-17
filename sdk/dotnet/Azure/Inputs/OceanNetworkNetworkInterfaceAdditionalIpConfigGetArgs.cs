// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Azure.Inputs
{

    public sealed class OceanNetworkNetworkInterfaceAdditionalIpConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Ocean cluster name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Supported values: `IPv4`, `IPv6`.
        /// </summary>
        [Input("privateIpVersion")]
        public Input<string>? PrivateIpVersion { get; set; }

        public OceanNetworkNetworkInterfaceAdditionalIpConfigGetArgs()
        {
        }
        public static new OceanNetworkNetworkInterfaceAdditionalIpConfigGetArgs Empty => new OceanNetworkNetworkInterfaceAdditionalIpConfigGetArgs();
    }
}
