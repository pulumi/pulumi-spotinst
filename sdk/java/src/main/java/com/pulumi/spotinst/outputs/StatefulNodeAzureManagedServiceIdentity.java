// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class StatefulNodeAzureManagedServiceIdentity {
    private String name;
    private String resourceGroupName;

    private StatefulNodeAzureManagedServiceIdentity() {}
    public String name() {
        return this.name;
    }
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StatefulNodeAzureManagedServiceIdentity defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private String resourceGroupName;
        public Builder() {}
        public Builder(StatefulNodeAzureManagedServiceIdentity defaults) {
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
        public StatefulNodeAzureManagedServiceIdentity build() {
            final var _resultValue = new StatefulNodeAzureManagedServiceIdentity();
            _resultValue.name = name;
            _resultValue.resourceGroupName = resourceGroupName;
            return _resultValue;
        }
    }
}
