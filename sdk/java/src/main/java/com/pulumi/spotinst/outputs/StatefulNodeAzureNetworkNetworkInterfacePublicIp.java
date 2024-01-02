// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class StatefulNodeAzureNetworkNetworkInterfacePublicIp {
    private String name;
    private String networkResourceGroupName;

    private StatefulNodeAzureNetworkNetworkInterfacePublicIp() {}
    public String name() {
        return this.name;
    }
    public String networkResourceGroupName() {
        return this.networkResourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StatefulNodeAzureNetworkNetworkInterfacePublicIp defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private String networkResourceGroupName;
        public Builder() {}
        public Builder(StatefulNodeAzureNetworkNetworkInterfacePublicIp defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.networkResourceGroupName = defaults.networkResourceGroupName;
        }

        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("StatefulNodeAzureNetworkNetworkInterfacePublicIp", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder networkResourceGroupName(String networkResourceGroupName) {
            if (networkResourceGroupName == null) {
              throw new MissingRequiredPropertyException("StatefulNodeAzureNetworkNetworkInterfacePublicIp", "networkResourceGroupName");
            }
            this.networkResourceGroupName = networkResourceGroupName;
            return this;
        }
        public StatefulNodeAzureNetworkNetworkInterfacePublicIp build() {
            final var _resultValue = new StatefulNodeAzureNetworkNetworkInterfacePublicIp();
            _resultValue.name = name;
            _resultValue.networkResourceGroupName = networkResourceGroupName;
            return _resultValue;
        }
    }
}
