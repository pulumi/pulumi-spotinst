// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Manages a Spotinst Ocean Spark resource on AWS or GCP.
 *
 * ## Prerequisites
 *
 * An existing Ocean cluster is required by this resource. See e.g. the `spotinst.aws.Ocean` resource.
 */
export class Ocean extends pulumi.CustomResource {
    /**
     * Get an existing Ocean resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: OceanState, opts?: pulumi.CustomResourceOptions): Ocean {
        return new Ocean(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'spotinst:spark/ocean:Ocean';

    /**
     * Returns true if the given object is an instance of Ocean.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Ocean {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Ocean.__pulumiType;
    }

    public readonly compute!: pulumi.Output<outputs.spark.OceanCompute>;
    public readonly ingress!: pulumi.Output<outputs.spark.OceanIngress>;
    public readonly logCollection!: pulumi.Output<outputs.spark.OceanLogCollection>;
    /**
     * - The ID of the Ocean cluster that Ocean for Apache Spark should be installed on.
     */
    public readonly oceanClusterId!: pulumi.Output<string>;
    public readonly spark!: pulumi.Output<outputs.spark.OceanSpark>;
    public readonly webhook!: pulumi.Output<outputs.spark.OceanWebhook>;

    /**
     * Create a Ocean resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: OceanArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: OceanArgs | OceanState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as OceanState | undefined;
            resourceInputs["compute"] = state ? state.compute : undefined;
            resourceInputs["ingress"] = state ? state.ingress : undefined;
            resourceInputs["logCollection"] = state ? state.logCollection : undefined;
            resourceInputs["oceanClusterId"] = state ? state.oceanClusterId : undefined;
            resourceInputs["spark"] = state ? state.spark : undefined;
            resourceInputs["webhook"] = state ? state.webhook : undefined;
        } else {
            const args = argsOrState as OceanArgs | undefined;
            if ((!args || args.oceanClusterId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'oceanClusterId'");
            }
            resourceInputs["compute"] = args ? args.compute : undefined;
            resourceInputs["ingress"] = args ? args.ingress : undefined;
            resourceInputs["logCollection"] = args ? args.logCollection : undefined;
            resourceInputs["oceanClusterId"] = args ? args.oceanClusterId : undefined;
            resourceInputs["spark"] = args ? args.spark : undefined;
            resourceInputs["webhook"] = args ? args.webhook : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Ocean.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Ocean resources.
 */
export interface OceanState {
    compute?: pulumi.Input<inputs.spark.OceanCompute>;
    ingress?: pulumi.Input<inputs.spark.OceanIngress>;
    logCollection?: pulumi.Input<inputs.spark.OceanLogCollection>;
    /**
     * - The ID of the Ocean cluster that Ocean for Apache Spark should be installed on.
     */
    oceanClusterId?: pulumi.Input<string>;
    spark?: pulumi.Input<inputs.spark.OceanSpark>;
    webhook?: pulumi.Input<inputs.spark.OceanWebhook>;
}

/**
 * The set of arguments for constructing a Ocean resource.
 */
export interface OceanArgs {
    compute?: pulumi.Input<inputs.spark.OceanCompute>;
    ingress?: pulumi.Input<inputs.spark.OceanIngress>;
    logCollection?: pulumi.Input<inputs.spark.OceanLogCollection>;
    /**
     * - The ID of the Ocean cluster that Ocean for Apache Spark should be installed on.
     */
    oceanClusterId: pulumi.Input<string>;
    spark?: pulumi.Input<inputs.spark.OceanSpark>;
    webhook?: pulumi.Input<inputs.spark.OceanWebhook>;
}
