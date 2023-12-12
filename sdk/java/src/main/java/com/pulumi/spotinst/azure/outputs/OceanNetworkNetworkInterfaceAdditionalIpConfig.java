// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.azure.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OceanNetworkNetworkInterfaceAdditionalIpConfig {
    /**
     * @return Name of the Load Balancer.
     * 
     */
    private @Nullable String name;
    /**
     * @return Supported values: `IPv4`, `IPv6`.
     * 
     */
    private @Nullable String privateIpVersion;

    private OceanNetworkNetworkInterfaceAdditionalIpConfig() {}
    /**
     * @return Name of the Load Balancer.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Supported values: `IPv4`, `IPv6`.
     * 
     */
    public Optional<String> privateIpVersion() {
        return Optional.ofNullable(this.privateIpVersion);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OceanNetworkNetworkInterfaceAdditionalIpConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String name;
        private @Nullable String privateIpVersion;
        public Builder() {}
        public Builder(OceanNetworkNetworkInterfaceAdditionalIpConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.privateIpVersion = defaults.privateIpVersion;
        }

        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder privateIpVersion(@Nullable String privateIpVersion) {
            this.privateIpVersion = privateIpVersion;
            return this;
        }
        public OceanNetworkNetworkInterfaceAdditionalIpConfig build() {
            final var _resultValue = new OceanNetworkNetworkInterfaceAdditionalIpConfig();
            _resultValue.name = name;
            _resultValue.privateIpVersion = privateIpVersion;
            return _resultValue;
        }
    }
}
