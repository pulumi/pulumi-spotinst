// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Oceancd.Inputs
{

    public sealed class VerificationTemplateMetricProviderJobSpecJobTemplateTemplateSpecContainerArgs : global::Pulumi.ResourceArgs
    {
        [Input("commands", required: true)]
        private InputList<string>? _commands;
        public InputList<string> Commands
        {
            get => _commands ?? (_commands = new InputList<string>());
            set => _commands = value;
        }

        [Input("containerName", required: true)]
        public Input<string> ContainerName { get; set; } = null!;

        [Input("image", required: true)]
        public Input<string> Image { get; set; } = null!;

        public VerificationTemplateMetricProviderJobSpecJobTemplateTemplateSpecContainerArgs()
        {
        }
        public static new VerificationTemplateMetricProviderJobSpecJobTemplateTemplateSpecContainerArgs Empty => new VerificationTemplateMetricProviderJobSpecJobTemplateTemplateSpecContainerArgs();
    }
}
