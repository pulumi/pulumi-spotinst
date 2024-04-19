// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Provides a Spotinst programmatic user in the creator's organization.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as spotinst from "@pulumi/spotinst";
 *
 * const terraformProgUser = new spotinst.organization.ProgrammaticUser("terraformProgUser", {
 *     description: "creating programmatic user",
 *     policies: [{
 *         policyAccountIds: ["act-a1b2c3d4"],
 *         policyId: "pol-g75d8c06",
 *     }],
 *     userGroupIds: [
 *         "ugr-abcd1234",
 *         "ugr-defg8763",
 *     ],
 * });
 * ```
 */
export class ProgrammaticUser extends pulumi.CustomResource {
    /**
     * Get an existing ProgrammaticUser resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ProgrammaticUserState, opts?: pulumi.CustomResourceOptions): ProgrammaticUser {
        return new ProgrammaticUser(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'spotinst:organization/programmaticUser:ProgrammaticUser';

    /**
     * Returns true if the given object is an instance of ProgrammaticUser.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ProgrammaticUser {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ProgrammaticUser.__pulumiType;
    }

    /**
     * All the accounts the programmatic user will have access to.
     * If used - Cannot be empty.
     */
    public readonly accounts!: pulumi.Output<outputs.organization.ProgrammaticUserAccount[] | undefined>;
    /**
     * Brief description of the user.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Name of the programmatic user.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * All the policies the programmatic user will have access to.
     * If used - Cannot be empty.
     */
    public readonly policies!: pulumi.Output<outputs.organization.ProgrammaticUserPolicy[] | undefined>;
    /**
     * A list of the user groups to register the given user to (should be existing user groups only)
     */
    public readonly userGroupIds!: pulumi.Output<string[] | undefined>;

    /**
     * Create a ProgrammaticUser resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: ProgrammaticUserArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ProgrammaticUserArgs | ProgrammaticUserState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ProgrammaticUserState | undefined;
            resourceInputs["accounts"] = state ? state.accounts : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["policies"] = state ? state.policies : undefined;
            resourceInputs["userGroupIds"] = state ? state.userGroupIds : undefined;
        } else {
            const args = argsOrState as ProgrammaticUserArgs | undefined;
            resourceInputs["accounts"] = args ? args.accounts : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["policies"] = args ? args.policies : undefined;
            resourceInputs["userGroupIds"] = args ? args.userGroupIds : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ProgrammaticUser.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ProgrammaticUser resources.
 */
export interface ProgrammaticUserState {
    /**
     * All the accounts the programmatic user will have access to.
     * If used - Cannot be empty.
     */
    accounts?: pulumi.Input<pulumi.Input<inputs.organization.ProgrammaticUserAccount>[]>;
    /**
     * Brief description of the user.
     */
    description?: pulumi.Input<string>;
    /**
     * Name of the programmatic user.
     */
    name?: pulumi.Input<string>;
    /**
     * All the policies the programmatic user will have access to.
     * If used - Cannot be empty.
     */
    policies?: pulumi.Input<pulumi.Input<inputs.organization.ProgrammaticUserPolicy>[]>;
    /**
     * A list of the user groups to register the given user to (should be existing user groups only)
     */
    userGroupIds?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a ProgrammaticUser resource.
 */
export interface ProgrammaticUserArgs {
    /**
     * All the accounts the programmatic user will have access to.
     * If used - Cannot be empty.
     */
    accounts?: pulumi.Input<pulumi.Input<inputs.organization.ProgrammaticUserAccount>[]>;
    /**
     * Brief description of the user.
     */
    description?: pulumi.Input<string>;
    /**
     * Name of the programmatic user.
     */
    name?: pulumi.Input<string>;
    /**
     * All the policies the programmatic user will have access to.
     * If used - Cannot be empty.
     */
    policies?: pulumi.Input<pulumi.Input<inputs.organization.ProgrammaticUserPolicy>[]>;
    /**
     * A list of the user groups to register the given user to (should be existing user groups only)
     */
    userGroupIds?: pulumi.Input<pulumi.Input<string>[]>;
}
