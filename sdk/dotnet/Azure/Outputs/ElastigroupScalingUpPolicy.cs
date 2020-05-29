// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Azure.Outputs
{

    [OutputType]
    public sealed class ElastigroupScalingUpPolicy
    {
        public readonly string? ActionType;
        public readonly string? Adjustment;
        public readonly int? Cooldown;
        public readonly ImmutableArray<Outputs.ElastigroupScalingUpPolicyDimension> Dimensions;
        public readonly int? EvaluationPeriods;
        public readonly string? MaxTargetCapacity;
        public readonly string? Maximum;
        public readonly string MetricName;
        public readonly string? MinTargetCapacity;
        public readonly string? Minimum;
        public readonly string Namespace;
        public readonly string? Operator;
        public readonly int? Period;
        public readonly string PolicyName;
        public readonly string? Statistic;
        public readonly string? Target;
        public readonly double Threshold;
        public readonly string? Unit;

        [OutputConstructor]
        private ElastigroupScalingUpPolicy(
            string? actionType,

            string? adjustment,

            int? cooldown,

            ImmutableArray<Outputs.ElastigroupScalingUpPolicyDimension> dimensions,

            int? evaluationPeriods,

            string? maxTargetCapacity,

            string? maximum,

            string metricName,

            string? minTargetCapacity,

            string? minimum,

            string @namespace,

            string? @operator,

            int? period,

            string policyName,

            string? statistic,

            string? target,

            double threshold,

            string? unit)
        {
            ActionType = actionType;
            Adjustment = adjustment;
            Cooldown = cooldown;
            Dimensions = dimensions;
            EvaluationPeriods = evaluationPeriods;
            MaxTargetCapacity = maxTargetCapacity;
            Maximum = maximum;
            MetricName = metricName;
            MinTargetCapacity = minTargetCapacity;
            Minimum = minimum;
            Namespace = @namespace;
            Operator = @operator;
            Period = period;
            PolicyName = policyName;
            Statistic = statistic;
            Target = target;
            Threshold = threshold;
            Unit = unit;
        }
    }
}