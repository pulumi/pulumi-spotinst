// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class ElastigroupRevertToSpotGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// In the event of a fallback to On-Demand instances, select the time period to revert back to Spot. Supported Arguments – always (default), timeWindow, never. For timeWindow or never to be valid the group must have availabilityOriented OR persistence defined.
        /// </summary>
        [Input("performAt", required: true)]
        public Input<string> PerformAt { get; set; } = null!;

        [Input("timeWindows")]
        private InputList<string>? _timeWindows;

        /// <summary>
        /// Specify a list of time windows for to execute revertToSpot strategy. Time window format: `ddd:hh:mm-ddd:hh:mm`. Example: `Mon:03:00-Wed:02:30`
        /// </summary>
        public InputList<string> TimeWindows
        {
            get => _timeWindows ?? (_timeWindows = new InputList<string>());
            set => _timeWindows = value;
        }

        public ElastigroupRevertToSpotGetArgs()
        {
        }
        public static new ElastigroupRevertToSpotGetArgs Empty => new ElastigroupRevertToSpotGetArgs();
    }
}
