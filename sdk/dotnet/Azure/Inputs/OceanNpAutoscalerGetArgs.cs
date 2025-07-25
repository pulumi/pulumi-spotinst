// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Azure.Inputs
{

    public sealed class OceanNpAutoscalerGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Auto Scaling scale down operations.
        /// </summary>
        [Input("autoscaleDown")]
        public Input<Inputs.OceanNpAutoscalerAutoscaleDownGetArgs>? AutoscaleDown { get; set; }

        /// <summary>
        /// Spare resource capacity management enabling fast assignment of pods without waiting for new resources to launch.
        /// </summary>
        [Input("autoscaleHeadroom")]
        public Input<Inputs.OceanNpAutoscalerAutoscaleHeadroomGetArgs>? AutoscaleHeadroom { get; set; }

        /// <summary>
        /// Enable the Ocean Kubernetes Autoscaler.
        /// </summary>
        [Input("autoscaleIsEnabled")]
        public Input<bool>? AutoscaleIsEnabled { get; set; }

        /// <summary>
        /// Optionally set upper and lower bounds on the resource usage of the cluster.
        /// </summary>
        [Input("resourceLimits")]
        public Input<Inputs.OceanNpAutoscalerResourceLimitsGetArgs>? ResourceLimits { get; set; }

        public OceanNpAutoscalerGetArgs()
        {
        }
        public static new OceanNpAutoscalerGetArgs Empty => new OceanNpAutoscalerGetArgs();
    }
}
