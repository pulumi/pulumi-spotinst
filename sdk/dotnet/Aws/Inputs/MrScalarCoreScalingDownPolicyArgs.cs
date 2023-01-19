// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class MrScalarCoreScalingDownPolicyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The type of action to perform. Allowed values are : 'adjustment', 'setMinTarget', 'setMaxTarget', 'updateCapacity', 'percentageAdjustment'
        /// </summary>
        [Input("actionType")]
        public Input<string>? ActionType { get; set; }

        /// <summary>
        /// The number of instances to add/remove to/from the target capacity when scale is needed.
        /// </summary>
        [Input("adjustment")]
        public Input<string>? Adjustment { get; set; }

        /// <summary>
        /// The amount of time, in seconds, after a scaling activity completes and before the next scaling activity can start.
        /// </summary>
        [Input("cooldown")]
        public Input<int>? Cooldown { get; set; }

        [Input("dimensions")]
        private InputMap<object>? _dimensions;

        /// <summary>
        /// A mapping of dimensions describing qualities of the metric.
        /// </summary>
        public InputMap<object> Dimensions
        {
            get => _dimensions ?? (_dimensions = new InputMap<object>());
            set => _dimensions = value;
        }

        /// <summary>
        /// The number of periods over which data is compared to the specified threshold.
        /// </summary>
        [Input("evaluationPeriods")]
        public Input<int>? EvaluationPeriods { get; set; }

        /// <summary>
        /// Max target capacity for scale down.
        /// </summary>
        [Input("maxTargetCapacity")]
        public Input<string>? MaxTargetCapacity { get; set; }

        /// <summary>
        /// The maximum to set when scale is needed.
        /// </summary>
        [Input("maximum")]
        public Input<string>? Maximum { get; set; }

        /// <summary>
        /// The name of the metric in CloudWatch which the statement will be based on.
        /// </summary>
        [Input("metricName", required: true)]
        public Input<string> MetricName { get; set; } = null!;

        /// <summary>
        /// Min target capacity for scale up.
        /// </summary>
        [Input("minTargetCapacity")]
        public Input<string>? MinTargetCapacity { get; set; }

        /// <summary>
        /// The minimum to set when scale is needed.
        /// </summary>
        [Input("minimum")]
        public Input<string>? Minimum { get; set; }

        /// <summary>
        /// Must contain the value: `AWS/ElasticMapReduce`.
        /// </summary>
        [Input("namespace", required: true)]
        public Input<string> Namespace { get; set; } = null!;

        /// <summary>
        /// The operator to use in order to determine if the policy is applicable. Valid values: `gt` | `gte` | `lt` | `lte`
        /// </summary>
        [Input("operator")]
        public Input<string>? Operator { get; set; }

        /// <summary>
        /// The time window in seconds over which the statistic is applied.
        /// </summary>
        [Input("period")]
        public Input<int>? Period { get; set; }

        /// <summary>
        /// The name of the policy.
        /// </summary>
        [Input("policyName", required: true)]
        public Input<string> PolicyName { get; set; } = null!;

        /// <summary>
        /// The aggregation method of the given metric. Valid Values: `average` | `sum` | `sampleCount` | `maximum` | `minimum`
        /// </summary>
        [Input("statistic")]
        public Input<string>? Statistic { get; set; }

        /// <summary>
        /// The number of instances to set when scale is needed.
        /// </summary>
        [Input("target")]
        public Input<string>? Target { get; set; }

        /// <summary>
        /// The value that the specified statistic is compared to.
        /// </summary>
        [Input("threshold", required: true)]
        public Input<double> Threshold { get; set; } = null!;

        /// <summary>
        /// The unit for a given metric. Valid Values: `seconds` | `microseconds` | `milliseconds` | `bytes` | `kilobytes` | `megabytes` | `gigabytes` | `terabytes` | `bits` | `kilobits` | `megabits` | `gigabits` | `terabits` | `percent` | `count` | `bytes/second` | `kilobytes/second` | `megabytes/second` | `gigabytes/second` | `terabytes/second` | `bits/second` | `kilobits/second` | `megabits/second` | `gigabits/second` | `terabits/second` | `count/second` | `none`
        /// </summary>
        [Input("unit", required: true)]
        public Input<string> Unit { get; set; } = null!;

        public MrScalarCoreScalingDownPolicyArgs()
        {
        }
        public static new MrScalarCoreScalingDownPolicyArgs Empty => new MrScalarCoreScalingDownPolicyArgs();
    }
}
