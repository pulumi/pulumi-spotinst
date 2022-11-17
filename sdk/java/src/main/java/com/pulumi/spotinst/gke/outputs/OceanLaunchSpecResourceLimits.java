// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.gke.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OceanLaunchSpecResourceLimits {
    /**
     * @return Option to set a maximum number of instances per virtual node group. Can be null. If set, the value must be greater than or equal to 0.
     * 
     */
    private @Nullable Integer maxInstanceCount;
    /**
     * @return Option to set a minimum number of instances per virtual node group. Can be null. If set, the value must be greater than or equal to 0.
     * 
     */
    private @Nullable Integer minInstanceCount;

    private OceanLaunchSpecResourceLimits() {}
    /**
     * @return Option to set a maximum number of instances per virtual node group. Can be null. If set, the value must be greater than or equal to 0.
     * 
     */
    public Optional<Integer> maxInstanceCount() {
        return Optional.ofNullable(this.maxInstanceCount);
    }
    /**
     * @return Option to set a minimum number of instances per virtual node group. Can be null. If set, the value must be greater than or equal to 0.
     * 
     */
    public Optional<Integer> minInstanceCount() {
        return Optional.ofNullable(this.minInstanceCount);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OceanLaunchSpecResourceLimits defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer maxInstanceCount;
        private @Nullable Integer minInstanceCount;
        public Builder() {}
        public Builder(OceanLaunchSpecResourceLimits defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxInstanceCount = defaults.maxInstanceCount;
    	      this.minInstanceCount = defaults.minInstanceCount;
        }

        @CustomType.Setter
        public Builder maxInstanceCount(@Nullable Integer maxInstanceCount) {
            this.maxInstanceCount = maxInstanceCount;
            return this;
        }
        @CustomType.Setter
        public Builder minInstanceCount(@Nullable Integer minInstanceCount) {
            this.minInstanceCount = minInstanceCount;
            return this;
        }
        public OceanLaunchSpecResourceLimits build() {
            final var o = new OceanLaunchSpecResourceLimits();
            o.maxInstanceCount = maxInstanceCount;
            o.minInstanceCount = minInstanceCount;
            return o;
        }
    }
}
