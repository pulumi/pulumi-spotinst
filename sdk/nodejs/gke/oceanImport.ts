// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as spotinst from "@pulumi/spotinst";
 *
 * const example = new spotinst.gke.OceanImport("example", {
 *     backendServices: [{
 *         locationType: "regional",
 *         namedPorts: [{
 *             name: "http",
 *             ports: [
 *                 "80",
 *                 "8080",
 *             ],
 *         }],
 *         scheme: "INTERNAL",
 *         serviceName: "example-backend-service",
 *     }],
 *     clusterName: "example-cluster-name",
 *     controllerClusterId: "example-controller-123124",
 *     desiredCapacity: 0,
 *     location: "us-central1-a",
 *     maxSize: 2,
 *     minSize: 0,
 *     rootVolumeType: "pd-ssd",
 *     shieldedInstanceConfig: {
 *         enableIntegrityMonitoring: true,
 *         enableSecureBoot: true,
 *     },
 *     whitelists: [
 *         "n1-standard-1",
 *         "n1-standard-2",
 *     ],
 * });
 * ```
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 *
 * export const oceanId = spotinst_ocean_gke_import.example.id;
 * ```
 * ## Strategy
 *
 * * `strategy` - (Optional) Strategy object.
 *     * `drainingTimeout` - (Optional) The draining timeout (in seconds) before terminating the instance. If no draining timeout is defined, the default draining timeout will be used.
 *     * `provisioningModel` - (Optional) Define the provisioning model of the launched instances. Valid values: `SPOT`, `PREEMPTIBLE`.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * ```
 *
 * <a id="update-policy"></a>
 * ## Update Policy
 *
 * * `updatePolicy` - (Optional)
 *     * `shouldRoll` - (Required) Enables the roll.
 *     * `conditionedRoll` - (Optional, Default: false) Spot will perform a cluster Roll in accordance with a relevant modification of the cluster’s settings. When set to true , only specific changes in the cluster’s configuration will trigger a cluster roll (such as AMI, Key Pair, user data, instance types, load balancers, etc).
 *   
 *     * `rollConfig` - (Required) Holds the roll configuration.
 *         * `batchSizePercentage` - (Required) Sets the percentage of the instances to deploy in each batch.
 *         * `launchSpecIds` - (Optional) List of Virtual Node Group identifiers to be rolled.
 *         * `batchMinHealthyPercentage` - (Optional) Default: 50. Indicates the threshold of minimum healthy instances in single batch. If the amount of healthy instances in single batch is under the threshold, the cluster roll will fail. If exists, the parameter value will be in range of 1-100. In case of null as value, the default value in the backend will be 50%. Value of param should represent the number in percentage (%) of the batch.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * ```
 */
export class OceanImport extends pulumi.CustomResource {
    /**
     * Get an existing OceanImport resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: OceanImportState, opts?: pulumi.CustomResourceOptions): OceanImport {
        return new OceanImport(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'spotinst:gke/oceanImport:OceanImport';

    /**
     * Returns true if the given object is an instance of OceanImport.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is OceanImport {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === OceanImport.__pulumiType;
    }

    /**
     * The Ocean Kubernetes Autoscaler object.
     */
    public readonly autoscaler!: pulumi.Output<outputs.gke.OceanImportAutoscaler>;
    /**
     * Describes the backend service configurations.
     */
    public readonly backendServices!: pulumi.Output<outputs.gke.OceanImportBackendService[] | undefined>;
    public /*out*/ readonly clusterControllerId!: pulumi.Output<string>;
    /**
     * The GKE cluster name.
     */
    public readonly clusterName!: pulumi.Output<string>;
    /**
     * A unique identifier used for connecting the Ocean SaaS platform and the Kubernetes cluster. Typically, the cluster name is used as its identifier.
     */
    public readonly controllerClusterId!: pulumi.Output<string>;
    /**
     * The number of instances to launch and maintain in the cluster.
     */
    public readonly desiredCapacity!: pulumi.Output<number>;
    /**
     * The zone the master cluster is located in.
     */
    public readonly location!: pulumi.Output<string>;
    /**
     * The upper limit of instances the cluster can scale up to.
     */
    public readonly maxSize!: pulumi.Output<number>;
    /**
     * The lower limit of instances the cluster can scale down to.
     */
    public readonly minSize!: pulumi.Output<number>;
    /**
     * The root volume disk type.
     */
    public readonly rootVolumeType!: pulumi.Output<string | undefined>;
    /**
     * Set scheduling object.
     */
    public readonly scheduledTasks!: pulumi.Output<outputs.gke.OceanImportScheduledTask[] | undefined>;
    /**
     * The Ocean shielded instance configuration object.
     */
    public readonly shieldedInstanceConfig!: pulumi.Output<outputs.gke.OceanImportShieldedInstanceConfig>;
    public readonly strategies!: pulumi.Output<outputs.gke.OceanImportStrategy[] | undefined>;
    public readonly updatePolicy!: pulumi.Output<outputs.gke.OceanImportUpdatePolicy | undefined>;
    /**
     * Instance types allowed in the Ocean cluster.
     */
    public readonly whitelists!: pulumi.Output<string[] | undefined>;

    /**
     * Create a OceanImport resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: OceanImportArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: OceanImportArgs | OceanImportState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as OceanImportState | undefined;
            resourceInputs["autoscaler"] = state ? state.autoscaler : undefined;
            resourceInputs["backendServices"] = state ? state.backendServices : undefined;
            resourceInputs["clusterControllerId"] = state ? state.clusterControllerId : undefined;
            resourceInputs["clusterName"] = state ? state.clusterName : undefined;
            resourceInputs["controllerClusterId"] = state ? state.controllerClusterId : undefined;
            resourceInputs["desiredCapacity"] = state ? state.desiredCapacity : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["maxSize"] = state ? state.maxSize : undefined;
            resourceInputs["minSize"] = state ? state.minSize : undefined;
            resourceInputs["rootVolumeType"] = state ? state.rootVolumeType : undefined;
            resourceInputs["scheduledTasks"] = state ? state.scheduledTasks : undefined;
            resourceInputs["shieldedInstanceConfig"] = state ? state.shieldedInstanceConfig : undefined;
            resourceInputs["strategies"] = state ? state.strategies : undefined;
            resourceInputs["updatePolicy"] = state ? state.updatePolicy : undefined;
            resourceInputs["whitelists"] = state ? state.whitelists : undefined;
        } else {
            const args = argsOrState as OceanImportArgs | undefined;
            if ((!args || args.clusterName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'clusterName'");
            }
            if ((!args || args.location === undefined) && !opts.urn) {
                throw new Error("Missing required property 'location'");
            }
            resourceInputs["autoscaler"] = args ? args.autoscaler : undefined;
            resourceInputs["backendServices"] = args ? args.backendServices : undefined;
            resourceInputs["clusterName"] = args ? args.clusterName : undefined;
            resourceInputs["controllerClusterId"] = args ? args.controllerClusterId : undefined;
            resourceInputs["desiredCapacity"] = args ? args.desiredCapacity : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["maxSize"] = args ? args.maxSize : undefined;
            resourceInputs["minSize"] = args ? args.minSize : undefined;
            resourceInputs["rootVolumeType"] = args ? args.rootVolumeType : undefined;
            resourceInputs["scheduledTasks"] = args ? args.scheduledTasks : undefined;
            resourceInputs["shieldedInstanceConfig"] = args ? args.shieldedInstanceConfig : undefined;
            resourceInputs["strategies"] = args ? args.strategies : undefined;
            resourceInputs["updatePolicy"] = args ? args.updatePolicy : undefined;
            resourceInputs["whitelists"] = args ? args.whitelists : undefined;
            resourceInputs["clusterControllerId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(OceanImport.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering OceanImport resources.
 */
export interface OceanImportState {
    /**
     * The Ocean Kubernetes Autoscaler object.
     */
    autoscaler?: pulumi.Input<inputs.gke.OceanImportAutoscaler>;
    /**
     * Describes the backend service configurations.
     */
    backendServices?: pulumi.Input<pulumi.Input<inputs.gke.OceanImportBackendService>[]>;
    clusterControllerId?: pulumi.Input<string>;
    /**
     * The GKE cluster name.
     */
    clusterName?: pulumi.Input<string>;
    /**
     * A unique identifier used for connecting the Ocean SaaS platform and the Kubernetes cluster. Typically, the cluster name is used as its identifier.
     */
    controllerClusterId?: pulumi.Input<string>;
    /**
     * The number of instances to launch and maintain in the cluster.
     */
    desiredCapacity?: pulumi.Input<number>;
    /**
     * The zone the master cluster is located in.
     */
    location?: pulumi.Input<string>;
    /**
     * The upper limit of instances the cluster can scale up to.
     */
    maxSize?: pulumi.Input<number>;
    /**
     * The lower limit of instances the cluster can scale down to.
     */
    minSize?: pulumi.Input<number>;
    /**
     * The root volume disk type.
     */
    rootVolumeType?: pulumi.Input<string>;
    /**
     * Set scheduling object.
     */
    scheduledTasks?: pulumi.Input<pulumi.Input<inputs.gke.OceanImportScheduledTask>[]>;
    /**
     * The Ocean shielded instance configuration object.
     */
    shieldedInstanceConfig?: pulumi.Input<inputs.gke.OceanImportShieldedInstanceConfig>;
    strategies?: pulumi.Input<pulumi.Input<inputs.gke.OceanImportStrategy>[]>;
    updatePolicy?: pulumi.Input<inputs.gke.OceanImportUpdatePolicy>;
    /**
     * Instance types allowed in the Ocean cluster.
     */
    whitelists?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a OceanImport resource.
 */
export interface OceanImportArgs {
    /**
     * The Ocean Kubernetes Autoscaler object.
     */
    autoscaler?: pulumi.Input<inputs.gke.OceanImportAutoscaler>;
    /**
     * Describes the backend service configurations.
     */
    backendServices?: pulumi.Input<pulumi.Input<inputs.gke.OceanImportBackendService>[]>;
    /**
     * The GKE cluster name.
     */
    clusterName: pulumi.Input<string>;
    /**
     * A unique identifier used for connecting the Ocean SaaS platform and the Kubernetes cluster. Typically, the cluster name is used as its identifier.
     */
    controllerClusterId?: pulumi.Input<string>;
    /**
     * The number of instances to launch and maintain in the cluster.
     */
    desiredCapacity?: pulumi.Input<number>;
    /**
     * The zone the master cluster is located in.
     */
    location: pulumi.Input<string>;
    /**
     * The upper limit of instances the cluster can scale up to.
     */
    maxSize?: pulumi.Input<number>;
    /**
     * The lower limit of instances the cluster can scale down to.
     */
    minSize?: pulumi.Input<number>;
    /**
     * The root volume disk type.
     */
    rootVolumeType?: pulumi.Input<string>;
    /**
     * Set scheduling object.
     */
    scheduledTasks?: pulumi.Input<pulumi.Input<inputs.gke.OceanImportScheduledTask>[]>;
    /**
     * The Ocean shielded instance configuration object.
     */
    shieldedInstanceConfig?: pulumi.Input<inputs.gke.OceanImportShieldedInstanceConfig>;
    strategies?: pulumi.Input<pulumi.Input<inputs.gke.OceanImportStrategy>[]>;
    updatePolicy?: pulumi.Input<inputs.gke.OceanImportUpdatePolicy>;
    /**
     * Instance types allowed in the Ocean cluster.
     */
    whitelists?: pulumi.Input<pulumi.Input<string>[]>;
}
