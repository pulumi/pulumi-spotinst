// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
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
 *     // on_demand_count      = 2
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
 *         key: "test_key",
 *         value: "test_value",
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
 *                 name: "storage_type",
 *                 value: "pd-ssd",
 *             }],
 *             evaluationPeriods: 1,
 *             metricName: "instance/disk/read_ops_count",
 *             namespace: "compute",
 *             operator: "gte",
 *             period: 300,
 *             policyName: "scale_up_1",
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

    /**
     * Enable auto-replacement of unhealthy instances.
     */
    public readonly autoHealing!: pulumi.Output<boolean | undefined>;
    /**
     * List of availability zones for the group.
     *
     * @deprecated This field will soon be handled by Region in Subnets
     */
    public readonly availabilityZones!: pulumi.Output<string[] | undefined>;
    /**
     * Describes the backend service configurations.
     */
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
    /**
     * Defines the GPU configuration.
     */
    public readonly gpu!: pulumi.Output<outputs.gcp.ElastigroupGpu[] | undefined>;
    /**
     * Period of time (seconds) to wait for VM to reach healthiness before monitoring for unhealthiness.
     */
    public readonly healthCheckGracePeriod!: pulumi.Output<number | undefined>;
    /**
     * The kind of health check to perform when monitoring for unhealthiness.
     */
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
    /**
     * Describes the [Docker Swarm](https://api.spotinst.com/integration-docs/elastigroup/container-management/docker-swarm/docker-swarm-integration/) integration.
     */
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
     * The dimension name.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Array of objects representing the network configuration for the elastigroup.
     */
    public readonly networkInterfaces!: pulumi.Output<outputs.gcp.ElastigroupNetworkInterface[] | undefined>;
    public readonly ondemandCount!: pulumi.Output<number | undefined>;
    /**
     * Percentage of Preemptible VMs to spin up from the "desiredCapacity".
     */
    public readonly preemptiblePercentage!: pulumi.Output<number | undefined>;
    /**
     * Contains scaling policies for scaling the Elastigroup down.
     */
    public readonly scalingDownPolicies!: pulumi.Output<outputs.gcp.ElastigroupScalingDownPolicy[] | undefined>;
    /**
     * Contains scaling policies for scaling the Elastigroup up.
     */
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
    /**
     * Period of time (seconds) to remain in an unhealthy status before a replacement is triggered.
     */
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
        opts = opts || {};
        if (opts.id) {
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
            if ((!args || args.desiredCapacity === undefined) && !opts.urn) {
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
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(Elastigroup.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Elastigroup resources.
 */
export interface ElastigroupState {
    /**
     * Enable auto-replacement of unhealthy instances.
     */
    readonly autoHealing?: pulumi.Input<boolean>;
    /**
     * List of availability zones for the group.
     *
     * @deprecated This field will soon be handled by Region in Subnets
     */
    readonly availabilityZones?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Describes the backend service configurations.
     */
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
    /**
     * Defines the GPU configuration.
     */
    readonly gpu?: pulumi.Input<pulumi.Input<inputs.gcp.ElastigroupGpu>[]>;
    /**
     * Period of time (seconds) to wait for VM to reach healthiness before monitoring for unhealthiness.
     */
    readonly healthCheckGracePeriod?: pulumi.Input<number>;
    /**
     * The kind of health check to perform when monitoring for unhealthiness.
     */
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
    /**
     * Describes the [Docker Swarm](https://api.spotinst.com/integration-docs/elastigroup/container-management/docker-swarm/docker-swarm-integration/) integration.
     */
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
     * The dimension name.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * Array of objects representing the network configuration for the elastigroup.
     */
    readonly networkInterfaces?: pulumi.Input<pulumi.Input<inputs.gcp.ElastigroupNetworkInterface>[]>;
    readonly ondemandCount?: pulumi.Input<number>;
    /**
     * Percentage of Preemptible VMs to spin up from the "desiredCapacity".
     */
    readonly preemptiblePercentage?: pulumi.Input<number>;
    /**
     * Contains scaling policies for scaling the Elastigroup down.
     */
    readonly scalingDownPolicies?: pulumi.Input<pulumi.Input<inputs.gcp.ElastigroupScalingDownPolicy>[]>;
    /**
     * Contains scaling policies for scaling the Elastigroup up.
     */
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
    /**
     * Period of time (seconds) to remain in an unhealthy status before a replacement is triggered.
     */
    readonly unhealthyDuration?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a Elastigroup resource.
 */
export interface ElastigroupArgs {
    /**
     * Enable auto-replacement of unhealthy instances.
     */
    readonly autoHealing?: pulumi.Input<boolean>;
    /**
     * List of availability zones for the group.
     *
     * @deprecated This field will soon be handled by Region in Subnets
     */
    readonly availabilityZones?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Describes the backend service configurations.
     */
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
    /**
     * Defines the GPU configuration.
     */
    readonly gpu?: pulumi.Input<pulumi.Input<inputs.gcp.ElastigroupGpu>[]>;
    /**
     * Period of time (seconds) to wait for VM to reach healthiness before monitoring for unhealthiness.
     */
    readonly healthCheckGracePeriod?: pulumi.Input<number>;
    /**
     * The kind of health check to perform when monitoring for unhealthiness.
     */
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
    /**
     * Describes the [Docker Swarm](https://api.spotinst.com/integration-docs/elastigroup/container-management/docker-swarm/docker-swarm-integration/) integration.
     */
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
     * The dimension name.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * Array of objects representing the network configuration for the elastigroup.
     */
    readonly networkInterfaces?: pulumi.Input<pulumi.Input<inputs.gcp.ElastigroupNetworkInterface>[]>;
    readonly ondemandCount?: pulumi.Input<number>;
    /**
     * Percentage of Preemptible VMs to spin up from the "desiredCapacity".
     */
    readonly preemptiblePercentage?: pulumi.Input<number>;
    /**
     * Contains scaling policies for scaling the Elastigroup down.
     */
    readonly scalingDownPolicies?: pulumi.Input<pulumi.Input<inputs.gcp.ElastigroupScalingDownPolicy>[]>;
    /**
     * Contains scaling policies for scaling the Elastigroup up.
     */
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
    /**
     * Period of time (seconds) to remain in an unhealthy status before a replacement is triggered.
     */
    readonly unhealthyDuration?: pulumi.Input<number>;
}
