// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.spotinst.outputs.ElastigroupAzureV3NetworkNetworkInterface;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ElastigroupAzureV3Network {
    private List<ElastigroupAzureV3NetworkNetworkInterface> networkInterfaces;
    private String resourceGroupName;
    private String virtualNetworkName;

    private ElastigroupAzureV3Network() {}
    public List<ElastigroupAzureV3NetworkNetworkInterface> networkInterfaces() {
        return this.networkInterfaces;
    }
    public String resourceGroupName() {
        return this.resourceGroupName;
    }
    public String virtualNetworkName() {
        return this.virtualNetworkName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ElastigroupAzureV3Network defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<ElastigroupAzureV3NetworkNetworkInterface> networkInterfaces;
        private String resourceGroupName;
        private String virtualNetworkName;
        public Builder() {}
        public Builder(ElastigroupAzureV3Network defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.networkInterfaces = defaults.networkInterfaces;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.virtualNetworkName = defaults.virtualNetworkName;
        }

        @CustomType.Setter
        public Builder networkInterfaces(List<ElastigroupAzureV3NetworkNetworkInterface> networkInterfaces) {
            if (networkInterfaces == null) {
              throw new MissingRequiredPropertyException("ElastigroupAzureV3Network", "networkInterfaces");
            }
            this.networkInterfaces = networkInterfaces;
            return this;
        }
        public Builder networkInterfaces(ElastigroupAzureV3NetworkNetworkInterface... networkInterfaces) {
            return networkInterfaces(List.of(networkInterfaces));
        }
        @CustomType.Setter
        public Builder resourceGroupName(String resourceGroupName) {
            if (resourceGroupName == null) {
              throw new MissingRequiredPropertyException("ElastigroupAzureV3Network", "resourceGroupName");
            }
            this.resourceGroupName = resourceGroupName;
            return this;
        }
        @CustomType.Setter
        public Builder virtualNetworkName(String virtualNetworkName) {
            if (virtualNetworkName == null) {
              throw new MissingRequiredPropertyException("ElastigroupAzureV3Network", "virtualNetworkName");
            }
            this.virtualNetworkName = virtualNetworkName;
            return this;
        }
        public ElastigroupAzureV3Network build() {
            final var _resultValue = new ElastigroupAzureV3Network();
            _resultValue.networkInterfaces = networkInterfaces;
            _resultValue.resourceGroupName = resourceGroupName;
            _resultValue.virtualNetworkName = virtualNetworkName;
            return _resultValue;
        }
    }
}
