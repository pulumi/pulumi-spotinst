// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class OceanScheduledTaskTaskParametersArgs : global::Pulumi.ResourceArgs
    {
        [Input("amiAutoUpdate")]
        public Input<Inputs.OceanScheduledTaskTaskParametersAmiAutoUpdateArgs>? AmiAutoUpdate { get; set; }

        [Input("parametersClusterRoll")]
        public Input<Inputs.OceanScheduledTaskTaskParametersParametersClusterRollArgs>? ParametersClusterRoll { get; set; }

        public OceanScheduledTaskTaskParametersArgs()
        {
        }
        public static new OceanScheduledTaskTaskParametersArgs Empty => new OceanScheduledTaskTaskParametersArgs();
    }
}
