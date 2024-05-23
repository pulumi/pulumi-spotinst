// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.azure.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OceanNpLinuxOsConfigSysctl {
    /**
     * @return Maximum number of memory map areas a process may have. Can be configured only if OS type is Linux.
     * 
     */
    private @Nullable Integer vmMaxMapCount;

    private OceanNpLinuxOsConfigSysctl() {}
    /**
     * @return Maximum number of memory map areas a process may have. Can be configured only if OS type is Linux.
     * 
     */
    public Optional<Integer> vmMaxMapCount() {
        return Optional.ofNullable(this.vmMaxMapCount);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OceanNpLinuxOsConfigSysctl defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer vmMaxMapCount;
        public Builder() {}
        public Builder(OceanNpLinuxOsConfigSysctl defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.vmMaxMapCount = defaults.vmMaxMapCount;
        }

        @CustomType.Setter
        public Builder vmMaxMapCount(@Nullable Integer vmMaxMapCount) {

            this.vmMaxMapCount = vmMaxMapCount;
            return this;
        }
        public OceanNpLinuxOsConfigSysctl build() {
            final var _resultValue = new OceanNpLinuxOsConfigSysctl();
            _resultValue.vmMaxMapCount = vmMaxMapCount;
            return _resultValue;
        }
    }
}
