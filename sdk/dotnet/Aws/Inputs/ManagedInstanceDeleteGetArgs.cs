// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class ManagedInstanceDeleteGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("amiBackupShouldDeleteImages")]
        public Input<bool>? AmiBackupShouldDeleteImages { get; set; }

        [Input("deallocationConfigShouldDeleteImages")]
        public Input<bool>? DeallocationConfigShouldDeleteImages { get; set; }

        [Input("shouldDeleteNetworkInterfaces")]
        public Input<bool>? ShouldDeleteNetworkInterfaces { get; set; }

        [Input("shouldDeleteSnapshots")]
        public Input<bool>? ShouldDeleteSnapshots { get; set; }

        [Input("shouldDeleteVolumes")]
        public Input<bool>? ShouldDeleteVolumes { get; set; }

        [Input("shouldTerminateInstance")]
        public Input<bool>? ShouldTerminateInstance { get; set; }

        public ManagedInstanceDeleteGetArgs()
        {
        }
        public static new ManagedInstanceDeleteGetArgs Empty => new ManagedInstanceDeleteGetArgs();
    }
}