// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Oceancd.Inputs
{

    public sealed class VerificationTemplateMetricBaselineBaselineProviderArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The datadog provider.
        /// </summary>
        [Input("datadog")]
        public Input<Inputs.VerificationTemplateMetricBaselineBaselineProviderDatadogArgs>? Datadog { get; set; }

        /// <summary>
        /// The New Relic provider.
        /// </summary>
        [Input("newRelic")]
        public Input<Inputs.VerificationTemplateMetricBaselineBaselineProviderNewRelicArgs>? NewRelic { get; set; }

        /// <summary>
        /// The Prometheus provider.
        /// </summary>
        [Input("prometheus")]
        public Input<Inputs.VerificationTemplateMetricBaselineBaselineProviderPrometheusArgs>? Prometheus { get; set; }

        public VerificationTemplateMetricBaselineBaselineProviderArgs()
        {
        }
        public static new VerificationTemplateMetricBaselineBaselineProviderArgs Empty => new VerificationTemplateMetricBaselineBaselineProviderArgs();
    }
}
