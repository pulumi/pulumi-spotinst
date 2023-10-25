// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Manages a Spotinst Ocean AWS [Virtual Node Group](https://docs.spot.io/ocean/features/launch-specifications) resource.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as spotinst from "@pulumi/spotinst";
 *
 * const example = new spotinst.aws.OceanLaunchSpec("example", {
 *     associatePublicIpAddress: true,
 *     autoscaleDowns: [{
 *         maxScaleDownPercentage: 20,
 *     }],
 *     autoscaleHeadrooms: [{
 *         cpuPerUnit: 1000,
 *         gpuPerUnit: 0,
 *         memoryPerUnit: 2048,
 *         numOfUnits: 5,
 *     }],
 *     autoscaleHeadroomsAutomatics: [{
 *         autoHeadroomPercentage: 5,
 *     }],
 *     blockDeviceMappings: [{
 *         deviceName: "/dev/xvda",
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
 *     createOptions: {
 *         initialNodes: 1,
 *     },
 *     deleteOptions: {
 *         deleteNodes: true,
 *         forceDelete: true,
 *     },
 *     elasticIpPools: [{
 *         tagSelector: {
 *             tagKey: "key",
 *             tagValue: "value",
 *         },
 *     }],
 *     iamInstanceProfile: "iam-profile",
 *     imageId: "ami-123456",
 *     images: [
 *         {
 *             imageId: "ami-id1",
 *         },
 *         {
 *             imageId: "ami-id2",
 *         },
 *     ],
 *     instanceMetadataOptions: {
 *         httpPutResponseHopLimit: 10,
 *         httpTokens: "required",
 *     },
 *     instanceTypes: [
 *         "m4.large",
 *         "m4.xlarge",
 *         "m4.2xlarge",
 *         "m4.4xlarge",
 *     ],
 *     labels: [{
 *         key: "key1",
 *         value: "value1",
 *     }],
 *     oceanId: "o-123456",
 *     preferredSpotTypes: [
 *         "m4.large",
 *         "m4.xlarge",
 *     ],
 *     resourceLimits: [{
 *         maxInstanceCount: 4,
 *         minInstanceCount: 0,
 *     }],
 *     restrictScaleDown: true,
 *     rootVolumeSize: 30,
 *     schedulingShutdownHours: {
 *         isEnabled: true,
 *         timeWindows: [
 *             "Sat:08:00-Sat:08:30",
 *             "Sun:08:00-Sun:08:30",
 *         ],
 *     },
 *     schedulingTasks: [{
 *         cronExpression: "0 1 * * *",
 *         isEnabled: true,
 *         taskHeadrooms: [{
 *             cpuPerUnit: 1000,
 *             gpuPerUnit: 0,
 *             memoryPerUnit: 2048,
 *             numOfUnits: 5,
 *         }],
 *         taskType: "manualHeadroomUpdate",
 *     }],
 *     securityGroups: ["sg-987654321"],
 *     strategies: [{
 *         spotPercentage: 70,
 *     }],
 *     subnetIds: ["subnet-1234"],
 *     tags: [{
 *         key: "Env",
 *         value: "production",
 *     }],
 *     taints: [{
 *         effect: "NoExecute",
 *         key: "key1",
 *         value: "value1",
 *     }],
 *     userData: "echo Hello, world!",
 * });
 * ```
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 *
 * export const oceanLaunchspecId = spotinst_ocean_aws_launch_spec.example.id;
 * ```
 * ## Update Policy
 *
 * * `updatePolicy` - (Optional)
 *     * `shouldRoll` - (Required) Enables the roll.
 *     * `rollConfig` - (Required) Holds the roll configuration.
 *         * `batchSizePercentage` - (Required) Sets the percentage of the instances to deploy in each batch.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * ```
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
    public static readonly __pulumiType = 'spotinst:aws/oceanLaunchSpec:OceanLaunchSpec';

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
     * Configure public IP address allocation.
     */
    public readonly associatePublicIpAddress!: pulumi.Output<boolean | undefined>;
    /**
     * Auto Scaling scale down operations.
     */
    public readonly autoscaleDowns!: pulumi.Output<outputs.aws.OceanLaunchSpecAutoscaleDown[] | undefined>;
    /**
     * Set custom headroom per Virtual Node Group. Provide a list of headrooms object.
     */
    public readonly autoscaleHeadrooms!: pulumi.Output<outputs.aws.OceanLaunchSpecAutoscaleHeadroom[] | undefined>;
    /**
     * Set automatic headroom per launch spec.
     */
    public readonly autoscaleHeadroomsAutomatics!: pulumi.Output<outputs.aws.OceanLaunchSpecAutoscaleHeadroomsAutomatic[] | undefined>;
    /**
     * Object. Array list of block devices that are exposed to the instance, specify either virtual devices and EBS volumes.
     */
    public readonly blockDeviceMappings!: pulumi.Output<outputs.aws.OceanLaunchSpecBlockDeviceMapping[] | undefined>;
    public readonly createOptions!: pulumi.Output<outputs.aws.OceanLaunchSpecCreateOptions | undefined>;
    public readonly deleteOptions!: pulumi.Output<outputs.aws.OceanLaunchSpecDeleteOptions | undefined>;
    /**
     * Assign an Elastic IP to the instances spun by the Virtual Node Group. Can be null.
     */
    public readonly elasticIpPools!: pulumi.Output<outputs.aws.OceanLaunchSpecElasticIpPool[] | undefined>;
    /**
     * The ARN or name of an IAM instance profile to associate with launched instances.
     */
    public readonly iamInstanceProfile!: pulumi.Output<string | undefined>;
    /**
     * Identifier of the image in AWS. Valid values: any string which is not empty or null.
     */
    public readonly imageId!: pulumi.Output<string | undefined>;
    /**
     * Array of objects (Image object, containing the id of the image used to launch instances.) You can configure VNG with either the imageId or images objects, but not both simultaneously.
     * For each architecture type (amd64, arm64) only one AMI is allowed. Valid values: null, or an array with at least one element.
     */
    public readonly images!: pulumi.Output<outputs.aws.OceanLaunchSpecImage[] | undefined>;
    /**
     * Ocean instance metadata options object for IMDSv2.
     */
    public readonly instanceMetadataOptions!: pulumi.Output<outputs.aws.OceanLaunchSpecInstanceMetadataOptions | undefined>;
    /**
     * A list of instance types allowed to be provisioned for pods pending under the specified launch specification. The list overrides the list defined for the cluster.
     */
    public readonly instanceTypes!: pulumi.Output<string[] | undefined>;
    /**
     * The instance types that match with all filters compose the Virtual Node Group's instanceTypes parameter.
     * The architectures that come from the Virtual Node Group's images will be taken into account when using this parameter. Cannot be configured together with Virtual Node Group's instanceTypes and with the Cluster's whitelist/blacklist/filters.
     */
    public readonly instanceTypesFilters!: pulumi.Output<outputs.aws.OceanLaunchSpecInstanceTypesFilters | undefined>;
    /**
     * Optionally adds labels to instances launched in the cluster.
     */
    public readonly labels!: pulumi.Output<outputs.aws.OceanLaunchSpecLabel[] | undefined>;
    /**
     * The name of the Virtual Node Group.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The ID of the Ocean cluster.
     */
    public readonly oceanId!: pulumi.Output<string>;
    /**
     * A list of instance types. Takes the preferred types into consideration while maintaining a variety of machine types running for optimized distribution.
     */
    public readonly preferredSpotTypes!: pulumi.Output<string[] | undefined>;
    public readonly resourceLimits!: pulumi.Output<outputs.aws.OceanLaunchSpecResourceLimit[] | undefined>;
    /**
     * Boolean. When set to `True`, nodes will be treated as if all pods running have the restrict-scale-down label. Therefore, Ocean will not scale nodes down unless empty.
     */
    public readonly restrictScaleDown!: pulumi.Output<boolean | undefined>;
    /**
     * Set root volume size (in GB).
     */
    public readonly rootVolumeSize!: pulumi.Output<number | undefined>;
    /**
     * Used to specify times that the nodes in the virtual node group will be taken down.
     */
    public readonly schedulingShutdownHours!: pulumi.Output<outputs.aws.OceanLaunchSpecSchedulingShutdownHours | undefined>;
    /**
     * Used to define scheduled tasks such as a manual headroom update.
     */
    public readonly schedulingTasks!: pulumi.Output<outputs.aws.OceanLaunchSpecSchedulingTask[] | undefined>;
    /**
     * Optionally adds security group IDs.
     */
    public readonly securityGroups!: pulumi.Output<string[] | undefined>;
    public readonly strategies!: pulumi.Output<outputs.aws.OceanLaunchSpecStrategy[] | undefined>;
    /**
     * A list of subnet IDs.
     */
    public readonly subnetIds!: pulumi.Output<string[] | undefined>;
    /**
     * A key/value mapping of tags to assign to the resource.
     */
    public readonly tags!: pulumi.Output<outputs.aws.OceanLaunchSpecTag[] | undefined>;
    /**
     * Optionally adds labels to instances launched in the cluster.
     */
    public readonly taints!: pulumi.Output<outputs.aws.OceanLaunchSpecTaint[] | undefined>;
    public readonly updatePolicy!: pulumi.Output<outputs.aws.OceanLaunchSpecUpdatePolicy | undefined>;
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
            resourceInputs["associatePublicIpAddress"] = state ? state.associatePublicIpAddress : undefined;
            resourceInputs["autoscaleDowns"] = state ? state.autoscaleDowns : undefined;
            resourceInputs["autoscaleHeadrooms"] = state ? state.autoscaleHeadrooms : undefined;
            resourceInputs["autoscaleHeadroomsAutomatics"] = state ? state.autoscaleHeadroomsAutomatics : undefined;
            resourceInputs["blockDeviceMappings"] = state ? state.blockDeviceMappings : undefined;
            resourceInputs["createOptions"] = state ? state.createOptions : undefined;
            resourceInputs["deleteOptions"] = state ? state.deleteOptions : undefined;
            resourceInputs["elasticIpPools"] = state ? state.elasticIpPools : undefined;
            resourceInputs["iamInstanceProfile"] = state ? state.iamInstanceProfile : undefined;
            resourceInputs["imageId"] = state ? state.imageId : undefined;
            resourceInputs["images"] = state ? state.images : undefined;
            resourceInputs["instanceMetadataOptions"] = state ? state.instanceMetadataOptions : undefined;
            resourceInputs["instanceTypes"] = state ? state.instanceTypes : undefined;
            resourceInputs["instanceTypesFilters"] = state ? state.instanceTypesFilters : undefined;
            resourceInputs["labels"] = state ? state.labels : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["oceanId"] = state ? state.oceanId : undefined;
            resourceInputs["preferredSpotTypes"] = state ? state.preferredSpotTypes : undefined;
            resourceInputs["resourceLimits"] = state ? state.resourceLimits : undefined;
            resourceInputs["restrictScaleDown"] = state ? state.restrictScaleDown : undefined;
            resourceInputs["rootVolumeSize"] = state ? state.rootVolumeSize : undefined;
            resourceInputs["schedulingShutdownHours"] = state ? state.schedulingShutdownHours : undefined;
            resourceInputs["schedulingTasks"] = state ? state.schedulingTasks : undefined;
            resourceInputs["securityGroups"] = state ? state.securityGroups : undefined;
            resourceInputs["strategies"] = state ? state.strategies : undefined;
            resourceInputs["subnetIds"] = state ? state.subnetIds : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["taints"] = state ? state.taints : undefined;
            resourceInputs["updatePolicy"] = state ? state.updatePolicy : undefined;
            resourceInputs["userData"] = state ? state.userData : undefined;
        } else {
            const args = argsOrState as OceanLaunchSpecArgs | undefined;
            if ((!args || args.oceanId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'oceanId'");
            }
            resourceInputs["associatePublicIpAddress"] = args ? args.associatePublicIpAddress : undefined;
            resourceInputs["autoscaleDowns"] = args ? args.autoscaleDowns : undefined;
            resourceInputs["autoscaleHeadrooms"] = args ? args.autoscaleHeadrooms : undefined;
            resourceInputs["autoscaleHeadroomsAutomatics"] = args ? args.autoscaleHeadroomsAutomatics : undefined;
            resourceInputs["blockDeviceMappings"] = args ? args.blockDeviceMappings : undefined;
            resourceInputs["createOptions"] = args ? args.createOptions : undefined;
            resourceInputs["deleteOptions"] = args ? args.deleteOptions : undefined;
            resourceInputs["elasticIpPools"] = args ? args.elasticIpPools : undefined;
            resourceInputs["iamInstanceProfile"] = args ? args.iamInstanceProfile : undefined;
            resourceInputs["imageId"] = args ? args.imageId : undefined;
            resourceInputs["images"] = args ? args.images : undefined;
            resourceInputs["instanceMetadataOptions"] = args ? args.instanceMetadataOptions : undefined;
            resourceInputs["instanceTypes"] = args ? args.instanceTypes : undefined;
            resourceInputs["instanceTypesFilters"] = args ? args.instanceTypesFilters : undefined;
            resourceInputs["labels"] = args ? args.labels : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["oceanId"] = args ? args.oceanId : undefined;
            resourceInputs["preferredSpotTypes"] = args ? args.preferredSpotTypes : undefined;
            resourceInputs["resourceLimits"] = args ? args.resourceLimits : undefined;
            resourceInputs["restrictScaleDown"] = args ? args.restrictScaleDown : undefined;
            resourceInputs["rootVolumeSize"] = args ? args.rootVolumeSize : undefined;
            resourceInputs["schedulingShutdownHours"] = args ? args.schedulingShutdownHours : undefined;
            resourceInputs["schedulingTasks"] = args ? args.schedulingTasks : undefined;
            resourceInputs["securityGroups"] = args ? args.securityGroups : undefined;
            resourceInputs["strategies"] = args ? args.strategies : undefined;
            resourceInputs["subnetIds"] = args ? args.subnetIds : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["taints"] = args ? args.taints : undefined;
            resourceInputs["updatePolicy"] = args ? args.updatePolicy : undefined;
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
     * Configure public IP address allocation.
     */
    associatePublicIpAddress?: pulumi.Input<boolean>;
    /**
     * Auto Scaling scale down operations.
     */
    autoscaleDowns?: pulumi.Input<pulumi.Input<inputs.aws.OceanLaunchSpecAutoscaleDown>[]>;
    /**
     * Set custom headroom per Virtual Node Group. Provide a list of headrooms object.
     */
    autoscaleHeadrooms?: pulumi.Input<pulumi.Input<inputs.aws.OceanLaunchSpecAutoscaleHeadroom>[]>;
    /**
     * Set automatic headroom per launch spec.
     */
    autoscaleHeadroomsAutomatics?: pulumi.Input<pulumi.Input<inputs.aws.OceanLaunchSpecAutoscaleHeadroomsAutomatic>[]>;
    /**
     * Object. Array list of block devices that are exposed to the instance, specify either virtual devices and EBS volumes.
     */
    blockDeviceMappings?: pulumi.Input<pulumi.Input<inputs.aws.OceanLaunchSpecBlockDeviceMapping>[]>;
    createOptions?: pulumi.Input<inputs.aws.OceanLaunchSpecCreateOptions>;
    deleteOptions?: pulumi.Input<inputs.aws.OceanLaunchSpecDeleteOptions>;
    /**
     * Assign an Elastic IP to the instances spun by the Virtual Node Group. Can be null.
     */
    elasticIpPools?: pulumi.Input<pulumi.Input<inputs.aws.OceanLaunchSpecElasticIpPool>[]>;
    /**
     * The ARN or name of an IAM instance profile to associate with launched instances.
     */
    iamInstanceProfile?: pulumi.Input<string>;
    /**
     * Identifier of the image in AWS. Valid values: any string which is not empty or null.
     */
    imageId?: pulumi.Input<string>;
    /**
     * Array of objects (Image object, containing the id of the image used to launch instances.) You can configure VNG with either the imageId or images objects, but not both simultaneously.
     * For each architecture type (amd64, arm64) only one AMI is allowed. Valid values: null, or an array with at least one element.
     */
    images?: pulumi.Input<pulumi.Input<inputs.aws.OceanLaunchSpecImage>[]>;
    /**
     * Ocean instance metadata options object for IMDSv2.
     */
    instanceMetadataOptions?: pulumi.Input<inputs.aws.OceanLaunchSpecInstanceMetadataOptions>;
    /**
     * A list of instance types allowed to be provisioned for pods pending under the specified launch specification. The list overrides the list defined for the cluster.
     */
    instanceTypes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The instance types that match with all filters compose the Virtual Node Group's instanceTypes parameter.
     * The architectures that come from the Virtual Node Group's images will be taken into account when using this parameter. Cannot be configured together with Virtual Node Group's instanceTypes and with the Cluster's whitelist/blacklist/filters.
     */
    instanceTypesFilters?: pulumi.Input<inputs.aws.OceanLaunchSpecInstanceTypesFilters>;
    /**
     * Optionally adds labels to instances launched in the cluster.
     */
    labels?: pulumi.Input<pulumi.Input<inputs.aws.OceanLaunchSpecLabel>[]>;
    /**
     * The name of the Virtual Node Group.
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the Ocean cluster.
     */
    oceanId?: pulumi.Input<string>;
    /**
     * A list of instance types. Takes the preferred types into consideration while maintaining a variety of machine types running for optimized distribution.
     */
    preferredSpotTypes?: pulumi.Input<pulumi.Input<string>[]>;
    resourceLimits?: pulumi.Input<pulumi.Input<inputs.aws.OceanLaunchSpecResourceLimit>[]>;
    /**
     * Boolean. When set to `True`, nodes will be treated as if all pods running have the restrict-scale-down label. Therefore, Ocean will not scale nodes down unless empty.
     */
    restrictScaleDown?: pulumi.Input<boolean>;
    /**
     * Set root volume size (in GB).
     */
    rootVolumeSize?: pulumi.Input<number>;
    /**
     * Used to specify times that the nodes in the virtual node group will be taken down.
     */
    schedulingShutdownHours?: pulumi.Input<inputs.aws.OceanLaunchSpecSchedulingShutdownHours>;
    /**
     * Used to define scheduled tasks such as a manual headroom update.
     */
    schedulingTasks?: pulumi.Input<pulumi.Input<inputs.aws.OceanLaunchSpecSchedulingTask>[]>;
    /**
     * Optionally adds security group IDs.
     */
    securityGroups?: pulumi.Input<pulumi.Input<string>[]>;
    strategies?: pulumi.Input<pulumi.Input<inputs.aws.OceanLaunchSpecStrategy>[]>;
    /**
     * A list of subnet IDs.
     */
    subnetIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A key/value mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<pulumi.Input<inputs.aws.OceanLaunchSpecTag>[]>;
    /**
     * Optionally adds labels to instances launched in the cluster.
     */
    taints?: pulumi.Input<pulumi.Input<inputs.aws.OceanLaunchSpecTaint>[]>;
    updatePolicy?: pulumi.Input<inputs.aws.OceanLaunchSpecUpdatePolicy>;
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
     * Configure public IP address allocation.
     */
    associatePublicIpAddress?: pulumi.Input<boolean>;
    /**
     * Auto Scaling scale down operations.
     */
    autoscaleDowns?: pulumi.Input<pulumi.Input<inputs.aws.OceanLaunchSpecAutoscaleDown>[]>;
    /**
     * Set custom headroom per Virtual Node Group. Provide a list of headrooms object.
     */
    autoscaleHeadrooms?: pulumi.Input<pulumi.Input<inputs.aws.OceanLaunchSpecAutoscaleHeadroom>[]>;
    /**
     * Set automatic headroom per launch spec.
     */
    autoscaleHeadroomsAutomatics?: pulumi.Input<pulumi.Input<inputs.aws.OceanLaunchSpecAutoscaleHeadroomsAutomatic>[]>;
    /**
     * Object. Array list of block devices that are exposed to the instance, specify either virtual devices and EBS volumes.
     */
    blockDeviceMappings?: pulumi.Input<pulumi.Input<inputs.aws.OceanLaunchSpecBlockDeviceMapping>[]>;
    createOptions?: pulumi.Input<inputs.aws.OceanLaunchSpecCreateOptions>;
    deleteOptions?: pulumi.Input<inputs.aws.OceanLaunchSpecDeleteOptions>;
    /**
     * Assign an Elastic IP to the instances spun by the Virtual Node Group. Can be null.
     */
    elasticIpPools?: pulumi.Input<pulumi.Input<inputs.aws.OceanLaunchSpecElasticIpPool>[]>;
    /**
     * The ARN or name of an IAM instance profile to associate with launched instances.
     */
    iamInstanceProfile?: pulumi.Input<string>;
    /**
     * Identifier of the image in AWS. Valid values: any string which is not empty or null.
     */
    imageId?: pulumi.Input<string>;
    /**
     * Array of objects (Image object, containing the id of the image used to launch instances.) You can configure VNG with either the imageId or images objects, but not both simultaneously.
     * For each architecture type (amd64, arm64) only one AMI is allowed. Valid values: null, or an array with at least one element.
     */
    images?: pulumi.Input<pulumi.Input<inputs.aws.OceanLaunchSpecImage>[]>;
    /**
     * Ocean instance metadata options object for IMDSv2.
     */
    instanceMetadataOptions?: pulumi.Input<inputs.aws.OceanLaunchSpecInstanceMetadataOptions>;
    /**
     * A list of instance types allowed to be provisioned for pods pending under the specified launch specification. The list overrides the list defined for the cluster.
     */
    instanceTypes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The instance types that match with all filters compose the Virtual Node Group's instanceTypes parameter.
     * The architectures that come from the Virtual Node Group's images will be taken into account when using this parameter. Cannot be configured together with Virtual Node Group's instanceTypes and with the Cluster's whitelist/blacklist/filters.
     */
    instanceTypesFilters?: pulumi.Input<inputs.aws.OceanLaunchSpecInstanceTypesFilters>;
    /**
     * Optionally adds labels to instances launched in the cluster.
     */
    labels?: pulumi.Input<pulumi.Input<inputs.aws.OceanLaunchSpecLabel>[]>;
    /**
     * The name of the Virtual Node Group.
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the Ocean cluster.
     */
    oceanId: pulumi.Input<string>;
    /**
     * A list of instance types. Takes the preferred types into consideration while maintaining a variety of machine types running for optimized distribution.
     */
    preferredSpotTypes?: pulumi.Input<pulumi.Input<string>[]>;
    resourceLimits?: pulumi.Input<pulumi.Input<inputs.aws.OceanLaunchSpecResourceLimit>[]>;
    /**
     * Boolean. When set to `True`, nodes will be treated as if all pods running have the restrict-scale-down label. Therefore, Ocean will not scale nodes down unless empty.
     */
    restrictScaleDown?: pulumi.Input<boolean>;
    /**
     * Set root volume size (in GB).
     */
    rootVolumeSize?: pulumi.Input<number>;
    /**
     * Used to specify times that the nodes in the virtual node group will be taken down.
     */
    schedulingShutdownHours?: pulumi.Input<inputs.aws.OceanLaunchSpecSchedulingShutdownHours>;
    /**
     * Used to define scheduled tasks such as a manual headroom update.
     */
    schedulingTasks?: pulumi.Input<pulumi.Input<inputs.aws.OceanLaunchSpecSchedulingTask>[]>;
    /**
     * Optionally adds security group IDs.
     */
    securityGroups?: pulumi.Input<pulumi.Input<string>[]>;
    strategies?: pulumi.Input<pulumi.Input<inputs.aws.OceanLaunchSpecStrategy>[]>;
    /**
     * A list of subnet IDs.
     */
    subnetIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A key/value mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<pulumi.Input<inputs.aws.OceanLaunchSpecTag>[]>;
    /**
     * Optionally adds labels to instances launched in the cluster.
     */
    taints?: pulumi.Input<pulumi.Input<inputs.aws.OceanLaunchSpecTaint>[]>;
    updatePolicy?: pulumi.Input<inputs.aws.OceanLaunchSpecUpdatePolicy>;
    /**
     * Base64-encoded MIME user data to make available to the instances.
     */
    userData?: pulumi.Input<string>;
}
