// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.oceancd.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.spotinst.oceancd.outputs.VerificationTemplateMetricProviderCloudWatchMetricDataQueryMetricStatMetricDimension;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VerificationTemplateMetricProviderCloudWatchMetricDataQueryMetricStatMetric {
    private @Nullable List<VerificationTemplateMetricProviderCloudWatchMetricDataQueryMetricStatMetricDimension> dimensions;
    private String metricName;
    private @Nullable String namespace;

    private VerificationTemplateMetricProviderCloudWatchMetricDataQueryMetricStatMetric() {}
    public List<VerificationTemplateMetricProviderCloudWatchMetricDataQueryMetricStatMetricDimension> dimensions() {
        return this.dimensions == null ? List.of() : this.dimensions;
    }
    public String metricName() {
        return this.metricName;
    }
    public Optional<String> namespace() {
        return Optional.ofNullable(this.namespace);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VerificationTemplateMetricProviderCloudWatchMetricDataQueryMetricStatMetric defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<VerificationTemplateMetricProviderCloudWatchMetricDataQueryMetricStatMetricDimension> dimensions;
        private String metricName;
        private @Nullable String namespace;
        public Builder() {}
        public Builder(VerificationTemplateMetricProviderCloudWatchMetricDataQueryMetricStatMetric defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dimensions = defaults.dimensions;
    	      this.metricName = defaults.metricName;
    	      this.namespace = defaults.namespace;
        }

        @CustomType.Setter
        public Builder dimensions(@Nullable List<VerificationTemplateMetricProviderCloudWatchMetricDataQueryMetricStatMetricDimension> dimensions) {

            this.dimensions = dimensions;
            return this;
        }
        public Builder dimensions(VerificationTemplateMetricProviderCloudWatchMetricDataQueryMetricStatMetricDimension... dimensions) {
            return dimensions(List.of(dimensions));
        }
        @CustomType.Setter
        public Builder metricName(String metricName) {
            if (metricName == null) {
              throw new MissingRequiredPropertyException("VerificationTemplateMetricProviderCloudWatchMetricDataQueryMetricStatMetric", "metricName");
            }
            this.metricName = metricName;
            return this;
        }
        @CustomType.Setter
        public Builder namespace(@Nullable String namespace) {

            this.namespace = namespace;
            return this;
        }
        public VerificationTemplateMetricProviderCloudWatchMetricDataQueryMetricStatMetric build() {
            final var _resultValue = new VerificationTemplateMetricProviderCloudWatchMetricDataQueryMetricStatMetric();
            _resultValue.dimensions = dimensions;
            _resultValue.metricName = metricName;
            _resultValue.namespace = namespace;
            return _resultValue;
        }
    }
}
