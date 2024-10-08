// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.spotinst.outputs.OceanRightSizingRuleAttachWorkloadNamespace;
import java.util.List;
import java.util.Objects;

@CustomType
public final class OceanRightSizingRuleAttachWorkload {
    private List<OceanRightSizingRuleAttachWorkloadNamespace> namespaces;

    private OceanRightSizingRuleAttachWorkload() {}
    public List<OceanRightSizingRuleAttachWorkloadNamespace> namespaces() {
        return this.namespaces;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OceanRightSizingRuleAttachWorkload defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<OceanRightSizingRuleAttachWorkloadNamespace> namespaces;
        public Builder() {}
        public Builder(OceanRightSizingRuleAttachWorkload defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.namespaces = defaults.namespaces;
        }

        @CustomType.Setter
        public Builder namespaces(List<OceanRightSizingRuleAttachWorkloadNamespace> namespaces) {
            if (namespaces == null) {
              throw new MissingRequiredPropertyException("OceanRightSizingRuleAttachWorkload", "namespaces");
            }
            this.namespaces = namespaces;
            return this;
        }
        public Builder namespaces(OceanRightSizingRuleAttachWorkloadNamespace... namespaces) {
            return namespaces(List.of(namespaces));
        }
        public OceanRightSizingRuleAttachWorkload build() {
            final var _resultValue = new OceanRightSizingRuleAttachWorkload();
            _resultValue.namespaces = namespaces;
            return _resultValue;
        }
    }
}