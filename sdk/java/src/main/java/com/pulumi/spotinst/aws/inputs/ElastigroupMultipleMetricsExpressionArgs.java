// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ElastigroupMultipleMetricsExpressionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ElastigroupMultipleMetricsExpressionArgs Empty = new ElastigroupMultipleMetricsExpressionArgs();

    /**
     * An expression consisting of the metric names listed in the &#39;metrics&#39; array.
     * 
     */
    @Import(name="expression", required=true)
    private Output<String> expression;

    /**
     * @return An expression consisting of the metric names listed in the &#39;metrics&#39; array.
     * 
     */
    public Output<String> expression() {
        return this.expression;
    }

    /**
     * The group name.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The group name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private ElastigroupMultipleMetricsExpressionArgs() {}

    private ElastigroupMultipleMetricsExpressionArgs(ElastigroupMultipleMetricsExpressionArgs $) {
        this.expression = $.expression;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ElastigroupMultipleMetricsExpressionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ElastigroupMultipleMetricsExpressionArgs $;

        public Builder() {
            $ = new ElastigroupMultipleMetricsExpressionArgs();
        }

        public Builder(ElastigroupMultipleMetricsExpressionArgs defaults) {
            $ = new ElastigroupMultipleMetricsExpressionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param expression An expression consisting of the metric names listed in the &#39;metrics&#39; array.
         * 
         * @return builder
         * 
         */
        public Builder expression(Output<String> expression) {
            $.expression = expression;
            return this;
        }

        /**
         * @param expression An expression consisting of the metric names listed in the &#39;metrics&#39; array.
         * 
         * @return builder
         * 
         */
        public Builder expression(String expression) {
            return expression(Output.of(expression));
        }

        /**
         * @param name The group name.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The group name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public ElastigroupMultipleMetricsExpressionArgs build() {
            $.expression = Objects.requireNonNull($.expression, "expected parameter 'expression' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}