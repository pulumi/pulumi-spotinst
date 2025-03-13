// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class ElastigroupAvailabilityZoneGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Availability Zone name.
        /// </summary>
        [Input("availabilityZonesName", required: true)]
        public Input<string> AvailabilityZonesName { get; set; } = null!;

        /// <summary>
        /// specify a Placement Group name, the instances will be launched in the Placement Group for the AZ.
        /// </summary>
        [Input("placementGroupName")]
        public Input<string>? PlacementGroupName { get; set; }

        [Input("subnetIds")]
        private InputList<string>? _subnetIds;

        /// <summary>
        /// A comma-separated list of subnet identifiers for your group.
        /// </summary>
        public InputList<string> SubnetIds
        {
            get => _subnetIds ?? (_subnetIds = new InputList<string>());
            set => _subnetIds = value;
        }

        public ElastigroupAvailabilityZoneGetArgs()
        {
        }
        public static new ElastigroupAvailabilityZoneGetArgs Empty => new ElastigroupAvailabilityZoneGetArgs();
    }
}
