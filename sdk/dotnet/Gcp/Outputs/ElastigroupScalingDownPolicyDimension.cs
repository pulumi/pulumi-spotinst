// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Gcp.Outputs
{

    [OutputType]
    public sealed class ElastigroupScalingDownPolicyDimension
    {
        /// <summary>
        /// The group name.
        /// </summary>
        public readonly string Name;
        public readonly string? Value;

        [OutputConstructor]
        private ElastigroupScalingDownPolicyDimension(
            string name,

            string? value)
        {
            Name = name;
            Value = value;
        }
    }
}
