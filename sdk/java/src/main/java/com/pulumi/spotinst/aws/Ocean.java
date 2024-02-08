// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.spotinst.Utilities;
import com.pulumi.spotinst.aws.OceanArgs;
import com.pulumi.spotinst.aws.inputs.OceanState;
import com.pulumi.spotinst.aws.outputs.OceanAutoscaler;
import com.pulumi.spotinst.aws.outputs.OceanBlockDeviceMapping;
import com.pulumi.spotinst.aws.outputs.OceanClusterOrientation;
import com.pulumi.spotinst.aws.outputs.OceanFilters;
import com.pulumi.spotinst.aws.outputs.OceanInstanceMetadataOptions;
import com.pulumi.spotinst.aws.outputs.OceanLoadBalancer;
import com.pulumi.spotinst.aws.outputs.OceanLogging;
import com.pulumi.spotinst.aws.outputs.OceanResourceTagSpecification;
import com.pulumi.spotinst.aws.outputs.OceanScheduledTask;
import com.pulumi.spotinst.aws.outputs.OceanTag;
import com.pulumi.spotinst.aws.outputs.OceanUpdatePolicy;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Auto Scaler
 * 
 * * `autoscaler` - (Optional) Describes the Ocean Kubernetes Auto Scaler.
 *     * `autoscale_is_enabled` - (Optional, Default: `true`) Enable the Ocean Kubernetes Auto Scaler.
 *     * `autoscale_is_auto_config` - (Optional, Default: `true`) Automatically configure and optimize headroom resources.
 *     * `autoscale_cooldown` - (Optional, Default: `null`) Cooldown period between scaling actions.
 *     * `auto_headroom_percentage` - (Optional) Set the auto headroom percentage (a number in the range [0, 200]) which controls the percentage of headroom from the cluster. Relevant only when `autoscale_is_auto_config` toggled on.
 *     * `enable_automatic_and_manual_headroom` - (Optional, Default: `false`) enables automatic and manual headroom to work in parallel. When set to false, automatic headroom overrides all other headroom definitions manually configured, whether they are at cluster or VNG level.
 *     * `autoscale_headroom` - (Optional) Spare resource capacity management enabling fast assignment of Pods without waiting for new resources to launch.
 *         * `cpu_per_unit` - (Optional) Optionally configure the number of CPUs to allocate the headroom. CPUs are denoted in millicores, where 1000 millicores = 1 vCPU.
 *         * `gpu_per_unit` - (Optional) Optionally configure the number of GPUs to allocate the headroom.
 *         * `memory_per_unit` - (Optional) Optionally configure the amount of memory (MB) to allocate the headroom.
 *         * `num_of_units` - (Optional) The number of units to retain as headroom, where each unit has the defined headroom CPU and memory.
 *     * `autoscale_down` - (Optional) Auto Scaling scale down operations.
 *         * `max_scale_down_percentage` - (Optional) Would represent the maximum % to scale-down. Number between 1-100.
 *     * `resource_limits` - (Optional) Optionally set upper and lower bounds on the resource usage of the cluster.
 *         * `max_vcpu` - (Optional) The maximum cpu in vCPU units that can be allocated to the cluster.
 *         * `max_memory_gib` - (Optional) The maximum memory in GiB units that can be allocated to the cluster.
 *     * `extended_resource_definitions` - (Optional) List of Ocean extended resource definitions to use in this cluster.
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
 * 
 * ### Update Policy
 * 
 * * `update_policy` - (Optional)
 *     * `should_roll` - (Required) Enables the roll.
 *     * `conditioned_roll` - (Optional, Default: false) Spot will perform a cluster Roll in accordance with a relevant modification of the cluster’s settings. When set to true , only specific changes in the cluster’s configuration will trigger a cluster roll (such as AMI, Key Pair, user data, instance types, load balancers, etc).
 *     * `conditioned_roll_params` - (Optional) A custom list of attributes will trigger the cluster roll operation (overrides the predefined list of parameters). Valid only when the `conditioned_roll` parameter is set to true. (Valid values: `&#34;subnet_ids&#34;`,`&#34;whitelist&#34;`,`&#34;blacklist&#34;`,`&#34;user_data&#34;`,`&#34;image_id&#34;`,`&#34;security_groups&#34;`,`&#34;key_name&#34;`,`&#34;iam_instance_profile&#34;`,`&#34;associate_public_ip_address&#34;`,`&#34;load_balancers&#34;`,`&#34;instance_metadata_options&#34;`,`&#34;ebs_optimized&#34;`,`&#34;root_volume_size&#34;`)
 *     * `auto_apply_tags` - (Optional, Default: false) will update instance tags on the fly without rolling the cluster.
 *     * `roll_config` - (Required) While used, you can control whether the group should perform a deployment after an update to the configuration.
 *         * `batch_size_percentage` - (Required) Sets the percentage of the instances to deploy in each batch.
 *         * `launch_spec_ids` - (Optional) List of virtual node group identifiers to be rolled.
 *         * `batch_min_healthy_percentage` - (Optional) Default: 50. Indicates the threshold of minimum healthy instances in single batch. If the amount of healthy instances in single batch is under the threshold, the cluster roll will fail. If exists, the parameter value will be in range of 1-100. In case of null as value, the default value in the backend will be 50%. Value of param should represent the number in percentage (%) of the batch.
 *         * `respect_pdb` - (Optional, Default: false) During the roll, if the parameter is set to True we honor PDB during the instance replacement.
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
 * 
 * &lt;a id=&#34;scheduled-task&#34;&gt;&lt;/a&gt;
 * ## Scheduled Task
 * 
 * * `scheduled_task` - (Optional) Set scheduling object.
 *     * `shutdown_hours` - (Optional) Set shutdown hours for cluster object.
 *         * `is_enabled` - (Optional) Toggle the shutdown hours task. (Example: `true`).
 *         * `time_windows` - (Required) Set time windows for shutdown hours. Specify a list of `timeWindows` with at least one time window Each string is in the format of: `ddd:hh:mm-ddd:hh:mm` where `ddd` = day of week = Sun | Mon | Tue | Wed | Thu | Fri | Sat, `hh` = hour 24 = 0 -23, `mm` = minute = 0 - 59. Time windows should not overlap. Required if `cluster.scheduling.isEnabled` is `true`. (Example: `Fri:15:30-Wed:14:30`).
 *     * `tasks` - (Optional) The scheduling tasks for the cluster.
 *         * `is_enabled` - (Required)  Describes whether the task is enabled. When true the task should run when false it should not run. Required for `cluster.scheduling.tasks` object.
 *         * `cron_expression` - (Required) A valid cron expression. The cron is running in UTC time zone and is in Unix cron format Cron Expression Validator Script. Only one of `frequency` or `cronExpression` should be used at a time. Required for `cluster.scheduling.tasks` object. (Example: `0 1 * * *`).
 *         * `task_type` - (Required) Valid values: `clusterRoll` `amiAutoUpdate`. Required for `cluster.scheduling.tasks`
 *         * `parameters` - (Optional) This filed will be compatible to the `task_type` field. If `task_type` is defined as `clusterRoll`, user cluster roll object in parameters.
 *             * `ami_auto_update` - (Optional) Set amiAutoUpdate object
 *                 * `apply_roll` - (Optional, Default:false) When the AMI is updated according to the configuration set, a cluster roll can be triggered
 *                 * `ami_auto_update_cluster_roll` - (Optional) Set clusterRoll object
 *                     * `batch_min_healthy_percentage` - (Optional, Default:50) Indicates the threshold of minimum healthy instances in single batch. If the amount of healthy instances in single batch is under the threshold, the cluster roll will fail. If exists, the parameter value will be in range of 1-100. In case of null as value, the default value in the backend will be 50%. Value of param should represent the number in percentage (%) of the batch.
 *                     * `batch_size_percentage` - (Optional) Value as a percent to set the size of a batch in a roll. Valid values are 0-100.
 *                     * `comment` - (Optional) Add a `comment` description for the roll. The `comment` is limited to 256 chars
 *                     * `respect_pdb` - (Optional, Default:false) During the roll, if the parameter is set to true we honor PDB during the instance replacement.
 *                 * `minor_version` - (Optional, Default:false) When set to &#39;true&#39;, the auto-update process will update the VNGs’ AMI with the AMI to match the Kubernetes control plane version. either &#34;patch&#34; or &#34;minor_version&#34; must be true.
 *                 * `patch` - (Optional, Default:false) When set to &#39;true&#39;, the auto-update process will update the VNGs’ images with the latest security patches. either &#34;patch&#34; or &#34;minorVersion&#34; must be true.
 *             * `parameters_cluster_roll` - (Optional) Set clusterRoll object
 *                 * `batch_min_healthy_percentage` - (Optional, Default:50) Indicates the threshold of minimum healthy instances in single batch. If the amount of healthy instances in single batch is under the threshold, the cluster roll will fail. If exists, the parameter value will be in range of 1-100. In case of null as value, the default value in the backend will be 50%. Value of param should represent the number in percentage (%) of the batch.
 *                 * `batch_size_percentage` - (Optional) Value as a percent to set the size of a batch in a roll. Valid values are 0-100.
 *                 * `comment` - (Optional) Add a `comment` description for the roll. The `comment` is limited to 256 chars
 *                 * `respect_pdb` - (Optional, Default:false) During the roll, if the parameter is set to true we honor PDB during the instance replacement.
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
 * 
 * &lt;a id=&#34;attributes-reference&#34;&gt;&lt;/a&gt;
 * 
 * ## Import
 * 
 * Clusters can be imported using the Ocean `id`, e.g.,
 * 
 *  hcl
 * 
 * ```sh
 * $ pulumi import spotinst:aws/ocean:Ocean this o-12345678
 * ```
 * 
 */
@ResourceType(type="spotinst:aws/ocean:Ocean")
public class Ocean extends com.pulumi.resources.CustomResource {
    /**
     * Configure IPv6 address allocation.
     * 
     */
    @Export(name="associateIpv6Address", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> associateIpv6Address;

    /**
     * @return Configure IPv6 address allocation.
     * 
     */
    public Output<Optional<Boolean>> associateIpv6Address() {
        return Codegen.optional(this.associateIpv6Address);
    }
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
    @Export(name="autoscaler", refs={OceanAutoscaler.class}, tree="[0]")
    private Output</* @Nullable */ OceanAutoscaler> autoscaler;

    public Output<Optional<OceanAutoscaler>> autoscaler() {
        return Codegen.optional(this.autoscaler);
    }
    /**
     * Instance types not allowed in the Ocean cluster. Cannot be configured if `whitelist` is configured.
     * 
     */
    @Export(name="blacklists", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> blacklists;

    /**
     * @return Instance types not allowed in the Ocean cluster. Cannot be configured if `whitelist` is configured.
     * 
     */
    public Output<Optional<List<String>>> blacklists() {
        return Codegen.optional(this.blacklists);
    }
    /**
     * Object. Array list of block devices that are exposed to the instance, specify either virtual devices and EBS volumes.
     * 
     */
    @Export(name="blockDeviceMappings", refs={List.class,OceanBlockDeviceMapping.class}, tree="[0,1]")
    private Output</* @Nullable */ List<OceanBlockDeviceMapping>> blockDeviceMappings;

    /**
     * @return Object. Array list of block devices that are exposed to the instance, specify either virtual devices and EBS volumes.
     * 
     */
    public Output<Optional<List<OceanBlockDeviceMapping>>> blockDeviceMappings() {
        return Codegen.optional(this.blockDeviceMappings);
    }
    @Export(name="clusterOrientations", refs={List.class,OceanClusterOrientation.class}, tree="[0,1]")
    private Output</* @Nullable */ List<OceanClusterOrientation>> clusterOrientations;

    public Output<Optional<List<OceanClusterOrientation>>> clusterOrientations() {
        return Codegen.optional(this.clusterOrientations);
    }
    /**
     * A unique identifier used for connecting the Ocean SaaS platform and the Kubernetes cluster. Typically, the cluster name is used as its identifier.
     * 
     */
    @Export(name="controllerId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> controllerId;

    /**
     * @return A unique identifier used for connecting the Ocean SaaS platform and the Kubernetes cluster. Typically, the cluster name is used as its identifier.
     * 
     */
    public Output<Optional<String>> controllerId() {
        return Codegen.optional(this.controllerId);
    }
    /**
     * The number of instances to launch and maintain in the cluster.
     * 
     */
    @Export(name="desiredCapacity", refs={Integer.class}, tree="[0]")
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
    @Export(name="drainingTimeout", refs={Integer.class}, tree="[0]")
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
    @Export(name="ebsOptimized", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> ebsOptimized;

    /**
     * @return Enable EBS optimized for cluster. Flag will enable optimized capacity for high bandwidth connectivity to the EB service for non EBS optimized instance types. For instances that are EBS optimized this flag will be ignored.
     * 
     */
    public Output<Optional<Boolean>> ebsOptimized() {
        return Codegen.optional(this.ebsOptimized);
    }
    /**
     * If not Spot instance markets are available, enable Ocean to launch On-Demand instances instead.
     * 
     */
    @Export(name="fallbackToOndemand", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> fallbackToOndemand;

    /**
     * @return If not Spot instance markets are available, enable Ocean to launch On-Demand instances instead.
     * 
     */
    public Output<Optional<Boolean>> fallbackToOndemand() {
        return Codegen.optional(this.fallbackToOndemand);
    }
    /**
     * List of filters. The Instance types that match with all filters compose the Ocean&#39;s whitelist parameter. Cannot be configured together with whitelist/blacklist.
     * 
     */
    @Export(name="filters", refs={OceanFilters.class}, tree="[0]")
    private Output</* @Nullable */ OceanFilters> filters;

    /**
     * @return List of filters. The Instance types that match with all filters compose the Ocean&#39;s whitelist parameter. Cannot be configured together with whitelist/blacklist.
     * 
     */
    public Output<Optional<OceanFilters>> filters() {
        return Codegen.optional(this.filters);
    }
    /**
     * The amount of time, in seconds, after the instance has launched to start checking its health.
     * 
     */
    @Export(name="gracePeriod", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> gracePeriod;

    /**
     * @return The amount of time, in seconds, after the instance has launched to start checking its health.
     * 
     */
    public Output<Optional<Integer>> gracePeriod() {
        return Codegen.optional(this.gracePeriod);
    }
    /**
     * The instance profile iam role.
     * 
     */
    @Export(name="iamInstanceProfile", refs={String.class}, tree="[0]")
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
    @Export(name="imageId", refs={String.class}, tree="[0]")
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
    @Export(name="instanceMetadataOptions", refs={OceanInstanceMetadataOptions.class}, tree="[0]")
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
    @Export(name="keyName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> keyName;

    /**
     * @return The key pair to attach the instances.
     * 
     */
    public Output<Optional<String>> keyName() {
        return Codegen.optional(this.keyName);
    }
    /**
     * Array of load balancer objects to add to ocean cluster
     * 
     */
    @Export(name="loadBalancers", refs={List.class,OceanLoadBalancer.class}, tree="[0,1]")
    private Output</* @Nullable */ List<OceanLoadBalancer>> loadBalancers;

    /**
     * @return Array of load balancer objects to add to ocean cluster
     * 
     */
    public Output<Optional<List<OceanLoadBalancer>>> loadBalancers() {
        return Codegen.optional(this.loadBalancers);
    }
    /**
     * Logging configuration.
     * 
     */
    @Export(name="logging", refs={OceanLogging.class}, tree="[0]")
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
    @Export(name="maxSize", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> maxSize;

    /**
     * @return The upper limit of instances the cluster can scale up to.
     * 
     */
    public Output<Optional<Integer>> maxSize() {
        return Codegen.optional(this.maxSize);
    }
    /**
     * The lower limit of instances the cluster can scale down to.
     * 
     */
    @Export(name="minSize", refs={Integer.class}, tree="[0]")
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
    @Export(name="monitoring", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> monitoring;

    /**
     * @return Enable detailed monitoring for cluster. Flag will enable Cloud Watch detailed monitoring (one minute increments). Note: there are additional hourly costs for this service based on the region used.
     * 
     */
    public Output<Optional<Boolean>> monitoring() {
        return Codegen.optional(this.monitoring);
    }
    /**
     * Required if type is set to `CLASSIC`
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Required if type is set to `CLASSIC`
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The region the cluster will run in.
     * 
     */
    @Export(name="region", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> region;

    /**
     * @return The region the cluster will run in.
     * 
     */
    public Output<Optional<String>> region() {
        return Codegen.optional(this.region);
    }
    /**
     * Specify which resources should be tagged with Virtual Node Group tags or Ocean tags. If tags are set on the VNG, the resources will be tagged with the VNG tags; otherwise, they will be tagged with the Ocean tags.
     * 
     */
    @Export(name="resourceTagSpecifications", refs={List.class,OceanResourceTagSpecification.class}, tree="[0,1]")
    private Output</* @Nullable */ List<OceanResourceTagSpecification>> resourceTagSpecifications;

    /**
     * @return Specify which resources should be tagged with Virtual Node Group tags or Ocean tags. If tags are set on the VNG, the resources will be tagged with the VNG tags; otherwise, they will be tagged with the Ocean tags.
     * 
     */
    public Output<Optional<List<OceanResourceTagSpecification>>> resourceTagSpecifications() {
        return Codegen.optional(this.resourceTagSpecifications);
    }
    /**
     * The size (in Gb) to allocate for the root volume. Minimum `20`.
     * 
     */
    @Export(name="rootVolumeSize", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> rootVolumeSize;

    /**
     * @return The size (in Gb) to allocate for the root volume. Minimum `20`.
     * 
     */
    public Output<Optional<Integer>> rootVolumeSize() {
        return Codegen.optional(this.rootVolumeSize);
    }
    @Export(name="scheduledTasks", refs={List.class,OceanScheduledTask.class}, tree="[0,1]")
    private Output</* @Nullable */ List<OceanScheduledTask>> scheduledTasks;

    public Output<Optional<List<OceanScheduledTask>>> scheduledTasks() {
        return Codegen.optional(this.scheduledTasks);
    }
    /**
     * One or more security group ids.
     * 
     */
    @Export(name="securityGroups", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> securityGroups;

    /**
     * @return One or more security group ids.
     * 
     */
    public Output<List<String>> securityGroups() {
        return this.securityGroups;
    }
    /**
     * The desired percentage of Spot instances out of all running instances. Only available when the field is not set in any VNG directly (launchSpec.strategy.spotPercentage).
     * 
     */
    @Export(name="spotPercentage", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> spotPercentage;

    /**
     * @return The desired percentage of Spot instances out of all running instances. Only available when the field is not set in any VNG directly (launchSpec.strategy.spotPercentage).
     * 
     */
    public Output<Optional<Integer>> spotPercentage() {
        return Codegen.optional(this.spotPercentage);
    }
    /**
     * Ocean will spread the nodes across markets by this value. Possible values: `vcpu` or `count`.
     * 
     */
    @Export(name="spreadNodesBy", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> spreadNodesBy;

    /**
     * @return Ocean will spread the nodes across markets by this value. Possible values: `vcpu` or `count`.
     * 
     */
    public Output<Optional<String>> spreadNodesBy() {
        return Codegen.optional(this.spreadNodesBy);
    }
    /**
     * A comma-separated list of subnet identifiers for the Ocean cluster. Subnet IDs should be configured with auto assign public IP.
     * 
     */
    @Export(name="subnetIds", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> subnetIds;

    /**
     * @return A comma-separated list of subnet identifiers for the Ocean cluster. Subnet IDs should be configured with auto assign public IP.
     * 
     */
    public Output<List<String>> subnetIds() {
        return this.subnetIds;
    }
    /**
     * Optionally adds tags to instances launched in an Ocean cluster.
     * 
     */
    @Export(name="tags", refs={List.class,OceanTag.class}, tree="[0,1]")
    private Output</* @Nullable */ List<OceanTag>> tags;

    /**
     * @return Optionally adds tags to instances launched in an Ocean cluster.
     * 
     */
    public Output<Optional<List<OceanTag>>> tags() {
        return Codegen.optional(this.tags);
    }
    @Export(name="updatePolicy", refs={OceanUpdatePolicy.class}, tree="[0]")
    private Output</* @Nullable */ OceanUpdatePolicy> updatePolicy;

    public Output<Optional<OceanUpdatePolicy>> updatePolicy() {
        return Codegen.optional(this.updatePolicy);
    }
    /**
     * launch specification defined on the Ocean object will function only as a template for virtual node groups.
     * When set to true, on Ocean resource creation please make sure your custom VNG has an initial_nodes parameter to create nodes for your VNG.
     * 
     */
    @Export(name="useAsTemplateOnly", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> useAsTemplateOnly;

    /**
     * @return launch specification defined on the Ocean object will function only as a template for virtual node groups.
     * When set to true, on Ocean resource creation please make sure your custom VNG has an initial_nodes parameter to create nodes for your VNG.
     * 
     */
    public Output<Optional<Boolean>> useAsTemplateOnly() {
        return Codegen.optional(this.useAsTemplateOnly);
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
     * If savings plans exist, Ocean will utilize them before launching Spot instances.
     * 
     */
    @Export(name="utilizeCommitments", refs={Boolean.class}, tree="[0]")
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
    @Export(name="utilizeReservedInstances", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> utilizeReservedInstances;

    /**
     * @return If Reserved instances exist, Ocean will utilize them before launching Spot instances.
     * 
     */
    public Output<Optional<Boolean>> utilizeReservedInstances() {
        return Codegen.optional(this.utilizeReservedInstances);
    }
    /**
     * Instance types allowed in the Ocean cluster. Cannot be configured if `blacklist` is configured.
     * 
     */
    @Export(name="whitelists", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> whitelists;

    /**
     * @return Instance types allowed in the Ocean cluster. Cannot be configured if `blacklist` is configured.
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
        super("spotinst:aws/ocean:Ocean", name, args == null ? OceanArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Ocean(String name, Output<String> id, @Nullable OceanState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("spotinst:aws/ocean:Ocean", name, state, makeResourceOptions(options, id));
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
