// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Gke.Outputs
{

    [OutputType]
    public sealed class OceanLaunchSpecNetworkInterfaceAliasIpRange
    {
        /// <summary>
        /// specify the IP address range in CIDR notation that can be used for the alias IP addresses associated with the imported node pool.
        /// </summary>
        public readonly string IpCidrRange;
        /// <summary>
        /// specify the IP address range for the subnet secondary IP range.
        /// </summary>
        public readonly string SubnetworkRangeName;

        [OutputConstructor]
        private OceanLaunchSpecNetworkInterfaceAliasIpRange(
            string ipCidrRange,

            string subnetworkRangeName)
        {
            IpCidrRange = ipCidrRange;
            SubnetworkRangeName = subnetworkRangeName;
        }
    }
}
