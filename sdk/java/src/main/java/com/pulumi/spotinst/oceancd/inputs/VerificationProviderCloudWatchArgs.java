// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.oceancd.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class VerificationProviderCloudWatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final VerificationProviderCloudWatchArgs Empty = new VerificationProviderCloudWatchArgs();

    /**
     * Set label key.
     * 
     */
    @Import(name="iamArn", required=true)
    private Output<String> iamArn;

    /**
     * @return Set label key.
     * 
     */
    public Output<String> iamArn() {
        return this.iamArn;
    }

    private VerificationProviderCloudWatchArgs() {}

    private VerificationProviderCloudWatchArgs(VerificationProviderCloudWatchArgs $) {
        this.iamArn = $.iamArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VerificationProviderCloudWatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VerificationProviderCloudWatchArgs $;

        public Builder() {
            $ = new VerificationProviderCloudWatchArgs();
        }

        public Builder(VerificationProviderCloudWatchArgs defaults) {
            $ = new VerificationProviderCloudWatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param iamArn Set label key.
         * 
         * @return builder
         * 
         */
        public Builder iamArn(Output<String> iamArn) {
            $.iamArn = iamArn;
            return this;
        }

        /**
         * @param iamArn Set label key.
         * 
         * @return builder
         * 
         */
        public Builder iamArn(String iamArn) {
            return iamArn(Output.of(iamArn));
        }

        public VerificationProviderCloudWatchArgs build() {
            if ($.iamArn == null) {
                throw new MissingRequiredPropertyException("VerificationProviderCloudWatchArgs", "iamArn");
            }
            return $;
        }
    }

}
