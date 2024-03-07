// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Spark
{
    /// <summary>
    /// Manage a dedicated Spotinst Ocean Spark Virtual Node Group resource
    /// 
    /// ## Prerequisites
    /// 
    /// An existing Ocean cluster and Ocean VNG is required by this resource
    /// 
    /// ## Example Usage
    /// 
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using SpotInst = Pulumi.SpotInst;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new SpotInst.Spark.OceanVirtualNodeGroup("example", new()
    ///     {
    ///         OceanSparkClusterId = "cluster_id",
    ///         VirtualNodeGroupId = "vng_id",
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// </summary>
    [SpotInstResourceType("spotinst:spark/oceanVirtualNodeGroup:OceanVirtualNodeGroup")]
    public partial class OceanVirtualNodeGroup : global::Pulumi.CustomResource
    {
        [Output("oceanSparkClusterId")]
        public Output<string> OceanSparkClusterId { get; private set; } = null!;

        [Output("virtualNodeGroupId")]
        public Output<string> VirtualNodeGroupId { get; private set; } = null!;


        /// <summary>
        /// Create a OceanVirtualNodeGroup resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public OceanVirtualNodeGroup(string name, OceanVirtualNodeGroupArgs args, CustomResourceOptions? options = null)
            : base("spotinst:spark/oceanVirtualNodeGroup:OceanVirtualNodeGroup", name, args ?? new OceanVirtualNodeGroupArgs(), MakeResourceOptions(options, ""))
        {
        }

        private OceanVirtualNodeGroup(string name, Input<string> id, OceanVirtualNodeGroupState? state = null, CustomResourceOptions? options = null)
            : base("spotinst:spark/oceanVirtualNodeGroup:OceanVirtualNodeGroup", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing OceanVirtualNodeGroup resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static OceanVirtualNodeGroup Get(string name, Input<string> id, OceanVirtualNodeGroupState? state = null, CustomResourceOptions? options = null)
        {
            return new OceanVirtualNodeGroup(name, id, state, options);
        }
    }

    public sealed class OceanVirtualNodeGroupArgs : global::Pulumi.ResourceArgs
    {
        [Input("oceanSparkClusterId", required: true)]
        public Input<string> OceanSparkClusterId { get; set; } = null!;

        [Input("virtualNodeGroupId", required: true)]
        public Input<string> VirtualNodeGroupId { get; set; } = null!;

        public OceanVirtualNodeGroupArgs()
        {
        }
        public static new OceanVirtualNodeGroupArgs Empty => new OceanVirtualNodeGroupArgs();
    }

    public sealed class OceanVirtualNodeGroupState : global::Pulumi.ResourceArgs
    {
        [Input("oceanSparkClusterId")]
        public Input<string>? OceanSparkClusterId { get; set; }

        [Input("virtualNodeGroupId")]
        public Input<string>? VirtualNodeGroupId { get; set; }

        public OceanVirtualNodeGroupState()
        {
        }
        public static new OceanVirtualNodeGroupState Empty => new OceanVirtualNodeGroupState();
    }
}
