// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class ElastigroupIntegrationNomadGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Nomad ACL Token
        /// </summary>
        [Input("aclToken")]
        public Input<string>? AclToken { get; set; }

        [Input("autoscaleConstraints")]
        private InputList<Inputs.ElastigroupIntegrationNomadAutoscaleConstraintGetArgs>? _autoscaleConstraints;

        /// <summary>
        /// A key/value mapping of tags to assign to the resource.
        /// 
        /// Usage:
        /// 
        /// &lt;!--Start PulumiCodeChooser --&gt;
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public InputList<Inputs.ElastigroupIntegrationNomadAutoscaleConstraintGetArgs> AutoscaleConstraints
        {
            get => _autoscaleConstraints ?? (_autoscaleConstraints = new InputList<Inputs.ElastigroupIntegrationNomadAutoscaleConstraintGetArgs>());
            set => _autoscaleConstraints = value;
        }

        /// <summary>
        /// The amount of time, in seconds, after a scaling activity completes before any further trigger-related scaling activities can start.
        /// </summary>
        [Input("autoscaleCooldown")]
        public Input<int>? AutoscaleCooldown { get; set; }

        /// <summary>
        /// Settings for scale down actions.
        /// </summary>
        [Input("autoscaleDown")]
        public Input<Inputs.ElastigroupIntegrationNomadAutoscaleDownGetArgs>? AutoscaleDown { get; set; }

        /// <summary>
        /// An option to set compute reserve for the cluster.
        /// </summary>
        [Input("autoscaleHeadroom")]
        public Input<Inputs.ElastigroupIntegrationNomadAutoscaleHeadroomGetArgs>? AutoscaleHeadroom { get; set; }

        /// <summary>
        /// Specifies whether the auto scaling feature is enabled.
        /// </summary>
        [Input("autoscaleIsEnabled")]
        public Input<bool>? AutoscaleIsEnabled { get; set; }

        /// <summary>
        /// The URL for the Nomad master host.
        /// </summary>
        [Input("masterHost", required: true)]
        public Input<string> MasterHost { get; set; } = null!;

        /// <summary>
        /// The network port for the master host.
        /// </summary>
        [Input("masterPort", required: true)]
        public Input<int> MasterPort { get; set; } = null!;

        public ElastigroupIntegrationNomadGetArgs()
        {
        }
        public static new ElastigroupIntegrationNomadGetArgs Empty => new ElastigroupIntegrationNomadGetArgs();
    }
}
