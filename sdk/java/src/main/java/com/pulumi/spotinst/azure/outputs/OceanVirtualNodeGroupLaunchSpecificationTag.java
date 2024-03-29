// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.azure.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OceanVirtualNodeGroupLaunchSpecificationTag {
    /**
     * @return Tag Key for Vms in the cluster.
     * 
     */
    private @Nullable String key;
    /**
     * @return Tag Value for VMs in the cluster.
     * 
     */
    private @Nullable String value;

    private OceanVirtualNodeGroupLaunchSpecificationTag() {}
    /**
     * @return Tag Key for Vms in the cluster.
     * 
     */
    public Optional<String> key() {
        return Optional.ofNullable(this.key);
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

    public static Builder builder(OceanVirtualNodeGroupLaunchSpecificationTag defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String key;
        private @Nullable String value;
        public Builder() {}
        public Builder(OceanVirtualNodeGroupLaunchSpecificationTag defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder key(@Nullable String key) {

            this.key = key;
            return this;
        }
        @CustomType.Setter
        public Builder value(@Nullable String value) {

            this.value = value;
            return this;
        }
        public OceanVirtualNodeGroupLaunchSpecificationTag build() {
            final var _resultValue = new OceanVirtualNodeGroupLaunchSpecificationTag();
            _resultValue.key = key;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
