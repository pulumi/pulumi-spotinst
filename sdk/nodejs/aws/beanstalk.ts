// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * Provides a Spotinst AWS group resource using Elastic Beanstalk.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as spotinst from "@pulumi/spotinst";
 *
 * const elastigoup_aws_beanstalk = new spotinst.aws.Beanstalk("elastigoup-aws-beanstalk", {
 *     beanstalkEnvironmentId: "e-example",
 *     beanstalkEnvironmentName: "example-env",
 *     deploymentPreferences: {
 *         automaticRoll: true,
 *         batchSizePercentage: 100,
 *         gracePeriod: 90,
 *         strategies: [{
 *             action: "REPLACE_SERVER",
 *             shouldDrainInstances: true,
 *         }],
 *     },
 *     desiredCapacity: 0,
 *     instanceTypesSpots: [
 *         "t2.micro",
 *         "t2.medium",
 *         "t2.large",
 *     ],
 *     managedActions: {
 *         platformUpdate: {
 *             performAt: "timeWindow",
 *             timeWindow: "Mon:23:50-Tue:00:20",
 *             updateLevel: "minorAndPatch",
 *         },
 *     },
 *     maxSize: 1,
 *     minSize: 0,
 *     product: "Linux/UNIX",
 *     region: "us-west-2",
 * });
 * ```
 */
export class Beanstalk extends pulumi.CustomResource {
    /**
     * Get an existing Beanstalk resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: BeanstalkState, opts?: pulumi.CustomResourceOptions): Beanstalk {
        return new Beanstalk(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'spotinst:aws/beanstalk:Beanstalk';

    /**
     * Returns true if the given object is an instance of Beanstalk.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Beanstalk {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Beanstalk.__pulumiType;
    }

    /**
     * The id of an existing Beanstalk environment.
     */
    public readonly beanstalkEnvironmentId!: pulumi.Output<string | undefined>;
    /**
     * The name of an existing Beanstalk environment.
     */
    public readonly beanstalkEnvironmentName!: pulumi.Output<string | undefined>;
    /**
     * Preferences when performing a roll
     */
    public readonly deploymentPreferences!: pulumi.Output<outputs.aws.BeanstalkDeploymentPreferences | undefined>;
    /**
     * The desired number of instances the group should have at any time.
     */
    public readonly desiredCapacity!: pulumi.Output<number>;
    /**
     * One or more instance types. To maximize the availability of Spot instances, select as many instance types as possible.
     */
    public readonly instanceTypesSpots!: pulumi.Output<string[]>;
    public readonly maintenance!: pulumi.Output<string | undefined>;
    /**
     * Managed Actions parameters
     */
    public readonly managedActions!: pulumi.Output<outputs.aws.BeanstalkManagedActions | undefined>;
    /**
     * The maximum number of instances the group should have at any time.
     */
    public readonly maxSize!: pulumi.Output<number>;
    /**
     * The minimum number of instances the group should have at any time.
     */
    public readonly minSize!: pulumi.Output<number>;
    /**
     * The group name.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Operation system type. Valid values: `"Linux/UNIX"`, `"SUSE Linux"`, `"Windows"`.
     * For EC2 Classic instances:  `"Linux/UNIX (Amazon VPC)"`, `"SUSE Linux (Amazon VPC)"`, `"Windows (Amazon VPC)"`.
     */
    public readonly product!: pulumi.Output<string>;
    /**
     * The AWS region your group will be created in. Cannot be changed after the group has been created.
     */
    public readonly region!: pulumi.Output<string>;
    public readonly scheduledTasks!: pulumi.Output<outputs.aws.BeanstalkScheduledTask[] | undefined>;

    /**
     * Create a Beanstalk resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: BeanstalkArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: BeanstalkArgs | BeanstalkState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as BeanstalkState | undefined;
            inputs["beanstalkEnvironmentId"] = state ? state.beanstalkEnvironmentId : undefined;
            inputs["beanstalkEnvironmentName"] = state ? state.beanstalkEnvironmentName : undefined;
            inputs["deploymentPreferences"] = state ? state.deploymentPreferences : undefined;
            inputs["desiredCapacity"] = state ? state.desiredCapacity : undefined;
            inputs["instanceTypesSpots"] = state ? state.instanceTypesSpots : undefined;
            inputs["maintenance"] = state ? state.maintenance : undefined;
            inputs["managedActions"] = state ? state.managedActions : undefined;
            inputs["maxSize"] = state ? state.maxSize : undefined;
            inputs["minSize"] = state ? state.minSize : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["product"] = state ? state.product : undefined;
            inputs["region"] = state ? state.region : undefined;
            inputs["scheduledTasks"] = state ? state.scheduledTasks : undefined;
        } else {
            const args = argsOrState as BeanstalkArgs | undefined;
            if ((!args || args.desiredCapacity === undefined) && !opts.urn) {
                throw new Error("Missing required property 'desiredCapacity'");
            }
            if ((!args || args.instanceTypesSpots === undefined) && !opts.urn) {
                throw new Error("Missing required property 'instanceTypesSpots'");
            }
            if ((!args || args.maxSize === undefined) && !opts.urn) {
                throw new Error("Missing required property 'maxSize'");
            }
            if ((!args || args.minSize === undefined) && !opts.urn) {
                throw new Error("Missing required property 'minSize'");
            }
            if ((!args || args.product === undefined) && !opts.urn) {
                throw new Error("Missing required property 'product'");
            }
            if ((!args || args.region === undefined) && !opts.urn) {
                throw new Error("Missing required property 'region'");
            }
            inputs["beanstalkEnvironmentId"] = args ? args.beanstalkEnvironmentId : undefined;
            inputs["beanstalkEnvironmentName"] = args ? args.beanstalkEnvironmentName : undefined;
            inputs["deploymentPreferences"] = args ? args.deploymentPreferences : undefined;
            inputs["desiredCapacity"] = args ? args.desiredCapacity : undefined;
            inputs["instanceTypesSpots"] = args ? args.instanceTypesSpots : undefined;
            inputs["maintenance"] = args ? args.maintenance : undefined;
            inputs["managedActions"] = args ? args.managedActions : undefined;
            inputs["maxSize"] = args ? args.maxSize : undefined;
            inputs["minSize"] = args ? args.minSize : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["product"] = args ? args.product : undefined;
            inputs["region"] = args ? args.region : undefined;
            inputs["scheduledTasks"] = args ? args.scheduledTasks : undefined;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(Beanstalk.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Beanstalk resources.
 */
export interface BeanstalkState {
    /**
     * The id of an existing Beanstalk environment.
     */
    readonly beanstalkEnvironmentId?: pulumi.Input<string>;
    /**
     * The name of an existing Beanstalk environment.
     */
    readonly beanstalkEnvironmentName?: pulumi.Input<string>;
    /**
     * Preferences when performing a roll
     */
    readonly deploymentPreferences?: pulumi.Input<inputs.aws.BeanstalkDeploymentPreferences>;
    /**
     * The desired number of instances the group should have at any time.
     */
    readonly desiredCapacity?: pulumi.Input<number>;
    /**
     * One or more instance types. To maximize the availability of Spot instances, select as many instance types as possible.
     */
    readonly instanceTypesSpots?: pulumi.Input<pulumi.Input<string>[]>;
    readonly maintenance?: pulumi.Input<string>;
    /**
     * Managed Actions parameters
     */
    readonly managedActions?: pulumi.Input<inputs.aws.BeanstalkManagedActions>;
    /**
     * The maximum number of instances the group should have at any time.
     */
    readonly maxSize?: pulumi.Input<number>;
    /**
     * The minimum number of instances the group should have at any time.
     */
    readonly minSize?: pulumi.Input<number>;
    /**
     * The group name.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * Operation system type. Valid values: `"Linux/UNIX"`, `"SUSE Linux"`, `"Windows"`.
     * For EC2 Classic instances:  `"Linux/UNIX (Amazon VPC)"`, `"SUSE Linux (Amazon VPC)"`, `"Windows (Amazon VPC)"`.
     */
    readonly product?: pulumi.Input<string>;
    /**
     * The AWS region your group will be created in. Cannot be changed after the group has been created.
     */
    readonly region?: pulumi.Input<string>;
    readonly scheduledTasks?: pulumi.Input<pulumi.Input<inputs.aws.BeanstalkScheduledTask>[]>;
}

/**
 * The set of arguments for constructing a Beanstalk resource.
 */
export interface BeanstalkArgs {
    /**
     * The id of an existing Beanstalk environment.
     */
    readonly beanstalkEnvironmentId?: pulumi.Input<string>;
    /**
     * The name of an existing Beanstalk environment.
     */
    readonly beanstalkEnvironmentName?: pulumi.Input<string>;
    /**
     * Preferences when performing a roll
     */
    readonly deploymentPreferences?: pulumi.Input<inputs.aws.BeanstalkDeploymentPreferences>;
    /**
     * The desired number of instances the group should have at any time.
     */
    readonly desiredCapacity: pulumi.Input<number>;
    /**
     * One or more instance types. To maximize the availability of Spot instances, select as many instance types as possible.
     */
    readonly instanceTypesSpots: pulumi.Input<pulumi.Input<string>[]>;
    readonly maintenance?: pulumi.Input<string>;
    /**
     * Managed Actions parameters
     */
    readonly managedActions?: pulumi.Input<inputs.aws.BeanstalkManagedActions>;
    /**
     * The maximum number of instances the group should have at any time.
     */
    readonly maxSize: pulumi.Input<number>;
    /**
     * The minimum number of instances the group should have at any time.
     */
    readonly minSize: pulumi.Input<number>;
    /**
     * The group name.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * Operation system type. Valid values: `"Linux/UNIX"`, `"SUSE Linux"`, `"Windows"`.
     * For EC2 Classic instances:  `"Linux/UNIX (Amazon VPC)"`, `"SUSE Linux (Amazon VPC)"`, `"Windows (Amazon VPC)"`.
     */
    readonly product: pulumi.Input<string>;
    /**
     * The AWS region your group will be created in. Cannot be changed after the group has been created.
     */
    readonly region: pulumi.Input<string>;
    readonly scheduledTasks?: pulumi.Input<pulumi.Input<inputs.aws.BeanstalkScheduledTask>[]>;
}
