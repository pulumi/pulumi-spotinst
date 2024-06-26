// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.oceancd.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.spotinst.oceancd.inputs.RolloutSpecStrategyArgArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RolloutSpecStrategyArgs extends com.pulumi.resources.ResourceArgs {

    public static final RolloutSpecStrategyArgs Empty = new RolloutSpecStrategyArgs();

    /**
     * Arguments defined in Verification Templates.
     * 
     */
    @Import(name="args")
    private @Nullable Output<List<RolloutSpecStrategyArgArgs>> args;

    /**
     * @return Arguments defined in Verification Templates.
     * 
     */
    public Optional<Output<List<RolloutSpecStrategyArgArgs>>> args() {
        return Optional.ofNullable(this.args);
    }

    /**
     * Ocean CD strategy name identifier.
     * 
     */
    @Import(name="strategyName", required=true)
    private Output<String> strategyName;

    /**
     * @return Ocean CD strategy name identifier.
     * 
     */
    public Output<String> strategyName() {
        return this.strategyName;
    }

    private RolloutSpecStrategyArgs() {}

    private RolloutSpecStrategyArgs(RolloutSpecStrategyArgs $) {
        this.args = $.args;
        this.strategyName = $.strategyName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RolloutSpecStrategyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RolloutSpecStrategyArgs $;

        public Builder() {
            $ = new RolloutSpecStrategyArgs();
        }

        public Builder(RolloutSpecStrategyArgs defaults) {
            $ = new RolloutSpecStrategyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param args Arguments defined in Verification Templates.
         * 
         * @return builder
         * 
         */
        public Builder args(@Nullable Output<List<RolloutSpecStrategyArgArgs>> args) {
            $.args = args;
            return this;
        }

        /**
         * @param args Arguments defined in Verification Templates.
         * 
         * @return builder
         * 
         */
        public Builder args(List<RolloutSpecStrategyArgArgs> args) {
            return args(Output.of(args));
        }

        /**
         * @param args Arguments defined in Verification Templates.
         * 
         * @return builder
         * 
         */
        public Builder args(RolloutSpecStrategyArgArgs... args) {
            return args(List.of(args));
        }

        /**
         * @param strategyName Ocean CD strategy name identifier.
         * 
         * @return builder
         * 
         */
        public Builder strategyName(Output<String> strategyName) {
            $.strategyName = strategyName;
            return this;
        }

        /**
         * @param strategyName Ocean CD strategy name identifier.
         * 
         * @return builder
         * 
         */
        public Builder strategyName(String strategyName) {
            return strategyName(Output.of(strategyName));
        }

        public RolloutSpecStrategyArgs build() {
            if ($.strategyName == null) {
                throw new MissingRequiredPropertyException("RolloutSpecStrategyArgs", "strategyName");
            }
            return $;
        }
    }

}
