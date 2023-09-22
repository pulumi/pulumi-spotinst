// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Outputs
{

    [OutputType]
    public sealed class ElastigroupResourceRequirement
    {
        /// <summary>
        /// Instance families to exclude
        /// </summary>
        public readonly ImmutableArray<string> ExcludedInstanceFamilies;
        /// <summary>
        /// Instance generations to exclude
        /// </summary>
        public readonly ImmutableArray<string> ExcludedInstanceGenerations;
        /// <summary>
        /// Instance types to exclude
        /// </summary>
        public readonly ImmutableArray<string> ExcludedInstanceTypes;
        /// <summary>
        /// Required maximum instance GPU (&lt;=16)
        /// </summary>
        public readonly int? RequiredGpuMaximum;
        /// <summary>
        /// Required minimum instance GPU (&gt;=1)
        /// </summary>
        public readonly int? RequiredGpuMinimum;
        /// <summary>
        /// Required maximum instance memory (&lt;=512)
        /// </summary>
        public readonly int RequiredMemoryMaximum;
        /// <summary>
        /// Required minimum instance memory (&gt;=1)
        /// </summary>
        public readonly int RequiredMemoryMinimum;
        /// <summary>
        /// Required maximum instance vCPU (&lt;=64)
        /// </summary>
        public readonly int RequiredVcpuMaximum;
        /// <summary>
        /// Required minimum instance vCPU (&gt;=1)
        /// </summary>
        public readonly int RequiredVcpuMinimum;

        [OutputConstructor]
        private ElastigroupResourceRequirement(
            ImmutableArray<string> excludedInstanceFamilies,

            ImmutableArray<string> excludedInstanceGenerations,

            ImmutableArray<string> excludedInstanceTypes,

            int? requiredGpuMaximum,

            int? requiredGpuMinimum,

            int requiredMemoryMaximum,

            int requiredMemoryMinimum,

            int requiredVcpuMaximum,

            int requiredVcpuMinimum)
        {
            ExcludedInstanceFamilies = excludedInstanceFamilies;
            ExcludedInstanceGenerations = excludedInstanceGenerations;
            ExcludedInstanceTypes = excludedInstanceTypes;
            RequiredGpuMaximum = requiredGpuMaximum;
            RequiredGpuMinimum = requiredGpuMinimum;
            RequiredMemoryMaximum = requiredMemoryMaximum;
            RequiredMemoryMinimum = requiredMemoryMinimum;
            RequiredVcpuMaximum = requiredVcpuMaximum;
            RequiredVcpuMinimum = requiredVcpuMinimum;
        }
    }
}