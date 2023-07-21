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
    public sealed class OceanResourceTagSpecification
    {
        /// <summary>
        /// Specify if Volume resources will be tagged with Virtual Node Group tags or Ocean tags.
        /// </summary>
        public readonly bool? ShouldTagVolumes;

        [OutputConstructor]
        private OceanResourceTagSpecification(bool? shouldTagVolumes)
        {
            ShouldTagVolumes = shouldTagVolumes;
        }
    }
}
