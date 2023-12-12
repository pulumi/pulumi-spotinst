// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.azure.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OceanVirtualNodeGroupLabel {
    /**
     * @return Tag Key for Vms in the cluster.
     * 
     */
    private String key;
    /**
     * @return Tag Value for VMs in the cluster.
     * 
     */
    private @Nullable String value;

    private OceanVirtualNodeGroupLabel() {}
    /**
     * @return Tag Key for Vms in the cluster.
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return Tag Value for VMs in the cluster.
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OceanVirtualNodeGroupLabel defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String key;
        private @Nullable String value;
        public Builder() {}
        public Builder(OceanVirtualNodeGroupLabel defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        @CustomType.Setter
        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }
        public OceanVirtualNodeGroupLabel build() {
            final var _resultValue = new OceanVirtualNodeGroupLabel();
            _resultValue.key = key;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
