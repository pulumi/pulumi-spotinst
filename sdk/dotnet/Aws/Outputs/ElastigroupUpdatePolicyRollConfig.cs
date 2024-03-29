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
    public sealed class ElastigroupUpdatePolicyRollConfig
    {
        /// <summary>
        /// The percentage size of each batch in the scheduled deployment roll.
        /// </summary>
        public readonly int BatchSizePercentage;
        /// <summary>
        /// The period of time (seconds) to wait before checking a batch's health after it's deployment.
        /// </summary>
        public readonly int? GracePeriod;
        /// <summary>
        /// The service that will perform health checks for the instance. Valid values: `"ELB"`, `"HCS"`, `"TARGET_GROUP"`, `"MLB"`, `"EC2"`, `"MULTAI_TARGET_SET"`, `"MLB_RUNTIME"`, `"K8S_NODE"`, `"NOMAD_NODE"`, `"ECS_CLUSTER_INSTANCE"`.
        /// </summary>
        public readonly string? HealthCheckType;
        /// <summary>
        /// Strategy parameters
        /// </summary>
        public readonly Outputs.ElastigroupUpdatePolicyRollConfigStrategy? Strategy;
        /// <summary>
        /// For use with `should_roll`. Sets minimum %!o(MISSING)f roll required to complete before continuing the plan. Required if `wait_for_roll_timeout` is set.
        /// </summary>
        public readonly double? WaitForRollPercentage;
        /// <summary>
        /// For use with `should_roll`. Sets how long to wait for the deployed %!o(MISSING)f a roll to exceed `wait_for_roll_percentage` before continuing the plan. Required if `wait_for_roll_percentage` is set.
        /// </summary>
        public readonly int? WaitForRollTimeout;

        [OutputConstructor]
        private ElastigroupUpdatePolicyRollConfig(
            int batchSizePercentage,

            int? gracePeriod,

            string? healthCheckType,

            Outputs.ElastigroupUpdatePolicyRollConfigStrategy? strategy,

            double? waitForRollPercentage,

            int? waitForRollTimeout)
        {
            BatchSizePercentage = batchSizePercentage;
            GracePeriod = gracePeriod;
            HealthCheckType = healthCheckType;
            Strategy = strategy;
            WaitForRollPercentage = waitForRollPercentage;
            WaitForRollTimeout = waitForRollTimeout;
        }
    }
}
