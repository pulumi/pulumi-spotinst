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
    public sealed class ElastigroupScalingDownPolicyStepAdjustment
    {
        /// <summary>
        /// Action to take. Valid values: `REPLACE_SERVER`, `RESTART_SERVER`.
        /// </summary>
        public readonly Outputs.ElastigroupScalingDownPolicyStepAdjustmentAction Action;
        /// <summary>
        /// The value against which the specified statistic is compared. If a `step_adjustment` object is defined, then it cannot be specified.
        /// </summary>
        public readonly int Threshold;

        [OutputConstructor]
        private ElastigroupScalingDownPolicyStepAdjustment(
            Outputs.ElastigroupScalingDownPolicyStepAdjustmentAction action,

            int threshold)
        {
            Action = action;
            Threshold = threshold;
        }
    }
}