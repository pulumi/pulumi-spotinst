// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Azure.Inputs
{

    public sealed class OceanNetworkNetworkInterfaceSecurityGroupArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Ocean cluster name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Name of the Azure Resource Group into which VMs will be launched. Cannot be updated.
        /// </summary>
        [Input("resourceGroupName")]
        public Input<string>? ResourceGroupName { get; set; }

        public OceanNetworkNetworkInterfaceSecurityGroupArgs()
        {
        }
        public static new OceanNetworkNetworkInterfaceSecurityGroupArgs Empty => new OceanNetworkNetworkInterfaceSecurityGroupArgs();
    }
}