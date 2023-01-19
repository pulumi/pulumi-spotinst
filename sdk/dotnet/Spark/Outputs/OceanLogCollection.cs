// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Spark.Outputs
{

    [OutputType]
    public sealed class OceanLogCollection
    {
        /// <summary>
        /// - Enable/disable the collection of driver logs. When enabled, driver logs are stored by NetApp and can be downloaded from the Spot console web interface. The driver logs are deleted after 30 days.
        /// </summary>
        public readonly bool? CollectDriverLogs;

        [OutputConstructor]
        private OceanLogCollection(bool? collectDriverLogs)
        {
            CollectDriverLogs = collectDriverLogs;
        }
    }
}