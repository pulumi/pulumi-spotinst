// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.gcp.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class ElastigroupNetworkInterfaceAliasIpRangeArgs extends com.pulumi.resources.ResourceArgs {

    public static final ElastigroupNetworkInterfaceAliasIpRangeArgs Empty = new ElastigroupNetworkInterfaceAliasIpRangeArgs();

    @Import(name="ipCidrRange", required=true)
    private Output<String> ipCidrRange;

    public Output<String> ipCidrRange() {
        return this.ipCidrRange;
    }

    @Import(name="subnetworkRangeName", required=true)
    private Output<String> subnetworkRangeName;

    public Output<String> subnetworkRangeName() {
        return this.subnetworkRangeName;
    }

    private ElastigroupNetworkInterfaceAliasIpRangeArgs() {}

    private ElastigroupNetworkInterfaceAliasIpRangeArgs(ElastigroupNetworkInterfaceAliasIpRangeArgs $) {
        this.ipCidrRange = $.ipCidrRange;
        this.subnetworkRangeName = $.subnetworkRangeName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ElastigroupNetworkInterfaceAliasIpRangeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ElastigroupNetworkInterfaceAliasIpRangeArgs $;

        public Builder() {
            $ = new ElastigroupNetworkInterfaceAliasIpRangeArgs();
        }

        public Builder(ElastigroupNetworkInterfaceAliasIpRangeArgs defaults) {
            $ = new ElastigroupNetworkInterfaceAliasIpRangeArgs(Objects.requireNonNull(defaults));
        }

        public Builder ipCidrRange(Output<String> ipCidrRange) {
            $.ipCidrRange = ipCidrRange;
            return this;
        }

        public Builder ipCidrRange(String ipCidrRange) {
            return ipCidrRange(Output.of(ipCidrRange));
        }

        public Builder subnetworkRangeName(Output<String> subnetworkRangeName) {
            $.subnetworkRangeName = subnetworkRangeName;
            return this;
        }

        public Builder subnetworkRangeName(String subnetworkRangeName) {
            return subnetworkRangeName(Output.of(subnetworkRangeName));
        }

        public ElastigroupNetworkInterfaceAliasIpRangeArgs build() {
            if ($.ipCidrRange == null) {
                throw new MissingRequiredPropertyException("ElastigroupNetworkInterfaceAliasIpRangeArgs", "ipCidrRange");
            }
            if ($.subnetworkRangeName == null) {
                throw new MissingRequiredPropertyException("ElastigroupNetworkInterfaceAliasIpRangeArgs", "subnetworkRangeName");
            }
            return $;
        }
    }

}