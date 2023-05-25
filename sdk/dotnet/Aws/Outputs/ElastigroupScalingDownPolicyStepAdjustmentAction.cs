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
    public sealed class ElastigroupScalingDownPolicyStepAdjustmentAction
    {
        /// <summary>
        /// The number of instances to add or remove.
        /// </summary>
        public readonly string? Adjustment;
        /// <summary>
        /// The desired target capacity of a group. Required if using `"setMaxTarget"` as action type
        /// </summary>
        public readonly string? MaxTargetCapacity;
        /// <summary>
        /// The upper limit number of instances that you can scale up to. Required if using `"updateCapacity"` as action type and neither `"target"` nor `"minimum"` are not defined.
        /// </summary>
        public readonly string? Maximum;
        /// <summary>
        /// The desired target capacity of a group. Required if using `"setMinTarget"` as action type
        /// </summary>
        public readonly string? MinTargetCapacity;
        /// <summary>
        /// The lower limit number of instances that you can scale down to. Required if using `"updateCapacity"` as action type and neither `"target"` nor `"maximum"` are not defined.
        /// </summary>
        public readonly string? Minimum;
        /// <summary>
        /// The desired number of instances. Required if using `"updateCapacity"` as action type and neither `"minimum"` nor `"maximum"` are not defined.
        /// </summary>
        public readonly string? Target;
        /// <summary>
        /// The type of the action to take when scale up is needed. Valid types: `"adjustment"`, `"updateCapacity"`, `"setMinTarget"`, `"percentageAdjustment"`.
        /// 
        /// Usage:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        /// });
        /// ```
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private ElastigroupScalingDownPolicyStepAdjustmentAction(
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
