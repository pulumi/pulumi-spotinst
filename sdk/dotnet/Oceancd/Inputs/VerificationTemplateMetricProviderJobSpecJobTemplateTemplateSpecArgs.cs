// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Oceancd.Inputs
{

    public sealed class VerificationTemplateMetricProviderJobSpecJobTemplateTemplateSpecArgs : global::Pulumi.ResourceArgs
    {
        [Input("containers", required: true)]
        private InputList<Inputs.VerificationTemplateMetricProviderJobSpecJobTemplateTemplateSpecContainerArgs>? _containers;
        public InputList<Inputs.VerificationTemplateMetricProviderJobSpecJobTemplateTemplateSpecContainerArgs> Containers
        {
            get => _containers ?? (_containers = new InputList<Inputs.VerificationTemplateMetricProviderJobSpecJobTemplateTemplateSpecContainerArgs>());
            set => _containers = value;
        }

        [Input("restartPolicy", required: true)]
        public Input<string> RestartPolicy { get; set; } = null!;

        public VerificationTemplateMetricProviderJobSpecJobTemplateTemplateSpecArgs()
        {
        }
        public static new VerificationTemplateMetricProviderJobSpecJobTemplateTemplateSpecArgs Empty => new VerificationTemplateMetricProviderJobSpecJobTemplateTemplateSpecArgs();
    }
}
