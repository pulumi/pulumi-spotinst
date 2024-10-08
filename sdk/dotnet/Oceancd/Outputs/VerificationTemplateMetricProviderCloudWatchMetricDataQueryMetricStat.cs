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
    public sealed class VerificationTemplateMetricProviderCloudWatchMetricDataQueryMetricStat
    {
        /// <summary>
        /// The metric to return, including the metric name, namespace, and dimensions.
        /// </summary>
        public readonly Outputs.VerificationTemplateMetricProviderCloudWatchMetricDataQueryMetricStatMetric? Metric;
        /// <summary>
        /// The granularity, in seconds, of the returned data points.
        /// </summary>
        public readonly int? MetricPeriod;
        /// <summary>
        /// The statistic to return. It can include any CloudWatch statistic or extended statistic.
        /// </summary>
        public readonly string? Stat;
        /// <summary>
        /// This defines what unit you want to use when storing the metric.  Enum: `"Seconds" "Microseconds" "Milliseconds" "Bytes" "Kilobytes" "Megabytes" "Gigabytes" "Terabytes" "Bits" "Kilobits" "Megabits" "Gigabits" "Terabits" "Percent" "Count" "Bytes/Second" "Kilobytes/Second" "Megabytes/Second" "Gigabytes/Second" "Terabytes/Second" "Bits/Second" "Kilobits/Second" "Megabits/Second" "Gigabits/Second" "Terabits/Second" "Count/Second" "None"`
        /// </summary>
        public readonly string? Unit;

        [OutputConstructor]
        private VerificationTemplateMetricProviderCloudWatchMetricDataQueryMetricStat(
            Outputs.VerificationTemplateMetricProviderCloudWatchMetricDataQueryMetricStatMetric? metric,

            int? metricPeriod,

            string? stat,

            string? unit)
        {
            Metric = metric;
            MetricPeriod = metricPeriod;
            Stat = stat;
            Unit = unit;
        }
    }
}