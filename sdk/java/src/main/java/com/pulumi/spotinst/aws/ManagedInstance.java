// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.spotinst.Utilities;
import com.pulumi.spotinst.aws.ManagedInstanceArgs;
import com.pulumi.spotinst.aws.inputs.ManagedInstanceState;
import com.pulumi.spotinst.aws.outputs.ManagedInstanceBlockDeviceMapping;
import com.pulumi.spotinst.aws.outputs.ManagedInstanceDelete;
import com.pulumi.spotinst.aws.outputs.ManagedInstanceIntegrationRoute53;
import com.pulumi.spotinst.aws.outputs.ManagedInstanceLoadBalancer;
import com.pulumi.spotinst.aws.outputs.ManagedInstanceManagedInstanceAction;
import com.pulumi.spotinst.aws.outputs.ManagedInstanceNetworkInterface;
import com.pulumi.spotinst.aws.outputs.ManagedInstanceResourceTagSpecification;
import com.pulumi.spotinst.aws.outputs.ManagedInstanceRevertToSpot;
import com.pulumi.spotinst.aws.outputs.ManagedInstanceScheduledTask;
import com.pulumi.spotinst.aws.outputs.ManagedInstanceTag;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="spotinst:aws/managedInstance:ManagedInstance")
public class ManagedInstance extends com.pulumi.resources.CustomResource {
    @Export(name="autoHealing", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> autoHealing;

    public Output<Optional<Boolean>> autoHealing() {
        return Codegen.optional(this.autoHealing);
    }
    @Export(name="blockDeviceMappings", refs={List.class,ManagedInstanceBlockDeviceMapping.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ManagedInstanceBlockDeviceMapping>> blockDeviceMappings;

    public Output<Optional<List<ManagedInstanceBlockDeviceMapping>>> blockDeviceMappings() {
        return Codegen.optional(this.blockDeviceMappings);
    }
    @Export(name="blockDevicesMode", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> blockDevicesMode;

    public Output<Optional<String>> blockDevicesMode() {
        return Codegen.optional(this.blockDevicesMode);
    }
    @Export(name="cpuCredits", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> cpuCredits;

    public Output<Optional<String>> cpuCredits() {
        return Codegen.optional(this.cpuCredits);
    }
    @Export(name="deletes", refs={List.class,ManagedInstanceDelete.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ManagedInstanceDelete>> deletes;

    public Output<Optional<List<ManagedInstanceDelete>>> deletes() {
        return Codegen.optional(this.deletes);
    }
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    @Export(name="drainingTimeout", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> drainingTimeout;

    public Output<Optional<Integer>> drainingTimeout() {
        return Codegen.optional(this.drainingTimeout);
    }
    @Export(name="ebsOptimized", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> ebsOptimized;

    public Output<Boolean> ebsOptimized() {
        return this.ebsOptimized;
    }
    @Export(name="elasticIp", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> elasticIp;

    public Output<Optional<String>> elasticIp() {
        return Codegen.optional(this.elasticIp);
    }
    @Export(name="enableMonitoring", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enableMonitoring;

    public Output<Optional<Boolean>> enableMonitoring() {
        return Codegen.optional(this.enableMonitoring);
    }
    @Export(name="fallbackToOndemand", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> fallbackToOndemand;

    public Output<Optional<Boolean>> fallbackToOndemand() {
        return Codegen.optional(this.fallbackToOndemand);
    }
    @Export(name="gracePeriod", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> gracePeriod;

    public Output<Optional<Integer>> gracePeriod() {
        return Codegen.optional(this.gracePeriod);
    }
    @Export(name="healthCheckType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> healthCheckType;

    public Output<Optional<String>> healthCheckType() {
        return Codegen.optional(this.healthCheckType);
    }
    @Export(name="iamInstanceProfile", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> iamInstanceProfile;

    public Output<Optional<String>> iamInstanceProfile() {
        return Codegen.optional(this.iamInstanceProfile);
    }
    @Export(name="imageId", refs={String.class}, tree="[0]")
    private Output<String> imageId;

    public Output<String> imageId() {
        return this.imageId;
    }
    @Export(name="instanceTypes", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> instanceTypes;

    public Output<List<String>> instanceTypes() {
        return this.instanceTypes;
    }
    @Export(name="integrationRoute53", refs={ManagedInstanceIntegrationRoute53.class}, tree="[0]")
    private Output</* @Nullable */ ManagedInstanceIntegrationRoute53> integrationRoute53;

    public Output<Optional<ManagedInstanceIntegrationRoute53>> integrationRoute53() {
        return Codegen.optional(this.integrationRoute53);
    }
    @Export(name="keyPair", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> keyPair;

    public Output<Optional<String>> keyPair() {
        return Codegen.optional(this.keyPair);
    }
    @Export(name="lifeCycle", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> lifeCycle;

    public Output<Optional<String>> lifeCycle() {
        return Codegen.optional(this.lifeCycle);
    }
    @Export(name="loadBalancers", refs={List.class,ManagedInstanceLoadBalancer.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ManagedInstanceLoadBalancer>> loadBalancers;

    public Output<Optional<List<ManagedInstanceLoadBalancer>>> loadBalancers() {
        return Codegen.optional(this.loadBalancers);
    }
    @Export(name="managedInstanceAction", refs={ManagedInstanceManagedInstanceAction.class}, tree="[0]")
    private Output</* @Nullable */ ManagedInstanceManagedInstanceAction> managedInstanceAction;

    public Output<Optional<ManagedInstanceManagedInstanceAction>> managedInstanceAction() {
        return Codegen.optional(this.managedInstanceAction);
    }
    @Export(name="minimumInstanceLifetime", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> minimumInstanceLifetime;

    public Output<Optional<Integer>> minimumInstanceLifetime() {
        return Codegen.optional(this.minimumInstanceLifetime);
    }
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }
    @Export(name="networkInterfaces", refs={List.class,ManagedInstanceNetworkInterface.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ManagedInstanceNetworkInterface>> networkInterfaces;

    public Output<Optional<List<ManagedInstanceNetworkInterface>>> networkInterfaces() {
        return Codegen.optional(this.networkInterfaces);
    }
    @Export(name="optimizationWindows", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> optimizationWindows;

    public Output<Optional<List<String>>> optimizationWindows() {
        return Codegen.optional(this.optimizationWindows);
    }
    @Export(name="orientation", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> orientation;

    public Output<Optional<String>> orientation() {
        return Codegen.optional(this.orientation);
    }
    @Export(name="persistBlockDevices", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> persistBlockDevices;

    public Output<Boolean> persistBlockDevices() {
        return this.persistBlockDevices;
    }
    @Export(name="persistPrivateIp", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> persistPrivateIp;

    public Output<Optional<Boolean>> persistPrivateIp() {
        return Codegen.optional(this.persistPrivateIp);
    }
    @Export(name="persistRootDevice", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> persistRootDevice;

    public Output<Optional<Boolean>> persistRootDevice() {
        return Codegen.optional(this.persistRootDevice);
    }
    @Export(name="placementTenancy", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> placementTenancy;

    public Output<Optional<String>> placementTenancy() {
        return Codegen.optional(this.placementTenancy);
    }
    @Export(name="preferredType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> preferredType;

    public Output<Optional<String>> preferredType() {
        return Codegen.optional(this.preferredType);
    }
    @Export(name="privateIp", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> privateIp;

    public Output<Optional<String>> privateIp() {
        return Codegen.optional(this.privateIp);
    }
    @Export(name="product", refs={String.class}, tree="[0]")
    private Output<String> product;

    public Output<String> product() {
        return this.product;
    }
    @Export(name="region", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> region;

    public Output<Optional<String>> region() {
        return Codegen.optional(this.region);
    }
    @Export(name="resourceTagSpecifications", refs={List.class,ManagedInstanceResourceTagSpecification.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ManagedInstanceResourceTagSpecification>> resourceTagSpecifications;

    public Output<Optional<List<ManagedInstanceResourceTagSpecification>>> resourceTagSpecifications() {
        return Codegen.optional(this.resourceTagSpecifications);
    }
    @Export(name="revertToSpot", refs={ManagedInstanceRevertToSpot.class}, tree="[0]")
    private Output</* @Nullable */ ManagedInstanceRevertToSpot> revertToSpot;

    public Output<Optional<ManagedInstanceRevertToSpot>> revertToSpot() {
        return Codegen.optional(this.revertToSpot);
    }
    @Export(name="scheduledTasks", refs={List.class,ManagedInstanceScheduledTask.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ManagedInstanceScheduledTask>> scheduledTasks;

    public Output<Optional<List<ManagedInstanceScheduledTask>>> scheduledTasks() {
        return Codegen.optional(this.scheduledTasks);
    }
    @Export(name="securityGroupIds", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> securityGroupIds;

    public Output<Optional<List<String>>> securityGroupIds() {
        return Codegen.optional(this.securityGroupIds);
    }
    @Export(name="shutdownScript", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> shutdownScript;

    public Output<Optional<String>> shutdownScript() {
        return Codegen.optional(this.shutdownScript);
    }
    @Export(name="subnetIds", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> subnetIds;

    public Output<List<String>> subnetIds() {
        return this.subnetIds;
    }
    @Export(name="tags", refs={List.class,ManagedInstanceTag.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ManagedInstanceTag>> tags;

    public Output<Optional<List<ManagedInstanceTag>>> tags() {
        return Codegen.optional(this.tags);
    }
    @Export(name="unhealthyDuration", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> unhealthyDuration;

    public Output<Optional<Integer>> unhealthyDuration() {
        return Codegen.optional(this.unhealthyDuration);
    }
    @Export(name="userData", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> userData;

    public Output<Optional<String>> userData() {
        return Codegen.optional(this.userData);
    }
    @Export(name="utilizeReservedInstances", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> utilizeReservedInstances;

    public Output<Optional<Boolean>> utilizeReservedInstances() {
        return Codegen.optional(this.utilizeReservedInstances);
    }
    @Export(name="vpcId", refs={String.class}, tree="[0]")
    private Output<String> vpcId;

    public Output<String> vpcId() {
        return this.vpcId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ManagedInstance(String name) {
        this(name, ManagedInstanceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ManagedInstance(String name, ManagedInstanceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ManagedInstance(String name, ManagedInstanceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("spotinst:aws/managedInstance:ManagedInstance", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()));
    }

    private ManagedInstance(String name, Output<String> id, @Nullable ManagedInstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("spotinst:aws/managedInstance:ManagedInstance", name, state, makeResourceOptions(options, id));
    }

    private static ManagedInstanceArgs makeArgs(ManagedInstanceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ManagedInstanceArgs.Empty : args;
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
    public static ManagedInstance get(String name, Output<String> id, @Nullable ManagedInstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ManagedInstance(name, id, state, options);
    }
}
