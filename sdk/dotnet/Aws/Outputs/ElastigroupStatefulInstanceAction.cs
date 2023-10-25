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
    public sealed class ElastigroupStatefulInstanceAction
    {
        /// <summary>
        /// String, Stateful Instance ID on which the action should be performed.
        /// </summary>
        public readonly string StatefulInstanceId;
        /// <summary>
        /// String, Action type. Supported action types: `pause`, `resume`, `recycle`, `deallocate`.
        /// 
        /// Usage:
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
        public readonly string Type;

        [OutputConstructor]
        private ElastigroupStatefulInstanceAction(
            string statefulInstanceId,

            string type)
        {
            StatefulInstanceId = statefulInstanceId;
            Type = type;
        }
    }
}
