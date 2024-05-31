// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.gcp.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ElastigroupSubnet {
    /**
     * @return The region for the group of subnets.
     * 
     */
    private String region;
    /**
     * @return The names of the subnets in the region.
     * 
     */
    private List<String> subnetNames;

    private ElastigroupSubnet() {}
    /**
     * @return The region for the group of subnets.
     * 
     */
    public String region() {
        return this.region;
    }
    /**
     * @return The names of the subnets in the region.
     * 
     */
    public List<String> subnetNames() {
        return this.subnetNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ElastigroupSubnet defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String region;
        private List<String> subnetNames;
        public Builder() {}
        public Builder(ElastigroupSubnet defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.region = defaults.region;
    	      this.subnetNames = defaults.subnetNames;
        }

        @CustomType.Setter
        public Builder region(String region) {
            if (region == null) {
              throw new MissingRequiredPropertyException("ElastigroupSubnet", "region");
            }
            this.region = region;
            return this;
        }
        @CustomType.Setter
        public Builder subnetNames(List<String> subnetNames) {
            if (subnetNames == null) {
              throw new MissingRequiredPropertyException("ElastigroupSubnet", "subnetNames");
            }
            this.subnetNames = subnetNames;
            return this;
        }
        public Builder subnetNames(String... subnetNames) {
            return subnetNames(List.of(subnetNames));
        }
        public ElastigroupSubnet build() {
            final var _resultValue = new ElastigroupSubnet();
            _resultValue.region = region;
            _resultValue.subnetNames = subnetNames;
            return _resultValue;
        }
    }
}