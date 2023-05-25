// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class ElastigroupEphemeralBlockDeviceGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the block device to mount on the instance.
        /// </summary>
        [Input("deviceName", required: true)]
        public Input<string> DeviceName { get; set; } = null!;

        /// <summary>
        /// The [Instance Store Device Name](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html#InstanceStoreDeviceNames)
        /// (e.g. `"ephemeral0"`).
        /// 
        /// Usage:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        /// });
        /// ```
        /// </summary>
        [Input("virtualName", required: true)]
        public Input<string> VirtualName { get; set; } = null!;

        public ElastigroupEphemeralBlockDeviceGetArgs()
        {
        }
        public static new ElastigroupEphemeralBlockDeviceGetArgs Empty => new ElastigroupEphemeralBlockDeviceGetArgs();
    }
}
