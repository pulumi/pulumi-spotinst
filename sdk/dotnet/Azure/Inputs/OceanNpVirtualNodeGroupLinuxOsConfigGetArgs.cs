// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Azure.Inputs
{

    public sealed class OceanNpVirtualNodeGroupLinuxOsConfigGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("sysctls")]
        private InputList<Inputs.OceanNpVirtualNodeGroupLinuxOsConfigSysctlGetArgs>? _sysctls;

        /// <summary>
        /// System Controls
        /// </summary>
        public InputList<Inputs.OceanNpVirtualNodeGroupLinuxOsConfigSysctlGetArgs> Sysctls
        {
            get => _sysctls ?? (_sysctls = new InputList<Inputs.OceanNpVirtualNodeGroupLinuxOsConfigSysctlGetArgs>());
            set => _sysctls = value;
        }

        public OceanNpVirtualNodeGroupLinuxOsConfigGetArgs()
        {
        }
        public static new OceanNpVirtualNodeGroupLinuxOsConfigGetArgs Empty => new OceanNpVirtualNodeGroupLinuxOsConfigGetArgs();
    }
}
