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
    public sealed class OceanLaunchSpecDeleteOptions
    {
        /// <summary>
        /// When set to "true", all instances belonging to the deleted launch specification will be drained, detached, and terminated.
        /// </summary>
        public readonly bool? DeleteNodes;
        /// <summary>
        /// When set to `true`, delete even if it is the last Virtual Node Group (also, the default Virtual Node Group must be configured with `useAsTemlateOnly = true`). Should be set at creation or update, but will be used only at deletion.
        /// </summary>
        public readonly bool ForceDelete;

        [OutputConstructor]
        private OceanLaunchSpecDeleteOptions(
            bool? deleteNodes,

            bool forceDelete)
        {
            DeleteNodes = deleteNodes;
            ForceDelete = forceDelete;
        }
    }
}
