// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.azure.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.spotinst.azure.outputs.ElastigroupScalingUpPolicyDimension;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ElastigroupScalingUpPolicy {
    /**
     * @return The type of action to perform for scaling. Valid values: `&#34;adjustment&#34;`, `&#34;percentageAdjustment&#34;`, `&#34;setMaxTarget&#34;`, `&#34;setMinTarget&#34;`, `&#34;updateCapacity&#34;`.
     * 
     */
    private @Nullable String actionType;
    /**
     * @return The number of instances to add/remove to/from the target capacity when scale is needed.
     * 
     */
    private @Nullable String adjustment;
    /**
     * @return The amount of time, in seconds, after a scaling activity completes and before the next scaling activity can start. If this parameter is not specified, the default cooldown period for the group applies.
     * 
     */
    private @Nullable Integer cooldown;
    /**
     * @return A list of dimensions describing qualities of the metric. Required when `namespace` is defined AND not `&#34;Microsoft.Compute&#34;`.
     * 
     */
    private @Nullable List<ElastigroupScalingUpPolicyDimension> dimensions;
    /**
     * @return The number of periods over which data is compared to the specified threshold.
     * 
     */
    private @Nullable Integer evaluationPeriods;
    /**
     * @return . The number of the desired target (and maximum) capacity
     * 
     */
    private @Nullable String maxTargetCapacity;
    /**
     * @return The maximal number of instances to have in the group.
     * 
     */
    private @Nullable String maximum;
    /**
     * @return Metric to monitor by Azure metric display name.
     * 
     */
    private String metricName;
    /**
     * @return . The number of the desired target (and minimum) capacity
     * 
     */
    private @Nullable String minTargetCapacity;
    /**
     * @return The minimal number of instances to have in the group.
     * 
     */
    private @Nullable String minimum;
    /**
     * @return The namespace for the alarm&#39;s associated metric. Valid values:
     * 
     */
    private String namespace;
    /**
     * @return The operator to use in order to determine if the scaling policy is applicable. Valid values: `&#34;gt&#34;`, `&#34;gte&#34;`, `&#34;lt&#34;`, `&#34;lte&#34;`.
     * 
     */
    private @Nullable String operator;
    /**
     * @return The granularity, in seconds, of the returned datapoints. Period must be at least 60 seconds and must be a multiple of 60.
     * 
     */
    private @Nullable Integer period;
    /**
     * @return The name of the policy.
     * 
     */
    private String policyName;
    /**
     * @return The metric statistics to return. Valid values: `average`.
     * 
     */
    private @Nullable String statistic;
    /**
     * @return The target number of instances to have in the group.
     * 
     */
    private @Nullable String target;
    /**
     * @return The value against which the specified statistic is compared.
     * 
     */
    private Double threshold;
    /**
     * @return The unit for the alarm&#39;s associated metric. Valid values: `&#34;percent`, `&#34;seconds&#34;`, `&#34;microseconds&#34;`, `&#34;milliseconds&#34;`, `&#34;bytes&#34;`, `&#34;kilobytes&#34;`, `&#34;megabytes&#34;`, `&#34;gigabytes&#34;`, `&#34;terabytes&#34;`, `&#34;bits&#34;`, `&#34;kilobits&#34;`, `&#34;megabits&#34;`, `&#34;gigabits&#34;`, `&#34;terabits&#34;`, `&#34;count&#34;`, `&#34;bytes/second&#34;`, `&#34;kilobytes/second&#34;`, `&#34;megabytes/second&#34;`, `&#34;gigabytes/second&#34;`, `&#34;terabytes/second&#34;`, `&#34;bits/second&#34;`, `&#34;kilobits/second&#34;`, `&#34;megabits/second&#34;`, `&#34;gigabits/second&#34;`, `&#34;terabits/second&#34;`, `&#34;count/second&#34;`, `&#34;none&#34;`.
     * 
     */
    private @Nullable String unit;

    private ElastigroupScalingUpPolicy() {}
    /**
     * @return The type of action to perform for scaling. Valid values: `&#34;adjustment&#34;`, `&#34;percentageAdjustment&#34;`, `&#34;setMaxTarget&#34;`, `&#34;setMinTarget&#34;`, `&#34;updateCapacity&#34;`.
     * 
     */
    public Optional<String> actionType() {
        return Optional.ofNullable(this.actionType);
    }
    /**
     * @return The number of instances to add/remove to/from the target capacity when scale is needed.
     * 
     */
    public Optional<String> adjustment() {
        return Optional.ofNullable(this.adjustment);
    }
    /**
     * @return The amount of time, in seconds, after a scaling activity completes and before the next scaling activity can start. If this parameter is not specified, the default cooldown period for the group applies.
     * 
     */
    public Optional<Integer> cooldown() {
        return Optional.ofNullable(this.cooldown);
    }
    /**
     * @return A list of dimensions describing qualities of the metric. Required when `namespace` is defined AND not `&#34;Microsoft.Compute&#34;`.
     * 
     */
    public List<ElastigroupScalingUpPolicyDimension> dimensions() {
        return this.dimensions == null ? List.of() : this.dimensions;
    }
    /**
     * @return The number of periods over which data is compared to the specified threshold.
     * 
     */
    public Optional<Integer> evaluationPeriods() {
        return Optional.ofNullable(this.evaluationPeriods);
    }
    /**
     * @return . The number of the desired target (and maximum) capacity
     * 
     */
    public Optional<String> maxTargetCapacity() {
        return Optional.ofNullable(this.maxTargetCapacity);
    }
    /**
     * @return The maximal number of instances to have in the group.
     * 
     */
    public Optional<String> maximum() {
        return Optional.ofNullable(this.maximum);
    }
    /**
     * @return Metric to monitor by Azure metric display name.
     * 
     */
    public String metricName() {
        return this.metricName;
    }
    /**
     * @return . The number of the desired target (and minimum) capacity
     * 
     */
    public Optional<String> minTargetCapacity() {
        return Optional.ofNullable(this.minTargetCapacity);
    }
    /**
     * @return The minimal number of instances to have in the group.
     * 
     */
    public Optional<String> minimum() {
        return Optional.ofNullable(this.minimum);
    }
    /**
     * @return The namespace for the alarm&#39;s associated metric. Valid values:
     * 
     */
    public String namespace() {
        return this.namespace;
    }
    /**
     * @return The operator to use in order to determine if the scaling policy is applicable. Valid values: `&#34;gt&#34;`, `&#34;gte&#34;`, `&#34;lt&#34;`, `&#34;lte&#34;`.
     * 
     */
    public Optional<String> operator() {
        return Optional.ofNullable(this.operator);
    }
    /**
     * @return The granularity, in seconds, of the returned datapoints. Period must be at least 60 seconds and must be a multiple of 60.
     * 
     */
    public Optional<Integer> period() {
        return Optional.ofNullable(this.period);
    }
    /**
     * @return The name of the policy.
     * 
     */
    public String policyName() {
        return this.policyName;
    }
    /**
     * @return The metric statistics to return. Valid values: `average`.
     * 
     */
    public Optional<String> statistic() {
        return Optional.ofNullable(this.statistic);
    }
    /**
     * @return The target number of instances to have in the group.
     * 
     */
    public Optional<String> target() {
        return Optional.ofNullable(this.target);
    }
    /**
     * @return The value against which the specified statistic is compared.
     * 
     */
    public Double threshold() {
        return this.threshold;
    }
    /**
     * @return The unit for the alarm&#39;s associated metric. Valid values: `&#34;percent`, `&#34;seconds&#34;`, `&#34;microseconds&#34;`, `&#34;milliseconds&#34;`, `&#34;bytes&#34;`, `&#34;kilobytes&#34;`, `&#34;megabytes&#34;`, `&#34;gigabytes&#34;`, `&#34;terabytes&#34;`, `&#34;bits&#34;`, `&#34;kilobits&#34;`, `&#34;megabits&#34;`, `&#34;gigabits&#34;`, `&#34;terabits&#34;`, `&#34;count&#34;`, `&#34;bytes/second&#34;`, `&#34;kilobytes/second&#34;`, `&#34;megabytes/second&#34;`, `&#34;gigabytes/second&#34;`, `&#34;terabytes/second&#34;`, `&#34;bits/second&#34;`, `&#34;kilobits/second&#34;`, `&#34;megabits/second&#34;`, `&#34;gigabits/second&#34;`, `&#34;terabits/second&#34;`, `&#34;count/second&#34;`, `&#34;none&#34;`.
     * 
     */
    public Optional<String> unit() {
        return Optional.ofNullable(this.unit);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ElastigroupScalingUpPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String actionType;
        private @Nullable String adjustment;
        private @Nullable Integer cooldown;
        private @Nullable List<ElastigroupScalingUpPolicyDimension> dimensions;
        private @Nullable Integer evaluationPeriods;
        private @Nullable String maxTargetCapacity;
        private @Nullable String maximum;
        private String metricName;
        private @Nullable String minTargetCapacity;
        private @Nullable String minimum;
        private String namespace;
        private @Nullable String operator;
        private @Nullable Integer period;
        private String policyName;
        private @Nullable String statistic;
        private @Nullable String target;
        private Double threshold;
        private @Nullable String unit;
        public Builder() {}
        public Builder(ElastigroupScalingUpPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionType = defaults.actionType;
    	      this.adjustment = defaults.adjustment;
    	      this.cooldown = defaults.cooldown;
    	      this.dimensions = defaults.dimensions;
    	      this.evaluationPeriods = defaults.evaluationPeriods;
    	      this.maxTargetCapacity = defaults.maxTargetCapacity;
    	      this.maximum = defaults.maximum;
    	      this.metricName = defaults.metricName;
    	      this.minTargetCapacity = defaults.minTargetCapacity;
    	      this.minimum = defaults.minimum;
    	      this.namespace = defaults.namespace;
    	      this.operator = defaults.operator;
    	      this.period = defaults.period;
    	      this.policyName = defaults.policyName;
    	      this.statistic = defaults.statistic;
    	      this.target = defaults.target;
    	      this.threshold = defaults.threshold;
    	      this.unit = defaults.unit;
        }

        @CustomType.Setter
        public Builder actionType(@Nullable String actionType) {
            this.actionType = actionType;
            return this;
        }
        @CustomType.Setter
        public Builder adjustment(@Nullable String adjustment) {
            this.adjustment = adjustment;
            return this;
        }
        @CustomType.Setter
        public Builder cooldown(@Nullable Integer cooldown) {
            this.cooldown = cooldown;
            return this;
        }
        @CustomType.Setter
        public Builder dimensions(@Nullable List<ElastigroupScalingUpPolicyDimension> dimensions) {
            this.dimensions = dimensions;
            return this;
        }
        public Builder dimensions(ElastigroupScalingUpPolicyDimension... dimensions) {
            return dimensions(List.of(dimensions));
        }
        @CustomType.Setter
        public Builder evaluationPeriods(@Nullable Integer evaluationPeriods) {
            this.evaluationPeriods = evaluationPeriods;
            return this;
        }
        @CustomType.Setter
        public Builder maxTargetCapacity(@Nullable String maxTargetCapacity) {
            this.maxTargetCapacity = maxTargetCapacity;
            return this;
        }
        @CustomType.Setter
        public Builder maximum(@Nullable String maximum) {
            this.maximum = maximum;
            return this;
        }
        @CustomType.Setter
        public Builder metricName(String metricName) {
            this.metricName = Objects.requireNonNull(metricName);
            return this;
        }
        @CustomType.Setter
        public Builder minTargetCapacity(@Nullable String minTargetCapacity) {
            this.minTargetCapacity = minTargetCapacity;
            return this;
        }
        @CustomType.Setter
        public Builder minimum(@Nullable String minimum) {
            this.minimum = minimum;
            return this;
        }
        @CustomType.Setter
        public Builder namespace(String namespace) {
            this.namespace = Objects.requireNonNull(namespace);
            return this;
        }
        @CustomType.Setter
        public Builder operator(@Nullable String operator) {
            this.operator = operator;
            return this;
        }
        @CustomType.Setter
        public Builder period(@Nullable Integer period) {
            this.period = period;
            return this;
        }
        @CustomType.Setter
        public Builder policyName(String policyName) {
            this.policyName = Objects.requireNonNull(policyName);
            return this;
        }
        @CustomType.Setter
        public Builder statistic(@Nullable String statistic) {
            this.statistic = statistic;
            return this;
        }
        @CustomType.Setter
        public Builder target(@Nullable String target) {
            this.target = target;
            return this;
        }
        @CustomType.Setter
        public Builder threshold(Double threshold) {
            this.threshold = Objects.requireNonNull(threshold);
            return this;
        }
        @CustomType.Setter
        public Builder unit(@Nullable String unit) {
            this.unit = unit;
            return this;
        }
        public ElastigroupScalingUpPolicy build() {
            final var o = new ElastigroupScalingUpPolicy();
            o.actionType = actionType;
            o.adjustment = adjustment;
            o.cooldown = cooldown;
            o.dimensions = dimensions;
            o.evaluationPeriods = evaluationPeriods;
            o.maxTargetCapacity = maxTargetCapacity;
            o.maximum = maximum;
            o.metricName = metricName;
            o.minTargetCapacity = minTargetCapacity;
            o.minimum = minimum;
            o.namespace = namespace;
            o.operator = operator;
            o.period = period;
            o.policyName = policyName;
            o.statistic = statistic;
            o.target = target;
            o.threshold = threshold;
            o.unit = unit;
            return o;
        }
    }
}
