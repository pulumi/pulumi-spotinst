// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Oceancd.Outputs
{

    [OutputType]
    public sealed class RolloutSpecStrategyArgValueFrom
    {
        /// <summary>
        /// Defines the field path from where to get the value of an argument.
        /// </summary>
        public readonly Outputs.RolloutSpecStrategyArgValueFromFieldRef FieldRef;

        [OutputConstructor]
        private RolloutSpecStrategyArgValueFrom(Outputs.RolloutSpecStrategyArgValueFromFieldRef fieldRef)
        {
            FieldRef = fieldRef;
        }
    }
}
