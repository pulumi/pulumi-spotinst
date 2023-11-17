// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.spotinst.aws.outputs.OceanLaunchSpecBlockDeviceMappingEbsDynamicVolumeSize;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OceanLaunchSpecBlockDeviceMappingEbs {
    /**
     * @return Boolean. Flag to delete the EBS on instance termination.
     * 
     */
    private @Nullable Boolean deleteOnTermination;
    /**
     * @return Object. Set dynamic volume size properties. When using this object, you cannot use volumeSize. You must use one or the other.
     * 
     */
    private @Nullable OceanLaunchSpecBlockDeviceMappingEbsDynamicVolumeSize dynamicVolumeSize;
    /**
     * @return Boolean. Enables [EBS encryption](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html) on the volume.
     * 
     */
    private @Nullable Boolean encrypted;
    /**
     * @return Int. The number of I/O operations per second (IOPS) that the volume supports.
     * 
     */
    private @Nullable Integer iops;
    /**
     * @return String. Identifier (key ID, key alias, ID ARN, or alias ARN) for a customer managed CMK under which the EBS volume is encrypted.
     * 
     */
    private @Nullable String kmsKeyId;
    /**
     * @return String. The Snapshot ID to mount by.
     * 
     */
    private @Nullable String snapshotId;
    /**
     * @return The amount of data transferred to or from a storage device per second, you can use this param just in a case that `volume_type` = `gp3`.
     * 
     */
    private @Nullable Integer throughput;
    /**
     * @return Int. The size, in GB of the volume.
     * 
     */
    private @Nullable Integer volumeSize;
    /**
     * @return String. The type of the volume. (Example: `gp2`).
     * 
     */
    private @Nullable String volumeType;

    private OceanLaunchSpecBlockDeviceMappingEbs() {}
    /**
     * @return Boolean. Flag to delete the EBS on instance termination.
     * 
     */
    public Optional<Boolean> deleteOnTermination() {
        return Optional.ofNullable(this.deleteOnTermination);
    }
    /**
     * @return Object. Set dynamic volume size properties. When using this object, you cannot use volumeSize. You must use one or the other.
     * 
     */
    public Optional<OceanLaunchSpecBlockDeviceMappingEbsDynamicVolumeSize> dynamicVolumeSize() {
        return Optional.ofNullable(this.dynamicVolumeSize);
    }
    /**
     * @return Boolean. Enables [EBS encryption](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html) on the volume.
     * 
     */
    public Optional<Boolean> encrypted() {
        return Optional.ofNullable(this.encrypted);
    }
    /**
     * @return Int. The number of I/O operations per second (IOPS) that the volume supports.
     * 
     */
    public Optional<Integer> iops() {
        return Optional.ofNullable(this.iops);
    }
    /**
     * @return String. Identifier (key ID, key alias, ID ARN, or alias ARN) for a customer managed CMK under which the EBS volume is encrypted.
     * 
     */
    public Optional<String> kmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }
    /**
     * @return String. The Snapshot ID to mount by.
     * 
     */
    public Optional<String> snapshotId() {
        return Optional.ofNullable(this.snapshotId);
    }
    /**
     * @return The amount of data transferred to or from a storage device per second, you can use this param just in a case that `volume_type` = `gp3`.
     * 
     */
    public Optional<Integer> throughput() {
        return Optional.ofNullable(this.throughput);
    }
    /**
     * @return Int. The size, in GB of the volume.
     * 
     */
    public Optional<Integer> volumeSize() {
        return Optional.ofNullable(this.volumeSize);
    }
    /**
     * @return String. The type of the volume. (Example: `gp2`).
     * 
     */
    public Optional<String> volumeType() {
        return Optional.ofNullable(this.volumeType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OceanLaunchSpecBlockDeviceMappingEbs defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean deleteOnTermination;
        private @Nullable OceanLaunchSpecBlockDeviceMappingEbsDynamicVolumeSize dynamicVolumeSize;
        private @Nullable Boolean encrypted;
        private @Nullable Integer iops;
        private @Nullable String kmsKeyId;
        private @Nullable String snapshotId;
        private @Nullable Integer throughput;
        private @Nullable Integer volumeSize;
        private @Nullable String volumeType;
        public Builder() {}
        public Builder(OceanLaunchSpecBlockDeviceMappingEbs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteOnTermination = defaults.deleteOnTermination;
    	      this.dynamicVolumeSize = defaults.dynamicVolumeSize;
    	      this.encrypted = defaults.encrypted;
    	      this.iops = defaults.iops;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.snapshotId = defaults.snapshotId;
    	      this.throughput = defaults.throughput;
    	      this.volumeSize = defaults.volumeSize;
    	      this.volumeType = defaults.volumeType;
        }

        @CustomType.Setter
        public Builder deleteOnTermination(@Nullable Boolean deleteOnTermination) {
            this.deleteOnTermination = deleteOnTermination;
            return this;
        }
        @CustomType.Setter
        public Builder dynamicVolumeSize(@Nullable OceanLaunchSpecBlockDeviceMappingEbsDynamicVolumeSize dynamicVolumeSize) {
            this.dynamicVolumeSize = dynamicVolumeSize;
            return this;
        }
        @CustomType.Setter
        public Builder encrypted(@Nullable Boolean encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        @CustomType.Setter
        public Builder iops(@Nullable Integer iops) {
            this.iops = iops;
            return this;
        }
        @CustomType.Setter
        public Builder kmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }
        @CustomType.Setter
        public Builder snapshotId(@Nullable String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        @CustomType.Setter
        public Builder throughput(@Nullable Integer throughput) {
            this.throughput = throughput;
            return this;
        }
        @CustomType.Setter
        public Builder volumeSize(@Nullable Integer volumeSize) {
            this.volumeSize = volumeSize;
            return this;
        }
        @CustomType.Setter
        public Builder volumeType(@Nullable String volumeType) {
            this.volumeType = volumeType;
            return this;
        }
        public OceanLaunchSpecBlockDeviceMappingEbs build() {
            final var o = new OceanLaunchSpecBlockDeviceMappingEbs();
            o.deleteOnTermination = deleteOnTermination;
            o.dynamicVolumeSize = dynamicVolumeSize;
            o.encrypted = encrypted;
            o.iops = iops;
            o.kmsKeyId = kmsKeyId;
            o.snapshotId = snapshotId;
            o.throughput = throughput;
            o.volumeSize = volumeSize;
            o.volumeType = volumeType;
            return o;
        }
    }
}
