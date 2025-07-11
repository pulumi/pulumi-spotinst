// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Gcp.Inputs
{

    public sealed class ElastigroupBackendServiceBackendBalancingArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The backend balancing mode. Valid values: `RATE`, `UTILIZATION`.
        /// </summary>
        [Input("backendBalancingMode")]
        public Input<string>? BackendBalancingMode { get; set; }

        /// <summary>
        /// If the backendBalancingMode is set to RATE, this field is required.
        /// 
        /// Usage:
        /// </summary>
        [Input("maxRatePerInstance")]
        public Input<int>? MaxRatePerInstance { get; set; }

        public ElastigroupBackendServiceBackendBalancingArgs()
        {
        }
        public static new ElastigroupBackendServiceBackendBalancingArgs Empty => new ElastigroupBackendServiceBackendBalancingArgs();
    }
}
