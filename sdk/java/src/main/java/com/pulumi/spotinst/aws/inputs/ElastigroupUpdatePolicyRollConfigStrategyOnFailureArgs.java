// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ElastigroupUpdatePolicyRollConfigStrategyOnFailureArgs extends com.pulumi.resources.ResourceArgs {

    public static final ElastigroupUpdatePolicyRollConfigStrategyOnFailureArgs Empty = new ElastigroupUpdatePolicyRollConfigStrategyOnFailureArgs();

    /**
     * The type of action to perform for scaling. Valid values: `&#34;adjustment&#34;`, `&#34;percentageAdjustment&#34;`, `&#34;setMaxTarget&#34;`, `&#34;setMinTarget&#34;`, `&#34;updateCapacity&#34;`. If a `step_adjustment` object is defined, then it cannot be specified.
     * 
     */
    @Import(name="actionType", required=true)
    private Output<String> actionType;

    /**
     * @return The type of action to perform for scaling. Valid values: `&#34;adjustment&#34;`, `&#34;percentageAdjustment&#34;`, `&#34;setMaxTarget&#34;`, `&#34;setMinTarget&#34;`, `&#34;updateCapacity&#34;`. If a `step_adjustment` object is defined, then it cannot be specified.
     * 
     */
    public Output<String> actionType() {
        return this.actionType;
    }

    @Import(name="batchNum")
    private @Nullable Output<Integer> batchNum;

    public Optional<Output<Integer>> batchNum() {
        return Optional.ofNullable(this.batchNum);
    }

    /**
     * The time in seconds, the instance is allowed to run while detached from the ELB. This is to allow the instance time to be drained from incoming TCP connections before terminating it, during a scale down operation.
     * 
     */
    @Import(name="drainingTimeout")
    private @Nullable Output<Integer> drainingTimeout;

    /**
     * @return The time in seconds, the instance is allowed to run while detached from the ELB. This is to allow the instance time to be drained from incoming TCP connections before terminating it, during a scale down operation.
     * 
     */
    public Optional<Output<Integer>> drainingTimeout() {
        return Optional.ofNullable(this.drainingTimeout);
    }

    /**
     * Decrementing the group target capacity after detaching the instances.
     * 
     */
    @Import(name="shouldDecrementTargetCapacity")
    private @Nullable Output<Boolean> shouldDecrementTargetCapacity;

    /**
     * @return Decrementing the group target capacity after detaching the instances.
     * 
     */
    public Optional<Output<Boolean>> shouldDecrementTargetCapacity() {
        return Optional.ofNullable(this.shouldDecrementTargetCapacity);
    }

    /**
     * Indicator if the action should apply to all batches of the deployment or only the latest batch.
     * 
     */
    @Import(name="shouldHandleAllBatches")
    private @Nullable Output<Boolean> shouldHandleAllBatches;

    /**
     * @return Indicator if the action should apply to all batches of the deployment or only the latest batch.
     * 
     */
    public Optional<Output<Boolean>> shouldHandleAllBatches() {
        return Optional.ofNullable(this.shouldHandleAllBatches);
    }

    private ElastigroupUpdatePolicyRollConfigStrategyOnFailureArgs() {}

    private ElastigroupUpdatePolicyRollConfigStrategyOnFailureArgs(ElastigroupUpdatePolicyRollConfigStrategyOnFailureArgs $) {
        this.actionType = $.actionType;
        this.batchNum = $.batchNum;
        this.drainingTimeout = $.drainingTimeout;
        this.shouldDecrementTargetCapacity = $.shouldDecrementTargetCapacity;
        this.shouldHandleAllBatches = $.shouldHandleAllBatches;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ElastigroupUpdatePolicyRollConfigStrategyOnFailureArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ElastigroupUpdatePolicyRollConfigStrategyOnFailureArgs $;

        public Builder() {
            $ = new ElastigroupUpdatePolicyRollConfigStrategyOnFailureArgs();
        }

        public Builder(ElastigroupUpdatePolicyRollConfigStrategyOnFailureArgs defaults) {
            $ = new ElastigroupUpdatePolicyRollConfigStrategyOnFailureArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param actionType The type of action to perform for scaling. Valid values: `&#34;adjustment&#34;`, `&#34;percentageAdjustment&#34;`, `&#34;setMaxTarget&#34;`, `&#34;setMinTarget&#34;`, `&#34;updateCapacity&#34;`. If a `step_adjustment` object is defined, then it cannot be specified.
         * 
         * @return builder
         * 
         */
        public Builder actionType(Output<String> actionType) {
            $.actionType = actionType;
            return this;
        }

        /**
         * @param actionType The type of action to perform for scaling. Valid values: `&#34;adjustment&#34;`, `&#34;percentageAdjustment&#34;`, `&#34;setMaxTarget&#34;`, `&#34;setMinTarget&#34;`, `&#34;updateCapacity&#34;`. If a `step_adjustment` object is defined, then it cannot be specified.
         * 
         * @return builder
         * 
         */
        public Builder actionType(String actionType) {
            return actionType(Output.of(actionType));
        }

        public Builder batchNum(@Nullable Output<Integer> batchNum) {
            $.batchNum = batchNum;
            return this;
        }

        public Builder batchNum(Integer batchNum) {
            return batchNum(Output.of(batchNum));
        }

        /**
         * @param drainingTimeout The time in seconds, the instance is allowed to run while detached from the ELB. This is to allow the instance time to be drained from incoming TCP connections before terminating it, during a scale down operation.
         * 
         * @return builder
         * 
         */
        public Builder drainingTimeout(@Nullable Output<Integer> drainingTimeout) {
            $.drainingTimeout = drainingTimeout;
            return this;
        }

        /**
         * @param drainingTimeout The time in seconds, the instance is allowed to run while detached from the ELB. This is to allow the instance time to be drained from incoming TCP connections before terminating it, during a scale down operation.
         * 
         * @return builder
         * 
         */
        public Builder drainingTimeout(Integer drainingTimeout) {
            return drainingTimeout(Output.of(drainingTimeout));
        }

        /**
         * @param shouldDecrementTargetCapacity Decrementing the group target capacity after detaching the instances.
         * 
         * @return builder
         * 
         */
        public Builder shouldDecrementTargetCapacity(@Nullable Output<Boolean> shouldDecrementTargetCapacity) {
            $.shouldDecrementTargetCapacity = shouldDecrementTargetCapacity;
            return this;
        }

        /**
         * @param shouldDecrementTargetCapacity Decrementing the group target capacity after detaching the instances.
         * 
         * @return builder
         * 
         */
        public Builder shouldDecrementTargetCapacity(Boolean shouldDecrementTargetCapacity) {
            return shouldDecrementTargetCapacity(Output.of(shouldDecrementTargetCapacity));
        }

        /**
         * @param shouldHandleAllBatches Indicator if the action should apply to all batches of the deployment or only the latest batch.
         * 
         * @return builder
         * 
         */
        public Builder shouldHandleAllBatches(@Nullable Output<Boolean> shouldHandleAllBatches) {
            $.shouldHandleAllBatches = shouldHandleAllBatches;
            return this;
        }

        /**
         * @param shouldHandleAllBatches Indicator if the action should apply to all batches of the deployment or only the latest batch.
         * 
         * @return builder
         * 
         */
        public Builder shouldHandleAllBatches(Boolean shouldHandleAllBatches) {
            return shouldHandleAllBatches(Output.of(shouldHandleAllBatches));
        }

        public ElastigroupUpdatePolicyRollConfigStrategyOnFailureArgs build() {
            if ($.actionType == null) {
                throw new MissingRequiredPropertyException("ElastigroupUpdatePolicyRollConfigStrategyOnFailureArgs", "actionType");
            }
            return $;
        }
    }

}
