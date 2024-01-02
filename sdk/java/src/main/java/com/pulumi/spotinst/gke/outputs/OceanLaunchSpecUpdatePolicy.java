// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.gke.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.spotinst.gke.outputs.OceanLaunchSpecUpdatePolicyRollConfig;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OceanLaunchSpecUpdatePolicy {
    private @Nullable OceanLaunchSpecUpdatePolicyRollConfig rollConfig;
    private Boolean shouldRoll;

    private OceanLaunchSpecUpdatePolicy() {}
    public Optional<OceanLaunchSpecUpdatePolicyRollConfig> rollConfig() {
        return Optional.ofNullable(this.rollConfig);
    }
    public Boolean shouldRoll() {
        return this.shouldRoll;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OceanLaunchSpecUpdatePolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable OceanLaunchSpecUpdatePolicyRollConfig rollConfig;
        private Boolean shouldRoll;
        public Builder() {}
        public Builder(OceanLaunchSpecUpdatePolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rollConfig = defaults.rollConfig;
    	      this.shouldRoll = defaults.shouldRoll;
        }

        @CustomType.Setter
        public Builder rollConfig(@Nullable OceanLaunchSpecUpdatePolicyRollConfig rollConfig) {

            this.rollConfig = rollConfig;
            return this;
        }
        @CustomType.Setter
        public Builder shouldRoll(Boolean shouldRoll) {
            if (shouldRoll == null) {
              throw new MissingRequiredPropertyException("OceanLaunchSpecUpdatePolicy", "shouldRoll");
            }
            this.shouldRoll = shouldRoll;
            return this;
        }
        public OceanLaunchSpecUpdatePolicy build() {
            final var _resultValue = new OceanLaunchSpecUpdatePolicy();
            _resultValue.rollConfig = rollConfig;
            _resultValue.shouldRoll = shouldRoll;
            return _resultValue;
        }
    }
}
