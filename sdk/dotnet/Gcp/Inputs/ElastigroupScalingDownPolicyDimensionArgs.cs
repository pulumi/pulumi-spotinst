// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Gcp.Inputs
{

    public sealed class ElastigroupScalingDownPolicyDimensionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The group name.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// Labels value.
        /// </summary>
        [Input("value")]
        public Input<string>? Value { get; set; }

        public ElastigroupScalingDownPolicyDimensionArgs()
        {
        }
        public static new ElastigroupScalingDownPolicyDimensionArgs Empty => new ElastigroupScalingDownPolicyDimensionArgs();
    }
}
