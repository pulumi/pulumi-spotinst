// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class StatefulNodeAzureImageGallery {
    private String galleryName;
    private String galleryResourceGroupName;
    private String imageName;
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
        private String versionName;
        public Builder() {}
        public Builder(StatefulNodeAzureImageGallery defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.galleryName = defaults.galleryName;
    	      this.galleryResourceGroupName = defaults.galleryResourceGroupName;
    	      this.imageName = defaults.imageName;
    	      this.versionName = defaults.versionName;
        }

        @CustomType.Setter
        public Builder galleryName(String galleryName) {
            this.galleryName = Objects.requireNonNull(galleryName);
            return this;
        }
        @CustomType.Setter
        public Builder galleryResourceGroupName(String galleryResourceGroupName) {
            this.galleryResourceGroupName = Objects.requireNonNull(galleryResourceGroupName);
            return this;
        }
        @CustomType.Setter
        public Builder imageName(String imageName) {
            this.imageName = Objects.requireNonNull(imageName);
            return this;
        }
        @CustomType.Setter
        public Builder versionName(String versionName) {
            this.versionName = Objects.requireNonNull(versionName);
            return this;
        }
        public StatefulNodeAzureImageGallery build() {
            final var o = new StatefulNodeAzureImageGallery();
            o.galleryName = galleryName;
            o.galleryResourceGroupName = galleryResourceGroupName;
            o.imageName = imageName;
            o.versionName = versionName;
            return o;
        }
    }
}