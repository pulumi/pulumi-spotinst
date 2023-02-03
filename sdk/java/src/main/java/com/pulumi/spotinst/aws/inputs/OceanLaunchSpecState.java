// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.spotinst.aws.inputs.OceanLaunchSpecAutoscaleDownArgs;
import com.pulumi.spotinst.aws.inputs.OceanLaunchSpecAutoscaleHeadroomArgs;
import com.pulumi.spotinst.aws.inputs.OceanLaunchSpecAutoscaleHeadroomsAutomaticArgs;
import com.pulumi.spotinst.aws.inputs.OceanLaunchSpecBlockDeviceMappingArgs;
import com.pulumi.spotinst.aws.inputs.OceanLaunchSpecCreateOptionsArgs;
import com.pulumi.spotinst.aws.inputs.OceanLaunchSpecDeleteOptionsArgs;
import com.pulumi.spotinst.aws.inputs.OceanLaunchSpecElasticIpPoolArgs;
import com.pulumi.spotinst.aws.inputs.OceanLaunchSpecLabelArgs;
import com.pulumi.spotinst.aws.inputs.OceanLaunchSpecResourceLimitArgs;
import com.pulumi.spotinst.aws.inputs.OceanLaunchSpecSchedulingShutdownHoursArgs;
import com.pulumi.spotinst.aws.inputs.OceanLaunchSpecSchedulingTaskArgs;
import com.pulumi.spotinst.aws.inputs.OceanLaunchSpecStrategyArgs;
import com.pulumi.spotinst.aws.inputs.OceanLaunchSpecTagArgs;
import com.pulumi.spotinst.aws.inputs.OceanLaunchSpecTaintArgs;
import com.pulumi.spotinst.aws.inputs.OceanLaunchSpecUpdatePolicyArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OceanLaunchSpecState extends com.pulumi.resources.ResourceArgs {

    public static final OceanLaunchSpecState Empty = new OceanLaunchSpecState();

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
     * Auto Scaling scale down operations.
     * 
     */
    @Import(name="autoscaleDowns")
    private @Nullable Output<List<OceanLaunchSpecAutoscaleDownArgs>> autoscaleDowns;

    /**
     * @return Auto Scaling scale down operations.
     * 
     */
    public Optional<Output<List<OceanLaunchSpecAutoscaleDownArgs>>> autoscaleDowns() {
        return Optional.ofNullable(this.autoscaleDowns);
    }

    /**
     * Set custom headroom per Virtual Node Group. Provide a list of headrooms object.
     * 
     */
    @Import(name="autoscaleHeadrooms")
    private @Nullable Output<List<OceanLaunchSpecAutoscaleHeadroomArgs>> autoscaleHeadrooms;

    /**
     * @return Set custom headroom per Virtual Node Group. Provide a list of headrooms object.
     * 
     */
    public Optional<Output<List<OceanLaunchSpecAutoscaleHeadroomArgs>>> autoscaleHeadrooms() {
        return Optional.ofNullable(this.autoscaleHeadrooms);
    }

    /**
     * Set automatic headroom per launch spec.
     * 
     */
    @Import(name="autoscaleHeadroomsAutomatics")
    private @Nullable Output<List<OceanLaunchSpecAutoscaleHeadroomsAutomaticArgs>> autoscaleHeadroomsAutomatics;

    /**
     * @return Set automatic headroom per launch spec.
     * 
     */
    public Optional<Output<List<OceanLaunchSpecAutoscaleHeadroomsAutomaticArgs>>> autoscaleHeadroomsAutomatics() {
        return Optional.ofNullable(this.autoscaleHeadroomsAutomatics);
    }

    /**
     * Object. Array list of block devices that are exposed to the instance, specify either virtual devices and EBS volumes.
     * 
     */
    @Import(name="blockDeviceMappings")
    private @Nullable Output<List<OceanLaunchSpecBlockDeviceMappingArgs>> blockDeviceMappings;

    /**
     * @return Object. Array list of block devices that are exposed to the instance, specify either virtual devices and EBS volumes.
     * 
     */
    public Optional<Output<List<OceanLaunchSpecBlockDeviceMappingArgs>>> blockDeviceMappings() {
        return Optional.ofNullable(this.blockDeviceMappings);
    }

    @Import(name="createOptions")
    private @Nullable Output<OceanLaunchSpecCreateOptionsArgs> createOptions;

    public Optional<Output<OceanLaunchSpecCreateOptionsArgs>> createOptions() {
        return Optional.ofNullable(this.createOptions);
    }

    @Import(name="deleteOptions")
    private @Nullable Output<OceanLaunchSpecDeleteOptionsArgs> deleteOptions;

    public Optional<Output<OceanLaunchSpecDeleteOptionsArgs>> deleteOptions() {
        return Optional.ofNullable(this.deleteOptions);
    }

    /**
     * Assign an Elastic IP to the instances spun by the Virtual Node Group. Can be null.
     * 
     */
    @Import(name="elasticIpPools")
    private @Nullable Output<List<OceanLaunchSpecElasticIpPoolArgs>> elasticIpPools;

    /**
     * @return Assign an Elastic IP to the instances spun by the Virtual Node Group. Can be null.
     * 
     */
    public Optional<Output<List<OceanLaunchSpecElasticIpPoolArgs>>> elasticIpPools() {
        return Optional.ofNullable(this.elasticIpPools);
    }

    /**
     * The ARN or name of an IAM instance profile to associate with launched instances.
     * 
     */
    @Import(name="iamInstanceProfile")
    private @Nullable Output<String> iamInstanceProfile;

    /**
     * @return The ARN or name of an IAM instance profile to associate with launched instances.
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
     * A list of instance types allowed to be provisioned for pods pending under the specified launch specification. The list overrides the list defined for the cluster.
     * 
     */
    @Import(name="instanceTypes")
    private @Nullable Output<List<String>> instanceTypes;

    /**
     * @return A list of instance types allowed to be provisioned for pods pending under the specified launch specification. The list overrides the list defined for the cluster.
     * 
     */
    public Optional<Output<List<String>>> instanceTypes() {
        return Optional.ofNullable(this.instanceTypes);
    }

    /**
     * Optionally adds labels to instances launched in the cluster.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<List<OceanLaunchSpecLabelArgs>> labels;

    /**
     * @return Optionally adds labels to instances launched in the cluster.
     * 
     */
    public Optional<Output<List<OceanLaunchSpecLabelArgs>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The name of the Virtual Node Group.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the Virtual Node Group.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the Ocean cluster.
     * 
     */
    @Import(name="oceanId")
    private @Nullable Output<String> oceanId;

    /**
     * @return The ID of the Ocean cluster.
     * 
     */
    public Optional<Output<String>> oceanId() {
        return Optional.ofNullable(this.oceanId);
    }

    /**
     * A list of instance types. Takes the preferred types into consideration while maintaining a variety of machine types running for optimized distribution.
     * 
     */
    @Import(name="preferredSpotTypes")
    private @Nullable Output<List<String>> preferredSpotTypes;

    /**
     * @return A list of instance types. Takes the preferred types into consideration while maintaining a variety of machine types running for optimized distribution.
     * 
     */
    public Optional<Output<List<String>>> preferredSpotTypes() {
        return Optional.ofNullable(this.preferredSpotTypes);
    }

    @Import(name="resourceLimits")
    private @Nullable Output<List<OceanLaunchSpecResourceLimitArgs>> resourceLimits;

    public Optional<Output<List<OceanLaunchSpecResourceLimitArgs>>> resourceLimits() {
        return Optional.ofNullable(this.resourceLimits);
    }

    /**
     * Boolean. When set to `True`, nodes will be treated as if all pods running have the restrict-scale-down label. Therefore, Ocean will not scale nodes down unless empty.
     * 
     */
    @Import(name="restrictScaleDown")
    private @Nullable Output<Boolean> restrictScaleDown;

    /**
     * @return Boolean. When set to `True`, nodes will be treated as if all pods running have the restrict-scale-down label. Therefore, Ocean will not scale nodes down unless empty.
     * 
     */
    public Optional<Output<Boolean>> restrictScaleDown() {
        return Optional.ofNullable(this.restrictScaleDown);
    }

    /**
     * Set root volume size (in GB).
     * 
     */
    @Import(name="rootVolumeSize")
    private @Nullable Output<Integer> rootVolumeSize;

    /**
     * @return Set root volume size (in GB).
     * 
     */
    public Optional<Output<Integer>> rootVolumeSize() {
        return Optional.ofNullable(this.rootVolumeSize);
    }

    /**
     * Used to specify times that the nodes in the virtual node group will be taken down.
     * 
     */
    @Import(name="schedulingShutdownHours")
    private @Nullable Output<OceanLaunchSpecSchedulingShutdownHoursArgs> schedulingShutdownHours;

    /**
     * @return Used to specify times that the nodes in the virtual node group will be taken down.
     * 
     */
    public Optional<Output<OceanLaunchSpecSchedulingShutdownHoursArgs>> schedulingShutdownHours() {
        return Optional.ofNullable(this.schedulingShutdownHours);
    }

    /**
     * Used to define scheduled tasks such as a manual headroom update.
     * 
     */
    @Import(name="schedulingTasks")
    private @Nullable Output<List<OceanLaunchSpecSchedulingTaskArgs>> schedulingTasks;

    /**
     * @return Used to define scheduled tasks such as a manual headroom update.
     * 
     */
    public Optional<Output<List<OceanLaunchSpecSchedulingTaskArgs>>> schedulingTasks() {
        return Optional.ofNullable(this.schedulingTasks);
    }

    /**
     * Optionally adds security group IDs.
     * 
     */
    @Import(name="securityGroups")
    private @Nullable Output<List<String>> securityGroups;

    /**
     * @return Optionally adds security group IDs.
     * 
     */
    public Optional<Output<List<String>>> securityGroups() {
        return Optional.ofNullable(this.securityGroups);
    }

    @Import(name="strategies")
    private @Nullable Output<List<OceanLaunchSpecStrategyArgs>> strategies;

    public Optional<Output<List<OceanLaunchSpecStrategyArgs>>> strategies() {
        return Optional.ofNullable(this.strategies);
    }

    /**
     * A list of subnet IDs.
     * 
     */
    @Import(name="subnetIds")
    private @Nullable Output<List<String>> subnetIds;

    /**
     * @return A list of subnet IDs.
     * 
     */
    public Optional<Output<List<String>>> subnetIds() {
        return Optional.ofNullable(this.subnetIds);
    }

    /**
     * A key/value mapping of tags to assign to the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<OceanLaunchSpecTagArgs>> tags;

    /**
     * @return A key/value mapping of tags to assign to the resource.
     * 
     */
    public Optional<Output<List<OceanLaunchSpecTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Optionally adds labels to instances launched in the cluster.
     * 
     */
    @Import(name="taints")
    private @Nullable Output<List<OceanLaunchSpecTaintArgs>> taints;

    /**
     * @return Optionally adds labels to instances launched in the cluster.
     * 
     */
    public Optional<Output<List<OceanLaunchSpecTaintArgs>>> taints() {
        return Optional.ofNullable(this.taints);
    }

    @Import(name="updatePolicy")
    private @Nullable Output<OceanLaunchSpecUpdatePolicyArgs> updatePolicy;

    public Optional<Output<OceanLaunchSpecUpdatePolicyArgs>> updatePolicy() {
        return Optional.ofNullable(this.updatePolicy);
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

    private OceanLaunchSpecState() {}

    private OceanLaunchSpecState(OceanLaunchSpecState $) {
        this.associatePublicIpAddress = $.associatePublicIpAddress;
        this.autoscaleDowns = $.autoscaleDowns;
        this.autoscaleHeadrooms = $.autoscaleHeadrooms;
        this.autoscaleHeadroomsAutomatics = $.autoscaleHeadroomsAutomatics;
        this.blockDeviceMappings = $.blockDeviceMappings;
        this.createOptions = $.createOptions;
        this.deleteOptions = $.deleteOptions;
        this.elasticIpPools = $.elasticIpPools;
        this.iamInstanceProfile = $.iamInstanceProfile;
        this.imageId = $.imageId;
        this.instanceTypes = $.instanceTypes;
        this.labels = $.labels;
        this.name = $.name;
        this.oceanId = $.oceanId;
        this.preferredSpotTypes = $.preferredSpotTypes;
        this.resourceLimits = $.resourceLimits;
        this.restrictScaleDown = $.restrictScaleDown;
        this.rootVolumeSize = $.rootVolumeSize;
        this.schedulingShutdownHours = $.schedulingShutdownHours;
        this.schedulingTasks = $.schedulingTasks;
        this.securityGroups = $.securityGroups;
        this.strategies = $.strategies;
        this.subnetIds = $.subnetIds;
        this.tags = $.tags;
        this.taints = $.taints;
        this.updatePolicy = $.updatePolicy;
        this.userData = $.userData;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OceanLaunchSpecState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OceanLaunchSpecState $;

        public Builder() {
            $ = new OceanLaunchSpecState();
        }

        public Builder(OceanLaunchSpecState defaults) {
            $ = new OceanLaunchSpecState(Objects.requireNonNull(defaults));
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
         * @param autoscaleDowns Auto Scaling scale down operations.
         * 
         * @return builder
         * 
         */
        public Builder autoscaleDowns(@Nullable Output<List<OceanLaunchSpecAutoscaleDownArgs>> autoscaleDowns) {
            $.autoscaleDowns = autoscaleDowns;
            return this;
        }

        /**
         * @param autoscaleDowns Auto Scaling scale down operations.
         * 
         * @return builder
         * 
         */
        public Builder autoscaleDowns(List<OceanLaunchSpecAutoscaleDownArgs> autoscaleDowns) {
            return autoscaleDowns(Output.of(autoscaleDowns));
        }

        /**
         * @param autoscaleDowns Auto Scaling scale down operations.
         * 
         * @return builder
         * 
         */
        public Builder autoscaleDowns(OceanLaunchSpecAutoscaleDownArgs... autoscaleDowns) {
            return autoscaleDowns(List.of(autoscaleDowns));
        }

        /**
         * @param autoscaleHeadrooms Set custom headroom per Virtual Node Group. Provide a list of headrooms object.
         * 
         * @return builder
         * 
         */
        public Builder autoscaleHeadrooms(@Nullable Output<List<OceanLaunchSpecAutoscaleHeadroomArgs>> autoscaleHeadrooms) {
            $.autoscaleHeadrooms = autoscaleHeadrooms;
            return this;
        }

        /**
         * @param autoscaleHeadrooms Set custom headroom per Virtual Node Group. Provide a list of headrooms object.
         * 
         * @return builder
         * 
         */
        public Builder autoscaleHeadrooms(List<OceanLaunchSpecAutoscaleHeadroomArgs> autoscaleHeadrooms) {
            return autoscaleHeadrooms(Output.of(autoscaleHeadrooms));
        }

        /**
         * @param autoscaleHeadrooms Set custom headroom per Virtual Node Group. Provide a list of headrooms object.
         * 
         * @return builder
         * 
         */
        public Builder autoscaleHeadrooms(OceanLaunchSpecAutoscaleHeadroomArgs... autoscaleHeadrooms) {
            return autoscaleHeadrooms(List.of(autoscaleHeadrooms));
        }

        /**
         * @param autoscaleHeadroomsAutomatics Set automatic headroom per launch spec.
         * 
         * @return builder
         * 
         */
        public Builder autoscaleHeadroomsAutomatics(@Nullable Output<List<OceanLaunchSpecAutoscaleHeadroomsAutomaticArgs>> autoscaleHeadroomsAutomatics) {
            $.autoscaleHeadroomsAutomatics = autoscaleHeadroomsAutomatics;
            return this;
        }

        /**
         * @param autoscaleHeadroomsAutomatics Set automatic headroom per launch spec.
         * 
         * @return builder
         * 
         */
        public Builder autoscaleHeadroomsAutomatics(List<OceanLaunchSpecAutoscaleHeadroomsAutomaticArgs> autoscaleHeadroomsAutomatics) {
            return autoscaleHeadroomsAutomatics(Output.of(autoscaleHeadroomsAutomatics));
        }

        /**
         * @param autoscaleHeadroomsAutomatics Set automatic headroom per launch spec.
         * 
         * @return builder
         * 
         */
        public Builder autoscaleHeadroomsAutomatics(OceanLaunchSpecAutoscaleHeadroomsAutomaticArgs... autoscaleHeadroomsAutomatics) {
            return autoscaleHeadroomsAutomatics(List.of(autoscaleHeadroomsAutomatics));
        }

        /**
         * @param blockDeviceMappings Object. Array list of block devices that are exposed to the instance, specify either virtual devices and EBS volumes.
         * 
         * @return builder
         * 
         */
        public Builder blockDeviceMappings(@Nullable Output<List<OceanLaunchSpecBlockDeviceMappingArgs>> blockDeviceMappings) {
            $.blockDeviceMappings = blockDeviceMappings;
            return this;
        }

        /**
         * @param blockDeviceMappings Object. Array list of block devices that are exposed to the instance, specify either virtual devices and EBS volumes.
         * 
         * @return builder
         * 
         */
        public Builder blockDeviceMappings(List<OceanLaunchSpecBlockDeviceMappingArgs> blockDeviceMappings) {
            return blockDeviceMappings(Output.of(blockDeviceMappings));
        }

        /**
         * @param blockDeviceMappings Object. Array list of block devices that are exposed to the instance, specify either virtual devices and EBS volumes.
         * 
         * @return builder
         * 
         */
        public Builder blockDeviceMappings(OceanLaunchSpecBlockDeviceMappingArgs... blockDeviceMappings) {
            return blockDeviceMappings(List.of(blockDeviceMappings));
        }

        public Builder createOptions(@Nullable Output<OceanLaunchSpecCreateOptionsArgs> createOptions) {
            $.createOptions = createOptions;
            return this;
        }

        public Builder createOptions(OceanLaunchSpecCreateOptionsArgs createOptions) {
            return createOptions(Output.of(createOptions));
        }

        public Builder deleteOptions(@Nullable Output<OceanLaunchSpecDeleteOptionsArgs> deleteOptions) {
            $.deleteOptions = deleteOptions;
            return this;
        }

        public Builder deleteOptions(OceanLaunchSpecDeleteOptionsArgs deleteOptions) {
            return deleteOptions(Output.of(deleteOptions));
        }

        /**
         * @param elasticIpPools Assign an Elastic IP to the instances spun by the Virtual Node Group. Can be null.
         * 
         * @return builder
         * 
         */
        public Builder elasticIpPools(@Nullable Output<List<OceanLaunchSpecElasticIpPoolArgs>> elasticIpPools) {
            $.elasticIpPools = elasticIpPools;
            return this;
        }

        /**
         * @param elasticIpPools Assign an Elastic IP to the instances spun by the Virtual Node Group. Can be null.
         * 
         * @return builder
         * 
         */
        public Builder elasticIpPools(List<OceanLaunchSpecElasticIpPoolArgs> elasticIpPools) {
            return elasticIpPools(Output.of(elasticIpPools));
        }

        /**
         * @param elasticIpPools Assign an Elastic IP to the instances spun by the Virtual Node Group. Can be null.
         * 
         * @return builder
         * 
         */
        public Builder elasticIpPools(OceanLaunchSpecElasticIpPoolArgs... elasticIpPools) {
            return elasticIpPools(List.of(elasticIpPools));
        }

        /**
         * @param iamInstanceProfile The ARN or name of an IAM instance profile to associate with launched instances.
         * 
         * @return builder
         * 
         */
        public Builder iamInstanceProfile(@Nullable Output<String> iamInstanceProfile) {
            $.iamInstanceProfile = iamInstanceProfile;
            return this;
        }

        /**
         * @param iamInstanceProfile The ARN or name of an IAM instance profile to associate with launched instances.
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
         * @param instanceTypes A list of instance types allowed to be provisioned for pods pending under the specified launch specification. The list overrides the list defined for the cluster.
         * 
         * @return builder
         * 
         */
        public Builder instanceTypes(@Nullable Output<List<String>> instanceTypes) {
            $.instanceTypes = instanceTypes;
            return this;
        }

        /**
         * @param instanceTypes A list of instance types allowed to be provisioned for pods pending under the specified launch specification. The list overrides the list defined for the cluster.
         * 
         * @return builder
         * 
         */
        public Builder instanceTypes(List<String> instanceTypes) {
            return instanceTypes(Output.of(instanceTypes));
        }

        /**
         * @param instanceTypes A list of instance types allowed to be provisioned for pods pending under the specified launch specification. The list overrides the list defined for the cluster.
         * 
         * @return builder
         * 
         */
        public Builder instanceTypes(String... instanceTypes) {
            return instanceTypes(List.of(instanceTypes));
        }

        /**
         * @param labels Optionally adds labels to instances launched in the cluster.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<List<OceanLaunchSpecLabelArgs>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Optionally adds labels to instances launched in the cluster.
         * 
         * @return builder
         * 
         */
        public Builder labels(List<OceanLaunchSpecLabelArgs> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param labels Optionally adds labels to instances launched in the cluster.
         * 
         * @return builder
         * 
         */
        public Builder labels(OceanLaunchSpecLabelArgs... labels) {
            return labels(List.of(labels));
        }

        /**
         * @param name The name of the Virtual Node Group.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Virtual Node Group.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param oceanId The ID of the Ocean cluster.
         * 
         * @return builder
         * 
         */
        public Builder oceanId(@Nullable Output<String> oceanId) {
            $.oceanId = oceanId;
            return this;
        }

        /**
         * @param oceanId The ID of the Ocean cluster.
         * 
         * @return builder
         * 
         */
        public Builder oceanId(String oceanId) {
            return oceanId(Output.of(oceanId));
        }

        /**
         * @param preferredSpotTypes A list of instance types. Takes the preferred types into consideration while maintaining a variety of machine types running for optimized distribution.
         * 
         * @return builder
         * 
         */
        public Builder preferredSpotTypes(@Nullable Output<List<String>> preferredSpotTypes) {
            $.preferredSpotTypes = preferredSpotTypes;
            return this;
        }

        /**
         * @param preferredSpotTypes A list of instance types. Takes the preferred types into consideration while maintaining a variety of machine types running for optimized distribution.
         * 
         * @return builder
         * 
         */
        public Builder preferredSpotTypes(List<String> preferredSpotTypes) {
            return preferredSpotTypes(Output.of(preferredSpotTypes));
        }

        /**
         * @param preferredSpotTypes A list of instance types. Takes the preferred types into consideration while maintaining a variety of machine types running for optimized distribution.
         * 
         * @return builder
         * 
         */
        public Builder preferredSpotTypes(String... preferredSpotTypes) {
            return preferredSpotTypes(List.of(preferredSpotTypes));
        }

        public Builder resourceLimits(@Nullable Output<List<OceanLaunchSpecResourceLimitArgs>> resourceLimits) {
            $.resourceLimits = resourceLimits;
            return this;
        }

        public Builder resourceLimits(List<OceanLaunchSpecResourceLimitArgs> resourceLimits) {
            return resourceLimits(Output.of(resourceLimits));
        }

        public Builder resourceLimits(OceanLaunchSpecResourceLimitArgs... resourceLimits) {
            return resourceLimits(List.of(resourceLimits));
        }

        /**
         * @param restrictScaleDown Boolean. When set to `True`, nodes will be treated as if all pods running have the restrict-scale-down label. Therefore, Ocean will not scale nodes down unless empty.
         * 
         * @return builder
         * 
         */
        public Builder restrictScaleDown(@Nullable Output<Boolean> restrictScaleDown) {
            $.restrictScaleDown = restrictScaleDown;
            return this;
        }

        /**
         * @param restrictScaleDown Boolean. When set to `True`, nodes will be treated as if all pods running have the restrict-scale-down label. Therefore, Ocean will not scale nodes down unless empty.
         * 
         * @return builder
         * 
         */
        public Builder restrictScaleDown(Boolean restrictScaleDown) {
            return restrictScaleDown(Output.of(restrictScaleDown));
        }

        /**
         * @param rootVolumeSize Set root volume size (in GB).
         * 
         * @return builder
         * 
         */
        public Builder rootVolumeSize(@Nullable Output<Integer> rootVolumeSize) {
            $.rootVolumeSize = rootVolumeSize;
            return this;
        }

        /**
         * @param rootVolumeSize Set root volume size (in GB).
         * 
         * @return builder
         * 
         */
        public Builder rootVolumeSize(Integer rootVolumeSize) {
            return rootVolumeSize(Output.of(rootVolumeSize));
        }

        /**
         * @param schedulingShutdownHours Used to specify times that the nodes in the virtual node group will be taken down.
         * 
         * @return builder
         * 
         */
        public Builder schedulingShutdownHours(@Nullable Output<OceanLaunchSpecSchedulingShutdownHoursArgs> schedulingShutdownHours) {
            $.schedulingShutdownHours = schedulingShutdownHours;
            return this;
        }

        /**
         * @param schedulingShutdownHours Used to specify times that the nodes in the virtual node group will be taken down.
         * 
         * @return builder
         * 
         */
        public Builder schedulingShutdownHours(OceanLaunchSpecSchedulingShutdownHoursArgs schedulingShutdownHours) {
            return schedulingShutdownHours(Output.of(schedulingShutdownHours));
        }

        /**
         * @param schedulingTasks Used to define scheduled tasks such as a manual headroom update.
         * 
         * @return builder
         * 
         */
        public Builder schedulingTasks(@Nullable Output<List<OceanLaunchSpecSchedulingTaskArgs>> schedulingTasks) {
            $.schedulingTasks = schedulingTasks;
            return this;
        }

        /**
         * @param schedulingTasks Used to define scheduled tasks such as a manual headroom update.
         * 
         * @return builder
         * 
         */
        public Builder schedulingTasks(List<OceanLaunchSpecSchedulingTaskArgs> schedulingTasks) {
            return schedulingTasks(Output.of(schedulingTasks));
        }

        /**
         * @param schedulingTasks Used to define scheduled tasks such as a manual headroom update.
         * 
         * @return builder
         * 
         */
        public Builder schedulingTasks(OceanLaunchSpecSchedulingTaskArgs... schedulingTasks) {
            return schedulingTasks(List.of(schedulingTasks));
        }

        /**
         * @param securityGroups Optionally adds security group IDs.
         * 
         * @return builder
         * 
         */
        public Builder securityGroups(@Nullable Output<List<String>> securityGroups) {
            $.securityGroups = securityGroups;
            return this;
        }

        /**
         * @param securityGroups Optionally adds security group IDs.
         * 
         * @return builder
         * 
         */
        public Builder securityGroups(List<String> securityGroups) {
            return securityGroups(Output.of(securityGroups));
        }

        /**
         * @param securityGroups Optionally adds security group IDs.
         * 
         * @return builder
         * 
         */
        public Builder securityGroups(String... securityGroups) {
            return securityGroups(List.of(securityGroups));
        }

        public Builder strategies(@Nullable Output<List<OceanLaunchSpecStrategyArgs>> strategies) {
            $.strategies = strategies;
            return this;
        }

        public Builder strategies(List<OceanLaunchSpecStrategyArgs> strategies) {
            return strategies(Output.of(strategies));
        }

        public Builder strategies(OceanLaunchSpecStrategyArgs... strategies) {
            return strategies(List.of(strategies));
        }

        /**
         * @param subnetIds A list of subnet IDs.
         * 
         * @return builder
         * 
         */
        public Builder subnetIds(@Nullable Output<List<String>> subnetIds) {
            $.subnetIds = subnetIds;
            return this;
        }

        /**
         * @param subnetIds A list of subnet IDs.
         * 
         * @return builder
         * 
         */
        public Builder subnetIds(List<String> subnetIds) {
            return subnetIds(Output.of(subnetIds));
        }

        /**
         * @param subnetIds A list of subnet IDs.
         * 
         * @return builder
         * 
         */
        public Builder subnetIds(String... subnetIds) {
            return subnetIds(List.of(subnetIds));
        }

        /**
         * @param tags A key/value mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<OceanLaunchSpecTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A key/value mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<OceanLaunchSpecTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags A key/value mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(OceanLaunchSpecTagArgs... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param taints Optionally adds labels to instances launched in the cluster.
         * 
         * @return builder
         * 
         */
        public Builder taints(@Nullable Output<List<OceanLaunchSpecTaintArgs>> taints) {
            $.taints = taints;
            return this;
        }

        /**
         * @param taints Optionally adds labels to instances launched in the cluster.
         * 
         * @return builder
         * 
         */
        public Builder taints(List<OceanLaunchSpecTaintArgs> taints) {
            return taints(Output.of(taints));
        }

        /**
         * @param taints Optionally adds labels to instances launched in the cluster.
         * 
         * @return builder
         * 
         */
        public Builder taints(OceanLaunchSpecTaintArgs... taints) {
            return taints(List.of(taints));
        }

        public Builder updatePolicy(@Nullable Output<OceanLaunchSpecUpdatePolicyArgs> updatePolicy) {
            $.updatePolicy = updatePolicy;
            return this;
        }

        public Builder updatePolicy(OceanLaunchSpecUpdatePolicyArgs updatePolicy) {
            return updatePolicy(Output.of(updatePolicy));
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

        public OceanLaunchSpecState build() {
            return $;
        }
    }

}
