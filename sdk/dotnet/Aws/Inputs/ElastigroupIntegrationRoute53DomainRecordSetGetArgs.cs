// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class ElastigroupIntegrationRoute53DomainRecordSetGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The group name.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// Designates whether the DNS address should be exposed to connections outside the VPC.
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
        [Input("usePublicDns")]
        public Input<bool>? UsePublicDns { get; set; }

        /// <summary>
        /// Designates whether the IP address should be exposed to connections outside the VPC.
        /// </summary>
        [Input("usePublicIp")]
        public Input<bool>? UsePublicIp { get; set; }

        public ElastigroupIntegrationRoute53DomainRecordSetGetArgs()
        {
        }
        public static new ElastigroupIntegrationRoute53DomainRecordSetGetArgs Empty => new ElastigroupIntegrationRoute53DomainRecordSetGetArgs();
    }
}
