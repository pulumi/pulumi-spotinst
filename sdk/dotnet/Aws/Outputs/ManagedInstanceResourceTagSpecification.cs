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
    public sealed class ManagedInstanceResourceTagSpecification
    {
        public readonly bool? ShouldTagAmis;
        public readonly bool? ShouldTagEnis;
        public readonly bool? ShouldTagSnapshots;
        public readonly bool? ShouldTagVolumes;

        [OutputConstructor]
        private ManagedInstanceResourceTagSpecification(
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
