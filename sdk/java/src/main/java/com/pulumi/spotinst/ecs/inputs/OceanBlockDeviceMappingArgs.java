// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.ecs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.spotinst.ecs.inputs.OceanBlockDeviceMappingEbsArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OceanBlockDeviceMappingArgs extends com.pulumi.resources.ResourceArgs {

    public static final OceanBlockDeviceMappingArgs Empty = new OceanBlockDeviceMappingArgs();

    @Import(name="deviceName", required=true)
    private Output<String> deviceName;

    public Output<String> deviceName() {
        return this.deviceName;
    }

    @Import(name="ebs")
    private @Nullable Output<OceanBlockDeviceMappingEbsArgs> ebs;

    public Optional<Output<OceanBlockDeviceMappingEbsArgs>> ebs() {
        return Optional.ofNullable(this.ebs);
    }

    @Import(name="noDevice")
    private @Nullable Output<String> noDevice;

    public Optional<Output<String>> noDevice() {
        return Optional.ofNullable(this.noDevice);
    }

    @Import(name="virtualName")
    private @Nullable Output<String> virtualName;

    public Optional<Output<String>> virtualName() {
        return Optional.ofNullable(this.virtualName);
    }

    private OceanBlockDeviceMappingArgs() {}

    private OceanBlockDeviceMappingArgs(OceanBlockDeviceMappingArgs $) {
        this.deviceName = $.deviceName;
        this.ebs = $.ebs;
        this.noDevice = $.noDevice;
        this.virtualName = $.virtualName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OceanBlockDeviceMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OceanBlockDeviceMappingArgs $;

        public Builder() {
            $ = new OceanBlockDeviceMappingArgs();
        }

        public Builder(OceanBlockDeviceMappingArgs defaults) {
            $ = new OceanBlockDeviceMappingArgs(Objects.requireNonNull(defaults));
        }

        public Builder deviceName(Output<String> deviceName) {
            $.deviceName = deviceName;
            return this;
        }

        public Builder deviceName(String deviceName) {
            return deviceName(Output.of(deviceName));
        }

        public Builder ebs(@Nullable Output<OceanBlockDeviceMappingEbsArgs> ebs) {
            $.ebs = ebs;
            return this;
        }

        public Builder ebs(OceanBlockDeviceMappingEbsArgs ebs) {
            return ebs(Output.of(ebs));
        }

        public Builder noDevice(@Nullable Output<String> noDevice) {
            $.noDevice = noDevice;
            return this;
        }

        public Builder noDevice(String noDevice) {
            return noDevice(Output.of(noDevice));
        }

        public Builder virtualName(@Nullable Output<String> virtualName) {
            $.virtualName = virtualName;
            return this;
        }

        public Builder virtualName(String virtualName) {
            return virtualName(Output.of(virtualName));
        }

        public OceanBlockDeviceMappingArgs build() {
            if ($.deviceName == null) {
                throw new MissingRequiredPropertyException("OceanBlockDeviceMappingArgs", "deviceName");
            }
            return $;
        }
    }

}