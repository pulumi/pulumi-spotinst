// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ElastigroupMultipleMetricsMetricDimension {
    /**
     * @return The group name.
     * 
     */
    private String name;
    /**
     * @return The dimension value.
     * 
     */
    private @Nullable String value;

    private ElastigroupMultipleMetricsMetricDimension() {}
    /**
     * @return The group name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The dimension value.
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ElastigroupMultipleMetricsMetricDimension defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private @Nullable String value;
        public Builder() {}
        public Builder(ElastigroupMultipleMetricsMetricDimension defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }
        public ElastigroupMultipleMetricsMetricDimension build() {
            final var _resultValue = new ElastigroupMultipleMetricsMetricDimension();
            _resultValue.name = name;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
