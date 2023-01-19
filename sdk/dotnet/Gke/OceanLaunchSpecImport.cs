// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Gke
{
    /// <summary>
    /// Manages a custom Spotinst Ocean GKE Launch Spec Import resource.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using SpotInst = Pulumi.SpotInst;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new SpotInst.Gke.OceanLaunchSpecImport("example", new()
    ///     {
    ///         NodePoolName = "default-pool",
    ///         OceanId = "o-123456",
    ///     });
    /// 
    /// });
    /// ```
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     return new Dictionary&lt;string, object?&gt;
    ///     {
    ///         ["oceanLaunchspecId"] = spotinst_ocean_gke_launch_spec_import.Example.Id,
    ///     };
    /// });
    /// ```
    /// </summary>
    [SpotInstResourceType("spotinst:gke/oceanLaunchSpecImport:OceanLaunchSpecImport")]
    public partial class OceanLaunchSpecImport : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The node pool you wish to use in your launchSpec.
        /// </summary>
        [Output("nodePoolName")]
        public Output<string> NodePoolName { get; private set; } = null!;

        /// <summary>
        /// The Ocean cluster ID required for launchSpec create.
        /// </summary>
        [Output("oceanId")]
        public Output<string> OceanId { get; private set; } = null!;


        /// <summary>
        /// Create a OceanLaunchSpecImport resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public OceanLaunchSpecImport(string name, OceanLaunchSpecImportArgs args, CustomResourceOptions? options = null)
            : base("spotinst:gke/oceanLaunchSpecImport:OceanLaunchSpecImport", name, args ?? new OceanLaunchSpecImportArgs(), MakeResourceOptions(options, ""))
        {
        }

        private OceanLaunchSpecImport(string name, Input<string> id, OceanLaunchSpecImportState? state = null, CustomResourceOptions? options = null)
            : base("spotinst:gke/oceanLaunchSpecImport:OceanLaunchSpecImport", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing OceanLaunchSpecImport resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static OceanLaunchSpecImport Get(string name, Input<string> id, OceanLaunchSpecImportState? state = null, CustomResourceOptions? options = null)
        {
            return new OceanLaunchSpecImport(name, id, state, options);
        }
    }

    public sealed class OceanLaunchSpecImportArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The node pool you wish to use in your launchSpec.
        /// </summary>
        [Input("nodePoolName", required: true)]
        public Input<string> NodePoolName { get; set; } = null!;

        /// <summary>
        /// The Ocean cluster ID required for launchSpec create.
        /// </summary>
        [Input("oceanId", required: true)]
        public Input<string> OceanId { get; set; } = null!;

        public OceanLaunchSpecImportArgs()
        {
        }
        public static new OceanLaunchSpecImportArgs Empty => new OceanLaunchSpecImportArgs();
    }

    public sealed class OceanLaunchSpecImportState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The node pool you wish to use in your launchSpec.
        /// </summary>
        [Input("nodePoolName")]
        public Input<string>? NodePoolName { get; set; }

        /// <summary>
        /// The Ocean cluster ID required for launchSpec create.
        /// </summary>
        [Input("oceanId")]
        public Input<string>? OceanId { get; set; }

        public OceanLaunchSpecImportState()
        {
        }
        public static new OceanLaunchSpecImportState Empty => new OceanLaunchSpecImportState();
    }
}
