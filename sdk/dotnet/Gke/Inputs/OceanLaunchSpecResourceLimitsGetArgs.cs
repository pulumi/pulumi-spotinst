// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Gke.Inputs
{

    public sealed class OceanLaunchSpecResourceLimitsGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Option to set a maximum number of instances per virtual node group. Can be null. If set, the value must be greater than or equal to 0.
        /// </summary>
        [Input("maxInstanceCount")]
        public Input<int>? MaxInstanceCount { get; set; }

        /// <summary>
        /// Option to set a minimum number of instances per virtual node group. Can be null. If set, the value must be greater than or equal to 0.
        /// </summary>
        [Input("minInstanceCount")]
        public Input<int>? MinInstanceCount { get; set; }

        public OceanLaunchSpecResourceLimitsGetArgs()
        {
        }
    }
}
