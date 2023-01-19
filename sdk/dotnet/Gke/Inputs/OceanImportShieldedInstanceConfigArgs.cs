// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Gke.Inputs
{

    public sealed class OceanImportShieldedInstanceConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Boolean. Enable the integrity monitoring parameter on the GCP instances.
        /// </summary>
        [Input("enableIntegrityMonitoring")]
        public Input<bool>? EnableIntegrityMonitoring { get; set; }

        /// <summary>
        /// Boolean. Enable the secure boot parameter on the GCP instances.
        /// </summary>
        [Input("enableSecureBoot")]
        public Input<bool>? EnableSecureBoot { get; set; }

        public OceanImportShieldedInstanceConfigArgs()
        {
        }
        public static new OceanImportShieldedInstanceConfigArgs Empty => new OceanImportShieldedInstanceConfigArgs();
    }
}
