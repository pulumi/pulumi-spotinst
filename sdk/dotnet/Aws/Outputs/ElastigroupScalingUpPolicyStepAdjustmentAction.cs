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
    public sealed class ElastigroupScalingUpPolicyStepAdjustmentAction
    {
        /// <summary>
        /// The number of instances to add/remove to/from the target capacity when scale is needed. Can be used as advanced expression for scaling of instances to add/remove to/from the target capacity when scale is needed. You can see more information here: Advanced expression. Example value: `"MAX(currCapacity / 5, value * 10)"`
        /// </summary>
        public readonly string? Adjustment;
        /// <summary>
        /// . The number of the desired target (and maximum) capacity
        /// </summary>
        public readonly string? MaxTargetCapacity;
        /// <summary>
        /// The maximal number of instances to have in the group.
        /// </summary>
        public readonly string? Maximum;
        /// <summary>
        /// . The number of the desired target (and minimum) capacity
        /// </summary>
        public readonly string? MinTargetCapacity;
        /// <summary>
        /// The minimal number of instances to have in the group.
        /// </summary>
        public readonly string? Minimum;
        /// <summary>
        /// The target number of instances to have in the group.
        /// </summary>
        public readonly string? Target;
        /// <summary>
        /// The type of the action to take when scale up is needed. Valid types: `"adjustment"`, `"updateCapacity"`, `"setMaxTarget"`, `"percentageAdjustment"`.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private ElastigroupScalingUpPolicyStepAdjustmentAction(
            string? adjustment,

            string? maxTargetCapacity,

            string? maximum,

            string? minTargetCapacity,

            string? minimum,

            string? target,

            string type)
        {
            Adjustment = adjustment;
            MaxTargetCapacity = maxTargetCapacity;
            Maximum = maximum;
            MinTargetCapacity = minTargetCapacity;
            Minimum = minimum;
            Target = target;
            Type = type;
        }
    }
}
