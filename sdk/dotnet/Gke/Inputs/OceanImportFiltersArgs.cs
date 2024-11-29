// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Gke.Inputs
{

    public sealed class OceanImportFiltersArgs : global::Pulumi.ResourceArgs
    {
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
        /// Minimum amount of Memory (GiB).
        /// </summary>
        [Input("minMemoryGib")]
        public Input<double>? MinMemoryGib { get; set; }

        /// <summary>
        /// Minimum number of vcpus available.
        /// </summary>
        [Input("minVcpu")]
        public Input<int>? MinVcpu { get; set; }

        public OceanImportFiltersArgs()
        {
        }
        public static new OceanImportFiltersArgs Empty => new OceanImportFiltersArgs();
    }
}