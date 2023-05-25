// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Azure.Inputs
{

    public sealed class ElastigroupStrategyArgs : global::Pulumi.ResourceArgs
    {
        [Input("drainingTimeout")]
        public Input<int>? DrainingTimeout { get; set; }

        [Input("lowPriorityPercentage")]
        public Input<int>? LowPriorityPercentage { get; set; }

        [Input("odCount")]
        public Input<int>? OdCount { get; set; }

        public ElastigroupStrategyArgs()
        {
        }
        public static new ElastigroupStrategyArgs Empty => new ElastigroupStrategyArgs();
    }
}
