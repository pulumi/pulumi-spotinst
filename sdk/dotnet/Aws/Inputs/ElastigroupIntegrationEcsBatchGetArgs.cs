// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class ElastigroupIntegrationEcsBatchGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("jobQueueNames", required: true)]
        private InputList<string>? _jobQueueNames;

        /// <summary>
        /// Array of strings.
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
        public InputList<string> JobQueueNames
        {
            get => _jobQueueNames ?? (_jobQueueNames = new InputList<string>());
            set => _jobQueueNames = value;
        }

        public ElastigroupIntegrationEcsBatchGetArgs()
        {
        }
        public static new ElastigroupIntegrationEcsBatchGetArgs Empty => new ElastigroupIntegrationEcsBatchGetArgs();
    }
}
