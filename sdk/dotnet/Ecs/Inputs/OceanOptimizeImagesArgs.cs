// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Ecs.Inputs
{

    public sealed class OceanOptimizeImagesArgs : global::Pulumi.ResourceArgs
    {
        [Input("performAt", required: true)]
        public Input<string> PerformAt { get; set; } = null!;

        [Input("shouldOptimizeEcsAmi", required: true)]
        public Input<bool> ShouldOptimizeEcsAmi { get; set; } = null!;

        [Input("timeWindows")]
        private InputList<string>? _timeWindows;
        public InputList<string> TimeWindows
        {
            get => _timeWindows ?? (_timeWindows = new InputList<string>());
            set => _timeWindows = value;
        }

        public OceanOptimizeImagesArgs()
        {
        }
        public static new OceanOptimizeImagesArgs Empty => new OceanOptimizeImagesArgs();
    }
}