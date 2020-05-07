// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class ElastigroupUpdatePolicyRollConfigStrategyOnFailureGetArgs : Pulumi.ResourceArgs
    {
        [Input("actionType", required: true)]
        public Input<string> ActionType { get; set; } = null!;

        [Input("batchNum")]
        public Input<int>? BatchNum { get; set; }

        /// <summary>
        /// The time in seconds, the instance is allowed to run while detached from the ELB. This is to allow the instance time to be drained from incoming TCP connections before terminating it, during a scale down operation.
        /// </summary>
        [Input("drainingTimeout")]
        public Input<int>? DrainingTimeout { get; set; }

        [Input("shouldDecrementTargetCapacity")]
        public Input<bool>? ShouldDecrementTargetCapacity { get; set; }

        [Input("shouldHandleAllBatches")]
        public Input<bool>? ShouldHandleAllBatches { get; set; }

        public ElastigroupUpdatePolicyRollConfigStrategyOnFailureGetArgs()
        {
        }
    }
}
