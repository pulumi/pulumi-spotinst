// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.azure.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.spotinst.azure.outputs.OceanNetworkNetworkInterface;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OceanNetwork {
    /**
     * @return A list of virtual network interfaces. The publicIpSku must be identical between all the network interfaces. One network interface must be set as the primary.
     * 
     */
    private @Nullable List<OceanNetworkNetworkInterface> networkInterfaces;
    /**
     * @return The Resource Group name of the Load Balancer.
     * 
     */
    private @Nullable String resourceGroupName;
    /**
     * @return Virtual network.
     * 
     */
    private @Nullable String virtualNetworkName;

    private OceanNetwork() {}
    /**
     * @return A list of virtual network interfaces. The publicIpSku must be identical between all the network interfaces. One network interface must be set as the primary.
     * 
     */
    public List<OceanNetworkNetworkInterface> networkInterfaces() {
        return this.networkInterfaces == null ? List.of() : this.networkInterfaces;
    }
    /**
     * @return The Resource Group name of the Load Balancer.
     * 
     */
    public Optional<String> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }
    /**
     * @return Virtual network.
     * 
     */
    public Optional<String> virtualNetworkName() {
        return Optional.ofNullable(this.virtualNetworkName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OceanNetwork defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<OceanNetworkNetworkInterface> networkInterfaces;
        private @Nullable String resourceGroupName;
        private @Nullable String virtualNetworkName;
        public Builder() {}
        public Builder(OceanNetwork defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.networkInterfaces = defaults.networkInterfaces;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.virtualNetworkName = defaults.virtualNetworkName;
        }

        @CustomType.Setter
        public Builder networkInterfaces(@Nullable List<OceanNetworkNetworkInterface> networkInterfaces) {

            this.networkInterfaces = networkInterfaces;
            return this;
        }
        public Builder networkInterfaces(OceanNetworkNetworkInterface... networkInterfaces) {
            return networkInterfaces(List.of(networkInterfaces));
        }
        @CustomType.Setter
        public Builder resourceGroupName(@Nullable String resourceGroupName) {

            this.resourceGroupName = resourceGroupName;
            return this;
        }
        @CustomType.Setter
        public Builder virtualNetworkName(@Nullable String virtualNetworkName) {

            this.virtualNetworkName = virtualNetworkName;
            return this;
        }
        public OceanNetwork build() {
            final var _resultValue = new OceanNetwork();
            _resultValue.networkInterfaces = networkInterfaces;
            _resultValue.resourceGroupName = resourceGroupName;
            _resultValue.virtualNetworkName = virtualNetworkName;
            return _resultValue;
        }
    }
}
