// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.ecs.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.spotinst.ecs.outputs.OceanBlockDeviceMappingEbs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OceanBlockDeviceMapping {
    /**
     * @return String. Set device name. Example: `/dev/xvda1`.
     * 
     */
    private String deviceName;
    /**
     * @return Object. Set Elastic Block Store properties.
     * 
     */
    private @Nullable OceanBlockDeviceMappingEbs ebs;
    /**
     * @return String. Suppresses the specified device included in the block device mapping of the AMI.
     * 
     */
    private @Nullable String noDevice;
    private @Nullable String virtualName;

    private OceanBlockDeviceMapping() {}
    /**
     * @return String. Set device name. Example: `/dev/xvda1`.
     * 
     */
    public String deviceName() {
        return this.deviceName;
    }
    /**
     * @return Object. Set Elastic Block Store properties.
     * 
     */
    public Optional<OceanBlockDeviceMappingEbs> ebs() {
        return Optional.ofNullable(this.ebs);
    }
    /**
     * @return String. Suppresses the specified device included in the block device mapping of the AMI.
     * 
     */
    public Optional<String> noDevice() {
        return Optional.ofNullable(this.noDevice);
    }
    public Optional<String> virtualName() {
        return Optional.ofNullable(this.virtualName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OceanBlockDeviceMapping defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String deviceName;
        private @Nullable OceanBlockDeviceMappingEbs ebs;
        private @Nullable String noDevice;
        private @Nullable String virtualName;
        public Builder() {}
        public Builder(OceanBlockDeviceMapping defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceName = defaults.deviceName;
    	      this.ebs = defaults.ebs;
    	      this.noDevice = defaults.noDevice;
    	      this.virtualName = defaults.virtualName;
        }

        @CustomType.Setter
        public Builder deviceName(String deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }
        @CustomType.Setter
        public Builder ebs(@Nullable OceanBlockDeviceMappingEbs ebs) {
            this.ebs = ebs;
            return this;
        }
        @CustomType.Setter
        public Builder noDevice(@Nullable String noDevice) {
            this.noDevice = noDevice;
            return this;
        }
        @CustomType.Setter
        public Builder virtualName(@Nullable String virtualName) {
            this.virtualName = virtualName;
            return this;
        }
        public OceanBlockDeviceMapping build() {
            final var _resultValue = new OceanBlockDeviceMapping();
            _resultValue.deviceName = deviceName;
            _resultValue.ebs = ebs;
            _resultValue.noDevice = noDevice;
            _resultValue.virtualName = virtualName;
            return _resultValue;
        }
    }
}
