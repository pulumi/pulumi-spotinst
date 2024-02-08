// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * ## Auto Scaler
 *
 * * `autoscaler` - (Optional) Describes the Ocean Kubernetes Auto Scaler.
 *     * `autoscaleIsEnabled` - (Optional, Default: `true`) Enable the Ocean Kubernetes Auto Scaler.
 *     * `autoscaleIsAutoConfig` - (Optional, Default: `true`) Automatically configure and optimize headroom resources.
 *     * `autoscaleCooldown` - (Optional, Default: `null`) Cooldown period between scaling actions.
 *     * `autoHeadroomPercentage` - (Optional) Set the auto headroom percentage (a number in the range [0, 200]) which controls the percentage of headroom from the cluster. Relevant only when `autoscaleIsAutoConfig` toggled on.
 *     * `enableAutomaticAndManualHeadroom` - (Optional, Default: `false`) enables automatic and manual headroom to work in parallel. When set to false, automatic headroom overrides all other headroom definitions manually configured, whether they are at cluster or VNG level.
 *     * `autoscaleHeadroom` - (Optional) Spare resource capacity management enabling fast assignment of Pods without waiting for new resources to launch.
 *         * `cpuPerUnit` - (Optional) Optionally configure the number of CPUs to allocate the headroom. CPUs are denoted in millicores, where 1000 millicores = 1 vCPU.
 *         * `gpuPerUnit` - (Optional) Optionally configure the number of GPUs to allocate the headroom.
 *         * `memoryPerUnit` - (Optional) Optionally configure the amount of memory (MB) to allocate the headroom.
 *         * `numOfUnits` - (Optional) The number of units to retain as headroom, where each unit has the defined headroom CPU and memory.
 *     * `autoscaleDown` - (Optional) Auto Scaling scale down operations.
 *         * `maxScaleDownPercentage` - (Optional) Would represent the maximum % to scale-down. Number between 1-100.
 *     * `resourceLimits` - (Optional) Optionally set upper and lower bounds on the resource usage of the cluster.
 *         * `maxVcpu` - (Optional) The maximum cpu in vCPU units that can be allocated to the cluster.
 *         * `maxMemoryGib` - (Optional) The maximum memory in GiB units that can be allocated to the cluster.
 *     * `extendedResourceDefinitions` - (Optional) List of Ocean extended resource definitions to use in this cluster.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * ```
 *
 * ### Update Policy
 *
 * * `updatePolicy` - (Optional)
 *     * `shouldRoll` - (Required) Enables the roll.
 *     * `conditionedRoll` - (Optional, Default: false) Spot will perform a cluster Roll in accordance with a relevant modification of the cluster’s settings. When set to true , only specific changes in the cluster’s configuration will trigger a cluster roll (such as AMI, Key Pair, user data, instance types, load balancers, etc).
 *     * `conditionedRollParams` - (Optional) A custom list of attributes will trigger the cluster roll operation (overrides the predefined list of parameters). Valid only when the `conditionedRoll` parameter is set to true. (Valid values: `"subnetIds"`,`"whitelist"`,`"blacklist"`,`"userData"`,`"imageId"`,`"securityGroups"`,`"keyName"`,`"iamInstanceProfile"`,`"associatePublicIpAddress"`,`"loadBalancers"`,`"instanceMetadataOptions"`,`"ebsOptimized"`,`"rootVolumeSize"`)
 *     * `autoApplyTags` - (Optional, Default: false) will update instance tags on the fly without rolling the cluster.
 *     * `rollConfig` - (Required) While used, you can control whether the group should perform a deployment after an update to the configuration.
 *         * `batchSizePercentage` - (Required) Sets the percentage of the instances to deploy in each batch.
 *         * `launchSpecIds` - (Optional) List of virtual node group identifiers to be rolled.
 *         * `batchMinHealthyPercentage` - (Optional) Default: 50. Indicates the threshold of minimum healthy instances in single batch. If the amount of healthy instances in single batch is under the threshold, the cluster roll will fail. If exists, the parameter value will be in range of 1-100. In case of null as value, the default value in the backend will be 50%. Value of param should represent the number in percentage (%) of the batch.
 *         * `respectPdb` - (Optional, Default: false) During the roll, if the parameter is set to True we honor PDB during the instance replacement.
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * ```
 *
 * <a id="scheduled-task"></a>
 * ## Scheduled Task
 *
 * * `scheduledTask` - (Optional) Set scheduling object.
 *     * `shutdownHours` - (Optional) Set shutdown hours for cluster object.
 *         * `isEnabled` - (Optional) Toggle the shutdown hours task. (Example: `true`).
 *         * `timeWindows` - (Required) Set time windows for shutdown hours. Specify a list of `timeWindows` with at least one time window Each string is in the format of: `ddd:hh:mm-ddd:hh:mm` where `ddd` = day of week = Sun | Mon | Tue | Wed | Thu | Fri | Sat, `hh` = hour 24 = 0 -23, `mm` = minute = 0 - 59. Time windows should not overlap. Required if `cluster.scheduling.isEnabled` is `true`. (Example: `Fri:15:30-Wed:14:30`).
 *     * `tasks` - (Optional) The scheduling tasks for the cluster.
 *         * `isEnabled` - (Required)  Describes whether the task is enabled. When true the task should run when false it should not run. Required for `cluster.scheduling.tasks` object.
 *         * `cronExpression` - (Required) A valid cron expression. The cron is running in UTC time zone and is in Unix cron format Cron Expression Validator Script. Only one of `frequency` or `cronExpression` should be used at a time. Required for `cluster.scheduling.tasks` object. (Example: `0 1 * * *`).
 *         * `taskType` - (Required) Valid values: `clusterRoll` `amiAutoUpdate`. Required for `cluster.scheduling.tasks`
 *         * `parameters` - (Optional) This filed will be compatible to the `taskType` field. If `taskType` is defined as `clusterRoll`, user cluster roll object in parameters.
 *             * `amiAutoUpdate` - (Optional) Set amiAutoUpdate object
 *                 * `applyRoll` - (Optional, Default:false) When the AMI is updated according to the configuration set, a cluster roll can be triggered
 *                 * `amiAutoUpdateClusterRoll` - (Optional) Set clusterRoll object
 *                     * `batchMinHealthyPercentage` - (Optional, Default:50) Indicates the threshold of minimum healthy instances in single batch. If the amount of healthy instances in single batch is under the threshold, the cluster roll will fail. If exists, the parameter value will be in range of 1-100. In case of null as value, the default value in the backend will be 50%. Value of param should represent the number in percentage (%) of the batch.
 *                     * `batchSizePercentage` - (Optional) Value as a percent to set the size of a batch in a roll. Valid values are 0-100.
 *                     * `comment` - (Optional) Add a `comment` description for the roll. The `comment` is limited to 256 chars
 *                     * `respectPdb` - (Optional, Default:false) During the roll, if the parameter is set to true we honor PDB during the instance replacement.
 *                 * `minorVersion` - (Optional, Default:false) When set to 'true', the auto-update process will update the VNGs’ AMI with the AMI to match the Kubernetes control plane version. either "patch" or "minorVersion" must be true.
 *                 * `patch` - (Optional, Default:false) When set to 'true', the auto-update process will update the VNGs’ images with the latest security patches. either "patch" or "minorVersion" must be true.
 *             * `parametersClusterRoll` - (Optional) Set clusterRoll object
 *                 * `batchMinHealthyPercentage` - (Optional, Default:50) Indicates the threshold of minimum healthy instances in single batch. If the amount of healthy instances in single batch is under the threshold, the cluster roll will fail. If exists, the parameter value will be in range of 1-100. In case of null as value, the default value in the backend will be 50%. Value of param should represent the number in percentage (%) of the batch.
 *                 * `batchSizePercentage` - (Optional) Value as a percent to set the size of a batch in a roll. Valid values are 0-100.
 *                 * `comment` - (Optional) Add a `comment` description for the roll. The `comment` is limited to 256 chars
 *                 * `respectPdb` - (Optional, Default:false) During the roll, if the parameter is set to true we honor PDB during the instance replacement.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * ```
 *
 * <a id="attributes-reference"></a>
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
 */
export class Ocean extends pulumi.CustomResource {
    /**
     * Get an existing Ocean resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: OceanState, opts?: pulumi.CustomResourceOptions): Ocean {
        return new Ocean(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'spotinst:aws/ocean:Ocean';

    /**
     * Returns true if the given object is an instance of Ocean.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Ocean {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Ocean.__pulumiType;
    }

    /**
     * Configure IPv6 address allocation.
     */
    public readonly associateIpv6Address!: pulumi.Output<boolean | undefined>;
    /**
     * Configure public IP address allocation.
     */
    public readonly associatePublicIpAddress!: pulumi.Output<boolean | undefined>;
    public readonly autoscaler!: pulumi.Output<outputs.aws.OceanAutoscaler | undefined>;
    /**
     * Instance types not allowed in the Ocean cluster. Cannot be configured if `whitelist` is configured.
     */
    public readonly blacklists!: pulumi.Output<string[] | undefined>;
    /**
     * Object. Array list of block devices that are exposed to the instance, specify either virtual devices and EBS volumes.
     */
    public readonly blockDeviceMappings!: pulumi.Output<outputs.aws.OceanBlockDeviceMapping[] | undefined>;
    public readonly clusterOrientations!: pulumi.Output<outputs.aws.OceanClusterOrientation[] | undefined>;
    /**
     * A unique identifier used for connecting the Ocean SaaS platform and the Kubernetes cluster. Typically, the cluster name is used as its identifier.
     */
    public readonly controllerId!: pulumi.Output<string | undefined>;
    /**
     * The number of instances to launch and maintain in the cluster.
     */
    public readonly desiredCapacity!: pulumi.Output<number>;
    /**
     * The time in seconds, the instance is allowed to run while detached from the ELB. This is to allow the instance time to be drained from incoming TCP connections before terminating it, during a scale down operation.
     */
    public readonly drainingTimeout!: pulumi.Output<number | undefined>;
    /**
     * Enable EBS optimized for cluster. Flag will enable optimized capacity for high bandwidth connectivity to the EB service for non EBS optimized instance types. For instances that are EBS optimized this flag will be ignored.
     */
    public readonly ebsOptimized!: pulumi.Output<boolean | undefined>;
    /**
     * If not Spot instance markets are available, enable Ocean to launch On-Demand instances instead.
     */
    public readonly fallbackToOndemand!: pulumi.Output<boolean | undefined>;
    /**
     * List of filters. The Instance types that match with all filters compose the Ocean's whitelist parameter. Cannot be configured together with whitelist/blacklist.
     */
    public readonly filters!: pulumi.Output<outputs.aws.OceanFilters | undefined>;
    /**
     * The amount of time, in seconds, after the instance has launched to start checking its health.
     */
    public readonly gracePeriod!: pulumi.Output<number | undefined>;
    /**
     * The instance profile iam role.
     */
    public readonly iamInstanceProfile!: pulumi.Output<string | undefined>;
    /**
     * ID of the image used to launch the instances.
     */
    public readonly imageId!: pulumi.Output<string | undefined>;
    /**
     * Ocean instance metadata options object for IMDSv2.
     */
    public readonly instanceMetadataOptions!: pulumi.Output<outputs.aws.OceanInstanceMetadataOptions | undefined>;
    /**
     * The key pair to attach the instances.
     */
    public readonly keyName!: pulumi.Output<string | undefined>;
    /**
     * Array of load balancer objects to add to ocean cluster
     */
    public readonly loadBalancers!: pulumi.Output<outputs.aws.OceanLoadBalancer[] | undefined>;
    /**
     * Logging configuration.
     */
    public readonly logging!: pulumi.Output<outputs.aws.OceanLogging | undefined>;
    /**
     * The upper limit of instances the cluster can scale up to.
     */
    public readonly maxSize!: pulumi.Output<number | undefined>;
    /**
     * The lower limit of instances the cluster can scale down to.
     */
    public readonly minSize!: pulumi.Output<number>;
    /**
     * Enable detailed monitoring for cluster. Flag will enable Cloud Watch detailed monitoring (one minute increments). Note: there are additional hourly costs for this service based on the region used.
     */
    public readonly monitoring!: pulumi.Output<boolean | undefined>;
    /**
     * Required if type is set to `CLASSIC`
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The region the cluster will run in.
     */
    public readonly region!: pulumi.Output<string | undefined>;
    /**
     * Specify which resources should be tagged with Virtual Node Group tags or Ocean tags. If tags are set on the VNG, the resources will be tagged with the VNG tags; otherwise, they will be tagged with the Ocean tags.
     */
    public readonly resourceTagSpecifications!: pulumi.Output<outputs.aws.OceanResourceTagSpecification[] | undefined>;
    /**
     * The size (in Gb) to allocate for the root volume. Minimum `20`.
     */
    public readonly rootVolumeSize!: pulumi.Output<number | undefined>;
    public readonly scheduledTasks!: pulumi.Output<outputs.aws.OceanScheduledTask[] | undefined>;
    /**
     * One or more security group ids.
     */
    public readonly securityGroups!: pulumi.Output<string[]>;
    /**
     * The desired percentage of Spot instances out of all running instances. Only available when the field is not set in any VNG directly (launchSpec.strategy.spotPercentage).
     */
    public readonly spotPercentage!: pulumi.Output<number | undefined>;
    /**
     * Ocean will spread the nodes across markets by this value. Possible values: `vcpu` or `count`.
     */
    public readonly spreadNodesBy!: pulumi.Output<string | undefined>;
    /**
     * A comma-separated list of subnet identifiers for the Ocean cluster. Subnet IDs should be configured with auto assign public IP.
     */
    public readonly subnetIds!: pulumi.Output<string[]>;
    /**
     * Optionally adds tags to instances launched in an Ocean cluster.
     */
    public readonly tags!: pulumi.Output<outputs.aws.OceanTag[] | undefined>;
    public readonly updatePolicy!: pulumi.Output<outputs.aws.OceanUpdatePolicy | undefined>;
    /**
     * launch specification defined on the Ocean object will function only as a template for virtual node groups.
     * When set to true, on Ocean resource creation please make sure your custom VNG has an initialNodes parameter to create nodes for your VNG.
     */
    public readonly useAsTemplateOnly!: pulumi.Output<boolean | undefined>;
    /**
     * Base64-encoded MIME user data to make available to the instances.
     */
    public readonly userData!: pulumi.Output<string | undefined>;
    /**
     * If savings plans exist, Ocean will utilize them before launching Spot instances.
     */
    public readonly utilizeCommitments!: pulumi.Output<boolean | undefined>;
    /**
     * If Reserved instances exist, Ocean will utilize them before launching Spot instances.
     */
    public readonly utilizeReservedInstances!: pulumi.Output<boolean | undefined>;
    /**
     * Instance types allowed in the Ocean cluster. Cannot be configured if `blacklist` is configured.
     */
    public readonly whitelists!: pulumi.Output<string[] | undefined>;

    /**
     * Create a Ocean resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: OceanArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: OceanArgs | OceanState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as OceanState | undefined;
            resourceInputs["associateIpv6Address"] = state ? state.associateIpv6Address : undefined;
            resourceInputs["associatePublicIpAddress"] = state ? state.associatePublicIpAddress : undefined;
            resourceInputs["autoscaler"] = state ? state.autoscaler : undefined;
            resourceInputs["blacklists"] = state ? state.blacklists : undefined;
            resourceInputs["blockDeviceMappings"] = state ? state.blockDeviceMappings : undefined;
            resourceInputs["clusterOrientations"] = state ? state.clusterOrientations : undefined;
            resourceInputs["controllerId"] = state ? state.controllerId : undefined;
            resourceInputs["desiredCapacity"] = state ? state.desiredCapacity : undefined;
            resourceInputs["drainingTimeout"] = state ? state.drainingTimeout : undefined;
            resourceInputs["ebsOptimized"] = state ? state.ebsOptimized : undefined;
            resourceInputs["fallbackToOndemand"] = state ? state.fallbackToOndemand : undefined;
            resourceInputs["filters"] = state ? state.filters : undefined;
            resourceInputs["gracePeriod"] = state ? state.gracePeriod : undefined;
            resourceInputs["iamInstanceProfile"] = state ? state.iamInstanceProfile : undefined;
            resourceInputs["imageId"] = state ? state.imageId : undefined;
            resourceInputs["instanceMetadataOptions"] = state ? state.instanceMetadataOptions : undefined;
            resourceInputs["keyName"] = state ? state.keyName : undefined;
            resourceInputs["loadBalancers"] = state ? state.loadBalancers : undefined;
            resourceInputs["logging"] = state ? state.logging : undefined;
            resourceInputs["maxSize"] = state ? state.maxSize : undefined;
            resourceInputs["minSize"] = state ? state.minSize : undefined;
            resourceInputs["monitoring"] = state ? state.monitoring : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["region"] = state ? state.region : undefined;
            resourceInputs["resourceTagSpecifications"] = state ? state.resourceTagSpecifications : undefined;
            resourceInputs["rootVolumeSize"] = state ? state.rootVolumeSize : undefined;
            resourceInputs["scheduledTasks"] = state ? state.scheduledTasks : undefined;
            resourceInputs["securityGroups"] = state ? state.securityGroups : undefined;
            resourceInputs["spotPercentage"] = state ? state.spotPercentage : undefined;
            resourceInputs["spreadNodesBy"] = state ? state.spreadNodesBy : undefined;
            resourceInputs["subnetIds"] = state ? state.subnetIds : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["updatePolicy"] = state ? state.updatePolicy : undefined;
            resourceInputs["useAsTemplateOnly"] = state ? state.useAsTemplateOnly : undefined;
            resourceInputs["userData"] = state ? state.userData : undefined;
            resourceInputs["utilizeCommitments"] = state ? state.utilizeCommitments : undefined;
            resourceInputs["utilizeReservedInstances"] = state ? state.utilizeReservedInstances : undefined;
            resourceInputs["whitelists"] = state ? state.whitelists : undefined;
        } else {
            const args = argsOrState as OceanArgs | undefined;
            if ((!args || args.securityGroups === undefined) && !opts.urn) {
                throw new Error("Missing required property 'securityGroups'");
            }
            if ((!args || args.subnetIds === undefined) && !opts.urn) {
                throw new Error("Missing required property 'subnetIds'");
            }
            resourceInputs["associateIpv6Address"] = args ? args.associateIpv6Address : undefined;
            resourceInputs["associatePublicIpAddress"] = args ? args.associatePublicIpAddress : undefined;
            resourceInputs["autoscaler"] = args ? args.autoscaler : undefined;
            resourceInputs["blacklists"] = args ? args.blacklists : undefined;
            resourceInputs["blockDeviceMappings"] = args ? args.blockDeviceMappings : undefined;
            resourceInputs["clusterOrientations"] = args ? args.clusterOrientations : undefined;
            resourceInputs["controllerId"] = args ? args.controllerId : undefined;
            resourceInputs["desiredCapacity"] = args ? args.desiredCapacity : undefined;
            resourceInputs["drainingTimeout"] = args ? args.drainingTimeout : undefined;
            resourceInputs["ebsOptimized"] = args ? args.ebsOptimized : undefined;
            resourceInputs["fallbackToOndemand"] = args ? args.fallbackToOndemand : undefined;
            resourceInputs["filters"] = args ? args.filters : undefined;
            resourceInputs["gracePeriod"] = args ? args.gracePeriod : undefined;
            resourceInputs["iamInstanceProfile"] = args ? args.iamInstanceProfile : undefined;
            resourceInputs["imageId"] = args ? args.imageId : undefined;
            resourceInputs["instanceMetadataOptions"] = args ? args.instanceMetadataOptions : undefined;
            resourceInputs["keyName"] = args ? args.keyName : undefined;
            resourceInputs["loadBalancers"] = args ? args.loadBalancers : undefined;
            resourceInputs["logging"] = args ? args.logging : undefined;
            resourceInputs["maxSize"] = args ? args.maxSize : undefined;
            resourceInputs["minSize"] = args ? args.minSize : undefined;
            resourceInputs["monitoring"] = args ? args.monitoring : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["region"] = args ? args.region : undefined;
            resourceInputs["resourceTagSpecifications"] = args ? args.resourceTagSpecifications : undefined;
            resourceInputs["rootVolumeSize"] = args ? args.rootVolumeSize : undefined;
            resourceInputs["scheduledTasks"] = args ? args.scheduledTasks : undefined;
            resourceInputs["securityGroups"] = args ? args.securityGroups : undefined;
            resourceInputs["spotPercentage"] = args ? args.spotPercentage : undefined;
            resourceInputs["spreadNodesBy"] = args ? args.spreadNodesBy : undefined;
            resourceInputs["subnetIds"] = args ? args.subnetIds : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["updatePolicy"] = args ? args.updatePolicy : undefined;
            resourceInputs["useAsTemplateOnly"] = args ? args.useAsTemplateOnly : undefined;
            resourceInputs["userData"] = args ? args.userData : undefined;
            resourceInputs["utilizeCommitments"] = args ? args.utilizeCommitments : undefined;
            resourceInputs["utilizeReservedInstances"] = args ? args.utilizeReservedInstances : undefined;
            resourceInputs["whitelists"] = args ? args.whitelists : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Ocean.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Ocean resources.
 */
export interface OceanState {
    /**
     * Configure IPv6 address allocation.
     */
    associateIpv6Address?: pulumi.Input<boolean>;
    /**
     * Configure public IP address allocation.
     */
    associatePublicIpAddress?: pulumi.Input<boolean>;
    autoscaler?: pulumi.Input<inputs.aws.OceanAutoscaler>;
    /**
     * Instance types not allowed in the Ocean cluster. Cannot be configured if `whitelist` is configured.
     */
    blacklists?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Object. Array list of block devices that are exposed to the instance, specify either virtual devices and EBS volumes.
     */
    blockDeviceMappings?: pulumi.Input<pulumi.Input<inputs.aws.OceanBlockDeviceMapping>[]>;
    clusterOrientations?: pulumi.Input<pulumi.Input<inputs.aws.OceanClusterOrientation>[]>;
    /**
     * A unique identifier used for connecting the Ocean SaaS platform and the Kubernetes cluster. Typically, the cluster name is used as its identifier.
     */
    controllerId?: pulumi.Input<string>;
    /**
     * The number of instances to launch and maintain in the cluster.
     */
    desiredCapacity?: pulumi.Input<number>;
    /**
     * The time in seconds, the instance is allowed to run while detached from the ELB. This is to allow the instance time to be drained from incoming TCP connections before terminating it, during a scale down operation.
     */
    drainingTimeout?: pulumi.Input<number>;
    /**
     * Enable EBS optimized for cluster. Flag will enable optimized capacity for high bandwidth connectivity to the EB service for non EBS optimized instance types. For instances that are EBS optimized this flag will be ignored.
     */
    ebsOptimized?: pulumi.Input<boolean>;
    /**
     * If not Spot instance markets are available, enable Ocean to launch On-Demand instances instead.
     */
    fallbackToOndemand?: pulumi.Input<boolean>;
    /**
     * List of filters. The Instance types that match with all filters compose the Ocean's whitelist parameter. Cannot be configured together with whitelist/blacklist.
     */
    filters?: pulumi.Input<inputs.aws.OceanFilters>;
    /**
     * The amount of time, in seconds, after the instance has launched to start checking its health.
     */
    gracePeriod?: pulumi.Input<number>;
    /**
     * The instance profile iam role.
     */
    iamInstanceProfile?: pulumi.Input<string>;
    /**
     * ID of the image used to launch the instances.
     */
    imageId?: pulumi.Input<string>;
    /**
     * Ocean instance metadata options object for IMDSv2.
     */
    instanceMetadataOptions?: pulumi.Input<inputs.aws.OceanInstanceMetadataOptions>;
    /**
     * The key pair to attach the instances.
     */
    keyName?: pulumi.Input<string>;
    /**
     * Array of load balancer objects to add to ocean cluster
     */
    loadBalancers?: pulumi.Input<pulumi.Input<inputs.aws.OceanLoadBalancer>[]>;
    /**
     * Logging configuration.
     */
    logging?: pulumi.Input<inputs.aws.OceanLogging>;
    /**
     * The upper limit of instances the cluster can scale up to.
     */
    maxSize?: pulumi.Input<number>;
    /**
     * The lower limit of instances the cluster can scale down to.
     */
    minSize?: pulumi.Input<number>;
    /**
     * Enable detailed monitoring for cluster. Flag will enable Cloud Watch detailed monitoring (one minute increments). Note: there are additional hourly costs for this service based on the region used.
     */
    monitoring?: pulumi.Input<boolean>;
    /**
     * Required if type is set to `CLASSIC`
     */
    name?: pulumi.Input<string>;
    /**
     * The region the cluster will run in.
     */
    region?: pulumi.Input<string>;
    /**
     * Specify which resources should be tagged with Virtual Node Group tags or Ocean tags. If tags are set on the VNG, the resources will be tagged with the VNG tags; otherwise, they will be tagged with the Ocean tags.
     */
    resourceTagSpecifications?: pulumi.Input<pulumi.Input<inputs.aws.OceanResourceTagSpecification>[]>;
    /**
     * The size (in Gb) to allocate for the root volume. Minimum `20`.
     */
    rootVolumeSize?: pulumi.Input<number>;
    scheduledTasks?: pulumi.Input<pulumi.Input<inputs.aws.OceanScheduledTask>[]>;
    /**
     * One or more security group ids.
     */
    securityGroups?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The desired percentage of Spot instances out of all running instances. Only available when the field is not set in any VNG directly (launchSpec.strategy.spotPercentage).
     */
    spotPercentage?: pulumi.Input<number>;
    /**
     * Ocean will spread the nodes across markets by this value. Possible values: `vcpu` or `count`.
     */
    spreadNodesBy?: pulumi.Input<string>;
    /**
     * A comma-separated list of subnet identifiers for the Ocean cluster. Subnet IDs should be configured with auto assign public IP.
     */
    subnetIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Optionally adds tags to instances launched in an Ocean cluster.
     */
    tags?: pulumi.Input<pulumi.Input<inputs.aws.OceanTag>[]>;
    updatePolicy?: pulumi.Input<inputs.aws.OceanUpdatePolicy>;
    /**
     * launch specification defined on the Ocean object will function only as a template for virtual node groups.
     * When set to true, on Ocean resource creation please make sure your custom VNG has an initialNodes parameter to create nodes for your VNG.
     */
    useAsTemplateOnly?: pulumi.Input<boolean>;
    /**
     * Base64-encoded MIME user data to make available to the instances.
     */
    userData?: pulumi.Input<string>;
    /**
     * If savings plans exist, Ocean will utilize them before launching Spot instances.
     */
    utilizeCommitments?: pulumi.Input<boolean>;
    /**
     * If Reserved instances exist, Ocean will utilize them before launching Spot instances.
     */
    utilizeReservedInstances?: pulumi.Input<boolean>;
    /**
     * Instance types allowed in the Ocean cluster. Cannot be configured if `blacklist` is configured.
     */
    whitelists?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a Ocean resource.
 */
export interface OceanArgs {
    /**
     * Configure IPv6 address allocation.
     */
    associateIpv6Address?: pulumi.Input<boolean>;
    /**
     * Configure public IP address allocation.
     */
    associatePublicIpAddress?: pulumi.Input<boolean>;
    autoscaler?: pulumi.Input<inputs.aws.OceanAutoscaler>;
    /**
     * Instance types not allowed in the Ocean cluster. Cannot be configured if `whitelist` is configured.
     */
    blacklists?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Object. Array list of block devices that are exposed to the instance, specify either virtual devices and EBS volumes.
     */
    blockDeviceMappings?: pulumi.Input<pulumi.Input<inputs.aws.OceanBlockDeviceMapping>[]>;
    clusterOrientations?: pulumi.Input<pulumi.Input<inputs.aws.OceanClusterOrientation>[]>;
    /**
     * A unique identifier used for connecting the Ocean SaaS platform and the Kubernetes cluster. Typically, the cluster name is used as its identifier.
     */
    controllerId?: pulumi.Input<string>;
    /**
     * The number of instances to launch and maintain in the cluster.
     */
    desiredCapacity?: pulumi.Input<number>;
    /**
     * The time in seconds, the instance is allowed to run while detached from the ELB. This is to allow the instance time to be drained from incoming TCP connections before terminating it, during a scale down operation.
     */
    drainingTimeout?: pulumi.Input<number>;
    /**
     * Enable EBS optimized for cluster. Flag will enable optimized capacity for high bandwidth connectivity to the EB service for non EBS optimized instance types. For instances that are EBS optimized this flag will be ignored.
     */
    ebsOptimized?: pulumi.Input<boolean>;
    /**
     * If not Spot instance markets are available, enable Ocean to launch On-Demand instances instead.
     */
    fallbackToOndemand?: pulumi.Input<boolean>;
    /**
     * List of filters. The Instance types that match with all filters compose the Ocean's whitelist parameter. Cannot be configured together with whitelist/blacklist.
     */
    filters?: pulumi.Input<inputs.aws.OceanFilters>;
    /**
     * The amount of time, in seconds, after the instance has launched to start checking its health.
     */
    gracePeriod?: pulumi.Input<number>;
    /**
     * The instance profile iam role.
     */
    iamInstanceProfile?: pulumi.Input<string>;
    /**
     * ID of the image used to launch the instances.
     */
    imageId?: pulumi.Input<string>;
    /**
     * Ocean instance metadata options object for IMDSv2.
     */
    instanceMetadataOptions?: pulumi.Input<inputs.aws.OceanInstanceMetadataOptions>;
    /**
     * The key pair to attach the instances.
     */
    keyName?: pulumi.Input<string>;
    /**
     * Array of load balancer objects to add to ocean cluster
     */
    loadBalancers?: pulumi.Input<pulumi.Input<inputs.aws.OceanLoadBalancer>[]>;
    /**
     * Logging configuration.
     */
    logging?: pulumi.Input<inputs.aws.OceanLogging>;
    /**
     * The upper limit of instances the cluster can scale up to.
     */
    maxSize?: pulumi.Input<number>;
    /**
     * The lower limit of instances the cluster can scale down to.
     */
    minSize?: pulumi.Input<number>;
    /**
     * Enable detailed monitoring for cluster. Flag will enable Cloud Watch detailed monitoring (one minute increments). Note: there are additional hourly costs for this service based on the region used.
     */
    monitoring?: pulumi.Input<boolean>;
    /**
     * Required if type is set to `CLASSIC`
     */
    name?: pulumi.Input<string>;
    /**
     * The region the cluster will run in.
     */
    region?: pulumi.Input<string>;
    /**
     * Specify which resources should be tagged with Virtual Node Group tags or Ocean tags. If tags are set on the VNG, the resources will be tagged with the VNG tags; otherwise, they will be tagged with the Ocean tags.
     */
    resourceTagSpecifications?: pulumi.Input<pulumi.Input<inputs.aws.OceanResourceTagSpecification>[]>;
    /**
     * The size (in Gb) to allocate for the root volume. Minimum `20`.
     */
    rootVolumeSize?: pulumi.Input<number>;
    scheduledTasks?: pulumi.Input<pulumi.Input<inputs.aws.OceanScheduledTask>[]>;
    /**
     * One or more security group ids.
     */
    securityGroups: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The desired percentage of Spot instances out of all running instances. Only available when the field is not set in any VNG directly (launchSpec.strategy.spotPercentage).
     */
    spotPercentage?: pulumi.Input<number>;
    /**
     * Ocean will spread the nodes across markets by this value. Possible values: `vcpu` or `count`.
     */
    spreadNodesBy?: pulumi.Input<string>;
    /**
     * A comma-separated list of subnet identifiers for the Ocean cluster. Subnet IDs should be configured with auto assign public IP.
     */
    subnetIds: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Optionally adds tags to instances launched in an Ocean cluster.
     */
    tags?: pulumi.Input<pulumi.Input<inputs.aws.OceanTag>[]>;
    updatePolicy?: pulumi.Input<inputs.aws.OceanUpdatePolicy>;
    /**
     * launch specification defined on the Ocean object will function only as a template for virtual node groups.
     * When set to true, on Ocean resource creation please make sure your custom VNG has an initialNodes parameter to create nodes for your VNG.
     */
    useAsTemplateOnly?: pulumi.Input<boolean>;
    /**
     * Base64-encoded MIME user data to make available to the instances.
     */
    userData?: pulumi.Input<string>;
    /**
     * If savings plans exist, Ocean will utilize them before launching Spot instances.
     */
    utilizeCommitments?: pulumi.Input<boolean>;
    /**
     * If Reserved instances exist, Ocean will utilize them before launching Spot instances.
     */
    utilizeReservedInstances?: pulumi.Input<boolean>;
    /**
     * Instance types allowed in the Ocean cluster. Cannot be configured if `blacklist` is configured.
     */
    whitelists?: pulumi.Input<pulumi.Input<string>[]>;
}
