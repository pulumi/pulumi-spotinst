// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.azure.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OceanNetworkNetworkInterfaceSecurityGroup {
    /**
     * @return Name of the Load Balancer.
     * 
     */
    private @Nullable String name;
    /**
     * @return The Resource Group name of the Load Balancer.
     * 
     */
    private @Nullable String resourceGroupName;

    private OceanNetworkNetworkInterfaceSecurityGroup() {}
    /**
     * @return Name of the Load Balancer.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return The Resource Group name of the Load Balancer.
     * 
     */
    public Optional<String> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OceanNetworkNetworkInterfaceSecurityGroup defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String name;
        private @Nullable String resourceGroupName;
        public Builder() {}
        public Builder(OceanNetworkNetworkInterfaceSecurityGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder resourceGroupName(@Nullable String resourceGroupName) {
            this.resourceGroupName = resourceGroupName;
            return this;
        }
        public OceanNetworkNetworkInterfaceSecurityGroup build() {
            final var _resultValue = new OceanNetworkNetworkInterfaceSecurityGroup();
            _resultValue.name = name;
            _resultValue.resourceGroupName = resourceGroupName;
            return _resultValue;
        }
    }
}
