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
    public sealed class OceanNpAutoscalerAutoscaleHeadroomAutomatic
    {
        public readonly bool? IsEnabled;
        public readonly int? Percentage;

        [OutputConstructor]
        private OceanNpAutoscalerAutoscaleHeadroomAutomatic(
            bool? isEnabled,

            int? percentage)
        {
            IsEnabled = isEnabled;
            Percentage = percentage;
        }
    }
}
