// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Inputs
{

    public sealed class OceanRightSizingRuleRecommendationApplicationOverheadValueGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("cpuPercentage")]
        public Input<double>? CpuPercentage { get; set; }

        [Input("memoryPercentage")]
        public Input<double>? MemoryPercentage { get; set; }

        public OceanRightSizingRuleRecommendationApplicationOverheadValueGetArgs()
        {
        }
        public static new OceanRightSizingRuleRecommendationApplicationOverheadValueGetArgs Empty => new OceanRightSizingRuleRecommendationApplicationOverheadValueGetArgs();
    }
}
