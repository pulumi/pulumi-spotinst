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

    private ElastigroupScalingUpPolicy() {}
    public Optional<String> actionType() {
        return Optional.ofNullable(this.actionType);
    }
    public Optional<String> adjustment() {
        return Optional.ofNullable(this.adjustment);
    }
    public Optional<Integer> cooldown() {
        return Optional.ofNullable(this.cooldown);
    }
    public List<ElastigroupScalingUpPolicyDimension> dimensions() {
        return this.dimensions == null ? List.of() : this.dimensions;
    }
    public Optional<Integer> evaluationPeriods() {
        return Optional.ofNullable(this.evaluationPeriods);
    }
    public Optional<String> maxTargetCapacity() {
        return Optional.ofNullable(this.maxTargetCapacity);
    }
    public Optional<String> maximum() {
        return Optional.ofNullable(this.maximum);
    }
    public String metricName() {
        return this.metricName;
    }
    public Optional<String> minTargetCapacity() {
        return Optional.ofNullable(this.minTargetCapacity);
    }
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
    public String policyName() {
        return this.policyName;
    }
    public Optional<String> statistic() {
        return Optional.ofNullable(this.statistic);
    }
    public Optional<String> target() {
        return Optional.ofNullable(this.target);
    }
    public Double threshold() {
        return this.threshold;
    }
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
            final var _resultValue = new ElastigroupScalingUpPolicy();
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
