// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class OceanInstanceStorePolicyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Value: `"RAID0"` The method for using the instance store volumes (must also be defined in the userData).
        /// </summary>
        [Input("instanceStorePolicyType")]
        public Input<string>? InstanceStorePolicyType { get; set; }

        public OceanInstanceStorePolicyArgs()
        {
        }
        public static new OceanInstanceStorePolicyArgs Empty => new OceanInstanceStorePolicyArgs();
    }
}
