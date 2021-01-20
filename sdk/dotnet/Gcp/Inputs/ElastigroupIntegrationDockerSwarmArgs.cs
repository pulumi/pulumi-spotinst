// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Gcp.Inputs
{

    public sealed class ElastigroupIntegrationDockerSwarmArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// IP or FQDN of one of your swarm managers.
        /// </summary>
        [Input("masterHost", required: true)]
        public Input<string> MasterHost { get; set; } = null!;

        /// <summary>
        /// Network port used by your swarm.
        /// </summary>
        [Input("masterPort", required: true)]
        public Input<int> MasterPort { get; set; } = null!;

        public ElastigroupIntegrationDockerSwarmArgs()
        {
        }
    }
}
