// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Azure.Outputs
{

    [OutputType]
    public sealed class OceanAutoscalerAutoscaleDown
    {
        public readonly double? MaxScaleDownPercentage;

        [OutputConstructor]
        private OceanAutoscalerAutoscaleDown(double? maxScaleDownPercentage)
        {
            MaxScaleDownPercentage = maxScaleDownPercentage;
        }
    }
}
