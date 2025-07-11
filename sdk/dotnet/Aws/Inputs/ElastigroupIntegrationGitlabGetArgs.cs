// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class ElastigroupIntegrationGitlabGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Settings for Gitlab runner.
        /// </summary>
        [Input("runner")]
        public Input<Inputs.ElastigroupIntegrationGitlabRunnerGetArgs>? Runner { get; set; }

        public ElastigroupIntegrationGitlabGetArgs()
        {
        }
        public static new ElastigroupIntegrationGitlabGetArgs Empty => new ElastigroupIntegrationGitlabGetArgs();
    }
}
