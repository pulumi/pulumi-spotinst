// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Oceancd.Outputs
{

    [OutputType]
    public sealed class VerificationTemplateMetricProviderCloudWatch
    {
        /// <summary>
        /// The window of time we are looking at in CloudWatch.
        /// </summary>
        public readonly string? Duration;
        /// <summary>
        /// The metric queries to be returned. A single MetricData call can include as many as 500 MetricDataQuery structures. Each of these structures can specify either a metric to retrieve, a Metrics Insights query, or a math expression to perform on retrieved data.
        /// </summary>
        public readonly ImmutableArray<Outputs.VerificationTemplateMetricProviderCloudWatchMetricDataQuery> MetricDataQueries;

        [OutputConstructor]
        private VerificationTemplateMetricProviderCloudWatch(
            string? duration,

            ImmutableArray<Outputs.VerificationTemplateMetricProviderCloudWatchMetricDataQuery> metricDataQueries)
        {
            Duration = duration;
            MetricDataQueries = metricDataQueries;
        }
    }
}
