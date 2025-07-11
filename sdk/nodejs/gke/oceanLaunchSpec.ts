// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Manages a custom Spotinst Ocean GKE Launch Spec resource.
 *
 * > This resource can be imported from GKE node pool or not. If you want to import the node pool and create the VNG from it, please provide `nodePoolName`.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as spotinst from "@pulumi/spotinst";
 *
 * const example = new spotinst.gke.OceanLaunchSpec("example", {
 *     oceanId: "o-123456",
 *     nodePoolName: "default-pool",
 *     name: "specialty.nodes.spotk8s.com",
 *     sourceImage: "image",
 *     restrictScaleDown: true,
 *     rootVolumeSize: 10,
 *     rootVolumeType: "pd-standard",
 *     instanceTypes: ["n1-standard-1, n1-standard-2"],
 *     tags: [
 *         "tag1",
 *         "tag2",
 *     ],
 *     createOptions: {
 *         initialNodes: 1,
 *     },
 *     shieldedInstanceConfig: {
 *         enableSecureBoot: false,
 *         enableIntegrityMonitoring: true,
 *     },
 *     storage: {
 *         localSsdCount: 5,
 *     },
 *     resourceLimits: {
 *         maxInstanceCount: 3,
 *         minInstanceCount: 0,
 *     },
 *     serviceAccount: "default",
 *     metadatas: [{
 *         key: "gci-update-strategy",
 *         value: "update_disabled",
 *     }],
 *     labels: [{
 *         key: "labelKey",
 *         value: "labelVal",
 *     }],
 *     taints: [{
 *         key: "taintKey",
 *         value: "taintVal",
 *         effect: "taintEffect",
 *     }],
 *     autoscaleHeadroomsAutomatics: [{
 *         autoHeadroomPercentage: 5,
 *     }],
 *     autoscaleHeadrooms: [{
 *         numOfUnits: 5,
 *         cpuPerUnit: 1000,
 *         gpuPerUnit: 0,
 *         memoryPerUnit: 2048,
 *     }],
 *     strategies: [{
 *         preemptiblePercentage: 30,
 *         scalingOrientation: "balanced",
 *     }],
 *     schedulingTasks: [{
 *         isEnabled: true,
 *         cronExpression: "0 1 * * *",
 *         taskType: "manualHeadroomUpdate",
 *         taskHeadrooms: [{
 *             numOfUnits: 5,
 *             cpuPerUnit: 1000,
 *             gpuPerUnit: 0,
 *             memoryPerUnit: 2048,
 *         }],
 *     }],
 *     networkInterfaces: [{
 *         network: "test-vng-network",
 *         projectId: "test-vng-network-project",
 *         accessConfigs: [{
 *             name: "external-nat-vng",
 *             type: "ONE_TO_ONE_NAT",
 *         }],
 *         aliasIpRanges: [{
 *             ipCidrRange: "/25",
 *             subnetworkRangeName: "gke-test-native-vpc-pods-123456-vng",
 *         }],
 *     }],
 * });
 * ```
 */
export class OceanLaunchSpec extends pulumi.CustomResource {
    /**
     * Get an existing OceanLaunchSpec resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: OceanLaunchSpecState, opts?: pulumi.CustomResourceOptions): OceanLaunchSpec {
        return new OceanLaunchSpec(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'spotinst:gke/oceanLaunchSpec:OceanLaunchSpec';

    /**
     * Returns true if the given object is an instance of OceanLaunchSpec.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is OceanLaunchSpec {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === OceanLaunchSpec.__pulumiType;
    }

    /**
     * Set custom headroom per launch spec. provide list of headrooms object.
     */
    public readonly autoscaleHeadrooms!: pulumi.Output<outputs.gke.OceanLaunchSpecAutoscaleHeadroom[] | undefined>;
    /**
     * Set automatic headroom per launch spec.
     */
    public readonly autoscaleHeadroomsAutomatics!: pulumi.Output<outputs.gke.OceanLaunchSpecAutoscaleHeadroomsAutomatic[] | undefined>;
    public readonly createOptions!: pulumi.Output<outputs.gke.OceanLaunchSpecCreateOptions | undefined>;
    /**
     * List of supported machine types for the Launch Spec.
     */
    public readonly instanceTypes!: pulumi.Output<string[]>;
    /**
     * Optionally adds labels to instances launched in an Ocean cluster.
     */
    public readonly labels!: pulumi.Output<outputs.gke.OceanLaunchSpecLabel[]>;
    /**
     * Cluster's metadata.
     */
    public readonly metadatas!: pulumi.Output<outputs.gke.OceanLaunchSpecMetadata[]>;
    /**
     * The launch specification name.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Settings for network interfaces.
     */
    public readonly networkInterfaces!: pulumi.Output<outputs.gke.OceanLaunchSpecNetworkInterface[] | undefined>;
    /**
     * The node pool you wish to use in your Launch Spec.
     */
    public readonly nodePoolName!: pulumi.Output<string | undefined>;
    /**
     * The Ocean cluster ID.
     */
    public readonly oceanId!: pulumi.Output<string>;
    /**
     * The Ocean virtual node group resource limits object.
     */
    public readonly resourceLimits!: pulumi.Output<outputs.gke.OceanLaunchSpecResourceLimits | undefined>;
    /**
     * Boolean. When set to `true`, VNG nodes will be treated as if all pods running have the restrict-scale-down label. Therefore, Ocean will not scale nodes down unless empty.
     */
    public readonly restrictScaleDown!: pulumi.Output<boolean>;
    /**
     * Root volume size (in GB).
     */
    public readonly rootVolumeSize!: pulumi.Output<number>;
    /**
     * Root volume disk type. Valid values: `"pd-standard"`, `"pd-ssd"`.
     */
    public readonly rootVolumeType!: pulumi.Output<string>;
    /**
     * Used to define scheduled tasks such as a manual headroom update.
     */
    public readonly schedulingTasks!: pulumi.Output<outputs.gke.OceanLaunchSpecSchedulingTask[] | undefined>;
    /**
     * The account used by applications running on the VM to call GCP APIs.
     */
    public readonly serviceAccount!: pulumi.Output<string>;
    /**
     * The Ocean shielded instance configuration object.
     */
    public readonly shieldedInstanceConfig!: pulumi.Output<outputs.gke.OceanLaunchSpecShieldedInstanceConfig>;
    /**
     * Image URL.
     */
    public readonly sourceImage!: pulumi.Output<string>;
    /**
     * The Ocean virtual node group storage object.
     */
    public readonly storage!: pulumi.Output<outputs.gke.OceanLaunchSpecStorage>;
    /**
     * The Ocean Launch Spec Strategy object.
     */
    public readonly strategies!: pulumi.Output<outputs.gke.OceanLaunchSpecStrategy[] | undefined>;
    /**
     * Every node launched from this configuration will be tagged with those tags. Note: during creation some tags are automatically imported to the state file, it is required to manually add it to the template configuration
     */
    public readonly tags!: pulumi.Output<string[]>;
    /**
     * Optionally adds labels to instances launched in an Ocean cluster.
     */
    public readonly taints!: pulumi.Output<outputs.gke.OceanLaunchSpecTaint[]>;
    public readonly updatePolicy!: pulumi.Output<outputs.gke.OceanLaunchSpecUpdatePolicy | undefined>;

    /**
     * Create a OceanLaunchSpec resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: OceanLaunchSpecArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: OceanLaunchSpecArgs | OceanLaunchSpecState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as OceanLaunchSpecState | undefined;
            resourceInputs["autoscaleHeadrooms"] = state ? state.autoscaleHeadrooms : undefined;
            resourceInputs["autoscaleHeadroomsAutomatics"] = state ? state.autoscaleHeadroomsAutomatics : undefined;
            resourceInputs["createOptions"] = state ? state.createOptions : undefined;
            resourceInputs["instanceTypes"] = state ? state.instanceTypes : undefined;
            resourceInputs["labels"] = state ? state.labels : undefined;
            resourceInputs["metadatas"] = state ? state.metadatas : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["networkInterfaces"] = state ? state.networkInterfaces : undefined;
            resourceInputs["nodePoolName"] = state ? state.nodePoolName : undefined;
            resourceInputs["oceanId"] = state ? state.oceanId : undefined;
            resourceInputs["resourceLimits"] = state ? state.resourceLimits : undefined;
            resourceInputs["restrictScaleDown"] = state ? state.restrictScaleDown : undefined;
            resourceInputs["rootVolumeSize"] = state ? state.rootVolumeSize : undefined;
            resourceInputs["rootVolumeType"] = state ? state.rootVolumeType : undefined;
            resourceInputs["schedulingTasks"] = state ? state.schedulingTasks : undefined;
            resourceInputs["serviceAccount"] = state ? state.serviceAccount : undefined;
            resourceInputs["shieldedInstanceConfig"] = state ? state.shieldedInstanceConfig : undefined;
            resourceInputs["sourceImage"] = state ? state.sourceImage : undefined;
            resourceInputs["storage"] = state ? state.storage : undefined;
            resourceInputs["strategies"] = state ? state.strategies : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["taints"] = state ? state.taints : undefined;
            resourceInputs["updatePolicy"] = state ? state.updatePolicy : undefined;
        } else {
            const args = argsOrState as OceanLaunchSpecArgs | undefined;
            if ((!args || args.oceanId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'oceanId'");
            }
            resourceInputs["autoscaleHeadrooms"] = args ? args.autoscaleHeadrooms : undefined;
            resourceInputs["autoscaleHeadroomsAutomatics"] = args ? args.autoscaleHeadroomsAutomatics : undefined;
            resourceInputs["createOptions"] = args ? args.createOptions : undefined;
            resourceInputs["instanceTypes"] = args ? args.instanceTypes : undefined;
            resourceInputs["labels"] = args ? args.labels : undefined;
            resourceInputs["metadatas"] = args ? args.metadatas : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["networkInterfaces"] = args ? args.networkInterfaces : undefined;
            resourceInputs["nodePoolName"] = args ? args.nodePoolName : undefined;
            resourceInputs["oceanId"] = args ? args.oceanId : undefined;
            resourceInputs["resourceLimits"] = args ? args.resourceLimits : undefined;
            resourceInputs["restrictScaleDown"] = args ? args.restrictScaleDown : undefined;
            resourceInputs["rootVolumeSize"] = args ? args.rootVolumeSize : undefined;
            resourceInputs["rootVolumeType"] = args ? args.rootVolumeType : undefined;
            resourceInputs["schedulingTasks"] = args ? args.schedulingTasks : undefined;
            resourceInputs["serviceAccount"] = args ? args.serviceAccount : undefined;
            resourceInputs["shieldedInstanceConfig"] = args ? args.shieldedInstanceConfig : undefined;
            resourceInputs["sourceImage"] = args ? args.sourceImage : undefined;
            resourceInputs["storage"] = args ? args.storage : undefined;
            resourceInputs["strategies"] = args ? args.strategies : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["taints"] = args ? args.taints : undefined;
            resourceInputs["updatePolicy"] = args ? args.updatePolicy : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(OceanLaunchSpec.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering OceanLaunchSpec resources.
 */
export interface OceanLaunchSpecState {
    /**
     * Set custom headroom per launch spec. provide list of headrooms object.
     */
    autoscaleHeadrooms?: pulumi.Input<pulumi.Input<inputs.gke.OceanLaunchSpecAutoscaleHeadroom>[]>;
    /**
     * Set automatic headroom per launch spec.
     */
    autoscaleHeadroomsAutomatics?: pulumi.Input<pulumi.Input<inputs.gke.OceanLaunchSpecAutoscaleHeadroomsAutomatic>[]>;
    createOptions?: pulumi.Input<inputs.gke.OceanLaunchSpecCreateOptions>;
    /**
     * List of supported machine types for the Launch Spec.
     */
    instanceTypes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Optionally adds labels to instances launched in an Ocean cluster.
     */
    labels?: pulumi.Input<pulumi.Input<inputs.gke.OceanLaunchSpecLabel>[]>;
    /**
     * Cluster's metadata.
     */
    metadatas?: pulumi.Input<pulumi.Input<inputs.gke.OceanLaunchSpecMetadata>[]>;
    /**
     * The launch specification name.
     */
    name?: pulumi.Input<string>;
    /**
     * Settings for network interfaces.
     */
    networkInterfaces?: pulumi.Input<pulumi.Input<inputs.gke.OceanLaunchSpecNetworkInterface>[]>;
    /**
     * The node pool you wish to use in your Launch Spec.
     */
    nodePoolName?: pulumi.Input<string>;
    /**
     * The Ocean cluster ID.
     */
    oceanId?: pulumi.Input<string>;
    /**
     * The Ocean virtual node group resource limits object.
     */
    resourceLimits?: pulumi.Input<inputs.gke.OceanLaunchSpecResourceLimits>;
    /**
     * Boolean. When set to `true`, VNG nodes will be treated as if all pods running have the restrict-scale-down label. Therefore, Ocean will not scale nodes down unless empty.
     */
    restrictScaleDown?: pulumi.Input<boolean>;
    /**
     * Root volume size (in GB).
     */
    rootVolumeSize?: pulumi.Input<number>;
    /**
     * Root volume disk type. Valid values: `"pd-standard"`, `"pd-ssd"`.
     */
    rootVolumeType?: pulumi.Input<string>;
    /**
     * Used to define scheduled tasks such as a manual headroom update.
     */
    schedulingTasks?: pulumi.Input<pulumi.Input<inputs.gke.OceanLaunchSpecSchedulingTask>[]>;
    /**
     * The account used by applications running on the VM to call GCP APIs.
     */
    serviceAccount?: pulumi.Input<string>;
    /**
     * The Ocean shielded instance configuration object.
     */
    shieldedInstanceConfig?: pulumi.Input<inputs.gke.OceanLaunchSpecShieldedInstanceConfig>;
    /**
     * Image URL.
     */
    sourceImage?: pulumi.Input<string>;
    /**
     * The Ocean virtual node group storage object.
     */
    storage?: pulumi.Input<inputs.gke.OceanLaunchSpecStorage>;
    /**
     * The Ocean Launch Spec Strategy object.
     */
    strategies?: pulumi.Input<pulumi.Input<inputs.gke.OceanLaunchSpecStrategy>[]>;
    /**
     * Every node launched from this configuration will be tagged with those tags. Note: during creation some tags are automatically imported to the state file, it is required to manually add it to the template configuration
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Optionally adds labels to instances launched in an Ocean cluster.
     */
    taints?: pulumi.Input<pulumi.Input<inputs.gke.OceanLaunchSpecTaint>[]>;
    updatePolicy?: pulumi.Input<inputs.gke.OceanLaunchSpecUpdatePolicy>;
}

/**
 * The set of arguments for constructing a OceanLaunchSpec resource.
 */
export interface OceanLaunchSpecArgs {
    /**
     * Set custom headroom per launch spec. provide list of headrooms object.
     */
    autoscaleHeadrooms?: pulumi.Input<pulumi.Input<inputs.gke.OceanLaunchSpecAutoscaleHeadroom>[]>;
    /**
     * Set automatic headroom per launch spec.
     */
    autoscaleHeadroomsAutomatics?: pulumi.Input<pulumi.Input<inputs.gke.OceanLaunchSpecAutoscaleHeadroomsAutomatic>[]>;
    createOptions?: pulumi.Input<inputs.gke.OceanLaunchSpecCreateOptions>;
    /**
     * List of supported machine types for the Launch Spec.
     */
    instanceTypes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Optionally adds labels to instances launched in an Ocean cluster.
     */
    labels?: pulumi.Input<pulumi.Input<inputs.gke.OceanLaunchSpecLabel>[]>;
    /**
     * Cluster's metadata.
     */
    metadatas?: pulumi.Input<pulumi.Input<inputs.gke.OceanLaunchSpecMetadata>[]>;
    /**
     * The launch specification name.
     */
    name?: pulumi.Input<string>;
    /**
     * Settings for network interfaces.
     */
    networkInterfaces?: pulumi.Input<pulumi.Input<inputs.gke.OceanLaunchSpecNetworkInterface>[]>;
    /**
     * The node pool you wish to use in your Launch Spec.
     */
    nodePoolName?: pulumi.Input<string>;
    /**
     * The Ocean cluster ID.
     */
    oceanId: pulumi.Input<string>;
    /**
     * The Ocean virtual node group resource limits object.
     */
    resourceLimits?: pulumi.Input<inputs.gke.OceanLaunchSpecResourceLimits>;
    /**
     * Boolean. When set to `true`, VNG nodes will be treated as if all pods running have the restrict-scale-down label. Therefore, Ocean will not scale nodes down unless empty.
     */
    restrictScaleDown?: pulumi.Input<boolean>;
    /**
     * Root volume size (in GB).
     */
    rootVolumeSize?: pulumi.Input<number>;
    /**
     * Root volume disk type. Valid values: `"pd-standard"`, `"pd-ssd"`.
     */
    rootVolumeType?: pulumi.Input<string>;
    /**
     * Used to define scheduled tasks such as a manual headroom update.
     */
    schedulingTasks?: pulumi.Input<pulumi.Input<inputs.gke.OceanLaunchSpecSchedulingTask>[]>;
    /**
     * The account used by applications running on the VM to call GCP APIs.
     */
    serviceAccount?: pulumi.Input<string>;
    /**
     * The Ocean shielded instance configuration object.
     */
    shieldedInstanceConfig?: pulumi.Input<inputs.gke.OceanLaunchSpecShieldedInstanceConfig>;
    /**
     * Image URL.
     */
    sourceImage?: pulumi.Input<string>;
    /**
     * The Ocean virtual node group storage object.
     */
    storage?: pulumi.Input<inputs.gke.OceanLaunchSpecStorage>;
    /**
     * The Ocean Launch Spec Strategy object.
     */
    strategies?: pulumi.Input<pulumi.Input<inputs.gke.OceanLaunchSpecStrategy>[]>;
    /**
     * Every node launched from this configuration will be tagged with those tags. Note: during creation some tags are automatically imported to the state file, it is required to manually add it to the template configuration
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Optionally adds labels to instances launched in an Ocean cluster.
     */
    taints?: pulumi.Input<pulumi.Input<inputs.gke.OceanLaunchSpecTaint>[]>;
    updatePolicy?: pulumi.Input<inputs.gke.OceanLaunchSpecUpdatePolicy>;
}
