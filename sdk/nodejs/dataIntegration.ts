// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides a Spotinst Data Integration resource.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as spotinst from "@pulumi/spotinst";
 *
 * const example = new spotinst.DataIntegration("example", {
 *     s3: {
 *         bucketName: "terraform-test-do-not-delete",
 *         subdir: "terraform-test-data-integration",
 *     },
 *     status: "enabled",
 * });
 * ```
 */
export class DataIntegration extends pulumi.CustomResource {
    /**
     * Get an existing DataIntegration resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DataIntegrationState, opts?: pulumi.CustomResourceOptions): DataIntegration {
        return new DataIntegration(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'spotinst:index/dataIntegration:DataIntegration';

    /**
     * Returns true if the given object is an instance of DataIntegration.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is DataIntegration {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === DataIntegration.__pulumiType;
    }

    /**
     * The name of the data integration.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * When vendor value is s3, the following fields are included:
     */
    public readonly s3!: pulumi.Output<outputs.DataIntegrationS3 | undefined>;
    /**
     * Determines if this data integration is on or off. Valid values: `"enabled"`, `"disabled"`
     */
    public readonly status!: pulumi.Output<string | undefined>;

    /**
     * Create a DataIntegration resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: DataIntegrationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DataIntegrationArgs | DataIntegrationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DataIntegrationState | undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["s3"] = state ? state.s3 : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
        } else {
            const args = argsOrState as DataIntegrationArgs | undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["s3"] = args ? args.s3 : undefined;
            resourceInputs["status"] = args ? args.status : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(DataIntegration.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering DataIntegration resources.
 */
export interface DataIntegrationState {
    /**
     * The name of the data integration.
     */
    name?: pulumi.Input<string>;
    /**
     * When vendor value is s3, the following fields are included:
     */
    s3?: pulumi.Input<inputs.DataIntegrationS3>;
    /**
     * Determines if this data integration is on or off. Valid values: `"enabled"`, `"disabled"`
     */
    status?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a DataIntegration resource.
 */
export interface DataIntegrationArgs {
    /**
     * The name of the data integration.
     */
    name?: pulumi.Input<string>;
    /**
     * When vendor value is s3, the following fields are included:
     */
    s3?: pulumi.Input<inputs.DataIntegrationS3>;
    /**
     * Determines if this data integration is on or off. Valid values: `"enabled"`, `"disabled"`
     */
    status?: pulumi.Input<string>;
}
