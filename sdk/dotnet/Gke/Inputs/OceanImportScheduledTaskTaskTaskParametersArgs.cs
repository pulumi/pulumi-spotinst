// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Gke.Inputs
{

    public sealed class OceanImportScheduledTaskTaskTaskParametersArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The cluster roll parameters for the cluster.
        /// </summary>
        [Input("clusterRoll")]
        public Input<Inputs.OceanImportScheduledTaskTaskTaskParametersClusterRollArgs>? ClusterRoll { get; set; }

        public OceanImportScheduledTaskTaskTaskParametersArgs()
        {
        }
        public static new OceanImportScheduledTaskTaskTaskParametersArgs Empty => new OceanImportScheduledTaskTaskTaskParametersArgs();
    }
}
