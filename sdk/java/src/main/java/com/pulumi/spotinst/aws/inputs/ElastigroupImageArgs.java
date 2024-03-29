// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.spotinst.aws.inputs.ElastigroupImageImageArgs;
import java.util.List;
import java.util.Objects;


public final class ElastigroupImageArgs extends com.pulumi.resources.ResourceArgs {

    public static final ElastigroupImageArgs Empty = new ElastigroupImageArgs();

    @Import(name="images", required=true)
    private Output<List<ElastigroupImageImageArgs>> images;

    public Output<List<ElastigroupImageImageArgs>> images() {
        return this.images;
    }

    private ElastigroupImageArgs() {}

    private ElastigroupImageArgs(ElastigroupImageArgs $) {
        this.images = $.images;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ElastigroupImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ElastigroupImageArgs $;

        public Builder() {
            $ = new ElastigroupImageArgs();
        }

        public Builder(ElastigroupImageArgs defaults) {
            $ = new ElastigroupImageArgs(Objects.requireNonNull(defaults));
        }

        public Builder images(Output<List<ElastigroupImageImageArgs>> images) {
            $.images = images;
            return this;
        }

        public Builder images(List<ElastigroupImageImageArgs> images) {
            return images(Output.of(images));
        }

        public Builder images(ElastigroupImageImageArgs... images) {
            return images(List.of(images));
        }

        public ElastigroupImageArgs build() {
            if ($.images == null) {
                throw new MissingRequiredPropertyException("ElastigroupImageArgs", "images");
            }
            return $;
        }
    }

}
