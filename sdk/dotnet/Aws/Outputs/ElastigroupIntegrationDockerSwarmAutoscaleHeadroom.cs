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
    public sealed class ElastigroupIntegrationDockerSwarmAutoscaleHeadroom
    {
        /// <summary>
        /// Cpu units for compute.
        /// </summary>
        public readonly int? CpuPerUnit;
        /// <summary>
        /// RAM units for compute.
        /// </summary>
        public readonly int? MemoryPerUnit;
        /// <summary>
        /// Amount of units for compute.
        /// </summary>
        public readonly int? NumOfUnits;

        [OutputConstructor]
        private ElastigroupIntegrationDockerSwarmAutoscaleHeadroom(
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
