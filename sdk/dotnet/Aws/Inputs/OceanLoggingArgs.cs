// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class OceanLoggingArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Logging Export configuration.
        /// </summary>
        [Input("export")]
        public Input<Inputs.OceanLoggingExportArgs>? Export { get; set; }

        public OceanLoggingArgs()
        {
        }
    }
}
