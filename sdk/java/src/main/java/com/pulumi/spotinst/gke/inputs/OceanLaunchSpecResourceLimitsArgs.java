// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.gke.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OceanLaunchSpecResourceLimitsArgs extends com.pulumi.resources.ResourceArgs {

    public static final OceanLaunchSpecResourceLimitsArgs Empty = new OceanLaunchSpecResourceLimitsArgs();

    /**
     * Option to set a maximum number of instances per virtual node group. Can be null. If set, the value must be greater than or equal to 0.
     * 
     */
    @Import(name="maxInstanceCount")
    private @Nullable Output<Integer> maxInstanceCount;

    /**
     * @return Option to set a maximum number of instances per virtual node group. Can be null. If set, the value must be greater than or equal to 0.
     * 
     */
    public Optional<Output<Integer>> maxInstanceCount() {
        return Optional.ofNullable(this.maxInstanceCount);
    }

    /**
     * Option to set a minimum number of instances per virtual node group. Can be null. If set, the value must be greater than or equal to 0.
     * 
     */
    @Import(name="minInstanceCount")
    private @Nullable Output<Integer> minInstanceCount;

    /**
     * @return Option to set a minimum number of instances per virtual node group. Can be null. If set, the value must be greater than or equal to 0.
     * 
     */
    public Optional<Output<Integer>> minInstanceCount() {
        return Optional.ofNullable(this.minInstanceCount);
    }

    private OceanLaunchSpecResourceLimitsArgs() {}

    private OceanLaunchSpecResourceLimitsArgs(OceanLaunchSpecResourceLimitsArgs $) {
        this.maxInstanceCount = $.maxInstanceCount;
        this.minInstanceCount = $.minInstanceCount;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OceanLaunchSpecResourceLimitsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OceanLaunchSpecResourceLimitsArgs $;

        public Builder() {
            $ = new OceanLaunchSpecResourceLimitsArgs();
        }

        public Builder(OceanLaunchSpecResourceLimitsArgs defaults) {
            $ = new OceanLaunchSpecResourceLimitsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param maxInstanceCount Option to set a maximum number of instances per virtual node group. Can be null. If set, the value must be greater than or equal to 0.
         * 
         * @return builder
         * 
         */
        public Builder maxInstanceCount(@Nullable Output<Integer> maxInstanceCount) {
            $.maxInstanceCount = maxInstanceCount;
            return this;
        }

        /**
         * @param maxInstanceCount Option to set a maximum number of instances per virtual node group. Can be null. If set, the value must be greater than or equal to 0.
         * 
         * @return builder
         * 
         */
        public Builder maxInstanceCount(Integer maxInstanceCount) {
            return maxInstanceCount(Output.of(maxInstanceCount));
        }

        /**
         * @param minInstanceCount Option to set a minimum number of instances per virtual node group. Can be null. If set, the value must be greater than or equal to 0.
         * 
         * @return builder
         * 
         */
        public Builder minInstanceCount(@Nullable Output<Integer> minInstanceCount) {
            $.minInstanceCount = minInstanceCount;
            return this;
        }

        /**
         * @param minInstanceCount Option to set a minimum number of instances per virtual node group. Can be null. If set, the value must be greater than or equal to 0.
         * 
         * @return builder
         * 
         */
        public Builder minInstanceCount(Integer minInstanceCount) {
            return minInstanceCount(Output.of(minInstanceCount));
        }

        public OceanLaunchSpecResourceLimitsArgs build() {
            return $;
        }
    }

}
