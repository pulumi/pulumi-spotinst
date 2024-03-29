// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Azure.Inputs
{

    public sealed class OceanAutoscalerArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Auto Scaling scale down operations.
        /// </summary>
        [Input("autoscaleDown")]
        public Input<Inputs.OceanAutoscalerAutoscaleDownArgs>? AutoscaleDown { get; set; }

        /// <summary>
        /// Spare Resource Capacity Management feature enables fast assignment of Pods without having to wait for new resources to be launched.
        /// </summary>
        [Input("autoscaleHeadroom")]
        public Input<Inputs.OceanAutoscalerAutoscaleHeadroomArgs>? AutoscaleHeadroom { get; set; }

        /// <summary>
        /// Enable the Ocean Kubernetes Autoscaler.
        /// </summary>
        [Input("autoscaleIsEnabled")]
        public Input<bool>? AutoscaleIsEnabled { get; set; }

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
