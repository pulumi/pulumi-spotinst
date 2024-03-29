// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.azure.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.spotinst.azure.outputs.OceanNetworkNetworkInterfaceAdditionalIpConfig;
import com.pulumi.spotinst.azure.outputs.OceanNetworkNetworkInterfaceSecurityGroup;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OceanNetworkNetworkInterface {
    /**
     * @return Additional configuration of network interface. The name fields between all the `additional_ip_config` must be unique.
     * 
     */
    private @Nullable List<OceanNetworkNetworkInterfaceAdditionalIpConfig> additionalIpConfigs;
    /**
     * @return Assign public IP.
     * 
     */
    private @Nullable Boolean assignPublicIp;
    /**
     * @return Defines whether the network interface is primary or not.
     * 
     */
    private @Nullable Boolean isPrimary;
    private @Nullable OceanNetworkNetworkInterfaceSecurityGroup securityGroup;
    /**
     * @return Subnet name.
     * 
     */
    private @Nullable String subnetName;

    private OceanNetworkNetworkInterface() {}
    /**
     * @return Additional configuration of network interface. The name fields between all the `additional_ip_config` must be unique.
     * 
     */
    public List<OceanNetworkNetworkInterfaceAdditionalIpConfig> additionalIpConfigs() {
        return this.additionalIpConfigs == null ? List.of() : this.additionalIpConfigs;
    }
    /**
     * @return Assign public IP.
     * 
     */
    public Optional<Boolean> assignPublicIp() {
        return Optional.ofNullable(this.assignPublicIp);
    }
    /**
     * @return Defines whether the network interface is primary or not.
     * 
     */
    public Optional<Boolean> isPrimary() {
        return Optional.ofNullable(this.isPrimary);
    }
    public Optional<OceanNetworkNetworkInterfaceSecurityGroup> securityGroup() {
        return Optional.ofNullable(this.securityGroup);
    }
    /**
     * @return Subnet name.
     * 
     */
    public Optional<String> subnetName() {
        return Optional.ofNullable(this.subnetName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OceanNetworkNetworkInterface defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<OceanNetworkNetworkInterfaceAdditionalIpConfig> additionalIpConfigs;
        private @Nullable Boolean assignPublicIp;
        private @Nullable Boolean isPrimary;
        private @Nullable OceanNetworkNetworkInterfaceSecurityGroup securityGroup;
        private @Nullable String subnetName;
        public Builder() {}
        public Builder(OceanNetworkNetworkInterface defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalIpConfigs = defaults.additionalIpConfigs;
    	      this.assignPublicIp = defaults.assignPublicIp;
    	      this.isPrimary = defaults.isPrimary;
    	      this.securityGroup = defaults.securityGroup;
    	      this.subnetName = defaults.subnetName;
        }

        @CustomType.Setter
        public Builder additionalIpConfigs(@Nullable List<OceanNetworkNetworkInterfaceAdditionalIpConfig> additionalIpConfigs) {

            this.additionalIpConfigs = additionalIpConfigs;
            return this;
        }
        public Builder additionalIpConfigs(OceanNetworkNetworkInterfaceAdditionalIpConfig... additionalIpConfigs) {
            return additionalIpConfigs(List.of(additionalIpConfigs));
        }
        @CustomType.Setter
        public Builder assignPublicIp(@Nullable Boolean assignPublicIp) {

            this.assignPublicIp = assignPublicIp;
            return this;
        }
        @CustomType.Setter
        public Builder isPrimary(@Nullable Boolean isPrimary) {

            this.isPrimary = isPrimary;
            return this;
        }
        @CustomType.Setter
        public Builder securityGroup(@Nullable OceanNetworkNetworkInterfaceSecurityGroup securityGroup) {

            this.securityGroup = securityGroup;
            return this;
        }
        @CustomType.Setter
        public Builder subnetName(@Nullable String subnetName) {

            this.subnetName = subnetName;
            return this;
        }
        public OceanNetworkNetworkInterface build() {
            final var _resultValue = new OceanNetworkNetworkInterface();
            _resultValue.additionalIpConfigs = additionalIpConfigs;
            _resultValue.assignPublicIp = assignPublicIp;
            _resultValue.isPrimary = isPrimary;
            _resultValue.securityGroup = securityGroup;
            _resultValue.subnetName = subnetName;
            return _resultValue;
        }
    }
}
