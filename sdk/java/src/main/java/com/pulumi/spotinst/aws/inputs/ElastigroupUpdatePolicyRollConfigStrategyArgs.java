// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.spotinst.aws.inputs.ElastigroupUpdatePolicyRollConfigStrategyOnFailureArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ElastigroupUpdatePolicyRollConfigStrategyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ElastigroupUpdatePolicyRollConfigStrategyArgs Empty = new ElastigroupUpdatePolicyRollConfigStrategyArgs();

    @Import(name="action", required=true)
    private Output<String> action;

    public Output<String> action() {
        return this.action;
    }

    @Import(name="batchMinHealthyPercentage")
    private @Nullable Output<Integer> batchMinHealthyPercentage;

    public Optional<Output<Integer>> batchMinHealthyPercentage() {
        return Optional.ofNullable(this.batchMinHealthyPercentage);
    }

    @Import(name="onFailure")
    private @Nullable Output<ElastigroupUpdatePolicyRollConfigStrategyOnFailureArgs> onFailure;

    public Optional<Output<ElastigroupUpdatePolicyRollConfigStrategyOnFailureArgs>> onFailure() {
        return Optional.ofNullable(this.onFailure);
    }

    @Import(name="shouldDrainInstances")
    private @Nullable Output<Boolean> shouldDrainInstances;

    public Optional<Output<Boolean>> shouldDrainInstances() {
        return Optional.ofNullable(this.shouldDrainInstances);
    }

    private ElastigroupUpdatePolicyRollConfigStrategyArgs() {}

    private ElastigroupUpdatePolicyRollConfigStrategyArgs(ElastigroupUpdatePolicyRollConfigStrategyArgs $) {
        this.action = $.action;
        this.batchMinHealthyPercentage = $.batchMinHealthyPercentage;
        this.onFailure = $.onFailure;
        this.shouldDrainInstances = $.shouldDrainInstances;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ElastigroupUpdatePolicyRollConfigStrategyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ElastigroupUpdatePolicyRollConfigStrategyArgs $;

        public Builder() {
            $ = new ElastigroupUpdatePolicyRollConfigStrategyArgs();
        }

        public Builder(ElastigroupUpdatePolicyRollConfigStrategyArgs defaults) {
            $ = new ElastigroupUpdatePolicyRollConfigStrategyArgs(Objects.requireNonNull(defaults));
        }

        public Builder action(Output<String> action) {
            $.action = action;
            return this;
        }

        public Builder action(String action) {
            return action(Output.of(action));
        }

        public Builder batchMinHealthyPercentage(@Nullable Output<Integer> batchMinHealthyPercentage) {
            $.batchMinHealthyPercentage = batchMinHealthyPercentage;
            return this;
        }

        public Builder batchMinHealthyPercentage(Integer batchMinHealthyPercentage) {
            return batchMinHealthyPercentage(Output.of(batchMinHealthyPercentage));
        }

        public Builder onFailure(@Nullable Output<ElastigroupUpdatePolicyRollConfigStrategyOnFailureArgs> onFailure) {
            $.onFailure = onFailure;
            return this;
        }

        public Builder onFailure(ElastigroupUpdatePolicyRollConfigStrategyOnFailureArgs onFailure) {
            return onFailure(Output.of(onFailure));
        }

        public Builder shouldDrainInstances(@Nullable Output<Boolean> shouldDrainInstances) {
            $.shouldDrainInstances = shouldDrainInstances;
            return this;
        }

        public Builder shouldDrainInstances(Boolean shouldDrainInstances) {
            return shouldDrainInstances(Output.of(shouldDrainInstances));
        }

        public ElastigroupUpdatePolicyRollConfigStrategyArgs build() {
            if ($.action == null) {
                throw new MissingRequiredPropertyException("ElastigroupUpdatePolicyRollConfigStrategyArgs", "action");
            }
            return $;
        }
    }

}
