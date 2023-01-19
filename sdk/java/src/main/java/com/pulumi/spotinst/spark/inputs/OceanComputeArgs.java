// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.spark.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OceanComputeArgs extends com.pulumi.resources.ResourceArgs {

    public static final OceanComputeArgs Empty = new OceanComputeArgs();

    /**
     * - Enable/disable the creation of Ocean Spark VNGs during cluster creation.
     * 
     */
    @Import(name="createVngs")
    private @Nullable Output<Boolean> createVngs;

    /**
     * @return - Enable/disable the creation of Ocean Spark VNGs during cluster creation.
     * 
     */
    public Optional<Output<Boolean>> createVngs() {
        return Optional.ofNullable(this.createVngs);
    }

    /**
     * - Enable/disable Ocean Spark taints on the Ocean Spark VNGs. By default, Ocean Spark uses taints to prevent non-Spark workloads from running on Ocean Spark VNGs.
     * 
     */
    @Import(name="useTaints")
    private @Nullable Output<Boolean> useTaints;

    /**
     * @return - Enable/disable Ocean Spark taints on the Ocean Spark VNGs. By default, Ocean Spark uses taints to prevent non-Spark workloads from running on Ocean Spark VNGs.
     * 
     */
    public Optional<Output<Boolean>> useTaints() {
        return Optional.ofNullable(this.useTaints);
    }

    private OceanComputeArgs() {}

    private OceanComputeArgs(OceanComputeArgs $) {
        this.createVngs = $.createVngs;
        this.useTaints = $.useTaints;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OceanComputeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OceanComputeArgs $;

        public Builder() {
            $ = new OceanComputeArgs();
        }

        public Builder(OceanComputeArgs defaults) {
            $ = new OceanComputeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param createVngs - Enable/disable the creation of Ocean Spark VNGs during cluster creation.
         * 
         * @return builder
         * 
         */
        public Builder createVngs(@Nullable Output<Boolean> createVngs) {
            $.createVngs = createVngs;
            return this;
        }

        /**
         * @param createVngs - Enable/disable the creation of Ocean Spark VNGs during cluster creation.
         * 
         * @return builder
         * 
         */
        public Builder createVngs(Boolean createVngs) {
            return createVngs(Output.of(createVngs));
        }

        /**
         * @param useTaints - Enable/disable Ocean Spark taints on the Ocean Spark VNGs. By default, Ocean Spark uses taints to prevent non-Spark workloads from running on Ocean Spark VNGs.
         * 
         * @return builder
         * 
         */
        public Builder useTaints(@Nullable Output<Boolean> useTaints) {
            $.useTaints = useTaints;
            return this;
        }

        /**
         * @param useTaints - Enable/disable Ocean Spark taints on the Ocean Spark VNGs. By default, Ocean Spark uses taints to prevent non-Spark workloads from running on Ocean Spark VNGs.
         * 
         * @return builder
         * 
         */
        public Builder useTaints(Boolean useTaints) {
            return useTaints(Output.of(useTaints));
        }

        public OceanComputeArgs build() {
            return $;
        }
    }

}
