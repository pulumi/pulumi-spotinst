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
    public sealed class ElastigroupRevertToPreemptible
    {
        /// <summary>
        /// Valid values: "always", "never", "timeWindow". Required on strategy.revertToPreemptible object.
        /// </summary>
        public readonly string PerformAt;

        [OutputConstructor]
        private ElastigroupRevertToPreemptible(string performAt)
        {
            PerformAt = performAt;
        }
    }
}
