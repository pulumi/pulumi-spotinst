// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Azure.Inputs
{

    public sealed class OceanNpHealthGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("gracePeriod")]
        public Input<int>? GracePeriod { get; set; }

        public OceanNpHealthGetArgs()
        {
        }
        public static new OceanNpHealthGetArgs Empty => new OceanNpHealthGetArgs();
    }
}
