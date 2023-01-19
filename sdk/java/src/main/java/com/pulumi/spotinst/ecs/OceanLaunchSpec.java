// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.ecs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.spotinst.Utilities;
import com.pulumi.spotinst.ecs.OceanLaunchSpecArgs;
import com.pulumi.spotinst.ecs.inputs.OceanLaunchSpecState;
import com.pulumi.spotinst.ecs.outputs.OceanLaunchSpecAttribute;
import com.pulumi.spotinst.ecs.outputs.OceanLaunchSpecAutoscaleHeadroom;
import com.pulumi.spotinst.ecs.outputs.OceanLaunchSpecBlockDeviceMapping;
import com.pulumi.spotinst.ecs.outputs.OceanLaunchSpecSchedulingTask;
import com.pulumi.spotinst.ecs.outputs.OceanLaunchSpecStrategy;
import com.pulumi.spotinst.ecs.outputs.OceanLaunchSpecTag;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a custom Spotinst Ocean ECS Launch Spec resource.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.spotinst.ecs.OceanLaunchSpec;
 * import com.pulumi.spotinst.ecs.OceanLaunchSpecArgs;
 * import com.pulumi.spotinst.ecs.inputs.OceanLaunchSpecAttributeArgs;
 * import com.pulumi.spotinst.ecs.inputs.OceanLaunchSpecAutoscaleHeadroomArgs;
 * import com.pulumi.spotinst.ecs.inputs.OceanLaunchSpecBlockDeviceMappingArgs;
 * import com.pulumi.spotinst.ecs.inputs.OceanLaunchSpecBlockDeviceMappingEbsArgs;
 * import com.pulumi.spotinst.ecs.inputs.OceanLaunchSpecBlockDeviceMappingEbsDynamicVolumeSizeArgs;
 * import com.pulumi.spotinst.ecs.inputs.OceanLaunchSpecSchedulingTaskArgs;
 * import com.pulumi.spotinst.ecs.inputs.OceanLaunchSpecStrategyArgs;
 * import com.pulumi.spotinst.ecs.inputs.OceanLaunchSpecTagArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var example = new OceanLaunchSpec(&#34;example&#34;, OceanLaunchSpecArgs.builder()        
 *             .attributes(OceanLaunchSpecAttributeArgs.builder()
 *                 .key(&#34;fakeKey&#34;)
 *                 .value(&#34;fakeValue&#34;)
 *                 .build())
 *             .autoscaleHeadrooms(OceanLaunchSpecAutoscaleHeadroomArgs.builder()
 *                 .cpuPerUnit(1000)
 *                 .memoryPerUnit(2048)
 *                 .numOfUnits(5)
 *                 .build())
 *             .blockDeviceMappings(OceanLaunchSpecBlockDeviceMappingArgs.builder()
 *                 .deviceName(&#34;/dev/xvda1&#34;)
 *                 .ebs(OceanLaunchSpecBlockDeviceMappingEbsArgs.builder()
 *                     .deleteOnTermination(&#34;true&#34;)
 *                     .dynamicVolumeSize(OceanLaunchSpecBlockDeviceMappingEbsDynamicVolumeSizeArgs.builder()
 *                         .baseSize(50)
 *                         .resource(&#34;CPU&#34;)
 *                         .sizePerResourceUnit(20)
 *                         .build())
 *                     .encrypted(&#34;false&#34;)
 *                     .throughput(500)
 *                     .volumeSize(50)
 *                     .volumeType(&#34;gp2&#34;)
 *                     .build())
 *                 .build())
 *             .iamInstanceProfile(&#34;iam-profile&#34;)
 *             .imageId(&#34;ami-123456&#34;)
 *             .instanceTypes(            
 *                 &#34;m3.large&#34;,
 *                 &#34;m3.xlarge&#34;,
 *                 &#34;m3.2xlarge&#34;,
 *                 &#34;m4.large&#34;,
 *                 &#34;m4.xlarge&#34;,
 *                 &#34;m4.4xlarge&#34;,
 *                 &#34;m4.2xlarge&#34;,
 *                 &#34;m4.10xlarge&#34;,
 *                 &#34;m4.16xlarge&#34;,
 *                 &#34;m5.large&#34;,
 *                 &#34;m5.xlarge&#34;,
 *                 &#34;m5.2xlarge&#34;,
 *                 &#34;m5.4xlarge&#34;,
 *                 &#34;m5.12xlarge&#34;,
 *                 &#34;m5.24xlarge&#34;)
 *             .oceanId(&#34;o-123456&#34;)
 *             .preferredSpotTypes(            
 *                 &#34;m3.large&#34;,
 *                 &#34;m3.xlarge&#34;,
 *                 &#34;m3.2xlarge&#34;,
 *                 &#34;m4.large&#34;,
 *                 &#34;m4.xlarge&#34;)
 *             .restrictScaleDown(true)
 *             .schedulingTasks(OceanLaunchSpecSchedulingTaskArgs.builder()
 *                 .cronExpression(&#34;0 1 * * *&#34;)
 *                 .isEnabled(true)
 *                 .taskHeadrooms(OceanLaunchSpecSchedulingTaskTaskHeadroomArgs.builder()
 *                     .cpuPerUnit(1000)
 *                     .memoryPerUnit(2048)
 *                     .numOfUnits(5)
 *                     .build())
 *                 .taskType(&#34;manualHeadroomUpdate&#34;)
 *                 .build())
 *             .securityGroupIds(&#34;awseb-12345&#34;)
 *             .strategies(OceanLaunchSpecStrategyArgs.builder()
 *                 .spotPercentage(50)
 *                 .build())
 *             .subnetIds(&#34;subnet-12345&#34;)
 *             .tags(OceanLaunchSpecTagArgs.builder()
 *                 .key(&#34;Env&#34;)
 *                 .value(&#34;production&#34;)
 *                 .build())
 *             .userData(&#34;echo hello world&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         ctx.export(&#34;oceanLaunchspecId&#34;, spotinst_ocean_ecs_launch_spec.example().id());
 *     }
 * }
 * ```
 * ## Block Devices
 * 
 * * `block_device_mappings`- (Optional) Object. Array list of block devices that are exposed to the instance, specify either virtual devices and EBS volumes.
 *     * `device_name` - (Optional) String. Set device name. (Example: &#34;/dev/xvda1&#34;).
 *     * `ebs`- (Optional) Object. Set Elastic Block Store properties .
 *         * `delete_on_termination`- (Optional) Boolean. Flag to delete the EBS on instance termination.
 *         * `encrypted`- (Optional) Boolean. Enables [EBS encryption](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html) on the volume.
 *         * `iops`- (Required for requests to create io1 volumes; it is not used in requests to create gp2, st1, sc1, or standard volumes) Int. The number of I/O operations per second (IOPS) that the volume supports.
 *         * `kms_key_id`- (Optional) String. Identifier (key ID, key alias, ID ARN, or alias ARN) for a customer managed CMK under which the EBS volume is encrypted.
 *         * `snapshot_id`- (Optional) (Optional) String. The Snapshot ID to mount by.
 *         * `volume_type`- (Optional, Default: `&#34;standard&#34;`) String. The type of the volume (example: &#34;gp2&#34;).
 *         * `volume_size`- (Optional) Int. The size, in GB of the volume.
 *         * `throughput`- (Optional) The amount of data transferred to or from a storage device per second, you can use this param just in a case that `volume_type` = gp3.
 *         * `dynamic_volume_size`- (Optional) Object. Set dynamic volume size properties. When using this object, you cannot use volumeSize. You must use one or the other.
 *             * `base_size`- (Required) Int. Initial size for volume. (Example: 50)
 *             * `resource`- (Required) String. Resource type to increase volume size dynamically by. (valid values: &#34;CPU&#34;)
 *             * `size_per_resource_unit`- (Required) Int. Additional size (in GB) per resource unit. (Example: baseSize= 50, sizePerResourceUnit=20, and instance with 2 CPU is launched - its total disk size will be: 90GB)
 *         * `no_device`- (Optional) String. suppresses the specified device included in the block device mapping of the AMI.
 * 
 */
@ResourceType(type="spotinst:ecs/oceanLaunchSpec:OceanLaunchSpec")
public class OceanLaunchSpec extends com.pulumi.resources.CustomResource {
    /**
     * Optionally adds labels to instances launched in an Ocean cluster.
     * 
     */
    @Export(name="attributes", type=List.class, parameters={OceanLaunchSpecAttribute.class})
    private Output</* @Nullable */ List<OceanLaunchSpecAttribute>> attributes;

    /**
     * @return Optionally adds labels to instances launched in an Ocean cluster.
     * 
     */
    public Output<Optional<List<OceanLaunchSpecAttribute>>> attributes() {
        return Codegen.optional(this.attributes);
    }
    /**
     * Set custom headroom per launch spec. provide list of headrooms object.
     * 
     */
    @Export(name="autoscaleHeadrooms", type=List.class, parameters={OceanLaunchSpecAutoscaleHeadroom.class})
    private Output</* @Nullable */ List<OceanLaunchSpecAutoscaleHeadroom>> autoscaleHeadrooms;

    /**
     * @return Set custom headroom per launch spec. provide list of headrooms object.
     * 
     */
    public Output<Optional<List<OceanLaunchSpecAutoscaleHeadroom>>> autoscaleHeadrooms() {
        return Codegen.optional(this.autoscaleHeadrooms);
    }
    @Export(name="blockDeviceMappings", type=List.class, parameters={OceanLaunchSpecBlockDeviceMapping.class})
    private Output</* @Nullable */ List<OceanLaunchSpecBlockDeviceMapping>> blockDeviceMappings;

    public Output<Optional<List<OceanLaunchSpecBlockDeviceMapping>>> blockDeviceMappings() {
        return Codegen.optional(this.blockDeviceMappings);
    }
    /**
     * The ARN or name of an IAM instance profile to associate with launched instances.
     * 
     */
    @Export(name="iamInstanceProfile", type=String.class, parameters={})
    private Output</* @Nullable */ String> iamInstanceProfile;

    /**
     * @return The ARN or name of an IAM instance profile to associate with launched instances.
     * 
     */
    public Output<Optional<String>> iamInstanceProfile() {
        return Codegen.optional(this.iamInstanceProfile);
    }
    /**
     * ID of the image used to launch the instances.
     * 
     */
    @Export(name="imageId", type=String.class, parameters={})
    private Output</* @Nullable */ String> imageId;

    /**
     * @return ID of the image used to launch the instances.
     * 
     */
    public Output<Optional<String>> imageId() {
        return Codegen.optional(this.imageId);
    }
    /**
     * A list of instance types allowed to be provisioned for pods pending under the specified launch specification. The list overrides the list defined for the Ocean cluster.
     * 
     */
    @Export(name="instanceTypes", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> instanceTypes;

    /**
     * @return A list of instance types allowed to be provisioned for pods pending under the specified launch specification. The list overrides the list defined for the Ocean cluster.
     * 
     */
    public Output<Optional<List<String>>> instanceTypes() {
        return Codegen.optional(this.instanceTypes);
    }
    /**
     * The Ocean Launch Specification name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The Ocean Launch Specification name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The Ocean cluster ID .
     * 
     */
    @Export(name="oceanId", type=String.class, parameters={})
    private Output<String> oceanId;

    /**
     * @return The Ocean cluster ID .
     * 
     */
    public Output<String> oceanId() {
        return this.oceanId;
    }
    /**
     * When Ocean scales up instances, it takes your preferred types into consideration while maintaining a variety of machine types running for optimized distribution.
     * 
     */
    @Export(name="preferredSpotTypes", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> preferredSpotTypes;

    /**
     * @return When Ocean scales up instances, it takes your preferred types into consideration while maintaining a variety of machine types running for optimized distribution.
     * 
     */
    public Output<Optional<List<String>>> preferredSpotTypes() {
        return Codegen.optional(this.preferredSpotTypes);
    }
    /**
     * Boolean. When set to “True”, VNG nodes will be treated as if all pods running have the restrict-scale-down label. Therefore, Ocean will not scale nodes down unless empty.
     * 
     */
    @Export(name="restrictScaleDown", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> restrictScaleDown;

    /**
     * @return Boolean. When set to “True”, VNG nodes will be treated as if all pods running have the restrict-scale-down label. Therefore, Ocean will not scale nodes down unless empty.
     * 
     */
    public Output<Optional<Boolean>> restrictScaleDown() {
        return Codegen.optional(this.restrictScaleDown);
    }
    /**
     * Used to define scheduled tasks such as a manual headroom update.
     * 
     */
    @Export(name="schedulingTasks", type=List.class, parameters={OceanLaunchSpecSchedulingTask.class})
    private Output</* @Nullable */ List<OceanLaunchSpecSchedulingTask>> schedulingTasks;

    /**
     * @return Used to define scheduled tasks such as a manual headroom update.
     * 
     */
    public Output<Optional<List<OceanLaunchSpecSchedulingTask>>> schedulingTasks() {
        return Codegen.optional(this.schedulingTasks);
    }
    /**
     * One or more security group ids.
     * 
     */
    @Export(name="securityGroupIds", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> securityGroupIds;

    /**
     * @return One or more security group ids.
     * 
     */
    public Output<Optional<List<String>>> securityGroupIds() {
        return Codegen.optional(this.securityGroupIds);
    }
    /**
     * Similar to a strategy for an Ocean cluster, but applying only to a virtual node group.
     * 
     */
    @Export(name="strategies", type=List.class, parameters={OceanLaunchSpecStrategy.class})
    private Output</* @Nullable */ List<OceanLaunchSpecStrategy>> strategies;

    /**
     * @return Similar to a strategy for an Ocean cluster, but applying only to a virtual node group.
     * 
     */
    public Output<Optional<List<OceanLaunchSpecStrategy>>> strategies() {
        return Codegen.optional(this.strategies);
    }
    /**
     * Set subnets in launchSpec. Each element in the array should be a subnet ID.
     * 
     */
    @Export(name="subnetIds", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> subnetIds;

    /**
     * @return Set subnets in launchSpec. Each element in the array should be a subnet ID.
     * 
     */
    public Output<Optional<List<String>>> subnetIds() {
        return Codegen.optional(this.subnetIds);
    }
    /**
     * A key/value mapping of tags to assign to the resource.
     * 
     */
    @Export(name="tags", type=List.class, parameters={OceanLaunchSpecTag.class})
    private Output</* @Nullable */ List<OceanLaunchSpecTag>> tags;

    /**
     * @return A key/value mapping of tags to assign to the resource.
     * 
     */
    public Output<Optional<List<OceanLaunchSpecTag>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Base64-encoded MIME user data to make available to the instances.
     * 
     */
    @Export(name="userData", type=String.class, parameters={})
    private Output</* @Nullable */ String> userData;

    /**
     * @return Base64-encoded MIME user data to make available to the instances.
     * 
     */
    public Output<Optional<String>> userData() {
        return Codegen.optional(this.userData);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public OceanLaunchSpec(String name) {
        this(name, OceanLaunchSpecArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public OceanLaunchSpec(String name, OceanLaunchSpecArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public OceanLaunchSpec(String name, OceanLaunchSpecArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("spotinst:ecs/oceanLaunchSpec:OceanLaunchSpec", name, args == null ? OceanLaunchSpecArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private OceanLaunchSpec(String name, Output<String> id, @Nullable OceanLaunchSpecState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("spotinst:ecs/oceanLaunchSpec:OceanLaunchSpec", name, state, makeResourceOptions(options, id));
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
    public static OceanLaunchSpec get(String name, Output<String> id, @Nullable OceanLaunchSpecState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new OceanLaunchSpec(name, id, state, options);
    }
}