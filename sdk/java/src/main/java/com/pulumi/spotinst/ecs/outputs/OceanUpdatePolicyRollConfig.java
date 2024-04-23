// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.ecs.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OceanUpdatePolicyRollConfig {
    private @Nullable Integer batchMinHealthyPercentage;
    private Integer batchSizePercentage;

    private OceanUpdatePolicyRollConfig() {}
    public Optional<Integer> batchMinHealthyPercentage() {
        return Optional.ofNullable(this.batchMinHealthyPercentage);
    }
    public Integer batchSizePercentage() {
        return this.batchSizePercentage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OceanUpdatePolicyRollConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer batchMinHealthyPercentage;
        private Integer batchSizePercentage;
        public Builder() {}
        public Builder(OceanUpdatePolicyRollConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.batchMinHealthyPercentage = defaults.batchMinHealthyPercentage;
    	      this.batchSizePercentage = defaults.batchSizePercentage;
        }

        @CustomType.Setter
        public Builder batchMinHealthyPercentage(@Nullable Integer batchMinHealthyPercentage) {

            this.batchMinHealthyPercentage = batchMinHealthyPercentage;
            return this;
        }
        @CustomType.Setter
        public Builder batchSizePercentage(Integer batchSizePercentage) {
            if (batchSizePercentage == null) {
              throw new MissingRequiredPropertyException("OceanUpdatePolicyRollConfig", "batchSizePercentage");
            }
            this.batchSizePercentage = batchSizePercentage;
            return this;
        }
        public OceanUpdatePolicyRollConfig build() {
            final var _resultValue = new OceanUpdatePolicyRollConfig();
            _resultValue.batchMinHealthyPercentage = batchMinHealthyPercentage;
            _resultValue.batchSizePercentage = batchSizePercentage;
            return _resultValue;
        }
    }
}
