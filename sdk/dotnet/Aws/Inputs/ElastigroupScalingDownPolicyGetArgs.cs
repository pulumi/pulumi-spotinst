// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class ElastigroupScalingDownPolicyGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The type of action to perform for scaling. Valid values: `"adjustment"`, `"percentageAdjustment"`, `"setMaxTarget"`, `"setMinTarget"`, `"updateCapacity"`. If a `step_adjustment` object is defined, then it cannot be specified.
        /// </summary>
        [Input("actionType")]
        public Input<string>? ActionType { get; set; }

        /// <summary>
        /// The number of instances to add/remove to/from the target capacity when scale is needed. Can be used as advanced expression for scaling of instances to add/remove to/from the target capacity when scale is needed. You can see more information here: Advanced expression. Example value: `"MAX(currCapacity / 5, value * 10)"`
        /// </summary>
        [Input("adjustment")]
        public Input<string>? Adjustment { get; set; }

        /// <summary>
        /// The amount of time, in seconds, after a scaling activity completes and before the next scaling activity can start. If this parameter is not specified, the default cooldown period for the group applies.
        /// </summary>
        [Input("cooldown")]
        public Input<int>? Cooldown { get; set; }

        [Input("dimensions")]
        private InputList<Inputs.ElastigroupScalingDownPolicyDimensionGetArgs>? _dimensions;

        /// <summary>
        /// A list of dimensions describing qualities of the metric.
        /// </summary>
        public InputList<Inputs.ElastigroupScalingDownPolicyDimensionGetArgs> Dimensions
        {
            get => _dimensions ?? (_dimensions = new InputList<Inputs.ElastigroupScalingDownPolicyDimensionGetArgs>());
            set => _dimensions = value;
        }

        /// <summary>
        /// The number of periods over which data is compared to the specified threshold.
        /// </summary>
        [Input("evaluationPeriods")]
        public Input<int>? EvaluationPeriods { get; set; }

        /// <summary>
        /// Specifies whether the scaling policy described in this block is enabled.
        /// </summary>
        [Input("isEnabled")]
        public Input<bool>? IsEnabled { get; set; }

        /// <summary>
        /// . The number of the desired target (and maximum) capacity
        /// </summary>
        [Input("maxTargetCapacity")]
        public Input<string>? MaxTargetCapacity { get; set; }

        /// <summary>
        /// The maximal number of instances to have in the group.
        /// </summary>
        [Input("maximum")]
        public Input<string>? Maximum { get; set; }

        /// <summary>
        /// The name of the metric, with or without spaces.
        /// </summary>
        [Input("metricName", required: true)]
        public Input<string> MetricName { get; set; } = null!;

        [Input("minTargetCapacity")]
        public Input<string>? MinTargetCapacity { get; set; }

        /// <summary>
        /// The minimal number of instances to have in the group.
        /// </summary>
        [Input("minimum")]
        public Input<string>? Minimum { get; set; }

        /// <summary>
        /// The namespace for the alarm's associated metric.
        /// </summary>
        [Input("namespace", required: true)]
        public Input<string> Namespace { get; set; } = null!;

        /// <summary>
        /// The operator to use in order to determine if the scaling policy is applicable. Valid values: `"gt"`, `"gte"`, `"lt"`, `"lte"`.
        /// </summary>
        [Input("operator")]
        public Input<string>? Operator { get; set; }

        /// <summary>
        /// The granularity, in seconds, of the returned datapoints. Period must be at least 60 seconds and must be a multiple of 60.
        /// </summary>
        [Input("period")]
        public Input<int>? Period { get; set; }

        /// <summary>
        /// The name of the policy.
        /// </summary>
        [Input("policyName", required: true)]
        public Input<string> PolicyName { get; set; } = null!;

        /// <summary>
        /// The source of the metric. Valid values: `"cloudWatch"`, `"spectrum"`.
        /// </summary>
        [Input("source")]
        public Input<string>? Source { get; set; }

        /// <summary>
        /// The metric statistics to return. For information about specific statistics go to [Statistics](http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/index.html?CHAP_TerminologyandKeyConcepts.html#Statistic) in the Amazon CloudWatch Developer Guide.
        /// </summary>
        [Input("statistic")]
        public Input<string>? Statistic { get; set; }

        [Input("stepAdjustments")]
        private InputList<Inputs.ElastigroupScalingDownPolicyStepAdjustmentGetArgs>? _stepAdjustments;
        public InputList<Inputs.ElastigroupScalingDownPolicyStepAdjustmentGetArgs> StepAdjustments
        {
            get => _stepAdjustments ?? (_stepAdjustments = new InputList<Inputs.ElastigroupScalingDownPolicyStepAdjustmentGetArgs>());
            set => _stepAdjustments = value;
        }

        /// <summary>
        /// The target number of instances to have in the group.
        /// </summary>
        [Input("target")]
        public Input<string>? Target { get; set; }

        /// <summary>
        /// The value against which the specified statistic is compared. If a `step_adjustment` object is defined, then it cannot be specified.
        /// </summary>
        [Input("threshold")]
        public Input<double>? Threshold { get; set; }

        /// <summary>
        /// The unit for the alarm's associated metric. Valid values: `"percent`, `"seconds"`, `"microseconds"`, `"milliseconds"`, `"bytes"`, `"kilobytes"`, `"megabytes"`, `"gigabytes"`, `"terabytes"`, `"bits"`, `"kilobits"`, `"megabits"`, `"gigabits"`, `"terabits"`, `"count"`, `"bytes/second"`, `"kilobytes/second"`, `"megabytes/second"`, `"gigabytes/second"`, `"terabytes/second"`, `"bits/second"`, `"kilobits/second"`, `"megabits/second"`, `"gigabits/second"`, `"terabits/second"`, `"count/second"`, `"none"`.
        /// </summary>
        [Input("unit")]
        public Input<string>? Unit { get; set; }

        public ElastigroupScalingDownPolicyGetArgs()
        {
        }
        public static new ElastigroupScalingDownPolicyGetArgs Empty => new ElastigroupScalingDownPolicyGetArgs();
    }
}
