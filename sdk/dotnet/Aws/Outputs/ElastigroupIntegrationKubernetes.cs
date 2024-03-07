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
    public sealed class ElastigroupIntegrationKubernetes
    {
        /// <summary>
        /// The public IP of the DC/OS Master. 
        /// 
        /// Usage:
        /// 
        /// &lt;!--Start PulumiCodeChooser --&gt;
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public readonly string? ApiServer;
        /// <summary>
        /// The amount of time, in seconds, after a scaling activity completes before any further trigger-related scaling activities can start.
        /// </summary>
        public readonly int? AutoscaleCooldown;
        /// <summary>
        /// Settings for scale down actions.
        /// </summary>
        public readonly Outputs.ElastigroupIntegrationKubernetesAutoscaleDown? AutoscaleDown;
        /// <summary>
        /// An option to set compute reserve for the cluster.
        /// </summary>
        public readonly Outputs.ElastigroupIntegrationKubernetesAutoscaleHeadroom? AutoscaleHeadroom;
        /// <summary>
        /// Enabling the automatic k8s auto-scaler functionality. For more information please see: [Kubernetes auto scaler](https://api.spotinst.com/integration-docs/elastigroup/container-management/kubernetes/autoscaler/).
        /// </summary>
        public readonly bool? AutoscaleIsAutoConfig;
        /// <summary>
        /// Specifies whether the auto scaling feature is enabled.
        /// </summary>
        public readonly bool? AutoscaleIsEnabled;
        /// <summary>
        /// A key/value mapping of tags to assign to the resource.
        /// 
        /// Usage:
        /// 
        /// &lt;!--Start PulumiCodeChooser --&gt;
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public readonly ImmutableArray<Outputs.ElastigroupIntegrationKubernetesAutoscaleLabel> AutoscaleLabels;
        public readonly string? ClusterIdentifier;
        /// <summary>
        /// Valid values: `"saas"`, `"pod"`.
        /// </summary>
        public readonly string? IntegrationMode;
        /// <summary>
        /// Kubernetes Token
        /// </summary>
        public readonly string? Token;

        [OutputConstructor]
        private ElastigroupIntegrationKubernetes(
            string? apiServer,

            int? autoscaleCooldown,

            Outputs.ElastigroupIntegrationKubernetesAutoscaleDown? autoscaleDown,

            Outputs.ElastigroupIntegrationKubernetesAutoscaleHeadroom? autoscaleHeadroom,

            bool? autoscaleIsAutoConfig,

            bool? autoscaleIsEnabled,

            ImmutableArray<Outputs.ElastigroupIntegrationKubernetesAutoscaleLabel> autoscaleLabels,

            string? clusterIdentifier,

            string? integrationMode,

            string? token)
        {
            ApiServer = apiServer;
            AutoscaleCooldown = autoscaleCooldown;
            AutoscaleDown = autoscaleDown;
            AutoscaleHeadroom = autoscaleHeadroom;
            AutoscaleIsAutoConfig = autoscaleIsAutoConfig;
            AutoscaleIsEnabled = autoscaleIsEnabled;
            AutoscaleLabels = autoscaleLabels;
            ClusterIdentifier = clusterIdentifier;
            IntegrationMode = integrationMode;
            Token = token;
        }
    }
}
