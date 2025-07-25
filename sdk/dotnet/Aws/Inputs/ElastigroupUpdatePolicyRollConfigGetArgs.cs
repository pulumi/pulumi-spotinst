// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class ElastigroupUpdatePolicyRollConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Sets the percentage of the instances to deploy in each batch.
        /// </summary>
        [Input("batchSizePercentage", required: true)]
        public Input<int> BatchSizePercentage { get; set; } = null!;

        /// <summary>
        /// Sets the grace period for new instances to become healthy.
        /// </summary>
        [Input("gracePeriod")]
        public Input<int>? GracePeriod { get; set; }

        /// <summary>
        /// Sets the health check type to use. Valid values: `"EC2"`, `"ECS_CLUSTER_INSTANCE"`, `"ELB"`, `"HCS"`, `"TARGET_GROUP"`, `"NONE"`.
        /// </summary>
        [Input("healthCheckType")]
        public Input<string>? HealthCheckType { get; set; }

        /// <summary>
        /// Strategy parameters
        /// </summary>
        [Input("strategy")]
        public Input<Inputs.ElastigroupUpdatePolicyRollConfigStrategyGetArgs>? Strategy { get; set; }

        /// <summary>
        /// For use with `should_roll`. Sets minimum % of roll required to complete before continuing the plan. Required if `wait_for_roll_timeout` is set.
        /// </summary>
        [Input("waitForRollPercentage")]
        public Input<double>? WaitForRollPercentage { get; set; }

        /// <summary>
        /// For use with `should_roll`. Sets how long to wait for the deployed % of a roll to exceed `wait_for_roll_percentage` before continuing the plan. Required if `wait_for_roll_percentage` is set.
        /// </summary>
        [Input("waitForRollTimeout")]
        public Input<int>? WaitForRollTimeout { get; set; }

        public ElastigroupUpdatePolicyRollConfigGetArgs()
        {
        }
        public static new ElastigroupUpdatePolicyRollConfigGetArgs Empty => new ElastigroupUpdatePolicyRollConfigGetArgs();
    }
}
