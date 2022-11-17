// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MrScalarCoreEbsBlockDevice {
    /**
     * @return IOPS for the volume. Required in some volume types, such as io1.
     * 
     */
    private @Nullable Integer iops;
    /**
     * @return Size of the volume, in GBs.
     * 
     */
    private Integer sizeInGb;
    /**
     * @return volume type. Allowed values are &#39;gp2&#39;, &#39;io1&#39; and others.
     * 
     */
    private String volumeType;
    /**
     * @return Amount of volumes per instance in the master group.
     * 
     */
    private @Nullable Integer volumesPerInstance;

    private MrScalarCoreEbsBlockDevice() {}
    /**
     * @return IOPS for the volume. Required in some volume types, such as io1.
     * 
     */
    public Optional<Integer> iops() {
        return Optional.ofNullable(this.iops);
    }
    /**
     * @return Size of the volume, in GBs.
     * 
     */
    public Integer sizeInGb() {
        return this.sizeInGb;
    }
    /**
     * @return volume type. Allowed values are &#39;gp2&#39;, &#39;io1&#39; and others.
     * 
     */
    public String volumeType() {
        return this.volumeType;
    }
    /**
     * @return Amount of volumes per instance in the master group.
     * 
     */
    public Optional<Integer> volumesPerInstance() {
        return Optional.ofNullable(this.volumesPerInstance);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MrScalarCoreEbsBlockDevice defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer iops;
        private Integer sizeInGb;
        private String volumeType;
        private @Nullable Integer volumesPerInstance;
        public Builder() {}
        public Builder(MrScalarCoreEbsBlockDevice defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.iops = defaults.iops;
    	      this.sizeInGb = defaults.sizeInGb;
    	      this.volumeType = defaults.volumeType;
    	      this.volumesPerInstance = defaults.volumesPerInstance;
        }

        @CustomType.Setter
        public Builder iops(@Nullable Integer iops) {
            this.iops = iops;
            return this;
        }
        @CustomType.Setter
        public Builder sizeInGb(Integer sizeInGb) {
            this.sizeInGb = Objects.requireNonNull(sizeInGb);
            return this;
        }
        @CustomType.Setter
        public Builder volumeType(String volumeType) {
            this.volumeType = Objects.requireNonNull(volumeType);
            return this;
        }
        @CustomType.Setter
        public Builder volumesPerInstance(@Nullable Integer volumesPerInstance) {
            this.volumesPerInstance = volumesPerInstance;
            return this;
        }
        public MrScalarCoreEbsBlockDevice build() {
            final var o = new MrScalarCoreEbsBlockDevice();
            o.iops = iops;
            o.sizeInGb = sizeInGb;
            o.volumeType = volumeType;
            o.volumesPerInstance = volumesPerInstance;
            return o;
        }
    }
}
