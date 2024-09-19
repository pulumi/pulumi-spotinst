// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Azure
{
    [SpotInstResourceType("spotinst:azure/oceanNp:OceanNp")]
    public partial class OceanNp : global::Pulumi.CustomResource
    {
        [Output("aksClusterName")]
        public Output<string> AksClusterName { get; private set; } = null!;

        [Output("aksInfrastructureResourceGroupName")]
        public Output<string> AksInfrastructureResourceGroupName { get; private set; } = null!;

        [Output("aksRegion")]
        public Output<string> AksRegion { get; private set; } = null!;

        [Output("aksResourceGroupName")]
        public Output<string> AksResourceGroupName { get; private set; } = null!;

        /// <summary>
        /// The Ocean Kubernetes Autoscaler object.
        /// </summary>
        [Output("autoscaler")]
        public Output<Outputs.OceanNpAutoscaler?> Autoscaler { get; private set; } = null!;

        /// <summary>
        /// An Array holding Availability Zones, this configures the availability zones the Ocean may launch instances in per VNG.
        /// </summary>
        [Output("availabilityZones")]
        public Output<ImmutableArray<string>> AvailabilityZones { get; private set; } = null!;

        /// <summary>
        /// Enter a unique Ocean cluster identifier. Cannot be updated. This needs to match with string that was used to install the controller in the cluster, typically clusterName + 8 digit string.
        /// </summary>
        [Output("controllerClusterId")]
        public Output<string> ControllerClusterId { get; private set; } = null!;

        /// <summary>
        /// Enable node public IP.
        /// </summary>
        [Output("enableNodePublicIp")]
        public Output<bool?> EnableNodePublicIp { get; private set; } = null!;

        /// <summary>
        /// If no spot VM markets are available, enable Ocean to launch regular (pay-as-you-go) nodes instead.
        /// </summary>
        [Output("fallbackToOndemand")]
        public Output<bool?> FallbackToOndemand { get; private set; } = null!;

        /// <summary>
        /// Filters for the VM sizes that can be launched from the virtual node group.
        /// </summary>
        [Output("filters")]
        public Output<Outputs.OceanNpFilters?> Filters { get; private set; } = null!;

        /// <summary>
        /// Specify the custom headroom per VNG. Provide a list of headroom objects.
        /// </summary>
        [Output("headrooms")]
        public Output<ImmutableArray<Outputs.OceanNpHeadroom>> Headrooms { get; private set; } = null!;

        /// <summary>
        /// The Ocean AKS Health object.
        /// </summary>
        [Output("health")]
        public Output<Outputs.OceanNpHealth?> Health { get; private set; } = null!;

        /// <summary>
        /// The desired Kubernetes version of the launched nodes. In case the value is null, the Kubernetes version of the control plane is used.
        /// </summary>
        [Output("kubernetesVersion")]
        public Output<string?> KubernetesVersion { get; private set; } = null!;

        /// <summary>
        /// An array of labels to add to the virtual node group. Only custom user labels are allowed, and not [Kubernetes well-known labels](https://kubernetes.io/docs/reference/labels-annotations-taints/) or [ Azure AKS labels](https://learn.microsoft.com/en-us/azure/aks/use-labels) or [Spot labels](https://docs.spot.io/ocean/features/labels-and-taints?id=spot-labels).
        /// </summary>
        [Output("labels")]
        public Output<ImmutableDictionary<string, string>?> Labels { get; private set; } = null!;

        /// <summary>
        /// Custom Linux OS configuration.
        /// </summary>
        [Output("linuxOsConfigs")]
        public Output<ImmutableArray<Outputs.OceanNpLinuxOsConfig>> LinuxOsConfigs { get; private set; } = null!;

        /// <summary>
        /// Maximum node count limit.
        /// </summary>
        [Output("maxCount")]
        public Output<int?> MaxCount { get; private set; } = null!;

        /// <summary>
        /// The maximum number of pods per node in the node pools.
        /// </summary>
        [Output("maxPodsPerNode")]
        public Output<int?> MaxPodsPerNode { get; private set; } = null!;

        /// <summary>
        /// Minimum node count limit.
        /// </summary>
        [Output("minCount")]
        public Output<int?> MinCount { get; private set; } = null!;

        /// <summary>
        /// Add a name for the Ocean cluster.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The size of the OS disk in GB.
        /// </summary>
        [Output("osDiskSizeGb")]
        public Output<int?> OsDiskSizeGb { get; private set; } = null!;

        /// <summary>
        /// The type of the OS disk.
        /// </summary>
        [Output("osDiskType")]
        public Output<string?> OsDiskType { get; private set; } = null!;

        /// <summary>
        /// The OS SKU of the OS type. Must correlate with the os type.
        /// </summary>
        [Output("osSku")]
        public Output<string?> OsSku { get; private set; } = null!;

        /// <summary>
        /// The OS type of the OS disk. Can't be modified once set.
        /// </summary>
        [Output("osType")]
        public Output<string?> OsType { get; private set; } = null!;

        /// <summary>
        /// The IDs of subnets in an existing VNet into which to assign pods in the cluster (requires azure network-plugin).
        /// </summary>
        [Output("podSubnetIds")]
        public Output<ImmutableArray<string>> PodSubnetIds { get; private set; } = null!;

        [Output("scheduling")]
        public Output<Outputs.OceanNpScheduling?> Scheduling { get; private set; } = null!;

        /// <summary>
        /// Percentage of spot VMs to maintain.
        /// </summary>
        [Output("spotPercentage")]
        public Output<int?> SpotPercentage { get; private set; } = null!;

        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// Add taints to a virtual node group. Only custom user taints are allowed, and not [Kubernetes well-known taints](https://kubernetes.io/docs/reference/labels-annotations-taints/) or Azure AKS [ScaleSetPrioirty (Spot VM) taint](https://learn.microsoft.com/en-us/azure/aks/spot-node-pool). For all Spot VMs, AKS injects a taint kubernetes.azure.com/scalesetpriority=spot:NoSchedule, to ensure that only workloads that can handle interruptions are scheduled on Spot nodes. To [schedule a pod to run on Spot node](https://learn.microsoft.com/en-us/azure/aks/spot-node-pool#schedule-a-pod-to-run-on-the-spot-node), add a toleration but dont include the nodeAffinity (not supported for Spot Ocean), this will prevent the pod from being scheduled using Spot Ocean.
        /// </summary>
        [Output("taints")]
        public Output<ImmutableArray<Outputs.OceanNpTaint>> Taints { get; private set; } = null!;

        [Output("updatePolicy")]
        public Output<Outputs.OceanNpUpdatePolicy?> UpdatePolicy { get; private set; } = null!;

        /// <summary>
        /// The IDs of subnets in an existing VNet into which to assign nodes in the cluster (requires azure network-plugin).
        /// </summary>
        [Output("vnetSubnetIds")]
        public Output<ImmutableArray<string>> VnetSubnetIds { get; private set; } = null!;


        /// <summary>
        /// Create a OceanNp resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public OceanNp(string name, OceanNpArgs args, CustomResourceOptions? options = null)
            : base("spotinst:azure/oceanNp:OceanNp", name, args ?? new OceanNpArgs(), MakeResourceOptions(options, ""))
        {
        }

        private OceanNp(string name, Input<string> id, OceanNpState? state = null, CustomResourceOptions? options = null)
            : base("spotinst:azure/oceanNp:OceanNp", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing OceanNp resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static OceanNp Get(string name, Input<string> id, OceanNpState? state = null, CustomResourceOptions? options = null)
        {
            return new OceanNp(name, id, state, options);
        }
    }

    public sealed class OceanNpArgs : global::Pulumi.ResourceArgs
    {
        [Input("aksClusterName", required: true)]
        public Input<string> AksClusterName { get; set; } = null!;

        [Input("aksInfrastructureResourceGroupName", required: true)]
        public Input<string> AksInfrastructureResourceGroupName { get; set; } = null!;

        [Input("aksRegion", required: true)]
        public Input<string> AksRegion { get; set; } = null!;

        [Input("aksResourceGroupName", required: true)]
        public Input<string> AksResourceGroupName { get; set; } = null!;

        /// <summary>
        /// The Ocean Kubernetes Autoscaler object.
        /// </summary>
        [Input("autoscaler")]
        public Input<Inputs.OceanNpAutoscalerArgs>? Autoscaler { get; set; }

        [Input("availabilityZones", required: true)]
        private InputList<string>? _availabilityZones;

        /// <summary>
        /// An Array holding Availability Zones, this configures the availability zones the Ocean may launch instances in per VNG.
        /// </summary>
        public InputList<string> AvailabilityZones
        {
            get => _availabilityZones ?? (_availabilityZones = new InputList<string>());
            set => _availabilityZones = value;
        }

        /// <summary>
        /// Enter a unique Ocean cluster identifier. Cannot be updated. This needs to match with string that was used to install the controller in the cluster, typically clusterName + 8 digit string.
        /// </summary>
        [Input("controllerClusterId", required: true)]
        public Input<string> ControllerClusterId { get; set; } = null!;

        /// <summary>
        /// Enable node public IP.
        /// </summary>
        [Input("enableNodePublicIp")]
        public Input<bool>? EnableNodePublicIp { get; set; }

        /// <summary>
        /// If no spot VM markets are available, enable Ocean to launch regular (pay-as-you-go) nodes instead.
        /// </summary>
        [Input("fallbackToOndemand")]
        public Input<bool>? FallbackToOndemand { get; set; }

        /// <summary>
        /// Filters for the VM sizes that can be launched from the virtual node group.
        /// </summary>
        [Input("filters")]
        public Input<Inputs.OceanNpFiltersArgs>? Filters { get; set; }

        [Input("headrooms")]
        private InputList<Inputs.OceanNpHeadroomArgs>? _headrooms;

        /// <summary>
        /// Specify the custom headroom per VNG. Provide a list of headroom objects.
        /// </summary>
        public InputList<Inputs.OceanNpHeadroomArgs> Headrooms
        {
            get => _headrooms ?? (_headrooms = new InputList<Inputs.OceanNpHeadroomArgs>());
            set => _headrooms = value;
        }

        /// <summary>
        /// The Ocean AKS Health object.
        /// </summary>
        [Input("health")]
        public Input<Inputs.OceanNpHealthArgs>? Health { get; set; }

        /// <summary>
        /// The desired Kubernetes version of the launched nodes. In case the value is null, the Kubernetes version of the control plane is used.
        /// </summary>
        [Input("kubernetesVersion")]
        public Input<string>? KubernetesVersion { get; set; }

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// An array of labels to add to the virtual node group. Only custom user labels are allowed, and not [Kubernetes well-known labels](https://kubernetes.io/docs/reference/labels-annotations-taints/) or [ Azure AKS labels](https://learn.microsoft.com/en-us/azure/aks/use-labels) or [Spot labels](https://docs.spot.io/ocean/features/labels-and-taints?id=spot-labels).
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        [Input("linuxOsConfigs")]
        private InputList<Inputs.OceanNpLinuxOsConfigArgs>? _linuxOsConfigs;

        /// <summary>
        /// Custom Linux OS configuration.
        /// </summary>
        public InputList<Inputs.OceanNpLinuxOsConfigArgs> LinuxOsConfigs
        {
            get => _linuxOsConfigs ?? (_linuxOsConfigs = new InputList<Inputs.OceanNpLinuxOsConfigArgs>());
            set => _linuxOsConfigs = value;
        }

        /// <summary>
        /// Maximum node count limit.
        /// </summary>
        [Input("maxCount")]
        public Input<int>? MaxCount { get; set; }

        /// <summary>
        /// The maximum number of pods per node in the node pools.
        /// </summary>
        [Input("maxPodsPerNode")]
        public Input<int>? MaxPodsPerNode { get; set; }

        /// <summary>
        /// Minimum node count limit.
        /// </summary>
        [Input("minCount")]
        public Input<int>? MinCount { get; set; }

        /// <summary>
        /// Add a name for the Ocean cluster.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The size of the OS disk in GB.
        /// </summary>
        [Input("osDiskSizeGb")]
        public Input<int>? OsDiskSizeGb { get; set; }

        /// <summary>
        /// The type of the OS disk.
        /// </summary>
        [Input("osDiskType")]
        public Input<string>? OsDiskType { get; set; }

        /// <summary>
        /// The OS SKU of the OS type. Must correlate with the os type.
        /// </summary>
        [Input("osSku")]
        public Input<string>? OsSku { get; set; }

        /// <summary>
        /// The OS type of the OS disk. Can't be modified once set.
        /// </summary>
        [Input("osType")]
        public Input<string>? OsType { get; set; }

        [Input("podSubnetIds")]
        private InputList<string>? _podSubnetIds;

        /// <summary>
        /// The IDs of subnets in an existing VNet into which to assign pods in the cluster (requires azure network-plugin).
        /// </summary>
        public InputList<string> PodSubnetIds
        {
            get => _podSubnetIds ?? (_podSubnetIds = new InputList<string>());
            set => _podSubnetIds = value;
        }

        [Input("scheduling")]
        public Input<Inputs.OceanNpSchedulingArgs>? Scheduling { get; set; }

        /// <summary>
        /// Percentage of spot VMs to maintain.
        /// </summary>
        [Input("spotPercentage")]
        public Input<int>? SpotPercentage { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        [Input("taints")]
        private InputList<Inputs.OceanNpTaintArgs>? _taints;

        /// <summary>
        /// Add taints to a virtual node group. Only custom user taints are allowed, and not [Kubernetes well-known taints](https://kubernetes.io/docs/reference/labels-annotations-taints/) or Azure AKS [ScaleSetPrioirty (Spot VM) taint](https://learn.microsoft.com/en-us/azure/aks/spot-node-pool). For all Spot VMs, AKS injects a taint kubernetes.azure.com/scalesetpriority=spot:NoSchedule, to ensure that only workloads that can handle interruptions are scheduled on Spot nodes. To [schedule a pod to run on Spot node](https://learn.microsoft.com/en-us/azure/aks/spot-node-pool#schedule-a-pod-to-run-on-the-spot-node), add a toleration but dont include the nodeAffinity (not supported for Spot Ocean), this will prevent the pod from being scheduled using Spot Ocean.
        /// </summary>
        public InputList<Inputs.OceanNpTaintArgs> Taints
        {
            get => _taints ?? (_taints = new InputList<Inputs.OceanNpTaintArgs>());
            set => _taints = value;
        }

        [Input("updatePolicy")]
        public Input<Inputs.OceanNpUpdatePolicyArgs>? UpdatePolicy { get; set; }

        [Input("vnetSubnetIds")]
        private InputList<string>? _vnetSubnetIds;

        /// <summary>
        /// The IDs of subnets in an existing VNet into which to assign nodes in the cluster (requires azure network-plugin).
        /// </summary>
        public InputList<string> VnetSubnetIds
        {
            get => _vnetSubnetIds ?? (_vnetSubnetIds = new InputList<string>());
            set => _vnetSubnetIds = value;
        }

        public OceanNpArgs()
        {
        }
        public static new OceanNpArgs Empty => new OceanNpArgs();
    }

    public sealed class OceanNpState : global::Pulumi.ResourceArgs
    {
        [Input("aksClusterName")]
        public Input<string>? AksClusterName { get; set; }

        [Input("aksInfrastructureResourceGroupName")]
        public Input<string>? AksInfrastructureResourceGroupName { get; set; }

        [Input("aksRegion")]
        public Input<string>? AksRegion { get; set; }

        [Input("aksResourceGroupName")]
        public Input<string>? AksResourceGroupName { get; set; }

        /// <summary>
        /// The Ocean Kubernetes Autoscaler object.
        /// </summary>
        [Input("autoscaler")]
        public Input<Inputs.OceanNpAutoscalerGetArgs>? Autoscaler { get; set; }

        [Input("availabilityZones")]
        private InputList<string>? _availabilityZones;

        /// <summary>
        /// An Array holding Availability Zones, this configures the availability zones the Ocean may launch instances in per VNG.
        /// </summary>
        public InputList<string> AvailabilityZones
        {
            get => _availabilityZones ?? (_availabilityZones = new InputList<string>());
            set => _availabilityZones = value;
        }

        /// <summary>
        /// Enter a unique Ocean cluster identifier. Cannot be updated. This needs to match with string that was used to install the controller in the cluster, typically clusterName + 8 digit string.
        /// </summary>
        [Input("controllerClusterId")]
        public Input<string>? ControllerClusterId { get; set; }

        /// <summary>
        /// Enable node public IP.
        /// </summary>
        [Input("enableNodePublicIp")]
        public Input<bool>? EnableNodePublicIp { get; set; }

        /// <summary>
        /// If no spot VM markets are available, enable Ocean to launch regular (pay-as-you-go) nodes instead.
        /// </summary>
        [Input("fallbackToOndemand")]
        public Input<bool>? FallbackToOndemand { get; set; }

        /// <summary>
        /// Filters for the VM sizes that can be launched from the virtual node group.
        /// </summary>
        [Input("filters")]
        public Input<Inputs.OceanNpFiltersGetArgs>? Filters { get; set; }

        [Input("headrooms")]
        private InputList<Inputs.OceanNpHeadroomGetArgs>? _headrooms;

        /// <summary>
        /// Specify the custom headroom per VNG. Provide a list of headroom objects.
        /// </summary>
        public InputList<Inputs.OceanNpHeadroomGetArgs> Headrooms
        {
            get => _headrooms ?? (_headrooms = new InputList<Inputs.OceanNpHeadroomGetArgs>());
            set => _headrooms = value;
        }

        /// <summary>
        /// The Ocean AKS Health object.
        /// </summary>
        [Input("health")]
        public Input<Inputs.OceanNpHealthGetArgs>? Health { get; set; }

        /// <summary>
        /// The desired Kubernetes version of the launched nodes. In case the value is null, the Kubernetes version of the control plane is used.
        /// </summary>
        [Input("kubernetesVersion")]
        public Input<string>? KubernetesVersion { get; set; }

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// An array of labels to add to the virtual node group. Only custom user labels are allowed, and not [Kubernetes well-known labels](https://kubernetes.io/docs/reference/labels-annotations-taints/) or [ Azure AKS labels](https://learn.microsoft.com/en-us/azure/aks/use-labels) or [Spot labels](https://docs.spot.io/ocean/features/labels-and-taints?id=spot-labels).
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        [Input("linuxOsConfigs")]
        private InputList<Inputs.OceanNpLinuxOsConfigGetArgs>? _linuxOsConfigs;

        /// <summary>
        /// Custom Linux OS configuration.
        /// </summary>
        public InputList<Inputs.OceanNpLinuxOsConfigGetArgs> LinuxOsConfigs
        {
            get => _linuxOsConfigs ?? (_linuxOsConfigs = new InputList<Inputs.OceanNpLinuxOsConfigGetArgs>());
            set => _linuxOsConfigs = value;
        }

        /// <summary>
        /// Maximum node count limit.
        /// </summary>
        [Input("maxCount")]
        public Input<int>? MaxCount { get; set; }

        /// <summary>
        /// The maximum number of pods per node in the node pools.
        /// </summary>
        [Input("maxPodsPerNode")]
        public Input<int>? MaxPodsPerNode { get; set; }

        /// <summary>
        /// Minimum node count limit.
        /// </summary>
        [Input("minCount")]
        public Input<int>? MinCount { get; set; }

        /// <summary>
        /// Add a name for the Ocean cluster.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The size of the OS disk in GB.
        /// </summary>
        [Input("osDiskSizeGb")]
        public Input<int>? OsDiskSizeGb { get; set; }

        /// <summary>
        /// The type of the OS disk.
        /// </summary>
        [Input("osDiskType")]
        public Input<string>? OsDiskType { get; set; }

        /// <summary>
        /// The OS SKU of the OS type. Must correlate with the os type.
        /// </summary>
        [Input("osSku")]
        public Input<string>? OsSku { get; set; }

        /// <summary>
        /// The OS type of the OS disk. Can't be modified once set.
        /// </summary>
        [Input("osType")]
        public Input<string>? OsType { get; set; }

        [Input("podSubnetIds")]
        private InputList<string>? _podSubnetIds;

        /// <summary>
        /// The IDs of subnets in an existing VNet into which to assign pods in the cluster (requires azure network-plugin).
        /// </summary>
        public InputList<string> PodSubnetIds
        {
            get => _podSubnetIds ?? (_podSubnetIds = new InputList<string>());
            set => _podSubnetIds = value;
        }

        [Input("scheduling")]
        public Input<Inputs.OceanNpSchedulingGetArgs>? Scheduling { get; set; }

        /// <summary>
        /// Percentage of spot VMs to maintain.
        /// </summary>
        [Input("spotPercentage")]
        public Input<int>? SpotPercentage { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        [Input("taints")]
        private InputList<Inputs.OceanNpTaintGetArgs>? _taints;

        /// <summary>
        /// Add taints to a virtual node group. Only custom user taints are allowed, and not [Kubernetes well-known taints](https://kubernetes.io/docs/reference/labels-annotations-taints/) or Azure AKS [ScaleSetPrioirty (Spot VM) taint](https://learn.microsoft.com/en-us/azure/aks/spot-node-pool). For all Spot VMs, AKS injects a taint kubernetes.azure.com/scalesetpriority=spot:NoSchedule, to ensure that only workloads that can handle interruptions are scheduled on Spot nodes. To [schedule a pod to run on Spot node](https://learn.microsoft.com/en-us/azure/aks/spot-node-pool#schedule-a-pod-to-run-on-the-spot-node), add a toleration but dont include the nodeAffinity (not supported for Spot Ocean), this will prevent the pod from being scheduled using Spot Ocean.
        /// </summary>
        public InputList<Inputs.OceanNpTaintGetArgs> Taints
        {
            get => _taints ?? (_taints = new InputList<Inputs.OceanNpTaintGetArgs>());
            set => _taints = value;
        }

        [Input("updatePolicy")]
        public Input<Inputs.OceanNpUpdatePolicyGetArgs>? UpdatePolicy { get; set; }

        [Input("vnetSubnetIds")]
        private InputList<string>? _vnetSubnetIds;

        /// <summary>
        /// The IDs of subnets in an existing VNet into which to assign nodes in the cluster (requires azure network-plugin).
        /// </summary>
        public InputList<string> VnetSubnetIds
        {
            get => _vnetSubnetIds ?? (_vnetSubnetIds = new InputList<string>());
            set => _vnetSubnetIds = value;
        }

        public OceanNpState()
        {
        }
        public static new OceanNpState Empty => new OceanNpState();
    }
}
