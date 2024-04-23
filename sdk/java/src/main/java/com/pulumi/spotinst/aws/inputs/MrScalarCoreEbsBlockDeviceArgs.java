// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MrScalarCoreEbsBlockDeviceArgs extends com.pulumi.resources.ResourceArgs {

    public static final MrScalarCoreEbsBlockDeviceArgs Empty = new MrScalarCoreEbsBlockDeviceArgs();

    @Import(name="iops")
    private @Nullable Output<Integer> iops;

    public Optional<Output<Integer>> iops() {
        return Optional.ofNullable(this.iops);
    }

    @Import(name="sizeInGb", required=true)
    private Output<Integer> sizeInGb;

    public Output<Integer> sizeInGb() {
        return this.sizeInGb;
    }

    @Import(name="volumeType", required=true)
    private Output<String> volumeType;

    public Output<String> volumeType() {
        return this.volumeType;
    }

    @Import(name="volumesPerInstance")
    private @Nullable Output<Integer> volumesPerInstance;

    public Optional<Output<Integer>> volumesPerInstance() {
        return Optional.ofNullable(this.volumesPerInstance);
    }

    private MrScalarCoreEbsBlockDeviceArgs() {}

    private MrScalarCoreEbsBlockDeviceArgs(MrScalarCoreEbsBlockDeviceArgs $) {
        this.iops = $.iops;
        this.sizeInGb = $.sizeInGb;
        this.volumeType = $.volumeType;
        this.volumesPerInstance = $.volumesPerInstance;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MrScalarCoreEbsBlockDeviceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MrScalarCoreEbsBlockDeviceArgs $;

        public Builder() {
            $ = new MrScalarCoreEbsBlockDeviceArgs();
        }

        public Builder(MrScalarCoreEbsBlockDeviceArgs defaults) {
            $ = new MrScalarCoreEbsBlockDeviceArgs(Objects.requireNonNull(defaults));
        }

        public Builder iops(@Nullable Output<Integer> iops) {
            $.iops = iops;
            return this;
        }

        public Builder iops(Integer iops) {
            return iops(Output.of(iops));
        }

        public Builder sizeInGb(Output<Integer> sizeInGb) {
            $.sizeInGb = sizeInGb;
            return this;
        }

        public Builder sizeInGb(Integer sizeInGb) {
            return sizeInGb(Output.of(sizeInGb));
        }

        public Builder volumeType(Output<String> volumeType) {
            $.volumeType = volumeType;
            return this;
        }

        public Builder volumeType(String volumeType) {
            return volumeType(Output.of(volumeType));
        }

        public Builder volumesPerInstance(@Nullable Output<Integer> volumesPerInstance) {
            $.volumesPerInstance = volumesPerInstance;
            return this;
        }

        public Builder volumesPerInstance(Integer volumesPerInstance) {
            return volumesPerInstance(Output.of(volumesPerInstance));
        }

        public MrScalarCoreEbsBlockDeviceArgs build() {
            if ($.sizeInGb == null) {
                throw new MissingRequiredPropertyException("MrScalarCoreEbsBlockDeviceArgs", "sizeInGb");
            }
            if ($.volumeType == null) {
                throw new MissingRequiredPropertyException("MrScalarCoreEbsBlockDeviceArgs", "volumeType");
            }
            return $;
        }
    }

}
