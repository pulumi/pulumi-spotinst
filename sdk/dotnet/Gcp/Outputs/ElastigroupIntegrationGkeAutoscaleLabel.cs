// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Gcp.Outputs
{

    [OutputType]
    public sealed class ElastigroupIntegrationGkeAutoscaleLabel
    {
        /// <summary>
        /// Labels key.
        /// </summary>
        public readonly string Key;
        /// <summary>
        /// The dimension value.
        /// </summary>
        public readonly string Value;

        [OutputConstructor]
        private ElastigroupIntegrationGkeAutoscaleLabel(
            string key,

            string value)
        {
            Key = key;
            Value = value;
        }
    }
}
