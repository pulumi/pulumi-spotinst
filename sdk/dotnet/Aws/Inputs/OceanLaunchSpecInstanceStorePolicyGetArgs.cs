// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class OceanLaunchSpecInstanceStorePolicyGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Value: `"RAID0"` The method for using the instance store volumes (must also be defined in the userData).
        /// </summary>
        [Input("instanceStorePolicyType")]
        public Input<string>? InstanceStorePolicyType { get; set; }

        public OceanLaunchSpecInstanceStorePolicyGetArgs()
        {
        }
        public static new OceanLaunchSpecInstanceStorePolicyGetArgs Empty => new OceanLaunchSpecInstanceStorePolicyGetArgs();
    }
}
