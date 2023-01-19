// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ElastigroupScalingUpPolicyStepAdjustmentAction {
    /**
     * @return The number of instances to add or remove.
     * 
     */
    private @Nullable String adjustment;
    /**
     * @return The desired target capacity of a group. Required if using `&#34;setMaxTarget&#34;` as action type
     * 
     */
    private @Nullable String maxTargetCapacity;
    /**
     * @return The upper limit number of instances that you can scale up to. Required if using `&#34;updateCapacity&#34;` as action type and neither `&#34;target&#34;` nor `&#34;minimum&#34;` are not defined.
     * 
     */
    private @Nullable String maximum;
    /**
     * @return The desired target capacity of a group. Required if using `&#34;setMinTarget&#34;` as action type
     * 
     */
    private @Nullable String minTargetCapacity;
    /**
     * @return The lower limit number of instances that you can scale down to. Required if using `&#34;updateCapacity&#34;` as action type and neither `&#34;target&#34;` nor `&#34;maximum&#34;` are not defined.
     * 
     */
    private @Nullable String minimum;
    /**
     * @return The desired number of instances. Required if using `&#34;updateCapacity&#34;` as action type and neither `&#34;minimum&#34;` nor `&#34;maximum&#34;` are not defined.
     * 
     */
    private @Nullable String target;
    /**
     * @return The type of the action to take when scale up is needed. Valid types: `&#34;adjustment&#34;`, `&#34;updateCapacity&#34;`, `&#34;setMinTarget&#34;`, `&#34;percentageAdjustment&#34;`.
     * 
     */
    private String type;

    private ElastigroupScalingUpPolicyStepAdjustmentAction() {}
    /**
     * @return The number of instances to add or remove.
     * 
     */
    public Optional<String> adjustment() {
        return Optional.ofNullable(this.adjustment);
    }
    /**
     * @return The desired target capacity of a group. Required if using `&#34;setMaxTarget&#34;` as action type
     * 
     */
    public Optional<String> maxTargetCapacity() {
        return Optional.ofNullable(this.maxTargetCapacity);
    }
    /**
     * @return The upper limit number of instances that you can scale up to. Required if using `&#34;updateCapacity&#34;` as action type and neither `&#34;target&#34;` nor `&#34;minimum&#34;` are not defined.
     * 
     */
    public Optional<String> maximum() {
        return Optional.ofNullable(this.maximum);
    }
    /**
     * @return The desired target capacity of a group. Required if using `&#34;setMinTarget&#34;` as action type
     * 
     */
    public Optional<String> minTargetCapacity() {
        return Optional.ofNullable(this.minTargetCapacity);
    }
    /**
     * @return The lower limit number of instances that you can scale down to. Required if using `&#34;updateCapacity&#34;` as action type and neither `&#34;target&#34;` nor `&#34;maximum&#34;` are not defined.
     * 
     */
    public Optional<String> minimum() {
        return Optional.ofNullable(this.minimum);
    }
    /**
     * @return The desired number of instances. Required if using `&#34;updateCapacity&#34;` as action type and neither `&#34;minimum&#34;` nor `&#34;maximum&#34;` are not defined.
     * 
     */
    public Optional<String> target() {
        return Optional.ofNullable(this.target);
    }
    /**
     * @return The type of the action to take when scale up is needed. Valid types: `&#34;adjustment&#34;`, `&#34;updateCapacity&#34;`, `&#34;setMinTarget&#34;`, `&#34;percentageAdjustment&#34;`.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ElastigroupScalingUpPolicyStepAdjustmentAction defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String adjustment;
        private @Nullable String maxTargetCapacity;
        private @Nullable String maximum;
        private @Nullable String minTargetCapacity;
        private @Nullable String minimum;
        private @Nullable String target;
        private String type;
        public Builder() {}
        public Builder(ElastigroupScalingUpPolicyStepAdjustmentAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adjustment = defaults.adjustment;
    	      this.maxTargetCapacity = defaults.maxTargetCapacity;
    	      this.maximum = defaults.maximum;
    	      this.minTargetCapacity = defaults.minTargetCapacity;
    	      this.minimum = defaults.minimum;
    	      this.target = defaults.target;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder adjustment(@Nullable String adjustment) {
            this.adjustment = adjustment;
            return this;
        }
        @CustomType.Setter
        public Builder maxTargetCapacity(@Nullable String maxTargetCapacity) {
            this.maxTargetCapacity = maxTargetCapacity;
            return this;
        }
        @CustomType.Setter
        public Builder maximum(@Nullable String maximum) {
            this.maximum = maximum;
            return this;
        }
        @CustomType.Setter
        public Builder minTargetCapacity(@Nullable String minTargetCapacity) {
            this.minTargetCapacity = minTargetCapacity;
            return this;
        }
        @CustomType.Setter
        public Builder minimum(@Nullable String minimum) {
            this.minimum = minimum;
            return this;
        }
        @CustomType.Setter
        public Builder target(@Nullable String target) {
            this.target = target;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ElastigroupScalingUpPolicyStepAdjustmentAction build() {
            final var o = new ElastigroupScalingUpPolicyStepAdjustmentAction();
            o.adjustment = adjustment;
            o.maxTargetCapacity = maxTargetCapacity;
            o.maximum = maximum;
            o.minTargetCapacity = minTargetCapacity;
            o.minimum = minimum;
            o.target = target;
            o.type = type;
            return o;
        }
    }
}
