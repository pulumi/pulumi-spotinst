// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws
{
    /// <summary>
    /// Provides a Spotinst AWS group resource using Elastic Beanstalk.
    /// 
    /// &gt; This content is derived from https://github.com/terraform-providers/terraform-provider-spotinst/blob/master/website/docs/r/elastigroup_aws_beanstalk.html.markdown.
    /// </summary>
    public partial class Beanstalk : Pulumi.CustomResource
    {
        /// <summary>
        /// The id of an existing Beanstalk environment. 
        /// </summary>
        [Output("beanstalkEnvironmentId")]
        public Output<string?> BeanstalkEnvironmentId { get; private set; } = null!;

        /// <summary>
        /// The name of an existing Beanstalk environment.
        /// </summary>
        [Output("beanstalkEnvironmentName")]
        public Output<string?> BeanstalkEnvironmentName { get; private set; } = null!;

        /// <summary>
        /// Preferences when performing a roll
        /// </summary>
        [Output("deploymentPreferences")]
        public Output<Outputs.BeanstalkDeploymentPreferences?> DeploymentPreferences { get; private set; } = null!;

        /// <summary>
        /// The desired number of instances the group should have at any time.
        /// </summary>
        [Output("desiredCapacity")]
        public Output<int> DesiredCapacity { get; private set; } = null!;

        /// <summary>
        /// One or more instance types. To maximize the availability of Spot instances, select as many instance types as possible.
        /// </summary>
        [Output("instanceTypesSpots")]
        public Output<ImmutableArray<string>> InstanceTypesSpots { get; private set; } = null!;

        [Output("maintenance")]
        public Output<string?> Maintenance { get; private set; } = null!;

        /// <summary>
        /// Managed Actions parameters
        /// </summary>
        [Output("managedActions")]
        public Output<Outputs.BeanstalkManagedActions?> ManagedActions { get; private set; } = null!;

        /// <summary>
        /// The maximum number of instances the group should have at any time.
        /// </summary>
        [Output("maxSize")]
        public Output<int> MaxSize { get; private set; } = null!;

        /// <summary>
        /// The minimum number of instances the group should have at any time.
        /// </summary>
        [Output("minSize")]
        public Output<int> MinSize { get; private set; } = null!;

        /// <summary>
        /// The group name.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Operation system type. Valid values: `"Linux/UNIX"`, `"SUSE Linux"`, `"Windows"`.
        /// For EC2 Classic instances:  `"Linux/UNIX (Amazon VPC)"`, `"SUSE Linux (Amazon VPC)"`, `"Windows (Amazon VPC)"`.
        /// </summary>
        [Output("product")]
        public Output<string> Product { get; private set; } = null!;

        /// <summary>
        /// The AWS region your group will be created in. Cannot be changed after the group has been created.
        /// </summary>
        [Output("region")]
        public Output<string> Region { get; private set; } = null!;


        /// <summary>
        /// Create a Beanstalk resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Beanstalk(string name, BeanstalkArgs args, CustomResourceOptions? options = null)
            : base("spotinst:aws/beanstalk:Beanstalk", name, args ?? ResourceArgs.Empty, MakeResourceOptions(options, ""))
        {
        }

        private Beanstalk(string name, Input<string> id, BeanstalkState? state = null, CustomResourceOptions? options = null)
            : base("spotinst:aws/beanstalk:Beanstalk", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Beanstalk resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Beanstalk Get(string name, Input<string> id, BeanstalkState? state = null, CustomResourceOptions? options = null)
        {
            return new Beanstalk(name, id, state, options);
        }
    }

    public sealed class BeanstalkArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The id of an existing Beanstalk environment. 
        /// </summary>
        [Input("beanstalkEnvironmentId")]
        public Input<string>? BeanstalkEnvironmentId { get; set; }

        /// <summary>
        /// The name of an existing Beanstalk environment.
        /// </summary>
        [Input("beanstalkEnvironmentName")]
        public Input<string>? BeanstalkEnvironmentName { get; set; }

        /// <summary>
        /// Preferences when performing a roll
        /// </summary>
        [Input("deploymentPreferences")]
        public Input<Inputs.BeanstalkDeploymentPreferencesArgs>? DeploymentPreferences { get; set; }

        /// <summary>
        /// The desired number of instances the group should have at any time.
        /// </summary>
        [Input("desiredCapacity", required: true)]
        public Input<int> DesiredCapacity { get; set; } = null!;

        [Input("instanceTypesSpots", required: true)]
        private InputList<string>? _instanceTypesSpots;

        /// <summary>
        /// One or more instance types. To maximize the availability of Spot instances, select as many instance types as possible.
        /// </summary>
        public InputList<string> InstanceTypesSpots
        {
            get => _instanceTypesSpots ?? (_instanceTypesSpots = new InputList<string>());
            set => _instanceTypesSpots = value;
        }

        [Input("maintenance")]
        public Input<string>? Maintenance { get; set; }

        /// <summary>
        /// Managed Actions parameters
        /// </summary>
        [Input("managedActions")]
        public Input<Inputs.BeanstalkManagedActionsArgs>? ManagedActions { get; set; }

        /// <summary>
        /// The maximum number of instances the group should have at any time.
        /// </summary>
        [Input("maxSize", required: true)]
        public Input<int> MaxSize { get; set; } = null!;

        /// <summary>
        /// The minimum number of instances the group should have at any time.
        /// </summary>
        [Input("minSize", required: true)]
        public Input<int> MinSize { get; set; } = null!;

        /// <summary>
        /// The group name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Operation system type. Valid values: `"Linux/UNIX"`, `"SUSE Linux"`, `"Windows"`.
        /// For EC2 Classic instances:  `"Linux/UNIX (Amazon VPC)"`, `"SUSE Linux (Amazon VPC)"`, `"Windows (Amazon VPC)"`.
        /// </summary>
        [Input("product", required: true)]
        public Input<string> Product { get; set; } = null!;

        /// <summary>
        /// The AWS region your group will be created in. Cannot be changed after the group has been created.
        /// </summary>
        [Input("region", required: true)]
        public Input<string> Region { get; set; } = null!;

        public BeanstalkArgs()
        {
        }
    }

    public sealed class BeanstalkState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The id of an existing Beanstalk environment. 
        /// </summary>
        [Input("beanstalkEnvironmentId")]
        public Input<string>? BeanstalkEnvironmentId { get; set; }

        /// <summary>
        /// The name of an existing Beanstalk environment.
        /// </summary>
        [Input("beanstalkEnvironmentName")]
        public Input<string>? BeanstalkEnvironmentName { get; set; }

        /// <summary>
        /// Preferences when performing a roll
        /// </summary>
        [Input("deploymentPreferences")]
        public Input<Inputs.BeanstalkDeploymentPreferencesGetArgs>? DeploymentPreferences { get; set; }

        /// <summary>
        /// The desired number of instances the group should have at any time.
        /// </summary>
        [Input("desiredCapacity")]
        public Input<int>? DesiredCapacity { get; set; }

        [Input("instanceTypesSpots")]
        private InputList<string>? _instanceTypesSpots;

        /// <summary>
        /// One or more instance types. To maximize the availability of Spot instances, select as many instance types as possible.
        /// </summary>
        public InputList<string> InstanceTypesSpots
        {
            get => _instanceTypesSpots ?? (_instanceTypesSpots = new InputList<string>());
            set => _instanceTypesSpots = value;
        }

        [Input("maintenance")]
        public Input<string>? Maintenance { get; set; }

        /// <summary>
        /// Managed Actions parameters
        /// </summary>
        [Input("managedActions")]
        public Input<Inputs.BeanstalkManagedActionsGetArgs>? ManagedActions { get; set; }

        /// <summary>
        /// The maximum number of instances the group should have at any time.
        /// </summary>
        [Input("maxSize")]
        public Input<int>? MaxSize { get; set; }

        /// <summary>
        /// The minimum number of instances the group should have at any time.
        /// </summary>
        [Input("minSize")]
        public Input<int>? MinSize { get; set; }

        /// <summary>
        /// The group name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Operation system type. Valid values: `"Linux/UNIX"`, `"SUSE Linux"`, `"Windows"`.
        /// For EC2 Classic instances:  `"Linux/UNIX (Amazon VPC)"`, `"SUSE Linux (Amazon VPC)"`, `"Windows (Amazon VPC)"`.
        /// </summary>
        [Input("product")]
        public Input<string>? Product { get; set; }

        /// <summary>
        /// The AWS region your group will be created in. Cannot be changed after the group has been created.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        public BeanstalkState()
        {
        }
    }

    namespace Inputs
    {

    public sealed class BeanstalkDeploymentPreferencesArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Should roll perform automatically
        /// </summary>
        [Input("automaticRoll")]
        public Input<bool>? AutomaticRoll { get; set; }

        /// <summary>
        /// Percent size of each batch
        /// </summary>
        [Input("batchSizePercentage")]
        public Input<int>? BatchSizePercentage { get; set; }

        /// <summary>
        /// Amount of time to wait between batches
        /// </summary>
        [Input("gracePeriod")]
        public Input<int>? GracePeriod { get; set; }

        [Input("strategies")]
        private InputList<BeanstalkDeploymentPreferencesStrategiesArgs>? _strategies;

        /// <summary>
        /// Strategy parameters
        /// </summary>
        public InputList<BeanstalkDeploymentPreferencesStrategiesArgs> Strategies
        {
            get => _strategies ?? (_strategies = new InputList<BeanstalkDeploymentPreferencesStrategiesArgs>());
            set => _strategies = value;
        }

        public BeanstalkDeploymentPreferencesArgs()
        {
        }
    }

    public sealed class BeanstalkDeploymentPreferencesGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Should roll perform automatically
        /// </summary>
        [Input("automaticRoll")]
        public Input<bool>? AutomaticRoll { get; set; }

        /// <summary>
        /// Percent size of each batch
        /// </summary>
        [Input("batchSizePercentage")]
        public Input<int>? BatchSizePercentage { get; set; }

        /// <summary>
        /// Amount of time to wait between batches
        /// </summary>
        [Input("gracePeriod")]
        public Input<int>? GracePeriod { get; set; }

        [Input("strategies")]
        private InputList<BeanstalkDeploymentPreferencesStrategiesGetArgs>? _strategies;

        /// <summary>
        /// Strategy parameters
        /// </summary>
        public InputList<BeanstalkDeploymentPreferencesStrategiesGetArgs> Strategies
        {
            get => _strategies ?? (_strategies = new InputList<BeanstalkDeploymentPreferencesStrategiesGetArgs>());
            set => _strategies = value;
        }

        public BeanstalkDeploymentPreferencesGetArgs()
        {
        }
    }

    public sealed class BeanstalkDeploymentPreferencesStrategiesArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Action to take
        /// </summary>
        [Input("action")]
        public Input<string>? Action { get; set; }

        /// <summary>
        /// Bool value if to wait to drain instance 
        /// </summary>
        [Input("shouldDrainInstances")]
        public Input<bool>? ShouldDrainInstances { get; set; }

        public BeanstalkDeploymentPreferencesStrategiesArgs()
        {
        }
    }

    public sealed class BeanstalkDeploymentPreferencesStrategiesGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Action to take
        /// </summary>
        [Input("action")]
        public Input<string>? Action { get; set; }

        /// <summary>
        /// Bool value if to wait to drain instance 
        /// </summary>
        [Input("shouldDrainInstances")]
        public Input<bool>? ShouldDrainInstances { get; set; }

        public BeanstalkDeploymentPreferencesStrategiesGetArgs()
        {
        }
    }

    public sealed class BeanstalkManagedActionsArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Platform Update parameters
        /// </summary>
        [Input("platformUpdate")]
        public Input<BeanstalkManagedActionsPlatformUpdateArgs>? PlatformUpdate { get; set; }

        public BeanstalkManagedActionsArgs()
        {
        }
    }

    public sealed class BeanstalkManagedActionsGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Platform Update parameters
        /// </summary>
        [Input("platformUpdate")]
        public Input<BeanstalkManagedActionsPlatformUpdateGetArgs>? PlatformUpdate { get; set; }

        public BeanstalkManagedActionsGetArgs()
        {
        }
    }

    public sealed class BeanstalkManagedActionsPlatformUpdateArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Actions to perform (options: timeWindow, never)
        /// </summary>
        [Input("performAt")]
        public Input<string>? PerformAt { get; set; }

        /// <summary>
        /// Time Window for when action occurs ex. Mon:23:50-Tue:00:20
        /// </summary>
        [Input("timeWindow")]
        public Input<string>? TimeWindow { get; set; }

        /// <summary>
        /// - Level to update
        /// </summary>
        [Input("updateLevel")]
        public Input<string>? UpdateLevel { get; set; }

        public BeanstalkManagedActionsPlatformUpdateArgs()
        {
        }
    }

    public sealed class BeanstalkManagedActionsPlatformUpdateGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Actions to perform (options: timeWindow, never)
        /// </summary>
        [Input("performAt")]
        public Input<string>? PerformAt { get; set; }

        /// <summary>
        /// Time Window for when action occurs ex. Mon:23:50-Tue:00:20
        /// </summary>
        [Input("timeWindow")]
        public Input<string>? TimeWindow { get; set; }

        /// <summary>
        /// - Level to update
        /// </summary>
        [Input("updateLevel")]
        public Input<string>? UpdateLevel { get; set; }

        public BeanstalkManagedActionsPlatformUpdateGetArgs()
        {
        }
    }
    }

    namespace Outputs
    {

    [OutputType]
    public sealed class BeanstalkDeploymentPreferences
    {
        /// <summary>
        /// Should roll perform automatically
        /// </summary>
        public readonly bool? AutomaticRoll;
        /// <summary>
        /// Percent size of each batch
        /// </summary>
        public readonly int? BatchSizePercentage;
        /// <summary>
        /// Amount of time to wait between batches
        /// </summary>
        public readonly int? GracePeriod;
        /// <summary>
        /// Strategy parameters
        /// </summary>
        public readonly ImmutableArray<BeanstalkDeploymentPreferencesStrategies> Strategies;

        [OutputConstructor]
        private BeanstalkDeploymentPreferences(
            bool? automaticRoll,
            int? batchSizePercentage,
            int? gracePeriod,
            ImmutableArray<BeanstalkDeploymentPreferencesStrategies> strategies)
        {
            AutomaticRoll = automaticRoll;
            BatchSizePercentage = batchSizePercentage;
            GracePeriod = gracePeriod;
            Strategies = strategies;
        }
    }

    [OutputType]
    public sealed class BeanstalkDeploymentPreferencesStrategies
    {
        /// <summary>
        /// Action to take
        /// </summary>
        public readonly string? Action;
        /// <summary>
        /// Bool value if to wait to drain instance 
        /// </summary>
        public readonly bool? ShouldDrainInstances;

        [OutputConstructor]
        private BeanstalkDeploymentPreferencesStrategies(
            string? action,
            bool? shouldDrainInstances)
        {
            Action = action;
            ShouldDrainInstances = shouldDrainInstances;
        }
    }

    [OutputType]
    public sealed class BeanstalkManagedActions
    {
        /// <summary>
        /// Platform Update parameters
        /// </summary>
        public readonly BeanstalkManagedActionsPlatformUpdate? PlatformUpdate;

        [OutputConstructor]
        private BeanstalkManagedActions(BeanstalkManagedActionsPlatformUpdate? platformUpdate)
        {
            PlatformUpdate = platformUpdate;
        }
    }

    [OutputType]
    public sealed class BeanstalkManagedActionsPlatformUpdate
    {
        /// <summary>
        /// Actions to perform (options: timeWindow, never)
        /// </summary>
        public readonly string? PerformAt;
        /// <summary>
        /// Time Window for when action occurs ex. Mon:23:50-Tue:00:20
        /// </summary>
        public readonly string? TimeWindow;
        /// <summary>
        /// - Level to update
        /// </summary>
        public readonly string? UpdateLevel;

        [OutputConstructor]
        private BeanstalkManagedActionsPlatformUpdate(
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
}
