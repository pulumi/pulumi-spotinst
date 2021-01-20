// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class MrScalarProvisioningTimeoutArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The amount of time (minutes) after which the cluster is automatically terminated if it's still in provisioning status. Minimum: '15'.
        /// </summary>
        [Input("timeout", required: true)]
        public Input<int> Timeout { get; set; } = null!;

        /// <summary>
        /// The action to take if the timeout is exceeded. Valid values: `terminate`, `terminateAndRetry`.
        /// </summary>
        [Input("timeoutAction", required: true)]
        public Input<string> TimeoutAction { get; set; } = null!;

        public MrScalarProvisioningTimeoutArgs()
        {
        }
    }
}
