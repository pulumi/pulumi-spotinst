// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Oceancd.Inputs
{

    public sealed class VerificationTemplateMetricBaselineBaselineProviderNewRelicGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A raw newrelic NRQL query to perform.
        /// </summary>
        [Input("newRelicQuery", required: true)]
        public Input<string> NewRelicQuery { get; set; } = null!;

        /// <summary>
        /// The name of the secret holding NR account configuration.
        /// </summary>
        [Input("profile")]
        public Input<string>? Profile { get; set; }

        public VerificationTemplateMetricBaselineBaselineProviderNewRelicGetArgs()
        {
        }
        public static new VerificationTemplateMetricBaselineBaselineProviderNewRelicGetArgs Empty => new VerificationTemplateMetricBaselineBaselineProviderNewRelicGetArgs();
    }
}
