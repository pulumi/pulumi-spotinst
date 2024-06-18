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
        /// Sets the action that will take place, Accepted values are: `DETACH_OLD`, `DETACH_NEW`.
        /// </summary>
        [Input("actionType", required: true)]
        public Input<string> ActionType { get; set; } = null!;

        [Input("batchNum")]
        public Input<int>? BatchNum { get; set; }

        /// <summary>
        /// Indicates (in seconds) the timeout to wait until instance are detached.
        /// </summary>
        [Input("drainingTimeout")]
        public Input<int>? DrainingTimeout { get; set; }

        /// <summary>
        /// Decrementing the group target capacity after detaching the instances.
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
