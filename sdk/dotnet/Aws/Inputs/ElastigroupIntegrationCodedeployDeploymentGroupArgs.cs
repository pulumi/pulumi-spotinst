// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class ElastigroupIntegrationCodedeployDeploymentGroupArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The application name.
        /// </summary>
        [Input("applicationName", required: true)]
        public Input<string> ApplicationName { get; set; } = null!;

        /// <summary>
        /// The deployment group name.
        /// 
        /// Usage:
        /// </summary>
        [Input("deploymentGroupName", required: true)]
        public Input<string> DeploymentGroupName { get; set; } = null!;

        public ElastigroupIntegrationCodedeployDeploymentGroupArgs()
        {
        }
        public static new ElastigroupIntegrationCodedeployDeploymentGroupArgs Empty => new ElastigroupIntegrationCodedeployDeploymentGroupArgs();
    }
}
