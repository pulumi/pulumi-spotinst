// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class ElastigroupAzureV3ImageMarketplaceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ElastigroupAzureV3ImageMarketplaceArgs Empty = new ElastigroupAzureV3ImageMarketplaceArgs();

    @Import(name="offer", required=true)
    private Output<String> offer;

    public Output<String> offer() {
        return this.offer;
    }

    @Import(name="publisher", required=true)
    private Output<String> publisher;

    public Output<String> publisher() {
        return this.publisher;
    }

    @Import(name="sku", required=true)
    private Output<String> sku;

    public Output<String> sku() {
        return this.sku;
    }

    @Import(name="version", required=true)
    private Output<String> version;

    public Output<String> version() {
        return this.version;
    }

    private ElastigroupAzureV3ImageMarketplaceArgs() {}

    private ElastigroupAzureV3ImageMarketplaceArgs(ElastigroupAzureV3ImageMarketplaceArgs $) {
        this.offer = $.offer;
        this.publisher = $.publisher;
        this.sku = $.sku;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ElastigroupAzureV3ImageMarketplaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ElastigroupAzureV3ImageMarketplaceArgs $;

        public Builder() {
            $ = new ElastigroupAzureV3ImageMarketplaceArgs();
        }

        public Builder(ElastigroupAzureV3ImageMarketplaceArgs defaults) {
            $ = new ElastigroupAzureV3ImageMarketplaceArgs(Objects.requireNonNull(defaults));
        }

        public Builder offer(Output<String> offer) {
            $.offer = offer;
            return this;
        }

        public Builder offer(String offer) {
            return offer(Output.of(offer));
        }

        public Builder publisher(Output<String> publisher) {
            $.publisher = publisher;
            return this;
        }

        public Builder publisher(String publisher) {
            return publisher(Output.of(publisher));
        }

        public Builder sku(Output<String> sku) {
            $.sku = sku;
            return this;
        }

        public Builder sku(String sku) {
            return sku(Output.of(sku));
        }

        public Builder version(Output<String> version) {
            $.version = version;
            return this;
        }

        public Builder version(String version) {
            return version(Output.of(version));
        }

        public ElastigroupAzureV3ImageMarketplaceArgs build() {
            if ($.offer == null) {
                throw new MissingRequiredPropertyException("ElastigroupAzureV3ImageMarketplaceArgs", "offer");
            }
            if ($.publisher == null) {
                throw new MissingRequiredPropertyException("ElastigroupAzureV3ImageMarketplaceArgs", "publisher");
            }
            if ($.sku == null) {
                throw new MissingRequiredPropertyException("ElastigroupAzureV3ImageMarketplaceArgs", "sku");
            }
            if ($.version == null) {
                throw new MissingRequiredPropertyException("ElastigroupAzureV3ImageMarketplaceArgs", "version");
            }
            return $;
        }
    }

}
