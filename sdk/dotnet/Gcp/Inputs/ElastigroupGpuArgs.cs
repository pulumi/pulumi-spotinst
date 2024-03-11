// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Gcp.Inputs
{

    public sealed class ElastigroupGpuArgs : global::Pulumi.ResourceArgs
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
        [Input("count", required: true)]
        public Input<int> Count { get; set; } = null!;

        /// <summary>
        /// The type of GPU instance. Valid values: `nvidia-tesla-v100`, `nvidia-tesla-p100`, `nvidia-tesla-k80`.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public ElastigroupGpuArgs()
        {
        }
        public static new ElastigroupGpuArgs Empty => new ElastigroupGpuArgs();
    }
}
