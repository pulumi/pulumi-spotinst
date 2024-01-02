// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ElastigroupAzureV3ManagedServiceIdentity {
    private String name;
    private String resourceGroupName;

    private ElastigroupAzureV3ManagedServiceIdentity() {}
    public String name() {
        return this.name;
    }
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ElastigroupAzureV3ManagedServiceIdentity defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private String resourceGroupName;
        public Builder() {}
        public Builder(ElastigroupAzureV3ManagedServiceIdentity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("ElastigroupAzureV3ManagedServiceIdentity", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder resourceGroupName(String resourceGroupName) {
            if (resourceGroupName == null) {
              throw new MissingRequiredPropertyException("ElastigroupAzureV3ManagedServiceIdentity", "resourceGroupName");
            }
            this.resourceGroupName = resourceGroupName;
            return this;
        }
        public ElastigroupAzureV3ManagedServiceIdentity build() {
            final var _resultValue = new ElastigroupAzureV3ManagedServiceIdentity();
            _resultValue.name = name;
            _resultValue.resourceGroupName = resourceGroupName;
            return _resultValue;
        }
    }
}
