// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class OceanLaunchSpecElasticIpPoolGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Key-value object, which defines an Elastic IP from the customer pool. Can be null.
        /// </summary>
        [Input("tagSelector")]
        public Input<Inputs.OceanLaunchSpecElasticIpPoolTagSelectorGetArgs>? TagSelector { get; set; }

        public OceanLaunchSpecElasticIpPoolGetArgs()
        {
        }
    }
}