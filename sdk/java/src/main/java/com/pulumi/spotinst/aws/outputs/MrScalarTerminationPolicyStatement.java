// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MrScalarTerminationPolicyStatement {
    /**
     * @return The number of periods over which data is compared to the specified threshold.
     * 
     */
    private @Nullable Integer evaluationPeriods;
    /**
     * @return The name of the metric in CloudWatch which the statement will be based on.
     * 
     */
    private String metricName;
    /**
     * @return Must contain the value: `AWS/ElasticMapReduce`.
     * 
     */
    private String namespace;
    /**
     * @return The operator to use in order to determine if the policy is applicable. Valid values: `gt` | `gte` | `lt` | `lte`
     * 
     */
    private @Nullable String operator;
    /**
     * @return The time window in seconds over which the statistic is applied.
     * 
     */
    private @Nullable Integer period;
    /**
     * @return The aggregation method of the given metric. Valid Values: `average` | `sum` | `sampleCount` | `maximum` | `minimum`
     * 
     */
    private @Nullable String statistic;
    /**
     * @return The value that the specified statistic is compared to.
     * 
     */
    private Double threshold;
    /**
     * @return The unit for a given metric. Valid Values: `seconds` | `microseconds` | `milliseconds` | `bytes` | `kilobytes` | `megabytes` | `gigabytes` | `terabytes` | `bits` | `kilobits` | `megabits` | `gigabits` | `terabits` | `percent` | `count` | `bytes/second` | `kilobytes/second` | `megabytes/second` | `gigabytes/second` | `terabytes/second` | `bits/second` | `kilobits/second` | `megabits/second` | `gigabits/second` | `terabits/second` | `count/second` | `none`
     * 
     */
    private @Nullable String unit;

    private MrScalarTerminationPolicyStatement() {}
    /**
     * @return The number of periods over which data is compared to the specified threshold.
     * 
     */
    public Optional<Integer> evaluationPeriods() {
        return Optional.ofNullable(this.evaluationPeriods);
    }
    /**
     * @return The name of the metric in CloudWatch which the statement will be based on.
     * 
     */
    public String metricName() {
        return this.metricName;
    }
    /**
     * @return Must contain the value: `AWS/ElasticMapReduce`.
     * 
     */
    public String namespace() {
        return this.namespace;
    }
    /**
     * @return The operator to use in order to determine if the policy is applicable. Valid values: `gt` | `gte` | `lt` | `lte`
     * 
     */
    public Optional<String> operator() {
        return Optional.ofNullable(this.operator);
    }
    /**
     * @return The time window in seconds over which the statistic is applied.
     * 
     */
    public Optional<Integer> period() {
        return Optional.ofNullable(this.period);
    }
    /**
     * @return The aggregation method of the given metric. Valid Values: `average` | `sum` | `sampleCount` | `maximum` | `minimum`
     * 
     */
    public Optional<String> statistic() {
        return Optional.ofNullable(this.statistic);
    }
    /**
     * @return The value that the specified statistic is compared to.
     * 
     */
    public Double threshold() {
        return this.threshold;
    }
    /**
     * @return The unit for a given metric. Valid Values: `seconds` | `microseconds` | `milliseconds` | `bytes` | `kilobytes` | `megabytes` | `gigabytes` | `terabytes` | `bits` | `kilobits` | `megabits` | `gigabits` | `terabits` | `percent` | `count` | `bytes/second` | `kilobytes/second` | `megabytes/second` | `gigabytes/second` | `terabytes/second` | `bits/second` | `kilobits/second` | `megabits/second` | `gigabits/second` | `terabits/second` | `count/second` | `none`
     * 
     */
    public Optional<String> unit() {
        return Optional.ofNullable(this.unit);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MrScalarTerminationPolicyStatement defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer evaluationPeriods;
        private String metricName;
        private String namespace;
        private @Nullable String operator;
        private @Nullable Integer period;
        private @Nullable String statistic;
        private Double threshold;
        private @Nullable String unit;
        public Builder() {}
        public Builder(MrScalarTerminationPolicyStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.evaluationPeriods = defaults.evaluationPeriods;
    	      this.metricName = defaults.metricName;
    	      this.namespace = defaults.namespace;
    	      this.operator = defaults.operator;
    	      this.period = defaults.period;
    	      this.statistic = defaults.statistic;
    	      this.threshold = defaults.threshold;
    	      this.unit = defaults.unit;
        }

        @CustomType.Setter
        public Builder evaluationPeriods(@Nullable Integer evaluationPeriods) {

            this.evaluationPeriods = evaluationPeriods;
            return this;
        }
        @CustomType.Setter
        public Builder metricName(String metricName) {
            if (metricName == null) {
              throw new MissingRequiredPropertyException("MrScalarTerminationPolicyStatement", "metricName");
            }
            this.metricName = metricName;
            return this;
        }
        @CustomType.Setter
        public Builder namespace(String namespace) {
            if (namespace == null) {
              throw new MissingRequiredPropertyException("MrScalarTerminationPolicyStatement", "namespace");
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
        public Builder statistic(@Nullable String statistic) {

            this.statistic = statistic;
            return this;
        }
        @CustomType.Setter
        public Builder threshold(Double threshold) {
            if (threshold == null) {
              throw new MissingRequiredPropertyException("MrScalarTerminationPolicyStatement", "threshold");
            }
            this.threshold = threshold;
            return this;
        }
        @CustomType.Setter
        public Builder unit(@Nullable String unit) {

            this.unit = unit;
            return this;
        }
        public MrScalarTerminationPolicyStatement build() {
            final var _resultValue = new MrScalarTerminationPolicyStatement();
            _resultValue.evaluationPeriods = evaluationPeriods;
            _resultValue.metricName = metricName;
            _resultValue.namespace = namespace;
            _resultValue.operator = operator;
            _resultValue.period = period;
            _resultValue.statistic = statistic;
            _resultValue.threshold = threshold;
            _resultValue.unit = unit;
            return _resultValue;
        }
    }
}