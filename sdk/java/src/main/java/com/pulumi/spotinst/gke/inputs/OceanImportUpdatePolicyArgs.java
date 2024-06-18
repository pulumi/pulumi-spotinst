// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.gke.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.spotinst.gke.inputs.OceanImportUpdatePolicyRollConfigArgs;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OceanImportUpdatePolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final OceanImportUpdatePolicyArgs Empty = new OceanImportUpdatePolicyArgs();

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

    /**
     * Holds the roll configuration.
     * 
     */
    @Import(name="rollConfig")
    private @Nullable Output<OceanImportUpdatePolicyRollConfigArgs> rollConfig;

    /**
     * @return Holds the roll configuration.
     * 
     */
    public Optional<Output<OceanImportUpdatePolicyRollConfigArgs>> rollConfig() {
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

    private OceanImportUpdatePolicyArgs() {}

    private OceanImportUpdatePolicyArgs(OceanImportUpdatePolicyArgs $) {
        this.conditionedRoll = $.conditionedRoll;
        this.rollConfig = $.rollConfig;
        this.shouldRoll = $.shouldRoll;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OceanImportUpdatePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OceanImportUpdatePolicyArgs $;

        public Builder() {
            $ = new OceanImportUpdatePolicyArgs();
        }

        public Builder(OceanImportUpdatePolicyArgs defaults) {
            $ = new OceanImportUpdatePolicyArgs(Objects.requireNonNull(defaults));
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

        /**
         * @param rollConfig Holds the roll configuration.
         * 
         * @return builder
         * 
         */
        public Builder rollConfig(@Nullable Output<OceanImportUpdatePolicyRollConfigArgs> rollConfig) {
            $.rollConfig = rollConfig;
            return this;
        }

        /**
         * @param rollConfig Holds the roll configuration.
         * 
         * @return builder
         * 
         */
        public Builder rollConfig(OceanImportUpdatePolicyRollConfigArgs rollConfig) {
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

        public OceanImportUpdatePolicyArgs build() {
            if ($.shouldRoll == null) {
                throw new MissingRequiredPropertyException("OceanImportUpdatePolicyArgs", "shouldRoll");
            }
            return $;
        }
    }

}
