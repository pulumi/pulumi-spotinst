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
public final class ElastigroupNetworkInterface {
    /**
     * @return Indicates whether to assign IPV6 addresses to your instance. Requires a subnet with IPV6 CIDR block ranges.
     * 
     */
    private @Nullable Boolean associateIpv6Address;
    /**
     * @return Indicates whether to assign a public IP address to an instance you launch in a VPC. The public IP address can only be assigned to a network interface for eth0, and can only be assigned to a new network interface, not an existing one.
     * 
     */
    private @Nullable Boolean associatePublicIpAddress;
    /**
     * @return If set to true, the interface is deleted when the instance is terminated.
     * 
     */
    private @Nullable Boolean deleteOnTermination;
    /**
     * @return The description of the network interface.
     * 
     */
    private @Nullable String description;
    /**
     * @return The index of the device on the instance for the network interface attachment.
     * 
     */
    private String deviceIndex;
    /**
     * @return The ID of the network interface.
     * 
     */
    private @Nullable String networkInterfaceId;
    /**
     * @return The private IP address of the network interface.
     * 
     */
    private @Nullable String privateIpAddress;
    /**
     * @return The number of secondary private IP addresses.
     * 
     */
    private @Nullable String secondaryPrivateIpAddressCount;

    private ElastigroupNetworkInterface() {}
    /**
     * @return Indicates whether to assign IPV6 addresses to your instance. Requires a subnet with IPV6 CIDR block ranges.
     * 
     */
    public Optional<Boolean> associateIpv6Address() {
        return Optional.ofNullable(this.associateIpv6Address);
    }
    /**
     * @return Indicates whether to assign a public IP address to an instance you launch in a VPC. The public IP address can only be assigned to a network interface for eth0, and can only be assigned to a new network interface, not an existing one.
     * 
     */
    public Optional<Boolean> associatePublicIpAddress() {
        return Optional.ofNullable(this.associatePublicIpAddress);
    }
    /**
     * @return If set to true, the interface is deleted when the instance is terminated.
     * 
     */
    public Optional<Boolean> deleteOnTermination() {
        return Optional.ofNullable(this.deleteOnTermination);
    }
    /**
     * @return The description of the network interface.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return The index of the device on the instance for the network interface attachment.
     * 
     */
    public String deviceIndex() {
        return this.deviceIndex;
    }
    /**
     * @return The ID of the network interface.
     * 
     */
    public Optional<String> networkInterfaceId() {
        return Optional.ofNullable(this.networkInterfaceId);
    }
    /**
     * @return The private IP address of the network interface.
     * 
     */
    public Optional<String> privateIpAddress() {
        return Optional.ofNullable(this.privateIpAddress);
    }
    /**
     * @return The number of secondary private IP addresses.
     * 
     */
    public Optional<String> secondaryPrivateIpAddressCount() {
        return Optional.ofNullable(this.secondaryPrivateIpAddressCount);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ElastigroupNetworkInterface defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean associateIpv6Address;
        private @Nullable Boolean associatePublicIpAddress;
        private @Nullable Boolean deleteOnTermination;
        private @Nullable String description;
        private String deviceIndex;
        private @Nullable String networkInterfaceId;
        private @Nullable String privateIpAddress;
        private @Nullable String secondaryPrivateIpAddressCount;
        public Builder() {}
        public Builder(ElastigroupNetworkInterface defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.associateIpv6Address = defaults.associateIpv6Address;
    	      this.associatePublicIpAddress = defaults.associatePublicIpAddress;
    	      this.deleteOnTermination = defaults.deleteOnTermination;
    	      this.description = defaults.description;
    	      this.deviceIndex = defaults.deviceIndex;
    	      this.networkInterfaceId = defaults.networkInterfaceId;
    	      this.privateIpAddress = defaults.privateIpAddress;
    	      this.secondaryPrivateIpAddressCount = defaults.secondaryPrivateIpAddressCount;
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
        public Builder deleteOnTermination(@Nullable Boolean deleteOnTermination) {
            this.deleteOnTermination = deleteOnTermination;
            return this;
        }
        @CustomType.Setter
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder deviceIndex(String deviceIndex) {
            this.deviceIndex = Objects.requireNonNull(deviceIndex);
            return this;
        }
        @CustomType.Setter
        public Builder networkInterfaceId(@Nullable String networkInterfaceId) {
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }
        @CustomType.Setter
        public Builder privateIpAddress(@Nullable String privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }
        @CustomType.Setter
        public Builder secondaryPrivateIpAddressCount(@Nullable String secondaryPrivateIpAddressCount) {
            this.secondaryPrivateIpAddressCount = secondaryPrivateIpAddressCount;
            return this;
        }
        public ElastigroupNetworkInterface build() {
            final var o = new ElastigroupNetworkInterface();
            o.associateIpv6Address = associateIpv6Address;
            o.associatePublicIpAddress = associatePublicIpAddress;
            o.deleteOnTermination = deleteOnTermination;
            o.description = description;
            o.deviceIndex = deviceIndex;
            o.networkInterfaceId = networkInterfaceId;
            o.privateIpAddress = privateIpAddress;
            o.secondaryPrivateIpAddressCount = secondaryPrivateIpAddressCount;
            return o;
        }
    }
}
