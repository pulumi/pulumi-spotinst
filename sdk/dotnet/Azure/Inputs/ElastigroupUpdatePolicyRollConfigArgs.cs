// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Azure.Inputs
{

    public sealed class ElastigroupUpdatePolicyRollConfigArgs : global::Pulumi.ResourceArgs
    {
        [Input("batchSizePercentage", required: true)]
        public Input<int> BatchSizePercentage { get; set; } = null!;

        [Input("gracePeriod")]
        public Input<int>? GracePeriod { get; set; }

        [Input("healthCheckType")]
        public Input<string>? HealthCheckType { get; set; }

        public ElastigroupUpdatePolicyRollConfigArgs()
        {
        }
        public static new ElastigroupUpdatePolicyRollConfigArgs Empty => new ElastigroupUpdatePolicyRollConfigArgs();
    }
}
