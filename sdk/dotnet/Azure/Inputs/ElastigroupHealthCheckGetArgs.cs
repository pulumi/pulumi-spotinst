// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Azure.Inputs
{

    public sealed class ElastigroupHealthCheckGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enable auto-healing of unhealthy VMs.
        /// </summary>
        [Input("autoHealing")]
        public Input<bool>? AutoHealing { get; set; }

        /// <summary>
        /// Sets the grace period for new instances to become healthy.
        /// </summary>
        [Input("gracePeriod")]
        public Input<int>? GracePeriod { get; set; }

        /// <summary>
        /// Sets the health check type to use. Valid values: `"INSTANCE_STATE"`, `"NONE"`.
        /// </summary>
        [Input("healthCheckType", required: true)]
        public Input<string> HealthCheckType { get; set; } = null!;

        public ElastigroupHealthCheckGetArgs()
        {
        }
    }
}
