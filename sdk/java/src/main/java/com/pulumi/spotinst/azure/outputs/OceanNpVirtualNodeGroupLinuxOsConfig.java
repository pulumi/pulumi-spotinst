// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.azure.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.spotinst.azure.outputs.OceanNpVirtualNodeGroupLinuxOsConfigSysctl;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class OceanNpVirtualNodeGroupLinuxOsConfig {
    /**
     * @return System Controls
     * 
     */
    private @Nullable List<OceanNpVirtualNodeGroupLinuxOsConfigSysctl> sysctls;

    private OceanNpVirtualNodeGroupLinuxOsConfig() {}
    /**
     * @return System Controls
     * 
     */
    public List<OceanNpVirtualNodeGroupLinuxOsConfigSysctl> sysctls() {
        return this.sysctls == null ? List.of() : this.sysctls;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OceanNpVirtualNodeGroupLinuxOsConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<OceanNpVirtualNodeGroupLinuxOsConfigSysctl> sysctls;
        public Builder() {}
        public Builder(OceanNpVirtualNodeGroupLinuxOsConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sysctls = defaults.sysctls;
        }

        @CustomType.Setter
        public Builder sysctls(@Nullable List<OceanNpVirtualNodeGroupLinuxOsConfigSysctl> sysctls) {

            this.sysctls = sysctls;
            return this;
        }
        public Builder sysctls(OceanNpVirtualNodeGroupLinuxOsConfigSysctl... sysctls) {
            return sysctls(List.of(sysctls));
        }
        public OceanNpVirtualNodeGroupLinuxOsConfig build() {
            final var _resultValue = new OceanNpVirtualNodeGroupLinuxOsConfig();
            _resultValue.sysctls = sysctls;
            return _resultValue;
        }
    }
}
