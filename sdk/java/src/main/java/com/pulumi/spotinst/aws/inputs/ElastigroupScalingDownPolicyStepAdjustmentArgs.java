// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.spotinst.aws.inputs.ElastigroupScalingDownPolicyStepAdjustmentActionArgs;
import java.lang.Integer;
import java.util.Objects;


public final class ElastigroupScalingDownPolicyStepAdjustmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final ElastigroupScalingDownPolicyStepAdjustmentArgs Empty = new ElastigroupScalingDownPolicyStepAdjustmentArgs();

    /**
     * The action to take when scale up according to step&#39;s threshold is needed.
     * 
     */
    @Import(name="action", required=true)
    private Output<ElastigroupScalingDownPolicyStepAdjustmentActionArgs> action;

    /**
     * @return The action to take when scale up according to step&#39;s threshold is needed.
     * 
     */
    public Output<ElastigroupScalingDownPolicyStepAdjustmentActionArgs> action() {
        return this.action;
    }

    /**
     * The value against which the specified statistic is compared in order to determine if a step should be applied.
     * 
     * If you do not specify an action type, you can only use – `adjustment`, `minTargetCapacity`, `maxTargetCapacity`.
     * While using action_type, please also set the following:
     * 
     * When using `adjustment`           – set the field `adjustment`
     * When using `updateCapacity`       – set the fields `minimum`, `maximum`, and `target`
     * 
     */
    @Import(name="threshold", required=true)
    private Output<Integer> threshold;

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
    public Output<Integer> threshold() {
        return this.threshold;
    }

    private ElastigroupScalingDownPolicyStepAdjustmentArgs() {}

    private ElastigroupScalingDownPolicyStepAdjustmentArgs(ElastigroupScalingDownPolicyStepAdjustmentArgs $) {
        this.action = $.action;
        this.threshold = $.threshold;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ElastigroupScalingDownPolicyStepAdjustmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ElastigroupScalingDownPolicyStepAdjustmentArgs $;

        public Builder() {
            $ = new ElastigroupScalingDownPolicyStepAdjustmentArgs();
        }

        public Builder(ElastigroupScalingDownPolicyStepAdjustmentArgs defaults) {
            $ = new ElastigroupScalingDownPolicyStepAdjustmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param action The action to take when scale up according to step&#39;s threshold is needed.
         * 
         * @return builder
         * 
         */
        public Builder action(Output<ElastigroupScalingDownPolicyStepAdjustmentActionArgs> action) {
            $.action = action;
            return this;
        }

        /**
         * @param action The action to take when scale up according to step&#39;s threshold is needed.
         * 
         * @return builder
         * 
         */
        public Builder action(ElastigroupScalingDownPolicyStepAdjustmentActionArgs action) {
            return action(Output.of(action));
        }

        /**
         * @param threshold The value against which the specified statistic is compared in order to determine if a step should be applied.
         * 
         * If you do not specify an action type, you can only use – `adjustment`, `minTargetCapacity`, `maxTargetCapacity`.
         * While using action_type, please also set the following:
         * 
         * When using `adjustment`           – set the field `adjustment`
         * When using `updateCapacity`       – set the fields `minimum`, `maximum`, and `target`
         * 
         * @return builder
         * 
         */
        public Builder threshold(Output<Integer> threshold) {
            $.threshold = threshold;
            return this;
        }

        /**
         * @param threshold The value against which the specified statistic is compared in order to determine if a step should be applied.
         * 
         * If you do not specify an action type, you can only use – `adjustment`, `minTargetCapacity`, `maxTargetCapacity`.
         * While using action_type, please also set the following:
         * 
         * When using `adjustment`           – set the field `adjustment`
         * When using `updateCapacity`       – set the fields `minimum`, `maximum`, and `target`
         * 
         * @return builder
         * 
         */
        public Builder threshold(Integer threshold) {
            return threshold(Output.of(threshold));
        }

        public ElastigroupScalingDownPolicyStepAdjustmentArgs build() {
            $.action = Objects.requireNonNull($.action, "expected parameter 'action' to be non-null");
            $.threshold = Objects.requireNonNull($.threshold, "expected parameter 'threshold' to be non-null");
            return $;
        }
    }

}
