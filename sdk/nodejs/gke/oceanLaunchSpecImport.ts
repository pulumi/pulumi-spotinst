// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a custom Spotinst Ocean GKE Launch Spec Import resource.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as spotinst from "@pulumi/spotinst";
 *
 * const example = new spotinst.gke.OceanLaunchSpecImport("example", {
 *     nodePoolName: "default-pool",
 *     oceanId: "o-123456",
 * });
 * ```
 */
export class OceanLaunchSpecImport extends pulumi.CustomResource {
    /**
     * Get an existing OceanLaunchSpecImport resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: OceanLaunchSpecImportState, opts?: pulumi.CustomResourceOptions): OceanLaunchSpecImport {
        return new OceanLaunchSpecImport(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'spotinst:gke/oceanLaunchSpecImport:OceanLaunchSpecImport';

    /**
     * Returns true if the given object is an instance of OceanLaunchSpecImport.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is OceanLaunchSpecImport {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === OceanLaunchSpecImport.__pulumiType;
    }

    /**
     * The node pool you wish to use in your launchSpec.
     */
    public readonly nodePoolName!: pulumi.Output<string>;
    /**
     * The Ocean cluster ID required for launchSpec create.
     */
    public readonly oceanId!: pulumi.Output<string>;

    /**
     * Create a OceanLaunchSpecImport resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: OceanLaunchSpecImportArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: OceanLaunchSpecImportArgs | OceanLaunchSpecImportState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as OceanLaunchSpecImportState | undefined;
            inputs["nodePoolName"] = state ? state.nodePoolName : undefined;
            inputs["oceanId"] = state ? state.oceanId : undefined;
        } else {
            const args = argsOrState as OceanLaunchSpecImportArgs | undefined;
            if (!args || args.nodePoolName === undefined) {
                throw new Error("Missing required property 'nodePoolName'");
            }
            if (!args || args.oceanId === undefined) {
                throw new Error("Missing required property 'oceanId'");
            }
            inputs["nodePoolName"] = args ? args.nodePoolName : undefined;
            inputs["oceanId"] = args ? args.oceanId : undefined;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(OceanLaunchSpecImport.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering OceanLaunchSpecImport resources.
 */
export interface OceanLaunchSpecImportState {
    /**
     * The node pool you wish to use in your launchSpec.
     */
    readonly nodePoolName?: pulumi.Input<string>;
    /**
     * The Ocean cluster ID required for launchSpec create.
     */
    readonly oceanId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a OceanLaunchSpecImport resource.
 */
export interface OceanLaunchSpecImportArgs {
    /**
     * The node pool you wish to use in your launchSpec.
     */
    readonly nodePoolName: pulumi.Input<string>;
    /**
     * The Ocean cluster ID required for launchSpec create.
     */
    readonly oceanId: pulumi.Input<string>;
}
