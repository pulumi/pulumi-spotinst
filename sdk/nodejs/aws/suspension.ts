// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * Suspend AWS Elastigroup processes. This resource provide the capavility of
 * suspending elastigroup processes using this provider.
 *
 * For supported processes please visit: [Suspend Processes API reference](https://help.spot.io/spotinst-api/elastigroup/amazon-web-services/suspend-processes/)
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as spotinst from "@pulumi/spotinst";
 *
 * // Create a suspension for Elastigroup
 * const resourceName = new spotinst.aws.Suspension("resource_name", {
 *     groupId: "sig-12345678",
 *     suspensions: [
 *         {
 *             name: "OUT_OF_STRATEGY",
 *         },
 *         {
 *             name: "REVERT_PREFERRED",
 *         },
 *         {
 *             name: "PREVENTIVE_REPLACEMENT",
 *         },
 *     ],
 * });
 * ```
 */
export class Suspension extends pulumi.CustomResource {
    /**
     * Get an existing Suspension resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SuspensionState, opts?: pulumi.CustomResourceOptions): Suspension {
        return new Suspension(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'spotinst:aws/suspension:Suspension';

    /**
     * Returns true if the given object is an instance of Suspension.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Suspension {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Suspension.__pulumiType;
    }

    /**
     * Elastigroup ID to apply the suspensions on.
     */
    public readonly groupId!: pulumi.Output<string>;
    /**
     * block of single process to suspend.
     */
    public readonly suspensions!: pulumi.Output<outputs.aws.SuspensionSuspension[]>;

    /**
     * Create a Suspension resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SuspensionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SuspensionArgs | SuspensionState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SuspensionState | undefined;
            inputs["groupId"] = state ? state.groupId : undefined;
            inputs["suspensions"] = state ? state.suspensions : undefined;
        } else {
            const args = argsOrState as SuspensionArgs | undefined;
            if ((!args || args.groupId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'groupId'");
            }
            if ((!args || args.suspensions === undefined) && !opts.urn) {
                throw new Error("Missing required property 'suspensions'");
            }
            inputs["groupId"] = args ? args.groupId : undefined;
            inputs["suspensions"] = args ? args.suspensions : undefined;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(Suspension.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Suspension resources.
 */
export interface SuspensionState {
    /**
     * Elastigroup ID to apply the suspensions on.
     */
    groupId?: pulumi.Input<string>;
    /**
     * block of single process to suspend.
     */
    suspensions?: pulumi.Input<pulumi.Input<inputs.aws.SuspensionSuspension>[]>;
}

/**
 * The set of arguments for constructing a Suspension resource.
 */
export interface SuspensionArgs {
    /**
     * Elastigroup ID to apply the suspensions on.
     */
    groupId: pulumi.Input<string>;
    /**
     * block of single process to suspend.
     */
    suspensions: pulumi.Input<pulumi.Input<inputs.aws.SuspensionSuspension>[]>;
}
