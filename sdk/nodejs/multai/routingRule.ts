// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Provides a Spotinst Multai Routing Rule.
 * 
 * ## Example Usage
 * 
 * 
 * 
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as spotinst from "@pulumi/spotinst";
 * 
 * const myRoutingRule = new spotinst.multai.RoutingRule("myRoutingRule", {
 *     balancerId: "b-12345",
 *     listenerId: "l-98765",
 *     route: "Path(`/bar`)",
 *     strategy: "LEASTCONN",
 *     tags: [{
 *         key: "env",
 *         value: "prod",
 *     }],
 * });
 * ```
 *
 * > This content is derived from https://github.com/terraform-providers/terraform-provider-spotinst/blob/master/website/docs/r/multai_routing_rule.html.markdown.
 */
export class RoutingRule extends pulumi.CustomResource {
    /**
     * Get an existing RoutingRule resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RoutingRuleState, opts?: pulumi.CustomResourceOptions): RoutingRule {
        return new RoutingRule(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'spotinst:multai/routingRule:RoutingRule';

    /**
     * Returns true if the given object is an instance of RoutingRule.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is RoutingRule {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === RoutingRule.__pulumiType;
    }

    /**
     * The ID of the balancer.
     */
    public readonly balancerId!: pulumi.Output<string>;
    /**
     * The ID of the listener.
     */
    public readonly listenerId!: pulumi.Output<string>;
    public readonly middlewareIds!: pulumi.Output<string[] | undefined>;
    public readonly priority!: pulumi.Output<number | undefined>;
    /**
     * Route defines a simple language for matching HTTP requests and route the traffic accordingly. Route provides series of matchers that follow the syntax: Path matcher: — Path("/foo/bar") // trie-based PathRegexp(“/foo/.*”) // regexp-based Method matcher: — Method(“GET”) // trie-based MethodRegexp(“POST|PUT”) // regexp based Header matcher: — Header(“Content-Type”, “application/json”) // trie-based HeaderRegexp(“Content-Type”, “application/.*”) // regexp based Matchers can be combined using && operator: — Method(“POST”) && Path("/v1")
     */
    public readonly route!: pulumi.Output<string>;
    /**
     * Balancing strategy. Valid values: `ROUNDROBIN`, `RANDOM`, `LEASTCONN`, `IPHASH`.
     */
    public readonly strategy!: pulumi.Output<string | undefined>;
    /**
     * A list of key:value paired tags.
     */
    public readonly tags!: pulumi.Output<outputs.multai.RoutingRuleTag[] | undefined>;
    public readonly targetSetIds!: pulumi.Output<string[]>;

    /**
     * Create a RoutingRule resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RoutingRuleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: RoutingRuleArgs | RoutingRuleState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as RoutingRuleState | undefined;
            inputs["balancerId"] = state ? state.balancerId : undefined;
            inputs["listenerId"] = state ? state.listenerId : undefined;
            inputs["middlewareIds"] = state ? state.middlewareIds : undefined;
            inputs["priority"] = state ? state.priority : undefined;
            inputs["route"] = state ? state.route : undefined;
            inputs["strategy"] = state ? state.strategy : undefined;
            inputs["tags"] = state ? state.tags : undefined;
            inputs["targetSetIds"] = state ? state.targetSetIds : undefined;
        } else {
            const args = argsOrState as RoutingRuleArgs | undefined;
            if (!args || args.balancerId === undefined) {
                throw new Error("Missing required property 'balancerId'");
            }
            if (!args || args.listenerId === undefined) {
                throw new Error("Missing required property 'listenerId'");
            }
            if (!args || args.route === undefined) {
                throw new Error("Missing required property 'route'");
            }
            if (!args || args.targetSetIds === undefined) {
                throw new Error("Missing required property 'targetSetIds'");
            }
            inputs["balancerId"] = args ? args.balancerId : undefined;
            inputs["listenerId"] = args ? args.listenerId : undefined;
            inputs["middlewareIds"] = args ? args.middlewareIds : undefined;
            inputs["priority"] = args ? args.priority : undefined;
            inputs["route"] = args ? args.route : undefined;
            inputs["strategy"] = args ? args.strategy : undefined;
            inputs["tags"] = args ? args.tags : undefined;
            inputs["targetSetIds"] = args ? args.targetSetIds : undefined;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(RoutingRule.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering RoutingRule resources.
 */
export interface RoutingRuleState {
    /**
     * The ID of the balancer.
     */
    readonly balancerId?: pulumi.Input<string>;
    /**
     * The ID of the listener.
     */
    readonly listenerId?: pulumi.Input<string>;
    readonly middlewareIds?: pulumi.Input<pulumi.Input<string>[]>;
    readonly priority?: pulumi.Input<number>;
    /**
     * Route defines a simple language for matching HTTP requests and route the traffic accordingly. Route provides series of matchers that follow the syntax: Path matcher: — Path("/foo/bar") // trie-based PathRegexp(“/foo/.*”) // regexp-based Method matcher: — Method(“GET”) // trie-based MethodRegexp(“POST|PUT”) // regexp based Header matcher: — Header(“Content-Type”, “application/json”) // trie-based HeaderRegexp(“Content-Type”, “application/.*”) // regexp based Matchers can be combined using && operator: — Method(“POST”) && Path("/v1")
     */
    readonly route?: pulumi.Input<string>;
    /**
     * Balancing strategy. Valid values: `ROUNDROBIN`, `RANDOM`, `LEASTCONN`, `IPHASH`.
     */
    readonly strategy?: pulumi.Input<string>;
    /**
     * A list of key:value paired tags.
     */
    readonly tags?: pulumi.Input<pulumi.Input<inputs.multai.RoutingRuleTag>[]>;
    readonly targetSetIds?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a RoutingRule resource.
 */
export interface RoutingRuleArgs {
    /**
     * The ID of the balancer.
     */
    readonly balancerId: pulumi.Input<string>;
    /**
     * The ID of the listener.
     */
    readonly listenerId: pulumi.Input<string>;
    readonly middlewareIds?: pulumi.Input<pulumi.Input<string>[]>;
    readonly priority?: pulumi.Input<number>;
    /**
     * Route defines a simple language for matching HTTP requests and route the traffic accordingly. Route provides series of matchers that follow the syntax: Path matcher: — Path("/foo/bar") // trie-based PathRegexp(“/foo/.*”) // regexp-based Method matcher: — Method(“GET”) // trie-based MethodRegexp(“POST|PUT”) // regexp based Header matcher: — Header(“Content-Type”, “application/json”) // trie-based HeaderRegexp(“Content-Type”, “application/.*”) // regexp based Matchers can be combined using && operator: — Method(“POST”) && Path("/v1")
     */
    readonly route: pulumi.Input<string>;
    /**
     * Balancing strategy. Valid values: `ROUNDROBIN`, `RANDOM`, `LEASTCONN`, `IPHASH`.
     */
    readonly strategy?: pulumi.Input<string>;
    /**
     * A list of key:value paired tags.
     */
    readonly tags?: pulumi.Input<pulumi.Input<inputs.multai.RoutingRuleTag>[]>;
    readonly targetSetIds: pulumi.Input<pulumi.Input<string>[]>;
}
