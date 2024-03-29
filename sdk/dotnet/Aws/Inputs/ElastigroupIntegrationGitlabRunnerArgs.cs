// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class ElastigroupIntegrationGitlabRunnerArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies whether the scaling policy described in this block is enabled.
        /// </summary>
        [Input("isEnabled")]
        public Input<bool>? IsEnabled { get; set; }

        public ElastigroupIntegrationGitlabRunnerArgs()
        {
        }
        public static new ElastigroupIntegrationGitlabRunnerArgs Empty => new ElastigroupIntegrationGitlabRunnerArgs();
    }
}
