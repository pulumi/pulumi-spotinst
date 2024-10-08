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
    public sealed class SuspensionSuspension
    {
        /// <summary>
        /// The name of process to suspend. Valid values: `"AUTO_HEALING" , "OUT_OF_STRATEGY", "PREVENTIVE_REPLACEMENT", "REVERT_PREFERRED", or "SCHEDULING"`.
        /// </summary>
        public readonly string Name;

        [OutputConstructor]
        private SuspensionSuspension(string name)
        {
            Name = name;
        }
    }
}