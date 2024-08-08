// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.spotinst.ElastigroupAzureV3Args;
import com.pulumi.spotinst.Utilities;
import com.pulumi.spotinst.inputs.ElastigroupAzureV3State;
import com.pulumi.spotinst.outputs.ElastigroupAzureV3Image;
import com.pulumi.spotinst.outputs.ElastigroupAzureV3Login;
import com.pulumi.spotinst.outputs.ElastigroupAzureV3ManagedServiceIdentity;
import com.pulumi.spotinst.outputs.ElastigroupAzureV3Network;
import com.pulumi.spotinst.outputs.ElastigroupAzureV3Tag;
import com.pulumi.spotinst.outputs.ElastigroupAzureV3VmSizes;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="spotinst:index/elastigroupAzureV3:ElastigroupAzureV3")
public class ElastigroupAzureV3 extends com.pulumi.resources.CustomResource {
    @Export(name="customData", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> customData;

    public Output<Optional<String>> customData() {
        return Codegen.optional(this.customData);
    }
    @Export(name="desiredCapacity", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> desiredCapacity;

    public Output<Optional<Integer>> desiredCapacity() {
        return Codegen.optional(this.desiredCapacity);
    }
    @Export(name="drainingTimeout", refs={Integer.class}, tree="[0]")
    private Output<Integer> drainingTimeout;

    public Output<Integer> drainingTimeout() {
        return this.drainingTimeout;
    }
    @Export(name="fallbackToOnDemand", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> fallbackToOnDemand;

    public Output<Boolean> fallbackToOnDemand() {
        return this.fallbackToOnDemand;
    }
    @Export(name="images", refs={List.class,ElastigroupAzureV3Image.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ElastigroupAzureV3Image>> images;

    public Output<Optional<List<ElastigroupAzureV3Image>>> images() {
        return Codegen.optional(this.images);
    }
    @Export(name="login", refs={ElastigroupAzureV3Login.class}, tree="[0]")
    private Output</* @Nullable */ ElastigroupAzureV3Login> login;

    public Output<Optional<ElastigroupAzureV3Login>> login() {
        return Codegen.optional(this.login);
    }
    @Export(name="managedServiceIdentities", refs={List.class,ElastigroupAzureV3ManagedServiceIdentity.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ElastigroupAzureV3ManagedServiceIdentity>> managedServiceIdentities;

    public Output<Optional<List<ElastigroupAzureV3ManagedServiceIdentity>>> managedServiceIdentities() {
        return Codegen.optional(this.managedServiceIdentities);
    }
    @Export(name="maxSize", refs={Integer.class}, tree="[0]")
    private Output<Integer> maxSize;

    public Output<Integer> maxSize() {
        return this.maxSize;
    }
    @Export(name="minSize", refs={Integer.class}, tree="[0]")
    private Output<Integer> minSize;

    public Output<Integer> minSize() {
        return this.minSize;
    }
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }
    @Export(name="network", refs={ElastigroupAzureV3Network.class}, tree="[0]")
    private Output<ElastigroupAzureV3Network> network;

    public Output<ElastigroupAzureV3Network> network() {
        return this.network;
    }
    @Export(name="onDemandCount", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> onDemandCount;

    public Output<Optional<Integer>> onDemandCount() {
        return Codegen.optional(this.onDemandCount);
    }
    @Export(name="os", refs={String.class}, tree="[0]")
    private Output<String> os;

    public Output<String> os() {
        return this.os;
    }
    @Export(name="region", refs={String.class}, tree="[0]")
    private Output<String> region;

    public Output<String> region() {
        return this.region;
    }
    @Export(name="resourceGroupName", refs={String.class}, tree="[0]")
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    @Export(name="spotPercentage", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> spotPercentage;

    public Output<Optional<Integer>> spotPercentage() {
        return Codegen.optional(this.spotPercentage);
    }
    @Export(name="tags", refs={List.class,ElastigroupAzureV3Tag.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ElastigroupAzureV3Tag>> tags;

    public Output<Optional<List<ElastigroupAzureV3Tag>>> tags() {
        return Codegen.optional(this.tags);
    }
    @Export(name="vmSizes", refs={ElastigroupAzureV3VmSizes.class}, tree="[0]")
    private Output<ElastigroupAzureV3VmSizes> vmSizes;

    public Output<ElastigroupAzureV3VmSizes> vmSizes() {
        return this.vmSizes;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ElastigroupAzureV3(java.lang.String name) {
        this(name, ElastigroupAzureV3Args.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ElastigroupAzureV3(java.lang.String name, ElastigroupAzureV3Args args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ElastigroupAzureV3(java.lang.String name, ElastigroupAzureV3Args args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("spotinst:index/elastigroupAzureV3:ElastigroupAzureV3", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ElastigroupAzureV3(java.lang.String name, Output<java.lang.String> id, @Nullable ElastigroupAzureV3State state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("spotinst:index/elastigroupAzureV3:ElastigroupAzureV3", name, state, makeResourceOptions(options, id), false);
    }

    private static ElastigroupAzureV3Args makeArgs(ElastigroupAzureV3Args args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ElastigroupAzureV3Args.Empty : args;
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
    public static ElastigroupAzureV3 get(java.lang.String name, Output<java.lang.String> id, @Nullable ElastigroupAzureV3State state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ElastigroupAzureV3(name, id, state, options);
    }
}
