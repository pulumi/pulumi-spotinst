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
     */
    public readonly useAsTemplateOnly!: pulumi.Output<boolean | undefined>;
    /**
     * Base64-encoded MIME user data to make available to the instances.
     */
    public readonly userData!: pulumi.Output<string | undefined>;
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
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as OceanState | undefined;
            inputs["associatePublicIpAddress"] = state ? state.associatePublicIpAddress : undefined;
            inputs["autoscaler"] = state ? state.autoscaler : undefined;
            inputs["blacklists"] = state ? state.blacklists : undefined;
            inputs["controllerId"] = state ? state.controllerId : undefined;
            inputs["desiredCapacity"] = state ? state.desiredCapacity : undefined;
            inputs["drainingTimeout"] = state ? state.drainingTimeout : undefined;
            inputs["ebsOptimized"] = state ? state.ebsOptimized : undefined;
            inputs["fallbackToOndemand"] = state ? state.fallbackToOndemand : undefined;
            inputs["gracePeriod"] = state ? state.gracePeriod : undefined;
            inputs["iamInstanceProfile"] = state ? state.iamInstanceProfile : undefined;
            inputs["imageId"] = state ? state.imageId : undefined;
            inputs["instanceMetadataOptions"] = state ? state.instanceMetadataOptions : undefined;
            inputs["keyName"] = state ? state.keyName : undefined;
            inputs["loadBalancers"] = state ? state.loadBalancers : undefined;
            inputs["maxSize"] = state ? state.maxSize : undefined;
            inputs["minSize"] = state ? state.minSize : undefined;
            inputs["monitoring"] = state ? state.monitoring : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["region"] = state ? state.region : undefined;
            inputs["rootVolumeSize"] = state ? state.rootVolumeSize : undefined;
            inputs["scheduledTasks"] = state ? state.scheduledTasks : undefined;
            inputs["securityGroups"] = state ? state.securityGroups : undefined;
            inputs["spotPercentage"] = state ? state.spotPercentage : undefined;
            inputs["subnetIds"] = state ? state.subnetIds : undefined;
            inputs["tags"] = state ? state.tags : undefined;
            inputs["updatePolicy"] = state ? state.updatePolicy : undefined;
            inputs["useAsTemplateOnly"] = state ? state.useAsTemplateOnly : undefined;
            inputs["userData"] = state ? state.userData : undefined;
            inputs["utilizeCommitments"] = state ? state.utilizeCommitments : undefined;
            inputs["utilizeReservedInstances"] = state ? state.utilizeReservedInstances : undefined;
            inputs["whitelists"] = state ? state.whitelists : undefined;
        } else {
            const args = argsOrState as OceanArgs | undefined;
            if ((!args || args.securityGroups === undefined) && !opts.urn) {
                throw new Error("Missing required property 'securityGroups'");
            }
            if ((!args || args.subnetIds === undefined) && !opts.urn) {
                throw new Error("Missing required property 'subnetIds'");
            }
            inputs["associatePublicIpAddress"] = args ? args.associatePublicIpAddress : undefined;
            inputs["autoscaler"] = args ? args.autoscaler : undefined;
            inputs["blacklists"] = args ? args.blacklists : undefined;
            inputs["controllerId"] = args ? args.controllerId : undefined;
            inputs["desiredCapacity"] = args ? args.desiredCapacity : undefined;
            inputs["drainingTimeout"] = args ? args.drainingTimeout : undefined;
            inputs["ebsOptimized"] = args ? args.ebsOptimized : undefined;
            inputs["fallbackToOndemand"] = args ? args.fallbackToOndemand : undefined;
            inputs["gracePeriod"] = args ? args.gracePeriod : undefined;
            inputs["iamInstanceProfile"] = args ? args.iamInstanceProfile : undefined;
            inputs["imageId"] = args ? args.imageId : undefined;
            inputs["instanceMetadataOptions"] = args ? args.instanceMetadataOptions : undefined;
            inputs["keyName"] = args ? args.keyName : undefined;
            inputs["loadBalancers"] = args ? args.loadBalancers : undefined;
            inputs["maxSize"] = args ? args.maxSize : undefined;
            inputs["minSize"] = args ? args.minSize : undefined;
            inputs["monitoring"] = args ? args.monitoring : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["region"] = args ? args.region : undefined;
            inputs["rootVolumeSize"] = args ? args.rootVolumeSize : undefined;
            inputs["scheduledTasks"] = args ? args.scheduledTasks : undefined;
            inputs["securityGroups"] = args ? args.securityGroups : undefined;
            inputs["spotPercentage"] = args ? args.spotPercentage : undefined;
            inputs["subnetIds"] = args ? args.subnetIds : undefined;
            inputs["tags"] = args ? args.tags : undefined;
            inputs["updatePolicy"] = args ? args.updatePolicy : undefined;
            inputs["useAsTemplateOnly"] = args ? args.useAsTemplateOnly : undefined;
            inputs["userData"] = args ? args.userData : undefined;
            inputs["utilizeCommitments"] = args ? args.utilizeCommitments : undefined;
            inputs["utilizeReservedInstances"] = args ? args.utilizeReservedInstances : undefined;
            inputs["whitelists"] = args ? args.whitelists : undefined;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(Ocean.__pulumiType, name, inputs, opts);
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
     */
    useAsTemplateOnly?: pulumi.Input<boolean>;
    /**
     * Base64-encoded MIME user data to make available to the instances.
     */
    userData?: pulumi.Input<string>;
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
     */
    useAsTemplateOnly?: pulumi.Input<boolean>;
    /**
     * Base64-encoded MIME user data to make available to the instances.
     */
    userData?: pulumi.Input<string>;
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
