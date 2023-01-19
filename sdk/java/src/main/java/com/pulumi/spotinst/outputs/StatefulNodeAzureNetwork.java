// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.spotinst.outputs.StatefulNodeAzureNetworkNetworkInterface;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class StatefulNodeAzureNetwork {
    private List<StatefulNodeAzureNetworkNetworkInterface> networkInterfaces;
    private String networkResourceGroupName;
    private String virtualNetworkName;

    private StatefulNodeAzureNetwork() {}
    public List<StatefulNodeAzureNetworkNetworkInterface> networkInterfaces() {
        return this.networkInterfaces;
    }
    public String networkResourceGroupName() {
        return this.networkResourceGroupName;
    }
    public String virtualNetworkName() {
        return this.virtualNetworkName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StatefulNodeAzureNetwork defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<StatefulNodeAzureNetworkNetworkInterface> networkInterfaces;
        private String networkResourceGroupName;
        private String virtualNetworkName;
        public Builder() {}
        public Builder(StatefulNodeAzureNetwork defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.networkInterfaces = defaults.networkInterfaces;
    	      this.networkResourceGroupName = defaults.networkResourceGroupName;
    	      this.virtualNetworkName = defaults.virtualNetworkName;
        }

        @CustomType.Setter
        public Builder networkInterfaces(List<StatefulNodeAzureNetworkNetworkInterface> networkInterfaces) {
            this.networkInterfaces = Objects.requireNonNull(networkInterfaces);
            return this;
        }
        public Builder networkInterfaces(StatefulNodeAzureNetworkNetworkInterface... networkInterfaces) {
            return networkInterfaces(List.of(networkInterfaces));
        }
        @CustomType.Setter
        public Builder networkResourceGroupName(String networkResourceGroupName) {
            this.networkResourceGroupName = Objects.requireNonNull(networkResourceGroupName);
            return this;
        }
        @CustomType.Setter
        public Builder virtualNetworkName(String virtualNetworkName) {
            this.virtualNetworkName = Objects.requireNonNull(virtualNetworkName);
            return this;
        }
        public StatefulNodeAzureNetwork build() {
            final var o = new StatefulNodeAzureNetwork();
            o.networkInterfaces = networkInterfaces;
            o.networkResourceGroupName = networkResourceGroupName;
            o.virtualNetworkName = virtualNetworkName;
            return o;
        }
    }
}