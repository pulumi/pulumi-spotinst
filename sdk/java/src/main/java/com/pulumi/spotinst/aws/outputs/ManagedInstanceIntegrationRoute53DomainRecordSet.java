// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ManagedInstanceIntegrationRoute53DomainRecordSet {
    /**
     * @return The ManagedInstance name.
     * 
     */
    private String name;
    /**
     * @return Designates whether the DNS address should be exposed to connections outside the VPC.
     * 
     */
    private @Nullable Boolean usePublicDns;
    /**
     * @return Designates whether the IP address should be exposed to connections outside the VPC.
     * 
     */
    private @Nullable Boolean usePublicIp;

    private ManagedInstanceIntegrationRoute53DomainRecordSet() {}
    /**
     * @return The ManagedInstance name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Designates whether the DNS address should be exposed to connections outside the VPC.
     * 
     */
    public Optional<Boolean> usePublicDns() {
        return Optional.ofNullable(this.usePublicDns);
    }
    /**
     * @return Designates whether the IP address should be exposed to connections outside the VPC.
     * 
     */
    public Optional<Boolean> usePublicIp() {
        return Optional.ofNullable(this.usePublicIp);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedInstanceIntegrationRoute53DomainRecordSet defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private @Nullable Boolean usePublicDns;
        private @Nullable Boolean usePublicIp;
        public Builder() {}
        public Builder(ManagedInstanceIntegrationRoute53DomainRecordSet defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.usePublicDns = defaults.usePublicDns;
    	      this.usePublicIp = defaults.usePublicIp;
        }

        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder usePublicDns(@Nullable Boolean usePublicDns) {
            this.usePublicDns = usePublicDns;
            return this;
        }
        @CustomType.Setter
        public Builder usePublicIp(@Nullable Boolean usePublicIp) {
            this.usePublicIp = usePublicIp;
            return this;
        }
        public ManagedInstanceIntegrationRoute53DomainRecordSet build() {
            final var o = new ManagedInstanceIntegrationRoute53DomainRecordSet();
            o.name = name;
            o.usePublicDns = usePublicDns;
            o.usePublicIp = usePublicIp;
            return o;
        }
    }
}
