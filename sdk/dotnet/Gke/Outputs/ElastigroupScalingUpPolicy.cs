// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Gke.Outputs
{

    [OutputType]
    public sealed class ElastigroupScalingUpPolicy
    {
        public readonly string? ActionType;
        public readonly int? Adjustment;
        public readonly int? Cooldown;
        public readonly ImmutableArray<Outputs.ElastigroupScalingUpPolicyDimension> Dimensions;
        /// <summary>
        /// Amount of cooldown evaluation periods for scale down.
        /// </summary>
        public readonly int? EvaluationPeriods;
        public readonly string MetricName;
        public readonly string Namespace;
        public readonly string? Operator;
        public readonly int? Period;
        public readonly string PolicyName;
        public readonly string? Source;
        public readonly string? Statistic;
        public readonly double Threshold;
        public readonly string Unit;

        [OutputConstructor]
        private ElastigroupScalingUpPolicy(
            string? actionType,

            int? adjustment,

            int? cooldown,

            ImmutableArray<Outputs.ElastigroupScalingUpPolicyDimension> dimensions,

            int? evaluationPeriods,

            string metricName,

            string @namespace,

            string? @operator,

            int? period,

            string policyName,

            string? source,

            string? statistic,

            double threshold,

            string unit)
        {
            ActionType = actionType;
            Adjustment = adjustment;
            Cooldown = cooldown;
            Dimensions = dimensions;
            EvaluationPeriods = evaluationPeriods;
            MetricName = metricName;
            Namespace = @namespace;
            Operator = @operator;
            Period = period;
            PolicyName = policyName;
            Source = source;
            Statistic = statistic;
            Threshold = threshold;
            Unit = unit;
        }
    }
}
