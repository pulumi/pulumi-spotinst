// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Gke.Inputs
{

    public sealed class ElastigroupIntegrationGkeGetArgs : Pulumi.ResourceArgs
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
        public Input<Inputs.ElastigroupIntegrationGkeAutoscaleDownGetArgs>? AutoscaleDown { get; set; }

        /// <summary>
        /// Headroom for the cluster.
        /// </summary>
        [Input("autoscaleHeadroom")]
        public Input<Inputs.ElastigroupIntegrationGkeAutoscaleHeadroomGetArgs>? AutoscaleHeadroom { get; set; }

        [Input("autoscaleIsAutoConfig")]
        public Input<bool>? AutoscaleIsAutoConfig { get; set; }

        /// <summary>
        /// Specifies whether the auto scaling feature is enabled.
        /// </summary>
        [Input("autoscaleIsEnabled")]
        public Input<bool>? AutoscaleIsEnabled { get; set; }

        [Input("autoscaleLabels")]
        private InputList<Inputs.ElastigroupIntegrationGkeAutoscaleLabelGetArgs>? _autoscaleLabels;

        /// <summary>
        /// Labels to assign to the resource.
        /// </summary>
        public InputList<Inputs.ElastigroupIntegrationGkeAutoscaleLabelGetArgs> AutoscaleLabels
        {
            get => _autoscaleLabels ?? (_autoscaleLabels = new InputList<Inputs.ElastigroupIntegrationGkeAutoscaleLabelGetArgs>());
            set => _autoscaleLabels = value;
        }

        /// <summary>
        /// The GKE cluster ID you wish to import.
        /// </summary>
        [Input("clusterId")]
        public Input<string>? ClusterId { get; set; }

        /// <summary>
        /// The location of your GKE cluster.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        public ElastigroupIntegrationGkeGetArgs()
        {
        }
    }
}
