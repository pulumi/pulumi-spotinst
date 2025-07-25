// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Manages a Spotinst Ocean ECS resource.
 *
 * ## Import
 *
 * Clusters can be imported using the Ocean `id`, e.g.,
 *
 * hcl
 *
 * ```sh
 * $ pulumi import spotinst:ecs/ocean:Ocean nameOfTheResource o-12345678
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
    public static readonly __pulumiType = 'spotinst:ecs/ocean:Ocean';

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
     * Configure public IP address allocation.
     */
    public readonly associatePublicIpAddress!: pulumi.Output<boolean | undefined>;
    /**
     * Describes the Ocean ECS autoscaler.
     */
    public readonly autoscaler!: pulumi.Output<outputs.ecs.OceanAutoscaler | undefined>;
    public readonly blacklists!: pulumi.Output<string[] | undefined>;
    /**
     * Object. List of block devices that are exposed to the instance, specify either virtual devices and EBS volumes.
     */
    public readonly blockDeviceMappings!: pulumi.Output<outputs.ecs.OceanBlockDeviceMapping[] | undefined>;
    /**
     * The name of the ECS cluster.
     */
    public readonly clusterName!: pulumi.Output<string>;
    public readonly clusterOrientations!: pulumi.Output<outputs.ecs.OceanClusterOrientation[] | undefined>;
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
     * If no Spot instance markets are available, enable Ocean to launch On-Demand instances instead.
     */
    public readonly fallbackToOndemand!: pulumi.Output<boolean | undefined>;
    public readonly filters!: pulumi.Output<outputs.ecs.OceanFilters | undefined>;
    /**
     * The instance profile iam role.
     */
    public readonly iamInstanceProfile!: pulumi.Output<string | undefined>;
    /**
     * ID of the image used to launch the instances.
     */
    public readonly imageId!: pulumi.Output<string>;
    /**
     * Ocean instance metadata options object for IMDSv2.
     */
    public readonly instanceMetadataOptions!: pulumi.Output<outputs.ecs.OceanInstanceMetadataOptions | undefined>;
    /**
     * The key pair to attach the instances.
     */
    public readonly keyPair!: pulumi.Output<string | undefined>;
    /**
     * Logging configuration.
     */
    public readonly logging!: pulumi.Output<outputs.ecs.OceanLogging | undefined>;
    /**
     * The upper limit of instances the cluster can scale up to.
     */
    public readonly maxSize!: pulumi.Output<number>;
    /**
     * The lower limit of instances the cluster can scale down to.
     */
    public readonly minSize!: pulumi.Output<number>;
    /**
     * Enable detailed monitoring for cluster. Flag will enable Cloud Watch detailed monitoring (one minute increments). Note: there are additional hourly costs for this service based on the region used.
     */
    public readonly monitoring!: pulumi.Output<boolean | undefined>;
    /**
     * The Ocean cluster name.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Object. Set auto image update settings.
     */
    public readonly optimizeImages!: pulumi.Output<outputs.ecs.OceanOptimizeImages | undefined>;
    /**
     * The region the cluster will run in.
     */
    public readonly region!: pulumi.Output<string>;
    /**
     * While used, you can control whether the group should perform a deployment after an update to the configuration.
     */
    public readonly scheduledTasks!: pulumi.Output<outputs.ecs.OceanScheduledTask[] | undefined>;
    /**
     * One or more security group ids.
     */
    public readonly securityGroupIds!: pulumi.Output<string[]>;
    /**
     * The percentage of Spot instances that would spin up from the `desiredCapacity` number.
     */
    public readonly spotPercentage!: pulumi.Output<number | undefined>;
    /**
     * A comma-separated list of subnet identifiers for the Ocean cluster. Subnet IDs should be configured with auto assign public ip.
     */
    public readonly subnetIds!: pulumi.Output<string[]>;
    /**
     * Optionally adds tags to instances launched in an Ocean cluster.
     */
    public readonly tags!: pulumi.Output<outputs.ecs.OceanTag[] | undefined>;
    /**
     * While used, you can control whether the group should perform a deployment after an update to the configuration.
     */
    public readonly updatePolicy!: pulumi.Output<outputs.ecs.OceanUpdatePolicy | undefined>;
    /**
     * launch specification defined on the Ocean object will function only as a template for virtual node groups.
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
            resourceInputs["associatePublicIpAddress"] = state ? state.associatePublicIpAddress : undefined;
            resourceInputs["autoscaler"] = state ? state.autoscaler : undefined;
            resourceInputs["blacklists"] = state ? state.blacklists : undefined;
            resourceInputs["blockDeviceMappings"] = state ? state.blockDeviceMappings : undefined;
            resourceInputs["clusterName"] = state ? state.clusterName : undefined;
            resourceInputs["clusterOrientations"] = state ? state.clusterOrientations : undefined;
            resourceInputs["desiredCapacity"] = state ? state.desiredCapacity : undefined;
            resourceInputs["drainingTimeout"] = state ? state.drainingTimeout : undefined;
            resourceInputs["ebsOptimized"] = state ? state.ebsOptimized : undefined;
            resourceInputs["fallbackToOndemand"] = state ? state.fallbackToOndemand : undefined;
            resourceInputs["filters"] = state ? state.filters : undefined;
            resourceInputs["iamInstanceProfile"] = state ? state.iamInstanceProfile : undefined;
            resourceInputs["imageId"] = state ? state.imageId : undefined;
            resourceInputs["instanceMetadataOptions"] = state ? state.instanceMetadataOptions : undefined;
            resourceInputs["keyPair"] = state ? state.keyPair : undefined;
            resourceInputs["logging"] = state ? state.logging : undefined;
            resourceInputs["maxSize"] = state ? state.maxSize : undefined;
            resourceInputs["minSize"] = state ? state.minSize : undefined;
            resourceInputs["monitoring"] = state ? state.monitoring : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["optimizeImages"] = state ? state.optimizeImages : undefined;
            resourceInputs["region"] = state ? state.region : undefined;
            resourceInputs["scheduledTasks"] = state ? state.scheduledTasks : undefined;
            resourceInputs["securityGroupIds"] = state ? state.securityGroupIds : undefined;
            resourceInputs["spotPercentage"] = state ? state.spotPercentage : undefined;
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
            if ((!args || args.clusterName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'clusterName'");
            }
            if ((!args || args.imageId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'imageId'");
            }
            if ((!args || args.region === undefined) && !opts.urn) {
                throw new Error("Missing required property 'region'");
            }
            if ((!args || args.securityGroupIds === undefined) && !opts.urn) {
                throw new Error("Missing required property 'securityGroupIds'");
            }
            if ((!args || args.subnetIds === undefined) && !opts.urn) {
                throw new Error("Missing required property 'subnetIds'");
            }
            resourceInputs["associatePublicIpAddress"] = args ? args.associatePublicIpAddress : undefined;
            resourceInputs["autoscaler"] = args ? args.autoscaler : undefined;
            resourceInputs["blacklists"] = args ? args.blacklists : undefined;
            resourceInputs["blockDeviceMappings"] = args ? args.blockDeviceMappings : undefined;
            resourceInputs["clusterName"] = args ? args.clusterName : undefined;
            resourceInputs["clusterOrientations"] = args ? args.clusterOrientations : undefined;
            resourceInputs["desiredCapacity"] = args ? args.desiredCapacity : undefined;
            resourceInputs["drainingTimeout"] = args ? args.drainingTimeout : undefined;
            resourceInputs["ebsOptimized"] = args ? args.ebsOptimized : undefined;
            resourceInputs["fallbackToOndemand"] = args ? args.fallbackToOndemand : undefined;
            resourceInputs["filters"] = args ? args.filters : undefined;
            resourceInputs["iamInstanceProfile"] = args ? args.iamInstanceProfile : undefined;
            resourceInputs["imageId"] = args ? args.imageId : undefined;
            resourceInputs["instanceMetadataOptions"] = args ? args.instanceMetadataOptions : undefined;
            resourceInputs["keyPair"] = args ? args.keyPair : undefined;
            resourceInputs["logging"] = args ? args.logging : undefined;
            resourceInputs["maxSize"] = args ? args.maxSize : undefined;
            resourceInputs["minSize"] = args ? args.minSize : undefined;
            resourceInputs["monitoring"] = args ? args.monitoring : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["optimizeImages"] = args ? args.optimizeImages : undefined;
            resourceInputs["region"] = args ? args.region : undefined;
            resourceInputs["scheduledTasks"] = args ? args.scheduledTasks : undefined;
            resourceInputs["securityGroupIds"] = args ? args.securityGroupIds : undefined;
            resourceInputs["spotPercentage"] = args ? args.spotPercentage : undefined;
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
     * Configure public IP address allocation.
     */
    associatePublicIpAddress?: pulumi.Input<boolean>;
    /**
     * Describes the Ocean ECS autoscaler.
     */
    autoscaler?: pulumi.Input<inputs.ecs.OceanAutoscaler>;
    blacklists?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Object. List of block devices that are exposed to the instance, specify either virtual devices and EBS volumes.
     */
    blockDeviceMappings?: pulumi.Input<pulumi.Input<inputs.ecs.OceanBlockDeviceMapping>[]>;
    /**
     * The name of the ECS cluster.
     */
    clusterName?: pulumi.Input<string>;
    clusterOrientations?: pulumi.Input<pulumi.Input<inputs.ecs.OceanClusterOrientation>[]>;
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
     * If no Spot instance markets are available, enable Ocean to launch On-Demand instances instead.
     */
    fallbackToOndemand?: pulumi.Input<boolean>;
    filters?: pulumi.Input<inputs.ecs.OceanFilters>;
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
    instanceMetadataOptions?: pulumi.Input<inputs.ecs.OceanInstanceMetadataOptions>;
    /**
     * The key pair to attach the instances.
     */
    keyPair?: pulumi.Input<string>;
    /**
     * Logging configuration.
     */
    logging?: pulumi.Input<inputs.ecs.OceanLogging>;
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
     * The Ocean cluster name.
     */
    name?: pulumi.Input<string>;
    /**
     * Object. Set auto image update settings.
     */
    optimizeImages?: pulumi.Input<inputs.ecs.OceanOptimizeImages>;
    /**
     * The region the cluster will run in.
     */
    region?: pulumi.Input<string>;
    /**
     * While used, you can control whether the group should perform a deployment after an update to the configuration.
     */
    scheduledTasks?: pulumi.Input<pulumi.Input<inputs.ecs.OceanScheduledTask>[]>;
    /**
     * One or more security group ids.
     */
    securityGroupIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The percentage of Spot instances that would spin up from the `desiredCapacity` number.
     */
    spotPercentage?: pulumi.Input<number>;
    /**
     * A comma-separated list of subnet identifiers for the Ocean cluster. Subnet IDs should be configured with auto assign public ip.
     */
    subnetIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Optionally adds tags to instances launched in an Ocean cluster.
     */
    tags?: pulumi.Input<pulumi.Input<inputs.ecs.OceanTag>[]>;
    /**
     * While used, you can control whether the group should perform a deployment after an update to the configuration.
     */
    updatePolicy?: pulumi.Input<inputs.ecs.OceanUpdatePolicy>;
    /**
     * launch specification defined on the Ocean object will function only as a template for virtual node groups.
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
    whitelists?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a Ocean resource.
 */
export interface OceanArgs {
    /**
     * Configure public IP address allocation.
     */
    associatePublicIpAddress?: pulumi.Input<boolean>;
    /**
     * Describes the Ocean ECS autoscaler.
     */
    autoscaler?: pulumi.Input<inputs.ecs.OceanAutoscaler>;
    blacklists?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Object. List of block devices that are exposed to the instance, specify either virtual devices and EBS volumes.
     */
    blockDeviceMappings?: pulumi.Input<pulumi.Input<inputs.ecs.OceanBlockDeviceMapping>[]>;
    /**
     * The name of the ECS cluster.
     */
    clusterName: pulumi.Input<string>;
    clusterOrientations?: pulumi.Input<pulumi.Input<inputs.ecs.OceanClusterOrientation>[]>;
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
     * If no Spot instance markets are available, enable Ocean to launch On-Demand instances instead.
     */
    fallbackToOndemand?: pulumi.Input<boolean>;
    filters?: pulumi.Input<inputs.ecs.OceanFilters>;
    /**
     * The instance profile iam role.
     */
    iamInstanceProfile?: pulumi.Input<string>;
    /**
     * ID of the image used to launch the instances.
     */
    imageId: pulumi.Input<string>;
    /**
     * Ocean instance metadata options object for IMDSv2.
     */
    instanceMetadataOptions?: pulumi.Input<inputs.ecs.OceanInstanceMetadataOptions>;
    /**
     * The key pair to attach the instances.
     */
    keyPair?: pulumi.Input<string>;
    /**
     * Logging configuration.
     */
    logging?: pulumi.Input<inputs.ecs.OceanLogging>;
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
     * The Ocean cluster name.
     */
    name?: pulumi.Input<string>;
    /**
     * Object. Set auto image update settings.
     */
    optimizeImages?: pulumi.Input<inputs.ecs.OceanOptimizeImages>;
    /**
     * The region the cluster will run in.
     */
    region: pulumi.Input<string>;
    /**
     * While used, you can control whether the group should perform a deployment after an update to the configuration.
     */
    scheduledTasks?: pulumi.Input<pulumi.Input<inputs.ecs.OceanScheduledTask>[]>;
    /**
     * One or more security group ids.
     */
    securityGroupIds: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The percentage of Spot instances that would spin up from the `desiredCapacity` number.
     */
    spotPercentage?: pulumi.Input<number>;
    /**
     * A comma-separated list of subnet identifiers for the Ocean cluster. Subnet IDs should be configured with auto assign public ip.
     */
    subnetIds: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Optionally adds tags to instances launched in an Ocean cluster.
     */
    tags?: pulumi.Input<pulumi.Input<inputs.ecs.OceanTag>[]>;
    /**
     * While used, you can control whether the group should perform a deployment after an update to the configuration.
     */
    updatePolicy?: pulumi.Input<inputs.ecs.OceanUpdatePolicy>;
    /**
     * launch specification defined on the Ocean object will function only as a template for virtual node groups.
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
    whitelists?: pulumi.Input<pulumi.Input<string>[]>;
}
