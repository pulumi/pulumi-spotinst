// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Spark.Inputs
{

    public sealed class OceanWorkspacesStorageGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("defaults")]
        public Input<Inputs.OceanWorkspacesStorageDefaultsGetArgs>? Defaults { get; set; }

        public OceanWorkspacesStorageGetArgs()
        {
        }
        public static new OceanWorkspacesStorageGetArgs Empty => new OceanWorkspacesStorageGetArgs();
    }
}
