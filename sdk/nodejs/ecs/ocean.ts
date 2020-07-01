// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Provides a Spotinst Ocean ECS resource.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as spotinst from "@pulumi/spotinst";
 *
 * const example = new spotinst.ecs.Ocean("example", {
 *     associatePublicIpAddress: false,
 *     clusterName: "terraform-ecs-cluster",
 *     desiredCapacity: 0,
 *     drainingTimeout: 120,
 *     ebsOptimized: true,
 *     iamInstanceProfile: "iam-profile",
 *     imageId: "ami-12345",
 *     keyPair: "KeyPair",
 *     maxSize: 1,
 *     minSize: 0,
 *     monitoring: true,
 *     region: "us-west-2",
 *     securityGroupIds: ["sg-12345"],
 *     subnetIds: ["subnet-12345"],
 *     tags: [{
 *         key: "fakeKey",
 *         value: "fakeValue",
 *     }],
 *     userData: "echo hello world",
 *     utilizeReservedInstances: false,
 *     whitelists: ["t3.medium"],
 * });
 * ```
 * ## Auto Scaler
 *
 * * `autoscaler` - (Optional) Describes the Ocean ECS autoscaler.
 *     * `isEnabled` - (Optional, Default: `true`) Enable the Ocean ECS autoscaler.
 *     * `isAutoConfig` - (Optional, Default: `true`) Automatically configure and optimize headroom resources.
 *     * `cooldown` - (Optional, Default: `null`) Cooldown period between scaling actions.
 *     * `headroom` - (Optional) Spare resource capacity management enabling fast assignment of tasks without waiting for new resources to launch.
 *         * `cpuPerUnit` - (Optional) Optionally configure the number of CPUs to allocate the headroom. CPUs are denoted in millicores, where 1000 millicores = 1 vCPU.
 *         * `memoryPerUnit` - (Optional) Optionally configure the amount of memory (MB) to allocate the headroom.
 *         * `numOfUnits` - (Optional) The number of units to retain as headroom, where each unit has the defined headroom CPU and memory.
 *     * `down` - (Optional) Auto Scaling scale down operations.
 *         * `maxScaleDownPercentage` - (Optional) Would represent the maximum % to scale-down. Number between 1-100
 *     * `resourceLimits` - (Optional) Optionally set upper and lower bounds on the resource usage of the cluster.
 *         * `maxVcpu` - (Optional) The maximum cpu in vCPU units that can be allocated to the cluster.
 *         * `maxMemoryGib` - (Optional) The maximum memory in GiB units that can be allocated to the cluster.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * ```
 *
 * <a id="update-policy"></a>
 * ## Update Policy
 *
 * * `updatePolicy` - (Optional) While used, you can control whether the group should perform a deployment after an update to the configuration.
 *     * `shouldRoll` - (Required) Enables the roll.
 *     * `rollConfig` - (Required)
 *         * `batchSizePercentage` - (Required) Sets the percentage of the instances to deploy in each batch.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * ```
 *
 * <a id="scheduled-task"></a>
 * ## scheduled task
 *
 * * `scheduledTask` - (Optional) While used, you can control whether the group should perform a deployment after an update to the configuration.
 *     * `shutdownHours` - (Optional) Set shutdown hours for cluster object.
 *         * `isEnabled` - (Optional)  Flag to enable / disable the shutdown hours.
 *                                      Example: True
 *         * `timeWindows` - (Required) Set time windows for shutdown hours. specify a list of 'timeWindows' with at least one time window Each string is in the format of - ddd:hh:mm-ddd:hh:mm ddd = day of week = Sun | Mon | Tue | Wed | Thu | Fri | Sat hh = hour 24 = 0 -23 mm = minute = 0 - 59. Time windows should not overlap. required on cluster.scheduling.isEnabled = True. API Times are in UTC
 *                                       Example: Fri:15:30-Wed:14:30
 *     * `tasks` - (Optional) The scheduling tasks for the cluster.
 *         * `isEnabled` - (Required)  Describes whether the task is enabled. When true the task should run when false it should not run. Required for cluster.scheduling.tasks object.
 *         * `cronExpression` - (Required) A valid cron expression. For example : " * * * * * ".The cron is running in UTC time zone and is in Unix cron format Cron Expression Validator Script. Only one of ‘frequency’ or ‘cronExpression’ should be used at a time. Required for cluster.scheduling.tasks object
 *                                          Example: 0 1 * * *.
 *         * `taskType` - (Required) Valid values: "clusterRoll". Required for cluster.scheduling.tasks object
 *                                    Example: clusterRoll.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
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
    public readonly autoscaler!: pulumi.Output<outputs.ecs.OceanAutoscaler | undefined>;
    /**
     * The ocean cluster name.
     */
    public readonly clusterName!: pulumi.Output<string>;
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
     * The instance profile iam role.
     */
    public readonly iamInstanceProfile!: pulumi.Output<string | undefined>;
    /**
     * ID of the image used to launch the instances.
     */
    public readonly imageId!: pulumi.Output<string | undefined>;
    /**
     * The key pair to attach the instances.
     */
    public readonly keyPair!: pulumi.Output<string | undefined>;
    /**
     * The upper limit of instances the cluster can scale up to.
     */
    public readonly maxSize!: pulumi.Output<number>;
    /**
     * The lower limit of instances the cluster can scale down to.
     */
    public readonly minSize!: pulumi.Output<number>;
    /**
     * Enable detailed monitoring for cluster. Flag will enable Cloud Watch detailed detailed monitoring (one minute increments). Note: there are additional hourly costs for this service based on the region used.
     */
    public readonly monitoring!: pulumi.Output<boolean | undefined>;
    /**
     * The Ocean cluster name.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The region the cluster will run in.
     */
    public readonly region!: pulumi.Output<string>;
    public readonly scheduledTasks!: pulumi.Output<outputs.ecs.OceanScheduledTask[] | undefined>;
    /**
     * One or more security group ids.
     */
    public readonly securityGroupIds!: pulumi.Output<string[]>;
    /**
     * A comma-separated list of subnet identifiers for the Ocean cluster. Subnet IDs should be configured with auto assign public ip.
     */
    public readonly subnetIds!: pulumi.Output<string[]>;
    /**
     * Optionally adds tags to instances launched in an Ocean cluster.
     */
    public readonly tags!: pulumi.Output<outputs.ecs.OceanTag[] | undefined>;
    public readonly updatePolicy!: pulumi.Output<outputs.ecs.OceanUpdatePolicy | undefined>;
    /**
     * Base64-encoded MIME user data to make available to the instances.
     */
    public readonly userData!: pulumi.Output<string | undefined>;
    /**
     * If Reserved instances exist, OCean will utilize them before launching Spot instances.
     */
    public readonly utilizeReservedInstances!: pulumi.Output<boolean | undefined>;
    /**
     * Instance types allowed in the Ocean cluster, Cannot be configured if blacklist is configured.
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
        if (opts && opts.id) {
            const state = argsOrState as OceanState | undefined;
            inputs["associatePublicIpAddress"] = state ? state.associatePublicIpAddress : undefined;
            inputs["autoscaler"] = state ? state.autoscaler : undefined;
            inputs["clusterName"] = state ? state.clusterName : undefined;
            inputs["desiredCapacity"] = state ? state.desiredCapacity : undefined;
            inputs["drainingTimeout"] = state ? state.drainingTimeout : undefined;
            inputs["ebsOptimized"] = state ? state.ebsOptimized : undefined;
            inputs["iamInstanceProfile"] = state ? state.iamInstanceProfile : undefined;
            inputs["imageId"] = state ? state.imageId : undefined;
            inputs["keyPair"] = state ? state.keyPair : undefined;
            inputs["maxSize"] = state ? state.maxSize : undefined;
            inputs["minSize"] = state ? state.minSize : undefined;
            inputs["monitoring"] = state ? state.monitoring : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["region"] = state ? state.region : undefined;
            inputs["scheduledTasks"] = state ? state.scheduledTasks : undefined;
            inputs["securityGroupIds"] = state ? state.securityGroupIds : undefined;
            inputs["subnetIds"] = state ? state.subnetIds : undefined;
            inputs["tags"] = state ? state.tags : undefined;
            inputs["updatePolicy"] = state ? state.updatePolicy : undefined;
            inputs["userData"] = state ? state.userData : undefined;
            inputs["utilizeReservedInstances"] = state ? state.utilizeReservedInstances : undefined;
            inputs["whitelists"] = state ? state.whitelists : undefined;
        } else {
            const args = argsOrState as OceanArgs | undefined;
            if (!args || args.clusterName === undefined) {
                throw new Error("Missing required property 'clusterName'");
            }
            if (!args || args.region === undefined) {
                throw new Error("Missing required property 'region'");
            }
            if (!args || args.securityGroupIds === undefined) {
                throw new Error("Missing required property 'securityGroupIds'");
            }
            if (!args || args.subnetIds === undefined) {
                throw new Error("Missing required property 'subnetIds'");
            }
            inputs["associatePublicIpAddress"] = args ? args.associatePublicIpAddress : undefined;
            inputs["autoscaler"] = args ? args.autoscaler : undefined;
            inputs["clusterName"] = args ? args.clusterName : undefined;
            inputs["desiredCapacity"] = args ? args.desiredCapacity : undefined;
            inputs["drainingTimeout"] = args ? args.drainingTimeout : undefined;
            inputs["ebsOptimized"] = args ? args.ebsOptimized : undefined;
            inputs["iamInstanceProfile"] = args ? args.iamInstanceProfile : undefined;
            inputs["imageId"] = args ? args.imageId : undefined;
            inputs["keyPair"] = args ? args.keyPair : undefined;
            inputs["maxSize"] = args ? args.maxSize : undefined;
            inputs["minSize"] = args ? args.minSize : undefined;
            inputs["monitoring"] = args ? args.monitoring : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["region"] = args ? args.region : undefined;
            inputs["scheduledTasks"] = args ? args.scheduledTasks : undefined;
            inputs["securityGroupIds"] = args ? args.securityGroupIds : undefined;
            inputs["subnetIds"] = args ? args.subnetIds : undefined;
            inputs["tags"] = args ? args.tags : undefined;
            inputs["updatePolicy"] = args ? args.updatePolicy : undefined;
            inputs["userData"] = args ? args.userData : undefined;
            inputs["utilizeReservedInstances"] = args ? args.utilizeReservedInstances : undefined;
            inputs["whitelists"] = args ? args.whitelists : undefined;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
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
    readonly associatePublicIpAddress?: pulumi.Input<boolean>;
    readonly autoscaler?: pulumi.Input<inputs.ecs.OceanAutoscaler>;
    /**
     * The ocean cluster name.
     */
    readonly clusterName?: pulumi.Input<string>;
    /**
     * The number of instances to launch and maintain in the cluster.
     */
    readonly desiredCapacity?: pulumi.Input<number>;
    /**
     * The time in seconds, the instance is allowed to run while detached from the ELB. This is to allow the instance time to be drained from incoming TCP connections before terminating it, during a scale down operation.
     */
    readonly drainingTimeout?: pulumi.Input<number>;
    /**
     * Enable EBS optimized for cluster. Flag will enable optimized capacity for high bandwidth connectivity to the EB service for non EBS optimized instance types. For instances that are EBS optimized this flag will be ignored.
     */
    readonly ebsOptimized?: pulumi.Input<boolean>;
    /**
     * The instance profile iam role.
     */
    readonly iamInstanceProfile?: pulumi.Input<string>;
    /**
     * ID of the image used to launch the instances.
     */
    readonly imageId?: pulumi.Input<string>;
    /**
     * The key pair to attach the instances.
     */
    readonly keyPair?: pulumi.Input<string>;
    /**
     * The upper limit of instances the cluster can scale up to.
     */
    readonly maxSize?: pulumi.Input<number>;
    /**
     * The lower limit of instances the cluster can scale down to.
     */
    readonly minSize?: pulumi.Input<number>;
    /**
     * Enable detailed monitoring for cluster. Flag will enable Cloud Watch detailed detailed monitoring (one minute increments). Note: there are additional hourly costs for this service based on the region used.
     */
    readonly monitoring?: pulumi.Input<boolean>;
    /**
     * The Ocean cluster name.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The region the cluster will run in.
     */
    readonly region?: pulumi.Input<string>;
    readonly scheduledTasks?: pulumi.Input<pulumi.Input<inputs.ecs.OceanScheduledTask>[]>;
    /**
     * One or more security group ids.
     */
    readonly securityGroupIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A comma-separated list of subnet identifiers for the Ocean cluster. Subnet IDs should be configured with auto assign public ip.
     */
    readonly subnetIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Optionally adds tags to instances launched in an Ocean cluster.
     */
    readonly tags?: pulumi.Input<pulumi.Input<inputs.ecs.OceanTag>[]>;
    readonly updatePolicy?: pulumi.Input<inputs.ecs.OceanUpdatePolicy>;
    /**
     * Base64-encoded MIME user data to make available to the instances.
     */
    readonly userData?: pulumi.Input<string>;
    /**
     * If Reserved instances exist, OCean will utilize them before launching Spot instances.
     */
    readonly utilizeReservedInstances?: pulumi.Input<boolean>;
    /**
     * Instance types allowed in the Ocean cluster, Cannot be configured if blacklist is configured.
     */
    readonly whitelists?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a Ocean resource.
 */
export interface OceanArgs {
    /**
     * Configure public IP address allocation.
     */
    readonly associatePublicIpAddress?: pulumi.Input<boolean>;
    readonly autoscaler?: pulumi.Input<inputs.ecs.OceanAutoscaler>;
    /**
     * The ocean cluster name.
     */
    readonly clusterName: pulumi.Input<string>;
    /**
     * The number of instances to launch and maintain in the cluster.
     */
    readonly desiredCapacity?: pulumi.Input<number>;
    /**
     * The time in seconds, the instance is allowed to run while detached from the ELB. This is to allow the instance time to be drained from incoming TCP connections before terminating it, during a scale down operation.
     */
    readonly drainingTimeout?: pulumi.Input<number>;
    /**
     * Enable EBS optimized for cluster. Flag will enable optimized capacity for high bandwidth connectivity to the EB service for non EBS optimized instance types. For instances that are EBS optimized this flag will be ignored.
     */
    readonly ebsOptimized?: pulumi.Input<boolean>;
    /**
     * The instance profile iam role.
     */
    readonly iamInstanceProfile?: pulumi.Input<string>;
    /**
     * ID of the image used to launch the instances.
     */
    readonly imageId?: pulumi.Input<string>;
    /**
     * The key pair to attach the instances.
     */
    readonly keyPair?: pulumi.Input<string>;
    /**
     * The upper limit of instances the cluster can scale up to.
     */
    readonly maxSize?: pulumi.Input<number>;
    /**
     * The lower limit of instances the cluster can scale down to.
     */
    readonly minSize?: pulumi.Input<number>;
    /**
     * Enable detailed monitoring for cluster. Flag will enable Cloud Watch detailed detailed monitoring (one minute increments). Note: there are additional hourly costs for this service based on the region used.
     */
    readonly monitoring?: pulumi.Input<boolean>;
    /**
     * The Ocean cluster name.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The region the cluster will run in.
     */
    readonly region: pulumi.Input<string>;
    readonly scheduledTasks?: pulumi.Input<pulumi.Input<inputs.ecs.OceanScheduledTask>[]>;
    /**
     * One or more security group ids.
     */
    readonly securityGroupIds: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A comma-separated list of subnet identifiers for the Ocean cluster. Subnet IDs should be configured with auto assign public ip.
     */
    readonly subnetIds: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Optionally adds tags to instances launched in an Ocean cluster.
     */
    readonly tags?: pulumi.Input<pulumi.Input<inputs.ecs.OceanTag>[]>;
    readonly updatePolicy?: pulumi.Input<inputs.ecs.OceanUpdatePolicy>;
    /**
     * Base64-encoded MIME user data to make available to the instances.
     */
    readonly userData?: pulumi.Input<string>;
    /**
     * If Reserved instances exist, OCean will utilize them before launching Spot instances.
     */
    readonly utilizeReservedInstances?: pulumi.Input<boolean>;
    /**
     * Instance types allowed in the Ocean cluster, Cannot be configured if blacklist is configured.
     */
    readonly whitelists?: pulumi.Input<pulumi.Input<string>[]>;
}
