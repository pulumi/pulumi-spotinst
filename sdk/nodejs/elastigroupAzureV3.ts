// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

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

    public readonly availabilityVsCost!: pulumi.Output<number | undefined>;
    public readonly bootDiagnostics!: pulumi.Output<outputs.ElastigroupAzureV3BootDiagnostic[]>;
    public readonly capacityReservation!: pulumi.Output<outputs.ElastigroupAzureV3CapacityReservation | undefined>;
    public readonly customData!: pulumi.Output<string | undefined>;
    public readonly dataDisks!: pulumi.Output<outputs.ElastigroupAzureV3DataDisk[] | undefined>;
    public readonly description!: pulumi.Output<string | undefined>;
    public readonly desiredCapacity!: pulumi.Output<number | undefined>;
    public readonly drainingTimeout!: pulumi.Output<number>;
    public readonly extensions!: pulumi.Output<outputs.ElastigroupAzureV3Extension[]>;
    public readonly fallbackToOnDemand!: pulumi.Output<boolean>;
    public readonly health!: pulumi.Output<outputs.ElastigroupAzureV3Health | undefined>;
    public readonly images!: pulumi.Output<outputs.ElastigroupAzureV3Image[] | undefined>;
    public readonly loadBalancers!: pulumi.Output<outputs.ElastigroupAzureV3LoadBalancer[] | undefined>;
    public readonly login!: pulumi.Output<outputs.ElastigroupAzureV3Login | undefined>;
    public readonly managedServiceIdentities!: pulumi.Output<outputs.ElastigroupAzureV3ManagedServiceIdentity[] | undefined>;
    public readonly maxSize!: pulumi.Output<number>;
    public readonly minSize!: pulumi.Output<number>;
    public readonly name!: pulumi.Output<string>;
    public readonly network!: pulumi.Output<outputs.ElastigroupAzureV3Network>;
    public readonly onDemandCount!: pulumi.Output<number | undefined>;
    public readonly optimizationWindows!: pulumi.Output<string[] | undefined>;
    public readonly os!: pulumi.Output<string>;
    public readonly osDisk!: pulumi.Output<outputs.ElastigroupAzureV3OsDisk | undefined>;
    public readonly preferredZones!: pulumi.Output<string[] | undefined>;
    public readonly proximityPlacementGroups!: pulumi.Output<outputs.ElastigroupAzureV3ProximityPlacementGroup[] | undefined>;
    public readonly region!: pulumi.Output<string>;
    public readonly resourceGroupName!: pulumi.Output<string>;
    public readonly revertToSpot!: pulumi.Output<outputs.ElastigroupAzureV3RevertToSpot | undefined>;
    public readonly scalingDownPolicies!: pulumi.Output<outputs.ElastigroupAzureV3ScalingDownPolicy[] | undefined>;
    public readonly scalingUpPolicies!: pulumi.Output<outputs.ElastigroupAzureV3ScalingUpPolicy[] | undefined>;
    public readonly schedulingTasks!: pulumi.Output<outputs.ElastigroupAzureV3SchedulingTask[] | undefined>;
    public readonly secrets!: pulumi.Output<outputs.ElastigroupAzureV3Secret[] | undefined>;
    public readonly security!: pulumi.Output<outputs.ElastigroupAzureV3Security | undefined>;
    public readonly shutdownScript!: pulumi.Output<string | undefined>;
    public readonly signals!: pulumi.Output<outputs.ElastigroupAzureV3Signal[] | undefined>;
    public readonly spotPercentage!: pulumi.Output<number | undefined>;
    public readonly tags!: pulumi.Output<outputs.ElastigroupAzureV3Tag[] | undefined>;
    public readonly userData!: pulumi.Output<string | undefined>;
    public readonly vmNamePrefix!: pulumi.Output<string | undefined>;
    public readonly vmSizes!: pulumi.Output<outputs.ElastigroupAzureV3VmSizes>;
    public readonly zones!: pulumi.Output<string[] | undefined>;

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
            resourceInputs["availabilityVsCost"] = state ? state.availabilityVsCost : undefined;
            resourceInputs["bootDiagnostics"] = state ? state.bootDiagnostics : undefined;
            resourceInputs["capacityReservation"] = state ? state.capacityReservation : undefined;
            resourceInputs["customData"] = state ? state.customData : undefined;
            resourceInputs["dataDisks"] = state ? state.dataDisks : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["desiredCapacity"] = state ? state.desiredCapacity : undefined;
            resourceInputs["drainingTimeout"] = state ? state.drainingTimeout : undefined;
            resourceInputs["extensions"] = state ? state.extensions : undefined;
            resourceInputs["fallbackToOnDemand"] = state ? state.fallbackToOnDemand : undefined;
            resourceInputs["health"] = state ? state.health : undefined;
            resourceInputs["images"] = state ? state.images : undefined;
            resourceInputs["loadBalancers"] = state ? state.loadBalancers : undefined;
            resourceInputs["login"] = state ? state.login : undefined;
            resourceInputs["managedServiceIdentities"] = state ? state.managedServiceIdentities : undefined;
            resourceInputs["maxSize"] = state ? state.maxSize : undefined;
            resourceInputs["minSize"] = state ? state.minSize : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["network"] = state ? state.network : undefined;
            resourceInputs["onDemandCount"] = state ? state.onDemandCount : undefined;
            resourceInputs["optimizationWindows"] = state ? state.optimizationWindows : undefined;
            resourceInputs["os"] = state ? state.os : undefined;
            resourceInputs["osDisk"] = state ? state.osDisk : undefined;
            resourceInputs["preferredZones"] = state ? state.preferredZones : undefined;
            resourceInputs["proximityPlacementGroups"] = state ? state.proximityPlacementGroups : undefined;
            resourceInputs["region"] = state ? state.region : undefined;
            resourceInputs["resourceGroupName"] = state ? state.resourceGroupName : undefined;
            resourceInputs["revertToSpot"] = state ? state.revertToSpot : undefined;
            resourceInputs["scalingDownPolicies"] = state ? state.scalingDownPolicies : undefined;
            resourceInputs["scalingUpPolicies"] = state ? state.scalingUpPolicies : undefined;
            resourceInputs["schedulingTasks"] = state ? state.schedulingTasks : undefined;
            resourceInputs["secrets"] = state ? state.secrets : undefined;
            resourceInputs["security"] = state ? state.security : undefined;
            resourceInputs["shutdownScript"] = state ? state.shutdownScript : undefined;
            resourceInputs["signals"] = state ? state.signals : undefined;
            resourceInputs["spotPercentage"] = state ? state.spotPercentage : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["userData"] = state ? state.userData : undefined;
            resourceInputs["vmNamePrefix"] = state ? state.vmNamePrefix : undefined;
            resourceInputs["vmSizes"] = state ? state.vmSizes : undefined;
            resourceInputs["zones"] = state ? state.zones : undefined;
        } else {
            const args = argsOrState as ElastigroupAzureV3Args | undefined;
            if ((!args || args.fallbackToOnDemand === undefined) && !opts.urn) {
                throw new Error("Missing required property 'fallbackToOnDemand'");
            }
            if ((!args || args.network === undefined) && !opts.urn) {
                throw new Error("Missing required property 'network'");
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
            if ((!args || args.vmSizes === undefined) && !opts.urn) {
                throw new Error("Missing required property 'vmSizes'");
            }
            resourceInputs["availabilityVsCost"] = args ? args.availabilityVsCost : undefined;
            resourceInputs["bootDiagnostics"] = args ? args.bootDiagnostics : undefined;
            resourceInputs["capacityReservation"] = args ? args.capacityReservation : undefined;
            resourceInputs["customData"] = args ? args.customData : undefined;
            resourceInputs["dataDisks"] = args ? args.dataDisks : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["desiredCapacity"] = args ? args.desiredCapacity : undefined;
            resourceInputs["drainingTimeout"] = args ? args.drainingTimeout : undefined;
            resourceInputs["extensions"] = args ? args.extensions : undefined;
            resourceInputs["fallbackToOnDemand"] = args ? args.fallbackToOnDemand : undefined;
            resourceInputs["health"] = args ? args.health : undefined;
            resourceInputs["images"] = args ? args.images : undefined;
            resourceInputs["loadBalancers"] = args ? args.loadBalancers : undefined;
            resourceInputs["login"] = args ? args.login : undefined;
            resourceInputs["managedServiceIdentities"] = args ? args.managedServiceIdentities : undefined;
            resourceInputs["maxSize"] = args ? args.maxSize : undefined;
            resourceInputs["minSize"] = args ? args.minSize : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["network"] = args ? args.network : undefined;
            resourceInputs["onDemandCount"] = args ? args.onDemandCount : undefined;
            resourceInputs["optimizationWindows"] = args ? args.optimizationWindows : undefined;
            resourceInputs["os"] = args ? args.os : undefined;
            resourceInputs["osDisk"] = args ? args.osDisk : undefined;
            resourceInputs["preferredZones"] = args ? args.preferredZones : undefined;
            resourceInputs["proximityPlacementGroups"] = args ? args.proximityPlacementGroups : undefined;
            resourceInputs["region"] = args ? args.region : undefined;
            resourceInputs["resourceGroupName"] = args ? args.resourceGroupName : undefined;
            resourceInputs["revertToSpot"] = args ? args.revertToSpot : undefined;
            resourceInputs["scalingDownPolicies"] = args ? args.scalingDownPolicies : undefined;
            resourceInputs["scalingUpPolicies"] = args ? args.scalingUpPolicies : undefined;
            resourceInputs["schedulingTasks"] = args ? args.schedulingTasks : undefined;
            resourceInputs["secrets"] = args ? args.secrets : undefined;
            resourceInputs["security"] = args ? args.security : undefined;
            resourceInputs["shutdownScript"] = args ? args.shutdownScript : undefined;
            resourceInputs["signals"] = args ? args.signals : undefined;
            resourceInputs["spotPercentage"] = args ? args.spotPercentage : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["userData"] = args ? args.userData : undefined;
            resourceInputs["vmNamePrefix"] = args ? args.vmNamePrefix : undefined;
            resourceInputs["vmSizes"] = args ? args.vmSizes : undefined;
            resourceInputs["zones"] = args ? args.zones : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ElastigroupAzureV3.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ElastigroupAzureV3 resources.
 */
export interface ElastigroupAzureV3State {
    availabilityVsCost?: pulumi.Input<number>;
    bootDiagnostics?: pulumi.Input<pulumi.Input<inputs.ElastigroupAzureV3BootDiagnostic>[]>;
    capacityReservation?: pulumi.Input<inputs.ElastigroupAzureV3CapacityReservation>;
    customData?: pulumi.Input<string>;
    dataDisks?: pulumi.Input<pulumi.Input<inputs.ElastigroupAzureV3DataDisk>[]>;
    description?: pulumi.Input<string>;
    desiredCapacity?: pulumi.Input<number>;
    drainingTimeout?: pulumi.Input<number>;
    extensions?: pulumi.Input<pulumi.Input<inputs.ElastigroupAzureV3Extension>[]>;
    fallbackToOnDemand?: pulumi.Input<boolean>;
    health?: pulumi.Input<inputs.ElastigroupAzureV3Health>;
    images?: pulumi.Input<pulumi.Input<inputs.ElastigroupAzureV3Image>[]>;
    loadBalancers?: pulumi.Input<pulumi.Input<inputs.ElastigroupAzureV3LoadBalancer>[]>;
    login?: pulumi.Input<inputs.ElastigroupAzureV3Login>;
    managedServiceIdentities?: pulumi.Input<pulumi.Input<inputs.ElastigroupAzureV3ManagedServiceIdentity>[]>;
    maxSize?: pulumi.Input<number>;
    minSize?: pulumi.Input<number>;
    name?: pulumi.Input<string>;
    network?: pulumi.Input<inputs.ElastigroupAzureV3Network>;
    onDemandCount?: pulumi.Input<number>;
    optimizationWindows?: pulumi.Input<pulumi.Input<string>[]>;
    os?: pulumi.Input<string>;
    osDisk?: pulumi.Input<inputs.ElastigroupAzureV3OsDisk>;
    preferredZones?: pulumi.Input<pulumi.Input<string>[]>;
    proximityPlacementGroups?: pulumi.Input<pulumi.Input<inputs.ElastigroupAzureV3ProximityPlacementGroup>[]>;
    region?: pulumi.Input<string>;
    resourceGroupName?: pulumi.Input<string>;
    revertToSpot?: pulumi.Input<inputs.ElastigroupAzureV3RevertToSpot>;
    scalingDownPolicies?: pulumi.Input<pulumi.Input<inputs.ElastigroupAzureV3ScalingDownPolicy>[]>;
    scalingUpPolicies?: pulumi.Input<pulumi.Input<inputs.ElastigroupAzureV3ScalingUpPolicy>[]>;
    schedulingTasks?: pulumi.Input<pulumi.Input<inputs.ElastigroupAzureV3SchedulingTask>[]>;
    secrets?: pulumi.Input<pulumi.Input<inputs.ElastigroupAzureV3Secret>[]>;
    security?: pulumi.Input<inputs.ElastigroupAzureV3Security>;
    shutdownScript?: pulumi.Input<string>;
    signals?: pulumi.Input<pulumi.Input<inputs.ElastigroupAzureV3Signal>[]>;
    spotPercentage?: pulumi.Input<number>;
    tags?: pulumi.Input<pulumi.Input<inputs.ElastigroupAzureV3Tag>[]>;
    userData?: pulumi.Input<string>;
    vmNamePrefix?: pulumi.Input<string>;
    vmSizes?: pulumi.Input<inputs.ElastigroupAzureV3VmSizes>;
    zones?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a ElastigroupAzureV3 resource.
 */
export interface ElastigroupAzureV3Args {
    availabilityVsCost?: pulumi.Input<number>;
    bootDiagnostics?: pulumi.Input<pulumi.Input<inputs.ElastigroupAzureV3BootDiagnostic>[]>;
    capacityReservation?: pulumi.Input<inputs.ElastigroupAzureV3CapacityReservation>;
    customData?: pulumi.Input<string>;
    dataDisks?: pulumi.Input<pulumi.Input<inputs.ElastigroupAzureV3DataDisk>[]>;
    description?: pulumi.Input<string>;
    desiredCapacity?: pulumi.Input<number>;
    drainingTimeout?: pulumi.Input<number>;
    extensions?: pulumi.Input<pulumi.Input<inputs.ElastigroupAzureV3Extension>[]>;
    fallbackToOnDemand: pulumi.Input<boolean>;
    health?: pulumi.Input<inputs.ElastigroupAzureV3Health>;
    images?: pulumi.Input<pulumi.Input<inputs.ElastigroupAzureV3Image>[]>;
    loadBalancers?: pulumi.Input<pulumi.Input<inputs.ElastigroupAzureV3LoadBalancer>[]>;
    login?: pulumi.Input<inputs.ElastigroupAzureV3Login>;
    managedServiceIdentities?: pulumi.Input<pulumi.Input<inputs.ElastigroupAzureV3ManagedServiceIdentity>[]>;
    maxSize?: pulumi.Input<number>;
    minSize?: pulumi.Input<number>;
    name?: pulumi.Input<string>;
    network: pulumi.Input<inputs.ElastigroupAzureV3Network>;
    onDemandCount?: pulumi.Input<number>;
    optimizationWindows?: pulumi.Input<pulumi.Input<string>[]>;
    os: pulumi.Input<string>;
    osDisk?: pulumi.Input<inputs.ElastigroupAzureV3OsDisk>;
    preferredZones?: pulumi.Input<pulumi.Input<string>[]>;
    proximityPlacementGroups?: pulumi.Input<pulumi.Input<inputs.ElastigroupAzureV3ProximityPlacementGroup>[]>;
    region: pulumi.Input<string>;
    resourceGroupName: pulumi.Input<string>;
    revertToSpot?: pulumi.Input<inputs.ElastigroupAzureV3RevertToSpot>;
    scalingDownPolicies?: pulumi.Input<pulumi.Input<inputs.ElastigroupAzureV3ScalingDownPolicy>[]>;
    scalingUpPolicies?: pulumi.Input<pulumi.Input<inputs.ElastigroupAzureV3ScalingUpPolicy>[]>;
    schedulingTasks?: pulumi.Input<pulumi.Input<inputs.ElastigroupAzureV3SchedulingTask>[]>;
    secrets?: pulumi.Input<pulumi.Input<inputs.ElastigroupAzureV3Secret>[]>;
    security?: pulumi.Input<inputs.ElastigroupAzureV3Security>;
    shutdownScript?: pulumi.Input<string>;
    signals?: pulumi.Input<pulumi.Input<inputs.ElastigroupAzureV3Signal>[]>;
    spotPercentage?: pulumi.Input<number>;
    tags?: pulumi.Input<pulumi.Input<inputs.ElastigroupAzureV3Tag>[]>;
    userData?: pulumi.Input<string>;
    vmNamePrefix?: pulumi.Input<string>;
    vmSizes: pulumi.Input<inputs.ElastigroupAzureV3VmSizes>;
    zones?: pulumi.Input<pulumi.Input<string>[]>;
}
