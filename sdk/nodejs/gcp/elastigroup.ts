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
 *
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as spotinst from "@pulumi/spotinst";
 *
 * const example = new spotinst.gcp.Elastigroup("example", {
 *     availabilityZones: [
 *         "asia-east1-c",
 *         "us-central1-a",
 *     ],
 *     backendServicesConfig: [{
 *         ports: [{
 *             portName: "port-name",
 *             ports: [
 *                 8000,
 *                 6000,
 *             ],
 *         }],
 *         serviceName: "spotinst-elb-backend-service",
 *     }],
 *     description: "spotinst gcp group",
 *     desiredCapacity: 1,
 *     disks: [{
 *         autoDelete: true,
 *         boot: true,
 *         deviceName: "device",
 *         initializeParams: [{
 *             diskSizeGb: 10,
 *             diskType: "pd-standard",
 *             sourceImage: "",
 *         }],
 *         interface: "SCSI",
 *         mode: "READ_WRITE",
 *         type: "PERSISTENT",
 *     }],
 *     drainingTimeout: 180,
 *     // onDemandCount      = 2
 *     fallbackToOndemand: true,
 *     instanceTypesCustoms: [{
 *         memoryGiB: 7.5,
 *         vCPU: 2,
 *     }],
 *     instanceTypesOndemand: ["n1-standard-1"],
 *     instanceTypesPreemptibles: [
 *         "n1-standard-1",
 *         "n1-standard-2",
 *     ],
 *     labels: [{
 *         key: "testKey",
 *         value: "testValue",
 *     }],
 *     maxSize: 1,
 *     minSize: 0,
 *     networkInterfaces: [{
 *         network: "spot-network",
 *     }],
 *     preemptiblePercentage: 50,
 *     scaling: [{
 *         up: [{
 *             action: [{
 *                 adjustment: 1,
 *                 type: "adjustment",
 *             }],
 *             cooldown: 300,
 *             dimensions: [{
 *                 name: "storageType",
 *                 value: "pd-ssd",
 *             }],
 *             evaluationPeriods: 1,
 *             metricName: "instance/disk/read_ops_count",
 *             namespace: "compute",
 *             operator: "gte",
 *             period: 300,
 *             policyName: "scaleUp1",
 *             source: "stackdriver",
 *             statistic: "average",
 *             threshold: 10000,
 *             unit: "percent",
 *         }],
 *     }],
 *     serviceAccount: "example@myProject.iam.gservicecct.com",
 *     startupScript: "",
 *     subnets: [{
 *         region: "asia-east1",
 *         subnetNames: "",
 *     }],
 *     tags: [
 *         "http",
 *         "https",
 *     ],
 * });
 * ```
 *
 * ## GPU
 *
 * * `gpu` - (Optional) Defines the GPU configuration.
 *     * `type` - (Required) The type of GPU instance. Valid values: `nvidia-tesla-v100`, `nvidia-tesla-p100`, `nvidia-tesla-k80`.
 *     * `count` - (Required) The number of GPUs. Must be 0, 2, 4, 6, 8.
 *
 * Usage:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * ```
 *
 * <a id="health-check"></a>
 * ## Backend Services
 *
 * * `backendServices` - (Optional) Describes the backend service configurations.
 *     * `serviceName` - (Required) The name of the backend service.
 *     * `locationType` - (Optional) Sets which location the backend services will be active. Valid values: `regional`, `global`.
 *     * `scheme` - (Optional) Use when `locationType` is "regional". Set the traffic for the backend service to either between the instances in the vpc or to traffic from the internet. Valid values: `INTERNAL`, `EXTERNAL`.
 *     * `namedPort` - (Optional) Describes a named port and a list of ports.
 *         * `portName` - (Required) The name of the port.
 *         * `ports` - (Required) A list of ports.
 *
 * Usage:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * ```
 *
 * <a id="disks"></a>
 * ## Disks
 *
 * * `disks` - (Optional) Array of disks associated with this instance. Persistent disks must be created before you can assign them.
 *     * `autoDelete` - (Optional) Specifies whether the disk will be auto-deleted when the instance is deleted.
 *     * `boot` - (Optional) Indicates that this is a boot disk. The virtual machine will use the first partition of the disk for its root filesystem.
 *     * `deviceName` - (Optional) Specifies a unique device name of your choice.
 *     * `interface` - (Optional, Default: `SCSI`) Specifies the disk interface to use for attaching this disk, which is either SCSI or NVME. 
 *     * `mode` - (Optional, Default: `READ_WRITE`) The mode in which to attach this disk, either READ_WRITE or READ_ONLY.
 *     * `source` - (Optional) Specifies a valid partial or full URL to an existing Persistent Disk resource. This field is only applicable for persistent disks.
 *     * `type` - (Optional, Default: `PERSISTENT`) Specifies the type of disk, either SCRATCH or PERSISTENT.
 *     * `initializeParams` - (Optional) Specifies the parameters for a new disk that will be created alongside the new instance. Use initialization parameters to create boot disks or local SSDs attached to the new instance.
 *         * `diskSizeGb` - (Optional) Specifies disk size in gigabytes. Must be in increments of 2.
 *         * `diskType` - (Optional, Default" `pd-standard`) Specifies the disk type to use to create the instance. Valid values: pd-ssd, local-ssd.
 *         * `sourceImage` - (Optional) A source image used to create the disk. You can provide a private (custom) image, and Compute Engine will use the corresponding image from your project.
 *
 * Usage:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * ```
 *
 * <a id="network-interface"></a>
 * ## Network Interfaces
 *
 * Each of the `networkInterface` attributes controls a portion of the GCP
 * Instance's "Network Interfaces". It's a good idea to familiarize yourself with [GCP's Network
 * Interfaces docs](https://cloud.google.com/vpc/docs/multiple-interfaces-concepts)
 * to understand the implications of using these attributes.
 *
 * * `networkInterface` - (Required, minimum 1) Array of objects representing the network configuration for the elastigroup.
 *     * `network` - (Required) Network resource for this group.
 *     * `accessConfigs` - (Optional) Array of configurations.
 *         * `name` - (Optional) Name of this access configuration.
 *         * `type` - (Optional) Array of configurations for this interface. Currently, only ONE_TO_ONE_NAT is supported.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * ```
 *
 * <a id="scaling-policy"></a>
 * ## Scaling Policies
 *
 * * `scalingUpPolicy` - (Optional) Contains scaling policies for scaling the Elastigroup up.
 * * `scalingDownPolicy` - (Optional) Contains scaling policies for scaling the Elastigroup down.
 *
 * Each `scaling_*_policy` supports the following:
 *
 * * `policyName` - (Optional) Name of scaling policy.
 * * `metricName` - (Optional) Metric to monitor. Valid values: "Percentage CPU", "Network In", "Network Out", "Disk Read Bytes", "Disk Write Bytes", "Disk Write Operations/Sec", "Disk Read Operations/Sec".
 * * `statistic` - (Optional) Statistic by which to evaluate the selected metric. Valid values: "AVERAGE", "SAMPLE_COUNT", "SUM", "MINIMUM", "MAXIMUM", "PERCENTILE", "COUNT".
 * * `threshold` - (Optional) The value at which the scaling action is triggered.
 * * `period` - (Optional) Amount of time (seconds) for which the threshold must be met in order to trigger the scaling action.
 * * `evaluationPeriods` - (Optional) Number of consecutive periods in which the threshold must be met in order to trigger a scaling action.
 * * `cooldown` - (Optional) Time (seconds) to wait after a scaling action before resuming monitoring.
 * * `operator` - (Optional) The operator used to evaluate the threshold against the current metric value. Valid values: "gt" (greater than), "get" (greater-than or equal), "lt" (less than), "lte" (less than or equal).
 * * `action` - (Optional) Scaling action to take when the policy is triggered.
 *     * `type` - (Optional) Type of scaling action to take when the scaling policy is triggered. Valid values: "adjustment", "setMinTarget", "updateCapacity", "percentageAdjustment"
 *     * `adjustment` - (Optional) Value to which the action type will be adjusted. Required if using "numeric" or "percentageAdjustment" action types.
 * * `dimensions` - (Optional) A list of dimensions describing qualities of the metric.
 *     * `name` - (Required) The dimension name.
 *     * `value` - (Required) The dimension value.
 *     
 * Usage:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * ```
 *
 * <a id="third-party-integrations"></a>
 * ## Third-Party Integrations
 *
 * * `integrationDockerSwarm` - (Optional) Describes the [Docker Swarm](https://api.spotinst.com/integration-docs/elastigroup/container-management/docker-swarm/docker-swarm-integration/) integration.
 *     * `masterHost` - (Required) IP or FQDN of one of your swarm managers.
 *     * `masterPort` - (Required) Network port used by your swarm.
 *             
 * Usage:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * ```
 *
 * <a id="scheduled-task"></a>
 * ## Scheduled Tasks
 *
 * Each `scheduledTask` supports the following:
 *
 * * `taskType` - (Required) The task type to run. Valid values: `"setCapacity"`.
 * * `cronExpression` - (Optional) A valid cron expression. The cron is running in UTC time zone and is in [Unix cron format](https://en.wikipedia.org/wiki/Cron).
 * * `isEnabled` - (Optional, Default: `true`) Setting the task to being enabled or disabled.
 * * `targetCapacity` - (Optional) The desired number of instances the group should have.
 * * `minCapacity` - (Optional) The minimum number of instances the group should have.
 * * `maxCapacity` - (Optional) The maximum number of instances the group should have.
 *
 * Usage:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
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
     * Defines a set of custom instance types. Required if instanceTypesPreemptible and instanceTypesOndemand are not set.
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
     * Percentage of Preemptible VMs to spin up from the "desiredCapacity".
     */
    public readonly preemptiblePercentage!: pulumi.Output<number | undefined>;
    public readonly scalingDownPolicies!: pulumi.Output<outputs.gcp.ElastigroupScalingDownPolicy[] | undefined>;
    public readonly scalingUpPolicies!: pulumi.Output<outputs.gcp.ElastigroupScalingUpPolicy[] | undefined>;
    public readonly scheduledTasks!: pulumi.Output<outputs.gcp.ElastigroupScheduledTask[] | undefined>;
    /**
     * The email of the service account in which the group instances will be launched.
     */
    public readonly serviceAccount!: pulumi.Output<string | undefined>;
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
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as ElastigroupState | undefined;
            inputs["autoHealing"] = state ? state.autoHealing : undefined;
            inputs["availabilityZones"] = state ? state.availabilityZones : undefined;
            inputs["backendServices"] = state ? state.backendServices : undefined;
            inputs["description"] = state ? state.description : undefined;
            inputs["desiredCapacity"] = state ? state.desiredCapacity : undefined;
            inputs["disks"] = state ? state.disks : undefined;
            inputs["drainingTimeout"] = state ? state.drainingTimeout : undefined;
            inputs["fallbackToOndemand"] = state ? state.fallbackToOndemand : undefined;
            inputs["gpu"] = state ? state.gpu : undefined;
            inputs["healthCheckGracePeriod"] = state ? state.healthCheckGracePeriod : undefined;
            inputs["healthCheckType"] = state ? state.healthCheckType : undefined;
            inputs["instanceTypesCustoms"] = state ? state.instanceTypesCustoms : undefined;
            inputs["instanceTypesOndemand"] = state ? state.instanceTypesOndemand : undefined;
            inputs["instanceTypesPreemptibles"] = state ? state.instanceTypesPreemptibles : undefined;
            inputs["integrationDockerSwarm"] = state ? state.integrationDockerSwarm : undefined;
            inputs["integrationGke"] = state ? state.integrationGke : undefined;
            inputs["ipForwarding"] = state ? state.ipForwarding : undefined;
            inputs["labels"] = state ? state.labels : undefined;
            inputs["maxSize"] = state ? state.maxSize : undefined;
            inputs["metadatas"] = state ? state.metadatas : undefined;
            inputs["minSize"] = state ? state.minSize : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["networkInterfaces"] = state ? state.networkInterfaces : undefined;
            inputs["ondemandCount"] = state ? state.ondemandCount : undefined;
            inputs["preemptiblePercentage"] = state ? state.preemptiblePercentage : undefined;
            inputs["scalingDownPolicies"] = state ? state.scalingDownPolicies : undefined;
            inputs["scalingUpPolicies"] = state ? state.scalingUpPolicies : undefined;
            inputs["scheduledTasks"] = state ? state.scheduledTasks : undefined;
            inputs["serviceAccount"] = state ? state.serviceAccount : undefined;
            inputs["shutdownScript"] = state ? state.shutdownScript : undefined;
            inputs["startupScript"] = state ? state.startupScript : undefined;
            inputs["subnets"] = state ? state.subnets : undefined;
            inputs["tags"] = state ? state.tags : undefined;
            inputs["unhealthyDuration"] = state ? state.unhealthyDuration : undefined;
        } else {
            const args = argsOrState as ElastigroupArgs | undefined;
            if (!args || args.desiredCapacity === undefined) {
                throw new Error("Missing required property 'desiredCapacity'");
            }
            inputs["autoHealing"] = args ? args.autoHealing : undefined;
            inputs["availabilityZones"] = args ? args.availabilityZones : undefined;
            inputs["backendServices"] = args ? args.backendServices : undefined;
            inputs["description"] = args ? args.description : undefined;
            inputs["desiredCapacity"] = args ? args.desiredCapacity : undefined;
            inputs["disks"] = args ? args.disks : undefined;
            inputs["drainingTimeout"] = args ? args.drainingTimeout : undefined;
            inputs["fallbackToOndemand"] = args ? args.fallbackToOndemand : undefined;
            inputs["gpu"] = args ? args.gpu : undefined;
            inputs["healthCheckGracePeriod"] = args ? args.healthCheckGracePeriod : undefined;
            inputs["healthCheckType"] = args ? args.healthCheckType : undefined;
            inputs["instanceTypesCustoms"] = args ? args.instanceTypesCustoms : undefined;
            inputs["instanceTypesOndemand"] = args ? args.instanceTypesOndemand : undefined;
            inputs["instanceTypesPreemptibles"] = args ? args.instanceTypesPreemptibles : undefined;
            inputs["integrationDockerSwarm"] = args ? args.integrationDockerSwarm : undefined;
            inputs["integrationGke"] = args ? args.integrationGke : undefined;
            inputs["ipForwarding"] = args ? args.ipForwarding : undefined;
            inputs["labels"] = args ? args.labels : undefined;
            inputs["maxSize"] = args ? args.maxSize : undefined;
            inputs["metadatas"] = args ? args.metadatas : undefined;
            inputs["minSize"] = args ? args.minSize : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["networkInterfaces"] = args ? args.networkInterfaces : undefined;
            inputs["ondemandCount"] = args ? args.ondemandCount : undefined;
            inputs["preemptiblePercentage"] = args ? args.preemptiblePercentage : undefined;
            inputs["scalingDownPolicies"] = args ? args.scalingDownPolicies : undefined;
            inputs["scalingUpPolicies"] = args ? args.scalingUpPolicies : undefined;
            inputs["scheduledTasks"] = args ? args.scheduledTasks : undefined;
            inputs["serviceAccount"] = args ? args.serviceAccount : undefined;
            inputs["shutdownScript"] = args ? args.shutdownScript : undefined;
            inputs["startupScript"] = args ? args.startupScript : undefined;
            inputs["subnets"] = args ? args.subnets : undefined;
            inputs["tags"] = args ? args.tags : undefined;
            inputs["unhealthyDuration"] = args ? args.unhealthyDuration : undefined;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(Elastigroup.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Elastigroup resources.
 */
export interface ElastigroupState {
    readonly autoHealing?: pulumi.Input<boolean>;
    /**
     * List of availability zones for the group.
     *
     * @deprecated This field will soon be handled by Region in Subnets
     */
    readonly availabilityZones?: pulumi.Input<pulumi.Input<string>[]>;
    readonly backendServices?: pulumi.Input<pulumi.Input<inputs.gcp.ElastigroupBackendService>[]>;
    /**
     * The region your GCP group will be created in.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * The desired number of instances the group should have at any time.
     */
    readonly desiredCapacity?: pulumi.Input<number>;
    readonly disks?: pulumi.Input<pulumi.Input<inputs.gcp.ElastigroupDisk>[]>;
    /**
     * Time (seconds) the instance is allowed to run after it is detached from the group. This is to allow the instance time to drain all the current TCP connections before terminating it.
     */
    readonly drainingTimeout?: pulumi.Input<number>;
    /**
     * Activate fallback-to-on-demand. When provisioning an instance, if no Preemptible market is available, fallback-to-on-demand will provision an On-Demand instance to maintain the group capacity.
     */
    readonly fallbackToOndemand?: pulumi.Input<boolean>;
    readonly gpu?: pulumi.Input<pulumi.Input<inputs.gcp.ElastigroupGpu>[]>;
    readonly healthCheckGracePeriod?: pulumi.Input<number>;
    readonly healthCheckType?: pulumi.Input<string>;
    /**
     * Defines a set of custom instance types. Required if instanceTypesPreemptible and instanceTypesOndemand are not set.
     */
    readonly instanceTypesCustoms?: pulumi.Input<pulumi.Input<inputs.gcp.ElastigroupInstanceTypesCustom>[]>;
    /**
     * The regular VM instance type to use for mixed-type groups and when falling back to on-demand. Required if instanceTypesPreemptible is not set.
     */
    readonly instanceTypesOndemand?: pulumi.Input<string>;
    /**
     * The preemptible VMs instance type. To maximize cost savings and market availability, select as many types as possible. Required if instanceTypesOndemand is not set.
     */
    readonly instanceTypesPreemptibles?: pulumi.Input<pulumi.Input<string>[]>;
    readonly integrationDockerSwarm?: pulumi.Input<inputs.gcp.ElastigroupIntegrationDockerSwarm>;
    readonly integrationGke?: pulumi.Input<inputs.gcp.ElastigroupIntegrationGke>;
    readonly ipForwarding?: pulumi.Input<boolean>;
    /**
     * Array of objects with key-value pairs.
     */
    readonly labels?: pulumi.Input<pulumi.Input<inputs.gcp.ElastigroupLabel>[]>;
    /**
     * The maximum number of instances the group should have at any time.
     */
    readonly maxSize?: pulumi.Input<number>;
    /**
     * Array of objects with key-value pairs.
     */
    readonly metadatas?: pulumi.Input<pulumi.Input<inputs.gcp.ElastigroupMetadata>[]>;
    /**
     * The minimum number of instances the group should have at any time.
     */
    readonly minSize?: pulumi.Input<number>;
    /**
     * The group name. 
     */
    readonly name?: pulumi.Input<string>;
    readonly networkInterfaces?: pulumi.Input<pulumi.Input<inputs.gcp.ElastigroupNetworkInterface>[]>;
    readonly ondemandCount?: pulumi.Input<number>;
    /**
     * Percentage of Preemptible VMs to spin up from the "desiredCapacity".
     */
    readonly preemptiblePercentage?: pulumi.Input<number>;
    readonly scalingDownPolicies?: pulumi.Input<pulumi.Input<inputs.gcp.ElastigroupScalingDownPolicy>[]>;
    readonly scalingUpPolicies?: pulumi.Input<pulumi.Input<inputs.gcp.ElastigroupScalingUpPolicy>[]>;
    readonly scheduledTasks?: pulumi.Input<pulumi.Input<inputs.gcp.ElastigroupScheduledTask>[]>;
    /**
     * The email of the service account in which the group instances will be launched.
     */
    readonly serviceAccount?: pulumi.Input<string>;
    /**
     * The Base64-encoded shutdown script that executes prior to instance termination, for more information please see: [Shutdown Script](https://api.spotinst.com/integration-docs/elastigroup/concepts/compute-concepts/shutdown-scripts/)
     */
    readonly shutdownScript?: pulumi.Input<string>;
    /**
     * Create and run your own startup scripts on your virtual machines to perform automated tasks every time your instance boots up.
     */
    readonly startupScript?: pulumi.Input<string>;
    /**
     * A list of regions and subnets.
     */
    readonly subnets?: pulumi.Input<pulumi.Input<inputs.gcp.ElastigroupSubnet>[]>;
    /**
     * Tags to mark created instances.
     */
    readonly tags?: pulumi.Input<pulumi.Input<string>[]>;
    readonly unhealthyDuration?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a Elastigroup resource.
 */
export interface ElastigroupArgs {
    readonly autoHealing?: pulumi.Input<boolean>;
    /**
     * List of availability zones for the group.
     *
     * @deprecated This field will soon be handled by Region in Subnets
     */
    readonly availabilityZones?: pulumi.Input<pulumi.Input<string>[]>;
    readonly backendServices?: pulumi.Input<pulumi.Input<inputs.gcp.ElastigroupBackendService>[]>;
    /**
     * The region your GCP group will be created in.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * The desired number of instances the group should have at any time.
     */
    readonly desiredCapacity: pulumi.Input<number>;
    readonly disks?: pulumi.Input<pulumi.Input<inputs.gcp.ElastigroupDisk>[]>;
    /**
     * Time (seconds) the instance is allowed to run after it is detached from the group. This is to allow the instance time to drain all the current TCP connections before terminating it.
     */
    readonly drainingTimeout?: pulumi.Input<number>;
    /**
     * Activate fallback-to-on-demand. When provisioning an instance, if no Preemptible market is available, fallback-to-on-demand will provision an On-Demand instance to maintain the group capacity.
     */
    readonly fallbackToOndemand?: pulumi.Input<boolean>;
    readonly gpu?: pulumi.Input<pulumi.Input<inputs.gcp.ElastigroupGpu>[]>;
    readonly healthCheckGracePeriod?: pulumi.Input<number>;
    readonly healthCheckType?: pulumi.Input<string>;
    /**
     * Defines a set of custom instance types. Required if instanceTypesPreemptible and instanceTypesOndemand are not set.
     */
    readonly instanceTypesCustoms?: pulumi.Input<pulumi.Input<inputs.gcp.ElastigroupInstanceTypesCustom>[]>;
    /**
     * The regular VM instance type to use for mixed-type groups and when falling back to on-demand. Required if instanceTypesPreemptible is not set.
     */
    readonly instanceTypesOndemand?: pulumi.Input<string>;
    /**
     * The preemptible VMs instance type. To maximize cost savings and market availability, select as many types as possible. Required if instanceTypesOndemand is not set.
     */
    readonly instanceTypesPreemptibles?: pulumi.Input<pulumi.Input<string>[]>;
    readonly integrationDockerSwarm?: pulumi.Input<inputs.gcp.ElastigroupIntegrationDockerSwarm>;
    readonly integrationGke?: pulumi.Input<inputs.gcp.ElastigroupIntegrationGke>;
    readonly ipForwarding?: pulumi.Input<boolean>;
    /**
     * Array of objects with key-value pairs.
     */
    readonly labels?: pulumi.Input<pulumi.Input<inputs.gcp.ElastigroupLabel>[]>;
    /**
     * The maximum number of instances the group should have at any time.
     */
    readonly maxSize?: pulumi.Input<number>;
    /**
     * Array of objects with key-value pairs.
     */
    readonly metadatas?: pulumi.Input<pulumi.Input<inputs.gcp.ElastigroupMetadata>[]>;
    /**
     * The minimum number of instances the group should have at any time.
     */
    readonly minSize?: pulumi.Input<number>;
    /**
     * The group name. 
     */
    readonly name?: pulumi.Input<string>;
    readonly networkInterfaces?: pulumi.Input<pulumi.Input<inputs.gcp.ElastigroupNetworkInterface>[]>;
    readonly ondemandCount?: pulumi.Input<number>;
    /**
     * Percentage of Preemptible VMs to spin up from the "desiredCapacity".
     */
    readonly preemptiblePercentage?: pulumi.Input<number>;
    readonly scalingDownPolicies?: pulumi.Input<pulumi.Input<inputs.gcp.ElastigroupScalingDownPolicy>[]>;
    readonly scalingUpPolicies?: pulumi.Input<pulumi.Input<inputs.gcp.ElastigroupScalingUpPolicy>[]>;
    readonly scheduledTasks?: pulumi.Input<pulumi.Input<inputs.gcp.ElastigroupScheduledTask>[]>;
    /**
     * The email of the service account in which the group instances will be launched.
     */
    readonly serviceAccount?: pulumi.Input<string>;
    /**
     * The Base64-encoded shutdown script that executes prior to instance termination, for more information please see: [Shutdown Script](https://api.spotinst.com/integration-docs/elastigroup/concepts/compute-concepts/shutdown-scripts/)
     */
    readonly shutdownScript?: pulumi.Input<string>;
    /**
     * Create and run your own startup scripts on your virtual machines to perform automated tasks every time your instance boots up.
     */
    readonly startupScript?: pulumi.Input<string>;
    /**
     * A list of regions and subnets.
     */
    readonly subnets?: pulumi.Input<pulumi.Input<inputs.gcp.ElastigroupSubnet>[]>;
    /**
     * Tags to mark created instances.
     */
    readonly tags?: pulumi.Input<pulumi.Input<string>[]>;
    readonly unhealthyDuration?: pulumi.Input<number>;
}
