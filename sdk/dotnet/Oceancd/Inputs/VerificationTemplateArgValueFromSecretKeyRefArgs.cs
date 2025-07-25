// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Oceancd.Inputs
{

    public sealed class VerificationTemplateArgValueFromSecretKeyRefArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the field inside the secret.
        /// </summary>
        [Input("key", required: true)]
        public Input<string> Key { get; set; } = null!;

        /// <summary>
        /// The name of the secret.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public VerificationTemplateArgValueFromSecretKeyRefArgs()
        {
        }
        public static new VerificationTemplateArgValueFromSecretKeyRefArgs Empty => new VerificationTemplateArgValueFromSecretKeyRefArgs();
    }
}
