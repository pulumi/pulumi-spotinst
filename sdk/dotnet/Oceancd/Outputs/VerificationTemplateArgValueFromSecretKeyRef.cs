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
    public sealed class VerificationTemplateArgValueFromSecretKeyRef
    {
        /// <summary>
        /// The name of the field inside the secret.
        /// </summary>
        public readonly string Key;
        /// <summary>
        /// The name of the secret.
        /// </summary>
        public readonly string Name;

        [OutputConstructor]
        private VerificationTemplateArgValueFromSecretKeyRef(
            string key,

            string name)
        {
            Key = key;
            Name = name;
        }
    }
}
