// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Gke.Inputs
{

    public sealed class OceanLaunchSpecStorageGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Defines the number of local SSDs to be attached per node for this VNG.
        /// </summary>
        [Input("localSsdCount")]
        public Input<int>? LocalSsdCount { get; set; }

        public OceanLaunchSpecStorageGetArgs()
        {
        }
        public static new OceanLaunchSpecStorageGetArgs Empty => new OceanLaunchSpecStorageGetArgs();
    }
}
