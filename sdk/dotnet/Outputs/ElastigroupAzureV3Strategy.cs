// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Outputs
{

    [OutputType]
    public sealed class ElastigroupAzureV3Strategy
    {
        /// <summary>
        /// Time (seconds) to allow the instance to be drained from incoming TCP connections and detached from MLB before terminating it during a scale-down operation.
        /// </summary>
        public readonly int? DrainingTimeout;
        public readonly bool? FallbackToOnDemand;
        /// <summary>
        /// Number of On-Demand instances to maintain. Required if low_priority_percentage is not specified.
        /// </summary>
        public readonly int? OdCount;
        /// <summary>
        /// TODO
        /// </summary>
        public readonly int? SpotPercentage;

        [OutputConstructor]
        private ElastigroupAzureV3Strategy(
            int? drainingTimeout,

            bool? fallbackToOnDemand,

            int? odCount,

            int? spotPercentage)
        {
            DrainingTimeout = drainingTimeout;
            FallbackToOnDemand = fallbackToOnDemand;
            OdCount = odCount;
            SpotPercentage = spotPercentage;
        }
    }
}
