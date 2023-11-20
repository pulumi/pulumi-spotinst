// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Azure.Outputs
{

    [OutputType]
    public sealed class OceanNpVirtualNodeGroupFilters
    {
        public readonly string? AcceleratedNetworking;
        public readonly ImmutableArray<string> Architectures;
        public readonly string? DiskPerformance;
        public readonly ImmutableArray<string> ExcludeSeries;
        public readonly double? MaxGpu;
        public readonly double? MaxMemoryGib;
        public readonly int? MaxVcpu;
        public readonly int? MinDisk;
        public readonly double? MinGpu;
        public readonly double? MinMemoryGib;
        public readonly int? MinNics;
        public readonly int? MinVcpu;
        public readonly ImmutableArray<string> Series;
        public readonly ImmutableArray<string> VmTypes;

        [OutputConstructor]
        private OceanNpVirtualNodeGroupFilters(
            string? acceleratedNetworking,

            ImmutableArray<string> architectures,

            string? diskPerformance,

            ImmutableArray<string> excludeSeries,

            double? maxGpu,

            double? maxMemoryGib,

            int? maxVcpu,

            int? minDisk,

            double? minGpu,

            double? minMemoryGib,

            int? minNics,

            int? minVcpu,

            ImmutableArray<string> series,

            ImmutableArray<string> vmTypes)
        {
            AcceleratedNetworking = acceleratedNetworking;
            Architectures = architectures;
            DiskPerformance = diskPerformance;
            ExcludeSeries = excludeSeries;
            MaxGpu = maxGpu;
            MaxMemoryGib = maxMemoryGib;
            MaxVcpu = maxVcpu;
            MinDisk = minDisk;
            MinGpu = minGpu;
            MinMemoryGib = minMemoryGib;
            MinNics = minNics;
            MinVcpu = minVcpu;
            Series = series;
            VmTypes = vmTypes;
        }
    }
}
