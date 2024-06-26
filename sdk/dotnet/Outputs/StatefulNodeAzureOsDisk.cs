// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Outputs
{

    [OutputType]
    public sealed class StatefulNodeAzureOsDisk
    {
        public readonly string? Caching;
        public readonly int? SizeGb;
        public readonly string Type;

        [OutputConstructor]
        private StatefulNodeAzureOsDisk(
            string? caching,

            int? sizeGb,

            string type)
        {
            Caching = caching;
            SizeGb = sizeGb;
            Type = type;
        }
    }
}
