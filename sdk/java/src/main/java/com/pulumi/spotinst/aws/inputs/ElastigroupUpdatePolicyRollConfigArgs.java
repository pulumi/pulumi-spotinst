// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.spotinst.aws.inputs.ElastigroupUpdatePolicyRollConfigStrategyArgs;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ElastigroupUpdatePolicyRollConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ElastigroupUpdatePolicyRollConfigArgs Empty = new ElastigroupUpdatePolicyRollConfigArgs();

    /**
     * Sets the percentage of the instances to deploy in each batch.
     * 
     */
    @Import(name="batchSizePercentage", required=true)
    private Output<Integer> batchSizePercentage;

    /**
     * @return Sets the percentage of the instances to deploy in each batch.
     * 
     */
    public Output<Integer> batchSizePercentage() {
        return this.batchSizePercentage;
    }

    /**
     * Sets the grace period for new instances to become healthy.
     * 
     */
    @Import(name="gracePeriod")
    private @Nullable Output<Integer> gracePeriod;

    /**
     * @return Sets the grace period for new instances to become healthy.
     * 
     */
    public Optional<Output<Integer>> gracePeriod() {
        return Optional.ofNullable(this.gracePeriod);
    }

    /**
     * Sets the health check type to use. Valid values: `&#34;EC2&#34;`, `&#34;ECS_CLUSTER_INSTANCE&#34;`, `&#34;ELB&#34;`, `&#34;HCS&#34;`, `&#34;TARGET_GROUP&#34;`, `&#34;NONE&#34;`.
     * 
     */
    @Import(name="healthCheckType")
    private @Nullable Output<String> healthCheckType;

    /**
     * @return Sets the health check type to use. Valid values: `&#34;EC2&#34;`, `&#34;ECS_CLUSTER_INSTANCE&#34;`, `&#34;ELB&#34;`, `&#34;HCS&#34;`, `&#34;TARGET_GROUP&#34;`, `&#34;NONE&#34;`.
     * 
     */
    public Optional<Output<String>> healthCheckType() {
        return Optional.ofNullable(this.healthCheckType);
    }

    /**
     * Strategy parameters
     * 
     */
    @Import(name="strategy")
    private @Nullable Output<ElastigroupUpdatePolicyRollConfigStrategyArgs> strategy;

    /**
     * @return Strategy parameters
     * 
     */
    public Optional<Output<ElastigroupUpdatePolicyRollConfigStrategyArgs>> strategy() {
        return Optional.ofNullable(this.strategy);
    }

    /**
     * For use with `should_roll`. Sets minimum % of roll required to complete before continuing the plan. Required if `wait_for_roll_timeout` is set.
     * 
     */
    @Import(name="waitForRollPercentage")
    private @Nullable Output<Double> waitForRollPercentage;

    /**
     * @return For use with `should_roll`. Sets minimum % of roll required to complete before continuing the plan. Required if `wait_for_roll_timeout` is set.
     * 
     */
    public Optional<Output<Double>> waitForRollPercentage() {
        return Optional.ofNullable(this.waitForRollPercentage);
    }

    /**
     * For use with `should_roll`. Sets how long to wait for the deployed % of a roll to exceed `wait_for_roll_percentage` before continuing the plan. Required if `wait_for_roll_percentage` is set.
     * 
     */
    @Import(name="waitForRollTimeout")
    private @Nullable Output<Integer> waitForRollTimeout;

    /**
     * @return For use with `should_roll`. Sets how long to wait for the deployed % of a roll to exceed `wait_for_roll_percentage` before continuing the plan. Required if `wait_for_roll_percentage` is set.
     * 
     */
    public Optional<Output<Integer>> waitForRollTimeout() {
        return Optional.ofNullable(this.waitForRollTimeout);
    }

    private ElastigroupUpdatePolicyRollConfigArgs() {}

    private ElastigroupUpdatePolicyRollConfigArgs(ElastigroupUpdatePolicyRollConfigArgs $) {
        this.batchSizePercentage = $.batchSizePercentage;
        this.gracePeriod = $.gracePeriod;
        this.healthCheckType = $.healthCheckType;
        this.strategy = $.strategy;
        this.waitForRollPercentage = $.waitForRollPercentage;
        this.waitForRollTimeout = $.waitForRollTimeout;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ElastigroupUpdatePolicyRollConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ElastigroupUpdatePolicyRollConfigArgs $;

        public Builder() {
            $ = new ElastigroupUpdatePolicyRollConfigArgs();
        }

        public Builder(ElastigroupUpdatePolicyRollConfigArgs defaults) {
            $ = new ElastigroupUpdatePolicyRollConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param batchSizePercentage Sets the percentage of the instances to deploy in each batch.
         * 
         * @return builder
         * 
         */
        public Builder batchSizePercentage(Output<Integer> batchSizePercentage) {
            $.batchSizePercentage = batchSizePercentage;
            return this;
        }

        /**
         * @param batchSizePercentage Sets the percentage of the instances to deploy in each batch.
         * 
         * @return builder
         * 
         */
        public Builder batchSizePercentage(Integer batchSizePercentage) {
            return batchSizePercentage(Output.of(batchSizePercentage));
        }

        /**
         * @param gracePeriod Sets the grace period for new instances to become healthy.
         * 
         * @return builder
         * 
         */
        public Builder gracePeriod(@Nullable Output<Integer> gracePeriod) {
            $.gracePeriod = gracePeriod;
            return this;
        }

        /**
         * @param gracePeriod Sets the grace period for new instances to become healthy.
         * 
         * @return builder
         * 
         */
        public Builder gracePeriod(Integer gracePeriod) {
            return gracePeriod(Output.of(gracePeriod));
        }

        /**
         * @param healthCheckType Sets the health check type to use. Valid values: `&#34;EC2&#34;`, `&#34;ECS_CLUSTER_INSTANCE&#34;`, `&#34;ELB&#34;`, `&#34;HCS&#34;`, `&#34;TARGET_GROUP&#34;`, `&#34;NONE&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckType(@Nullable Output<String> healthCheckType) {
            $.healthCheckType = healthCheckType;
            return this;
        }

        /**
         * @param healthCheckType Sets the health check type to use. Valid values: `&#34;EC2&#34;`, `&#34;ECS_CLUSTER_INSTANCE&#34;`, `&#34;ELB&#34;`, `&#34;HCS&#34;`, `&#34;TARGET_GROUP&#34;`, `&#34;NONE&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckType(String healthCheckType) {
            return healthCheckType(Output.of(healthCheckType));
        }

        /**
         * @param strategy Strategy parameters
         * 
         * @return builder
         * 
         */
        public Builder strategy(@Nullable Output<ElastigroupUpdatePolicyRollConfigStrategyArgs> strategy) {
            $.strategy = strategy;
            return this;
        }

        /**
         * @param strategy Strategy parameters
         * 
         * @return builder
         * 
         */
        public Builder strategy(ElastigroupUpdatePolicyRollConfigStrategyArgs strategy) {
            return strategy(Output.of(strategy));
        }

        /**
         * @param waitForRollPercentage For use with `should_roll`. Sets minimum % of roll required to complete before continuing the plan. Required if `wait_for_roll_timeout` is set.
         * 
         * @return builder
         * 
         */
        public Builder waitForRollPercentage(@Nullable Output<Double> waitForRollPercentage) {
            $.waitForRollPercentage = waitForRollPercentage;
            return this;
        }

        /**
         * @param waitForRollPercentage For use with `should_roll`. Sets minimum % of roll required to complete before continuing the plan. Required if `wait_for_roll_timeout` is set.
         * 
         * @return builder
         * 
         */
        public Builder waitForRollPercentage(Double waitForRollPercentage) {
            return waitForRollPercentage(Output.of(waitForRollPercentage));
        }

        /**
         * @param waitForRollTimeout For use with `should_roll`. Sets how long to wait for the deployed % of a roll to exceed `wait_for_roll_percentage` before continuing the plan. Required if `wait_for_roll_percentage` is set.
         * 
         * @return builder
         * 
         */
        public Builder waitForRollTimeout(@Nullable Output<Integer> waitForRollTimeout) {
            $.waitForRollTimeout = waitForRollTimeout;
            return this;
        }

        /**
         * @param waitForRollTimeout For use with `should_roll`. Sets how long to wait for the deployed % of a roll to exceed `wait_for_roll_percentage` before continuing the plan. Required if `wait_for_roll_percentage` is set.
         * 
         * @return builder
         * 
         */
        public Builder waitForRollTimeout(Integer waitForRollTimeout) {
            return waitForRollTimeout(Output.of(waitForRollTimeout));
        }

        public ElastigroupUpdatePolicyRollConfigArgs build() {
            if ($.batchSizePercentage == null) {
                throw new MissingRequiredPropertyException("ElastigroupUpdatePolicyRollConfigArgs", "batchSizePercentage");
            }
            return $;
        }
    }

}
