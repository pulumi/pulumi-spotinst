// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Provides a Spotinst Multai Listener.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as spotinst from "@pulumi/spotinst";
 *
 * const myListener = new spotinst.multai.Listener("my_listener", {
 *     balancerId: "b-12345",
 *     name: "foo",
 *     port: 1337,
 *     protocol: "http",
 *     tags: [{
 *         key: "env",
 *         value: "prod",
 *     }],
 *     tlsConfig: {
 *         certificateIds: ["ce-12345"],
 *         cipherSuites: [""],
 *         maxVersion: "TLS12",
 *         minVersion: "TLS10",
 *         preferServerCipherSuites: true,
 *         sessionTicketsDisabled: false,
 *     },
 * });
 * ```
 */
export class Listener extends pulumi.CustomResource {
    /**
     * Get an existing Listener resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ListenerState, opts?: pulumi.CustomResourceOptions): Listener {
        return new Listener(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'spotinst:multai/listener:Listener';

    /**
     * Returns true if the given object is an instance of Listener.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Listener {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Listener.__pulumiType;
    }

    /**
     * The ID of the balancer.
     */
    public readonly balancerId!: pulumi.Output<string>;
    /**
     * The port on which the load balancer is listening.
     */
    public readonly port!: pulumi.Output<number>;
    /**
     * The protocol to allow connections to the load balancer.
     */
    public readonly protocol!: pulumi.Output<string>;
    /**
     * A list of key:value paired tags.
     */
    public readonly tags!: pulumi.Output<outputs.multai.ListenerTag[] | undefined>;
    /**
     * Describes the TLSConfig configuration.
     */
    public readonly tlsConfig!: pulumi.Output<outputs.multai.ListenerTlsConfig | undefined>;

    /**
     * Create a Listener resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ListenerArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ListenerArgs | ListenerState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as ListenerState | undefined;
            inputs["balancerId"] = state ? state.balancerId : undefined;
            inputs["port"] = state ? state.port : undefined;
            inputs["protocol"] = state ? state.protocol : undefined;
            inputs["tags"] = state ? state.tags : undefined;
            inputs["tlsConfig"] = state ? state.tlsConfig : undefined;
        } else {
            const args = argsOrState as ListenerArgs | undefined;
            if (!args || args.balancerId === undefined) {
                throw new Error("Missing required property 'balancerId'");
            }
            if (!args || args.port === undefined) {
                throw new Error("Missing required property 'port'");
            }
            if (!args || args.protocol === undefined) {
                throw new Error("Missing required property 'protocol'");
            }
            inputs["balancerId"] = args ? args.balancerId : undefined;
            inputs["port"] = args ? args.port : undefined;
            inputs["protocol"] = args ? args.protocol : undefined;
            inputs["tags"] = args ? args.tags : undefined;
            inputs["tlsConfig"] = args ? args.tlsConfig : undefined;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(Listener.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Listener resources.
 */
export interface ListenerState {
    /**
     * The ID of the balancer.
     */
    readonly balancerId?: pulumi.Input<string>;
    /**
     * The port on which the load balancer is listening.
     */
    readonly port?: pulumi.Input<number>;
    /**
     * The protocol to allow connections to the load balancer.
     */
    readonly protocol?: pulumi.Input<string>;
    /**
     * A list of key:value paired tags.
     */
    readonly tags?: pulumi.Input<pulumi.Input<inputs.multai.ListenerTag>[]>;
    /**
     * Describes the TLSConfig configuration.
     */
    readonly tlsConfig?: pulumi.Input<inputs.multai.ListenerTlsConfig>;
}

/**
 * The set of arguments for constructing a Listener resource.
 */
export interface ListenerArgs {
    /**
     * The ID of the balancer.
     */
    readonly balancerId: pulumi.Input<string>;
    /**
     * The port on which the load balancer is listening.
     */
    readonly port: pulumi.Input<number>;
    /**
     * The protocol to allow connections to the load balancer.
     */
    readonly protocol: pulumi.Input<string>;
    /**
     * A list of key:value paired tags.
     */
    readonly tags?: pulumi.Input<pulumi.Input<inputs.multai.ListenerTag>[]>;
    /**
     * Describes the TLSConfig configuration.
     */
    readonly tlsConfig?: pulumi.Input<inputs.multai.ListenerTlsConfig>;
}
