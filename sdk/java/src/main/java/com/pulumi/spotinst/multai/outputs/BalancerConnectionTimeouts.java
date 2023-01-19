// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.multai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BalancerConnectionTimeouts {
    private @Nullable Integer draining;
    private @Nullable Integer idle;

    private BalancerConnectionTimeouts() {}
    public Optional<Integer> draining() {
        return Optional.ofNullable(this.draining);
    }
    public Optional<Integer> idle() {
        return Optional.ofNullable(this.idle);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BalancerConnectionTimeouts defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer draining;
        private @Nullable Integer idle;
        public Builder() {}
        public Builder(BalancerConnectionTimeouts defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.draining = defaults.draining;
    	      this.idle = defaults.idle;
        }

        @CustomType.Setter
        public Builder draining(@Nullable Integer draining) {
            this.draining = draining;
            return this;
        }
        @CustomType.Setter
        public Builder idle(@Nullable Integer idle) {
            this.idle = idle;
            return this;
        }
        public BalancerConnectionTimeouts build() {
            final var o = new BalancerConnectionTimeouts();
            o.draining = draining;
            o.idle = idle;
            return o;
        }
    }
}