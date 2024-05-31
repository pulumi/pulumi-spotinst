// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.azure.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class OceanManagedServiceIdentity {
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

    private OceanManagedServiceIdentity() {}
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
            if (name == null) {
              throw new MissingRequiredPropertyException("OceanManagedServiceIdentity", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder resourceGroupName(String resourceGroupName) {
            if (resourceGroupName == null) {
              throw new MissingRequiredPropertyException("OceanManagedServiceIdentity", "resourceGroupName");
            }
            this.resourceGroupName = resourceGroupName;
            return this;
        }
        public OceanManagedServiceIdentity build() {
            final var _resultValue = new OceanManagedServiceIdentity();
            _resultValue.name = name;
            _resultValue.resourceGroupName = resourceGroupName;
            return _resultValue;
        }
    }
}