// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

export class ManagedInstance extends pulumi.CustomResource {
    /**
     * Get an existing ManagedInstance resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ManagedInstanceState, opts?: pulumi.CustomResourceOptions): ManagedInstance {
        return new ManagedInstance(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'spotinst:aws/managedInstance:ManagedInstance';

    /**
     * Returns true if the given object is an instance of ManagedInstance.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ManagedInstance {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ManagedInstance.__pulumiType;
    }

    public readonly autoHealing!: pulumi.Output<boolean | undefined>;
    public readonly blockDeviceMappings!: pulumi.Output<outputs.aws.ManagedInstanceBlockDeviceMapping[] | undefined>;
    public readonly blockDevicesMode!: pulumi.Output<string | undefined>;
    public readonly cpuCredits!: pulumi.Output<string | undefined>;
    public readonly deletes!: pulumi.Output<outputs.aws.ManagedInstanceDelete[] | undefined>;
    public readonly description!: pulumi.Output<string | undefined>;
    public readonly drainingTimeout!: pulumi.Output<number | undefined>;
    public readonly ebsOptimized!: pulumi.Output<boolean>;
    public readonly elasticIp!: pulumi.Output<string | undefined>;
    public readonly enableMonitoring!: pulumi.Output<boolean | undefined>;
    public readonly fallbackToOndemand!: pulumi.Output<boolean | undefined>;
    public readonly gracePeriod!: pulumi.Output<number | undefined>;
    public readonly healthCheckType!: pulumi.Output<string | undefined>;
    public readonly iamInstanceProfile!: pulumi.Output<string | undefined>;
    public readonly imageId!: pulumi.Output<string>;
    public readonly instanceTypes!: pulumi.Output<string[]>;
    public readonly integrationRoute53!: pulumi.Output<outputs.aws.ManagedInstanceIntegrationRoute53 | undefined>;
    public readonly keyPair!: pulumi.Output<string | undefined>;
    public readonly lifeCycle!: pulumi.Output<string | undefined>;
    public readonly loadBalancers!: pulumi.Output<outputs.aws.ManagedInstanceLoadBalancer[] | undefined>;
    public readonly managedInstanceAction!: pulumi.Output<outputs.aws.ManagedInstanceManagedInstanceAction | undefined>;
    public readonly metadataOptions!: pulumi.Output<outputs.aws.ManagedInstanceMetadataOptions | undefined>;
    public readonly minimumInstanceLifetime!: pulumi.Output<number | undefined>;
    public readonly name!: pulumi.Output<string>;
    public readonly networkInterfaces!: pulumi.Output<outputs.aws.ManagedInstanceNetworkInterface[] | undefined>;
    public readonly optimizationWindows!: pulumi.Output<string[] | undefined>;
    public readonly orientation!: pulumi.Output<string | undefined>;
    public readonly persistBlockDevices!: pulumi.Output<boolean>;
    public readonly persistPrivateIp!: pulumi.Output<boolean | undefined>;
    public readonly persistRootDevice!: pulumi.Output<boolean | undefined>;
    public readonly placementTenancy!: pulumi.Output<string | undefined>;
    public readonly preferredType!: pulumi.Output<string | undefined>;
    public readonly privateIp!: pulumi.Output<string | undefined>;
    public readonly product!: pulumi.Output<string>;
    public readonly region!: pulumi.Output<string | undefined>;
    public readonly resourceTagSpecifications!: pulumi.Output<outputs.aws.ManagedInstanceResourceTagSpecification[] | undefined>;
    public readonly revertToSpot!: pulumi.Output<outputs.aws.ManagedInstanceRevertToSpot | undefined>;
    public readonly scheduledTasks!: pulumi.Output<outputs.aws.ManagedInstanceScheduledTask[] | undefined>;
    public readonly securityGroupIds!: pulumi.Output<string[] | undefined>;
    public readonly shutdownScript!: pulumi.Output<string | undefined>;
    public readonly subnetIds!: pulumi.Output<string[]>;
    public readonly tags!: pulumi.Output<outputs.aws.ManagedInstanceTag[] | undefined>;
    public readonly unhealthyDuration!: pulumi.Output<number | undefined>;
    public readonly userData!: pulumi.Output<string | undefined>;
    public readonly utilizeReservedInstances!: pulumi.Output<boolean | undefined>;
    public readonly vpcId!: pulumi.Output<string>;

    /**
     * Create a ManagedInstance resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ManagedInstanceArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ManagedInstanceArgs | ManagedInstanceState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ManagedInstanceState | undefined;
            resourceInputs["autoHealing"] = state ? state.autoHealing : undefined;
            resourceInputs["blockDeviceMappings"] = state ? state.blockDeviceMappings : undefined;
            resourceInputs["blockDevicesMode"] = state ? state.blockDevicesMode : undefined;
            resourceInputs["cpuCredits"] = state ? state.cpuCredits : undefined;
            resourceInputs["deletes"] = state ? state.deletes : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["drainingTimeout"] = state ? state.drainingTimeout : undefined;
            resourceInputs["ebsOptimized"] = state ? state.ebsOptimized : undefined;
            resourceInputs["elasticIp"] = state ? state.elasticIp : undefined;
            resourceInputs["enableMonitoring"] = state ? state.enableMonitoring : undefined;
            resourceInputs["fallbackToOndemand"] = state ? state.fallbackToOndemand : undefined;
            resourceInputs["gracePeriod"] = state ? state.gracePeriod : undefined;
            resourceInputs["healthCheckType"] = state ? state.healthCheckType : undefined;
            resourceInputs["iamInstanceProfile"] = state ? state.iamInstanceProfile : undefined;
            resourceInputs["imageId"] = state ? state.imageId : undefined;
            resourceInputs["instanceTypes"] = state ? state.instanceTypes : undefined;
            resourceInputs["integrationRoute53"] = state ? state.integrationRoute53 : undefined;
            resourceInputs["keyPair"] = state ? state.keyPair : undefined;
            resourceInputs["lifeCycle"] = state ? state.lifeCycle : undefined;
            resourceInputs["loadBalancers"] = state ? state.loadBalancers : undefined;
            resourceInputs["managedInstanceAction"] = state ? state.managedInstanceAction : undefined;
            resourceInputs["metadataOptions"] = state ? state.metadataOptions : undefined;
            resourceInputs["minimumInstanceLifetime"] = state ? state.minimumInstanceLifetime : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["networkInterfaces"] = state ? state.networkInterfaces : undefined;
            resourceInputs["optimizationWindows"] = state ? state.optimizationWindows : undefined;
            resourceInputs["orientation"] = state ? state.orientation : undefined;
            resourceInputs["persistBlockDevices"] = state ? state.persistBlockDevices : undefined;
            resourceInputs["persistPrivateIp"] = state ? state.persistPrivateIp : undefined;
            resourceInputs["persistRootDevice"] = state ? state.persistRootDevice : undefined;
            resourceInputs["placementTenancy"] = state ? state.placementTenancy : undefined;
            resourceInputs["preferredType"] = state ? state.preferredType : undefined;
            resourceInputs["privateIp"] = state ? state.privateIp : undefined;
            resourceInputs["product"] = state ? state.product : undefined;
            resourceInputs["region"] = state ? state.region : undefined;
            resourceInputs["resourceTagSpecifications"] = state ? state.resourceTagSpecifications : undefined;
            resourceInputs["revertToSpot"] = state ? state.revertToSpot : undefined;
            resourceInputs["scheduledTasks"] = state ? state.scheduledTasks : undefined;
            resourceInputs["securityGroupIds"] = state ? state.securityGroupIds : undefined;
            resourceInputs["shutdownScript"] = state ? state.shutdownScript : undefined;
            resourceInputs["subnetIds"] = state ? state.subnetIds : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["unhealthyDuration"] = state ? state.unhealthyDuration : undefined;
            resourceInputs["userData"] = state ? state.userData : undefined;
            resourceInputs["utilizeReservedInstances"] = state ? state.utilizeReservedInstances : undefined;
            resourceInputs["vpcId"] = state ? state.vpcId : undefined;
        } else {
            const args = argsOrState as ManagedInstanceArgs | undefined;
            if ((!args || args.imageId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'imageId'");
            }
            if ((!args || args.instanceTypes === undefined) && !opts.urn) {
                throw new Error("Missing required property 'instanceTypes'");
            }
            if ((!args || args.persistBlockDevices === undefined) && !opts.urn) {
                throw new Error("Missing required property 'persistBlockDevices'");
            }
            if ((!args || args.product === undefined) && !opts.urn) {
                throw new Error("Missing required property 'product'");
            }
            if ((!args || args.subnetIds === undefined) && !opts.urn) {
                throw new Error("Missing required property 'subnetIds'");
            }
            if ((!args || args.vpcId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'vpcId'");
            }
            resourceInputs["autoHealing"] = args ? args.autoHealing : undefined;
            resourceInputs["blockDeviceMappings"] = args ? args.blockDeviceMappings : undefined;
            resourceInputs["blockDevicesMode"] = args ? args.blockDevicesMode : undefined;
            resourceInputs["cpuCredits"] = args ? args.cpuCredits : undefined;
            resourceInputs["deletes"] = args ? args.deletes : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["drainingTimeout"] = args ? args.drainingTimeout : undefined;
            resourceInputs["ebsOptimized"] = args ? args.ebsOptimized : undefined;
            resourceInputs["elasticIp"] = args ? args.elasticIp : undefined;
            resourceInputs["enableMonitoring"] = args ? args.enableMonitoring : undefined;
            resourceInputs["fallbackToOndemand"] = args ? args.fallbackToOndemand : undefined;
            resourceInputs["gracePeriod"] = args ? args.gracePeriod : undefined;
            resourceInputs["healthCheckType"] = args ? args.healthCheckType : undefined;
            resourceInputs["iamInstanceProfile"] = args ? args.iamInstanceProfile : undefined;
            resourceInputs["imageId"] = args ? args.imageId : undefined;
            resourceInputs["instanceTypes"] = args ? args.instanceTypes : undefined;
            resourceInputs["integrationRoute53"] = args ? args.integrationRoute53 : undefined;
            resourceInputs["keyPair"] = args ? args.keyPair : undefined;
            resourceInputs["lifeCycle"] = args ? args.lifeCycle : undefined;
            resourceInputs["loadBalancers"] = args ? args.loadBalancers : undefined;
            resourceInputs["managedInstanceAction"] = args ? args.managedInstanceAction : undefined;
            resourceInputs["metadataOptions"] = args ? args.metadataOptions : undefined;
            resourceInputs["minimumInstanceLifetime"] = args ? args.minimumInstanceLifetime : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["networkInterfaces"] = args ? args.networkInterfaces : undefined;
            resourceInputs["optimizationWindows"] = args ? args.optimizationWindows : undefined;
            resourceInputs["orientation"] = args ? args.orientation : undefined;
            resourceInputs["persistBlockDevices"] = args ? args.persistBlockDevices : undefined;
            resourceInputs["persistPrivateIp"] = args ? args.persistPrivateIp : undefined;
            resourceInputs["persistRootDevice"] = args ? args.persistRootDevice : undefined;
            resourceInputs["placementTenancy"] = args ? args.placementTenancy : undefined;
            resourceInputs["preferredType"] = args ? args.preferredType : undefined;
            resourceInputs["privateIp"] = args ? args.privateIp : undefined;
            resourceInputs["product"] = args ? args.product : undefined;
            resourceInputs["region"] = args ? args.region : undefined;
            resourceInputs["resourceTagSpecifications"] = args ? args.resourceTagSpecifications : undefined;
            resourceInputs["revertToSpot"] = args ? args.revertToSpot : undefined;
            resourceInputs["scheduledTasks"] = args ? args.scheduledTasks : undefined;
            resourceInputs["securityGroupIds"] = args ? args.securityGroupIds : undefined;
            resourceInputs["shutdownScript"] = args ? args.shutdownScript : undefined;
            resourceInputs["subnetIds"] = args ? args.subnetIds : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["unhealthyDuration"] = args ? args.unhealthyDuration : undefined;
            resourceInputs["userData"] = args ? args.userData : undefined;
            resourceInputs["utilizeReservedInstances"] = args ? args.utilizeReservedInstances : undefined;
            resourceInputs["vpcId"] = args ? args.vpcId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ManagedInstance.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ManagedInstance resources.
 */
export interface ManagedInstanceState {
    autoHealing?: pulumi.Input<boolean>;
    blockDeviceMappings?: pulumi.Input<pulumi.Input<inputs.aws.ManagedInstanceBlockDeviceMapping>[]>;
    blockDevicesMode?: pulumi.Input<string>;
    cpuCredits?: pulumi.Input<string>;
    deletes?: pulumi.Input<pulumi.Input<inputs.aws.ManagedInstanceDelete>[]>;
    description?: pulumi.Input<string>;
    drainingTimeout?: pulumi.Input<number>;
    ebsOptimized?: pulumi.Input<boolean>;
    elasticIp?: pulumi.Input<string>;
    enableMonitoring?: pulumi.Input<boolean>;
    fallbackToOndemand?: pulumi.Input<boolean>;
    gracePeriod?: pulumi.Input<number>;
    healthCheckType?: pulumi.Input<string>;
    iamInstanceProfile?: pulumi.Input<string>;
    imageId?: pulumi.Input<string>;
    instanceTypes?: pulumi.Input<pulumi.Input<string>[]>;
    integrationRoute53?: pulumi.Input<inputs.aws.ManagedInstanceIntegrationRoute53>;
    keyPair?: pulumi.Input<string>;
    lifeCycle?: pulumi.Input<string>;
    loadBalancers?: pulumi.Input<pulumi.Input<inputs.aws.ManagedInstanceLoadBalancer>[]>;
    managedInstanceAction?: pulumi.Input<inputs.aws.ManagedInstanceManagedInstanceAction>;
    metadataOptions?: pulumi.Input<inputs.aws.ManagedInstanceMetadataOptions>;
    minimumInstanceLifetime?: pulumi.Input<number>;
    name?: pulumi.Input<string>;
    networkInterfaces?: pulumi.Input<pulumi.Input<inputs.aws.ManagedInstanceNetworkInterface>[]>;
    optimizationWindows?: pulumi.Input<pulumi.Input<string>[]>;
    orientation?: pulumi.Input<string>;
    persistBlockDevices?: pulumi.Input<boolean>;
    persistPrivateIp?: pulumi.Input<boolean>;
    persistRootDevice?: pulumi.Input<boolean>;
    placementTenancy?: pulumi.Input<string>;
    preferredType?: pulumi.Input<string>;
    privateIp?: pulumi.Input<string>;
    product?: pulumi.Input<string>;
    region?: pulumi.Input<string>;
    resourceTagSpecifications?: pulumi.Input<pulumi.Input<inputs.aws.ManagedInstanceResourceTagSpecification>[]>;
    revertToSpot?: pulumi.Input<inputs.aws.ManagedInstanceRevertToSpot>;
    scheduledTasks?: pulumi.Input<pulumi.Input<inputs.aws.ManagedInstanceScheduledTask>[]>;
    securityGroupIds?: pulumi.Input<pulumi.Input<string>[]>;
    shutdownScript?: pulumi.Input<string>;
    subnetIds?: pulumi.Input<pulumi.Input<string>[]>;
    tags?: pulumi.Input<pulumi.Input<inputs.aws.ManagedInstanceTag>[]>;
    unhealthyDuration?: pulumi.Input<number>;
    userData?: pulumi.Input<string>;
    utilizeReservedInstances?: pulumi.Input<boolean>;
    vpcId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ManagedInstance resource.
 */
export interface ManagedInstanceArgs {
    autoHealing?: pulumi.Input<boolean>;
    blockDeviceMappings?: pulumi.Input<pulumi.Input<inputs.aws.ManagedInstanceBlockDeviceMapping>[]>;
    blockDevicesMode?: pulumi.Input<string>;
    cpuCredits?: pulumi.Input<string>;
    deletes?: pulumi.Input<pulumi.Input<inputs.aws.ManagedInstanceDelete>[]>;
    description?: pulumi.Input<string>;
    drainingTimeout?: pulumi.Input<number>;
    ebsOptimized?: pulumi.Input<boolean>;
    elasticIp?: pulumi.Input<string>;
    enableMonitoring?: pulumi.Input<boolean>;
    fallbackToOndemand?: pulumi.Input<boolean>;
    gracePeriod?: pulumi.Input<number>;
    healthCheckType?: pulumi.Input<string>;
    iamInstanceProfile?: pulumi.Input<string>;
    imageId: pulumi.Input<string>;
    instanceTypes: pulumi.Input<pulumi.Input<string>[]>;
    integrationRoute53?: pulumi.Input<inputs.aws.ManagedInstanceIntegrationRoute53>;
    keyPair?: pulumi.Input<string>;
    lifeCycle?: pulumi.Input<string>;
    loadBalancers?: pulumi.Input<pulumi.Input<inputs.aws.ManagedInstanceLoadBalancer>[]>;
    managedInstanceAction?: pulumi.Input<inputs.aws.ManagedInstanceManagedInstanceAction>;
    metadataOptions?: pulumi.Input<inputs.aws.ManagedInstanceMetadataOptions>;
    minimumInstanceLifetime?: pulumi.Input<number>;
    name?: pulumi.Input<string>;
    networkInterfaces?: pulumi.Input<pulumi.Input<inputs.aws.ManagedInstanceNetworkInterface>[]>;
    optimizationWindows?: pulumi.Input<pulumi.Input<string>[]>;
    orientation?: pulumi.Input<string>;
    persistBlockDevices: pulumi.Input<boolean>;
    persistPrivateIp?: pulumi.Input<boolean>;
    persistRootDevice?: pulumi.Input<boolean>;
    placementTenancy?: pulumi.Input<string>;
    preferredType?: pulumi.Input<string>;
    privateIp?: pulumi.Input<string>;
    product: pulumi.Input<string>;
    region?: pulumi.Input<string>;
    resourceTagSpecifications?: pulumi.Input<pulumi.Input<inputs.aws.ManagedInstanceResourceTagSpecification>[]>;
    revertToSpot?: pulumi.Input<inputs.aws.ManagedInstanceRevertToSpot>;
    scheduledTasks?: pulumi.Input<pulumi.Input<inputs.aws.ManagedInstanceScheduledTask>[]>;
    securityGroupIds?: pulumi.Input<pulumi.Input<string>[]>;
    shutdownScript?: pulumi.Input<string>;
    subnetIds: pulumi.Input<pulumi.Input<string>[]>;
    tags?: pulumi.Input<pulumi.Input<inputs.aws.ManagedInstanceTag>[]>;
    unhealthyDuration?: pulumi.Input<number>;
    userData?: pulumi.Input<string>;
    utilizeReservedInstances?: pulumi.Input<boolean>;
    vpcId: pulumi.Input<string>;
}
