// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Oceancd.Inputs
{

    public sealed class StrategyCanaryBackgroundVerificationGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("templateNames", required: true)]
        private InputList<string>? _templateNames;

        /// <summary>
        /// List of Verification Template names.
        /// </summary>
        public InputList<string> TemplateNames
        {
            get => _templateNames ?? (_templateNames = new InputList<string>());
            set => _templateNames = value;
        }

        public StrategyCanaryBackgroundVerificationGetArgs()
        {
        }
        public static new StrategyCanaryBackgroundVerificationGetArgs Empty => new StrategyCanaryBackgroundVerificationGetArgs();
    }
}
