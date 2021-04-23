// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
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
 *         autoscaleHeadroom: {
 *             cpuPerUnit: 4,
 *             gpuPerUnit: 8,
 *             memoryPerUnit: 100,
 *             numOfUnits: 16,
 *         },
 *     }],
 *     labels: [{
 *         key: "label_key",
 *         value: "label_value",
 *     }],
 *     launchSpecifications: [{
 *         osDisk: {
 *             sizeGb: 100,
 *             type: "Standard_LRS",
 *         },
 *         tags: [{
 *             key: "label_key",
 *             value: "label_value",
 *         }],
 *     }],
 *     oceanId: "o-12345",
 *     resourceLimits: [{
 *         maxInstanceCount: 4,
 *     }],
 *     taints: [{
 *         effect: "NoSchedule",
 *         key: "taint_key",
 *         value: "taint_value",
 *     }],
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
     * Create a OceanVirtualNodeGroup resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: OceanVirtualNodeGroupArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: OceanVirtualNodeGroupArgs | OceanVirtualNodeGroupState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as OceanVirtualNodeGroupState | undefined;
            inputs["autoscales"] = state ? state.autoscales : undefined;
            inputs["labels"] = state ? state.labels : undefined;
            inputs["launchSpecifications"] = state ? state.launchSpecifications : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["oceanId"] = state ? state.oceanId : undefined;
            inputs["resourceLimits"] = state ? state.resourceLimits : undefined;
            inputs["taints"] = state ? state.taints : undefined;
        } else {
            const args = argsOrState as OceanVirtualNodeGroupArgs | undefined;
            if ((!args || args.oceanId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'oceanId'");
            }
            inputs["autoscales"] = args ? args.autoscales : undefined;
            inputs["labels"] = args ? args.labels : undefined;
            inputs["launchSpecifications"] = args ? args.launchSpecifications : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["oceanId"] = args ? args.oceanId : undefined;
            inputs["resourceLimits"] = args ? args.resourceLimits : undefined;
            inputs["taints"] = args ? args.taints : undefined;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(OceanVirtualNodeGroup.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering OceanVirtualNodeGroup resources.
 */
export interface OceanVirtualNodeGroupState {
    /**
     * .
     */
    readonly autoscales?: pulumi.Input<pulumi.Input<inputs.azure.OceanVirtualNodeGroupAutoscale>[]>;
    /**
     * Additional labels for the virtual node group. Only custom user labels are allowed. Kubernetes built-in labels and Spot internal labels are not allowed.
     */
    readonly labels?: pulumi.Input<pulumi.Input<inputs.azure.OceanVirtualNodeGroupLabel>[]>;
    /**
     * .
     */
    readonly launchSpecifications?: pulumi.Input<pulumi.Input<inputs.azure.OceanVirtualNodeGroupLaunchSpecification>[]>;
    /**
     * Set name for the virtual node group.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The Ocean cluster ID.
     */
    readonly oceanId?: pulumi.Input<string>;
    /**
     * .
     */
    readonly resourceLimits?: pulumi.Input<pulumi.Input<inputs.azure.OceanVirtualNodeGroupResourceLimit>[]>;
    /**
     * Additional taints for the virtual node group. Only custom user labels are allowed. Kubernetes built-in labels and Spot internal labels are not allowed.
     */
    readonly taints?: pulumi.Input<pulumi.Input<inputs.azure.OceanVirtualNodeGroupTaint>[]>;
}

/**
 * The set of arguments for constructing a OceanVirtualNodeGroup resource.
 */
export interface OceanVirtualNodeGroupArgs {
    /**
     * .
     */
    readonly autoscales?: pulumi.Input<pulumi.Input<inputs.azure.OceanVirtualNodeGroupAutoscale>[]>;
    /**
     * Additional labels for the virtual node group. Only custom user labels are allowed. Kubernetes built-in labels and Spot internal labels are not allowed.
     */
    readonly labels?: pulumi.Input<pulumi.Input<inputs.azure.OceanVirtualNodeGroupLabel>[]>;
    /**
     * .
     */
    readonly launchSpecifications?: pulumi.Input<pulumi.Input<inputs.azure.OceanVirtualNodeGroupLaunchSpecification>[]>;
    /**
     * Set name for the virtual node group.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The Ocean cluster ID.
     */
    readonly oceanId: pulumi.Input<string>;
    /**
     * .
     */
    readonly resourceLimits?: pulumi.Input<pulumi.Input<inputs.azure.OceanVirtualNodeGroupResourceLimit>[]>;
    /**
     * Additional taints for the virtual node group. Only custom user labels are allowed. Kubernetes built-in labels and Spot internal labels are not allowed.
     */
    readonly taints?: pulumi.Input<pulumi.Input<inputs.azure.OceanVirtualNodeGroupTaint>[]>;
}