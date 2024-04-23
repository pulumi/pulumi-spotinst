// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ElastigroupScalingDownPolicyStepAdjustmentActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ElastigroupScalingDownPolicyStepAdjustmentActionArgs Empty = new ElastigroupScalingDownPolicyStepAdjustmentActionArgs();

    @Import(name="adjustment")
    private @Nullable Output<String> adjustment;

    public Optional<Output<String>> adjustment() {
        return Optional.ofNullable(this.adjustment);
    }

    @Import(name="maxTargetCapacity")
    private @Nullable Output<String> maxTargetCapacity;

    public Optional<Output<String>> maxTargetCapacity() {
        return Optional.ofNullable(this.maxTargetCapacity);
    }

    @Import(name="maximum")
    private @Nullable Output<String> maximum;

    public Optional<Output<String>> maximum() {
        return Optional.ofNullable(this.maximum);
    }

    @Import(name="minTargetCapacity")
    private @Nullable Output<String> minTargetCapacity;

    public Optional<Output<String>> minTargetCapacity() {
        return Optional.ofNullable(this.minTargetCapacity);
    }

    @Import(name="minimum")
    private @Nullable Output<String> minimum;

    public Optional<Output<String>> minimum() {
        return Optional.ofNullable(this.minimum);
    }

    @Import(name="target")
    private @Nullable Output<String> target;

    public Optional<Output<String>> target() {
        return Optional.ofNullable(this.target);
    }

    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    private ElastigroupScalingDownPolicyStepAdjustmentActionArgs() {}

    private ElastigroupScalingDownPolicyStepAdjustmentActionArgs(ElastigroupScalingDownPolicyStepAdjustmentActionArgs $) {
        this.adjustment = $.adjustment;
        this.maxTargetCapacity = $.maxTargetCapacity;
        this.maximum = $.maximum;
        this.minTargetCapacity = $.minTargetCapacity;
        this.minimum = $.minimum;
        this.target = $.target;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ElastigroupScalingDownPolicyStepAdjustmentActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ElastigroupScalingDownPolicyStepAdjustmentActionArgs $;

        public Builder() {
            $ = new ElastigroupScalingDownPolicyStepAdjustmentActionArgs();
        }

        public Builder(ElastigroupScalingDownPolicyStepAdjustmentActionArgs defaults) {
            $ = new ElastigroupScalingDownPolicyStepAdjustmentActionArgs(Objects.requireNonNull(defaults));
        }

        public Builder adjustment(@Nullable Output<String> adjustment) {
            $.adjustment = adjustment;
            return this;
        }

        public Builder adjustment(String adjustment) {
            return adjustment(Output.of(adjustment));
        }

        public Builder maxTargetCapacity(@Nullable Output<String> maxTargetCapacity) {
            $.maxTargetCapacity = maxTargetCapacity;
            return this;
        }

        public Builder maxTargetCapacity(String maxTargetCapacity) {
            return maxTargetCapacity(Output.of(maxTargetCapacity));
        }

        public Builder maximum(@Nullable Output<String> maximum) {
            $.maximum = maximum;
            return this;
        }

        public Builder maximum(String maximum) {
            return maximum(Output.of(maximum));
        }

        public Builder minTargetCapacity(@Nullable Output<String> minTargetCapacity) {
            $.minTargetCapacity = minTargetCapacity;
            return this;
        }

        public Builder minTargetCapacity(String minTargetCapacity) {
            return minTargetCapacity(Output.of(minTargetCapacity));
        }

        public Builder minimum(@Nullable Output<String> minimum) {
            $.minimum = minimum;
            return this;
        }

        public Builder minimum(String minimum) {
            return minimum(Output.of(minimum));
        }

        public Builder target(@Nullable Output<String> target) {
            $.target = target;
            return this;
        }

        public Builder target(String target) {
            return target(Output.of(target));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ElastigroupScalingDownPolicyStepAdjustmentActionArgs build() {
            if ($.type == null) {
                throw new MissingRequiredPropertyException("ElastigroupScalingDownPolicyStepAdjustmentActionArgs", "type");
            }
            return $;
        }
    }

}
