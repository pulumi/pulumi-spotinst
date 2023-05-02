// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Manages a Spotinst Ocean AKS Virtual Node Group resource.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as spotinst from "@pulumi/spotinst";
 *
 * const example = new spotinst.azure.OceanVirtualNodeGroup("example", {
 *     autoscales: [{
 *         autoHeadroomPercentage: 5,
 *         autoscaleHeadrooms: [{
 *             cpuPerUnit: 4,
 *             gpuPerUnit: 8,
 *             memoryPerUnit: 100,
 *             numOfUnits: 16,
 *         }],
 *     }],
 *     labels: [{
 *         key: "label_key",
 *         value: "label_value",
 *     }],
 *     launchSpecifications: [{
 *         maxPods: 30,
 *         osDisk: {
 *             sizeGb: 100,
 *             type: "Standard_LRS",
 *             utilizeEphemeralStorage: false,
 *         },
 *         tags: [{
 *             key: "label_key",
 *             value: "label_value",
 *         }],
 *     }],
 *     name: "vng_name",
 *     oceanId: "o-12345",
 *     resourceLimits: [{
 *         maxInstanceCount: 4,
 *     }],
 *     taints: [{
 *         effect: "NoSchedule",
 *         key: "taint_key",
 *         value: "taint_value",
 *     }],
 *     zones: [
 *         "1",
 *         "2",
 *         "3",
 *     ],
 * });
 * ```
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 *
 * export const oceanId = spotinst_ocean_aks_.example.id;
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
    public static readonly __pulumiType = 'spotinst:azure/oceanVirtualNodeGroup:OceanVirtualNodeGroup';

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

    /**
     * .
     */
    public readonly autoscales!: pulumi.Output<outputs.azure.OceanVirtualNodeGroupAutoscale[] | undefined>;
    /**
     * Additional labels for the virtual node group. Only custom user labels are allowed. Kubernetes built-in labels and Spot internal labels are not allowed.
     */
    public readonly labels!: pulumi.Output<outputs.azure.OceanVirtualNodeGroupLabel[] | undefined>;
    /**
     * .
     */
    public readonly launchSpecifications!: pulumi.Output<outputs.azure.OceanVirtualNodeGroupLaunchSpecification[] | undefined>;
    /**
     * Set name for the virtual node group.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The Ocean cluster ID.
     */
    public readonly oceanId!: pulumi.Output<string>;
    /**
     * .
     */
    public readonly resourceLimits!: pulumi.Output<outputs.azure.OceanVirtualNodeGroupResourceLimit[] | undefined>;
    /**
     * Additional taints for the virtual node group. Only custom user labels are allowed. Kubernetes built-in labels and Spot internal labels are not allowed.
     */
    public readonly taints!: pulumi.Output<outputs.azure.OceanVirtualNodeGroupTaint[] | undefined>;
    /**
     * An Array holding Availability Zones, this configures the availability zones the Ocean may launch instances in per VNG.
     */
    public readonly zones!: pulumi.Output<string[] | undefined>;

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
            resourceInputs["autoscales"] = state ? state.autoscales : undefined;
            resourceInputs["labels"] = state ? state.labels : undefined;
            resourceInputs["launchSpecifications"] = state ? state.launchSpecifications : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["oceanId"] = state ? state.oceanId : undefined;
            resourceInputs["resourceLimits"] = state ? state.resourceLimits : undefined;
            resourceInputs["taints"] = state ? state.taints : undefined;
            resourceInputs["zones"] = state ? state.zones : undefined;
        } else {
            const args = argsOrState as OceanVirtualNodeGroupArgs | undefined;
            if ((!args || args.name === undefined) && !opts.urn) {
                throw new Error("Missing required property 'name'");
            }
            if ((!args || args.oceanId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'oceanId'");
            }
            resourceInputs["autoscales"] = args ? args.autoscales : undefined;
            resourceInputs["labels"] = args ? args.labels : undefined;
            resourceInputs["launchSpecifications"] = args ? args.launchSpecifications : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["oceanId"] = args ? args.oceanId : undefined;
            resourceInputs["resourceLimits"] = args ? args.resourceLimits : undefined;
            resourceInputs["taints"] = args ? args.taints : undefined;
            resourceInputs["zones"] = args ? args.zones : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(OceanVirtualNodeGroup.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering OceanVirtualNodeGroup resources.
 */
export interface OceanVirtualNodeGroupState {
    /**
     * .
     */
    autoscales?: pulumi.Input<pulumi.Input<inputs.azure.OceanVirtualNodeGroupAutoscale>[]>;
    /**
     * Additional labels for the virtual node group. Only custom user labels are allowed. Kubernetes built-in labels and Spot internal labels are not allowed.
     */
    labels?: pulumi.Input<pulumi.Input<inputs.azure.OceanVirtualNodeGroupLabel>[]>;
    /**
     * .
     */
    launchSpecifications?: pulumi.Input<pulumi.Input<inputs.azure.OceanVirtualNodeGroupLaunchSpecification>[]>;
    /**
     * Set name for the virtual node group.
     */
    name?: pulumi.Input<string>;
    /**
     * The Ocean cluster ID.
     */
    oceanId?: pulumi.Input<string>;
    /**
     * .
     */
    resourceLimits?: pulumi.Input<pulumi.Input<inputs.azure.OceanVirtualNodeGroupResourceLimit>[]>;
    /**
     * Additional taints for the virtual node group. Only custom user labels are allowed. Kubernetes built-in labels and Spot internal labels are not allowed.
     */
    taints?: pulumi.Input<pulumi.Input<inputs.azure.OceanVirtualNodeGroupTaint>[]>;
    /**
     * An Array holding Availability Zones, this configures the availability zones the Ocean may launch instances in per VNG.
     */
    zones?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a OceanVirtualNodeGroup resource.
 */
export interface OceanVirtualNodeGroupArgs {
    /**
     * .
     */
    autoscales?: pulumi.Input<pulumi.Input<inputs.azure.OceanVirtualNodeGroupAutoscale>[]>;
    /**
     * Additional labels for the virtual node group. Only custom user labels are allowed. Kubernetes built-in labels and Spot internal labels are not allowed.
     */
    labels?: pulumi.Input<pulumi.Input<inputs.azure.OceanVirtualNodeGroupLabel>[]>;
    /**
     * .
     */
    launchSpecifications?: pulumi.Input<pulumi.Input<inputs.azure.OceanVirtualNodeGroupLaunchSpecification>[]>;
    /**
     * Set name for the virtual node group.
     */
    name: pulumi.Input<string>;
    /**
     * The Ocean cluster ID.
     */
    oceanId: pulumi.Input<string>;
    /**
     * .
     */
    resourceLimits?: pulumi.Input<pulumi.Input<inputs.azure.OceanVirtualNodeGroupResourceLimit>[]>;
    /**
     * Additional taints for the virtual node group. Only custom user labels are allowed. Kubernetes built-in labels and Spot internal labels are not allowed.
     */
    taints?: pulumi.Input<pulumi.Input<inputs.azure.OceanVirtualNodeGroupTaint>[]>;
    /**
     * An Array holding Availability Zones, this configures the availability zones the Ocean may launch instances in per VNG.
     */
    zones?: pulumi.Input<pulumi.Input<string>[]>;
}
