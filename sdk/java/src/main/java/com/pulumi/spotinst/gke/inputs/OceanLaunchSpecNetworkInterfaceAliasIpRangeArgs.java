// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.gke.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class OceanLaunchSpecNetworkInterfaceAliasIpRangeArgs extends com.pulumi.resources.ResourceArgs {

    public static final OceanLaunchSpecNetworkInterfaceAliasIpRangeArgs Empty = new OceanLaunchSpecNetworkInterfaceAliasIpRangeArgs();

    /**
     * specify the IP address range in CIDR notation that can be used for the alias IP addresses associated with the imported node pool.
     * 
     */
    @Import(name="ipCidrRange", required=true)
    private Output<String> ipCidrRange;

    /**
     * @return specify the IP address range in CIDR notation that can be used for the alias IP addresses associated with the imported node pool.
     * 
     */
    public Output<String> ipCidrRange() {
        return this.ipCidrRange;
    }

    /**
     * specify the IP address range for the subnet secondary IP range.
     * 
     */
    @Import(name="subnetworkRangeName", required=true)
    private Output<String> subnetworkRangeName;

    /**
     * @return specify the IP address range for the subnet secondary IP range.
     * 
     */
    public Output<String> subnetworkRangeName() {
        return this.subnetworkRangeName;
    }

    private OceanLaunchSpecNetworkInterfaceAliasIpRangeArgs() {}

    private OceanLaunchSpecNetworkInterfaceAliasIpRangeArgs(OceanLaunchSpecNetworkInterfaceAliasIpRangeArgs $) {
        this.ipCidrRange = $.ipCidrRange;
        this.subnetworkRangeName = $.subnetworkRangeName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OceanLaunchSpecNetworkInterfaceAliasIpRangeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OceanLaunchSpecNetworkInterfaceAliasIpRangeArgs $;

        public Builder() {
            $ = new OceanLaunchSpecNetworkInterfaceAliasIpRangeArgs();
        }

        public Builder(OceanLaunchSpecNetworkInterfaceAliasIpRangeArgs defaults) {
            $ = new OceanLaunchSpecNetworkInterfaceAliasIpRangeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ipCidrRange specify the IP address range in CIDR notation that can be used for the alias IP addresses associated with the imported node pool.
         * 
         * @return builder
         * 
         */
        public Builder ipCidrRange(Output<String> ipCidrRange) {
            $.ipCidrRange = ipCidrRange;
            return this;
        }

        /**
         * @param ipCidrRange specify the IP address range in CIDR notation that can be used for the alias IP addresses associated with the imported node pool.
         * 
         * @return builder
         * 
         */
        public Builder ipCidrRange(String ipCidrRange) {
            return ipCidrRange(Output.of(ipCidrRange));
        }

        /**
         * @param subnetworkRangeName specify the IP address range for the subnet secondary IP range.
         * 
         * @return builder
         * 
         */
        public Builder subnetworkRangeName(Output<String> subnetworkRangeName) {
            $.subnetworkRangeName = subnetworkRangeName;
            return this;
        }

        /**
         * @param subnetworkRangeName specify the IP address range for the subnet secondary IP range.
         * 
         * @return builder
         * 
         */
        public Builder subnetworkRangeName(String subnetworkRangeName) {
            return subnetworkRangeName(Output.of(subnetworkRangeName));
        }

        public OceanLaunchSpecNetworkInterfaceAliasIpRangeArgs build() {
            $.ipCidrRange = Objects.requireNonNull($.ipCidrRange, "expected parameter 'ipCidrRange' to be non-null");
            $.subnetworkRangeName = Objects.requireNonNull($.subnetworkRangeName, "expected parameter 'subnetworkRangeName' to be non-null");
            return $;
        }
    }

}
