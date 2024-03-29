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
    public sealed class ElastigroupIntegrationBeanstalkManagedActionsPlatformUpdate
    {
        /// <summary>
        /// In the event of a fallback to On-Demand instances, select the time period to revert back to Spot. Supported Arguments – always (default), timeWindow, never. For timeWindow or never to be valid the group must have availabilityOriented OR persistence defined.
        /// </summary>
        public readonly string? PerformAt;
        /// <summary>
        /// Time Window for when action occurs ex. Mon:23:50-Tue:00:20
        /// </summary>
        public readonly string? TimeWindow;
        /// <summary>
        /// Level to update
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
        public readonly string? UpdateLevel;

        [OutputConstructor]
        private ElastigroupIntegrationBeanstalkManagedActionsPlatformUpdate(
            string? performAt,

            string? timeWindow,

            string? updateLevel)
        {
            PerformAt = performAt;
            TimeWindow = timeWindow;
            UpdateLevel = updateLevel;
        }
    }
}
