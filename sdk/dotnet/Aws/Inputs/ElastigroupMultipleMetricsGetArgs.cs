// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class ElastigroupMultipleMetricsGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("expressions")]
        private InputList<Inputs.ElastigroupMultipleMetricsExpressionGetArgs>? _expressions;

        /// <summary>
        /// Array of objects (Expression config)
        /// </summary>
        public InputList<Inputs.ElastigroupMultipleMetricsExpressionGetArgs> Expressions
        {
            get => _expressions ?? (_expressions = new InputList<Inputs.ElastigroupMultipleMetricsExpressionGetArgs>());
            set => _expressions = value;
        }

        [Input("metrics")]
        private InputList<Inputs.ElastigroupMultipleMetricsMetricGetArgs>? _metrics;

        /// <summary>
        /// Array of objects (Metric config)
        /// </summary>
        public InputList<Inputs.ElastigroupMultipleMetricsMetricGetArgs> Metrics
        {
            get => _metrics ?? (_metrics = new InputList<Inputs.ElastigroupMultipleMetricsMetricGetArgs>());
            set => _metrics = value;
        }

        public ElastigroupMultipleMetricsGetArgs()
        {
        }
        public static new ElastigroupMultipleMetricsGetArgs Empty => new ElastigroupMultipleMetricsGetArgs();
    }
}
