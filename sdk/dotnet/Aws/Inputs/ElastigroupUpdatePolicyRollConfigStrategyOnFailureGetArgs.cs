// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class ElastigroupUpdatePolicyRollConfigStrategyOnFailureGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The type of action to perform for scaling. Valid values: `"adjustment"`, `"percentageAdjustment"`, `"setMaxTarget"`, `"setMinTarget"`, `"updateCapacity"`. If a `step_adjustment` object is defined, then it cannot be specified.
        /// </summary>
        [Input("actionType", required: true)]
        public Input<string> ActionType { get; set; } = null!;

        [Input("batchNum")]
        public Input<int>? BatchNum { get; set; }

        /// <summary>
        /// The time in seconds, the instance is allowed to run while detached from the ELB. This is to allow the instance time to be drained from incoming TCP connections before terminating it, during a scale down operation.
        /// </summary>
        [Input("drainingTimeout")]
        public Input<int>? DrainingTimeout { get; set; }

        /// <summary>
        /// Decrementing the group target capacity after detaching the instances.
        /// 
        /// &lt;!--Start PulumiCodeChooser --&gt;
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        [Input("shouldDecrementTargetCapacity")]
        public Input<bool>? ShouldDecrementTargetCapacity { get; set; }

        /// <summary>
        /// Indicator if the action should apply to all batches of the deployment or only the latest batch.
        /// </summary>
        [Input("shouldHandleAllBatches")]
        public Input<bool>? ShouldHandleAllBatches { get; set; }

        public ElastigroupUpdatePolicyRollConfigStrategyOnFailureGetArgs()
        {
        }
        public static new ElastigroupUpdatePolicyRollConfigStrategyOnFailureGetArgs Empty => new ElastigroupUpdatePolicyRollConfigStrategyOnFailureGetArgs();
    }
}
