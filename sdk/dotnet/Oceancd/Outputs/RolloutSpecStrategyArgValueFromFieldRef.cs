// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Oceancd.Outputs
{

    [OutputType]
    public sealed class RolloutSpecStrategyArgValueFromFieldRef
    {
        /// <summary>
        /// Path to SpotDeployment's field from where to get the value of an argument.
        /// </summary>
        public readonly string FieldPath;

        [OutputConstructor]
        private RolloutSpecStrategyArgValueFromFieldRef(string fieldPath)
        {
            FieldPath = fieldPath;
        }
    }
}
