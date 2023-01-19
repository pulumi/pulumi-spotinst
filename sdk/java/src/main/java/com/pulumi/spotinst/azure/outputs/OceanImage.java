// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.azure.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.spotinst.azure.outputs.OceanImageMarketplace;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class OceanImage {
    /**
     * @return Select an image from Azure&#39;s Marketplace image catalogue.
     * 
     */
    private @Nullable List<OceanImageMarketplace> marketplaces;

    private OceanImage() {}
    /**
     * @return Select an image from Azure&#39;s Marketplace image catalogue.
     * 
     */
    public List<OceanImageMarketplace> marketplaces() {
        return this.marketplaces == null ? List.of() : this.marketplaces;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OceanImage defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<OceanImageMarketplace> marketplaces;
        public Builder() {}
        public Builder(OceanImage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.marketplaces = defaults.marketplaces;
        }

        @CustomType.Setter
        public Builder marketplaces(@Nullable List<OceanImageMarketplace> marketplaces) {
            this.marketplaces = marketplaces;
            return this;
        }
        public Builder marketplaces(OceanImageMarketplace... marketplaces) {
            return marketplaces(List.of(marketplaces));
        }
        public OceanImage build() {
            final var o = new OceanImage();
            o.marketplaces = marketplaces;
            return o;
        }
    }
}