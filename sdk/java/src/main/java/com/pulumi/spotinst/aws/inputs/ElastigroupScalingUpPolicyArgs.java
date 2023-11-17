// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.spotinst.aws.inputs.ElastigroupScalingUpPolicyDimensionArgs;
import com.pulumi.spotinst.aws.inputs.ElastigroupScalingUpPolicyStepAdjustmentArgs;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ElastigroupScalingUpPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ElastigroupScalingUpPolicyArgs Empty = new ElastigroupScalingUpPolicyArgs();

    /**
     * The type of action to perform for scaling. Valid values: `&#34;adjustment&#34;`, `&#34;percentageAdjustment&#34;`, `&#34;setMaxTarget&#34;`, `&#34;setMinTarget&#34;`, `&#34;updateCapacity&#34;`. If a `step_adjustment` object is defined, then it cannot be specified.
     * 
     */
    @Import(name="actionType")
    private @Nullable Output<String> actionType;

    /**
     * @return The type of action to perform for scaling. Valid values: `&#34;adjustment&#34;`, `&#34;percentageAdjustment&#34;`, `&#34;setMaxTarget&#34;`, `&#34;setMinTarget&#34;`, `&#34;updateCapacity&#34;`. If a `step_adjustment` object is defined, then it cannot be specified.
     * 
     */
    public Optional<Output<String>> actionType() {
        return Optional.ofNullable(this.actionType);
    }

    /**
     * The number of instances to add/remove to/from the target capacity when scale is needed. Can be used as advanced expression for scaling of instances to add/remove to/from the target capacity when scale is needed. You can see more information here: Advanced expression. Example value: `&#34;MAX(currCapacity / 5, value * 10)&#34;`
     * 
     */
    @Import(name="adjustment")
    private @Nullable Output<String> adjustment;

    /**
     * @return The number of instances to add/remove to/from the target capacity when scale is needed. Can be used as advanced expression for scaling of instances to add/remove to/from the target capacity when scale is needed. You can see more information here: Advanced expression. Example value: `&#34;MAX(currCapacity / 5, value * 10)&#34;`
     * 
     */
    public Optional<Output<String>> adjustment() {
        return Optional.ofNullable(this.adjustment);
    }

    /**
     * The amount of time, in seconds, after a scaling activity completes and before the next scaling activity can start. If this parameter is not specified, the default cooldown period for the group applies.
     * 
     */
    @Import(name="cooldown")
    private @Nullable Output<Integer> cooldown;

    /**
     * @return The amount of time, in seconds, after a scaling activity completes and before the next scaling activity can start. If this parameter is not specified, the default cooldown period for the group applies.
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
    private @Nullable Output<List<ElastigroupScalingUpPolicyDimensionArgs>> dimensions;

    /**
     * @return A list of dimensions describing qualities of the metric.
     * 
     */
    public Optional<Output<List<ElastigroupScalingUpPolicyDimensionArgs>>> dimensions() {
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
     * Specifies whether the scaling policy described in this block is enabled.
     * 
     */
    @Import(name="isEnabled")
    private @Nullable Output<Boolean> isEnabled;

    /**
     * @return Specifies whether the scaling policy described in this block is enabled.
     * 
     */
    public Optional<Output<Boolean>> isEnabled() {
        return Optional.ofNullable(this.isEnabled);
    }

    /**
     * . The number of the desired target (and maximum) capacity
     * 
     */
    @Import(name="maxTargetCapacity")
    private @Nullable Output<String> maxTargetCapacity;

    /**
     * @return . The number of the desired target (and maximum) capacity
     * 
     */
    public Optional<Output<String>> maxTargetCapacity() {
        return Optional.ofNullable(this.maxTargetCapacity);
    }

    /**
     * The maximal number of instances to have in the group.
     * 
     */
    @Import(name="maximum")
    private @Nullable Output<String> maximum;

    /**
     * @return The maximal number of instances to have in the group.
     * 
     */
    public Optional<Output<String>> maximum() {
        return Optional.ofNullable(this.maximum);
    }

    /**
     * The name of the metric, with or without spaces.
     * 
     */
    @Import(name="metricName", required=true)
    private Output<String> metricName;

    /**
     * @return The name of the metric, with or without spaces.
     * 
     */
    public Output<String> metricName() {
        return this.metricName;
    }

    /**
     * . The number of the desired target (and minimum) capacity
     * 
     */
    @Import(name="minTargetCapacity")
    private @Nullable Output<String> minTargetCapacity;

    /**
     * @return . The number of the desired target (and minimum) capacity
     * 
     */
    public Optional<Output<String>> minTargetCapacity() {
        return Optional.ofNullable(this.minTargetCapacity);
    }

    /**
     * The minimal number of instances to have in the group.
     * 
     */
    @Import(name="minimum")
    private @Nullable Output<String> minimum;

    /**
     * @return The minimal number of instances to have in the group.
     * 
     */
    public Optional<Output<String>> minimum() {
        return Optional.ofNullable(this.minimum);
    }

    /**
     * The namespace for the alarm&#39;s associated metric.
     * 
     */
    @Import(name="namespace", required=true)
    private Output<String> namespace;

    /**
     * @return The namespace for the alarm&#39;s associated metric.
     * 
     */
    public Output<String> namespace() {
        return this.namespace;
    }

    /**
     * The operator to use in order to determine if the scaling policy is applicable. Valid values: `&#34;gt&#34;`, `&#34;gte&#34;`, `&#34;lt&#34;`, `&#34;lte&#34;`.
     * 
     */
    @Import(name="operator")
    private @Nullable Output<String> operator;

    /**
     * @return The operator to use in order to determine if the scaling policy is applicable. Valid values: `&#34;gt&#34;`, `&#34;gte&#34;`, `&#34;lt&#34;`, `&#34;lte&#34;`.
     * 
     */
    public Optional<Output<String>> operator() {
        return Optional.ofNullable(this.operator);
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
     * The name of the policy.
     * 
     */
    @Import(name="policyName", required=true)
    private Output<String> policyName;

    /**
     * @return The name of the policy.
     * 
     */
    public Output<String> policyName() {
        return this.policyName;
    }

    /**
     * The source of the metric. Valid values: `&#34;cloudWatch&#34;`, `&#34;spectrum&#34;`.
     * 
     */
    @Import(name="source")
    private @Nullable Output<String> source;

    /**
     * @return The source of the metric. Valid values: `&#34;cloudWatch&#34;`, `&#34;spectrum&#34;`.
     * 
     */
    public Optional<Output<String>> source() {
        return Optional.ofNullable(this.source);
    }

    /**
     * The metric statistics to return. For information about specific statistics go to [Statistics](http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/index.html?CHAP_TerminologyandKeyConcepts.html#Statistic) in the Amazon CloudWatch Developer Guide.
     * 
     */
    @Import(name="statistic")
    private @Nullable Output<String> statistic;

    /**
     * @return The metric statistics to return. For information about specific statistics go to [Statistics](http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/index.html?CHAP_TerminologyandKeyConcepts.html#Statistic) in the Amazon CloudWatch Developer Guide.
     * 
     */
    public Optional<Output<String>> statistic() {
        return Optional.ofNullable(this.statistic);
    }

    @Import(name="stepAdjustments")
    private @Nullable Output<List<ElastigroupScalingUpPolicyStepAdjustmentArgs>> stepAdjustments;

    public Optional<Output<List<ElastigroupScalingUpPolicyStepAdjustmentArgs>>> stepAdjustments() {
        return Optional.ofNullable(this.stepAdjustments);
    }

    /**
     * The target number of instances to have in the group.
     * 
     */
    @Import(name="target")
    private @Nullable Output<String> target;

    /**
     * @return The target number of instances to have in the group.
     * 
     */
    public Optional<Output<String>> target() {
        return Optional.ofNullable(this.target);
    }

    /**
     * The value against which the specified statistic is compared. If a `step_adjustment` object is defined, then it cannot be specified.
     * 
     */
    @Import(name="threshold")
    private @Nullable Output<Double> threshold;

    /**
     * @return The value against which the specified statistic is compared. If a `step_adjustment` object is defined, then it cannot be specified.
     * 
     */
    public Optional<Output<Double>> threshold() {
        return Optional.ofNullable(this.threshold);
    }

    /**
     * The unit for the alarm&#39;s associated metric. Valid values: `&#34;percent`, `&#34;seconds&#34;`, `&#34;microseconds&#34;`, `&#34;milliseconds&#34;`, `&#34;bytes&#34;`, `&#34;kilobytes&#34;`, `&#34;megabytes&#34;`, `&#34;gigabytes&#34;`, `&#34;terabytes&#34;`, `&#34;bits&#34;`, `&#34;kilobits&#34;`, `&#34;megabits&#34;`, `&#34;gigabits&#34;`, `&#34;terabits&#34;`, `&#34;count&#34;`, `&#34;bytes/second&#34;`, `&#34;kilobytes/second&#34;`, `&#34;megabytes/second&#34;`, `&#34;gigabytes/second&#34;`, `&#34;terabytes/second&#34;`, `&#34;bits/second&#34;`, `&#34;kilobits/second&#34;`, `&#34;megabits/second&#34;`, `&#34;gigabits/second&#34;`, `&#34;terabits/second&#34;`, `&#34;count/second&#34;`, `&#34;none&#34;`.
     * 
     */
    @Import(name="unit")
    private @Nullable Output<String> unit;

    /**
     * @return The unit for the alarm&#39;s associated metric. Valid values: `&#34;percent`, `&#34;seconds&#34;`, `&#34;microseconds&#34;`, `&#34;milliseconds&#34;`, `&#34;bytes&#34;`, `&#34;kilobytes&#34;`, `&#34;megabytes&#34;`, `&#34;gigabytes&#34;`, `&#34;terabytes&#34;`, `&#34;bits&#34;`, `&#34;kilobits&#34;`, `&#34;megabits&#34;`, `&#34;gigabits&#34;`, `&#34;terabits&#34;`, `&#34;count&#34;`, `&#34;bytes/second&#34;`, `&#34;kilobytes/second&#34;`, `&#34;megabytes/second&#34;`, `&#34;gigabytes/second&#34;`, `&#34;terabytes/second&#34;`, `&#34;bits/second&#34;`, `&#34;kilobits/second&#34;`, `&#34;megabits/second&#34;`, `&#34;gigabits/second&#34;`, `&#34;terabits/second&#34;`, `&#34;count/second&#34;`, `&#34;none&#34;`.
     * 
     */
    public Optional<Output<String>> unit() {
        return Optional.ofNullable(this.unit);
    }

    private ElastigroupScalingUpPolicyArgs() {}

    private ElastigroupScalingUpPolicyArgs(ElastigroupScalingUpPolicyArgs $) {
        this.actionType = $.actionType;
        this.adjustment = $.adjustment;
        this.cooldown = $.cooldown;
        this.dimensions = $.dimensions;
        this.evaluationPeriods = $.evaluationPeriods;
        this.isEnabled = $.isEnabled;
        this.maxTargetCapacity = $.maxTargetCapacity;
        this.maximum = $.maximum;
        this.metricName = $.metricName;
        this.minTargetCapacity = $.minTargetCapacity;
        this.minimum = $.minimum;
        this.namespace = $.namespace;
        this.operator = $.operator;
        this.period = $.period;
        this.policyName = $.policyName;
        this.source = $.source;
        this.statistic = $.statistic;
        this.stepAdjustments = $.stepAdjustments;
        this.target = $.target;
        this.threshold = $.threshold;
        this.unit = $.unit;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ElastigroupScalingUpPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ElastigroupScalingUpPolicyArgs $;

        public Builder() {
            $ = new ElastigroupScalingUpPolicyArgs();
        }

        public Builder(ElastigroupScalingUpPolicyArgs defaults) {
            $ = new ElastigroupScalingUpPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param actionType The type of action to perform for scaling. Valid values: `&#34;adjustment&#34;`, `&#34;percentageAdjustment&#34;`, `&#34;setMaxTarget&#34;`, `&#34;setMinTarget&#34;`, `&#34;updateCapacity&#34;`. If a `step_adjustment` object is defined, then it cannot be specified.
         * 
         * @return builder
         * 
         */
        public Builder actionType(@Nullable Output<String> actionType) {
            $.actionType = actionType;
            return this;
        }

        /**
         * @param actionType The type of action to perform for scaling. Valid values: `&#34;adjustment&#34;`, `&#34;percentageAdjustment&#34;`, `&#34;setMaxTarget&#34;`, `&#34;setMinTarget&#34;`, `&#34;updateCapacity&#34;`. If a `step_adjustment` object is defined, then it cannot be specified.
         * 
         * @return builder
         * 
         */
        public Builder actionType(String actionType) {
            return actionType(Output.of(actionType));
        }

        /**
         * @param adjustment The number of instances to add/remove to/from the target capacity when scale is needed. Can be used as advanced expression for scaling of instances to add/remove to/from the target capacity when scale is needed. You can see more information here: Advanced expression. Example value: `&#34;MAX(currCapacity / 5, value * 10)&#34;`
         * 
         * @return builder
         * 
         */
        public Builder adjustment(@Nullable Output<String> adjustment) {
            $.adjustment = adjustment;
            return this;
        }

        /**
         * @param adjustment The number of instances to add/remove to/from the target capacity when scale is needed. Can be used as advanced expression for scaling of instances to add/remove to/from the target capacity when scale is needed. You can see more information here: Advanced expression. Example value: `&#34;MAX(currCapacity / 5, value * 10)&#34;`
         * 
         * @return builder
         * 
         */
        public Builder adjustment(String adjustment) {
            return adjustment(Output.of(adjustment));
        }

        /**
         * @param cooldown The amount of time, in seconds, after a scaling activity completes and before the next scaling activity can start. If this parameter is not specified, the default cooldown period for the group applies.
         * 
         * @return builder
         * 
         */
        public Builder cooldown(@Nullable Output<Integer> cooldown) {
            $.cooldown = cooldown;
            return this;
        }

        /**
         * @param cooldown The amount of time, in seconds, after a scaling activity completes and before the next scaling activity can start. If this parameter is not specified, the default cooldown period for the group applies.
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
        public Builder dimensions(@Nullable Output<List<ElastigroupScalingUpPolicyDimensionArgs>> dimensions) {
            $.dimensions = dimensions;
            return this;
        }

        /**
         * @param dimensions A list of dimensions describing qualities of the metric.
         * 
         * @return builder
         * 
         */
        public Builder dimensions(List<ElastigroupScalingUpPolicyDimensionArgs> dimensions) {
            return dimensions(Output.of(dimensions));
        }

        /**
         * @param dimensions A list of dimensions describing qualities of the metric.
         * 
         * @return builder
         * 
         */
        public Builder dimensions(ElastigroupScalingUpPolicyDimensionArgs... dimensions) {
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
         * @param isEnabled Specifies whether the scaling policy described in this block is enabled.
         * 
         * @return builder
         * 
         */
        public Builder isEnabled(@Nullable Output<Boolean> isEnabled) {
            $.isEnabled = isEnabled;
            return this;
        }

        /**
         * @param isEnabled Specifies whether the scaling policy described in this block is enabled.
         * 
         * @return builder
         * 
         */
        public Builder isEnabled(Boolean isEnabled) {
            return isEnabled(Output.of(isEnabled));
        }

        /**
         * @param maxTargetCapacity . The number of the desired target (and maximum) capacity
         * 
         * @return builder
         * 
         */
        public Builder maxTargetCapacity(@Nullable Output<String> maxTargetCapacity) {
            $.maxTargetCapacity = maxTargetCapacity;
            return this;
        }

        /**
         * @param maxTargetCapacity . The number of the desired target (and maximum) capacity
         * 
         * @return builder
         * 
         */
        public Builder maxTargetCapacity(String maxTargetCapacity) {
            return maxTargetCapacity(Output.of(maxTargetCapacity));
        }

        /**
         * @param maximum The maximal number of instances to have in the group.
         * 
         * @return builder
         * 
         */
        public Builder maximum(@Nullable Output<String> maximum) {
            $.maximum = maximum;
            return this;
        }

        /**
         * @param maximum The maximal number of instances to have in the group.
         * 
         * @return builder
         * 
         */
        public Builder maximum(String maximum) {
            return maximum(Output.of(maximum));
        }

        /**
         * @param metricName The name of the metric, with or without spaces.
         * 
         * @return builder
         * 
         */
        public Builder metricName(Output<String> metricName) {
            $.metricName = metricName;
            return this;
        }

        /**
         * @param metricName The name of the metric, with or without spaces.
         * 
         * @return builder
         * 
         */
        public Builder metricName(String metricName) {
            return metricName(Output.of(metricName));
        }

        /**
         * @param minTargetCapacity . The number of the desired target (and minimum) capacity
         * 
         * @return builder
         * 
         */
        public Builder minTargetCapacity(@Nullable Output<String> minTargetCapacity) {
            $.minTargetCapacity = minTargetCapacity;
            return this;
        }

        /**
         * @param minTargetCapacity . The number of the desired target (and minimum) capacity
         * 
         * @return builder
         * 
         */
        public Builder minTargetCapacity(String minTargetCapacity) {
            return minTargetCapacity(Output.of(minTargetCapacity));
        }

        /**
         * @param minimum The minimal number of instances to have in the group.
         * 
         * @return builder
         * 
         */
        public Builder minimum(@Nullable Output<String> minimum) {
            $.minimum = minimum;
            return this;
        }

        /**
         * @param minimum The minimal number of instances to have in the group.
         * 
         * @return builder
         * 
         */
        public Builder minimum(String minimum) {
            return minimum(Output.of(minimum));
        }

        /**
         * @param namespace The namespace for the alarm&#39;s associated metric.
         * 
         * @return builder
         * 
         */
        public Builder namespace(Output<String> namespace) {
            $.namespace = namespace;
            return this;
        }

        /**
         * @param namespace The namespace for the alarm&#39;s associated metric.
         * 
         * @return builder
         * 
         */
        public Builder namespace(String namespace) {
            return namespace(Output.of(namespace));
        }

        /**
         * @param operator The operator to use in order to determine if the scaling policy is applicable. Valid values: `&#34;gt&#34;`, `&#34;gte&#34;`, `&#34;lt&#34;`, `&#34;lte&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder operator(@Nullable Output<String> operator) {
            $.operator = operator;
            return this;
        }

        /**
         * @param operator The operator to use in order to determine if the scaling policy is applicable. Valid values: `&#34;gt&#34;`, `&#34;gte&#34;`, `&#34;lt&#34;`, `&#34;lte&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder operator(String operator) {
            return operator(Output.of(operator));
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
         * @param policyName The name of the policy.
         * 
         * @return builder
         * 
         */
        public Builder policyName(Output<String> policyName) {
            $.policyName = policyName;
            return this;
        }

        /**
         * @param policyName The name of the policy.
         * 
         * @return builder
         * 
         */
        public Builder policyName(String policyName) {
            return policyName(Output.of(policyName));
        }

        /**
         * @param source The source of the metric. Valid values: `&#34;cloudWatch&#34;`, `&#34;spectrum&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder source(@Nullable Output<String> source) {
            $.source = source;
            return this;
        }

        /**
         * @param source The source of the metric. Valid values: `&#34;cloudWatch&#34;`, `&#34;spectrum&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder source(String source) {
            return source(Output.of(source));
        }

        /**
         * @param statistic The metric statistics to return. For information about specific statistics go to [Statistics](http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/index.html?CHAP_TerminologyandKeyConcepts.html#Statistic) in the Amazon CloudWatch Developer Guide.
         * 
         * @return builder
         * 
         */
        public Builder statistic(@Nullable Output<String> statistic) {
            $.statistic = statistic;
            return this;
        }

        /**
         * @param statistic The metric statistics to return. For information about specific statistics go to [Statistics](http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/index.html?CHAP_TerminologyandKeyConcepts.html#Statistic) in the Amazon CloudWatch Developer Guide.
         * 
         * @return builder
         * 
         */
        public Builder statistic(String statistic) {
            return statistic(Output.of(statistic));
        }

        public Builder stepAdjustments(@Nullable Output<List<ElastigroupScalingUpPolicyStepAdjustmentArgs>> stepAdjustments) {
            $.stepAdjustments = stepAdjustments;
            return this;
        }

        public Builder stepAdjustments(List<ElastigroupScalingUpPolicyStepAdjustmentArgs> stepAdjustments) {
            return stepAdjustments(Output.of(stepAdjustments));
        }

        public Builder stepAdjustments(ElastigroupScalingUpPolicyStepAdjustmentArgs... stepAdjustments) {
            return stepAdjustments(List.of(stepAdjustments));
        }

        /**
         * @param target The target number of instances to have in the group.
         * 
         * @return builder
         * 
         */
        public Builder target(@Nullable Output<String> target) {
            $.target = target;
            return this;
        }

        /**
         * @param target The target number of instances to have in the group.
         * 
         * @return builder
         * 
         */
        public Builder target(String target) {
            return target(Output.of(target));
        }

        /**
         * @param threshold The value against which the specified statistic is compared. If a `step_adjustment` object is defined, then it cannot be specified.
         * 
         * @return builder
         * 
         */
        public Builder threshold(@Nullable Output<Double> threshold) {
            $.threshold = threshold;
            return this;
        }

        /**
         * @param threshold The value against which the specified statistic is compared. If a `step_adjustment` object is defined, then it cannot be specified.
         * 
         * @return builder
         * 
         */
        public Builder threshold(Double threshold) {
            return threshold(Output.of(threshold));
        }

        /**
         * @param unit The unit for the alarm&#39;s associated metric. Valid values: `&#34;percent`, `&#34;seconds&#34;`, `&#34;microseconds&#34;`, `&#34;milliseconds&#34;`, `&#34;bytes&#34;`, `&#34;kilobytes&#34;`, `&#34;megabytes&#34;`, `&#34;gigabytes&#34;`, `&#34;terabytes&#34;`, `&#34;bits&#34;`, `&#34;kilobits&#34;`, `&#34;megabits&#34;`, `&#34;gigabits&#34;`, `&#34;terabits&#34;`, `&#34;count&#34;`, `&#34;bytes/second&#34;`, `&#34;kilobytes/second&#34;`, `&#34;megabytes/second&#34;`, `&#34;gigabytes/second&#34;`, `&#34;terabytes/second&#34;`, `&#34;bits/second&#34;`, `&#34;kilobits/second&#34;`, `&#34;megabits/second&#34;`, `&#34;gigabits/second&#34;`, `&#34;terabits/second&#34;`, `&#34;count/second&#34;`, `&#34;none&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder unit(@Nullable Output<String> unit) {
            $.unit = unit;
            return this;
        }

        /**
         * @param unit The unit for the alarm&#39;s associated metric. Valid values: `&#34;percent`, `&#34;seconds&#34;`, `&#34;microseconds&#34;`, `&#34;milliseconds&#34;`, `&#34;bytes&#34;`, `&#34;kilobytes&#34;`, `&#34;megabytes&#34;`, `&#34;gigabytes&#34;`, `&#34;terabytes&#34;`, `&#34;bits&#34;`, `&#34;kilobits&#34;`, `&#34;megabits&#34;`, `&#34;gigabits&#34;`, `&#34;terabits&#34;`, `&#34;count&#34;`, `&#34;bytes/second&#34;`, `&#34;kilobytes/second&#34;`, `&#34;megabytes/second&#34;`, `&#34;gigabytes/second&#34;`, `&#34;terabytes/second&#34;`, `&#34;bits/second&#34;`, `&#34;kilobits/second&#34;`, `&#34;megabits/second&#34;`, `&#34;gigabits/second&#34;`, `&#34;terabits/second&#34;`, `&#34;count/second&#34;`, `&#34;none&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder unit(String unit) {
            return unit(Output.of(unit));
        }

        public ElastigroupScalingUpPolicyArgs build() {
            $.metricName = Objects.requireNonNull($.metricName, "expected parameter 'metricName' to be non-null");
            $.namespace = Objects.requireNonNull($.namespace, "expected parameter 'namespace' to be non-null");
            $.policyName = Objects.requireNonNull($.policyName, "expected parameter 'policyName' to be non-null");
            return $;
        }
    }

}
