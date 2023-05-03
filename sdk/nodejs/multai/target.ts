// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

export class Target extends pulumi.CustomResource {
    /**
     * Get an existing Target resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TargetState, opts?: pulumi.CustomResourceOptions): Target {
        return new Target(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'spotinst:multai/target:Target';

    /**
     * Returns true if the given object is an instance of Target.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Target {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Target.__pulumiType;
    }

    public readonly balancerId!: pulumi.Output<string>;
    public readonly host!: pulumi.Output<string>;
    public readonly name!: pulumi.Output<string>;
    public readonly port!: pulumi.Output<number | undefined>;
    public readonly tags!: pulumi.Output<outputs.multai.TargetTag[] | undefined>;
    public readonly targetSetId!: pulumi.Output<string>;
    public readonly weight!: pulumi.Output<number>;

    /**
     * Create a Target resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: TargetArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: TargetArgs | TargetState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as TargetState | undefined;
            resourceInputs["balancerId"] = state ? state.balancerId : undefined;
            resourceInputs["host"] = state ? state.host : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["port"] = state ? state.port : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["targetSetId"] = state ? state.targetSetId : undefined;
            resourceInputs["weight"] = state ? state.weight : undefined;
        } else {
            const args = argsOrState as TargetArgs | undefined;
            if ((!args || args.balancerId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'balancerId'");
            }
            if ((!args || args.host === undefined) && !opts.urn) {
                throw new Error("Missing required property 'host'");
            }
            if ((!args || args.targetSetId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'targetSetId'");
            }
            if ((!args || args.weight === undefined) && !opts.urn) {
                throw new Error("Missing required property 'weight'");
            }
            resourceInputs["balancerId"] = args ? args.balancerId : undefined;
            resourceInputs["host"] = args ? args.host : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["port"] = args ? args.port : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["targetSetId"] = args ? args.targetSetId : undefined;
            resourceInputs["weight"] = args ? args.weight : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Target.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Target resources.
 */
export interface TargetState {
    balancerId?: pulumi.Input<string>;
    host?: pulumi.Input<string>;
    name?: pulumi.Input<string>;
    port?: pulumi.Input<number>;
    tags?: pulumi.Input<pulumi.Input<inputs.multai.TargetTag>[]>;
    targetSetId?: pulumi.Input<string>;
    weight?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a Target resource.
 */
export interface TargetArgs {
    balancerId: pulumi.Input<string>;
    host: pulumi.Input<string>;
    name?: pulumi.Input<string>;
    port?: pulumi.Input<number>;
    tags?: pulumi.Input<pulumi.Input<inputs.multai.TargetTag>[]>;
    targetSetId: pulumi.Input<string>;
    weight: pulumi.Input<number>;
}
