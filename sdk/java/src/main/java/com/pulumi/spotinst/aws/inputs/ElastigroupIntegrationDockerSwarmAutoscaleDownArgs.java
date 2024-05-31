// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ElastigroupIntegrationDockerSwarmAutoscaleDownArgs extends com.pulumi.resources.ResourceArgs {

    public static final ElastigroupIntegrationDockerSwarmAutoscaleDownArgs Empty = new ElastigroupIntegrationDockerSwarmAutoscaleDownArgs();

    @Import(name="evaluationPeriods")
    private @Nullable Output<Integer> evaluationPeriods;

    public Optional<Output<Integer>> evaluationPeriods() {
        return Optional.ofNullable(this.evaluationPeriods);
    }

    @Import(name="maxScaleDownPercentage")
    private @Nullable Output<Double> maxScaleDownPercentage;

    public Optional<Output<Double>> maxScaleDownPercentage() {
        return Optional.ofNullable(this.maxScaleDownPercentage);
    }

    private ElastigroupIntegrationDockerSwarmAutoscaleDownArgs() {}

    private ElastigroupIntegrationDockerSwarmAutoscaleDownArgs(ElastigroupIntegrationDockerSwarmAutoscaleDownArgs $) {
        this.evaluationPeriods = $.evaluationPeriods;
        this.maxScaleDownPercentage = $.maxScaleDownPercentage;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ElastigroupIntegrationDockerSwarmAutoscaleDownArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ElastigroupIntegrationDockerSwarmAutoscaleDownArgs $;

        public Builder() {
            $ = new ElastigroupIntegrationDockerSwarmAutoscaleDownArgs();
        }

        public Builder(ElastigroupIntegrationDockerSwarmAutoscaleDownArgs defaults) {
            $ = new ElastigroupIntegrationDockerSwarmAutoscaleDownArgs(Objects.requireNonNull(defaults));
        }

        public Builder evaluationPeriods(@Nullable Output<Integer> evaluationPeriods) {
            $.evaluationPeriods = evaluationPeriods;
            return this;
        }

        public Builder evaluationPeriods(Integer evaluationPeriods) {
            return evaluationPeriods(Output.of(evaluationPeriods));
        }

        public Builder maxScaleDownPercentage(@Nullable Output<Double> maxScaleDownPercentage) {
            $.maxScaleDownPercentage = maxScaleDownPercentage;
            return this;
        }

        public Builder maxScaleDownPercentage(Double maxScaleDownPercentage) {
            return maxScaleDownPercentage(Output.of(maxScaleDownPercentage));
        }

        public ElastigroupIntegrationDockerSwarmAutoscaleDownArgs build() {
            return $;
        }
    }

}