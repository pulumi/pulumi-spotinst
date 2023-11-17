// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Outputs
{

    [OutputType]
    public sealed class OceanLaunchSpecTag
    {
        /// <summary>
        /// The label key.
        /// </summary>
        public readonly string Key;
        /// <summary>
        /// The label value.
        /// </summary>
        public readonly string Value;

        [OutputConstructor]
        private OceanLaunchSpecTag(
            string key,

            string value)
        {
            Key = key;
            Value = value;
        }
    }
}
