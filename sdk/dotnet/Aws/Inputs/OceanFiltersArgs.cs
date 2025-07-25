// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class OceanFiltersArgs : global::Pulumi.ResourceArgs
    {
        [Input("architectures")]
        private InputList<string>? _architectures;

        /// <summary>
        /// The filtered instance types will support at least one of the architectures from this list.
        /// </summary>
        public InputList<string> Architectures
        {
            get => _architectures ?? (_architectures = new InputList<string>());
            set => _architectures = value;
        }

        [Input("categories")]
        private InputList<string>? _categories;

        /// <summary>
        /// The filtered instance types will belong to one of the categories types from this list.
        /// </summary>
        public InputList<string> Categories
        {
            get => _categories ?? (_categories = new InputList<string>());
            set => _categories = value;
        }

        [Input("diskTypes")]
        private InputList<string>? _diskTypes;

        /// <summary>
        /// The filtered instance types will have one of the disk type from this list.
        /// </summary>
        public InputList<string> DiskTypes
        {
            get => _diskTypes ?? (_diskTypes = new InputList<string>());
            set => _diskTypes = value;
        }

        [Input("excludeFamilies")]
        private InputList<string>? _excludeFamilies;

        /// <summary>
        /// Types belonging to a family from the ExcludeFamilies will not be available for scaling (asterisk wildcard is also supported). For example, C* will exclude instance types from these families: c5, c4, c4a, etc.
        /// </summary>
        public InputList<string> ExcludeFamilies
        {
            get => _excludeFamilies ?? (_excludeFamilies = new InputList<string>());
            set => _excludeFamilies = value;
        }

        /// <summary>
        /// In case excludeMetal is set to true, metal types will not be available for scaling.
        /// </summary>
        [Input("excludeMetal")]
        public Input<bool>? ExcludeMetal { get; set; }

        [Input("hypervisors")]
        private InputList<string>? _hypervisors;

        /// <summary>
        /// The filtered instance types will have a hypervisor type from this list.
        /// </summary>
        public InputList<string> Hypervisors
        {
            get => _hypervisors ?? (_hypervisors = new InputList<string>());
            set => _hypervisors = value;
        }

        [Input("includeFamilies")]
        private InputList<string>? _includeFamilies;

        /// <summary>
        /// Types belonging to a family from the IncludeFamilies will be available for scaling (asterisk wildcard is also supported). For example, C* will include instance types from these families: c5, c4, c4a, etc.
        /// </summary>
        public InputList<string> IncludeFamilies
        {
            get => _includeFamilies ?? (_includeFamilies = new InputList<string>());
            set => _includeFamilies = value;
        }

        /// <summary>
        /// Ena is supported or not.
        /// </summary>
        [Input("isEnaSupported")]
        public Input<string>? IsEnaSupported { get; set; }

        /// <summary>
        /// Maximum total number of GPUs.
        /// </summary>
        [Input("maxGpu")]
        public Input<int>? MaxGpu { get; set; }

        [Input("maxMemoryGib")]
        public Input<double>? MaxMemoryGib { get; set; }

        /// <summary>
        /// Maximum Bandwidth in Gib/s of network performance.
        /// </summary>
        [Input("maxNetworkPerformance")]
        public Input<int>? MaxNetworkPerformance { get; set; }

        [Input("maxVcpu")]
        public Input<int>? MaxVcpu { get; set; }

        /// <summary>
        /// Minimum number of network interfaces (ENIs).
        /// </summary>
        [Input("minEnis")]
        public Input<int>? MinEnis { get; set; }

        /// <summary>
        /// Minimum total number of GPUs.
        /// </summary>
        [Input("minGpu")]
        public Input<int>? MinGpu { get; set; }

        /// <summary>
        /// Minimum amount of Memory (GiB).
        /// </summary>
        [Input("minMemoryGib")]
        public Input<double>? MinMemoryGib { get; set; }

        /// <summary>
        /// Minimum Bandwidth in Gib/s of network performance.
        /// </summary>
        [Input("minNetworkPerformance")]
        public Input<int>? MinNetworkPerformance { get; set; }

        /// <summary>
        /// Minimum number of vcpus available.
        /// </summary>
        [Input("minVcpu")]
        public Input<int>? MinVcpu { get; set; }

        [Input("rootDeviceTypes")]
        private InputList<string>? _rootDeviceTypes;

        /// <summary>
        /// The filtered instance types will have a root device types from this list.
        /// </summary>
        public InputList<string> RootDeviceTypes
        {
            get => _rootDeviceTypes ?? (_rootDeviceTypes = new InputList<string>());
            set => _rootDeviceTypes = value;
        }

        [Input("virtualizationTypes")]
        private InputList<string>? _virtualizationTypes;

        /// <summary>
        /// The filtered instance types will support at least one of the virtualization types from this list.
        /// </summary>
        public InputList<string> VirtualizationTypes
        {
            get => _virtualizationTypes ?? (_virtualizationTypes = new InputList<string>());
            set => _virtualizationTypes = value;
        }

        public OceanFiltersArgs()
        {
        }
        public static new OceanFiltersArgs Empty => new OceanFiltersArgs();
    }
}
