// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as spotinst from "@pulumi/spotinst";
 *
 * const example = new spotinst.gke.OceanImport("example", {
 *     clusterName: "example-cluster-name",
 *     controllerClusterId: "example-controller-123124",
 *     location: "us-central1-a",
 *     minSize: 0,
 *     maxSize: 2,
 *     desiredCapacity: 0,
 *     whitelists: [
 *         "n1-standard-1",
 *         "n1-standard-2",
 *     ],
 *     filters: {
 *         excludeFamilies: ["n2"],
 *         includeFamilies: [
 *             "c2",
 *             "c3",
 *         ],
 *         minMemoryGib: 8,
 *         maxMemoryGib: 16,
 *         minVcpu: 2,
 *         maxVcpu: 16,
 *     },
 *     backendServices: [{
 *         serviceName: "example-backend-service",
 *         locationType: "regional",
 *         scheme: "INTERNAL",
 *         namedPorts: [{
 *             name: "http",
 *             ports: [
 *                 "80",
 *                 "8080",
 *             ],
 *         }],
 *     }],
 *     rootVolumeType: "pd-ssd",
 *     shieldedInstanceConfig: {
 *         enableSecureBoot: true,
 *         enableIntegrityMonitoring: true,
 *     },
 *     useAsTemplateOnly: false,
 * });
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
    /**
     * Instance types to avoid launching in the Ocean cluster. Cannot be configured if whitelist list is configured.
     */
    public readonly blacklists!: pulumi.Output<string[] | undefined>;
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
     * List of filters. The Instance types that match with all filters compose the Ocean's whitelist parameter. Cannot be configured together with whitelist/blacklist.
     */
    public readonly filters!: pulumi.Output<outputs.gke.OceanImportFilters | undefined>;
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
    /**
     * Strategy object.
     */
    public readonly strategies!: pulumi.Output<outputs.gke.OceanImportStrategy[] | undefined>;
    public readonly updatePolicy!: pulumi.Output<outputs.gke.OceanImportUpdatePolicy | undefined>;
    /**
     * launch specification defined on the Ocean object will function only as a template for virtual node groups.
     */
    public readonly useAsTemplateOnly!: pulumi.Output<boolean | undefined>;
    /**
     * Instance types allowed in the Ocean cluster. Cannot be configured if blacklist list is configured.
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
            resourceInputs["blacklists"] = state ? state.blacklists : undefined;
            resourceInputs["clusterControllerId"] = state ? state.clusterControllerId : undefined;
            resourceInputs["clusterName"] = state ? state.clusterName : undefined;
            resourceInputs["controllerClusterId"] = state ? state.controllerClusterId : undefined;
            resourceInputs["desiredCapacity"] = state ? state.desiredCapacity : undefined;
            resourceInputs["filters"] = state ? state.filters : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["maxSize"] = state ? state.maxSize : undefined;
            resourceInputs["minSize"] = state ? state.minSize : undefined;
            resourceInputs["rootVolumeType"] = state ? state.rootVolumeType : undefined;
            resourceInputs["scheduledTasks"] = state ? state.scheduledTasks : undefined;
            resourceInputs["shieldedInstanceConfig"] = state ? state.shieldedInstanceConfig : undefined;
            resourceInputs["strategies"] = state ? state.strategies : undefined;
            resourceInputs["updatePolicy"] = state ? state.updatePolicy : undefined;
            resourceInputs["useAsTemplateOnly"] = state ? state.useAsTemplateOnly : undefined;
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
            resourceInputs["blacklists"] = args ? args.blacklists : undefined;
            resourceInputs["clusterName"] = args ? args.clusterName : undefined;
            resourceInputs["controllerClusterId"] = args ? args.controllerClusterId : undefined;
            resourceInputs["desiredCapacity"] = args ? args.desiredCapacity : undefined;
            resourceInputs["filters"] = args ? args.filters : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["maxSize"] = args ? args.maxSize : undefined;
            resourceInputs["minSize"] = args ? args.minSize : undefined;
            resourceInputs["rootVolumeType"] = args ? args.rootVolumeType : undefined;
            resourceInputs["scheduledTasks"] = args ? args.scheduledTasks : undefined;
            resourceInputs["shieldedInstanceConfig"] = args ? args.shieldedInstanceConfig : undefined;
            resourceInputs["strategies"] = args ? args.strategies : undefined;
            resourceInputs["updatePolicy"] = args ? args.updatePolicy : undefined;
            resourceInputs["useAsTemplateOnly"] = args ? args.useAsTemplateOnly : undefined;
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
    /**
     * Instance types to avoid launching in the Ocean cluster. Cannot be configured if whitelist list is configured.
     */
    blacklists?: pulumi.Input<pulumi.Input<string>[]>;
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
     * List of filters. The Instance types that match with all filters compose the Ocean's whitelist parameter. Cannot be configured together with whitelist/blacklist.
     */
    filters?: pulumi.Input<inputs.gke.OceanImportFilters>;
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
    /**
     * Strategy object.
     */
    strategies?: pulumi.Input<pulumi.Input<inputs.gke.OceanImportStrategy>[]>;
    updatePolicy?: pulumi.Input<inputs.gke.OceanImportUpdatePolicy>;
    /**
     * launch specification defined on the Ocean object will function only as a template for virtual node groups.
     */
    useAsTemplateOnly?: pulumi.Input<boolean>;
    /**
     * Instance types allowed in the Ocean cluster. Cannot be configured if blacklist list is configured.
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
     * Instance types to avoid launching in the Ocean cluster. Cannot be configured if whitelist list is configured.
     */
    blacklists?: pulumi.Input<pulumi.Input<string>[]>;
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
     * List of filters. The Instance types that match with all filters compose the Ocean's whitelist parameter. Cannot be configured together with whitelist/blacklist.
     */
    filters?: pulumi.Input<inputs.gke.OceanImportFilters>;
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
    /**
     * Strategy object.
     */
    strategies?: pulumi.Input<pulumi.Input<inputs.gke.OceanImportStrategy>[]>;
    updatePolicy?: pulumi.Input<inputs.gke.OceanImportUpdatePolicy>;
    /**
     * launch specification defined on the Ocean object will function only as a template for virtual node groups.
     */
    useAsTemplateOnly?: pulumi.Input<boolean>;
    /**
     * Instance types allowed in the Ocean cluster. Cannot be configured if blacklist list is configured.
     */
    whitelists?: pulumi.Input<pulumi.Input<string>[]>;
}
