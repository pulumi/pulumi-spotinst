// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst
{
    [SpotInstResourceType("spotinst:index/elastigroupAzureV3:ElastigroupAzureV3")]
    public partial class ElastigroupAzureV3 : global::Pulumi.CustomResource
    {
        [Output("availabilityVsCost")]
        public Output<int?> AvailabilityVsCost { get; private set; } = null!;

        [Output("bootDiagnostics")]
        public Output<ImmutableArray<Outputs.ElastigroupAzureV3BootDiagnostic>> BootDiagnostics { get; private set; } = null!;

        [Output("capacityReservation")]
        public Output<Outputs.ElastigroupAzureV3CapacityReservation?> CapacityReservation { get; private set; } = null!;

        [Output("customData")]
        public Output<string?> CustomData { get; private set; } = null!;

        [Output("dataDisks")]
        public Output<ImmutableArray<Outputs.ElastigroupAzureV3DataDisk>> DataDisks { get; private set; } = null!;

        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        [Output("desiredCapacity")]
        public Output<int?> DesiredCapacity { get; private set; } = null!;

        [Output("drainingTimeout")]
        public Output<int> DrainingTimeout { get; private set; } = null!;

        [Output("extensions")]
        public Output<ImmutableArray<Outputs.ElastigroupAzureV3Extension>> Extensions { get; private set; } = null!;

        [Output("fallbackToOnDemand")]
        public Output<bool> FallbackToOnDemand { get; private set; } = null!;

        [Output("health")]
        public Output<Outputs.ElastigroupAzureV3Health?> Health { get; private set; } = null!;

        [Output("images")]
        public Output<ImmutableArray<Outputs.ElastigroupAzureV3Image>> Images { get; private set; } = null!;

        [Output("loadBalancers")]
        public Output<ImmutableArray<Outputs.ElastigroupAzureV3LoadBalancer>> LoadBalancers { get; private set; } = null!;

        [Output("login")]
        public Output<Outputs.ElastigroupAzureV3Login?> Login { get; private set; } = null!;

        [Output("managedServiceIdentities")]
        public Output<ImmutableArray<Outputs.ElastigroupAzureV3ManagedServiceIdentity>> ManagedServiceIdentities { get; private set; } = null!;

        [Output("maxSize")]
        public Output<int> MaxSize { get; private set; } = null!;

        [Output("minSize")]
        public Output<int> MinSize { get; private set; } = null!;

        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        [Output("network")]
        public Output<Outputs.ElastigroupAzureV3Network> Network { get; private set; } = null!;

        [Output("onDemandCount")]
        public Output<int?> OnDemandCount { get; private set; } = null!;

        [Output("optimizationWindows")]
        public Output<ImmutableArray<string>> OptimizationWindows { get; private set; } = null!;

        [Output("os")]
        public Output<string> Os { get; private set; } = null!;

        [Output("osDisk")]
        public Output<Outputs.ElastigroupAzureV3OsDisk?> OsDisk { get; private set; } = null!;

        [Output("preferredZones")]
        public Output<ImmutableArray<string>> PreferredZones { get; private set; } = null!;

        [Output("proximityPlacementGroups")]
        public Output<ImmutableArray<Outputs.ElastigroupAzureV3ProximityPlacementGroup>> ProximityPlacementGroups { get; private set; } = null!;

        [Output("region")]
        public Output<string> Region { get; private set; } = null!;

        [Output("resourceGroupName")]
        public Output<string> ResourceGroupName { get; private set; } = null!;

        [Output("revertToSpot")]
        public Output<Outputs.ElastigroupAzureV3RevertToSpot?> RevertToSpot { get; private set; } = null!;

        [Output("scalingDownPolicies")]
        public Output<ImmutableArray<Outputs.ElastigroupAzureV3ScalingDownPolicy>> ScalingDownPolicies { get; private set; } = null!;

        [Output("scalingUpPolicies")]
        public Output<ImmutableArray<Outputs.ElastigroupAzureV3ScalingUpPolicy>> ScalingUpPolicies { get; private set; } = null!;

        [Output("schedulingTasks")]
        public Output<ImmutableArray<Outputs.ElastigroupAzureV3SchedulingTask>> SchedulingTasks { get; private set; } = null!;

        [Output("secrets")]
        public Output<ImmutableArray<Outputs.ElastigroupAzureV3Secret>> Secrets { get; private set; } = null!;

        [Output("security")]
        public Output<Outputs.ElastigroupAzureV3Security?> Security { get; private set; } = null!;

        [Output("shutdownScript")]
        public Output<string?> ShutdownScript { get; private set; } = null!;

        [Output("signals")]
        public Output<ImmutableArray<Outputs.ElastigroupAzureV3Signal>> Signals { get; private set; } = null!;

        [Output("spotPercentage")]
        public Output<int?> SpotPercentage { get; private set; } = null!;

        [Output("tags")]
        public Output<ImmutableArray<Outputs.ElastigroupAzureV3Tag>> Tags { get; private set; } = null!;

        [Output("userData")]
        public Output<string?> UserData { get; private set; } = null!;

        [Output("vmNamePrefix")]
        public Output<string?> VmNamePrefix { get; private set; } = null!;

        [Output("vmSizes")]
        public Output<Outputs.ElastigroupAzureV3VmSizes> VmSizes { get; private set; } = null!;

        [Output("zones")]
        public Output<ImmutableArray<string>> Zones { get; private set; } = null!;


        /// <summary>
        /// Create a ElastigroupAzureV3 resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ElastigroupAzureV3(string name, ElastigroupAzureV3Args args, CustomResourceOptions? options = null)
            : base("spotinst:index/elastigroupAzureV3:ElastigroupAzureV3", name, args ?? new ElastigroupAzureV3Args(), MakeResourceOptions(options, ""))
        {
        }

        private ElastigroupAzureV3(string name, Input<string> id, ElastigroupAzureV3State? state = null, CustomResourceOptions? options = null)
            : base("spotinst:index/elastigroupAzureV3:ElastigroupAzureV3", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ElastigroupAzureV3 resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ElastigroupAzureV3 Get(string name, Input<string> id, ElastigroupAzureV3State? state = null, CustomResourceOptions? options = null)
        {
            return new ElastigroupAzureV3(name, id, state, options);
        }
    }

    public sealed class ElastigroupAzureV3Args : global::Pulumi.ResourceArgs
    {
        [Input("availabilityVsCost")]
        public Input<int>? AvailabilityVsCost { get; set; }

        [Input("bootDiagnostics")]
        private InputList<Inputs.ElastigroupAzureV3BootDiagnosticArgs>? _bootDiagnostics;
        public InputList<Inputs.ElastigroupAzureV3BootDiagnosticArgs> BootDiagnostics
        {
            get => _bootDiagnostics ?? (_bootDiagnostics = new InputList<Inputs.ElastigroupAzureV3BootDiagnosticArgs>());
            set => _bootDiagnostics = value;
        }

        [Input("capacityReservation")]
        public Input<Inputs.ElastigroupAzureV3CapacityReservationArgs>? CapacityReservation { get; set; }

        [Input("customData")]
        public Input<string>? CustomData { get; set; }

        [Input("dataDisks")]
        private InputList<Inputs.ElastigroupAzureV3DataDiskArgs>? _dataDisks;
        public InputList<Inputs.ElastigroupAzureV3DataDiskArgs> DataDisks
        {
            get => _dataDisks ?? (_dataDisks = new InputList<Inputs.ElastigroupAzureV3DataDiskArgs>());
            set => _dataDisks = value;
        }

        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("desiredCapacity")]
        public Input<int>? DesiredCapacity { get; set; }

        [Input("drainingTimeout")]
        public Input<int>? DrainingTimeout { get; set; }

        [Input("extensions")]
        private InputList<Inputs.ElastigroupAzureV3ExtensionArgs>? _extensions;
        public InputList<Inputs.ElastigroupAzureV3ExtensionArgs> Extensions
        {
            get => _extensions ?? (_extensions = new InputList<Inputs.ElastigroupAzureV3ExtensionArgs>());
            set => _extensions = value;
        }

        [Input("fallbackToOnDemand", required: true)]
        public Input<bool> FallbackToOnDemand { get; set; } = null!;

        [Input("health")]
        public Input<Inputs.ElastigroupAzureV3HealthArgs>? Health { get; set; }

        [Input("images")]
        private InputList<Inputs.ElastigroupAzureV3ImageArgs>? _images;
        public InputList<Inputs.ElastigroupAzureV3ImageArgs> Images
        {
            get => _images ?? (_images = new InputList<Inputs.ElastigroupAzureV3ImageArgs>());
            set => _images = value;
        }

        [Input("loadBalancers")]
        private InputList<Inputs.ElastigroupAzureV3LoadBalancerArgs>? _loadBalancers;
        public InputList<Inputs.ElastigroupAzureV3LoadBalancerArgs> LoadBalancers
        {
            get => _loadBalancers ?? (_loadBalancers = new InputList<Inputs.ElastigroupAzureV3LoadBalancerArgs>());
            set => _loadBalancers = value;
        }

        [Input("login")]
        public Input<Inputs.ElastigroupAzureV3LoginArgs>? Login { get; set; }

        [Input("managedServiceIdentities")]
        private InputList<Inputs.ElastigroupAzureV3ManagedServiceIdentityArgs>? _managedServiceIdentities;
        public InputList<Inputs.ElastigroupAzureV3ManagedServiceIdentityArgs> ManagedServiceIdentities
        {
            get => _managedServiceIdentities ?? (_managedServiceIdentities = new InputList<Inputs.ElastigroupAzureV3ManagedServiceIdentityArgs>());
            set => _managedServiceIdentities = value;
        }

        [Input("maxSize")]
        public Input<int>? MaxSize { get; set; }

        [Input("minSize")]
        public Input<int>? MinSize { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("network", required: true)]
        public Input<Inputs.ElastigroupAzureV3NetworkArgs> Network { get; set; } = null!;

        [Input("onDemandCount")]
        public Input<int>? OnDemandCount { get; set; }

        [Input("optimizationWindows")]
        private InputList<string>? _optimizationWindows;
        public InputList<string> OptimizationWindows
        {
            get => _optimizationWindows ?? (_optimizationWindows = new InputList<string>());
            set => _optimizationWindows = value;
        }

        [Input("os", required: true)]
        public Input<string> Os { get; set; } = null!;

        [Input("osDisk")]
        public Input<Inputs.ElastigroupAzureV3OsDiskArgs>? OsDisk { get; set; }

        [Input("preferredZones")]
        private InputList<string>? _preferredZones;
        public InputList<string> PreferredZones
        {
            get => _preferredZones ?? (_preferredZones = new InputList<string>());
            set => _preferredZones = value;
        }

        [Input("proximityPlacementGroups")]
        private InputList<Inputs.ElastigroupAzureV3ProximityPlacementGroupArgs>? _proximityPlacementGroups;
        public InputList<Inputs.ElastigroupAzureV3ProximityPlacementGroupArgs> ProximityPlacementGroups
        {
            get => _proximityPlacementGroups ?? (_proximityPlacementGroups = new InputList<Inputs.ElastigroupAzureV3ProximityPlacementGroupArgs>());
            set => _proximityPlacementGroups = value;
        }

        [Input("region", required: true)]
        public Input<string> Region { get; set; } = null!;

        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        [Input("revertToSpot")]
        public Input<Inputs.ElastigroupAzureV3RevertToSpotArgs>? RevertToSpot { get; set; }

        [Input("scalingDownPolicies")]
        private InputList<Inputs.ElastigroupAzureV3ScalingDownPolicyArgs>? _scalingDownPolicies;
        public InputList<Inputs.ElastigroupAzureV3ScalingDownPolicyArgs> ScalingDownPolicies
        {
            get => _scalingDownPolicies ?? (_scalingDownPolicies = new InputList<Inputs.ElastigroupAzureV3ScalingDownPolicyArgs>());
            set => _scalingDownPolicies = value;
        }

        [Input("scalingUpPolicies")]
        private InputList<Inputs.ElastigroupAzureV3ScalingUpPolicyArgs>? _scalingUpPolicies;
        public InputList<Inputs.ElastigroupAzureV3ScalingUpPolicyArgs> ScalingUpPolicies
        {
            get => _scalingUpPolicies ?? (_scalingUpPolicies = new InputList<Inputs.ElastigroupAzureV3ScalingUpPolicyArgs>());
            set => _scalingUpPolicies = value;
        }

        [Input("schedulingTasks")]
        private InputList<Inputs.ElastigroupAzureV3SchedulingTaskArgs>? _schedulingTasks;
        public InputList<Inputs.ElastigroupAzureV3SchedulingTaskArgs> SchedulingTasks
        {
            get => _schedulingTasks ?? (_schedulingTasks = new InputList<Inputs.ElastigroupAzureV3SchedulingTaskArgs>());
            set => _schedulingTasks = value;
        }

        [Input("secrets")]
        private InputList<Inputs.ElastigroupAzureV3SecretArgs>? _secrets;
        public InputList<Inputs.ElastigroupAzureV3SecretArgs> Secrets
        {
            get => _secrets ?? (_secrets = new InputList<Inputs.ElastigroupAzureV3SecretArgs>());
            set => _secrets = value;
        }

        [Input("security")]
        public Input<Inputs.ElastigroupAzureV3SecurityArgs>? Security { get; set; }

        [Input("shutdownScript")]
        public Input<string>? ShutdownScript { get; set; }

        [Input("signals")]
        private InputList<Inputs.ElastigroupAzureV3SignalArgs>? _signals;
        public InputList<Inputs.ElastigroupAzureV3SignalArgs> Signals
        {
            get => _signals ?? (_signals = new InputList<Inputs.ElastigroupAzureV3SignalArgs>());
            set => _signals = value;
        }

        [Input("spotPercentage")]
        public Input<int>? SpotPercentage { get; set; }

        [Input("tags")]
        private InputList<Inputs.ElastigroupAzureV3TagArgs>? _tags;
        public InputList<Inputs.ElastigroupAzureV3TagArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.ElastigroupAzureV3TagArgs>());
            set => _tags = value;
        }

        [Input("userData")]
        public Input<string>? UserData { get; set; }

        [Input("vmNamePrefix")]
        public Input<string>? VmNamePrefix { get; set; }

        [Input("vmSizes", required: true)]
        public Input<Inputs.ElastigroupAzureV3VmSizesArgs> VmSizes { get; set; } = null!;

        [Input("zones")]
        private InputList<string>? _zones;
        public InputList<string> Zones
        {
            get => _zones ?? (_zones = new InputList<string>());
            set => _zones = value;
        }

        public ElastigroupAzureV3Args()
        {
        }
        public static new ElastigroupAzureV3Args Empty => new ElastigroupAzureV3Args();
    }

    public sealed class ElastigroupAzureV3State : global::Pulumi.ResourceArgs
    {
        [Input("availabilityVsCost")]
        public Input<int>? AvailabilityVsCost { get; set; }

        [Input("bootDiagnostics")]
        private InputList<Inputs.ElastigroupAzureV3BootDiagnosticGetArgs>? _bootDiagnostics;
        public InputList<Inputs.ElastigroupAzureV3BootDiagnosticGetArgs> BootDiagnostics
        {
            get => _bootDiagnostics ?? (_bootDiagnostics = new InputList<Inputs.ElastigroupAzureV3BootDiagnosticGetArgs>());
            set => _bootDiagnostics = value;
        }

        [Input("capacityReservation")]
        public Input<Inputs.ElastigroupAzureV3CapacityReservationGetArgs>? CapacityReservation { get; set; }

        [Input("customData")]
        public Input<string>? CustomData { get; set; }

        [Input("dataDisks")]
        private InputList<Inputs.ElastigroupAzureV3DataDiskGetArgs>? _dataDisks;
        public InputList<Inputs.ElastigroupAzureV3DataDiskGetArgs> DataDisks
        {
            get => _dataDisks ?? (_dataDisks = new InputList<Inputs.ElastigroupAzureV3DataDiskGetArgs>());
            set => _dataDisks = value;
        }

        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("desiredCapacity")]
        public Input<int>? DesiredCapacity { get; set; }

        [Input("drainingTimeout")]
        public Input<int>? DrainingTimeout { get; set; }

        [Input("extensions")]
        private InputList<Inputs.ElastigroupAzureV3ExtensionGetArgs>? _extensions;
        public InputList<Inputs.ElastigroupAzureV3ExtensionGetArgs> Extensions
        {
            get => _extensions ?? (_extensions = new InputList<Inputs.ElastigroupAzureV3ExtensionGetArgs>());
            set => _extensions = value;
        }

        [Input("fallbackToOnDemand")]
        public Input<bool>? FallbackToOnDemand { get; set; }

        [Input("health")]
        public Input<Inputs.ElastigroupAzureV3HealthGetArgs>? Health { get; set; }

        [Input("images")]
        private InputList<Inputs.ElastigroupAzureV3ImageGetArgs>? _images;
        public InputList<Inputs.ElastigroupAzureV3ImageGetArgs> Images
        {
            get => _images ?? (_images = new InputList<Inputs.ElastigroupAzureV3ImageGetArgs>());
            set => _images = value;
        }

        [Input("loadBalancers")]
        private InputList<Inputs.ElastigroupAzureV3LoadBalancerGetArgs>? _loadBalancers;
        public InputList<Inputs.ElastigroupAzureV3LoadBalancerGetArgs> LoadBalancers
        {
            get => _loadBalancers ?? (_loadBalancers = new InputList<Inputs.ElastigroupAzureV3LoadBalancerGetArgs>());
            set => _loadBalancers = value;
        }

        [Input("login")]
        public Input<Inputs.ElastigroupAzureV3LoginGetArgs>? Login { get; set; }

        [Input("managedServiceIdentities")]
        private InputList<Inputs.ElastigroupAzureV3ManagedServiceIdentityGetArgs>? _managedServiceIdentities;
        public InputList<Inputs.ElastigroupAzureV3ManagedServiceIdentityGetArgs> ManagedServiceIdentities
        {
            get => _managedServiceIdentities ?? (_managedServiceIdentities = new InputList<Inputs.ElastigroupAzureV3ManagedServiceIdentityGetArgs>());
            set => _managedServiceIdentities = value;
        }

        [Input("maxSize")]
        public Input<int>? MaxSize { get; set; }

        [Input("minSize")]
        public Input<int>? MinSize { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("network")]
        public Input<Inputs.ElastigroupAzureV3NetworkGetArgs>? Network { get; set; }

        [Input("onDemandCount")]
        public Input<int>? OnDemandCount { get; set; }

        [Input("optimizationWindows")]
        private InputList<string>? _optimizationWindows;
        public InputList<string> OptimizationWindows
        {
            get => _optimizationWindows ?? (_optimizationWindows = new InputList<string>());
            set => _optimizationWindows = value;
        }

        [Input("os")]
        public Input<string>? Os { get; set; }

        [Input("osDisk")]
        public Input<Inputs.ElastigroupAzureV3OsDiskGetArgs>? OsDisk { get; set; }

        [Input("preferredZones")]
        private InputList<string>? _preferredZones;
        public InputList<string> PreferredZones
        {
            get => _preferredZones ?? (_preferredZones = new InputList<string>());
            set => _preferredZones = value;
        }

        [Input("proximityPlacementGroups")]
        private InputList<Inputs.ElastigroupAzureV3ProximityPlacementGroupGetArgs>? _proximityPlacementGroups;
        public InputList<Inputs.ElastigroupAzureV3ProximityPlacementGroupGetArgs> ProximityPlacementGroups
        {
            get => _proximityPlacementGroups ?? (_proximityPlacementGroups = new InputList<Inputs.ElastigroupAzureV3ProximityPlacementGroupGetArgs>());
            set => _proximityPlacementGroups = value;
        }

        [Input("region")]
        public Input<string>? Region { get; set; }

        [Input("resourceGroupName")]
        public Input<string>? ResourceGroupName { get; set; }

        [Input("revertToSpot")]
        public Input<Inputs.ElastigroupAzureV3RevertToSpotGetArgs>? RevertToSpot { get; set; }

        [Input("scalingDownPolicies")]
        private InputList<Inputs.ElastigroupAzureV3ScalingDownPolicyGetArgs>? _scalingDownPolicies;
        public InputList<Inputs.ElastigroupAzureV3ScalingDownPolicyGetArgs> ScalingDownPolicies
        {
            get => _scalingDownPolicies ?? (_scalingDownPolicies = new InputList<Inputs.ElastigroupAzureV3ScalingDownPolicyGetArgs>());
            set => _scalingDownPolicies = value;
        }

        [Input("scalingUpPolicies")]
        private InputList<Inputs.ElastigroupAzureV3ScalingUpPolicyGetArgs>? _scalingUpPolicies;
        public InputList<Inputs.ElastigroupAzureV3ScalingUpPolicyGetArgs> ScalingUpPolicies
        {
            get => _scalingUpPolicies ?? (_scalingUpPolicies = new InputList<Inputs.ElastigroupAzureV3ScalingUpPolicyGetArgs>());
            set => _scalingUpPolicies = value;
        }

        [Input("schedulingTasks")]
        private InputList<Inputs.ElastigroupAzureV3SchedulingTaskGetArgs>? _schedulingTasks;
        public InputList<Inputs.ElastigroupAzureV3SchedulingTaskGetArgs> SchedulingTasks
        {
            get => _schedulingTasks ?? (_schedulingTasks = new InputList<Inputs.ElastigroupAzureV3SchedulingTaskGetArgs>());
            set => _schedulingTasks = value;
        }

        [Input("secrets")]
        private InputList<Inputs.ElastigroupAzureV3SecretGetArgs>? _secrets;
        public InputList<Inputs.ElastigroupAzureV3SecretGetArgs> Secrets
        {
            get => _secrets ?? (_secrets = new InputList<Inputs.ElastigroupAzureV3SecretGetArgs>());
            set => _secrets = value;
        }

        [Input("security")]
        public Input<Inputs.ElastigroupAzureV3SecurityGetArgs>? Security { get; set; }

        [Input("shutdownScript")]
        public Input<string>? ShutdownScript { get; set; }

        [Input("signals")]
        private InputList<Inputs.ElastigroupAzureV3SignalGetArgs>? _signals;
        public InputList<Inputs.ElastigroupAzureV3SignalGetArgs> Signals
        {
            get => _signals ?? (_signals = new InputList<Inputs.ElastigroupAzureV3SignalGetArgs>());
            set => _signals = value;
        }

        [Input("spotPercentage")]
        public Input<int>? SpotPercentage { get; set; }

        [Input("tags")]
        private InputList<Inputs.ElastigroupAzureV3TagGetArgs>? _tags;
        public InputList<Inputs.ElastigroupAzureV3TagGetArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.ElastigroupAzureV3TagGetArgs>());
            set => _tags = value;
        }

        [Input("userData")]
        public Input<string>? UserData { get; set; }

        [Input("vmNamePrefix")]
        public Input<string>? VmNamePrefix { get; set; }

        [Input("vmSizes")]
        public Input<Inputs.ElastigroupAzureV3VmSizesGetArgs>? VmSizes { get; set; }

        [Input("zones")]
        private InputList<string>? _zones;
        public InputList<string> Zones
        {
            get => _zones ?? (_zones = new InputList<string>());
            set => _zones = value;
        }

        public ElastigroupAzureV3State()
        {
        }
        public static new ElastigroupAzureV3State Empty => new ElastigroupAzureV3State();
    }
}
