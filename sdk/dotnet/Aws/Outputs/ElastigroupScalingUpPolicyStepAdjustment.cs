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
    public sealed class ElastigroupScalingUpPolicyStepAdjustment
    {
        /// <summary>
        /// The action to take when scale up according to step's threshold is needed.
        /// </summary>
        public readonly Outputs.ElastigroupScalingUpPolicyStepAdjustmentAction Action;
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
        public readonly int Threshold;

        [OutputConstructor]
        private ElastigroupScalingUpPolicyStepAdjustment(
            Outputs.ElastigroupScalingUpPolicyStepAdjustmentAction action,

            int threshold)
        {
            Action = action;
            Threshold = threshold;
        }
    }
}
