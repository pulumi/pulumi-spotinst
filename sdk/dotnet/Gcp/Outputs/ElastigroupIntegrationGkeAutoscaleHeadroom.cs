// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Gcp.Outputs
{

    [OutputType]
    public sealed class ElastigroupIntegrationGkeAutoscaleHeadroom
    {
        public readonly int? CpuPerUnit;
        public readonly int? MemoryPerUnit;
        public readonly int? NumOfUnits;

        [OutputConstructor]
        private ElastigroupIntegrationGkeAutoscaleHeadroom(
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
