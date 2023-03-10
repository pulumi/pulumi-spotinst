// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.azure.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OceanNpVirtualNodeGroupHeadroom {
    private @Nullable Integer cpuPerUnit;
    private @Nullable Integer gpuPerUnit;
    private @Nullable Integer memoryPerUnit;
    private Integer numOfUnits;

    private OceanNpVirtualNodeGroupHeadroom() {}
    public Optional<Integer> cpuPerUnit() {
        return Optional.ofNullable(this.cpuPerUnit);
    }
    public Optional<Integer> gpuPerUnit() {
        return Optional.ofNullable(this.gpuPerUnit);
    }
    public Optional<Integer> memoryPerUnit() {
        return Optional.ofNullable(this.memoryPerUnit);
    }
    public Integer numOfUnits() {
        return this.numOfUnits;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OceanNpVirtualNodeGroupHeadroom defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer cpuPerUnit;
        private @Nullable Integer gpuPerUnit;
        private @Nullable Integer memoryPerUnit;
        private Integer numOfUnits;
        public Builder() {}
        public Builder(OceanNpVirtualNodeGroupHeadroom defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpuPerUnit = defaults.cpuPerUnit;
    	      this.gpuPerUnit = defaults.gpuPerUnit;
    	      this.memoryPerUnit = defaults.memoryPerUnit;
    	      this.numOfUnits = defaults.numOfUnits;
        }

        @CustomType.Setter
        public Builder cpuPerUnit(@Nullable Integer cpuPerUnit) {
            this.cpuPerUnit = cpuPerUnit;
            return this;
        }
        @CustomType.Setter
        public Builder gpuPerUnit(@Nullable Integer gpuPerUnit) {
            this.gpuPerUnit = gpuPerUnit;
            return this;
        }
        @CustomType.Setter
        public Builder memoryPerUnit(@Nullable Integer memoryPerUnit) {
            this.memoryPerUnit = memoryPerUnit;
            return this;
        }
        @CustomType.Setter
        public Builder numOfUnits(Integer numOfUnits) {
            this.numOfUnits = Objects.requireNonNull(numOfUnits);
            return this;
        }
        public OceanNpVirtualNodeGroupHeadroom build() {
            final var o = new OceanNpVirtualNodeGroupHeadroom();
            o.cpuPerUnit = cpuPerUnit;
            o.gpuPerUnit = gpuPerUnit;
            o.memoryPerUnit = memoryPerUnit;
            o.numOfUnits = numOfUnits;
            return o;
        }
    }
}
