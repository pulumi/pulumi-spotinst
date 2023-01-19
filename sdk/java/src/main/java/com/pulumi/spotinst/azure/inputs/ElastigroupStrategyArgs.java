// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.azure.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ElastigroupStrategyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ElastigroupStrategyArgs Empty = new ElastigroupStrategyArgs();

    /**
     * Time (seconds) to allow the instance to be drained from incoming TCP connections and detached from MLB before terminating it during a scale-down operation.
     * 
     */
    @Import(name="drainingTimeout")
    private @Nullable Output<Integer> drainingTimeout;

    /**
     * @return Time (seconds) to allow the instance to be drained from incoming TCP connections and detached from MLB before terminating it during a scale-down operation.
     * 
     */
    public Optional<Output<Integer>> drainingTimeout() {
        return Optional.ofNullable(this.drainingTimeout);
    }

    /**
     * Percentage of Low Priority instances to maintain. Required if `od_count` is not specified.
     * 
     */
    @Import(name="lowPriorityPercentage")
    private @Nullable Output<Integer> lowPriorityPercentage;

    /**
     * @return Percentage of Low Priority instances to maintain. Required if `od_count` is not specified.
     * 
     */
    public Optional<Output<Integer>> lowPriorityPercentage() {
        return Optional.ofNullable(this.lowPriorityPercentage);
    }

    /**
     * Number of On-Demand instances to maintain. Required if low_priority_percentage is not specified.
     * 
     */
    @Import(name="odCount")
    private @Nullable Output<Integer> odCount;

    /**
     * @return Number of On-Demand instances to maintain. Required if low_priority_percentage is not specified.
     * 
     */
    public Optional<Output<Integer>> odCount() {
        return Optional.ofNullable(this.odCount);
    }

    private ElastigroupStrategyArgs() {}

    private ElastigroupStrategyArgs(ElastigroupStrategyArgs $) {
        this.drainingTimeout = $.drainingTimeout;
        this.lowPriorityPercentage = $.lowPriorityPercentage;
        this.odCount = $.odCount;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ElastigroupStrategyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ElastigroupStrategyArgs $;

        public Builder() {
            $ = new ElastigroupStrategyArgs();
        }

        public Builder(ElastigroupStrategyArgs defaults) {
            $ = new ElastigroupStrategyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param drainingTimeout Time (seconds) to allow the instance to be drained from incoming TCP connections and detached from MLB before terminating it during a scale-down operation.
         * 
         * @return builder
         * 
         */
        public Builder drainingTimeout(@Nullable Output<Integer> drainingTimeout) {
            $.drainingTimeout = drainingTimeout;
            return this;
        }

        /**
         * @param drainingTimeout Time (seconds) to allow the instance to be drained from incoming TCP connections and detached from MLB before terminating it during a scale-down operation.
         * 
         * @return builder
         * 
         */
        public Builder drainingTimeout(Integer drainingTimeout) {
            return drainingTimeout(Output.of(drainingTimeout));
        }

        /**
         * @param lowPriorityPercentage Percentage of Low Priority instances to maintain. Required if `od_count` is not specified.
         * 
         * @return builder
         * 
         */
        public Builder lowPriorityPercentage(@Nullable Output<Integer> lowPriorityPercentage) {
            $.lowPriorityPercentage = lowPriorityPercentage;
            return this;
        }

        /**
         * @param lowPriorityPercentage Percentage of Low Priority instances to maintain. Required if `od_count` is not specified.
         * 
         * @return builder
         * 
         */
        public Builder lowPriorityPercentage(Integer lowPriorityPercentage) {
            return lowPriorityPercentage(Output.of(lowPriorityPercentage));
        }

        /**
         * @param odCount Number of On-Demand instances to maintain. Required if low_priority_percentage is not specified.
         * 
         * @return builder
         * 
         */
        public Builder odCount(@Nullable Output<Integer> odCount) {
            $.odCount = odCount;
            return this;
        }

        /**
         * @param odCount Number of On-Demand instances to maintain. Required if low_priority_percentage is not specified.
         * 
         * @return builder
         * 
         */
        public Builder odCount(Integer odCount) {
            return odCount(Output.of(odCount));
        }

        public ElastigroupStrategyArgs build() {
            return $;
        }
    }

}