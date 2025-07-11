// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Gke.Outputs
{

    [OutputType]
    public sealed class OceanLaunchSpecNetworkInterface
    {
        /// <summary>
        /// The network protocol of the VNG.
        /// </summary>
        public readonly ImmutableArray<Outputs.OceanLaunchSpecNetworkInterfaceAccessConfig> AccessConfigs;
        /// <summary>
        /// use the imported node pool’s associated aliasIpRange to assign secondary IP addresses to the nodes. Cannot be changed after VNG creation.
        /// </summary>
        public readonly ImmutableArray<Outputs.OceanLaunchSpecNetworkInterfaceAliasIpRange> AliasIpRanges;
        /// <summary>
        /// The name of the network.
        /// </summary>
        public readonly string Network;
        /// <summary>
        /// Use a network resource from a different project. Set the project identifier to use its network resource. This parameter is relevant only if the network resource is in a different project.
        /// </summary>
        public readonly string? ProjectId;

        [OutputConstructor]
        private OceanLaunchSpecNetworkInterface(
            ImmutableArray<Outputs.OceanLaunchSpecNetworkInterfaceAccessConfig> accessConfigs,

            ImmutableArray<Outputs.OceanLaunchSpecNetworkInterfaceAliasIpRange> aliasIpRanges,

            string network,

            string? projectId)
        {
            AccessConfigs = accessConfigs;
            AliasIpRanges = aliasIpRanges;
            Network = network;
            ProjectId = projectId;
        }
    }
}
