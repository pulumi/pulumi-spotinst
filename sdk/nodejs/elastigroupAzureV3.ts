// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides a Spotinst elastigroup Azure resource.
 */
export class ElastigroupAzureV3 extends pulumi.CustomResource {
    /**
     * Get an existing ElastigroupAzureV3 resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ElastigroupAzureV3State, opts?: pulumi.CustomResourceOptions): ElastigroupAzureV3 {
        return new ElastigroupAzureV3(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'spotinst:index/elastigroupAzureV3:ElastigroupAzureV3';

    /**
     * Returns true if the given object is an instance of ElastigroupAzureV3.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ElastigroupAzureV3 {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ElastigroupAzureV3.__pulumiType;
    }

    /**
     * Custom init script file or text in Base64 encoded format.
     */
    public readonly customData!: pulumi.Output<string | undefined>;
    /**
     * The desired number of instances the group should have at any time.
     */
    public readonly desiredCapacity!: pulumi.Output<number | undefined>;
    /**
     * Time (seconds) to allow the instance to be drained from incoming TCP connections and detached from MLB before terminating it during a scale-down operation.
     */
    public readonly drainingTimeout!: pulumi.Output<number>;
    public readonly fallbackToOnDemand!: pulumi.Output<boolean>;
    public readonly images!: pulumi.Output<outputs.ElastigroupAzureV3Image[] | undefined>;
    public readonly login!: pulumi.Output<outputs.ElastigroupAzureV3Login | undefined>;
    /**
     * List of Managed Service Identity objects.
     */
    public readonly managedServiceIdentities!: pulumi.Output<outputs.ElastigroupAzureV3ManagedServiceIdentity[] | undefined>;
    /**
     * The maximum number of instances the group should have at any time.
     */
    public readonly maxSize!: pulumi.Output<number>;
    /**
     * The minimum number of instances the group should have at any time.
     */
    public readonly minSize!: pulumi.Output<number>;
    /**
     * Name of the Managed Service Identity.
     */
    public readonly name!: pulumi.Output<string>;
    public readonly network!: pulumi.Output<outputs.ElastigroupAzureV3Network>;
    /**
     * Available On-Demand sizes
     */
    public readonly odSizes!: pulumi.Output<string[]>;
    public readonly onDemandCount!: pulumi.Output<number | undefined>;
    /**
     * Type of the operating system. Valid values: `"Linux"`, `"Windows"`.
     */
    public readonly os!: pulumi.Output<string>;
    /**
     * The region your Azure group will be created in.
     */
    public readonly region!: pulumi.Output<string>;
    /**
     * Name of the Azure Resource Group where the Managed Service Identity is located.
     */
    public readonly resourceGroupName!: pulumi.Output<string>;
    /**
     * TODO
     */
    public readonly spotPercentage!: pulumi.Output<number | undefined>;
    /**
     * Available Low-Priority sizes.
     */
    public readonly spotSizes!: pulumi.Output<string[]>;

    /**
     * Create a ElastigroupAzureV3 resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ElastigroupAzureV3Args, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ElastigroupAzureV3Args | ElastigroupAzureV3State, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ElastigroupAzureV3State | undefined;
            resourceInputs["customData"] = state ? state.customData : undefined;
            resourceInputs["desiredCapacity"] = state ? state.desiredCapacity : undefined;
            resourceInputs["drainingTimeout"] = state ? state.drainingTimeout : undefined;
            resourceInputs["fallbackToOnDemand"] = state ? state.fallbackToOnDemand : undefined;
            resourceInputs["images"] = state ? state.images : undefined;
            resourceInputs["login"] = state ? state.login : undefined;
            resourceInputs["managedServiceIdentities"] = state ? state.managedServiceIdentities : undefined;
            resourceInputs["maxSize"] = state ? state.maxSize : undefined;
            resourceInputs["minSize"] = state ? state.minSize : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["network"] = state ? state.network : undefined;
            resourceInputs["odSizes"] = state ? state.odSizes : undefined;
            resourceInputs["onDemandCount"] = state ? state.onDemandCount : undefined;
            resourceInputs["os"] = state ? state.os : undefined;
            resourceInputs["region"] = state ? state.region : undefined;
            resourceInputs["resourceGroupName"] = state ? state.resourceGroupName : undefined;
            resourceInputs["spotPercentage"] = state ? state.spotPercentage : undefined;
            resourceInputs["spotSizes"] = state ? state.spotSizes : undefined;
        } else {
            const args = argsOrState as ElastigroupAzureV3Args | undefined;
            if ((!args || args.fallbackToOnDemand === undefined) && !opts.urn) {
                throw new Error("Missing required property 'fallbackToOnDemand'");
            }
            if ((!args || args.name === undefined) && !opts.urn) {
                throw new Error("Missing required property 'name'");
            }
            if ((!args || args.network === undefined) && !opts.urn) {
                throw new Error("Missing required property 'network'");
            }
            if ((!args || args.odSizes === undefined) && !opts.urn) {
                throw new Error("Missing required property 'odSizes'");
            }
            if ((!args || args.os === undefined) && !opts.urn) {
                throw new Error("Missing required property 'os'");
            }
            if ((!args || args.region === undefined) && !opts.urn) {
                throw new Error("Missing required property 'region'");
            }
            if ((!args || args.resourceGroupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceGroupName'");
            }
            if ((!args || args.spotSizes === undefined) && !opts.urn) {
                throw new Error("Missing required property 'spotSizes'");
            }
            resourceInputs["customData"] = args ? args.customData : undefined;
            resourceInputs["desiredCapacity"] = args ? args.desiredCapacity : undefined;
            resourceInputs["drainingTimeout"] = args ? args.drainingTimeout : undefined;
            resourceInputs["fallbackToOnDemand"] = args ? args.fallbackToOnDemand : undefined;
            resourceInputs["images"] = args ? args.images : undefined;
            resourceInputs["login"] = args ? args.login : undefined;
            resourceInputs["managedServiceIdentities"] = args ? args.managedServiceIdentities : undefined;
            resourceInputs["maxSize"] = args ? args.maxSize : undefined;
            resourceInputs["minSize"] = args ? args.minSize : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["network"] = args ? args.network : undefined;
            resourceInputs["odSizes"] = args ? args.odSizes : undefined;
            resourceInputs["onDemandCount"] = args ? args.onDemandCount : undefined;
            resourceInputs["os"] = args ? args.os : undefined;
            resourceInputs["region"] = args ? args.region : undefined;
            resourceInputs["resourceGroupName"] = args ? args.resourceGroupName : undefined;
            resourceInputs["spotPercentage"] = args ? args.spotPercentage : undefined;
            resourceInputs["spotSizes"] = args ? args.spotSizes : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ElastigroupAzureV3.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ElastigroupAzureV3 resources.
 */
export interface ElastigroupAzureV3State {
    /**
     * Custom init script file or text in Base64 encoded format.
     */
    customData?: pulumi.Input<string>;
    /**
     * The desired number of instances the group should have at any time.
     */
    desiredCapacity?: pulumi.Input<number>;
    /**
     * Time (seconds) to allow the instance to be drained from incoming TCP connections and detached from MLB before terminating it during a scale-down operation.
     */
    drainingTimeout?: pulumi.Input<number>;
    fallbackToOnDemand?: pulumi.Input<boolean>;
    images?: pulumi.Input<pulumi.Input<inputs.ElastigroupAzureV3Image>[]>;
    login?: pulumi.Input<inputs.ElastigroupAzureV3Login>;
    /**
     * List of Managed Service Identity objects.
     */
    managedServiceIdentities?: pulumi.Input<pulumi.Input<inputs.ElastigroupAzureV3ManagedServiceIdentity>[]>;
    /**
     * The maximum number of instances the group should have at any time.
     */
    maxSize?: pulumi.Input<number>;
    /**
     * The minimum number of instances the group should have at any time.
     */
    minSize?: pulumi.Input<number>;
    /**
     * Name of the Managed Service Identity.
     */
    name?: pulumi.Input<string>;
    network?: pulumi.Input<inputs.ElastigroupAzureV3Network>;
    /**
     * Available On-Demand sizes
     */
    odSizes?: pulumi.Input<pulumi.Input<string>[]>;
    onDemandCount?: pulumi.Input<number>;
    /**
     * Type of the operating system. Valid values: `"Linux"`, `"Windows"`.
     */
    os?: pulumi.Input<string>;
    /**
     * The region your Azure group will be created in.
     */
    region?: pulumi.Input<string>;
    /**
     * Name of the Azure Resource Group where the Managed Service Identity is located.
     */
    resourceGroupName?: pulumi.Input<string>;
    /**
     * TODO
     */
    spotPercentage?: pulumi.Input<number>;
    /**
     * Available Low-Priority sizes.
     */
    spotSizes?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a ElastigroupAzureV3 resource.
 */
export interface ElastigroupAzureV3Args {
    /**
     * Custom init script file or text in Base64 encoded format.
     */
    customData?: pulumi.Input<string>;
    /**
     * The desired number of instances the group should have at any time.
     */
    desiredCapacity?: pulumi.Input<number>;
    /**
     * Time (seconds) to allow the instance to be drained from incoming TCP connections and detached from MLB before terminating it during a scale-down operation.
     */
    drainingTimeout?: pulumi.Input<number>;
    fallbackToOnDemand: pulumi.Input<boolean>;
    images?: pulumi.Input<pulumi.Input<inputs.ElastigroupAzureV3Image>[]>;
    login?: pulumi.Input<inputs.ElastigroupAzureV3Login>;
    /**
     * List of Managed Service Identity objects.
     */
    managedServiceIdentities?: pulumi.Input<pulumi.Input<inputs.ElastigroupAzureV3ManagedServiceIdentity>[]>;
    /**
     * The maximum number of instances the group should have at any time.
     */
    maxSize?: pulumi.Input<number>;
    /**
     * The minimum number of instances the group should have at any time.
     */
    minSize?: pulumi.Input<number>;
    /**
     * Name of the Managed Service Identity.
     */
    name: pulumi.Input<string>;
    network: pulumi.Input<inputs.ElastigroupAzureV3Network>;
    /**
     * Available On-Demand sizes
     */
    odSizes: pulumi.Input<pulumi.Input<string>[]>;
    onDemandCount?: pulumi.Input<number>;
    /**
     * Type of the operating system. Valid values: `"Linux"`, `"Windows"`.
     */
    os: pulumi.Input<string>;
    /**
     * The region your Azure group will be created in.
     */
    region: pulumi.Input<string>;
    /**
     * Name of the Azure Resource Group where the Managed Service Identity is located.
     */
    resourceGroupName: pulumi.Input<string>;
    /**
     * TODO
     */
    spotPercentage?: pulumi.Input<number>;
    /**
     * Available Low-Priority sizes.
     */
    spotSizes: pulumi.Input<pulumi.Input<string>[]>;
}
