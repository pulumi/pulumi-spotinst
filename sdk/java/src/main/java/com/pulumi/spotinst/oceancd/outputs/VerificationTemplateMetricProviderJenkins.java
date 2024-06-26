// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.oceancd.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.spotinst.oceancd.outputs.VerificationTemplateMetricProviderJenkinsJenkinsParameters;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VerificationTemplateMetricProviderJenkins {
    /**
     * @return The interval time to poll status.
     * 
     */
    private String jenkinsInterval;
    /**
     * @return List of parameters.
     * 
     */
    private @Nullable VerificationTemplateMetricProviderJenkinsJenkinsParameters jenkinsParameters;
    /**
     * @return The Jenkins pipeline name.
     * 
     */
    private String pipelineName;
    /**
     * @return The total jenkins timeout.
     * 
     */
    private String timeout;
    /**
     * @return Host TLS verification.
     * 
     */
    private @Nullable Boolean tlsVerification;

    private VerificationTemplateMetricProviderJenkins() {}
    /**
     * @return The interval time to poll status.
     * 
     */
    public String jenkinsInterval() {
        return this.jenkinsInterval;
    }
    /**
     * @return List of parameters.
     * 
     */
    public Optional<VerificationTemplateMetricProviderJenkinsJenkinsParameters> jenkinsParameters() {
        return Optional.ofNullable(this.jenkinsParameters);
    }
    /**
     * @return The Jenkins pipeline name.
     * 
     */
    public String pipelineName() {
        return this.pipelineName;
    }
    /**
     * @return The total jenkins timeout.
     * 
     */
    public String timeout() {
        return this.timeout;
    }
    /**
     * @return Host TLS verification.
     * 
     */
    public Optional<Boolean> tlsVerification() {
        return Optional.ofNullable(this.tlsVerification);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VerificationTemplateMetricProviderJenkins defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String jenkinsInterval;
        private @Nullable VerificationTemplateMetricProviderJenkinsJenkinsParameters jenkinsParameters;
        private String pipelineName;
        private String timeout;
        private @Nullable Boolean tlsVerification;
        public Builder() {}
        public Builder(VerificationTemplateMetricProviderJenkins defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jenkinsInterval = defaults.jenkinsInterval;
    	      this.jenkinsParameters = defaults.jenkinsParameters;
    	      this.pipelineName = defaults.pipelineName;
    	      this.timeout = defaults.timeout;
    	      this.tlsVerification = defaults.tlsVerification;
        }

        @CustomType.Setter
        public Builder jenkinsInterval(String jenkinsInterval) {
            if (jenkinsInterval == null) {
              throw new MissingRequiredPropertyException("VerificationTemplateMetricProviderJenkins", "jenkinsInterval");
            }
            this.jenkinsInterval = jenkinsInterval;
            return this;
        }
        @CustomType.Setter
        public Builder jenkinsParameters(@Nullable VerificationTemplateMetricProviderJenkinsJenkinsParameters jenkinsParameters) {

            this.jenkinsParameters = jenkinsParameters;
            return this;
        }
        @CustomType.Setter
        public Builder pipelineName(String pipelineName) {
            if (pipelineName == null) {
              throw new MissingRequiredPropertyException("VerificationTemplateMetricProviderJenkins", "pipelineName");
            }
            this.pipelineName = pipelineName;
            return this;
        }
        @CustomType.Setter
        public Builder timeout(String timeout) {
            if (timeout == null) {
              throw new MissingRequiredPropertyException("VerificationTemplateMetricProviderJenkins", "timeout");
            }
            this.timeout = timeout;
            return this;
        }
        @CustomType.Setter
        public Builder tlsVerification(@Nullable Boolean tlsVerification) {

            this.tlsVerification = tlsVerification;
            return this;
        }
        public VerificationTemplateMetricProviderJenkins build() {
            final var _resultValue = new VerificationTemplateMetricProviderJenkins();
            _resultValue.jenkinsInterval = jenkinsInterval;
            _resultValue.jenkinsParameters = jenkinsParameters;
            _resultValue.pipelineName = pipelineName;
            _resultValue.timeout = timeout;
            _resultValue.tlsVerification = tlsVerification;
            return _resultValue;
        }
    }
}
