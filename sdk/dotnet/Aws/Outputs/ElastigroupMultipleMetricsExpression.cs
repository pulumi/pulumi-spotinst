// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Outputs
{

    [OutputType]
    public sealed class ElastigroupMultipleMetricsExpression
    {
        /// <summary>
        /// An expression consisting of the metric names listed in the 'metrics' array.
        /// </summary>
        public readonly string Expression;
        /// <summary>
        /// The group name.
        /// </summary>
        public readonly string Name;

        [OutputConstructor]
        private ElastigroupMultipleMetricsExpression(
            string expression,

            string name)
        {
            Expression = expression;
            Name = name;
        }
    }
}
