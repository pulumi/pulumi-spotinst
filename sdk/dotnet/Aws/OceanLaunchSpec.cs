// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws
{
    /// <summary>
    /// Manages a Spotinst Ocean AWS [Virtual Node Group](https://docs.spot.io/ocean/features/launch-specifications) resource.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using SpotInst = Pulumi.SpotInst;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var example = new SpotInst.Aws.OceanLaunchSpec("example", new SpotInst.Aws.OceanLaunchSpecArgs
    ///         {
    ///             AssociatePublicIpAddress = true,
    ///             AutoscaleHeadrooms = 
    ///             {
    ///                 new SpotInst.Aws.Inputs.OceanLaunchSpecAutoscaleHeadroomArgs
    ///                 {
    ///                     CpuPerNit = 1000,
    ///                     GpuPerUnit = 0,
    ///                     MemoryPerUnit = 2048,
    ///                     NumOfUnits = 5,
    ///                 },
    ///             },
    ///             BlockDeviceMappings = 
    ///             {
    ///                 new SpotInst.Aws.Inputs.OceanLaunchSpecBlockDeviceMappingArgs
    ///                 {
    ///                     DeviceName = "/dev/xvda1",
    ///                     Ebs = new SpotInst.Aws.Inputs.OceanLaunchSpecBlockDeviceMappingEbsArgs
    ///                     {
    ///                         DeleteOnTermination = true,
    ///                         DynamicVolumeSize = new SpotInst.Aws.Inputs.OceanLaunchSpecBlockDeviceMappingEbsDynamicVolumeSizeArgs
    ///                         {
    ///                             BaseSize = 50,
    ///                             Resource = "CPU",
    ///                             SizePerResourceUnit = 20,
    ///                         },
    ///                         Encrypted = false,
    ///                         Throughput = 500,
    ///                         VolumeSize = 50,
    ///                         VolumeType = "gp2",
    ///                     },
    ///                 },
    ///             },
    ///             CreateOptions = new SpotInst.Aws.Inputs.OceanLaunchSpecCreateOptionsArgs
    ///             {
    ///                 InitialNodes = 1,
    ///             },
    ///             ElasticIpPools = 
    ///             {
    ///                 new SpotInst.Aws.Inputs.OceanLaunchSpecElasticIpPoolArgs
    ///                 {
    ///                     TagSelector = new SpotInst.Aws.Inputs.OceanLaunchSpecElasticIpPoolTagSelectorArgs
    ///                     {
    ///                         TagKey = "key",
    ///                         TagValue = "value",
    ///                     },
    ///                 },
    ///             },
    ///             IamInstanceProfile = "iam-profile",
    ///             ImageId = "ami-123456",
    ///             InstanceTypes = 
    ///             {
    ///                 "m4.large",
    ///                 "m4.xlarge",
    ///                 "m4.2xlarge",
    ///                 "m4.4xlarge",
    ///             },
    ///             Labels = 
    ///             {
    ///                 new SpotInst.Aws.Inputs.OceanLaunchSpecLabelArgs
    ///                 {
    ///                     Key = "key1",
    ///                     Value = "value1",
    ///                 },
    ///             },
    ///             OceanId = "o-123456",
    ///             ResourceLimits = 
    ///             {
    ///                 new SpotInst.Aws.Inputs.OceanLaunchSpecResourceLimitArgs
    ///                 {
    ///                     MaxInstanceCount = 4,
    ///                 },
    ///             },
    ///             RestrictScaleDown = true,
    ///             RootVolumeSize = 30,
    ///             SecurityGroups = 
    ///             {
    ///                 "sg-987654321",
    ///             },
    ///             Strategies = 
    ///             {
    ///                 new SpotInst.Aws.Inputs.OceanLaunchSpecStrategyArgs
    ///                 {
    ///                     SpotPercentage = 70,
    ///                 },
    ///             },
    ///             SubnetIds = 
    ///             {
    ///                 "subnet-1234",
    ///             },
    ///             Tags = 
    ///             {
    ///                 new SpotInst.Aws.Inputs.OceanLaunchSpecTagArgs
    ///                 {
    ///                     Key = "Env",
    ///                     Value = "production",
    ///                 },
    ///             },
    ///             Taints = 
    ///             {
    ///                 new SpotInst.Aws.Inputs.OceanLaunchSpecTaintArgs
    ///                 {
    ///                     Effect = "NoExecute",
    ///                     Key = "key1",
    ///                     Value = "value1",
    ///                 },
    ///             },
    ///             UserData = "echo Hello, world!",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// ```csharp
    /// using Pulumi;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         this.OceanLaunchspecId = spotinst_ocean_aws_launch_spec.Example.Id;
    ///     }
    /// 
    ///     [Output("oceanLaunchspecId")]
    ///     public Output&lt;string&gt; OceanLaunchspecId { get; set; }
    /// }
    /// ```
    /// </summary>
    [SpotInstResourceType("spotinst:aws/oceanLaunchSpec:OceanLaunchSpec")]
    public partial class OceanLaunchSpec : Pulumi.CustomResource
    {
        /// <summary>
        /// Configure public IP address allocation.
        /// </summary>
        [Output("associatePublicIpAddress")]
        public Output<bool?> AssociatePublicIpAddress { get; private set; } = null!;

        /// <summary>
        /// Set custom headroom per Virtual Node Group. Provide a list of headrooms object.
        /// </summary>
        [Output("autoscaleHeadrooms")]
        public Output<ImmutableArray<Outputs.OceanLaunchSpecAutoscaleHeadroom>> AutoscaleHeadrooms { get; private set; } = null!;

        /// <summary>
        /// Object. Array list of block devices that are exposed to the instance, specify either virtual devices and EBS volumes.
        /// </summary>
        [Output("blockDeviceMappings")]
        public Output<ImmutableArray<Outputs.OceanLaunchSpecBlockDeviceMapping>> BlockDeviceMappings { get; private set; } = null!;

        [Output("createOptions")]
        public Output<Outputs.OceanLaunchSpecCreateOptions?> CreateOptions { get; private set; } = null!;

        /// <summary>
        /// Assign an Elastic IP to the instances spun by the Virtual Node Group. Can be null.
        /// </summary>
        [Output("elasticIpPools")]
        public Output<ImmutableArray<Outputs.OceanLaunchSpecElasticIpPool>> ElasticIpPools { get; private set; } = null!;

        /// <summary>
        /// The ARN or name of an IAM instance profile to associate with launched instances.
        /// </summary>
        [Output("iamInstanceProfile")]
        public Output<string?> IamInstanceProfile { get; private set; } = null!;

        /// <summary>
        /// ID of the image used to launch the instances.
        /// </summary>
        [Output("imageId")]
        public Output<string?> ImageId { get; private set; } = null!;

        /// <summary>
        /// A list of instance types allowed to be provisioned for pods pending under the specified launch specification. The list overrides the list defined for the cluster.
        /// </summary>
        [Output("instanceTypes")]
        public Output<ImmutableArray<string>> InstanceTypes { get; private set; } = null!;

        /// <summary>
        /// Optionally adds labels to instances launched in the cluster.
        /// </summary>
        [Output("labels")]
        public Output<ImmutableArray<Outputs.OceanLaunchSpecLabel>> Labels { get; private set; } = null!;

        /// <summary>
        /// The name of the Virtual Node Group.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The ID of the Ocean cluster.
        /// </summary>
        [Output("oceanId")]
        public Output<string> OceanId { get; private set; } = null!;

        [Output("resourceLimits")]
        public Output<ImmutableArray<Outputs.OceanLaunchSpecResourceLimit>> ResourceLimits { get; private set; } = null!;

        /// <summary>
        /// Boolean. When set to `True`, nodes will be treated as if all pods running have the restrict-scale-down label. Therefore, Ocean will not scale nodes down unless empty.
        /// </summary>
        [Output("restrictScaleDown")]
        public Output<bool?> RestrictScaleDown { get; private set; } = null!;

        /// <summary>
        /// Set root volume size (in GB).
        /// </summary>
        [Output("rootVolumeSize")]
        public Output<int?> RootVolumeSize { get; private set; } = null!;

        /// <summary>
        /// Optionally adds security group IDs.
        /// </summary>
        [Output("securityGroups")]
        public Output<ImmutableArray<string>> SecurityGroups { get; private set; } = null!;

        [Output("strategies")]
        public Output<ImmutableArray<Outputs.OceanLaunchSpecStrategy>> Strategies { get; private set; } = null!;

        /// <summary>
        /// A list of subnet IDs.
        /// </summary>
        [Output("subnetIds")]
        public Output<ImmutableArray<string>> SubnetIds { get; private set; } = null!;

        /// <summary>
        /// A key/value mapping of tags to assign to the resource.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<Outputs.OceanLaunchSpecTag>> Tags { get; private set; } = null!;

        /// <summary>
        /// Optionally adds labels to instances launched in the cluster.
        /// </summary>
        [Output("taints")]
        public Output<ImmutableArray<Outputs.OceanLaunchSpecTaint>> Taints { get; private set; } = null!;

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
            : base("spotinst:aws/oceanLaunchSpec:OceanLaunchSpec", name, args ?? new OceanLaunchSpecArgs(), MakeResourceOptions(options, ""))
        {
        }

        private OceanLaunchSpec(string name, Input<string> id, OceanLaunchSpecState? state = null, CustomResourceOptions? options = null)
            : base("spotinst:aws/oceanLaunchSpec:OceanLaunchSpec", name, state, MakeResourceOptions(options, id))
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

    public sealed class OceanLaunchSpecArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Configure public IP address allocation.
        /// </summary>
        [Input("associatePublicIpAddress")]
        public Input<bool>? AssociatePublicIpAddress { get; set; }

        [Input("autoscaleHeadrooms")]
        private InputList<Inputs.OceanLaunchSpecAutoscaleHeadroomArgs>? _autoscaleHeadrooms;

        /// <summary>
        /// Set custom headroom per Virtual Node Group. Provide a list of headrooms object.
        /// </summary>
        public InputList<Inputs.OceanLaunchSpecAutoscaleHeadroomArgs> AutoscaleHeadrooms
        {
            get => _autoscaleHeadrooms ?? (_autoscaleHeadrooms = new InputList<Inputs.OceanLaunchSpecAutoscaleHeadroomArgs>());
            set => _autoscaleHeadrooms = value;
        }

        [Input("blockDeviceMappings")]
        private InputList<Inputs.OceanLaunchSpecBlockDeviceMappingArgs>? _blockDeviceMappings;

        /// <summary>
        /// Object. Array list of block devices that are exposed to the instance, specify either virtual devices and EBS volumes.
        /// </summary>
        public InputList<Inputs.OceanLaunchSpecBlockDeviceMappingArgs> BlockDeviceMappings
        {
            get => _blockDeviceMappings ?? (_blockDeviceMappings = new InputList<Inputs.OceanLaunchSpecBlockDeviceMappingArgs>());
            set => _blockDeviceMappings = value;
        }

        [Input("createOptions")]
        public Input<Inputs.OceanLaunchSpecCreateOptionsArgs>? CreateOptions { get; set; }

        [Input("elasticIpPools")]
        private InputList<Inputs.OceanLaunchSpecElasticIpPoolArgs>? _elasticIpPools;

        /// <summary>
        /// Assign an Elastic IP to the instances spun by the Virtual Node Group. Can be null.
        /// </summary>
        public InputList<Inputs.OceanLaunchSpecElasticIpPoolArgs> ElasticIpPools
        {
            get => _elasticIpPools ?? (_elasticIpPools = new InputList<Inputs.OceanLaunchSpecElasticIpPoolArgs>());
            set => _elasticIpPools = value;
        }

        /// <summary>
        /// The ARN or name of an IAM instance profile to associate with launched instances.
        /// </summary>
        [Input("iamInstanceProfile")]
        public Input<string>? IamInstanceProfile { get; set; }

        /// <summary>
        /// ID of the image used to launch the instances.
        /// </summary>
        [Input("imageId")]
        public Input<string>? ImageId { get; set; }

        [Input("instanceTypes")]
        private InputList<string>? _instanceTypes;

        /// <summary>
        /// A list of instance types allowed to be provisioned for pods pending under the specified launch specification. The list overrides the list defined for the cluster.
        /// </summary>
        public InputList<string> InstanceTypes
        {
            get => _instanceTypes ?? (_instanceTypes = new InputList<string>());
            set => _instanceTypes = value;
        }

        [Input("labels")]
        private InputList<Inputs.OceanLaunchSpecLabelArgs>? _labels;

        /// <summary>
        /// Optionally adds labels to instances launched in the cluster.
        /// </summary>
        public InputList<Inputs.OceanLaunchSpecLabelArgs> Labels
        {
            get => _labels ?? (_labels = new InputList<Inputs.OceanLaunchSpecLabelArgs>());
            set => _labels = value;
        }

        /// <summary>
        /// The name of the Virtual Node Group.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the Ocean cluster.
        /// </summary>
        [Input("oceanId", required: true)]
        public Input<string> OceanId { get; set; } = null!;

        [Input("resourceLimits")]
        private InputList<Inputs.OceanLaunchSpecResourceLimitArgs>? _resourceLimits;
        public InputList<Inputs.OceanLaunchSpecResourceLimitArgs> ResourceLimits
        {
            get => _resourceLimits ?? (_resourceLimits = new InputList<Inputs.OceanLaunchSpecResourceLimitArgs>());
            set => _resourceLimits = value;
        }

        /// <summary>
        /// Boolean. When set to `True`, nodes will be treated as if all pods running have the restrict-scale-down label. Therefore, Ocean will not scale nodes down unless empty.
        /// </summary>
        [Input("restrictScaleDown")]
        public Input<bool>? RestrictScaleDown { get; set; }

        /// <summary>
        /// Set root volume size (in GB).
        /// </summary>
        [Input("rootVolumeSize")]
        public Input<int>? RootVolumeSize { get; set; }

        [Input("securityGroups")]
        private InputList<string>? _securityGroups;

        /// <summary>
        /// Optionally adds security group IDs.
        /// </summary>
        public InputList<string> SecurityGroups
        {
            get => _securityGroups ?? (_securityGroups = new InputList<string>());
            set => _securityGroups = value;
        }

        [Input("strategies")]
        private InputList<Inputs.OceanLaunchSpecStrategyArgs>? _strategies;
        public InputList<Inputs.OceanLaunchSpecStrategyArgs> Strategies
        {
            get => _strategies ?? (_strategies = new InputList<Inputs.OceanLaunchSpecStrategyArgs>());
            set => _strategies = value;
        }

        [Input("subnetIds")]
        private InputList<string>? _subnetIds;

        /// <summary>
        /// A list of subnet IDs.
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

        [Input("taints")]
        private InputList<Inputs.OceanLaunchSpecTaintArgs>? _taints;

        /// <summary>
        /// Optionally adds labels to instances launched in the cluster.
        /// </summary>
        public InputList<Inputs.OceanLaunchSpecTaintArgs> Taints
        {
            get => _taints ?? (_taints = new InputList<Inputs.OceanLaunchSpecTaintArgs>());
            set => _taints = value;
        }

        /// <summary>
        /// Base64-encoded MIME user data to make available to the instances.
        /// </summary>
        [Input("userData")]
        public Input<string>? UserData { get; set; }

        public OceanLaunchSpecArgs()
        {
        }
    }

    public sealed class OceanLaunchSpecState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Configure public IP address allocation.
        /// </summary>
        [Input("associatePublicIpAddress")]
        public Input<bool>? AssociatePublicIpAddress { get; set; }

        [Input("autoscaleHeadrooms")]
        private InputList<Inputs.OceanLaunchSpecAutoscaleHeadroomGetArgs>? _autoscaleHeadrooms;

        /// <summary>
        /// Set custom headroom per Virtual Node Group. Provide a list of headrooms object.
        /// </summary>
        public InputList<Inputs.OceanLaunchSpecAutoscaleHeadroomGetArgs> AutoscaleHeadrooms
        {
            get => _autoscaleHeadrooms ?? (_autoscaleHeadrooms = new InputList<Inputs.OceanLaunchSpecAutoscaleHeadroomGetArgs>());
            set => _autoscaleHeadrooms = value;
        }

        [Input("blockDeviceMappings")]
        private InputList<Inputs.OceanLaunchSpecBlockDeviceMappingGetArgs>? _blockDeviceMappings;

        /// <summary>
        /// Object. Array list of block devices that are exposed to the instance, specify either virtual devices and EBS volumes.
        /// </summary>
        public InputList<Inputs.OceanLaunchSpecBlockDeviceMappingGetArgs> BlockDeviceMappings
        {
            get => _blockDeviceMappings ?? (_blockDeviceMappings = new InputList<Inputs.OceanLaunchSpecBlockDeviceMappingGetArgs>());
            set => _blockDeviceMappings = value;
        }

        [Input("createOptions")]
        public Input<Inputs.OceanLaunchSpecCreateOptionsGetArgs>? CreateOptions { get; set; }

        [Input("elasticIpPools")]
        private InputList<Inputs.OceanLaunchSpecElasticIpPoolGetArgs>? _elasticIpPools;

        /// <summary>
        /// Assign an Elastic IP to the instances spun by the Virtual Node Group. Can be null.
        /// </summary>
        public InputList<Inputs.OceanLaunchSpecElasticIpPoolGetArgs> ElasticIpPools
        {
            get => _elasticIpPools ?? (_elasticIpPools = new InputList<Inputs.OceanLaunchSpecElasticIpPoolGetArgs>());
            set => _elasticIpPools = value;
        }

        /// <summary>
        /// The ARN or name of an IAM instance profile to associate with launched instances.
        /// </summary>
        [Input("iamInstanceProfile")]
        public Input<string>? IamInstanceProfile { get; set; }

        /// <summary>
        /// ID of the image used to launch the instances.
        /// </summary>
        [Input("imageId")]
        public Input<string>? ImageId { get; set; }

        [Input("instanceTypes")]
        private InputList<string>? _instanceTypes;

        /// <summary>
        /// A list of instance types allowed to be provisioned for pods pending under the specified launch specification. The list overrides the list defined for the cluster.
        /// </summary>
        public InputList<string> InstanceTypes
        {
            get => _instanceTypes ?? (_instanceTypes = new InputList<string>());
            set => _instanceTypes = value;
        }

        [Input("labels")]
        private InputList<Inputs.OceanLaunchSpecLabelGetArgs>? _labels;

        /// <summary>
        /// Optionally adds labels to instances launched in the cluster.
        /// </summary>
        public InputList<Inputs.OceanLaunchSpecLabelGetArgs> Labels
        {
            get => _labels ?? (_labels = new InputList<Inputs.OceanLaunchSpecLabelGetArgs>());
            set => _labels = value;
        }

        /// <summary>
        /// The name of the Virtual Node Group.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the Ocean cluster.
        /// </summary>
        [Input("oceanId")]
        public Input<string>? OceanId { get; set; }

        [Input("resourceLimits")]
        private InputList<Inputs.OceanLaunchSpecResourceLimitGetArgs>? _resourceLimits;
        public InputList<Inputs.OceanLaunchSpecResourceLimitGetArgs> ResourceLimits
        {
            get => _resourceLimits ?? (_resourceLimits = new InputList<Inputs.OceanLaunchSpecResourceLimitGetArgs>());
            set => _resourceLimits = value;
        }

        /// <summary>
        /// Boolean. When set to `True`, nodes will be treated as if all pods running have the restrict-scale-down label. Therefore, Ocean will not scale nodes down unless empty.
        /// </summary>
        [Input("restrictScaleDown")]
        public Input<bool>? RestrictScaleDown { get; set; }

        /// <summary>
        /// Set root volume size (in GB).
        /// </summary>
        [Input("rootVolumeSize")]
        public Input<int>? RootVolumeSize { get; set; }

        [Input("securityGroups")]
        private InputList<string>? _securityGroups;

        /// <summary>
        /// Optionally adds security group IDs.
        /// </summary>
        public InputList<string> SecurityGroups
        {
            get => _securityGroups ?? (_securityGroups = new InputList<string>());
            set => _securityGroups = value;
        }

        [Input("strategies")]
        private InputList<Inputs.OceanLaunchSpecStrategyGetArgs>? _strategies;
        public InputList<Inputs.OceanLaunchSpecStrategyGetArgs> Strategies
        {
            get => _strategies ?? (_strategies = new InputList<Inputs.OceanLaunchSpecStrategyGetArgs>());
            set => _strategies = value;
        }

        [Input("subnetIds")]
        private InputList<string>? _subnetIds;

        /// <summary>
        /// A list of subnet IDs.
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

        [Input("taints")]
        private InputList<Inputs.OceanLaunchSpecTaintGetArgs>? _taints;

        /// <summary>
        /// Optionally adds labels to instances launched in the cluster.
        /// </summary>
        public InputList<Inputs.OceanLaunchSpecTaintGetArgs> Taints
        {
            get => _taints ?? (_taints = new InputList<Inputs.OceanLaunchSpecTaintGetArgs>());
            set => _taints = value;
        }

        /// <summary>
        /// Base64-encoded MIME user data to make available to the instances.
        /// </summary>
        [Input("userData")]
        public Input<string>? UserData { get; set; }

        public OceanLaunchSpecState()
        {
        }
    }
}
