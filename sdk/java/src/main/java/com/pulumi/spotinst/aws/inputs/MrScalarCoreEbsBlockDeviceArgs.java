// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MrScalarCoreEbsBlockDeviceArgs extends com.pulumi.resources.ResourceArgs {

    public static final MrScalarCoreEbsBlockDeviceArgs Empty = new MrScalarCoreEbsBlockDeviceArgs();

    /**
     * IOPS for the volume. Required in some volume types, such as io1.
     * 
     */
    @Import(name="iops")
    private @Nullable Output<Integer> iops;

    /**
     * @return IOPS for the volume. Required in some volume types, such as io1.
     * 
     */
    public Optional<Output<Integer>> iops() {
        return Optional.ofNullable(this.iops);
    }

    /**
     * Size of the volume, in GBs.
     * 
     */
    @Import(name="sizeInGb", required=true)
    private Output<Integer> sizeInGb;

    /**
     * @return Size of the volume, in GBs.
     * 
     */
    public Output<Integer> sizeInGb() {
        return this.sizeInGb;
    }

    /**
     * volume type. Allowed values are &#39;gp2&#39;, &#39;io1&#39; and others.
     * 
     */
    @Import(name="volumeType", required=true)
    private Output<String> volumeType;

    /**
     * @return volume type. Allowed values are &#39;gp2&#39;, &#39;io1&#39; and others.
     * 
     */
    public Output<String> volumeType() {
        return this.volumeType;
    }

    /**
     * Amount of volumes per instance in the core group.
     * 
     */
    @Import(name="volumesPerInstance")
    private @Nullable Output<Integer> volumesPerInstance;

    /**
     * @return Amount of volumes per instance in the core group.
     * 
     */
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

        /**
         * @param iops IOPS for the volume. Required in some volume types, such as io1.
         * 
         * @return builder
         * 
         */
        public Builder iops(@Nullable Output<Integer> iops) {
            $.iops = iops;
            return this;
        }

        /**
         * @param iops IOPS for the volume. Required in some volume types, such as io1.
         * 
         * @return builder
         * 
         */
        public Builder iops(Integer iops) {
            return iops(Output.of(iops));
        }

        /**
         * @param sizeInGb Size of the volume, in GBs.
         * 
         * @return builder
         * 
         */
        public Builder sizeInGb(Output<Integer> sizeInGb) {
            $.sizeInGb = sizeInGb;
            return this;
        }

        /**
         * @param sizeInGb Size of the volume, in GBs.
         * 
         * @return builder
         * 
         */
        public Builder sizeInGb(Integer sizeInGb) {
            return sizeInGb(Output.of(sizeInGb));
        }

        /**
         * @param volumeType volume type. Allowed values are &#39;gp2&#39;, &#39;io1&#39; and others.
         * 
         * @return builder
         * 
         */
        public Builder volumeType(Output<String> volumeType) {
            $.volumeType = volumeType;
            return this;
        }

        /**
         * @param volumeType volume type. Allowed values are &#39;gp2&#39;, &#39;io1&#39; and others.
         * 
         * @return builder
         * 
         */
        public Builder volumeType(String volumeType) {
            return volumeType(Output.of(volumeType));
        }

        /**
         * @param volumesPerInstance Amount of volumes per instance in the core group.
         * 
         * @return builder
         * 
         */
        public Builder volumesPerInstance(@Nullable Output<Integer> volumesPerInstance) {
            $.volumesPerInstance = volumesPerInstance;
            return this;
        }

        /**
         * @param volumesPerInstance Amount of volumes per instance in the core group.
         * 
         * @return builder
         * 
         */
        public Builder volumesPerInstance(Integer volumesPerInstance) {
            return volumesPerInstance(Output.of(volumesPerInstance));
        }

        public MrScalarCoreEbsBlockDeviceArgs build() {
            $.sizeInGb = Objects.requireNonNull($.sizeInGb, "expected parameter 'sizeInGb' to be non-null");
            $.volumeType = Objects.requireNonNull($.volumeType, "expected parameter 'volumeType' to be non-null");
            return $;
        }
    }

}
