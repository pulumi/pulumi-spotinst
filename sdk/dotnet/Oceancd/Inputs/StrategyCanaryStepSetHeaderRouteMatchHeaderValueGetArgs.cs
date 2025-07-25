// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Oceancd.Inputs
{

    public sealed class StrategyCanaryStepSetHeaderRouteMatchHeaderValueGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The exact header value.
        /// </summary>
        [Input("exact")]
        public Input<string>? Exact { get; set; }

        /// <summary>
        /// The prefix of the value.
        /// </summary>
        [Input("prefix")]
        public Input<string>? Prefix { get; set; }

        /// <summary>
        /// The value in a regex format.
        /// </summary>
        [Input("regex")]
        public Input<string>? Regex { get; set; }

        public StrategyCanaryStepSetHeaderRouteMatchHeaderValueGetArgs()
        {
        }
        public static new StrategyCanaryStepSetHeaderRouteMatchHeaderValueGetArgs Empty => new StrategyCanaryStepSetHeaderRouteMatchHeaderValueGetArgs();
    }
}
