// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.azure.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.spotinst.azure.inputs.ElastigroupUpdatePolicyRollConfigArgs;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ElastigroupUpdatePolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ElastigroupUpdatePolicyArgs Empty = new ElastigroupUpdatePolicyArgs();

    @Import(name="rollConfig")
    private @Nullable Output<ElastigroupUpdatePolicyRollConfigArgs> rollConfig;

    public Optional<Output<ElastigroupUpdatePolicyRollConfigArgs>> rollConfig() {
        return Optional.ofNullable(this.rollConfig);
    }

    @Import(name="shouldRoll", required=true)
    private Output<Boolean> shouldRoll;

    public Output<Boolean> shouldRoll() {
        return this.shouldRoll;
    }

    private ElastigroupUpdatePolicyArgs() {}

    private ElastigroupUpdatePolicyArgs(ElastigroupUpdatePolicyArgs $) {
        this.rollConfig = $.rollConfig;
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

        public Builder rollConfig(@Nullable Output<ElastigroupUpdatePolicyRollConfigArgs> rollConfig) {
            $.rollConfig = rollConfig;
            return this;
        }

        public Builder rollConfig(ElastigroupUpdatePolicyRollConfigArgs rollConfig) {
            return rollConfig(Output.of(rollConfig));
        }

        public Builder shouldRoll(Output<Boolean> shouldRoll) {
            $.shouldRoll = shouldRoll;
            return this;
        }

        public Builder shouldRoll(Boolean shouldRoll) {
            return shouldRoll(Output.of(shouldRoll));
        }

        public ElastigroupUpdatePolicyArgs build() {
            if ($.shouldRoll == null) {
                throw new MissingRequiredPropertyException("ElastigroupUpdatePolicyArgs", "shouldRoll");
            }
            return $;
        }
    }

}
