// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Gke.Outputs
{

    [OutputType]
    public sealed class ElastigroupLabel
    {
        public readonly string Key;
        public readonly string Value;

        [OutputConstructor]
        private ElastigroupLabel(
            string key,

            string value)
        {
            Key = key;
            Value = value;
        }
    }
}
