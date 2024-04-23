// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MrScalarTaskEbsBlockDevice {
    private @Nullable Integer iops;
    private Integer sizeInGb;
    private String volumeType;
    private @Nullable Integer volumesPerInstance;

    private MrScalarTaskEbsBlockDevice() {}
    public Optional<Integer> iops() {
        return Optional.ofNullable(this.iops);
    }
    public Integer sizeInGb() {
        return this.sizeInGb;
    }
    public String volumeType() {
        return this.volumeType;
    }
    public Optional<Integer> volumesPerInstance() {
        return Optional.ofNullable(this.volumesPerInstance);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MrScalarTaskEbsBlockDevice defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer iops;
        private Integer sizeInGb;
        private String volumeType;
        private @Nullable Integer volumesPerInstance;
        public Builder() {}
        public Builder(MrScalarTaskEbsBlockDevice defaults) {
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
            if (sizeInGb == null) {
              throw new MissingRequiredPropertyException("MrScalarTaskEbsBlockDevice", "sizeInGb");
            }
            this.sizeInGb = sizeInGb;
            return this;
        }
        @CustomType.Setter
        public Builder volumeType(String volumeType) {
            if (volumeType == null) {
              throw new MissingRequiredPropertyException("MrScalarTaskEbsBlockDevice", "volumeType");
            }
            this.volumeType = volumeType;
            return this;
        }
        @CustomType.Setter
        public Builder volumesPerInstance(@Nullable Integer volumesPerInstance) {

            this.volumesPerInstance = volumesPerInstance;
            return this;
        }
        public MrScalarTaskEbsBlockDevice build() {
            final var _resultValue = new MrScalarTaskEbsBlockDevice();
            _resultValue.iops = iops;
            _resultValue.sizeInGb = sizeInGb;
            _resultValue.volumeType = volumeType;
            _resultValue.volumesPerInstance = volumesPerInstance;
            return _resultValue;
        }
    }
}
