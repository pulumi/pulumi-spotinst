// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Provides a Spotinst elastigroup Azure resource.
 * 
 * ## Example Usage
 * 
 * 
 * 
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as spotinst from "@pulumi/spotinst";
 * 
 * const testAzureGroup = new spotinst.azure.Elastigroup("testAzureGroup", {
 *     desiredCapacity: 1,
 *     // --- HEALTH-CHECKS -------------------------------------------------
 *     healthCheck: {
 *         autoHealing: true,
 *         gracePeriod: 120,
 *         healthCheckType: "INSTANCE_STATE",
 *     },
 *     // --- IMAGE ---------------------------------------------------------
 *     images: [{
 *         marketplaces: [{
 *             offer: "UbuntuServer",
 *             publisher: "Canonical",
 *             sku: "16.04-LTS",
 *         }],
 *     }],
 *     // --- LOAD BALANCERS ------------------------------------------------
 *     loadBalancers: [{
 *         autoWeight: true,
 *         balancerId: "lb-1ee2e3q",
 *         targetSetId: "ts-3eq",
 *         type: "MULTAI_TARGET_SET",
 *     }],
 *     // --- LOGIN ---------------------------------------------------------
 *     login: {
 *         sshPublicKey: "33a2s1f3g5a1df5g1ad3f2g1adfg56dfg==",
 *         userName: "admin",
 *     },
 *     lowPrioritySizes: [
 *         "standardA1V1",
 *         "standardA1V2",
 *     ],
 *     managedServiceIdentities: [{
 *         name: "example-identity",
 *         resourceGroupName: "spotinst-azure",
 *     }],
 *     maxSize: 1,
 *     // --- CAPACITY ------------------------------------------------------
 *     minSize: 0,
 *     // --- NETWORK -------------------------------------------------------
 *     network: {
 *         assignPublicIp: true,
 *         resourceGroupName: "subnetResourceGroup",
 *         subnetName: "my-subnet-name",
 *         virtualNetworkName: "vname",
 *     },
 *     // --- INSTANCE TYPES ------------------------------------------------
 *     odSizes: [
 *         "standardA1V1",
 *         "standardA1V2",
 *     ],
 *     product: "Linux",
 *     region: "eastus",
 *     resourceGroupName: "spotinst-azure",
 *     scalingDownPolicies: [{
 *         actionType: "adjustment",
 *         adjustment: "MIN(5,10)",
 *         cooldown: 60,
 *         dimensions: [{
 *             name: "name-1",
 *             value: "value-1",
 *         }],
 *         evaluationPeriods: 10,
 *         metricName: "CPUUtilization",
 *         namespace: "Microsoft.Compute",
 *         operator: "gt",
 *         period: 60,
 *         policyName: "policy-name",
 *         statistic: "average",
 *         threshold: 10,
 *         unit: "percent",
 *     }],
 *     // --- SCALING POLICIES ----------------------------------------------
 *     scalingUpPolicies: [{
 *         actionType: "setMinTarget",
 *         cooldown: 60,
 *         dimensions: [
 *             {
 *                 name: "resourceName",
 *                 value: "resource-name",
 *             },
 *             {
 *                 name: "resourceGroupName",
 *                 value: "resource-group-name",
 *             },
 *         ],
 *         evaluationPeriods: 10,
 *         metricName: "CPUUtilization",
 *         minTargetCapacity: "1",
 *         namespace: "Microsoft.Compute",
 *         operator: "gt",
 *         period: 60,
 *         policyName: "policy-name",
 *         statistic: "average",
 *         threshold: 10,
 *         unit: "percent",
 *     }],
 *     // --- SCHEDULED TASK ------------------------------------------------
 *     scheduledTasks: [{
 *         adjustment: "2",
 *         adjustmentPercentage: "50",
 *         batchSizePercentage: "33",
 *         cronExpression: "* * * * *",
 *         gracePeriod: "300",
 *         isEnabled: true,
 *         scaleMaxCapacity: "8",
 *         scaleMinCapacity: "5",
 *         scaleTargetCapacity: "6",
 *         taskType: "scale",
 *     }],
 *     shutdownScript: "",
 *     // --- STRATEGY ------------------------------------------------------
 *     strategy: {
 *         drainingTimeout: 300,
 *         odCount: 1,
 *     },
 *     userData: "",
 * });
 * ```
 * 
 * ## Load Balancers
 * 
 * * `loadBalancers` - (Required) Describes a set of one or more classic load balancer target groups and/or Multai load balancer target sets.
 * * `type` - (Required) The resource type. Valid values: CLASSIC, TARGET_GROUP, MULTAI_TARGET_SET.
 * * `balancerId` - (Required) The balancer ID.
 * * `targetSetId` - (Required) The scale set ID associated with the load balancer.
 * * `autoWeight` - (Optional, Default: `false`)
 * 
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * ```
 * 
 * <a id="image"></a>
 * ## Image
 * 
 * * `image` - (Required) Image of a VM. An image is a template for creating new VMs. Choose from Azure image catalogue (marketplace) or use a custom image.
 * * `publisher` - (Optional) Image publisher. Required if resourceGroupName is not specified.
 * * `offer` - (Optional) Name of the image to use. Required if publisher is specified.
 * * `sku` - (Optional) Image's Stock Keeping Unit, which is the specific version of the image. Required if publisher is specified.
 * * `resourceGroupName` - (Optional) Name of Resource Group for custom image. Required if publisher not specified.
 * * `imageName` - (Optional) Name of the custom image. Required if resourceGroupName is specified.
 * 
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * ```
 * 
 * <a id="health-check"></a>
 * ## Health Check
 * 
 * * `healthCheck` - (Optional) Describes the health check configuration.
 * * `healthCheckType` - (Optional) Health check used to validate VM health. Valid values: “INSTANCE_STATE”.
 * * `gracePeriod` - (Optional) Period of time (seconds) to wait for VM to reach healthiness before monitoring for unhealthiness.
 * * `autoHealing` - (Optional) Enable auto-healing of unhealthy VMs.
 * 
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * ```
 * 
 * <a id="network"></a>
 * ## Network
 * 
 * * `network` - (Required) Defines the Virtual Network and Subnet for your Elastigroup.
 * * `virtualNetworkName` - (Required) Name of Vnet.
 * * `subnetName` - (Required) ID of subnet.
 * * `resourceGroupName` - (Required) Vnet Resource Group Name.
 * * `assignPublicUp` - (Optional, Default: `false`) Assign a public IP to each VM in the Elastigroup.
 * * `additionalIpConfigs` - (Optional) Array of additional IP configuration objects.
 * * `name` - (Required) The IP configuration name.
 * * `privateIpVersion` - (Optional) Available from Azure Api-Version 2017-03-30 onwards, it represents whether the specific ipconfiguration is IPv4 or IPv6. Valid values: `IPv4`, `IPv6`.
 * 
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * ```
 * 
 * <a id="login"></a>
 * ## Login
 * 
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * ```
 * 
 * <a id="login"></a>
 * ## Login
 * 
 * * `login` - (Required) Describes the login configuration.
 * * `userName` - (Required) Set admin access for accessing your VMs.
 * * `sshPublicKey` - (Optional) SSH for admin access to Linux VMs. Required for Linux product types.
 * * `password` - (Optional) Password for admin access to Windows VMs. Required for Windows product types.
 * 
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * ```
 * 
 * <a id="scaling-policy"></a>
 * ## Scheduling
 * 
 * * `scheduledTask` - (Optional) Describes the configuration of one or more scheduled tasks.
 * * `isEnabled` - (Optional, Default: `true`) Describes whether the task is enabled. When true the task should run when false it should not run.
 * * `cronExpression` - (Required) A valid cron expression (`* * * * *`). The cron is running in UTC time zone and is in Unix cron format Cron Expression Validator Script.
 * * `taskType` - (Required) The task type to run. Valid Values: `backupAmi`, `scale`, `scaleUp`, `roll`, `statefulUpdateCapacity`, `statefulRecycle`.
 * * `scaleMinCapacity` - (Optional) The min capacity of the group. Should be used when choosing ‘task_type' of ‘scale'.
 * * `scaleMaxCapacity` - (Optional) The max capacity of the group. Required when ‘task_type' is ‘scale'.
 * * `scaleTargetCapacity` - (Optional) The target capacity of the group. Should be used when choosing ‘task_type' of ‘scale'.
 * * `adjustment` - (Optional) The number of instances to add/remove to/from the target capacity when scale is needed.
 * * `adjustmentPercentage` - (Optional) The percent of instances to add/remove to/from the target capacity when scale is needed.
 * * `batchSizePercentage` - (Optional) The percentage size of each batch in the scheduled deployment roll. Required when the 'task_type' is 'roll'.
 * * `gracePeriod` - (Optional) The time to allow instances to become healthy.
 * 
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * ```
 * 
 * <a id="update-policy"></a>
 * ## Update Policy
 * 
 * * `updatePolicy` - (Optional)
 * 
 *     * `shouldRoll` - (Required) Sets the enablement of the roll option.
 *     * `rollConfig` - (Required) While used, you can control whether the group should perform a deployment after an update to the configuration.
 *         * `batchSizePercentage` - (Required) Sets the percentage of the instances to deploy in each batch.
 *         * `healthCheckType` - (Optional) Sets the health check type to use. Valid values: `"INSTANCE_STATE"`, `"NONE"`.
 *         * `gracePeriod` - (Optional) Sets the grace period for new instances to become healthy.
 *        
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * ```
 * 
 * <a id="third-party-integrations"></a>
 * ## Third-Party Integrations
 * 
 * * `integrationKubernetes` - (Optional) Describes the [Kubernetes](https://kubernetes.io/) integration.
 *     * `clusterIdentifier` - (Required) The cluster ID.
 * 
 * Usage:
 * 
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * ```
 * 
 * * `integrationMultaiRuntime` - (Optional) Describes the [Multai Runtime](https://spotinst.com/) integration.
 *     * `deploymentId` - (Optional) The deployment id you want to get
 * 
 * Usage:
 * 
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * ```
 *
 * > This content is derived from https://github.com/terraform-providers/terraform-provider-spotinst/blob/master/website/docs/r/elastigroup_azure.html.markdown.
 */
export class Elastigroup extends pulumi.CustomResource {
    /**
     * Get an existing Elastigroup resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
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
    /**
     * Available Low-Priority sizes.
     */
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
     * The name of the managed identity.
     */
    public readonly name!: pulumi.Output<string>;
    public readonly network!: pulumi.Output<outputs.azure.ElastigroupNetwork>;
    /**
     * Available On-Demand sizes
     */
    public readonly odSizes!: pulumi.Output<string[]>;
    /**
     * Operation system type. Valid values: `"Linux"`, `"Windows"`.
     */
    public readonly product!: pulumi.Output<string>;
    /**
     * The region your Azure group will be created in.
     */
    public readonly region!: pulumi.Output<string>;
    /**
     * The Resource Group that the user-assigned managed identity resides in.
     */
    public readonly resourceGroupName!: pulumi.Output<string>;
    public readonly scalingDownPolicies!: pulumi.Output<outputs.azure.ElastigroupScalingDownPolicy[] | undefined>;
    public readonly scalingUpPolicies!: pulumi.Output<outputs.azure.ElastigroupScalingUpPolicy[] | undefined>;
    public readonly scheduledTasks!: pulumi.Output<outputs.azure.ElastigroupScheduledTask[] | undefined>;
    /**
     * Shutdown script for the group. Value should be passed as a string encoded at Base64 only.
     */
    public readonly shutdownScript!: pulumi.Output<string | undefined>;
    /**
     * Describes the deployment strategy.
     */
    public readonly strategy!: pulumi.Output<outputs.azure.ElastigroupStrategy>;
    public readonly updatePolicy!: pulumi.Output<outputs.azure.ElastigroupUpdatePolicy | undefined>;
    /**
     * Base64-encoded MIME user data to make available to the instances.
     */
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
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as ElastigroupState | undefined;
            inputs["customData"] = state ? state.customData : undefined;
            inputs["desiredCapacity"] = state ? state.desiredCapacity : undefined;
            inputs["healthCheck"] = state ? state.healthCheck : undefined;
            inputs["images"] = state ? state.images : undefined;
            inputs["integrationKubernetes"] = state ? state.integrationKubernetes : undefined;
            inputs["integrationMultaiRuntime"] = state ? state.integrationMultaiRuntime : undefined;
            inputs["loadBalancers"] = state ? state.loadBalancers : undefined;
            inputs["login"] = state ? state.login : undefined;
            inputs["lowPrioritySizes"] = state ? state.lowPrioritySizes : undefined;
            inputs["managedServiceIdentities"] = state ? state.managedServiceIdentities : undefined;
            inputs["maxSize"] = state ? state.maxSize : undefined;
            inputs["minSize"] = state ? state.minSize : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["network"] = state ? state.network : undefined;
            inputs["odSizes"] = state ? state.odSizes : undefined;
            inputs["product"] = state ? state.product : undefined;
            inputs["region"] = state ? state.region : undefined;
            inputs["resourceGroupName"] = state ? state.resourceGroupName : undefined;
            inputs["scalingDownPolicies"] = state ? state.scalingDownPolicies : undefined;
            inputs["scalingUpPolicies"] = state ? state.scalingUpPolicies : undefined;
            inputs["scheduledTasks"] = state ? state.scheduledTasks : undefined;
            inputs["shutdownScript"] = state ? state.shutdownScript : undefined;
            inputs["strategy"] = state ? state.strategy : undefined;
            inputs["updatePolicy"] = state ? state.updatePolicy : undefined;
            inputs["userData"] = state ? state.userData : undefined;
        } else {
            const args = argsOrState as ElastigroupArgs | undefined;
            if (!args || args.lowPrioritySizes === undefined) {
                throw new Error("Missing required property 'lowPrioritySizes'");
            }
            if (!args || args.network === undefined) {
                throw new Error("Missing required property 'network'");
            }
            if (!args || args.odSizes === undefined) {
                throw new Error("Missing required property 'odSizes'");
            }
            if (!args || args.product === undefined) {
                throw new Error("Missing required property 'product'");
            }
            if (!args || args.region === undefined) {
                throw new Error("Missing required property 'region'");
            }
            if (!args || args.resourceGroupName === undefined) {
                throw new Error("Missing required property 'resourceGroupName'");
            }
            if (!args || args.strategy === undefined) {
                throw new Error("Missing required property 'strategy'");
            }
            inputs["customData"] = args ? args.customData : undefined;
            inputs["desiredCapacity"] = args ? args.desiredCapacity : undefined;
            inputs["healthCheck"] = args ? args.healthCheck : undefined;
            inputs["images"] = args ? args.images : undefined;
            inputs["integrationKubernetes"] = args ? args.integrationKubernetes : undefined;
            inputs["integrationMultaiRuntime"] = args ? args.integrationMultaiRuntime : undefined;
            inputs["loadBalancers"] = args ? args.loadBalancers : undefined;
            inputs["login"] = args ? args.login : undefined;
            inputs["lowPrioritySizes"] = args ? args.lowPrioritySizes : undefined;
            inputs["managedServiceIdentities"] = args ? args.managedServiceIdentities : undefined;
            inputs["maxSize"] = args ? args.maxSize : undefined;
            inputs["minSize"] = args ? args.minSize : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["network"] = args ? args.network : undefined;
            inputs["odSizes"] = args ? args.odSizes : undefined;
            inputs["product"] = args ? args.product : undefined;
            inputs["region"] = args ? args.region : undefined;
            inputs["resourceGroupName"] = args ? args.resourceGroupName : undefined;
            inputs["scalingDownPolicies"] = args ? args.scalingDownPolicies : undefined;
            inputs["scalingUpPolicies"] = args ? args.scalingUpPolicies : undefined;
            inputs["scheduledTasks"] = args ? args.scheduledTasks : undefined;
            inputs["shutdownScript"] = args ? args.shutdownScript : undefined;
            inputs["strategy"] = args ? args.strategy : undefined;
            inputs["updatePolicy"] = args ? args.updatePolicy : undefined;
            inputs["userData"] = args ? args.userData : undefined;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(Elastigroup.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Elastigroup resources.
 */
export interface ElastigroupState {
    readonly customData?: pulumi.Input<string>;
    /**
     * The desired number of instances the group should have at any time.
     */
    readonly desiredCapacity?: pulumi.Input<number>;
    readonly healthCheck?: pulumi.Input<inputs.azure.ElastigroupHealthCheck>;
    readonly images?: pulumi.Input<pulumi.Input<inputs.azure.ElastigroupImage>[]>;
    readonly integrationKubernetes?: pulumi.Input<inputs.azure.ElastigroupIntegrationKubernetes>;
    readonly integrationMultaiRuntime?: pulumi.Input<inputs.azure.ElastigroupIntegrationMultaiRuntime>;
    readonly loadBalancers?: pulumi.Input<pulumi.Input<inputs.azure.ElastigroupLoadBalancer>[]>;
    readonly login?: pulumi.Input<inputs.azure.ElastigroupLogin>;
    /**
     * Available Low-Priority sizes.
     */
    readonly lowPrioritySizes?: pulumi.Input<pulumi.Input<string>[]>;
    readonly managedServiceIdentities?: pulumi.Input<pulumi.Input<inputs.azure.ElastigroupManagedServiceIdentity>[]>;
    /**
     * The maximum number of instances the group should have at any time.
     */
    readonly maxSize?: pulumi.Input<number>;
    /**
     * The minimum number of instances the group should have at any time.
     */
    readonly minSize?: pulumi.Input<number>;
    /**
     * The name of the managed identity.
     */
    readonly name?: pulumi.Input<string>;
    readonly network?: pulumi.Input<inputs.azure.ElastigroupNetwork>;
    /**
     * Available On-Demand sizes
     */
    readonly odSizes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Operation system type. Valid values: `"Linux"`, `"Windows"`.
     */
    readonly product?: pulumi.Input<string>;
    /**
     * The region your Azure group will be created in.
     */
    readonly region?: pulumi.Input<string>;
    /**
     * The Resource Group that the user-assigned managed identity resides in.
     */
    readonly resourceGroupName?: pulumi.Input<string>;
    readonly scalingDownPolicies?: pulumi.Input<pulumi.Input<inputs.azure.ElastigroupScalingDownPolicy>[]>;
    readonly scalingUpPolicies?: pulumi.Input<pulumi.Input<inputs.azure.ElastigroupScalingUpPolicy>[]>;
    readonly scheduledTasks?: pulumi.Input<pulumi.Input<inputs.azure.ElastigroupScheduledTask>[]>;
    /**
     * Shutdown script for the group. Value should be passed as a string encoded at Base64 only.
     */
    readonly shutdownScript?: pulumi.Input<string>;
    /**
     * Describes the deployment strategy.
     */
    readonly strategy?: pulumi.Input<inputs.azure.ElastigroupStrategy>;
    readonly updatePolicy?: pulumi.Input<inputs.azure.ElastigroupUpdatePolicy>;
    /**
     * Base64-encoded MIME user data to make available to the instances.
     */
    readonly userData?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Elastigroup resource.
 */
export interface ElastigroupArgs {
    readonly customData?: pulumi.Input<string>;
    /**
     * The desired number of instances the group should have at any time.
     */
    readonly desiredCapacity?: pulumi.Input<number>;
    readonly healthCheck?: pulumi.Input<inputs.azure.ElastigroupHealthCheck>;
    readonly images?: pulumi.Input<pulumi.Input<inputs.azure.ElastigroupImage>[]>;
    readonly integrationKubernetes?: pulumi.Input<inputs.azure.ElastigroupIntegrationKubernetes>;
    readonly integrationMultaiRuntime?: pulumi.Input<inputs.azure.ElastigroupIntegrationMultaiRuntime>;
    readonly loadBalancers?: pulumi.Input<pulumi.Input<inputs.azure.ElastigroupLoadBalancer>[]>;
    readonly login?: pulumi.Input<inputs.azure.ElastigroupLogin>;
    /**
     * Available Low-Priority sizes.
     */
    readonly lowPrioritySizes: pulumi.Input<pulumi.Input<string>[]>;
    readonly managedServiceIdentities?: pulumi.Input<pulumi.Input<inputs.azure.ElastigroupManagedServiceIdentity>[]>;
    /**
     * The maximum number of instances the group should have at any time.
     */
    readonly maxSize?: pulumi.Input<number>;
    /**
     * The minimum number of instances the group should have at any time.
     */
    readonly minSize?: pulumi.Input<number>;
    /**
     * The name of the managed identity.
     */
    readonly name?: pulumi.Input<string>;
    readonly network: pulumi.Input<inputs.azure.ElastigroupNetwork>;
    /**
     * Available On-Demand sizes
     */
    readonly odSizes: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Operation system type. Valid values: `"Linux"`, `"Windows"`.
     */
    readonly product: pulumi.Input<string>;
    /**
     * The region your Azure group will be created in.
     */
    readonly region: pulumi.Input<string>;
    /**
     * The Resource Group that the user-assigned managed identity resides in.
     */
    readonly resourceGroupName: pulumi.Input<string>;
    readonly scalingDownPolicies?: pulumi.Input<pulumi.Input<inputs.azure.ElastigroupScalingDownPolicy>[]>;
    readonly scalingUpPolicies?: pulumi.Input<pulumi.Input<inputs.azure.ElastigroupScalingUpPolicy>[]>;
    readonly scheduledTasks?: pulumi.Input<pulumi.Input<inputs.azure.ElastigroupScheduledTask>[]>;
    /**
     * Shutdown script for the group. Value should be passed as a string encoded at Base64 only.
     */
    readonly shutdownScript?: pulumi.Input<string>;
    /**
     * Describes the deployment strategy.
     */
    readonly strategy: pulumi.Input<inputs.azure.ElastigroupStrategy>;
    readonly updatePolicy?: pulumi.Input<inputs.azure.ElastigroupUpdatePolicy>;
    /**
     * Base64-encoded MIME user data to make available to the instances.
     */
    readonly userData?: pulumi.Input<string>;
}
