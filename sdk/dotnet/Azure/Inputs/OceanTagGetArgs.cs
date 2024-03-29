// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Azure.Inputs
{

    public sealed class OceanTagGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Tag key.
        /// </summary>
        [Input("key")]
        public Input<string>? Key { get; set; }

        /// <summary>
        /// Tag value.
        /// </summary>
        [Input("value")]
        public Input<string>? Value { get; set; }

        public OceanTagGetArgs()
        {
        }
        public static new OceanTagGetArgs Empty => new OceanTagGetArgs();
    }
}
