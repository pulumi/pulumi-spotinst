// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

export class Balancer extends pulumi.CustomResource {
    /**
     * Get an existing Balancer resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
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
    public readonly name!: pulumi.Output<string>;
    public readonly scheme!: pulumi.Output<string | undefined>;
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
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as BalancerState | undefined;
            resourceInputs["connectionTimeouts"] = state ? state.connectionTimeouts : undefined;
            resourceInputs["dnsCnameAliases"] = state ? state.dnsCnameAliases : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["scheme"] = state ? state.scheme : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
        } else {
            const args = argsOrState as BalancerArgs | undefined;
            resourceInputs["connectionTimeouts"] = args ? args.connectionTimeouts : undefined;
            resourceInputs["dnsCnameAliases"] = args ? args.dnsCnameAliases : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["scheme"] = args ? args.scheme : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Balancer.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Balancer resources.
 */
export interface BalancerState {
    connectionTimeouts?: pulumi.Input<inputs.multai.BalancerConnectionTimeouts>;
    dnsCnameAliases?: pulumi.Input<pulumi.Input<string>[]>;
    name?: pulumi.Input<string>;
    scheme?: pulumi.Input<string>;
    tags?: pulumi.Input<pulumi.Input<inputs.multai.BalancerTag>[]>;
}

/**
 * The set of arguments for constructing a Balancer resource.
 */
export interface BalancerArgs {
    connectionTimeouts?: pulumi.Input<inputs.multai.BalancerConnectionTimeouts>;
    dnsCnameAliases?: pulumi.Input<pulumi.Input<string>[]>;
    name?: pulumi.Input<string>;
    scheme?: pulumi.Input<string>;
    tags?: pulumi.Input<pulumi.Input<inputs.multai.BalancerTag>[]>;
}
