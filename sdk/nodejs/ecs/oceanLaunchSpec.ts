// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Manages a custom Spotinst Ocean ECS Launch Spec resource.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as spotinst from "@pulumi/spotinst";
 *
 * const example = new spotinst.ecs.OceanLaunchSpec("example", {
 *     attributes: [{
 *         key: "fakeKey",
 *         value: "fakeValue",
 *     }],
 *     autoscaleHeadrooms: [{
 *         cpuPerUnit: 1000,
 *         memoryPerUnit: 2048,
 *         numOfUnits: 5,
 *     }],
 *     blockDeviceMappings: [{
 *         deviceName: "/dev/xvda1",
 *         ebs: {
 *             deleteOnTermination: true,
 *             dynamicVolumeSize: {
 *                 baseSize: 50,
 *                 resource: "CPU",
 *                 sizePerResourceUnit: 20,
 *             },
 *             encrypted: false,
 *             throughput: 500,
 *             volumeSize: 50,
 *             volumeType: "gp2",
 *         },
 *     }],
 *     iamInstanceProfile: "iam-profile",
 *     imageId: "ami-123456",
 *     instanceMetadataOptions: {
 *         httpPutResponseHopLimit: 10,
 *         httpTokens: "required",
 *     },
 *     instanceTypes: [
 *         "m3.large",
 *         "m3.xlarge",
 *         "m3.2xlarge",
 *         "m4.large",
 *         "m4.xlarge",
 *         "m4.4xlarge",
 *         "m4.2xlarge",
 *         "m4.10xlarge",
 *         "m4.16xlarge",
 *         "m5.large",
 *         "m5.xlarge",
 *         "m5.2xlarge",
 *         "m5.4xlarge",
 *         "m5.12xlarge",
 *         "m5.24xlarge",
 *     ],
 *     oceanId: "o-123456",
 *     preferredSpotTypes: [
 *         "m3.large",
 *         "m3.xlarge",
 *         "m3.2xlarge",
 *         "m4.large",
 *         "m4.xlarge",
 *     ],
 *     restrictScaleDown: true,
 *     schedulingTasks: [{
 *         cronExpression: "0 1 * * *",
 *         isEnabled: true,
 *         taskHeadrooms: [{
 *             cpuPerUnit: 1000,
 *             memoryPerUnit: 2048,
 *             numOfUnits: 5,
 *         }],
 *         taskType: "manualHeadroomUpdate",
 *     }],
 *     securityGroupIds: ["awseb-12345"],
 *     strategies: [{
 *         spotPercentage: 50,
 *     }],
 *     subnetIds: ["subnet-12345"],
 *     tags: [{
 *         key: "Env",
 *         value: "production",
 *     }],
 *     userData: "echo hello world",
 * });
 * ```
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 *
 * export const oceanLaunchspecId = spotinst_ocean_ecs_launch_spec.example.id;
 * ```
 * ## Block Devices
 *
 * * `blockDeviceMappings`- (Optional) Object. Array list of block devices that are exposed to the instance, specify either virtual devices and EBS volumes.
 *     * `deviceName` - (Optional) String. Set device name. (Example: "/dev/xvda1").
 *     * `ebs`- (Optional) Object. Set Elastic Block Store properties .
 *         * `deleteOnTermination`- (Optional) Boolean. Flag to delete the EBS on instance termination.
 *         * `encrypted`- (Optional) Boolean. Enables [EBS encryption](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html) on the volume.
 *         * `iops`- (Required for requests to create io1 volumes; it is not used in requests to create gp2, st1, sc1, or standard volumes) Int. The number of I/O operations per second (IOPS) that the volume supports.
 *         * `kmsKeyId`- (Optional) String. Identifier (key ID, key alias, ID ARN, or alias ARN) for a customer managed CMK under which the EBS volume is encrypted.
 *         * `snapshotId`- (Optional) (Optional) String. The Snapshot ID to mount by.
 *         * `volumeType`- (Optional, Default: `"standard"`) String. The type of the volume (example: "gp2").
 *         * `volumeSize`- (Optional) Int. The size, in GB of the volume.
 *         * `throughput`- (Optional) The amount of data transferred to or from a storage device per second, you can use this param just in a case that `volumeType` = gp3.
 *         * `dynamicVolumeSize`- (Optional) Object. Set dynamic volume size properties. When using this object, you cannot use volumeSize. You must use one or the other.
 *             * `baseSize`- (Required) Int. Initial size for volume. (Example: 50)
 *             * `resource`- (Required) String. Resource type to increase volume size dynamically by. (valid values: "CPU")
 *             * `sizePerResourceUnit`- (Required) Int. Additional size (in GB) per resource unit. (Example: baseSize= 50, sizePerResourceUnit=20, and instance with 2 CPU is launched - its total disk size will be: 90GB)
 *         * `noDevice`- (Optional) String. suppresses the specified device included in the block device mapping of the AMI.
 */
export class OceanLaunchSpec extends pulumi.CustomResource {
    /**
     * Get an existing OceanLaunchSpec resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: OceanLaunchSpecState, opts?: pulumi.CustomResourceOptions): OceanLaunchSpec {
        return new OceanLaunchSpec(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'spotinst:ecs/oceanLaunchSpec:OceanLaunchSpec';

    /**
     * Returns true if the given object is an instance of OceanLaunchSpec.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is OceanLaunchSpec {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === OceanLaunchSpec.__pulumiType;
    }

    /**
     * Optionally adds labels to instances launched in an Ocean cluster.
     */
    public readonly attributes!: pulumi.Output<outputs.ecs.OceanLaunchSpecAttribute[] | undefined>;
    /**
     * Set custom headroom per launch spec. provide list of headrooms object.
     */
    public readonly autoscaleHeadrooms!: pulumi.Output<outputs.ecs.OceanLaunchSpecAutoscaleHeadroom[] | undefined>;
    public readonly blockDeviceMappings!: pulumi.Output<outputs.ecs.OceanLaunchSpecBlockDeviceMapping[] | undefined>;
    /**
     * The ARN or name of an IAM instance profile to associate with launched instances.
     */
    public readonly iamInstanceProfile!: pulumi.Output<string | undefined>;
    /**
     * ID of the image used to launch the instances.
     */
    public readonly imageId!: pulumi.Output<string | undefined>;
    /**
     * Ocean instance metadata options object for IMDSv2.
     */
    public readonly instanceMetadataOptions!: pulumi.Output<outputs.ecs.OceanLaunchSpecInstanceMetadataOptions | undefined>;
    /**
     * A list of instance types allowed to be provisioned for pods pending under the specified launch specification. The list overrides the list defined for the Ocean cluster.
     */
    public readonly instanceTypes!: pulumi.Output<string[] | undefined>;
    /**
     * The Ocean Launch Specification name.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The Ocean cluster ID .
     */
    public readonly oceanId!: pulumi.Output<string>;
    /**
     * When Ocean scales up instances, it takes your preferred types into consideration while maintaining a variety of machine types running for optimized distribution.
     */
    public readonly preferredSpotTypes!: pulumi.Output<string[] | undefined>;
    /**
     * Boolean. When set to “True”, VNG nodes will be treated as if all pods running have the restrict-scale-down label. Therefore, Ocean will not scale nodes down unless empty.
     */
    public readonly restrictScaleDown!: pulumi.Output<boolean | undefined>;
    /**
     * Used to define scheduled tasks such as a manual headroom update.
     */
    public readonly schedulingTasks!: pulumi.Output<outputs.ecs.OceanLaunchSpecSchedulingTask[] | undefined>;
    /**
     * One or more security group ids.
     */
    public readonly securityGroupIds!: pulumi.Output<string[] | undefined>;
    /**
     * Similar to a strategy for an Ocean cluster, but applying only to a virtual node group.
     */
    public readonly strategies!: pulumi.Output<outputs.ecs.OceanLaunchSpecStrategy[] | undefined>;
    /**
     * Set subnets in launchSpec. Each element in the array should be a subnet ID.
     */
    public readonly subnetIds!: pulumi.Output<string[] | undefined>;
    /**
     * A key/value mapping of tags to assign to the resource.
     */
    public readonly tags!: pulumi.Output<outputs.ecs.OceanLaunchSpecTag[] | undefined>;
    /**
     * Base64-encoded MIME user data to make available to the instances.
     */
    public readonly userData!: pulumi.Output<string | undefined>;

    /**
     * Create a OceanLaunchSpec resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: OceanLaunchSpecArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: OceanLaunchSpecArgs | OceanLaunchSpecState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as OceanLaunchSpecState | undefined;
            resourceInputs["attributes"] = state ? state.attributes : undefined;
            resourceInputs["autoscaleHeadrooms"] = state ? state.autoscaleHeadrooms : undefined;
            resourceInputs["blockDeviceMappings"] = state ? state.blockDeviceMappings : undefined;
            resourceInputs["iamInstanceProfile"] = state ? state.iamInstanceProfile : undefined;
            resourceInputs["imageId"] = state ? state.imageId : undefined;
            resourceInputs["instanceMetadataOptions"] = state ? state.instanceMetadataOptions : undefined;
            resourceInputs["instanceTypes"] = state ? state.instanceTypes : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["oceanId"] = state ? state.oceanId : undefined;
            resourceInputs["preferredSpotTypes"] = state ? state.preferredSpotTypes : undefined;
            resourceInputs["restrictScaleDown"] = state ? state.restrictScaleDown : undefined;
            resourceInputs["schedulingTasks"] = state ? state.schedulingTasks : undefined;
            resourceInputs["securityGroupIds"] = state ? state.securityGroupIds : undefined;
            resourceInputs["strategies"] = state ? state.strategies : undefined;
            resourceInputs["subnetIds"] = state ? state.subnetIds : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["userData"] = state ? state.userData : undefined;
        } else {
            const args = argsOrState as OceanLaunchSpecArgs | undefined;
            if ((!args || args.name === undefined) && !opts.urn) {
                throw new Error("Missing required property 'name'");
            }
            if ((!args || args.oceanId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'oceanId'");
            }
            resourceInputs["attributes"] = args ? args.attributes : undefined;
            resourceInputs["autoscaleHeadrooms"] = args ? args.autoscaleHeadrooms : undefined;
            resourceInputs["blockDeviceMappings"] = args ? args.blockDeviceMappings : undefined;
            resourceInputs["iamInstanceProfile"] = args ? args.iamInstanceProfile : undefined;
            resourceInputs["imageId"] = args ? args.imageId : undefined;
            resourceInputs["instanceMetadataOptions"] = args ? args.instanceMetadataOptions : undefined;
            resourceInputs["instanceTypes"] = args ? args.instanceTypes : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["oceanId"] = args ? args.oceanId : undefined;
            resourceInputs["preferredSpotTypes"] = args ? args.preferredSpotTypes : undefined;
            resourceInputs["restrictScaleDown"] = args ? args.restrictScaleDown : undefined;
            resourceInputs["schedulingTasks"] = args ? args.schedulingTasks : undefined;
            resourceInputs["securityGroupIds"] = args ? args.securityGroupIds : undefined;
            resourceInputs["strategies"] = args ? args.strategies : undefined;
            resourceInputs["subnetIds"] = args ? args.subnetIds : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["userData"] = args ? args.userData : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(OceanLaunchSpec.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering OceanLaunchSpec resources.
 */
export interface OceanLaunchSpecState {
    /**
     * Optionally adds labels to instances launched in an Ocean cluster.
     */
    attributes?: pulumi.Input<pulumi.Input<inputs.ecs.OceanLaunchSpecAttribute>[]>;
    /**
     * Set custom headroom per launch spec. provide list of headrooms object.
     */
    autoscaleHeadrooms?: pulumi.Input<pulumi.Input<inputs.ecs.OceanLaunchSpecAutoscaleHeadroom>[]>;
    blockDeviceMappings?: pulumi.Input<pulumi.Input<inputs.ecs.OceanLaunchSpecBlockDeviceMapping>[]>;
    /**
     * The ARN or name of an IAM instance profile to associate with launched instances.
     */
    iamInstanceProfile?: pulumi.Input<string>;
    /**
     * ID of the image used to launch the instances.
     */
    imageId?: pulumi.Input<string>;
    /**
     * Ocean instance metadata options object for IMDSv2.
     */
    instanceMetadataOptions?: pulumi.Input<inputs.ecs.OceanLaunchSpecInstanceMetadataOptions>;
    /**
     * A list of instance types allowed to be provisioned for pods pending under the specified launch specification. The list overrides the list defined for the Ocean cluster.
     */
    instanceTypes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The Ocean Launch Specification name.
     */
    name?: pulumi.Input<string>;
    /**
     * The Ocean cluster ID .
     */
    oceanId?: pulumi.Input<string>;
    /**
     * When Ocean scales up instances, it takes your preferred types into consideration while maintaining a variety of machine types running for optimized distribution.
     */
    preferredSpotTypes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Boolean. When set to “True”, VNG nodes will be treated as if all pods running have the restrict-scale-down label. Therefore, Ocean will not scale nodes down unless empty.
     */
    restrictScaleDown?: pulumi.Input<boolean>;
    /**
     * Used to define scheduled tasks such as a manual headroom update.
     */
    schedulingTasks?: pulumi.Input<pulumi.Input<inputs.ecs.OceanLaunchSpecSchedulingTask>[]>;
    /**
     * One or more security group ids.
     */
    securityGroupIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Similar to a strategy for an Ocean cluster, but applying only to a virtual node group.
     */
    strategies?: pulumi.Input<pulumi.Input<inputs.ecs.OceanLaunchSpecStrategy>[]>;
    /**
     * Set subnets in launchSpec. Each element in the array should be a subnet ID.
     */
    subnetIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A key/value mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<pulumi.Input<inputs.ecs.OceanLaunchSpecTag>[]>;
    /**
     * Base64-encoded MIME user data to make available to the instances.
     */
    userData?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a OceanLaunchSpec resource.
 */
export interface OceanLaunchSpecArgs {
    /**
     * Optionally adds labels to instances launched in an Ocean cluster.
     */
    attributes?: pulumi.Input<pulumi.Input<inputs.ecs.OceanLaunchSpecAttribute>[]>;
    /**
     * Set custom headroom per launch spec. provide list of headrooms object.
     */
    autoscaleHeadrooms?: pulumi.Input<pulumi.Input<inputs.ecs.OceanLaunchSpecAutoscaleHeadroom>[]>;
    blockDeviceMappings?: pulumi.Input<pulumi.Input<inputs.ecs.OceanLaunchSpecBlockDeviceMapping>[]>;
    /**
     * The ARN or name of an IAM instance profile to associate with launched instances.
     */
    iamInstanceProfile?: pulumi.Input<string>;
    /**
     * ID of the image used to launch the instances.
     */
    imageId?: pulumi.Input<string>;
    /**
     * Ocean instance metadata options object for IMDSv2.
     */
    instanceMetadataOptions?: pulumi.Input<inputs.ecs.OceanLaunchSpecInstanceMetadataOptions>;
    /**
     * A list of instance types allowed to be provisioned for pods pending under the specified launch specification. The list overrides the list defined for the Ocean cluster.
     */
    instanceTypes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The Ocean Launch Specification name.
     */
    name: pulumi.Input<string>;
    /**
     * The Ocean cluster ID .
     */
    oceanId: pulumi.Input<string>;
    /**
     * When Ocean scales up instances, it takes your preferred types into consideration while maintaining a variety of machine types running for optimized distribution.
     */
    preferredSpotTypes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Boolean. When set to “True”, VNG nodes will be treated as if all pods running have the restrict-scale-down label. Therefore, Ocean will not scale nodes down unless empty.
     */
    restrictScaleDown?: pulumi.Input<boolean>;
    /**
     * Used to define scheduled tasks such as a manual headroom update.
     */
    schedulingTasks?: pulumi.Input<pulumi.Input<inputs.ecs.OceanLaunchSpecSchedulingTask>[]>;
    /**
     * One or more security group ids.
     */
    securityGroupIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Similar to a strategy for an Ocean cluster, but applying only to a virtual node group.
     */
    strategies?: pulumi.Input<pulumi.Input<inputs.ecs.OceanLaunchSpecStrategy>[]>;
    /**
     * Set subnets in launchSpec. Each element in the array should be a subnet ID.
     */
    subnetIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A key/value mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<pulumi.Input<inputs.ecs.OceanLaunchSpecTag>[]>;
    /**
     * Base64-encoded MIME user data to make available to the instances.
     */
    userData?: pulumi.Input<string>;
}
