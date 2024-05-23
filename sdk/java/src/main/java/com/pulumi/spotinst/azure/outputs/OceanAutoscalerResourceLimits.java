// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.azure.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OceanAutoscalerResourceLimits {
    /**
     * @return The maximum memory in GiB units that can be allocated to the cluster.
     * 
     */
    private @Nullable Integer maxMemoryGib;
    /**
     * @return The maximum cpu in vCpu units that can be allocated to the cluster.
     * 
     */
    private @Nullable Integer maxVcpu;

    private OceanAutoscalerResourceLimits() {}
    /**
     * @return The maximum memory in GiB units that can be allocated to the cluster.
     * 
     */
    public Optional<Integer> maxMemoryGib() {
        return Optional.ofNullable(this.maxMemoryGib);
    }
    /**
     * @return The maximum cpu in vCpu units that can be allocated to the cluster.
     * 
     */
    public Optional<Integer> maxVcpu() {
        return Optional.ofNullable(this.maxVcpu);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OceanAutoscalerResourceLimits defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer maxMemoryGib;
        private @Nullable Integer maxVcpu;
        public Builder() {}
        public Builder(OceanAutoscalerResourceLimits defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxMemoryGib = defaults.maxMemoryGib;
    	      this.maxVcpu = defaults.maxVcpu;
        }

        @CustomType.Setter
        public Builder maxMemoryGib(@Nullable Integer maxMemoryGib) {

            this.maxMemoryGib = maxMemoryGib;
            return this;
        }
        @CustomType.Setter
        public Builder maxVcpu(@Nullable Integer maxVcpu) {

            this.maxVcpu = maxVcpu;
            return this;
        }
        public OceanAutoscalerResourceLimits build() {
            final var _resultValue = new OceanAutoscalerResourceLimits();
            _resultValue.maxMemoryGib = maxMemoryGib;
            _resultValue.maxVcpu = maxVcpu;
            return _resultValue;
        }
    }
}
