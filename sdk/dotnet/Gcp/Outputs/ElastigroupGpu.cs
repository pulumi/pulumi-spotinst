// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Gcp.Outputs
{

    [OutputType]
    public sealed class ElastigroupGpu
    {
        /// <summary>
        /// The number of GPUs. Must be 0, 2, 4, 6, 8.
        /// 
        /// Usage:
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
        public readonly int Count;
        /// <summary>
        /// The type of GPU instance. Valid values: `nvidia-tesla-v100`, `nvidia-tesla-p100`, `nvidia-tesla-k80`.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private ElastigroupGpu(
            int count,

            string type)
        {
            Count = count;
            Type = type;
        }
    }
}
