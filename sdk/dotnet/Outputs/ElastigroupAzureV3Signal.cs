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
    public sealed class ElastigroupAzureV3Signal
    {
        public readonly int Timeout;
        public readonly string Type;

        [OutputConstructor]
        private ElastigroupAzureV3Signal(
            int timeout,

            string type)
        {
            Timeout = timeout;
            Type = type;
        }
    }
}
