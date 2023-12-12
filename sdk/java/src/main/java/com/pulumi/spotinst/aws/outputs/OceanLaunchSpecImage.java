// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OceanLaunchSpecImage {
    /**
     * @return Identifier of the image in AWS. Valid values: any string which is not empty or null.
     * 
     */
    private @Nullable String imageId;

    private OceanLaunchSpecImage() {}
    /**
     * @return Identifier of the image in AWS. Valid values: any string which is not empty or null.
     * 
     */
    public Optional<String> imageId() {
        return Optional.ofNullable(this.imageId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OceanLaunchSpecImage defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String imageId;
        public Builder() {}
        public Builder(OceanLaunchSpecImage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.imageId = defaults.imageId;
        }

        @CustomType.Setter
        public Builder imageId(@Nullable String imageId) {
            this.imageId = imageId;
            return this;
        }
        public OceanLaunchSpecImage build() {
            final var _resultValue = new OceanLaunchSpecImage();
            _resultValue.imageId = imageId;
            return _resultValue;
        }
    }
}
