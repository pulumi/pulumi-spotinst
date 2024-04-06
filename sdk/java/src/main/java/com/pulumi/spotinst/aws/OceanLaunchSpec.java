// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.spotinst.Utilities;
import com.pulumi.spotinst.aws.OceanLaunchSpecArgs;
import com.pulumi.spotinst.aws.inputs.OceanLaunchSpecState;
import com.pulumi.spotinst.aws.outputs.OceanLaunchSpecAutoscaleDown;
import com.pulumi.spotinst.aws.outputs.OceanLaunchSpecAutoscaleHeadroom;
import com.pulumi.spotinst.aws.outputs.OceanLaunchSpecAutoscaleHeadroomsAutomatic;
import com.pulumi.spotinst.aws.outputs.OceanLaunchSpecBlockDeviceMapping;
import com.pulumi.spotinst.aws.outputs.OceanLaunchSpecCreateOptions;
import com.pulumi.spotinst.aws.outputs.OceanLaunchSpecDeleteOptions;
import com.pulumi.spotinst.aws.outputs.OceanLaunchSpecElasticIpPool;
import com.pulumi.spotinst.aws.outputs.OceanLaunchSpecEphemeralStorage;
import com.pulumi.spotinst.aws.outputs.OceanLaunchSpecImage;
import com.pulumi.spotinst.aws.outputs.OceanLaunchSpecInstanceMetadataOptions;
import com.pulumi.spotinst.aws.outputs.OceanLaunchSpecInstanceTypesFilters;
import com.pulumi.spotinst.aws.outputs.OceanLaunchSpecLabel;
import com.pulumi.spotinst.aws.outputs.OceanLaunchSpecResourceLimit;
import com.pulumi.spotinst.aws.outputs.OceanLaunchSpecSchedulingShutdownHours;
import com.pulumi.spotinst.aws.outputs.OceanLaunchSpecSchedulingTask;
import com.pulumi.spotinst.aws.outputs.OceanLaunchSpecStrategy;
import com.pulumi.spotinst.aws.outputs.OceanLaunchSpecTag;
import com.pulumi.spotinst.aws.outputs.OceanLaunchSpecTaint;
import com.pulumi.spotinst.aws.outputs.OceanLaunchSpecUpdatePolicy;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Spotinst Ocean AWS [Virtual Node Group](https://docs.spot.io/ocean/features/launch-specifications) resource.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.spotinst.aws.OceanLaunchSpec;
 * import com.pulumi.spotinst.aws.OceanLaunchSpecArgs;
 * import com.pulumi.spotinst.aws.inputs.OceanLaunchSpecAutoscaleDownArgs;
 * import com.pulumi.spotinst.aws.inputs.OceanLaunchSpecAutoscaleHeadroomArgs;
 * import com.pulumi.spotinst.aws.inputs.OceanLaunchSpecAutoscaleHeadroomsAutomaticArgs;
 * import com.pulumi.spotinst.aws.inputs.OceanLaunchSpecBlockDeviceMappingArgs;
 * import com.pulumi.spotinst.aws.inputs.OceanLaunchSpecBlockDeviceMappingEbsArgs;
 * import com.pulumi.spotinst.aws.inputs.OceanLaunchSpecBlockDeviceMappingEbsDynamicVolumeSizeArgs;
 * import com.pulumi.spotinst.aws.inputs.OceanLaunchSpecCreateOptionsArgs;
 * import com.pulumi.spotinst.aws.inputs.OceanLaunchSpecDeleteOptionsArgs;
 * import com.pulumi.spotinst.aws.inputs.OceanLaunchSpecElasticIpPoolArgs;
 * import com.pulumi.spotinst.aws.inputs.OceanLaunchSpecElasticIpPoolTagSelectorArgs;
 * import com.pulumi.spotinst.aws.inputs.OceanLaunchSpecEphemeralStorageArgs;
 * import com.pulumi.spotinst.aws.inputs.OceanLaunchSpecImageArgs;
 * import com.pulumi.spotinst.aws.inputs.OceanLaunchSpecInstanceMetadataOptionsArgs;
 * import com.pulumi.spotinst.aws.inputs.OceanLaunchSpecLabelArgs;
 * import com.pulumi.spotinst.aws.inputs.OceanLaunchSpecResourceLimitArgs;
 * import com.pulumi.spotinst.aws.inputs.OceanLaunchSpecSchedulingShutdownHoursArgs;
 * import com.pulumi.spotinst.aws.inputs.OceanLaunchSpecSchedulingTaskArgs;
 * import com.pulumi.spotinst.aws.inputs.OceanLaunchSpecStrategyArgs;
 * import com.pulumi.spotinst.aws.inputs.OceanLaunchSpecTagArgs;
 * import com.pulumi.spotinst.aws.inputs.OceanLaunchSpecTaintArgs;
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
 *             .associatePublicIpAddress(true)
 *             .autoscaleDowns(OceanLaunchSpecAutoscaleDownArgs.builder()
 *                 .maxScaleDownPercentage(20)
 *                 .build())
 *             .autoscaleHeadrooms(OceanLaunchSpecAutoscaleHeadroomArgs.builder()
 *                 .cpuPerUnit(1000)
 *                 .gpuPerUnit(0)
 *                 .memoryPerUnit(2048)
 *                 .numOfUnits(5)
 *                 .build())
 *             .autoscaleHeadroomsAutomatics(OceanLaunchSpecAutoscaleHeadroomsAutomaticArgs.builder()
 *                 .autoHeadroomPercentage(5)
 *                 .build())
 *             .blockDeviceMappings(OceanLaunchSpecBlockDeviceMappingArgs.builder()
 *                 .deviceName(&#34;/dev/xvda&#34;)
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
 *             .createOptions(OceanLaunchSpecCreateOptionsArgs.builder()
 *                 .initialNodes(1)
 *                 .build())
 *             .deleteOptions(OceanLaunchSpecDeleteOptionsArgs.builder()
 *                 .deleteNodes(true)
 *                 .forceDelete(true)
 *                 .build())
 *             .elasticIpPools(OceanLaunchSpecElasticIpPoolArgs.builder()
 *                 .tagSelector(OceanLaunchSpecElasticIpPoolTagSelectorArgs.builder()
 *                     .tagKey(&#34;key&#34;)
 *                     .tagValue(&#34;value&#34;)
 *                     .build())
 *                 .build())
 *             .ephemeralStorages(OceanLaunchSpecEphemeralStorageArgs.builder()
 *                 .ephemeralStorageDeviceName(&#34;/dev/xvda&#34;)
 *                 .build())
 *             .iamInstanceProfile(&#34;iam-profile&#34;)
 *             .imageId(&#34;ami-123456&#34;)
 *             .images(            
 *                 OceanLaunchSpecImageArgs.builder()
 *                     .imageId(&#34;ami-id1&#34;)
 *                     .build(),
 *                 OceanLaunchSpecImageArgs.builder()
 *                     .imageId(&#34;ami-id2&#34;)
 *                     .build())
 *             .instanceMetadataOptions(OceanLaunchSpecInstanceMetadataOptionsArgs.builder()
 *                 .httpPutResponseHopLimit(10)
 *                 .httpTokens(&#34;required&#34;)
 *                 .build())
 *             .instanceTypes(            
 *                 &#34;m4.large&#34;,
 *                 &#34;m4.xlarge&#34;,
 *                 &#34;m4.2xlarge&#34;,
 *                 &#34;m4.4xlarge&#34;)
 *             .labels(OceanLaunchSpecLabelArgs.builder()
 *                 .key(&#34;key1&#34;)
 *                 .value(&#34;value1&#34;)
 *                 .build())
 *             .oceanId(&#34;o-123456&#34;)
 *             .preferredSpotTypes(            
 *                 &#34;m4.large&#34;,
 *                 &#34;m4.xlarge&#34;)
 *             .resourceLimits(OceanLaunchSpecResourceLimitArgs.builder()
 *                 .maxInstanceCount(4)
 *                 .minInstanceCount(0)
 *                 .build())
 *             .restrictScaleDown(true)
 *             .rootVolumeSize(30)
 *             .schedulingShutdownHours(OceanLaunchSpecSchedulingShutdownHoursArgs.builder()
 *                 .isEnabled(true)
 *                 .timeWindows(                
 *                     &#34;Sat:08:00-Sat:08:30&#34;,
 *                     &#34;Sun:08:00-Sun:08:30&#34;)
 *                 .build())
 *             .schedulingTasks(OceanLaunchSpecSchedulingTaskArgs.builder()
 *                 .cronExpression(&#34;0 1 * * *&#34;)
 *                 .isEnabled(true)
 *                 .taskHeadrooms(OceanLaunchSpecSchedulingTaskTaskHeadroomArgs.builder()
 *                     .cpuPerUnit(1000)
 *                     .gpuPerUnit(0)
 *                     .memoryPerUnit(2048)
 *                     .numOfUnits(5)
 *                     .build())
 *                 .taskType(&#34;manualHeadroomUpdate&#34;)
 *                 .build())
 *             .securityGroups(&#34;sg-987654321&#34;)
 *             .strategies(OceanLaunchSpecStrategyArgs.builder()
 *                 .spotPercentage(70)
 *                 .build())
 *             .subnetIds(&#34;subnet-1234&#34;)
 *             .tags(OceanLaunchSpecTagArgs.builder()
 *                 .key(&#34;Env&#34;)
 *                 .value(&#34;production&#34;)
 *                 .build())
 *             .taints(OceanLaunchSpecTaintArgs.builder()
 *                 .effect(&#34;NoExecute&#34;)
 *                 .key(&#34;key1&#34;)
 *                 .value(&#34;value1&#34;)
 *                 .build())
 *             .userData(&#34;echo Hello, world!&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Update Policy
 * 
 * * `update_policy` - (Optional)
 *     * `should_roll` - (Required) Enables the roll.
 *     * `roll_config` - (Required) Holds the roll configuration.
 *         * `batch_size_percentage` - (Required) Sets the percentage of the instances to deploy in each batch.
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
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
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="spotinst:aws/oceanLaunchSpec:OceanLaunchSpec")
public class OceanLaunchSpec extends com.pulumi.resources.CustomResource {
    /**
     * Configure public IP address allocation.
     * 
     */
    @Export(name="associatePublicIpAddress", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> associatePublicIpAddress;

    /**
     * @return Configure public IP address allocation.
     * 
     */
    public Output<Optional<Boolean>> associatePublicIpAddress() {
        return Codegen.optional(this.associatePublicIpAddress);
    }
    /**
     * Auto Scaling scale down operations.
     * 
     */
    @Export(name="autoscaleDowns", refs={List.class,OceanLaunchSpecAutoscaleDown.class}, tree="[0,1]")
    private Output</* @Nullable */ List<OceanLaunchSpecAutoscaleDown>> autoscaleDowns;

    /**
     * @return Auto Scaling scale down operations.
     * 
     */
    public Output<Optional<List<OceanLaunchSpecAutoscaleDown>>> autoscaleDowns() {
        return Codegen.optional(this.autoscaleDowns);
    }
    /**
     * Set custom headroom per Virtual Node Group. Provide a list of headrooms object.
     * 
     */
    @Export(name="autoscaleHeadrooms", refs={List.class,OceanLaunchSpecAutoscaleHeadroom.class}, tree="[0,1]")
    private Output</* @Nullable */ List<OceanLaunchSpecAutoscaleHeadroom>> autoscaleHeadrooms;

    /**
     * @return Set custom headroom per Virtual Node Group. Provide a list of headrooms object.
     * 
     */
    public Output<Optional<List<OceanLaunchSpecAutoscaleHeadroom>>> autoscaleHeadrooms() {
        return Codegen.optional(this.autoscaleHeadrooms);
    }
    /**
     * Set automatic headroom per launch spec.
     * 
     */
    @Export(name="autoscaleHeadroomsAutomatics", refs={List.class,OceanLaunchSpecAutoscaleHeadroomsAutomatic.class}, tree="[0,1]")
    private Output</* @Nullable */ List<OceanLaunchSpecAutoscaleHeadroomsAutomatic>> autoscaleHeadroomsAutomatics;

    /**
     * @return Set automatic headroom per launch spec.
     * 
     */
    public Output<Optional<List<OceanLaunchSpecAutoscaleHeadroomsAutomatic>>> autoscaleHeadroomsAutomatics() {
        return Codegen.optional(this.autoscaleHeadroomsAutomatics);
    }
    /**
     * Object. Array list of block devices that are exposed to the instance, specify either virtual devices and EBS volumes.
     * 
     */
    @Export(name="blockDeviceMappings", refs={List.class,OceanLaunchSpecBlockDeviceMapping.class}, tree="[0,1]")
    private Output</* @Nullable */ List<OceanLaunchSpecBlockDeviceMapping>> blockDeviceMappings;

    /**
     * @return Object. Array list of block devices that are exposed to the instance, specify either virtual devices and EBS volumes.
     * 
     */
    public Output<Optional<List<OceanLaunchSpecBlockDeviceMapping>>> blockDeviceMappings() {
        return Codegen.optional(this.blockDeviceMappings);
    }
    @Export(name="createOptions", refs={OceanLaunchSpecCreateOptions.class}, tree="[0]")
    private Output</* @Nullable */ OceanLaunchSpecCreateOptions> createOptions;

    public Output<Optional<OceanLaunchSpecCreateOptions>> createOptions() {
        return Codegen.optional(this.createOptions);
    }
    @Export(name="deleteOptions", refs={OceanLaunchSpecDeleteOptions.class}, tree="[0]")
    private Output</* @Nullable */ OceanLaunchSpecDeleteOptions> deleteOptions;

    public Output<Optional<OceanLaunchSpecDeleteOptions>> deleteOptions() {
        return Codegen.optional(this.deleteOptions);
    }
    /**
     * Assign an Elastic IP to the instances spun by the Virtual Node Group. Can be null.
     * 
     */
    @Export(name="elasticIpPools", refs={List.class,OceanLaunchSpecElasticIpPool.class}, tree="[0,1]")
    private Output</* @Nullable */ List<OceanLaunchSpecElasticIpPool>> elasticIpPools;

    /**
     * @return Assign an Elastic IP to the instances spun by the Virtual Node Group. Can be null.
     * 
     */
    public Output<Optional<List<OceanLaunchSpecElasticIpPool>>> elasticIpPools() {
        return Codegen.optional(this.elasticIpPools);
    }
    @Export(name="ephemeralStorages", refs={List.class,OceanLaunchSpecEphemeralStorage.class}, tree="[0,1]")
    private Output</* @Nullable */ List<OceanLaunchSpecEphemeralStorage>> ephemeralStorages;

    public Output<Optional<List<OceanLaunchSpecEphemeralStorage>>> ephemeralStorages() {
        return Codegen.optional(this.ephemeralStorages);
    }
    /**
     * The ARN or name of an IAM instance profile to associate with launched instances.
     * 
     */
    @Export(name="iamInstanceProfile", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> iamInstanceProfile;

    /**
     * @return The ARN or name of an IAM instance profile to associate with launched instances.
     * 
     */
    public Output<Optional<String>> iamInstanceProfile() {
        return Codegen.optional(this.iamInstanceProfile);
    }
    /**
     * Identifier of the image in AWS. Valid values: any string which is not empty or null.
     * 
     */
    @Export(name="imageId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> imageId;

    /**
     * @return Identifier of the image in AWS. Valid values: any string which is not empty or null.
     * 
     */
    public Output<Optional<String>> imageId() {
        return Codegen.optional(this.imageId);
    }
    /**
     * Array of objects (Image object, containing the id of the image used to launch instances.) You can configure VNG with either the imageId or images objects, but not both simultaneously.
     * For each architecture type (amd64, arm64) only one AMI is allowed. Valid values: null, or an array with at least one element.
     * 
     */
    @Export(name="images", refs={List.class,OceanLaunchSpecImage.class}, tree="[0,1]")
    private Output</* @Nullable */ List<OceanLaunchSpecImage>> images;

    /**
     * @return Array of objects (Image object, containing the id of the image used to launch instances.) You can configure VNG with either the imageId or images objects, but not both simultaneously.
     * For each architecture type (amd64, arm64) only one AMI is allowed. Valid values: null, or an array with at least one element.
     * 
     */
    public Output<Optional<List<OceanLaunchSpecImage>>> images() {
        return Codegen.optional(this.images);
    }
    /**
     * Ocean instance metadata options object for IMDSv2.
     * 
     */
    @Export(name="instanceMetadataOptions", refs={OceanLaunchSpecInstanceMetadataOptions.class}, tree="[0]")
    private Output</* @Nullable */ OceanLaunchSpecInstanceMetadataOptions> instanceMetadataOptions;

    /**
     * @return Ocean instance metadata options object for IMDSv2.
     * 
     */
    public Output<Optional<OceanLaunchSpecInstanceMetadataOptions>> instanceMetadataOptions() {
        return Codegen.optional(this.instanceMetadataOptions);
    }
    /**
     * A list of instance types allowed to be provisioned for pods pending under the specified launch specification. The list overrides the list defined for the cluster.
     * 
     */
    @Export(name="instanceTypes", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> instanceTypes;

    /**
     * @return A list of instance types allowed to be provisioned for pods pending under the specified launch specification. The list overrides the list defined for the cluster.
     * 
     */
    public Output<Optional<List<String>>> instanceTypes() {
        return Codegen.optional(this.instanceTypes);
    }
    /**
     * The instance types that match with all filters compose the Virtual Node Group&#39;s instanceTypes parameter.
     * The architectures that come from the Virtual Node Group&#39;s images will be taken into account when using this parameter. Cannot be configured together with Virtual Node Group&#39;s instanceTypes and with the Cluster&#39;s whitelist/blacklist/filters.
     * 
     */
    @Export(name="instanceTypesFilters", refs={OceanLaunchSpecInstanceTypesFilters.class}, tree="[0]")
    private Output</* @Nullable */ OceanLaunchSpecInstanceTypesFilters> instanceTypesFilters;

    /**
     * @return The instance types that match with all filters compose the Virtual Node Group&#39;s instanceTypes parameter.
     * The architectures that come from the Virtual Node Group&#39;s images will be taken into account when using this parameter. Cannot be configured together with Virtual Node Group&#39;s instanceTypes and with the Cluster&#39;s whitelist/blacklist/filters.
     * 
     */
    public Output<Optional<OceanLaunchSpecInstanceTypesFilters>> instanceTypesFilters() {
        return Codegen.optional(this.instanceTypesFilters);
    }
    /**
     * Optionally adds labels to instances launched in the cluster.
     * 
     */
    @Export(name="labels", refs={List.class,OceanLaunchSpecLabel.class}, tree="[0,1]")
    private Output</* @Nullable */ List<OceanLaunchSpecLabel>> labels;

    /**
     * @return Optionally adds labels to instances launched in the cluster.
     * 
     */
    public Output<Optional<List<OceanLaunchSpecLabel>>> labels() {
        return Codegen.optional(this.labels);
    }
    /**
     * The name of the Virtual Node Group.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the Virtual Node Group.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ID of the Ocean cluster.
     * 
     */
    @Export(name="oceanId", refs={String.class}, tree="[0]")
    private Output<String> oceanId;

    /**
     * @return The ID of the Ocean cluster.
     * 
     */
    public Output<String> oceanId() {
        return this.oceanId;
    }
    /**
     * A list of instance types. Takes the preferred types into consideration while maintaining a variety of machine types running for optimized distribution.
     * 
     */
    @Export(name="preferredSpotTypes", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> preferredSpotTypes;

    /**
     * @return A list of instance types. Takes the preferred types into consideration while maintaining a variety of machine types running for optimized distribution.
     * 
     */
    public Output<Optional<List<String>>> preferredSpotTypes() {
        return Codegen.optional(this.preferredSpotTypes);
    }
    @Export(name="resourceLimits", refs={List.class,OceanLaunchSpecResourceLimit.class}, tree="[0,1]")
    private Output</* @Nullable */ List<OceanLaunchSpecResourceLimit>> resourceLimits;

    public Output<Optional<List<OceanLaunchSpecResourceLimit>>> resourceLimits() {
        return Codegen.optional(this.resourceLimits);
    }
    /**
     * Boolean. When set to `True`, nodes will be treated as if all pods running have the restrict-scale-down label. Therefore, Ocean will not scale nodes down unless empty.
     * 
     */
    @Export(name="restrictScaleDown", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> restrictScaleDown;

    /**
     * @return Boolean. When set to `True`, nodes will be treated as if all pods running have the restrict-scale-down label. Therefore, Ocean will not scale nodes down unless empty.
     * 
     */
    public Output<Optional<Boolean>> restrictScaleDown() {
        return Codegen.optional(this.restrictScaleDown);
    }
    /**
     * Set root volume size (in GB).
     * 
     */
    @Export(name="rootVolumeSize", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> rootVolumeSize;

    /**
     * @return Set root volume size (in GB).
     * 
     */
    public Output<Optional<Integer>> rootVolumeSize() {
        return Codegen.optional(this.rootVolumeSize);
    }
    /**
     * Used to specify times that the nodes in the virtual node group will be taken down.
     * 
     */
    @Export(name="schedulingShutdownHours", refs={OceanLaunchSpecSchedulingShutdownHours.class}, tree="[0]")
    private Output</* @Nullable */ OceanLaunchSpecSchedulingShutdownHours> schedulingShutdownHours;

    /**
     * @return Used to specify times that the nodes in the virtual node group will be taken down.
     * 
     */
    public Output<Optional<OceanLaunchSpecSchedulingShutdownHours>> schedulingShutdownHours() {
        return Codegen.optional(this.schedulingShutdownHours);
    }
    /**
     * Used to define scheduled tasks such as a manual headroom update.
     * 
     */
    @Export(name="schedulingTasks", refs={List.class,OceanLaunchSpecSchedulingTask.class}, tree="[0,1]")
    private Output</* @Nullable */ List<OceanLaunchSpecSchedulingTask>> schedulingTasks;

    /**
     * @return Used to define scheduled tasks such as a manual headroom update.
     * 
     */
    public Output<Optional<List<OceanLaunchSpecSchedulingTask>>> schedulingTasks() {
        return Codegen.optional(this.schedulingTasks);
    }
    /**
     * Optionally adds security group IDs.
     * 
     */
    @Export(name="securityGroups", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> securityGroups;

    /**
     * @return Optionally adds security group IDs.
     * 
     */
    public Output<Optional<List<String>>> securityGroups() {
        return Codegen.optional(this.securityGroups);
    }
    @Export(name="strategies", refs={List.class,OceanLaunchSpecStrategy.class}, tree="[0,1]")
    private Output</* @Nullable */ List<OceanLaunchSpecStrategy>> strategies;

    public Output<Optional<List<OceanLaunchSpecStrategy>>> strategies() {
        return Codegen.optional(this.strategies);
    }
    /**
     * A list of subnet IDs.
     * 
     */
    @Export(name="subnetIds", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> subnetIds;

    /**
     * @return A list of subnet IDs.
     * 
     */
    public Output<Optional<List<String>>> subnetIds() {
        return Codegen.optional(this.subnetIds);
    }
    /**
     * A key/value mapping of tags to assign to the resource.
     * 
     */
    @Export(name="tags", refs={List.class,OceanLaunchSpecTag.class}, tree="[0,1]")
    private Output</* @Nullable */ List<OceanLaunchSpecTag>> tags;

    /**
     * @return A key/value mapping of tags to assign to the resource.
     * 
     */
    public Output<Optional<List<OceanLaunchSpecTag>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Optionally adds labels to instances launched in the cluster.
     * 
     */
    @Export(name="taints", refs={List.class,OceanLaunchSpecTaint.class}, tree="[0,1]")
    private Output</* @Nullable */ List<OceanLaunchSpecTaint>> taints;

    /**
     * @return Optionally adds labels to instances launched in the cluster.
     * 
     */
    public Output<Optional<List<OceanLaunchSpecTaint>>> taints() {
        return Codegen.optional(this.taints);
    }
    @Export(name="updatePolicy", refs={OceanLaunchSpecUpdatePolicy.class}, tree="[0]")
    private Output</* @Nullable */ OceanLaunchSpecUpdatePolicy> updatePolicy;

    public Output<Optional<OceanLaunchSpecUpdatePolicy>> updatePolicy() {
        return Codegen.optional(this.updatePolicy);
    }
    /**
     * Base64-encoded MIME user data to make available to the instances.
     * 
     */
    @Export(name="userData", refs={String.class}, tree="[0]")
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
        super("spotinst:aws/oceanLaunchSpec:OceanLaunchSpec", name, args == null ? OceanLaunchSpecArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private OceanLaunchSpec(String name, Output<String> id, @Nullable OceanLaunchSpecState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("spotinst:aws/oceanLaunchSpec:OceanLaunchSpec", name, state, makeResourceOptions(options, id));
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
