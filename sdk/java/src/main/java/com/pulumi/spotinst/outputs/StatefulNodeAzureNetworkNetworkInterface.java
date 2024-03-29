// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.spotinst.outputs.StatefulNodeAzureNetworkNetworkInterfaceAdditionalIpConfiguration;
import com.pulumi.spotinst.outputs.StatefulNodeAzureNetworkNetworkInterfaceApplicationSecurityGroup;
import com.pulumi.spotinst.outputs.StatefulNodeAzureNetworkNetworkInterfaceNetworkSecurityGroup;
import com.pulumi.spotinst.outputs.StatefulNodeAzureNetworkNetworkInterfacePublicIp;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class StatefulNodeAzureNetworkNetworkInterface {
    private @Nullable List<StatefulNodeAzureNetworkNetworkInterfaceAdditionalIpConfiguration> additionalIpConfigurations;
    private @Nullable List<StatefulNodeAzureNetworkNetworkInterfaceApplicationSecurityGroup> applicationSecurityGroups;
    private @Nullable Boolean assignPublicIp;
    private @Nullable Boolean enableIpForwarding;
    private Boolean isPrimary;
    private @Nullable List<StatefulNodeAzureNetworkNetworkInterfaceNetworkSecurityGroup> networkSecurityGroups;
    private @Nullable List<String> privateIpAddresses;
    private @Nullable String publicIpSku;
    private @Nullable List<StatefulNodeAzureNetworkNetworkInterfacePublicIp> publicIps;
    private String subnetName;

    private StatefulNodeAzureNetworkNetworkInterface() {}
    public List<StatefulNodeAzureNetworkNetworkInterfaceAdditionalIpConfiguration> additionalIpConfigurations() {
        return this.additionalIpConfigurations == null ? List.of() : this.additionalIpConfigurations;
    }
    public List<StatefulNodeAzureNetworkNetworkInterfaceApplicationSecurityGroup> applicationSecurityGroups() {
        return this.applicationSecurityGroups == null ? List.of() : this.applicationSecurityGroups;
    }
    public Optional<Boolean> assignPublicIp() {
        return Optional.ofNullable(this.assignPublicIp);
    }
    public Optional<Boolean> enableIpForwarding() {
        return Optional.ofNullable(this.enableIpForwarding);
    }
    public Boolean isPrimary() {
        return this.isPrimary;
    }
    public List<StatefulNodeAzureNetworkNetworkInterfaceNetworkSecurityGroup> networkSecurityGroups() {
        return this.networkSecurityGroups == null ? List.of() : this.networkSecurityGroups;
    }
    public List<String> privateIpAddresses() {
        return this.privateIpAddresses == null ? List.of() : this.privateIpAddresses;
    }
    public Optional<String> publicIpSku() {
        return Optional.ofNullable(this.publicIpSku);
    }
    public List<StatefulNodeAzureNetworkNetworkInterfacePublicIp> publicIps() {
        return this.publicIps == null ? List.of() : this.publicIps;
    }
    public String subnetName() {
        return this.subnetName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StatefulNodeAzureNetworkNetworkInterface defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<StatefulNodeAzureNetworkNetworkInterfaceAdditionalIpConfiguration> additionalIpConfigurations;
        private @Nullable List<StatefulNodeAzureNetworkNetworkInterfaceApplicationSecurityGroup> applicationSecurityGroups;
        private @Nullable Boolean assignPublicIp;
        private @Nullable Boolean enableIpForwarding;
        private Boolean isPrimary;
        private @Nullable List<StatefulNodeAzureNetworkNetworkInterfaceNetworkSecurityGroup> networkSecurityGroups;
        private @Nullable List<String> privateIpAddresses;
        private @Nullable String publicIpSku;
        private @Nullable List<StatefulNodeAzureNetworkNetworkInterfacePublicIp> publicIps;
        private String subnetName;
        public Builder() {}
        public Builder(StatefulNodeAzureNetworkNetworkInterface defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalIpConfigurations = defaults.additionalIpConfigurations;
    	      this.applicationSecurityGroups = defaults.applicationSecurityGroups;
    	      this.assignPublicIp = defaults.assignPublicIp;
    	      this.enableIpForwarding = defaults.enableIpForwarding;
    	      this.isPrimary = defaults.isPrimary;
    	      this.networkSecurityGroups = defaults.networkSecurityGroups;
    	      this.privateIpAddresses = defaults.privateIpAddresses;
    	      this.publicIpSku = defaults.publicIpSku;
    	      this.publicIps = defaults.publicIps;
    	      this.subnetName = defaults.subnetName;
        }

        @CustomType.Setter
        public Builder additionalIpConfigurations(@Nullable List<StatefulNodeAzureNetworkNetworkInterfaceAdditionalIpConfiguration> additionalIpConfigurations) {

            this.additionalIpConfigurations = additionalIpConfigurations;
            return this;
        }
        public Builder additionalIpConfigurations(StatefulNodeAzureNetworkNetworkInterfaceAdditionalIpConfiguration... additionalIpConfigurations) {
            return additionalIpConfigurations(List.of(additionalIpConfigurations));
        }
        @CustomType.Setter
        public Builder applicationSecurityGroups(@Nullable List<StatefulNodeAzureNetworkNetworkInterfaceApplicationSecurityGroup> applicationSecurityGroups) {

            this.applicationSecurityGroups = applicationSecurityGroups;
            return this;
        }
        public Builder applicationSecurityGroups(StatefulNodeAzureNetworkNetworkInterfaceApplicationSecurityGroup... applicationSecurityGroups) {
            return applicationSecurityGroups(List.of(applicationSecurityGroups));
        }
        @CustomType.Setter
        public Builder assignPublicIp(@Nullable Boolean assignPublicIp) {

            this.assignPublicIp = assignPublicIp;
            return this;
        }
        @CustomType.Setter
        public Builder enableIpForwarding(@Nullable Boolean enableIpForwarding) {

            this.enableIpForwarding = enableIpForwarding;
            return this;
        }
        @CustomType.Setter
        public Builder isPrimary(Boolean isPrimary) {
            if (isPrimary == null) {
              throw new MissingRequiredPropertyException("StatefulNodeAzureNetworkNetworkInterface", "isPrimary");
            }
            this.isPrimary = isPrimary;
            return this;
        }
        @CustomType.Setter
        public Builder networkSecurityGroups(@Nullable List<StatefulNodeAzureNetworkNetworkInterfaceNetworkSecurityGroup> networkSecurityGroups) {

            this.networkSecurityGroups = networkSecurityGroups;
            return this;
        }
        public Builder networkSecurityGroups(StatefulNodeAzureNetworkNetworkInterfaceNetworkSecurityGroup... networkSecurityGroups) {
            return networkSecurityGroups(List.of(networkSecurityGroups));
        }
        @CustomType.Setter
        public Builder privateIpAddresses(@Nullable List<String> privateIpAddresses) {

            this.privateIpAddresses = privateIpAddresses;
            return this;
        }
        public Builder privateIpAddresses(String... privateIpAddresses) {
            return privateIpAddresses(List.of(privateIpAddresses));
        }
        @CustomType.Setter
        public Builder publicIpSku(@Nullable String publicIpSku) {

            this.publicIpSku = publicIpSku;
            return this;
        }
        @CustomType.Setter
        public Builder publicIps(@Nullable List<StatefulNodeAzureNetworkNetworkInterfacePublicIp> publicIps) {

            this.publicIps = publicIps;
            return this;
        }
        public Builder publicIps(StatefulNodeAzureNetworkNetworkInterfacePublicIp... publicIps) {
            return publicIps(List.of(publicIps));
        }
        @CustomType.Setter
        public Builder subnetName(String subnetName) {
            if (subnetName == null) {
              throw new MissingRequiredPropertyException("StatefulNodeAzureNetworkNetworkInterface", "subnetName");
            }
            this.subnetName = subnetName;
            return this;
        }
        public StatefulNodeAzureNetworkNetworkInterface build() {
            final var _resultValue = new StatefulNodeAzureNetworkNetworkInterface();
            _resultValue.additionalIpConfigurations = additionalIpConfigurations;
            _resultValue.applicationSecurityGroups = applicationSecurityGroups;
            _resultValue.assignPublicIp = assignPublicIp;
            _resultValue.enableIpForwarding = enableIpForwarding;
            _resultValue.isPrimary = isPrimary;
            _resultValue.networkSecurityGroups = networkSecurityGroups;
            _resultValue.privateIpAddresses = privateIpAddresses;
            _resultValue.publicIpSku = publicIpSku;
            _resultValue.publicIps = publicIps;
            _resultValue.subnetName = subnetName;
            return _resultValue;
        }
    }
}
