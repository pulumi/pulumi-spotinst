// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Azure.Inputs
{

    public sealed class ElastigroupStrategyArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Time (seconds) to allow the instance to be drained from incoming TCP connections and detached from MLB before terminating it during a scale-down operation.
        /// </summary>
        [Input("drainingTimeout")]
        public Input<int>? DrainingTimeout { get; set; }

        /// <summary>
        /// Percentage of Low Priority instances to maintain. Required if `od_count` is not specified.
        /// </summary>
        [Input("lowPriorityPercentage")]
        public Input<int>? LowPriorityPercentage { get; set; }

        /// <summary>
        /// Number of On-Demand instances to maintain. Required if low_priority_percentage is not specified.
        /// </summary>
        [Input("odCount")]
        public Input<int>? OdCount { get; set; }

        public ElastigroupStrategyArgs()
        {
        }
    }
}
