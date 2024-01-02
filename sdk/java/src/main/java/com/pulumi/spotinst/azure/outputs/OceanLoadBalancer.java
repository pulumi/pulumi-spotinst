// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.azure.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OceanLoadBalancer {
    /**
     * @return Names of the Backend Pools to register the Cluster VMs to. Each Backend Pool is a separate load balancer.
     * 
     */
    private @Nullable List<String> backendPoolNames;
    /**
     * @return Supported values: `Standard`, `Basic`.
     * 
     */
    private @Nullable String loadBalancerSku;
    /**
     * @return Name of the Load Balancer.
     * 
     */
    private @Nullable String name;
    /**
     * @return The Resource Group name of the Load Balancer.
     * 
     */
    private @Nullable String resourceGroupName;
    /**
     * @return The type of load balancer. Supported value: `loadBalancer`
     * 
     */
    private @Nullable String type;

    private OceanLoadBalancer() {}
    /**
     * @return Names of the Backend Pools to register the Cluster VMs to. Each Backend Pool is a separate load balancer.
     * 
     */
    public List<String> backendPoolNames() {
        return this.backendPoolNames == null ? List.of() : this.backendPoolNames;
    }
    /**
     * @return Supported values: `Standard`, `Basic`.
     * 
     */
    public Optional<String> loadBalancerSku() {
        return Optional.ofNullable(this.loadBalancerSku);
    }
    /**
     * @return Name of the Load Balancer.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return The Resource Group name of the Load Balancer.
     * 
     */
    public Optional<String> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }
    /**
     * @return The type of load balancer. Supported value: `loadBalancer`
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OceanLoadBalancer defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> backendPoolNames;
        private @Nullable String loadBalancerSku;
        private @Nullable String name;
        private @Nullable String resourceGroupName;
        private @Nullable String type;
        public Builder() {}
        public Builder(OceanLoadBalancer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendPoolNames = defaults.backendPoolNames;
    	      this.loadBalancerSku = defaults.loadBalancerSku;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder backendPoolNames(@Nullable List<String> backendPoolNames) {

            this.backendPoolNames = backendPoolNames;
            return this;
        }
        public Builder backendPoolNames(String... backendPoolNames) {
            return backendPoolNames(List.of(backendPoolNames));
        }
        @CustomType.Setter
        public Builder loadBalancerSku(@Nullable String loadBalancerSku) {

            this.loadBalancerSku = loadBalancerSku;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder resourceGroupName(@Nullable String resourceGroupName) {

            this.resourceGroupName = resourceGroupName;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {

            this.type = type;
            return this;
        }
        public OceanLoadBalancer build() {
            final var _resultValue = new OceanLoadBalancer();
            _resultValue.backendPoolNames = backendPoolNames;
            _resultValue.loadBalancerSku = loadBalancerSku;
            _resultValue.name = name;
            _resultValue.resourceGroupName = resourceGroupName;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
