// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Inputs
{

    public sealed class StatefulNodeAzureSecretVaultCertificateArgs : global::Pulumi.ResourceArgs
    {
        [Input("certificateStore")]
        public Input<string>? CertificateStore { get; set; }

        [Input("certificateUrl")]
        public Input<string>? CertificateUrl { get; set; }

        public StatefulNodeAzureSecretVaultCertificateArgs()
        {
        }
        public static new StatefulNodeAzureSecretVaultCertificateArgs Empty => new StatefulNodeAzureSecretVaultCertificateArgs();
    }
}
