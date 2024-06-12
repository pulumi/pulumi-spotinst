// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class StatefulNodeAzureImageGallery {
    private String galleryName;
    private String galleryResourceGroupName;
    private String imageName;
    private @Nullable String spotAccountId;
    private String versionName;

    private StatefulNodeAzureImageGallery() {}
    public String galleryName() {
        return this.galleryName;
    }
    public String galleryResourceGroupName() {
        return this.galleryResourceGroupName;
    }
    public String imageName() {
        return this.imageName;
    }
    public Optional<String> spotAccountId() {
        return Optional.ofNullable(this.spotAccountId);
    }
    public String versionName() {
        return this.versionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StatefulNodeAzureImageGallery defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String galleryName;
        private String galleryResourceGroupName;
        private String imageName;
        private @Nullable String spotAccountId;
        private String versionName;
        public Builder() {}
        public Builder(StatefulNodeAzureImageGallery defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.galleryName = defaults.galleryName;
    	      this.galleryResourceGroupName = defaults.galleryResourceGroupName;
    	      this.imageName = defaults.imageName;
    	      this.spotAccountId = defaults.spotAccountId;
    	      this.versionName = defaults.versionName;
        }

        @CustomType.Setter
        public Builder galleryName(String galleryName) {
            if (galleryName == null) {
              throw new MissingRequiredPropertyException("StatefulNodeAzureImageGallery", "galleryName");
            }
            this.galleryName = galleryName;
            return this;
        }
        @CustomType.Setter
        public Builder galleryResourceGroupName(String galleryResourceGroupName) {
            if (galleryResourceGroupName == null) {
              throw new MissingRequiredPropertyException("StatefulNodeAzureImageGallery", "galleryResourceGroupName");
            }
            this.galleryResourceGroupName = galleryResourceGroupName;
            return this;
        }
        @CustomType.Setter
        public Builder imageName(String imageName) {
            if (imageName == null) {
              throw new MissingRequiredPropertyException("StatefulNodeAzureImageGallery", "imageName");
            }
            this.imageName = imageName;
            return this;
        }
        @CustomType.Setter
        public Builder spotAccountId(@Nullable String spotAccountId) {

            this.spotAccountId = spotAccountId;
            return this;
        }
        @CustomType.Setter
        public Builder versionName(String versionName) {
            if (versionName == null) {
              throw new MissingRequiredPropertyException("StatefulNodeAzureImageGallery", "versionName");
            }
            this.versionName = versionName;
            return this;
        }
        public StatefulNodeAzureImageGallery build() {
            final var _resultValue = new StatefulNodeAzureImageGallery();
            _resultValue.galleryName = galleryName;
            _resultValue.galleryResourceGroupName = galleryResourceGroupName;
            _resultValue.imageName = imageName;
            _resultValue.spotAccountId = spotAccountId;
            _resultValue.versionName = versionName;
            return _resultValue;
        }
    }
}
