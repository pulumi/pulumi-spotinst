// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class ElastigroupIntegrationGitlabRunnerGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("isEnabled")]
        public Input<bool>? IsEnabled { get; set; }

        public ElastigroupIntegrationGitlabRunnerGetArgs()
        {
        }
        public static new ElastigroupIntegrationGitlabRunnerGetArgs Empty => new ElastigroupIntegrationGitlabRunnerGetArgs();
    }
}
