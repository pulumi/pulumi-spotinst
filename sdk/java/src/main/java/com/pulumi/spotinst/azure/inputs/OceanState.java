// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.azure.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.spotinst.azure.inputs.OceanAutoscalerArgs;
import com.pulumi.spotinst.azure.inputs.OceanExtensionArgs;
import com.pulumi.spotinst.azure.inputs.OceanHealthArgs;
import com.pulumi.spotinst.azure.inputs.OceanImageArgs;
import com.pulumi.spotinst.azure.inputs.OceanLoadBalancerArgs;
import com.pulumi.spotinst.azure.inputs.OceanManagedServiceIdentityArgs;
import com.pulumi.spotinst.azure.inputs.OceanNetworkArgs;
import com.pulumi.spotinst.azure.inputs.OceanOsDiskArgs;
import com.pulumi.spotinst.azure.inputs.OceanStrategyArgs;
import com.pulumi.spotinst.azure.inputs.OceanTagArgs;
import com.pulumi.spotinst.azure.inputs.OceanVmSizeArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OceanState extends com.pulumi.resources.ResourceArgs {

    public static final OceanState Empty = new OceanState();

    /**
     * The AKS identifier. A valid identifier should be formatted as `acd-nnnnnnnn` and previously used identifiers cannot be reused.
     * 
     */
    @Import(name="acdIdentifier")
    private @Nullable Output<String> acdIdentifier;

    /**
     * @return The AKS identifier. A valid identifier should be formatted as `acd-nnnnnnnn` and previously used identifiers cannot be reused.
     * 
     */
    public Optional<Output<String>> acdIdentifier() {
        return Optional.ofNullable(this.acdIdentifier);
    }

    /**
     * The AKS cluster name.
     * 
     */
    @Import(name="aksName")
    private @Nullable Output<String> aksName;

    /**
     * @return The AKS cluster name.
     * 
     */
    public Optional<Output<String>> aksName() {
        return Optional.ofNullable(this.aksName);
    }

    /**
     * Name of the Azure Resource Group where the AKS cluster is located.
     * 
     */
    @Import(name="aksResourceGroupName")
    private @Nullable Output<String> aksResourceGroupName;

    /**
     * @return Name of the Azure Resource Group where the AKS cluster is located.
     * 
     */
    public Optional<Output<String>> aksResourceGroupName() {
        return Optional.ofNullable(this.aksResourceGroupName);
    }

    /**
     * The Ocean Kubernetes Autoscaler object.
     * 
     */
    @Import(name="autoscaler")
    private @Nullable Output<OceanAutoscalerArgs> autoscaler;

    /**
     * @return The Ocean Kubernetes Autoscaler object.
     * 
     */
    public Optional<Output<OceanAutoscalerArgs>> autoscaler() {
        return Optional.ofNullable(this.autoscaler);
    }

    /**
     * A unique identifier used for connecting the Ocean SaaS platform and the Kubernetes cluster. Typically, the cluster name is used as its identifier.
     * 
     */
    @Import(name="controllerClusterId")
    private @Nullable Output<String> controllerClusterId;

    /**
     * @return A unique identifier used for connecting the Ocean SaaS platform and the Kubernetes cluster. Typically, the cluster name is used as its identifier.
     * 
     */
    public Optional<Output<String>> controllerClusterId() {
        return Optional.ofNullable(this.controllerClusterId);
    }

    /**
     * Must contain a valid Base64 encoded string.
     * 
     */
    @Import(name="customData")
    private @Nullable Output<String> customData;

    /**
     * @return Must contain a valid Base64 encoded string.
     * 
     */
    public Optional<Output<String>> customData() {
        return Optional.ofNullable(this.customData);
    }

    /**
     * List of Azure extension objects.
     * 
     */
    @Import(name="extensions")
    private @Nullable Output<List<OceanExtensionArgs>> extensions;

    /**
     * @return List of Azure extension objects.
     * 
     */
    public Optional<Output<List<OceanExtensionArgs>>> extensions() {
        return Optional.ofNullable(this.extensions);
    }

    /**
     * The Ocean AKS Health object.
     * 
     */
    @Import(name="health")
    private @Nullable Output<OceanHealthArgs> health;

    /**
     * @return The Ocean AKS Health object.
     * 
     */
    public Optional<Output<OceanHealthArgs>> health() {
        return Optional.ofNullable(this.health);
    }

    /**
     * Image of VM. An image is a template for creating new VMs. Choose from Azure image catalogue (marketplace).
     * 
     */
    @Import(name="images")
    private @Nullable Output<List<OceanImageArgs>> images;

    /**
     * @return Image of VM. An image is a template for creating new VMs. Choose from Azure image catalogue (marketplace).
     * 
     */
    public Optional<Output<List<OceanImageArgs>>> images() {
        return Optional.ofNullable(this.images);
    }

    /**
     * Configure Load Balancer.
     * 
     */
    @Import(name="loadBalancers")
    private @Nullable Output<List<OceanLoadBalancerArgs>> loadBalancers;

    /**
     * @return Configure Load Balancer.
     * 
     */
    public Optional<Output<List<OceanLoadBalancerArgs>>> loadBalancers() {
        return Optional.ofNullable(this.loadBalancers);
    }

    /**
     * List of Managed Service Identity objects.
     * 
     */
    @Import(name="managedServiceIdentities")
    private @Nullable Output<List<OceanManagedServiceIdentityArgs>> managedServiceIdentities;

    /**
     * @return List of Managed Service Identity objects.
     * 
     */
    public Optional<Output<List<OceanManagedServiceIdentityArgs>>> managedServiceIdentities() {
        return Optional.ofNullable(this.managedServiceIdentities);
    }

    /**
     * The maximum number of pods per node in an AKS cluster.
     * 
     */
    @Import(name="maxPods")
    private @Nullable Output<Integer> maxPods;

    /**
     * @return The maximum number of pods per node in an AKS cluster.
     * 
     */
    public Optional<Output<Integer>> maxPods() {
        return Optional.ofNullable(this.maxPods);
    }

    /**
     * The Ocean cluster name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The Ocean cluster name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Define the Virtual Network and Subnet.
     * 
     */
    @Import(name="network")
    private @Nullable Output<OceanNetworkArgs> network;

    /**
     * @return Define the Virtual Network and Subnet.
     * 
     */
    public Optional<Output<OceanNetworkArgs>> network() {
        return Optional.ofNullable(this.network);
    }

    /**
     * OS disk specifications.
     * 
     */
    @Import(name="osDisk")
    private @Nullable Output<OceanOsDiskArgs> osDisk;

    /**
     * @return OS disk specifications.
     * 
     */
    public Optional<Output<OceanOsDiskArgs>> osDisk() {
        return Optional.ofNullable(this.osDisk);
    }

    /**
     * Name of the Azure Resource Group into which VMs will be launched. Cannot be updated.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return Name of the Azure Resource Group into which VMs will be launched. Cannot be updated.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * SSH public key for admin access to Linux VMs.
     * 
     */
    @Import(name="sshPublicKey")
    private @Nullable Output<String> sshPublicKey;

    /**
     * @return SSH public key for admin access to Linux VMs.
     * 
     */
    public Optional<Output<String>> sshPublicKey() {
        return Optional.ofNullable(this.sshPublicKey);
    }

    /**
     * The Ocean AKS strategy object.
     * 
     */
    @Import(name="strategies")
    private @Nullable Output<List<OceanStrategyArgs>> strategies;

    /**
     * @return The Ocean AKS strategy object.
     * 
     */
    public Optional<Output<List<OceanStrategyArgs>>> strategies() {
        return Optional.ofNullable(this.strategies);
    }

    /**
     * Unique key-value pairs that will be used to tag VMs that are launched in the cluster.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<OceanTagArgs>> tags;

    /**
     * @return Unique key-value pairs that will be used to tag VMs that are launched in the cluster.
     * 
     */
    public Optional<Output<List<OceanTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Username for admin access to VMs.
     * 
     */
    @Import(name="userName")
    private @Nullable Output<String> userName;

    /**
     * @return Username for admin access to VMs.
     * 
     */
    public Optional<Output<String>> userName() {
        return Optional.ofNullable(this.userName);
    }

    /**
     * The types of virtual machines that may or may not be a part of the Ocean cluster.
     * 
     */
    @Import(name="vmSizes")
    private @Nullable Output<List<OceanVmSizeArgs>> vmSizes;

    /**
     * @return The types of virtual machines that may or may not be a part of the Ocean cluster.
     * 
     */
    public Optional<Output<List<OceanVmSizeArgs>>> vmSizes() {
        return Optional.ofNullable(this.vmSizes);
    }

    /**
     * An Array holding default Availability Zones, this configures the availability zones the Ocean may launch instances in.
     * 
     */
    @Import(name="zones")
    private @Nullable Output<List<String>> zones;

    /**
     * @return An Array holding default Availability Zones, this configures the availability zones the Ocean may launch instances in.
     * 
     */
    public Optional<Output<List<String>>> zones() {
        return Optional.ofNullable(this.zones);
    }

    private OceanState() {}

    private OceanState(OceanState $) {
        this.acdIdentifier = $.acdIdentifier;
        this.aksName = $.aksName;
        this.aksResourceGroupName = $.aksResourceGroupName;
        this.autoscaler = $.autoscaler;
        this.controllerClusterId = $.controllerClusterId;
        this.customData = $.customData;
        this.extensions = $.extensions;
        this.health = $.health;
        this.images = $.images;
        this.loadBalancers = $.loadBalancers;
        this.managedServiceIdentities = $.managedServiceIdentities;
        this.maxPods = $.maxPods;
        this.name = $.name;
        this.network = $.network;
        this.osDisk = $.osDisk;
        this.resourceGroupName = $.resourceGroupName;
        this.sshPublicKey = $.sshPublicKey;
        this.strategies = $.strategies;
        this.tags = $.tags;
        this.userName = $.userName;
        this.vmSizes = $.vmSizes;
        this.zones = $.zones;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OceanState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OceanState $;

        public Builder() {
            $ = new OceanState();
        }

        public Builder(OceanState defaults) {
            $ = new OceanState(Objects.requireNonNull(defaults));
        }

        /**
         * @param acdIdentifier The AKS identifier. A valid identifier should be formatted as `acd-nnnnnnnn` and previously used identifiers cannot be reused.
         * 
         * @return builder
         * 
         */
        public Builder acdIdentifier(@Nullable Output<String> acdIdentifier) {
            $.acdIdentifier = acdIdentifier;
            return this;
        }

        /**
         * @param acdIdentifier The AKS identifier. A valid identifier should be formatted as `acd-nnnnnnnn` and previously used identifiers cannot be reused.
         * 
         * @return builder
         * 
         */
        public Builder acdIdentifier(String acdIdentifier) {
            return acdIdentifier(Output.of(acdIdentifier));
        }

        /**
         * @param aksName The AKS cluster name.
         * 
         * @return builder
         * 
         */
        public Builder aksName(@Nullable Output<String> aksName) {
            $.aksName = aksName;
            return this;
        }

        /**
         * @param aksName The AKS cluster name.
         * 
         * @return builder
         * 
         */
        public Builder aksName(String aksName) {
            return aksName(Output.of(aksName));
        }

        /**
         * @param aksResourceGroupName Name of the Azure Resource Group where the AKS cluster is located.
         * 
         * @return builder
         * 
         */
        public Builder aksResourceGroupName(@Nullable Output<String> aksResourceGroupName) {
            $.aksResourceGroupName = aksResourceGroupName;
            return this;
        }

        /**
         * @param aksResourceGroupName Name of the Azure Resource Group where the AKS cluster is located.
         * 
         * @return builder
         * 
         */
        public Builder aksResourceGroupName(String aksResourceGroupName) {
            return aksResourceGroupName(Output.of(aksResourceGroupName));
        }

        /**
         * @param autoscaler The Ocean Kubernetes Autoscaler object.
         * 
         * @return builder
         * 
         */
        public Builder autoscaler(@Nullable Output<OceanAutoscalerArgs> autoscaler) {
            $.autoscaler = autoscaler;
            return this;
        }

        /**
         * @param autoscaler The Ocean Kubernetes Autoscaler object.
         * 
         * @return builder
         * 
         */
        public Builder autoscaler(OceanAutoscalerArgs autoscaler) {
            return autoscaler(Output.of(autoscaler));
        }

        /**
         * @param controllerClusterId A unique identifier used for connecting the Ocean SaaS platform and the Kubernetes cluster. Typically, the cluster name is used as its identifier.
         * 
         * @return builder
         * 
         */
        public Builder controllerClusterId(@Nullable Output<String> controllerClusterId) {
            $.controllerClusterId = controllerClusterId;
            return this;
        }

        /**
         * @param controllerClusterId A unique identifier used for connecting the Ocean SaaS platform and the Kubernetes cluster. Typically, the cluster name is used as its identifier.
         * 
         * @return builder
         * 
         */
        public Builder controllerClusterId(String controllerClusterId) {
            return controllerClusterId(Output.of(controllerClusterId));
        }

        /**
         * @param customData Must contain a valid Base64 encoded string.
         * 
         * @return builder
         * 
         */
        public Builder customData(@Nullable Output<String> customData) {
            $.customData = customData;
            return this;
        }

        /**
         * @param customData Must contain a valid Base64 encoded string.
         * 
         * @return builder
         * 
         */
        public Builder customData(String customData) {
            return customData(Output.of(customData));
        }

        /**
         * @param extensions List of Azure extension objects.
         * 
         * @return builder
         * 
         */
        public Builder extensions(@Nullable Output<List<OceanExtensionArgs>> extensions) {
            $.extensions = extensions;
            return this;
        }

        /**
         * @param extensions List of Azure extension objects.
         * 
         * @return builder
         * 
         */
        public Builder extensions(List<OceanExtensionArgs> extensions) {
            return extensions(Output.of(extensions));
        }

        /**
         * @param extensions List of Azure extension objects.
         * 
         * @return builder
         * 
         */
        public Builder extensions(OceanExtensionArgs... extensions) {
            return extensions(List.of(extensions));
        }

        /**
         * @param health The Ocean AKS Health object.
         * 
         * @return builder
         * 
         */
        public Builder health(@Nullable Output<OceanHealthArgs> health) {
            $.health = health;
            return this;
        }

        /**
         * @param health The Ocean AKS Health object.
         * 
         * @return builder
         * 
         */
        public Builder health(OceanHealthArgs health) {
            return health(Output.of(health));
        }

        /**
         * @param images Image of VM. An image is a template for creating new VMs. Choose from Azure image catalogue (marketplace).
         * 
         * @return builder
         * 
         */
        public Builder images(@Nullable Output<List<OceanImageArgs>> images) {
            $.images = images;
            return this;
        }

        /**
         * @param images Image of VM. An image is a template for creating new VMs. Choose from Azure image catalogue (marketplace).
         * 
         * @return builder
         * 
         */
        public Builder images(List<OceanImageArgs> images) {
            return images(Output.of(images));
        }

        /**
         * @param images Image of VM. An image is a template for creating new VMs. Choose from Azure image catalogue (marketplace).
         * 
         * @return builder
         * 
         */
        public Builder images(OceanImageArgs... images) {
            return images(List.of(images));
        }

        /**
         * @param loadBalancers Configure Load Balancer.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancers(@Nullable Output<List<OceanLoadBalancerArgs>> loadBalancers) {
            $.loadBalancers = loadBalancers;
            return this;
        }

        /**
         * @param loadBalancers Configure Load Balancer.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancers(List<OceanLoadBalancerArgs> loadBalancers) {
            return loadBalancers(Output.of(loadBalancers));
        }

        /**
         * @param loadBalancers Configure Load Balancer.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancers(OceanLoadBalancerArgs... loadBalancers) {
            return loadBalancers(List.of(loadBalancers));
        }

        /**
         * @param managedServiceIdentities List of Managed Service Identity objects.
         * 
         * @return builder
         * 
         */
        public Builder managedServiceIdentities(@Nullable Output<List<OceanManagedServiceIdentityArgs>> managedServiceIdentities) {
            $.managedServiceIdentities = managedServiceIdentities;
            return this;
        }

        /**
         * @param managedServiceIdentities List of Managed Service Identity objects.
         * 
         * @return builder
         * 
         */
        public Builder managedServiceIdentities(List<OceanManagedServiceIdentityArgs> managedServiceIdentities) {
            return managedServiceIdentities(Output.of(managedServiceIdentities));
        }

        /**
         * @param managedServiceIdentities List of Managed Service Identity objects.
         * 
         * @return builder
         * 
         */
        public Builder managedServiceIdentities(OceanManagedServiceIdentityArgs... managedServiceIdentities) {
            return managedServiceIdentities(List.of(managedServiceIdentities));
        }

        /**
         * @param maxPods The maximum number of pods per node in an AKS cluster.
         * 
         * @return builder
         * 
         */
        public Builder maxPods(@Nullable Output<Integer> maxPods) {
            $.maxPods = maxPods;
            return this;
        }

        /**
         * @param maxPods The maximum number of pods per node in an AKS cluster.
         * 
         * @return builder
         * 
         */
        public Builder maxPods(Integer maxPods) {
            return maxPods(Output.of(maxPods));
        }

        /**
         * @param name The Ocean cluster name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The Ocean cluster name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param network Define the Virtual Network and Subnet.
         * 
         * @return builder
         * 
         */
        public Builder network(@Nullable Output<OceanNetworkArgs> network) {
            $.network = network;
            return this;
        }

        /**
         * @param network Define the Virtual Network and Subnet.
         * 
         * @return builder
         * 
         */
        public Builder network(OceanNetworkArgs network) {
            return network(Output.of(network));
        }

        /**
         * @param osDisk OS disk specifications.
         * 
         * @return builder
         * 
         */
        public Builder osDisk(@Nullable Output<OceanOsDiskArgs> osDisk) {
            $.osDisk = osDisk;
            return this;
        }

        /**
         * @param osDisk OS disk specifications.
         * 
         * @return builder
         * 
         */
        public Builder osDisk(OceanOsDiskArgs osDisk) {
            return osDisk(Output.of(osDisk));
        }

        /**
         * @param resourceGroupName Name of the Azure Resource Group into which VMs will be launched. Cannot be updated.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Name of the Azure Resource Group into which VMs will be launched. Cannot be updated.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param sshPublicKey SSH public key for admin access to Linux VMs.
         * 
         * @return builder
         * 
         */
        public Builder sshPublicKey(@Nullable Output<String> sshPublicKey) {
            $.sshPublicKey = sshPublicKey;
            return this;
        }

        /**
         * @param sshPublicKey SSH public key for admin access to Linux VMs.
         * 
         * @return builder
         * 
         */
        public Builder sshPublicKey(String sshPublicKey) {
            return sshPublicKey(Output.of(sshPublicKey));
        }

        /**
         * @param strategies The Ocean AKS strategy object.
         * 
         * @return builder
         * 
         */
        public Builder strategies(@Nullable Output<List<OceanStrategyArgs>> strategies) {
            $.strategies = strategies;
            return this;
        }

        /**
         * @param strategies The Ocean AKS strategy object.
         * 
         * @return builder
         * 
         */
        public Builder strategies(List<OceanStrategyArgs> strategies) {
            return strategies(Output.of(strategies));
        }

        /**
         * @param strategies The Ocean AKS strategy object.
         * 
         * @return builder
         * 
         */
        public Builder strategies(OceanStrategyArgs... strategies) {
            return strategies(List.of(strategies));
        }

        /**
         * @param tags Unique key-value pairs that will be used to tag VMs that are launched in the cluster.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<OceanTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Unique key-value pairs that will be used to tag VMs that are launched in the cluster.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<OceanTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags Unique key-value pairs that will be used to tag VMs that are launched in the cluster.
         * 
         * @return builder
         * 
         */
        public Builder tags(OceanTagArgs... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param userName Username for admin access to VMs.
         * 
         * @return builder
         * 
         */
        public Builder userName(@Nullable Output<String> userName) {
            $.userName = userName;
            return this;
        }

        /**
         * @param userName Username for admin access to VMs.
         * 
         * @return builder
         * 
         */
        public Builder userName(String userName) {
            return userName(Output.of(userName));
        }

        /**
         * @param vmSizes The types of virtual machines that may or may not be a part of the Ocean cluster.
         * 
         * @return builder
         * 
         */
        public Builder vmSizes(@Nullable Output<List<OceanVmSizeArgs>> vmSizes) {
            $.vmSizes = vmSizes;
            return this;
        }

        /**
         * @param vmSizes The types of virtual machines that may or may not be a part of the Ocean cluster.
         * 
         * @return builder
         * 
         */
        public Builder vmSizes(List<OceanVmSizeArgs> vmSizes) {
            return vmSizes(Output.of(vmSizes));
        }

        /**
         * @param vmSizes The types of virtual machines that may or may not be a part of the Ocean cluster.
         * 
         * @return builder
         * 
         */
        public Builder vmSizes(OceanVmSizeArgs... vmSizes) {
            return vmSizes(List.of(vmSizes));
        }

        /**
         * @param zones An Array holding default Availability Zones, this configures the availability zones the Ocean may launch instances in.
         * 
         * @return builder
         * 
         */
        public Builder zones(@Nullable Output<List<String>> zones) {
            $.zones = zones;
            return this;
        }

        /**
         * @param zones An Array holding default Availability Zones, this configures the availability zones the Ocean may launch instances in.
         * 
         * @return builder
         * 
         */
        public Builder zones(List<String> zones) {
            return zones(Output.of(zones));
        }

        /**
         * @param zones An Array holding default Availability Zones, this configures the availability zones the Ocean may launch instances in.
         * 
         * @return builder
         * 
         */
        public Builder zones(String... zones) {
            return zones(List.of(zones));
        }

        public OceanState build() {
            return $;
        }
    }

}
