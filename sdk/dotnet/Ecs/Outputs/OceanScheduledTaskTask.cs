// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Ecs.Outputs
{

    [OutputType]
    public sealed class OceanScheduledTaskTask
    {
        /// <summary>
        /// A valid cron expression. The cron is running in UTC time zone and is in Unix cron format Cron Expression Validator Script. Only one of `frequency` or `cronExpression` should be used at a time. Required for `cluster.scheduling.tasks` object. Example: `0 1 * * *`.
        /// </summary>
        public readonly string CronExpression;
        /// <summary>
        /// Enable the Ocean ECS autoscaler.
        /// </summary>
        public readonly bool IsEnabled;
        /// <summary>
        /// Valid values: "clusterRoll". Required for `cluster.scheduling.tasks object`. Example: `clusterRoll`.
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
        /// 
        /// 
        /// &lt;a id="attributes-reference"&gt;&lt;/a&gt;
        /// </summary>
        public readonly string TaskType;

        [OutputConstructor]
        private OceanScheduledTaskTask(
            string cronExpression,

            bool isEnabled,

            string taskType)
        {
            CronExpression = cronExpression;
            IsEnabled = isEnabled;
            TaskType = taskType;
        }
    }
}
