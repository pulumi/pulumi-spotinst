// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Oceancd.Inputs
{

    public sealed class VerificationTemplateMetricProviderDatadogArgs : global::Pulumi.ResourceArgs
    {
        [Input("datadogQuery")]
        public Input<string>? DatadogQuery { get; set; }

        [Input("duration")]
        public Input<string>? Duration { get; set; }

        public VerificationTemplateMetricProviderDatadogArgs()
        {
        }
        public static new VerificationTemplateMetricProviderDatadogArgs Empty => new VerificationTemplateMetricProviderDatadogArgs();
    }
}
