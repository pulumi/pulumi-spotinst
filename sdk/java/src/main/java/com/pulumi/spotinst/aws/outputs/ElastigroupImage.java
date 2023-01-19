// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.spotinst.aws.outputs.ElastigroupImageImage;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ElastigroupImage {
    private List<ElastigroupImageImage> images;

    private ElastigroupImage() {}
    public List<ElastigroupImageImage> images() {
        return this.images;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ElastigroupImage defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<ElastigroupImageImage> images;
        public Builder() {}
        public Builder(ElastigroupImage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.images = defaults.images;
        }

        @CustomType.Setter
        public Builder images(List<ElastigroupImageImage> images) {
            this.images = Objects.requireNonNull(images);
            return this;
        }
        public Builder images(ElastigroupImageImage... images) {
            return images(List.of(images));
        }
        public ElastigroupImage build() {
            final var o = new ElastigroupImage();
            o.images = images;
            return o;
        }
    }
}