// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Gke.Inputs
{

    public sealed class OceanImportUpdatePolicyRollConfigArgs : global::Pulumi.ResourceArgs
    {
        [Input("batchMinHealthyPercentage")]
        public Input<int>? BatchMinHealthyPercentage { get; set; }

        [Input("batchSizePercentage", required: true)]
        public Input<int> BatchSizePercentage { get; set; } = null!;

        [Input("launchSpecIds")]
        private InputList<string>? _launchSpecIds;
        public InputList<string> LaunchSpecIds
        {
            get => _launchSpecIds ?? (_launchSpecIds = new InputList<string>());
            set => _launchSpecIds = value;
        }

        [Input("respectPdb")]
        public Input<bool>? RespectPdb { get; set; }

        public OceanImportUpdatePolicyRollConfigArgs()
        {
        }
        public static new OceanImportUpdatePolicyRollConfigArgs Empty => new OceanImportUpdatePolicyRollConfigArgs();
    }
}
