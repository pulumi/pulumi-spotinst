// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Inputs
{

    public sealed class ElastigroupAzureV3SecurityArgs : global::Pulumi.ResourceArgs
    {
        [Input("confidentialOsDiskEncryption")]
        public Input<bool>? ConfidentialOsDiskEncryption { get; set; }

        [Input("encryptionAtHost")]
        public Input<bool>? EncryptionAtHost { get; set; }

        [Input("secureBootEnabled")]
        public Input<bool>? SecureBootEnabled { get; set; }

        [Input("securityType")]
        public Input<string>? SecurityType { get; set; }

        [Input("vtpmEnabled")]
        public Input<bool>? VtpmEnabled { get; set; }

        public ElastigroupAzureV3SecurityArgs()
        {
        }
        public static new ElastigroupAzureV3SecurityArgs Empty => new ElastigroupAzureV3SecurityArgs();
    }
}
