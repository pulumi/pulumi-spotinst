// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.oceancd.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.spotinst.oceancd.inputs.VerificationTemplateMetricProviderJenkinsJenkinsParametersArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VerificationTemplateMetricProviderJenkinsArgs extends com.pulumi.resources.ResourceArgs {

    public static final VerificationTemplateMetricProviderJenkinsArgs Empty = new VerificationTemplateMetricProviderJenkinsArgs();

    @Import(name="jenkinsInterval", required=true)
    private Output<String> jenkinsInterval;

    public Output<String> jenkinsInterval() {
        return this.jenkinsInterval;
    }

    @Import(name="jenkinsParameters")
    private @Nullable Output<VerificationTemplateMetricProviderJenkinsJenkinsParametersArgs> jenkinsParameters;

    public Optional<Output<VerificationTemplateMetricProviderJenkinsJenkinsParametersArgs>> jenkinsParameters() {
        return Optional.ofNullable(this.jenkinsParameters);
    }

    @Import(name="pipelineName", required=true)
    private Output<String> pipelineName;

    public Output<String> pipelineName() {
        return this.pipelineName;
    }

    @Import(name="timeout", required=true)
    private Output<String> timeout;

    public Output<String> timeout() {
        return this.timeout;
    }

    @Import(name="tlsVerification")
    private @Nullable Output<Boolean> tlsVerification;

    public Optional<Output<Boolean>> tlsVerification() {
        return Optional.ofNullable(this.tlsVerification);
    }

    private VerificationTemplateMetricProviderJenkinsArgs() {}

    private VerificationTemplateMetricProviderJenkinsArgs(VerificationTemplateMetricProviderJenkinsArgs $) {
        this.jenkinsInterval = $.jenkinsInterval;
        this.jenkinsParameters = $.jenkinsParameters;
        this.pipelineName = $.pipelineName;
        this.timeout = $.timeout;
        this.tlsVerification = $.tlsVerification;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VerificationTemplateMetricProviderJenkinsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VerificationTemplateMetricProviderJenkinsArgs $;

        public Builder() {
            $ = new VerificationTemplateMetricProviderJenkinsArgs();
        }

        public Builder(VerificationTemplateMetricProviderJenkinsArgs defaults) {
            $ = new VerificationTemplateMetricProviderJenkinsArgs(Objects.requireNonNull(defaults));
        }

        public Builder jenkinsInterval(Output<String> jenkinsInterval) {
            $.jenkinsInterval = jenkinsInterval;
            return this;
        }

        public Builder jenkinsInterval(String jenkinsInterval) {
            return jenkinsInterval(Output.of(jenkinsInterval));
        }

        public Builder jenkinsParameters(@Nullable Output<VerificationTemplateMetricProviderJenkinsJenkinsParametersArgs> jenkinsParameters) {
            $.jenkinsParameters = jenkinsParameters;
            return this;
        }

        public Builder jenkinsParameters(VerificationTemplateMetricProviderJenkinsJenkinsParametersArgs jenkinsParameters) {
            return jenkinsParameters(Output.of(jenkinsParameters));
        }

        public Builder pipelineName(Output<String> pipelineName) {
            $.pipelineName = pipelineName;
            return this;
        }

        public Builder pipelineName(String pipelineName) {
            return pipelineName(Output.of(pipelineName));
        }

        public Builder timeout(Output<String> timeout) {
            $.timeout = timeout;
            return this;
        }

        public Builder timeout(String timeout) {
            return timeout(Output.of(timeout));
        }

        public Builder tlsVerification(@Nullable Output<Boolean> tlsVerification) {
            $.tlsVerification = tlsVerification;
            return this;
        }

        public Builder tlsVerification(Boolean tlsVerification) {
            return tlsVerification(Output.of(tlsVerification));
        }

        public VerificationTemplateMetricProviderJenkinsArgs build() {
            if ($.jenkinsInterval == null) {
                throw new MissingRequiredPropertyException("VerificationTemplateMetricProviderJenkinsArgs", "jenkinsInterval");
            }
            if ($.pipelineName == null) {
                throw new MissingRequiredPropertyException("VerificationTemplateMetricProviderJenkinsArgs", "pipelineName");
            }
            if ($.timeout == null) {
                throw new MissingRequiredPropertyException("VerificationTemplateMetricProviderJenkinsArgs", "timeout");
            }
            return $;
        }
    }

}
