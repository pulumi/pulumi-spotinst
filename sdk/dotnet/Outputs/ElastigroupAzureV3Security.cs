// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Outputs
{

    [OutputType]
    public sealed class ElastigroupAzureV3Security
    {
        public readonly bool? ConfidentialOsDiskEncryption;
        public readonly bool? SecureBootEnabled;
        public readonly string? SecurityType;
        public readonly bool? VtpmEnabled;

        [OutputConstructor]
        private ElastigroupAzureV3Security(
            bool? confidentialOsDiskEncryption,

            bool? secureBootEnabled,

            string? securityType,

            bool? vtpmEnabled)
        {
            ConfidentialOsDiskEncryption = confidentialOsDiskEncryption;
            SecureBootEnabled = secureBootEnabled;
            SecurityType = securityType;
            VtpmEnabled = vtpmEnabled;
        }
    }
}