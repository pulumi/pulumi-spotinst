// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.azure.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class OceanManagedServiceIdentity {
    /**
     * @return Name of the Load Balancer.
     * 
     */
    private String name;
    /**
     * @return The Resource Group name of the Load Balancer.
     * 
     */
    private String resourceGroupName;

    private OceanManagedServiceIdentity() {}
    /**
     * @return Name of the Load Balancer.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The Resource Group name of the Load Balancer.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OceanManagedServiceIdentity defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private String resourceGroupName;
        public Builder() {}
        public Builder(OceanManagedServiceIdentity defaults) {
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
        public OceanManagedServiceIdentity build() {
            final var o = new OceanManagedServiceIdentity();
            o.name = name;
            o.resourceGroupName = resourceGroupName;
            return o;
        }
    }
}
