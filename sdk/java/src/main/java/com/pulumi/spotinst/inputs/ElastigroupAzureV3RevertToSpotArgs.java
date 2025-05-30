// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class ElastigroupAzureV3RevertToSpotArgs extends com.pulumi.resources.ResourceArgs {

    public static final ElastigroupAzureV3RevertToSpotArgs Empty = new ElastigroupAzureV3RevertToSpotArgs();

    @Import(name="performAt", required=true)
    private Output<String> performAt;

    public Output<String> performAt() {
        return this.performAt;
    }

    private ElastigroupAzureV3RevertToSpotArgs() {}

    private ElastigroupAzureV3RevertToSpotArgs(ElastigroupAzureV3RevertToSpotArgs $) {
        this.performAt = $.performAt;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ElastigroupAzureV3RevertToSpotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ElastigroupAzureV3RevertToSpotArgs $;

        public Builder() {
            $ = new ElastigroupAzureV3RevertToSpotArgs();
        }

        public Builder(ElastigroupAzureV3RevertToSpotArgs defaults) {
            $ = new ElastigroupAzureV3RevertToSpotArgs(Objects.requireNonNull(defaults));
        }

        public Builder performAt(Output<String> performAt) {
            $.performAt = performAt;
            return this;
        }

        public Builder performAt(String performAt) {
            return performAt(Output.of(performAt));
        }

        public ElastigroupAzureV3RevertToSpotArgs build() {
            if ($.performAt == null) {
                throw new MissingRequiredPropertyException("ElastigroupAzureV3RevertToSpotArgs", "performAt");
            }
            return $;
        }
    }

}
