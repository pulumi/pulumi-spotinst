// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Oceancd.Inputs
{

    public sealed class RolloutSpecSpotDeploymentGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Ocean CD cluster identifier for the references `SpotDeployment`.
        /// </summary>
        [Input("spotDeploymentsClusterId")]
        public Input<string>? SpotDeploymentsClusterId { get; set; }

        /// <summary>
        /// The name of the `SpotDeployment` resource
        /// </summary>
        [Input("spotDeploymentsName")]
        public Input<string>? SpotDeploymentsName { get; set; }

        /// <summary>
        /// The namespace which the `SpotDeployment` resource exists within.
        /// </summary>
        [Input("spotDeploymentsNamespace")]
        public Input<string>? SpotDeploymentsNamespace { get; set; }

        public RolloutSpecSpotDeploymentGetArgs()
        {
        }
        public static new RolloutSpecSpotDeploymentGetArgs Empty => new RolloutSpecSpotDeploymentGetArgs();
    }
}
