// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Gke.Inputs
{

    public sealed class OceanImportUpdatePolicyRollConfigGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("batchMinHealthyPercentage")]
        public Input<int>? BatchMinHealthyPercentage { get; set; }

        /// <summary>
        /// Value in % to set size of batch in roll. Valid values are 0-100
        /// Example: 20.
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        /// });
        /// ```
        /// </summary>
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

        public OceanImportUpdatePolicyRollConfigGetArgs()
        {
        }
        public static new OceanImportUpdatePolicyRollConfigGetArgs Empty => new OceanImportUpdatePolicyRollConfigGetArgs();
    }
}
