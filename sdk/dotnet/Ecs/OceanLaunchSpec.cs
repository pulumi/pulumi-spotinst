// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Ecs
{
    /// <summary>
    /// Manages a custom Spotinst Ocean ECS Launch Spec resource.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using SpotInst = Pulumi.SpotInst;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new SpotInst.Ecs.OceanLaunchSpec("example", new()
    ///     {
    ///         Attributes = new[]
    ///         {
    ///             new SpotInst.Ecs.Inputs.OceanLaunchSpecAttributeArgs
    ///             {
    ///                 Key = "fakeKey",
    ///                 Value = "fakeValue",
    ///             },
    ///         },
    ///         AutoscaleHeadrooms = new[]
    ///         {
    ///             new SpotInst.Ecs.Inputs.OceanLaunchSpecAutoscaleHeadroomArgs
    ///             {
    ///                 CpuPerUnit = 1000,
    ///                 MemoryPerUnit = 2048,
    ///                 NumOfUnits = 5,
    ///             },
    ///         },
    ///         BlockDeviceMappings = new[]
    ///         {
    ///             new SpotInst.Ecs.Inputs.OceanLaunchSpecBlockDeviceMappingArgs
    ///             {
    ///                 DeviceName = "/dev/xvda1",
    ///                 Ebs = new SpotInst.Ecs.Inputs.OceanLaunchSpecBlockDeviceMappingEbsArgs
    ///                 {
    ///                     DeleteOnTermination = true,
    ///                     DynamicVolumeSize = new SpotInst.Ecs.Inputs.OceanLaunchSpecBlockDeviceMappingEbsDynamicVolumeSizeArgs
    ///                     {
    ///                         BaseSize = 50,
    ///                         Resource = "CPU",
    ///                         SizePerResourceUnit = 20,
    ///                     },
    ///                     Encrypted = false,
    ///                     Throughput = 500,
    ///                     VolumeSize = 50,
    ///                     VolumeType = "gp2",
    ///                 },
    ///             },
    ///         },
    ///         IamInstanceProfile = "iam-profile",
    ///         ImageId = "ami-123456",
    ///         Images = new[]
    ///         {
    ///             new SpotInst.Ecs.Inputs.OceanLaunchSpecImageArgs
    ///             {
    ///                 ImageId = "ami-12345",
    ///             },
    ///             new SpotInst.Ecs.Inputs.OceanLaunchSpecImageArgs
    ///             {
    ///                 ImageId = "ami-67890",
    ///             },
    ///         },
    ///         InstanceMetadataOptions = new SpotInst.Ecs.Inputs.OceanLaunchSpecInstanceMetadataOptionsArgs
    ///         {
    ///             HttpPutResponseHopLimit = 10,
    ///             HttpTokens = "required",
    ///         },
    ///         InstanceTypes = new[]
    ///         {
    ///             "m3.large",
    ///             "m3.xlarge",
    ///             "m3.2xlarge",
    ///             "m4.large",
    ///             "m4.xlarge",
    ///             "m4.4xlarge",
    ///             "m4.2xlarge",
    ///             "m4.10xlarge",
    ///             "m4.16xlarge",
    ///             "m5.large",
    ///             "m5.xlarge",
    ///             "m5.2xlarge",
    ///             "m5.4xlarge",
    ///             "m5.12xlarge",
    ///             "m5.24xlarge",
    ///         },
    ///         OceanId = "o-123456",
    ///         PreferredSpotTypes = new[]
    ///         {
    ///             "m3.large",
    ///             "m3.xlarge",
    ///             "m3.2xlarge",
    ///             "m4.large",
    ///             "m4.xlarge",
    ///         },
    ///         RestrictScaleDown = true,
    ///         SchedulingTasks = new[]
    ///         {
    ///             new SpotInst.Ecs.Inputs.OceanLaunchSpecSchedulingTaskArgs
    ///             {
    ///                 CronExpression = "0 1 * * *",
    ///                 IsEnabled = true,
    ///                 TaskHeadrooms = new[]
    ///                 {
    ///                     new SpotInst.Ecs.Inputs.OceanLaunchSpecSchedulingTaskTaskHeadroomArgs
    ///                     {
    ///                         CpuPerUnit = 1000,
    ///                         MemoryPerUnit = 2048,
    ///                         NumOfUnits = 5,
    ///                     },
    ///                 },
    ///                 TaskType = "manualHeadroomUpdate",
    ///             },
    ///         },
    ///         SecurityGroupIds = new[]
    ///         {
    ///             "awseb-12345",
    ///         },
    ///         Strategies = new[]
    ///         {
    ///             new SpotInst.Ecs.Inputs.OceanLaunchSpecStrategyArgs
    ///             {
    ///                 SpotPercentage = 50,
    ///             },
    ///         },
    ///         SubnetIds = new[]
    ///         {
    ///             "subnet-12345",
    ///         },
    ///         Tags = new[]
    ///         {
    ///             new SpotInst.Ecs.Inputs.OceanLaunchSpecTagArgs
    ///             {
    ///                 Key = "Env",
    ///                 Value = "production",
    ///             },
    ///         },
    ///         UserData = "echo hello world",
    ///     });
    /// 
    /// });
    /// ```
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     return new Dictionary&lt;string, object?&gt;
    ///     {
    ///         ["oceanLaunchspecId"] = spotinst_ocean_ecs_launch_spec.Example.Id,
    ///     };
    /// });
    /// ```
    /// ## Block Devices
    /// 
    /// * `block_device_mappings`- (Optional) Object. Array list of block devices that are exposed to the instance, specify either virtual devices and EBS volumes.
    ///     * `device_name` - (Optional) String. Set device name. (Example: "/dev/xvda1").
    ///     * `ebs`- (Optional) Object. Set Elastic Block Store properties .
    ///         * `delete_on_termination`- (Optional) Boolean. Flag to delete the EBS on instance termination.
    ///         * `encrypted`- (Optional) Boolean. Enables [EBS encryption](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html) on the volume.
    ///         * `iops`- (Required for requests to create io1 volumes; it is not used in requests to create gp2, st1, sc1, or standard volumes) Int. The number of I/O operations per second (IOPS) that the volume supports.
    ///         * `kms_key_id`- (Optional) String. Identifier (key ID, key alias, ID ARN, or alias ARN) for a customer managed CMK under which the EBS volume is encrypted.
    ///         * `snapshot_id`- (Optional) (Optional) String. The Snapshot ID to mount by.
    ///         * `volume_type`- (Optional, Default: `"standard"`) String. The type of the volume (example: "gp2").
    ///         * `volume_size`- (Optional) Int. The size, in GB of the volume.
    ///         * `throughput`- (Optional) The amount of data transferred to or from a storage device per second, you can use this param just in a case that `volume_type` = gp3.
    ///         * `dynamic_volume_size`- (Optional) Object. Set dynamic volume size properties. When using this object, you cannot use volumeSize. You must use one or the other.
    ///             * `base_size`- (Required) Int. Initial size for volume. (Example: 50)
    ///             * `resource`- (Required) String. Resource type to increase volume size dynamically by. (valid values: "CPU")
    ///             * `size_per_resource_unit`- (Required) Int. Additional size (in GB) per resource unit. (Example: baseSize= 50, sizePerResourceUnit=20, and instance with 2 CPU is launched - its total disk size will be: 90GB)
    ///         * `no_device`- (Optional) String. suppresses the specified device included in the block device mapping of the AMI.
    /// </summary>
    [SpotInstResourceType("spotinst:ecs/oceanLaunchSpec:OceanLaunchSpec")]
    public partial class OceanLaunchSpec : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Optionally adds labels to instances launched in an Ocean cluster.
        /// </summary>
        [Output("attributes")]
        public Output<ImmutableArray<Outputs.OceanLaunchSpecAttribute>> Attributes { get; private set; } = null!;

        /// <summary>
        /// Set custom headroom per launch spec. provide list of headrooms object.
        /// </summary>
        [Output("autoscaleHeadrooms")]
        public Output<ImmutableArray<Outputs.OceanLaunchSpecAutoscaleHeadroom>> AutoscaleHeadrooms { get; private set; } = null!;

        [Output("blockDeviceMappings")]
        public Output<ImmutableArray<Outputs.OceanLaunchSpecBlockDeviceMapping>> BlockDeviceMappings { get; private set; } = null!;

        /// <summary>
        /// The ARN or name of an IAM instance profile to associate with launched instances.
        /// </summary>
        [Output("iamInstanceProfile")]
        public Output<string?> IamInstanceProfile { get; private set; } = null!;

        /// <summary>
        /// Identifier of the image in AWS. Valid values: any string which is not empty or null.
        /// </summary>
        [Output("imageId")]
        public Output<string?> ImageId { get; private set; } = null!;

        /// <summary>
        /// You can configure VNG with either the imageId or images objects, but not both simultaneously. For each architecture type (amd64, arm64) only one AMI is allowed. Valid values: null, or an array with at least one element
        /// </summary>
        [Output("images")]
        public Output<ImmutableArray<Outputs.OceanLaunchSpecImage>> Images { get; private set; } = null!;

        /// <summary>
        /// Ocean instance metadata options object for IMDSv2.
        /// </summary>
        [Output("instanceMetadataOptions")]
        public Output<Outputs.OceanLaunchSpecInstanceMetadataOptions?> InstanceMetadataOptions { get; private set; } = null!;

        /// <summary>
        /// A list of instance types allowed to be provisioned for pods pending under the specified launch specification. The list overrides the list defined for the Ocean cluster.
        /// </summary>
        [Output("instanceTypes")]
        public Output<ImmutableArray<string>> InstanceTypes { get; private set; } = null!;

        /// <summary>
        /// The Ocean Launch Specification name.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The Ocean cluster ID .
        /// </summary>
        [Output("oceanId")]
        public Output<string> OceanId { get; private set; } = null!;

        /// <summary>
        /// When Ocean scales up instances, it takes your preferred types into consideration while maintaining a variety of machine types running for optimized distribution.
        /// </summary>
        [Output("preferredSpotTypes")]
        public Output<ImmutableArray<string>> PreferredSpotTypes { get; private set; } = null!;

        /// <summary>
        /// Boolean. When set to “True”, VNG nodes will be treated as if all pods running have the restrict-scale-down label. Therefore, Ocean will not scale nodes down unless empty.
        /// </summary>
        [Output("restrictScaleDown")]
        public Output<bool?> RestrictScaleDown { get; private set; } = null!;

        /// <summary>
        /// Used to define scheduled tasks such as a manual headroom update.
        /// </summary>
        [Output("schedulingTasks")]
        public Output<ImmutableArray<Outputs.OceanLaunchSpecSchedulingTask>> SchedulingTasks { get; private set; } = null!;

        /// <summary>
        /// One or more security group ids.
        /// </summary>
        [Output("securityGroupIds")]
        public Output<ImmutableArray<string>> SecurityGroupIds { get; private set; } = null!;

        /// <summary>
        /// Similar to a strategy for an Ocean cluster, but applying only to a virtual node group.
        /// </summary>
        [Output("strategies")]
        public Output<ImmutableArray<Outputs.OceanLaunchSpecStrategy>> Strategies { get; private set; } = null!;

        /// <summary>
        /// Set subnets in launchSpec. Each element in the array should be a subnet ID.
        /// </summary>
        [Output("subnetIds")]
        public Output<ImmutableArray<string>> SubnetIds { get; private set; } = null!;

        /// <summary>
        /// A key/value mapping of tags to assign to the resource.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<Outputs.OceanLaunchSpecTag>> Tags { get; private set; } = null!;

        /// <summary>
        /// Base64-encoded MIME user data to make available to the instances.
        /// </summary>
        [Output("userData")]
        public Output<string?> UserData { get; private set; } = null!;


        /// <summary>
        /// Create a OceanLaunchSpec resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public OceanLaunchSpec(string name, OceanLaunchSpecArgs args, CustomResourceOptions? options = null)
            : base("spotinst:ecs/oceanLaunchSpec:OceanLaunchSpec", name, args ?? new OceanLaunchSpecArgs(), MakeResourceOptions(options, ""))
        {
        }

        private OceanLaunchSpec(string name, Input<string> id, OceanLaunchSpecState? state = null, CustomResourceOptions? options = null)
            : base("spotinst:ecs/oceanLaunchSpec:OceanLaunchSpec", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing OceanLaunchSpec resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static OceanLaunchSpec Get(string name, Input<string> id, OceanLaunchSpecState? state = null, CustomResourceOptions? options = null)
        {
            return new OceanLaunchSpec(name, id, state, options);
        }
    }

    public sealed class OceanLaunchSpecArgs : global::Pulumi.ResourceArgs
    {
        [Input("attributes")]
        private InputList<Inputs.OceanLaunchSpecAttributeArgs>? _attributes;

        /// <summary>
        /// Optionally adds labels to instances launched in an Ocean cluster.
        /// </summary>
        public InputList<Inputs.OceanLaunchSpecAttributeArgs> Attributes
        {
            get => _attributes ?? (_attributes = new InputList<Inputs.OceanLaunchSpecAttributeArgs>());
            set => _attributes = value;
        }

        [Input("autoscaleHeadrooms")]
        private InputList<Inputs.OceanLaunchSpecAutoscaleHeadroomArgs>? _autoscaleHeadrooms;

        /// <summary>
        /// Set custom headroom per launch spec. provide list of headrooms object.
        /// </summary>
        public InputList<Inputs.OceanLaunchSpecAutoscaleHeadroomArgs> AutoscaleHeadrooms
        {
            get => _autoscaleHeadrooms ?? (_autoscaleHeadrooms = new InputList<Inputs.OceanLaunchSpecAutoscaleHeadroomArgs>());
            set => _autoscaleHeadrooms = value;
        }

        [Input("blockDeviceMappings")]
        private InputList<Inputs.OceanLaunchSpecBlockDeviceMappingArgs>? _blockDeviceMappings;
        public InputList<Inputs.OceanLaunchSpecBlockDeviceMappingArgs> BlockDeviceMappings
        {
            get => _blockDeviceMappings ?? (_blockDeviceMappings = new InputList<Inputs.OceanLaunchSpecBlockDeviceMappingArgs>());
            set => _blockDeviceMappings = value;
        }

        /// <summary>
        /// The ARN or name of an IAM instance profile to associate with launched instances.
        /// </summary>
        [Input("iamInstanceProfile")]
        public Input<string>? IamInstanceProfile { get; set; }

        /// <summary>
        /// Identifier of the image in AWS. Valid values: any string which is not empty or null.
        /// </summary>
        [Input("imageId")]
        public Input<string>? ImageId { get; set; }

        [Input("images")]
        private InputList<Inputs.OceanLaunchSpecImageArgs>? _images;

        /// <summary>
        /// You can configure VNG with either the imageId or images objects, but not both simultaneously. For each architecture type (amd64, arm64) only one AMI is allowed. Valid values: null, or an array with at least one element
        /// </summary>
        public InputList<Inputs.OceanLaunchSpecImageArgs> Images
        {
            get => _images ?? (_images = new InputList<Inputs.OceanLaunchSpecImageArgs>());
            set => _images = value;
        }

        /// <summary>
        /// Ocean instance metadata options object for IMDSv2.
        /// </summary>
        [Input("instanceMetadataOptions")]
        public Input<Inputs.OceanLaunchSpecInstanceMetadataOptionsArgs>? InstanceMetadataOptions { get; set; }

        [Input("instanceTypes")]
        private InputList<string>? _instanceTypes;

        /// <summary>
        /// A list of instance types allowed to be provisioned for pods pending under the specified launch specification. The list overrides the list defined for the Ocean cluster.
        /// </summary>
        public InputList<string> InstanceTypes
        {
            get => _instanceTypes ?? (_instanceTypes = new InputList<string>());
            set => _instanceTypes = value;
        }

        /// <summary>
        /// The Ocean Launch Specification name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The Ocean cluster ID .
        /// </summary>
        [Input("oceanId", required: true)]
        public Input<string> OceanId { get; set; } = null!;

        [Input("preferredSpotTypes")]
        private InputList<string>? _preferredSpotTypes;

        /// <summary>
        /// When Ocean scales up instances, it takes your preferred types into consideration while maintaining a variety of machine types running for optimized distribution.
        /// </summary>
        public InputList<string> PreferredSpotTypes
        {
            get => _preferredSpotTypes ?? (_preferredSpotTypes = new InputList<string>());
            set => _preferredSpotTypes = value;
        }

        /// <summary>
        /// Boolean. When set to “True”, VNG nodes will be treated as if all pods running have the restrict-scale-down label. Therefore, Ocean will not scale nodes down unless empty.
        /// </summary>
        [Input("restrictScaleDown")]
        public Input<bool>? RestrictScaleDown { get; set; }

        [Input("schedulingTasks")]
        private InputList<Inputs.OceanLaunchSpecSchedulingTaskArgs>? _schedulingTasks;

        /// <summary>
        /// Used to define scheduled tasks such as a manual headroom update.
        /// </summary>
        public InputList<Inputs.OceanLaunchSpecSchedulingTaskArgs> SchedulingTasks
        {
            get => _schedulingTasks ?? (_schedulingTasks = new InputList<Inputs.OceanLaunchSpecSchedulingTaskArgs>());
            set => _schedulingTasks = value;
        }

        [Input("securityGroupIds")]
        private InputList<string>? _securityGroupIds;

        /// <summary>
        /// One or more security group ids.
        /// </summary>
        public InputList<string> SecurityGroupIds
        {
            get => _securityGroupIds ?? (_securityGroupIds = new InputList<string>());
            set => _securityGroupIds = value;
        }

        [Input("strategies")]
        private InputList<Inputs.OceanLaunchSpecStrategyArgs>? _strategies;

        /// <summary>
        /// Similar to a strategy for an Ocean cluster, but applying only to a virtual node group.
        /// </summary>
        public InputList<Inputs.OceanLaunchSpecStrategyArgs> Strategies
        {
            get => _strategies ?? (_strategies = new InputList<Inputs.OceanLaunchSpecStrategyArgs>());
            set => _strategies = value;
        }

        [Input("subnetIds")]
        private InputList<string>? _subnetIds;

        /// <summary>
        /// Set subnets in launchSpec. Each element in the array should be a subnet ID.
        /// </summary>
        public InputList<string> SubnetIds
        {
            get => _subnetIds ?? (_subnetIds = new InputList<string>());
            set => _subnetIds = value;
        }

        [Input("tags")]
        private InputList<Inputs.OceanLaunchSpecTagArgs>? _tags;

        /// <summary>
        /// A key/value mapping of tags to assign to the resource.
        /// </summary>
        public InputList<Inputs.OceanLaunchSpecTagArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.OceanLaunchSpecTagArgs>());
            set => _tags = value;
        }

        /// <summary>
        /// Base64-encoded MIME user data to make available to the instances.
        /// </summary>
        [Input("userData")]
        public Input<string>? UserData { get; set; }

        public OceanLaunchSpecArgs()
        {
        }
        public static new OceanLaunchSpecArgs Empty => new OceanLaunchSpecArgs();
    }

    public sealed class OceanLaunchSpecState : global::Pulumi.ResourceArgs
    {
        [Input("attributes")]
        private InputList<Inputs.OceanLaunchSpecAttributeGetArgs>? _attributes;

        /// <summary>
        /// Optionally adds labels to instances launched in an Ocean cluster.
        /// </summary>
        public InputList<Inputs.OceanLaunchSpecAttributeGetArgs> Attributes
        {
            get => _attributes ?? (_attributes = new InputList<Inputs.OceanLaunchSpecAttributeGetArgs>());
            set => _attributes = value;
        }

        [Input("autoscaleHeadrooms")]
        private InputList<Inputs.OceanLaunchSpecAutoscaleHeadroomGetArgs>? _autoscaleHeadrooms;

        /// <summary>
        /// Set custom headroom per launch spec. provide list of headrooms object.
        /// </summary>
        public InputList<Inputs.OceanLaunchSpecAutoscaleHeadroomGetArgs> AutoscaleHeadrooms
        {
            get => _autoscaleHeadrooms ?? (_autoscaleHeadrooms = new InputList<Inputs.OceanLaunchSpecAutoscaleHeadroomGetArgs>());
            set => _autoscaleHeadrooms = value;
        }

        [Input("blockDeviceMappings")]
        private InputList<Inputs.OceanLaunchSpecBlockDeviceMappingGetArgs>? _blockDeviceMappings;
        public InputList<Inputs.OceanLaunchSpecBlockDeviceMappingGetArgs> BlockDeviceMappings
        {
            get => _blockDeviceMappings ?? (_blockDeviceMappings = new InputList<Inputs.OceanLaunchSpecBlockDeviceMappingGetArgs>());
            set => _blockDeviceMappings = value;
        }

        /// <summary>
        /// The ARN or name of an IAM instance profile to associate with launched instances.
        /// </summary>
        [Input("iamInstanceProfile")]
        public Input<string>? IamInstanceProfile { get; set; }

        /// <summary>
        /// Identifier of the image in AWS. Valid values: any string which is not empty or null.
        /// </summary>
        [Input("imageId")]
        public Input<string>? ImageId { get; set; }

        [Input("images")]
        private InputList<Inputs.OceanLaunchSpecImageGetArgs>? _images;

        /// <summary>
        /// You can configure VNG with either the imageId or images objects, but not both simultaneously. For each architecture type (amd64, arm64) only one AMI is allowed. Valid values: null, or an array with at least one element
        /// </summary>
        public InputList<Inputs.OceanLaunchSpecImageGetArgs> Images
        {
            get => _images ?? (_images = new InputList<Inputs.OceanLaunchSpecImageGetArgs>());
            set => _images = value;
        }

        /// <summary>
        /// Ocean instance metadata options object for IMDSv2.
        /// </summary>
        [Input("instanceMetadataOptions")]
        public Input<Inputs.OceanLaunchSpecInstanceMetadataOptionsGetArgs>? InstanceMetadataOptions { get; set; }

        [Input("instanceTypes")]
        private InputList<string>? _instanceTypes;

        /// <summary>
        /// A list of instance types allowed to be provisioned for pods pending under the specified launch specification. The list overrides the list defined for the Ocean cluster.
        /// </summary>
        public InputList<string> InstanceTypes
        {
            get => _instanceTypes ?? (_instanceTypes = new InputList<string>());
            set => _instanceTypes = value;
        }

        /// <summary>
        /// The Ocean Launch Specification name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The Ocean cluster ID .
        /// </summary>
        [Input("oceanId")]
        public Input<string>? OceanId { get; set; }

        [Input("preferredSpotTypes")]
        private InputList<string>? _preferredSpotTypes;

        /// <summary>
        /// When Ocean scales up instances, it takes your preferred types into consideration while maintaining a variety of machine types running for optimized distribution.
        /// </summary>
        public InputList<string> PreferredSpotTypes
        {
            get => _preferredSpotTypes ?? (_preferredSpotTypes = new InputList<string>());
            set => _preferredSpotTypes = value;
        }

        /// <summary>
        /// Boolean. When set to “True”, VNG nodes will be treated as if all pods running have the restrict-scale-down label. Therefore, Ocean will not scale nodes down unless empty.
        /// </summary>
        [Input("restrictScaleDown")]
        public Input<bool>? RestrictScaleDown { get; set; }

        [Input("schedulingTasks")]
        private InputList<Inputs.OceanLaunchSpecSchedulingTaskGetArgs>? _schedulingTasks;

        /// <summary>
        /// Used to define scheduled tasks such as a manual headroom update.
        /// </summary>
        public InputList<Inputs.OceanLaunchSpecSchedulingTaskGetArgs> SchedulingTasks
        {
            get => _schedulingTasks ?? (_schedulingTasks = new InputList<Inputs.OceanLaunchSpecSchedulingTaskGetArgs>());
            set => _schedulingTasks = value;
        }

        [Input("securityGroupIds")]
        private InputList<string>? _securityGroupIds;

        /// <summary>
        /// One or more security group ids.
        /// </summary>
        public InputList<string> SecurityGroupIds
        {
            get => _securityGroupIds ?? (_securityGroupIds = new InputList<string>());
            set => _securityGroupIds = value;
        }

        [Input("strategies")]
        private InputList<Inputs.OceanLaunchSpecStrategyGetArgs>? _strategies;

        /// <summary>
        /// Similar to a strategy for an Ocean cluster, but applying only to a virtual node group.
        /// </summary>
        public InputList<Inputs.OceanLaunchSpecStrategyGetArgs> Strategies
        {
            get => _strategies ?? (_strategies = new InputList<Inputs.OceanLaunchSpecStrategyGetArgs>());
            set => _strategies = value;
        }

        [Input("subnetIds")]
        private InputList<string>? _subnetIds;

        /// <summary>
        /// Set subnets in launchSpec. Each element in the array should be a subnet ID.
        /// </summary>
        public InputList<string> SubnetIds
        {
            get => _subnetIds ?? (_subnetIds = new InputList<string>());
            set => _subnetIds = value;
        }

        [Input("tags")]
        private InputList<Inputs.OceanLaunchSpecTagGetArgs>? _tags;

        /// <summary>
        /// A key/value mapping of tags to assign to the resource.
        /// </summary>
        public InputList<Inputs.OceanLaunchSpecTagGetArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.OceanLaunchSpecTagGetArgs>());
            set => _tags = value;
        }

        /// <summary>
        /// Base64-encoded MIME user data to make available to the instances.
        /// </summary>
        [Input("userData")]
        public Input<string>? UserData { get; set; }

        public OceanLaunchSpecState()
        {
        }
        public static new OceanLaunchSpecState Empty => new OceanLaunchSpecState();
    }
}
