// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Inputs
{

    public sealed class HealthCheckCheckGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The destination for the request.
        /// </summary>
        [Input("endpoint", required: true)]
        public Input<string> Endpoint { get; set; } = null!;

        /// <summary>
        /// The number of consecutive successful health checks that must occur before declaring an instance healthy.
        /// </summary>
        [Input("healthy", required: true)]
        public Input<int> Healthy { get; set; } = null!;

        /// <summary>
        /// The amount of time (in seconds) between each health check (minimum: 10).
        /// </summary>
        [Input("interval", required: true)]
        public Input<int> Interval { get; set; } = null!;

        /// <summary>
        /// The port of the Spotinst HCS (default: 80).
        /// </summary>
        [Input("port", required: true)]
        public Input<int> Port { get; set; } = null!;

        /// <summary>
        /// The protocol to use to connect with the instance. Valid values: http, https.
        /// </summary>
        [Input("protocol", required: true)]
        public Input<string> Protocol { get; set; } = null!;

        /// <summary>
        /// the amount of time (in seconds) to wait when receiving a response from the health check.
        /// </summary>
        [Input("timeout", required: true)]
        public Input<int> Timeout { get; set; } = null!;

        /// <summary>
        /// The number of consecutive failed health checks that must occur before declaring an instance unhealthy.
        /// </summary>
        [Input("unhealthy", required: true)]
        public Input<int> Unhealthy { get; set; } = null!;

        public HealthCheckCheckGetArgs()
        {
        }
    }
}
