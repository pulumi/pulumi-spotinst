// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.oceancd.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class VerificationTemplateArgValueFromSecretKeyRef {
    /**
     * @return The name of the field inside the secret.
     * 
     */
    private String key;
    /**
     * @return The name of the secret.
     * 
     */
    private String name;

    private VerificationTemplateArgValueFromSecretKeyRef() {}
    /**
     * @return The name of the field inside the secret.
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return The name of the secret.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VerificationTemplateArgValueFromSecretKeyRef defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String key;
        private String name;
        public Builder() {}
        public Builder(VerificationTemplateArgValueFromSecretKeyRef defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder key(String key) {
            if (key == null) {
              throw new MissingRequiredPropertyException("VerificationTemplateArgValueFromSecretKeyRef", "key");
            }
            this.key = key;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("VerificationTemplateArgValueFromSecretKeyRef", "name");
            }
            this.name = name;
            return this;
        }
        public VerificationTemplateArgValueFromSecretKeyRef build() {
            final var _resultValue = new VerificationTemplateArgValueFromSecretKeyRef();
            _resultValue.key = key;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
