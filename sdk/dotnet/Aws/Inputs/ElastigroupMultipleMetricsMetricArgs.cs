// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class ElastigroupMultipleMetricsMetricArgs : global::Pulumi.ResourceArgs
    {
        [Input("dimensions")]
        private InputList<Inputs.ElastigroupMultipleMetricsMetricDimensionArgs>? _dimensions;
        public InputList<Inputs.ElastigroupMultipleMetricsMetricDimensionArgs> Dimensions
        {
            get => _dimensions ?? (_dimensions = new InputList<Inputs.ElastigroupMultipleMetricsMetricDimensionArgs>());
            set => _dimensions = value;
        }

        [Input("extendedStatistic")]
        public Input<string>? ExtendedStatistic { get; set; }

        [Input("metricName", required: true)]
        public Input<string> MetricName { get; set; } = null!;

        /// <summary>
        /// The group name.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("namespace", required: true)]
        public Input<string> Namespace { get; set; } = null!;

        [Input("statistic")]
        public Input<string>? Statistic { get; set; }

        [Input("unit")]
        public Input<string>? Unit { get; set; }

        public ElastigroupMultipleMetricsMetricArgs()
        {
        }
        public static new ElastigroupMultipleMetricsMetricArgs Empty => new ElastigroupMultipleMetricsMetricArgs();
    }
}