// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Ecs.Outputs
{

    [OutputType]
    public sealed class OceanBlockDeviceMappingEbsDynamicVolumeSize
    {
        public readonly int BaseSize;
        public readonly string Resource;
        public readonly int SizePerResourceUnit;

        [OutputConstructor]
        private OceanBlockDeviceMappingEbsDynamicVolumeSize(
            int baseSize,

            string resource,

            int sizePerResourceUnit)
        {
            BaseSize = baseSize;
            Resource = resource;
            SizePerResourceUnit = sizePerResourceUnit;
        }
    }
}
