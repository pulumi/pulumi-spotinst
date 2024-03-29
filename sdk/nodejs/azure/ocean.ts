// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Manages a Spotinst Ocean AKS resource.
 *
 * > This resource contains arguments (such as `image` and `extension`) that are automatically populated from the data reported by the Ocean AKS Connector deployed into your cluster. You can override the upstream configuration by defining the corresponding arguments.
 *
 * ## Prerequisites
 *
 * Installation of the Ocean controller is required by this resource. You can accomplish this by using the spotinst/ocean-controller module as follows:
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * > You must configure the same `clusterIdentifier` and `acdIdentifier` both for the Ocean controller and for the `spotinst.azure.Ocean` resource.
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
    public static readonly __pulumiType = 'spotinst:azure/ocean:Ocean';

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

    /**
     * The AKS identifier. A valid identifier should be formatted as `acd-nnnnnnnn` and previously used identifiers cannot be reused.
     */
    public readonly acdIdentifier!: pulumi.Output<string>;
    /**
     * The AKS cluster name.
     */
    public readonly aksName!: pulumi.Output<string>;
    /**
     * Name of the Azure Resource Group where the AKS cluster is located.
     */
    public readonly aksResourceGroupName!: pulumi.Output<string>;
    /**
     * The Ocean Kubernetes Autoscaler object.
     */
    public readonly autoscaler!: pulumi.Output<outputs.azure.OceanAutoscaler | undefined>;
    /**
     * A unique identifier used for connecting the Ocean SaaS platform and the Kubernetes cluster. Typically, the cluster name is used as its identifier.
     */
    public readonly controllerClusterId!: pulumi.Output<string>;
    /**
     * Must contain a valid Base64 encoded string.
     */
    public readonly customData!: pulumi.Output<string>;
    /**
     * List of Azure extension objects.
     */
    public readonly extensions!: pulumi.Output<outputs.azure.OceanExtension[]>;
    /**
     * The Ocean AKS Health object.
     */
    public readonly health!: pulumi.Output<outputs.azure.OceanHealth>;
    /**
     * Image of VM. An image is a template for creating new VMs. Choose from Azure image catalogue (marketplace).
     */
    public readonly images!: pulumi.Output<outputs.azure.OceanImage[]>;
    /**
     * Configure Load Balancer.
     */
    public readonly loadBalancers!: pulumi.Output<outputs.azure.OceanLoadBalancer[]>;
    /**
     * List of Managed Service Identity objects.
     */
    public readonly managedServiceIdentities!: pulumi.Output<outputs.azure.OceanManagedServiceIdentity[] | undefined>;
    /**
     * The maximum number of pods per node in an AKS cluster.
     */
    public readonly maxPods!: pulumi.Output<number | undefined>;
    /**
     * Name of the Load Balancer.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Define the Virtual Network and Subnet.
     */
    public readonly network!: pulumi.Output<outputs.azure.OceanNetwork>;
    /**
     * OS disk specifications.
     */
    public readonly osDisk!: pulumi.Output<outputs.azure.OceanOsDisk | undefined>;
    /**
     * The Resource Group name of the Load Balancer.
     */
    public readonly resourceGroupName!: pulumi.Output<string>;
    /**
     * SSH public key for admin access to Linux VMs.
     */
    public readonly sshPublicKey!: pulumi.Output<string>;
    /**
     * The Ocean AKS strategy object.
     */
    public readonly strategies!: pulumi.Output<outputs.azure.OceanStrategy[] | undefined>;
    /**
     * Unique key-value pairs that will be used to tag VMs that are launched in the cluster.
     */
    public readonly tags!: pulumi.Output<outputs.azure.OceanTag[] | undefined>;
    /**
     * Username for admin access to VMs.
     */
    public readonly userName!: pulumi.Output<string>;
    /**
     * The types of virtual machines that may or may not be a part of the Ocean cluster.
     */
    public readonly vmSizes!: pulumi.Output<outputs.azure.OceanVmSize[] | undefined>;
    /**
     * An Array holding default Availability Zones, this configures the availability zones the Ocean may launch instances in.
     */
    public readonly zones!: pulumi.Output<string[]>;

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
            resourceInputs["acdIdentifier"] = state ? state.acdIdentifier : undefined;
            resourceInputs["aksName"] = state ? state.aksName : undefined;
            resourceInputs["aksResourceGroupName"] = state ? state.aksResourceGroupName : undefined;
            resourceInputs["autoscaler"] = state ? state.autoscaler : undefined;
            resourceInputs["controllerClusterId"] = state ? state.controllerClusterId : undefined;
            resourceInputs["customData"] = state ? state.customData : undefined;
            resourceInputs["extensions"] = state ? state.extensions : undefined;
            resourceInputs["health"] = state ? state.health : undefined;
            resourceInputs["images"] = state ? state.images : undefined;
            resourceInputs["loadBalancers"] = state ? state.loadBalancers : undefined;
            resourceInputs["managedServiceIdentities"] = state ? state.managedServiceIdentities : undefined;
            resourceInputs["maxPods"] = state ? state.maxPods : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["network"] = state ? state.network : undefined;
            resourceInputs["osDisk"] = state ? state.osDisk : undefined;
            resourceInputs["resourceGroupName"] = state ? state.resourceGroupName : undefined;
            resourceInputs["sshPublicKey"] = state ? state.sshPublicKey : undefined;
            resourceInputs["strategies"] = state ? state.strategies : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["userName"] = state ? state.userName : undefined;
            resourceInputs["vmSizes"] = state ? state.vmSizes : undefined;
            resourceInputs["zones"] = state ? state.zones : undefined;
        } else {
            const args = argsOrState as OceanArgs | undefined;
            if ((!args || args.acdIdentifier === undefined) && !opts.urn) {
                throw new Error("Missing required property 'acdIdentifier'");
            }
            if ((!args || args.aksName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'aksName'");
            }
            if ((!args || args.aksResourceGroupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'aksResourceGroupName'");
            }
            if ((!args || args.sshPublicKey === undefined) && !opts.urn) {
                throw new Error("Missing required property 'sshPublicKey'");
            }
            resourceInputs["acdIdentifier"] = args ? args.acdIdentifier : undefined;
            resourceInputs["aksName"] = args ? args.aksName : undefined;
            resourceInputs["aksResourceGroupName"] = args ? args.aksResourceGroupName : undefined;
            resourceInputs["autoscaler"] = args ? args.autoscaler : undefined;
            resourceInputs["controllerClusterId"] = args ? args.controllerClusterId : undefined;
            resourceInputs["customData"] = args ? args.customData : undefined;
            resourceInputs["extensions"] = args ? args.extensions : undefined;
            resourceInputs["health"] = args ? args.health : undefined;
            resourceInputs["images"] = args ? args.images : undefined;
            resourceInputs["loadBalancers"] = args ? args.loadBalancers : undefined;
            resourceInputs["managedServiceIdentities"] = args ? args.managedServiceIdentities : undefined;
            resourceInputs["maxPods"] = args ? args.maxPods : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["network"] = args ? args.network : undefined;
            resourceInputs["osDisk"] = args ? args.osDisk : undefined;
            resourceInputs["resourceGroupName"] = args ? args.resourceGroupName : undefined;
            resourceInputs["sshPublicKey"] = args ? args.sshPublicKey : undefined;
            resourceInputs["strategies"] = args ? args.strategies : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["userName"] = args ? args.userName : undefined;
            resourceInputs["vmSizes"] = args ? args.vmSizes : undefined;
            resourceInputs["zones"] = args ? args.zones : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Ocean.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Ocean resources.
 */
export interface OceanState {
    /**
     * The AKS identifier. A valid identifier should be formatted as `acd-nnnnnnnn` and previously used identifiers cannot be reused.
     */
    acdIdentifier?: pulumi.Input<string>;
    /**
     * The AKS cluster name.
     */
    aksName?: pulumi.Input<string>;
    /**
     * Name of the Azure Resource Group where the AKS cluster is located.
     */
    aksResourceGroupName?: pulumi.Input<string>;
    /**
     * The Ocean Kubernetes Autoscaler object.
     */
    autoscaler?: pulumi.Input<inputs.azure.OceanAutoscaler>;
    /**
     * A unique identifier used for connecting the Ocean SaaS platform and the Kubernetes cluster. Typically, the cluster name is used as its identifier.
     */
    controllerClusterId?: pulumi.Input<string>;
    /**
     * Must contain a valid Base64 encoded string.
     */
    customData?: pulumi.Input<string>;
    /**
     * List of Azure extension objects.
     */
    extensions?: pulumi.Input<pulumi.Input<inputs.azure.OceanExtension>[]>;
    /**
     * The Ocean AKS Health object.
     */
    health?: pulumi.Input<inputs.azure.OceanHealth>;
    /**
     * Image of VM. An image is a template for creating new VMs. Choose from Azure image catalogue (marketplace).
     */
    images?: pulumi.Input<pulumi.Input<inputs.azure.OceanImage>[]>;
    /**
     * Configure Load Balancer.
     */
    loadBalancers?: pulumi.Input<pulumi.Input<inputs.azure.OceanLoadBalancer>[]>;
    /**
     * List of Managed Service Identity objects.
     */
    managedServiceIdentities?: pulumi.Input<pulumi.Input<inputs.azure.OceanManagedServiceIdentity>[]>;
    /**
     * The maximum number of pods per node in an AKS cluster.
     */
    maxPods?: pulumi.Input<number>;
    /**
     * Name of the Load Balancer.
     */
    name?: pulumi.Input<string>;
    /**
     * Define the Virtual Network and Subnet.
     */
    network?: pulumi.Input<inputs.azure.OceanNetwork>;
    /**
     * OS disk specifications.
     */
    osDisk?: pulumi.Input<inputs.azure.OceanOsDisk>;
    /**
     * The Resource Group name of the Load Balancer.
     */
    resourceGroupName?: pulumi.Input<string>;
    /**
     * SSH public key for admin access to Linux VMs.
     */
    sshPublicKey?: pulumi.Input<string>;
    /**
     * The Ocean AKS strategy object.
     */
    strategies?: pulumi.Input<pulumi.Input<inputs.azure.OceanStrategy>[]>;
    /**
     * Unique key-value pairs that will be used to tag VMs that are launched in the cluster.
     */
    tags?: pulumi.Input<pulumi.Input<inputs.azure.OceanTag>[]>;
    /**
     * Username for admin access to VMs.
     */
    userName?: pulumi.Input<string>;
    /**
     * The types of virtual machines that may or may not be a part of the Ocean cluster.
     */
    vmSizes?: pulumi.Input<pulumi.Input<inputs.azure.OceanVmSize>[]>;
    /**
     * An Array holding default Availability Zones, this configures the availability zones the Ocean may launch instances in.
     */
    zones?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a Ocean resource.
 */
export interface OceanArgs {
    /**
     * The AKS identifier. A valid identifier should be formatted as `acd-nnnnnnnn` and previously used identifiers cannot be reused.
     */
    acdIdentifier: pulumi.Input<string>;
    /**
     * The AKS cluster name.
     */
    aksName: pulumi.Input<string>;
    /**
     * Name of the Azure Resource Group where the AKS cluster is located.
     */
    aksResourceGroupName: pulumi.Input<string>;
    /**
     * The Ocean Kubernetes Autoscaler object.
     */
    autoscaler?: pulumi.Input<inputs.azure.OceanAutoscaler>;
    /**
     * A unique identifier used for connecting the Ocean SaaS platform and the Kubernetes cluster. Typically, the cluster name is used as its identifier.
     */
    controllerClusterId?: pulumi.Input<string>;
    /**
     * Must contain a valid Base64 encoded string.
     */
    customData?: pulumi.Input<string>;
    /**
     * List of Azure extension objects.
     */
    extensions?: pulumi.Input<pulumi.Input<inputs.azure.OceanExtension>[]>;
    /**
     * The Ocean AKS Health object.
     */
    health?: pulumi.Input<inputs.azure.OceanHealth>;
    /**
     * Image of VM. An image is a template for creating new VMs. Choose from Azure image catalogue (marketplace).
     */
    images?: pulumi.Input<pulumi.Input<inputs.azure.OceanImage>[]>;
    /**
     * Configure Load Balancer.
     */
    loadBalancers?: pulumi.Input<pulumi.Input<inputs.azure.OceanLoadBalancer>[]>;
    /**
     * List of Managed Service Identity objects.
     */
    managedServiceIdentities?: pulumi.Input<pulumi.Input<inputs.azure.OceanManagedServiceIdentity>[]>;
    /**
     * The maximum number of pods per node in an AKS cluster.
     */
    maxPods?: pulumi.Input<number>;
    /**
     * Name of the Load Balancer.
     */
    name?: pulumi.Input<string>;
    /**
     * Define the Virtual Network and Subnet.
     */
    network?: pulumi.Input<inputs.azure.OceanNetwork>;
    /**
     * OS disk specifications.
     */
    osDisk?: pulumi.Input<inputs.azure.OceanOsDisk>;
    /**
     * The Resource Group name of the Load Balancer.
     */
    resourceGroupName?: pulumi.Input<string>;
    /**
     * SSH public key for admin access to Linux VMs.
     */
    sshPublicKey: pulumi.Input<string>;
    /**
     * The Ocean AKS strategy object.
     */
    strategies?: pulumi.Input<pulumi.Input<inputs.azure.OceanStrategy>[]>;
    /**
     * Unique key-value pairs that will be used to tag VMs that are launched in the cluster.
     */
    tags?: pulumi.Input<pulumi.Input<inputs.azure.OceanTag>[]>;
    /**
     * Username for admin access to VMs.
     */
    userName?: pulumi.Input<string>;
    /**
     * The types of virtual machines that may or may not be a part of the Ocean cluster.
     */
    vmSizes?: pulumi.Input<pulumi.Input<inputs.azure.OceanVmSize>[]>;
    /**
     * An Array holding default Availability Zones, this configures the availability zones the Ocean may launch instances in.
     */
    zones?: pulumi.Input<pulumi.Input<string>[]>;
}
