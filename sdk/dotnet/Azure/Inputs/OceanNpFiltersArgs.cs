// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Azure.Inputs
{

    public sealed class OceanNpFiltersArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// In case acceleratedNetworking is set to Enabled, accelerated networking applies only to the VM that enables it.
        /// </summary>
        [Input("acceleratedNetworking")]
        public Input<string>? AcceleratedNetworking { get; set; }

        [Input("architectures")]
        private InputList<string>? _architectures;

        /// <summary>
        /// The filtered vm sizes will support at least one of the architectures from this list. x86_64 includes both intel64 and amd64.
        /// </summary>
        public InputList<string> Architectures
        {
            get => _architectures ?? (_architectures = new InputList<string>());
            set => _architectures = value;
        }

        /// <summary>
        /// The filtered vm sizes will support at least one of the classes from this list.
        /// </summary>
        [Input("diskPerformance")]
        public Input<string>? DiskPerformance { get; set; }

        [Input("excludeSeries")]
        private InputList<string>? _excludeSeries;

        /// <summary>
        /// Vm sizes belonging to a series from the list will not be available for scaling
        /// </summary>
        public InputList<string> ExcludeSeries
        {
            get => _excludeSeries ?? (_excludeSeries = new InputList<string>());
            set => _excludeSeries = value;
        }

        [Input("gpuTypes")]
        private InputList<string>? _gpuTypes;

        /// <summary>
        /// The filtered gpu types will belong to one of the gpu types from this list.
        /// </summary>
        public InputList<string> GpuTypes
        {
            get => _gpuTypes ?? (_gpuTypes = new InputList<string>());
            set => _gpuTypes = value;
        }

        /// <summary>
        /// Maximum number of GPUs available.
        /// </summary>
        [Input("maxGpu")]
        public Input<double>? MaxGpu { get; set; }

        /// <summary>
        /// Maximum amount of Memory (GiB).
        /// </summary>
        [Input("maxMemoryGib")]
        public Input<double>? MaxMemoryGib { get; set; }

        /// <summary>
        /// Maximum number of vcpus available.
        /// </summary>
        [Input("maxVcpu")]
        public Input<int>? MaxVcpu { get; set; }

        /// <summary>
        /// Minimum number of data disks available.
        /// </summary>
        [Input("minDisk")]
        public Input<int>? MinDisk { get; set; }

        /// <summary>
        /// Minimum number of GPUs available.
        /// </summary>
        [Input("minGpu")]
        public Input<double>? MinGpu { get; set; }

        /// <summary>
        /// Minimum amount of Memory (GiB).
        /// </summary>
        [Input("minMemoryGib")]
        public Input<double>? MinMemoryGib { get; set; }

        /// <summary>
        /// Minimum number of network interfaces.
        /// </summary>
        [Input("minNics")]
        public Input<int>? MinNics { get; set; }

        /// <summary>
        /// Minimum number of vcpus available.
        /// </summary>
        [Input("minVcpu")]
        public Input<int>? MinVcpu { get; set; }

        [Input("series")]
        private InputList<string>? _series;

        /// <summary>
        /// Vm sizes belonging to a series from the list will be available for scaling. We can specify include list and series can be specified with capital or small letters, with space, without space or with underscore '_' .  For example all of these "DSv2", "Ds v2", "ds_v2" refer to same DS_v2 series.
        /// </summary>
        public InputList<string> Series
        {
            get => _series ?? (_series = new InputList<string>());
            set => _series = value;
        }

        [Input("vmTypes")]
        private InputList<string>? _vmTypes;

        /// <summary>
        /// The filtered vm types will belong to one of the vm types from this list.
        /// </summary>
        public InputList<string> VmTypes
        {
            get => _vmTypes ?? (_vmTypes = new InputList<string>());
            set => _vmTypes = value;
        }

        public OceanNpFiltersArgs()
        {
        }
        public static new OceanNpFiltersArgs Empty => new OceanNpFiltersArgs();
    }
}
