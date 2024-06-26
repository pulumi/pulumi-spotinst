// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.oceancd.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class VerificationTemplateMetricProviderJenkinsJenkinsParametersArgs extends com.pulumi.resources.ResourceArgs {

    public static final VerificationTemplateMetricProviderJenkinsJenkinsParametersArgs Empty = new VerificationTemplateMetricProviderJenkinsJenkinsParametersArgs();

    /**
     * Key of an argument.
     * 
     */
    @Import(name="parameterKey", required=true)
    private Output<String> parameterKey;

    /**
     * @return Key of an argument.
     * 
     */
    public Output<String> parameterKey() {
        return this.parameterKey;
    }

    /**
     * Value of an argument.
     * 
     */
    @Import(name="parameterValue", required=true)
    private Output<String> parameterValue;

    /**
     * @return Value of an argument.
     * 
     */
    public Output<String> parameterValue() {
        return this.parameterValue;
    }

    private VerificationTemplateMetricProviderJenkinsJenkinsParametersArgs() {}

    private VerificationTemplateMetricProviderJenkinsJenkinsParametersArgs(VerificationTemplateMetricProviderJenkinsJenkinsParametersArgs $) {
        this.parameterKey = $.parameterKey;
        this.parameterValue = $.parameterValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VerificationTemplateMetricProviderJenkinsJenkinsParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VerificationTemplateMetricProviderJenkinsJenkinsParametersArgs $;

        public Builder() {
            $ = new VerificationTemplateMetricProviderJenkinsJenkinsParametersArgs();
        }

        public Builder(VerificationTemplateMetricProviderJenkinsJenkinsParametersArgs defaults) {
            $ = new VerificationTemplateMetricProviderJenkinsJenkinsParametersArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param parameterKey Key of an argument.
         * 
         * @return builder
         * 
         */
        public Builder parameterKey(Output<String> parameterKey) {
            $.parameterKey = parameterKey;
            return this;
        }

        /**
         * @param parameterKey Key of an argument.
         * 
         * @return builder
         * 
         */
        public Builder parameterKey(String parameterKey) {
            return parameterKey(Output.of(parameterKey));
        }

        /**
         * @param parameterValue Value of an argument.
         * 
         * @return builder
         * 
         */
        public Builder parameterValue(Output<String> parameterValue) {
            $.parameterValue = parameterValue;
            return this;
        }

        /**
         * @param parameterValue Value of an argument.
         * 
         * @return builder
         * 
         */
        public Builder parameterValue(String parameterValue) {
            return parameterValue(Output.of(parameterValue));
        }

        public VerificationTemplateMetricProviderJenkinsJenkinsParametersArgs build() {
            if ($.parameterKey == null) {
                throw new MissingRequiredPropertyException("VerificationTemplateMetricProviderJenkinsJenkinsParametersArgs", "parameterKey");
            }
            if ($.parameterValue == null) {
                throw new MissingRequiredPropertyException("VerificationTemplateMetricProviderJenkinsJenkinsParametersArgs", "parameterValue");
            }
            return $;
        }
    }

}
