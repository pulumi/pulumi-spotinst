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
        public readonly int BatchSizePercentage;
        public readonly int? GracePeriod;
        /// <summary>
        /// The service that will perform health checks for the instance. Valid values: `"ELB"`, `"HCS"`, `"TARGET_GROUP"`, `"EC2"`, `"K8S_NODE"`, `"NOMAD_NODE"`, `"ECS_CLUSTER_INSTANCE"`.
        /// </summary>
        public readonly string? HealthCheckType;
        public readonly Outputs.ElastigroupUpdatePolicyRollConfigStrategy? Strategy;
        public readonly double? WaitForRollPercentage;
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
