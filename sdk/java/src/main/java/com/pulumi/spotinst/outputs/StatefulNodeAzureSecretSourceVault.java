// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class StatefulNodeAzureSecretSourceVault {
    private String name;
    private String resourceGroupName;

    private StatefulNodeAzureSecretSourceVault() {}
    public String name() {
        return this.name;
    }
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StatefulNodeAzureSecretSourceVault defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private String resourceGroupName;
        public Builder() {}
        public Builder(StatefulNodeAzureSecretSourceVault defaults) {
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
        public StatefulNodeAzureSecretSourceVault build() {
            final var o = new StatefulNodeAzureSecretSourceVault();
            o.name = name;
            o.resourceGroupName = resourceGroupName;
            return o;
        }
    }
}
