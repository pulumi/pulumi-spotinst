// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class ManagedInstanceTagArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Tag's key.
        /// </summary>
        [Input("key")]
        public Input<string>? Key { get; set; }

        /// <summary>
        /// Tag's name.
        /// </summary>
        [Input("value")]
        public Input<string>? Value { get; set; }

        public ManagedInstanceTagArgs()
        {
        }
    }
}
