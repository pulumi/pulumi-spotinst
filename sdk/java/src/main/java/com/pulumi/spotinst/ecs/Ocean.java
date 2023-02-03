// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.ecs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.spotinst.Utilities;
import com.pulumi.spotinst.ecs.OceanArgs;
import com.pulumi.spotinst.ecs.inputs.OceanState;
import com.pulumi.spotinst.ecs.outputs.OceanAutoscaler;
import com.pulumi.spotinst.ecs.outputs.OceanBlockDeviceMapping;
import com.pulumi.spotinst.ecs.outputs.OceanClusterOrientation;
import com.pulumi.spotinst.ecs.outputs.OceanFilters;
import com.pulumi.spotinst.ecs.outputs.OceanInstanceMetadataOptions;
import com.pulumi.spotinst.ecs.outputs.OceanLogging;
import com.pulumi.spotinst.ecs.outputs.OceanOptimizeImages;
import com.pulumi.spotinst.ecs.outputs.OceanScheduledTask;
import com.pulumi.spotinst.ecs.outputs.OceanTag;
import com.pulumi.spotinst.ecs.outputs.OceanUpdatePolicy;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Spotinst Ocean ECS resource.
 * 
 * ## Example Usage
 * 
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.spotinst.ecs.Ocean;
 * import com.pulumi.spotinst.ecs.OceanArgs;
 * import com.pulumi.spotinst.ecs.inputs.OceanBlockDeviceMappingArgs;
 * import com.pulumi.spotinst.ecs.inputs.OceanBlockDeviceMappingEbsArgs;
 * import com.pulumi.spotinst.ecs.inputs.OceanBlockDeviceMappingEbsDynamicVolumeSizeArgs;
 * import com.pulumi.spotinst.ecs.inputs.OceanClusterOrientationArgs;
 * import com.pulumi.spotinst.ecs.inputs.OceanInstanceMetadataOptionsArgs;
 * import com.pulumi.spotinst.ecs.inputs.OceanLoggingArgs;
 * import com.pulumi.spotinst.ecs.inputs.OceanLoggingExportArgs;
 * import com.pulumi.spotinst.ecs.inputs.OceanOptimizeImagesArgs;
 * import com.pulumi.spotinst.ecs.inputs.OceanTagArgs;
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
 *         var example = new Ocean(&#34;example&#34;, OceanArgs.builder()        
 *             .associatePublicIpAddress(false)
 *             .blockDeviceMappings(OceanBlockDeviceMappingArgs.builder()
 *                 .deviceName(&#34;/dev/xvda1&#34;)
 *                 .ebs(OceanBlockDeviceMappingEbsArgs.builder()
 *                     .deleteOnTermination(&#34;true&#34;)
 *                     .dynamicVolumeSize(OceanBlockDeviceMappingEbsDynamicVolumeSizeArgs.builder()
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
 *             .clusterName(&#34;sample-ecs-cluster&#34;)
 *             .clusterOrientations(OceanClusterOrientationArgs.builder()
 *                 .availabilityVsCost(&#34;balanced&#34;)
 *                 .build())
 *             .desiredCapacity(&#34;0&#34;)
 *             .drainingTimeout(120)
 *             .ebsOptimized(true)
 *             .iamInstanceProfile(&#34;iam-profile&#34;)
 *             .imageId(&#34;ami-12345&#34;)
 *             .instanceTypes(%!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference))
 *             .instanceMetadataOptions(OceanInstanceMetadataOptionsArgs.builder()
 *                 .httpPutResponseHopLimit(10)
 *                 .httpTokens(&#34;required&#34;)
 *                 .build())
 *             .keyPair(&#34;KeyPair&#34;)
 *             .logging(OceanLoggingArgs.builder()
 *                 .export(OceanLoggingExportArgs.builder()
 *                     .s3(%!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference))
 *                     .build())
 *                 .build())
 *             .maxSize(&#34;1&#34;)
 *             .minSize(&#34;0&#34;)
 *             .monitoring(true)
 *             .optimizeImages(OceanOptimizeImagesArgs.builder()
 *                 .performAt(&#34;timeWindow&#34;)
 *                 .shouldOptimizeEcsAmi(true)
 *                 .timeWindows(                
 *                     &#34;Sun:02:00-Sun:12:00&#34;,
 *                     &#34;Sun:05:00-Sun:16:00&#34;)
 *                 .build())
 *             .region(&#34;us-west-2&#34;)
 *             .securityGroupIds(&#34;sg-12345&#34;)
 *             .spotPercentage(100)
 *             .subnetIds(&#34;subnet-12345&#34;)
 *             .tags(OceanTagArgs.builder()
 *                 .key(&#34;fakeKey&#34;)
 *                 .value(&#34;fakeValue&#34;)
 *                 .build())
 *             .useAsTemplateOnly(true)
 *             .userData(&#34;echo hello world&#34;)
 *             .utilizeCommitments(false)
 *             .utilizeReservedInstances(false)
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
 *         ctx.export(&#34;oceanId&#34;, spotinst_ocean_ecs.example().id());
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Clusters can be imported using the Ocean `id`, e.g., hcl
 * 
 * ```sh
 *  $ pulumi import spotinst:ecs/ocean:Ocean this o-12345678
 * ```
 * 
 */
@ResourceType(type="spotinst:ecs/ocean:Ocean")
public class Ocean extends com.pulumi.resources.CustomResource {
    /**
     * Configure public IP address allocation.
     * 
     */
    @Export(name="associatePublicIpAddress", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> associatePublicIpAddress;

    /**
     * @return Configure public IP address allocation.
     * 
     */
    public Output<Optional<Boolean>> associatePublicIpAddress() {
        return Codegen.optional(this.associatePublicIpAddress);
    }
    /**
     * Describes the Ocean ECS autoscaler.
     * 
     */
    @Export(name="autoscaler", type=OceanAutoscaler.class, parameters={})
    private Output</* @Nullable */ OceanAutoscaler> autoscaler;

    /**
     * @return Describes the Ocean ECS autoscaler.
     * 
     */
    public Output<Optional<OceanAutoscaler>> autoscaler() {
        return Codegen.optional(this.autoscaler);
    }
    /**
     * Instance types not allowed in the Ocean cluster. Cannot be configured if `whitelist`/`filters` is configured.
     * 
     */
    @Export(name="blacklists", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> blacklists;

    /**
     * @return Instance types not allowed in the Ocean cluster. Cannot be configured if `whitelist`/`filters` is configured.
     * 
     */
    public Output<Optional<List<String>>> blacklists() {
        return Codegen.optional(this.blacklists);
    }
    /**
     * Object. List of block devices that are exposed to the instance, specify either virtual devices and EBS volumes.
     * 
     */
    @Export(name="blockDeviceMappings", type=List.class, parameters={OceanBlockDeviceMapping.class})
    private Output</* @Nullable */ List<OceanBlockDeviceMapping>> blockDeviceMappings;

    /**
     * @return Object. List of block devices that are exposed to the instance, specify either virtual devices and EBS volumes.
     * 
     */
    public Output<Optional<List<OceanBlockDeviceMapping>>> blockDeviceMappings() {
        return Codegen.optional(this.blockDeviceMappings);
    }
    /**
     * The name of the ECS cluster.
     * 
     */
    @Export(name="clusterName", type=String.class, parameters={})
    private Output<String> clusterName;

    /**
     * @return The name of the ECS cluster.
     * 
     */
    public Output<String> clusterName() {
        return this.clusterName;
    }
    @Export(name="clusterOrientations", type=List.class, parameters={OceanClusterOrientation.class})
    private Output</* @Nullable */ List<OceanClusterOrientation>> clusterOrientations;

    public Output<Optional<List<OceanClusterOrientation>>> clusterOrientations() {
        return Codegen.optional(this.clusterOrientations);
    }
    /**
     * The number of instances to launch and maintain in the cluster.
     * 
     */
    @Export(name="desiredCapacity", type=Integer.class, parameters={})
    private Output<Integer> desiredCapacity;

    /**
     * @return The number of instances to launch and maintain in the cluster.
     * 
     */
    public Output<Integer> desiredCapacity() {
        return this.desiredCapacity;
    }
    /**
     * The time in seconds, the instance is allowed to run while detached from the ELB. This is to allow the instance time to be drained from incoming TCP connections before terminating it, during a scale down operation.
     * 
     */
    @Export(name="drainingTimeout", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> drainingTimeout;

    /**
     * @return The time in seconds, the instance is allowed to run while detached from the ELB. This is to allow the instance time to be drained from incoming TCP connections before terminating it, during a scale down operation.
     * 
     */
    public Output<Optional<Integer>> drainingTimeout() {
        return Codegen.optional(this.drainingTimeout);
    }
    /**
     * Enable EBS optimized for cluster. Flag will enable optimized capacity for high bandwidth connectivity to the EB service for non EBS optimized instance types. For instances that are EBS optimized this flag will be ignored.
     * 
     */
    @Export(name="ebsOptimized", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> ebsOptimized;

    /**
     * @return Enable EBS optimized for cluster. Flag will enable optimized capacity for high bandwidth connectivity to the EB service for non EBS optimized instance types. For instances that are EBS optimized this flag will be ignored.
     * 
     */
    public Output<Optional<Boolean>> ebsOptimized() {
        return Codegen.optional(this.ebsOptimized);
    }
    /**
     * List of filters. The Instance types that match with all filters compose the Ocean&#39;s whitelist parameter. Cannot be configured together with `whitelist`/`blacklist`.
     * 
     */
    @Export(name="filters", type=OceanFilters.class, parameters={})
    private Output</* @Nullable */ OceanFilters> filters;

    /**
     * @return List of filters. The Instance types that match with all filters compose the Ocean&#39;s whitelist parameter. Cannot be configured together with `whitelist`/`blacklist`.
     * 
     */
    public Output<Optional<OceanFilters>> filters() {
        return Codegen.optional(this.filters);
    }
    /**
     * The instance profile iam role.
     * 
     */
    @Export(name="iamInstanceProfile", type=String.class, parameters={})
    private Output</* @Nullable */ String> iamInstanceProfile;

    /**
     * @return The instance profile iam role.
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
     * Ocean instance metadata options object for IMDSv2.
     * 
     */
    @Export(name="instanceMetadataOptions", type=OceanInstanceMetadataOptions.class, parameters={})
    private Output</* @Nullable */ OceanInstanceMetadataOptions> instanceMetadataOptions;

    /**
     * @return Ocean instance metadata options object for IMDSv2.
     * 
     */
    public Output<Optional<OceanInstanceMetadataOptions>> instanceMetadataOptions() {
        return Codegen.optional(this.instanceMetadataOptions);
    }
    /**
     * The key pair to attach the instances.
     * 
     */
    @Export(name="keyPair", type=String.class, parameters={})
    private Output</* @Nullable */ String> keyPair;

    /**
     * @return The key pair to attach the instances.
     * 
     */
    public Output<Optional<String>> keyPair() {
        return Codegen.optional(this.keyPair);
    }
    /**
     * Logging configuration.
     * 
     */
    @Export(name="logging", type=OceanLogging.class, parameters={})
    private Output</* @Nullable */ OceanLogging> logging;

    /**
     * @return Logging configuration.
     * 
     */
    public Output<Optional<OceanLogging>> logging() {
        return Codegen.optional(this.logging);
    }
    /**
     * The upper limit of instances the cluster can scale up to.
     * 
     */
    @Export(name="maxSize", type=Integer.class, parameters={})
    private Output<Integer> maxSize;

    /**
     * @return The upper limit of instances the cluster can scale up to.
     * 
     */
    public Output<Integer> maxSize() {
        return this.maxSize;
    }
    /**
     * The lower limit of instances the cluster can scale down to.
     * 
     */
    @Export(name="minSize", type=Integer.class, parameters={})
    private Output<Integer> minSize;

    /**
     * @return The lower limit of instances the cluster can scale down to.
     * 
     */
    public Output<Integer> minSize() {
        return this.minSize;
    }
    /**
     * Enable detailed monitoring for cluster. Flag will enable Cloud Watch detailed monitoring (one minute increments). Note: there are additional hourly costs for this service based on the region used.
     * 
     */
    @Export(name="monitoring", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> monitoring;

    /**
     * @return Enable detailed monitoring for cluster. Flag will enable Cloud Watch detailed monitoring (one minute increments). Note: there are additional hourly costs for this service based on the region used.
     * 
     */
    public Output<Optional<Boolean>> monitoring() {
        return Codegen.optional(this.monitoring);
    }
    /**
     * The Ocean cluster name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The Ocean cluster name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Object. Set auto image update settings.
     * 
     */
    @Export(name="optimizeImages", type=OceanOptimizeImages.class, parameters={})
    private Output</* @Nullable */ OceanOptimizeImages> optimizeImages;

    /**
     * @return Object. Set auto image update settings.
     * 
     */
    public Output<Optional<OceanOptimizeImages>> optimizeImages() {
        return Codegen.optional(this.optimizeImages);
    }
    /**
     * The region the cluster will run in.
     * 
     */
    @Export(name="region", type=String.class, parameters={})
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
    @Export(name="scheduledTasks", type=List.class, parameters={OceanScheduledTask.class})
    private Output</* @Nullable */ List<OceanScheduledTask>> scheduledTasks;

    /**
     * @return While used, you can control whether the group should perform a deployment after an update to the configuration.
     * 
     */
    public Output<Optional<List<OceanScheduledTask>>> scheduledTasks() {
        return Codegen.optional(this.scheduledTasks);
    }
    /**
     * One or more security group ids.
     * 
     */
    @Export(name="securityGroupIds", type=List.class, parameters={String.class})
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
    @Export(name="spotPercentage", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> spotPercentage;

    /**
     * @return The percentage of Spot instances that would spin up from the `desired_capacity` number.
     * 
     */
    public Output<Optional<Integer>> spotPercentage() {
        return Codegen.optional(this.spotPercentage);
    }
    /**
     * A comma-separated list of subnet identifiers for the Ocean cluster. Subnet IDs should be configured with auto assign public ip.
     * 
     */
    @Export(name="subnetIds", type=List.class, parameters={String.class})
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
    @Export(name="tags", type=List.class, parameters={OceanTag.class})
    private Output</* @Nullable */ List<OceanTag>> tags;

    /**
     * @return Optionally adds tags to instances launched in an Ocean cluster.
     * 
     */
    public Output<Optional<List<OceanTag>>> tags() {
        return Codegen.optional(this.tags);
    }
    @Export(name="updatePolicy", type=OceanUpdatePolicy.class, parameters={})
    private Output</* @Nullable */ OceanUpdatePolicy> updatePolicy;

    public Output<Optional<OceanUpdatePolicy>> updatePolicy() {
        return Codegen.optional(this.updatePolicy);
    }
    /**
     * launch specification defined on the Ocean object will function only as a template for virtual node groups.
     * 
     */
    @Export(name="useAsTemplateOnly", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> useAsTemplateOnly;

    /**
     * @return launch specification defined on the Ocean object will function only as a template for virtual node groups.
     * 
     */
    public Output<Optional<Boolean>> useAsTemplateOnly() {
        return Codegen.optional(this.useAsTemplateOnly);
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
     * If savings plans exist, Ocean will utilize them before launching Spot instances.
     * 
     */
    @Export(name="utilizeCommitments", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> utilizeCommitments;

    /**
     * @return If savings plans exist, Ocean will utilize them before launching Spot instances.
     * 
     */
    public Output<Optional<Boolean>> utilizeCommitments() {
        return Codegen.optional(this.utilizeCommitments);
    }
    /**
     * If Reserved instances exist, Ocean will utilize them before launching Spot instances.
     * 
     */
    @Export(name="utilizeReservedInstances", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> utilizeReservedInstances;

    /**
     * @return If Reserved instances exist, Ocean will utilize them before launching Spot instances.
     * 
     */
    public Output<Optional<Boolean>> utilizeReservedInstances() {
        return Codegen.optional(this.utilizeReservedInstances);
    }
    /**
     * Instance types allowed in the Ocean cluster. Cannot be configured if `blacklist`/`filters` is configured.
     * 
     */
    @Export(name="whitelists", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> whitelists;

    /**
     * @return Instance types allowed in the Ocean cluster. Cannot be configured if `blacklist`/`filters` is configured.
     * 
     */
    public Output<Optional<List<String>>> whitelists() {
        return Codegen.optional(this.whitelists);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Ocean(String name) {
        this(name, OceanArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Ocean(String name, OceanArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Ocean(String name, OceanArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("spotinst:ecs/ocean:Ocean", name, args == null ? OceanArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Ocean(String name, Output<String> id, @Nullable OceanState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("spotinst:ecs/ocean:Ocean", name, state, makeResourceOptions(options, id));
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
    public static Ocean get(String name, Output<String> id, @Nullable OceanState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Ocean(name, id, state, options);
    }
}
