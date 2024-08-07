// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.spotinst.aws.inputs.ElastigroupMultipleMetricsMetricDimensionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ElastigroupMultipleMetricsMetricArgs extends com.pulumi.resources.ResourceArgs {

    public static final ElastigroupMultipleMetricsMetricArgs Empty = new ElastigroupMultipleMetricsMetricArgs();

    @Import(name="dimensions")
    private @Nullable Output<List<ElastigroupMultipleMetricsMetricDimensionArgs>> dimensions;

    public Optional<Output<List<ElastigroupMultipleMetricsMetricDimensionArgs>>> dimensions() {
        return Optional.ofNullable(this.dimensions);
    }

    /**
     * Percentile statistic. Valid values: `&#34;p0.1&#34;` - `&#34;p100&#34;`.
     * 
     */
    @Import(name="extendedStatistic")
    private @Nullable Output<String> extendedStatistic;

    /**
     * @return Percentile statistic. Valid values: `&#34;p0.1&#34;` - `&#34;p100&#34;`.
     * 
     */
    public Optional<Output<String>> extendedStatistic() {
        return Optional.ofNullable(this.extendedStatistic);
    }

    @Import(name="metricName", required=true)
    private Output<String> metricName;

    public Output<String> metricName() {
        return this.metricName;
    }

    /**
     * The group name.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The group name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    @Import(name="namespace", required=true)
    private Output<String> namespace;

    public Output<String> namespace() {
        return this.namespace;
    }

    @Import(name="statistic")
    private @Nullable Output<String> statistic;

    public Optional<Output<String>> statistic() {
        return Optional.ofNullable(this.statistic);
    }

    @Import(name="unit")
    private @Nullable Output<String> unit;

    public Optional<Output<String>> unit() {
        return Optional.ofNullable(this.unit);
    }

    private ElastigroupMultipleMetricsMetricArgs() {}

    private ElastigroupMultipleMetricsMetricArgs(ElastigroupMultipleMetricsMetricArgs $) {
        this.dimensions = $.dimensions;
        this.extendedStatistic = $.extendedStatistic;
        this.metricName = $.metricName;
        this.name = $.name;
        this.namespace = $.namespace;
        this.statistic = $.statistic;
        this.unit = $.unit;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ElastigroupMultipleMetricsMetricArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ElastigroupMultipleMetricsMetricArgs $;

        public Builder() {
            $ = new ElastigroupMultipleMetricsMetricArgs();
        }

        public Builder(ElastigroupMultipleMetricsMetricArgs defaults) {
            $ = new ElastigroupMultipleMetricsMetricArgs(Objects.requireNonNull(defaults));
        }

        public Builder dimensions(@Nullable Output<List<ElastigroupMultipleMetricsMetricDimensionArgs>> dimensions) {
            $.dimensions = dimensions;
            return this;
        }

        public Builder dimensions(List<ElastigroupMultipleMetricsMetricDimensionArgs> dimensions) {
            return dimensions(Output.of(dimensions));
        }

        public Builder dimensions(ElastigroupMultipleMetricsMetricDimensionArgs... dimensions) {
            return dimensions(List.of(dimensions));
        }

        /**
         * @param extendedStatistic Percentile statistic. Valid values: `&#34;p0.1&#34;` - `&#34;p100&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder extendedStatistic(@Nullable Output<String> extendedStatistic) {
            $.extendedStatistic = extendedStatistic;
            return this;
        }

        /**
         * @param extendedStatistic Percentile statistic. Valid values: `&#34;p0.1&#34;` - `&#34;p100&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder extendedStatistic(String extendedStatistic) {
            return extendedStatistic(Output.of(extendedStatistic));
        }

        public Builder metricName(Output<String> metricName) {
            $.metricName = metricName;
            return this;
        }

        public Builder metricName(String metricName) {
            return metricName(Output.of(metricName));
        }

        /**
         * @param name The group name.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The group name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder namespace(Output<String> namespace) {
            $.namespace = namespace;
            return this;
        }

        public Builder namespace(String namespace) {
            return namespace(Output.of(namespace));
        }

        public Builder statistic(@Nullable Output<String> statistic) {
            $.statistic = statistic;
            return this;
        }

        public Builder statistic(String statistic) {
            return statistic(Output.of(statistic));
        }

        public Builder unit(@Nullable Output<String> unit) {
            $.unit = unit;
            return this;
        }

        public Builder unit(String unit) {
            return unit(Output.of(unit));
        }

        public ElastigroupMultipleMetricsMetricArgs build() {
            if ($.metricName == null) {
                throw new MissingRequiredPropertyException("ElastigroupMultipleMetricsMetricArgs", "metricName");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("ElastigroupMultipleMetricsMetricArgs", "name");
            }
            if ($.namespace == null) {
                throw new MissingRequiredPropertyException("ElastigroupMultipleMetricsMetricArgs", "namespace");
            }
            return $;
        }
    }

}
