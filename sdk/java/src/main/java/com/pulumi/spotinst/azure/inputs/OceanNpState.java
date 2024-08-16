// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.azure.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.spotinst.azure.inputs.OceanNpAutoscalerArgs;
import com.pulumi.spotinst.azure.inputs.OceanNpFiltersArgs;
import com.pulumi.spotinst.azure.inputs.OceanNpHeadroomArgs;
import com.pulumi.spotinst.azure.inputs.OceanNpHealthArgs;
import com.pulumi.spotinst.azure.inputs.OceanNpLinuxOsConfigArgs;
import com.pulumi.spotinst.azure.inputs.OceanNpSchedulingArgs;
import com.pulumi.spotinst.azure.inputs.OceanNpTaintArgs;
import com.pulumi.spotinst.azure.inputs.OceanNpUpdatePolicyArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OceanNpState extends com.pulumi.resources.ResourceArgs {

    public static final OceanNpState Empty = new OceanNpState();

    @Import(name="aksClusterName")
    private @Nullable Output<String> aksClusterName;

    public Optional<Output<String>> aksClusterName() {
        return Optional.ofNullable(this.aksClusterName);
    }

    @Import(name="aksInfrastructureResourceGroupName")
    private @Nullable Output<String> aksInfrastructureResourceGroupName;

    public Optional<Output<String>> aksInfrastructureResourceGroupName() {
        return Optional.ofNullable(this.aksInfrastructureResourceGroupName);
    }

    @Import(name="aksRegion")
    private @Nullable Output<String> aksRegion;

    public Optional<Output<String>> aksRegion() {
        return Optional.ofNullable(this.aksRegion);
    }

    @Import(name="aksResourceGroupName")
    private @Nullable Output<String> aksResourceGroupName;

    public Optional<Output<String>> aksResourceGroupName() {
        return Optional.ofNullable(this.aksResourceGroupName);
    }

    /**
     * The Ocean Kubernetes Autoscaler object.
     * 
     */
    @Import(name="autoscaler")
    private @Nullable Output<OceanNpAutoscalerArgs> autoscaler;

    /**
     * @return The Ocean Kubernetes Autoscaler object.
     * 
     */
    public Optional<Output<OceanNpAutoscalerArgs>> autoscaler() {
        return Optional.ofNullable(this.autoscaler);
    }

    /**
     * An Array holding Availability Zones, this configures the availability zones the Ocean may launch instances in per VNG.
     * 
     */
    @Import(name="availabilityZones")
    private @Nullable Output<List<String>> availabilityZones;

    /**
     * @return An Array holding Availability Zones, this configures the availability zones the Ocean may launch instances in per VNG.
     * 
     */
    public Optional<Output<List<String>>> availabilityZones() {
        return Optional.ofNullable(this.availabilityZones);
    }

    /**
     * Enter a unique Ocean cluster identifier. Cannot be updated. This needs to match with string that was used to install the controller in the cluster, typically clusterName + 8 digit string.
     * 
     */
    @Import(name="controllerClusterId")
    private @Nullable Output<String> controllerClusterId;

    /**
     * @return Enter a unique Ocean cluster identifier. Cannot be updated. This needs to match with string that was used to install the controller in the cluster, typically clusterName + 8 digit string.
     * 
     */
    public Optional<Output<String>> controllerClusterId() {
        return Optional.ofNullable(this.controllerClusterId);
    }

    /**
     * Enable node public IP.
     * 
     */
    @Import(name="enableNodePublicIp")
    private @Nullable Output<Boolean> enableNodePublicIp;

    /**
     * @return Enable node public IP.
     * 
     */
    public Optional<Output<Boolean>> enableNodePublicIp() {
        return Optional.ofNullable(this.enableNodePublicIp);
    }

    /**
     * If no spot VM markets are available, enable Ocean to launch regular (pay-as-you-go) nodes instead.
     * 
     */
    @Import(name="fallbackToOndemand")
    private @Nullable Output<Boolean> fallbackToOndemand;

    /**
     * @return If no spot VM markets are available, enable Ocean to launch regular (pay-as-you-go) nodes instead.
     * 
     */
    public Optional<Output<Boolean>> fallbackToOndemand() {
        return Optional.ofNullable(this.fallbackToOndemand);
    }

    /**
     * Filters for the VM sizes that can be launched from the virtual node group.
     * 
     */
    @Import(name="filters")
    private @Nullable Output<OceanNpFiltersArgs> filters;

    /**
     * @return Filters for the VM sizes that can be launched from the virtual node group.
     * 
     */
    public Optional<Output<OceanNpFiltersArgs>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * Specify the custom headroom per VNG. Provide a list of headroom objects.
     * 
     */
    @Import(name="headrooms")
    private @Nullable Output<List<OceanNpHeadroomArgs>> headrooms;

    /**
     * @return Specify the custom headroom per VNG. Provide a list of headroom objects.
     * 
     */
    public Optional<Output<List<OceanNpHeadroomArgs>>> headrooms() {
        return Optional.ofNullable(this.headrooms);
    }

    /**
     * The Ocean AKS Health object.
     * 
     */
    @Import(name="health")
    private @Nullable Output<OceanNpHealthArgs> health;

    /**
     * @return The Ocean AKS Health object.
     * 
     */
    public Optional<Output<OceanNpHealthArgs>> health() {
        return Optional.ofNullable(this.health);
    }

    /**
     * The desired Kubernetes version of the launched nodes. In case the value is null, the Kubernetes version of the control plane is used.
     * 
     */
    @Import(name="kubernetesVersion")
    private @Nullable Output<String> kubernetesVersion;

    /**
     * @return The desired Kubernetes version of the launched nodes. In case the value is null, the Kubernetes version of the control plane is used.
     * 
     */
    public Optional<Output<String>> kubernetesVersion() {
        return Optional.ofNullable(this.kubernetesVersion);
    }

    /**
     * An array of labels to add to the virtual node group. Only custom user labels are allowed, and not [Kubernetes well-known labels](https://kubernetes.io/docs/reference/labels-annotations-taints/) or [ Azure AKS labels](https://learn.microsoft.com/en-us/azure/aks/use-labels) or [Spot labels](https://docs.spot.io/ocean/features/labels-and-taints?id=spot-labels).
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return An array of labels to add to the virtual node group. Only custom user labels are allowed, and not [Kubernetes well-known labels](https://kubernetes.io/docs/reference/labels-annotations-taints/) or [ Azure AKS labels](https://learn.microsoft.com/en-us/azure/aks/use-labels) or [Spot labels](https://docs.spot.io/ocean/features/labels-and-taints?id=spot-labels).
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Custom Linux OS configuration.
     * 
     */
    @Import(name="linuxOsConfigs")
    private @Nullable Output<List<OceanNpLinuxOsConfigArgs>> linuxOsConfigs;

    /**
     * @return Custom Linux OS configuration.
     * 
     */
    public Optional<Output<List<OceanNpLinuxOsConfigArgs>>> linuxOsConfigs() {
        return Optional.ofNullable(this.linuxOsConfigs);
    }

    /**
     * Maximum node count limit.
     * 
     */
    @Import(name="maxCount")
    private @Nullable Output<Integer> maxCount;

    /**
     * @return Maximum node count limit.
     * 
     */
    public Optional<Output<Integer>> maxCount() {
        return Optional.ofNullable(this.maxCount);
    }

    /**
     * The maximum number of pods per node in the node pools.
     * 
     */
    @Import(name="maxPodsPerNode")
    private @Nullable Output<Integer> maxPodsPerNode;

    /**
     * @return The maximum number of pods per node in the node pools.
     * 
     */
    public Optional<Output<Integer>> maxPodsPerNode() {
        return Optional.ofNullable(this.maxPodsPerNode);
    }

    /**
     * Minimum node count limit.
     * 
     */
    @Import(name="minCount")
    private @Nullable Output<Integer> minCount;

    /**
     * @return Minimum node count limit.
     * 
     */
    public Optional<Output<Integer>> minCount() {
        return Optional.ofNullable(this.minCount);
    }

    /**
     * Add a name for the Ocean cluster.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Add a name for the Ocean cluster.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The size of the OS disk in GB.
     * 
     */
    @Import(name="osDiskSizeGb")
    private @Nullable Output<Integer> osDiskSizeGb;

    /**
     * @return The size of the OS disk in GB.
     * 
     */
    public Optional<Output<Integer>> osDiskSizeGb() {
        return Optional.ofNullable(this.osDiskSizeGb);
    }

    /**
     * The type of the OS disk.
     * 
     */
    @Import(name="osDiskType")
    private @Nullable Output<String> osDiskType;

    /**
     * @return The type of the OS disk.
     * 
     */
    public Optional<Output<String>> osDiskType() {
        return Optional.ofNullable(this.osDiskType);
    }

    /**
     * The OS SKU of the OS type. Must correlate with the os type.
     * 
     */
    @Import(name="osSku")
    private @Nullable Output<String> osSku;

    /**
     * @return The OS SKU of the OS type. Must correlate with the os type.
     * 
     */
    public Optional<Output<String>> osSku() {
        return Optional.ofNullable(this.osSku);
    }

    /**
     * The OS type of the OS disk. Can&#39;t be modified once set.
     * 
     */
    @Import(name="osType")
    private @Nullable Output<String> osType;

    /**
     * @return The OS type of the OS disk. Can&#39;t be modified once set.
     * 
     */
    public Optional<Output<String>> osType() {
        return Optional.ofNullable(this.osType);
    }

    /**
     * The IDs of subnets in an existing VNet into which to assign pods in the cluster (requires azure network-plugin).
     * 
     */
    @Import(name="podSubnetIds")
    private @Nullable Output<List<String>> podSubnetIds;

    /**
     * @return The IDs of subnets in an existing VNet into which to assign pods in the cluster (requires azure network-plugin).
     * 
     */
    public Optional<Output<List<String>>> podSubnetIds() {
        return Optional.ofNullable(this.podSubnetIds);
    }

    @Import(name="scheduling")
    private @Nullable Output<OceanNpSchedulingArgs> scheduling;

    public Optional<Output<OceanNpSchedulingArgs>> scheduling() {
        return Optional.ofNullable(this.scheduling);
    }

    /**
     * Percentage of spot VMs to maintain.
     * 
     */
    @Import(name="spotPercentage")
    private @Nullable Output<Integer> spotPercentage;

    /**
     * @return Percentage of spot VMs to maintain.
     * 
     */
    public Optional<Output<Integer>> spotPercentage() {
        return Optional.ofNullable(this.spotPercentage);
    }

    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Add taints to a virtual node group. Only custom user taints are allowed, and not [Kubernetes well-known taints](https://kubernetes.io/docs/reference/labels-annotations-taints/) or Azure AKS [ScaleSetPrioirty (Spot VM) taint](https://learn.microsoft.com/en-us/azure/aks/spot-node-pool). For all Spot VMs, AKS injects a taint kubernetes.azure.com/scalesetpriority=spot:NoSchedule, to ensure that only workloads that can handle interruptions are scheduled on Spot nodes. To [schedule a pod to run on Spot node](https://learn.microsoft.com/en-us/azure/aks/spot-node-pool#schedule-a-pod-to-run-on-the-spot-node), add a toleration but dont include the nodeAffinity (not supported for Spot Ocean), this will prevent the pod from being scheduled using Spot Ocean.
     * 
     */
    @Import(name="taints")
    private @Nullable Output<List<OceanNpTaintArgs>> taints;

    /**
     * @return Add taints to a virtual node group. Only custom user taints are allowed, and not [Kubernetes well-known taints](https://kubernetes.io/docs/reference/labels-annotations-taints/) or Azure AKS [ScaleSetPrioirty (Spot VM) taint](https://learn.microsoft.com/en-us/azure/aks/spot-node-pool). For all Spot VMs, AKS injects a taint kubernetes.azure.com/scalesetpriority=spot:NoSchedule, to ensure that only workloads that can handle interruptions are scheduled on Spot nodes. To [schedule a pod to run on Spot node](https://learn.microsoft.com/en-us/azure/aks/spot-node-pool#schedule-a-pod-to-run-on-the-spot-node), add a toleration but dont include the nodeAffinity (not supported for Spot Ocean), this will prevent the pod from being scheduled using Spot Ocean.
     * 
     */
    public Optional<Output<List<OceanNpTaintArgs>>> taints() {
        return Optional.ofNullable(this.taints);
    }

    @Import(name="updatePolicy")
    private @Nullable Output<OceanNpUpdatePolicyArgs> updatePolicy;

    public Optional<Output<OceanNpUpdatePolicyArgs>> updatePolicy() {
        return Optional.ofNullable(this.updatePolicy);
    }

    /**
     * The IDs of subnets in an existing VNet into which to assign nodes in the cluster (requires azure network-plugin).
     * 
     */
    @Import(name="vnetSubnetIds")
    private @Nullable Output<List<String>> vnetSubnetIds;

    /**
     * @return The IDs of subnets in an existing VNet into which to assign nodes in the cluster (requires azure network-plugin).
     * 
     */
    public Optional<Output<List<String>>> vnetSubnetIds() {
        return Optional.ofNullable(this.vnetSubnetIds);
    }

    private OceanNpState() {}

    private OceanNpState(OceanNpState $) {
        this.aksClusterName = $.aksClusterName;
        this.aksInfrastructureResourceGroupName = $.aksInfrastructureResourceGroupName;
        this.aksRegion = $.aksRegion;
        this.aksResourceGroupName = $.aksResourceGroupName;
        this.autoscaler = $.autoscaler;
        this.availabilityZones = $.availabilityZones;
        this.controllerClusterId = $.controllerClusterId;
        this.enableNodePublicIp = $.enableNodePublicIp;
        this.fallbackToOndemand = $.fallbackToOndemand;
        this.filters = $.filters;
        this.headrooms = $.headrooms;
        this.health = $.health;
        this.kubernetesVersion = $.kubernetesVersion;
        this.labels = $.labels;
        this.linuxOsConfigs = $.linuxOsConfigs;
        this.maxCount = $.maxCount;
        this.maxPodsPerNode = $.maxPodsPerNode;
        this.minCount = $.minCount;
        this.name = $.name;
        this.osDiskSizeGb = $.osDiskSizeGb;
        this.osDiskType = $.osDiskType;
        this.osSku = $.osSku;
        this.osType = $.osType;
        this.podSubnetIds = $.podSubnetIds;
        this.scheduling = $.scheduling;
        this.spotPercentage = $.spotPercentage;
        this.tags = $.tags;
        this.taints = $.taints;
        this.updatePolicy = $.updatePolicy;
        this.vnetSubnetIds = $.vnetSubnetIds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OceanNpState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OceanNpState $;

        public Builder() {
            $ = new OceanNpState();
        }

        public Builder(OceanNpState defaults) {
            $ = new OceanNpState(Objects.requireNonNull(defaults));
        }

        public Builder aksClusterName(@Nullable Output<String> aksClusterName) {
            $.aksClusterName = aksClusterName;
            return this;
        }

        public Builder aksClusterName(String aksClusterName) {
            return aksClusterName(Output.of(aksClusterName));
        }

        public Builder aksInfrastructureResourceGroupName(@Nullable Output<String> aksInfrastructureResourceGroupName) {
            $.aksInfrastructureResourceGroupName = aksInfrastructureResourceGroupName;
            return this;
        }

        public Builder aksInfrastructureResourceGroupName(String aksInfrastructureResourceGroupName) {
            return aksInfrastructureResourceGroupName(Output.of(aksInfrastructureResourceGroupName));
        }

        public Builder aksRegion(@Nullable Output<String> aksRegion) {
            $.aksRegion = aksRegion;
            return this;
        }

        public Builder aksRegion(String aksRegion) {
            return aksRegion(Output.of(aksRegion));
        }

        public Builder aksResourceGroupName(@Nullable Output<String> aksResourceGroupName) {
            $.aksResourceGroupName = aksResourceGroupName;
            return this;
        }

        public Builder aksResourceGroupName(String aksResourceGroupName) {
            return aksResourceGroupName(Output.of(aksResourceGroupName));
        }

        /**
         * @param autoscaler The Ocean Kubernetes Autoscaler object.
         * 
         * @return builder
         * 
         */
        public Builder autoscaler(@Nullable Output<OceanNpAutoscalerArgs> autoscaler) {
            $.autoscaler = autoscaler;
            return this;
        }

        /**
         * @param autoscaler The Ocean Kubernetes Autoscaler object.
         * 
         * @return builder
         * 
         */
        public Builder autoscaler(OceanNpAutoscalerArgs autoscaler) {
            return autoscaler(Output.of(autoscaler));
        }

        /**
         * @param availabilityZones An Array holding Availability Zones, this configures the availability zones the Ocean may launch instances in per VNG.
         * 
         * @return builder
         * 
         */
        public Builder availabilityZones(@Nullable Output<List<String>> availabilityZones) {
            $.availabilityZones = availabilityZones;
            return this;
        }

        /**
         * @param availabilityZones An Array holding Availability Zones, this configures the availability zones the Ocean may launch instances in per VNG.
         * 
         * @return builder
         * 
         */
        public Builder availabilityZones(List<String> availabilityZones) {
            return availabilityZones(Output.of(availabilityZones));
        }

        /**
         * @param availabilityZones An Array holding Availability Zones, this configures the availability zones the Ocean may launch instances in per VNG.
         * 
         * @return builder
         * 
         */
        public Builder availabilityZones(String... availabilityZones) {
            return availabilityZones(List.of(availabilityZones));
        }

        /**
         * @param controllerClusterId Enter a unique Ocean cluster identifier. Cannot be updated. This needs to match with string that was used to install the controller in the cluster, typically clusterName + 8 digit string.
         * 
         * @return builder
         * 
         */
        public Builder controllerClusterId(@Nullable Output<String> controllerClusterId) {
            $.controllerClusterId = controllerClusterId;
            return this;
        }

        /**
         * @param controllerClusterId Enter a unique Ocean cluster identifier. Cannot be updated. This needs to match with string that was used to install the controller in the cluster, typically clusterName + 8 digit string.
         * 
         * @return builder
         * 
         */
        public Builder controllerClusterId(String controllerClusterId) {
            return controllerClusterId(Output.of(controllerClusterId));
        }

        /**
         * @param enableNodePublicIp Enable node public IP.
         * 
         * @return builder
         * 
         */
        public Builder enableNodePublicIp(@Nullable Output<Boolean> enableNodePublicIp) {
            $.enableNodePublicIp = enableNodePublicIp;
            return this;
        }

        /**
         * @param enableNodePublicIp Enable node public IP.
         * 
         * @return builder
         * 
         */
        public Builder enableNodePublicIp(Boolean enableNodePublicIp) {
            return enableNodePublicIp(Output.of(enableNodePublicIp));
        }

        /**
         * @param fallbackToOndemand If no spot VM markets are available, enable Ocean to launch regular (pay-as-you-go) nodes instead.
         * 
         * @return builder
         * 
         */
        public Builder fallbackToOndemand(@Nullable Output<Boolean> fallbackToOndemand) {
            $.fallbackToOndemand = fallbackToOndemand;
            return this;
        }

        /**
         * @param fallbackToOndemand If no spot VM markets are available, enable Ocean to launch regular (pay-as-you-go) nodes instead.
         * 
         * @return builder
         * 
         */
        public Builder fallbackToOndemand(Boolean fallbackToOndemand) {
            return fallbackToOndemand(Output.of(fallbackToOndemand));
        }

        /**
         * @param filters Filters for the VM sizes that can be launched from the virtual node group.
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable Output<OceanNpFiltersArgs> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters Filters for the VM sizes that can be launched from the virtual node group.
         * 
         * @return builder
         * 
         */
        public Builder filters(OceanNpFiltersArgs filters) {
            return filters(Output.of(filters));
        }

        /**
         * @param headrooms Specify the custom headroom per VNG. Provide a list of headroom objects.
         * 
         * @return builder
         * 
         */
        public Builder headrooms(@Nullable Output<List<OceanNpHeadroomArgs>> headrooms) {
            $.headrooms = headrooms;
            return this;
        }

        /**
         * @param headrooms Specify the custom headroom per VNG. Provide a list of headroom objects.
         * 
         * @return builder
         * 
         */
        public Builder headrooms(List<OceanNpHeadroomArgs> headrooms) {
            return headrooms(Output.of(headrooms));
        }

        /**
         * @param headrooms Specify the custom headroom per VNG. Provide a list of headroom objects.
         * 
         * @return builder
         * 
         */
        public Builder headrooms(OceanNpHeadroomArgs... headrooms) {
            return headrooms(List.of(headrooms));
        }

        /**
         * @param health The Ocean AKS Health object.
         * 
         * @return builder
         * 
         */
        public Builder health(@Nullable Output<OceanNpHealthArgs> health) {
            $.health = health;
            return this;
        }

        /**
         * @param health The Ocean AKS Health object.
         * 
         * @return builder
         * 
         */
        public Builder health(OceanNpHealthArgs health) {
            return health(Output.of(health));
        }

        /**
         * @param kubernetesVersion The desired Kubernetes version of the launched nodes. In case the value is null, the Kubernetes version of the control plane is used.
         * 
         * @return builder
         * 
         */
        public Builder kubernetesVersion(@Nullable Output<String> kubernetesVersion) {
            $.kubernetesVersion = kubernetesVersion;
            return this;
        }

        /**
         * @param kubernetesVersion The desired Kubernetes version of the launched nodes. In case the value is null, the Kubernetes version of the control plane is used.
         * 
         * @return builder
         * 
         */
        public Builder kubernetesVersion(String kubernetesVersion) {
            return kubernetesVersion(Output.of(kubernetesVersion));
        }

        /**
         * @param labels An array of labels to add to the virtual node group. Only custom user labels are allowed, and not [Kubernetes well-known labels](https://kubernetes.io/docs/reference/labels-annotations-taints/) or [ Azure AKS labels](https://learn.microsoft.com/en-us/azure/aks/use-labels) or [Spot labels](https://docs.spot.io/ocean/features/labels-and-taints?id=spot-labels).
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels An array of labels to add to the virtual node group. Only custom user labels are allowed, and not [Kubernetes well-known labels](https://kubernetes.io/docs/reference/labels-annotations-taints/) or [ Azure AKS labels](https://learn.microsoft.com/en-us/azure/aks/use-labels) or [Spot labels](https://docs.spot.io/ocean/features/labels-and-taints?id=spot-labels).
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param linuxOsConfigs Custom Linux OS configuration.
         * 
         * @return builder
         * 
         */
        public Builder linuxOsConfigs(@Nullable Output<List<OceanNpLinuxOsConfigArgs>> linuxOsConfigs) {
            $.linuxOsConfigs = linuxOsConfigs;
            return this;
        }

        /**
         * @param linuxOsConfigs Custom Linux OS configuration.
         * 
         * @return builder
         * 
         */
        public Builder linuxOsConfigs(List<OceanNpLinuxOsConfigArgs> linuxOsConfigs) {
            return linuxOsConfigs(Output.of(linuxOsConfigs));
        }

        /**
         * @param linuxOsConfigs Custom Linux OS configuration.
         * 
         * @return builder
         * 
         */
        public Builder linuxOsConfigs(OceanNpLinuxOsConfigArgs... linuxOsConfigs) {
            return linuxOsConfigs(List.of(linuxOsConfigs));
        }

        /**
         * @param maxCount Maximum node count limit.
         * 
         * @return builder
         * 
         */
        public Builder maxCount(@Nullable Output<Integer> maxCount) {
            $.maxCount = maxCount;
            return this;
        }

        /**
         * @param maxCount Maximum node count limit.
         * 
         * @return builder
         * 
         */
        public Builder maxCount(Integer maxCount) {
            return maxCount(Output.of(maxCount));
        }

        /**
         * @param maxPodsPerNode The maximum number of pods per node in the node pools.
         * 
         * @return builder
         * 
         */
        public Builder maxPodsPerNode(@Nullable Output<Integer> maxPodsPerNode) {
            $.maxPodsPerNode = maxPodsPerNode;
            return this;
        }

        /**
         * @param maxPodsPerNode The maximum number of pods per node in the node pools.
         * 
         * @return builder
         * 
         */
        public Builder maxPodsPerNode(Integer maxPodsPerNode) {
            return maxPodsPerNode(Output.of(maxPodsPerNode));
        }

        /**
         * @param minCount Minimum node count limit.
         * 
         * @return builder
         * 
         */
        public Builder minCount(@Nullable Output<Integer> minCount) {
            $.minCount = minCount;
            return this;
        }

        /**
         * @param minCount Minimum node count limit.
         * 
         * @return builder
         * 
         */
        public Builder minCount(Integer minCount) {
            return minCount(Output.of(minCount));
        }

        /**
         * @param name Add a name for the Ocean cluster.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Add a name for the Ocean cluster.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param osDiskSizeGb The size of the OS disk in GB.
         * 
         * @return builder
         * 
         */
        public Builder osDiskSizeGb(@Nullable Output<Integer> osDiskSizeGb) {
            $.osDiskSizeGb = osDiskSizeGb;
            return this;
        }

        /**
         * @param osDiskSizeGb The size of the OS disk in GB.
         * 
         * @return builder
         * 
         */
        public Builder osDiskSizeGb(Integer osDiskSizeGb) {
            return osDiskSizeGb(Output.of(osDiskSizeGb));
        }

        /**
         * @param osDiskType The type of the OS disk.
         * 
         * @return builder
         * 
         */
        public Builder osDiskType(@Nullable Output<String> osDiskType) {
            $.osDiskType = osDiskType;
            return this;
        }

        /**
         * @param osDiskType The type of the OS disk.
         * 
         * @return builder
         * 
         */
        public Builder osDiskType(String osDiskType) {
            return osDiskType(Output.of(osDiskType));
        }

        /**
         * @param osSku The OS SKU of the OS type. Must correlate with the os type.
         * 
         * @return builder
         * 
         */
        public Builder osSku(@Nullable Output<String> osSku) {
            $.osSku = osSku;
            return this;
        }

        /**
         * @param osSku The OS SKU of the OS type. Must correlate with the os type.
         * 
         * @return builder
         * 
         */
        public Builder osSku(String osSku) {
            return osSku(Output.of(osSku));
        }

        /**
         * @param osType The OS type of the OS disk. Can&#39;t be modified once set.
         * 
         * @return builder
         * 
         */
        public Builder osType(@Nullable Output<String> osType) {
            $.osType = osType;
            return this;
        }

        /**
         * @param osType The OS type of the OS disk. Can&#39;t be modified once set.
         * 
         * @return builder
         * 
         */
        public Builder osType(String osType) {
            return osType(Output.of(osType));
        }

        /**
         * @param podSubnetIds The IDs of subnets in an existing VNet into which to assign pods in the cluster (requires azure network-plugin).
         * 
         * @return builder
         * 
         */
        public Builder podSubnetIds(@Nullable Output<List<String>> podSubnetIds) {
            $.podSubnetIds = podSubnetIds;
            return this;
        }

        /**
         * @param podSubnetIds The IDs of subnets in an existing VNet into which to assign pods in the cluster (requires azure network-plugin).
         * 
         * @return builder
         * 
         */
        public Builder podSubnetIds(List<String> podSubnetIds) {
            return podSubnetIds(Output.of(podSubnetIds));
        }

        /**
         * @param podSubnetIds The IDs of subnets in an existing VNet into which to assign pods in the cluster (requires azure network-plugin).
         * 
         * @return builder
         * 
         */
        public Builder podSubnetIds(String... podSubnetIds) {
            return podSubnetIds(List.of(podSubnetIds));
        }

        public Builder scheduling(@Nullable Output<OceanNpSchedulingArgs> scheduling) {
            $.scheduling = scheduling;
            return this;
        }

        public Builder scheduling(OceanNpSchedulingArgs scheduling) {
            return scheduling(Output.of(scheduling));
        }

        /**
         * @param spotPercentage Percentage of spot VMs to maintain.
         * 
         * @return builder
         * 
         */
        public Builder spotPercentage(@Nullable Output<Integer> spotPercentage) {
            $.spotPercentage = spotPercentage;
            return this;
        }

        /**
         * @param spotPercentage Percentage of spot VMs to maintain.
         * 
         * @return builder
         * 
         */
        public Builder spotPercentage(Integer spotPercentage) {
            return spotPercentage(Output.of(spotPercentage));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param taints Add taints to a virtual node group. Only custom user taints are allowed, and not [Kubernetes well-known taints](https://kubernetes.io/docs/reference/labels-annotations-taints/) or Azure AKS [ScaleSetPrioirty (Spot VM) taint](https://learn.microsoft.com/en-us/azure/aks/spot-node-pool). For all Spot VMs, AKS injects a taint kubernetes.azure.com/scalesetpriority=spot:NoSchedule, to ensure that only workloads that can handle interruptions are scheduled on Spot nodes. To [schedule a pod to run on Spot node](https://learn.microsoft.com/en-us/azure/aks/spot-node-pool#schedule-a-pod-to-run-on-the-spot-node), add a toleration but dont include the nodeAffinity (not supported for Spot Ocean), this will prevent the pod from being scheduled using Spot Ocean.
         * 
         * @return builder
         * 
         */
        public Builder taints(@Nullable Output<List<OceanNpTaintArgs>> taints) {
            $.taints = taints;
            return this;
        }

        /**
         * @param taints Add taints to a virtual node group. Only custom user taints are allowed, and not [Kubernetes well-known taints](https://kubernetes.io/docs/reference/labels-annotations-taints/) or Azure AKS [ScaleSetPrioirty (Spot VM) taint](https://learn.microsoft.com/en-us/azure/aks/spot-node-pool). For all Spot VMs, AKS injects a taint kubernetes.azure.com/scalesetpriority=spot:NoSchedule, to ensure that only workloads that can handle interruptions are scheduled on Spot nodes. To [schedule a pod to run on Spot node](https://learn.microsoft.com/en-us/azure/aks/spot-node-pool#schedule-a-pod-to-run-on-the-spot-node), add a toleration but dont include the nodeAffinity (not supported for Spot Ocean), this will prevent the pod from being scheduled using Spot Ocean.
         * 
         * @return builder
         * 
         */
        public Builder taints(List<OceanNpTaintArgs> taints) {
            return taints(Output.of(taints));
        }

        /**
         * @param taints Add taints to a virtual node group. Only custom user taints are allowed, and not [Kubernetes well-known taints](https://kubernetes.io/docs/reference/labels-annotations-taints/) or Azure AKS [ScaleSetPrioirty (Spot VM) taint](https://learn.microsoft.com/en-us/azure/aks/spot-node-pool). For all Spot VMs, AKS injects a taint kubernetes.azure.com/scalesetpriority=spot:NoSchedule, to ensure that only workloads that can handle interruptions are scheduled on Spot nodes. To [schedule a pod to run on Spot node](https://learn.microsoft.com/en-us/azure/aks/spot-node-pool#schedule-a-pod-to-run-on-the-spot-node), add a toleration but dont include the nodeAffinity (not supported for Spot Ocean), this will prevent the pod from being scheduled using Spot Ocean.
         * 
         * @return builder
         * 
         */
        public Builder taints(OceanNpTaintArgs... taints) {
            return taints(List.of(taints));
        }

        public Builder updatePolicy(@Nullable Output<OceanNpUpdatePolicyArgs> updatePolicy) {
            $.updatePolicy = updatePolicy;
            return this;
        }

        public Builder updatePolicy(OceanNpUpdatePolicyArgs updatePolicy) {
            return updatePolicy(Output.of(updatePolicy));
        }

        /**
         * @param vnetSubnetIds The IDs of subnets in an existing VNet into which to assign nodes in the cluster (requires azure network-plugin).
         * 
         * @return builder
         * 
         */
        public Builder vnetSubnetIds(@Nullable Output<List<String>> vnetSubnetIds) {
            $.vnetSubnetIds = vnetSubnetIds;
            return this;
        }

        /**
         * @param vnetSubnetIds The IDs of subnets in an existing VNet into which to assign nodes in the cluster (requires azure network-plugin).
         * 
         * @return builder
         * 
         */
        public Builder vnetSubnetIds(List<String> vnetSubnetIds) {
            return vnetSubnetIds(Output.of(vnetSubnetIds));
        }

        /**
         * @param vnetSubnetIds The IDs of subnets in an existing VNet into which to assign nodes in the cluster (requires azure network-plugin).
         * 
         * @return builder
         * 
         */
        public Builder vnetSubnetIds(String... vnetSubnetIds) {
            return vnetSubnetIds(List.of(vnetSubnetIds));
        }

        public OceanNpState build() {
            return $;
        }
    }

}
