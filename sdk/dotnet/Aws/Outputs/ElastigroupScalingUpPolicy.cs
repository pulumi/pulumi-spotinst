// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Outputs
{

    [OutputType]
    public sealed class ElastigroupScalingUpPolicy
    {
        /// <summary>
        /// The type of action to perform for scaling. Valid values: `"adjustment"`, `"percentageAdjustment"`, `"setMaxTarget"`, `"setMinTarget"`, `"updateCapacity"`. If a `step_adjustment` object is defined, then it cannot be specified.
        /// </summary>
        public readonly string? ActionType;
        /// <summary>
        /// The number of instances to add/remove to/from the target capacity when scale is needed. Can be used as advanced expression for scaling of instances to add/remove to/from the target capacity when scale is needed. You can see more information here: Advanced expression. Example value: `"MAX(currCapacity / 5, value * 10)"`
        /// </summary>
        public readonly string? Adjustment;
        /// <summary>
        /// The amount of time, in seconds, after a scaling activity completes and before the next scaling activity can start. If this parameter is not specified, the default cooldown period for the group applies.
        /// </summary>
        public readonly int? Cooldown;
        /// <summary>
        /// A list of dimensions describing qualities of the metric.
        /// </summary>
        public readonly ImmutableArray<Outputs.ElastigroupScalingUpPolicyDimension> Dimensions;
        /// <summary>
        /// The number of periods over which data is compared to the specified threshold.
        /// </summary>
        public readonly int? EvaluationPeriods;
        /// <summary>
        /// Specifies whether the scaling policy described in this block is enabled.
        /// </summary>
        public readonly bool? IsEnabled;
        /// <summary>
        /// The desired target capacity of a group. Required if using `"setMaxTarget"` as action type
        /// </summary>
        public readonly string? MaxTargetCapacity;
        /// <summary>
        /// The maximal number of instances to have in the group.
        /// </summary>
        public readonly string? Maximum;
        /// <summary>
        /// The name of the metric, with or without spaces.
        /// </summary>
        public readonly string MetricName;
        /// <summary>
        /// . The number of the desired target (and minimum) capacity
        /// </summary>
        public readonly string? MinTargetCapacity;
        /// <summary>
        /// The minimal number of instances to have in the group.
        /// </summary>
        public readonly string? Minimum;
        /// <summary>
        /// The namespace for the alarm's associated metric.
        /// </summary>
        public readonly string Namespace;
        /// <summary>
        /// The operator to use in order to determine if the scaling policy is applicable. Valid values: `"gt"`, `"gte"`, `"lt"`, `"lte"`.
        /// </summary>
        public readonly string? Operator;
        /// <summary>
        /// The granularity, in seconds, of the returned datapoints. Period must be at least 60 seconds and must be a multiple of 60.
        /// </summary>
        public readonly int? Period;
        /// <summary>
        /// The name of the policy.
        /// </summary>
        public readonly string PolicyName;
        /// <summary>
        /// The source of the metric. Valid values: `"cloudWatch"`, `"spectrum"`.
        /// </summary>
        public readonly string? Source;
        /// <summary>
        /// The metric statistics to return. For information about specific statistics go to [Statistics](http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/index.html?CHAP_TerminologyandKeyConcepts.html#Statistic) in the Amazon CloudWatch Developer Guide.
        /// </summary>
        public readonly string? Statistic;
        public readonly ImmutableArray<Outputs.ElastigroupScalingUpPolicyStepAdjustment> StepAdjustments;
        /// <summary>
        /// The target number of instances to have in the group.
        /// </summary>
        public readonly string? Target;
        /// <summary>
        /// The value against which the specified statistic is compared in order to determine if a step should be applied.
        /// 
        /// 
        /// If you do not specify an action type, you can only use – `adjustment`, `minTargetCapacity`, `maxTargetCapacity`.
        /// While using action_type, please also set the following:
        /// 
        /// When using `adjustment`           – set the field `adjustment`
        /// When using `setMinTarget`         – set the field `min_target_capacity`
        /// When using `updateCapacity`       – set the fields `minimum`, `maximum`, and `target`
        /// </summary>
        public readonly double? Threshold;
        /// <summary>
        /// The unit for the alarm's associated metric. Valid values: `"percent`, `"seconds"`, `"microseconds"`, `"milliseconds"`, `"bytes"`, `"kilobytes"`, `"megabytes"`, `"gigabytes"`, `"terabytes"`, `"bits"`, `"kilobits"`, `"megabits"`, `"gigabits"`, `"terabits"`, `"count"`, `"bytes/second"`, `"kilobytes/second"`, `"megabytes/second"`, `"gigabytes/second"`, `"terabytes/second"`, `"bits/second"`, `"kilobits/second"`, `"megabits/second"`, `"gigabits/second"`, `"terabits/second"`, `"count/second"`, `"none"`.
        /// </summary>
        public readonly string? Unit;

        [OutputConstructor]
        private ElastigroupScalingUpPolicy(
            string? actionType,

            string? adjustment,

            int? cooldown,

            ImmutableArray<Outputs.ElastigroupScalingUpPolicyDimension> dimensions,

            int? evaluationPeriods,

            bool? isEnabled,

            string? maxTargetCapacity,

            string? maximum,

            string metricName,

            string? minTargetCapacity,

            string? minimum,

            string @namespace,

            string? @operator,

            int? period,

            string policyName,

            string? source,

            string? statistic,

            ImmutableArray<Outputs.ElastigroupScalingUpPolicyStepAdjustment> stepAdjustments,

            string? target,

            double? threshold,

            string? unit)
        {
            ActionType = actionType;
            Adjustment = adjustment;
            Cooldown = cooldown;
            Dimensions = dimensions;
            EvaluationPeriods = evaluationPeriods;
            IsEnabled = isEnabled;
            MaxTargetCapacity = maxTargetCapacity;
            Maximum = maximum;
            MetricName = metricName;
            MinTargetCapacity = minTargetCapacity;
            Minimum = minimum;
            Namespace = @namespace;
            Operator = @operator;
            Period = period;
            PolicyName = policyName;
            Source = source;
            Statistic = statistic;
            StepAdjustments = stepAdjustments;
            Target = target;
            Threshold = threshold;
            Unit = unit;
        }
    }
}
