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
     * @return The type of action to perform for scaling. Valid values: `&#34;adjustment&#34;`, `&#34;percentageAdjustment&#34;`, `&#34;setMaxTarget&#34;`, `&#34;setMinTarget&#34;`, `&#34;updateCapacity&#34;`. If a `step_adjustment` object is defined, then it cannot be specified.
     * 
     */
    private String actionType;
    private @Nullable Integer batchNum;
    /**
     * @return The time in seconds, the instance is allowed to run while detached from the ELB. This is to allow the instance time to be drained from incoming TCP connections before terminating it, during a scale down operation.
     * 
     */
    private @Nullable Integer drainingTimeout;
    /**
     * @return Decrementing the group target capacity after detaching the instances.
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *     }
     * }
     * ```
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
     * @return The type of action to perform for scaling. Valid values: `&#34;adjustment&#34;`, `&#34;percentageAdjustment&#34;`, `&#34;setMaxTarget&#34;`, `&#34;setMinTarget&#34;`, `&#34;updateCapacity&#34;`. If a `step_adjustment` object is defined, then it cannot be specified.
     * 
     */
    public String actionType() {
        return this.actionType;
    }
    public Optional<Integer> batchNum() {
        return Optional.ofNullable(this.batchNum);
    }
    /**
     * @return The time in seconds, the instance is allowed to run while detached from the ELB. This is to allow the instance time to be drained from incoming TCP connections before terminating it, during a scale down operation.
     * 
     */
    public Optional<Integer> drainingTimeout() {
        return Optional.ofNullable(this.drainingTimeout);
    }
    /**
     * @return Decrementing the group target capacity after detaching the instances.
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *     }
     * }
     * ```
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
            final var _resultValue = new ElastigroupUpdatePolicyRollConfigStrategyOnFailure();
            _resultValue.actionType = actionType;
            _resultValue.batchNum = batchNum;
            _resultValue.drainingTimeout = drainingTimeout;
            _resultValue.shouldDecrementTargetCapacity = shouldDecrementTargetCapacity;
            _resultValue.shouldHandleAllBatches = shouldHandleAllBatches;
            return _resultValue;
        }
    }
}
