// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.azure.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OceanImageMarketplaceArgs extends com.pulumi.resources.ResourceArgs {

    public static final OceanImageMarketplaceArgs Empty = new OceanImageMarketplaceArgs();

    /**
     * Image name.
     * 
     */
    @Import(name="offer")
    private @Nullable Output<String> offer;

    /**
     * @return Image name.
     * 
     */
    public Optional<Output<String>> offer() {
        return Optional.ofNullable(this.offer);
    }

    /**
     * Image publisher.
     * 
     */
    @Import(name="publisher")
    private @Nullable Output<String> publisher;

    /**
     * @return Image publisher.
     * 
     */
    public Optional<Output<String>> publisher() {
        return Optional.ofNullable(this.publisher);
    }

    /**
     * Image Stock Keeping Unit (which is the specific version of the image).
     * 
     */
    @Import(name="sku")
    private @Nullable Output<String> sku;

    /**
     * @return Image Stock Keeping Unit (which is the specific version of the image).
     * 
     */
    public Optional<Output<String>> sku() {
        return Optional.ofNullable(this.sku);
    }

    /**
     * Image version.
     * 
     */
    @Import(name="version")
    private @Nullable Output<String> version;

    /**
     * @return Image version.
     * 
     */
    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    private OceanImageMarketplaceArgs() {}

    private OceanImageMarketplaceArgs(OceanImageMarketplaceArgs $) {
        this.offer = $.offer;
        this.publisher = $.publisher;
        this.sku = $.sku;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OceanImageMarketplaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OceanImageMarketplaceArgs $;

        public Builder() {
            $ = new OceanImageMarketplaceArgs();
        }

        public Builder(OceanImageMarketplaceArgs defaults) {
            $ = new OceanImageMarketplaceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param offer Image name.
         * 
         * @return builder
         * 
         */
        public Builder offer(@Nullable Output<String> offer) {
            $.offer = offer;
            return this;
        }

        /**
         * @param offer Image name.
         * 
         * @return builder
         * 
         */
        public Builder offer(String offer) {
            return offer(Output.of(offer));
        }

        /**
         * @param publisher Image publisher.
         * 
         * @return builder
         * 
         */
        public Builder publisher(@Nullable Output<String> publisher) {
            $.publisher = publisher;
            return this;
        }

        /**
         * @param publisher Image publisher.
         * 
         * @return builder
         * 
         */
        public Builder publisher(String publisher) {
            return publisher(Output.of(publisher));
        }

        /**
         * @param sku Image Stock Keeping Unit (which is the specific version of the image).
         * 
         * @return builder
         * 
         */
        public Builder sku(@Nullable Output<String> sku) {
            $.sku = sku;
            return this;
        }

        /**
         * @param sku Image Stock Keeping Unit (which is the specific version of the image).
         * 
         * @return builder
         * 
         */
        public Builder sku(String sku) {
            return sku(Output.of(sku));
        }

        /**
         * @param version Image version.
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version Image version.
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        public OceanImageMarketplaceArgs build() {
            return $;
        }
    }

}
