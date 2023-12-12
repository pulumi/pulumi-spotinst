// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.spotinst.aws.outputs.ElastigroupScalingDownPolicyStepAdjustmentAction;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class ElastigroupScalingDownPolicyStepAdjustment {
    /**
     * @return The action to take when scale up according to step&#39;s threshold is needed.
     * 
     */
    private ElastigroupScalingDownPolicyStepAdjustmentAction action;
    /**
     * @return The value against which the specified statistic is compared in order to determine if a step should be applied.
     * 
     * If you do not specify an action type, you can only use – `adjustment`, `minTargetCapacity`, `maxTargetCapacity`.
     * While using action_type, please also set the following:
     * 
     * When using `adjustment`           – set the field `adjustment`
     * When using `updateCapacity`       – set the fields `minimum`, `maximum`, and `target`
     * 
     */
    private Integer threshold;

    private ElastigroupScalingDownPolicyStepAdjustment() {}
    /**
     * @return The action to take when scale up according to step&#39;s threshold is needed.
     * 
     */
    public ElastigroupScalingDownPolicyStepAdjustmentAction action() {
        return this.action;
    }
    /**
     * @return The value against which the specified statistic is compared in order to determine if a step should be applied.
     * 
     * If you do not specify an action type, you can only use – `adjustment`, `minTargetCapacity`, `maxTargetCapacity`.
     * While using action_type, please also set the following:
     * 
     * When using `adjustment`           – set the field `adjustment`
     * When using `updateCapacity`       – set the fields `minimum`, `maximum`, and `target`
     * 
     */
    public Integer threshold() {
        return this.threshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ElastigroupScalingDownPolicyStepAdjustment defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private ElastigroupScalingDownPolicyStepAdjustmentAction action;
        private Integer threshold;
        public Builder() {}
        public Builder(ElastigroupScalingDownPolicyStepAdjustment defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.threshold = defaults.threshold;
        }

        @CustomType.Setter
        public Builder action(ElastigroupScalingDownPolicyStepAdjustmentAction action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }
        @CustomType.Setter
        public Builder threshold(Integer threshold) {
            this.threshold = Objects.requireNonNull(threshold);
            return this;
        }
        public ElastigroupScalingDownPolicyStepAdjustment build() {
            final var _resultValue = new ElastigroupScalingDownPolicyStepAdjustment();
            _resultValue.action = action;
            _resultValue.threshold = threshold;
            return _resultValue;
        }
    }
}
