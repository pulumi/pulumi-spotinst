// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.oceancd.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.spotinst.oceancd.outputs.VerificationTemplateMetricProviderJobSpec;
import java.util.List;
import java.util.Objects;

@CustomType
public final class VerificationTemplateMetricProviderJob {
    /**
     * @return The job spec require to run the metric.
     * 
     */
    private List<VerificationTemplateMetricProviderJobSpec> specs;

    private VerificationTemplateMetricProviderJob() {}
    /**
     * @return The job spec require to run the metric.
     * 
     */
    public List<VerificationTemplateMetricProviderJobSpec> specs() {
        return this.specs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VerificationTemplateMetricProviderJob defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<VerificationTemplateMetricProviderJobSpec> specs;
        public Builder() {}
        public Builder(VerificationTemplateMetricProviderJob defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.specs = defaults.specs;
        }

        @CustomType.Setter
        public Builder specs(List<VerificationTemplateMetricProviderJobSpec> specs) {
            if (specs == null) {
              throw new MissingRequiredPropertyException("VerificationTemplateMetricProviderJob", "specs");
            }
            this.specs = specs;
            return this;
        }
        public Builder specs(VerificationTemplateMetricProviderJobSpec... specs) {
            return specs(List.of(specs));
        }
        public VerificationTemplateMetricProviderJob build() {
            final var _resultValue = new VerificationTemplateMetricProviderJob();
            _resultValue.specs = specs;
            return _resultValue;
        }
    }
}