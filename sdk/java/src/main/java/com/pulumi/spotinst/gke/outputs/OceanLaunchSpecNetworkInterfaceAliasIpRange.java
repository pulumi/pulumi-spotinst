// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.gke.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class OceanLaunchSpecNetworkInterfaceAliasIpRange {
    /**
     * @return specify the IP address range in CIDR notation that can be used for the alias IP addresses associated with the imported node pool.
     * 
     */
    private String ipCidrRange;
    /**
     * @return specify the IP address range for the subnet secondary IP range.
     * 
     * &lt;a id=&#34;update-policy&#34;&gt;&lt;/a&gt;
     * 
     */
    private String subnetworkRangeName;

    private OceanLaunchSpecNetworkInterfaceAliasIpRange() {}
    /**
     * @return specify the IP address range in CIDR notation that can be used for the alias IP addresses associated with the imported node pool.
     * 
     */
    public String ipCidrRange() {
        return this.ipCidrRange;
    }
    /**
     * @return specify the IP address range for the subnet secondary IP range.
     * 
     * &lt;a id=&#34;update-policy&#34;&gt;&lt;/a&gt;
     * 
     */
    public String subnetworkRangeName() {
        return this.subnetworkRangeName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OceanLaunchSpecNetworkInterfaceAliasIpRange defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String ipCidrRange;
        private String subnetworkRangeName;
        public Builder() {}
        public Builder(OceanLaunchSpecNetworkInterfaceAliasIpRange defaults) {
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
        public OceanLaunchSpecNetworkInterfaceAliasIpRange build() {
            final var _resultValue = new OceanLaunchSpecNetworkInterfaceAliasIpRange();
            _resultValue.ipCidrRange = ipCidrRange;
            _resultValue.subnetworkRangeName = subnetworkRangeName;
            return _resultValue;
        }
    }
}
