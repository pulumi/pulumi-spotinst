// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.oceancd.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.spotinst.oceancd.inputs.VerificationTemplateArgValueFromSecretKeyRefArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VerificationTemplateArgValueFromArgs extends com.pulumi.resources.ResourceArgs {

    public static final VerificationTemplateArgValueFromArgs Empty = new VerificationTemplateArgValueFromArgs();

    /**
     * Secret key to use.
     * 
     */
    @Import(name="secretKeyRef")
    private @Nullable Output<VerificationTemplateArgValueFromSecretKeyRefArgs> secretKeyRef;

    /**
     * @return Secret key to use.
     * 
     */
    public Optional<Output<VerificationTemplateArgValueFromSecretKeyRefArgs>> secretKeyRef() {
        return Optional.ofNullable(this.secretKeyRef);
    }

    private VerificationTemplateArgValueFromArgs() {}

    private VerificationTemplateArgValueFromArgs(VerificationTemplateArgValueFromArgs $) {
        this.secretKeyRef = $.secretKeyRef;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VerificationTemplateArgValueFromArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VerificationTemplateArgValueFromArgs $;

        public Builder() {
            $ = new VerificationTemplateArgValueFromArgs();
        }

        public Builder(VerificationTemplateArgValueFromArgs defaults) {
            $ = new VerificationTemplateArgValueFromArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param secretKeyRef Secret key to use.
         * 
         * @return builder
         * 
         */
        public Builder secretKeyRef(@Nullable Output<VerificationTemplateArgValueFromSecretKeyRefArgs> secretKeyRef) {
            $.secretKeyRef = secretKeyRef;
            return this;
        }

        /**
         * @param secretKeyRef Secret key to use.
         * 
         * @return builder
         * 
         */
        public Builder secretKeyRef(VerificationTemplateArgValueFromSecretKeyRefArgs secretKeyRef) {
            return secretKeyRef(Output.of(secretKeyRef));
        }

        public VerificationTemplateArgValueFromArgs build() {
            return $;
        }
    }

}
