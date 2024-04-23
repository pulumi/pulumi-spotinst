// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Azure.Outputs
{

    [OutputType]
    public sealed class OceanVirtualNodeGroupLaunchSpecificationOsDisk
    {
        public readonly int SizeGb;
        public readonly string? Type;
        public readonly bool? UtilizeEphemeralStorage;

        [OutputConstructor]
        private OceanVirtualNodeGroupLaunchSpecificationOsDisk(
            int sizeGb,

            string? type,

            bool? utilizeEphemeralStorage)
        {
            SizeGb = sizeGb;
            Type = type;
            UtilizeEphemeralStorage = utilizeEphemeralStorage;
        }
    }
}
