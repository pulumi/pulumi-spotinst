// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Outputs
{

    [OutputType]
    public sealed class OceanLoadBalancer
    {
        /// <summary>
        /// Required if type is set to `TARGET_GROUP`
        /// </summary>
        public readonly string? Arn;
        /// <summary>
        /// Required if type is set to `CLASSIC`
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// Can be set to `CLASSIC` or `TARGET_GROUP`
        /// </summary>
        public readonly string? Type;

        [OutputConstructor]
        private OceanLoadBalancer(
            string? arn,

            string? name,

            string? type)
        {
            Arn = arn;
            Name = name;
            Type = type;
        }
    }
}
