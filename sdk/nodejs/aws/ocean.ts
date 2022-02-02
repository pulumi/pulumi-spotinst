// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

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
     * Configure public IP address allocation.
     */
    public readonly associatePublicIpAddress!: pulumi.Output<boolean | undefined>;
    /**
     * Describes the Ocean Kubernetes Auto Scaler.
     */
    public readonly autoscaler!: pulumi.Output<outputs.aws.OceanAutoscaler | undefined>;
    /**
     * Instance types not allowed in the Ocean cluster. Cannot be configured if `whitelist` is configured.
     */
    public readonly blacklists!: pulumi.Output<string[] | undefined>;
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
     * - Array of load balancer objects to add to ocean cluster
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
     * The size (in Gb) to allocate for the root volume. Minimum `20`.
     */
    public readonly rootVolumeSize!: pulumi.Output<number | undefined>;
    /**
     * Set scheduling object.
     */
    public readonly scheduledTasks!: pulumi.Output<outputs.aws.OceanScheduledTask[] | undefined>;
    /**
     * One or more security group ids.
     */
    public readonly securityGroups!: pulumi.Output<string[]>;
    /**
     * The percentage of Spot instances that would spin up from the `desiredCapacity` number.
     */
    public readonly spotPercentage!: pulumi.Output<number | undefined>;
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
            resourceInputs["associatePublicIpAddress"] = state ? state.associatePublicIpAddress : undefined;
            resourceInputs["autoscaler"] = state ? state.autoscaler : undefined;
            resourceInputs["blacklists"] = state ? state.blacklists : undefined;
            resourceInputs["controllerId"] = state ? state.controllerId : undefined;
            resourceInputs["desiredCapacity"] = state ? state.desiredCapacity : undefined;
            resourceInputs["drainingTimeout"] = state ? state.drainingTimeout : undefined;
            resourceInputs["ebsOptimized"] = state ? state.ebsOptimized : undefined;
            resourceInputs["fallbackToOndemand"] = state ? state.fallbackToOndemand : undefined;
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
            resourceInputs["rootVolumeSize"] = state ? state.rootVolumeSize : undefined;
            resourceInputs["scheduledTasks"] = state ? state.scheduledTasks : undefined;
            resourceInputs["securityGroups"] = state ? state.securityGroups : undefined;
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
            if ((!args || args.securityGroups === undefined) && !opts.urn) {
                throw new Error("Missing required property 'securityGroups'");
            }
            if ((!args || args.subnetIds === undefined) && !opts.urn) {
                throw new Error("Missing required property 'subnetIds'");
            }
            resourceInputs["associatePublicIpAddress"] = args ? args.associatePublicIpAddress : undefined;
            resourceInputs["autoscaler"] = args ? args.autoscaler : undefined;
            resourceInputs["blacklists"] = args ? args.blacklists : undefined;
            resourceInputs["controllerId"] = args ? args.controllerId : undefined;
            resourceInputs["desiredCapacity"] = args ? args.desiredCapacity : undefined;
            resourceInputs["drainingTimeout"] = args ? args.drainingTimeout : undefined;
            resourceInputs["ebsOptimized"] = args ? args.ebsOptimized : undefined;
            resourceInputs["fallbackToOndemand"] = args ? args.fallbackToOndemand : undefined;
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
            resourceInputs["rootVolumeSize"] = args ? args.rootVolumeSize : undefined;
            resourceInputs["scheduledTasks"] = args ? args.scheduledTasks : undefined;
            resourceInputs["securityGroups"] = args ? args.securityGroups : undefined;
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
     * Describes the Ocean Kubernetes Auto Scaler.
     */
    autoscaler?: pulumi.Input<inputs.aws.OceanAutoscaler>;
    /**
     * Instance types not allowed in the Ocean cluster. Cannot be configured if `whitelist` is configured.
     */
    blacklists?: pulumi.Input<pulumi.Input<string>[]>;
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
     * - Array of load balancer objects to add to ocean cluster
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
     * The size (in Gb) to allocate for the root volume. Minimum `20`.
     */
    rootVolumeSize?: pulumi.Input<number>;
    /**
     * Set scheduling object.
     */
    scheduledTasks?: pulumi.Input<pulumi.Input<inputs.aws.OceanScheduledTask>[]>;
    /**
     * One or more security group ids.
     */
    securityGroups?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The percentage of Spot instances that would spin up from the `desiredCapacity` number.
     */
    spotPercentage?: pulumi.Input<number>;
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
     * Configure public IP address allocation.
     */
    associatePublicIpAddress?: pulumi.Input<boolean>;
    /**
     * Describes the Ocean Kubernetes Auto Scaler.
     */
    autoscaler?: pulumi.Input<inputs.aws.OceanAutoscaler>;
    /**
     * Instance types not allowed in the Ocean cluster. Cannot be configured if `whitelist` is configured.
     */
    blacklists?: pulumi.Input<pulumi.Input<string>[]>;
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
     * - Array of load balancer objects to add to ocean cluster
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
     * The size (in Gb) to allocate for the root volume. Minimum `20`.
     */
    rootVolumeSize?: pulumi.Input<number>;
    /**
     * Set scheduling object.
     */
    scheduledTasks?: pulumi.Input<pulumi.Input<inputs.aws.OceanScheduledTask>[]>;
    /**
     * One or more security group ids.
     */
    securityGroups: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The percentage of Spot instances that would spin up from the `desiredCapacity` number.
     */
    spotPercentage?: pulumi.Input<number>;
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
