// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class ElastigroupImageGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("images", required: true)]
        private InputList<Inputs.ElastigroupImageImageGetArgs>? _images;
        public InputList<Inputs.ElastigroupImageImageGetArgs> Images
        {
            get => _images ?? (_images = new InputList<Inputs.ElastigroupImageImageGetArgs>());
            set => _images = value;
        }

        public ElastigroupImageGetArgs()
        {
        }
        public static new ElastigroupImageGetArgs Empty => new ElastigroupImageGetArgs();
    }
}
