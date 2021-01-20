// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class ElastigroupUpdatePolicyRollConfigStrategyArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Action to take. Valid values: `REPLACE_SERVER`, `RESTART_SERVER`.
        /// </summary>
        [Input("action", required: true)]
        public Input<string> Action { get; set; } = null!;

        /// <summary>
        /// Indicates the threshold of minimum healthy instances in single batch. If the amount of healthy instances in single batch is under the threshold, the deployment will fail. Range `1` - `100`.
        /// </summary>
        [Input("batchMinHealthyPercentage")]
        public Input<int>? BatchMinHealthyPercentage { get; set; }

        /// <summary>
        /// Set detach options to the deployment.
        /// </summary>
        [Input("onFailure")]
        public Input<Inputs.ElastigroupUpdatePolicyRollConfigStrategyOnFailureArgs>? OnFailure { get; set; }

        /// <summary>
        /// Specify whether to drain incoming TCP connections before terminating a server.
        /// </summary>
        [Input("shouldDrainInstances")]
        public Input<bool>? ShouldDrainInstances { get; set; }

        public ElastigroupUpdatePolicyRollConfigStrategyArgs()
        {
        }
    }
}
