// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OceanAutoscalerAutoscaleHeadroomArgs extends com.pulumi.resources.ResourceArgs {

    public static final OceanAutoscalerAutoscaleHeadroomArgs Empty = new OceanAutoscalerAutoscaleHeadroomArgs();

    /**
     * Optionally configure the number of CPUs to allocate the headroom. CPUs are denoted in millicores, where 1000 millicores = 1 vCPU.
     * 
     */
    @Import(name="cpuPerUnit")
    private @Nullable Output<Integer> cpuPerUnit;

    /**
     * @return Optionally configure the number of CPUs to allocate the headroom. CPUs are denoted in millicores, where 1000 millicores = 1 vCPU.
     * 
     */
    public Optional<Output<Integer>> cpuPerUnit() {
        return Optional.ofNullable(this.cpuPerUnit);
    }

    /**
     * Optionally configure the number of GPUs to allocate the headroom.
     * 
     */
    @Import(name="gpuPerUnit")
    private @Nullable Output<Integer> gpuPerUnit;

    /**
     * @return Optionally configure the number of GPUs to allocate the headroom.
     * 
     */
    public Optional<Output<Integer>> gpuPerUnit() {
        return Optional.ofNullable(this.gpuPerUnit);
    }

    /**
     * Optionally configure the amount of memory (MB) to allocate the headroom.
     * 
     */
    @Import(name="memoryPerUnit")
    private @Nullable Output<Integer> memoryPerUnit;

    /**
     * @return Optionally configure the amount of memory (MB) to allocate the headroom.
     * 
     */
    public Optional<Output<Integer>> memoryPerUnit() {
        return Optional.ofNullable(this.memoryPerUnit);
    }

    /**
     * The number of units to retain as headroom, where each unit has the defined headroom CPU and memory.
     * 
     */
    @Import(name="numOfUnits")
    private @Nullable Output<Integer> numOfUnits;

    /**
     * @return The number of units to retain as headroom, where each unit has the defined headroom CPU and memory.
     * 
     */
    public Optional<Output<Integer>> numOfUnits() {
        return Optional.ofNullable(this.numOfUnits);
    }

    private OceanAutoscalerAutoscaleHeadroomArgs() {}

    private OceanAutoscalerAutoscaleHeadroomArgs(OceanAutoscalerAutoscaleHeadroomArgs $) {
        this.cpuPerUnit = $.cpuPerUnit;
        this.gpuPerUnit = $.gpuPerUnit;
        this.memoryPerUnit = $.memoryPerUnit;
        this.numOfUnits = $.numOfUnits;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OceanAutoscalerAutoscaleHeadroomArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OceanAutoscalerAutoscaleHeadroomArgs $;

        public Builder() {
            $ = new OceanAutoscalerAutoscaleHeadroomArgs();
        }

        public Builder(OceanAutoscalerAutoscaleHeadroomArgs defaults) {
            $ = new OceanAutoscalerAutoscaleHeadroomArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cpuPerUnit Optionally configure the number of CPUs to allocate the headroom. CPUs are denoted in millicores, where 1000 millicores = 1 vCPU.
         * 
         * @return builder
         * 
         */
        public Builder cpuPerUnit(@Nullable Output<Integer> cpuPerUnit) {
            $.cpuPerUnit = cpuPerUnit;
            return this;
        }

        /**
         * @param cpuPerUnit Optionally configure the number of CPUs to allocate the headroom. CPUs are denoted in millicores, where 1000 millicores = 1 vCPU.
         * 
         * @return builder
         * 
         */
        public Builder cpuPerUnit(Integer cpuPerUnit) {
            return cpuPerUnit(Output.of(cpuPerUnit));
        }

        /**
         * @param gpuPerUnit Optionally configure the number of GPUs to allocate the headroom.
         * 
         * @return builder
         * 
         */
        public Builder gpuPerUnit(@Nullable Output<Integer> gpuPerUnit) {
            $.gpuPerUnit = gpuPerUnit;
            return this;
        }

        /**
         * @param gpuPerUnit Optionally configure the number of GPUs to allocate the headroom.
         * 
         * @return builder
         * 
         */
        public Builder gpuPerUnit(Integer gpuPerUnit) {
            return gpuPerUnit(Output.of(gpuPerUnit));
        }

        /**
         * @param memoryPerUnit Optionally configure the amount of memory (MB) to allocate the headroom.
         * 
         * @return builder
         * 
         */
        public Builder memoryPerUnit(@Nullable Output<Integer> memoryPerUnit) {
            $.memoryPerUnit = memoryPerUnit;
            return this;
        }

        /**
         * @param memoryPerUnit Optionally configure the amount of memory (MB) to allocate the headroom.
         * 
         * @return builder
         * 
         */
        public Builder memoryPerUnit(Integer memoryPerUnit) {
            return memoryPerUnit(Output.of(memoryPerUnit));
        }

        /**
         * @param numOfUnits The number of units to retain as headroom, where each unit has the defined headroom CPU and memory.
         * 
         * @return builder
         * 
         */
        public Builder numOfUnits(@Nullable Output<Integer> numOfUnits) {
            $.numOfUnits = numOfUnits;
            return this;
        }

        /**
         * @param numOfUnits The number of units to retain as headroom, where each unit has the defined headroom CPU and memory.
         * 
         * @return builder
         * 
         */
        public Builder numOfUnits(Integer numOfUnits) {
            return numOfUnits(Output.of(numOfUnits));
        }

        public OceanAutoscalerAutoscaleHeadroomArgs build() {
            return $;
        }
    }

}
