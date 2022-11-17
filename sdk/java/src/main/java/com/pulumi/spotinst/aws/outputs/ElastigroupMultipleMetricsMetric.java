// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.spotinst.aws.outputs.ElastigroupMultipleMetricsMetricDimension;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ElastigroupMultipleMetricsMetric {
    /**
     * @return A list of dimensions describing qualities of the metric.
     * *`name` - (Required) the dimension name.
     * *`value` - (Optional) the dimension value.
     * 
     */
    private @Nullable List<ElastigroupMultipleMetricsMetricDimension> dimensions;
    /**
     * @return Percentile statistic. Valid values: `&#34;p0.1&#34;` - `&#34;p100&#34;`.
     * 
     */
    private @Nullable String extendedStatistic;
    /**
     * @return The name of the metric, with or without spaces.
     * 
     */
    private String metricName;
    /**
     * @return The record set name.
     * 
     */
    private String name;
    /**
     * @return The namespace for the alarm&#39;s associated metric.
     * 
     */
    private String namespace;
    /**
     * @return The metric statistics to return. For information about specific statistics go to [Statistics](http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/index.html?CHAP_TerminologyandKeyConcepts.html#Statistic) in the Amazon CloudWatch Developer Guide.
     * 
     */
    private @Nullable String statistic;
    /**
     * @return The unit for the alarm&#39;s associated metric. Valid values: `&#34;percent`, `&#34;seconds&#34;`, `&#34;microseconds&#34;`, `&#34;milliseconds&#34;`, `&#34;bytes&#34;`, `&#34;kilobytes&#34;`, `&#34;megabytes&#34;`, `&#34;gigabytes&#34;`, `&#34;terabytes&#34;`, `&#34;bits&#34;`, `&#34;kilobits&#34;`, `&#34;megabits&#34;`, `&#34;gigabits&#34;`, `&#34;terabits&#34;`, `&#34;count&#34;`, `&#34;bytes/second&#34;`, `&#34;kilobytes/second&#34;`, `&#34;megabytes/second&#34;`, `&#34;gigabytes/second&#34;`, `&#34;terabytes/second&#34;`, `&#34;bits/second&#34;`, `&#34;kilobits/second&#34;`, `&#34;megabits/second&#34;`, `&#34;gigabits/second&#34;`, `&#34;terabits/second&#34;`, `&#34;count/second&#34;`, `&#34;none&#34;`.
     * 
     */
    private @Nullable String unit;

    private ElastigroupMultipleMetricsMetric() {}
    /**
     * @return A list of dimensions describing qualities of the metric.
     * *`name` - (Required) the dimension name.
     * *`value` - (Optional) the dimension value.
     * 
     */
    public List<ElastigroupMultipleMetricsMetricDimension> dimensions() {
        return this.dimensions == null ? List.of() : this.dimensions;
    }
    /**
     * @return Percentile statistic. Valid values: `&#34;p0.1&#34;` - `&#34;p100&#34;`.
     * 
     */
    public Optional<String> extendedStatistic() {
        return Optional.ofNullable(this.extendedStatistic);
    }
    /**
     * @return The name of the metric, with or without spaces.
     * 
     */
    public String metricName() {
        return this.metricName;
    }
    /**
     * @return The record set name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The namespace for the alarm&#39;s associated metric.
     * 
     */
    public String namespace() {
        return this.namespace;
    }
    /**
     * @return The metric statistics to return. For information about specific statistics go to [Statistics](http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/index.html?CHAP_TerminologyandKeyConcepts.html#Statistic) in the Amazon CloudWatch Developer Guide.
     * 
     */
    public Optional<String> statistic() {
        return Optional.ofNullable(this.statistic);
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

    public static Builder builder(ElastigroupMultipleMetricsMetric defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<ElastigroupMultipleMetricsMetricDimension> dimensions;
        private @Nullable String extendedStatistic;
        private String metricName;
        private String name;
        private String namespace;
        private @Nullable String statistic;
        private @Nullable String unit;
        public Builder() {}
        public Builder(ElastigroupMultipleMetricsMetric defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dimensions = defaults.dimensions;
    	      this.extendedStatistic = defaults.extendedStatistic;
    	      this.metricName = defaults.metricName;
    	      this.name = defaults.name;
    	      this.namespace = defaults.namespace;
    	      this.statistic = defaults.statistic;
    	      this.unit = defaults.unit;
        }

        @CustomType.Setter
        public Builder dimensions(@Nullable List<ElastigroupMultipleMetricsMetricDimension> dimensions) {
            this.dimensions = dimensions;
            return this;
        }
        public Builder dimensions(ElastigroupMultipleMetricsMetricDimension... dimensions) {
            return dimensions(List.of(dimensions));
        }
        @CustomType.Setter
        public Builder extendedStatistic(@Nullable String extendedStatistic) {
            this.extendedStatistic = extendedStatistic;
            return this;
        }
        @CustomType.Setter
        public Builder metricName(String metricName) {
            this.metricName = Objects.requireNonNull(metricName);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder namespace(String namespace) {
            this.namespace = Objects.requireNonNull(namespace);
            return this;
        }
        @CustomType.Setter
        public Builder statistic(@Nullable String statistic) {
            this.statistic = statistic;
            return this;
        }
        @CustomType.Setter
        public Builder unit(@Nullable String unit) {
            this.unit = unit;
            return this;
        }
        public ElastigroupMultipleMetricsMetric build() {
            final var o = new ElastigroupMultipleMetricsMetric();
            o.dimensions = dimensions;
            o.extendedStatistic = extendedStatistic;
            o.metricName = metricName;
            o.name = name;
            o.namespace = namespace;
            o.statistic = statistic;
            o.unit = unit;
            return o;
        }
    }
}
