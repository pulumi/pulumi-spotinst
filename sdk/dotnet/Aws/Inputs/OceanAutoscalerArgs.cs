// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class OceanAutoscalerArgs : Pulumi.ResourceArgs
    {
        [Input("autoHeadroomPercentage")]
        public Input<int>? AutoHeadroomPercentage { get; set; }

        [Input("autoscaleCooldown")]
        public Input<int>? AutoscaleCooldown { get; set; }

        [Input("autoscaleDown")]
        public Input<Inputs.OceanAutoscalerAutoscaleDownArgs>? AutoscaleDown { get; set; }

        [Input("autoscaleHeadroom")]
        public Input<Inputs.OceanAutoscalerAutoscaleHeadroomArgs>? AutoscaleHeadroom { get; set; }

        [Input("autoscaleIsAutoConfig")]
        public Input<bool>? AutoscaleIsAutoConfig { get; set; }

        [Input("autoscaleIsEnabled")]
        public Input<bool>? AutoscaleIsEnabled { get; set; }

        [Input("resourceLimits")]
        public Input<Inputs.OceanAutoscalerResourceLimitsArgs>? ResourceLimits { get; set; }

        public OceanAutoscalerArgs()
        {
        }
    }
}
