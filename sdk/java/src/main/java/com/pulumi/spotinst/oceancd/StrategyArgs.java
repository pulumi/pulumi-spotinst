// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.oceancd;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.spotinst.oceancd.inputs.StrategyCanaryArgs;
import com.pulumi.spotinst.oceancd.inputs.StrategyRollingArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StrategyArgs extends com.pulumi.resources.ResourceArgs {

    public static final StrategyArgs Empty = new StrategyArgs();

    /**
     * Represents Canary strategy. Cannot be defined when Rolling object is defined.
     * 
     */
    @Import(name="canary")
    private @Nullable Output<StrategyCanaryArgs> canary;

    /**
     * @return Represents Canary strategy. Cannot be defined when Rolling object is defined.
     * 
     */
    public Optional<Output<StrategyCanaryArgs>> canary() {
        return Optional.ofNullable(this.canary);
    }

    /**
     * Represents Rolling Update strategy. Cannot be defined when Canary object is defined.
     * 
     */
    @Import(name="rolling")
    private @Nullable Output<StrategyRollingArgs> rolling;

    /**
     * @return Represents Rolling Update strategy. Cannot be defined when Canary object is defined.
     * 
     */
    public Optional<Output<StrategyRollingArgs>> rolling() {
        return Optional.ofNullable(this.rolling);
    }

    @Import(name="strategyName", required=true)
    private Output<String> strategyName;

    public Output<String> strategyName() {
        return this.strategyName;
    }

    private StrategyArgs() {}

    private StrategyArgs(StrategyArgs $) {
        this.canary = $.canary;
        this.rolling = $.rolling;
        this.strategyName = $.strategyName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StrategyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StrategyArgs $;

        public Builder() {
            $ = new StrategyArgs();
        }

        public Builder(StrategyArgs defaults) {
            $ = new StrategyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param canary Represents Canary strategy. Cannot be defined when Rolling object is defined.
         * 
         * @return builder
         * 
         */
        public Builder canary(@Nullable Output<StrategyCanaryArgs> canary) {
            $.canary = canary;
            return this;
        }

        /**
         * @param canary Represents Canary strategy. Cannot be defined when Rolling object is defined.
         * 
         * @return builder
         * 
         */
        public Builder canary(StrategyCanaryArgs canary) {
            return canary(Output.of(canary));
        }

        /**
         * @param rolling Represents Rolling Update strategy. Cannot be defined when Canary object is defined.
         * 
         * @return builder
         * 
         */
        public Builder rolling(@Nullable Output<StrategyRollingArgs> rolling) {
            $.rolling = rolling;
            return this;
        }

        /**
         * @param rolling Represents Rolling Update strategy. Cannot be defined when Canary object is defined.
         * 
         * @return builder
         * 
         */
        public Builder rolling(StrategyRollingArgs rolling) {
            return rolling(Output.of(rolling));
        }

        public Builder strategyName(Output<String> strategyName) {
            $.strategyName = strategyName;
            return this;
        }

        public Builder strategyName(String strategyName) {
            return strategyName(Output.of(strategyName));
        }

        public StrategyArgs build() {
            if ($.strategyName == null) {
                throw new MissingRequiredPropertyException("StrategyArgs", "strategyName");
            }
            return $;
        }
    }

}
