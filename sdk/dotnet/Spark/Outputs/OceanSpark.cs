// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Spark.Outputs
{

    [OutputType]
    public sealed class OceanSpark
    {
        /// <summary>
        /// - List of Kubernetes namespaces that should be configured to run Spark applications, in addition to the default Spark application namespace `spark-apps`.
        /// </summary>
        public readonly ImmutableArray<string> AdditionalAppNamespaces;

        [OutputConstructor]
        private OceanSpark(ImmutableArray<string> additionalAppNamespaces)
        {
            AdditionalAppNamespaces = additionalAppNamespaces;
        }
    }
}
