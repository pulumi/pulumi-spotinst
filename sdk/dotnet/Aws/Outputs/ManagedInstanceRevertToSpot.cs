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
    public sealed class ManagedInstanceRevertToSpot
    {
        /// <summary>
        /// Valid values: `"always"`, `"never"`, `"timeWindow"`.
        /// Default `"never"`.
        /// </summary>
        public readonly string PerformAt;

        [OutputConstructor]
        private ManagedInstanceRevertToSpot(string performAt)
        {
            PerformAt = performAt;
        }
    }
}
