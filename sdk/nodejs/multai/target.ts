// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Provides a Spotinst Multai Target.
 * 
 * ## Example Usage
 * 
 * 
 * 
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as spotinst from "@pulumi/spotinst";
 * 
 * const myTarget = new spotinst.multai.Target("myTarget", {
 *     balancerId: "b-12345",
 *     host: "host",
 *     port: 1338,
 *     tags: [{
 *         key: "env",
 *         value: "prod",
 *     }],
 *     targetSetId: "l-98765",
 *     weight: 1,
 * });
 * ```
 *
 * > This content is derived from https://github.com/terraform-providers/terraform-provider-spotinst/blob/master/website/docs/r/multai_target.html.markdown.
 */
export class Target extends pulumi.CustomResource {
    /**
     * Get an existing Target resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
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

    /**
     * The ID of the balancer.
     */
    public readonly balancerId!: pulumi.Output<string>;
    /**
     * The address (IP or URL) of the targets to register
     */
    public readonly host!: pulumi.Output<string>;
    /**
     * The name of the Target . Must contain only alphanumeric characters or hyphens, and must not begin or end with a hyphen.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The port the target will register to.
     */
    public readonly port!: pulumi.Output<number | undefined>;
    /**
     * A list of key:value paired tags.
     */
    public readonly tags!: pulumi.Output<outputs.multai.TargetTag[] | undefined>;
    /**
     * The ID of the target set.
     */
    public readonly targetSetId!: pulumi.Output<string>;
    /**
     * Defines how traffic is distributed between targets.
     */
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
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as TargetState | undefined;
            inputs["balancerId"] = state ? state.balancerId : undefined;
            inputs["host"] = state ? state.host : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["port"] = state ? state.port : undefined;
            inputs["tags"] = state ? state.tags : undefined;
            inputs["targetSetId"] = state ? state.targetSetId : undefined;
            inputs["weight"] = state ? state.weight : undefined;
        } else {
            const args = argsOrState as TargetArgs | undefined;
            if (!args || args.balancerId === undefined) {
                throw new Error("Missing required property 'balancerId'");
            }
            if (!args || args.host === undefined) {
                throw new Error("Missing required property 'host'");
            }
            if (!args || args.targetSetId === undefined) {
                throw new Error("Missing required property 'targetSetId'");
            }
            if (!args || args.weight === undefined) {
                throw new Error("Missing required property 'weight'");
            }
            inputs["balancerId"] = args ? args.balancerId : undefined;
            inputs["host"] = args ? args.host : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["port"] = args ? args.port : undefined;
            inputs["tags"] = args ? args.tags : undefined;
            inputs["targetSetId"] = args ? args.targetSetId : undefined;
            inputs["weight"] = args ? args.weight : undefined;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(Target.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Target resources.
 */
export interface TargetState {
    /**
     * The ID of the balancer.
     */
    readonly balancerId?: pulumi.Input<string>;
    /**
     * The address (IP or URL) of the targets to register
     */
    readonly host?: pulumi.Input<string>;
    /**
     * The name of the Target . Must contain only alphanumeric characters or hyphens, and must not begin or end with a hyphen.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The port the target will register to.
     */
    readonly port?: pulumi.Input<number>;
    /**
     * A list of key:value paired tags.
     */
    readonly tags?: pulumi.Input<pulumi.Input<inputs.multai.TargetTag>[]>;
    /**
     * The ID of the target set.
     */
    readonly targetSetId?: pulumi.Input<string>;
    /**
     * Defines how traffic is distributed between targets.
     */
    readonly weight?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a Target resource.
 */
export interface TargetArgs {
    /**
     * The ID of the balancer.
     */
    readonly balancerId: pulumi.Input<string>;
    /**
     * The address (IP or URL) of the targets to register
     */
    readonly host: pulumi.Input<string>;
    /**
     * The name of the Target . Must contain only alphanumeric characters or hyphens, and must not begin or end with a hyphen.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The port the target will register to.
     */
    readonly port?: pulumi.Input<number>;
    /**
     * A list of key:value paired tags.
     */
    readonly tags?: pulumi.Input<pulumi.Input<inputs.multai.TargetTag>[]>;
    /**
     * The ID of the target set.
     */
    readonly targetSetId: pulumi.Input<string>;
    /**
     * Defines how traffic is distributed between targets.
     */
    readonly weight: pulumi.Input<number>;
}
