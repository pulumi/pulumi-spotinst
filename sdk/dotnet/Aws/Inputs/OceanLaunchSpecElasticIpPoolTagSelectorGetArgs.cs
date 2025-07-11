// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class OceanLaunchSpecElasticIpPoolTagSelectorGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Elastic IP tag key. The Virtual Node Group will consider all Elastic IPs tagged with this tag as a part of the Elastic IP pool to use.
        /// </summary>
        [Input("tagKey", required: true)]
        public Input<string> TagKey { get; set; } = null!;

        /// <summary>
        /// Elastic IP tag value. Can be null.
        /// </summary>
        [Input("tagValue")]
        public Input<string>? TagValue { get; set; }

        public OceanLaunchSpecElasticIpPoolTagSelectorGetArgs()
        {
        }
        public static new OceanLaunchSpecElasticIpPoolTagSelectorGetArgs Empty => new OceanLaunchSpecElasticIpPoolTagSelectorGetArgs();
    }
}
