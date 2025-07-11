// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Gke.Inputs
{

    public sealed class ElastigroupIntegrationGkeArgs : global::Pulumi.ResourceArgs
    {
        [Input("autoUpdate")]
        public Input<bool>? AutoUpdate { get; set; }

        /// <summary>
        /// The amount of time, in seconds, after a scaling activity completes before any further trigger-related scaling activities can start.
        /// </summary>
        [Input("autoscaleCooldown")]
        public Input<int>? AutoscaleCooldown { get; set; }

        /// <summary>
        /// Enabling scale down.
        /// </summary>
        [Input("autoscaleDown")]
        public Input<Inputs.ElastigroupIntegrationGkeAutoscaleDownArgs>? AutoscaleDown { get; set; }

        /// <summary>
        /// Headroom for the cluster.
        /// </summary>
        [Input("autoscaleHeadroom")]
        public Input<Inputs.ElastigroupIntegrationGkeAutoscaleHeadroomArgs>? AutoscaleHeadroom { get; set; }

        [Input("autoscaleIsAutoConfig")]
        public Input<bool>? AutoscaleIsAutoConfig { get; set; }

        /// <summary>
        /// Specifies whether the auto scaling feature is enabled.
        /// </summary>
        [Input("autoscaleIsEnabled")]
        public Input<bool>? AutoscaleIsEnabled { get; set; }

        [Input("autoscaleLabels")]
        private InputList<Inputs.ElastigroupIntegrationGkeAutoscaleLabelArgs>? _autoscaleLabels;

        /// <summary>
        /// Labels to assign to the resource.
        /// </summary>
        public InputList<Inputs.ElastigroupIntegrationGkeAutoscaleLabelArgs> AutoscaleLabels
        {
            get => _autoscaleLabels ?? (_autoscaleLabels = new InputList<Inputs.ElastigroupIntegrationGkeAutoscaleLabelArgs>());
            set => _autoscaleLabels = value;
        }

        [Input("clusterId")]
        public Input<string>? ClusterId { get; set; }

        /// <summary>
        /// The location of your GKE cluster.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        public ElastigroupIntegrationGkeArgs()
        {
        }
        public static new ElastigroupIntegrationGkeArgs Empty => new ElastigroupIntegrationGkeArgs();
    }
}
