// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.azure.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OceanVirtualNodeGroupAutoscaleAutoscaleHeadroomArgs extends com.pulumi.resources.ResourceArgs {

    public static final OceanVirtualNodeGroupAutoscaleAutoscaleHeadroomArgs Empty = new OceanVirtualNodeGroupAutoscaleAutoscaleHeadroomArgs();

    @Import(name="cpuPerUnit")
    private @Nullable Output<Integer> cpuPerUnit;

    public Optional<Output<Integer>> cpuPerUnit() {
        return Optional.ofNullable(this.cpuPerUnit);
    }

    @Import(name="gpuPerUnit")
    private @Nullable Output<Integer> gpuPerUnit;

    public Optional<Output<Integer>> gpuPerUnit() {
        return Optional.ofNullable(this.gpuPerUnit);
    }

    @Import(name="memoryPerUnit")
    private @Nullable Output<Integer> memoryPerUnit;

    public Optional<Output<Integer>> memoryPerUnit() {
        return Optional.ofNullable(this.memoryPerUnit);
    }

    @Import(name="numOfUnits", required=true)
    private Output<Integer> numOfUnits;

    public Output<Integer> numOfUnits() {
        return this.numOfUnits;
    }

    private OceanVirtualNodeGroupAutoscaleAutoscaleHeadroomArgs() {}

    private OceanVirtualNodeGroupAutoscaleAutoscaleHeadroomArgs(OceanVirtualNodeGroupAutoscaleAutoscaleHeadroomArgs $) {
        this.cpuPerUnit = $.cpuPerUnit;
        this.gpuPerUnit = $.gpuPerUnit;
        this.memoryPerUnit = $.memoryPerUnit;
        this.numOfUnits = $.numOfUnits;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OceanVirtualNodeGroupAutoscaleAutoscaleHeadroomArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OceanVirtualNodeGroupAutoscaleAutoscaleHeadroomArgs $;

        public Builder() {
            $ = new OceanVirtualNodeGroupAutoscaleAutoscaleHeadroomArgs();
        }

        public Builder(OceanVirtualNodeGroupAutoscaleAutoscaleHeadroomArgs defaults) {
            $ = new OceanVirtualNodeGroupAutoscaleAutoscaleHeadroomArgs(Objects.requireNonNull(defaults));
        }

        public Builder cpuPerUnit(@Nullable Output<Integer> cpuPerUnit) {
            $.cpuPerUnit = cpuPerUnit;
            return this;
        }

        public Builder cpuPerUnit(Integer cpuPerUnit) {
            return cpuPerUnit(Output.of(cpuPerUnit));
        }

        public Builder gpuPerUnit(@Nullable Output<Integer> gpuPerUnit) {
            $.gpuPerUnit = gpuPerUnit;
            return this;
        }

        public Builder gpuPerUnit(Integer gpuPerUnit) {
            return gpuPerUnit(Output.of(gpuPerUnit));
        }

        public Builder memoryPerUnit(@Nullable Output<Integer> memoryPerUnit) {
            $.memoryPerUnit = memoryPerUnit;
            return this;
        }

        public Builder memoryPerUnit(Integer memoryPerUnit) {
            return memoryPerUnit(Output.of(memoryPerUnit));
        }

        public Builder numOfUnits(Output<Integer> numOfUnits) {
            $.numOfUnits = numOfUnits;
            return this;
        }

        public Builder numOfUnits(Integer numOfUnits) {
            return numOfUnits(Output.of(numOfUnits));
        }

        public OceanVirtualNodeGroupAutoscaleAutoscaleHeadroomArgs build() {
            if ($.numOfUnits == null) {
                throw new MissingRequiredPropertyException("OceanVirtualNodeGroupAutoscaleAutoscaleHeadroomArgs", "numOfUnits");
            }
            return $;
        }
    }

}
