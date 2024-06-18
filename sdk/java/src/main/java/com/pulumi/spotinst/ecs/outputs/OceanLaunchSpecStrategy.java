// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.ecs.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OceanLaunchSpecStrategy {
    /**
     * @return When set, Ocean will proactively try to maintain as close as possible to the percentage of Spot instances out of all the Virtual Node Group instances.
     * 
     */
    private @Nullable Integer spotPercentage;

    private OceanLaunchSpecStrategy() {}
    /**
     * @return When set, Ocean will proactively try to maintain as close as possible to the percentage of Spot instances out of all the Virtual Node Group instances.
     * 
     */
    public Optional<Integer> spotPercentage() {
        return Optional.ofNullable(this.spotPercentage);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OceanLaunchSpecStrategy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer spotPercentage;
        public Builder() {}
        public Builder(OceanLaunchSpecStrategy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.spotPercentage = defaults.spotPercentage;
        }

        @CustomType.Setter
        public Builder spotPercentage(@Nullable Integer spotPercentage) {

            this.spotPercentage = spotPercentage;
            return this;
        }
        public OceanLaunchSpecStrategy build() {
            final var _resultValue = new OceanLaunchSpecStrategy();
            _resultValue.spotPercentage = spotPercentage;
            return _resultValue;
        }
    }
}
