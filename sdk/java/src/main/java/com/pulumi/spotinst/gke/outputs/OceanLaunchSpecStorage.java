// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.gke.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OceanLaunchSpecStorage {
    /**
     * @return Defines the number of local SSDs to be attached per node for this VNG.
     * 
     */
    private @Nullable Integer localSsdCount;

    private OceanLaunchSpecStorage() {}
    /**
     * @return Defines the number of local SSDs to be attached per node for this VNG.
     * 
     */
    public Optional<Integer> localSsdCount() {
        return Optional.ofNullable(this.localSsdCount);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OceanLaunchSpecStorage defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer localSsdCount;
        public Builder() {}
        public Builder(OceanLaunchSpecStorage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.localSsdCount = defaults.localSsdCount;
        }

        @CustomType.Setter
        public Builder localSsdCount(@Nullable Integer localSsdCount) {
            this.localSsdCount = localSsdCount;
            return this;
        }
        public OceanLaunchSpecStorage build() {
            final var _resultValue = new OceanLaunchSpecStorage();
            _resultValue.localSsdCount = localSsdCount;
            return _resultValue;
        }
    }
}
