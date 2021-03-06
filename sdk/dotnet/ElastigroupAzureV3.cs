// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst
{
    /// <summary>
    /// Provides a Spotinst elastigroup Azure resource.
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
    ///         var testAzureGroup = new SpotInst.ElastigroupAzureV3("testAzureGroup", new SpotInst.ElastigroupAzureV3Args
    ///         {
    ///             DesiredCapacity = 1,
    ///             Images = 
    ///             {
    ///                 new SpotInst.Inputs.ElastigroupAzureV3ImageArgs
    ///                 {
    ///                     Marketplaces = 
    ///                     {
    ///                         new SpotInst.Inputs.ElastigroupAzureV3ImageMarketplaceArgs
    ///                         {
    ///                             Offer = "UbuntuServer",
    ///                             Publisher = "Canonical",
    ///                             Sku = "18.04-LTS",
    ///                             Version = "latest",
    ///                         },
    ///                     },
    ///                 },
    ///             },
    ///             Login = new SpotInst.Inputs.ElastigroupAzureV3LoginArgs
    ///             {
    ///                 SshPublicKey = "33a2s1f3g5a1df5g1ad3f2g1adfg56dfg==",
    ///                 UserName = "admin",
    ///             },
    ///             MaxSize = 1,
    ///             MinSize = 0,
    ///             Network = new SpotInst.Inputs.ElastigroupAzureV3NetworkArgs
    ///             {
    ///                 NetworkInterfaces = 
    ///                 {
    ///                     new SpotInst.Inputs.ElastigroupAzureV3NetworkNetworkInterfaceArgs
    ///                     {
    ///                         AdditionalIpConfigs = 
    ///                         {
    ///                             new SpotInst.Inputs.ElastigroupAzureV3NetworkNetworkInterfaceAdditionalIpConfigArgs
    ///                             {
    ///                                 PrivateIPVersion = "IPv4",
    ///                                 Name = "SecondaryIPConfig",
    ///                             },
    ///                         },
    ///                         ApplicationSecurityGroup = 
    ///                         {
    ///                             
    ///                             {
    ///                                 { "name", "ApplicationSecurityGroupName" },
    ///                                 { "resourceGroupName", "ResourceGroup" },
    ///                             },
    ///                         },
    ///                         AssignPublicIp = false,
    ///                         IsPrimary = true,
    ///                         SubnetName = "default",
    ///                     },
    ///                 },
    ///                 ResourceGroupName = "ResourceGroup",
    ///                 VirtualNetworkName = "VirtualNetworkName",
    ///             },
    ///             OdSizes = 
    ///             {
    ///                 "standard_a1_v1",
    ///                 "standard_a1_v2",
    ///             },
    ///             Os = "Linux",
    ///             Region = "eastus",
    ///             ResourceGroupName = "spotinst-azure",
    ///             SpotSizes = 
    ///             {
    ///                 "standard_a1_v1",
    ///                 "standard_a1_v2",
    ///             },
    ///             Strategy = new SpotInst.Inputs.ElastigroupAzureV3StrategyArgs
    ///             {
    ///                 DrainingTimeout = 300,
    ///                 FallbackToOnDemand = true,
    ///                 OdCount = 1,
    ///                 SpotPercentage = 65,
    ///             },
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// </summary>
    [SpotInstResourceType("spotinst:index/elastigroupAzureV3:ElastigroupAzureV3")]
    public partial class ElastigroupAzureV3 : Pulumi.CustomResource
    {
        /// <summary>
        /// The desired number of instances the group should have at any time.
        /// </summary>
        [Output("desiredCapacity")]
        public Output<int?> DesiredCapacity { get; private set; } = null!;

        /// <summary>
        /// Image of a VM. An image is a template for creating new VMs. Choose from Azure image catalogue (marketplace) or use a custom image.
        /// </summary>
        [Output("images")]
        public Output<ImmutableArray<Outputs.ElastigroupAzureV3Image>> Images { get; private set; } = null!;

        /// <summary>
        /// Describes the login configuration.
        /// </summary>
        [Output("login")]
        public Output<Outputs.ElastigroupAzureV3Login?> Login { get; private set; } = null!;

        /// <summary>
        /// The maximum number of instances the group should have at any time.
        /// </summary>
        [Output("maxSize")]
        public Output<int> MaxSize { get; private set; } = null!;

        /// <summary>
        /// The minimum number of instances the group should have at any time.
        /// </summary>
        [Output("minSize")]
        public Output<int> MinSize { get; private set; } = null!;

        /// <summary>
        /// - The name of the Application Security group.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Defines the Virtual Network and Subnet for your Elastigroup.
        /// </summary>
        [Output("network")]
        public Output<Outputs.ElastigroupAzureV3Network> Network { get; private set; } = null!;

        /// <summary>
        /// Available On-Demand sizes
        /// </summary>
        [Output("odSizes")]
        public Output<ImmutableArray<string>> OdSizes { get; private set; } = null!;

        /// <summary>
        /// Type of the operating system. Valid values: `"Linux"`, `"Windows"`.
        /// </summary>
        [Output("os")]
        public Output<string> Os { get; private set; } = null!;

        /// <summary>
        /// The region your Azure group will be created in.
        /// </summary>
        [Output("region")]
        public Output<string> Region { get; private set; } = null!;

        /// <summary>
        /// - The resource group of the Application Security Group.
        /// }
        /// </summary>
        [Output("resourceGroupName")]
        public Output<string> ResourceGroupName { get; private set; } = null!;

        /// <summary>
        /// Available Low-Priority sizes.
        /// </summary>
        [Output("spotSizes")]
        public Output<ImmutableArray<string>> SpotSizes { get; private set; } = null!;

        /// <summary>
        /// Describes the deployment strategy.
        /// </summary>
        [Output("strategy")]
        public Output<Outputs.ElastigroupAzureV3Strategy> Strategy { get; private set; } = null!;


        /// <summary>
        /// Create a ElastigroupAzureV3 resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ElastigroupAzureV3(string name, ElastigroupAzureV3Args args, CustomResourceOptions? options = null)
            : base("spotinst:index/elastigroupAzureV3:ElastigroupAzureV3", name, args ?? new ElastigroupAzureV3Args(), MakeResourceOptions(options, ""))
        {
        }

        private ElastigroupAzureV3(string name, Input<string> id, ElastigroupAzureV3State? state = null, CustomResourceOptions? options = null)
            : base("spotinst:index/elastigroupAzureV3:ElastigroupAzureV3", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ElastigroupAzureV3 resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ElastigroupAzureV3 Get(string name, Input<string> id, ElastigroupAzureV3State? state = null, CustomResourceOptions? options = null)
        {
            return new ElastigroupAzureV3(name, id, state, options);
        }
    }

    public sealed class ElastigroupAzureV3Args : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The desired number of instances the group should have at any time.
        /// </summary>
        [Input("desiredCapacity")]
        public Input<int>? DesiredCapacity { get; set; }

        [Input("images")]
        private InputList<Inputs.ElastigroupAzureV3ImageArgs>? _images;

        /// <summary>
        /// Image of a VM. An image is a template for creating new VMs. Choose from Azure image catalogue (marketplace) or use a custom image.
        /// </summary>
        public InputList<Inputs.ElastigroupAzureV3ImageArgs> Images
        {
            get => _images ?? (_images = new InputList<Inputs.ElastigroupAzureV3ImageArgs>());
            set => _images = value;
        }

        /// <summary>
        /// Describes the login configuration.
        /// </summary>
        [Input("login")]
        public Input<Inputs.ElastigroupAzureV3LoginArgs>? Login { get; set; }

        /// <summary>
        /// The maximum number of instances the group should have at any time.
        /// </summary>
        [Input("maxSize")]
        public Input<int>? MaxSize { get; set; }

        /// <summary>
        /// The minimum number of instances the group should have at any time.
        /// </summary>
        [Input("minSize")]
        public Input<int>? MinSize { get; set; }

        /// <summary>
        /// - The name of the Application Security group.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Defines the Virtual Network and Subnet for your Elastigroup.
        /// </summary>
        [Input("network", required: true)]
        public Input<Inputs.ElastigroupAzureV3NetworkArgs> Network { get; set; } = null!;

        [Input("odSizes", required: true)]
        private InputList<string>? _odSizes;

        /// <summary>
        /// Available On-Demand sizes
        /// </summary>
        public InputList<string> OdSizes
        {
            get => _odSizes ?? (_odSizes = new InputList<string>());
            set => _odSizes = value;
        }

        /// <summary>
        /// Type of the operating system. Valid values: `"Linux"`, `"Windows"`.
        /// </summary>
        [Input("os", required: true)]
        public Input<string> Os { get; set; } = null!;

        /// <summary>
        /// The region your Azure group will be created in.
        /// </summary>
        [Input("region", required: true)]
        public Input<string> Region { get; set; } = null!;

        /// <summary>
        /// - The resource group of the Application Security Group.
        /// }
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        [Input("spotSizes", required: true)]
        private InputList<string>? _spotSizes;

        /// <summary>
        /// Available Low-Priority sizes.
        /// </summary>
        public InputList<string> SpotSizes
        {
            get => _spotSizes ?? (_spotSizes = new InputList<string>());
            set => _spotSizes = value;
        }

        /// <summary>
        /// Describes the deployment strategy.
        /// </summary>
        [Input("strategy", required: true)]
        public Input<Inputs.ElastigroupAzureV3StrategyArgs> Strategy { get; set; } = null!;

        public ElastigroupAzureV3Args()
        {
        }
    }

    public sealed class ElastigroupAzureV3State : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The desired number of instances the group should have at any time.
        /// </summary>
        [Input("desiredCapacity")]
        public Input<int>? DesiredCapacity { get; set; }

        [Input("images")]
        private InputList<Inputs.ElastigroupAzureV3ImageGetArgs>? _images;

        /// <summary>
        /// Image of a VM. An image is a template for creating new VMs. Choose from Azure image catalogue (marketplace) or use a custom image.
        /// </summary>
        public InputList<Inputs.ElastigroupAzureV3ImageGetArgs> Images
        {
            get => _images ?? (_images = new InputList<Inputs.ElastigroupAzureV3ImageGetArgs>());
            set => _images = value;
        }

        /// <summary>
        /// Describes the login configuration.
        /// </summary>
        [Input("login")]
        public Input<Inputs.ElastigroupAzureV3LoginGetArgs>? Login { get; set; }

        /// <summary>
        /// The maximum number of instances the group should have at any time.
        /// </summary>
        [Input("maxSize")]
        public Input<int>? MaxSize { get; set; }

        /// <summary>
        /// The minimum number of instances the group should have at any time.
        /// </summary>
        [Input("minSize")]
        public Input<int>? MinSize { get; set; }

        /// <summary>
        /// - The name of the Application Security group.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Defines the Virtual Network and Subnet for your Elastigroup.
        /// </summary>
        [Input("network")]
        public Input<Inputs.ElastigroupAzureV3NetworkGetArgs>? Network { get; set; }

        [Input("odSizes")]
        private InputList<string>? _odSizes;

        /// <summary>
        /// Available On-Demand sizes
        /// </summary>
        public InputList<string> OdSizes
        {
            get => _odSizes ?? (_odSizes = new InputList<string>());
            set => _odSizes = value;
        }

        /// <summary>
        /// Type of the operating system. Valid values: `"Linux"`, `"Windows"`.
        /// </summary>
        [Input("os")]
        public Input<string>? Os { get; set; }

        /// <summary>
        /// The region your Azure group will be created in.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// - The resource group of the Application Security Group.
        /// }
        /// </summary>
        [Input("resourceGroupName")]
        public Input<string>? ResourceGroupName { get; set; }

        [Input("spotSizes")]
        private InputList<string>? _spotSizes;

        /// <summary>
        /// Available Low-Priority sizes.
        /// </summary>
        public InputList<string> SpotSizes
        {
            get => _spotSizes ?? (_spotSizes = new InputList<string>());
            set => _spotSizes = value;
        }

        /// <summary>
        /// Describes the deployment strategy.
        /// </summary>
        [Input("strategy")]
        public Input<Inputs.ElastigroupAzureV3StrategyGetArgs>? Strategy { get; set; }

        public ElastigroupAzureV3State()
        {
        }
    }
}
