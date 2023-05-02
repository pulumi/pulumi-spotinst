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
    /// Provides a Spotinst Ocean AWS Extended Resource Definition resource.
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
    ///     var example = new SpotInst.Aws.OceanExtendedResourceDefinition("example", new()
    ///     {
    ///         Name = "terraform_extended_resource_definition",
    ///         ResourceMapping = 
    ///         {
    ///             { "c3.large", "2Ki" },
    ///             { "c3.xlarge", "4Ki" },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [SpotInstResourceType("spotinst:aws/oceanExtendedResourceDefinition:OceanExtendedResourceDefinition")]
    public partial class OceanExtendedResourceDefinition : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The extended resource name as should be requested by your pods and registered to the nodes. Cannot be updated.
        /// The name should be a valid Kubernetes extended resource name.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// A mapping between AWS instanceType or * as default and its value for the given extended resource.
        /// </summary>
        [Output("resourceMapping")]
        public Output<ImmutableDictionary<string, object>> ResourceMapping { get; private set; } = null!;


        /// <summary>
        /// Create a OceanExtendedResourceDefinition resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public OceanExtendedResourceDefinition(string name, OceanExtendedResourceDefinitionArgs args, CustomResourceOptions? options = null)
            : base("spotinst:aws/oceanExtendedResourceDefinition:OceanExtendedResourceDefinition", name, args ?? new OceanExtendedResourceDefinitionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private OceanExtendedResourceDefinition(string name, Input<string> id, OceanExtendedResourceDefinitionState? state = null, CustomResourceOptions? options = null)
            : base("spotinst:aws/oceanExtendedResourceDefinition:OceanExtendedResourceDefinition", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing OceanExtendedResourceDefinition resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static OceanExtendedResourceDefinition Get(string name, Input<string> id, OceanExtendedResourceDefinitionState? state = null, CustomResourceOptions? options = null)
        {
            return new OceanExtendedResourceDefinition(name, id, state, options);
        }
    }

    public sealed class OceanExtendedResourceDefinitionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The extended resource name as should be requested by your pods and registered to the nodes. Cannot be updated.
        /// The name should be a valid Kubernetes extended resource name.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("resourceMapping", required: true)]
        private InputMap<object>? _resourceMapping;

        /// <summary>
        /// A mapping between AWS instanceType or * as default and its value for the given extended resource.
        /// </summary>
        public InputMap<object> ResourceMapping
        {
            get => _resourceMapping ?? (_resourceMapping = new InputMap<object>());
            set => _resourceMapping = value;
        }

        public OceanExtendedResourceDefinitionArgs()
        {
        }
        public static new OceanExtendedResourceDefinitionArgs Empty => new OceanExtendedResourceDefinitionArgs();
    }

    public sealed class OceanExtendedResourceDefinitionState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The extended resource name as should be requested by your pods and registered to the nodes. Cannot be updated.
        /// The name should be a valid Kubernetes extended resource name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("resourceMapping")]
        private InputMap<object>? _resourceMapping;

        /// <summary>
        /// A mapping between AWS instanceType or * as default and its value for the given extended resource.
        /// </summary>
        public InputMap<object> ResourceMapping
        {
            get => _resourceMapping ?? (_resourceMapping = new InputMap<object>());
            set => _resourceMapping = value;
        }

        public OceanExtendedResourceDefinitionState()
        {
        }
        public static new OceanExtendedResourceDefinitionState Empty => new OceanExtendedResourceDefinitionState();
    }
}
