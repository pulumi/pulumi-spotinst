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
public final class ManagedInstanceNetworkInterface {
    private @Nullable Boolean associateIpv6Address;
    private @Nullable Boolean associatePublicIpAddress;
    private String deviceIndex;

    private ManagedInstanceNetworkInterface() {}
    public Optional<Boolean> associateIpv6Address() {
        return Optional.ofNullable(this.associateIpv6Address);
    }
    public Optional<Boolean> associatePublicIpAddress() {
        return Optional.ofNullable(this.associatePublicIpAddress);
    }
    public String deviceIndex() {
        return this.deviceIndex;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedInstanceNetworkInterface defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean associateIpv6Address;
        private @Nullable Boolean associatePublicIpAddress;
        private String deviceIndex;
        public Builder() {}
        public Builder(ManagedInstanceNetworkInterface defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.associateIpv6Address = defaults.associateIpv6Address;
    	      this.associatePublicIpAddress = defaults.associatePublicIpAddress;
    	      this.deviceIndex = defaults.deviceIndex;
        }

        @CustomType.Setter
        public Builder associateIpv6Address(@Nullable Boolean associateIpv6Address) {
            this.associateIpv6Address = associateIpv6Address;
            return this;
        }
        @CustomType.Setter
        public Builder associatePublicIpAddress(@Nullable Boolean associatePublicIpAddress) {
            this.associatePublicIpAddress = associatePublicIpAddress;
            return this;
        }
        @CustomType.Setter
        public Builder deviceIndex(String deviceIndex) {
            this.deviceIndex = Objects.requireNonNull(deviceIndex);
            return this;
        }
        public ManagedInstanceNetworkInterface build() {
            final var o = new ManagedInstanceNetworkInterface();
            o.associateIpv6Address = associateIpv6Address;
            o.associatePublicIpAddress = associatePublicIpAddress;
            o.deviceIndex = deviceIndex;
            return o;
        }
    }
}
