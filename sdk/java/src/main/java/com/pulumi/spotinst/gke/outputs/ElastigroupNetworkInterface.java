// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.gke.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.spotinst.gke.outputs.ElastigroupNetworkInterfaceAccessConfig;
import com.pulumi.spotinst.gke.outputs.ElastigroupNetworkInterfaceAliasIpRange;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ElastigroupNetworkInterface {
    private @Nullable List<ElastigroupNetworkInterfaceAccessConfig> accessConfigs;
    private @Nullable List<ElastigroupNetworkInterfaceAliasIpRange> aliasIpRanges;
    private String network;

    private ElastigroupNetworkInterface() {}
    public List<ElastigroupNetworkInterfaceAccessConfig> accessConfigs() {
        return this.accessConfigs == null ? List.of() : this.accessConfigs;
    }
    public List<ElastigroupNetworkInterfaceAliasIpRange> aliasIpRanges() {
        return this.aliasIpRanges == null ? List.of() : this.aliasIpRanges;
    }
    public String network() {
        return this.network;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ElastigroupNetworkInterface defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<ElastigroupNetworkInterfaceAccessConfig> accessConfigs;
        private @Nullable List<ElastigroupNetworkInterfaceAliasIpRange> aliasIpRanges;
        private String network;
        public Builder() {}
        public Builder(ElastigroupNetworkInterface defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessConfigs = defaults.accessConfigs;
    	      this.aliasIpRanges = defaults.aliasIpRanges;
    	      this.network = defaults.network;
        }

        @CustomType.Setter
        public Builder accessConfigs(@Nullable List<ElastigroupNetworkInterfaceAccessConfig> accessConfigs) {
            this.accessConfigs = accessConfigs;
            return this;
        }
        public Builder accessConfigs(ElastigroupNetworkInterfaceAccessConfig... accessConfigs) {
            return accessConfigs(List.of(accessConfigs));
        }
        @CustomType.Setter
        public Builder aliasIpRanges(@Nullable List<ElastigroupNetworkInterfaceAliasIpRange> aliasIpRanges) {
            this.aliasIpRanges = aliasIpRanges;
            return this;
        }
        public Builder aliasIpRanges(ElastigroupNetworkInterfaceAliasIpRange... aliasIpRanges) {
            return aliasIpRanges(List.of(aliasIpRanges));
        }
        @CustomType.Setter
        public Builder network(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }
        public ElastigroupNetworkInterface build() {
            final var o = new ElastigroupNetworkInterface();
            o.accessConfigs = accessConfigs;
            o.aliasIpRanges = aliasIpRanges;
            o.network = network;
            return o;
        }
    }
}