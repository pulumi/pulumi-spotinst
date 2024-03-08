// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Outputs
{

    [OutputType]
    public sealed class ElastigroupIntegrationNomad
    {
        /// <summary>
        /// Nomad ACL Token
        /// </summary>
        public readonly string? AclToken;
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
        public readonly ImmutableArray<Outputs.ElastigroupIntegrationNomadAutoscaleConstraint> AutoscaleConstraints;
        /// <summary>
        /// The amount of time, in seconds, after a scaling activity completes before any further trigger-related scaling activities can start.
        /// </summary>
        public readonly int? AutoscaleCooldown;
        /// <summary>
        /// Settings for scale down actions.
        /// </summary>
        public readonly Outputs.ElastigroupIntegrationNomadAutoscaleDown? AutoscaleDown;
        /// <summary>
        /// An option to set compute reserve for the cluster.
        /// </summary>
        public readonly Outputs.ElastigroupIntegrationNomadAutoscaleHeadroom? AutoscaleHeadroom;
        /// <summary>
        /// Specifies whether the auto scaling feature is enabled.
        /// </summary>
        public readonly bool? AutoscaleIsEnabled;
        /// <summary>
        /// The URL for the Nomad master host.
        /// </summary>
        public readonly string MasterHost;
        /// <summary>
        /// The network port for the master host.
        /// </summary>
        public readonly int MasterPort;

        [OutputConstructor]
        private ElastigroupIntegrationNomad(
            string? aclToken,

            ImmutableArray<Outputs.ElastigroupIntegrationNomadAutoscaleConstraint> autoscaleConstraints,

            int? autoscaleCooldown,

            Outputs.ElastigroupIntegrationNomadAutoscaleDown? autoscaleDown,

            Outputs.ElastigroupIntegrationNomadAutoscaleHeadroom? autoscaleHeadroom,

            bool? autoscaleIsEnabled,

            string masterHost,

            int masterPort)
        {
            AclToken = aclToken;
            AutoscaleConstraints = autoscaleConstraints;
            AutoscaleCooldown = autoscaleCooldown;
            AutoscaleDown = autoscaleDown;
            AutoscaleHeadroom = autoscaleHeadroom;
            AutoscaleIsEnabled = autoscaleIsEnabled;
            MasterHost = masterHost;
            MasterPort = masterPort;
        }
    }
}
