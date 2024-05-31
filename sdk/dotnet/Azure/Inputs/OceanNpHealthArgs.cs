// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Azure.Inputs
{

    public sealed class OceanNpHealthArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The amount of time to wait, in seconds, from the moment the instance has launched until monitoring of its health checks begins.
        /// </summary>
        [Input("gracePeriod")]
        public Input<int>? GracePeriod { get; set; }

        public OceanNpHealthArgs()
        {
        }
        public static new OceanNpHealthArgs Empty => new OceanNpHealthArgs();
    }
}