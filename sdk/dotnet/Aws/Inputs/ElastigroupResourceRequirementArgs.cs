// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class ElastigroupResourceRequirementArgs : global::Pulumi.ResourceArgs
    {
        [Input("excludedInstanceFamilies")]
        private InputList<string>? _excludedInstanceFamilies;

        /// <summary>
        /// Instance families to exclude
        /// </summary>
        public InputList<string> ExcludedInstanceFamilies
        {
            get => _excludedInstanceFamilies ?? (_excludedInstanceFamilies = new InputList<string>());
            set => _excludedInstanceFamilies = value;
        }

        [Input("excludedInstanceGenerations")]
        private InputList<string>? _excludedInstanceGenerations;

        /// <summary>
        /// Instance generations to exclude
        /// </summary>
        public InputList<string> ExcludedInstanceGenerations
        {
            get => _excludedInstanceGenerations ?? (_excludedInstanceGenerations = new InputList<string>());
            set => _excludedInstanceGenerations = value;
        }

        [Input("excludedInstanceTypes")]
        private InputList<string>? _excludedInstanceTypes;

        /// <summary>
        /// Instance types to exclude
        /// </summary>
        public InputList<string> ExcludedInstanceTypes
        {
            get => _excludedInstanceTypes ?? (_excludedInstanceTypes = new InputList<string>());
            set => _excludedInstanceTypes = value;
        }

        /// <summary>
        /// Required maximum instance GPU (&lt;=16)
        /// </summary>
        [Input("requiredGpuMaximum")]
        public Input<int>? RequiredGpuMaximum { get; set; }

        /// <summary>
        /// Required minimum instance GPU (&gt;=1)
        /// </summary>
        [Input("requiredGpuMinimum")]
        public Input<int>? RequiredGpuMinimum { get; set; }

        /// <summary>
        /// Required maximum instance memory (&lt;=512)
        /// </summary>
        [Input("requiredMemoryMaximum", required: true)]
        public Input<int> RequiredMemoryMaximum { get; set; } = null!;

        /// <summary>
        /// Required minimum instance memory (&gt;=1)
        /// </summary>
        [Input("requiredMemoryMinimum", required: true)]
        public Input<int> RequiredMemoryMinimum { get; set; } = null!;

        /// <summary>
        /// Required maximum instance vCPU (&lt;=64)
        /// </summary>
        [Input("requiredVcpuMaximum", required: true)]
        public Input<int> RequiredVcpuMaximum { get; set; } = null!;

        /// <summary>
        /// Required minimum instance vCPU (&gt;=1)
        /// </summary>
        [Input("requiredVcpuMinimum", required: true)]
        public Input<int> RequiredVcpuMinimum { get; set; } = null!;

        public ElastigroupResourceRequirementArgs()
        {
        }
        public static new ElastigroupResourceRequirementArgs Empty => new ElastigroupResourceRequirementArgs();
    }
}