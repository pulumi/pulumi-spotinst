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
    public sealed class OceanLaunchSpecNetworkInterfaceAccessConfig
    {
        /// <summary>
        /// The name of the access configuration.
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// The type of the access configuration.
        /// </summary>
        public readonly string? Type;

        [OutputConstructor]
        private OceanLaunchSpecNetworkInterfaceAccessConfig(
            string? name,

            string? type)
        {
            Name = name;
            Type = type;
        }
    }
}
