// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Provides a custom Spotinst Ocean GKE Launch Spec resource.
 *
 * ## Example Usage
 *
 *
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as spotinst from "@pulumi/spotinst";
 *
 * const example = new spotinst.gke.OceanLaunchSpec("example", {
 *     autoscaleHeadrooms: [{
 *         cpuPerUnit: 1000,
 *         gpuPerUnit: 0,
 *         memoryPerUnit: 2048,
 *         numOfUnits: 5,
 *     }],
 *     labels: [{
 *         key: "labelKey",
 *         value: "labelVal",
 *     }],
 *     metadatas: [{
 *         key: "gci-update-strategy",
 *         value: "updateDisabled",
 *     }],
 *     oceanId: "o-123456",
 *     sourceImage: "image",
 *     taints: [{
 *         effect: "taintEffect",
 *         key: "taintKey",
 *         value: "taintVal",
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
     * Cluster's labels.
     */
    public readonly labels!: pulumi.Output<outputs.gke.OceanLaunchSpecLabel[] | undefined>;
    /**
     * Cluster's metadata.
     */
    public readonly metadatas!: pulumi.Output<outputs.gke.OceanLaunchSpecMetadata[]>;
    /**
     * The Ocean cluster ID required for launchSpec create. 
     */
    public readonly oceanId!: pulumi.Output<string>;
    /**
     * Image URL.
     */
    public readonly sourceImage!: pulumi.Output<string>;
    /**
     * Cluster's taints.
     */
    public readonly taints!: pulumi.Output<outputs.gke.OceanLaunchSpecTaint[] | undefined>;

    /**
     * Create a OceanLaunchSpec resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: OceanLaunchSpecArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: OceanLaunchSpecArgs | OceanLaunchSpecState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as OceanLaunchSpecState | undefined;
            inputs["autoscaleHeadrooms"] = state ? state.autoscaleHeadrooms : undefined;
            inputs["labels"] = state ? state.labels : undefined;
            inputs["metadatas"] = state ? state.metadatas : undefined;
            inputs["oceanId"] = state ? state.oceanId : undefined;
            inputs["sourceImage"] = state ? state.sourceImage : undefined;
            inputs["taints"] = state ? state.taints : undefined;
        } else {
            const args = argsOrState as OceanLaunchSpecArgs | undefined;
            if (!args || args.metadatas === undefined) {
                throw new Error("Missing required property 'metadatas'");
            }
            if (!args || args.oceanId === undefined) {
                throw new Error("Missing required property 'oceanId'");
            }
            if (!args || args.sourceImage === undefined) {
                throw new Error("Missing required property 'sourceImage'");
            }
            inputs["autoscaleHeadrooms"] = args ? args.autoscaleHeadrooms : undefined;
            inputs["labels"] = args ? args.labels : undefined;
            inputs["metadatas"] = args ? args.metadatas : undefined;
            inputs["oceanId"] = args ? args.oceanId : undefined;
            inputs["sourceImage"] = args ? args.sourceImage : undefined;
            inputs["taints"] = args ? args.taints : undefined;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(OceanLaunchSpec.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering OceanLaunchSpec resources.
 */
export interface OceanLaunchSpecState {
    /**
     * Set custom headroom per launch spec. provide list of headrooms object.
     */
    readonly autoscaleHeadrooms?: pulumi.Input<pulumi.Input<inputs.gke.OceanLaunchSpecAutoscaleHeadroom>[]>;
    /**
     * Cluster's labels.
     */
    readonly labels?: pulumi.Input<pulumi.Input<inputs.gke.OceanLaunchSpecLabel>[]>;
    /**
     * Cluster's metadata.
     */
    readonly metadatas?: pulumi.Input<pulumi.Input<inputs.gke.OceanLaunchSpecMetadata>[]>;
    /**
     * The Ocean cluster ID required for launchSpec create. 
     */
    readonly oceanId?: pulumi.Input<string>;
    /**
     * Image URL.
     */
    readonly sourceImage?: pulumi.Input<string>;
    /**
     * Cluster's taints.
     */
    readonly taints?: pulumi.Input<pulumi.Input<inputs.gke.OceanLaunchSpecTaint>[]>;
}

/**
 * The set of arguments for constructing a OceanLaunchSpec resource.
 */
export interface OceanLaunchSpecArgs {
    /**
     * Set custom headroom per launch spec. provide list of headrooms object.
     */
    readonly autoscaleHeadrooms?: pulumi.Input<pulumi.Input<inputs.gke.OceanLaunchSpecAutoscaleHeadroom>[]>;
    /**
     * Cluster's labels.
     */
    readonly labels?: pulumi.Input<pulumi.Input<inputs.gke.OceanLaunchSpecLabel>[]>;
    /**
     * Cluster's metadata.
     */
    readonly metadatas: pulumi.Input<pulumi.Input<inputs.gke.OceanLaunchSpecMetadata>[]>;
    /**
     * The Ocean cluster ID required for launchSpec create. 
     */
    readonly oceanId: pulumi.Input<string>;
    /**
     * Image URL.
     */
    readonly sourceImage: pulumi.Input<string>;
    /**
     * Cluster's taints.
     */
    readonly taints?: pulumi.Input<pulumi.Input<inputs.gke.OceanLaunchSpecTaint>[]>;
}
