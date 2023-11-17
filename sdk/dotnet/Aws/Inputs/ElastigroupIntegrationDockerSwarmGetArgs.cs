// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class ElastigroupIntegrationDockerSwarmGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The amount of time, in seconds, after a scaling activity completes before any further trigger-related scaling activities can start. Minimum 180, must be a multiple of 60.
        /// </summary>
        [Input("autoscaleCooldown")]
        public Input<int>? AutoscaleCooldown { get; set; }

        /// <summary>
        /// Settings for scale down actions.
        /// </summary>
        [Input("autoscaleDown")]
        public Input<Inputs.ElastigroupIntegrationDockerSwarmAutoscaleDownGetArgs>? AutoscaleDown { get; set; }

        /// <summary>
        /// An option to set compute reserve for the cluster.
        /// </summary>
        [Input("autoscaleHeadroom")]
        public Input<Inputs.ElastigroupIntegrationDockerSwarmAutoscaleHeadroomGetArgs>? AutoscaleHeadroom { get; set; }

        /// <summary>
        /// Specifies whether the auto scaling feature is enabled.
        /// </summary>
        [Input("autoscaleIsEnabled")]
        public Input<bool>? AutoscaleIsEnabled { get; set; }

        /// <summary>
        /// IP or FQDN of one of your swarm managers.
        /// </summary>
        [Input("masterHost", required: true)]
        public Input<string> MasterHost { get; set; } = null!;

        /// <summary>
        /// Network port used by your swarm.
        /// </summary>
        [Input("masterPort", required: true)]
        public Input<int> MasterPort { get; set; } = null!;

        public ElastigroupIntegrationDockerSwarmGetArgs()
        {
        }
        public static new ElastigroupIntegrationDockerSwarmGetArgs Empty => new ElastigroupIntegrationDockerSwarmGetArgs();
    }
}
