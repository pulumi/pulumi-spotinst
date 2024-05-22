// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Oceancd.Inputs
{

    public sealed class VerificationTemplateMetricProviderCloudWatchMetricDataQueryGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("expression")]
        public Input<string>? Expression { get; set; }

        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        [Input("label")]
        public Input<string>? Label { get; set; }

        [Input("metricStat")]
        public Input<Inputs.VerificationTemplateMetricProviderCloudWatchMetricDataQueryMetricStatGetArgs>? MetricStat { get; set; }

        [Input("period")]
        public Input<int>? Period { get; set; }

        [Input("returnData")]
        public Input<bool>? ReturnData { get; set; }

        public VerificationTemplateMetricProviderCloudWatchMetricDataQueryGetArgs()
        {
        }
        public static new VerificationTemplateMetricProviderCloudWatchMetricDataQueryGetArgs Empty => new VerificationTemplateMetricProviderCloudWatchMetricDataQueryGetArgs();
    }
}
