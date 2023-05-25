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


public final class ManagedInstanceNetworkInterfaceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagedInstanceNetworkInterfaceArgs Empty = new ManagedInstanceNetworkInterfaceArgs();

    @Import(name="associateIpv6Address")
    private @Nullable Output<Boolean> associateIpv6Address;

    public Optional<Output<Boolean>> associateIpv6Address() {
        return Optional.ofNullable(this.associateIpv6Address);
    }

    @Import(name="associatePublicIpAddress")
    private @Nullable Output<Boolean> associatePublicIpAddress;

    public Optional<Output<Boolean>> associatePublicIpAddress() {
        return Optional.ofNullable(this.associatePublicIpAddress);
    }

    @Import(name="deviceIndex", required=true)
    private Output<String> deviceIndex;

    public Output<String> deviceIndex() {
        return this.deviceIndex;
    }

    private ManagedInstanceNetworkInterfaceArgs() {}

    private ManagedInstanceNetworkInterfaceArgs(ManagedInstanceNetworkInterfaceArgs $) {
        this.associateIpv6Address = $.associateIpv6Address;
        this.associatePublicIpAddress = $.associatePublicIpAddress;
        this.deviceIndex = $.deviceIndex;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedInstanceNetworkInterfaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedInstanceNetworkInterfaceArgs $;

        public Builder() {
            $ = new ManagedInstanceNetworkInterfaceArgs();
        }

        public Builder(ManagedInstanceNetworkInterfaceArgs defaults) {
            $ = new ManagedInstanceNetworkInterfaceArgs(Objects.requireNonNull(defaults));
        }

        public Builder associateIpv6Address(@Nullable Output<Boolean> associateIpv6Address) {
            $.associateIpv6Address = associateIpv6Address;
            return this;
        }

        public Builder associateIpv6Address(Boolean associateIpv6Address) {
            return associateIpv6Address(Output.of(associateIpv6Address));
        }

        public Builder associatePublicIpAddress(@Nullable Output<Boolean> associatePublicIpAddress) {
            $.associatePublicIpAddress = associatePublicIpAddress;
            return this;
        }

        public Builder associatePublicIpAddress(Boolean associatePublicIpAddress) {
            return associatePublicIpAddress(Output.of(associatePublicIpAddress));
        }

        public Builder deviceIndex(Output<String> deviceIndex) {
            $.deviceIndex = deviceIndex;
            return this;
        }

        public Builder deviceIndex(String deviceIndex) {
            return deviceIndex(Output.of(deviceIndex));
        }

        public ManagedInstanceNetworkInterfaceArgs build() {
            $.deviceIndex = Objects.requireNonNull($.deviceIndex, "expected parameter 'deviceIndex' to be non-null");
            return $;
        }
    }

}
