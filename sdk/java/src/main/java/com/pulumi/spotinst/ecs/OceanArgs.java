// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.ecs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.spotinst.ecs.inputs.OceanAutoscalerArgs;
import com.pulumi.spotinst.ecs.inputs.OceanBlockDeviceMappingArgs;
import com.pulumi.spotinst.ecs.inputs.OceanInstanceMetadataOptionsArgs;
import com.pulumi.spotinst.ecs.inputs.OceanLoggingArgs;
import com.pulumi.spotinst.ecs.inputs.OceanOptimizeImagesArgs;
import com.pulumi.spotinst.ecs.inputs.OceanScheduledTaskArgs;
import com.pulumi.spotinst.ecs.inputs.OceanTagArgs;
import com.pulumi.spotinst.ecs.inputs.OceanUpdatePolicyArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OceanArgs extends com.pulumi.resources.ResourceArgs {

    public static final OceanArgs Empty = new OceanArgs();

    /**
     * Configure public IP address allocation.
     * 
     */
    @Import(name="associatePublicIpAddress")
    private @Nullable Output<Boolean> associatePublicIpAddress;

    /**
     * @return Configure public IP address allocation.
     * 
     */
    public Optional<Output<Boolean>> associatePublicIpAddress() {
        return Optional.ofNullable(this.associatePublicIpAddress);
    }

    /**
     * Describes the Ocean ECS autoscaler.
     * 
     */
    @Import(name="autoscaler")
    private @Nullable Output<OceanAutoscalerArgs> autoscaler;

    /**
     * @return Describes the Ocean ECS autoscaler.
     * 
     */
    public Optional<Output<OceanAutoscalerArgs>> autoscaler() {
        return Optional.ofNullable(this.autoscaler);
    }

    /**
     * Object. List of block devices that are exposed to the instance, specify either virtual devices and EBS volumes.
     * 
     */
    @Import(name="blockDeviceMappings")
    private @Nullable Output<List<OceanBlockDeviceMappingArgs>> blockDeviceMappings;

    /**
     * @return Object. List of block devices that are exposed to the instance, specify either virtual devices and EBS volumes.
     * 
     */
    public Optional<Output<List<OceanBlockDeviceMappingArgs>>> blockDeviceMappings() {
        return Optional.ofNullable(this.blockDeviceMappings);
    }

    /**
     * The ocean cluster name.
     * 
     */
    @Import(name="clusterName", required=true)
    private Output<String> clusterName;

    /**
     * @return The ocean cluster name.
     * 
     */
    public Output<String> clusterName() {
        return this.clusterName;
    }

    /**
     * The number of instances to launch and maintain in the cluster.
     * 
     */
    @Import(name="desiredCapacity")
    private @Nullable Output<Integer> desiredCapacity;

    /**
     * @return The number of instances to launch and maintain in the cluster.
     * 
     */
    public Optional<Output<Integer>> desiredCapacity() {
        return Optional.ofNullable(this.desiredCapacity);
    }

    /**
     * The time in seconds, the instance is allowed to run while detached from the ELB. This is to allow the instance time to be drained from incoming TCP connections before terminating it, during a scale down operation.
     * 
     */
    @Import(name="drainingTimeout")
    private @Nullable Output<Integer> drainingTimeout;

    /**
     * @return The time in seconds, the instance is allowed to run while detached from the ELB. This is to allow the instance time to be drained from incoming TCP connections before terminating it, during a scale down operation.
     * 
     */
    public Optional<Output<Integer>> drainingTimeout() {
        return Optional.ofNullable(this.drainingTimeout);
    }

    /**
     * Enable EBS optimized for cluster. Flag will enable optimized capacity for high bandwidth connectivity to the EB service for non EBS optimized instance types. For instances that are EBS optimized this flag will be ignored.
     * 
     */
    @Import(name="ebsOptimized")
    private @Nullable Output<Boolean> ebsOptimized;

    /**
     * @return Enable EBS optimized for cluster. Flag will enable optimized capacity for high bandwidth connectivity to the EB service for non EBS optimized instance types. For instances that are EBS optimized this flag will be ignored.
     * 
     */
    public Optional<Output<Boolean>> ebsOptimized() {
        return Optional.ofNullable(this.ebsOptimized);
    }

    /**
     * The instance profile iam role.
     * 
     */
    @Import(name="iamInstanceProfile")
    private @Nullable Output<String> iamInstanceProfile;

    /**
     * @return The instance profile iam role.
     * 
     */
    public Optional<Output<String>> iamInstanceProfile() {
        return Optional.ofNullable(this.iamInstanceProfile);
    }

    /**
     * ID of the image used to launch the instances.
     * 
     */
    @Import(name="imageId")
    private @Nullable Output<String> imageId;

    /**
     * @return ID of the image used to launch the instances.
     * 
     */
    public Optional<Output<String>> imageId() {
        return Optional.ofNullable(this.imageId);
    }

    /**
     * Ocean instance metadata options object for IMDSv2.
     * 
     */
    @Import(name="instanceMetadataOptions")
    private @Nullable Output<OceanInstanceMetadataOptionsArgs> instanceMetadataOptions;

    /**
     * @return Ocean instance metadata options object for IMDSv2.
     * 
     */
    public Optional<Output<OceanInstanceMetadataOptionsArgs>> instanceMetadataOptions() {
        return Optional.ofNullable(this.instanceMetadataOptions);
    }

    /**
     * The key pair to attach the instances.
     * 
     */
    @Import(name="keyPair")
    private @Nullable Output<String> keyPair;

    /**
     * @return The key pair to attach the instances.
     * 
     */
    public Optional<Output<String>> keyPair() {
        return Optional.ofNullable(this.keyPair);
    }

    /**
     * Logging configuration.
     * 
     */
    @Import(name="logging")
    private @Nullable Output<OceanLoggingArgs> logging;

    /**
     * @return Logging configuration.
     * 
     */
    public Optional<Output<OceanLoggingArgs>> logging() {
        return Optional.ofNullable(this.logging);
    }

    /**
     * The upper limit of instances the cluster can scale up to.
     * 
     */
    @Import(name="maxSize")
    private @Nullable Output<Integer> maxSize;

    /**
     * @return The upper limit of instances the cluster can scale up to.
     * 
     */
    public Optional<Output<Integer>> maxSize() {
        return Optional.ofNullable(this.maxSize);
    }

    /**
     * The lower limit of instances the cluster can scale down to.
     * 
     */
    @Import(name="minSize")
    private @Nullable Output<Integer> minSize;

    /**
     * @return The lower limit of instances the cluster can scale down to.
     * 
     */
    public Optional<Output<Integer>> minSize() {
        return Optional.ofNullable(this.minSize);
    }

    /**
     * Enable detailed monitoring for cluster. Flag will enable Cloud Watch detailed monitoring (one minute increments). Note: there are additional hourly costs for this service based on the region used.
     * 
     */
    @Import(name="monitoring")
    private @Nullable Output<Boolean> monitoring;

    /**
     * @return Enable detailed monitoring for cluster. Flag will enable Cloud Watch detailed monitoring (one minute increments). Note: there are additional hourly costs for this service based on the region used.
     * 
     */
    public Optional<Output<Boolean>> monitoring() {
        return Optional.ofNullable(this.monitoring);
    }

    /**
     * The Ocean cluster name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The Ocean cluster name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Object. Set auto image update settings.
     * 
     */
    @Import(name="optimizeImages")
    private @Nullable Output<OceanOptimizeImagesArgs> optimizeImages;

    /**
     * @return Object. Set auto image update settings.
     * 
     */
    public Optional<Output<OceanOptimizeImagesArgs>> optimizeImages() {
        return Optional.ofNullable(this.optimizeImages);
    }

    /**
     * The region the cluster will run in.
     * 
     */
    @Import(name="region", required=true)
    private Output<String> region;

    /**
     * @return The region the cluster will run in.
     * 
     */
    public Output<String> region() {
        return this.region;
    }

    /**
     * While used, you can control whether the group should perform a deployment after an update to the configuration.
     * 
     */
    @Import(name="scheduledTasks")
    private @Nullable Output<List<OceanScheduledTaskArgs>> scheduledTasks;

    /**
     * @return While used, you can control whether the group should perform a deployment after an update to the configuration.
     * 
     */
    public Optional<Output<List<OceanScheduledTaskArgs>>> scheduledTasks() {
        return Optional.ofNullable(this.scheduledTasks);
    }

    /**
     * One or more security group ids.
     * 
     */
    @Import(name="securityGroupIds", required=true)
    private Output<List<String>> securityGroupIds;

    /**
     * @return One or more security group ids.
     * 
     */
    public Output<List<String>> securityGroupIds() {
        return this.securityGroupIds;
    }

    /**
     * The percentage of Spot instances that would spin up from the `desired_capacity` number.
     * 
     */
    @Import(name="spotPercentage")
    private @Nullable Output<Integer> spotPercentage;

    /**
     * @return The percentage of Spot instances that would spin up from the `desired_capacity` number.
     * 
     */
    public Optional<Output<Integer>> spotPercentage() {
        return Optional.ofNullable(this.spotPercentage);
    }

    /**
     * A comma-separated list of subnet identifiers for the Ocean cluster. Subnet IDs should be configured with auto assign public ip.
     * 
     */
    @Import(name="subnetIds", required=true)
    private Output<List<String>> subnetIds;

    /**
     * @return A comma-separated list of subnet identifiers for the Ocean cluster. Subnet IDs should be configured with auto assign public ip.
     * 
     */
    public Output<List<String>> subnetIds() {
        return this.subnetIds;
    }

    /**
     * Optionally adds tags to instances launched in an Ocean cluster.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<OceanTagArgs>> tags;

    /**
     * @return Optionally adds tags to instances launched in an Ocean cluster.
     * 
     */
    public Optional<Output<List<OceanTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * While used, you can control whether the group should perform a deployment after an update to the configuration.
     * 
     */
    @Import(name="updatePolicy")
    private @Nullable Output<OceanUpdatePolicyArgs> updatePolicy;

    /**
     * @return While used, you can control whether the group should perform a deployment after an update to the configuration.
     * 
     */
    public Optional<Output<OceanUpdatePolicyArgs>> updatePolicy() {
        return Optional.ofNullable(this.updatePolicy);
    }

    /**
     * launch specification defined on the Ocean object will function only as a template for virtual node groups.
     * 
     */
    @Import(name="useAsTemplateOnly")
    private @Nullable Output<Boolean> useAsTemplateOnly;

    /**
     * @return launch specification defined on the Ocean object will function only as a template for virtual node groups.
     * 
     */
    public Optional<Output<Boolean>> useAsTemplateOnly() {
        return Optional.ofNullable(this.useAsTemplateOnly);
    }

    /**
     * Base64-encoded MIME user data to make available to the instances.
     * 
     */
    @Import(name="userData")
    private @Nullable Output<String> userData;

    /**
     * @return Base64-encoded MIME user data to make available to the instances.
     * 
     */
    public Optional<Output<String>> userData() {
        return Optional.ofNullable(this.userData);
    }

    /**
     * If savings plans exist, Ocean will utilize them before launching Spot instances.
     * 
     */
    @Import(name="utilizeCommitments")
    private @Nullable Output<Boolean> utilizeCommitments;

    /**
     * @return If savings plans exist, Ocean will utilize them before launching Spot instances.
     * 
     */
    public Optional<Output<Boolean>> utilizeCommitments() {
        return Optional.ofNullable(this.utilizeCommitments);
    }

    /**
     * If Reserved instances exist, Ocean will utilize them before launching Spot instances.
     * 
     */
    @Import(name="utilizeReservedInstances")
    private @Nullable Output<Boolean> utilizeReservedInstances;

    /**
     * @return If Reserved instances exist, Ocean will utilize them before launching Spot instances.
     * 
     */
    public Optional<Output<Boolean>> utilizeReservedInstances() {
        return Optional.ofNullable(this.utilizeReservedInstances);
    }

    /**
     * Instance types allowed in the Ocean cluster, Cannot be configured if blacklist is configured.
     * 
     */
    @Import(name="whitelists")
    private @Nullable Output<List<String>> whitelists;

    /**
     * @return Instance types allowed in the Ocean cluster, Cannot be configured if blacklist is configured.
     * 
     */
    public Optional<Output<List<String>>> whitelists() {
        return Optional.ofNullable(this.whitelists);
    }

    private OceanArgs() {}

    private OceanArgs(OceanArgs $) {
        this.associatePublicIpAddress = $.associatePublicIpAddress;
        this.autoscaler = $.autoscaler;
        this.blockDeviceMappings = $.blockDeviceMappings;
        this.clusterName = $.clusterName;
        this.desiredCapacity = $.desiredCapacity;
        this.drainingTimeout = $.drainingTimeout;
        this.ebsOptimized = $.ebsOptimized;
        this.iamInstanceProfile = $.iamInstanceProfile;
        this.imageId = $.imageId;
        this.instanceMetadataOptions = $.instanceMetadataOptions;
        this.keyPair = $.keyPair;
        this.logging = $.logging;
        this.maxSize = $.maxSize;
        this.minSize = $.minSize;
        this.monitoring = $.monitoring;
        this.name = $.name;
        this.optimizeImages = $.optimizeImages;
        this.region = $.region;
        this.scheduledTasks = $.scheduledTasks;
        this.securityGroupIds = $.securityGroupIds;
        this.spotPercentage = $.spotPercentage;
        this.subnetIds = $.subnetIds;
        this.tags = $.tags;
        this.updatePolicy = $.updatePolicy;
        this.useAsTemplateOnly = $.useAsTemplateOnly;
        this.userData = $.userData;
        this.utilizeCommitments = $.utilizeCommitments;
        this.utilizeReservedInstances = $.utilizeReservedInstances;
        this.whitelists = $.whitelists;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OceanArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OceanArgs $;

        public Builder() {
            $ = new OceanArgs();
        }

        public Builder(OceanArgs defaults) {
            $ = new OceanArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param associatePublicIpAddress Configure public IP address allocation.
         * 
         * @return builder
         * 
         */
        public Builder associatePublicIpAddress(@Nullable Output<Boolean> associatePublicIpAddress) {
            $.associatePublicIpAddress = associatePublicIpAddress;
            return this;
        }

        /**
         * @param associatePublicIpAddress Configure public IP address allocation.
         * 
         * @return builder
         * 
         */
        public Builder associatePublicIpAddress(Boolean associatePublicIpAddress) {
            return associatePublicIpAddress(Output.of(associatePublicIpAddress));
        }

        /**
         * @param autoscaler Describes the Ocean ECS autoscaler.
         * 
         * @return builder
         * 
         */
        public Builder autoscaler(@Nullable Output<OceanAutoscalerArgs> autoscaler) {
            $.autoscaler = autoscaler;
            return this;
        }

        /**
         * @param autoscaler Describes the Ocean ECS autoscaler.
         * 
         * @return builder
         * 
         */
        public Builder autoscaler(OceanAutoscalerArgs autoscaler) {
            return autoscaler(Output.of(autoscaler));
        }

        /**
         * @param blockDeviceMappings Object. List of block devices that are exposed to the instance, specify either virtual devices and EBS volumes.
         * 
         * @return builder
         * 
         */
        public Builder blockDeviceMappings(@Nullable Output<List<OceanBlockDeviceMappingArgs>> blockDeviceMappings) {
            $.blockDeviceMappings = blockDeviceMappings;
            return this;
        }

        /**
         * @param blockDeviceMappings Object. List of block devices that are exposed to the instance, specify either virtual devices and EBS volumes.
         * 
         * @return builder
         * 
         */
        public Builder blockDeviceMappings(List<OceanBlockDeviceMappingArgs> blockDeviceMappings) {
            return blockDeviceMappings(Output.of(blockDeviceMappings));
        }

        /**
         * @param blockDeviceMappings Object. List of block devices that are exposed to the instance, specify either virtual devices and EBS volumes.
         * 
         * @return builder
         * 
         */
        public Builder blockDeviceMappings(OceanBlockDeviceMappingArgs... blockDeviceMappings) {
            return blockDeviceMappings(List.of(blockDeviceMappings));
        }

        /**
         * @param clusterName The ocean cluster name.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(Output<String> clusterName) {
            $.clusterName = clusterName;
            return this;
        }

        /**
         * @param clusterName The ocean cluster name.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(String clusterName) {
            return clusterName(Output.of(clusterName));
        }

        /**
         * @param desiredCapacity The number of instances to launch and maintain in the cluster.
         * 
         * @return builder
         * 
         */
        public Builder desiredCapacity(@Nullable Output<Integer> desiredCapacity) {
            $.desiredCapacity = desiredCapacity;
            return this;
        }

        /**
         * @param desiredCapacity The number of instances to launch and maintain in the cluster.
         * 
         * @return builder
         * 
         */
        public Builder desiredCapacity(Integer desiredCapacity) {
            return desiredCapacity(Output.of(desiredCapacity));
        }

        /**
         * @param drainingTimeout The time in seconds, the instance is allowed to run while detached from the ELB. This is to allow the instance time to be drained from incoming TCP connections before terminating it, during a scale down operation.
         * 
         * @return builder
         * 
         */
        public Builder drainingTimeout(@Nullable Output<Integer> drainingTimeout) {
            $.drainingTimeout = drainingTimeout;
            return this;
        }

        /**
         * @param drainingTimeout The time in seconds, the instance is allowed to run while detached from the ELB. This is to allow the instance time to be drained from incoming TCP connections before terminating it, during a scale down operation.
         * 
         * @return builder
         * 
         */
        public Builder drainingTimeout(Integer drainingTimeout) {
            return drainingTimeout(Output.of(drainingTimeout));
        }

        /**
         * @param ebsOptimized Enable EBS optimized for cluster. Flag will enable optimized capacity for high bandwidth connectivity to the EB service for non EBS optimized instance types. For instances that are EBS optimized this flag will be ignored.
         * 
         * @return builder
         * 
         */
        public Builder ebsOptimized(@Nullable Output<Boolean> ebsOptimized) {
            $.ebsOptimized = ebsOptimized;
            return this;
        }

        /**
         * @param ebsOptimized Enable EBS optimized for cluster. Flag will enable optimized capacity for high bandwidth connectivity to the EB service for non EBS optimized instance types. For instances that are EBS optimized this flag will be ignored.
         * 
         * @return builder
         * 
         */
        public Builder ebsOptimized(Boolean ebsOptimized) {
            return ebsOptimized(Output.of(ebsOptimized));
        }

        /**
         * @param iamInstanceProfile The instance profile iam role.
         * 
         * @return builder
         * 
         */
        public Builder iamInstanceProfile(@Nullable Output<String> iamInstanceProfile) {
            $.iamInstanceProfile = iamInstanceProfile;
            return this;
        }

        /**
         * @param iamInstanceProfile The instance profile iam role.
         * 
         * @return builder
         * 
         */
        public Builder iamInstanceProfile(String iamInstanceProfile) {
            return iamInstanceProfile(Output.of(iamInstanceProfile));
        }

        /**
         * @param imageId ID of the image used to launch the instances.
         * 
         * @return builder
         * 
         */
        public Builder imageId(@Nullable Output<String> imageId) {
            $.imageId = imageId;
            return this;
        }

        /**
         * @param imageId ID of the image used to launch the instances.
         * 
         * @return builder
         * 
         */
        public Builder imageId(String imageId) {
            return imageId(Output.of(imageId));
        }

        /**
         * @param instanceMetadataOptions Ocean instance metadata options object for IMDSv2.
         * 
         * @return builder
         * 
         */
        public Builder instanceMetadataOptions(@Nullable Output<OceanInstanceMetadataOptionsArgs> instanceMetadataOptions) {
            $.instanceMetadataOptions = instanceMetadataOptions;
            return this;
        }

        /**
         * @param instanceMetadataOptions Ocean instance metadata options object for IMDSv2.
         * 
         * @return builder
         * 
         */
        public Builder instanceMetadataOptions(OceanInstanceMetadataOptionsArgs instanceMetadataOptions) {
            return instanceMetadataOptions(Output.of(instanceMetadataOptions));
        }

        /**
         * @param keyPair The key pair to attach the instances.
         * 
         * @return builder
         * 
         */
        public Builder keyPair(@Nullable Output<String> keyPair) {
            $.keyPair = keyPair;
            return this;
        }

        /**
         * @param keyPair The key pair to attach the instances.
         * 
         * @return builder
         * 
         */
        public Builder keyPair(String keyPair) {
            return keyPair(Output.of(keyPair));
        }

        /**
         * @param logging Logging configuration.
         * 
         * @return builder
         * 
         */
        public Builder logging(@Nullable Output<OceanLoggingArgs> logging) {
            $.logging = logging;
            return this;
        }

        /**
         * @param logging Logging configuration.
         * 
         * @return builder
         * 
         */
        public Builder logging(OceanLoggingArgs logging) {
            return logging(Output.of(logging));
        }

        /**
         * @param maxSize The upper limit of instances the cluster can scale up to.
         * 
         * @return builder
         * 
         */
        public Builder maxSize(@Nullable Output<Integer> maxSize) {
            $.maxSize = maxSize;
            return this;
        }

        /**
         * @param maxSize The upper limit of instances the cluster can scale up to.
         * 
         * @return builder
         * 
         */
        public Builder maxSize(Integer maxSize) {
            return maxSize(Output.of(maxSize));
        }

        /**
         * @param minSize The lower limit of instances the cluster can scale down to.
         * 
         * @return builder
         * 
         */
        public Builder minSize(@Nullable Output<Integer> minSize) {
            $.minSize = minSize;
            return this;
        }

        /**
         * @param minSize The lower limit of instances the cluster can scale down to.
         * 
         * @return builder
         * 
         */
        public Builder minSize(Integer minSize) {
            return minSize(Output.of(minSize));
        }

        /**
         * @param monitoring Enable detailed monitoring for cluster. Flag will enable Cloud Watch detailed monitoring (one minute increments). Note: there are additional hourly costs for this service based on the region used.
         * 
         * @return builder
         * 
         */
        public Builder monitoring(@Nullable Output<Boolean> monitoring) {
            $.monitoring = monitoring;
            return this;
        }

        /**
         * @param monitoring Enable detailed monitoring for cluster. Flag will enable Cloud Watch detailed monitoring (one minute increments). Note: there are additional hourly costs for this service based on the region used.
         * 
         * @return builder
         * 
         */
        public Builder monitoring(Boolean monitoring) {
            return monitoring(Output.of(monitoring));
        }

        /**
         * @param name The Ocean cluster name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The Ocean cluster name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param optimizeImages Object. Set auto image update settings.
         * 
         * @return builder
         * 
         */
        public Builder optimizeImages(@Nullable Output<OceanOptimizeImagesArgs> optimizeImages) {
            $.optimizeImages = optimizeImages;
            return this;
        }

        /**
         * @param optimizeImages Object. Set auto image update settings.
         * 
         * @return builder
         * 
         */
        public Builder optimizeImages(OceanOptimizeImagesArgs optimizeImages) {
            return optimizeImages(Output.of(optimizeImages));
        }

        /**
         * @param region The region the cluster will run in.
         * 
         * @return builder
         * 
         */
        public Builder region(Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The region the cluster will run in.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param scheduledTasks While used, you can control whether the group should perform a deployment after an update to the configuration.
         * 
         * @return builder
         * 
         */
        public Builder scheduledTasks(@Nullable Output<List<OceanScheduledTaskArgs>> scheduledTasks) {
            $.scheduledTasks = scheduledTasks;
            return this;
        }

        /**
         * @param scheduledTasks While used, you can control whether the group should perform a deployment after an update to the configuration.
         * 
         * @return builder
         * 
         */
        public Builder scheduledTasks(List<OceanScheduledTaskArgs> scheduledTasks) {
            return scheduledTasks(Output.of(scheduledTasks));
        }

        /**
         * @param scheduledTasks While used, you can control whether the group should perform a deployment after an update to the configuration.
         * 
         * @return builder
         * 
         */
        public Builder scheduledTasks(OceanScheduledTaskArgs... scheduledTasks) {
            return scheduledTasks(List.of(scheduledTasks));
        }

        /**
         * @param securityGroupIds One or more security group ids.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupIds(Output<List<String>> securityGroupIds) {
            $.securityGroupIds = securityGroupIds;
            return this;
        }

        /**
         * @param securityGroupIds One or more security group ids.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupIds(List<String> securityGroupIds) {
            return securityGroupIds(Output.of(securityGroupIds));
        }

        /**
         * @param securityGroupIds One or more security group ids.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupIds(String... securityGroupIds) {
            return securityGroupIds(List.of(securityGroupIds));
        }

        /**
         * @param spotPercentage The percentage of Spot instances that would spin up from the `desired_capacity` number.
         * 
         * @return builder
         * 
         */
        public Builder spotPercentage(@Nullable Output<Integer> spotPercentage) {
            $.spotPercentage = spotPercentage;
            return this;
        }

        /**
         * @param spotPercentage The percentage of Spot instances that would spin up from the `desired_capacity` number.
         * 
         * @return builder
         * 
         */
        public Builder spotPercentage(Integer spotPercentage) {
            return spotPercentage(Output.of(spotPercentage));
        }

        /**
         * @param subnetIds A comma-separated list of subnet identifiers for the Ocean cluster. Subnet IDs should be configured with auto assign public ip.
         * 
         * @return builder
         * 
         */
        public Builder subnetIds(Output<List<String>> subnetIds) {
            $.subnetIds = subnetIds;
            return this;
        }

        /**
         * @param subnetIds A comma-separated list of subnet identifiers for the Ocean cluster. Subnet IDs should be configured with auto assign public ip.
         * 
         * @return builder
         * 
         */
        public Builder subnetIds(List<String> subnetIds) {
            return subnetIds(Output.of(subnetIds));
        }

        /**
         * @param subnetIds A comma-separated list of subnet identifiers for the Ocean cluster. Subnet IDs should be configured with auto assign public ip.
         * 
         * @return builder
         * 
         */
        public Builder subnetIds(String... subnetIds) {
            return subnetIds(List.of(subnetIds));
        }

        /**
         * @param tags Optionally adds tags to instances launched in an Ocean cluster.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<OceanTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Optionally adds tags to instances launched in an Ocean cluster.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<OceanTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags Optionally adds tags to instances launched in an Ocean cluster.
         * 
         * @return builder
         * 
         */
        public Builder tags(OceanTagArgs... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param updatePolicy While used, you can control whether the group should perform a deployment after an update to the configuration.
         * 
         * @return builder
         * 
         */
        public Builder updatePolicy(@Nullable Output<OceanUpdatePolicyArgs> updatePolicy) {
            $.updatePolicy = updatePolicy;
            return this;
        }

        /**
         * @param updatePolicy While used, you can control whether the group should perform a deployment after an update to the configuration.
         * 
         * @return builder
         * 
         */
        public Builder updatePolicy(OceanUpdatePolicyArgs updatePolicy) {
            return updatePolicy(Output.of(updatePolicy));
        }

        /**
         * @param useAsTemplateOnly launch specification defined on the Ocean object will function only as a template for virtual node groups.
         * 
         * @return builder
         * 
         */
        public Builder useAsTemplateOnly(@Nullable Output<Boolean> useAsTemplateOnly) {
            $.useAsTemplateOnly = useAsTemplateOnly;
            return this;
        }

        /**
         * @param useAsTemplateOnly launch specification defined on the Ocean object will function only as a template for virtual node groups.
         * 
         * @return builder
         * 
         */
        public Builder useAsTemplateOnly(Boolean useAsTemplateOnly) {
            return useAsTemplateOnly(Output.of(useAsTemplateOnly));
        }

        /**
         * @param userData Base64-encoded MIME user data to make available to the instances.
         * 
         * @return builder
         * 
         */
        public Builder userData(@Nullable Output<String> userData) {
            $.userData = userData;
            return this;
        }

        /**
         * @param userData Base64-encoded MIME user data to make available to the instances.
         * 
         * @return builder
         * 
         */
        public Builder userData(String userData) {
            return userData(Output.of(userData));
        }

        /**
         * @param utilizeCommitments If savings plans exist, Ocean will utilize them before launching Spot instances.
         * 
         * @return builder
         * 
         */
        public Builder utilizeCommitments(@Nullable Output<Boolean> utilizeCommitments) {
            $.utilizeCommitments = utilizeCommitments;
            return this;
        }

        /**
         * @param utilizeCommitments If savings plans exist, Ocean will utilize them before launching Spot instances.
         * 
         * @return builder
         * 
         */
        public Builder utilizeCommitments(Boolean utilizeCommitments) {
            return utilizeCommitments(Output.of(utilizeCommitments));
        }

        /**
         * @param utilizeReservedInstances If Reserved instances exist, Ocean will utilize them before launching Spot instances.
         * 
         * @return builder
         * 
         */
        public Builder utilizeReservedInstances(@Nullable Output<Boolean> utilizeReservedInstances) {
            $.utilizeReservedInstances = utilizeReservedInstances;
            return this;
        }

        /**
         * @param utilizeReservedInstances If Reserved instances exist, Ocean will utilize them before launching Spot instances.
         * 
         * @return builder
         * 
         */
        public Builder utilizeReservedInstances(Boolean utilizeReservedInstances) {
            return utilizeReservedInstances(Output.of(utilizeReservedInstances));
        }

        /**
         * @param whitelists Instance types allowed in the Ocean cluster, Cannot be configured if blacklist is configured.
         * 
         * @return builder
         * 
         */
        public Builder whitelists(@Nullable Output<List<String>> whitelists) {
            $.whitelists = whitelists;
            return this;
        }

        /**
         * @param whitelists Instance types allowed in the Ocean cluster, Cannot be configured if blacklist is configured.
         * 
         * @return builder
         * 
         */
        public Builder whitelists(List<String> whitelists) {
            return whitelists(Output.of(whitelists));
        }

        /**
         * @param whitelists Instance types allowed in the Ocean cluster, Cannot be configured if blacklist is configured.
         * 
         * @return builder
         * 
         */
        public Builder whitelists(String... whitelists) {
            return whitelists(List.of(whitelists));
        }

        public OceanArgs build() {
            $.clusterName = Objects.requireNonNull($.clusterName, "expected parameter 'clusterName' to be non-null");
            $.region = Objects.requireNonNull($.region, "expected parameter 'region' to be non-null");
            $.securityGroupIds = Objects.requireNonNull($.securityGroupIds, "expected parameter 'securityGroupIds' to be non-null");
            $.subnetIds = Objects.requireNonNull($.subnetIds, "expected parameter 'subnetIds' to be non-null");
            return $;
        }
    }

}
