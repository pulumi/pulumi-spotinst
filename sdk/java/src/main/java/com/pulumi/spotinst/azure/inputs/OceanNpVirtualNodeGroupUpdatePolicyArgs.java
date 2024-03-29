// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.azure.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.spotinst.azure.inputs.OceanNpVirtualNodeGroupUpdatePolicyRollConfigArgs;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OceanNpVirtualNodeGroupUpdatePolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final OceanNpVirtualNodeGroupUpdatePolicyArgs Empty = new OceanNpVirtualNodeGroupUpdatePolicyArgs();

    @Import(name="conditionedRoll")
    private @Nullable Output<Boolean> conditionedRoll;

    public Optional<Output<Boolean>> conditionedRoll() {
        return Optional.ofNullable(this.conditionedRoll);
    }

    @Import(name="rollConfig")
    private @Nullable Output<OceanNpVirtualNodeGroupUpdatePolicyRollConfigArgs> rollConfig;

    public Optional<Output<OceanNpVirtualNodeGroupUpdatePolicyRollConfigArgs>> rollConfig() {
        return Optional.ofNullable(this.rollConfig);
    }

    @Import(name="shouldRoll", required=true)
    private Output<Boolean> shouldRoll;

    public Output<Boolean> shouldRoll() {
        return this.shouldRoll;
    }

    private OceanNpVirtualNodeGroupUpdatePolicyArgs() {}

    private OceanNpVirtualNodeGroupUpdatePolicyArgs(OceanNpVirtualNodeGroupUpdatePolicyArgs $) {
        this.conditionedRoll = $.conditionedRoll;
        this.rollConfig = $.rollConfig;
        this.shouldRoll = $.shouldRoll;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OceanNpVirtualNodeGroupUpdatePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OceanNpVirtualNodeGroupUpdatePolicyArgs $;

        public Builder() {
            $ = new OceanNpVirtualNodeGroupUpdatePolicyArgs();
        }

        public Builder(OceanNpVirtualNodeGroupUpdatePolicyArgs defaults) {
            $ = new OceanNpVirtualNodeGroupUpdatePolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder conditionedRoll(@Nullable Output<Boolean> conditionedRoll) {
            $.conditionedRoll = conditionedRoll;
            return this;
        }

        public Builder conditionedRoll(Boolean conditionedRoll) {
            return conditionedRoll(Output.of(conditionedRoll));
        }

        public Builder rollConfig(@Nullable Output<OceanNpVirtualNodeGroupUpdatePolicyRollConfigArgs> rollConfig) {
            $.rollConfig = rollConfig;
            return this;
        }

        public Builder rollConfig(OceanNpVirtualNodeGroupUpdatePolicyRollConfigArgs rollConfig) {
            return rollConfig(Output.of(rollConfig));
        }

        public Builder shouldRoll(Output<Boolean> shouldRoll) {
            $.shouldRoll = shouldRoll;
            return this;
        }

        public Builder shouldRoll(Boolean shouldRoll) {
            return shouldRoll(Output.of(shouldRoll));
        }

        public OceanNpVirtualNodeGroupUpdatePolicyArgs build() {
            if ($.shouldRoll == null) {
                throw new MissingRequiredPropertyException("OceanNpVirtualNodeGroupUpdatePolicyArgs", "shouldRoll");
            }
            return $;
        }
    }

}
