// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.spotinst.aws.inputs.OceanBlockDeviceMappingEbsDynamicIopsArgs;
import com.pulumi.spotinst.aws.inputs.OceanBlockDeviceMappingEbsDynamicVolumeSizeArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OceanBlockDeviceMappingEbsArgs extends com.pulumi.resources.ResourceArgs {

    public static final OceanBlockDeviceMappingEbsArgs Empty = new OceanBlockDeviceMappingEbsArgs();

    /**
     * Boolean. Flag to delete the EBS on instance termination.
     * 
     */
    @Import(name="deleteOnTermination")
    private @Nullable Output<Boolean> deleteOnTermination;

    /**
     * @return Boolean. Flag to delete the EBS on instance termination.
     * 
     */
    public Optional<Output<Boolean>> deleteOnTermination() {
        return Optional.ofNullable(this.deleteOnTermination);
    }

    /**
     * Set dynamic IOPS properties. When using this object, you cannot use the `iops` attribute. You must use one or the other.
     * 
     */
    @Import(name="dynamicIops")
    private @Nullable Output<OceanBlockDeviceMappingEbsDynamicIopsArgs> dynamicIops;

    /**
     * @return Set dynamic IOPS properties. When using this object, you cannot use the `iops` attribute. You must use one or the other.
     * 
     */
    public Optional<Output<OceanBlockDeviceMappingEbsDynamicIopsArgs>> dynamicIops() {
        return Optional.ofNullable(this.dynamicIops);
    }

    /**
     * Object. Set dynamic volume size properties. When using this object, you cannot use volumeSize. You must use one or the other.
     * 
     */
    @Import(name="dynamicVolumeSize")
    private @Nullable Output<OceanBlockDeviceMappingEbsDynamicVolumeSizeArgs> dynamicVolumeSize;

    /**
     * @return Object. Set dynamic volume size properties. When using this object, you cannot use volumeSize. You must use one or the other.
     * 
     */
    public Optional<Output<OceanBlockDeviceMappingEbsDynamicVolumeSizeArgs>> dynamicVolumeSize() {
        return Optional.ofNullable(this.dynamicVolumeSize);
    }

    /**
     * Boolean. Enables [EBS encryption](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html) on the volume.
     * 
     */
    @Import(name="encrypted")
    private @Nullable Output<Boolean> encrypted;

    /**
     * @return Boolean. Enables [EBS encryption](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html) on the volume.
     * 
     */
    public Optional<Output<Boolean>> encrypted() {
        return Optional.ofNullable(this.encrypted);
    }

    /**
     * Must be greater than or equal to 0.
     * 
     */
    @Import(name="iops")
    private @Nullable Output<Integer> iops;

    /**
     * @return Must be greater than or equal to 0.
     * 
     */
    public Optional<Output<Integer>> iops() {
        return Optional.ofNullable(this.iops);
    }

    /**
     * String. Identifier (key ID, key alias, ID ARN, or alias ARN) for a customer managed CMK under which the EBS volume is encrypted.
     * 
     */
    @Import(name="kmsKeyId")
    private @Nullable Output<String> kmsKeyId;

    /**
     * @return String. Identifier (key ID, key alias, ID ARN, or alias ARN) for a customer managed CMK under which the EBS volume is encrypted.
     * 
     */
    public Optional<Output<String>> kmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }

    /**
     * (Optional) String. The Snapshot ID to mount by.
     * 
     */
    @Import(name="snapshotId")
    private @Nullable Output<String> snapshotId;

    /**
     * @return (Optional) String. The Snapshot ID to mount by.
     * 
     */
    public Optional<Output<String>> snapshotId() {
        return Optional.ofNullable(this.snapshotId);
    }

    /**
     * The amount of data transferred to or from a storage device per second, you can use this param just in a case that `volume_type` = `gp3`.
     * 
     */
    @Import(name="throughput")
    private @Nullable Output<Integer> throughput;

    /**
     * @return The amount of data transferred to or from a storage device per second, you can use this param just in a case that `volume_type` = `gp3`.
     * 
     */
    public Optional<Output<Integer>> throughput() {
        return Optional.ofNullable(this.throughput);
    }

    /**
     * Int. The size, in GB of the volume.
     * 
     */
    @Import(name="volumeSize")
    private @Nullable Output<Integer> volumeSize;

    /**
     * @return Int. The size, in GB of the volume.
     * 
     */
    public Optional<Output<Integer>> volumeSize() {
        return Optional.ofNullable(this.volumeSize);
    }

    /**
     * String. The type of the volume. (Example: `gp2`).
     * 
     */
    @Import(name="volumeType")
    private @Nullable Output<String> volumeType;

    /**
     * @return String. The type of the volume. (Example: `gp2`).
     * 
     */
    public Optional<Output<String>> volumeType() {
        return Optional.ofNullable(this.volumeType);
    }

    private OceanBlockDeviceMappingEbsArgs() {}

    private OceanBlockDeviceMappingEbsArgs(OceanBlockDeviceMappingEbsArgs $) {
        this.deleteOnTermination = $.deleteOnTermination;
        this.dynamicIops = $.dynamicIops;
        this.dynamicVolumeSize = $.dynamicVolumeSize;
        this.encrypted = $.encrypted;
        this.iops = $.iops;
        this.kmsKeyId = $.kmsKeyId;
        this.snapshotId = $.snapshotId;
        this.throughput = $.throughput;
        this.volumeSize = $.volumeSize;
        this.volumeType = $.volumeType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OceanBlockDeviceMappingEbsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OceanBlockDeviceMappingEbsArgs $;

        public Builder() {
            $ = new OceanBlockDeviceMappingEbsArgs();
        }

        public Builder(OceanBlockDeviceMappingEbsArgs defaults) {
            $ = new OceanBlockDeviceMappingEbsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param deleteOnTermination Boolean. Flag to delete the EBS on instance termination.
         * 
         * @return builder
         * 
         */
        public Builder deleteOnTermination(@Nullable Output<Boolean> deleteOnTermination) {
            $.deleteOnTermination = deleteOnTermination;
            return this;
        }

        /**
         * @param deleteOnTermination Boolean. Flag to delete the EBS on instance termination.
         * 
         * @return builder
         * 
         */
        public Builder deleteOnTermination(Boolean deleteOnTermination) {
            return deleteOnTermination(Output.of(deleteOnTermination));
        }

        /**
         * @param dynamicIops Set dynamic IOPS properties. When using this object, you cannot use the `iops` attribute. You must use one or the other.
         * 
         * @return builder
         * 
         */
        public Builder dynamicIops(@Nullable Output<OceanBlockDeviceMappingEbsDynamicIopsArgs> dynamicIops) {
            $.dynamicIops = dynamicIops;
            return this;
        }

        /**
         * @param dynamicIops Set dynamic IOPS properties. When using this object, you cannot use the `iops` attribute. You must use one or the other.
         * 
         * @return builder
         * 
         */
        public Builder dynamicIops(OceanBlockDeviceMappingEbsDynamicIopsArgs dynamicIops) {
            return dynamicIops(Output.of(dynamicIops));
        }

        /**
         * @param dynamicVolumeSize Object. Set dynamic volume size properties. When using this object, you cannot use volumeSize. You must use one or the other.
         * 
         * @return builder
         * 
         */
        public Builder dynamicVolumeSize(@Nullable Output<OceanBlockDeviceMappingEbsDynamicVolumeSizeArgs> dynamicVolumeSize) {
            $.dynamicVolumeSize = dynamicVolumeSize;
            return this;
        }

        /**
         * @param dynamicVolumeSize Object. Set dynamic volume size properties. When using this object, you cannot use volumeSize. You must use one or the other.
         * 
         * @return builder
         * 
         */
        public Builder dynamicVolumeSize(OceanBlockDeviceMappingEbsDynamicVolumeSizeArgs dynamicVolumeSize) {
            return dynamicVolumeSize(Output.of(dynamicVolumeSize));
        }

        /**
         * @param encrypted Boolean. Enables [EBS encryption](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html) on the volume.
         * 
         * @return builder
         * 
         */
        public Builder encrypted(@Nullable Output<Boolean> encrypted) {
            $.encrypted = encrypted;
            return this;
        }

        /**
         * @param encrypted Boolean. Enables [EBS encryption](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html) on the volume.
         * 
         * @return builder
         * 
         */
        public Builder encrypted(Boolean encrypted) {
            return encrypted(Output.of(encrypted));
        }

        /**
         * @param iops Must be greater than or equal to 0.
         * 
         * @return builder
         * 
         */
        public Builder iops(@Nullable Output<Integer> iops) {
            $.iops = iops;
            return this;
        }

        /**
         * @param iops Must be greater than or equal to 0.
         * 
         * @return builder
         * 
         */
        public Builder iops(Integer iops) {
            return iops(Output.of(iops));
        }

        /**
         * @param kmsKeyId String. Identifier (key ID, key alias, ID ARN, or alias ARN) for a customer managed CMK under which the EBS volume is encrypted.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyId(@Nullable Output<String> kmsKeyId) {
            $.kmsKeyId = kmsKeyId;
            return this;
        }

        /**
         * @param kmsKeyId String. Identifier (key ID, key alias, ID ARN, or alias ARN) for a customer managed CMK under which the EBS volume is encrypted.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyId(String kmsKeyId) {
            return kmsKeyId(Output.of(kmsKeyId));
        }

        /**
         * @param snapshotId (Optional) String. The Snapshot ID to mount by.
         * 
         * @return builder
         * 
         */
        public Builder snapshotId(@Nullable Output<String> snapshotId) {
            $.snapshotId = snapshotId;
            return this;
        }

        /**
         * @param snapshotId (Optional) String. The Snapshot ID to mount by.
         * 
         * @return builder
         * 
         */
        public Builder snapshotId(String snapshotId) {
            return snapshotId(Output.of(snapshotId));
        }

        /**
         * @param throughput The amount of data transferred to or from a storage device per second, you can use this param just in a case that `volume_type` = `gp3`.
         * 
         * @return builder
         * 
         */
        public Builder throughput(@Nullable Output<Integer> throughput) {
            $.throughput = throughput;
            return this;
        }

        /**
         * @param throughput The amount of data transferred to or from a storage device per second, you can use this param just in a case that `volume_type` = `gp3`.
         * 
         * @return builder
         * 
         */
        public Builder throughput(Integer throughput) {
            return throughput(Output.of(throughput));
        }

        /**
         * @param volumeSize Int. The size, in GB of the volume.
         * 
         * @return builder
         * 
         */
        public Builder volumeSize(@Nullable Output<Integer> volumeSize) {
            $.volumeSize = volumeSize;
            return this;
        }

        /**
         * @param volumeSize Int. The size, in GB of the volume.
         * 
         * @return builder
         * 
         */
        public Builder volumeSize(Integer volumeSize) {
            return volumeSize(Output.of(volumeSize));
        }

        /**
         * @param volumeType String. The type of the volume. (Example: `gp2`).
         * 
         * @return builder
         * 
         */
        public Builder volumeType(@Nullable Output<String> volumeType) {
            $.volumeType = volumeType;
            return this;
        }

        /**
         * @param volumeType String. The type of the volume. (Example: `gp2`).
         * 
         * @return builder
         * 
         */
        public Builder volumeType(String volumeType) {
            return volumeType(Output.of(volumeType));
        }

        public OceanBlockDeviceMappingEbsArgs build() {
            return $;
        }
    }

}
