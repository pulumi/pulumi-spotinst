// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ElastigroupAzureV3NetworkNetworkInterfaceSecurityGroup {
    private @Nullable String name;
    private @Nullable String resourceGroupName;

    private ElastigroupAzureV3NetworkNetworkInterfaceSecurityGroup() {}
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    public Optional<String> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ElastigroupAzureV3NetworkNetworkInterfaceSecurityGroup defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String name;
        private @Nullable String resourceGroupName;
        public Builder() {}
        public Builder(ElastigroupAzureV3NetworkNetworkInterfaceSecurityGroup defaults) {
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
        public ElastigroupAzureV3NetworkNetworkInterfaceSecurityGroup build() {
            final var _resultValue = new ElastigroupAzureV3NetworkNetworkInterfaceSecurityGroup();
            _resultValue.name = name;
            _resultValue.resourceGroupName = resourceGroupName;
            return _resultValue;
        }
    }
}
