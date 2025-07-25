// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class ElastigroupCpuOptionsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ability to define the number of threads per core in instances that allow this.
        /// </summary>
        [Input("threadsPerCore", required: true)]
        public Input<int> ThreadsPerCore { get; set; } = null!;

        public ElastigroupCpuOptionsArgs()
        {
        }
        public static new ElastigroupCpuOptionsArgs Empty => new ElastigroupCpuOptionsArgs();
    }
}
