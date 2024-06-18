// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.gke.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.spotinst.gke.inputs.OceanLaunchSpecUpdatePolicyRollConfigArgs;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OceanLaunchSpecUpdatePolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final OceanLaunchSpecUpdatePolicyArgs Empty = new OceanLaunchSpecUpdatePolicyArgs();

    /**
     * Holds the roll configuration.
     * 
     */
    @Import(name="rollConfig")
    private @Nullable Output<OceanLaunchSpecUpdatePolicyRollConfigArgs> rollConfig;

    /**
     * @return Holds the roll configuration.
     * 
     */
    public Optional<Output<OceanLaunchSpecUpdatePolicyRollConfigArgs>> rollConfig() {
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

    private OceanLaunchSpecUpdatePolicyArgs() {}

    private OceanLaunchSpecUpdatePolicyArgs(OceanLaunchSpecUpdatePolicyArgs $) {
        this.rollConfig = $.rollConfig;
        this.shouldRoll = $.shouldRoll;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OceanLaunchSpecUpdatePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OceanLaunchSpecUpdatePolicyArgs $;

        public Builder() {
            $ = new OceanLaunchSpecUpdatePolicyArgs();
        }

        public Builder(OceanLaunchSpecUpdatePolicyArgs defaults) {
            $ = new OceanLaunchSpecUpdatePolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param rollConfig Holds the roll configuration.
         * 
         * @return builder
         * 
         */
        public Builder rollConfig(@Nullable Output<OceanLaunchSpecUpdatePolicyRollConfigArgs> rollConfig) {
            $.rollConfig = rollConfig;
            return this;
        }

        /**
         * @param rollConfig Holds the roll configuration.
         * 
         * @return builder
         * 
         */
        public Builder rollConfig(OceanLaunchSpecUpdatePolicyRollConfigArgs rollConfig) {
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

        public OceanLaunchSpecUpdatePolicyArgs build() {
            if ($.shouldRoll == null) {
                throw new MissingRequiredPropertyException("OceanLaunchSpecUpdatePolicyArgs", "shouldRoll");
            }
            return $;
        }
    }

}
