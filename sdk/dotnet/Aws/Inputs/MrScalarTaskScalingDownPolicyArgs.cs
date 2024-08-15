// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class MrScalarTaskScalingDownPolicyArgs : global::Pulumi.ResourceArgs
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
        private InputMap<string>? _dimensions;

        /// <summary>
        /// A mapping of dimensions describing qualities of the metric.
        /// </summary>
        public InputMap<string> Dimensions
        {
            get => _dimensions ?? (_dimensions = new InputMap<string>());
            set => _dimensions = value;
        }

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

        [Input("namespace", required: true)]
        public Input<string> Namespace { get; set; } = null!;

        [Input("operator")]
        public Input<string>? Operator { get; set; }

        [Input("period")]
        public Input<int>? Period { get; set; }

        /// <summary>
        /// The name of the policy.
        /// </summary>
        [Input("policyName", required: true)]
        public Input<string> PolicyName { get; set; } = null!;

        [Input("statistic")]
        public Input<string>? Statistic { get; set; }

        /// <summary>
        /// The number of instances to set when scale is needed.
        /// </summary>
        [Input("target")]
        public Input<string>? Target { get; set; }

        [Input("threshold", required: true)]
        public Input<double> Threshold { get; set; } = null!;

        [Input("unit", required: true)]
        public Input<string> Unit { get; set; } = null!;

        public MrScalarTaskScalingDownPolicyArgs()
        {
        }
        public static new MrScalarTaskScalingDownPolicyArgs Empty => new MrScalarTaskScalingDownPolicyArgs();
    }
}
