// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Oceancd.Inputs
{

    public sealed class StrategyCanaryStepVerificationGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("templateNames", required: true)]
        private InputList<string>? _templateNames;
        public InputList<string> TemplateNames
        {
            get => _templateNames ?? (_templateNames = new InputList<string>());
            set => _templateNames = value;
        }

        public StrategyCanaryStepVerificationGetArgs()
        {
        }
        public static new StrategyCanaryStepVerificationGetArgs Empty => new StrategyCanaryStepVerificationGetArgs();
    }
}
