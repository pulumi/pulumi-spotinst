// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OceanResourceTagSpecification {
    /**
     * @return Specify if Volume resources will be tagged with Virtual Node Group tags or Ocean tags.
     * 
     */
    private @Nullable Boolean shouldTagVolumes;

    private OceanResourceTagSpecification() {}
    /**
     * @return Specify if Volume resources will be tagged with Virtual Node Group tags or Ocean tags.
     * 
     */
    public Optional<Boolean> shouldTagVolumes() {
        return Optional.ofNullable(this.shouldTagVolumes);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OceanResourceTagSpecification defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean shouldTagVolumes;
        public Builder() {}
        public Builder(OceanResourceTagSpecification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.shouldTagVolumes = defaults.shouldTagVolumes;
        }

        @CustomType.Setter
        public Builder shouldTagVolumes(@Nullable Boolean shouldTagVolumes) {
            this.shouldTagVolumes = shouldTagVolumes;
            return this;
        }
        public OceanResourceTagSpecification build() {
            final var o = new OceanResourceTagSpecification();
            o.shouldTagVolumes = shouldTagVolumes;
            return o;
        }
    }
}
