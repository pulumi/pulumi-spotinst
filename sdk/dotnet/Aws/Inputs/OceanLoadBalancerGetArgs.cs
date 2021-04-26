// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class OceanLoadBalancerGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Required if type is set to `TARGET_GROUP`
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// Required if type is set to `CLASSIC`
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Can be set to `CLASSIC` or `TARGET_GROUP`
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public OceanLoadBalancerGetArgs()
        {
        }
    }
}
