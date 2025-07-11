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
    public sealed class OceanScheduledTaskTaskParametersAmiAutoUpdate
    {
        /// <summary>
        /// Set clusterRoll object
        /// </summary>
        public readonly Outputs.OceanScheduledTaskTaskParametersAmiAutoUpdateAmiAutoUpdateClusterRoll? AmiAutoUpdateClusterRoll;
        /// <summary>
        /// When the AMI is updated according to the configuration set, a cluster roll can be triggered
        /// </summary>
        public readonly bool? ApplyRoll;
        /// <summary>
        /// When set to 'true', the auto-update process will update the VNGs’ AMI with the AMI to match the Kubernetes control plane version. either "patch" or "minor_version" must be true.
        /// </summary>
        public readonly bool? MinorVersion;
        /// <summary>
        /// When set to 'true', the auto-update process will update the VNGs’ images with the latest security patches. either "patch" or "minorVersion" must be true.
        /// </summary>
        public readonly bool? Patch;

        [OutputConstructor]
        private OceanScheduledTaskTaskParametersAmiAutoUpdate(
            Outputs.OceanScheduledTaskTaskParametersAmiAutoUpdateAmiAutoUpdateClusterRoll? amiAutoUpdateClusterRoll,

            bool? applyRoll,

            bool? minorVersion,

            bool? patch)
        {
            AmiAutoUpdateClusterRoll = amiAutoUpdateClusterRoll;
            ApplyRoll = applyRoll;
            MinorVersion = minorVersion;
            Patch = patch;
        }
    }
}
