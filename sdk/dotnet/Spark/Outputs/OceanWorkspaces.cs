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
    public sealed class OceanWorkspaces
    {
        public readonly Outputs.OceanWorkspacesStorage? Storage;

        [OutputConstructor]
        private OceanWorkspaces(Outputs.OceanWorkspacesStorage? storage)
        {
            Storage = storage;
        }
    }
}
