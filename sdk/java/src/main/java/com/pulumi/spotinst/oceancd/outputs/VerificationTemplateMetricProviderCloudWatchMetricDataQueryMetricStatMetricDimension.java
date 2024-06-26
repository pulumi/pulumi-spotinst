// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.oceancd.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class VerificationTemplateMetricProviderCloudWatchMetricDataQueryMetricStatMetricDimension {
    /**
     * @return The name of the dimensions. These values must contain only ASCII characters and must include at least one non-whitespace characte
     * 
     */
    private String dimensionName;
    /**
     * @return The value of the dimensions.These values must contain only ASCII characters and must include at least one non-whitespace characte
     * 
     */
    private String dimensionValue;

    private VerificationTemplateMetricProviderCloudWatchMetricDataQueryMetricStatMetricDimension() {}
    /**
     * @return The name of the dimensions. These values must contain only ASCII characters and must include at least one non-whitespace characte
     * 
     */
    public String dimensionName() {
        return this.dimensionName;
    }
    /**
     * @return The value of the dimensions.These values must contain only ASCII characters and must include at least one non-whitespace characte
     * 
     */
    public String dimensionValue() {
        return this.dimensionValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VerificationTemplateMetricProviderCloudWatchMetricDataQueryMetricStatMetricDimension defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String dimensionName;
        private String dimensionValue;
        public Builder() {}
        public Builder(VerificationTemplateMetricProviderCloudWatchMetricDataQueryMetricStatMetricDimension defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dimensionName = defaults.dimensionName;
    	      this.dimensionValue = defaults.dimensionValue;
        }

        @CustomType.Setter
        public Builder dimensionName(String dimensionName) {
            if (dimensionName == null) {
              throw new MissingRequiredPropertyException("VerificationTemplateMetricProviderCloudWatchMetricDataQueryMetricStatMetricDimension", "dimensionName");
            }
            this.dimensionName = dimensionName;
            return this;
        }
        @CustomType.Setter
        public Builder dimensionValue(String dimensionValue) {
            if (dimensionValue == null) {
              throw new MissingRequiredPropertyException("VerificationTemplateMetricProviderCloudWatchMetricDataQueryMetricStatMetricDimension", "dimensionValue");
            }
            this.dimensionValue = dimensionValue;
            return this;
        }
        public VerificationTemplateMetricProviderCloudWatchMetricDataQueryMetricStatMetricDimension build() {
            final var _resultValue = new VerificationTemplateMetricProviderCloudWatchMetricDataQueryMetricStatMetricDimension();
            _resultValue.dimensionName = dimensionName;
            _resultValue.dimensionValue = dimensionValue;
            return _resultValue;
        }
    }
}
