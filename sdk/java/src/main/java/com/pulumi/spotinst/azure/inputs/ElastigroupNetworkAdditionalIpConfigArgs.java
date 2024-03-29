// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.azure.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ElastigroupNetworkAdditionalIpConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ElastigroupNetworkAdditionalIpConfigArgs Empty = new ElastigroupNetworkAdditionalIpConfigArgs();

    /**
     * Name of the Managed Service Identity.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of the Managed Service Identity.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    @Import(name="privateIpVersion")
    private @Nullable Output<String> privateIpVersion;

    public Optional<Output<String>> privateIpVersion() {
        return Optional.ofNullable(this.privateIpVersion);
    }

    private ElastigroupNetworkAdditionalIpConfigArgs() {}

    private ElastigroupNetworkAdditionalIpConfigArgs(ElastigroupNetworkAdditionalIpConfigArgs $) {
        this.name = $.name;
        this.privateIpVersion = $.privateIpVersion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ElastigroupNetworkAdditionalIpConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ElastigroupNetworkAdditionalIpConfigArgs $;

        public Builder() {
            $ = new ElastigroupNetworkAdditionalIpConfigArgs();
        }

        public Builder(ElastigroupNetworkAdditionalIpConfigArgs defaults) {
            $ = new ElastigroupNetworkAdditionalIpConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of the Managed Service Identity.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the Managed Service Identity.
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

        public ElastigroupNetworkAdditionalIpConfigArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("ElastigroupNetworkAdditionalIpConfigArgs", "name");
            }
            return $;
        }
    }

}
