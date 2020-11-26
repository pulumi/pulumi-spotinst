// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class ElastigroupScalingTargetPolicyArgs : Pulumi.ResourceArgs
    {
        [Input("cooldown")]
        public Input<int>? Cooldown { get; set; }

        [Input("dimensions")]
        private InputList<Inputs.ElastigroupScalingTargetPolicyDimensionArgs>? _dimensions;
        public InputList<Inputs.ElastigroupScalingTargetPolicyDimensionArgs> Dimensions
        {
            get => _dimensions ?? (_dimensions = new InputList<Inputs.ElastigroupScalingTargetPolicyDimensionArgs>());
            set => _dimensions = value;
        }

        [Input("maxCapacityPerScale")]
        public Input<string>? MaxCapacityPerScale { get; set; }

        [Input("metricName", required: true)]
        public Input<string> MetricName { get; set; } = null!;

        [Input("namespace", required: true)]
        public Input<string> Namespace { get; set; } = null!;

        [Input("policyName", required: true)]
        public Input<string> PolicyName { get; set; } = null!;

        [Input("predictiveMode")]
        public Input<string>? PredictiveMode { get; set; }

        [Input("source")]
        public Input<string>? Source { get; set; }

        [Input("statistic")]
        public Input<string>? Statistic { get; set; }

        [Input("target", required: true)]
        public Input<double> Target { get; set; } = null!;

        [Input("unit")]
        public Input<string>? Unit { get; set; }

        public ElastigroupScalingTargetPolicyArgs()
        {
        }
    }
}
