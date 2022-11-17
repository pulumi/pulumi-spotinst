// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.gke.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ElastigroupNetworkInterfaceAliasIpRange {
    private String ipCidrRange;
    private String subnetworkRangeName;

    private ElastigroupNetworkInterfaceAliasIpRange() {}
    public String ipCidrRange() {
        return this.ipCidrRange;
    }
    public String subnetworkRangeName() {
        return this.subnetworkRangeName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ElastigroupNetworkInterfaceAliasIpRange defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String ipCidrRange;
        private String subnetworkRangeName;
        public Builder() {}
        public Builder(ElastigroupNetworkInterfaceAliasIpRange defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipCidrRange = defaults.ipCidrRange;
    	      this.subnetworkRangeName = defaults.subnetworkRangeName;
        }

        @CustomType.Setter
        public Builder ipCidrRange(String ipCidrRange) {
            this.ipCidrRange = Objects.requireNonNull(ipCidrRange);
            return this;
        }
        @CustomType.Setter
        public Builder subnetworkRangeName(String subnetworkRangeName) {
            this.subnetworkRangeName = Objects.requireNonNull(subnetworkRangeName);
            return this;
        }
        public ElastigroupNetworkInterfaceAliasIpRange build() {
            final var o = new ElastigroupNetworkInterfaceAliasIpRange();
            o.ipCidrRange = ipCidrRange;
            o.subnetworkRangeName = subnetworkRangeName;
            return o;
        }
    }
}
