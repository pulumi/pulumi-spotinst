// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class ElastigroupScalingUpPolicyStepAdjustmentGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The action to take when scale up according to step's threshold is needed.
        /// </summary>
        [Input("action", required: true)]
        public Input<Inputs.ElastigroupScalingUpPolicyStepAdjustmentActionGetArgs> Action { get; set; } = null!;

        /// <summary>
        /// The value against which the specified statistic is compared. If a `step_adjustment` object is defined, then it cannot be specified.
        /// </summary>
        [Input("threshold", required: true)]
        public Input<int> Threshold { get; set; } = null!;

        public ElastigroupScalingUpPolicyStepAdjustmentGetArgs()
        {
        }
        public static new ElastigroupScalingUpPolicyStepAdjustmentGetArgs Empty => new ElastigroupScalingUpPolicyStepAdjustmentGetArgs();
    }
}
