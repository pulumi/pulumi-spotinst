// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.spotinst.outputs.ElastigroupAzureV3ImageCustom;
import com.pulumi.spotinst.outputs.ElastigroupAzureV3ImageGalleryImage;
import com.pulumi.spotinst.outputs.ElastigroupAzureV3ImageMarketplace;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ElastigroupAzureV3Image {
    private @Nullable List<ElastigroupAzureV3ImageCustom> customs;
    private @Nullable List<ElastigroupAzureV3ImageGalleryImage> galleryImages;
    private @Nullable List<ElastigroupAzureV3ImageMarketplace> marketplaces;

    private ElastigroupAzureV3Image() {}
    public List<ElastigroupAzureV3ImageCustom> customs() {
        return this.customs == null ? List.of() : this.customs;
    }
    public List<ElastigroupAzureV3ImageGalleryImage> galleryImages() {
        return this.galleryImages == null ? List.of() : this.galleryImages;
    }
    public List<ElastigroupAzureV3ImageMarketplace> marketplaces() {
        return this.marketplaces == null ? List.of() : this.marketplaces;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ElastigroupAzureV3Image defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<ElastigroupAzureV3ImageCustom> customs;
        private @Nullable List<ElastigroupAzureV3ImageGalleryImage> galleryImages;
        private @Nullable List<ElastigroupAzureV3ImageMarketplace> marketplaces;
        public Builder() {}
        public Builder(ElastigroupAzureV3Image defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customs = defaults.customs;
    	      this.galleryImages = defaults.galleryImages;
    	      this.marketplaces = defaults.marketplaces;
        }

        @CustomType.Setter
        public Builder customs(@Nullable List<ElastigroupAzureV3ImageCustom> customs) {

            this.customs = customs;
            return this;
        }
        public Builder customs(ElastigroupAzureV3ImageCustom... customs) {
            return customs(List.of(customs));
        }
        @CustomType.Setter
        public Builder galleryImages(@Nullable List<ElastigroupAzureV3ImageGalleryImage> galleryImages) {

            this.galleryImages = galleryImages;
            return this;
        }
        public Builder galleryImages(ElastigroupAzureV3ImageGalleryImage... galleryImages) {
            return galleryImages(List.of(galleryImages));
        }
        @CustomType.Setter
        public Builder marketplaces(@Nullable List<ElastigroupAzureV3ImageMarketplace> marketplaces) {

            this.marketplaces = marketplaces;
            return this;
        }
        public Builder marketplaces(ElastigroupAzureV3ImageMarketplace... marketplaces) {
            return marketplaces(List.of(marketplaces));
        }
        public ElastigroupAzureV3Image build() {
            final var _resultValue = new ElastigroupAzureV3Image();
            _resultValue.customs = customs;
            _resultValue.galleryImages = galleryImages;
            _resultValue.marketplaces = marketplaces;
            return _resultValue;
        }
    }
}
