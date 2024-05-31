// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.spotinst.outputs.ElastigroupAzureV3NetworkNetworkInterfaceAdditionalIpConfig;
import com.pulumi.spotinst.outputs.ElastigroupAzureV3NetworkNetworkInterfaceApplicationSecurityGroup;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ElastigroupAzureV3NetworkNetworkInterface {
    private @Nullable List<ElastigroupAzureV3NetworkNetworkInterfaceAdditionalIpConfig> additionalIpConfigs;
    private @Nullable List<ElastigroupAzureV3NetworkNetworkInterfaceApplicationSecurityGroup> applicationSecurityGroups;
    private Boolean assignPublicIp;
    private Boolean isPrimary;
    private String subnetName;

    private ElastigroupAzureV3NetworkNetworkInterface() {}
    public List<ElastigroupAzureV3NetworkNetworkInterfaceAdditionalIpConfig> additionalIpConfigs() {
        return this.additionalIpConfigs == null ? List.of() : this.additionalIpConfigs;
    }
    public List<ElastigroupAzureV3NetworkNetworkInterfaceApplicationSecurityGroup> applicationSecurityGroups() {
        return this.applicationSecurityGroups == null ? List.of() : this.applicationSecurityGroups;
    }
    public Boolean assignPublicIp() {
        return this.assignPublicIp;
    }
    public Boolean isPrimary() {
        return this.isPrimary;
    }
    public String subnetName() {
        return this.subnetName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ElastigroupAzureV3NetworkNetworkInterface defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<ElastigroupAzureV3NetworkNetworkInterfaceAdditionalIpConfig> additionalIpConfigs;
        private @Nullable List<ElastigroupAzureV3NetworkNetworkInterfaceApplicationSecurityGroup> applicationSecurityGroups;
        private Boolean assignPublicIp;
        private Boolean isPrimary;
        private String subnetName;
        public Builder() {}
        public Builder(ElastigroupAzureV3NetworkNetworkInterface defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalIpConfigs = defaults.additionalIpConfigs;
    	      this.applicationSecurityGroups = defaults.applicationSecurityGroups;
    	      this.assignPublicIp = defaults.assignPublicIp;
    	      this.isPrimary = defaults.isPrimary;
    	      this.subnetName = defaults.subnetName;
        }

        @CustomType.Setter
        public Builder additionalIpConfigs(@Nullable List<ElastigroupAzureV3NetworkNetworkInterfaceAdditionalIpConfig> additionalIpConfigs) {

            this.additionalIpConfigs = additionalIpConfigs;
            return this;
        }
        public Builder additionalIpConfigs(ElastigroupAzureV3NetworkNetworkInterfaceAdditionalIpConfig... additionalIpConfigs) {
            return additionalIpConfigs(List.of(additionalIpConfigs));
        }
        @CustomType.Setter
        public Builder applicationSecurityGroups(@Nullable List<ElastigroupAzureV3NetworkNetworkInterfaceApplicationSecurityGroup> applicationSecurityGroups) {

            this.applicationSecurityGroups = applicationSecurityGroups;
            return this;
        }
        public Builder applicationSecurityGroups(ElastigroupAzureV3NetworkNetworkInterfaceApplicationSecurityGroup... applicationSecurityGroups) {
            return applicationSecurityGroups(List.of(applicationSecurityGroups));
        }
        @CustomType.Setter
        public Builder assignPublicIp(Boolean assignPublicIp) {
            if (assignPublicIp == null) {
              throw new MissingRequiredPropertyException("ElastigroupAzureV3NetworkNetworkInterface", "assignPublicIp");
            }
            this.assignPublicIp = assignPublicIp;
            return this;
        }
        @CustomType.Setter
        public Builder isPrimary(Boolean isPrimary) {
            if (isPrimary == null) {
              throw new MissingRequiredPropertyException("ElastigroupAzureV3NetworkNetworkInterface", "isPrimary");
            }
            this.isPrimary = isPrimary;
            return this;
        }
        @CustomType.Setter
        public Builder subnetName(String subnetName) {
            if (subnetName == null) {
              throw new MissingRequiredPropertyException("ElastigroupAzureV3NetworkNetworkInterface", "subnetName");
            }
            this.subnetName = subnetName;
            return this;
        }
        public ElastigroupAzureV3NetworkNetworkInterface build() {
            final var _resultValue = new ElastigroupAzureV3NetworkNetworkInterface();
            _resultValue.additionalIpConfigs = additionalIpConfigs;
            _resultValue.applicationSecurityGroups = applicationSecurityGroups;
            _resultValue.assignPublicIp = assignPublicIp;
            _resultValue.isPrimary = isPrimary;
            _resultValue.subnetName = subnetName;
            return _resultValue;
        }
    }
}