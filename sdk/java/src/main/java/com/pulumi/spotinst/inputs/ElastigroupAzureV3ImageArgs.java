// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.spotinst.inputs.ElastigroupAzureV3ImageCustomArgs;
import com.pulumi.spotinst.inputs.ElastigroupAzureV3ImageGalleryImageArgs;
import com.pulumi.spotinst.inputs.ElastigroupAzureV3ImageMarketplaceArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ElastigroupAzureV3ImageArgs extends com.pulumi.resources.ResourceArgs {

    public static final ElastigroupAzureV3ImageArgs Empty = new ElastigroupAzureV3ImageArgs();

    @Import(name="customs")
    private @Nullable Output<List<ElastigroupAzureV3ImageCustomArgs>> customs;

    public Optional<Output<List<ElastigroupAzureV3ImageCustomArgs>>> customs() {
        return Optional.ofNullable(this.customs);
    }

    @Import(name="galleryImages")
    private @Nullable Output<List<ElastigroupAzureV3ImageGalleryImageArgs>> galleryImages;

    public Optional<Output<List<ElastigroupAzureV3ImageGalleryImageArgs>>> galleryImages() {
        return Optional.ofNullable(this.galleryImages);
    }

    @Import(name="marketplaces")
    private @Nullable Output<List<ElastigroupAzureV3ImageMarketplaceArgs>> marketplaces;

    public Optional<Output<List<ElastigroupAzureV3ImageMarketplaceArgs>>> marketplaces() {
        return Optional.ofNullable(this.marketplaces);
    }

    private ElastigroupAzureV3ImageArgs() {}

    private ElastigroupAzureV3ImageArgs(ElastigroupAzureV3ImageArgs $) {
        this.customs = $.customs;
        this.galleryImages = $.galleryImages;
        this.marketplaces = $.marketplaces;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ElastigroupAzureV3ImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ElastigroupAzureV3ImageArgs $;

        public Builder() {
            $ = new ElastigroupAzureV3ImageArgs();
        }

        public Builder(ElastigroupAzureV3ImageArgs defaults) {
            $ = new ElastigroupAzureV3ImageArgs(Objects.requireNonNull(defaults));
        }

        public Builder customs(@Nullable Output<List<ElastigroupAzureV3ImageCustomArgs>> customs) {
            $.customs = customs;
            return this;
        }

        public Builder customs(List<ElastigroupAzureV3ImageCustomArgs> customs) {
            return customs(Output.of(customs));
        }

        public Builder customs(ElastigroupAzureV3ImageCustomArgs... customs) {
            return customs(List.of(customs));
        }

        public Builder galleryImages(@Nullable Output<List<ElastigroupAzureV3ImageGalleryImageArgs>> galleryImages) {
            $.galleryImages = galleryImages;
            return this;
        }

        public Builder galleryImages(List<ElastigroupAzureV3ImageGalleryImageArgs> galleryImages) {
            return galleryImages(Output.of(galleryImages));
        }

        public Builder galleryImages(ElastigroupAzureV3ImageGalleryImageArgs... galleryImages) {
            return galleryImages(List.of(galleryImages));
        }

        public Builder marketplaces(@Nullable Output<List<ElastigroupAzureV3ImageMarketplaceArgs>> marketplaces) {
            $.marketplaces = marketplaces;
            return this;
        }

        public Builder marketplaces(List<ElastigroupAzureV3ImageMarketplaceArgs> marketplaces) {
            return marketplaces(Output.of(marketplaces));
        }

        public Builder marketplaces(ElastigroupAzureV3ImageMarketplaceArgs... marketplaces) {
            return marketplaces(List.of(marketplaces));
        }

        public ElastigroupAzureV3ImageArgs build() {
            return $;
        }
    }

}
