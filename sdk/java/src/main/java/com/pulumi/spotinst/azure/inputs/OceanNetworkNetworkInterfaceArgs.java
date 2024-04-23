// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.azure.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.spotinst.azure.inputs.OceanNetworkNetworkInterfaceAdditionalIpConfigArgs;
import com.pulumi.spotinst.azure.inputs.OceanNetworkNetworkInterfaceSecurityGroupArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OceanNetworkNetworkInterfaceArgs extends com.pulumi.resources.ResourceArgs {

    public static final OceanNetworkNetworkInterfaceArgs Empty = new OceanNetworkNetworkInterfaceArgs();

    @Import(name="additionalIpConfigs")
    private @Nullable Output<List<OceanNetworkNetworkInterfaceAdditionalIpConfigArgs>> additionalIpConfigs;

    public Optional<Output<List<OceanNetworkNetworkInterfaceAdditionalIpConfigArgs>>> additionalIpConfigs() {
        return Optional.ofNullable(this.additionalIpConfigs);
    }

    @Import(name="assignPublicIp")
    private @Nullable Output<Boolean> assignPublicIp;

    public Optional<Output<Boolean>> assignPublicIp() {
        return Optional.ofNullable(this.assignPublicIp);
    }

    @Import(name="isPrimary")
    private @Nullable Output<Boolean> isPrimary;

    public Optional<Output<Boolean>> isPrimary() {
        return Optional.ofNullable(this.isPrimary);
    }

    @Import(name="securityGroup")
    private @Nullable Output<OceanNetworkNetworkInterfaceSecurityGroupArgs> securityGroup;

    public Optional<Output<OceanNetworkNetworkInterfaceSecurityGroupArgs>> securityGroup() {
        return Optional.ofNullable(this.securityGroup);
    }

    @Import(name="subnetName")
    private @Nullable Output<String> subnetName;

    public Optional<Output<String>> subnetName() {
        return Optional.ofNullable(this.subnetName);
    }

    private OceanNetworkNetworkInterfaceArgs() {}

    private OceanNetworkNetworkInterfaceArgs(OceanNetworkNetworkInterfaceArgs $) {
        this.additionalIpConfigs = $.additionalIpConfigs;
        this.assignPublicIp = $.assignPublicIp;
        this.isPrimary = $.isPrimary;
        this.securityGroup = $.securityGroup;
        this.subnetName = $.subnetName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OceanNetworkNetworkInterfaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OceanNetworkNetworkInterfaceArgs $;

        public Builder() {
            $ = new OceanNetworkNetworkInterfaceArgs();
        }

        public Builder(OceanNetworkNetworkInterfaceArgs defaults) {
            $ = new OceanNetworkNetworkInterfaceArgs(Objects.requireNonNull(defaults));
        }

        public Builder additionalIpConfigs(@Nullable Output<List<OceanNetworkNetworkInterfaceAdditionalIpConfigArgs>> additionalIpConfigs) {
            $.additionalIpConfigs = additionalIpConfigs;
            return this;
        }

        public Builder additionalIpConfigs(List<OceanNetworkNetworkInterfaceAdditionalIpConfigArgs> additionalIpConfigs) {
            return additionalIpConfigs(Output.of(additionalIpConfigs));
        }

        public Builder additionalIpConfigs(OceanNetworkNetworkInterfaceAdditionalIpConfigArgs... additionalIpConfigs) {
            return additionalIpConfigs(List.of(additionalIpConfigs));
        }

        public Builder assignPublicIp(@Nullable Output<Boolean> assignPublicIp) {
            $.assignPublicIp = assignPublicIp;
            return this;
        }

        public Builder assignPublicIp(Boolean assignPublicIp) {
            return assignPublicIp(Output.of(assignPublicIp));
        }

        public Builder isPrimary(@Nullable Output<Boolean> isPrimary) {
            $.isPrimary = isPrimary;
            return this;
        }

        public Builder isPrimary(Boolean isPrimary) {
            return isPrimary(Output.of(isPrimary));
        }

        public Builder securityGroup(@Nullable Output<OceanNetworkNetworkInterfaceSecurityGroupArgs> securityGroup) {
            $.securityGroup = securityGroup;
            return this;
        }

        public Builder securityGroup(OceanNetworkNetworkInterfaceSecurityGroupArgs securityGroup) {
            return securityGroup(Output.of(securityGroup));
        }

        public Builder subnetName(@Nullable Output<String> subnetName) {
            $.subnetName = subnetName;
            return this;
        }

        public Builder subnetName(String subnetName) {
            return subnetName(Output.of(subnetName));
        }

        public OceanNetworkNetworkInterfaceArgs build() {
            return $;
        }
    }

}
