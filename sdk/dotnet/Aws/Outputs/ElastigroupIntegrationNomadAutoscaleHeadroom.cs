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
    public sealed class ElastigroupIntegrationNomadAutoscaleHeadroom
    {
        /// <summary>
        /// How much CPU to allocate for headroom unit.
        /// </summary>
        public readonly int? CpuPerUnit;
        /// <summary>
        /// The amount of memory in each headroom unit. Measured in MiB.
        /// </summary>
        public readonly int? MemoryPerUnit;
        /// <summary>
        /// How many units to allocate for headroom unit.
        /// </summary>
        public readonly int? NumOfUnits;

        [OutputConstructor]
        private ElastigroupIntegrationNomadAutoscaleHeadroom(
            int? cpuPerUnit,

            int? memoryPerUnit,

            int? numOfUnits)
        {
            CpuPerUnit = cpuPerUnit;
            MemoryPerUnit = memoryPerUnit;
            NumOfUnits = numOfUnits;
        }
    }
}
