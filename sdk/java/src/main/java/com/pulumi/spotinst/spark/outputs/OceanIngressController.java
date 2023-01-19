// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.spark.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OceanIngressController {
    private @Nullable Boolean managed;

    private OceanIngressController() {}
    public Optional<Boolean> managed() {
        return Optional.ofNullable(this.managed);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OceanIngressController defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean managed;
        public Builder() {}
        public Builder(OceanIngressController defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.managed = defaults.managed;
        }

        @CustomType.Setter
        public Builder managed(@Nullable Boolean managed) {
            this.managed = managed;
            return this;
        }
        public OceanIngressController build() {
            final var o = new OceanIngressController();
            o.managed = managed;
            return o;
        }
    }
}
