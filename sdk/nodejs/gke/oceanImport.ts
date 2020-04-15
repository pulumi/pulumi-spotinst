// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Provides a Spotinst Ocean GKE import resource.
 * 
 * ## Example Usage
 * 
 * 
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
 *     desiredCapacity: 0,
 *     location: "us-central1-a",
 *     maxSize: 2,
 *     minSize: 0,
 *     whitelists: [
 *         "n1-standard-1",
 *         "n1-standard-2",
 *     ],
 * });
 * ```
 * 
 * ## scheduled task
 * 
 * * `scheduledTask` - (Optional) Set scheduling object.
 *     * `shutdownHours` - (Optional) Set shutdown hours for cluster object.
 *         * `isEnabled` - (Optional)  Flag to enable / disable the shutdown hours.
 *                                      Example: True
 *         * `timeWindows` - (Required) Set time windows for shutdown hours. specify a list of 'timeWindows' with at least one time window Each string is in the format of - ddd:hh:mm-ddd:hh:mm ddd = day of week = Sun | Mon | Tue | Wed | Thu | Fri | Sat hh = hour 24 = 0 -23 mm = minute = 0 - 59. Time windows should not overlap. required on cluster.scheduling.isEnabled = True. API Times are in UTC
 *                                       Example: Fri:15:30-Wed:14:30
 *     * `tasks` - (Optional) The scheduling tasks for the cluster.
 *         * `isEnabled` - (Required)  Describes whether the task is enabled. When true the task should run when false it should not run. Required for cluster.scheduling.tasks object.
 *         * `cronExpression` - (Required) A valid cron expression. For example : " * * * * * ".The cron is running in UTC time zone and is in Unix cron format Cron Expression Validator Script. Only one of ‘frequency’ or ‘cronExpression’ should be used at a time. Required for cluster.scheduling.tasks object
 *                                          Example: 0 1 * * *
 *         * `taskType` - (Required) Valid values: "clusterRoll". Required for cluster.scheduling.tasks object.
 *         * `batchSizePercentage` - (Optional)  Value in % to set size of batch in roll. Valid values are 0-100
 *                                                 Example: 20.
 *                           
 *              
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * ```
 *
 * > This content is derived from https://github.com/terraform-providers/terraform-provider-spotinst/blob/master/website/docs/r/ocean_gke_import.html.markdown.
 */
export class OceanImport extends pulumi.CustomResource {
    /**
     * Get an existing OceanImport resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
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
     * Describes the backend service configurations.
     */
    public readonly backendServices!: pulumi.Output<outputs.gke.OceanImportBackendService[] | undefined>;
    public /*out*/ readonly clusterControllerId!: pulumi.Output<string>;
    /**
     * The GKE cluster name.
     */
    public readonly clusterName!: pulumi.Output<string>;
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
    public readonly scheduledTasks!: pulumi.Output<outputs.gke.OceanImportScheduledTask[] | undefined>;
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
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as OceanImportState | undefined;
            inputs["backendServices"] = state ? state.backendServices : undefined;
            inputs["clusterControllerId"] = state ? state.clusterControllerId : undefined;
            inputs["clusterName"] = state ? state.clusterName : undefined;
            inputs["desiredCapacity"] = state ? state.desiredCapacity : undefined;
            inputs["location"] = state ? state.location : undefined;
            inputs["maxSize"] = state ? state.maxSize : undefined;
            inputs["minSize"] = state ? state.minSize : undefined;
            inputs["scheduledTasks"] = state ? state.scheduledTasks : undefined;
            inputs["whitelists"] = state ? state.whitelists : undefined;
        } else {
            const args = argsOrState as OceanImportArgs | undefined;
            if (!args || args.clusterName === undefined) {
                throw new Error("Missing required property 'clusterName'");
            }
            if (!args || args.location === undefined) {
                throw new Error("Missing required property 'location'");
            }
            inputs["backendServices"] = args ? args.backendServices : undefined;
            inputs["clusterName"] = args ? args.clusterName : undefined;
            inputs["desiredCapacity"] = args ? args.desiredCapacity : undefined;
            inputs["location"] = args ? args.location : undefined;
            inputs["maxSize"] = args ? args.maxSize : undefined;
            inputs["minSize"] = args ? args.minSize : undefined;
            inputs["scheduledTasks"] = args ? args.scheduledTasks : undefined;
            inputs["whitelists"] = args ? args.whitelists : undefined;
            inputs["clusterControllerId"] = undefined /*out*/;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(OceanImport.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering OceanImport resources.
 */
export interface OceanImportState {
    /**
     * Describes the backend service configurations.
     */
    readonly backendServices?: pulumi.Input<pulumi.Input<inputs.gke.OceanImportBackendService>[]>;
    readonly clusterControllerId?: pulumi.Input<string>;
    /**
     * The GKE cluster name.
     */
    readonly clusterName?: pulumi.Input<string>;
    /**
     * The number of instances to launch and maintain in the cluster. 
     */
    readonly desiredCapacity?: pulumi.Input<number>;
    /**
     * The zone the master cluster is located in. 
     */
    readonly location?: pulumi.Input<string>;
    /**
     * The upper limit of instances the cluster can scale up to.
     */
    readonly maxSize?: pulumi.Input<number>;
    /**
     * The lower limit of instances the cluster can scale down to.
     */
    readonly minSize?: pulumi.Input<number>;
    readonly scheduledTasks?: pulumi.Input<pulumi.Input<inputs.gke.OceanImportScheduledTask>[]>;
    readonly whitelists?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a OceanImport resource.
 */
export interface OceanImportArgs {
    /**
     * Describes the backend service configurations.
     */
    readonly backendServices?: pulumi.Input<pulumi.Input<inputs.gke.OceanImportBackendService>[]>;
    /**
     * The GKE cluster name.
     */
    readonly clusterName: pulumi.Input<string>;
    /**
     * The number of instances to launch and maintain in the cluster. 
     */
    readonly desiredCapacity?: pulumi.Input<number>;
    /**
     * The zone the master cluster is located in. 
     */
    readonly location: pulumi.Input<string>;
    /**
     * The upper limit of instances the cluster can scale up to.
     */
    readonly maxSize?: pulumi.Input<number>;
    /**
     * The lower limit of instances the cluster can scale down to.
     */
    readonly minSize?: pulumi.Input<number>;
    readonly scheduledTasks?: pulumi.Input<pulumi.Input<inputs.gke.OceanImportScheduledTask>[]>;
    readonly whitelists?: pulumi.Input<pulumi.Input<string>[]>;
}
