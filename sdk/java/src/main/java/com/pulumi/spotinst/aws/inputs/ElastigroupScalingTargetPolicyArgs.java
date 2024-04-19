// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.spotinst.aws.inputs.ElastigroupScalingTargetPolicyDimensionArgs;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ElastigroupScalingTargetPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ElastigroupScalingTargetPolicyArgs Empty = new ElastigroupScalingTargetPolicyArgs();

    /**
     * Integer the amount of time, in seconds, after a scaling activity completes and before the next scaling activity can start. If this parameter is not specified, the default cooldown period for the group applies.
     * 
     */
    @Import(name="cooldown")
    private @Nullable Output<Integer> cooldown;

    /**
     * @return Integer the amount of time, in seconds, after a scaling activity completes and before the next scaling activity can start. If this parameter is not specified, the default cooldown period for the group applies.
     * 
     */
    public Optional<Output<Integer>> cooldown() {
        return Optional.ofNullable(this.cooldown);
    }

    /**
     * A list of dimensions describing qualities of the metric.
     * 
     */
    @Import(name="dimensions")
    private @Nullable Output<List<ElastigroupScalingTargetPolicyDimensionArgs>> dimensions;

    /**
     * @return A list of dimensions describing qualities of the metric.
     * 
     */
    public Optional<Output<List<ElastigroupScalingTargetPolicyDimensionArgs>>> dimensions() {
        return Optional.ofNullable(this.dimensions);
    }

    /**
     * The number of periods over which data is compared to the specified threshold.
     * 
     */
    @Import(name="evaluationPeriods")
    private @Nullable Output<Integer> evaluationPeriods;

    /**
     * @return The number of periods over which data is compared to the specified threshold.
     * 
     */
    public Optional<Output<Integer>> evaluationPeriods() {
        return Optional.ofNullable(this.evaluationPeriods);
    }

    /**
     * String, restrict the maximal number of instances which can be added in each scale-up action.
     * 
     * `scaling_target_policies` support predictive scaling:
     * 
     */
    @Import(name="maxCapacityPerScale")
    private @Nullable Output<String> maxCapacityPerScale;

    /**
     * @return String, restrict the maximal number of instances which can be added in each scale-up action.
     * 
     * `scaling_target_policies` support predictive scaling:
     * 
     */
    public Optional<Output<String>> maxCapacityPerScale() {
        return Optional.ofNullable(this.maxCapacityPerScale);
    }

    /**
     * String, the name of the metric, with or without spaces.
     * 
     */
    @Import(name="metricName", required=true)
    private Output<String> metricName;

    /**
     * @return String, the name of the metric, with or without spaces.
     * 
     */
    public Output<String> metricName() {
        return this.metricName;
    }

    /**
     * String, the namespace for the alarm&#39;s associated metric.
     * 
     */
    @Import(name="namespace", required=true)
    private Output<String> namespace;

    /**
     * @return String, the namespace for the alarm&#39;s associated metric.
     * 
     */
    public Output<String> namespace() {
        return this.namespace;
    }

    /**
     * The granularity, in seconds, of the returned datapoints. Period must be at least 60 seconds and must be a multiple of 60.
     * 
     */
    @Import(name="period")
    private @Nullable Output<Integer> period;

    /**
     * @return The granularity, in seconds, of the returned datapoints. Period must be at least 60 seconds and must be a multiple of 60.
     * 
     */
    public Optional<Output<Integer>> period() {
        return Optional.ofNullable(this.period);
    }

    /**
     * String, the name of the policy.
     * 
     */
    @Import(name="policyName", required=true)
    private Output<String> policyName;

    /**
     * @return String, the name of the policy.
     * 
     */
    public Output<String> policyName() {
        return this.policyName;
    }

    /**
     * Start a metric prediction process to determine the expected target metric value within the next two days. See [Predictive Autoscaling](https://api.spotinst.com/elastigroup-for-aws/concepts/scaling-concepts/predictive-autoscaling/) documentation for more info. Valid values: `FORECAST_AND_SCALE`, `FORECAST_ONLY`.
     * 
     * Usage:
     * 
     */
    @Import(name="predictiveMode")
    private @Nullable Output<String> predictiveMode;

    /**
     * @return Start a metric prediction process to determine the expected target metric value within the next two days. See [Predictive Autoscaling](https://api.spotinst.com/elastigroup-for-aws/concepts/scaling-concepts/predictive-autoscaling/) documentation for more info. Valid values: `FORECAST_AND_SCALE`, `FORECAST_ONLY`.
     * 
     * Usage:
     * 
     */
    public Optional<Output<String>> predictiveMode() {
        return Optional.ofNullable(this.predictiveMode);
    }

    /**
     * String, the source of the metric. Valid values: `&#34;cloudWatch&#34;`, `&#34;spectrum&#34;`.
     * 
     */
    @Import(name="source")
    private @Nullable Output<String> source;

    /**
     * @return String, the source of the metric. Valid values: `&#34;cloudWatch&#34;`, `&#34;spectrum&#34;`.
     * 
     */
    public Optional<Output<String>> source() {
        return Optional.ofNullable(this.source);
    }

    /**
     * String, the metric statistics to return. For information about specific statistics go to [Statistics](http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/index.html?CHAP_TerminologyandKeyConcepts.html#Statistic) in the Amazon CloudWatch Developer Guide.
     * 
     */
    @Import(name="statistic")
    private @Nullable Output<String> statistic;

    /**
     * @return String, the metric statistics to return. For information about specific statistics go to [Statistics](http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/index.html?CHAP_TerminologyandKeyConcepts.html#Statistic) in the Amazon CloudWatch Developer Guide.
     * 
     */
    public Optional<Output<String>> statistic() {
        return Optional.ofNullable(this.statistic);
    }

    /**
     * The target number of instances to have in the group.
     * 
     */
    @Import(name="target", required=true)
    private Output<Double> target;

    /**
     * @return The target number of instances to have in the group.
     * 
     */
    public Output<Double> target() {
        return this.target;
    }

    /**
     * String, tThe unit for the alarm&#39;s associated metric. Valid values: `&#34;percent`, `&#34;seconds&#34;`, `&#34;microseconds&#34;`, `&#34;milliseconds&#34;`, `&#34;bytes&#34;`, `&#34;kilobytes&#34;`, `&#34;megabytes&#34;`, `&#34;gigabytes&#34;`, `&#34;terabytes&#34;`, `&#34;bits&#34;`, `&#34;kilobits&#34;`, `&#34;megabits&#34;`, `&#34;gigabits&#34;`, `&#34;terabits&#34;`, `&#34;count&#34;`, `&#34;bytes/second&#34;`, `&#34;kilobytes/second&#34;`, `&#34;megabytes/second&#34;`, `&#34;gigabytes/second&#34;`, `&#34;terabytes/second&#34;`, `&#34;bits/second&#34;`, `&#34;kilobits/second&#34;`, `&#34;megabits/second&#34;`, `&#34;gigabits/second&#34;`, `&#34;terabits/second&#34;`, `&#34;count/second&#34;`, `&#34;none&#34;`.
     * 
     */
    @Import(name="unit")
    private @Nullable Output<String> unit;

    /**
     * @return String, tThe unit for the alarm&#39;s associated metric. Valid values: `&#34;percent`, `&#34;seconds&#34;`, `&#34;microseconds&#34;`, `&#34;milliseconds&#34;`, `&#34;bytes&#34;`, `&#34;kilobytes&#34;`, `&#34;megabytes&#34;`, `&#34;gigabytes&#34;`, `&#34;terabytes&#34;`, `&#34;bits&#34;`, `&#34;kilobits&#34;`, `&#34;megabits&#34;`, `&#34;gigabits&#34;`, `&#34;terabits&#34;`, `&#34;count&#34;`, `&#34;bytes/second&#34;`, `&#34;kilobytes/second&#34;`, `&#34;megabytes/second&#34;`, `&#34;gigabytes/second&#34;`, `&#34;terabytes/second&#34;`, `&#34;bits/second&#34;`, `&#34;kilobits/second&#34;`, `&#34;megabits/second&#34;`, `&#34;gigabits/second&#34;`, `&#34;terabits/second&#34;`, `&#34;count/second&#34;`, `&#34;none&#34;`.
     * 
     */
    public Optional<Output<String>> unit() {
        return Optional.ofNullable(this.unit);
    }

    private ElastigroupScalingTargetPolicyArgs() {}

    private ElastigroupScalingTargetPolicyArgs(ElastigroupScalingTargetPolicyArgs $) {
        this.cooldown = $.cooldown;
        this.dimensions = $.dimensions;
        this.evaluationPeriods = $.evaluationPeriods;
        this.maxCapacityPerScale = $.maxCapacityPerScale;
        this.metricName = $.metricName;
        this.namespace = $.namespace;
        this.period = $.period;
        this.policyName = $.policyName;
        this.predictiveMode = $.predictiveMode;
        this.source = $.source;
        this.statistic = $.statistic;
        this.target = $.target;
        this.unit = $.unit;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ElastigroupScalingTargetPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ElastigroupScalingTargetPolicyArgs $;

        public Builder() {
            $ = new ElastigroupScalingTargetPolicyArgs();
        }

        public Builder(ElastigroupScalingTargetPolicyArgs defaults) {
            $ = new ElastigroupScalingTargetPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cooldown Integer the amount of time, in seconds, after a scaling activity completes and before the next scaling activity can start. If this parameter is not specified, the default cooldown period for the group applies.
         * 
         * @return builder
         * 
         */
        public Builder cooldown(@Nullable Output<Integer> cooldown) {
            $.cooldown = cooldown;
            return this;
        }

        /**
         * @param cooldown Integer the amount of time, in seconds, after a scaling activity completes and before the next scaling activity can start. If this parameter is not specified, the default cooldown period for the group applies.
         * 
         * @return builder
         * 
         */
        public Builder cooldown(Integer cooldown) {
            return cooldown(Output.of(cooldown));
        }

        /**
         * @param dimensions A list of dimensions describing qualities of the metric.
         * 
         * @return builder
         * 
         */
        public Builder dimensions(@Nullable Output<List<ElastigroupScalingTargetPolicyDimensionArgs>> dimensions) {
            $.dimensions = dimensions;
            return this;
        }

        /**
         * @param dimensions A list of dimensions describing qualities of the metric.
         * 
         * @return builder
         * 
         */
        public Builder dimensions(List<ElastigroupScalingTargetPolicyDimensionArgs> dimensions) {
            return dimensions(Output.of(dimensions));
        }

        /**
         * @param dimensions A list of dimensions describing qualities of the metric.
         * 
         * @return builder
         * 
         */
        public Builder dimensions(ElastigroupScalingTargetPolicyDimensionArgs... dimensions) {
            return dimensions(List.of(dimensions));
        }

        /**
         * @param evaluationPeriods The number of periods over which data is compared to the specified threshold.
         * 
         * @return builder
         * 
         */
        public Builder evaluationPeriods(@Nullable Output<Integer> evaluationPeriods) {
            $.evaluationPeriods = evaluationPeriods;
            return this;
        }

        /**
         * @param evaluationPeriods The number of periods over which data is compared to the specified threshold.
         * 
         * @return builder
         * 
         */
        public Builder evaluationPeriods(Integer evaluationPeriods) {
            return evaluationPeriods(Output.of(evaluationPeriods));
        }

        /**
         * @param maxCapacityPerScale String, restrict the maximal number of instances which can be added in each scale-up action.
         * 
         * `scaling_target_policies` support predictive scaling:
         * 
         * @return builder
         * 
         */
        public Builder maxCapacityPerScale(@Nullable Output<String> maxCapacityPerScale) {
            $.maxCapacityPerScale = maxCapacityPerScale;
            return this;
        }

        /**
         * @param maxCapacityPerScale String, restrict the maximal number of instances which can be added in each scale-up action.
         * 
         * `scaling_target_policies` support predictive scaling:
         * 
         * @return builder
         * 
         */
        public Builder maxCapacityPerScale(String maxCapacityPerScale) {
            return maxCapacityPerScale(Output.of(maxCapacityPerScale));
        }

        /**
         * @param metricName String, the name of the metric, with or without spaces.
         * 
         * @return builder
         * 
         */
        public Builder metricName(Output<String> metricName) {
            $.metricName = metricName;
            return this;
        }

        /**
         * @param metricName String, the name of the metric, with or without spaces.
         * 
         * @return builder
         * 
         */
        public Builder metricName(String metricName) {
            return metricName(Output.of(metricName));
        }

        /**
         * @param namespace String, the namespace for the alarm&#39;s associated metric.
         * 
         * @return builder
         * 
         */
        public Builder namespace(Output<String> namespace) {
            $.namespace = namespace;
            return this;
        }

        /**
         * @param namespace String, the namespace for the alarm&#39;s associated metric.
         * 
         * @return builder
         * 
         */
        public Builder namespace(String namespace) {
            return namespace(Output.of(namespace));
        }

        /**
         * @param period The granularity, in seconds, of the returned datapoints. Period must be at least 60 seconds and must be a multiple of 60.
         * 
         * @return builder
         * 
         */
        public Builder period(@Nullable Output<Integer> period) {
            $.period = period;
            return this;
        }

        /**
         * @param period The granularity, in seconds, of the returned datapoints. Period must be at least 60 seconds and must be a multiple of 60.
         * 
         * @return builder
         * 
         */
        public Builder period(Integer period) {
            return period(Output.of(period));
        }

        /**
         * @param policyName String, the name of the policy.
         * 
         * @return builder
         * 
         */
        public Builder policyName(Output<String> policyName) {
            $.policyName = policyName;
            return this;
        }

        /**
         * @param policyName String, the name of the policy.
         * 
         * @return builder
         * 
         */
        public Builder policyName(String policyName) {
            return policyName(Output.of(policyName));
        }

        /**
         * @param predictiveMode Start a metric prediction process to determine the expected target metric value within the next two days. See [Predictive Autoscaling](https://api.spotinst.com/elastigroup-for-aws/concepts/scaling-concepts/predictive-autoscaling/) documentation for more info. Valid values: `FORECAST_AND_SCALE`, `FORECAST_ONLY`.
         * 
         * Usage:
         * 
         * @return builder
         * 
         */
        public Builder predictiveMode(@Nullable Output<String> predictiveMode) {
            $.predictiveMode = predictiveMode;
            return this;
        }

        /**
         * @param predictiveMode Start a metric prediction process to determine the expected target metric value within the next two days. See [Predictive Autoscaling](https://api.spotinst.com/elastigroup-for-aws/concepts/scaling-concepts/predictive-autoscaling/) documentation for more info. Valid values: `FORECAST_AND_SCALE`, `FORECAST_ONLY`.
         * 
         * Usage:
         * 
         * @return builder
         * 
         */
        public Builder predictiveMode(String predictiveMode) {
            return predictiveMode(Output.of(predictiveMode));
        }

        /**
         * @param source String, the source of the metric. Valid values: `&#34;cloudWatch&#34;`, `&#34;spectrum&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder source(@Nullable Output<String> source) {
            $.source = source;
            return this;
        }

        /**
         * @param source String, the source of the metric. Valid values: `&#34;cloudWatch&#34;`, `&#34;spectrum&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder source(String source) {
            return source(Output.of(source));
        }

        /**
         * @param statistic String, the metric statistics to return. For information about specific statistics go to [Statistics](http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/index.html?CHAP_TerminologyandKeyConcepts.html#Statistic) in the Amazon CloudWatch Developer Guide.
         * 
         * @return builder
         * 
         */
        public Builder statistic(@Nullable Output<String> statistic) {
            $.statistic = statistic;
            return this;
        }

        /**
         * @param statistic String, the metric statistics to return. For information about specific statistics go to [Statistics](http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/index.html?CHAP_TerminologyandKeyConcepts.html#Statistic) in the Amazon CloudWatch Developer Guide.
         * 
         * @return builder
         * 
         */
        public Builder statistic(String statistic) {
            return statistic(Output.of(statistic));
        }

        /**
         * @param target The target number of instances to have in the group.
         * 
         * @return builder
         * 
         */
        public Builder target(Output<Double> target) {
            $.target = target;
            return this;
        }

        /**
         * @param target The target number of instances to have in the group.
         * 
         * @return builder
         * 
         */
        public Builder target(Double target) {
            return target(Output.of(target));
        }

        /**
         * @param unit String, tThe unit for the alarm&#39;s associated metric. Valid values: `&#34;percent`, `&#34;seconds&#34;`, `&#34;microseconds&#34;`, `&#34;milliseconds&#34;`, `&#34;bytes&#34;`, `&#34;kilobytes&#34;`, `&#34;megabytes&#34;`, `&#34;gigabytes&#34;`, `&#34;terabytes&#34;`, `&#34;bits&#34;`, `&#34;kilobits&#34;`, `&#34;megabits&#34;`, `&#34;gigabits&#34;`, `&#34;terabits&#34;`, `&#34;count&#34;`, `&#34;bytes/second&#34;`, `&#34;kilobytes/second&#34;`, `&#34;megabytes/second&#34;`, `&#34;gigabytes/second&#34;`, `&#34;terabytes/second&#34;`, `&#34;bits/second&#34;`, `&#34;kilobits/second&#34;`, `&#34;megabits/second&#34;`, `&#34;gigabits/second&#34;`, `&#34;terabits/second&#34;`, `&#34;count/second&#34;`, `&#34;none&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder unit(@Nullable Output<String> unit) {
            $.unit = unit;
            return this;
        }

        /**
         * @param unit String, tThe unit for the alarm&#39;s associated metric. Valid values: `&#34;percent`, `&#34;seconds&#34;`, `&#34;microseconds&#34;`, `&#34;milliseconds&#34;`, `&#34;bytes&#34;`, `&#34;kilobytes&#34;`, `&#34;megabytes&#34;`, `&#34;gigabytes&#34;`, `&#34;terabytes&#34;`, `&#34;bits&#34;`, `&#34;kilobits&#34;`, `&#34;megabits&#34;`, `&#34;gigabits&#34;`, `&#34;terabits&#34;`, `&#34;count&#34;`, `&#34;bytes/second&#34;`, `&#34;kilobytes/second&#34;`, `&#34;megabytes/second&#34;`, `&#34;gigabytes/second&#34;`, `&#34;terabytes/second&#34;`, `&#34;bits/second&#34;`, `&#34;kilobits/second&#34;`, `&#34;megabits/second&#34;`, `&#34;gigabits/second&#34;`, `&#34;terabits/second&#34;`, `&#34;count/second&#34;`, `&#34;none&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder unit(String unit) {
            return unit(Output.of(unit));
        }

        public ElastigroupScalingTargetPolicyArgs build() {
            if ($.metricName == null) {
                throw new MissingRequiredPropertyException("ElastigroupScalingTargetPolicyArgs", "metricName");
            }
            if ($.namespace == null) {
                throw new MissingRequiredPropertyException("ElastigroupScalingTargetPolicyArgs", "namespace");
            }
            if ($.policyName == null) {
                throw new MissingRequiredPropertyException("ElastigroupScalingTargetPolicyArgs", "policyName");
            }
            if ($.target == null) {
                throw new MissingRequiredPropertyException("ElastigroupScalingTargetPolicyArgs", "target");
            }
            return $;
        }
    }

}
