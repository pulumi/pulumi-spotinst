// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Spark.Inputs
{

    public sealed class OceanLogCollectionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// - Enable/Disable collecting driver and executor logs. When enabled, logs are stored by NetApp and can be downloaded from the Spot console web interface. The logs are deleted after 30 days.
        /// </summary>
        [Input("collectAppLogs")]
        public Input<bool>? CollectAppLogs { get; set; }

        public OceanLogCollectionArgs()
        {
        }
        public static new OceanLogCollectionArgs Empty => new OceanLogCollectionArgs();
    }
}