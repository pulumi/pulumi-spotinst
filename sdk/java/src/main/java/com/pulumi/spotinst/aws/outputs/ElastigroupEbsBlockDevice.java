// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ElastigroupEbsBlockDevice {
    /**
     * @return Whether the volume should be destroyed on instance termination.
     * 
     */
    private @Nullable Boolean deleteOnTermination;
    /**
     * @return The name of the device to mount.
     * 
     */
    private String deviceName;
    /**
     * @return Enables [EBS encryption](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html) on the volume.
     * 
     */
    private @Nullable Boolean encrypted;
    /**
     * @return The amount of provisioned [IOPS](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-io-characteristics.html). This must be set with a `volume_type` of `&#34;io1&#34;`.
     * 
     */
    private @Nullable Integer iops;
    /**
     * @return ID for a user managed CMK under which the EBS Volume is encrypted
     * 
     */
    private @Nullable String kmsKeyId;
    /**
     * @return The Snapshot ID to mount.
     * 
     */
    private @Nullable String snapshotId;
    /**
     * @return The amount of data transferred to or from a storage device per second, you can use this param just in a case that `volume_type` = gp3.
     * 
     * Modifying any `ebs_block_device` currently requires resource replacement.
     * 
     * Usage:
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *     }
     * }
     * ```
     * 
     */
    private @Nullable Integer throughput;
    /**
     * @return The size of the volume in gigabytes.
     * 
     */
    private @Nullable Integer volumeSize;
    /**
     * @return The type of volume. Can be `&#34;standard&#34;`, `&#34;gp2&#34;`, `&#34;gp3&#34;`, `&#34;io1&#34;`, `&#34;st1&#34;` or `&#34;sc1&#34;`.
     * 
     */
    private @Nullable String volumeType;

    private ElastigroupEbsBlockDevice() {}
    /**
     * @return Whether the volume should be destroyed on instance termination.
     * 
     */
    public Optional<Boolean> deleteOnTermination() {
        return Optional.ofNullable(this.deleteOnTermination);
    }
    /**
     * @return The name of the device to mount.
     * 
     */
    public String deviceName() {
        return this.deviceName;
    }
    /**
     * @return Enables [EBS encryption](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html) on the volume.
     * 
     */
    public Optional<Boolean> encrypted() {
        return Optional.ofNullable(this.encrypted);
    }
    /**
     * @return The amount of provisioned [IOPS](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-io-characteristics.html). This must be set with a `volume_type` of `&#34;io1&#34;`.
     * 
     */
    public Optional<Integer> iops() {
        return Optional.ofNullable(this.iops);
    }
    /**
     * @return ID for a user managed CMK under which the EBS Volume is encrypted
     * 
     */
    public Optional<String> kmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }
    /**
     * @return The Snapshot ID to mount.
     * 
     */
    public Optional<String> snapshotId() {
        return Optional.ofNullable(this.snapshotId);
    }
    /**
     * @return The amount of data transferred to or from a storage device per second, you can use this param just in a case that `volume_type` = gp3.
     * 
     * Modifying any `ebs_block_device` currently requires resource replacement.
     * 
     * Usage:
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *     }
     * }
     * ```
     * 
     */
    public Optional<Integer> throughput() {
        return Optional.ofNullable(this.throughput);
    }
    /**
     * @return The size of the volume in gigabytes.
     * 
     */
    public Optional<Integer> volumeSize() {
        return Optional.ofNullable(this.volumeSize);
    }
    /**
     * @return The type of volume. Can be `&#34;standard&#34;`, `&#34;gp2&#34;`, `&#34;gp3&#34;`, `&#34;io1&#34;`, `&#34;st1&#34;` or `&#34;sc1&#34;`.
     * 
     */
    public Optional<String> volumeType() {
        return Optional.ofNullable(this.volumeType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ElastigroupEbsBlockDevice defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean deleteOnTermination;
        private String deviceName;
        private @Nullable Boolean encrypted;
        private @Nullable Integer iops;
        private @Nullable String kmsKeyId;
        private @Nullable String snapshotId;
        private @Nullable Integer throughput;
        private @Nullable Integer volumeSize;
        private @Nullable String volumeType;
        public Builder() {}
        public Builder(ElastigroupEbsBlockDevice defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteOnTermination = defaults.deleteOnTermination;
    	      this.deviceName = defaults.deviceName;
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
        public Builder deviceName(String deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
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
        public ElastigroupEbsBlockDevice build() {
            final var o = new ElastigroupEbsBlockDevice();
            o.deleteOnTermination = deleteOnTermination;
            o.deviceName = deviceName;
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
