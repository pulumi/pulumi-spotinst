// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Oceancd.Inputs
{

    public sealed class VerificationTemplateMetricProviderPrometheusArgs : global::Pulumi.ResourceArgs
    {
        [Input("prometheusQuery", required: true)]
        public Input<string> PrometheusQuery { get; set; } = null!;

        public VerificationTemplateMetricProviderPrometheusArgs()
        {
        }
        public static new VerificationTemplateMetricProviderPrometheusArgs Empty => new VerificationTemplateMetricProviderPrometheusArgs();
    }
}