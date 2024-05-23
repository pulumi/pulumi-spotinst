// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Oceancd.Outputs
{

    [OutputType]
    public sealed class VerificationTemplateMetricBaselineBaselineProviderDatadog
    {
        /// <summary>
        /// A request for information retrieved from Datadog.
        /// </summary>
        public readonly string DatadogQuery;
        /// <summary>
        /// The window of time we are looking at in DataDog.
        /// </summary>
        public readonly string? Duration;

        [OutputConstructor]
        private VerificationTemplateMetricBaselineBaselineProviderDatadog(
            string datadogQuery,

            string? duration)
        {
            DatadogQuery = datadogQuery;
            Duration = duration;
        }
    }
}
