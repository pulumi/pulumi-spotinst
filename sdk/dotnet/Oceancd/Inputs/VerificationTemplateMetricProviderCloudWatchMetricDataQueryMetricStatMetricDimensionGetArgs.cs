// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Oceancd.Inputs
{

    public sealed class VerificationTemplateMetricProviderCloudWatchMetricDataQueryMetricStatMetricDimensionGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("dimensionName", required: true)]
        public Input<string> DimensionName { get; set; } = null!;

        [Input("dimensionValue", required: true)]
        public Input<string> DimensionValue { get; set; } = null!;

        public VerificationTemplateMetricProviderCloudWatchMetricDataQueryMetricStatMetricDimensionGetArgs()
        {
        }
        public static new VerificationTemplateMetricProviderCloudWatchMetricDataQueryMetricStatMetricDimensionGetArgs Empty => new VerificationTemplateMetricProviderCloudWatchMetricDataQueryMetricStatMetricDimensionGetArgs();
    }
}
