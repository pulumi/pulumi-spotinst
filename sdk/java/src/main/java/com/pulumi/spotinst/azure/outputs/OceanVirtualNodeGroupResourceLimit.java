// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.azure.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OceanVirtualNodeGroupResourceLimit {
    /**
     * @return Option to set a maximum number of instances per virtual node group. If set, value must be greater than or equal to 0.
     * 
     */
    private @Nullable Integer maxInstanceCount;

    private OceanVirtualNodeGroupResourceLimit() {}
    /**
     * @return Option to set a maximum number of instances per virtual node group. If set, value must be greater than or equal to 0.
     * 
     */
    public Optional<Integer> maxInstanceCount() {
        return Optional.ofNullable(this.maxInstanceCount);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OceanVirtualNodeGroupResourceLimit defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer maxInstanceCount;
        public Builder() {}
        public Builder(OceanVirtualNodeGroupResourceLimit defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxInstanceCount = defaults.maxInstanceCount;
        }

        @CustomType.Setter
        public Builder maxInstanceCount(@Nullable Integer maxInstanceCount) {

            this.maxInstanceCount = maxInstanceCount;
            return this;
        }
        public OceanVirtualNodeGroupResourceLimit build() {
            final var _resultValue = new OceanVirtualNodeGroupResourceLimit();
            _resultValue.maxInstanceCount = maxInstanceCount;
            return _resultValue;
        }
    }
}