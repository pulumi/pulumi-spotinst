// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Inputs
{

    public sealed class StatefulNodeAzureSecretGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("sourceVaults", required: true)]
        private InputList<Inputs.StatefulNodeAzureSecretSourceVaultGetArgs>? _sourceVaults;
        public InputList<Inputs.StatefulNodeAzureSecretSourceVaultGetArgs> SourceVaults
        {
            get => _sourceVaults ?? (_sourceVaults = new InputList<Inputs.StatefulNodeAzureSecretSourceVaultGetArgs>());
            set => _sourceVaults = value;
        }

        [Input("vaultCertificates", required: true)]
        private InputList<Inputs.StatefulNodeAzureSecretVaultCertificateGetArgs>? _vaultCertificates;
        public InputList<Inputs.StatefulNodeAzureSecretVaultCertificateGetArgs> VaultCertificates
        {
            get => _vaultCertificates ?? (_vaultCertificates = new InputList<Inputs.StatefulNodeAzureSecretVaultCertificateGetArgs>());
            set => _vaultCertificates = value;
        }

        public StatefulNodeAzureSecretGetArgs()
        {
        }
        public static new StatefulNodeAzureSecretGetArgs Empty => new StatefulNodeAzureSecretGetArgs();
    }
}