// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.gcp.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.spotinst.gcp.inputs.ElastigroupDiskInitializeParamArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ElastigroupDiskArgs extends com.pulumi.resources.ResourceArgs {

    public static final ElastigroupDiskArgs Empty = new ElastigroupDiskArgs();

    /**
     * Specifies whether the disk will be auto-deleted when the instance is deleted.
     * 
     */
    @Import(name="autoDelete")
    private @Nullable Output<Boolean> autoDelete;

    /**
     * @return Specifies whether the disk will be auto-deleted when the instance is deleted.
     * 
     */
    public Optional<Output<Boolean>> autoDelete() {
        return Optional.ofNullable(this.autoDelete);
    }

    /**
     * Indicates that this is a boot disk. The virtual machine will use the first partition of the disk for its root filesystem.
     * 
     */
    @Import(name="boot")
    private @Nullable Output<Boolean> boot;

    /**
     * @return Indicates that this is a boot disk. The virtual machine will use the first partition of the disk for its root filesystem.
     * 
     */
    public Optional<Output<Boolean>> boot() {
        return Optional.ofNullable(this.boot);
    }

    /**
     * Specifies a unique device name of your choice.
     * 
     */
    @Import(name="deviceName")
    private @Nullable Output<String> deviceName;

    /**
     * @return Specifies a unique device name of your choice.
     * 
     */
    public Optional<Output<String>> deviceName() {
        return Optional.ofNullable(this.deviceName);
    }

    /**
     * Specifies the parameters for a new disk that will be created alongside the new instance. Use initialization parameters to create boot disks or local SSDs attached to the new instance.
     * 
     */
    @Import(name="initializeParams")
    private @Nullable Output<List<ElastigroupDiskInitializeParamArgs>> initializeParams;

    /**
     * @return Specifies the parameters for a new disk that will be created alongside the new instance. Use initialization parameters to create boot disks or local SSDs attached to the new instance.
     * 
     */
    public Optional<Output<List<ElastigroupDiskInitializeParamArgs>>> initializeParams() {
        return Optional.ofNullable(this.initializeParams);
    }

    /**
     * Specifies the disk interface to use for attaching this disk, which is either SCSI or NVME.
     * 
     */
    @Import(name="interface")
    private @Nullable Output<String> interface_;

    /**
     * @return Specifies the disk interface to use for attaching this disk, which is either SCSI or NVME.
     * 
     */
    public Optional<Output<String>> interface_() {
        return Optional.ofNullable(this.interface_);
    }

    /**
     * The mode in which to attach this disk, either READ_WRITE or READ_ONLY.
     * 
     */
    @Import(name="mode")
    private @Nullable Output<String> mode;

    /**
     * @return The mode in which to attach this disk, either READ_WRITE or READ_ONLY.
     * 
     */
    public Optional<Output<String>> mode() {
        return Optional.ofNullable(this.mode);
    }

    /**
     * Specifies a valid partial or full URL to an existing Persistent Disk resource. This field is only applicable for persistent disks.
     * 
     */
    @Import(name="source")
    private @Nullable Output<String> source;

    /**
     * @return Specifies a valid partial or full URL to an existing Persistent Disk resource. This field is only applicable for persistent disks.
     * 
     */
    public Optional<Output<String>> source() {
        return Optional.ofNullable(this.source);
    }

    /**
     * Type of scaling action to take when the scaling policy is triggered. Valid values: &#34;adjustment&#34;, &#34;setMinTarget&#34;, &#34;updateCapacity&#34;, &#34;percentageAdjustment&#34;
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Type of scaling action to take when the scaling policy is triggered. Valid values: &#34;adjustment&#34;, &#34;setMinTarget&#34;, &#34;updateCapacity&#34;, &#34;percentageAdjustment&#34;
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private ElastigroupDiskArgs() {}

    private ElastigroupDiskArgs(ElastigroupDiskArgs $) {
        this.autoDelete = $.autoDelete;
        this.boot = $.boot;
        this.deviceName = $.deviceName;
        this.initializeParams = $.initializeParams;
        this.interface_ = $.interface_;
        this.mode = $.mode;
        this.source = $.source;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ElastigroupDiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ElastigroupDiskArgs $;

        public Builder() {
            $ = new ElastigroupDiskArgs();
        }

        public Builder(ElastigroupDiskArgs defaults) {
            $ = new ElastigroupDiskArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoDelete Specifies whether the disk will be auto-deleted when the instance is deleted.
         * 
         * @return builder
         * 
         */
        public Builder autoDelete(@Nullable Output<Boolean> autoDelete) {
            $.autoDelete = autoDelete;
            return this;
        }

        /**
         * @param autoDelete Specifies whether the disk will be auto-deleted when the instance is deleted.
         * 
         * @return builder
         * 
         */
        public Builder autoDelete(Boolean autoDelete) {
            return autoDelete(Output.of(autoDelete));
        }

        /**
         * @param boot Indicates that this is a boot disk. The virtual machine will use the first partition of the disk for its root filesystem.
         * 
         * @return builder
         * 
         */
        public Builder boot(@Nullable Output<Boolean> boot) {
            $.boot = boot;
            return this;
        }

        /**
         * @param boot Indicates that this is a boot disk. The virtual machine will use the first partition of the disk for its root filesystem.
         * 
         * @return builder
         * 
         */
        public Builder boot(Boolean boot) {
            return boot(Output.of(boot));
        }

        /**
         * @param deviceName Specifies a unique device name of your choice.
         * 
         * @return builder
         * 
         */
        public Builder deviceName(@Nullable Output<String> deviceName) {
            $.deviceName = deviceName;
            return this;
        }

        /**
         * @param deviceName Specifies a unique device name of your choice.
         * 
         * @return builder
         * 
         */
        public Builder deviceName(String deviceName) {
            return deviceName(Output.of(deviceName));
        }

        /**
         * @param initializeParams Specifies the parameters for a new disk that will be created alongside the new instance. Use initialization parameters to create boot disks or local SSDs attached to the new instance.
         * 
         * @return builder
         * 
         */
        public Builder initializeParams(@Nullable Output<List<ElastigroupDiskInitializeParamArgs>> initializeParams) {
            $.initializeParams = initializeParams;
            return this;
        }

        /**
         * @param initializeParams Specifies the parameters for a new disk that will be created alongside the new instance. Use initialization parameters to create boot disks or local SSDs attached to the new instance.
         * 
         * @return builder
         * 
         */
        public Builder initializeParams(List<ElastigroupDiskInitializeParamArgs> initializeParams) {
            return initializeParams(Output.of(initializeParams));
        }

        /**
         * @param initializeParams Specifies the parameters for a new disk that will be created alongside the new instance. Use initialization parameters to create boot disks or local SSDs attached to the new instance.
         * 
         * @return builder
         * 
         */
        public Builder initializeParams(ElastigroupDiskInitializeParamArgs... initializeParams) {
            return initializeParams(List.of(initializeParams));
        }

        /**
         * @param interface_ Specifies the disk interface to use for attaching this disk, which is either SCSI or NVME.
         * 
         * @return builder
         * 
         */
        public Builder interface_(@Nullable Output<String> interface_) {
            $.interface_ = interface_;
            return this;
        }

        /**
         * @param interface_ Specifies the disk interface to use for attaching this disk, which is either SCSI or NVME.
         * 
         * @return builder
         * 
         */
        public Builder interface_(String interface_) {
            return interface_(Output.of(interface_));
        }

        /**
         * @param mode The mode in which to attach this disk, either READ_WRITE or READ_ONLY.
         * 
         * @return builder
         * 
         */
        public Builder mode(@Nullable Output<String> mode) {
            $.mode = mode;
            return this;
        }

        /**
         * @param mode The mode in which to attach this disk, either READ_WRITE or READ_ONLY.
         * 
         * @return builder
         * 
         */
        public Builder mode(String mode) {
            return mode(Output.of(mode));
        }

        /**
         * @param source Specifies a valid partial or full URL to an existing Persistent Disk resource. This field is only applicable for persistent disks.
         * 
         * @return builder
         * 
         */
        public Builder source(@Nullable Output<String> source) {
            $.source = source;
            return this;
        }

        /**
         * @param source Specifies a valid partial or full URL to an existing Persistent Disk resource. This field is only applicable for persistent disks.
         * 
         * @return builder
         * 
         */
        public Builder source(String source) {
            return source(Output.of(source));
        }

        /**
         * @param type Type of scaling action to take when the scaling policy is triggered. Valid values: &#34;adjustment&#34;, &#34;setMinTarget&#34;, &#34;updateCapacity&#34;, &#34;percentageAdjustment&#34;
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of scaling action to take when the scaling policy is triggered. Valid values: &#34;adjustment&#34;, &#34;setMinTarget&#34;, &#34;updateCapacity&#34;, &#34;percentageAdjustment&#34;
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ElastigroupDiskArgs build() {
            return $;
        }
    }

}
