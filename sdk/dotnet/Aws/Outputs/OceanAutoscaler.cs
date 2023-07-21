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
    public sealed class OceanAutoscaler
    {
        public readonly int? AutoHeadroomPercentage;
        public readonly int? AutoscaleCooldown;
        public readonly Outputs.OceanAutoscalerAutoscaleDown? AutoscaleDown;
        public readonly Outputs.OceanAutoscalerAutoscaleHeadroom? AutoscaleHeadroom;
        public readonly bool? AutoscaleIsAutoConfig;
        public readonly bool? AutoscaleIsEnabled;
        public readonly bool? EnableAutomaticAndManualHeadroom;
        public readonly ImmutableArray<string> ExtendedResourceDefinitions;
        public readonly Outputs.OceanAutoscalerResourceLimits? ResourceLimits;

        [OutputConstructor]
        private OceanAutoscaler(
            int? autoHeadroomPercentage,

            int? autoscaleCooldown,

            Outputs.OceanAutoscalerAutoscaleDown? autoscaleDown,

            Outputs.OceanAutoscalerAutoscaleHeadroom? autoscaleHeadroom,

            bool? autoscaleIsAutoConfig,

            bool? autoscaleIsEnabled,

            bool? enableAutomaticAndManualHeadroom,

            ImmutableArray<string> extendedResourceDefinitions,

            Outputs.OceanAutoscalerResourceLimits? resourceLimits)
        {
            AutoHeadroomPercentage = autoHeadroomPercentage;
            AutoscaleCooldown = autoscaleCooldown;
            AutoscaleDown = autoscaleDown;
            AutoscaleHeadroom = autoscaleHeadroom;
            AutoscaleIsAutoConfig = autoscaleIsAutoConfig;
            AutoscaleIsEnabled = autoscaleIsEnabled;
            EnableAutomaticAndManualHeadroom = enableAutomaticAndManualHeadroom;
            ExtendedResourceDefinitions = extendedResourceDefinitions;
            ResourceLimits = resourceLimits;
        }
    }
}
