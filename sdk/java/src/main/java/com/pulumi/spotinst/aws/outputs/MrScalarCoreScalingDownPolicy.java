// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MrScalarCoreScalingDownPolicy {
    /**
     * @return The type of action to perform. Allowed values are : &#39;adjustment&#39;, &#39;setMinTarget&#39;, &#39;setMaxTarget&#39;, &#39;updateCapacity&#39;, &#39;percentageAdjustment&#39;
     * 
     */
    private @Nullable String actionType;
    /**
     * @return The number of instances to add/remove to/from the target capacity when scale is needed.
     * 
     */
    private @Nullable String adjustment;
    /**
     * @return The amount of time, in seconds, after a scaling activity completes and before the next scaling activity can start.
     * 
     */
    private @Nullable Integer cooldown;
    /**
     * @return A mapping of dimensions describing qualities of the metric.
     * 
     */
    private @Nullable Map<String,String> dimensions;
    private @Nullable Integer evaluationPeriods;
    /**
     * @return Max target capacity for scale down.
     * 
     */
    private @Nullable String maxTargetCapacity;
    /**
     * @return The maximum to set when scale is needed.
     * 
     */
    private @Nullable String maximum;
    private String metricName;
    /**
     * @return Min target capacity for scale up.
     * 
     */
    private @Nullable String minTargetCapacity;
    /**
     * @return The minimum to set when scale is needed.
     * 
     */
    private @Nullable String minimum;
    private String namespace;
    private @Nullable String operator;
    private @Nullable Integer period;
    /**
     * @return The name of the policy.
     * 
     */
    private String policyName;
    private @Nullable String statistic;
    /**
     * @return The number of instances to set when scale is needed.
     * 
     */
    private @Nullable String target;
    private Double threshold;
    private String unit;

    private MrScalarCoreScalingDownPolicy() {}
    /**
     * @return The type of action to perform. Allowed values are : &#39;adjustment&#39;, &#39;setMinTarget&#39;, &#39;setMaxTarget&#39;, &#39;updateCapacity&#39;, &#39;percentageAdjustment&#39;
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
     * @return The amount of time, in seconds, after a scaling activity completes and before the next scaling activity can start.
     * 
     */
    public Optional<Integer> cooldown() {
        return Optional.ofNullable(this.cooldown);
    }
    /**
     * @return A mapping of dimensions describing qualities of the metric.
     * 
     */
    public Map<String,String> dimensions() {
        return this.dimensions == null ? Map.of() : this.dimensions;
    }
    public Optional<Integer> evaluationPeriods() {
        return Optional.ofNullable(this.evaluationPeriods);
    }
    /**
     * @return Max target capacity for scale down.
     * 
     */
    public Optional<String> maxTargetCapacity() {
        return Optional.ofNullable(this.maxTargetCapacity);
    }
    /**
     * @return The maximum to set when scale is needed.
     * 
     */
    public Optional<String> maximum() {
        return Optional.ofNullable(this.maximum);
    }
    public String metricName() {
        return this.metricName;
    }
    /**
     * @return Min target capacity for scale up.
     * 
     */
    public Optional<String> minTargetCapacity() {
        return Optional.ofNullable(this.minTargetCapacity);
    }
    /**
     * @return The minimum to set when scale is needed.
     * 
     */
    public Optional<String> minimum() {
        return Optional.ofNullable(this.minimum);
    }
    public String namespace() {
        return this.namespace;
    }
    public Optional<String> operator() {
        return Optional.ofNullable(this.operator);
    }
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
    public Optional<String> statistic() {
        return Optional.ofNullable(this.statistic);
    }
    /**
     * @return The number of instances to set when scale is needed.
     * 
     */
    public Optional<String> target() {
        return Optional.ofNullable(this.target);
    }
    public Double threshold() {
        return this.threshold;
    }
    public String unit() {
        return this.unit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MrScalarCoreScalingDownPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String actionType;
        private @Nullable String adjustment;
        private @Nullable Integer cooldown;
        private @Nullable Map<String,String> dimensions;
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
        private String unit;
        public Builder() {}
        public Builder(MrScalarCoreScalingDownPolicy defaults) {
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
        public Builder dimensions(@Nullable Map<String,String> dimensions) {

            this.dimensions = dimensions;
            return this;
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
            if (metricName == null) {
              throw new MissingRequiredPropertyException("MrScalarCoreScalingDownPolicy", "metricName");
            }
            this.metricName = metricName;
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
            if (namespace == null) {
              throw new MissingRequiredPropertyException("MrScalarCoreScalingDownPolicy", "namespace");
            }
            this.namespace = namespace;
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
            if (policyName == null) {
              throw new MissingRequiredPropertyException("MrScalarCoreScalingDownPolicy", "policyName");
            }
            this.policyName = policyName;
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
            if (threshold == null) {
              throw new MissingRequiredPropertyException("MrScalarCoreScalingDownPolicy", "threshold");
            }
            this.threshold = threshold;
            return this;
        }
        @CustomType.Setter
        public Builder unit(String unit) {
            if (unit == null) {
              throw new MissingRequiredPropertyException("MrScalarCoreScalingDownPolicy", "unit");
            }
            this.unit = unit;
            return this;
        }
        public MrScalarCoreScalingDownPolicy build() {
            final var _resultValue = new MrScalarCoreScalingDownPolicy();
            _resultValue.actionType = actionType;
            _resultValue.adjustment = adjustment;
            _resultValue.cooldown = cooldown;
            _resultValue.dimensions = dimensions;
            _resultValue.evaluationPeriods = evaluationPeriods;
            _resultValue.maxTargetCapacity = maxTargetCapacity;
            _resultValue.maximum = maximum;
            _resultValue.metricName = metricName;
            _resultValue.minTargetCapacity = minTargetCapacity;
            _resultValue.minimum = minimum;
            _resultValue.namespace = namespace;
            _resultValue.operator = operator;
            _resultValue.period = period;
            _resultValue.policyName = policyName;
            _resultValue.statistic = statistic;
            _resultValue.target = target;
            _resultValue.threshold = threshold;
            _resultValue.unit = unit;
            return _resultValue;
        }
    }
}
