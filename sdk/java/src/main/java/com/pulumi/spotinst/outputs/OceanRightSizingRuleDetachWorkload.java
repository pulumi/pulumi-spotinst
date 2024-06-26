// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.spotinst.outputs.OceanRightSizingRuleDetachWorkloadNamespace;
import java.util.List;
import java.util.Objects;

@CustomType
public final class OceanRightSizingRuleDetachWorkload {
    private List<OceanRightSizingRuleDetachWorkloadNamespace> namespaces;

    private OceanRightSizingRuleDetachWorkload() {}
    public List<OceanRightSizingRuleDetachWorkloadNamespace> namespaces() {
        return this.namespaces;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OceanRightSizingRuleDetachWorkload defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<OceanRightSizingRuleDetachWorkloadNamespace> namespaces;
        public Builder() {}
        public Builder(OceanRightSizingRuleDetachWorkload defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.namespaces = defaults.namespaces;
        }

        @CustomType.Setter
        public Builder namespaces(List<OceanRightSizingRuleDetachWorkloadNamespace> namespaces) {
            if (namespaces == null) {
              throw new MissingRequiredPropertyException("OceanRightSizingRuleDetachWorkload", "namespaces");
            }
            this.namespaces = namespaces;
            return this;
        }
        public Builder namespaces(OceanRightSizingRuleDetachWorkloadNamespace... namespaces) {
            return namespaces(List.of(namespaces));
        }
        public OceanRightSizingRuleDetachWorkload build() {
            final var _resultValue = new OceanRightSizingRuleDetachWorkload();
            _resultValue.namespaces = namespaces;
            return _resultValue;
        }
    }
}
