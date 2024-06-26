// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.ecs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OceanLaunchSpecAutoscaleHeadroomArgs extends com.pulumi.resources.ResourceArgs {

    public static final OceanLaunchSpecAutoscaleHeadroomArgs Empty = new OceanLaunchSpecAutoscaleHeadroomArgs();

    /**
     * Optionally configure the number of CPUs to allocate for each headroom unit. CPUs are denoted in CPU units, where 1024 units = 1 vCPU.
     * 
     */
    @Import(name="cpuPerUnit")
    private @Nullable Output<Integer> cpuPerUnit;

    /**
     * @return Optionally configure the number of CPUs to allocate for each headroom unit. CPUs are denoted in CPU units, where 1024 units = 1 vCPU.
     * 
     */
    public Optional<Output<Integer>> cpuPerUnit() {
        return Optional.ofNullable(this.cpuPerUnit);
    }

    /**
     * Optionally configure the amount of memory (MiB) to allocate for each headroom unit.
     * 
     */
    @Import(name="memoryPerUnit")
    private @Nullable Output<Integer> memoryPerUnit;

    /**
     * @return Optionally configure the amount of memory (MiB) to allocate for each headroom unit.
     * 
     */
    public Optional<Output<Integer>> memoryPerUnit() {
        return Optional.ofNullable(this.memoryPerUnit);
    }

    /**
     * The number of units to retain as headroom, where each unit has the defined headroom CPU and memory.
     * 
     */
    @Import(name="numOfUnits", required=true)
    private Output<Integer> numOfUnits;

    /**
     * @return The number of units to retain as headroom, where each unit has the defined headroom CPU and memory.
     * 
     */
    public Output<Integer> numOfUnits() {
        return this.numOfUnits;
    }

    private OceanLaunchSpecAutoscaleHeadroomArgs() {}

    private OceanLaunchSpecAutoscaleHeadroomArgs(OceanLaunchSpecAutoscaleHeadroomArgs $) {
        this.cpuPerUnit = $.cpuPerUnit;
        this.memoryPerUnit = $.memoryPerUnit;
        this.numOfUnits = $.numOfUnits;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OceanLaunchSpecAutoscaleHeadroomArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OceanLaunchSpecAutoscaleHeadroomArgs $;

        public Builder() {
            $ = new OceanLaunchSpecAutoscaleHeadroomArgs();
        }

        public Builder(OceanLaunchSpecAutoscaleHeadroomArgs defaults) {
            $ = new OceanLaunchSpecAutoscaleHeadroomArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cpuPerUnit Optionally configure the number of CPUs to allocate for each headroom unit. CPUs are denoted in CPU units, where 1024 units = 1 vCPU.
         * 
         * @return builder
         * 
         */
        public Builder cpuPerUnit(@Nullable Output<Integer> cpuPerUnit) {
            $.cpuPerUnit = cpuPerUnit;
            return this;
        }

        /**
         * @param cpuPerUnit Optionally configure the number of CPUs to allocate for each headroom unit. CPUs are denoted in CPU units, where 1024 units = 1 vCPU.
         * 
         * @return builder
         * 
         */
        public Builder cpuPerUnit(Integer cpuPerUnit) {
            return cpuPerUnit(Output.of(cpuPerUnit));
        }

        /**
         * @param memoryPerUnit Optionally configure the amount of memory (MiB) to allocate for each headroom unit.
         * 
         * @return builder
         * 
         */
        public Builder memoryPerUnit(@Nullable Output<Integer> memoryPerUnit) {
            $.memoryPerUnit = memoryPerUnit;
            return this;
        }

        /**
         * @param memoryPerUnit Optionally configure the amount of memory (MiB) to allocate for each headroom unit.
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
        public Builder numOfUnits(Output<Integer> numOfUnits) {
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

        public OceanLaunchSpecAutoscaleHeadroomArgs build() {
            if ($.numOfUnits == null) {
                throw new MissingRequiredPropertyException("OceanLaunchSpecAutoscaleHeadroomArgs", "numOfUnits");
            }
            return $;
        }
    }

}
