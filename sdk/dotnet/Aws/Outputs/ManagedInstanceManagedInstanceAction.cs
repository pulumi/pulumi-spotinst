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
    public sealed class ManagedInstanceManagedInstanceAction
    {
        /// <summary>
        /// The resource type. Valid Values: CLASSIC, TARGET_GROUP, MULTAI_TARGET_SET.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private ManagedInstanceManagedInstanceAction(string type)
        {
            Type = type;
        }
    }
}
