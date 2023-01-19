// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ElastigroupAzureV3NetworkNetworkInterfaceAdditionalIpConfig {
    /**
     * @return Name of the Managed Service Identity.
     * 
     */
    private String name;
    /**
     * @return Available from Azure Api-Version 2017-03-30 onwards, it represents whether the specific ip configuration is IPv4 or IPv6. Valid values: `IPv4`, `IPv6`.
     * 
     */
    private @Nullable String privateIpVersion;

    private ElastigroupAzureV3NetworkNetworkInterfaceAdditionalIpConfig() {}
    /**
     * @return Name of the Managed Service Identity.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Available from Azure Api-Version 2017-03-30 onwards, it represents whether the specific ip configuration is IPv4 or IPv6. Valid values: `IPv4`, `IPv6`.
     * 
     */
    public Optional<String> privateIpVersion() {
        return Optional.ofNullable(this.privateIpVersion);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ElastigroupAzureV3NetworkNetworkInterfaceAdditionalIpConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private @Nullable String privateIpVersion;
        public Builder() {}
        public Builder(ElastigroupAzureV3NetworkNetworkInterfaceAdditionalIpConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.privateIpVersion = defaults.privateIpVersion;
        }

        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder privateIpVersion(@Nullable String privateIpVersion) {
            this.privateIpVersion = privateIpVersion;
            return this;
        }
        public ElastigroupAzureV3NetworkNetworkInterfaceAdditionalIpConfig build() {
            final var o = new ElastigroupAzureV3NetworkNetworkInterfaceAdditionalIpConfig();
            o.name = name;
            o.privateIpVersion = privateIpVersion;
            return o;
        }
    }
}