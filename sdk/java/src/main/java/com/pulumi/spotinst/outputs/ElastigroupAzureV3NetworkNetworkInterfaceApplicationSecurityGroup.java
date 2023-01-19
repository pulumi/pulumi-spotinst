// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ElastigroupAzureV3NetworkNetworkInterfaceApplicationSecurityGroup {
    /**
     * @return Name of the Managed Service Identity.
     * 
     */
    private String name;
    /**
     * @return Name of the Azure Resource Group where the Managed Service Identity is located.
     * 
     */
    private String resourceGroupName;

    private ElastigroupAzureV3NetworkNetworkInterfaceApplicationSecurityGroup() {}
    /**
     * @return Name of the Managed Service Identity.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Name of the Azure Resource Group where the Managed Service Identity is located.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ElastigroupAzureV3NetworkNetworkInterfaceApplicationSecurityGroup defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private String resourceGroupName;
        public Builder() {}
        public Builder(ElastigroupAzureV3NetworkNetworkInterfaceApplicationSecurityGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public ElastigroupAzureV3NetworkNetworkInterfaceApplicationSecurityGroup build() {
            final var o = new ElastigroupAzureV3NetworkNetworkInterfaceApplicationSecurityGroup();
            o.name = name;
            o.resourceGroupName = resourceGroupName;
            return o;
        }
    }
}