// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class MrScalarApplicationGetArgs : Pulumi.ResourceArgs
    {
        [Input("args")]
        private InputList<string>? _args;

        /// <summary>
        /// Arguments for EMR to pass to the application.
        /// </summary>
        public InputList<string> Args
        {
            get => _args ?? (_args = new InputList<string>());
            set => _args = value;
        }

        /// <summary>
        /// The application name.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// T he version of the application.
        /// </summary>
        [Input("version")]
        public Input<string>? Version { get; set; }

        public MrScalarApplicationGetArgs()
        {
        }
    }
}
