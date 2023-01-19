// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Spark.Inputs
{

    public sealed class OceanWebhookGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("hostNetworkPorts")]
        private InputList<int>? _hostNetworkPorts;

        /// <summary>
        /// - List of ports allowed to use on the host network - if empty default is `25554`.
        /// </summary>
        public InputList<int> HostNetworkPorts
        {
            get => _hostNetworkPorts ?? (_hostNetworkPorts = new InputList<int>());
            set => _hostNetworkPorts = value;
        }

        /// <summary>
        /// - Enable/disable host networking for the Spark Operator. Host networking can be useful when using custom CNI plugins like Calico on EKS.
        /// </summary>
        [Input("useHostNetwork")]
        public Input<bool>? UseHostNetwork { get; set; }

        public OceanWebhookGetArgs()
        {
        }
        public static new OceanWebhookGetArgs Empty => new OceanWebhookGetArgs();
    }
}
