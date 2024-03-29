// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Gke.Outputs
{

    [OutputType]
    public sealed class OceanImportUpdatePolicyRollConfig
    {
        public readonly int? BatchMinHealthyPercentage;
        /// <summary>
        /// Value in %!t(MISSING)o set size of batch in roll. Valid values are 0-100
        /// Example: 20.
        /// 
        /// &lt;!--Start PulumiCodeChooser --&gt;
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public readonly int BatchSizePercentage;
        public readonly ImmutableArray<string> LaunchSpecIds;
        public readonly bool? RespectPdb;

        [OutputConstructor]
        private OceanImportUpdatePolicyRollConfig(
            int? batchMinHealthyPercentage,

            int batchSizePercentage,

            ImmutableArray<string> launchSpecIds,

            bool? respectPdb)
        {
            BatchMinHealthyPercentage = batchMinHealthyPercentage;
            BatchSizePercentage = batchSizePercentage;
            LaunchSpecIds = launchSpecIds;
            RespectPdb = respectPdb;
        }
    }
}
