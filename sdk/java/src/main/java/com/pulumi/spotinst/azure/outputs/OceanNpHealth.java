// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.azure.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OceanNpHealth {
    /**
     * @return The amount of time to wait, in seconds, from the moment the instance has launched until monitoring of its health checks begins.
     * 
     */
    private @Nullable Integer gracePeriod;

    private OceanNpHealth() {}
    /**
     * @return The amount of time to wait, in seconds, from the moment the instance has launched until monitoring of its health checks begins.
     * 
     */
    public Optional<Integer> gracePeriod() {
        return Optional.ofNullable(this.gracePeriod);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OceanNpHealth defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer gracePeriod;
        public Builder() {}
        public Builder(OceanNpHealth defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gracePeriod = defaults.gracePeriod;
        }

        @CustomType.Setter
        public Builder gracePeriod(@Nullable Integer gracePeriod) {

            this.gracePeriod = gracePeriod;
            return this;
        }
        public OceanNpHealth build() {
            final var _resultValue = new OceanNpHealth();
            _resultValue.gracePeriod = gracePeriod;
            return _resultValue;
        }
    }
}