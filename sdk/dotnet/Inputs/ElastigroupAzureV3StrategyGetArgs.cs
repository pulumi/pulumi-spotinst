// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Inputs
{

    public sealed class ElastigroupAzureV3StrategyGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Time (seconds) to allow the instance to be drained from incoming TCP connections and detached from MLB before terminating it during a scale-down operation.
        /// </summary>
        [Input("drainingTimeout")]
        public Input<int>? DrainingTimeout { get; set; }

        [Input("fallbackToOnDemand")]
        public Input<bool>? FallbackToOnDemand { get; set; }

        /// <summary>
        /// Number of On-Demand instances to maintain. Required if low_priority_percentage is not specified.
        /// </summary>
        [Input("odCount")]
        public Input<int>? OdCount { get; set; }

        /// <summary>
        /// TODO
        /// </summary>
        [Input("spotPercentage")]
        public Input<int>? SpotPercentage { get; set; }

        public ElastigroupAzureV3StrategyGetArgs()
        {
        }
    }
}
