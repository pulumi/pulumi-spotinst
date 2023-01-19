// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.spotinst.aws.outputs.ElastigroupScalingUpPolicyStepAdjustmentAction;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class ElastigroupScalingUpPolicyStepAdjustment {
    /**
     * @return The action to take when scale up according to step&#39;s threshold is needed.
     * 
     */
    private ElastigroupScalingUpPolicyStepAdjustmentAction action;
    /**
     * @return The value against which the specified statistic is compared. If a `step_adjustment` object is defined, then it cannot be specified.
     * 
     */
    private Integer threshold;

    private ElastigroupScalingUpPolicyStepAdjustment() {}
    /**
     * @return The action to take when scale up according to step&#39;s threshold is needed.
     * 
     */
    public ElastigroupScalingUpPolicyStepAdjustmentAction action() {
        return this.action;
    }
    /**
     * @return The value against which the specified statistic is compared. If a `step_adjustment` object is defined, then it cannot be specified.
     * 
     */
    public Integer threshold() {
        return this.threshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ElastigroupScalingUpPolicyStepAdjustment defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private ElastigroupScalingUpPolicyStepAdjustmentAction action;
        private Integer threshold;
        public Builder() {}
        public Builder(ElastigroupScalingUpPolicyStepAdjustment defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.threshold = defaults.threshold;
        }

        @CustomType.Setter
        public Builder action(ElastigroupScalingUpPolicyStepAdjustmentAction action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }
        @CustomType.Setter
        public Builder threshold(Integer threshold) {
            this.threshold = Objects.requireNonNull(threshold);
            return this;
        }
        public ElastigroupScalingUpPolicyStepAdjustment build() {
            final var o = new ElastigroupScalingUpPolicyStepAdjustment();
            o.action = action;
            o.threshold = threshold;
            return o;
        }
    }
}
