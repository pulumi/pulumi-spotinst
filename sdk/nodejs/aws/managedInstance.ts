// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * > This content is derived from https://github.com/terraform-providers/terraform-provider-spotinst/blob/master/website/docs/r/managed_instance_aws.html.markdown.
 */
export class ManagedInstance extends pulumi.CustomResource {
    /**
     * Get an existing ManagedInstance resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
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

    /**
     * Enable the auto healing which auto replaces the instance in case the health check fails, default: `“true”`. 
     */
    public readonly autoHealing!: pulumi.Output<boolean | undefined>;
    /**
     * Determine the way we attach the data volumes to the data devices. Valid values: `"reattach"`, `"onLaunch"`.
     * Default: `"onLaunch"`.
     */
    public readonly blockDevicesMode!: pulumi.Output<string | undefined>;
    /**
     * cpuCredits can have one of two values: “unlimited”, “standard”.
     * Default: unlimited
     */
    public readonly cpuCredits!: pulumi.Output<string | undefined>;
    /**
     * The ManagedInstance description.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The time in seconds to allow the instance be drained from incoming TCP connections and detached from ELB before terminating it, during a scale down operation.
     */
    public readonly drainingTimeout!: pulumi.Output<number | undefined>;
    /**
     * Enable EBS optimization for supported instance which is not enabled by default. Note - additional charges will be applied.
     * Default: false
     */
    public readonly ebsOptimized!: pulumi.Output<boolean>;
    /**
     * Elastic IP Allocation Id to associate to the instance.
     */
    public readonly elasticIp!: pulumi.Output<string | undefined>;
    /**
     * Describes whether instance Enhanced Monitoring is enabled.
     * Default: false
     */
    public readonly enableMonitoring!: pulumi.Output<boolean | undefined>;
    public readonly fallBackToOd!: pulumi.Output<boolean | undefined>;
    /**
     * The amount of time, in seconds, after the instance has launched to starts and check its health, default `“120"`.
     */
    public readonly gracePeriod!: pulumi.Output<number | undefined>;
    /**
     * The service to use for the health check. Valid values: `“EC2”`, `“ELB”`, `“TARGET_GROUP”`, `“MULTAI_TARGET_SET”`.
     * Default: `“EC2”`.
     */
    public readonly healthCheckType!: pulumi.Output<string | undefined>;
    /**
     * Set IAM profile to instance. Set only one of ARN or Name.
     */
    public readonly iamInstanceProfile!: pulumi.Output<string | undefined>;
    /**
     * The ID of the image used to launch the instance.
     */
    public readonly imageId!: pulumi.Output<string>;
    /**
     * Comma separated list of available instance types for instance.
     */
    public readonly instanceTypes!: pulumi.Output<string[]>;
    public readonly integrationRoute53!: pulumi.Output<outputs.aws.ManagedInstanceIntegrationRoute53 | undefined>;
    /**
     * Specify a Key Pair to attach to the instances.
     */
    public readonly keyPair!: pulumi.Output<string | undefined>;
    /**
     * Set lifecycle, valid values: `“spot”`, `“on_demand”`.
     * Default `"spot"`.
     */
    public readonly lifeCycle!: pulumi.Output<string | undefined>;
    public readonly loadBalancers!: pulumi.Output<outputs.aws.ManagedInstanceLoadBalancer[] | undefined>;
    /**
     * The ManagedInstance name.
     */
    public readonly name!: pulumi.Output<string>;
    public readonly networkInterfaces!: pulumi.Output<outputs.aws.ManagedInstanceNetworkInterface[] | undefined>;
    /**
     * When performAt is 'timeWindow': must specify a list of 'timeWindows' with at least one time window Each string is in the format of - ddd:hh:mm-ddd:hh:mm ddd = day of week = Sun | Mon | Tue | Wed | Thu | Fri | Sat hh = hour 24 = 0 -23 mm = minute = 0 - 59.
     */
    public readonly optimizationWindows!: pulumi.Output<string[] | undefined>;
    /**
     * Select a prediction strategy. Valid values: `"balanced"`, `"costOriented"`, `"availabilityOriented"`, `"cheapest"`.
     * Default: `"availabilityOriented"`.
     */
    public readonly orientation!: pulumi.Output<string | undefined>;
    /**
     * Should the instance maintain its Data volumes. 
     */
    public readonly persistBlockDevices!: pulumi.Output<boolean>;
    /**
     * Should the instance maintain its private IP.  
     */
    public readonly persistPrivateIp!: pulumi.Output<boolean | undefined>;
    /**
     * Should the instance maintain its root device volumes.
     */
    public readonly persistRootDevice!: pulumi.Output<boolean | undefined>;
    /**
     * Valid values: "default", "dedicated"
     * Default: default
     */
    public readonly placementTenancy!: pulumi.Output<string | undefined>;
    /**
     * Preferred instance types for the instance. We will automatically select optional similar instance types to ensure optimized cost efficiency
     */
    public readonly preferredType!: pulumi.Output<string | undefined>;
    /**
     * Private IP Allocation Id to associate to the instance. 
     */
    public readonly privateIp!: pulumi.Output<string | undefined>;
    /**
     * Operation system type. Valid values: `"Linux/UNIX"`, `"SUSE Linux"`, `"Windows"`, `"Red Hat Enterprise Linux"`, `"Linux/UNIX (Amazon VPC)"`, `"SUSE Linux (Amazon VPC)"`, `"Windows (Amazon VPC)"`,  `"Red Hat Enterprise Linux (Amazon VPC)"`.    
     */
    public readonly product!: pulumi.Output<string>;
    /**
     * The AWS region your group will be created in.
     */
    public readonly region!: pulumi.Output<string | undefined>;
    public readonly revertToSpot!: pulumi.Output<outputs.aws.ManagedInstanceRevertToSpot | undefined>;
    public readonly scheduledTasks!: pulumi.Output<outputs.aws.ManagedInstanceScheduledTask[] | undefined>;
    /**
     * One or more security group IDs.
     */
    public readonly securityGroupIds!: pulumi.Output<string[] | undefined>;
    /**
     * The Base64-encoded shutdown script to execute prior to instance termination.
     */
    public readonly shutdownScript!: pulumi.Output<string | undefined>;
    /**
     * A comma-separated list of subnet identifiers for your instance.
     */
    public readonly subnetIds!: pulumi.Output<string[]>;
    /**
     * Set tags for the instance. Items should be unique.
     */
    public readonly tags!: pulumi.Output<outputs.aws.ManagedInstanceTag[] | undefined>;
    /**
     * The amount of time, in seconds, an existing instance should remain active after becoming unhealthy. After the set time out the instance will be replaced, default `“120"`.
     */
    public readonly unhealthyDuration!: pulumi.Output<number | undefined>;
    /**
     * The Base64-encoded MIME user data to make available to the instances.
     */
    public readonly userData!: pulumi.Output<string | undefined>;
    /**
     * In case of any available Reserved Instances, Managed Instance will utilize them before purchasing Spot instances.
     * Default: `"false"`.
     */
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
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as ManagedInstanceState | undefined;
            inputs["autoHealing"] = state ? state.autoHealing : undefined;
            inputs["blockDevicesMode"] = state ? state.blockDevicesMode : undefined;
            inputs["cpuCredits"] = state ? state.cpuCredits : undefined;
            inputs["description"] = state ? state.description : undefined;
            inputs["drainingTimeout"] = state ? state.drainingTimeout : undefined;
            inputs["ebsOptimized"] = state ? state.ebsOptimized : undefined;
            inputs["elasticIp"] = state ? state.elasticIp : undefined;
            inputs["enableMonitoring"] = state ? state.enableMonitoring : undefined;
            inputs["fallBackToOd"] = state ? state.fallBackToOd : undefined;
            inputs["gracePeriod"] = state ? state.gracePeriod : undefined;
            inputs["healthCheckType"] = state ? state.healthCheckType : undefined;
            inputs["iamInstanceProfile"] = state ? state.iamInstanceProfile : undefined;
            inputs["imageId"] = state ? state.imageId : undefined;
            inputs["instanceTypes"] = state ? state.instanceTypes : undefined;
            inputs["integrationRoute53"] = state ? state.integrationRoute53 : undefined;
            inputs["keyPair"] = state ? state.keyPair : undefined;
            inputs["lifeCycle"] = state ? state.lifeCycle : undefined;
            inputs["loadBalancers"] = state ? state.loadBalancers : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["networkInterfaces"] = state ? state.networkInterfaces : undefined;
            inputs["optimizationWindows"] = state ? state.optimizationWindows : undefined;
            inputs["orientation"] = state ? state.orientation : undefined;
            inputs["persistBlockDevices"] = state ? state.persistBlockDevices : undefined;
            inputs["persistPrivateIp"] = state ? state.persistPrivateIp : undefined;
            inputs["persistRootDevice"] = state ? state.persistRootDevice : undefined;
            inputs["placementTenancy"] = state ? state.placementTenancy : undefined;
            inputs["preferredType"] = state ? state.preferredType : undefined;
            inputs["privateIp"] = state ? state.privateIp : undefined;
            inputs["product"] = state ? state.product : undefined;
            inputs["region"] = state ? state.region : undefined;
            inputs["revertToSpot"] = state ? state.revertToSpot : undefined;
            inputs["scheduledTasks"] = state ? state.scheduledTasks : undefined;
            inputs["securityGroupIds"] = state ? state.securityGroupIds : undefined;
            inputs["shutdownScript"] = state ? state.shutdownScript : undefined;
            inputs["subnetIds"] = state ? state.subnetIds : undefined;
            inputs["tags"] = state ? state.tags : undefined;
            inputs["unhealthyDuration"] = state ? state.unhealthyDuration : undefined;
            inputs["userData"] = state ? state.userData : undefined;
            inputs["utilizeReservedInstances"] = state ? state.utilizeReservedInstances : undefined;
            inputs["vpcId"] = state ? state.vpcId : undefined;
        } else {
            const args = argsOrState as ManagedInstanceArgs | undefined;
            if (!args || args.imageId === undefined) {
                throw new Error("Missing required property 'imageId'");
            }
            if (!args || args.instanceTypes === undefined) {
                throw new Error("Missing required property 'instanceTypes'");
            }
            if (!args || args.persistBlockDevices === undefined) {
                throw new Error("Missing required property 'persistBlockDevices'");
            }
            if (!args || args.product === undefined) {
                throw new Error("Missing required property 'product'");
            }
            if (!args || args.subnetIds === undefined) {
                throw new Error("Missing required property 'subnetIds'");
            }
            if (!args || args.vpcId === undefined) {
                throw new Error("Missing required property 'vpcId'");
            }
            inputs["autoHealing"] = args ? args.autoHealing : undefined;
            inputs["blockDevicesMode"] = args ? args.blockDevicesMode : undefined;
            inputs["cpuCredits"] = args ? args.cpuCredits : undefined;
            inputs["description"] = args ? args.description : undefined;
            inputs["drainingTimeout"] = args ? args.drainingTimeout : undefined;
            inputs["ebsOptimized"] = args ? args.ebsOptimized : undefined;
            inputs["elasticIp"] = args ? args.elasticIp : undefined;
            inputs["enableMonitoring"] = args ? args.enableMonitoring : undefined;
            inputs["fallBackToOd"] = args ? args.fallBackToOd : undefined;
            inputs["gracePeriod"] = args ? args.gracePeriod : undefined;
            inputs["healthCheckType"] = args ? args.healthCheckType : undefined;
            inputs["iamInstanceProfile"] = args ? args.iamInstanceProfile : undefined;
            inputs["imageId"] = args ? args.imageId : undefined;
            inputs["instanceTypes"] = args ? args.instanceTypes : undefined;
            inputs["integrationRoute53"] = args ? args.integrationRoute53 : undefined;
            inputs["keyPair"] = args ? args.keyPair : undefined;
            inputs["lifeCycle"] = args ? args.lifeCycle : undefined;
            inputs["loadBalancers"] = args ? args.loadBalancers : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["networkInterfaces"] = args ? args.networkInterfaces : undefined;
            inputs["optimizationWindows"] = args ? args.optimizationWindows : undefined;
            inputs["orientation"] = args ? args.orientation : undefined;
            inputs["persistBlockDevices"] = args ? args.persistBlockDevices : undefined;
            inputs["persistPrivateIp"] = args ? args.persistPrivateIp : undefined;
            inputs["persistRootDevice"] = args ? args.persistRootDevice : undefined;
            inputs["placementTenancy"] = args ? args.placementTenancy : undefined;
            inputs["preferredType"] = args ? args.preferredType : undefined;
            inputs["privateIp"] = args ? args.privateIp : undefined;
            inputs["product"] = args ? args.product : undefined;
            inputs["region"] = args ? args.region : undefined;
            inputs["revertToSpot"] = args ? args.revertToSpot : undefined;
            inputs["scheduledTasks"] = args ? args.scheduledTasks : undefined;
            inputs["securityGroupIds"] = args ? args.securityGroupIds : undefined;
            inputs["shutdownScript"] = args ? args.shutdownScript : undefined;
            inputs["subnetIds"] = args ? args.subnetIds : undefined;
            inputs["tags"] = args ? args.tags : undefined;
            inputs["unhealthyDuration"] = args ? args.unhealthyDuration : undefined;
            inputs["userData"] = args ? args.userData : undefined;
            inputs["utilizeReservedInstances"] = args ? args.utilizeReservedInstances : undefined;
            inputs["vpcId"] = args ? args.vpcId : undefined;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(ManagedInstance.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ManagedInstance resources.
 */
export interface ManagedInstanceState {
    /**
     * Enable the auto healing which auto replaces the instance in case the health check fails, default: `“true”`. 
     */
    readonly autoHealing?: pulumi.Input<boolean>;
    /**
     * Determine the way we attach the data volumes to the data devices. Valid values: `"reattach"`, `"onLaunch"`.
     * Default: `"onLaunch"`.
     */
    readonly blockDevicesMode?: pulumi.Input<string>;
    /**
     * cpuCredits can have one of two values: “unlimited”, “standard”.
     * Default: unlimited
     */
    readonly cpuCredits?: pulumi.Input<string>;
    /**
     * The ManagedInstance description.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * The time in seconds to allow the instance be drained from incoming TCP connections and detached from ELB before terminating it, during a scale down operation.
     */
    readonly drainingTimeout?: pulumi.Input<number>;
    /**
     * Enable EBS optimization for supported instance which is not enabled by default. Note - additional charges will be applied.
     * Default: false
     */
    readonly ebsOptimized?: pulumi.Input<boolean>;
    /**
     * Elastic IP Allocation Id to associate to the instance.
     */
    readonly elasticIp?: pulumi.Input<string>;
    /**
     * Describes whether instance Enhanced Monitoring is enabled.
     * Default: false
     */
    readonly enableMonitoring?: pulumi.Input<boolean>;
    readonly fallBackToOd?: pulumi.Input<boolean>;
    /**
     * The amount of time, in seconds, after the instance has launched to starts and check its health, default `“120"`.
     */
    readonly gracePeriod?: pulumi.Input<number>;
    /**
     * The service to use for the health check. Valid values: `“EC2”`, `“ELB”`, `“TARGET_GROUP”`, `“MULTAI_TARGET_SET”`.
     * Default: `“EC2”`.
     */
    readonly healthCheckType?: pulumi.Input<string>;
    /**
     * Set IAM profile to instance. Set only one of ARN or Name.
     */
    readonly iamInstanceProfile?: pulumi.Input<string>;
    /**
     * The ID of the image used to launch the instance.
     */
    readonly imageId?: pulumi.Input<string>;
    /**
     * Comma separated list of available instance types for instance.
     */
    readonly instanceTypes?: pulumi.Input<pulumi.Input<string>[]>;
    readonly integrationRoute53?: pulumi.Input<inputs.aws.ManagedInstanceIntegrationRoute53>;
    /**
     * Specify a Key Pair to attach to the instances.
     */
    readonly keyPair?: pulumi.Input<string>;
    /**
     * Set lifecycle, valid values: `“spot”`, `“on_demand”`.
     * Default `"spot"`.
     */
    readonly lifeCycle?: pulumi.Input<string>;
    readonly loadBalancers?: pulumi.Input<pulumi.Input<inputs.aws.ManagedInstanceLoadBalancer>[]>;
    /**
     * The ManagedInstance name.
     */
    readonly name?: pulumi.Input<string>;
    readonly networkInterfaces?: pulumi.Input<pulumi.Input<inputs.aws.ManagedInstanceNetworkInterface>[]>;
    /**
     * When performAt is 'timeWindow': must specify a list of 'timeWindows' with at least one time window Each string is in the format of - ddd:hh:mm-ddd:hh:mm ddd = day of week = Sun | Mon | Tue | Wed | Thu | Fri | Sat hh = hour 24 = 0 -23 mm = minute = 0 - 59.
     */
    readonly optimizationWindows?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Select a prediction strategy. Valid values: `"balanced"`, `"costOriented"`, `"availabilityOriented"`, `"cheapest"`.
     * Default: `"availabilityOriented"`.
     */
    readonly orientation?: pulumi.Input<string>;
    /**
     * Should the instance maintain its Data volumes. 
     */
    readonly persistBlockDevices?: pulumi.Input<boolean>;
    /**
     * Should the instance maintain its private IP.  
     */
    readonly persistPrivateIp?: pulumi.Input<boolean>;
    /**
     * Should the instance maintain its root device volumes.
     */
    readonly persistRootDevice?: pulumi.Input<boolean>;
    /**
     * Valid values: "default", "dedicated"
     * Default: default
     */
    readonly placementTenancy?: pulumi.Input<string>;
    /**
     * Preferred instance types for the instance. We will automatically select optional similar instance types to ensure optimized cost efficiency
     */
    readonly preferredType?: pulumi.Input<string>;
    /**
     * Private IP Allocation Id to associate to the instance. 
     */
    readonly privateIp?: pulumi.Input<string>;
    /**
     * Operation system type. Valid values: `"Linux/UNIX"`, `"SUSE Linux"`, `"Windows"`, `"Red Hat Enterprise Linux"`, `"Linux/UNIX (Amazon VPC)"`, `"SUSE Linux (Amazon VPC)"`, `"Windows (Amazon VPC)"`,  `"Red Hat Enterprise Linux (Amazon VPC)"`.    
     */
    readonly product?: pulumi.Input<string>;
    /**
     * The AWS region your group will be created in.
     */
    readonly region?: pulumi.Input<string>;
    readonly revertToSpot?: pulumi.Input<inputs.aws.ManagedInstanceRevertToSpot>;
    readonly scheduledTasks?: pulumi.Input<pulumi.Input<inputs.aws.ManagedInstanceScheduledTask>[]>;
    /**
     * One or more security group IDs.
     */
    readonly securityGroupIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The Base64-encoded shutdown script to execute prior to instance termination.
     */
    readonly shutdownScript?: pulumi.Input<string>;
    /**
     * A comma-separated list of subnet identifiers for your instance.
     */
    readonly subnetIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Set tags for the instance. Items should be unique.
     */
    readonly tags?: pulumi.Input<pulumi.Input<inputs.aws.ManagedInstanceTag>[]>;
    /**
     * The amount of time, in seconds, an existing instance should remain active after becoming unhealthy. After the set time out the instance will be replaced, default `“120"`.
     */
    readonly unhealthyDuration?: pulumi.Input<number>;
    /**
     * The Base64-encoded MIME user data to make available to the instances.
     */
    readonly userData?: pulumi.Input<string>;
    /**
     * In case of any available Reserved Instances, Managed Instance will utilize them before purchasing Spot instances.
     * Default: `"false"`.
     */
    readonly utilizeReservedInstances?: pulumi.Input<boolean>;
    readonly vpcId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ManagedInstance resource.
 */
export interface ManagedInstanceArgs {
    /**
     * Enable the auto healing which auto replaces the instance in case the health check fails, default: `“true”`. 
     */
    readonly autoHealing?: pulumi.Input<boolean>;
    /**
     * Determine the way we attach the data volumes to the data devices. Valid values: `"reattach"`, `"onLaunch"`.
     * Default: `"onLaunch"`.
     */
    readonly blockDevicesMode?: pulumi.Input<string>;
    /**
     * cpuCredits can have one of two values: “unlimited”, “standard”.
     * Default: unlimited
     */
    readonly cpuCredits?: pulumi.Input<string>;
    /**
     * The ManagedInstance description.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * The time in seconds to allow the instance be drained from incoming TCP connections and detached from ELB before terminating it, during a scale down operation.
     */
    readonly drainingTimeout?: pulumi.Input<number>;
    /**
     * Enable EBS optimization for supported instance which is not enabled by default. Note - additional charges will be applied.
     * Default: false
     */
    readonly ebsOptimized?: pulumi.Input<boolean>;
    /**
     * Elastic IP Allocation Id to associate to the instance.
     */
    readonly elasticIp?: pulumi.Input<string>;
    /**
     * Describes whether instance Enhanced Monitoring is enabled.
     * Default: false
     */
    readonly enableMonitoring?: pulumi.Input<boolean>;
    readonly fallBackToOd?: pulumi.Input<boolean>;
    /**
     * The amount of time, in seconds, after the instance has launched to starts and check its health, default `“120"`.
     */
    readonly gracePeriod?: pulumi.Input<number>;
    /**
     * The service to use for the health check. Valid values: `“EC2”`, `“ELB”`, `“TARGET_GROUP”`, `“MULTAI_TARGET_SET”`.
     * Default: `“EC2”`.
     */
    readonly healthCheckType?: pulumi.Input<string>;
    /**
     * Set IAM profile to instance. Set only one of ARN or Name.
     */
    readonly iamInstanceProfile?: pulumi.Input<string>;
    /**
     * The ID of the image used to launch the instance.
     */
    readonly imageId: pulumi.Input<string>;
    /**
     * Comma separated list of available instance types for instance.
     */
    readonly instanceTypes: pulumi.Input<pulumi.Input<string>[]>;
    readonly integrationRoute53?: pulumi.Input<inputs.aws.ManagedInstanceIntegrationRoute53>;
    /**
     * Specify a Key Pair to attach to the instances.
     */
    readonly keyPair?: pulumi.Input<string>;
    /**
     * Set lifecycle, valid values: `“spot”`, `“on_demand”`.
     * Default `"spot"`.
     */
    readonly lifeCycle?: pulumi.Input<string>;
    readonly loadBalancers?: pulumi.Input<pulumi.Input<inputs.aws.ManagedInstanceLoadBalancer>[]>;
    /**
     * The ManagedInstance name.
     */
    readonly name?: pulumi.Input<string>;
    readonly networkInterfaces?: pulumi.Input<pulumi.Input<inputs.aws.ManagedInstanceNetworkInterface>[]>;
    /**
     * When performAt is 'timeWindow': must specify a list of 'timeWindows' with at least one time window Each string is in the format of - ddd:hh:mm-ddd:hh:mm ddd = day of week = Sun | Mon | Tue | Wed | Thu | Fri | Sat hh = hour 24 = 0 -23 mm = minute = 0 - 59.
     */
    readonly optimizationWindows?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Select a prediction strategy. Valid values: `"balanced"`, `"costOriented"`, `"availabilityOriented"`, `"cheapest"`.
     * Default: `"availabilityOriented"`.
     */
    readonly orientation?: pulumi.Input<string>;
    /**
     * Should the instance maintain its Data volumes. 
     */
    readonly persistBlockDevices: pulumi.Input<boolean>;
    /**
     * Should the instance maintain its private IP.  
     */
    readonly persistPrivateIp?: pulumi.Input<boolean>;
    /**
     * Should the instance maintain its root device volumes.
     */
    readonly persistRootDevice?: pulumi.Input<boolean>;
    /**
     * Valid values: "default", "dedicated"
     * Default: default
     */
    readonly placementTenancy?: pulumi.Input<string>;
    /**
     * Preferred instance types for the instance. We will automatically select optional similar instance types to ensure optimized cost efficiency
     */
    readonly preferredType?: pulumi.Input<string>;
    /**
     * Private IP Allocation Id to associate to the instance. 
     */
    readonly privateIp?: pulumi.Input<string>;
    /**
     * Operation system type. Valid values: `"Linux/UNIX"`, `"SUSE Linux"`, `"Windows"`, `"Red Hat Enterprise Linux"`, `"Linux/UNIX (Amazon VPC)"`, `"SUSE Linux (Amazon VPC)"`, `"Windows (Amazon VPC)"`,  `"Red Hat Enterprise Linux (Amazon VPC)"`.    
     */
    readonly product: pulumi.Input<string>;
    /**
     * The AWS region your group will be created in.
     */
    readonly region?: pulumi.Input<string>;
    readonly revertToSpot?: pulumi.Input<inputs.aws.ManagedInstanceRevertToSpot>;
    readonly scheduledTasks?: pulumi.Input<pulumi.Input<inputs.aws.ManagedInstanceScheduledTask>[]>;
    /**
     * One or more security group IDs.
     */
    readonly securityGroupIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The Base64-encoded shutdown script to execute prior to instance termination.
     */
    readonly shutdownScript?: pulumi.Input<string>;
    /**
     * A comma-separated list of subnet identifiers for your instance.
     */
    readonly subnetIds: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Set tags for the instance. Items should be unique.
     */
    readonly tags?: pulumi.Input<pulumi.Input<inputs.aws.ManagedInstanceTag>[]>;
    /**
     * The amount of time, in seconds, an existing instance should remain active after becoming unhealthy. After the set time out the instance will be replaced, default `“120"`.
     */
    readonly unhealthyDuration?: pulumi.Input<number>;
    /**
     * The Base64-encoded MIME user data to make available to the instances.
     */
    readonly userData?: pulumi.Input<string>;
    /**
     * In case of any available Reserved Instances, Managed Instance will utilize them before purchasing Spot instances.
     * Default: `"false"`.
     */
    readonly utilizeReservedInstances?: pulumi.Input<boolean>;
    readonly vpcId: pulumi.Input<string>;
}
