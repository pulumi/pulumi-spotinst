// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OceanRightSizingRuleDetachWorkloadNamespaceWorkload {
    private @Nullable String regexName;
    private @Nullable String workloadName;
    private String workloadType;

    private OceanRightSizingRuleDetachWorkloadNamespaceWorkload() {}
    public Optional<String> regexName() {
        return Optional.ofNullable(this.regexName);
    }
    public Optional<String> workloadName() {
        return Optional.ofNullable(this.workloadName);
    }
    public String workloadType() {
        return this.workloadType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OceanRightSizingRuleDetachWorkloadNamespaceWorkload defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String regexName;
        private @Nullable String workloadName;
        private String workloadType;
        public Builder() {}
        public Builder(OceanRightSizingRuleDetachWorkloadNamespaceWorkload defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.regexName = defaults.regexName;
    	      this.workloadName = defaults.workloadName;
    	      this.workloadType = defaults.workloadType;
        }

        @CustomType.Setter
        public Builder regexName(@Nullable String regexName) {

            this.regexName = regexName;
            return this;
        }
        @CustomType.Setter
        public Builder workloadName(@Nullable String workloadName) {

            this.workloadName = workloadName;
            return this;
        }
        @CustomType.Setter
        public Builder workloadType(String workloadType) {
            if (workloadType == null) {
              throw new MissingRequiredPropertyException("OceanRightSizingRuleDetachWorkloadNamespaceWorkload", "workloadType");
            }
            this.workloadType = workloadType;
            return this;
        }
        public OceanRightSizingRuleDetachWorkloadNamespaceWorkload build() {
            final var _resultValue = new OceanRightSizingRuleDetachWorkloadNamespaceWorkload();
            _resultValue.regexName = regexName;
            _resultValue.workloadName = workloadName;
            _resultValue.workloadType = workloadType;
            return _resultValue;
        }
    }
}
