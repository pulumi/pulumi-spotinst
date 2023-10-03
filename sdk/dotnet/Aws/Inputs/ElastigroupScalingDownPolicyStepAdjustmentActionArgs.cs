// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class ElastigroupScalingDownPolicyStepAdjustmentActionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The number of instances to add/remove to/from the target capacity when scale is needed. Can be used as advanced expression for scaling of instances to add/remove to/from the target capacity when scale is needed. You can see more information here: Advanced expression. Example value: `"MAX(currCapacity / 5, value * 10)"`
        /// </summary>
        [Input("adjustment")]
        public Input<string>? Adjustment { get; set; }

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
        /// . The number of the desired target (and minimum) capacity
        /// </summary>
        [Input("minTargetCapacity")]
        public Input<string>? MinTargetCapacity { get; set; }

        /// <summary>
        /// The minimal number of instances to have in the group.
        /// </summary>
        [Input("minimum")]
        public Input<string>? Minimum { get; set; }

        /// <summary>
        /// The target number of instances to have in the group.
        /// </summary>
        [Input("target")]
        public Input<string>? Target { get; set; }

        /// <summary>
        /// The type of the action to take when scale up is needed. Valid types: `"adjustment"`, `"updateCapacity"`, `"setMaxTarget"`, `"percentageAdjustment"`.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public ElastigroupScalingDownPolicyStepAdjustmentActionArgs()
        {
        }
        public static new ElastigroupScalingDownPolicyStepAdjustmentActionArgs Empty => new ElastigroupScalingDownPolicyStepAdjustmentActionArgs();
    }
}
