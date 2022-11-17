// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ElastigroupUpdatePolicyRollConfigStrategyOnFailure {
    /**
     * @return Sets the action that will take place, Accepted values are: `DETACH_OLD`, `DETACH_NEW`.
     * 
     */
    private String actionType;
    private @Nullable Integer batchNum;
    /**
     * @return Indicates (in seconds) the timeout to wait until instance are detached.
     * 
     */
    private @Nullable Integer drainingTimeout;
    /**
     * @return Decrementing the group target capacity after detaching the instances.
     * 
     */
    private @Nullable Boolean shouldDecrementTargetCapacity;
    /**
     * @return Indicator if the action should apply to all batches of the deployment or only the latest batch.
     * 
     */
    private @Nullable Boolean shouldHandleAllBatches;

    private ElastigroupUpdatePolicyRollConfigStrategyOnFailure() {}
    /**
     * @return Sets the action that will take place, Accepted values are: `DETACH_OLD`, `DETACH_NEW`.
     * 
     */
    public String actionType() {
        return this.actionType;
    }
    public Optional<Integer> batchNum() {
        return Optional.ofNullable(this.batchNum);
    }
    /**
     * @return Indicates (in seconds) the timeout to wait until instance are detached.
     * 
     */
    public Optional<Integer> drainingTimeout() {
        return Optional.ofNullable(this.drainingTimeout);
    }
    /**
     * @return Decrementing the group target capacity after detaching the instances.
     * 
     */
    public Optional<Boolean> shouldDecrementTargetCapacity() {
        return Optional.ofNullable(this.shouldDecrementTargetCapacity);
    }
    /**
     * @return Indicator if the action should apply to all batches of the deployment or only the latest batch.
     * 
     */
    public Optional<Boolean> shouldHandleAllBatches() {
        return Optional.ofNullable(this.shouldHandleAllBatches);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ElastigroupUpdatePolicyRollConfigStrategyOnFailure defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String actionType;
        private @Nullable Integer batchNum;
        private @Nullable Integer drainingTimeout;
        private @Nullable Boolean shouldDecrementTargetCapacity;
        private @Nullable Boolean shouldHandleAllBatches;
        public Builder() {}
        public Builder(ElastigroupUpdatePolicyRollConfigStrategyOnFailure defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionType = defaults.actionType;
    	      this.batchNum = defaults.batchNum;
    	      this.drainingTimeout = defaults.drainingTimeout;
    	      this.shouldDecrementTargetCapacity = defaults.shouldDecrementTargetCapacity;
    	      this.shouldHandleAllBatches = defaults.shouldHandleAllBatches;
        }

        @CustomType.Setter
        public Builder actionType(String actionType) {
            this.actionType = Objects.requireNonNull(actionType);
            return this;
        }
        @CustomType.Setter
        public Builder batchNum(@Nullable Integer batchNum) {
            this.batchNum = batchNum;
            return this;
        }
        @CustomType.Setter
        public Builder drainingTimeout(@Nullable Integer drainingTimeout) {
            this.drainingTimeout = drainingTimeout;
            return this;
        }
        @CustomType.Setter
        public Builder shouldDecrementTargetCapacity(@Nullable Boolean shouldDecrementTargetCapacity) {
            this.shouldDecrementTargetCapacity = shouldDecrementTargetCapacity;
            return this;
        }
        @CustomType.Setter
        public Builder shouldHandleAllBatches(@Nullable Boolean shouldHandleAllBatches) {
            this.shouldHandleAllBatches = shouldHandleAllBatches;
            return this;
        }
        public ElastigroupUpdatePolicyRollConfigStrategyOnFailure build() {
            final var o = new ElastigroupUpdatePolicyRollConfigStrategyOnFailure();
            o.actionType = actionType;
            o.batchNum = batchNum;
            o.drainingTimeout = drainingTimeout;
            o.shouldDecrementTargetCapacity = shouldDecrementTargetCapacity;
            o.shouldHandleAllBatches = shouldHandleAllBatches;
            return o;
        }
    }
}
