// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Outputs
{

    [OutputType]
    public sealed class OceanLaunchSpecResourceLimit
    {
        /// <summary>
        /// Set a maximum number of instances per Virtual Node Group. Can be null. If set, value must be greater than or equal to 0.
        /// </summary>
        public readonly int? MaxInstanceCount;
        /// <summary>
        /// Set a minimum number of instances per Virtual Node Group. Can be null. If set, value must be greater than or equal to 0.
        /// </summary>
        public readonly int? MinInstanceCount;

        [OutputConstructor]
        private OceanLaunchSpecResourceLimit(
            int? maxInstanceCount,

            int? minInstanceCount)
        {
            MaxInstanceCount = maxInstanceCount;
            MinInstanceCount = minInstanceCount;
        }
    }
}