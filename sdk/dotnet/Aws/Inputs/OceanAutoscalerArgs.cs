// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class OceanAutoscalerArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Set the auto headroom percentage (a number in the range [0, 200]) which controls the percentage of headroom from the cluster. Relevant only when `autoscale_is_auto_config` toggled on.
        /// </summary>
        [Input("autoHeadroomPercentage")]
        public Input<int>? AutoHeadroomPercentage { get; set; }

        /// <summary>
        /// Cooldown period between scaling actions.
        /// </summary>
        [Input("autoscaleCooldown")]
        public Input<int>? AutoscaleCooldown { get; set; }

        /// <summary>
        /// Auto Scaling scale down operations.
        /// </summary>
        [Input("autoscaleDown")]
        public Input<Inputs.OceanAutoscalerAutoscaleDownArgs>? AutoscaleDown { get; set; }

        /// <summary>
        /// Spare resource capacity management enabling fast assignment of Pods without waiting for new resources to launch.
        /// </summary>
        [Input("autoscaleHeadroom")]
        public Input<Inputs.OceanAutoscalerAutoscaleHeadroomArgs>? AutoscaleHeadroom { get; set; }

        /// <summary>
        /// Automatically configure and optimize headroom resources.
        /// </summary>
        [Input("autoscaleIsAutoConfig")]
        public Input<bool>? AutoscaleIsAutoConfig { get; set; }

        /// <summary>
        /// Enable the Ocean Kubernetes Auto Scaler.
        /// </summary>
        [Input("autoscaleIsEnabled")]
        public Input<bool>? AutoscaleIsEnabled { get; set; }

        /// <summary>
        /// enables automatic and manual headroom to work in parallel. When set to false, automatic headroom overrides all other headroom definitions manually configured, whether they are at cluster or VNG level.
        /// </summary>
        [Input("enableAutomaticAndManualHeadroom")]
        public Input<bool>? EnableAutomaticAndManualHeadroom { get; set; }

        [Input("extendedResourceDefinitions")]
        private InputList<string>? _extendedResourceDefinitions;

        /// <summary>
        /// List of Ocean extended resource definitions to use in this cluster.
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        /// });
        /// ```
        /// </summary>
        public InputList<string> ExtendedResourceDefinitions
        {
            get => _extendedResourceDefinitions ?? (_extendedResourceDefinitions = new InputList<string>());
            set => _extendedResourceDefinitions = value;
        }

        /// <summary>
        /// Optionally set upper and lower bounds on the resource usage of the cluster.
        /// </summary>
        [Input("resourceLimits")]
        public Input<Inputs.OceanAutoscalerResourceLimitsArgs>? ResourceLimits { get; set; }

        public OceanAutoscalerArgs()
        {
        }
        public static new OceanAutoscalerArgs Empty => new OceanAutoscalerArgs();
    }
}
