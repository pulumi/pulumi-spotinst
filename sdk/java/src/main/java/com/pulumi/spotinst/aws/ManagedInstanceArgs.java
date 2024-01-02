// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.spotinst.aws.inputs.ManagedInstanceBlockDeviceMappingArgs;
import com.pulumi.spotinst.aws.inputs.ManagedInstanceDeleteArgs;
import com.pulumi.spotinst.aws.inputs.ManagedInstanceIntegrationRoute53Args;
import com.pulumi.spotinst.aws.inputs.ManagedInstanceLoadBalancerArgs;
import com.pulumi.spotinst.aws.inputs.ManagedInstanceManagedInstanceActionArgs;
import com.pulumi.spotinst.aws.inputs.ManagedInstanceNetworkInterfaceArgs;
import com.pulumi.spotinst.aws.inputs.ManagedInstanceResourceTagSpecificationArgs;
import com.pulumi.spotinst.aws.inputs.ManagedInstanceRevertToSpotArgs;
import com.pulumi.spotinst.aws.inputs.ManagedInstanceScheduledTaskArgs;
import com.pulumi.spotinst.aws.inputs.ManagedInstanceTagArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ManagedInstanceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagedInstanceArgs Empty = new ManagedInstanceArgs();

    @Import(name="autoHealing")
    private @Nullable Output<Boolean> autoHealing;

    public Optional<Output<Boolean>> autoHealing() {
        return Optional.ofNullable(this.autoHealing);
    }

    @Import(name="blockDeviceMappings")
    private @Nullable Output<List<ManagedInstanceBlockDeviceMappingArgs>> blockDeviceMappings;

    public Optional<Output<List<ManagedInstanceBlockDeviceMappingArgs>>> blockDeviceMappings() {
        return Optional.ofNullable(this.blockDeviceMappings);
    }

    @Import(name="blockDevicesMode")
    private @Nullable Output<String> blockDevicesMode;

    public Optional<Output<String>> blockDevicesMode() {
        return Optional.ofNullable(this.blockDevicesMode);
    }

    @Import(name="cpuCredits")
    private @Nullable Output<String> cpuCredits;

    public Optional<Output<String>> cpuCredits() {
        return Optional.ofNullable(this.cpuCredits);
    }

    @Import(name="deletes")
    private @Nullable Output<List<ManagedInstanceDeleteArgs>> deletes;

    public Optional<Output<List<ManagedInstanceDeleteArgs>>> deletes() {
        return Optional.ofNullable(this.deletes);
    }

    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="drainingTimeout")
    private @Nullable Output<Integer> drainingTimeout;

    public Optional<Output<Integer>> drainingTimeout() {
        return Optional.ofNullable(this.drainingTimeout);
    }

    @Import(name="ebsOptimized")
    private @Nullable Output<Boolean> ebsOptimized;

    public Optional<Output<Boolean>> ebsOptimized() {
        return Optional.ofNullable(this.ebsOptimized);
    }

    @Import(name="elasticIp")
    private @Nullable Output<String> elasticIp;

    public Optional<Output<String>> elasticIp() {
        return Optional.ofNullable(this.elasticIp);
    }

    @Import(name="enableMonitoring")
    private @Nullable Output<Boolean> enableMonitoring;

    public Optional<Output<Boolean>> enableMonitoring() {
        return Optional.ofNullable(this.enableMonitoring);
    }

    @Import(name="fallBackToOd")
    private @Nullable Output<Boolean> fallBackToOd;

    public Optional<Output<Boolean>> fallBackToOd() {
        return Optional.ofNullable(this.fallBackToOd);
    }

    @Import(name="gracePeriod")
    private @Nullable Output<Integer> gracePeriod;

    public Optional<Output<Integer>> gracePeriod() {
        return Optional.ofNullable(this.gracePeriod);
    }

    @Import(name="healthCheckType")
    private @Nullable Output<String> healthCheckType;

    public Optional<Output<String>> healthCheckType() {
        return Optional.ofNullable(this.healthCheckType);
    }

    @Import(name="iamInstanceProfile")
    private @Nullable Output<String> iamInstanceProfile;

    public Optional<Output<String>> iamInstanceProfile() {
        return Optional.ofNullable(this.iamInstanceProfile);
    }

    @Import(name="imageId", required=true)
    private Output<String> imageId;

    public Output<String> imageId() {
        return this.imageId;
    }

    @Import(name="instanceTypes", required=true)
    private Output<List<String>> instanceTypes;

    public Output<List<String>> instanceTypes() {
        return this.instanceTypes;
    }

    @Import(name="integrationRoute53")
    private @Nullable Output<ManagedInstanceIntegrationRoute53Args> integrationRoute53;

    public Optional<Output<ManagedInstanceIntegrationRoute53Args>> integrationRoute53() {
        return Optional.ofNullable(this.integrationRoute53);
    }

    @Import(name="keyPair")
    private @Nullable Output<String> keyPair;

    public Optional<Output<String>> keyPair() {
        return Optional.ofNullable(this.keyPair);
    }

    @Import(name="lifeCycle")
    private @Nullable Output<String> lifeCycle;

    public Optional<Output<String>> lifeCycle() {
        return Optional.ofNullable(this.lifeCycle);
    }

    @Import(name="loadBalancers")
    private @Nullable Output<List<ManagedInstanceLoadBalancerArgs>> loadBalancers;

    public Optional<Output<List<ManagedInstanceLoadBalancerArgs>>> loadBalancers() {
        return Optional.ofNullable(this.loadBalancers);
    }

    @Import(name="managedInstanceAction")
    private @Nullable Output<ManagedInstanceManagedInstanceActionArgs> managedInstanceAction;

    public Optional<Output<ManagedInstanceManagedInstanceActionArgs>> managedInstanceAction() {
        return Optional.ofNullable(this.managedInstanceAction);
    }

    @Import(name="minimumInstanceLifetime")
    private @Nullable Output<Integer> minimumInstanceLifetime;

    public Optional<Output<Integer>> minimumInstanceLifetime() {
        return Optional.ofNullable(this.minimumInstanceLifetime);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="networkInterfaces")
    private @Nullable Output<List<ManagedInstanceNetworkInterfaceArgs>> networkInterfaces;

    public Optional<Output<List<ManagedInstanceNetworkInterfaceArgs>>> networkInterfaces() {
        return Optional.ofNullable(this.networkInterfaces);
    }

    @Import(name="optimizationWindows")
    private @Nullable Output<List<String>> optimizationWindows;

    public Optional<Output<List<String>>> optimizationWindows() {
        return Optional.ofNullable(this.optimizationWindows);
    }

    @Import(name="orientation")
    private @Nullable Output<String> orientation;

    public Optional<Output<String>> orientation() {
        return Optional.ofNullable(this.orientation);
    }

    @Import(name="persistBlockDevices", required=true)
    private Output<Boolean> persistBlockDevices;

    public Output<Boolean> persistBlockDevices() {
        return this.persistBlockDevices;
    }

    @Import(name="persistPrivateIp")
    private @Nullable Output<Boolean> persistPrivateIp;

    public Optional<Output<Boolean>> persistPrivateIp() {
        return Optional.ofNullable(this.persistPrivateIp);
    }

    @Import(name="persistRootDevice")
    private @Nullable Output<Boolean> persistRootDevice;

    public Optional<Output<Boolean>> persistRootDevice() {
        return Optional.ofNullable(this.persistRootDevice);
    }

    @Import(name="placementTenancy")
    private @Nullable Output<String> placementTenancy;

    public Optional<Output<String>> placementTenancy() {
        return Optional.ofNullable(this.placementTenancy);
    }

    @Import(name="preferredType")
    private @Nullable Output<String> preferredType;

    public Optional<Output<String>> preferredType() {
        return Optional.ofNullable(this.preferredType);
    }

    @Import(name="privateIp")
    private @Nullable Output<String> privateIp;

    public Optional<Output<String>> privateIp() {
        return Optional.ofNullable(this.privateIp);
    }

    @Import(name="product", required=true)
    private Output<String> product;

    public Output<String> product() {
        return this.product;
    }

    @Import(name="region")
    private @Nullable Output<String> region;

    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    @Import(name="resourceTagSpecifications")
    private @Nullable Output<List<ManagedInstanceResourceTagSpecificationArgs>> resourceTagSpecifications;

    public Optional<Output<List<ManagedInstanceResourceTagSpecificationArgs>>> resourceTagSpecifications() {
        return Optional.ofNullable(this.resourceTagSpecifications);
    }

    @Import(name="revertToSpot")
    private @Nullable Output<ManagedInstanceRevertToSpotArgs> revertToSpot;

    public Optional<Output<ManagedInstanceRevertToSpotArgs>> revertToSpot() {
        return Optional.ofNullable(this.revertToSpot);
    }

    @Import(name="scheduledTasks")
    private @Nullable Output<List<ManagedInstanceScheduledTaskArgs>> scheduledTasks;

    public Optional<Output<List<ManagedInstanceScheduledTaskArgs>>> scheduledTasks() {
        return Optional.ofNullable(this.scheduledTasks);
    }

    @Import(name="securityGroupIds")
    private @Nullable Output<List<String>> securityGroupIds;

    public Optional<Output<List<String>>> securityGroupIds() {
        return Optional.ofNullable(this.securityGroupIds);
    }

    @Import(name="shutdownScript")
    private @Nullable Output<String> shutdownScript;

    public Optional<Output<String>> shutdownScript() {
        return Optional.ofNullable(this.shutdownScript);
    }

    @Import(name="subnetIds", required=true)
    private Output<List<String>> subnetIds;

    public Output<List<String>> subnetIds() {
        return this.subnetIds;
    }

    @Import(name="tags")
    private @Nullable Output<List<ManagedInstanceTagArgs>> tags;

    public Optional<Output<List<ManagedInstanceTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    @Import(name="unhealthyDuration")
    private @Nullable Output<Integer> unhealthyDuration;

    public Optional<Output<Integer>> unhealthyDuration() {
        return Optional.ofNullable(this.unhealthyDuration);
    }

    @Import(name="userData")
    private @Nullable Output<String> userData;

    public Optional<Output<String>> userData() {
        return Optional.ofNullable(this.userData);
    }

    @Import(name="utilizeReservedInstances")
    private @Nullable Output<Boolean> utilizeReservedInstances;

    public Optional<Output<Boolean>> utilizeReservedInstances() {
        return Optional.ofNullable(this.utilizeReservedInstances);
    }

    @Import(name="vpcId", required=true)
    private Output<String> vpcId;

    public Output<String> vpcId() {
        return this.vpcId;
    }

    private ManagedInstanceArgs() {}

    private ManagedInstanceArgs(ManagedInstanceArgs $) {
        this.autoHealing = $.autoHealing;
        this.blockDeviceMappings = $.blockDeviceMappings;
        this.blockDevicesMode = $.blockDevicesMode;
        this.cpuCredits = $.cpuCredits;
        this.deletes = $.deletes;
        this.description = $.description;
        this.drainingTimeout = $.drainingTimeout;
        this.ebsOptimized = $.ebsOptimized;
        this.elasticIp = $.elasticIp;
        this.enableMonitoring = $.enableMonitoring;
        this.fallBackToOd = $.fallBackToOd;
        this.gracePeriod = $.gracePeriod;
        this.healthCheckType = $.healthCheckType;
        this.iamInstanceProfile = $.iamInstanceProfile;
        this.imageId = $.imageId;
        this.instanceTypes = $.instanceTypes;
        this.integrationRoute53 = $.integrationRoute53;
        this.keyPair = $.keyPair;
        this.lifeCycle = $.lifeCycle;
        this.loadBalancers = $.loadBalancers;
        this.managedInstanceAction = $.managedInstanceAction;
        this.minimumInstanceLifetime = $.minimumInstanceLifetime;
        this.name = $.name;
        this.networkInterfaces = $.networkInterfaces;
        this.optimizationWindows = $.optimizationWindows;
        this.orientation = $.orientation;
        this.persistBlockDevices = $.persistBlockDevices;
        this.persistPrivateIp = $.persistPrivateIp;
        this.persistRootDevice = $.persistRootDevice;
        this.placementTenancy = $.placementTenancy;
        this.preferredType = $.preferredType;
        this.privateIp = $.privateIp;
        this.product = $.product;
        this.region = $.region;
        this.resourceTagSpecifications = $.resourceTagSpecifications;
        this.revertToSpot = $.revertToSpot;
        this.scheduledTasks = $.scheduledTasks;
        this.securityGroupIds = $.securityGroupIds;
        this.shutdownScript = $.shutdownScript;
        this.subnetIds = $.subnetIds;
        this.tags = $.tags;
        this.unhealthyDuration = $.unhealthyDuration;
        this.userData = $.userData;
        this.utilizeReservedInstances = $.utilizeReservedInstances;
        this.vpcId = $.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedInstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedInstanceArgs $;

        public Builder() {
            $ = new ManagedInstanceArgs();
        }

        public Builder(ManagedInstanceArgs defaults) {
            $ = new ManagedInstanceArgs(Objects.requireNonNull(defaults));
        }

        public Builder autoHealing(@Nullable Output<Boolean> autoHealing) {
            $.autoHealing = autoHealing;
            return this;
        }

        public Builder autoHealing(Boolean autoHealing) {
            return autoHealing(Output.of(autoHealing));
        }

        public Builder blockDeviceMappings(@Nullable Output<List<ManagedInstanceBlockDeviceMappingArgs>> blockDeviceMappings) {
            $.blockDeviceMappings = blockDeviceMappings;
            return this;
        }

        public Builder blockDeviceMappings(List<ManagedInstanceBlockDeviceMappingArgs> blockDeviceMappings) {
            return blockDeviceMappings(Output.of(blockDeviceMappings));
        }

        public Builder blockDeviceMappings(ManagedInstanceBlockDeviceMappingArgs... blockDeviceMappings) {
            return blockDeviceMappings(List.of(blockDeviceMappings));
        }

        public Builder blockDevicesMode(@Nullable Output<String> blockDevicesMode) {
            $.blockDevicesMode = blockDevicesMode;
            return this;
        }

        public Builder blockDevicesMode(String blockDevicesMode) {
            return blockDevicesMode(Output.of(blockDevicesMode));
        }

        public Builder cpuCredits(@Nullable Output<String> cpuCredits) {
            $.cpuCredits = cpuCredits;
            return this;
        }

        public Builder cpuCredits(String cpuCredits) {
            return cpuCredits(Output.of(cpuCredits));
        }

        public Builder deletes(@Nullable Output<List<ManagedInstanceDeleteArgs>> deletes) {
            $.deletes = deletes;
            return this;
        }

        public Builder deletes(List<ManagedInstanceDeleteArgs> deletes) {
            return deletes(Output.of(deletes));
        }

        public Builder deletes(ManagedInstanceDeleteArgs... deletes) {
            return deletes(List.of(deletes));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder drainingTimeout(@Nullable Output<Integer> drainingTimeout) {
            $.drainingTimeout = drainingTimeout;
            return this;
        }

        public Builder drainingTimeout(Integer drainingTimeout) {
            return drainingTimeout(Output.of(drainingTimeout));
        }

        public Builder ebsOptimized(@Nullable Output<Boolean> ebsOptimized) {
            $.ebsOptimized = ebsOptimized;
            return this;
        }

        public Builder ebsOptimized(Boolean ebsOptimized) {
            return ebsOptimized(Output.of(ebsOptimized));
        }

        public Builder elasticIp(@Nullable Output<String> elasticIp) {
            $.elasticIp = elasticIp;
            return this;
        }

        public Builder elasticIp(String elasticIp) {
            return elasticIp(Output.of(elasticIp));
        }

        public Builder enableMonitoring(@Nullable Output<Boolean> enableMonitoring) {
            $.enableMonitoring = enableMonitoring;
            return this;
        }

        public Builder enableMonitoring(Boolean enableMonitoring) {
            return enableMonitoring(Output.of(enableMonitoring));
        }

        public Builder fallBackToOd(@Nullable Output<Boolean> fallBackToOd) {
            $.fallBackToOd = fallBackToOd;
            return this;
        }

        public Builder fallBackToOd(Boolean fallBackToOd) {
            return fallBackToOd(Output.of(fallBackToOd));
        }

        public Builder gracePeriod(@Nullable Output<Integer> gracePeriod) {
            $.gracePeriod = gracePeriod;
            return this;
        }

        public Builder gracePeriod(Integer gracePeriod) {
            return gracePeriod(Output.of(gracePeriod));
        }

        public Builder healthCheckType(@Nullable Output<String> healthCheckType) {
            $.healthCheckType = healthCheckType;
            return this;
        }

        public Builder healthCheckType(String healthCheckType) {
            return healthCheckType(Output.of(healthCheckType));
        }

        public Builder iamInstanceProfile(@Nullable Output<String> iamInstanceProfile) {
            $.iamInstanceProfile = iamInstanceProfile;
            return this;
        }

        public Builder iamInstanceProfile(String iamInstanceProfile) {
            return iamInstanceProfile(Output.of(iamInstanceProfile));
        }

        public Builder imageId(Output<String> imageId) {
            $.imageId = imageId;
            return this;
        }

        public Builder imageId(String imageId) {
            return imageId(Output.of(imageId));
        }

        public Builder instanceTypes(Output<List<String>> instanceTypes) {
            $.instanceTypes = instanceTypes;
            return this;
        }

        public Builder instanceTypes(List<String> instanceTypes) {
            return instanceTypes(Output.of(instanceTypes));
        }

        public Builder instanceTypes(String... instanceTypes) {
            return instanceTypes(List.of(instanceTypes));
        }

        public Builder integrationRoute53(@Nullable Output<ManagedInstanceIntegrationRoute53Args> integrationRoute53) {
            $.integrationRoute53 = integrationRoute53;
            return this;
        }

        public Builder integrationRoute53(ManagedInstanceIntegrationRoute53Args integrationRoute53) {
            return integrationRoute53(Output.of(integrationRoute53));
        }

        public Builder keyPair(@Nullable Output<String> keyPair) {
            $.keyPair = keyPair;
            return this;
        }

        public Builder keyPair(String keyPair) {
            return keyPair(Output.of(keyPair));
        }

        public Builder lifeCycle(@Nullable Output<String> lifeCycle) {
            $.lifeCycle = lifeCycle;
            return this;
        }

        public Builder lifeCycle(String lifeCycle) {
            return lifeCycle(Output.of(lifeCycle));
        }

        public Builder loadBalancers(@Nullable Output<List<ManagedInstanceLoadBalancerArgs>> loadBalancers) {
            $.loadBalancers = loadBalancers;
            return this;
        }

        public Builder loadBalancers(List<ManagedInstanceLoadBalancerArgs> loadBalancers) {
            return loadBalancers(Output.of(loadBalancers));
        }

        public Builder loadBalancers(ManagedInstanceLoadBalancerArgs... loadBalancers) {
            return loadBalancers(List.of(loadBalancers));
        }

        public Builder managedInstanceAction(@Nullable Output<ManagedInstanceManagedInstanceActionArgs> managedInstanceAction) {
            $.managedInstanceAction = managedInstanceAction;
            return this;
        }

        public Builder managedInstanceAction(ManagedInstanceManagedInstanceActionArgs managedInstanceAction) {
            return managedInstanceAction(Output.of(managedInstanceAction));
        }

        public Builder minimumInstanceLifetime(@Nullable Output<Integer> minimumInstanceLifetime) {
            $.minimumInstanceLifetime = minimumInstanceLifetime;
            return this;
        }

        public Builder minimumInstanceLifetime(Integer minimumInstanceLifetime) {
            return minimumInstanceLifetime(Output.of(minimumInstanceLifetime));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder networkInterfaces(@Nullable Output<List<ManagedInstanceNetworkInterfaceArgs>> networkInterfaces) {
            $.networkInterfaces = networkInterfaces;
            return this;
        }

        public Builder networkInterfaces(List<ManagedInstanceNetworkInterfaceArgs> networkInterfaces) {
            return networkInterfaces(Output.of(networkInterfaces));
        }

        public Builder networkInterfaces(ManagedInstanceNetworkInterfaceArgs... networkInterfaces) {
            return networkInterfaces(List.of(networkInterfaces));
        }

        public Builder optimizationWindows(@Nullable Output<List<String>> optimizationWindows) {
            $.optimizationWindows = optimizationWindows;
            return this;
        }

        public Builder optimizationWindows(List<String> optimizationWindows) {
            return optimizationWindows(Output.of(optimizationWindows));
        }

        public Builder optimizationWindows(String... optimizationWindows) {
            return optimizationWindows(List.of(optimizationWindows));
        }

        public Builder orientation(@Nullable Output<String> orientation) {
            $.orientation = orientation;
            return this;
        }

        public Builder orientation(String orientation) {
            return orientation(Output.of(orientation));
        }

        public Builder persistBlockDevices(Output<Boolean> persistBlockDevices) {
            $.persistBlockDevices = persistBlockDevices;
            return this;
        }

        public Builder persistBlockDevices(Boolean persistBlockDevices) {
            return persistBlockDevices(Output.of(persistBlockDevices));
        }

        public Builder persistPrivateIp(@Nullable Output<Boolean> persistPrivateIp) {
            $.persistPrivateIp = persistPrivateIp;
            return this;
        }

        public Builder persistPrivateIp(Boolean persistPrivateIp) {
            return persistPrivateIp(Output.of(persistPrivateIp));
        }

        public Builder persistRootDevice(@Nullable Output<Boolean> persistRootDevice) {
            $.persistRootDevice = persistRootDevice;
            return this;
        }

        public Builder persistRootDevice(Boolean persistRootDevice) {
            return persistRootDevice(Output.of(persistRootDevice));
        }

        public Builder placementTenancy(@Nullable Output<String> placementTenancy) {
            $.placementTenancy = placementTenancy;
            return this;
        }

        public Builder placementTenancy(String placementTenancy) {
            return placementTenancy(Output.of(placementTenancy));
        }

        public Builder preferredType(@Nullable Output<String> preferredType) {
            $.preferredType = preferredType;
            return this;
        }

        public Builder preferredType(String preferredType) {
            return preferredType(Output.of(preferredType));
        }

        public Builder privateIp(@Nullable Output<String> privateIp) {
            $.privateIp = privateIp;
            return this;
        }

        public Builder privateIp(String privateIp) {
            return privateIp(Output.of(privateIp));
        }

        public Builder product(Output<String> product) {
            $.product = product;
            return this;
        }

        public Builder product(String product) {
            return product(Output.of(product));
        }

        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        public Builder region(String region) {
            return region(Output.of(region));
        }

        public Builder resourceTagSpecifications(@Nullable Output<List<ManagedInstanceResourceTagSpecificationArgs>> resourceTagSpecifications) {
            $.resourceTagSpecifications = resourceTagSpecifications;
            return this;
        }

        public Builder resourceTagSpecifications(List<ManagedInstanceResourceTagSpecificationArgs> resourceTagSpecifications) {
            return resourceTagSpecifications(Output.of(resourceTagSpecifications));
        }

        public Builder resourceTagSpecifications(ManagedInstanceResourceTagSpecificationArgs... resourceTagSpecifications) {
            return resourceTagSpecifications(List.of(resourceTagSpecifications));
        }

        public Builder revertToSpot(@Nullable Output<ManagedInstanceRevertToSpotArgs> revertToSpot) {
            $.revertToSpot = revertToSpot;
            return this;
        }

        public Builder revertToSpot(ManagedInstanceRevertToSpotArgs revertToSpot) {
            return revertToSpot(Output.of(revertToSpot));
        }

        public Builder scheduledTasks(@Nullable Output<List<ManagedInstanceScheduledTaskArgs>> scheduledTasks) {
            $.scheduledTasks = scheduledTasks;
            return this;
        }

        public Builder scheduledTasks(List<ManagedInstanceScheduledTaskArgs> scheduledTasks) {
            return scheduledTasks(Output.of(scheduledTasks));
        }

        public Builder scheduledTasks(ManagedInstanceScheduledTaskArgs... scheduledTasks) {
            return scheduledTasks(List.of(scheduledTasks));
        }

        public Builder securityGroupIds(@Nullable Output<List<String>> securityGroupIds) {
            $.securityGroupIds = securityGroupIds;
            return this;
        }

        public Builder securityGroupIds(List<String> securityGroupIds) {
            return securityGroupIds(Output.of(securityGroupIds));
        }

        public Builder securityGroupIds(String... securityGroupIds) {
            return securityGroupIds(List.of(securityGroupIds));
        }

        public Builder shutdownScript(@Nullable Output<String> shutdownScript) {
            $.shutdownScript = shutdownScript;
            return this;
        }

        public Builder shutdownScript(String shutdownScript) {
            return shutdownScript(Output.of(shutdownScript));
        }

        public Builder subnetIds(Output<List<String>> subnetIds) {
            $.subnetIds = subnetIds;
            return this;
        }

        public Builder subnetIds(List<String> subnetIds) {
            return subnetIds(Output.of(subnetIds));
        }

        public Builder subnetIds(String... subnetIds) {
            return subnetIds(List.of(subnetIds));
        }

        public Builder tags(@Nullable Output<List<ManagedInstanceTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(List<ManagedInstanceTagArgs> tags) {
            return tags(Output.of(tags));
        }

        public Builder tags(ManagedInstanceTagArgs... tags) {
            return tags(List.of(tags));
        }

        public Builder unhealthyDuration(@Nullable Output<Integer> unhealthyDuration) {
            $.unhealthyDuration = unhealthyDuration;
            return this;
        }

        public Builder unhealthyDuration(Integer unhealthyDuration) {
            return unhealthyDuration(Output.of(unhealthyDuration));
        }

        public Builder userData(@Nullable Output<String> userData) {
            $.userData = userData;
            return this;
        }

        public Builder userData(String userData) {
            return userData(Output.of(userData));
        }

        public Builder utilizeReservedInstances(@Nullable Output<Boolean> utilizeReservedInstances) {
            $.utilizeReservedInstances = utilizeReservedInstances;
            return this;
        }

        public Builder utilizeReservedInstances(Boolean utilizeReservedInstances) {
            return utilizeReservedInstances(Output.of(utilizeReservedInstances));
        }

        public Builder vpcId(Output<String> vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        public Builder vpcId(String vpcId) {
            return vpcId(Output.of(vpcId));
        }

        public ManagedInstanceArgs build() {
            if ($.imageId == null) {
                throw new MissingRequiredPropertyException("ManagedInstanceArgs", "imageId");
            }
            if ($.instanceTypes == null) {
                throw new MissingRequiredPropertyException("ManagedInstanceArgs", "instanceTypes");
            }
            if ($.persistBlockDevices == null) {
                throw new MissingRequiredPropertyException("ManagedInstanceArgs", "persistBlockDevices");
            }
            if ($.product == null) {
                throw new MissingRequiredPropertyException("ManagedInstanceArgs", "product");
            }
            if ($.subnetIds == null) {
                throw new MissingRequiredPropertyException("ManagedInstanceArgs", "subnetIds");
            }
            if ($.vpcId == null) {
                throw new MissingRequiredPropertyException("ManagedInstanceArgs", "vpcId");
            }
            return $;
        }
    }

}
