// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class BeanstalkManagedActionsPlatformUpdateArgs : global::Pulumi.ResourceArgs
    {
        [Input("performAt")]
        public Input<string>? PerformAt { get; set; }

        [Input("timeWindow")]
        public Input<string>? TimeWindow { get; set; }

        [Input("updateLevel")]
        public Input<string>? UpdateLevel { get; set; }

        public BeanstalkManagedActionsPlatformUpdateArgs()
        {
        }
        public static new BeanstalkManagedActionsPlatformUpdateArgs Empty => new BeanstalkManagedActionsPlatformUpdateArgs();
    }
}
