// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.azure.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OceanVirtualNodeGroupAutoscaleAutoscaleHeadroom {
    /**
     * @return Configure the number of CPUs to allocate for the headroom. CPUs are denoted in millicores, where 1000 millicores = 1 vCPU.
     * 
     */
    private @Nullable Integer cpuPerUnit;
    /**
     * @return How many GPU cores should be allocated for headroom unit.
     * 
     */
    private @Nullable Integer gpuPerUnit;
    /**
     * @return Configure the amount of memory (MiB) to allocate the headroom.
     * 
     */
    private @Nullable Integer memoryPerUnit;
    /**
     * @return The number of headroom units to maintain, where each unit has the defined CPU, memory and GPU.
     * 
     */
    private Integer numOfUnits;

    private OceanVirtualNodeGroupAutoscaleAutoscaleHeadroom() {}
    /**
     * @return Configure the number of CPUs to allocate for the headroom. CPUs are denoted in millicores, where 1000 millicores = 1 vCPU.
     * 
     */
    public Optional<Integer> cpuPerUnit() {
        return Optional.ofNullable(this.cpuPerUnit);
    }
    /**
     * @return How many GPU cores should be allocated for headroom unit.
     * 
     */
    public Optional<Integer> gpuPerUnit() {
        return Optional.ofNullable(this.gpuPerUnit);
    }
    /**
     * @return Configure the amount of memory (MiB) to allocate the headroom.
     * 
     */
    public Optional<Integer> memoryPerUnit() {
        return Optional.ofNullable(this.memoryPerUnit);
    }
    /**
     * @return The number of headroom units to maintain, where each unit has the defined CPU, memory and GPU.
     * 
     */
    public Integer numOfUnits() {
        return this.numOfUnits;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OceanVirtualNodeGroupAutoscaleAutoscaleHeadroom defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer cpuPerUnit;
        private @Nullable Integer gpuPerUnit;
        private @Nullable Integer memoryPerUnit;
        private Integer numOfUnits;
        public Builder() {}
        public Builder(OceanVirtualNodeGroupAutoscaleAutoscaleHeadroom defaults) {
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
            if (numOfUnits == null) {
              throw new MissingRequiredPropertyException("OceanVirtualNodeGroupAutoscaleAutoscaleHeadroom", "numOfUnits");
            }
            this.numOfUnits = numOfUnits;
            return this;
        }
        public OceanVirtualNodeGroupAutoscaleAutoscaleHeadroom build() {
            final var _resultValue = new OceanVirtualNodeGroupAutoscaleAutoscaleHeadroom();
            _resultValue.cpuPerUnit = cpuPerUnit;
            _resultValue.gpuPerUnit = gpuPerUnit;
            _resultValue.memoryPerUnit = memoryPerUnit;
            _resultValue.numOfUnits = numOfUnits;
            return _resultValue;
        }
    }
}
