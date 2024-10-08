// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Oceancd.Inputs
{

    public sealed class VerificationTemplateArgArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of an argument.
        /// </summary>
        [Input("argName", required: true)]
        public Input<string> ArgName { get; set; } = null!;

        /// <summary>
        /// String representation of data.
        /// </summary>
        [Input("value")]
        public Input<string>? Value { get; set; }

        /// <summary>
        /// ValueFrom object.
        /// </summary>
        [Input("valueFrom")]
        public Input<Inputs.VerificationTemplateArgValueFromArgs>? ValueFrom { get; set; }

        public VerificationTemplateArgArgs()
        {
        }
        public static new VerificationTemplateArgArgs Empty => new VerificationTemplateArgArgs();
    }
}