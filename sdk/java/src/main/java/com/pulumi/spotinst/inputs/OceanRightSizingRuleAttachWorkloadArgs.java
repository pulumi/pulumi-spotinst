// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.spotinst.inputs.OceanRightSizingRuleAttachWorkloadNamespaceArgs;
import java.util.List;
import java.util.Objects;


public final class OceanRightSizingRuleAttachWorkloadArgs extends com.pulumi.resources.ResourceArgs {

    public static final OceanRightSizingRuleAttachWorkloadArgs Empty = new OceanRightSizingRuleAttachWorkloadArgs();

    @Import(name="namespaces", required=true)
    private Output<List<OceanRightSizingRuleAttachWorkloadNamespaceArgs>> namespaces;

    public Output<List<OceanRightSizingRuleAttachWorkloadNamespaceArgs>> namespaces() {
        return this.namespaces;
    }

    private OceanRightSizingRuleAttachWorkloadArgs() {}

    private OceanRightSizingRuleAttachWorkloadArgs(OceanRightSizingRuleAttachWorkloadArgs $) {
        this.namespaces = $.namespaces;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OceanRightSizingRuleAttachWorkloadArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OceanRightSizingRuleAttachWorkloadArgs $;

        public Builder() {
            $ = new OceanRightSizingRuleAttachWorkloadArgs();
        }

        public Builder(OceanRightSizingRuleAttachWorkloadArgs defaults) {
            $ = new OceanRightSizingRuleAttachWorkloadArgs(Objects.requireNonNull(defaults));
        }

        public Builder namespaces(Output<List<OceanRightSizingRuleAttachWorkloadNamespaceArgs>> namespaces) {
            $.namespaces = namespaces;
            return this;
        }

        public Builder namespaces(List<OceanRightSizingRuleAttachWorkloadNamespaceArgs> namespaces) {
            return namespaces(Output.of(namespaces));
        }

        public Builder namespaces(OceanRightSizingRuleAttachWorkloadNamespaceArgs... namespaces) {
            return namespaces(List.of(namespaces));
        }

        public OceanRightSizingRuleAttachWorkloadArgs build() {
            if ($.namespaces == null) {
                throw new MissingRequiredPropertyException("OceanRightSizingRuleAttachWorkloadArgs", "namespaces");
            }
            return $;
        }
    }

}
