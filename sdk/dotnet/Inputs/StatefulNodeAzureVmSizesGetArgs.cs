// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Inputs
{

    public sealed class StatefulNodeAzureVmSizesGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("odSizes", required: true)]
        private InputList<string>? _odSizes;
        public InputList<string> OdSizes
        {
            get => _odSizes ?? (_odSizes = new InputList<string>());
            set => _odSizes = value;
        }

        [Input("preferredSpotSizes")]
        private InputList<string>? _preferredSpotSizes;
        public InputList<string> PreferredSpotSizes
        {
            get => _preferredSpotSizes ?? (_preferredSpotSizes = new InputList<string>());
            set => _preferredSpotSizes = value;
        }

        [Input("spotSizes", required: true)]
        private InputList<string>? _spotSizes;
        public InputList<string> SpotSizes
        {
            get => _spotSizes ?? (_spotSizes = new InputList<string>());
            set => _spotSizes = value;
        }

        public StatefulNodeAzureVmSizesGetArgs()
        {
        }
        public static new StatefulNodeAzureVmSizesGetArgs Empty => new StatefulNodeAzureVmSizesGetArgs();
    }
}
