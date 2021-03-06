// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Azure.Outputs
{

    [OutputType]
    public sealed class ElastigroupHealthCheck
    {
        /// <summary>
        /// Enable auto-healing of unhealthy VMs.
        /// </summary>
        public readonly bool? AutoHealing;
        /// <summary>
        /// Sets the grace period for new instances to become healthy.
        /// </summary>
        public readonly int? GracePeriod;
        /// <summary>
        /// Sets the health check type to use. Valid values: `"INSTANCE_STATE"`, `"NONE"`.
        /// </summary>
        public readonly string HealthCheckType;

        [OutputConstructor]
        private ElastigroupHealthCheck(
            bool? autoHealing,

            int? gracePeriod,

            string healthCheckType)
        {
            AutoHealing = autoHealing;
            GracePeriod = gracePeriod;
            HealthCheckType = healthCheckType;
        }
    }
}
