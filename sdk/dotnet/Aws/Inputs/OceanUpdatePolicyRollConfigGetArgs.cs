// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class OceanUpdatePolicyRollConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Default: 50. Indicates the threshold of minimum healthy instances in single batch. If the amount of healthy instances in single batch is under the threshold, the cluster roll will fail. If exists, the parameter value will be in range of 1-100. In case of null as value, the default value in the backend will be 50%. Value of param should represent the number in percentage (%) of the batch.
        /// </summary>
        [Input("batchMinHealthyPercentage")]
        public Input<int>? BatchMinHealthyPercentage { get; set; }

        /// <summary>
        /// Sets the percentage of the instances to deploy in each batch.
        /// </summary>
        [Input("batchSizePercentage", required: true)]
        public Input<int> BatchSizePercentage { get; set; } = null!;

        [Input("launchSpecIds")]
        private InputList<string>? _launchSpecIds;

        /// <summary>
        /// List of virtual node group identifiers to be rolled.
        /// </summary>
        public InputList<string> LaunchSpecIds
        {
            get => _launchSpecIds ?? (_launchSpecIds = new InputList<string>());
            set => _launchSpecIds = value;
        }

        /// <summary>
        /// During the roll, if the parameter is set to True we honor PDB during the instance replacement.
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        /// });
        /// ```
        /// 
        /// &lt;a id="scheduled-task"&gt;&lt;/a&gt;
        /// </summary>
        [Input("respectPdb")]
        public Input<bool>? RespectPdb { get; set; }

        public OceanUpdatePolicyRollConfigGetArgs()
        {
        }
        public static new OceanUpdatePolicyRollConfigGetArgs Empty => new OceanUpdatePolicyRollConfigGetArgs();
    }
}
