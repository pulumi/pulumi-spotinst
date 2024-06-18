// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.spotinst.aws.inputs.ElastigroupUpdatePolicyRollConfigArgs;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ElastigroupUpdatePolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ElastigroupUpdatePolicyArgs Empty = new ElastigroupUpdatePolicyArgs();

    /**
     * Enables updates to tags without rolling the group when set to `true`.
     * 
     */
    @Import(name="autoApplyTags")
    private @Nullable Output<Boolean> autoApplyTags;

    /**
     * @return Enables updates to tags without rolling the group when set to `true`.
     * 
     */
    public Optional<Output<Boolean>> autoApplyTags() {
        return Optional.ofNullable(this.autoApplyTags);
    }

    /**
     * While used, you can control whether the group should perform a deployment after an update to the configuration.
     * 
     */
    @Import(name="rollConfig")
    private @Nullable Output<ElastigroupUpdatePolicyRollConfigArgs> rollConfig;

    /**
     * @return While used, you can control whether the group should perform a deployment after an update to the configuration.
     * 
     */
    public Optional<Output<ElastigroupUpdatePolicyRollConfigArgs>> rollConfig() {
        return Optional.ofNullable(this.rollConfig);
    }

    /**
     * This will apply resuming action for Stateful instances in the Elastigroup upon scale up or capacity changes. Example usage will be for Elastigroups that will have scheduling rules to set a target capacity of 0 instances in the night and automatically restore the same state of the instances in the morning.
     * 
     */
    @Import(name="shouldResumeStateful", required=true)
    private Output<Boolean> shouldResumeStateful;

    /**
     * @return This will apply resuming action for Stateful instances in the Elastigroup upon scale up or capacity changes. Example usage will be for Elastigroups that will have scheduling rules to set a target capacity of 0 instances in the night and automatically restore the same state of the instances in the morning.
     * 
     */
    public Output<Boolean> shouldResumeStateful() {
        return this.shouldResumeStateful;
    }

    /**
     * Sets the enablement of the roll option.
     * 
     */
    @Import(name="shouldRoll", required=true)
    private Output<Boolean> shouldRoll;

    /**
     * @return Sets the enablement of the roll option.
     * 
     */
    public Output<Boolean> shouldRoll() {
        return this.shouldRoll;
    }

    private ElastigroupUpdatePolicyArgs() {}

    private ElastigroupUpdatePolicyArgs(ElastigroupUpdatePolicyArgs $) {
        this.autoApplyTags = $.autoApplyTags;
        this.rollConfig = $.rollConfig;
        this.shouldResumeStateful = $.shouldResumeStateful;
        this.shouldRoll = $.shouldRoll;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ElastigroupUpdatePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ElastigroupUpdatePolicyArgs $;

        public Builder() {
            $ = new ElastigroupUpdatePolicyArgs();
        }

        public Builder(ElastigroupUpdatePolicyArgs defaults) {
            $ = new ElastigroupUpdatePolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoApplyTags Enables updates to tags without rolling the group when set to `true`.
         * 
         * @return builder
         * 
         */
        public Builder autoApplyTags(@Nullable Output<Boolean> autoApplyTags) {
            $.autoApplyTags = autoApplyTags;
            return this;
        }

        /**
         * @param autoApplyTags Enables updates to tags without rolling the group when set to `true`.
         * 
         * @return builder
         * 
         */
        public Builder autoApplyTags(Boolean autoApplyTags) {
            return autoApplyTags(Output.of(autoApplyTags));
        }

        /**
         * @param rollConfig While used, you can control whether the group should perform a deployment after an update to the configuration.
         * 
         * @return builder
         * 
         */
        public Builder rollConfig(@Nullable Output<ElastigroupUpdatePolicyRollConfigArgs> rollConfig) {
            $.rollConfig = rollConfig;
            return this;
        }

        /**
         * @param rollConfig While used, you can control whether the group should perform a deployment after an update to the configuration.
         * 
         * @return builder
         * 
         */
        public Builder rollConfig(ElastigroupUpdatePolicyRollConfigArgs rollConfig) {
            return rollConfig(Output.of(rollConfig));
        }

        /**
         * @param shouldResumeStateful This will apply resuming action for Stateful instances in the Elastigroup upon scale up or capacity changes. Example usage will be for Elastigroups that will have scheduling rules to set a target capacity of 0 instances in the night and automatically restore the same state of the instances in the morning.
         * 
         * @return builder
         * 
         */
        public Builder shouldResumeStateful(Output<Boolean> shouldResumeStateful) {
            $.shouldResumeStateful = shouldResumeStateful;
            return this;
        }

        /**
         * @param shouldResumeStateful This will apply resuming action for Stateful instances in the Elastigroup upon scale up or capacity changes. Example usage will be for Elastigroups that will have scheduling rules to set a target capacity of 0 instances in the night and automatically restore the same state of the instances in the morning.
         * 
         * @return builder
         * 
         */
        public Builder shouldResumeStateful(Boolean shouldResumeStateful) {
            return shouldResumeStateful(Output.of(shouldResumeStateful));
        }

        /**
         * @param shouldRoll Sets the enablement of the roll option.
         * 
         * @return builder
         * 
         */
        public Builder shouldRoll(Output<Boolean> shouldRoll) {
            $.shouldRoll = shouldRoll;
            return this;
        }

        /**
         * @param shouldRoll Sets the enablement of the roll option.
         * 
         * @return builder
         * 
         */
        public Builder shouldRoll(Boolean shouldRoll) {
            return shouldRoll(Output.of(shouldRoll));
        }

        public ElastigroupUpdatePolicyArgs build() {
            if ($.shouldResumeStateful == null) {
                throw new MissingRequiredPropertyException("ElastigroupUpdatePolicyArgs", "shouldResumeStateful");
            }
            if ($.shouldRoll == null) {
                throw new MissingRequiredPropertyException("ElastigroupUpdatePolicyArgs", "shouldRoll");
            }
            return $;
        }
    }

}
