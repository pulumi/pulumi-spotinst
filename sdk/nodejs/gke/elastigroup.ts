// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * Provides a Spotinst Elastigroup GKE resource. Please see [Importing a GKE cluster](https://api.spotinst.com/elastigroup-for-google-cloud/tutorials/import-a-gke-cluster-as-an-elastigroup/) for detailed information.
 *
 * ## Example Usage
 *
 * A spotinst.gke.Elastigroup supports all of the fields defined in spotinst_elastigroup_gcp.
 *
 * There are two main differences:
 *
 * * you must include `clusterZoneName` and `clusterId`
 * * a handful of parameters are created remotely and will not appear in the diff. A complete list can be found below.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as spotinst from "@pulumi/spotinst";
 *
 * const example_gke_elastigroup = new spotinst.gke.Elastigroup("example-gke-elastigroup", {
 *     backendServices: [{
 *         locationType: "global",
 *         namedPorts: [{
 *             name: "http",
 *             ports: [
 *                 "80",
 *                 "8080",
 *             ],
 *         }],
 *         serviceName: "backend-service",
 *     }],
 *     // cluster_id        = "sample-acc-test-cluster" // deprecated
 *     clusterZoneName: "us-central1-a",
 *     desiredCapacity: 3,
 *     // --- INSTANCE TYPES --------------------------------
 *     instanceTypesOndemand: "n1-standard-1",
 *     instanceTypesPreemptibles: [
 *         "n1-standard-1",
 *         "n1-standard-2",
 *     ],
 *     integrationGke: {
 *         autoscaleCooldown: 300,
 *         autoscaleDown: {
 *             evaluationPeriods: 300,
 *         },
 *         autoscaleHeadroom: {
 *             cpuPerUnit: 1024,
 *             memoryPerUnit: 512,
 *             numOfUnits: 2,
 *         },
 *         autoscaleIsAutoConfig: false,
 *         autoscaleIsEnabled: true,
 *         autoscaleLabels: [{
 *             key: "label_key",
 *             value: "label_value",
 *         }],
 *         clusterId: "example-cluster-id",
 *         location: "us-central1-a",
 *     },
 *     // --- CAPACITY ------------
 *     maxSize: 5,
 *     minSize: 1,
 *     nodeImage: "COS",
 *     // --- STRATEGY --------------------
 *     preemptiblePercentage: 100,
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
    public static readonly __pulumiType = 'spotinst:gke/elastigroup:Elastigroup';

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

    public readonly backendServices!: pulumi.Output<outputs.gke.ElastigroupBackendService[] | undefined>;
    /**
     * The GKE cluster ID you wish to import.
     *
     * @deprecated Please define cluster_id under integration_gke
     */
    public readonly clusterId!: pulumi.Output<string | undefined>;
    /**
     * The zone where the cluster is hosted.
     */
    public readonly clusterZoneName!: pulumi.Output<string>;
    public readonly desiredCapacity!: pulumi.Output<number>;
    public readonly disks!: pulumi.Output<outputs.gke.ElastigroupDisk[] | undefined>;
    public readonly drainingTimeout!: pulumi.Output<number | undefined>;
    public readonly fallbackToOndemand!: pulumi.Output<boolean | undefined>;
    public readonly gpu!: pulumi.Output<outputs.gke.ElastigroupGpu[] | undefined>;
    public readonly instanceTypesCustoms!: pulumi.Output<outputs.gke.ElastigroupInstanceTypesCustom[] | undefined>;
    public readonly instanceTypesOndemand!: pulumi.Output<string | undefined>;
    public readonly instanceTypesPreemptibles!: pulumi.Output<string[] | undefined>;
    public readonly integrationDockerSwarm!: pulumi.Output<outputs.gke.ElastigroupIntegrationDockerSwarm | undefined>;
    /**
     * Describes the GKE integration.
     */
    public readonly integrationGke!: pulumi.Output<outputs.gke.ElastigroupIntegrationGke | undefined>;
    public readonly ipForwarding!: pulumi.Output<boolean | undefined>;
    public readonly labels!: pulumi.Output<outputs.gke.ElastigroupLabel[] | undefined>;
    public readonly maxSize!: pulumi.Output<number>;
    public readonly metadatas!: pulumi.Output<outputs.gke.ElastigroupMetadata[] | undefined>;
    public readonly minSize!: pulumi.Output<number>;
    public readonly name!: pulumi.Output<string>;
    public readonly networkInterfaces!: pulumi.Output<outputs.gke.ElastigroupNetworkInterface[] | undefined>;
    /**
     * The image that will be used for the node VMs. Possible values: COS, UBUNTU.
     */
    public readonly nodeImage!: pulumi.Output<string | undefined>;
    public readonly ondemandCount!: pulumi.Output<number | undefined>;
    public readonly preemptiblePercentage!: pulumi.Output<number | undefined>;
    public readonly provisioningModel!: pulumi.Output<string | undefined>;
    public readonly scalingDownPolicies!: pulumi.Output<outputs.gke.ElastigroupScalingDownPolicy[] | undefined>;
    public readonly scalingUpPolicies!: pulumi.Output<outputs.gke.ElastigroupScalingUpPolicy[] | undefined>;
    public readonly serviceAccount!: pulumi.Output<string | undefined>;
    public readonly shutdownScript!: pulumi.Output<string | undefined>;
    public readonly startupScript!: pulumi.Output<string | undefined>;
    public readonly tags!: pulumi.Output<string[] | undefined>;

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
            resourceInputs["backendServices"] = state ? state.backendServices : undefined;
            resourceInputs["clusterId"] = state ? state.clusterId : undefined;
            resourceInputs["clusterZoneName"] = state ? state.clusterZoneName : undefined;
            resourceInputs["desiredCapacity"] = state ? state.desiredCapacity : undefined;
            resourceInputs["disks"] = state ? state.disks : undefined;
            resourceInputs["drainingTimeout"] = state ? state.drainingTimeout : undefined;
            resourceInputs["fallbackToOndemand"] = state ? state.fallbackToOndemand : undefined;
            resourceInputs["gpu"] = state ? state.gpu : undefined;
            resourceInputs["instanceTypesCustoms"] = state ? state.instanceTypesCustoms : undefined;
            resourceInputs["instanceTypesOndemand"] = state ? state.instanceTypesOndemand : undefined;
            resourceInputs["instanceTypesPreemptibles"] = state ? state.instanceTypesPreemptibles : undefined;
            resourceInputs["integrationDockerSwarm"] = state ? state.integrationDockerSwarm : undefined;
            resourceInputs["integrationGke"] = state ? state.integrationGke : undefined;
            resourceInputs["ipForwarding"] = state ? state.ipForwarding : undefined;
            resourceInputs["labels"] = state ? state.labels : undefined;
            resourceInputs["maxSize"] = state ? state.maxSize : undefined;
            resourceInputs["metadatas"] = state ? state.metadatas : undefined;
            resourceInputs["minSize"] = state ? state.minSize : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["networkInterfaces"] = state ? state.networkInterfaces : undefined;
            resourceInputs["nodeImage"] = state ? state.nodeImage : undefined;
            resourceInputs["ondemandCount"] = state ? state.ondemandCount : undefined;
            resourceInputs["preemptiblePercentage"] = state ? state.preemptiblePercentage : undefined;
            resourceInputs["provisioningModel"] = state ? state.provisioningModel : undefined;
            resourceInputs["scalingDownPolicies"] = state ? state.scalingDownPolicies : undefined;
            resourceInputs["scalingUpPolicies"] = state ? state.scalingUpPolicies : undefined;
            resourceInputs["serviceAccount"] = state ? state.serviceAccount : undefined;
            resourceInputs["shutdownScript"] = state ? state.shutdownScript : undefined;
            resourceInputs["startupScript"] = state ? state.startupScript : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
        } else {
            const args = argsOrState as ElastigroupArgs | undefined;
            if ((!args || args.clusterZoneName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'clusterZoneName'");
            }
            if ((!args || args.desiredCapacity === undefined) && !opts.urn) {
                throw new Error("Missing required property 'desiredCapacity'");
            }
            resourceInputs["backendServices"] = args ? args.backendServices : undefined;
            resourceInputs["clusterId"] = args ? args.clusterId : undefined;
            resourceInputs["clusterZoneName"] = args ? args.clusterZoneName : undefined;
            resourceInputs["desiredCapacity"] = args ? args.desiredCapacity : undefined;
            resourceInputs["disks"] = args ? args.disks : undefined;
            resourceInputs["drainingTimeout"] = args ? args.drainingTimeout : undefined;
            resourceInputs["fallbackToOndemand"] = args ? args.fallbackToOndemand : undefined;
            resourceInputs["gpu"] = args ? args.gpu : undefined;
            resourceInputs["instanceTypesCustoms"] = args ? args.instanceTypesCustoms : undefined;
            resourceInputs["instanceTypesOndemand"] = args ? args.instanceTypesOndemand : undefined;
            resourceInputs["instanceTypesPreemptibles"] = args ? args.instanceTypesPreemptibles : undefined;
            resourceInputs["integrationDockerSwarm"] = args ? args.integrationDockerSwarm : undefined;
            resourceInputs["integrationGke"] = args ? args.integrationGke : undefined;
            resourceInputs["ipForwarding"] = args ? args.ipForwarding : undefined;
            resourceInputs["labels"] = args ? args.labels : undefined;
            resourceInputs["maxSize"] = args ? args.maxSize : undefined;
            resourceInputs["metadatas"] = args ? args.metadatas : undefined;
            resourceInputs["minSize"] = args ? args.minSize : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["networkInterfaces"] = args ? args.networkInterfaces : undefined;
            resourceInputs["nodeImage"] = args ? args.nodeImage : undefined;
            resourceInputs["ondemandCount"] = args ? args.ondemandCount : undefined;
            resourceInputs["preemptiblePercentage"] = args ? args.preemptiblePercentage : undefined;
            resourceInputs["provisioningModel"] = args ? args.provisioningModel : undefined;
            resourceInputs["scalingDownPolicies"] = args ? args.scalingDownPolicies : undefined;
            resourceInputs["scalingUpPolicies"] = args ? args.scalingUpPolicies : undefined;
            resourceInputs["serviceAccount"] = args ? args.serviceAccount : undefined;
            resourceInputs["shutdownScript"] = args ? args.shutdownScript : undefined;
            resourceInputs["startupScript"] = args ? args.startupScript : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Elastigroup.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Elastigroup resources.
 */
export interface ElastigroupState {
    backendServices?: pulumi.Input<pulumi.Input<inputs.gke.ElastigroupBackendService>[]>;
    /**
     * The GKE cluster ID you wish to import.
     *
     * @deprecated Please define cluster_id under integration_gke
     */
    clusterId?: pulumi.Input<string>;
    /**
     * The zone where the cluster is hosted.
     */
    clusterZoneName?: pulumi.Input<string>;
    desiredCapacity?: pulumi.Input<number>;
    disks?: pulumi.Input<pulumi.Input<inputs.gke.ElastigroupDisk>[]>;
    drainingTimeout?: pulumi.Input<number>;
    fallbackToOndemand?: pulumi.Input<boolean>;
    gpu?: pulumi.Input<pulumi.Input<inputs.gke.ElastigroupGpu>[]>;
    instanceTypesCustoms?: pulumi.Input<pulumi.Input<inputs.gke.ElastigroupInstanceTypesCustom>[]>;
    instanceTypesOndemand?: pulumi.Input<string>;
    instanceTypesPreemptibles?: pulumi.Input<pulumi.Input<string>[]>;
    integrationDockerSwarm?: pulumi.Input<inputs.gke.ElastigroupIntegrationDockerSwarm>;
    /**
     * Describes the GKE integration.
     */
    integrationGke?: pulumi.Input<inputs.gke.ElastigroupIntegrationGke>;
    ipForwarding?: pulumi.Input<boolean>;
    labels?: pulumi.Input<pulumi.Input<inputs.gke.ElastigroupLabel>[]>;
    maxSize?: pulumi.Input<number>;
    metadatas?: pulumi.Input<pulumi.Input<inputs.gke.ElastigroupMetadata>[]>;
    minSize?: pulumi.Input<number>;
    name?: pulumi.Input<string>;
    networkInterfaces?: pulumi.Input<pulumi.Input<inputs.gke.ElastigroupNetworkInterface>[]>;
    /**
     * The image that will be used for the node VMs. Possible values: COS, UBUNTU.
     */
    nodeImage?: pulumi.Input<string>;
    ondemandCount?: pulumi.Input<number>;
    preemptiblePercentage?: pulumi.Input<number>;
    provisioningModel?: pulumi.Input<string>;
    scalingDownPolicies?: pulumi.Input<pulumi.Input<inputs.gke.ElastigroupScalingDownPolicy>[]>;
    scalingUpPolicies?: pulumi.Input<pulumi.Input<inputs.gke.ElastigroupScalingUpPolicy>[]>;
    serviceAccount?: pulumi.Input<string>;
    shutdownScript?: pulumi.Input<string>;
    startupScript?: pulumi.Input<string>;
    tags?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a Elastigroup resource.
 */
export interface ElastigroupArgs {
    backendServices?: pulumi.Input<pulumi.Input<inputs.gke.ElastigroupBackendService>[]>;
    /**
     * The GKE cluster ID you wish to import.
     *
     * @deprecated Please define cluster_id under integration_gke
     */
    clusterId?: pulumi.Input<string>;
    /**
     * The zone where the cluster is hosted.
     */
    clusterZoneName: pulumi.Input<string>;
    desiredCapacity: pulumi.Input<number>;
    disks?: pulumi.Input<pulumi.Input<inputs.gke.ElastigroupDisk>[]>;
    drainingTimeout?: pulumi.Input<number>;
    fallbackToOndemand?: pulumi.Input<boolean>;
    gpu?: pulumi.Input<pulumi.Input<inputs.gke.ElastigroupGpu>[]>;
    instanceTypesCustoms?: pulumi.Input<pulumi.Input<inputs.gke.ElastigroupInstanceTypesCustom>[]>;
    instanceTypesOndemand?: pulumi.Input<string>;
    instanceTypesPreemptibles?: pulumi.Input<pulumi.Input<string>[]>;
    integrationDockerSwarm?: pulumi.Input<inputs.gke.ElastigroupIntegrationDockerSwarm>;
    /**
     * Describes the GKE integration.
     */
    integrationGke?: pulumi.Input<inputs.gke.ElastigroupIntegrationGke>;
    ipForwarding?: pulumi.Input<boolean>;
    labels?: pulumi.Input<pulumi.Input<inputs.gke.ElastigroupLabel>[]>;
    maxSize?: pulumi.Input<number>;
    metadatas?: pulumi.Input<pulumi.Input<inputs.gke.ElastigroupMetadata>[]>;
    minSize?: pulumi.Input<number>;
    name?: pulumi.Input<string>;
    networkInterfaces?: pulumi.Input<pulumi.Input<inputs.gke.ElastigroupNetworkInterface>[]>;
    /**
     * The image that will be used for the node VMs. Possible values: COS, UBUNTU.
     */
    nodeImage?: pulumi.Input<string>;
    ondemandCount?: pulumi.Input<number>;
    preemptiblePercentage?: pulumi.Input<number>;
    provisioningModel?: pulumi.Input<string>;
    scalingDownPolicies?: pulumi.Input<pulumi.Input<inputs.gke.ElastigroupScalingDownPolicy>[]>;
    scalingUpPolicies?: pulumi.Input<pulumi.Input<inputs.gke.ElastigroupScalingUpPolicy>[]>;
    serviceAccount?: pulumi.Input<string>;
    shutdownScript?: pulumi.Input<string>;
    startupScript?: pulumi.Input<string>;
    tags?: pulumi.Input<pulumi.Input<string>[]>;
}
