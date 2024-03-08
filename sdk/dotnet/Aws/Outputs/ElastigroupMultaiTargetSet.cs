// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Outputs
{

    [OutputType]
    public sealed class ElastigroupMultaiTargetSet
    {
        /// <summary>
        /// ID of Multai Load Balancer.
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
        public readonly string BalancerId;
        /// <summary>
        /// ID of Multai target set.
        /// </summary>
        public readonly string TargetSetId;

        [OutputConstructor]
        private ElastigroupMultaiTargetSet(
            string balancerId,

            string targetSetId)
        {
            BalancerId = balancerId;
            TargetSetId = targetSetId;
        }
    }
}
