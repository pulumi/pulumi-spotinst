// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.azure;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.spotinst.Utilities;
import com.pulumi.spotinst.azure.OceanNpArgs;
import com.pulumi.spotinst.azure.inputs.OceanNpState;
import com.pulumi.spotinst.azure.outputs.OceanNpAutoscaler;
import com.pulumi.spotinst.azure.outputs.OceanNpFilters;
import com.pulumi.spotinst.azure.outputs.OceanNpHeadroom;
import com.pulumi.spotinst.azure.outputs.OceanNpHealth;
import com.pulumi.spotinst.azure.outputs.OceanNpScheduling;
import com.pulumi.spotinst.azure.outputs.OceanNpTaint;
import com.pulumi.spotinst.azure.outputs.OceanNpUpdatePolicy;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="spotinst:azure/oceanNp:OceanNp")
public class OceanNp extends com.pulumi.resources.CustomResource {
    @Export(name="aksClusterName", refs={String.class}, tree="[0]")
    private Output<String> aksClusterName;

    public Output<String> aksClusterName() {
        return this.aksClusterName;
    }
    @Export(name="aksInfrastructureResourceGroupName", refs={String.class}, tree="[0]")
    private Output<String> aksInfrastructureResourceGroupName;

    public Output<String> aksInfrastructureResourceGroupName() {
        return this.aksInfrastructureResourceGroupName;
    }
    @Export(name="aksRegion", refs={String.class}, tree="[0]")
    private Output<String> aksRegion;

    public Output<String> aksRegion() {
        return this.aksRegion;
    }
    @Export(name="aksResourceGroupName", refs={String.class}, tree="[0]")
    private Output<String> aksResourceGroupName;

    public Output<String> aksResourceGroupName() {
        return this.aksResourceGroupName;
    }
    @Export(name="autoscaler", refs={OceanNpAutoscaler.class}, tree="[0]")
    private Output</* @Nullable */ OceanNpAutoscaler> autoscaler;

    public Output<Optional<OceanNpAutoscaler>> autoscaler() {
        return Codegen.optional(this.autoscaler);
    }
    @Export(name="availabilityZones", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> availabilityZones;

    public Output<List<String>> availabilityZones() {
        return this.availabilityZones;
    }
    @Export(name="controllerClusterId", refs={String.class}, tree="[0]")
    private Output<String> controllerClusterId;

    public Output<String> controllerClusterId() {
        return this.controllerClusterId;
    }
    @Export(name="enableNodePublicIp", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enableNodePublicIp;

    public Output<Optional<Boolean>> enableNodePublicIp() {
        return Codegen.optional(this.enableNodePublicIp);
    }
    @Export(name="fallbackToOndemand", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> fallbackToOndemand;

    public Output<Optional<Boolean>> fallbackToOndemand() {
        return Codegen.optional(this.fallbackToOndemand);
    }
    @Export(name="filters", refs={OceanNpFilters.class}, tree="[0]")
    private Output</* @Nullable */ OceanNpFilters> filters;

    public Output<Optional<OceanNpFilters>> filters() {
        return Codegen.optional(this.filters);
    }
    @Export(name="headrooms", refs={List.class,OceanNpHeadroom.class}, tree="[0,1]")
    private Output</* @Nullable */ List<OceanNpHeadroom>> headrooms;

    public Output<Optional<List<OceanNpHeadroom>>> headrooms() {
        return Codegen.optional(this.headrooms);
    }
    @Export(name="health", refs={OceanNpHealth.class}, tree="[0]")
    private Output</* @Nullable */ OceanNpHealth> health;

    public Output<Optional<OceanNpHealth>> health() {
        return Codegen.optional(this.health);
    }
    @Export(name="kubernetesVersion", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> kubernetesVersion;

    public Output<Optional<String>> kubernetesVersion() {
        return Codegen.optional(this.kubernetesVersion);
    }
    @Export(name="labels", refs={Map.class,String.class,Object.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,Object>> labels;

    public Output<Optional<Map<String,Object>>> labels() {
        return Codegen.optional(this.labels);
    }
    @Export(name="maxCount", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> maxCount;

    public Output<Optional<Integer>> maxCount() {
        return Codegen.optional(this.maxCount);
    }
    @Export(name="maxPodsPerNode", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> maxPodsPerNode;

    public Output<Optional<Integer>> maxPodsPerNode() {
        return Codegen.optional(this.maxPodsPerNode);
    }
    @Export(name="minCount", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> minCount;

    public Output<Optional<Integer>> minCount() {
        return Codegen.optional(this.minCount);
    }
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }
    @Export(name="osDiskSizeGb", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> osDiskSizeGb;

    public Output<Optional<Integer>> osDiskSizeGb() {
        return Codegen.optional(this.osDiskSizeGb);
    }
    @Export(name="osDiskType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> osDiskType;

    public Output<Optional<String>> osDiskType() {
        return Codegen.optional(this.osDiskType);
    }
    @Export(name="osSku", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> osSku;

    public Output<Optional<String>> osSku() {
        return Codegen.optional(this.osSku);
    }
    @Export(name="osType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> osType;

    public Output<Optional<String>> osType() {
        return Codegen.optional(this.osType);
    }
    @Export(name="podSubnetIds", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> podSubnetIds;

    public Output<Optional<List<String>>> podSubnetIds() {
        return Codegen.optional(this.podSubnetIds);
    }
    @Export(name="scheduling", refs={OceanNpScheduling.class}, tree="[0]")
    private Output</* @Nullable */ OceanNpScheduling> scheduling;

    public Output<Optional<OceanNpScheduling>> scheduling() {
        return Codegen.optional(this.scheduling);
    }
    @Export(name="spotPercentage", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> spotPercentage;

    public Output<Optional<Integer>> spotPercentage() {
        return Codegen.optional(this.spotPercentage);
    }
    @Export(name="tags", refs={Map.class,String.class,Object.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,Object>> tags;

    public Output<Optional<Map<String,Object>>> tags() {
        return Codegen.optional(this.tags);
    }
    @Export(name="taints", refs={List.class,OceanNpTaint.class}, tree="[0,1]")
    private Output</* @Nullable */ List<OceanNpTaint>> taints;

    public Output<Optional<List<OceanNpTaint>>> taints() {
        return Codegen.optional(this.taints);
    }
    @Export(name="updatePolicy", refs={OceanNpUpdatePolicy.class}, tree="[0]")
    private Output</* @Nullable */ OceanNpUpdatePolicy> updatePolicy;

    public Output<Optional<OceanNpUpdatePolicy>> updatePolicy() {
        return Codegen.optional(this.updatePolicy);
    }
    @Export(name="vnetSubnetIds", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> vnetSubnetIds;

    public Output<Optional<List<String>>> vnetSubnetIds() {
        return Codegen.optional(this.vnetSubnetIds);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public OceanNp(String name) {
        this(name, OceanNpArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public OceanNp(String name, OceanNpArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public OceanNp(String name, OceanNpArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("spotinst:azure/oceanNp:OceanNp", name, args == null ? OceanNpArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private OceanNp(String name, Output<String> id, @Nullable OceanNpState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("spotinst:azure/oceanNp:OceanNp", name, state, makeResourceOptions(options, id));
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
    public static OceanNp get(String name, Output<String> id, @Nullable OceanNpState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new OceanNp(name, id, state, options);
    }
}
