// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Outputs
{

    [OutputType]
    public sealed class ElastigroupAzureV3OsDisk
    {
        public readonly int? SizeGb;
        public readonly string Type;

        [OutputConstructor]
        private ElastigroupAzureV3OsDisk(
            int? sizeGb,

            string type)
        {
            SizeGb = sizeGb;
            Type = type;
        }
    }
}
