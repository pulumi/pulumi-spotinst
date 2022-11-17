// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.azure.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.spotinst.azure.outputs.OceanAutoscalerAutoscaleHeadroomAutomatic;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OceanAutoscalerAutoscaleHeadroom {
    /**
     * @return Automatic headroom configuration.
     * 
     */
    private @Nullable OceanAutoscalerAutoscaleHeadroomAutomatic automatic;

    private OceanAutoscalerAutoscaleHeadroom() {}
    /**
     * @return Automatic headroom configuration.
     * 
     */
    public Optional<OceanAutoscalerAutoscaleHeadroomAutomatic> automatic() {
        return Optional.ofNullable(this.automatic);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OceanAutoscalerAutoscaleHeadroom defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable OceanAutoscalerAutoscaleHeadroomAutomatic automatic;
        public Builder() {}
        public Builder(OceanAutoscalerAutoscaleHeadroom defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automatic = defaults.automatic;
        }

        @CustomType.Setter
        public Builder automatic(@Nullable OceanAutoscalerAutoscaleHeadroomAutomatic automatic) {
            this.automatic = automatic;
            return this;
        }
        public OceanAutoscalerAutoscaleHeadroom build() {
            final var o = new OceanAutoscalerAutoscaleHeadroom();
            o.automatic = automatic;
            return o;
        }
    }
}
