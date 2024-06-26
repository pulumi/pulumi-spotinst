// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class ElastigroupMultipleMetricsExpressionArgs : global::Pulumi.ResourceArgs
    {
        [Input("expression", required: true)]
        public Input<string> Expression { get; set; } = null!;

        /// <summary>
        /// The group name.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public ElastigroupMultipleMetricsExpressionArgs()
        {
        }
        public static new ElastigroupMultipleMetricsExpressionArgs Empty => new ElastigroupMultipleMetricsExpressionArgs();
    }
}
