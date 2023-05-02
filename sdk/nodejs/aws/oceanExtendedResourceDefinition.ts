// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Spotinst Ocean AWS Extended Resource Definition resource.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as spotinst from "@pulumi/spotinst";
 *
 * const example = new spotinst.aws.OceanExtendedResourceDefinition("example", {
 *     name: "terraform_extended_resource_definition",
 *     resourceMapping: {
 *         "c3.large": "2Ki",
 *         "c3.xlarge": "4Ki",
 *     },
 * });
 * ```
 */
export class OceanExtendedResourceDefinition extends pulumi.CustomResource {
    /**
     * Get an existing OceanExtendedResourceDefinition resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: OceanExtendedResourceDefinitionState, opts?: pulumi.CustomResourceOptions): OceanExtendedResourceDefinition {
        return new OceanExtendedResourceDefinition(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'spotinst:aws/oceanExtendedResourceDefinition:OceanExtendedResourceDefinition';

    /**
     * Returns true if the given object is an instance of OceanExtendedResourceDefinition.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is OceanExtendedResourceDefinition {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === OceanExtendedResourceDefinition.__pulumiType;
    }

    /**
     * The extended resource name as should be requested by your pods and registered to the nodes. Cannot be updated.
     * The name should be a valid Kubernetes extended resource name.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * A mapping between AWS instanceType or * as default and its value for the given extended resource.
     */
    public readonly resourceMapping!: pulumi.Output<{[key: string]: any}>;

    /**
     * Create a OceanExtendedResourceDefinition resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: OceanExtendedResourceDefinitionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: OceanExtendedResourceDefinitionArgs | OceanExtendedResourceDefinitionState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as OceanExtendedResourceDefinitionState | undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["resourceMapping"] = state ? state.resourceMapping : undefined;
        } else {
            const args = argsOrState as OceanExtendedResourceDefinitionArgs | undefined;
            if ((!args || args.name === undefined) && !opts.urn) {
                throw new Error("Missing required property 'name'");
            }
            if ((!args || args.resourceMapping === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceMapping'");
            }
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["resourceMapping"] = args ? args.resourceMapping : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(OceanExtendedResourceDefinition.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering OceanExtendedResourceDefinition resources.
 */
export interface OceanExtendedResourceDefinitionState {
    /**
     * The extended resource name as should be requested by your pods and registered to the nodes. Cannot be updated.
     * The name should be a valid Kubernetes extended resource name.
     */
    name?: pulumi.Input<string>;
    /**
     * A mapping between AWS instanceType or * as default and its value for the given extended resource.
     */
    resourceMapping?: pulumi.Input<{[key: string]: any}>;
}

/**
 * The set of arguments for constructing a OceanExtendedResourceDefinition resource.
 */
export interface OceanExtendedResourceDefinitionArgs {
    /**
     * The extended resource name as should be requested by your pods and registered to the nodes. Cannot be updated.
     * The name should be a valid Kubernetes extended resource name.
     */
    name: pulumi.Input<string>;
    /**
     * A mapping between AWS instanceType or * as default and its value for the given extended resource.
     */
    resourceMapping: pulumi.Input<{[key: string]: any}>;
}
