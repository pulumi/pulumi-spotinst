// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Gke.Inputs
{

    public sealed class OceanImportStrategyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The draining timeout (in seconds) before terminating the instance.
        /// </summary>
        [Input("drainingTimeout")]
        public Input<int>? DrainingTimeout { get; set; }

        [Input("preemptiblePercentage")]
        public Input<int>? PreemptiblePercentage { get; set; }

        [Input("provisioningModel")]
        public Input<string>? ProvisioningModel { get; set; }

        public OceanImportStrategyArgs()
        {
        }
        public static new OceanImportStrategyArgs Empty => new OceanImportStrategyArgs();
    }
}
