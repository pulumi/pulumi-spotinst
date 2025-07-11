// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Gcp.Inputs
{

    public sealed class ElastigroupDiskGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies whether the disk will be auto-deleted when the instance is deleted.
        /// </summary>
        [Input("autoDelete")]
        public Input<bool>? AutoDelete { get; set; }

        /// <summary>
        /// Indicates that this is a boot disk. The virtual machine will use the first partition of the disk for its root filesystem.
        /// </summary>
        [Input("boot")]
        public Input<bool>? Boot { get; set; }

        /// <summary>
        /// Specifies a unique device name of your choice.
        /// </summary>
        [Input("deviceName")]
        public Input<string>? DeviceName { get; set; }

        [Input("initializeParams")]
        private InputList<Inputs.ElastigroupDiskInitializeParamGetArgs>? _initializeParams;

        /// <summary>
        /// Specifies the parameters for a new disk that will be created alongside the new instance. Use initialization parameters to create boot disks or local SSDs attached to the new instance.
        /// </summary>
        public InputList<Inputs.ElastigroupDiskInitializeParamGetArgs> InitializeParams
        {
            get => _initializeParams ?? (_initializeParams = new InputList<Inputs.ElastigroupDiskInitializeParamGetArgs>());
            set => _initializeParams = value;
        }

        /// <summary>
        /// Specifies the disk interface to use for attaching this disk, which is either SCSI or NVME.
        /// </summary>
        [Input("interface")]
        public Input<string>? Interface { get; set; }

        /// <summary>
        /// The mode in which to attach this disk, either READ_WRITE or READ_ONLY.
        /// </summary>
        [Input("mode")]
        public Input<string>? Mode { get; set; }

        /// <summary>
        /// Specifies a valid partial or full URL to an existing Persistent Disk resource. This field is only applicable for persistent disks.
        /// </summary>
        [Input("source")]
        public Input<string>? Source { get; set; }

        /// <summary>
        /// Specifies the type of disk, either SCRATCH or PERSISTENT.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public ElastigroupDiskGetArgs()
        {
        }
        public static new ElastigroupDiskGetArgs Empty => new ElastigroupDiskGetArgs();
    }
}
