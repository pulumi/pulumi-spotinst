// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.oceancd.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class VerificationProviderCloudWatch {
    /**
     * @return Set label key.
     * 
     */
    private String iamArn;

    private VerificationProviderCloudWatch() {}
    /**
     * @return Set label key.
     * 
     */
    public String iamArn() {
        return this.iamArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VerificationProviderCloudWatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String iamArn;
        public Builder() {}
        public Builder(VerificationProviderCloudWatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.iamArn = defaults.iamArn;
        }

        @CustomType.Setter
        public Builder iamArn(String iamArn) {
            if (iamArn == null) {
              throw new MissingRequiredPropertyException("VerificationProviderCloudWatch", "iamArn");
            }
            this.iamArn = iamArn;
            return this;
        }
        public VerificationProviderCloudWatch build() {
            final var _resultValue = new VerificationProviderCloudWatch();
            _resultValue.iamArn = iamArn;
            return _resultValue;
        }
    }
}