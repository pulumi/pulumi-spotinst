// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Inputs
{

    public sealed class ElastigroupAzureV3SecretVaultCertificateArgs : global::Pulumi.ResourceArgs
    {
        [Input("certificateStore", required: true)]
        public Input<string> CertificateStore { get; set; } = null!;

        [Input("certificateUrl", required: true)]
        public Input<string> CertificateUrl { get; set; } = null!;

        public ElastigroupAzureV3SecretVaultCertificateArgs()
        {
        }
        public static new ElastigroupAzureV3SecretVaultCertificateArgs Empty => new ElastigroupAzureV3SecretVaultCertificateArgs();
    }
}