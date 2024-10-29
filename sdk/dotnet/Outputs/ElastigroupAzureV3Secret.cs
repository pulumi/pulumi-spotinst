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
    public sealed class ElastigroupAzureV3Secret
    {
        public readonly ImmutableArray<Outputs.ElastigroupAzureV3SecretSourceVault> SourceVaults;
        public readonly ImmutableArray<Outputs.ElastigroupAzureV3SecretVaultCertificate> VaultCertificates;

        [OutputConstructor]
        private ElastigroupAzureV3Secret(
            ImmutableArray<Outputs.ElastigroupAzureV3SecretSourceVault> sourceVaults,

            ImmutableArray<Outputs.ElastigroupAzureV3SecretVaultCertificate> vaultCertificates)
        {
            SourceVaults = sourceVaults;
            VaultCertificates = vaultCertificates;
        }
    }
}
