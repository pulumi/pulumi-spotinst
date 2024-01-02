// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.azure.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class ElastigroupIntegrationMultaiRuntimeArgs extends com.pulumi.resources.ResourceArgs {

    public static final ElastigroupIntegrationMultaiRuntimeArgs Empty = new ElastigroupIntegrationMultaiRuntimeArgs();

    @Import(name="deploymentId", required=true)
    private Output<String> deploymentId;

    public Output<String> deploymentId() {
        return this.deploymentId;
    }

    private ElastigroupIntegrationMultaiRuntimeArgs() {}

    private ElastigroupIntegrationMultaiRuntimeArgs(ElastigroupIntegrationMultaiRuntimeArgs $) {
        this.deploymentId = $.deploymentId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ElastigroupIntegrationMultaiRuntimeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ElastigroupIntegrationMultaiRuntimeArgs $;

        public Builder() {
            $ = new ElastigroupIntegrationMultaiRuntimeArgs();
        }

        public Builder(ElastigroupIntegrationMultaiRuntimeArgs defaults) {
            $ = new ElastigroupIntegrationMultaiRuntimeArgs(Objects.requireNonNull(defaults));
        }

        public Builder deploymentId(Output<String> deploymentId) {
            $.deploymentId = deploymentId;
            return this;
        }

        public Builder deploymentId(String deploymentId) {
            return deploymentId(Output.of(deploymentId));
        }

        public ElastigroupIntegrationMultaiRuntimeArgs build() {
            if ($.deploymentId == null) {
                throw new MissingRequiredPropertyException("ElastigroupIntegrationMultaiRuntimeArgs", "deploymentId");
            }
            return $;
        }
    }

}
