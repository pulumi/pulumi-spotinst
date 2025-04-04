// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OceanInstanceStorePolicy {
    /**
     * @return Value: `&#34;RAID0&#34;` The method for using the instance store volumes (must also be defined in the userData).
     * 
     */
    private @Nullable String instanceStorePolicyType;

    private OceanInstanceStorePolicy() {}
    /**
     * @return Value: `&#34;RAID0&#34;` The method for using the instance store volumes (must also be defined in the userData).
     * 
     */
    public Optional<String> instanceStorePolicyType() {
        return Optional.ofNullable(this.instanceStorePolicyType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OceanInstanceStorePolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String instanceStorePolicyType;
        public Builder() {}
        public Builder(OceanInstanceStorePolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceStorePolicyType = defaults.instanceStorePolicyType;
        }

        @CustomType.Setter
        public Builder instanceStorePolicyType(@Nullable String instanceStorePolicyType) {

            this.instanceStorePolicyType = instanceStorePolicyType;
            return this;
        }
        public OceanInstanceStorePolicy build() {
            final var _resultValue = new OceanInstanceStorePolicy();
            _resultValue.instanceStorePolicyType = instanceStorePolicyType;
            return _resultValue;
        }
    }
}
