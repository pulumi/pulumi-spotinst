// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.azure.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OceanNetworkNetworkInterfaceAdditionalIpConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final OceanNetworkNetworkInterfaceAdditionalIpConfigArgs Empty = new OceanNetworkNetworkInterfaceAdditionalIpConfigArgs();

    /**
     * The Ocean cluster name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The Ocean cluster name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="privateIpVersion")
    private @Nullable Output<String> privateIpVersion;

    public Optional<Output<String>> privateIpVersion() {
        return Optional.ofNullable(this.privateIpVersion);
    }

    private OceanNetworkNetworkInterfaceAdditionalIpConfigArgs() {}

    private OceanNetworkNetworkInterfaceAdditionalIpConfigArgs(OceanNetworkNetworkInterfaceAdditionalIpConfigArgs $) {
        this.name = $.name;
        this.privateIpVersion = $.privateIpVersion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OceanNetworkNetworkInterfaceAdditionalIpConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OceanNetworkNetworkInterfaceAdditionalIpConfigArgs $;

        public Builder() {
            $ = new OceanNetworkNetworkInterfaceAdditionalIpConfigArgs();
        }

        public Builder(OceanNetworkNetworkInterfaceAdditionalIpConfigArgs defaults) {
            $ = new OceanNetworkNetworkInterfaceAdditionalIpConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The Ocean cluster name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The Ocean cluster name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder privateIpVersion(@Nullable Output<String> privateIpVersion) {
            $.privateIpVersion = privateIpVersion;
            return this;
        }

        public Builder privateIpVersion(String privateIpVersion) {
            return privateIpVersion(Output.of(privateIpVersion));
        }

        public OceanNetworkNetworkInterfaceAdditionalIpConfigArgs build() {
            return $;
        }
    }

}
