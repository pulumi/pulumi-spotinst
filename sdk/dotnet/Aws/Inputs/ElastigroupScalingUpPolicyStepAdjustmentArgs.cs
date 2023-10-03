// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class ElastigroupScalingUpPolicyStepAdjustmentArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The action to take when scale up according to step's threshold is needed.
        /// </summary>
        [Input("action", required: true)]
        public Input<Inputs.ElastigroupScalingUpPolicyStepAdjustmentActionArgs> Action { get; set; } = null!;

        /// <summary>
        /// The value against which the specified statistic is compared in order to determine if a step should be applied.
        /// 
        /// 
        /// If you do not specify an action type, you can only use – `adjustment`, `minTargetCapacity`, `maxTargetCapacity`.
        /// While using action_type, please also set the following:
        /// 
        /// When using `adjustment`           – set the field `adjustment`
        /// When using `updateCapacity`       – set the fields `minimum`, `maximum`, and `target`
        /// </summary>
        [Input("threshold", required: true)]
        public Input<int> Threshold { get; set; } = null!;

        public ElastigroupScalingUpPolicyStepAdjustmentArgs()
        {
        }
        public static new ElastigroupScalingUpPolicyStepAdjustmentArgs Empty => new ElastigroupScalingUpPolicyStepAdjustmentArgs();
    }
}
