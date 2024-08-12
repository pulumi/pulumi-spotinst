// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.oceancd;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.spotinst.Utilities;
import com.pulumi.spotinst.oceancd.RolloutSpecArgs;
import com.pulumi.spotinst.oceancd.inputs.RolloutSpecState;
import com.pulumi.spotinst.oceancd.outputs.RolloutSpecFailurePolicy;
import com.pulumi.spotinst.oceancd.outputs.RolloutSpecSpotDeployment;
import com.pulumi.spotinst.oceancd.outputs.RolloutSpecStrategy;
import com.pulumi.spotinst.oceancd.outputs.RolloutSpecTraffic;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Spotinst OceanCD Rollout Spec resource.
 * 
 */
@ResourceType(type="spotinst:oceancd/rolloutSpec:RolloutSpec")
public class RolloutSpec extends com.pulumi.resources.CustomResource {
    /**
     * Holds information on how to react when failure happens.
     * 
     */
    @Export(name="failurePolicy", refs={RolloutSpecFailurePolicy.class}, tree="[0]")
    private Output</* @Nullable */ RolloutSpecFailurePolicy> failurePolicy;

    /**
     * @return Holds information on how to react when failure happens.
     * 
     */
    public Output<Optional<RolloutSpecFailurePolicy>> failurePolicy() {
        return Codegen.optional(this.failurePolicy);
    }
    /**
     * Identifier name for Ocean CD Rollout Spec. Must be unique
     * 
     */
    @Export(name="rolloutSpecName", refs={String.class}, tree="[0]")
    private Output<String> rolloutSpecName;

    /**
     * @return Identifier name for Ocean CD Rollout Spec. Must be unique
     * 
     */
    public Output<String> rolloutSpecName() {
        return this.rolloutSpecName;
    }
    /**
     * Represents the SpotDeployment selector.
     * 
     */
    @Export(name="spotDeployment", refs={RolloutSpecSpotDeployment.class}, tree="[0]")
    private Output</* @Nullable */ RolloutSpecSpotDeployment> spotDeployment;

    /**
     * @return Represents the SpotDeployment selector.
     * 
     */
    public Output<Optional<RolloutSpecSpotDeployment>> spotDeployment() {
        return Codegen.optional(this.spotDeployment);
    }
    /**
     * You must specify either `spotDeployment` OR `spotDeployments` but not both. Every SpotDeployment has to be unique. If more than one `SpotDeployment` has been configured, no `traffic` managers can be set as part of the RolloutSpec.For such case ensure that each of the chosen SpotDeployments are being exposed with different Kubernetes services.
     * 
     */
    @Export(name="spotDeployments", refs={List.class,RolloutSpecSpotDeployment.class}, tree="[0,1]")
    private Output</* @Nullable */ List<RolloutSpecSpotDeployment>> spotDeployments;

    /**
     * @return You must specify either `spotDeployment` OR `spotDeployments` but not both. Every SpotDeployment has to be unique. If more than one `SpotDeployment` has been configured, no `traffic` managers can be set as part of the RolloutSpec.For such case ensure that each of the chosen SpotDeployments are being exposed with different Kubernetes services.
     * 
     */
    public Output<Optional<List<RolloutSpecSpotDeployment>>> spotDeployments() {
        return Codegen.optional(this.spotDeployments);
    }
    /**
     * Determines the Ocean CD strategy
     * 
     */
    @Export(name="strategy", refs={RolloutSpecStrategy.class}, tree="[0]")
    private Output<RolloutSpecStrategy> strategy;

    /**
     * @return Determines the Ocean CD strategy
     * 
     */
    public Output<RolloutSpecStrategy> strategy() {
        return this.strategy;
    }
    /**
     * Hosts all of the supported service meshes needed to enable more fine-grained traffic routing. In case `SpotDeployments` contains more than one SpotDeployment the `traffic` manager may not be configured.
     * 
     */
    @Export(name="traffic", refs={RolloutSpecTraffic.class}, tree="[0]")
    private Output</* @Nullable */ RolloutSpecTraffic> traffic;

    /**
     * @return Hosts all of the supported service meshes needed to enable more fine-grained traffic routing. In case `SpotDeployments` contains more than one SpotDeployment the `traffic` manager may not be configured.
     * 
     */
    public Output<Optional<RolloutSpecTraffic>> traffic() {
        return Codegen.optional(this.traffic);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RolloutSpec(java.lang.String name) {
        this(name, RolloutSpecArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RolloutSpec(java.lang.String name, RolloutSpecArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RolloutSpec(java.lang.String name, RolloutSpecArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("spotinst:oceancd/rolloutSpec:RolloutSpec", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private RolloutSpec(java.lang.String name, Output<java.lang.String> id, @Nullable RolloutSpecState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("spotinst:oceancd/rolloutSpec:RolloutSpec", name, state, makeResourceOptions(options, id), false);
    }

    private static RolloutSpecArgs makeArgs(RolloutSpecArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? RolloutSpecArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
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
    public static RolloutSpec get(java.lang.String name, Output<java.lang.String> id, @Nullable RolloutSpecState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RolloutSpec(name, id, state, options);
    }
}
