// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Gke.Inputs
{

    public sealed class ElastigroupShieldedInstanceConfigArgs : global::Pulumi.ResourceArgs
    {
        [Input("enableIntegrityMonitoring")]
        public Input<bool>? EnableIntegrityMonitoring { get; set; }

        [Input("enableSecureBoot")]
        public Input<bool>? EnableSecureBoot { get; set; }

        public ElastigroupShieldedInstanceConfigArgs()
        {
        }
        public static new ElastigroupShieldedInstanceConfigArgs Empty => new ElastigroupShieldedInstanceConfigArgs();
    }
}
