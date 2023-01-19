// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.azure.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OceanStrategyArgs extends com.pulumi.resources.ResourceArgs {

    public static final OceanStrategyArgs Empty = new OceanStrategyArgs();

    /**
     * If no spot instance markets are available, enable Ocean to launch on-demand instances instead.
     * 
     */
    @Import(name="fallbackToOndemand")
    private @Nullable Output<Boolean> fallbackToOndemand;

    /**
     * @return If no spot instance markets are available, enable Ocean to launch on-demand instances instead.
     * 
     */
    public Optional<Output<Boolean>> fallbackToOndemand() {
        return Optional.ofNullable(this.fallbackToOndemand);
    }

    /**
     * Percentage of Spot VMs to maintain.
     * 
     */
    @Import(name="spotPercentage")
    private @Nullable Output<Integer> spotPercentage;

    /**
     * @return Percentage of Spot VMs to maintain.
     * 
     */
    public Optional<Output<Integer>> spotPercentage() {
        return Optional.ofNullable(this.spotPercentage);
    }

    private OceanStrategyArgs() {}

    private OceanStrategyArgs(OceanStrategyArgs $) {
        this.fallbackToOndemand = $.fallbackToOndemand;
        this.spotPercentage = $.spotPercentage;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OceanStrategyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OceanStrategyArgs $;

        public Builder() {
            $ = new OceanStrategyArgs();
        }

        public Builder(OceanStrategyArgs defaults) {
            $ = new OceanStrategyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fallbackToOndemand If no spot instance markets are available, enable Ocean to launch on-demand instances instead.
         * 
         * @return builder
         * 
         */
        public Builder fallbackToOndemand(@Nullable Output<Boolean> fallbackToOndemand) {
            $.fallbackToOndemand = fallbackToOndemand;
            return this;
        }

        /**
         * @param fallbackToOndemand If no spot instance markets are available, enable Ocean to launch on-demand instances instead.
         * 
         * @return builder
         * 
         */
        public Builder fallbackToOndemand(Boolean fallbackToOndemand) {
            return fallbackToOndemand(Output.of(fallbackToOndemand));
        }

        /**
         * @param spotPercentage Percentage of Spot VMs to maintain.
         * 
         * @return builder
         * 
         */
        public Builder spotPercentage(@Nullable Output<Integer> spotPercentage) {
            $.spotPercentage = spotPercentage;
            return this;
        }

        /**
         * @param spotPercentage Percentage of Spot VMs to maintain.
         * 
         * @return builder
         * 
         */
        public Builder spotPercentage(Integer spotPercentage) {
            return spotPercentage(Output.of(spotPercentage));
        }

        public OceanStrategyArgs build() {
            return $;
        }
    }

}