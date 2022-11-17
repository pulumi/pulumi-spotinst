// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.azure.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ElastigroupImageMarketplaceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ElastigroupImageMarketplaceArgs Empty = new ElastigroupImageMarketplaceArgs();

    /**
     * Name of the image to use. Required if publisher is specified.
     * 
     */
    @Import(name="offer", required=true)
    private Output<String> offer;

    /**
     * @return Name of the image to use. Required if publisher is specified.
     * 
     */
    public Output<String> offer() {
        return this.offer;
    }

    /**
     * Image publisher. Required if resource_group_name is not specified.
     * 
     */
    @Import(name="publisher", required=true)
    private Output<String> publisher;

    /**
     * @return Image publisher. Required if resource_group_name is not specified.
     * 
     */
    public Output<String> publisher() {
        return this.publisher;
    }

    /**
     * Image&#39;s Stock Keeping Unit, which is the specific version of the image. Required if publisher is specified.
     * 
     */
    @Import(name="sku", required=true)
    private Output<String> sku;

    /**
     * @return Image&#39;s Stock Keeping Unit, which is the specific version of the image. Required if publisher is specified.
     * 
     */
    public Output<String> sku() {
        return this.sku;
    }

    private ElastigroupImageMarketplaceArgs() {}

    private ElastigroupImageMarketplaceArgs(ElastigroupImageMarketplaceArgs $) {
        this.offer = $.offer;
        this.publisher = $.publisher;
        this.sku = $.sku;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ElastigroupImageMarketplaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ElastigroupImageMarketplaceArgs $;

        public Builder() {
            $ = new ElastigroupImageMarketplaceArgs();
        }

        public Builder(ElastigroupImageMarketplaceArgs defaults) {
            $ = new ElastigroupImageMarketplaceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param offer Name of the image to use. Required if publisher is specified.
         * 
         * @return builder
         * 
         */
        public Builder offer(Output<String> offer) {
            $.offer = offer;
            return this;
        }

        /**
         * @param offer Name of the image to use. Required if publisher is specified.
         * 
         * @return builder
         * 
         */
        public Builder offer(String offer) {
            return offer(Output.of(offer));
        }

        /**
         * @param publisher Image publisher. Required if resource_group_name is not specified.
         * 
         * @return builder
         * 
         */
        public Builder publisher(Output<String> publisher) {
            $.publisher = publisher;
            return this;
        }

        /**
         * @param publisher Image publisher. Required if resource_group_name is not specified.
         * 
         * @return builder
         * 
         */
        public Builder publisher(String publisher) {
            return publisher(Output.of(publisher));
        }

        /**
         * @param sku Image&#39;s Stock Keeping Unit, which is the specific version of the image. Required if publisher is specified.
         * 
         * @return builder
         * 
         */
        public Builder sku(Output<String> sku) {
            $.sku = sku;
            return this;
        }

        /**
         * @param sku Image&#39;s Stock Keeping Unit, which is the specific version of the image. Required if publisher is specified.
         * 
         * @return builder
         * 
         */
        public Builder sku(String sku) {
            return sku(Output.of(sku));
        }

        public ElastigroupImageMarketplaceArgs build() {
            $.offer = Objects.requireNonNull($.offer, "expected parameter 'offer' to be non-null");
            $.publisher = Objects.requireNonNull($.publisher, "expected parameter 'publisher' to be non-null");
            $.sku = Objects.requireNonNull($.sku, "expected parameter 'sku' to be non-null");
            return $;
        }
    }

}
