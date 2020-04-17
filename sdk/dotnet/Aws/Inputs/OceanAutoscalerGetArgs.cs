// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class OceanAutoscalerGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Set the auto headroom percentage (a number in the range [0, 200]) which controls the percentage of headroom from the cluster. Relevant only when `isAutoConfig` toggled on.
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
        public Input<Inputs.OceanAutoscalerAutoscaleDownGetArgs>? AutoscaleDown { get; set; }

        /// <summary>
        /// Spare resource capacity management enabling fast assignment of Pods without waiting for new resources to launch.
        /// </summary>
        [Input("autoscaleHeadroom")]
        public Input<Inputs.OceanAutoscalerAutoscaleHeadroomGetArgs>? AutoscaleHeadroom { get; set; }

        /// <summary>
        /// Automatically configure and optimize headroom resources.
        /// </summary>
        [Input("autoscaleIsAutoConfig")]
        public Input<bool>? AutoscaleIsAutoConfig { get; set; }

        /// <summary>
        /// Enable the Ocean Kubernetes autoscaler.
        /// </summary>
        [Input("autoscaleIsEnabled")]
        public Input<bool>? AutoscaleIsEnabled { get; set; }

        /// <summary>
        /// Optionally set upper and lower bounds on the resource usage of the cluster.
        /// </summary>
        [Input("resourceLimits")]
        public Input<Inputs.OceanAutoscalerResourceLimitsGetArgs>? ResourceLimits { get; set; }

        public OceanAutoscalerGetArgs()
        {
        }
    }
}
