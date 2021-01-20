// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class OceanUpdatePolicyRollConfigArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Sets the percentage of the instances to deploy in each batch.
        /// </summary>
        [Input("batchSizePercentage", required: true)]
        public Input<int> BatchSizePercentage { get; set; } = null!;

        public OceanUpdatePolicyRollConfigArgs()
        {
        }
    }
}
