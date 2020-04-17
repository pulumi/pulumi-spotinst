// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Azure
{
    /// <summary>
    /// Provides a Spotinst elastigroup Azure resource.
    /// </summary>
    public partial class Elastigroup : Pulumi.CustomResource
    {
        [Output("customData")]
        public Output<string?> CustomData { get; private set; } = null!;

        /// <summary>
        /// The desired number of instances the group should have at any time.
        /// </summary>
        [Output("desiredCapacity")]
        public Output<int?> DesiredCapacity { get; private set; } = null!;

        [Output("healthCheck")]
        public Output<Outputs.ElastigroupHealthCheck?> HealthCheck { get; private set; } = null!;

        [Output("images")]
        public Output<ImmutableArray<Outputs.ElastigroupImage>> Images { get; private set; } = null!;

        [Output("integrationKubernetes")]
        public Output<Outputs.ElastigroupIntegrationKubernetes?> IntegrationKubernetes { get; private set; } = null!;

        [Output("integrationMultaiRuntime")]
        public Output<Outputs.ElastigroupIntegrationMultaiRuntime?> IntegrationMultaiRuntime { get; private set; } = null!;

        [Output("loadBalancers")]
        public Output<ImmutableArray<Outputs.ElastigroupLoadBalancer>> LoadBalancers { get; private set; } = null!;

        [Output("login")]
        public Output<Outputs.ElastigroupLogin?> Login { get; private set; } = null!;

        /// <summary>
        /// Available Low-Priority sizes.
        /// </summary>
        [Output("lowPrioritySizes")]
        public Output<ImmutableArray<string>> LowPrioritySizes { get; private set; } = null!;

        [Output("managedServiceIdentities")]
        public Output<ImmutableArray<Outputs.ElastigroupManagedServiceIdentity>> ManagedServiceIdentities { get; private set; } = null!;

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
        /// The name of the managed identity.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        [Output("network")]
        public Output<Outputs.ElastigroupNetwork> Network { get; private set; } = null!;

        /// <summary>
        /// Available On-Demand sizes
        /// </summary>
        [Output("odSizes")]
        public Output<ImmutableArray<string>> OdSizes { get; private set; } = null!;

        /// <summary>
        /// Operation system type. Valid values: `"Linux"`, `"Windows"`.
        /// </summary>
        [Output("product")]
        public Output<string> Product { get; private set; } = null!;

        /// <summary>
        /// The region your Azure group will be created in.
        /// </summary>
        [Output("region")]
        public Output<string> Region { get; private set; } = null!;

        /// <summary>
        /// The Resource Group that the user-assigned managed identity resides in.
        /// </summary>
        [Output("resourceGroupName")]
        public Output<string> ResourceGroupName { get; private set; } = null!;

        [Output("scalingDownPolicies")]
        public Output<ImmutableArray<Outputs.ElastigroupScalingDownPolicy>> ScalingDownPolicies { get; private set; } = null!;

        [Output("scalingUpPolicies")]
        public Output<ImmutableArray<Outputs.ElastigroupScalingUpPolicy>> ScalingUpPolicies { get; private set; } = null!;

        [Output("scheduledTasks")]
        public Output<ImmutableArray<Outputs.ElastigroupScheduledTask>> ScheduledTasks { get; private set; } = null!;

        /// <summary>
        /// Shutdown script for the group. Value should be passed as a string encoded at Base64 only.
        /// </summary>
        [Output("shutdownScript")]
        public Output<string?> ShutdownScript { get; private set; } = null!;

        /// <summary>
        /// Describes the deployment strategy.
        /// </summary>
        [Output("strategy")]
        public Output<Outputs.ElastigroupStrategy> Strategy { get; private set; } = null!;

        [Output("updatePolicy")]
        public Output<Outputs.ElastigroupUpdatePolicy?> UpdatePolicy { get; private set; } = null!;

        /// <summary>
        /// Base64-encoded MIME user data to make available to the instances.
        /// </summary>
        [Output("userData")]
        public Output<string?> UserData { get; private set; } = null!;


        /// <summary>
        /// Create a Elastigroup resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Elastigroup(string name, ElastigroupArgs args, CustomResourceOptions? options = null)
            : base("spotinst:azure/elastigroup:Elastigroup", name, args ?? new ElastigroupArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Elastigroup(string name, Input<string> id, ElastigroupState? state = null, CustomResourceOptions? options = null)
            : base("spotinst:azure/elastigroup:Elastigroup", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Elastigroup resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Elastigroup Get(string name, Input<string> id, ElastigroupState? state = null, CustomResourceOptions? options = null)
        {
            return new Elastigroup(name, id, state, options);
        }
    }

    public sealed class ElastigroupArgs : Pulumi.ResourceArgs
    {
        [Input("customData")]
        public Input<string>? CustomData { get; set; }

        /// <summary>
        /// The desired number of instances the group should have at any time.
        /// </summary>
        [Input("desiredCapacity")]
        public Input<int>? DesiredCapacity { get; set; }

        [Input("healthCheck")]
        public Input<Inputs.ElastigroupHealthCheckArgs>? HealthCheck { get; set; }

        [Input("images")]
        private InputList<Inputs.ElastigroupImageArgs>? _images;
        public InputList<Inputs.ElastigroupImageArgs> Images
        {
            get => _images ?? (_images = new InputList<Inputs.ElastigroupImageArgs>());
            set => _images = value;
        }

        [Input("integrationKubernetes")]
        public Input<Inputs.ElastigroupIntegrationKubernetesArgs>? IntegrationKubernetes { get; set; }

        [Input("integrationMultaiRuntime")]
        public Input<Inputs.ElastigroupIntegrationMultaiRuntimeArgs>? IntegrationMultaiRuntime { get; set; }

        [Input("loadBalancers")]
        private InputList<Inputs.ElastigroupLoadBalancerArgs>? _loadBalancers;
        public InputList<Inputs.ElastigroupLoadBalancerArgs> LoadBalancers
        {
            get => _loadBalancers ?? (_loadBalancers = new InputList<Inputs.ElastigroupLoadBalancerArgs>());
            set => _loadBalancers = value;
        }

        [Input("login")]
        public Input<Inputs.ElastigroupLoginArgs>? Login { get; set; }

        [Input("lowPrioritySizes", required: true)]
        private InputList<string>? _lowPrioritySizes;

        /// <summary>
        /// Available Low-Priority sizes.
        /// </summary>
        public InputList<string> LowPrioritySizes
        {
            get => _lowPrioritySizes ?? (_lowPrioritySizes = new InputList<string>());
            set => _lowPrioritySizes = value;
        }

        [Input("managedServiceIdentities")]
        private InputList<Inputs.ElastigroupManagedServiceIdentityArgs>? _managedServiceIdentities;
        public InputList<Inputs.ElastigroupManagedServiceIdentityArgs> ManagedServiceIdentities
        {
            get => _managedServiceIdentities ?? (_managedServiceIdentities = new InputList<Inputs.ElastigroupManagedServiceIdentityArgs>());
            set => _managedServiceIdentities = value;
        }

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
        /// The name of the managed identity.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("network", required: true)]
        public Input<Inputs.ElastigroupNetworkArgs> Network { get; set; } = null!;

        [Input("odSizes", required: true)]
        private InputList<string>? _odSizes;

        /// <summary>
        /// Available On-Demand sizes
        /// </summary>
        public InputList<string> OdSizes
        {
            get => _odSizes ?? (_odSizes = new InputList<string>());
            set => _odSizes = value;
        }

        /// <summary>
        /// Operation system type. Valid values: `"Linux"`, `"Windows"`.
        /// </summary>
        [Input("product", required: true)]
        public Input<string> Product { get; set; } = null!;

        /// <summary>
        /// The region your Azure group will be created in.
        /// </summary>
        [Input("region", required: true)]
        public Input<string> Region { get; set; } = null!;

        /// <summary>
        /// The Resource Group that the user-assigned managed identity resides in.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        [Input("scalingDownPolicies")]
        private InputList<Inputs.ElastigroupScalingDownPolicyArgs>? _scalingDownPolicies;
        public InputList<Inputs.ElastigroupScalingDownPolicyArgs> ScalingDownPolicies
        {
            get => _scalingDownPolicies ?? (_scalingDownPolicies = new InputList<Inputs.ElastigroupScalingDownPolicyArgs>());
            set => _scalingDownPolicies = value;
        }

        [Input("scalingUpPolicies")]
        private InputList<Inputs.ElastigroupScalingUpPolicyArgs>? _scalingUpPolicies;
        public InputList<Inputs.ElastigroupScalingUpPolicyArgs> ScalingUpPolicies
        {
            get => _scalingUpPolicies ?? (_scalingUpPolicies = new InputList<Inputs.ElastigroupScalingUpPolicyArgs>());
            set => _scalingUpPolicies = value;
        }

        [Input("scheduledTasks")]
        private InputList<Inputs.ElastigroupScheduledTaskArgs>? _scheduledTasks;
        public InputList<Inputs.ElastigroupScheduledTaskArgs> ScheduledTasks
        {
            get => _scheduledTasks ?? (_scheduledTasks = new InputList<Inputs.ElastigroupScheduledTaskArgs>());
            set => _scheduledTasks = value;
        }

        /// <summary>
        /// Shutdown script for the group. Value should be passed as a string encoded at Base64 only.
        /// </summary>
        [Input("shutdownScript")]
        public Input<string>? ShutdownScript { get; set; }

        /// <summary>
        /// Describes the deployment strategy.
        /// </summary>
        [Input("strategy", required: true)]
        public Input<Inputs.ElastigroupStrategyArgs> Strategy { get; set; } = null!;

        [Input("updatePolicy")]
        public Input<Inputs.ElastigroupUpdatePolicyArgs>? UpdatePolicy { get; set; }

        /// <summary>
        /// Base64-encoded MIME user data to make available to the instances.
        /// </summary>
        [Input("userData")]
        public Input<string>? UserData { get; set; }

        public ElastigroupArgs()
        {
        }
    }

    public sealed class ElastigroupState : Pulumi.ResourceArgs
    {
        [Input("customData")]
        public Input<string>? CustomData { get; set; }

        /// <summary>
        /// The desired number of instances the group should have at any time.
        /// </summary>
        [Input("desiredCapacity")]
        public Input<int>? DesiredCapacity { get; set; }

        [Input("healthCheck")]
        public Input<Inputs.ElastigroupHealthCheckGetArgs>? HealthCheck { get; set; }

        [Input("images")]
        private InputList<Inputs.ElastigroupImageGetArgs>? _images;
        public InputList<Inputs.ElastigroupImageGetArgs> Images
        {
            get => _images ?? (_images = new InputList<Inputs.ElastigroupImageGetArgs>());
            set => _images = value;
        }

        [Input("integrationKubernetes")]
        public Input<Inputs.ElastigroupIntegrationKubernetesGetArgs>? IntegrationKubernetes { get; set; }

        [Input("integrationMultaiRuntime")]
        public Input<Inputs.ElastigroupIntegrationMultaiRuntimeGetArgs>? IntegrationMultaiRuntime { get; set; }

        [Input("loadBalancers")]
        private InputList<Inputs.ElastigroupLoadBalancerGetArgs>? _loadBalancers;
        public InputList<Inputs.ElastigroupLoadBalancerGetArgs> LoadBalancers
        {
            get => _loadBalancers ?? (_loadBalancers = new InputList<Inputs.ElastigroupLoadBalancerGetArgs>());
            set => _loadBalancers = value;
        }

        [Input("login")]
        public Input<Inputs.ElastigroupLoginGetArgs>? Login { get; set; }

        [Input("lowPrioritySizes")]
        private InputList<string>? _lowPrioritySizes;

        /// <summary>
        /// Available Low-Priority sizes.
        /// </summary>
        public InputList<string> LowPrioritySizes
        {
            get => _lowPrioritySizes ?? (_lowPrioritySizes = new InputList<string>());
            set => _lowPrioritySizes = value;
        }

        [Input("managedServiceIdentities")]
        private InputList<Inputs.ElastigroupManagedServiceIdentityGetArgs>? _managedServiceIdentities;
        public InputList<Inputs.ElastigroupManagedServiceIdentityGetArgs> ManagedServiceIdentities
        {
            get => _managedServiceIdentities ?? (_managedServiceIdentities = new InputList<Inputs.ElastigroupManagedServiceIdentityGetArgs>());
            set => _managedServiceIdentities = value;
        }

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
        /// The name of the managed identity.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("network")]
        public Input<Inputs.ElastigroupNetworkGetArgs>? Network { get; set; }

        [Input("odSizes")]
        private InputList<string>? _odSizes;

        /// <summary>
        /// Available On-Demand sizes
        /// </summary>
        public InputList<string> OdSizes
        {
            get => _odSizes ?? (_odSizes = new InputList<string>());
            set => _odSizes = value;
        }

        /// <summary>
        /// Operation system type. Valid values: `"Linux"`, `"Windows"`.
        /// </summary>
        [Input("product")]
        public Input<string>? Product { get; set; }

        /// <summary>
        /// The region your Azure group will be created in.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// The Resource Group that the user-assigned managed identity resides in.
        /// </summary>
        [Input("resourceGroupName")]
        public Input<string>? ResourceGroupName { get; set; }

        [Input("scalingDownPolicies")]
        private InputList<Inputs.ElastigroupScalingDownPolicyGetArgs>? _scalingDownPolicies;
        public InputList<Inputs.ElastigroupScalingDownPolicyGetArgs> ScalingDownPolicies
        {
            get => _scalingDownPolicies ?? (_scalingDownPolicies = new InputList<Inputs.ElastigroupScalingDownPolicyGetArgs>());
            set => _scalingDownPolicies = value;
        }

        [Input("scalingUpPolicies")]
        private InputList<Inputs.ElastigroupScalingUpPolicyGetArgs>? _scalingUpPolicies;
        public InputList<Inputs.ElastigroupScalingUpPolicyGetArgs> ScalingUpPolicies
        {
            get => _scalingUpPolicies ?? (_scalingUpPolicies = new InputList<Inputs.ElastigroupScalingUpPolicyGetArgs>());
            set => _scalingUpPolicies = value;
        }

        [Input("scheduledTasks")]
        private InputList<Inputs.ElastigroupScheduledTaskGetArgs>? _scheduledTasks;
        public InputList<Inputs.ElastigroupScheduledTaskGetArgs> ScheduledTasks
        {
            get => _scheduledTasks ?? (_scheduledTasks = new InputList<Inputs.ElastigroupScheduledTaskGetArgs>());
            set => _scheduledTasks = value;
        }

        /// <summary>
        /// Shutdown script for the group. Value should be passed as a string encoded at Base64 only.
        /// </summary>
        [Input("shutdownScript")]
        public Input<string>? ShutdownScript { get; set; }

        /// <summary>
        /// Describes the deployment strategy.
        /// </summary>
        [Input("strategy")]
        public Input<Inputs.ElastigroupStrategyGetArgs>? Strategy { get; set; }

        [Input("updatePolicy")]
        public Input<Inputs.ElastigroupUpdatePolicyGetArgs>? UpdatePolicy { get; set; }

        /// <summary>
        /// Base64-encoded MIME user data to make available to the instances.
        /// </summary>
        [Input("userData")]
        public Input<string>? UserData { get; set; }

        public ElastigroupState()
        {
        }
    }
}
