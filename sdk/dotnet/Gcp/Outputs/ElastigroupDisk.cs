// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Gcp.Outputs
{

    [OutputType]
    public sealed class ElastigroupDisk
    {
        /// <summary>
        /// Specifies whether the disk will be auto-deleted when the instance is deleted.
        /// </summary>
        public readonly bool? AutoDelete;
        /// <summary>
        /// Indicates that this is a boot disk. The virtual machine will use the first partition of the disk for its root filesystem.
        /// </summary>
        public readonly bool? Boot;
        /// <summary>
        /// Specifies a unique device name of your choice.
        /// </summary>
        public readonly string? DeviceName;
        /// <summary>
        /// Specifies the parameters for a new disk that will be created alongside the new instance. Use initialization parameters to create boot disks or local SSDs attached to the new instance.
        /// </summary>
        public readonly ImmutableArray<Outputs.ElastigroupDiskInitializeParam> InitializeParams;
        /// <summary>
        /// Specifies the disk interface to use for attaching this disk, which is either SCSI or NVME.
        /// </summary>
        public readonly string? Interface;
        /// <summary>
        /// The mode in which to attach this disk, either READ_WRITE or READ_ONLY.
        /// </summary>
        public readonly string? Mode;
        /// <summary>
        /// Specifies a valid partial or full URL to an existing Persistent Disk resource. This field is only applicable for persistent disks.
        /// </summary>
        public readonly string? Source;
        /// <summary>
        /// Specifies the type of disk, either SCRATCH or PERSISTENT.
        /// </summary>
        public readonly string? Type;

        [OutputConstructor]
        private ElastigroupDisk(
            bool? autoDelete,

            bool? boot,

            string? deviceName,

            ImmutableArray<Outputs.ElastigroupDiskInitializeParam> initializeParams,

            string? @interface,

            string? mode,

            string? source,

            string? type)
        {
            AutoDelete = autoDelete;
            Boot = boot;
            DeviceName = deviceName;
            InitializeParams = initializeParams;
            Interface = @interface;
            Mode = mode;
            Source = source;
            Type = type;
        }
    }
}
