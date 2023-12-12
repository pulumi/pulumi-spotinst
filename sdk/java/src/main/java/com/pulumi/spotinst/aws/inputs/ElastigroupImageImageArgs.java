// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ElastigroupImageImageArgs extends com.pulumi.resources.ResourceArgs {

    public static final ElastigroupImageImageArgs Empty = new ElastigroupImageImageArgs();

    /**
     * The identifier of The S3 data integration to export the logs to.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return The identifier of The S3 data integration to export the logs to.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    private ElastigroupImageImageArgs() {}

    private ElastigroupImageImageArgs(ElastigroupImageImageArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ElastigroupImageImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ElastigroupImageImageArgs $;

        public Builder() {
            $ = new ElastigroupImageImageArgs();
        }

        public Builder(ElastigroupImageImageArgs defaults) {
            $ = new ElastigroupImageImageArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The identifier of The S3 data integration to export the logs to.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The identifier of The S3 data integration to export the logs to.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public ElastigroupImageImageArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
