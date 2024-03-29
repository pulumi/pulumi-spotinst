// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.azure.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.spotinst.azure.inputs.OceanImageMarketplaceArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OceanImageArgs extends com.pulumi.resources.ResourceArgs {

    public static final OceanImageArgs Empty = new OceanImageArgs();

    /**
     * Select an image from Azure&#39;s Marketplace image catalogue.
     * 
     */
    @Import(name="marketplaces")
    private @Nullable Output<List<OceanImageMarketplaceArgs>> marketplaces;

    /**
     * @return Select an image from Azure&#39;s Marketplace image catalogue.
     * 
     */
    public Optional<Output<List<OceanImageMarketplaceArgs>>> marketplaces() {
        return Optional.ofNullable(this.marketplaces);
    }

    private OceanImageArgs() {}

    private OceanImageArgs(OceanImageArgs $) {
        this.marketplaces = $.marketplaces;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OceanImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OceanImageArgs $;

        public Builder() {
            $ = new OceanImageArgs();
        }

        public Builder(OceanImageArgs defaults) {
            $ = new OceanImageArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param marketplaces Select an image from Azure&#39;s Marketplace image catalogue.
         * 
         * @return builder
         * 
         */
        public Builder marketplaces(@Nullable Output<List<OceanImageMarketplaceArgs>> marketplaces) {
            $.marketplaces = marketplaces;
            return this;
        }

        /**
         * @param marketplaces Select an image from Azure&#39;s Marketplace image catalogue.
         * 
         * @return builder
         * 
         */
        public Builder marketplaces(List<OceanImageMarketplaceArgs> marketplaces) {
            return marketplaces(Output.of(marketplaces));
        }

        /**
         * @param marketplaces Select an image from Azure&#39;s Marketplace image catalogue.
         * 
         * @return builder
         * 
         */
        public Builder marketplaces(OceanImageMarketplaceArgs... marketplaces) {
            return marketplaces(List.of(marketplaces));
        }

        public OceanImageArgs build() {
            return $;
        }
    }

}
