// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Spark.Inputs
{

    public sealed class OceanSparkGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("additionalAppNamespaces")]
        private InputList<string>? _additionalAppNamespaces;

        /// <summary>
        /// - List of Kubernetes namespaces that should be configured to run Spark applications, in addition to the default Spark application namespace `spark-apps`.
        /// </summary>
        public InputList<string> AdditionalAppNamespaces
        {
            get => _additionalAppNamespaces ?? (_additionalAppNamespaces = new InputList<string>());
            set => _additionalAppNamespaces = value;
        }

        public OceanSparkGetArgs()
        {
        }
        public static new OceanSparkGetArgs Empty => new OceanSparkGetArgs();
    }
}