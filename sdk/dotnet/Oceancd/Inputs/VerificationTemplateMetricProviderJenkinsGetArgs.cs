// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Oceancd.Inputs
{

    public sealed class VerificationTemplateMetricProviderJenkinsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The interval time to poll status.
        /// </summary>
        [Input("jenkinsInterval", required: true)]
        public Input<string> JenkinsInterval { get; set; } = null!;

        /// <summary>
        /// List of parameters.
        /// </summary>
        [Input("jenkinsParameters")]
        public Input<Inputs.VerificationTemplateMetricProviderJenkinsJenkinsParametersGetArgs>? JenkinsParameters { get; set; }

        /// <summary>
        /// The Jenkins pipeline name.
        /// </summary>
        [Input("pipelineName", required: true)]
        public Input<string> PipelineName { get; set; } = null!;

        /// <summary>
        /// The total jenkins timeout.
        /// </summary>
        [Input("timeout", required: true)]
        public Input<string> Timeout { get; set; } = null!;

        /// <summary>
        /// Host TLS verification.
        /// </summary>
        [Input("tlsVerification")]
        public Input<bool>? TlsVerification { get; set; }

        public VerificationTemplateMetricProviderJenkinsGetArgs()
        {
        }
        public static new VerificationTemplateMetricProviderJenkinsGetArgs Empty => new VerificationTemplateMetricProviderJenkinsGetArgs();
    }
}