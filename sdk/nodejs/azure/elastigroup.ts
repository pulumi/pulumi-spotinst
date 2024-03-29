// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Provides a Spotinst elastigroup Azure resource.
 *
 * ## Image
 *
 * * `image` - (Required) Image of a VM. An image is a template for creating new VMs. Choose from Azure image catalogue (marketplace) or use a custom image.
 *     * `publisher` - (Optional) Image publisher. Required if resourceGroupName is not specified.
 *     * `offer` - (Optional) Name of the image to use. Required if publisher is specified.
 *     * `sku` - (Optional) Image's Stock Keeping Unit, which is the specific version of the image. Required if publisher is specified.
 *     * `version` -
 *     * `resourceGroupName` - (Optional) Name of Resource Group for custom image. Required if publisher not specified.
 *     * `imageName` - (Optional) Name of the custom image. Required if resourceGroupName is specified.
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * <a id="network"></a>
 * ## Network
 *
 * * `network` - (Required) Defines the Virtual Network and Subnet for your Elastigroup.
 *     * `virtualNetworkName` - (Required) Name of Vnet.
 *     * `resourceGroupName` - (Required) Vnet Resource Group Name.
 *     * `networkInterfaces` -
 *         * `subnetName` - (Required) ID of subnet.
 *         * `assignPublicUp` - (Optional, Default: `false`) Assign a public IP to each VM in the Elastigroup.
 *         * `isPrimary` -
 *         * `additionalIpConfigs` - (Optional) Array of additional IP configuration objects.
 *             * `name` - (Required) The IP configuration name.
 *             * `privateIpVersion` - (Optional) Available from Azure Api-Version 2017-03-30 onwards, it represents whether the specific ip configuration is IPv4 or IPv6. Valid values: `IPv4`, `IPv6`.
 *         * `applicationSecurityGroup` - (Optional) - List of Application Security Groups that will be associated to the primary ip configuration of the network interface.
 *             * `name` - (Required) - The name of the Application Security group.
 *             * `resourceGroupName` - (Required) - The resource group of the Application Security Group.
 *               }
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ### Login
 *
 * * `login` - (Required) Describes the login configuration.
 *     * `userName` - (Required) Set admin access for accessing your VMs.
 *     * `sshPublicKey` - (Optional) SSH for admin access to Linux VMs. Required for Linux OS types.
 *     * `password` - (Optional) Password for admin access to Windows VMs. Required for Windows OS types.
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * ```
 * <!--End PulumiCodeChooser -->
 */
export class Elastigroup extends pulumi.CustomResource {
    /**
     * Get an existing Elastigroup resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ElastigroupState, opts?: pulumi.CustomResourceOptions): Elastigroup {
        return new Elastigroup(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'spotinst:azure/elastigroup:Elastigroup';

    /**
     * Returns true if the given object is an instance of Elastigroup.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Elastigroup {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Elastigroup.__pulumiType;
    }

    /**
     * Custom init script file or text in Base64 encoded format.
     */
    public readonly customData!: pulumi.Output<string | undefined>;
    /**
     * The desired number of instances the group should have at any time.
     */
    public readonly desiredCapacity!: pulumi.Output<number | undefined>;
    public readonly healthCheck!: pulumi.Output<outputs.azure.ElastigroupHealthCheck | undefined>;
    public readonly images!: pulumi.Output<outputs.azure.ElastigroupImage[] | undefined>;
    public readonly integrationKubernetes!: pulumi.Output<outputs.azure.ElastigroupIntegrationKubernetes | undefined>;
    public readonly integrationMultaiRuntime!: pulumi.Output<outputs.azure.ElastigroupIntegrationMultaiRuntime | undefined>;
    public readonly loadBalancers!: pulumi.Output<outputs.azure.ElastigroupLoadBalancer[] | undefined>;
    public readonly login!: pulumi.Output<outputs.azure.ElastigroupLogin | undefined>;
    public readonly lowPrioritySizes!: pulumi.Output<string[]>;
    public readonly managedServiceIdentities!: pulumi.Output<outputs.azure.ElastigroupManagedServiceIdentity[] | undefined>;
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
    public readonly network!: pulumi.Output<outputs.azure.ElastigroupNetwork>;
    /**
     * Available On-Demand sizes
     */
    public readonly odSizes!: pulumi.Output<string[]>;
    public readonly product!: pulumi.Output<string>;
    /**
     * The region your Azure group will be created in.
     */
    public readonly region!: pulumi.Output<string>;
    /**
     * Name of the Azure Resource Group where the Managed Service Identity is located.
     */
    public readonly resourceGroupName!: pulumi.Output<string>;
    public readonly scalingDownPolicies!: pulumi.Output<outputs.azure.ElastigroupScalingDownPolicy[] | undefined>;
    public readonly scalingUpPolicies!: pulumi.Output<outputs.azure.ElastigroupScalingUpPolicy[] | undefined>;
    public readonly scheduledTasks!: pulumi.Output<outputs.azure.ElastigroupScheduledTask[] | undefined>;
    public readonly shutdownScript!: pulumi.Output<string | undefined>;
    public readonly strategy!: pulumi.Output<outputs.azure.ElastigroupStrategy>;
    public readonly updatePolicy!: pulumi.Output<outputs.azure.ElastigroupUpdatePolicy | undefined>;
    public readonly userData!: pulumi.Output<string | undefined>;

    /**
     * Create a Elastigroup resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ElastigroupArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ElastigroupArgs | ElastigroupState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ElastigroupState | undefined;
            resourceInputs["customData"] = state ? state.customData : undefined;
            resourceInputs["desiredCapacity"] = state ? state.desiredCapacity : undefined;
            resourceInputs["healthCheck"] = state ? state.healthCheck : undefined;
            resourceInputs["images"] = state ? state.images : undefined;
            resourceInputs["integrationKubernetes"] = state ? state.integrationKubernetes : undefined;
            resourceInputs["integrationMultaiRuntime"] = state ? state.integrationMultaiRuntime : undefined;
            resourceInputs["loadBalancers"] = state ? state.loadBalancers : undefined;
            resourceInputs["login"] = state ? state.login : undefined;
            resourceInputs["lowPrioritySizes"] = state ? state.lowPrioritySizes : undefined;
            resourceInputs["managedServiceIdentities"] = state ? state.managedServiceIdentities : undefined;
            resourceInputs["maxSize"] = state ? state.maxSize : undefined;
            resourceInputs["minSize"] = state ? state.minSize : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["network"] = state ? state.network : undefined;
            resourceInputs["odSizes"] = state ? state.odSizes : undefined;
            resourceInputs["product"] = state ? state.product : undefined;
            resourceInputs["region"] = state ? state.region : undefined;
            resourceInputs["resourceGroupName"] = state ? state.resourceGroupName : undefined;
            resourceInputs["scalingDownPolicies"] = state ? state.scalingDownPolicies : undefined;
            resourceInputs["scalingUpPolicies"] = state ? state.scalingUpPolicies : undefined;
            resourceInputs["scheduledTasks"] = state ? state.scheduledTasks : undefined;
            resourceInputs["shutdownScript"] = state ? state.shutdownScript : undefined;
            resourceInputs["strategy"] = state ? state.strategy : undefined;
            resourceInputs["updatePolicy"] = state ? state.updatePolicy : undefined;
            resourceInputs["userData"] = state ? state.userData : undefined;
        } else {
            const args = argsOrState as ElastigroupArgs | undefined;
            if ((!args || args.lowPrioritySizes === undefined) && !opts.urn) {
                throw new Error("Missing required property 'lowPrioritySizes'");
            }
            if ((!args || args.network === undefined) && !opts.urn) {
                throw new Error("Missing required property 'network'");
            }
            if ((!args || args.odSizes === undefined) && !opts.urn) {
                throw new Error("Missing required property 'odSizes'");
            }
            if ((!args || args.product === undefined) && !opts.urn) {
                throw new Error("Missing required property 'product'");
            }
            if ((!args || args.region === undefined) && !opts.urn) {
                throw new Error("Missing required property 'region'");
            }
            if ((!args || args.resourceGroupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceGroupName'");
            }
            if ((!args || args.strategy === undefined) && !opts.urn) {
                throw new Error("Missing required property 'strategy'");
            }
            resourceInputs["customData"] = args ? args.customData : undefined;
            resourceInputs["desiredCapacity"] = args ? args.desiredCapacity : undefined;
            resourceInputs["healthCheck"] = args ? args.healthCheck : undefined;
            resourceInputs["images"] = args ? args.images : undefined;
            resourceInputs["integrationKubernetes"] = args ? args.integrationKubernetes : undefined;
            resourceInputs["integrationMultaiRuntime"] = args ? args.integrationMultaiRuntime : undefined;
            resourceInputs["loadBalancers"] = args ? args.loadBalancers : undefined;
            resourceInputs["login"] = args ? args.login : undefined;
            resourceInputs["lowPrioritySizes"] = args ? args.lowPrioritySizes : undefined;
            resourceInputs["managedServiceIdentities"] = args ? args.managedServiceIdentities : undefined;
            resourceInputs["maxSize"] = args ? args.maxSize : undefined;
            resourceInputs["minSize"] = args ? args.minSize : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["network"] = args ? args.network : undefined;
            resourceInputs["odSizes"] = args ? args.odSizes : undefined;
            resourceInputs["product"] = args ? args.product : undefined;
            resourceInputs["region"] = args ? args.region : undefined;
            resourceInputs["resourceGroupName"] = args ? args.resourceGroupName : undefined;
            resourceInputs["scalingDownPolicies"] = args ? args.scalingDownPolicies : undefined;
            resourceInputs["scalingUpPolicies"] = args ? args.scalingUpPolicies : undefined;
            resourceInputs["scheduledTasks"] = args ? args.scheduledTasks : undefined;
            resourceInputs["shutdownScript"] = args ? args.shutdownScript : undefined;
            resourceInputs["strategy"] = args ? args.strategy : undefined;
            resourceInputs["updatePolicy"] = args ? args.updatePolicy : undefined;
            resourceInputs["userData"] = args ? args.userData : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Elastigroup.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Elastigroup resources.
 */
export interface ElastigroupState {
    /**
     * Custom init script file or text in Base64 encoded format.
     */
    customData?: pulumi.Input<string>;
    /**
     * The desired number of instances the group should have at any time.
     */
    desiredCapacity?: pulumi.Input<number>;
    healthCheck?: pulumi.Input<inputs.azure.ElastigroupHealthCheck>;
    images?: pulumi.Input<pulumi.Input<inputs.azure.ElastigroupImage>[]>;
    integrationKubernetes?: pulumi.Input<inputs.azure.ElastigroupIntegrationKubernetes>;
    integrationMultaiRuntime?: pulumi.Input<inputs.azure.ElastigroupIntegrationMultaiRuntime>;
    loadBalancers?: pulumi.Input<pulumi.Input<inputs.azure.ElastigroupLoadBalancer>[]>;
    login?: pulumi.Input<inputs.azure.ElastigroupLogin>;
    lowPrioritySizes?: pulumi.Input<pulumi.Input<string>[]>;
    managedServiceIdentities?: pulumi.Input<pulumi.Input<inputs.azure.ElastigroupManagedServiceIdentity>[]>;
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
    network?: pulumi.Input<inputs.azure.ElastigroupNetwork>;
    /**
     * Available On-Demand sizes
     */
    odSizes?: pulumi.Input<pulumi.Input<string>[]>;
    product?: pulumi.Input<string>;
    /**
     * The region your Azure group will be created in.
     */
    region?: pulumi.Input<string>;
    /**
     * Name of the Azure Resource Group where the Managed Service Identity is located.
     */
    resourceGroupName?: pulumi.Input<string>;
    scalingDownPolicies?: pulumi.Input<pulumi.Input<inputs.azure.ElastigroupScalingDownPolicy>[]>;
    scalingUpPolicies?: pulumi.Input<pulumi.Input<inputs.azure.ElastigroupScalingUpPolicy>[]>;
    scheduledTasks?: pulumi.Input<pulumi.Input<inputs.azure.ElastigroupScheduledTask>[]>;
    shutdownScript?: pulumi.Input<string>;
    strategy?: pulumi.Input<inputs.azure.ElastigroupStrategy>;
    updatePolicy?: pulumi.Input<inputs.azure.ElastigroupUpdatePolicy>;
    userData?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Elastigroup resource.
 */
export interface ElastigroupArgs {
    /**
     * Custom init script file or text in Base64 encoded format.
     */
    customData?: pulumi.Input<string>;
    /**
     * The desired number of instances the group should have at any time.
     */
    desiredCapacity?: pulumi.Input<number>;
    healthCheck?: pulumi.Input<inputs.azure.ElastigroupHealthCheck>;
    images?: pulumi.Input<pulumi.Input<inputs.azure.ElastigroupImage>[]>;
    integrationKubernetes?: pulumi.Input<inputs.azure.ElastigroupIntegrationKubernetes>;
    integrationMultaiRuntime?: pulumi.Input<inputs.azure.ElastigroupIntegrationMultaiRuntime>;
    loadBalancers?: pulumi.Input<pulumi.Input<inputs.azure.ElastigroupLoadBalancer>[]>;
    login?: pulumi.Input<inputs.azure.ElastigroupLogin>;
    lowPrioritySizes: pulumi.Input<pulumi.Input<string>[]>;
    managedServiceIdentities?: pulumi.Input<pulumi.Input<inputs.azure.ElastigroupManagedServiceIdentity>[]>;
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
    network: pulumi.Input<inputs.azure.ElastigroupNetwork>;
    /**
     * Available On-Demand sizes
     */
    odSizes: pulumi.Input<pulumi.Input<string>[]>;
    product: pulumi.Input<string>;
    /**
     * The region your Azure group will be created in.
     */
    region: pulumi.Input<string>;
    /**
     * Name of the Azure Resource Group where the Managed Service Identity is located.
     */
    resourceGroupName: pulumi.Input<string>;
    scalingDownPolicies?: pulumi.Input<pulumi.Input<inputs.azure.ElastigroupScalingDownPolicy>[]>;
    scalingUpPolicies?: pulumi.Input<pulumi.Input<inputs.azure.ElastigroupScalingUpPolicy>[]>;
    scheduledTasks?: pulumi.Input<pulumi.Input<inputs.azure.ElastigroupScheduledTask>[]>;
    shutdownScript?: pulumi.Input<string>;
    strategy: pulumi.Input<inputs.azure.ElastigroupStrategy>;
    updatePolicy?: pulumi.Input<inputs.azure.ElastigroupUpdatePolicy>;
    userData?: pulumi.Input<string>;
}
