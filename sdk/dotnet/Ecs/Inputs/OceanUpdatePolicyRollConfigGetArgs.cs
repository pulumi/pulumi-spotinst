// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Ecs.Inputs
{

    public sealed class OceanUpdatePolicyRollConfigGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("batchMinHealthyPercentage")]
        public Input<int>? BatchMinHealthyPercentage { get; set; }

        [Input("batchSizePercentage", required: true)]
        public Input<int> BatchSizePercentage { get; set; } = null!;

        public OceanUpdatePolicyRollConfigGetArgs()
        {
        }
        public static new OceanUpdatePolicyRollConfigGetArgs Empty => new OceanUpdatePolicyRollConfigGetArgs();
    }
}
