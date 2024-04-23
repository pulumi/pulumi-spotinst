// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class ElastigroupScalingTargetPolicyDimensionGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// String, the dimension name.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// String, the dimension value.
        /// </summary>
        [Input("value")]
        public Input<string>? Value { get; set; }

        public ElastigroupScalingTargetPolicyDimensionGetArgs()
        {
        }
        public static new ElastigroupScalingTargetPolicyDimensionGetArgs Empty => new ElastigroupScalingTargetPolicyDimensionGetArgs();
    }
}
