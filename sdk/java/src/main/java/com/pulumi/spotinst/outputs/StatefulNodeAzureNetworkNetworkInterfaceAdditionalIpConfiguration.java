// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class StatefulNodeAzureNetworkNetworkInterfaceAdditionalIpConfiguration {
    private String name;
    private String privateIpAddressVersion;

    private StatefulNodeAzureNetworkNetworkInterfaceAdditionalIpConfiguration() {}
    public String name() {
        return this.name;
    }
    public String privateIpAddressVersion() {
        return this.privateIpAddressVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StatefulNodeAzureNetworkNetworkInterfaceAdditionalIpConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private String privateIpAddressVersion;
        public Builder() {}
        public Builder(StatefulNodeAzureNetworkNetworkInterfaceAdditionalIpConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.privateIpAddressVersion = defaults.privateIpAddressVersion;
        }

        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("StatefulNodeAzureNetworkNetworkInterfaceAdditionalIpConfiguration", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder privateIpAddressVersion(String privateIpAddressVersion) {
            if (privateIpAddressVersion == null) {
              throw new MissingRequiredPropertyException("StatefulNodeAzureNetworkNetworkInterfaceAdditionalIpConfiguration", "privateIpAddressVersion");
            }
            this.privateIpAddressVersion = privateIpAddressVersion;
            return this;
        }
        public StatefulNodeAzureNetworkNetworkInterfaceAdditionalIpConfiguration build() {
            final var _resultValue = new StatefulNodeAzureNetworkNetworkInterfaceAdditionalIpConfiguration();
            _resultValue.name = name;
            _resultValue.privateIpAddressVersion = privateIpAddressVersion;
            return _resultValue;
        }
    }
}