// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Provides a Spotinst elastigroup GCP resource.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as spotinst from "@pulumi/spotinst";
 *
 * const example = new spotinst.gcp.Elastigroup("example", {
 *     name: "example-gcp",
 *     description: "spotinst gcp group",
 *     serviceAccount: "example@myProject.iam.gservicecct.com",
 *     startupScript: "",
 *     instanceNamePrefix: "test-123a",
 *     minCpuPlatform: "Intel Sandy Bridge",
 *     minSize: 0,
 *     maxSize: 1,
 *     desiredCapacity: 1,
 *     availabilityZones: [
 *         "asia-east1-c",
 *         "us-central1-a",
 *     ],
 *     preferredAvailabilityZones: ["us-central1-a"],
 *     preemptiblePercentage: 50,
 *     revertToPreemptibles: [{
 *         performAt: "timeWindow",
 *     }],
 *     optimizationWindows: ["Mon:01:00-Mon:03:00"],
 *     fallbackToOndemand: true,
 *     drainingTimeout: 180,
 *     provisioningModel: "SPOT",
 *     shouldUtilizeCommitments: true,
 *     labels: [{
 *         key: "test_key",
 *         value: "test_value",
 *     }],
 *     tags: [
 *         "http",
 *         "https",
 *     ],
 *     backendServices: [{
 *         serviceName: "spotinst-elb-backend-service",
 *         locationType: "regional",
 *         scheme: "INTERNAL",
 *         namedPorts: [{
 *             name: "port-name",
 *             ports: [
 *                 "8000",
 *                 "6000",
 *             ],
 *         }],
 *     }],
 *     disks: [{
 *         deviceName: "device",
 *         mode: "READ_WRITE",
 *         type: "PERSISTENT",
 *         autoDelete: true,
 *         boot: true,
 *         "interface": "SCSI",
 *         initializeParams: [{
 *             diskSizeGb: "10",
 *             diskType: "pd-standard",
 *             sourceImage: "",
 *         }],
 *     }],
 *     networkInterfaces: [{
 *         network: "spot-network",
 *     }],
 *     instanceTypesOndemand: "n1-standard-1",
 *     instanceTypesPreemptibles: [
 *         "n1-standard-1",
 *         "n1-standard-2",
 *     ],
 *     instanceTypesCustoms: [{
 *         vcpu: 2,
 *         memoryGib: 7,
 *     }],
 *     subnets: [{
 *         region: "asia-east1",
 *         subnetNames: ["default"],
 *     }],
 *     scalingUpPolicies: [{
 *         policyName: "scale_up_1",
 *         source: "stackdriver",
 *         metricName: "instance/disk/read_ops_count",
 *         namespace: "compute",
 *         statistic: "average",
 *         unit: "percent",
 *         threshold: 10000,
 *         period: 300,
 *         cooldown: 300,
 *         operator: "gte",
 *         evaluationPeriods: 1,
 *         actionType: "adjustment",
 *         adjustment: 1,
 *         dimensions: [{
 *             name: "storage_type",
 *             value: "pd-ssd",
 *         }],
 *     }],
 * });
 * ```
 */
export class Elastigroup extends pulumi.CustomResource {
    /**
     * Get an existing Elastigroup resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ElastigroupState, opts?: pulumi.CustomResourceOptions): Elastigroup {
        return new Elastigroup(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'spotinst:gcp/elastigroup:Elastigroup';

    /**
     * Returns true if the given object is an instance of Elastigroup.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Elastigroup {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Elastigroup.__pulumiType;
    }

    public readonly autoHealing!: pulumi.Output<boolean | undefined>;
    /**
     * List of availability zones for the group.
     *
     * @deprecated This field will soon be handled by Region in Subnets
     */
    public readonly availabilityZones!: pulumi.Output<string[] | undefined>;
    public readonly backendServices!: pulumi.Output<outputs.gcp.ElastigroupBackendService[] | undefined>;
    /**
     * The region your GCP group will be created in.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The desired number of instances the group should have at any time.
     */
    public readonly desiredCapacity!: pulumi.Output<number>;
    public readonly disks!: pulumi.Output<outputs.gcp.ElastigroupDisk[] | undefined>;
    /**
     * Time (seconds) the instance is allowed to run after it is detached from the group. This is to allow the instance time to drain all the current TCP connections before terminating it.
     */
    public readonly drainingTimeout!: pulumi.Output<number | undefined>;
    /**
     * Activate fallback-to-on-demand. When provisioning an instance, if no Preemptible market is available, fallback-to-on-demand will provision an On-Demand instance to maintain the group capacity.
     */
    public readonly fallbackToOndemand!: pulumi.Output<boolean | undefined>;
    public readonly gpu!: pulumi.Output<outputs.gcp.ElastigroupGpu[] | undefined>;
    public readonly healthCheckGracePeriod!: pulumi.Output<number | undefined>;
    public readonly healthCheckType!: pulumi.Output<string | undefined>;
    /**
     * Set an instance name prefix to be used for all launched instances and their boot disk. The prefix value should comply with the following limitations: 
     * * A maximal length of 25 characters.
     * * The first character must be a lowercase letter, and all the following characters must be hyphens, lowercase letters, or digits, except the last character, which cannot be a hyphen.
     */
    public readonly instanceNamePrefix!: pulumi.Output<string | undefined>;
    /**
     * Defines a set of custom instance types. Required if instanceTypesPreemptible and instanceTypesOndemand are not set.
     * * `vCPU` - (Optional) The number of vCPUs in the custom instance type. GCP has a number of limitations on accepted vCPU values. For more information, see the GCP documentation (here.)[https://cloud.google.com/compute/docs/instances/creating-instance-with-custom-machine-type#specifications]
     */
    public readonly instanceTypesCustoms!: pulumi.Output<outputs.gcp.ElastigroupInstanceTypesCustom[] | undefined>;
    /**
     * The regular VM instance type to use for mixed-type groups and when falling back to on-demand. Required if instanceTypesPreemptible is not set.
     */
    public readonly instanceTypesOndemand!: pulumi.Output<string | undefined>;
    /**
     * The preemptible VMs instance type. To maximize cost savings and market availability, select as many types as possible. Required if instanceTypesOndemand is not set.
     */
    public readonly instanceTypesPreemptibles!: pulumi.Output<string[] | undefined>;
    public readonly integrationDockerSwarm!: pulumi.Output<outputs.gcp.ElastigroupIntegrationDockerSwarm | undefined>;
    public readonly integrationGke!: pulumi.Output<outputs.gcp.ElastigroupIntegrationGke | undefined>;
    public readonly ipForwarding!: pulumi.Output<boolean | undefined>;
    /**
     * Array of objects with key-value pairs.
     */
    public readonly labels!: pulumi.Output<outputs.gcp.ElastigroupLabel[] | undefined>;
    /**
     * The maximum number of instances the group should have at any time.
     */
    public readonly maxSize!: pulumi.Output<number>;
    /**
     * Array of objects with key-value pairs.
     */
    public readonly metadatas!: pulumi.Output<outputs.gcp.ElastigroupMetadata[] | undefined>;
    /**
     * Select a minimum CPU platform for the compute instance.
     */
    public readonly minCpuPlatform!: pulumi.Output<string | undefined>;
    /**
     * The minimum number of instances the group should have at any time.
     */
    public readonly minSize!: pulumi.Output<number>;
    /**
     * The group name.
     */
    public readonly name!: pulumi.Output<string>;
    public readonly networkInterfaces!: pulumi.Output<outputs.gcp.ElastigroupNetworkInterface[] | undefined>;
    public readonly ondemandCount!: pulumi.Output<number | undefined>;
    /**
     * Set time window to perform the revert to preemptible. Time windows must be at least 120 minutes. Format: DayInWeek:HH-DayInWeek:HH. Required when strategy.revertToPreemptible.performAt is 'timeWindow'.
     */
    public readonly optimizationWindows!: pulumi.Output<string[] | undefined>;
    /**
     * Percentage of Preemptible VMs to spin up from the "desiredCapacity".
     */
    public readonly preemptiblePercentage!: pulumi.Output<number | undefined>;
    /**
     * prioritize availability zones when launching instances for the group. Must be a sublist of `availabilityZones`.
     */
    public readonly preferredAvailabilityZones!: pulumi.Output<string[] | undefined>;
    /**
     * Valid values: "SPOT", "PREEMPTIBLE". Define the provisioning model of the launched instances. Default value is "PREEMPTIBLE".
     */
    public readonly provisioningModel!: pulumi.Output<string | undefined>;
    /**
     * Setting for revert to preemptible option.
     */
    public readonly revertToPreemptibles!: pulumi.Output<outputs.gcp.ElastigroupRevertToPreemptible[] | undefined>;
    public readonly scalingDownPolicies!: pulumi.Output<outputs.gcp.ElastigroupScalingDownPolicy[] | undefined>;
    public readonly scalingUpPolicies!: pulumi.Output<outputs.gcp.ElastigroupScalingUpPolicy[] | undefined>;
    public readonly scheduledTasks!: pulumi.Output<outputs.gcp.ElastigroupScheduledTask[] | undefined>;
    /**
     * The email of the service account in which the group instances will be launched.
     */
    public readonly serviceAccount!: pulumi.Output<string | undefined>;
    /**
     * Enable committed use discounts utilization.
     */
    public readonly shouldUtilizeCommitments!: pulumi.Output<boolean | undefined>;
    /**
     * The Base64-encoded shutdown script that executes prior to instance termination, for more information please see: [Shutdown Script](https://api.spotinst.com/integration-docs/elastigroup/concepts/compute-concepts/shutdown-scripts/)
     */
    public readonly shutdownScript!: pulumi.Output<string | undefined>;
    /**
     * Create and run your own startup scripts on your virtual machines to perform automated tasks every time your instance boots up.
     */
    public readonly startupScript!: pulumi.Output<string | undefined>;
    /**
     * A list of regions and subnets.
     */
    public readonly subnets!: pulumi.Output<outputs.gcp.ElastigroupSubnet[] | undefined>;
    /**
     * Tags to mark created instances.
     */
    public readonly tags!: pulumi.Output<string[] | undefined>;
    public readonly unhealthyDuration!: pulumi.Output<number | undefined>;

    /**
     * Create a Elastigroup resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ElastigroupArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ElastigroupArgs | ElastigroupState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ElastigroupState | undefined;
            resourceInputs["autoHealing"] = state ? state.autoHealing : undefined;
            resourceInputs["availabilityZones"] = state ? state.availabilityZones : undefined;
            resourceInputs["backendServices"] = state ? state.backendServices : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["desiredCapacity"] = state ? state.desiredCapacity : undefined;
            resourceInputs["disks"] = state ? state.disks : undefined;
            resourceInputs["drainingTimeout"] = state ? state.drainingTimeout : undefined;
            resourceInputs["fallbackToOndemand"] = state ? state.fallbackToOndemand : undefined;
            resourceInputs["gpu"] = state ? state.gpu : undefined;
            resourceInputs["healthCheckGracePeriod"] = state ? state.healthCheckGracePeriod : undefined;
            resourceInputs["healthCheckType"] = state ? state.healthCheckType : undefined;
            resourceInputs["instanceNamePrefix"] = state ? state.instanceNamePrefix : undefined;
            resourceInputs["instanceTypesCustoms"] = state ? state.instanceTypesCustoms : undefined;
            resourceInputs["instanceTypesOndemand"] = state ? state.instanceTypesOndemand : undefined;
            resourceInputs["instanceTypesPreemptibles"] = state ? state.instanceTypesPreemptibles : undefined;
            resourceInputs["integrationDockerSwarm"] = state ? state.integrationDockerSwarm : undefined;
            resourceInputs["integrationGke"] = state ? state.integrationGke : undefined;
            resourceInputs["ipForwarding"] = state ? state.ipForwarding : undefined;
            resourceInputs["labels"] = state ? state.labels : undefined;
            resourceInputs["maxSize"] = state ? state.maxSize : undefined;
            resourceInputs["metadatas"] = state ? state.metadatas : undefined;
            resourceInputs["minCpuPlatform"] = state ? state.minCpuPlatform : undefined;
            resourceInputs["minSize"] = state ? state.minSize : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["networkInterfaces"] = state ? state.networkInterfaces : undefined;
            resourceInputs["ondemandCount"] = state ? state.ondemandCount : undefined;
            resourceInputs["optimizationWindows"] = state ? state.optimizationWindows : undefined;
            resourceInputs["preemptiblePercentage"] = state ? state.preemptiblePercentage : undefined;
            resourceInputs["preferredAvailabilityZones"] = state ? state.preferredAvailabilityZones : undefined;
            resourceInputs["provisioningModel"] = state ? state.provisioningModel : undefined;
            resourceInputs["revertToPreemptibles"] = state ? state.revertToPreemptibles : undefined;
            resourceInputs["scalingDownPolicies"] = state ? state.scalingDownPolicies : undefined;
            resourceInputs["scalingUpPolicies"] = state ? state.scalingUpPolicies : undefined;
            resourceInputs["scheduledTasks"] = state ? state.scheduledTasks : undefined;
            resourceInputs["serviceAccount"] = state ? state.serviceAccount : undefined;
            resourceInputs["shouldUtilizeCommitments"] = state ? state.shouldUtilizeCommitments : undefined;
            resourceInputs["shutdownScript"] = state ? state.shutdownScript : undefined;
            resourceInputs["startupScript"] = state ? state.startupScript : undefined;
            resourceInputs["subnets"] = state ? state.subnets : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["unhealthyDuration"] = state ? state.unhealthyDuration : undefined;
        } else {
            const args = argsOrState as ElastigroupArgs | undefined;
            if ((!args || args.desiredCapacity === undefined) && !opts.urn) {
                throw new Error("Missing required property 'desiredCapacity'");
            }
            resourceInputs["autoHealing"] = args ? args.autoHealing : undefined;
            resourceInputs["availabilityZones"] = args ? args.availabilityZones : undefined;
            resourceInputs["backendServices"] = args ? args.backendServices : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["desiredCapacity"] = args ? args.desiredCapacity : undefined;
            resourceInputs["disks"] = args ? args.disks : undefined;
            resourceInputs["drainingTimeout"] = args ? args.drainingTimeout : undefined;
            resourceInputs["fallbackToOndemand"] = args ? args.fallbackToOndemand : undefined;
            resourceInputs["gpu"] = args ? args.gpu : undefined;
            resourceInputs["healthCheckGracePeriod"] = args ? args.healthCheckGracePeriod : undefined;
            resourceInputs["healthCheckType"] = args ? args.healthCheckType : undefined;
            resourceInputs["instanceNamePrefix"] = args ? args.instanceNamePrefix : undefined;
            resourceInputs["instanceTypesCustoms"] = args ? args.instanceTypesCustoms : undefined;
            resourceInputs["instanceTypesOndemand"] = args ? args.instanceTypesOndemand : undefined;
            resourceInputs["instanceTypesPreemptibles"] = args ? args.instanceTypesPreemptibles : undefined;
            resourceInputs["integrationDockerSwarm"] = args ? args.integrationDockerSwarm : undefined;
            resourceInputs["integrationGke"] = args ? args.integrationGke : undefined;
            resourceInputs["ipForwarding"] = args ? args.ipForwarding : undefined;
            resourceInputs["labels"] = args ? args.labels : undefined;
            resourceInputs["maxSize"] = args ? args.maxSize : undefined;
            resourceInputs["metadatas"] = args ? args.metadatas : undefined;
            resourceInputs["minCpuPlatform"] = args ? args.minCpuPlatform : undefined;
            resourceInputs["minSize"] = args ? args.minSize : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["networkInterfaces"] = args ? args.networkInterfaces : undefined;
            resourceInputs["ondemandCount"] = args ? args.ondemandCount : undefined;
            resourceInputs["optimizationWindows"] = args ? args.optimizationWindows : undefined;
            resourceInputs["preemptiblePercentage"] = args ? args.preemptiblePercentage : undefined;
            resourceInputs["preferredAvailabilityZones"] = args ? args.preferredAvailabilityZones : undefined;
            resourceInputs["provisioningModel"] = args ? args.provisioningModel : undefined;
            resourceInputs["revertToPreemptibles"] = args ? args.revertToPreemptibles : undefined;
            resourceInputs["scalingDownPolicies"] = args ? args.scalingDownPolicies : undefined;
            resourceInputs["scalingUpPolicies"] = args ? args.scalingUpPolicies : undefined;
            resourceInputs["scheduledTasks"] = args ? args.scheduledTasks : undefined;
            resourceInputs["serviceAccount"] = args ? args.serviceAccount : undefined;
            resourceInputs["shouldUtilizeCommitments"] = args ? args.shouldUtilizeCommitments : undefined;
            resourceInputs["shutdownScript"] = args ? args.shutdownScript : undefined;
            resourceInputs["startupScript"] = args ? args.startupScript : undefined;
            resourceInputs["subnets"] = args ? args.subnets : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["unhealthyDuration"] = args ? args.unhealthyDuration : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Elastigroup.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Elastigroup resources.
 */
export interface ElastigroupState {
    autoHealing?: pulumi.Input<boolean>;
    /**
     * List of availability zones for the group.
     *
     * @deprecated This field will soon be handled by Region in Subnets
     */
    availabilityZones?: pulumi.Input<pulumi.Input<string>[]>;
    backendServices?: pulumi.Input<pulumi.Input<inputs.gcp.ElastigroupBackendService>[]>;
    /**
     * The region your GCP group will be created in.
     */
    description?: pulumi.Input<string>;
    /**
     * The desired number of instances the group should have at any time.
     */
    desiredCapacity?: pulumi.Input<number>;
    disks?: pulumi.Input<pulumi.Input<inputs.gcp.ElastigroupDisk>[]>;
    /**
     * Time (seconds) the instance is allowed to run after it is detached from the group. This is to allow the instance time to drain all the current TCP connections before terminating it.
     */
    drainingTimeout?: pulumi.Input<number>;
    /**
     * Activate fallback-to-on-demand. When provisioning an instance, if no Preemptible market is available, fallback-to-on-demand will provision an On-Demand instance to maintain the group capacity.
     */
    fallbackToOndemand?: pulumi.Input<boolean>;
    gpu?: pulumi.Input<pulumi.Input<inputs.gcp.ElastigroupGpu>[]>;
    healthCheckGracePeriod?: pulumi.Input<number>;
    healthCheckType?: pulumi.Input<string>;
    /**
     * Set an instance name prefix to be used for all launched instances and their boot disk. The prefix value should comply with the following limitations: 
     * * A maximal length of 25 characters.
     * * The first character must be a lowercase letter, and all the following characters must be hyphens, lowercase letters, or digits, except the last character, which cannot be a hyphen.
     */
    instanceNamePrefix?: pulumi.Input<string>;
    /**
     * Defines a set of custom instance types. Required if instanceTypesPreemptible and instanceTypesOndemand are not set.
     * * `vCPU` - (Optional) The number of vCPUs in the custom instance type. GCP has a number of limitations on accepted vCPU values. For more information, see the GCP documentation (here.)[https://cloud.google.com/compute/docs/instances/creating-instance-with-custom-machine-type#specifications]
     */
    instanceTypesCustoms?: pulumi.Input<pulumi.Input<inputs.gcp.ElastigroupInstanceTypesCustom>[]>;
    /**
     * The regular VM instance type to use for mixed-type groups and when falling back to on-demand. Required if instanceTypesPreemptible is not set.
     */
    instanceTypesOndemand?: pulumi.Input<string>;
    /**
     * The preemptible VMs instance type. To maximize cost savings and market availability, select as many types as possible. Required if instanceTypesOndemand is not set.
     */
    instanceTypesPreemptibles?: pulumi.Input<pulumi.Input<string>[]>;
    integrationDockerSwarm?: pulumi.Input<inputs.gcp.ElastigroupIntegrationDockerSwarm>;
    integrationGke?: pulumi.Input<inputs.gcp.ElastigroupIntegrationGke>;
    ipForwarding?: pulumi.Input<boolean>;
    /**
     * Array of objects with key-value pairs.
     */
    labels?: pulumi.Input<pulumi.Input<inputs.gcp.ElastigroupLabel>[]>;
    /**
     * The maximum number of instances the group should have at any time.
     */
    maxSize?: pulumi.Input<number>;
    /**
     * Array of objects with key-value pairs.
     */
    metadatas?: pulumi.Input<pulumi.Input<inputs.gcp.ElastigroupMetadata>[]>;
    /**
     * Select a minimum CPU platform for the compute instance.
     */
    minCpuPlatform?: pulumi.Input<string>;
    /**
     * The minimum number of instances the group should have at any time.
     */
    minSize?: pulumi.Input<number>;
    /**
     * The group name.
     */
    name?: pulumi.Input<string>;
    networkInterfaces?: pulumi.Input<pulumi.Input<inputs.gcp.ElastigroupNetworkInterface>[]>;
    ondemandCount?: pulumi.Input<number>;
    /**
     * Set time window to perform the revert to preemptible. Time windows must be at least 120 minutes. Format: DayInWeek:HH-DayInWeek:HH. Required when strategy.revertToPreemptible.performAt is 'timeWindow'.
     */
    optimizationWindows?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Percentage of Preemptible VMs to spin up from the "desiredCapacity".
     */
    preemptiblePercentage?: pulumi.Input<number>;
    /**
     * prioritize availability zones when launching instances for the group. Must be a sublist of `availabilityZones`.
     */
    preferredAvailabilityZones?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Valid values: "SPOT", "PREEMPTIBLE". Define the provisioning model of the launched instances. Default value is "PREEMPTIBLE".
     */
    provisioningModel?: pulumi.Input<string>;
    /**
     * Setting for revert to preemptible option.
     */
    revertToPreemptibles?: pulumi.Input<pulumi.Input<inputs.gcp.ElastigroupRevertToPreemptible>[]>;
    scalingDownPolicies?: pulumi.Input<pulumi.Input<inputs.gcp.ElastigroupScalingDownPolicy>[]>;
    scalingUpPolicies?: pulumi.Input<pulumi.Input<inputs.gcp.ElastigroupScalingUpPolicy>[]>;
    scheduledTasks?: pulumi.Input<pulumi.Input<inputs.gcp.ElastigroupScheduledTask>[]>;
    /**
     * The email of the service account in which the group instances will be launched.
     */
    serviceAccount?: pulumi.Input<string>;
    /**
     * Enable committed use discounts utilization.
     */
    shouldUtilizeCommitments?: pulumi.Input<boolean>;
    /**
     * The Base64-encoded shutdown script that executes prior to instance termination, for more information please see: [Shutdown Script](https://api.spotinst.com/integration-docs/elastigroup/concepts/compute-concepts/shutdown-scripts/)
     */
    shutdownScript?: pulumi.Input<string>;
    /**
     * Create and run your own startup scripts on your virtual machines to perform automated tasks every time your instance boots up.
     */
    startupScript?: pulumi.Input<string>;
    /**
     * A list of regions and subnets.
     */
    subnets?: pulumi.Input<pulumi.Input<inputs.gcp.ElastigroupSubnet>[]>;
    /**
     * Tags to mark created instances.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    unhealthyDuration?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a Elastigroup resource.
 */
export interface ElastigroupArgs {
    autoHealing?: pulumi.Input<boolean>;
    /**
     * List of availability zones for the group.
     *
     * @deprecated This field will soon be handled by Region in Subnets
     */
    availabilityZones?: pulumi.Input<pulumi.Input<string>[]>;
    backendServices?: pulumi.Input<pulumi.Input<inputs.gcp.ElastigroupBackendService>[]>;
    /**
     * The region your GCP group will be created in.
     */
    description?: pulumi.Input<string>;
    /**
     * The desired number of instances the group should have at any time.
     */
    desiredCapacity: pulumi.Input<number>;
    disks?: pulumi.Input<pulumi.Input<inputs.gcp.ElastigroupDisk>[]>;
    /**
     * Time (seconds) the instance is allowed to run after it is detached from the group. This is to allow the instance time to drain all the current TCP connections before terminating it.
     */
    drainingTimeout?: pulumi.Input<number>;
    /**
     * Activate fallback-to-on-demand. When provisioning an instance, if no Preemptible market is available, fallback-to-on-demand will provision an On-Demand instance to maintain the group capacity.
     */
    fallbackToOndemand?: pulumi.Input<boolean>;
    gpu?: pulumi.Input<pulumi.Input<inputs.gcp.ElastigroupGpu>[]>;
    healthCheckGracePeriod?: pulumi.Input<number>;
    healthCheckType?: pulumi.Input<string>;
    /**
     * Set an instance name prefix to be used for all launched instances and their boot disk. The prefix value should comply with the following limitations: 
     * * A maximal length of 25 characters.
     * * The first character must be a lowercase letter, and all the following characters must be hyphens, lowercase letters, or digits, except the last character, which cannot be a hyphen.
     */
    instanceNamePrefix?: pulumi.Input<string>;
    /**
     * Defines a set of custom instance types. Required if instanceTypesPreemptible and instanceTypesOndemand are not set.
     * * `vCPU` - (Optional) The number of vCPUs in the custom instance type. GCP has a number of limitations on accepted vCPU values. For more information, see the GCP documentation (here.)[https://cloud.google.com/compute/docs/instances/creating-instance-with-custom-machine-type#specifications]
     */
    instanceTypesCustoms?: pulumi.Input<pulumi.Input<inputs.gcp.ElastigroupInstanceTypesCustom>[]>;
    /**
     * The regular VM instance type to use for mixed-type groups and when falling back to on-demand. Required if instanceTypesPreemptible is not set.
     */
    instanceTypesOndemand?: pulumi.Input<string>;
    /**
     * The preemptible VMs instance type. To maximize cost savings and market availability, select as many types as possible. Required if instanceTypesOndemand is not set.
     */
    instanceTypesPreemptibles?: pulumi.Input<pulumi.Input<string>[]>;
    integrationDockerSwarm?: pulumi.Input<inputs.gcp.ElastigroupIntegrationDockerSwarm>;
    integrationGke?: pulumi.Input<inputs.gcp.ElastigroupIntegrationGke>;
    ipForwarding?: pulumi.Input<boolean>;
    /**
     * Array of objects with key-value pairs.
     */
    labels?: pulumi.Input<pulumi.Input<inputs.gcp.ElastigroupLabel>[]>;
    /**
     * The maximum number of instances the group should have at any time.
     */
    maxSize?: pulumi.Input<number>;
    /**
     * Array of objects with key-value pairs.
     */
    metadatas?: pulumi.Input<pulumi.Input<inputs.gcp.ElastigroupMetadata>[]>;
    /**
     * Select a minimum CPU platform for the compute instance.
     */
    minCpuPlatform?: pulumi.Input<string>;
    /**
     * The minimum number of instances the group should have at any time.
     */
    minSize?: pulumi.Input<number>;
    /**
     * The group name.
     */
    name?: pulumi.Input<string>;
    networkInterfaces?: pulumi.Input<pulumi.Input<inputs.gcp.ElastigroupNetworkInterface>[]>;
    ondemandCount?: pulumi.Input<number>;
    /**
     * Set time window to perform the revert to preemptible. Time windows must be at least 120 minutes. Format: DayInWeek:HH-DayInWeek:HH. Required when strategy.revertToPreemptible.performAt is 'timeWindow'.
     */
    optimizationWindows?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Percentage of Preemptible VMs to spin up from the "desiredCapacity".
     */
    preemptiblePercentage?: pulumi.Input<number>;
    /**
     * prioritize availability zones when launching instances for the group. Must be a sublist of `availabilityZones`.
     */
    preferredAvailabilityZones?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Valid values: "SPOT", "PREEMPTIBLE". Define the provisioning model of the launched instances. Default value is "PREEMPTIBLE".
     */
    provisioningModel?: pulumi.Input<string>;
    /**
     * Setting for revert to preemptible option.
     */
    revertToPreemptibles?: pulumi.Input<pulumi.Input<inputs.gcp.ElastigroupRevertToPreemptible>[]>;
    scalingDownPolicies?: pulumi.Input<pulumi.Input<inputs.gcp.ElastigroupScalingDownPolicy>[]>;
    scalingUpPolicies?: pulumi.Input<pulumi.Input<inputs.gcp.ElastigroupScalingUpPolicy>[]>;
    scheduledTasks?: pulumi.Input<pulumi.Input<inputs.gcp.ElastigroupScheduledTask>[]>;
    /**
     * The email of the service account in which the group instances will be launched.
     */
    serviceAccount?: pulumi.Input<string>;
    /**
     * Enable committed use discounts utilization.
     */
    shouldUtilizeCommitments?: pulumi.Input<boolean>;
    /**
     * The Base64-encoded shutdown script that executes prior to instance termination, for more information please see: [Shutdown Script](https://api.spotinst.com/integration-docs/elastigroup/concepts/compute-concepts/shutdown-scripts/)
     */
    shutdownScript?: pulumi.Input<string>;
    /**
     * Create and run your own startup scripts on your virtual machines to perform automated tasks every time your instance boots up.
     */
    startupScript?: pulumi.Input<string>;
    /**
     * A list of regions and subnets.
     */
    subnets?: pulumi.Input<pulumi.Input<inputs.gcp.ElastigroupSubnet>[]>;
    /**
     * Tags to mark created instances.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    unhealthyDuration?: pulumi.Input<number>;
}
