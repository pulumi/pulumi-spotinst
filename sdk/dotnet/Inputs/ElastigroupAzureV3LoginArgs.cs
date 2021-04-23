// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Inputs
{

    public sealed class ElastigroupAzureV3LoginArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Password for admin access to Windows VMs. Required for Windows OS types.
        /// </summary>
        [Input("password")]
        public Input<string>? Password { get; set; }

        /// <summary>
        /// SSH for admin access to Linux VMs. Required for Linux OS types.
        /// </summary>
        [Input("sshPublicKey")]
        public Input<string>? SshPublicKey { get; set; }

        /// <summary>
        /// Set admin access for accessing your VMs.
        /// </summary>
        [Input("userName", required: true)]
        public Input<string> UserName { get; set; } = null!;

        public ElastigroupAzureV3LoginArgs()
        {
        }
    }
}