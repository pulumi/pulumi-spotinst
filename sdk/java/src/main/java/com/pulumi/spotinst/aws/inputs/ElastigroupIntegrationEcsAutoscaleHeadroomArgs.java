// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ElastigroupIntegrationEcsAutoscaleHeadroomArgs extends com.pulumi.resources.ResourceArgs {

    public static final ElastigroupIntegrationEcsAutoscaleHeadroomArgs Empty = new ElastigroupIntegrationEcsAutoscaleHeadroomArgs();

    /**
     * How much CPU (MHz) to allocate for headroom unit.
     * 
     */
    @Import(name="cpuPerUnit")
    private @Nullable Output<Integer> cpuPerUnit;

    /**
     * @return How much CPU (MHz) to allocate for headroom unit.
     * 
     */
    public Optional<Output<Integer>> cpuPerUnit() {
        return Optional.ofNullable(this.cpuPerUnit);
    }

    /**
     * How much Memory allocate for headroom unit.
     * 
     */
    @Import(name="memoryPerUnit")
    private @Nullable Output<Integer> memoryPerUnit;

    /**
     * @return How much Memory allocate for headroom unit.
     * 
     */
    public Optional<Output<Integer>> memoryPerUnit() {
        return Optional.ofNullable(this.memoryPerUnit);
    }

    /**
     * How many units of headroom to allocate.
     * 
     */
    @Import(name="numOfUnits")
    private @Nullable Output<Integer> numOfUnits;

    /**
     * @return How many units of headroom to allocate.
     * 
     */
    public Optional<Output<Integer>> numOfUnits() {
        return Optional.ofNullable(this.numOfUnits);
    }

    private ElastigroupIntegrationEcsAutoscaleHeadroomArgs() {}

    private ElastigroupIntegrationEcsAutoscaleHeadroomArgs(ElastigroupIntegrationEcsAutoscaleHeadroomArgs $) {
        this.cpuPerUnit = $.cpuPerUnit;
        this.memoryPerUnit = $.memoryPerUnit;
        this.numOfUnits = $.numOfUnits;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ElastigroupIntegrationEcsAutoscaleHeadroomArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ElastigroupIntegrationEcsAutoscaleHeadroomArgs $;

        public Builder() {
            $ = new ElastigroupIntegrationEcsAutoscaleHeadroomArgs();
        }

        public Builder(ElastigroupIntegrationEcsAutoscaleHeadroomArgs defaults) {
            $ = new ElastigroupIntegrationEcsAutoscaleHeadroomArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cpuPerUnit How much CPU (MHz) to allocate for headroom unit.
         * 
         * @return builder
         * 
         */
        public Builder cpuPerUnit(@Nullable Output<Integer> cpuPerUnit) {
            $.cpuPerUnit = cpuPerUnit;
            return this;
        }

        /**
         * @param cpuPerUnit How much CPU (MHz) to allocate for headroom unit.
         * 
         * @return builder
         * 
         */
        public Builder cpuPerUnit(Integer cpuPerUnit) {
            return cpuPerUnit(Output.of(cpuPerUnit));
        }

        /**
         * @param memoryPerUnit How much Memory allocate for headroom unit.
         * 
         * @return builder
         * 
         */
        public Builder memoryPerUnit(@Nullable Output<Integer> memoryPerUnit) {
            $.memoryPerUnit = memoryPerUnit;
            return this;
        }

        /**
         * @param memoryPerUnit How much Memory allocate for headroom unit.
         * 
         * @return builder
         * 
         */
        public Builder memoryPerUnit(Integer memoryPerUnit) {
            return memoryPerUnit(Output.of(memoryPerUnit));
        }

        /**
         * @param numOfUnits How many units of headroom to allocate.
         * 
         * @return builder
         * 
         */
        public Builder numOfUnits(@Nullable Output<Integer> numOfUnits) {
            $.numOfUnits = numOfUnits;
            return this;
        }

        /**
         * @param numOfUnits How many units of headroom to allocate.
         * 
         * @return builder
         * 
         */
        public Builder numOfUnits(Integer numOfUnits) {
            return numOfUnits(Output.of(numOfUnits));
        }

        public ElastigroupIntegrationEcsAutoscaleHeadroomArgs build() {
            return $;
        }
    }

}
