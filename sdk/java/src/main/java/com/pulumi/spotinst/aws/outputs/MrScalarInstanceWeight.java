// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class MrScalarInstanceWeight {
    private String instanceType;
    private Integer weightedCapacity;

    private MrScalarInstanceWeight() {}
    public String instanceType() {
        return this.instanceType;
    }
    public Integer weightedCapacity() {
        return this.weightedCapacity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MrScalarInstanceWeight defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String instanceType;
        private Integer weightedCapacity;
        public Builder() {}
        public Builder(MrScalarInstanceWeight defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceType = defaults.instanceType;
    	      this.weightedCapacity = defaults.weightedCapacity;
        }

        @CustomType.Setter
        public Builder instanceType(String instanceType) {
            if (instanceType == null) {
              throw new MissingRequiredPropertyException("MrScalarInstanceWeight", "instanceType");
            }
            this.instanceType = instanceType;
            return this;
        }
        @CustomType.Setter
        public Builder weightedCapacity(Integer weightedCapacity) {
            if (weightedCapacity == null) {
              throw new MissingRequiredPropertyException("MrScalarInstanceWeight", "weightedCapacity");
            }
            this.weightedCapacity = weightedCapacity;
            return this;
        }
        public MrScalarInstanceWeight build() {
            final var _resultValue = new MrScalarInstanceWeight();
            _resultValue.instanceType = instanceType;
            _resultValue.weightedCapacity = weightedCapacity;
            return _resultValue;
        }
    }
}