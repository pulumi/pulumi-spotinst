// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Outputs
{

    [OutputType]
    public sealed class ElastigroupEphemeralBlockDevice
    {
        /// <summary>
        /// The name of the block device to mount on the instance.
        /// </summary>
        public readonly string DeviceName;
        /// <summary>
        /// The [Instance Store Device Name](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html#InstanceStoreDeviceNames)
        /// (e.g. `"ephemeral0"`).
        /// 
        /// Usage:
        /// 
        /// &lt;!--Start PulumiCodeChooser --&gt;
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public readonly string VirtualName;

        [OutputConstructor]
        private ElastigroupEphemeralBlockDevice(
            string deviceName,

            string virtualName)
        {
            DeviceName = deviceName;
            VirtualName = virtualName;
        }
    }
}
