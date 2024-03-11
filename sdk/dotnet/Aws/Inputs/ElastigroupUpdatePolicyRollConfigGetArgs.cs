// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
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
        /// The percentage size of each batch in the scheduled deployment roll.
        /// </summary>
        [Input("batchSizePercentage", required: true)]
        public Input<int> BatchSizePercentage { get; set; } = null!;

        /// <summary>
        /// The period of time (seconds) to wait before checking a batch's health after it's deployment.
        /// </summary>
        [Input("gracePeriod")]
        public Input<int>? GracePeriod { get; set; }

        /// <summary>
        /// The service that will perform health checks for the instance. Valid values: `"ELB"`, `"HCS"`, `"TARGET_GROUP"`, `"MLB"`, `"EC2"`, `"MULTAI_TARGET_SET"`, `"MLB_RUNTIME"`, `"K8S_NODE"`, `"NOMAD_NODE"`, `"ECS_CLUSTER_INSTANCE"`.
        /// </summary>
        [Input("healthCheckType")]
        public Input<string>? HealthCheckType { get; set; }

        /// <summary>
        /// Strategy parameters
        /// </summary>
        [Input("strategy")]
        public Input<Inputs.ElastigroupUpdatePolicyRollConfigStrategyGetArgs>? Strategy { get; set; }

        /// <summary>
        /// For use with `should_roll`. Sets minimum %!o(MISSING)f roll required to complete before continuing the plan. Required if `wait_for_roll_timeout` is set.
        /// </summary>
        [Input("waitForRollPercentage")]
        public Input<double>? WaitForRollPercentage { get; set; }

        /// <summary>
        /// For use with `should_roll`. Sets how long to wait for the deployed %!o(MISSING)f a roll to exceed `wait_for_roll_percentage` before continuing the plan. Required if `wait_for_roll_percentage` is set.
        /// </summary>
        [Input("waitForRollTimeout")]
        public Input<int>? WaitForRollTimeout { get; set; }

        public ElastigroupUpdatePolicyRollConfigGetArgs()
        {
        }
        public static new ElastigroupUpdatePolicyRollConfigGetArgs Empty => new ElastigroupUpdatePolicyRollConfigGetArgs();
    }
}
