// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.gke;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.spotinst.gke.inputs.ElastigroupBackendServiceArgs;
import com.pulumi.spotinst.gke.inputs.ElastigroupDiskArgs;
import com.pulumi.spotinst.gke.inputs.ElastigroupGpuArgs;
import com.pulumi.spotinst.gke.inputs.ElastigroupInstanceTypesCustomArgs;
import com.pulumi.spotinst.gke.inputs.ElastigroupIntegrationDockerSwarmArgs;
import com.pulumi.spotinst.gke.inputs.ElastigroupIntegrationGkeArgs;
import com.pulumi.spotinst.gke.inputs.ElastigroupLabelArgs;
import com.pulumi.spotinst.gke.inputs.ElastigroupMetadataArgs;
import com.pulumi.spotinst.gke.inputs.ElastigroupNetworkInterfaceArgs;
import com.pulumi.spotinst.gke.inputs.ElastigroupScalingDownPolicyArgs;
import com.pulumi.spotinst.gke.inputs.ElastigroupScalingUpPolicyArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ElastigroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final ElastigroupArgs Empty = new ElastigroupArgs();

    @Import(name="backendServices")
    private @Nullable Output<List<ElastigroupBackendServiceArgs>> backendServices;

    public Optional<Output<List<ElastigroupBackendServiceArgs>>> backendServices() {
        return Optional.ofNullable(this.backendServices);
    }

    /**
     * The name of the GKE cluster you wish to import.
     * 
     * @deprecated
     * Please define cluster_id under integration_gke
     * 
     */
    @Deprecated /* Please define cluster_id under integration_gke */
    @Import(name="clusterId")
    private @Nullable Output<String> clusterId;

    /**
     * @return The name of the GKE cluster you wish to import.
     * 
     * @deprecated
     * Please define cluster_id under integration_gke
     * 
     */
    @Deprecated /* Please define cluster_id under integration_gke */
    public Optional<Output<String>> clusterId() {
        return Optional.ofNullable(this.clusterId);
    }

    /**
     * The zone where the cluster is hosted.
     * 
     */
    @Import(name="clusterZoneName", required=true)
    private Output<String> clusterZoneName;

    /**
     * @return The zone where the cluster is hosted.
     * 
     */
    public Output<String> clusterZoneName() {
        return this.clusterZoneName;
    }

    @Import(name="desiredCapacity", required=true)
    private Output<Integer> desiredCapacity;

    public Output<Integer> desiredCapacity() {
        return this.desiredCapacity;
    }

    @Import(name="disks")
    private @Nullable Output<List<ElastigroupDiskArgs>> disks;

    public Optional<Output<List<ElastigroupDiskArgs>>> disks() {
        return Optional.ofNullable(this.disks);
    }

    @Import(name="drainingTimeout")
    private @Nullable Output<Integer> drainingTimeout;

    public Optional<Output<Integer>> drainingTimeout() {
        return Optional.ofNullable(this.drainingTimeout);
    }

    @Import(name="fallbackToOndemand")
    private @Nullable Output<Boolean> fallbackToOndemand;

    public Optional<Output<Boolean>> fallbackToOndemand() {
        return Optional.ofNullable(this.fallbackToOndemand);
    }

    @Import(name="gpu")
    private @Nullable Output<List<ElastigroupGpuArgs>> gpu;

    public Optional<Output<List<ElastigroupGpuArgs>>> gpu() {
        return Optional.ofNullable(this.gpu);
    }

    @Import(name="instanceNamePrefix")
    private @Nullable Output<String> instanceNamePrefix;

    public Optional<Output<String>> instanceNamePrefix() {
        return Optional.ofNullable(this.instanceNamePrefix);
    }

    @Import(name="instanceTypesCustoms")
    private @Nullable Output<List<ElastigroupInstanceTypesCustomArgs>> instanceTypesCustoms;

    public Optional<Output<List<ElastigroupInstanceTypesCustomArgs>>> instanceTypesCustoms() {
        return Optional.ofNullable(this.instanceTypesCustoms);
    }

    @Import(name="instanceTypesOndemand")
    private @Nullable Output<String> instanceTypesOndemand;

    public Optional<Output<String>> instanceTypesOndemand() {
        return Optional.ofNullable(this.instanceTypesOndemand);
    }

    @Import(name="instanceTypesPreemptibles")
    private @Nullable Output<List<String>> instanceTypesPreemptibles;

    public Optional<Output<List<String>>> instanceTypesPreemptibles() {
        return Optional.ofNullable(this.instanceTypesPreemptibles);
    }

    @Import(name="integrationDockerSwarm")
    private @Nullable Output<ElastigroupIntegrationDockerSwarmArgs> integrationDockerSwarm;

    public Optional<Output<ElastigroupIntegrationDockerSwarmArgs>> integrationDockerSwarm() {
        return Optional.ofNullable(this.integrationDockerSwarm);
    }

    /**
     * Describes the GKE integration.
     * 
     */
    @Import(name="integrationGke")
    private @Nullable Output<ElastigroupIntegrationGkeArgs> integrationGke;

    /**
     * @return Describes the GKE integration.
     * 
     */
    public Optional<Output<ElastigroupIntegrationGkeArgs>> integrationGke() {
        return Optional.ofNullable(this.integrationGke);
    }

    @Import(name="ipForwarding")
    private @Nullable Output<Boolean> ipForwarding;

    public Optional<Output<Boolean>> ipForwarding() {
        return Optional.ofNullable(this.ipForwarding);
    }

    @Import(name="labels")
    private @Nullable Output<List<ElastigroupLabelArgs>> labels;

    public Optional<Output<List<ElastigroupLabelArgs>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    @Import(name="maxSize")
    private @Nullable Output<Integer> maxSize;

    public Optional<Output<Integer>> maxSize() {
        return Optional.ofNullable(this.maxSize);
    }

    @Import(name="metadatas")
    private @Nullable Output<List<ElastigroupMetadataArgs>> metadatas;

    public Optional<Output<List<ElastigroupMetadataArgs>>> metadatas() {
        return Optional.ofNullable(this.metadatas);
    }

    @Import(name="minSize")
    private @Nullable Output<Integer> minSize;

    public Optional<Output<Integer>> minSize() {
        return Optional.ofNullable(this.minSize);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="networkInterfaces")
    private @Nullable Output<List<ElastigroupNetworkInterfaceArgs>> networkInterfaces;

    public Optional<Output<List<ElastigroupNetworkInterfaceArgs>>> networkInterfaces() {
        return Optional.ofNullable(this.networkInterfaces);
    }

    /**
     * The image that will be used for the node VMs. Possible values: COS, UBUNTU.
     * 
     */
    @Import(name="nodeImage")
    private @Nullable Output<String> nodeImage;

    /**
     * @return The image that will be used for the node VMs. Possible values: COS, UBUNTU.
     * 
     */
    public Optional<Output<String>> nodeImage() {
        return Optional.ofNullable(this.nodeImage);
    }

    @Import(name="ondemandCount")
    private @Nullable Output<Integer> ondemandCount;

    public Optional<Output<Integer>> ondemandCount() {
        return Optional.ofNullable(this.ondemandCount);
    }

    @Import(name="preemptiblePercentage")
    private @Nullable Output<Integer> preemptiblePercentage;

    public Optional<Output<Integer>> preemptiblePercentage() {
        return Optional.ofNullable(this.preemptiblePercentage);
    }

    @Import(name="provisioningModel")
    private @Nullable Output<String> provisioningModel;

    public Optional<Output<String>> provisioningModel() {
        return Optional.ofNullable(this.provisioningModel);
    }

    @Import(name="scalingDownPolicies")
    private @Nullable Output<List<ElastigroupScalingDownPolicyArgs>> scalingDownPolicies;

    public Optional<Output<List<ElastigroupScalingDownPolicyArgs>>> scalingDownPolicies() {
        return Optional.ofNullable(this.scalingDownPolicies);
    }

    @Import(name="scalingUpPolicies")
    private @Nullable Output<List<ElastigroupScalingUpPolicyArgs>> scalingUpPolicies;

    public Optional<Output<List<ElastigroupScalingUpPolicyArgs>>> scalingUpPolicies() {
        return Optional.ofNullable(this.scalingUpPolicies);
    }

    @Import(name="serviceAccount")
    private @Nullable Output<String> serviceAccount;

    public Optional<Output<String>> serviceAccount() {
        return Optional.ofNullable(this.serviceAccount);
    }

    @Import(name="shutdownScript")
    private @Nullable Output<String> shutdownScript;

    public Optional<Output<String>> shutdownScript() {
        return Optional.ofNullable(this.shutdownScript);
    }

    @Import(name="startupScript")
    private @Nullable Output<String> startupScript;

    public Optional<Output<String>> startupScript() {
        return Optional.ofNullable(this.startupScript);
    }

    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private ElastigroupArgs() {}

    private ElastigroupArgs(ElastigroupArgs $) {
        this.backendServices = $.backendServices;
        this.clusterId = $.clusterId;
        this.clusterZoneName = $.clusterZoneName;
        this.desiredCapacity = $.desiredCapacity;
        this.disks = $.disks;
        this.drainingTimeout = $.drainingTimeout;
        this.fallbackToOndemand = $.fallbackToOndemand;
        this.gpu = $.gpu;
        this.instanceNamePrefix = $.instanceNamePrefix;
        this.instanceTypesCustoms = $.instanceTypesCustoms;
        this.instanceTypesOndemand = $.instanceTypesOndemand;
        this.instanceTypesPreemptibles = $.instanceTypesPreemptibles;
        this.integrationDockerSwarm = $.integrationDockerSwarm;
        this.integrationGke = $.integrationGke;
        this.ipForwarding = $.ipForwarding;
        this.labels = $.labels;
        this.maxSize = $.maxSize;
        this.metadatas = $.metadatas;
        this.minSize = $.minSize;
        this.name = $.name;
        this.networkInterfaces = $.networkInterfaces;
        this.nodeImage = $.nodeImage;
        this.ondemandCount = $.ondemandCount;
        this.preemptiblePercentage = $.preemptiblePercentage;
        this.provisioningModel = $.provisioningModel;
        this.scalingDownPolicies = $.scalingDownPolicies;
        this.scalingUpPolicies = $.scalingUpPolicies;
        this.serviceAccount = $.serviceAccount;
        this.shutdownScript = $.shutdownScript;
        this.startupScript = $.startupScript;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ElastigroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ElastigroupArgs $;

        public Builder() {
            $ = new ElastigroupArgs();
        }

        public Builder(ElastigroupArgs defaults) {
            $ = new ElastigroupArgs(Objects.requireNonNull(defaults));
        }

        public Builder backendServices(@Nullable Output<List<ElastigroupBackendServiceArgs>> backendServices) {
            $.backendServices = backendServices;
            return this;
        }

        public Builder backendServices(List<ElastigroupBackendServiceArgs> backendServices) {
            return backendServices(Output.of(backendServices));
        }

        public Builder backendServices(ElastigroupBackendServiceArgs... backendServices) {
            return backendServices(List.of(backendServices));
        }

        /**
         * @param clusterId The name of the GKE cluster you wish to import.
         * 
         * @return builder
         * 
         * @deprecated
         * Please define cluster_id under integration_gke
         * 
         */
        @Deprecated /* Please define cluster_id under integration_gke */
        public Builder clusterId(@Nullable Output<String> clusterId) {
            $.clusterId = clusterId;
            return this;
        }

        /**
         * @param clusterId The name of the GKE cluster you wish to import.
         * 
         * @return builder
         * 
         * @deprecated
         * Please define cluster_id under integration_gke
         * 
         */
        @Deprecated /* Please define cluster_id under integration_gke */
        public Builder clusterId(String clusterId) {
            return clusterId(Output.of(clusterId));
        }

        /**
         * @param clusterZoneName The zone where the cluster is hosted.
         * 
         * @return builder
         * 
         */
        public Builder clusterZoneName(Output<String> clusterZoneName) {
            $.clusterZoneName = clusterZoneName;
            return this;
        }

        /**
         * @param clusterZoneName The zone where the cluster is hosted.
         * 
         * @return builder
         * 
         */
        public Builder clusterZoneName(String clusterZoneName) {
            return clusterZoneName(Output.of(clusterZoneName));
        }

        public Builder desiredCapacity(Output<Integer> desiredCapacity) {
            $.desiredCapacity = desiredCapacity;
            return this;
        }

        public Builder desiredCapacity(Integer desiredCapacity) {
            return desiredCapacity(Output.of(desiredCapacity));
        }

        public Builder disks(@Nullable Output<List<ElastigroupDiskArgs>> disks) {
            $.disks = disks;
            return this;
        }

        public Builder disks(List<ElastigroupDiskArgs> disks) {
            return disks(Output.of(disks));
        }

        public Builder disks(ElastigroupDiskArgs... disks) {
            return disks(List.of(disks));
        }

        public Builder drainingTimeout(@Nullable Output<Integer> drainingTimeout) {
            $.drainingTimeout = drainingTimeout;
            return this;
        }

        public Builder drainingTimeout(Integer drainingTimeout) {
            return drainingTimeout(Output.of(drainingTimeout));
        }

        public Builder fallbackToOndemand(@Nullable Output<Boolean> fallbackToOndemand) {
            $.fallbackToOndemand = fallbackToOndemand;
            return this;
        }

        public Builder fallbackToOndemand(Boolean fallbackToOndemand) {
            return fallbackToOndemand(Output.of(fallbackToOndemand));
        }

        public Builder gpu(@Nullable Output<List<ElastigroupGpuArgs>> gpu) {
            $.gpu = gpu;
            return this;
        }

        public Builder gpu(List<ElastigroupGpuArgs> gpu) {
            return gpu(Output.of(gpu));
        }

        public Builder gpu(ElastigroupGpuArgs... gpu) {
            return gpu(List.of(gpu));
        }

        public Builder instanceNamePrefix(@Nullable Output<String> instanceNamePrefix) {
            $.instanceNamePrefix = instanceNamePrefix;
            return this;
        }

        public Builder instanceNamePrefix(String instanceNamePrefix) {
            return instanceNamePrefix(Output.of(instanceNamePrefix));
        }

        public Builder instanceTypesCustoms(@Nullable Output<List<ElastigroupInstanceTypesCustomArgs>> instanceTypesCustoms) {
            $.instanceTypesCustoms = instanceTypesCustoms;
            return this;
        }

        public Builder instanceTypesCustoms(List<ElastigroupInstanceTypesCustomArgs> instanceTypesCustoms) {
            return instanceTypesCustoms(Output.of(instanceTypesCustoms));
        }

        public Builder instanceTypesCustoms(ElastigroupInstanceTypesCustomArgs... instanceTypesCustoms) {
            return instanceTypesCustoms(List.of(instanceTypesCustoms));
        }

        public Builder instanceTypesOndemand(@Nullable Output<String> instanceTypesOndemand) {
            $.instanceTypesOndemand = instanceTypesOndemand;
            return this;
        }

        public Builder instanceTypesOndemand(String instanceTypesOndemand) {
            return instanceTypesOndemand(Output.of(instanceTypesOndemand));
        }

        public Builder instanceTypesPreemptibles(@Nullable Output<List<String>> instanceTypesPreemptibles) {
            $.instanceTypesPreemptibles = instanceTypesPreemptibles;
            return this;
        }

        public Builder instanceTypesPreemptibles(List<String> instanceTypesPreemptibles) {
            return instanceTypesPreemptibles(Output.of(instanceTypesPreemptibles));
        }

        public Builder instanceTypesPreemptibles(String... instanceTypesPreemptibles) {
            return instanceTypesPreemptibles(List.of(instanceTypesPreemptibles));
        }

        public Builder integrationDockerSwarm(@Nullable Output<ElastigroupIntegrationDockerSwarmArgs> integrationDockerSwarm) {
            $.integrationDockerSwarm = integrationDockerSwarm;
            return this;
        }

        public Builder integrationDockerSwarm(ElastigroupIntegrationDockerSwarmArgs integrationDockerSwarm) {
            return integrationDockerSwarm(Output.of(integrationDockerSwarm));
        }

        /**
         * @param integrationGke Describes the GKE integration.
         * 
         * @return builder
         * 
         */
        public Builder integrationGke(@Nullable Output<ElastigroupIntegrationGkeArgs> integrationGke) {
            $.integrationGke = integrationGke;
            return this;
        }

        /**
         * @param integrationGke Describes the GKE integration.
         * 
         * @return builder
         * 
         */
        public Builder integrationGke(ElastigroupIntegrationGkeArgs integrationGke) {
            return integrationGke(Output.of(integrationGke));
        }

        public Builder ipForwarding(@Nullable Output<Boolean> ipForwarding) {
            $.ipForwarding = ipForwarding;
            return this;
        }

        public Builder ipForwarding(Boolean ipForwarding) {
            return ipForwarding(Output.of(ipForwarding));
        }

        public Builder labels(@Nullable Output<List<ElastigroupLabelArgs>> labels) {
            $.labels = labels;
            return this;
        }

        public Builder labels(List<ElastigroupLabelArgs> labels) {
            return labels(Output.of(labels));
        }

        public Builder labels(ElastigroupLabelArgs... labels) {
            return labels(List.of(labels));
        }

        public Builder maxSize(@Nullable Output<Integer> maxSize) {
            $.maxSize = maxSize;
            return this;
        }

        public Builder maxSize(Integer maxSize) {
            return maxSize(Output.of(maxSize));
        }

        public Builder metadatas(@Nullable Output<List<ElastigroupMetadataArgs>> metadatas) {
            $.metadatas = metadatas;
            return this;
        }

        public Builder metadatas(List<ElastigroupMetadataArgs> metadatas) {
            return metadatas(Output.of(metadatas));
        }

        public Builder metadatas(ElastigroupMetadataArgs... metadatas) {
            return metadatas(List.of(metadatas));
        }

        public Builder minSize(@Nullable Output<Integer> minSize) {
            $.minSize = minSize;
            return this;
        }

        public Builder minSize(Integer minSize) {
            return minSize(Output.of(minSize));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder networkInterfaces(@Nullable Output<List<ElastigroupNetworkInterfaceArgs>> networkInterfaces) {
            $.networkInterfaces = networkInterfaces;
            return this;
        }

        public Builder networkInterfaces(List<ElastigroupNetworkInterfaceArgs> networkInterfaces) {
            return networkInterfaces(Output.of(networkInterfaces));
        }

        public Builder networkInterfaces(ElastigroupNetworkInterfaceArgs... networkInterfaces) {
            return networkInterfaces(List.of(networkInterfaces));
        }

        /**
         * @param nodeImage The image that will be used for the node VMs. Possible values: COS, UBUNTU.
         * 
         * @return builder
         * 
         */
        public Builder nodeImage(@Nullable Output<String> nodeImage) {
            $.nodeImage = nodeImage;
            return this;
        }

        /**
         * @param nodeImage The image that will be used for the node VMs. Possible values: COS, UBUNTU.
         * 
         * @return builder
         * 
         */
        public Builder nodeImage(String nodeImage) {
            return nodeImage(Output.of(nodeImage));
        }

        public Builder ondemandCount(@Nullable Output<Integer> ondemandCount) {
            $.ondemandCount = ondemandCount;
            return this;
        }

        public Builder ondemandCount(Integer ondemandCount) {
            return ondemandCount(Output.of(ondemandCount));
        }

        public Builder preemptiblePercentage(@Nullable Output<Integer> preemptiblePercentage) {
            $.preemptiblePercentage = preemptiblePercentage;
            return this;
        }

        public Builder preemptiblePercentage(Integer preemptiblePercentage) {
            return preemptiblePercentage(Output.of(preemptiblePercentage));
        }

        public Builder provisioningModel(@Nullable Output<String> provisioningModel) {
            $.provisioningModel = provisioningModel;
            return this;
        }

        public Builder provisioningModel(String provisioningModel) {
            return provisioningModel(Output.of(provisioningModel));
        }

        public Builder scalingDownPolicies(@Nullable Output<List<ElastigroupScalingDownPolicyArgs>> scalingDownPolicies) {
            $.scalingDownPolicies = scalingDownPolicies;
            return this;
        }

        public Builder scalingDownPolicies(List<ElastigroupScalingDownPolicyArgs> scalingDownPolicies) {
            return scalingDownPolicies(Output.of(scalingDownPolicies));
        }

        public Builder scalingDownPolicies(ElastigroupScalingDownPolicyArgs... scalingDownPolicies) {
            return scalingDownPolicies(List.of(scalingDownPolicies));
        }

        public Builder scalingUpPolicies(@Nullable Output<List<ElastigroupScalingUpPolicyArgs>> scalingUpPolicies) {
            $.scalingUpPolicies = scalingUpPolicies;
            return this;
        }

        public Builder scalingUpPolicies(List<ElastigroupScalingUpPolicyArgs> scalingUpPolicies) {
            return scalingUpPolicies(Output.of(scalingUpPolicies));
        }

        public Builder scalingUpPolicies(ElastigroupScalingUpPolicyArgs... scalingUpPolicies) {
            return scalingUpPolicies(List.of(scalingUpPolicies));
        }

        public Builder serviceAccount(@Nullable Output<String> serviceAccount) {
            $.serviceAccount = serviceAccount;
            return this;
        }

        public Builder serviceAccount(String serviceAccount) {
            return serviceAccount(Output.of(serviceAccount));
        }

        public Builder shutdownScript(@Nullable Output<String> shutdownScript) {
            $.shutdownScript = shutdownScript;
            return this;
        }

        public Builder shutdownScript(String shutdownScript) {
            return shutdownScript(Output.of(shutdownScript));
        }

        public Builder startupScript(@Nullable Output<String> startupScript) {
            $.startupScript = startupScript;
            return this;
        }

        public Builder startupScript(String startupScript) {
            return startupScript(Output.of(startupScript));
        }

        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        public ElastigroupArgs build() {
            $.clusterZoneName = Objects.requireNonNull($.clusterZoneName, "expected parameter 'clusterZoneName' to be non-null");
            $.desiredCapacity = Objects.requireNonNull($.desiredCapacity, "expected parameter 'desiredCapacity' to be non-null");
            return $;
        }
    }

}
