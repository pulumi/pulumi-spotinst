// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class ElastigroupScalingDownPolicyArgs : Pulumi.ResourceArgs
    {
        [Input("actionType")]
        public Input<string>? ActionType { get; set; }

        [Input("adjustment")]
        public Input<string>? Adjustment { get; set; }

        [Input("cooldown")]
        public Input<int>? Cooldown { get; set; }

        [Input("dimensions")]
        private InputList<Inputs.ElastigroupScalingDownPolicyDimensionArgs>? _dimensions;
        public InputList<Inputs.ElastigroupScalingDownPolicyDimensionArgs> Dimensions
        {
            get => _dimensions ?? (_dimensions = new InputList<Inputs.ElastigroupScalingDownPolicyDimensionArgs>());
            set => _dimensions = value;
        }

        [Input("evaluationPeriods")]
        public Input<int>? EvaluationPeriods { get; set; }

        [Input("isEnabled")]
        public Input<bool>? IsEnabled { get; set; }

        [Input("maxTargetCapacity")]
        public Input<string>? MaxTargetCapacity { get; set; }

        [Input("maximum")]
        public Input<string>? Maximum { get; set; }

        [Input("metricName", required: true)]
        public Input<string> MetricName { get; set; } = null!;

        [Input("minTargetCapacity")]
        public Input<string>? MinTargetCapacity { get; set; }

        [Input("minimum")]
        public Input<string>? Minimum { get; set; }

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

        [Input("target")]
        public Input<string>? Target { get; set; }

        [Input("threshold", required: true)]
        public Input<double> Threshold { get; set; } = null!;

        [Input("unit")]
        public Input<string>? Unit { get; set; }

        public ElastigroupScalingDownPolicyArgs()
        {
        }
    }
}
