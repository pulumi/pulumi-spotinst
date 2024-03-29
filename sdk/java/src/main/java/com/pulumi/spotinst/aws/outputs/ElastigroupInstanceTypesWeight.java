// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ElastigroupInstanceTypesWeight {
    /**
     * @return Name of instance type (String).
     * 
     */
    private String instanceType;
    /**
     * @return Weight per instance type (Integer).
     * 
     */
    private Integer weight;

    private ElastigroupInstanceTypesWeight() {}
    /**
     * @return Name of instance type (String).
     * 
     */
    public String instanceType() {
        return this.instanceType;
    }
    /**
     * @return Weight per instance type (Integer).
     * 
     */
    public Integer weight() {
        return this.weight;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ElastigroupInstanceTypesWeight defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String instanceType;
        private Integer weight;
        public Builder() {}
        public Builder(ElastigroupInstanceTypesWeight defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceType = defaults.instanceType;
    	      this.weight = defaults.weight;
        }

        @CustomType.Setter
        public Builder instanceType(String instanceType) {
            if (instanceType == null) {
              throw new MissingRequiredPropertyException("ElastigroupInstanceTypesWeight", "instanceType");
            }
            this.instanceType = instanceType;
            return this;
        }
        @CustomType.Setter
        public Builder weight(Integer weight) {
            if (weight == null) {
              throw new MissingRequiredPropertyException("ElastigroupInstanceTypesWeight", "weight");
            }
            this.weight = weight;
            return this;
        }
        public ElastigroupInstanceTypesWeight build() {
            final var _resultValue = new ElastigroupInstanceTypesWeight();
            _resultValue.instanceType = instanceType;
            _resultValue.weight = weight;
            return _resultValue;
        }
    }
}
