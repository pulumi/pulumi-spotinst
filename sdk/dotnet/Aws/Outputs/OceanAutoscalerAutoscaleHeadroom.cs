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
    public sealed class OceanAutoscalerAutoscaleHeadroom
    {
        /// <summary>
        /// Optionally configure the number of CPUs to allocate the headroom. CPUs are denoted in millicores, where 1000 millicores = 1 vCPU.
        /// </summary>
        public readonly int? CpuPerUnit;
        /// <summary>
        /// Optionally configure the number of GPUs to allocate the headroom.
        /// </summary>
        public readonly int? GpuPerUnit;
        /// <summary>
        /// Optionally configure the amount of memory (MB) to allocate the headroom.
        /// </summary>
        public readonly int? MemoryPerUnit;
        /// <summary>
        /// The number of units to retain as headroom, where each unit has the defined headroom CPU and memory.
        /// </summary>
        public readonly int? NumOfUnits;

        [OutputConstructor]
        private OceanAutoscalerAutoscaleHeadroom(
            int? cpuPerUnit,

            int? gpuPerUnit,

            int? memoryPerUnit,

            int? numOfUnits)
        {
            CpuPerUnit = cpuPerUnit;
            GpuPerUnit = gpuPerUnit;
            MemoryPerUnit = memoryPerUnit;
            NumOfUnits = numOfUnits;
        }
    }
}
