// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.oceancd.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.spotinst.oceancd.inputs.StrategyCanaryBackgroundVerificationArgs;
import com.pulumi.spotinst.oceancd.inputs.StrategyCanaryStepArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StrategyCanaryArgs extends com.pulumi.resources.ResourceArgs {

    public static final StrategyCanaryArgs Empty = new StrategyCanaryArgs();

    /**
     * A list of background verifications.
     * 
     */
    @Import(name="backgroundVerification")
    private @Nullable Output<StrategyCanaryBackgroundVerificationArgs> backgroundVerification;

    /**
     * @return A list of background verifications.
     * 
     */
    public Optional<Output<StrategyCanaryBackgroundVerificationArgs>> backgroundVerification() {
        return Optional.ofNullable(this.backgroundVerification);
    }

    /**
     * A set of separate conditions of rollout processing.
     * 
     */
    @Import(name="steps", required=true)
    private Output<List<StrategyCanaryStepArgs>> steps;

    /**
     * @return A set of separate conditions of rollout processing.
     * 
     */
    public Output<List<StrategyCanaryStepArgs>> steps() {
        return this.steps;
    }

    private StrategyCanaryArgs() {}

    private StrategyCanaryArgs(StrategyCanaryArgs $) {
        this.backgroundVerification = $.backgroundVerification;
        this.steps = $.steps;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StrategyCanaryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StrategyCanaryArgs $;

        public Builder() {
            $ = new StrategyCanaryArgs();
        }

        public Builder(StrategyCanaryArgs defaults) {
            $ = new StrategyCanaryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param backgroundVerification A list of background verifications.
         * 
         * @return builder
         * 
         */
        public Builder backgroundVerification(@Nullable Output<StrategyCanaryBackgroundVerificationArgs> backgroundVerification) {
            $.backgroundVerification = backgroundVerification;
            return this;
        }

        /**
         * @param backgroundVerification A list of background verifications.
         * 
         * @return builder
         * 
         */
        public Builder backgroundVerification(StrategyCanaryBackgroundVerificationArgs backgroundVerification) {
            return backgroundVerification(Output.of(backgroundVerification));
        }

        /**
         * @param steps A set of separate conditions of rollout processing.
         * 
         * @return builder
         * 
         */
        public Builder steps(Output<List<StrategyCanaryStepArgs>> steps) {
            $.steps = steps;
            return this;
        }

        /**
         * @param steps A set of separate conditions of rollout processing.
         * 
         * @return builder
         * 
         */
        public Builder steps(List<StrategyCanaryStepArgs> steps) {
            return steps(Output.of(steps));
        }

        /**
         * @param steps A set of separate conditions of rollout processing.
         * 
         * @return builder
         * 
         */
        public Builder steps(StrategyCanaryStepArgs... steps) {
            return steps(List.of(steps));
        }

        public StrategyCanaryArgs build() {
            if ($.steps == null) {
                throw new MissingRequiredPropertyException("StrategyCanaryArgs", "steps");
            }
            return $;
        }
    }

}