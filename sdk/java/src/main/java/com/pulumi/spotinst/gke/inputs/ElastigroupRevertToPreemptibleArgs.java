// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.gke.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class ElastigroupRevertToPreemptibleArgs extends com.pulumi.resources.ResourceArgs {

    public static final ElastigroupRevertToPreemptibleArgs Empty = new ElastigroupRevertToPreemptibleArgs();

    @Import(name="performAt", required=true)
    private Output<String> performAt;

    public Output<String> performAt() {
        return this.performAt;
    }

    private ElastigroupRevertToPreemptibleArgs() {}

    private ElastigroupRevertToPreemptibleArgs(ElastigroupRevertToPreemptibleArgs $) {
        this.performAt = $.performAt;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ElastigroupRevertToPreemptibleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ElastigroupRevertToPreemptibleArgs $;

        public Builder() {
            $ = new ElastigroupRevertToPreemptibleArgs();
        }

        public Builder(ElastigroupRevertToPreemptibleArgs defaults) {
            $ = new ElastigroupRevertToPreemptibleArgs(Objects.requireNonNull(defaults));
        }

        public Builder performAt(Output<String> performAt) {
            $.performAt = performAt;
            return this;
        }

        public Builder performAt(String performAt) {
            return performAt(Output.of(performAt));
        }

        public ElastigroupRevertToPreemptibleArgs build() {
            if ($.performAt == null) {
                throw new MissingRequiredPropertyException("ElastigroupRevertToPreemptibleArgs", "performAt");
            }
            return $;
        }
    }

}