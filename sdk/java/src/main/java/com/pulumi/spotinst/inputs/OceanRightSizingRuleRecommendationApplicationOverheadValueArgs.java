// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OceanRightSizingRuleRecommendationApplicationOverheadValueArgs extends com.pulumi.resources.ResourceArgs {

    public static final OceanRightSizingRuleRecommendationApplicationOverheadValueArgs Empty = new OceanRightSizingRuleRecommendationApplicationOverheadValueArgs();

    @Import(name="cpuPercentage")
    private @Nullable Output<Double> cpuPercentage;

    public Optional<Output<Double>> cpuPercentage() {
        return Optional.ofNullable(this.cpuPercentage);
    }

    @Import(name="memoryPercentage")
    private @Nullable Output<Double> memoryPercentage;

    public Optional<Output<Double>> memoryPercentage() {
        return Optional.ofNullable(this.memoryPercentage);
    }

    private OceanRightSizingRuleRecommendationApplicationOverheadValueArgs() {}

    private OceanRightSizingRuleRecommendationApplicationOverheadValueArgs(OceanRightSizingRuleRecommendationApplicationOverheadValueArgs $) {
        this.cpuPercentage = $.cpuPercentage;
        this.memoryPercentage = $.memoryPercentage;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OceanRightSizingRuleRecommendationApplicationOverheadValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OceanRightSizingRuleRecommendationApplicationOverheadValueArgs $;

        public Builder() {
            $ = new OceanRightSizingRuleRecommendationApplicationOverheadValueArgs();
        }

        public Builder(OceanRightSizingRuleRecommendationApplicationOverheadValueArgs defaults) {
            $ = new OceanRightSizingRuleRecommendationApplicationOverheadValueArgs(Objects.requireNonNull(defaults));
        }

        public Builder cpuPercentage(@Nullable Output<Double> cpuPercentage) {
            $.cpuPercentage = cpuPercentage;
            return this;
        }

        public Builder cpuPercentage(Double cpuPercentage) {
            return cpuPercentage(Output.of(cpuPercentage));
        }

        public Builder memoryPercentage(@Nullable Output<Double> memoryPercentage) {
            $.memoryPercentage = memoryPercentage;
            return this;
        }

        public Builder memoryPercentage(Double memoryPercentage) {
            return memoryPercentage(Output.of(memoryPercentage));
        }

        public OceanRightSizingRuleRecommendationApplicationOverheadValueArgs build() {
            return $;
        }
    }

}
