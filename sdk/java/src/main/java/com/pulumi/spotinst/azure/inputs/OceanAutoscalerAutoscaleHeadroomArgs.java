// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.azure.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.spotinst.azure.inputs.OceanAutoscalerAutoscaleHeadroomAutomaticArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OceanAutoscalerAutoscaleHeadroomArgs extends com.pulumi.resources.ResourceArgs {

    public static final OceanAutoscalerAutoscaleHeadroomArgs Empty = new OceanAutoscalerAutoscaleHeadroomArgs();

    /**
     * Automatic headroom configuration.
     * 
     */
    @Import(name="automatic")
    private @Nullable Output<OceanAutoscalerAutoscaleHeadroomAutomaticArgs> automatic;

    /**
     * @return Automatic headroom configuration.
     * 
     */
    public Optional<Output<OceanAutoscalerAutoscaleHeadroomAutomaticArgs>> automatic() {
        return Optional.ofNullable(this.automatic);
    }

    private OceanAutoscalerAutoscaleHeadroomArgs() {}

    private OceanAutoscalerAutoscaleHeadroomArgs(OceanAutoscalerAutoscaleHeadroomArgs $) {
        this.automatic = $.automatic;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OceanAutoscalerAutoscaleHeadroomArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OceanAutoscalerAutoscaleHeadroomArgs $;

        public Builder() {
            $ = new OceanAutoscalerAutoscaleHeadroomArgs();
        }

        public Builder(OceanAutoscalerAutoscaleHeadroomArgs defaults) {
            $ = new OceanAutoscalerAutoscaleHeadroomArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param automatic Automatic headroom configuration.
         * 
         * @return builder
         * 
         */
        public Builder automatic(@Nullable Output<OceanAutoscalerAutoscaleHeadroomAutomaticArgs> automatic) {
            $.automatic = automatic;
            return this;
        }

        /**
         * @param automatic Automatic headroom configuration.
         * 
         * @return builder
         * 
         */
        public Builder automatic(OceanAutoscalerAutoscaleHeadroomAutomaticArgs automatic) {
            return automatic(Output.of(automatic));
        }

        public OceanAutoscalerAutoscaleHeadroomArgs build() {
            return $;
        }
    }

}
