// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Azure.Inputs
{

    public sealed class OceanNpVirtualNodeGroupLinuxOsConfigSysctlArgs : global::Pulumi.ResourceArgs
    {
        [Input("vmMaxMapCount")]
        public Input<int>? VmMaxMapCount { get; set; }

        public OceanNpVirtualNodeGroupLinuxOsConfigSysctlArgs()
        {
        }
        public static new OceanNpVirtualNodeGroupLinuxOsConfigSysctlArgs Empty => new OceanNpVirtualNodeGroupLinuxOsConfigSysctlArgs();
    }
}
