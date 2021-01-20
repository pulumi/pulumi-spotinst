// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class ElastigroupIntegrationKubernetesArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The public IP of the DC/OS Master.
        /// </summary>
        [Input("apiServer")]
        public Input<string>? ApiServer { get; set; }

        /// <summary>
        /// The amount of time, in seconds, after a scaling activity completes before any further trigger-related scaling activities can start.
        /// </summary>
        [Input("autoscaleCooldown")]
        public Input<int>? AutoscaleCooldown { get; set; }

        /// <summary>
        /// Settings for scale down actions.
        /// </summary>
        [Input("autoscaleDown")]
        public Input<Inputs.ElastigroupIntegrationKubernetesAutoscaleDownArgs>? AutoscaleDown { get; set; }

        /// <summary>
        /// An option to set compute reserve for the cluster.
        /// </summary>
        [Input("autoscaleHeadroom")]
        public Input<Inputs.ElastigroupIntegrationKubernetesAutoscaleHeadroomArgs>? AutoscaleHeadroom { get; set; }

        /// <summary>
        /// Enabling the automatic k8s auto-scaler functionality. For more information please see: [Kubernetes auto scaler](https://api.spotinst.com/integration-docs/elastigroup/container-management/kubernetes/autoscaler/).
        /// </summary>
        [Input("autoscaleIsAutoConfig")]
        public Input<bool>? AutoscaleIsAutoConfig { get; set; }

        /// <summary>
        /// Specifies whether the auto scaling feature is enabled.
        /// </summary>
        [Input("autoscaleIsEnabled")]
        public Input<bool>? AutoscaleIsEnabled { get; set; }

        [Input("autoscaleLabels")]
        private InputList<Inputs.ElastigroupIntegrationKubernetesAutoscaleLabelArgs>? _autoscaleLabels;

        /// <summary>
        /// A key/value mapping of tags to assign to the resource.
        /// </summary>
        public InputList<Inputs.ElastigroupIntegrationKubernetesAutoscaleLabelArgs> AutoscaleLabels
        {
            get => _autoscaleLabels ?? (_autoscaleLabels = new InputList<Inputs.ElastigroupIntegrationKubernetesAutoscaleLabelArgs>());
            set => _autoscaleLabels = value;
        }

        [Input("clusterIdentifier")]
        public Input<string>? ClusterIdentifier { get; set; }

        /// <summary>
        /// Valid values: `"saas"`, `"pod"`.
        /// </summary>
        [Input("integrationMode")]
        public Input<string>? IntegrationMode { get; set; }

        /// <summary>
        /// Kubernetes Token
        /// </summary>
        [Input("token")]
        public Input<string>? Token { get; set; }

        public ElastigroupIntegrationKubernetesArgs()
        {
        }
    }
}
