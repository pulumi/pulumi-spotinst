// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.oceancd;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.spotinst.Utilities;
import com.pulumi.spotinst.oceancd.StrategyArgs;
import com.pulumi.spotinst.oceancd.inputs.StrategyState;
import com.pulumi.spotinst.oceancd.outputs.StrategyCanary;
import com.pulumi.spotinst.oceancd.outputs.StrategyRolling;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Spotinst OceanCD Strategy resource.
 * 
 */
@ResourceType(type="spotinst:oceancd/strategy:Strategy")
public class Strategy extends com.pulumi.resources.CustomResource {
    /**
     * Represents Canary strategy. Cannot be defined when Rolling object is defined.
     * 
     */
    @Export(name="canary", refs={StrategyCanary.class}, tree="[0]")
    private Output</* @Nullable */ StrategyCanary> canary;

    /**
     * @return Represents Canary strategy. Cannot be defined when Rolling object is defined.
     * 
     */
    public Output<Optional<StrategyCanary>> canary() {
        return Codegen.optional(this.canary);
    }
    /**
     * Represents Rolling Update strategy. Cannot be defined when Canary object is defined.
     * 
     */
    @Export(name="rolling", refs={StrategyRolling.class}, tree="[0]")
    private Output</* @Nullable */ StrategyRolling> rolling;

    /**
     * @return Represents Rolling Update strategy. Cannot be defined when Canary object is defined.
     * 
     */
    public Output<Optional<StrategyRolling>> rolling() {
        return Codegen.optional(this.rolling);
    }
    @Export(name="strategyName", refs={String.class}, tree="[0]")
    private Output<String> strategyName;

    public Output<String> strategyName() {
        return this.strategyName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Strategy(String name) {
        this(name, StrategyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Strategy(String name, StrategyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Strategy(String name, StrategyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("spotinst:oceancd/strategy:Strategy", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()));
    }

    private Strategy(String name, Output<String> id, @Nullable StrategyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("spotinst:oceancd/strategy:Strategy", name, state, makeResourceOptions(options, id));
    }

    private static StrategyArgs makeArgs(StrategyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? StrategyArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Strategy get(String name, Output<String> id, @Nullable StrategyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Strategy(name, id, state, options);
    }
}
