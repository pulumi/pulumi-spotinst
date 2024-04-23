// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.spotinst.aws.inputs.ElastigroupMultipleMetricsExpressionArgs;
import com.pulumi.spotinst.aws.inputs.ElastigroupMultipleMetricsMetricArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ElastigroupMultipleMetricsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ElastigroupMultipleMetricsArgs Empty = new ElastigroupMultipleMetricsArgs();

    @Import(name="expressions")
    private @Nullable Output<List<ElastigroupMultipleMetricsExpressionArgs>> expressions;

    public Optional<Output<List<ElastigroupMultipleMetricsExpressionArgs>>> expressions() {
        return Optional.ofNullable(this.expressions);
    }

    @Import(name="metrics")
    private @Nullable Output<List<ElastigroupMultipleMetricsMetricArgs>> metrics;

    public Optional<Output<List<ElastigroupMultipleMetricsMetricArgs>>> metrics() {
        return Optional.ofNullable(this.metrics);
    }

    private ElastigroupMultipleMetricsArgs() {}

    private ElastigroupMultipleMetricsArgs(ElastigroupMultipleMetricsArgs $) {
        this.expressions = $.expressions;
        this.metrics = $.metrics;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ElastigroupMultipleMetricsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ElastigroupMultipleMetricsArgs $;

        public Builder() {
            $ = new ElastigroupMultipleMetricsArgs();
        }

        public Builder(ElastigroupMultipleMetricsArgs defaults) {
            $ = new ElastigroupMultipleMetricsArgs(Objects.requireNonNull(defaults));
        }

        public Builder expressions(@Nullable Output<List<ElastigroupMultipleMetricsExpressionArgs>> expressions) {
            $.expressions = expressions;
            return this;
        }

        public Builder expressions(List<ElastigroupMultipleMetricsExpressionArgs> expressions) {
            return expressions(Output.of(expressions));
        }

        public Builder expressions(ElastigroupMultipleMetricsExpressionArgs... expressions) {
            return expressions(List.of(expressions));
        }

        public Builder metrics(@Nullable Output<List<ElastigroupMultipleMetricsMetricArgs>> metrics) {
            $.metrics = metrics;
            return this;
        }

        public Builder metrics(List<ElastigroupMultipleMetricsMetricArgs> metrics) {
            return metrics(Output.of(metrics));
        }

        public Builder metrics(ElastigroupMultipleMetricsMetricArgs... metrics) {
            return metrics(List.of(metrics));
        }

        public ElastigroupMultipleMetricsArgs build() {
            return $;
        }
    }

}
