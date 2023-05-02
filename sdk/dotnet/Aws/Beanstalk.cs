// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws
{
    /// <summary>
    /// Provides a Spotinst AWS group resource using Elastic Beanstalk.
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
    ///     var elastigoup_aws_beanstalk = new SpotInst.Aws.Beanstalk("elastigoup-aws-beanstalk", new()
    ///     {
    ///         BeanstalkEnvironmentId = "e-example",
    ///         BeanstalkEnvironmentName = "example-env",
    ///         DeploymentPreferences = new SpotInst.Aws.Inputs.BeanstalkDeploymentPreferencesArgs
    ///         {
    ///             AutomaticRoll = true,
    ///             BatchSizePercentage = 100,
    ///             GracePeriod = 90,
    ///             Strategies = new[]
    ///             {
    ///                 new SpotInst.Aws.Inputs.BeanstalkDeploymentPreferencesStrategyArgs
    ///                 {
    ///                     Action = "REPLACE_SERVER",
    ///                     ShouldDrainInstances = true,
    ///                 },
    ///             },
    ///         },
    ///         DesiredCapacity = 0,
    ///         InstanceTypesSpots = new[]
    ///         {
    ///             "t2.micro",
    ///             "t2.medium",
    ///             "t2.large",
    ///         },
    ///         ManagedActions = new SpotInst.Aws.Inputs.BeanstalkManagedActionsArgs
    ///         {
    ///             PlatformUpdate = new SpotInst.Aws.Inputs.BeanstalkManagedActionsPlatformUpdateArgs
    ///             {
    ///                 PerformAt = "timeWindow",
    ///                 TimeWindow = "Mon:23:50-Tue:00:20",
    ///                 UpdateLevel = "minorAndPatch",
    ///             },
    ///         },
    ///         MaxSize = 1,
    ///         MinSize = 0,
    ///         Name = "example-elastigroup-beanstalk",
    ///         Product = "Linux/UNIX",
    ///         Region = "us-west-2",
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [SpotInstResourceType("spotinst:aws/beanstalk:Beanstalk")]
    public partial class Beanstalk : global::Pulumi.CustomResource
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

        [Output("scheduledTasks")]
        public Output<ImmutableArray<Outputs.BeanstalkScheduledTask>> ScheduledTasks { get; private set; } = null!;


        /// <summary>
        /// Create a Beanstalk resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Beanstalk(string name, BeanstalkArgs args, CustomResourceOptions? options = null)
            : base("spotinst:aws/beanstalk:Beanstalk", name, args ?? new BeanstalkArgs(), MakeResourceOptions(options, ""))
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

    public sealed class BeanstalkArgs : global::Pulumi.ResourceArgs
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
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

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

        [Input("scheduledTasks")]
        private InputList<Inputs.BeanstalkScheduledTaskArgs>? _scheduledTasks;
        public InputList<Inputs.BeanstalkScheduledTaskArgs> ScheduledTasks
        {
            get => _scheduledTasks ?? (_scheduledTasks = new InputList<Inputs.BeanstalkScheduledTaskArgs>());
            set => _scheduledTasks = value;
        }

        public BeanstalkArgs()
        {
        }
        public static new BeanstalkArgs Empty => new BeanstalkArgs();
    }

    public sealed class BeanstalkState : global::Pulumi.ResourceArgs
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

        [Input("scheduledTasks")]
        private InputList<Inputs.BeanstalkScheduledTaskGetArgs>? _scheduledTasks;
        public InputList<Inputs.BeanstalkScheduledTaskGetArgs> ScheduledTasks
        {
            get => _scheduledTasks ?? (_scheduledTasks = new InputList<Inputs.BeanstalkScheduledTaskGetArgs>());
            set => _scheduledTasks = value;
        }

        public BeanstalkState()
        {
        }
        public static new BeanstalkState Empty => new BeanstalkState();
    }
}
