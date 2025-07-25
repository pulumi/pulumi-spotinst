// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Outputs
{

    [OutputType]
    public sealed class ElastigroupResourceTagSpecification
    {
        /// <summary>
        /// Tag specification for AMI resources.
        /// </summary>
        public readonly bool? ShouldTagAmis;
        /// <summary>
        /// Tag specification for ENI resources.
        /// </summary>
        public readonly bool? ShouldTagEnis;
        /// <summary>
        /// Tag specification for Snapshot resources.
        /// </summary>
        public readonly bool? ShouldTagSnapshots;
        /// <summary>
        /// Tag specification for Volume resources.
        /// </summary>
        public readonly bool? ShouldTagVolumes;

        [OutputConstructor]
        private ElastigroupResourceTagSpecification(
            bool? shouldTagAmis,

            bool? shouldTagEnis,

            bool? shouldTagSnapshots,

            bool? shouldTagVolumes)
        {
            ShouldTagAmis = shouldTagAmis;
            ShouldTagEnis = shouldTagEnis;
            ShouldTagSnapshots = shouldTagSnapshots;
            ShouldTagVolumes = shouldTagVolumes;
        }
    }
}
