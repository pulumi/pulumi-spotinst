// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Azure.Inputs
{

    public sealed class OceanNpLoggingGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Ocean AKS Logging Export object.
        /// </summary>
        [Input("export")]
        public Input<Inputs.OceanNpLoggingExportGetArgs>? Export { get; set; }

        public OceanNpLoggingGetArgs()
        {
        }
        public static new OceanNpLoggingGetArgs Empty => new OceanNpLoggingGetArgs();
    }
}
