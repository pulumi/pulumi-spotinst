// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class OceanLaunchSpecDeleteOptionsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// When set to "true", all instances belonging to the deleted launch specification will be drained, detached, and terminated.
        /// </summary>
        [Input("deleteNodes")]
        public Input<bool>? DeleteNodes { get; set; }

        /// <summary>
        /// When set to `true`, delete even if it is the last Virtual Node Group (also, the default Virtual Node Group must be configured with `useAsTemlateOnly = true`). Should be set at creation or update, but will be used only at deletion.
        /// </summary>
        [Input("forceDelete", required: true)]
        public Input<bool> ForceDelete { get; set; } = null!;

        public OceanLaunchSpecDeleteOptionsArgs()
        {
        }
        public static new OceanLaunchSpecDeleteOptionsArgs Empty => new OceanLaunchSpecDeleteOptionsArgs();
    }
}
