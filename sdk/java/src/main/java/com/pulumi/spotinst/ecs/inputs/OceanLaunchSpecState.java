// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.ecs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.spotinst.ecs.inputs.OceanLaunchSpecAttributeArgs;
import com.pulumi.spotinst.ecs.inputs.OceanLaunchSpecAutoscaleHeadroomArgs;
import com.pulumi.spotinst.ecs.inputs.OceanLaunchSpecBlockDeviceMappingArgs;
import com.pulumi.spotinst.ecs.inputs.OceanLaunchSpecSchedulingTaskArgs;
import com.pulumi.spotinst.ecs.inputs.OceanLaunchSpecTagArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OceanLaunchSpecState extends com.pulumi.resources.ResourceArgs {

    public static final OceanLaunchSpecState Empty = new OceanLaunchSpecState();

    /**
     * Optionally adds labels to instances launched in an Ocean cluster.
     * 
     */
    @Import(name="attributes")
    private @Nullable Output<List<OceanLaunchSpecAttributeArgs>> attributes;

    /**
     * @return Optionally adds labels to instances launched in an Ocean cluster.
     * 
     */
    public Optional<Output<List<OceanLaunchSpecAttributeArgs>>> attributes() {
        return Optional.ofNullable(this.attributes);
    }

    /**
     * Set custom headroom per launch spec. provide list of headrooms object.
     * 
     */
    @Import(name="autoscaleHeadrooms")
    private @Nullable Output<List<OceanLaunchSpecAutoscaleHeadroomArgs>> autoscaleHeadrooms;

    /**
     * @return Set custom headroom per launch spec. provide list of headrooms object.
     * 
     */
    public Optional<Output<List<OceanLaunchSpecAutoscaleHeadroomArgs>>> autoscaleHeadrooms() {
        return Optional.ofNullable(this.autoscaleHeadrooms);
    }

    @Import(name="blockDeviceMappings")
    private @Nullable Output<List<OceanLaunchSpecBlockDeviceMappingArgs>> blockDeviceMappings;

    public Optional<Output<List<OceanLaunchSpecBlockDeviceMappingArgs>>> blockDeviceMappings() {
        return Optional.ofNullable(this.blockDeviceMappings);
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
     * A list of instance types allowed to be provisioned for pods pending under the specified launch specification. The list overrides the list defined for the Ocean cluster.
     * 
     */
    @Import(name="instanceTypes")
    private @Nullable Output<List<String>> instanceTypes;

    /**
     * @return A list of instance types allowed to be provisioned for pods pending under the specified launch specification. The list overrides the list defined for the Ocean cluster.
     * 
     */
    public Optional<Output<List<String>>> instanceTypes() {
        return Optional.ofNullable(this.instanceTypes);
    }

    /**
     * The Ocean Launch Specification name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The Ocean Launch Specification name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The Ocean cluster ID .
     * 
     */
    @Import(name="oceanId")
    private @Nullable Output<String> oceanId;

    /**
     * @return The Ocean cluster ID .
     * 
     */
    public Optional<Output<String>> oceanId() {
        return Optional.ofNullable(this.oceanId);
    }

    /**
     * Boolean. When set to “True”, VNG nodes will be treated as if all pods running have the restrict-scale-down label. Therefore, Ocean will not scale nodes down unless empty.
     * 
     */
    @Import(name="restrictScaleDown")
    private @Nullable Output<Boolean> restrictScaleDown;

    /**
     * @return Boolean. When set to “True”, VNG nodes will be treated as if all pods running have the restrict-scale-down label. Therefore, Ocean will not scale nodes down unless empty.
     * 
     */
    public Optional<Output<Boolean>> restrictScaleDown() {
        return Optional.ofNullable(this.restrictScaleDown);
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
     * One or more security group ids.
     * 
     */
    @Import(name="securityGroupIds")
    private @Nullable Output<List<String>> securityGroupIds;

    /**
     * @return One or more security group ids.
     * 
     */
    public Optional<Output<List<String>>> securityGroupIds() {
        return Optional.ofNullable(this.securityGroupIds);
    }

    /**
     * Set subnets in launchSpec. Each element in the array should be a subnet ID.
     * 
     */
    @Import(name="subnetIds")
    private @Nullable Output<List<String>> subnetIds;

    /**
     * @return Set subnets in launchSpec. Each element in the array should be a subnet ID.
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
        this.attributes = $.attributes;
        this.autoscaleHeadrooms = $.autoscaleHeadrooms;
        this.blockDeviceMappings = $.blockDeviceMappings;
        this.iamInstanceProfile = $.iamInstanceProfile;
        this.imageId = $.imageId;
        this.instanceTypes = $.instanceTypes;
        this.name = $.name;
        this.oceanId = $.oceanId;
        this.restrictScaleDown = $.restrictScaleDown;
        this.schedulingTasks = $.schedulingTasks;
        this.securityGroupIds = $.securityGroupIds;
        this.subnetIds = $.subnetIds;
        this.tags = $.tags;
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
         * @param attributes Optionally adds labels to instances launched in an Ocean cluster.
         * 
         * @return builder
         * 
         */
        public Builder attributes(@Nullable Output<List<OceanLaunchSpecAttributeArgs>> attributes) {
            $.attributes = attributes;
            return this;
        }

        /**
         * @param attributes Optionally adds labels to instances launched in an Ocean cluster.
         * 
         * @return builder
         * 
         */
        public Builder attributes(List<OceanLaunchSpecAttributeArgs> attributes) {
            return attributes(Output.of(attributes));
        }

        /**
         * @param attributes Optionally adds labels to instances launched in an Ocean cluster.
         * 
         * @return builder
         * 
         */
        public Builder attributes(OceanLaunchSpecAttributeArgs... attributes) {
            return attributes(List.of(attributes));
        }

        /**
         * @param autoscaleHeadrooms Set custom headroom per launch spec. provide list of headrooms object.
         * 
         * @return builder
         * 
         */
        public Builder autoscaleHeadrooms(@Nullable Output<List<OceanLaunchSpecAutoscaleHeadroomArgs>> autoscaleHeadrooms) {
            $.autoscaleHeadrooms = autoscaleHeadrooms;
            return this;
        }

        /**
         * @param autoscaleHeadrooms Set custom headroom per launch spec. provide list of headrooms object.
         * 
         * @return builder
         * 
         */
        public Builder autoscaleHeadrooms(List<OceanLaunchSpecAutoscaleHeadroomArgs> autoscaleHeadrooms) {
            return autoscaleHeadrooms(Output.of(autoscaleHeadrooms));
        }

        /**
         * @param autoscaleHeadrooms Set custom headroom per launch spec. provide list of headrooms object.
         * 
         * @return builder
         * 
         */
        public Builder autoscaleHeadrooms(OceanLaunchSpecAutoscaleHeadroomArgs... autoscaleHeadrooms) {
            return autoscaleHeadrooms(List.of(autoscaleHeadrooms));
        }

        public Builder blockDeviceMappings(@Nullable Output<List<OceanLaunchSpecBlockDeviceMappingArgs>> blockDeviceMappings) {
            $.blockDeviceMappings = blockDeviceMappings;
            return this;
        }

        public Builder blockDeviceMappings(List<OceanLaunchSpecBlockDeviceMappingArgs> blockDeviceMappings) {
            return blockDeviceMappings(Output.of(blockDeviceMappings));
        }

        public Builder blockDeviceMappings(OceanLaunchSpecBlockDeviceMappingArgs... blockDeviceMappings) {
            return blockDeviceMappings(List.of(blockDeviceMappings));
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
         * @param instanceTypes A list of instance types allowed to be provisioned for pods pending under the specified launch specification. The list overrides the list defined for the Ocean cluster.
         * 
         * @return builder
         * 
         */
        public Builder instanceTypes(@Nullable Output<List<String>> instanceTypes) {
            $.instanceTypes = instanceTypes;
            return this;
        }

        /**
         * @param instanceTypes A list of instance types allowed to be provisioned for pods pending under the specified launch specification. The list overrides the list defined for the Ocean cluster.
         * 
         * @return builder
         * 
         */
        public Builder instanceTypes(List<String> instanceTypes) {
            return instanceTypes(Output.of(instanceTypes));
        }

        /**
         * @param instanceTypes A list of instance types allowed to be provisioned for pods pending under the specified launch specification. The list overrides the list defined for the Ocean cluster.
         * 
         * @return builder
         * 
         */
        public Builder instanceTypes(String... instanceTypes) {
            return instanceTypes(List.of(instanceTypes));
        }

        /**
         * @param name The Ocean Launch Specification name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The Ocean Launch Specification name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param oceanId The Ocean cluster ID .
         * 
         * @return builder
         * 
         */
        public Builder oceanId(@Nullable Output<String> oceanId) {
            $.oceanId = oceanId;
            return this;
        }

        /**
         * @param oceanId The Ocean cluster ID .
         * 
         * @return builder
         * 
         */
        public Builder oceanId(String oceanId) {
            return oceanId(Output.of(oceanId));
        }

        /**
         * @param restrictScaleDown Boolean. When set to “True”, VNG nodes will be treated as if all pods running have the restrict-scale-down label. Therefore, Ocean will not scale nodes down unless empty.
         * 
         * @return builder
         * 
         */
        public Builder restrictScaleDown(@Nullable Output<Boolean> restrictScaleDown) {
            $.restrictScaleDown = restrictScaleDown;
            return this;
        }

        /**
         * @param restrictScaleDown Boolean. When set to “True”, VNG nodes will be treated as if all pods running have the restrict-scale-down label. Therefore, Ocean will not scale nodes down unless empty.
         * 
         * @return builder
         * 
         */
        public Builder restrictScaleDown(Boolean restrictScaleDown) {
            return restrictScaleDown(Output.of(restrictScaleDown));
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
         * @param securityGroupIds One or more security group ids.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupIds(@Nullable Output<List<String>> securityGroupIds) {
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
         * @param subnetIds Set subnets in launchSpec. Each element in the array should be a subnet ID.
         * 
         * @return builder
         * 
         */
        public Builder subnetIds(@Nullable Output<List<String>> subnetIds) {
            $.subnetIds = subnetIds;
            return this;
        }

        /**
         * @param subnetIds Set subnets in launchSpec. Each element in the array should be a subnet ID.
         * 
         * @return builder
         * 
         */
        public Builder subnetIds(List<String> subnetIds) {
            return subnetIds(Output.of(subnetIds));
        }

        /**
         * @param subnetIds Set subnets in launchSpec. Each element in the array should be a subnet ID.
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
