// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Gcp.Inputs
{

    public sealed class ElastigroupScalingUpPolicyArgs : global::Pulumi.ResourceArgs
    {
        [Input("actionType")]
        public Input<string>? ActionType { get; set; }

        [Input("adjustment")]
        public Input<int>? Adjustment { get; set; }

        [Input("cooldown")]
        public Input<int>? Cooldown { get; set; }

        [Input("dimensions")]
        private InputList<Inputs.ElastigroupScalingUpPolicyDimensionArgs>? _dimensions;
        public InputList<Inputs.ElastigroupScalingUpPolicyDimensionArgs> Dimensions
        {
            get => _dimensions ?? (_dimensions = new InputList<Inputs.ElastigroupScalingUpPolicyDimensionArgs>());
            set => _dimensions = value;
        }

        [Input("evaluationPeriods")]
        public Input<int>? EvaluationPeriods { get; set; }

        [Input("metricName", required: true)]
        public Input<string> MetricName { get; set; } = null!;

        [Input("namespace", required: true)]
        public Input<string> Namespace { get; set; } = null!;

        [Input("operator")]
        public Input<string>? Operator { get; set; }

        [Input("period")]
        public Input<int>? Period { get; set; }

        [Input("policyName", required: true)]
        public Input<string> PolicyName { get; set; } = null!;

        [Input("source")]
        public Input<string>? Source { get; set; }

        [Input("statistic")]
        public Input<string>? Statistic { get; set; }

        [Input("threshold", required: true)]
        public Input<double> Threshold { get; set; } = null!;

        [Input("unit", required: true)]
        public Input<string> Unit { get; set; } = null!;

        public ElastigroupScalingUpPolicyArgs()
        {
        }
        public static new ElastigroupScalingUpPolicyArgs Empty => new ElastigroupScalingUpPolicyArgs();
    }
}
