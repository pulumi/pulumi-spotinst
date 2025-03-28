// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.spark.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OceanWorkspacesStorageDefaults {
    /**
     * @return - The name of the default storage class to use for new workspaces. If not specified, the default storage class of the Kubernetes cluster will be used.
     * 
     */
    private @Nullable String storageClassName;

    private OceanWorkspacesStorageDefaults() {}
    /**
     * @return - The name of the default storage class to use for new workspaces. If not specified, the default storage class of the Kubernetes cluster will be used.
     * 
     */
    public Optional<String> storageClassName() {
        return Optional.ofNullable(this.storageClassName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OceanWorkspacesStorageDefaults defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String storageClassName;
        public Builder() {}
        public Builder(OceanWorkspacesStorageDefaults defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.storageClassName = defaults.storageClassName;
        }

        @CustomType.Setter
        public Builder storageClassName(@Nullable String storageClassName) {

            this.storageClassName = storageClassName;
            return this;
        }
        public OceanWorkspacesStorageDefaults build() {
            final var _resultValue = new OceanWorkspacesStorageDefaults();
            _resultValue.storageClassName = storageClassName;
            return _resultValue;
        }
    }
}
