// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class ElastigroupIntegrationBeanstalkManagedActionsPlatformUpdateGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// In the event of a fallback to On-Demand instances, select the time period to revert back to Spot. Supported Arguments – always (default), timeWindow, never. For timeWindow or never to be valid the group must have availabilityOriented OR persistence defined.
        /// </summary>
        [Input("performAt")]
        public Input<string>? PerformAt { get; set; }

        /// <summary>
        /// Time Window for when action occurs ex. Mon:23:50-Tue:00:20
        /// </summary>
        [Input("timeWindow")]
        public Input<string>? TimeWindow { get; set; }

        /// <summary>
        /// Level to update
        /// </summary>
        [Input("updateLevel")]
        public Input<string>? UpdateLevel { get; set; }

        public ElastigroupIntegrationBeanstalkManagedActionsPlatformUpdateGetArgs()
        {
        }
        public static new ElastigroupIntegrationBeanstalkManagedActionsPlatformUpdateGetArgs Empty => new ElastigroupIntegrationBeanstalkManagedActionsPlatformUpdateGetArgs();
    }
}
