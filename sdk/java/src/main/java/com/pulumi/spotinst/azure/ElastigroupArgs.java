// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.azure;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.spotinst.azure.inputs.ElastigroupHealthCheckArgs;
import com.pulumi.spotinst.azure.inputs.ElastigroupImageArgs;
import com.pulumi.spotinst.azure.inputs.ElastigroupIntegrationKubernetesArgs;
import com.pulumi.spotinst.azure.inputs.ElastigroupIntegrationMultaiRuntimeArgs;
import com.pulumi.spotinst.azure.inputs.ElastigroupLoadBalancerArgs;
import com.pulumi.spotinst.azure.inputs.ElastigroupLoginArgs;
import com.pulumi.spotinst.azure.inputs.ElastigroupManagedServiceIdentityArgs;
import com.pulumi.spotinst.azure.inputs.ElastigroupNetworkArgs;
import com.pulumi.spotinst.azure.inputs.ElastigroupScalingDownPolicyArgs;
import com.pulumi.spotinst.azure.inputs.ElastigroupScalingUpPolicyArgs;
import com.pulumi.spotinst.azure.inputs.ElastigroupScheduledTaskArgs;
import com.pulumi.spotinst.azure.inputs.ElastigroupStrategyArgs;
import com.pulumi.spotinst.azure.inputs.ElastigroupUpdatePolicyArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ElastigroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final ElastigroupArgs Empty = new ElastigroupArgs();

    @Import(name="customData")
    private @Nullable Output<String> customData;

    public Optional<Output<String>> customData() {
        return Optional.ofNullable(this.customData);
    }

    /**
     * The desired number of instances the group should have at any time.
     * 
     */
    @Import(name="desiredCapacity")
    private @Nullable Output<Integer> desiredCapacity;

    /**
     * @return The desired number of instances the group should have at any time.
     * 
     */
    public Optional<Output<Integer>> desiredCapacity() {
        return Optional.ofNullable(this.desiredCapacity);
    }

    @Import(name="healthCheck")
    private @Nullable Output<ElastigroupHealthCheckArgs> healthCheck;

    public Optional<Output<ElastigroupHealthCheckArgs>> healthCheck() {
        return Optional.ofNullable(this.healthCheck);
    }

    @Import(name="images")
    private @Nullable Output<List<ElastigroupImageArgs>> images;

    public Optional<Output<List<ElastigroupImageArgs>>> images() {
        return Optional.ofNullable(this.images);
    }

    /**
     * Describes the [Kubernetes](https://kubernetes.io/) integration.
     * 
     */
    @Import(name="integrationKubernetes")
    private @Nullable Output<ElastigroupIntegrationKubernetesArgs> integrationKubernetes;

    /**
     * @return Describes the [Kubernetes](https://kubernetes.io/) integration.
     * 
     */
    public Optional<Output<ElastigroupIntegrationKubernetesArgs>> integrationKubernetes() {
        return Optional.ofNullable(this.integrationKubernetes);
    }

    /**
     * Describes the [Multai Runtime](https://spotinst.com/) integration.
     * 
     */
    @Import(name="integrationMultaiRuntime")
    private @Nullable Output<ElastigroupIntegrationMultaiRuntimeArgs> integrationMultaiRuntime;

    /**
     * @return Describes the [Multai Runtime](https://spotinst.com/) integration.
     * 
     */
    public Optional<Output<ElastigroupIntegrationMultaiRuntimeArgs>> integrationMultaiRuntime() {
        return Optional.ofNullable(this.integrationMultaiRuntime);
    }

    @Import(name="loadBalancers")
    private @Nullable Output<List<ElastigroupLoadBalancerArgs>> loadBalancers;

    public Optional<Output<List<ElastigroupLoadBalancerArgs>>> loadBalancers() {
        return Optional.ofNullable(this.loadBalancers);
    }

    @Import(name="login")
    private @Nullable Output<ElastigroupLoginArgs> login;

    public Optional<Output<ElastigroupLoginArgs>> login() {
        return Optional.ofNullable(this.login);
    }

    /**
     * Available Low-Priority sizes.
     * 
     */
    @Import(name="lowPrioritySizes", required=true)
    private Output<List<String>> lowPrioritySizes;

    /**
     * @return Available Low-Priority sizes.
     * 
     */
    public Output<List<String>> lowPrioritySizes() {
        return this.lowPrioritySizes;
    }

    @Import(name="managedServiceIdentities")
    private @Nullable Output<List<ElastigroupManagedServiceIdentityArgs>> managedServiceIdentities;

    public Optional<Output<List<ElastigroupManagedServiceIdentityArgs>>> managedServiceIdentities() {
        return Optional.ofNullable(this.managedServiceIdentities);
    }

    /**
     * The maximum number of instances the group should have at any time.
     * 
     */
    @Import(name="maxSize")
    private @Nullable Output<Integer> maxSize;

    /**
     * @return The maximum number of instances the group should have at any time.
     * 
     */
    public Optional<Output<Integer>> maxSize() {
        return Optional.ofNullable(this.maxSize);
    }

    /**
     * The minimum number of instances the group should have at any time.
     * 
     */
    @Import(name="minSize")
    private @Nullable Output<Integer> minSize;

    /**
     * @return The minimum number of instances the group should have at any time.
     * 
     */
    public Optional<Output<Integer>> minSize() {
        return Optional.ofNullable(this.minSize);
    }

    /**
     * The name of the managed identity.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the managed identity.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="network", required=true)
    private Output<ElastigroupNetworkArgs> network;

    public Output<ElastigroupNetworkArgs> network() {
        return this.network;
    }

    /**
     * Available On-Demand sizes
     * 
     */
    @Import(name="odSizes", required=true)
    private Output<List<String>> odSizes;

    /**
     * @return Available On-Demand sizes
     * 
     */
    public Output<List<String>> odSizes() {
        return this.odSizes;
    }

    /**
     * Operation system type. Valid values: `&#34;Linux&#34;`, `&#34;Windows&#34;`.
     * 
     */
    @Import(name="product", required=true)
    private Output<String> product;

    /**
     * @return Operation system type. Valid values: `&#34;Linux&#34;`, `&#34;Windows&#34;`.
     * 
     */
    public Output<String> product() {
        return this.product;
    }

    /**
     * The region your Azure group will be created in.
     * 
     */
    @Import(name="region", required=true)
    private Output<String> region;

    /**
     * @return The region your Azure group will be created in.
     * 
     */
    public Output<String> region() {
        return this.region;
    }

    /**
     * The Resource Group that the user-assigned managed identity resides in.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The Resource Group that the user-assigned managed identity resides in.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
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

    /**
     * Describes the configuration of one or more scheduled tasks.
     * 
     */
    @Import(name="scheduledTasks")
    private @Nullable Output<List<ElastigroupScheduledTaskArgs>> scheduledTasks;

    /**
     * @return Describes the configuration of one or more scheduled tasks.
     * 
     */
    public Optional<Output<List<ElastigroupScheduledTaskArgs>>> scheduledTasks() {
        return Optional.ofNullable(this.scheduledTasks);
    }

    /**
     * Shutdown script for the group. Value should be passed as a string encoded at Base64 only.
     * 
     */
    @Import(name="shutdownScript")
    private @Nullable Output<String> shutdownScript;

    /**
     * @return Shutdown script for the group. Value should be passed as a string encoded at Base64 only.
     * 
     */
    public Optional<Output<String>> shutdownScript() {
        return Optional.ofNullable(this.shutdownScript);
    }

    /**
     * Describes the deployment strategy.
     * 
     */
    @Import(name="strategy", required=true)
    private Output<ElastigroupStrategyArgs> strategy;

    /**
     * @return Describes the deployment strategy.
     * 
     */
    public Output<ElastigroupStrategyArgs> strategy() {
        return this.strategy;
    }

    @Import(name="updatePolicy")
    private @Nullable Output<ElastigroupUpdatePolicyArgs> updatePolicy;

    public Optional<Output<ElastigroupUpdatePolicyArgs>> updatePolicy() {
        return Optional.ofNullable(this.updatePolicy);
    }

    /**
     * Base64-encoded MIME user data to make available to the instances.
     * 
     */
    @Import(name="userData")
    private @Nullable Output<String> userData;

    /**
     * @return Base64-encoded MIME user data to make available to the instances.
     * 
     */
    public Optional<Output<String>> userData() {
        return Optional.ofNullable(this.userData);
    }

    private ElastigroupArgs() {}

    private ElastigroupArgs(ElastigroupArgs $) {
        this.customData = $.customData;
        this.desiredCapacity = $.desiredCapacity;
        this.healthCheck = $.healthCheck;
        this.images = $.images;
        this.integrationKubernetes = $.integrationKubernetes;
        this.integrationMultaiRuntime = $.integrationMultaiRuntime;
        this.loadBalancers = $.loadBalancers;
        this.login = $.login;
        this.lowPrioritySizes = $.lowPrioritySizes;
        this.managedServiceIdentities = $.managedServiceIdentities;
        this.maxSize = $.maxSize;
        this.minSize = $.minSize;
        this.name = $.name;
        this.network = $.network;
        this.odSizes = $.odSizes;
        this.product = $.product;
        this.region = $.region;
        this.resourceGroupName = $.resourceGroupName;
        this.scalingDownPolicies = $.scalingDownPolicies;
        this.scalingUpPolicies = $.scalingUpPolicies;
        this.scheduledTasks = $.scheduledTasks;
        this.shutdownScript = $.shutdownScript;
        this.strategy = $.strategy;
        this.updatePolicy = $.updatePolicy;
        this.userData = $.userData;
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

        public Builder customData(@Nullable Output<String> customData) {
            $.customData = customData;
            return this;
        }

        public Builder customData(String customData) {
            return customData(Output.of(customData));
        }

        /**
         * @param desiredCapacity The desired number of instances the group should have at any time.
         * 
         * @return builder
         * 
         */
        public Builder desiredCapacity(@Nullable Output<Integer> desiredCapacity) {
            $.desiredCapacity = desiredCapacity;
            return this;
        }

        /**
         * @param desiredCapacity The desired number of instances the group should have at any time.
         * 
         * @return builder
         * 
         */
        public Builder desiredCapacity(Integer desiredCapacity) {
            return desiredCapacity(Output.of(desiredCapacity));
        }

        public Builder healthCheck(@Nullable Output<ElastigroupHealthCheckArgs> healthCheck) {
            $.healthCheck = healthCheck;
            return this;
        }

        public Builder healthCheck(ElastigroupHealthCheckArgs healthCheck) {
            return healthCheck(Output.of(healthCheck));
        }

        public Builder images(@Nullable Output<List<ElastigroupImageArgs>> images) {
            $.images = images;
            return this;
        }

        public Builder images(List<ElastigroupImageArgs> images) {
            return images(Output.of(images));
        }

        public Builder images(ElastigroupImageArgs... images) {
            return images(List.of(images));
        }

        /**
         * @param integrationKubernetes Describes the [Kubernetes](https://kubernetes.io/) integration.
         * 
         * @return builder
         * 
         */
        public Builder integrationKubernetes(@Nullable Output<ElastigroupIntegrationKubernetesArgs> integrationKubernetes) {
            $.integrationKubernetes = integrationKubernetes;
            return this;
        }

        /**
         * @param integrationKubernetes Describes the [Kubernetes](https://kubernetes.io/) integration.
         * 
         * @return builder
         * 
         */
        public Builder integrationKubernetes(ElastigroupIntegrationKubernetesArgs integrationKubernetes) {
            return integrationKubernetes(Output.of(integrationKubernetes));
        }

        /**
         * @param integrationMultaiRuntime Describes the [Multai Runtime](https://spotinst.com/) integration.
         * 
         * @return builder
         * 
         */
        public Builder integrationMultaiRuntime(@Nullable Output<ElastigroupIntegrationMultaiRuntimeArgs> integrationMultaiRuntime) {
            $.integrationMultaiRuntime = integrationMultaiRuntime;
            return this;
        }

        /**
         * @param integrationMultaiRuntime Describes the [Multai Runtime](https://spotinst.com/) integration.
         * 
         * @return builder
         * 
         */
        public Builder integrationMultaiRuntime(ElastigroupIntegrationMultaiRuntimeArgs integrationMultaiRuntime) {
            return integrationMultaiRuntime(Output.of(integrationMultaiRuntime));
        }

        public Builder loadBalancers(@Nullable Output<List<ElastigroupLoadBalancerArgs>> loadBalancers) {
            $.loadBalancers = loadBalancers;
            return this;
        }

        public Builder loadBalancers(List<ElastigroupLoadBalancerArgs> loadBalancers) {
            return loadBalancers(Output.of(loadBalancers));
        }

        public Builder loadBalancers(ElastigroupLoadBalancerArgs... loadBalancers) {
            return loadBalancers(List.of(loadBalancers));
        }

        public Builder login(@Nullable Output<ElastigroupLoginArgs> login) {
            $.login = login;
            return this;
        }

        public Builder login(ElastigroupLoginArgs login) {
            return login(Output.of(login));
        }

        /**
         * @param lowPrioritySizes Available Low-Priority sizes.
         * 
         * @return builder
         * 
         */
        public Builder lowPrioritySizes(Output<List<String>> lowPrioritySizes) {
            $.lowPrioritySizes = lowPrioritySizes;
            return this;
        }

        /**
         * @param lowPrioritySizes Available Low-Priority sizes.
         * 
         * @return builder
         * 
         */
        public Builder lowPrioritySizes(List<String> lowPrioritySizes) {
            return lowPrioritySizes(Output.of(lowPrioritySizes));
        }

        /**
         * @param lowPrioritySizes Available Low-Priority sizes.
         * 
         * @return builder
         * 
         */
        public Builder lowPrioritySizes(String... lowPrioritySizes) {
            return lowPrioritySizes(List.of(lowPrioritySizes));
        }

        public Builder managedServiceIdentities(@Nullable Output<List<ElastigroupManagedServiceIdentityArgs>> managedServiceIdentities) {
            $.managedServiceIdentities = managedServiceIdentities;
            return this;
        }

        public Builder managedServiceIdentities(List<ElastigroupManagedServiceIdentityArgs> managedServiceIdentities) {
            return managedServiceIdentities(Output.of(managedServiceIdentities));
        }

        public Builder managedServiceIdentities(ElastigroupManagedServiceIdentityArgs... managedServiceIdentities) {
            return managedServiceIdentities(List.of(managedServiceIdentities));
        }

        /**
         * @param maxSize The maximum number of instances the group should have at any time.
         * 
         * @return builder
         * 
         */
        public Builder maxSize(@Nullable Output<Integer> maxSize) {
            $.maxSize = maxSize;
            return this;
        }

        /**
         * @param maxSize The maximum number of instances the group should have at any time.
         * 
         * @return builder
         * 
         */
        public Builder maxSize(Integer maxSize) {
            return maxSize(Output.of(maxSize));
        }

        /**
         * @param minSize The minimum number of instances the group should have at any time.
         * 
         * @return builder
         * 
         */
        public Builder minSize(@Nullable Output<Integer> minSize) {
            $.minSize = minSize;
            return this;
        }

        /**
         * @param minSize The minimum number of instances the group should have at any time.
         * 
         * @return builder
         * 
         */
        public Builder minSize(Integer minSize) {
            return minSize(Output.of(minSize));
        }

        /**
         * @param name The name of the managed identity.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the managed identity.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder network(Output<ElastigroupNetworkArgs> network) {
            $.network = network;
            return this;
        }

        public Builder network(ElastigroupNetworkArgs network) {
            return network(Output.of(network));
        }

        /**
         * @param odSizes Available On-Demand sizes
         * 
         * @return builder
         * 
         */
        public Builder odSizes(Output<List<String>> odSizes) {
            $.odSizes = odSizes;
            return this;
        }

        /**
         * @param odSizes Available On-Demand sizes
         * 
         * @return builder
         * 
         */
        public Builder odSizes(List<String> odSizes) {
            return odSizes(Output.of(odSizes));
        }

        /**
         * @param odSizes Available On-Demand sizes
         * 
         * @return builder
         * 
         */
        public Builder odSizes(String... odSizes) {
            return odSizes(List.of(odSizes));
        }

        /**
         * @param product Operation system type. Valid values: `&#34;Linux&#34;`, `&#34;Windows&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder product(Output<String> product) {
            $.product = product;
            return this;
        }

        /**
         * @param product Operation system type. Valid values: `&#34;Linux&#34;`, `&#34;Windows&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder product(String product) {
            return product(Output.of(product));
        }

        /**
         * @param region The region your Azure group will be created in.
         * 
         * @return builder
         * 
         */
        public Builder region(Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The region your Azure group will be created in.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param resourceGroupName The Resource Group that the user-assigned managed identity resides in.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The Resource Group that the user-assigned managed identity resides in.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
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

        /**
         * @param scheduledTasks Describes the configuration of one or more scheduled tasks.
         * 
         * @return builder
         * 
         */
        public Builder scheduledTasks(@Nullable Output<List<ElastigroupScheduledTaskArgs>> scheduledTasks) {
            $.scheduledTasks = scheduledTasks;
            return this;
        }

        /**
         * @param scheduledTasks Describes the configuration of one or more scheduled tasks.
         * 
         * @return builder
         * 
         */
        public Builder scheduledTasks(List<ElastigroupScheduledTaskArgs> scheduledTasks) {
            return scheduledTasks(Output.of(scheduledTasks));
        }

        /**
         * @param scheduledTasks Describes the configuration of one or more scheduled tasks.
         * 
         * @return builder
         * 
         */
        public Builder scheduledTasks(ElastigroupScheduledTaskArgs... scheduledTasks) {
            return scheduledTasks(List.of(scheduledTasks));
        }

        /**
         * @param shutdownScript Shutdown script for the group. Value should be passed as a string encoded at Base64 only.
         * 
         * @return builder
         * 
         */
        public Builder shutdownScript(@Nullable Output<String> shutdownScript) {
            $.shutdownScript = shutdownScript;
            return this;
        }

        /**
         * @param shutdownScript Shutdown script for the group. Value should be passed as a string encoded at Base64 only.
         * 
         * @return builder
         * 
         */
        public Builder shutdownScript(String shutdownScript) {
            return shutdownScript(Output.of(shutdownScript));
        }

        /**
         * @param strategy Describes the deployment strategy.
         * 
         * @return builder
         * 
         */
        public Builder strategy(Output<ElastigroupStrategyArgs> strategy) {
            $.strategy = strategy;
            return this;
        }

        /**
         * @param strategy Describes the deployment strategy.
         * 
         * @return builder
         * 
         */
        public Builder strategy(ElastigroupStrategyArgs strategy) {
            return strategy(Output.of(strategy));
        }

        public Builder updatePolicy(@Nullable Output<ElastigroupUpdatePolicyArgs> updatePolicy) {
            $.updatePolicy = updatePolicy;
            return this;
        }

        public Builder updatePolicy(ElastigroupUpdatePolicyArgs updatePolicy) {
            return updatePolicy(Output.of(updatePolicy));
        }

        /**
         * @param userData Base64-encoded MIME user data to make available to the instances.
         * 
         * @return builder
         * 
         */
        public Builder userData(@Nullable Output<String> userData) {
            $.userData = userData;
            return this;
        }

        /**
         * @param userData Base64-encoded MIME user data to make available to the instances.
         * 
         * @return builder
         * 
         */
        public Builder userData(String userData) {
            return userData(Output.of(userData));
        }

        public ElastigroupArgs build() {
            $.lowPrioritySizes = Objects.requireNonNull($.lowPrioritySizes, "expected parameter 'lowPrioritySizes' to be non-null");
            $.network = Objects.requireNonNull($.network, "expected parameter 'network' to be non-null");
            $.odSizes = Objects.requireNonNull($.odSizes, "expected parameter 'odSizes' to be non-null");
            $.product = Objects.requireNonNull($.product, "expected parameter 'product' to be non-null");
            $.region = Objects.requireNonNull($.region, "expected parameter 'region' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.strategy = Objects.requireNonNull($.strategy, "expected parameter 'strategy' to be non-null");
            return $;
        }
    }

}
