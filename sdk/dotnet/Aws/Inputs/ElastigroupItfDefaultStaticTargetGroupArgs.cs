// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class ElastigroupItfDefaultStaticTargetGroupArgs : global::Pulumi.ResourceArgs
    {
        [Input("arn", required: true)]
        public Input<string> Arn { get; set; } = null!;

        [Input("percentage", required: true)]
        public Input<double> Percentage { get; set; } = null!;

        public ElastigroupItfDefaultStaticTargetGroupArgs()
        {
        }
        public static new ElastigroupItfDefaultStaticTargetGroupArgs Empty => new ElastigroupItfDefaultStaticTargetGroupArgs();
    }
}
