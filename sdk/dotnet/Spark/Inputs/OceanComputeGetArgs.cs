// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Spark.Inputs
{

    public sealed class OceanComputeGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// - Enable/disable the creation of Ocean Spark VNGs during cluster creation.
        /// </summary>
        [Input("createVngs")]
        public Input<bool>? CreateVngs { get; set; }

        /// <summary>
        /// - Enable/disable Ocean Spark taints on the Ocean Spark VNGs. By default, Ocean Spark uses taints to prevent non-Spark workloads from running on Ocean Spark VNGs.
        /// </summary>
        [Input("useTaints")]
        public Input<bool>? UseTaints { get; set; }

        public OceanComputeGetArgs()
        {
        }
        public static new OceanComputeGetArgs Empty => new OceanComputeGetArgs();
    }
}
