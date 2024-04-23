// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Ecs.Outputs
{

    [OutputType]
    public sealed class OceanAutoscalerHeadroom
    {
        public readonly int? CpuPerUnit;
        public readonly int? MemoryPerUnit;
        public readonly int? NumOfUnits;

        [OutputConstructor]
        private OceanAutoscalerHeadroom(
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
