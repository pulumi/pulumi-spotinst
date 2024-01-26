// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class OceanScheduledTaskTaskParametersParametersClusterRollGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("batchMinHealthyPercentage")]
        public Input<int>? BatchMinHealthyPercentage { get; set; }

        [Input("batchSizePercentage")]
        public Input<int>? BatchSizePercentage { get; set; }

        [Input("comment")]
        public Input<string>? Comment { get; set; }

        [Input("respectPdb")]
        public Input<bool>? RespectPdb { get; set; }

        public OceanScheduledTaskTaskParametersParametersClusterRollGetArgs()
        {
        }
        public static new OceanScheduledTaskTaskParametersParametersClusterRollGetArgs Empty => new OceanScheduledTaskTaskParametersParametersClusterRollGetArgs();
    }
}
