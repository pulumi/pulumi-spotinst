// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class ElastigroupStatefulInstanceActionGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// String, Stateful Instance ID on which the action should be performed.
        /// </summary>
        [Input("statefulInstanceId", required: true)]
        public Input<string> StatefulInstanceId { get; set; } = null!;

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
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public ElastigroupStatefulInstanceActionGetArgs()
        {
        }
        public static new ElastigroupStatefulInstanceActionGetArgs Empty => new ElastigroupStatefulInstanceActionGetArgs();
    }
}
