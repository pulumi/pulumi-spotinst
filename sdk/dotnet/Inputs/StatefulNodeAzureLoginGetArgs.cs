// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Inputs
{

    public sealed class StatefulNodeAzureLoginGetArgs : Pulumi.ResourceArgs
    {
        [Input("password")]
        public Input<string>? Password { get; set; }

        [Input("sshPublicKey")]
        public Input<string>? SshPublicKey { get; set; }

        [Input("userName", required: true)]
        public Input<string> UserName { get; set; } = null!;

        public StatefulNodeAzureLoginGetArgs()
        {
        }
    }
}
