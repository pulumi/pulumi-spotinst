// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Oceancd
{
    /// <summary>
    /// Manages a Spotinst OceanCD Verfification Template resource.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using SpotInst = Pulumi.SpotInst;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var test = new SpotInst.Oceancd.VerificationTemplate("test", new()
    ///     {
    ///         Name = "test-verification-template-tes",
    ///         Args = new[]
    ///         {
    ///             new SpotInst.Oceancd.Inputs.VerificationTemplateArgArgs
    ///             {
    ///                 ArgName = "test-arg",
    ///                 Value = "test",
    ///                 ValueFrom = new SpotInst.Oceancd.Inputs.VerificationTemplateArgValueFromArgs
    ///                 {
    ///                     SecretKeyRef = new SpotInst.Oceancd.Inputs.VerificationTemplateArgValueFromSecretKeyRefArgs
    ///                     {
    ///                         Name = "test_key",
    ///                         Key = "key-value-test",
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///         Metrics = new[]
    ///         {
    ///             new SpotInst.Oceancd.Inputs.VerificationTemplateMetricArgs
    ///             {
    ///                 MetricsName = "test-metrics-names",
    ///                 DryRun = false,
    ///                 Interval = "10m",
    ///                 InitialDelay = "1m",
    ///                 Count = 10,
    ///                 SuccessCondition = "result[0] &lt;= 0.95",
    ///                 FailureCondition = "result[0] &gt;= 0.95",
    ///                 FailureLimit = 2,
    ///                 ConsecutiveErrorLimit = 1,
    ///                 Providers = new[]
    ///                 {
    ///                     new SpotInst.Oceancd.Inputs.VerificationTemplateMetricProviderArgs
    ///                     {
    ///                         Prometheus = new SpotInst.Oceancd.Inputs.VerificationTemplateMetricProviderPrometheusArgs
    ///                         {
    ///                             PrometheusQuery = "http_requests_new",
    ///                         },
    ///                         Datadog = new SpotInst.Oceancd.Inputs.VerificationTemplateMetricProviderDatadogArgs
    ///                         {
    ///                             Duration = "1m",
    ///                             DatadogQuery = "avg:kubernetes.cpu.user.total",
    ///                         },
    ///                         NewRelic = new SpotInst.Oceancd.Inputs.VerificationTemplateMetricProviderNewRelicArgs
    ///                         {
    ///                             Profile = "test",
    ///                             NewRelicQuery = "FROM Metric SELECT count",
    ///                         },
    ///                         CloudWatch = new SpotInst.Oceancd.Inputs.VerificationTemplateMetricProviderCloudWatchArgs
    ///                         {
    ///                             Duration = "5m",
    ///                             MetricDataQueries = new[]
    ///                             {
    ///                                 new SpotInst.Oceancd.Inputs.VerificationTemplateMetricProviderCloudWatchMetricDataQueryArgs
    ///                                 {
    ///                                     Id = "utilization",
    ///                                     MetricStat = new SpotInst.Oceancd.Inputs.VerificationTemplateMetricProviderCloudWatchMetricDataQueryMetricStatArgs
    ///                                     {
    ///                                         Metric = new SpotInst.Oceancd.Inputs.VerificationTemplateMetricProviderCloudWatchMetricDataQueryMetricStatMetricArgs
    ///                                         {
    ///                                             MetricName = "Test",
    ///                                             Namespace = "AWS/EC2",
    ///                                             Dimensions = new[]
    ///                                             {
    ///                                                 new SpotInst.Oceancd.Inputs.VerificationTemplateMetricProviderCloudWatchMetricDataQueryMetricStatMetricDimensionArgs
    ///                                                 {
    ///                                                     DimensionName = "instandId",
    ///                                                     DimensionValue = "i-123044",
    ///                                                 },
    ///                                             },
    ///                                         },
    ///                                         MetricPeriod = 400,
    ///                                         Stat = "average",
    ///                                         Unit = "None",
    ///                                     },
    ///                                     Expression = "SELECT AVG(CPUUtilization) FROM SCHEMA",
    ///                                     Label = "TestLabel",
    ///                                     ReturnData = false,
    ///                                     Period = 300,
    ///                                 },
    ///                             },
    ///                         },
    ///                         Web = new SpotInst.Oceancd.Inputs.VerificationTemplateMetricProviderWebArgs
    ///                         {
    ///                             Method = "GET",
    ///                             Url = "https://oceancd.com/api/v1/metrics?clusterId= args.clusterId",
    ///                             WebHeaders = new[]
    ///                             {
    ///                                 new SpotInst.Oceancd.Inputs.VerificationTemplateMetricProviderWebWebHeaderArgs
    ///                                 {
    ///                                     WebHeaderKey = "Autorization",
    ///                                     WebHeaderValue = "Bearer=args.token",
    ///                                 },
    ///                             },
    ///                             Body = "{\"key\": \"test\"}",
    ///                             TimeoutSeconds = 20,
    ///                             JsonPath = "$.data",
    ///                             Insecure = false,
    ///                         },
    ///                         Job = new SpotInst.Oceancd.Inputs.VerificationTemplateMetricProviderJobArgs
    ///                         {
    ///                             Specs = new[]
    ///                             {
    ///                                 new SpotInst.Oceancd.Inputs.VerificationTemplateMetricProviderJobSpecArgs
    ///                                 {
    ///                                     BackoffLimit = 1,
    ///                                     JobTemplates = new[]
    ///                                     {
    ///                                         new SpotInst.Oceancd.Inputs.VerificationTemplateMetricProviderJobSpecJobTemplateArgs
    ///                                         {
    ///                                             TemplateSpecs = new[]
    ///                                             {
    ///                                                 new SpotInst.Oceancd.Inputs.VerificationTemplateMetricProviderJobSpecJobTemplateTemplateSpecArgs
    ///                                                 {
    ///                                                     Containers = new[]
    ///                                                     {
    ///                                                         new SpotInst.Oceancd.Inputs.VerificationTemplateMetricProviderJobSpecJobTemplateTemplateSpecContainerArgs
    ///                                                         {
    ///                                                             ContainerName = "hello",
    ///                                                             Commands = new[]
    ///                                                             {
    ///                                                                 "sh",
    ///                                                                 "-c",
    ///                                                             },
    ///                                                             Image = "nginx.2.1",
    ///                                                         },
    ///                                                     },
    ///                                                     RestartPolicy = "never",
    ///                                                 },
    ///                                             },
    ///                                         },
    ///                                     },
    ///                                 },
    ///                             },
    ///                         },
    ///                         Jenkins = new SpotInst.Oceancd.Inputs.VerificationTemplateMetricProviderJenkinsArgs
    ///                         {
    ///                             PipelineName = "testPipelineName",
    ///                             TlsVerification = true,
    ///                             Timeout = "2m",
    ///                             JenkinsInterval = "5s",
    ///                             JenkinsParameters = new SpotInst.Oceancd.Inputs.VerificationTemplateMetricProviderJenkinsJenkinsParametersArgs
    ///                             {
    ///                                 ParameterKey = "app",
    ///                                 ParameterValue = "my-app",
    ///                             },
    ///                         },
    ///                     },
    ///                 },
    ///                 Baseline = new SpotInst.Oceancd.Inputs.VerificationTemplateMetricBaselineArgs
    ///                 {
    ///                     BaselineProviders = new[]
    ///                     {
    ///                         new SpotInst.Oceancd.Inputs.VerificationTemplateMetricBaselineBaselineProviderArgs
    ///                         {
    ///                             Prometheus = new SpotInst.Oceancd.Inputs.VerificationTemplateMetricBaselineBaselineProviderPrometheusArgs
    ///                             {
    ///                                 PrometheusQuery = "http_requests_total.status!",
    ///                             },
    ///                             Datadog = new SpotInst.Oceancd.Inputs.VerificationTemplateMetricBaselineBaselineProviderDatadogArgs
    ///                             {
    ///                                 Duration = "2m",
    ///                                 DatadogQuery = "avg:kubernetes.cpu.user",
    ///                             },
    ///                             NewRelic = new SpotInst.Oceancd.Inputs.VerificationTemplateMetricBaselineBaselineProviderNewRelicArgs
    ///                             {
    ///                                 Profile = "test",
    ///                                 NewRelicQuery = "FROM Metric SELECT count*",
    ///                             },
    ///                         },
    ///                     },
    ///                     MinRange = 40,
    ///                     MaxRange = 50,
    ///                     Threshold = "range",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [SpotInstResourceType("spotinst:oceancd/verificationTemplate:VerificationTemplate")]
    public partial class VerificationTemplate : global::Pulumi.CustomResource
    {
        /// <summary>
        /// List of verification arguments. You may specify either `value` OR `valueFrom` but not both.In case `args`:`value` is already defined in the RolloutSpec entity, there is no need to also specify it in the VerificationTemplate entity.
        /// </summary>
        [Output("args")]
        public Output<ImmutableArray<Outputs.VerificationTemplateArg>> Args { get; private set; } = null!;

        /// <summary>
        /// List of verification metrics.
        /// </summary>
        [Output("metrics")]
        public Output<ImmutableArray<Outputs.VerificationTemplateMetric>> Metrics { get; private set; } = null!;

        /// <summary>
        /// Identifier name for Ocean CD Verification Template. Must be unique.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;


        /// <summary>
        /// Create a VerificationTemplate resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public VerificationTemplate(string name, VerificationTemplateArgs? args = null, CustomResourceOptions? options = null)
            : base("spotinst:oceancd/verificationTemplate:VerificationTemplate", name, args ?? new VerificationTemplateArgs(), MakeResourceOptions(options, ""))
        {
        }

        private VerificationTemplate(string name, Input<string> id, VerificationTemplateState? state = null, CustomResourceOptions? options = null)
            : base("spotinst:oceancd/verificationTemplate:VerificationTemplate", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing VerificationTemplate resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static VerificationTemplate Get(string name, Input<string> id, VerificationTemplateState? state = null, CustomResourceOptions? options = null)
        {
            return new VerificationTemplate(name, id, state, options);
        }
    }

    public sealed class VerificationTemplateArgs : global::Pulumi.ResourceArgs
    {
        [Input("args")]
        private InputList<Inputs.VerificationTemplateArgArgs>? _args;

        /// <summary>
        /// List of verification arguments. You may specify either `value` OR `valueFrom` but not both.In case `args`:`value` is already defined in the RolloutSpec entity, there is no need to also specify it in the VerificationTemplate entity.
        /// </summary>
        public InputList<Inputs.VerificationTemplateArgArgs> Args
        {
            get => _args ?? (_args = new InputList<Inputs.VerificationTemplateArgArgs>());
            set => _args = value;
        }

        [Input("metrics")]
        private InputList<Inputs.VerificationTemplateMetricArgs>? _metrics;

        /// <summary>
        /// List of verification metrics.
        /// </summary>
        public InputList<Inputs.VerificationTemplateMetricArgs> Metrics
        {
            get => _metrics ?? (_metrics = new InputList<Inputs.VerificationTemplateMetricArgs>());
            set => _metrics = value;
        }

        /// <summary>
        /// Identifier name for Ocean CD Verification Template. Must be unique.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public VerificationTemplateArgs()
        {
        }
        public static new VerificationTemplateArgs Empty => new VerificationTemplateArgs();
    }

    public sealed class VerificationTemplateState : global::Pulumi.ResourceArgs
    {
        [Input("args")]
        private InputList<Inputs.VerificationTemplateArgGetArgs>? _args;

        /// <summary>
        /// List of verification arguments. You may specify either `value` OR `valueFrom` but not both.In case `args`:`value` is already defined in the RolloutSpec entity, there is no need to also specify it in the VerificationTemplate entity.
        /// </summary>
        public InputList<Inputs.VerificationTemplateArgGetArgs> Args
        {
            get => _args ?? (_args = new InputList<Inputs.VerificationTemplateArgGetArgs>());
            set => _args = value;
        }

        [Input("metrics")]
        private InputList<Inputs.VerificationTemplateMetricGetArgs>? _metrics;

        /// <summary>
        /// List of verification metrics.
        /// </summary>
        public InputList<Inputs.VerificationTemplateMetricGetArgs> Metrics
        {
            get => _metrics ?? (_metrics = new InputList<Inputs.VerificationTemplateMetricGetArgs>());
            set => _metrics = value;
        }

        /// <summary>
        /// Identifier name for Ocean CD Verification Template. Must be unique.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public VerificationTemplateState()
        {
        }
        public static new VerificationTemplateState Empty => new VerificationTemplateState();
    }
}
