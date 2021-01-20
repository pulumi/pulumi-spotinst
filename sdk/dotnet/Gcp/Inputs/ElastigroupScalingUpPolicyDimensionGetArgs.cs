// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Gcp.Inputs
{

    public sealed class ElastigroupScalingUpPolicyDimensionGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The dimension name.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The dimension value.
        /// </summary>
        [Input("value")]
        public Input<string>? Value { get; set; }

        public ElastigroupScalingUpPolicyDimensionGetArgs()
        {
        }
    }
}
