// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.ecs.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.spotinst.ecs.outputs.OceanLaunchSpecBlockDeviceMappingEbs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OceanLaunchSpecBlockDeviceMapping {
    /**
     * @return String. Set device name. (Example: &#34;/dev/xvda1&#34;).
     * 
     */
    private String deviceName;
    /**
     * @return Object. Set Elastic Block Store properties .
     * 
     */
    private @Nullable OceanLaunchSpecBlockDeviceMappingEbs ebs;
    private @Nullable String noDevice;
    private @Nullable String virtualName;

    private OceanLaunchSpecBlockDeviceMapping() {}
    /**
     * @return String. Set device name. (Example: &#34;/dev/xvda1&#34;).
     * 
     */
    public String deviceName() {
        return this.deviceName;
    }
    /**
     * @return Object. Set Elastic Block Store properties .
     * 
     */
    public Optional<OceanLaunchSpecBlockDeviceMappingEbs> ebs() {
        return Optional.ofNullable(this.ebs);
    }
    public Optional<String> noDevice() {
        return Optional.ofNullable(this.noDevice);
    }
    public Optional<String> virtualName() {
        return Optional.ofNullable(this.virtualName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OceanLaunchSpecBlockDeviceMapping defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String deviceName;
        private @Nullable OceanLaunchSpecBlockDeviceMappingEbs ebs;
        private @Nullable String noDevice;
        private @Nullable String virtualName;
        public Builder() {}
        public Builder(OceanLaunchSpecBlockDeviceMapping defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceName = defaults.deviceName;
    	      this.ebs = defaults.ebs;
    	      this.noDevice = defaults.noDevice;
    	      this.virtualName = defaults.virtualName;
        }

        @CustomType.Setter
        public Builder deviceName(String deviceName) {
            if (deviceName == null) {
              throw new MissingRequiredPropertyException("OceanLaunchSpecBlockDeviceMapping", "deviceName");
            }
            this.deviceName = deviceName;
            return this;
        }
        @CustomType.Setter
        public Builder ebs(@Nullable OceanLaunchSpecBlockDeviceMappingEbs ebs) {

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
        public OceanLaunchSpecBlockDeviceMapping build() {
            final var _resultValue = new OceanLaunchSpecBlockDeviceMapping();
            _resultValue.deviceName = deviceName;
            _resultValue.ebs = ebs;
            _resultValue.noDevice = noDevice;
            _resultValue.virtualName = virtualName;
            return _resultValue;
        }
    }
}
