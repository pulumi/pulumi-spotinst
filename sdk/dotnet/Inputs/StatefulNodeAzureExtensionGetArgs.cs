// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Inputs
{

    public sealed class StatefulNodeAzureExtensionGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("apiVersion", required: true)]
        public Input<string> ApiVersion { get; set; } = null!;

        [Input("minorVersionAutoUpgrade", required: true)]
        public Input<bool> MinorVersionAutoUpgrade { get; set; } = null!;

        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("protectedSettings")]
        private InputMap<object>? _protectedSettings;
        public InputMap<object> ProtectedSettings
        {
            get => _protectedSettings ?? (_protectedSettings = new InputMap<object>());
            set => _protectedSettings = value;
        }

        [Input("publicSettings")]
        private InputMap<object>? _publicSettings;
        public InputMap<object> PublicSettings
        {
            get => _publicSettings ?? (_publicSettings = new InputMap<object>());
            set => _publicSettings = value;
        }

        [Input("publisher", required: true)]
        public Input<string> Publisher { get; set; } = null!;

        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public StatefulNodeAzureExtensionGetArgs()
        {
        }
        public static new StatefulNodeAzureExtensionGetArgs Empty => new StatefulNodeAzureExtensionGetArgs();
    }
}
