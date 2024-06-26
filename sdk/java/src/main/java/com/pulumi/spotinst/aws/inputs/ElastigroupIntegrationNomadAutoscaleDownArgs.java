// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ElastigroupIntegrationNomadAutoscaleDownArgs extends com.pulumi.resources.ResourceArgs {

    public static final ElastigroupIntegrationNomadAutoscaleDownArgs Empty = new ElastigroupIntegrationNomadAutoscaleDownArgs();

    @Import(name="evaluationPeriods")
    private @Nullable Output<Integer> evaluationPeriods;

    public Optional<Output<Integer>> evaluationPeriods() {
        return Optional.ofNullable(this.evaluationPeriods);
    }

    private ElastigroupIntegrationNomadAutoscaleDownArgs() {}

    private ElastigroupIntegrationNomadAutoscaleDownArgs(ElastigroupIntegrationNomadAutoscaleDownArgs $) {
        this.evaluationPeriods = $.evaluationPeriods;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ElastigroupIntegrationNomadAutoscaleDownArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ElastigroupIntegrationNomadAutoscaleDownArgs $;

        public Builder() {
            $ = new ElastigroupIntegrationNomadAutoscaleDownArgs();
        }

        public Builder(ElastigroupIntegrationNomadAutoscaleDownArgs defaults) {
            $ = new ElastigroupIntegrationNomadAutoscaleDownArgs(Objects.requireNonNull(defaults));
        }

        public Builder evaluationPeriods(@Nullable Output<Integer> evaluationPeriods) {
            $.evaluationPeriods = evaluationPeriods;
            return this;
        }

        public Builder evaluationPeriods(Integer evaluationPeriods) {
            return evaluationPeriods(Output.of(evaluationPeriods));
        }

        public ElastigroupIntegrationNomadAutoscaleDownArgs build() {
            return $;
        }
    }

}
