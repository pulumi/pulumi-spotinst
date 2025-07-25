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
    public sealed class ElastigroupBackendServiceBackendBalancing
    {
        /// <summary>
        /// The backend balancing mode. Valid values: `RATE`, `UTILIZATION`.
        /// </summary>
        public readonly string? BackendBalancingMode;
        /// <summary>
        /// If the backendBalancingMode is set to RATE, this field is required.
        /// 
        /// Usage:
        /// </summary>
        public readonly int? MaxRatePerInstance;

        [OutputConstructor]
        private ElastigroupBackendServiceBackendBalancing(
            string? backendBalancingMode,

            int? maxRatePerInstance)
        {
            BackendBalancingMode = backendBalancingMode;
            MaxRatePerInstance = maxRatePerInstance;
        }
    }
}
