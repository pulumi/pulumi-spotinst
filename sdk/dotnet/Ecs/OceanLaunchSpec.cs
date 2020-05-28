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
    /// Provides a custom Spotinst Ocean ECS Launch Spec resource.
    /// 
    /// ## Example Usage
    /// 
    /// 
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using SpotInst = Pulumi.SpotInst;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var example = new SpotInst.Ecs.OceanLaunchSpec("example", new SpotInst.Ecs.OceanLaunchSpecArgs
    ///         {
    ///             Attributes = 
    ///             {
    ///                 new SpotInst.Ecs.Inputs.OceanLaunchSpecAttributeArgs
    ///                 {
    ///                     Key = "fakeKey",
    ///                     Value = "fakeValue",
    ///                 },
    ///             },
    ///             AutoscaleHeadrooms = 
    ///             {
    ///                 new SpotInst.Ecs.Inputs.OceanLaunchSpecAutoscaleHeadroomArgs
    ///                 {
    ///                     CpuPerUnit = 1000,
    ///                     MemoryPerUnit = 2048,
    ///                     NumOfUnits = 5,
    ///                 },
    ///             },
    ///             IamInstanceProfile = "iam-profile",
    ///             ImageId = "ami-123456",
    ///             OceanId = "o-123456",
    ///             SecurityGroupIds = 
    ///             {
    ///                 "awseb-12345",
    ///             },
    ///             Tags = 
    ///             {
    ///                 new SpotInst.Ecs.Inputs.OceanLaunchSpecTagArgs
    ///                 {
    ///                     Key = "Env",
    ///                     Value = "production",
    ///                 },
    ///             },
    ///             UserData = "echo hello world",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// </summary>
    public partial class OceanLaunchSpec : Pulumi.CustomResource
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
        /// One or more security group ids.
        /// </summary>
        [Output("securityGroupIds")]
        public Output<ImmutableArray<string>> SecurityGroupIds { get; private set; } = null!;

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

    public sealed class OceanLaunchSpecArgs : Pulumi.ResourceArgs
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
    }

    public sealed class OceanLaunchSpecState : Pulumi.ResourceArgs
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
    }
}
