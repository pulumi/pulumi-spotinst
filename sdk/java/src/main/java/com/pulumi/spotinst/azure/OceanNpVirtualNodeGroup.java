// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.azure;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.spotinst.Utilities;
import com.pulumi.spotinst.azure.OceanNpVirtualNodeGroupArgs;
import com.pulumi.spotinst.azure.inputs.OceanNpVirtualNodeGroupState;
import com.pulumi.spotinst.azure.outputs.OceanNpVirtualNodeGroupHeadroom;
import com.pulumi.spotinst.azure.outputs.OceanNpVirtualNodeGroupTaint;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="spotinst:azure/oceanNpVirtualNodeGroup:OceanNpVirtualNodeGroup")
public class OceanNpVirtualNodeGroup extends com.pulumi.resources.CustomResource {
    @Export(name="availabilityZones", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> availabilityZones;

    public Output<Optional<List<String>>> availabilityZones() {
        return Codegen.optional(this.availabilityZones);
    }
    @Export(name="enableNodePublicIp", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableNodePublicIp;

    public Output<Optional<Boolean>> enableNodePublicIp() {
        return Codegen.optional(this.enableNodePublicIp);
    }
    @Export(name="fallbackToOndemand", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> fallbackToOndemand;

    public Output<Optional<Boolean>> fallbackToOndemand() {
        return Codegen.optional(this.fallbackToOndemand);
    }
    @Export(name="headrooms", type=List.class, parameters={OceanNpVirtualNodeGroupHeadroom.class})
    private Output</* @Nullable */ List<OceanNpVirtualNodeGroupHeadroom>> headrooms;

    public Output<Optional<List<OceanNpVirtualNodeGroupHeadroom>>> headrooms() {
        return Codegen.optional(this.headrooms);
    }
    @Export(name="labels", type=Map.class, parameters={String.class, Object.class})
    private Output</* @Nullable */ Map<String,Object>> labels;

    public Output<Optional<Map<String,Object>>> labels() {
        return Codegen.optional(this.labels);
    }
    @Export(name="maxCount", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> maxCount;

    public Output<Optional<Integer>> maxCount() {
        return Codegen.optional(this.maxCount);
    }
    @Export(name="maxPodsPerNode", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> maxPodsPerNode;

    public Output<Optional<Integer>> maxPodsPerNode() {
        return Codegen.optional(this.maxPodsPerNode);
    }
    @Export(name="minCount", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> minCount;

    public Output<Optional<Integer>> minCount() {
        return Codegen.optional(this.minCount);
    }
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }
    @Export(name="oceanId", type=String.class, parameters={})
    private Output<String> oceanId;

    public Output<String> oceanId() {
        return this.oceanId;
    }
    @Export(name="osDiskSizeGb", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> osDiskSizeGb;

    public Output<Optional<Integer>> osDiskSizeGb() {
        return Codegen.optional(this.osDiskSizeGb);
    }
    @Export(name="osDiskType", type=String.class, parameters={})
    private Output</* @Nullable */ String> osDiskType;

    public Output<Optional<String>> osDiskType() {
        return Codegen.optional(this.osDiskType);
    }
    @Export(name="osType", type=String.class, parameters={})
    private Output</* @Nullable */ String> osType;

    public Output<Optional<String>> osType() {
        return Codegen.optional(this.osType);
    }
    @Export(name="spotPercentage", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> spotPercentage;

    public Output<Optional<Integer>> spotPercentage() {
        return Codegen.optional(this.spotPercentage);
    }
    @Export(name="tags", type=Map.class, parameters={String.class, Object.class})
    private Output</* @Nullable */ Map<String,Object>> tags;

    public Output<Optional<Map<String,Object>>> tags() {
        return Codegen.optional(this.tags);
    }
    @Export(name="taints", type=List.class, parameters={OceanNpVirtualNodeGroupTaint.class})
    private Output</* @Nullable */ List<OceanNpVirtualNodeGroupTaint>> taints;

    public Output<Optional<List<OceanNpVirtualNodeGroupTaint>>> taints() {
        return Codegen.optional(this.taints);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public OceanNpVirtualNodeGroup(String name) {
        this(name, OceanNpVirtualNodeGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public OceanNpVirtualNodeGroup(String name, OceanNpVirtualNodeGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public OceanNpVirtualNodeGroup(String name, OceanNpVirtualNodeGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("spotinst:azure/oceanNpVirtualNodeGroup:OceanNpVirtualNodeGroup", name, args == null ? OceanNpVirtualNodeGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private OceanNpVirtualNodeGroup(String name, Output<String> id, @Nullable OceanNpVirtualNodeGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("spotinst:azure/oceanNpVirtualNodeGroup:OceanNpVirtualNodeGroup", name, state, makeResourceOptions(options, id));
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
    public static OceanNpVirtualNodeGroup get(String name, Output<String> id, @Nullable OceanNpVirtualNodeGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new OceanNpVirtualNodeGroup(name, id, state, options);
    }
}