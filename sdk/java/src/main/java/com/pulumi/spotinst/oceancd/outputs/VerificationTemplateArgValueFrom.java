// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.oceancd.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.spotinst.oceancd.outputs.VerificationTemplateArgValueFromSecretKeyRef;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VerificationTemplateArgValueFrom {
    private @Nullable VerificationTemplateArgValueFromSecretKeyRef secretKeyRef;

    private VerificationTemplateArgValueFrom() {}
    public Optional<VerificationTemplateArgValueFromSecretKeyRef> secretKeyRef() {
        return Optional.ofNullable(this.secretKeyRef);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VerificationTemplateArgValueFrom defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable VerificationTemplateArgValueFromSecretKeyRef secretKeyRef;
        public Builder() {}
        public Builder(VerificationTemplateArgValueFrom defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.secretKeyRef = defaults.secretKeyRef;
        }

        @CustomType.Setter
        public Builder secretKeyRef(@Nullable VerificationTemplateArgValueFromSecretKeyRef secretKeyRef) {

            this.secretKeyRef = secretKeyRef;
            return this;
        }
        public VerificationTemplateArgValueFrom build() {
            final var _resultValue = new VerificationTemplateArgValueFrom();
            _resultValue.secretKeyRef = secretKeyRef;
            return _resultValue;
        }
    }
}
