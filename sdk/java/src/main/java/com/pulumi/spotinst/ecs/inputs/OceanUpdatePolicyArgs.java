// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.ecs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.spotinst.ecs.inputs.OceanUpdatePolicyRollConfigArgs;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OceanUpdatePolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final OceanUpdatePolicyArgs Empty = new OceanUpdatePolicyArgs();

    /**
     * will update instance tags on the fly without rolling the cluster.
     * 
     */
    @Import(name="autoApplyTags")
    private @Nullable Output<Boolean> autoApplyTags;

    /**
     * @return will update instance tags on the fly without rolling the cluster.
     * 
     */
    public Optional<Output<Boolean>> autoApplyTags() {
        return Optional.ofNullable(this.autoApplyTags);
    }

    /**
     * Spot will perform a cluster Roll in accordance with a relevant modification of the cluster’s settings. When set to true , only specific changes in the cluster’s configuration will trigger a cluster roll (such as AMI, Key Pair, user data, instance types, load balancers, etc).
     * 
     */
    @Import(name="conditionedRoll")
    private @Nullable Output<Boolean> conditionedRoll;

    /**
     * @return Spot will perform a cluster Roll in accordance with a relevant modification of the cluster’s settings. When set to true , only specific changes in the cluster’s configuration will trigger a cluster roll (such as AMI, Key Pair, user data, instance types, load balancers, etc).
     * 
     */
    public Optional<Output<Boolean>> conditionedRoll() {
        return Optional.ofNullable(this.conditionedRoll);
    }

    @Import(name="rollConfig")
    private @Nullable Output<OceanUpdatePolicyRollConfigArgs> rollConfig;

    public Optional<Output<OceanUpdatePolicyRollConfigArgs>> rollConfig() {
        return Optional.ofNullable(this.rollConfig);
    }

    /**
     * Enables the roll.
     * 
     */
    @Import(name="shouldRoll", required=true)
    private Output<Boolean> shouldRoll;

    /**
     * @return Enables the roll.
     * 
     */
    public Output<Boolean> shouldRoll() {
        return this.shouldRoll;
    }

    private OceanUpdatePolicyArgs() {}

    private OceanUpdatePolicyArgs(OceanUpdatePolicyArgs $) {
        this.autoApplyTags = $.autoApplyTags;
        this.conditionedRoll = $.conditionedRoll;
        this.rollConfig = $.rollConfig;
        this.shouldRoll = $.shouldRoll;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OceanUpdatePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OceanUpdatePolicyArgs $;

        public Builder() {
            $ = new OceanUpdatePolicyArgs();
        }

        public Builder(OceanUpdatePolicyArgs defaults) {
            $ = new OceanUpdatePolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoApplyTags will update instance tags on the fly without rolling the cluster.
         * 
         * @return builder
         * 
         */
        public Builder autoApplyTags(@Nullable Output<Boolean> autoApplyTags) {
            $.autoApplyTags = autoApplyTags;
            return this;
        }

        /**
         * @param autoApplyTags will update instance tags on the fly without rolling the cluster.
         * 
         * @return builder
         * 
         */
        public Builder autoApplyTags(Boolean autoApplyTags) {
            return autoApplyTags(Output.of(autoApplyTags));
        }

        /**
         * @param conditionedRoll Spot will perform a cluster Roll in accordance with a relevant modification of the cluster’s settings. When set to true , only specific changes in the cluster’s configuration will trigger a cluster roll (such as AMI, Key Pair, user data, instance types, load balancers, etc).
         * 
         * @return builder
         * 
         */
        public Builder conditionedRoll(@Nullable Output<Boolean> conditionedRoll) {
            $.conditionedRoll = conditionedRoll;
            return this;
        }

        /**
         * @param conditionedRoll Spot will perform a cluster Roll in accordance with a relevant modification of the cluster’s settings. When set to true , only specific changes in the cluster’s configuration will trigger a cluster roll (such as AMI, Key Pair, user data, instance types, load balancers, etc).
         * 
         * @return builder
         * 
         */
        public Builder conditionedRoll(Boolean conditionedRoll) {
            return conditionedRoll(Output.of(conditionedRoll));
        }

        public Builder rollConfig(@Nullable Output<OceanUpdatePolicyRollConfigArgs> rollConfig) {
            $.rollConfig = rollConfig;
            return this;
        }

        public Builder rollConfig(OceanUpdatePolicyRollConfigArgs rollConfig) {
            return rollConfig(Output.of(rollConfig));
        }

        /**
         * @param shouldRoll Enables the roll.
         * 
         * @return builder
         * 
         */
        public Builder shouldRoll(Output<Boolean> shouldRoll) {
            $.shouldRoll = shouldRoll;
            return this;
        }

        /**
         * @param shouldRoll Enables the roll.
         * 
         * @return builder
         * 
         */
        public Builder shouldRoll(Boolean shouldRoll) {
            return shouldRoll(Output.of(shouldRoll));
        }

        public OceanUpdatePolicyArgs build() {
            if ($.shouldRoll == null) {
                throw new MissingRequiredPropertyException("OceanUpdatePolicyArgs", "shouldRoll");
            }
            return $;
        }
    }

}
