// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Azure.Inputs
{

    public sealed class OceanManagedServiceIdentityArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of the Load Balancer.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The Resource Group name of the Load Balancer.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        public OceanManagedServiceIdentityArgs()
        {
        }
        public static new OceanManagedServiceIdentityArgs Empty => new OceanManagedServiceIdentityArgs();
    }
}
