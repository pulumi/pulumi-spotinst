// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

export class OceanNp extends pulumi.CustomResource {
    /**
     * Get an existing OceanNp resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: OceanNpState, opts?: pulumi.CustomResourceOptions): OceanNp {
        return new OceanNp(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'spotinst:azure/oceanNp:OceanNp';

    /**
     * Returns true if the given object is an instance of OceanNp.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is OceanNp {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === OceanNp.__pulumiType;
    }

    public readonly aksClusterName!: pulumi.Output<string>;
    public readonly aksInfrastructureResourceGroupName!: pulumi.Output<string>;
    public readonly aksRegion!: pulumi.Output<string>;
    public readonly aksResourceGroupName!: pulumi.Output<string>;
    public readonly autoscaler!: pulumi.Output<outputs.azure.OceanNpAutoscaler | undefined>;
    public readonly availabilityZones!: pulumi.Output<string[] | undefined>;
    public readonly controllerClusterId!: pulumi.Output<string>;
    public readonly enableNodePublicIp!: pulumi.Output<boolean | undefined>;
    public readonly fallbackToOndemand!: pulumi.Output<boolean | undefined>;
    public readonly filters!: pulumi.Output<outputs.azure.OceanNpFilters | undefined>;
    public readonly headrooms!: pulumi.Output<outputs.azure.OceanNpHeadroom[] | undefined>;
    public readonly health!: pulumi.Output<outputs.azure.OceanNpHealth>;
    public readonly kubernetesVersion!: pulumi.Output<string | undefined>;
    public readonly labels!: pulumi.Output<{[key: string]: any} | undefined>;
    public readonly maxCount!: pulumi.Output<number | undefined>;
    public readonly maxPodsPerNode!: pulumi.Output<number | undefined>;
    public readonly minCount!: pulumi.Output<number | undefined>;
    public readonly name!: pulumi.Output<string>;
    public readonly osDiskSizeGb!: pulumi.Output<number | undefined>;
    public readonly osDiskType!: pulumi.Output<string | undefined>;
    public readonly osSku!: pulumi.Output<string | undefined>;
    public readonly osType!: pulumi.Output<string | undefined>;
    public readonly scheduling!: pulumi.Output<outputs.azure.OceanNpScheduling | undefined>;
    public readonly spotPercentage!: pulumi.Output<number | undefined>;
    public readonly tags!: pulumi.Output<{[key: string]: any} | undefined>;
    public readonly taints!: pulumi.Output<outputs.azure.OceanNpTaint[] | undefined>;

    /**
     * Create a OceanNp resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: OceanNpArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: OceanNpArgs | OceanNpState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as OceanNpState | undefined;
            resourceInputs["aksClusterName"] = state ? state.aksClusterName : undefined;
            resourceInputs["aksInfrastructureResourceGroupName"] = state ? state.aksInfrastructureResourceGroupName : undefined;
            resourceInputs["aksRegion"] = state ? state.aksRegion : undefined;
            resourceInputs["aksResourceGroupName"] = state ? state.aksResourceGroupName : undefined;
            resourceInputs["autoscaler"] = state ? state.autoscaler : undefined;
            resourceInputs["availabilityZones"] = state ? state.availabilityZones : undefined;
            resourceInputs["controllerClusterId"] = state ? state.controllerClusterId : undefined;
            resourceInputs["enableNodePublicIp"] = state ? state.enableNodePublicIp : undefined;
            resourceInputs["fallbackToOndemand"] = state ? state.fallbackToOndemand : undefined;
            resourceInputs["filters"] = state ? state.filters : undefined;
            resourceInputs["headrooms"] = state ? state.headrooms : undefined;
            resourceInputs["health"] = state ? state.health : undefined;
            resourceInputs["kubernetesVersion"] = state ? state.kubernetesVersion : undefined;
            resourceInputs["labels"] = state ? state.labels : undefined;
            resourceInputs["maxCount"] = state ? state.maxCount : undefined;
            resourceInputs["maxPodsPerNode"] = state ? state.maxPodsPerNode : undefined;
            resourceInputs["minCount"] = state ? state.minCount : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["osDiskSizeGb"] = state ? state.osDiskSizeGb : undefined;
            resourceInputs["osDiskType"] = state ? state.osDiskType : undefined;
            resourceInputs["osSku"] = state ? state.osSku : undefined;
            resourceInputs["osType"] = state ? state.osType : undefined;
            resourceInputs["scheduling"] = state ? state.scheduling : undefined;
            resourceInputs["spotPercentage"] = state ? state.spotPercentage : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["taints"] = state ? state.taints : undefined;
        } else {
            const args = argsOrState as OceanNpArgs | undefined;
            if ((!args || args.aksClusterName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'aksClusterName'");
            }
            if ((!args || args.aksInfrastructureResourceGroupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'aksInfrastructureResourceGroupName'");
            }
            if ((!args || args.aksRegion === undefined) && !opts.urn) {
                throw new Error("Missing required property 'aksRegion'");
            }
            if ((!args || args.aksResourceGroupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'aksResourceGroupName'");
            }
            resourceInputs["aksClusterName"] = args ? args.aksClusterName : undefined;
            resourceInputs["aksInfrastructureResourceGroupName"] = args ? args.aksInfrastructureResourceGroupName : undefined;
            resourceInputs["aksRegion"] = args ? args.aksRegion : undefined;
            resourceInputs["aksResourceGroupName"] = args ? args.aksResourceGroupName : undefined;
            resourceInputs["autoscaler"] = args ? args.autoscaler : undefined;
            resourceInputs["availabilityZones"] = args ? args.availabilityZones : undefined;
            resourceInputs["controllerClusterId"] = args ? args.controllerClusterId : undefined;
            resourceInputs["enableNodePublicIp"] = args ? args.enableNodePublicIp : undefined;
            resourceInputs["fallbackToOndemand"] = args ? args.fallbackToOndemand : undefined;
            resourceInputs["filters"] = args ? args.filters : undefined;
            resourceInputs["headrooms"] = args ? args.headrooms : undefined;
            resourceInputs["health"] = args ? args.health : undefined;
            resourceInputs["kubernetesVersion"] = args ? args.kubernetesVersion : undefined;
            resourceInputs["labels"] = args ? args.labels : undefined;
            resourceInputs["maxCount"] = args ? args.maxCount : undefined;
            resourceInputs["maxPodsPerNode"] = args ? args.maxPodsPerNode : undefined;
            resourceInputs["minCount"] = args ? args.minCount : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["osDiskSizeGb"] = args ? args.osDiskSizeGb : undefined;
            resourceInputs["osDiskType"] = args ? args.osDiskType : undefined;
            resourceInputs["osSku"] = args ? args.osSku : undefined;
            resourceInputs["osType"] = args ? args.osType : undefined;
            resourceInputs["scheduling"] = args ? args.scheduling : undefined;
            resourceInputs["spotPercentage"] = args ? args.spotPercentage : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["taints"] = args ? args.taints : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(OceanNp.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering OceanNp resources.
 */
export interface OceanNpState {
    aksClusterName?: pulumi.Input<string>;
    aksInfrastructureResourceGroupName?: pulumi.Input<string>;
    aksRegion?: pulumi.Input<string>;
    aksResourceGroupName?: pulumi.Input<string>;
    autoscaler?: pulumi.Input<inputs.azure.OceanNpAutoscaler>;
    availabilityZones?: pulumi.Input<pulumi.Input<string>[]>;
    controllerClusterId?: pulumi.Input<string>;
    enableNodePublicIp?: pulumi.Input<boolean>;
    fallbackToOndemand?: pulumi.Input<boolean>;
    filters?: pulumi.Input<inputs.azure.OceanNpFilters>;
    headrooms?: pulumi.Input<pulumi.Input<inputs.azure.OceanNpHeadroom>[]>;
    health?: pulumi.Input<inputs.azure.OceanNpHealth>;
    kubernetesVersion?: pulumi.Input<string>;
    labels?: pulumi.Input<{[key: string]: any}>;
    maxCount?: pulumi.Input<number>;
    maxPodsPerNode?: pulumi.Input<number>;
    minCount?: pulumi.Input<number>;
    name?: pulumi.Input<string>;
    osDiskSizeGb?: pulumi.Input<number>;
    osDiskType?: pulumi.Input<string>;
    osSku?: pulumi.Input<string>;
    osType?: pulumi.Input<string>;
    scheduling?: pulumi.Input<inputs.azure.OceanNpScheduling>;
    spotPercentage?: pulumi.Input<number>;
    tags?: pulumi.Input<{[key: string]: any}>;
    taints?: pulumi.Input<pulumi.Input<inputs.azure.OceanNpTaint>[]>;
}

/**
 * The set of arguments for constructing a OceanNp resource.
 */
export interface OceanNpArgs {
    aksClusterName: pulumi.Input<string>;
    aksInfrastructureResourceGroupName: pulumi.Input<string>;
    aksRegion: pulumi.Input<string>;
    aksResourceGroupName: pulumi.Input<string>;
    autoscaler?: pulumi.Input<inputs.azure.OceanNpAutoscaler>;
    availabilityZones?: pulumi.Input<pulumi.Input<string>[]>;
    controllerClusterId?: pulumi.Input<string>;
    enableNodePublicIp?: pulumi.Input<boolean>;
    fallbackToOndemand?: pulumi.Input<boolean>;
    filters?: pulumi.Input<inputs.azure.OceanNpFilters>;
    headrooms?: pulumi.Input<pulumi.Input<inputs.azure.OceanNpHeadroom>[]>;
    health?: pulumi.Input<inputs.azure.OceanNpHealth>;
    kubernetesVersion?: pulumi.Input<string>;
    labels?: pulumi.Input<{[key: string]: any}>;
    maxCount?: pulumi.Input<number>;
    maxPodsPerNode?: pulumi.Input<number>;
    minCount?: pulumi.Input<number>;
    name?: pulumi.Input<string>;
    osDiskSizeGb?: pulumi.Input<number>;
    osDiskType?: pulumi.Input<string>;
    osSku?: pulumi.Input<string>;
    osType?: pulumi.Input<string>;
    scheduling?: pulumi.Input<inputs.azure.OceanNpScheduling>;
    spotPercentage?: pulumi.Input<number>;
    tags?: pulumi.Input<{[key: string]: any}>;
    taints?: pulumi.Input<pulumi.Input<inputs.azure.OceanNpTaint>[]>;
}
