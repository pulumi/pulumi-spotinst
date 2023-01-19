// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ElastigroupIntegrationRoute53DomainRecordSetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ElastigroupIntegrationRoute53DomainRecordSetArgs Empty = new ElastigroupIntegrationRoute53DomainRecordSetArgs();

    /**
     * The group name.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The group name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Designates whether the DNS address should be exposed to connections outside the VPC.
     * 
     */
    @Import(name="usePublicDns")
    private @Nullable Output<Boolean> usePublicDns;

    /**
     * @return Designates whether the DNS address should be exposed to connections outside the VPC.
     * 
     */
    public Optional<Output<Boolean>> usePublicDns() {
        return Optional.ofNullable(this.usePublicDns);
    }

    /**
     * Designates whether the IP address should be exposed to connections outside the VPC.
     * 
     */
    @Import(name="usePublicIp")
    private @Nullable Output<Boolean> usePublicIp;

    /**
     * @return Designates whether the IP address should be exposed to connections outside the VPC.
     * 
     */
    public Optional<Output<Boolean>> usePublicIp() {
        return Optional.ofNullable(this.usePublicIp);
    }

    private ElastigroupIntegrationRoute53DomainRecordSetArgs() {}

    private ElastigroupIntegrationRoute53DomainRecordSetArgs(ElastigroupIntegrationRoute53DomainRecordSetArgs $) {
        this.name = $.name;
        this.usePublicDns = $.usePublicDns;
        this.usePublicIp = $.usePublicIp;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ElastigroupIntegrationRoute53DomainRecordSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ElastigroupIntegrationRoute53DomainRecordSetArgs $;

        public Builder() {
            $ = new ElastigroupIntegrationRoute53DomainRecordSetArgs();
        }

        public Builder(ElastigroupIntegrationRoute53DomainRecordSetArgs defaults) {
            $ = new ElastigroupIntegrationRoute53DomainRecordSetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The group name.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The group name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param usePublicDns Designates whether the DNS address should be exposed to connections outside the VPC.
         * 
         * @return builder
         * 
         */
        public Builder usePublicDns(@Nullable Output<Boolean> usePublicDns) {
            $.usePublicDns = usePublicDns;
            return this;
        }

        /**
         * @param usePublicDns Designates whether the DNS address should be exposed to connections outside the VPC.
         * 
         * @return builder
         * 
         */
        public Builder usePublicDns(Boolean usePublicDns) {
            return usePublicDns(Output.of(usePublicDns));
        }

        /**
         * @param usePublicIp Designates whether the IP address should be exposed to connections outside the VPC.
         * 
         * @return builder
         * 
         */
        public Builder usePublicIp(@Nullable Output<Boolean> usePublicIp) {
            $.usePublicIp = usePublicIp;
            return this;
        }

        /**
         * @param usePublicIp Designates whether the IP address should be exposed to connections outside the VPC.
         * 
         * @return builder
         * 
         */
        public Builder usePublicIp(Boolean usePublicIp) {
            return usePublicIp(Output.of(usePublicIp));
        }

        public ElastigroupIntegrationRoute53DomainRecordSetArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
