// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Provides a Spotinst Multai Balancer.
 *
 * ## Example Usage
 *
 *
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as spotinst from "@pulumi/spotinst";
 *
 * const myBalancer = new spotinst.multai.Balancer("myBalancer", {
 *     connectionTimeouts: {
 *         draining: 10,
 *         idle: 10,
 *     },
 *     scheme: "internal",
 *     tags: [{
 *         key: "env",
 *         value: "prod",
 *     }],
 * });
 * ```
 */
export class Balancer extends pulumi.CustomResource {
    /**
     * Get an existing Balancer resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: BalancerState, opts?: pulumi.CustomResourceOptions): Balancer {
        return new Balancer(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'spotinst:multai/balancer:Balancer';

    /**
     * Returns true if the given object is an instance of Balancer.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Balancer {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Balancer.__pulumiType;
    }

    public readonly connectionTimeouts!: pulumi.Output<outputs.multai.BalancerConnectionTimeouts | undefined>;
    public readonly dnsCnameAliases!: pulumi.Output<string[] | undefined>;
    /**
     * The balancer name. May contain only alphanumeric characters or hyphens, and must not begin or end with a hyphen.
     */
    public readonly name!: pulumi.Output<string>;
    public readonly scheme!: pulumi.Output<string | undefined>;
    /**
     * A list of key:value paired tags.
     */
    public readonly tags!: pulumi.Output<outputs.multai.BalancerTag[] | undefined>;

    /**
     * Create a Balancer resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: BalancerArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: BalancerArgs | BalancerState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as BalancerState | undefined;
            inputs["connectionTimeouts"] = state ? state.connectionTimeouts : undefined;
            inputs["dnsCnameAliases"] = state ? state.dnsCnameAliases : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["scheme"] = state ? state.scheme : undefined;
            inputs["tags"] = state ? state.tags : undefined;
        } else {
            const args = argsOrState as BalancerArgs | undefined;
            inputs["connectionTimeouts"] = args ? args.connectionTimeouts : undefined;
            inputs["dnsCnameAliases"] = args ? args.dnsCnameAliases : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["scheme"] = args ? args.scheme : undefined;
            inputs["tags"] = args ? args.tags : undefined;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(Balancer.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Balancer resources.
 */
export interface BalancerState {
    readonly connectionTimeouts?: pulumi.Input<inputs.multai.BalancerConnectionTimeouts>;
    readonly dnsCnameAliases?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The balancer name. May contain only alphanumeric characters or hyphens, and must not begin or end with a hyphen.
     */
    readonly name?: pulumi.Input<string>;
    readonly scheme?: pulumi.Input<string>;
    /**
     * A list of key:value paired tags.
     */
    readonly tags?: pulumi.Input<pulumi.Input<inputs.multai.BalancerTag>[]>;
}

/**
 * The set of arguments for constructing a Balancer resource.
 */
export interface BalancerArgs {
    readonly connectionTimeouts?: pulumi.Input<inputs.multai.BalancerConnectionTimeouts>;
    readonly dnsCnameAliases?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The balancer name. May contain only alphanumeric characters or hyphens, and must not begin or end with a hyphen.
     */
    readonly name?: pulumi.Input<string>;
    readonly scheme?: pulumi.Input<string>;
    /**
     * A list of key:value paired tags.
     */
    readonly tags?: pulumi.Input<pulumi.Input<inputs.multai.BalancerTag>[]>;
}
