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
    public sealed class ElastigroupLogging
    {
        /// <summary>
        /// Logging Export configuration.
        /// </summary>
        public readonly Outputs.ElastigroupLoggingExport? Export;

        [OutputConstructor]
        private ElastigroupLogging(Outputs.ElastigroupLoggingExport? export)
        {
            Export = export;
        }
    }
}
