// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Multai.Inputs
{

    public sealed class ListenerTlsConfigGetArgs : Pulumi.ResourceArgs
    {
        [Input("certificateIds", required: true)]
        private InputList<string>? _certificateIds;
        public InputList<string> CertificateIds
        {
            get => _certificateIds ?? (_certificateIds = new InputList<string>());
            set => _certificateIds = value;
        }

        [Input("cipherSuites", required: true)]
        private InputList<string>? _cipherSuites;
        public InputList<string> CipherSuites
        {
            get => _cipherSuites ?? (_cipherSuites = new InputList<string>());
            set => _cipherSuites = value;
        }

        [Input("maxVersion", required: true)]
        public Input<string> MaxVersion { get; set; } = null!;

        [Input("minVersion", required: true)]
        public Input<string> MinVersion { get; set; } = null!;

        [Input("preferServerCipherSuites", required: true)]
        public Input<bool> PreferServerCipherSuites { get; set; } = null!;

        [Input("sessionTicketsDisabled", required: true)]
        public Input<bool> SessionTicketsDisabled { get; set; } = null!;

        public ListenerTlsConfigGetArgs()
        {
        }
    }
}
