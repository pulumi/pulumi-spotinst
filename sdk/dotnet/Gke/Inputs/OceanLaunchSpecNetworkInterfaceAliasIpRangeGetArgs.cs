// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Gke.Inputs
{

    public sealed class OceanLaunchSpecNetworkInterfaceAliasIpRangeGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// specify the IP address range in CIDR notation that can be used for the alias IP addresses associated with the imported node pool.
        /// </summary>
        [Input("ipCidrRange", required: true)]
        public Input<string> IpCidrRange { get; set; } = null!;

        /// <summary>
        /// specify the IP address range for the subnet secondary IP range.
        /// </summary>
        [Input("subnetworkRangeName", required: true)]
        public Input<string> SubnetworkRangeName { get; set; } = null!;

        public OceanLaunchSpecNetworkInterfaceAliasIpRangeGetArgs()
        {
        }
        public static new OceanLaunchSpecNetworkInterfaceAliasIpRangeGetArgs Empty => new OceanLaunchSpecNetworkInterfaceAliasIpRangeGetArgs();
    }
}
