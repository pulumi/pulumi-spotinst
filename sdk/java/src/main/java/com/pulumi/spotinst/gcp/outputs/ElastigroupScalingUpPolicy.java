// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.gcp.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.spotinst.gcp.outputs.ElastigroupScalingUpPolicyDimension;
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
     * @return Type of scaling action to take when the scaling policy is triggered. Valid values: &#34;adjustment&#34;, &#34;setMinTarget&#34;, &#34;updateCapacity&#34;, &#34;percentageAdjustment&#34;
     * 
     */
    private @Nullable String actionType;
    /**
     * @return Value to which the action type will be adjusted. Required if using &#34;numeric&#34; or &#34;percentageAdjustment&#34; action types.
     * 
     */
    private @Nullable Integer adjustment;
    /**
     * @return Time (seconds) to wait after a scaling action before resuming monitoring.
     * 
     */
    private @Nullable Integer cooldown;
    /**
     * @return A list of dimensions describing qualities of the metric.
     * 
     */
    private @Nullable List<ElastigroupScalingUpPolicyDimension> dimensions;
    /**
     * @return Number of consecutive periods in which the threshold must be met in order to trigger a scaling action.
     * 
     */
    private @Nullable Integer evaluationPeriods;
    /**
     * @return Metric to monitor. Valid values: &#34;Percentage CPU&#34;, &#34;Network In&#34;, &#34;Network Out&#34;, &#34;Disk Read Bytes&#34;, &#34;Disk Write Bytes&#34;, &#34;Disk Write Operations/Sec&#34;, &#34;Disk Read Operations/Sec&#34;.
     * 
     */
    private String metricName;
    private String namespace;
    /**
     * @return The operator used to evaluate the threshold against the current metric value. Valid values: &#34;gt&#34; (greater than), &#34;get&#34; (greater-than or equal), &#34;lt&#34; (less than), &#34;lte&#34; (less than or equal).
     * 
     */
    private @Nullable String operator;
    /**
     * @return Amount of time (seconds) for which the threshold must be met in order to trigger the scaling action.
     * 
     */
    private @Nullable Integer period;
    /**
     * @return Name of scaling policy.
     * 
     */
    private String policyName;
    /**
     * @return Specifies a valid partial or full URL to an existing Persistent Disk resource. This field is only applicable for persistent disks.
     * 
     */
    private @Nullable String source;
    /**
     * @return Statistic by which to evaluate the selected metric. Valid values: &#34;AVERAGE&#34;, &#34;SAMPLE_COUNT&#34;, &#34;SUM&#34;, &#34;MINIMUM&#34;, &#34;MAXIMUM&#34;, &#34;PERCENTILE&#34;, &#34;COUNT&#34;.
     * 
     */
    private @Nullable String statistic;
    /**
     * @return The value at which the scaling action is triggered.
     * 
     */
    private Double threshold;
    private String unit;

    private ElastigroupScalingUpPolicy() {}
    /**
     * @return Type of scaling action to take when the scaling policy is triggered. Valid values: &#34;adjustment&#34;, &#34;setMinTarget&#34;, &#34;updateCapacity&#34;, &#34;percentageAdjustment&#34;
     * 
     */
    public Optional<String> actionType() {
        return Optional.ofNullable(this.actionType);
    }
    /**
     * @return Value to which the action type will be adjusted. Required if using &#34;numeric&#34; or &#34;percentageAdjustment&#34; action types.
     * 
     */
    public Optional<Integer> adjustment() {
        return Optional.ofNullable(this.adjustment);
    }
    /**
     * @return Time (seconds) to wait after a scaling action before resuming monitoring.
     * 
     */
    public Optional<Integer> cooldown() {
        return Optional.ofNullable(this.cooldown);
    }
    /**
     * @return A list of dimensions describing qualities of the metric.
     * 
     */
    public List<ElastigroupScalingUpPolicyDimension> dimensions() {
        return this.dimensions == null ? List.of() : this.dimensions;
    }
    /**
     * @return Number of consecutive periods in which the threshold must be met in order to trigger a scaling action.
     * 
     */
    public Optional<Integer> evaluationPeriods() {
        return Optional.ofNullable(this.evaluationPeriods);
    }
    /**
     * @return Metric to monitor. Valid values: &#34;Percentage CPU&#34;, &#34;Network In&#34;, &#34;Network Out&#34;, &#34;Disk Read Bytes&#34;, &#34;Disk Write Bytes&#34;, &#34;Disk Write Operations/Sec&#34;, &#34;Disk Read Operations/Sec&#34;.
     * 
     */
    public String metricName() {
        return this.metricName;
    }
    public String namespace() {
        return this.namespace;
    }
    /**
     * @return The operator used to evaluate the threshold against the current metric value. Valid values: &#34;gt&#34; (greater than), &#34;get&#34; (greater-than or equal), &#34;lt&#34; (less than), &#34;lte&#34; (less than or equal).
     * 
     */
    public Optional<String> operator() {
        return Optional.ofNullable(this.operator);
    }
    /**
     * @return Amount of time (seconds) for which the threshold must be met in order to trigger the scaling action.
     * 
     */
    public Optional<Integer> period() {
        return Optional.ofNullable(this.period);
    }
    /**
     * @return Name of scaling policy.
     * 
     */
    public String policyName() {
        return this.policyName;
    }
    /**
     * @return Specifies a valid partial or full URL to an existing Persistent Disk resource. This field is only applicable for persistent disks.
     * 
     */
    public Optional<String> source() {
        return Optional.ofNullable(this.source);
    }
    /**
     * @return Statistic by which to evaluate the selected metric. Valid values: &#34;AVERAGE&#34;, &#34;SAMPLE_COUNT&#34;, &#34;SUM&#34;, &#34;MINIMUM&#34;, &#34;MAXIMUM&#34;, &#34;PERCENTILE&#34;, &#34;COUNT&#34;.
     * 
     */
    public Optional<String> statistic() {
        return Optional.ofNullable(this.statistic);
    }
    /**
     * @return The value at which the scaling action is triggered.
     * 
     */
    public Double threshold() {
        return this.threshold;
    }
    public String unit() {
        return this.unit;
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
        private @Nullable Integer adjustment;
        private @Nullable Integer cooldown;
        private @Nullable List<ElastigroupScalingUpPolicyDimension> dimensions;
        private @Nullable Integer evaluationPeriods;
        private String metricName;
        private String namespace;
        private @Nullable String operator;
        private @Nullable Integer period;
        private String policyName;
        private @Nullable String source;
        private @Nullable String statistic;
        private Double threshold;
        private String unit;
        public Builder() {}
        public Builder(ElastigroupScalingUpPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionType = defaults.actionType;
    	      this.adjustment = defaults.adjustment;
    	      this.cooldown = defaults.cooldown;
    	      this.dimensions = defaults.dimensions;
    	      this.evaluationPeriods = defaults.evaluationPeriods;
    	      this.metricName = defaults.metricName;
    	      this.namespace = defaults.namespace;
    	      this.operator = defaults.operator;
    	      this.period = defaults.period;
    	      this.policyName = defaults.policyName;
    	      this.source = defaults.source;
    	      this.statistic = defaults.statistic;
    	      this.threshold = defaults.threshold;
    	      this.unit = defaults.unit;
        }

        @CustomType.Setter
        public Builder actionType(@Nullable String actionType) {
            this.actionType = actionType;
            return this;
        }
        @CustomType.Setter
        public Builder adjustment(@Nullable Integer adjustment) {
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
        public Builder metricName(String metricName) {
            this.metricName = Objects.requireNonNull(metricName);
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
        public Builder source(@Nullable String source) {
            this.source = source;
            return this;
        }
        @CustomType.Setter
        public Builder statistic(@Nullable String statistic) {
            this.statistic = statistic;
            return this;
        }
        @CustomType.Setter
        public Builder threshold(Double threshold) {
            this.threshold = Objects.requireNonNull(threshold);
            return this;
        }
        @CustomType.Setter
        public Builder unit(String unit) {
            this.unit = Objects.requireNonNull(unit);
            return this;
        }
        public ElastigroupScalingUpPolicy build() {
            final var o = new ElastigroupScalingUpPolicy();
            o.actionType = actionType;
            o.adjustment = adjustment;
            o.cooldown = cooldown;
            o.dimensions = dimensions;
            o.evaluationPeriods = evaluationPeriods;
            o.metricName = metricName;
            o.namespace = namespace;
            o.operator = operator;
            o.period = period;
            o.policyName = policyName;
            o.source = source;
            o.statistic = statistic;
            o.threshold = threshold;
            o.unit = unit;
            return o;
        }
    }
}