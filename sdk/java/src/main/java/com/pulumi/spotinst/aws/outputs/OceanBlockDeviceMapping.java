// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.spotinst.aws.outputs.OceanBlockDeviceMappingEbs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OceanBlockDeviceMapping {
    /**
     * @return String. Set device name. (Example: `/dev/xvda`).
     * 
     */
    private @Nullable String deviceName;
    /**
     * @return Object. Set Elastic Block Store properties .
     * 
     */
    private @Nullable OceanBlockDeviceMappingEbs ebs;

    private OceanBlockDeviceMapping() {}
    /**
     * @return String. Set device name. (Example: `/dev/xvda`).
     * 
     */
    public Optional<String> deviceName() {
        return Optional.ofNullable(this.deviceName);
    }
    /**
     * @return Object. Set Elastic Block Store properties .
     * 
     */
    public Optional<OceanBlockDeviceMappingEbs> ebs() {
        return Optional.ofNullable(this.ebs);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OceanBlockDeviceMapping defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String deviceName;
        private @Nullable OceanBlockDeviceMappingEbs ebs;
        public Builder() {}
        public Builder(OceanBlockDeviceMapping defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceName = defaults.deviceName;
    	      this.ebs = defaults.ebs;
        }

        @CustomType.Setter
        public Builder deviceName(@Nullable String deviceName) {

            this.deviceName = deviceName;
            return this;
        }
        @CustomType.Setter
        public Builder ebs(@Nullable OceanBlockDeviceMappingEbs ebs) {

            this.ebs = ebs;
            return this;
        }
        public OceanBlockDeviceMapping build() {
            final var _resultValue = new OceanBlockDeviceMapping();
            _resultValue.deviceName = deviceName;
            _resultValue.ebs = ebs;
            return _resultValue;
        }
    }
}
