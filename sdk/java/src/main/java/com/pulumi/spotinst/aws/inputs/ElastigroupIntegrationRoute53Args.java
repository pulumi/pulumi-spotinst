// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.spotinst.aws.inputs.ElastigroupIntegrationRoute53DomainArgs;
import java.util.List;
import java.util.Objects;


public final class ElastigroupIntegrationRoute53Args extends com.pulumi.resources.ResourceArgs {

    public static final ElastigroupIntegrationRoute53Args Empty = new ElastigroupIntegrationRoute53Args();

    @Import(name="domains", required=true)
    private Output<List<ElastigroupIntegrationRoute53DomainArgs>> domains;

    public Output<List<ElastigroupIntegrationRoute53DomainArgs>> domains() {
        return this.domains;
    }

    private ElastigroupIntegrationRoute53Args() {}

    private ElastigroupIntegrationRoute53Args(ElastigroupIntegrationRoute53Args $) {
        this.domains = $.domains;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ElastigroupIntegrationRoute53Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ElastigroupIntegrationRoute53Args $;

        public Builder() {
            $ = new ElastigroupIntegrationRoute53Args();
        }

        public Builder(ElastigroupIntegrationRoute53Args defaults) {
            $ = new ElastigroupIntegrationRoute53Args(Objects.requireNonNull(defaults));
        }

        public Builder domains(Output<List<ElastigroupIntegrationRoute53DomainArgs>> domains) {
            $.domains = domains;
            return this;
        }

        public Builder domains(List<ElastigroupIntegrationRoute53DomainArgs> domains) {
            return domains(Output.of(domains));
        }

        public Builder domains(ElastigroupIntegrationRoute53DomainArgs... domains) {
            return domains(List.of(domains));
        }

        public ElastigroupIntegrationRoute53Args build() {
            if ($.domains == null) {
                throw new MissingRequiredPropertyException("ElastigroupIntegrationRoute53Args", "domains");
            }
            return $;
        }
    }

}
