// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Manage a dedicated Spotinst Ocean Spark Virtual Node Group resource
 *
 * ## Prerequisites
 *
 * An existing Ocean cluster and Ocean VNG is required by this resource
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as spotinst from "@pulumi/spotinst";
 *
 * const example = new spotinst.spark.OceanVirtualNodeGroup("example", {
 *     virtualNodeGroupId: "vng_id",
 *     oceanSparkClusterId: "cluster_id",
 * });
 * ```
 */
export class OceanVirtualNodeGroup extends pulumi.CustomResource {
    /**
     * Get an existing OceanVirtualNodeGroup resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: OceanVirtualNodeGroupState, opts?: pulumi.CustomResourceOptions): OceanVirtualNodeGroup {
        return new OceanVirtualNodeGroup(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'spotinst:spark/oceanVirtualNodeGroup:OceanVirtualNodeGroup';

    /**
     * Returns true if the given object is an instance of OceanVirtualNodeGroup.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is OceanVirtualNodeGroup {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === OceanVirtualNodeGroup.__pulumiType;
    }

    public readonly oceanSparkClusterId!: pulumi.Output<string>;
    public readonly virtualNodeGroupId!: pulumi.Output<string>;

    /**
     * Create a OceanVirtualNodeGroup resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: OceanVirtualNodeGroupArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: OceanVirtualNodeGroupArgs | OceanVirtualNodeGroupState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as OceanVirtualNodeGroupState | undefined;
            resourceInputs["oceanSparkClusterId"] = state ? state.oceanSparkClusterId : undefined;
            resourceInputs["virtualNodeGroupId"] = state ? state.virtualNodeGroupId : undefined;
        } else {
            const args = argsOrState as OceanVirtualNodeGroupArgs | undefined;
            if ((!args || args.oceanSparkClusterId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'oceanSparkClusterId'");
            }
            if ((!args || args.virtualNodeGroupId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'virtualNodeGroupId'");
            }
            resourceInputs["oceanSparkClusterId"] = args ? args.oceanSparkClusterId : undefined;
            resourceInputs["virtualNodeGroupId"] = args ? args.virtualNodeGroupId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(OceanVirtualNodeGroup.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering OceanVirtualNodeGroup resources.
 */
export interface OceanVirtualNodeGroupState {
    oceanSparkClusterId?: pulumi.Input<string>;
    virtualNodeGroupId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a OceanVirtualNodeGroup resource.
 */
export interface OceanVirtualNodeGroupArgs {
    oceanSparkClusterId: pulumi.Input<string>;
    virtualNodeGroupId: pulumi.Input<string>;
}