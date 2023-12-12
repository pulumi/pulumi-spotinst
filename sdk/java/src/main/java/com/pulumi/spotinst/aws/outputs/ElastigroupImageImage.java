// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ElastigroupImageImage {
    /**
     * @return The identifier of The S3 data integration to export the logs to.
     * 
     */
    private String id;

    private ElastigroupImageImage() {}
    /**
     * @return The identifier of The S3 data integration to export the logs to.
     * 
     */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ElastigroupImageImage defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        public Builder() {}
        public Builder(ElastigroupImageImage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public ElastigroupImageImage build() {
            final var _resultValue = new ElastigroupImageImage();
            _resultValue.id = id;
            return _resultValue;
        }
    }
}
