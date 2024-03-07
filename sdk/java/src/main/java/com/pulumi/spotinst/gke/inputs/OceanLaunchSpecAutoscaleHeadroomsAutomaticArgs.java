// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.gke.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OceanLaunchSpecAutoscaleHeadroomsAutomaticArgs extends com.pulumi.resources.ResourceArgs {

    public static final OceanLaunchSpecAutoscaleHeadroomsAutomaticArgs Empty = new OceanLaunchSpecAutoscaleHeadroomsAutomaticArgs();

    /**
     * Number between 0-200 to control the headroom %!o(MISSING)f the specific Virtual Node Group. Effective when cluster.autoScaler.headroom.automatic.`is_enabled` = true is set on the Ocean cluster.
     * 
     */
    @Import(name="autoHeadroomPercentage")
    private @Nullable Output<Integer> autoHeadroomPercentage;

    /**
     * @return Number between 0-200 to control the headroom %!o(MISSING)f the specific Virtual Node Group. Effective when cluster.autoScaler.headroom.automatic.`is_enabled` = true is set on the Ocean cluster.
     * 
     */
    public Optional<Output<Integer>> autoHeadroomPercentage() {
        return Optional.ofNullable(this.autoHeadroomPercentage);
    }

    private OceanLaunchSpecAutoscaleHeadroomsAutomaticArgs() {}

    private OceanLaunchSpecAutoscaleHeadroomsAutomaticArgs(OceanLaunchSpecAutoscaleHeadroomsAutomaticArgs $) {
        this.autoHeadroomPercentage = $.autoHeadroomPercentage;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OceanLaunchSpecAutoscaleHeadroomsAutomaticArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OceanLaunchSpecAutoscaleHeadroomsAutomaticArgs $;

        public Builder() {
            $ = new OceanLaunchSpecAutoscaleHeadroomsAutomaticArgs();
        }

        public Builder(OceanLaunchSpecAutoscaleHeadroomsAutomaticArgs defaults) {
            $ = new OceanLaunchSpecAutoscaleHeadroomsAutomaticArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoHeadroomPercentage Number between 0-200 to control the headroom %!o(MISSING)f the specific Virtual Node Group. Effective when cluster.autoScaler.headroom.automatic.`is_enabled` = true is set on the Ocean cluster.
         * 
         * @return builder
         * 
         */
        public Builder autoHeadroomPercentage(@Nullable Output<Integer> autoHeadroomPercentage) {
            $.autoHeadroomPercentage = autoHeadroomPercentage;
            return this;
        }

        /**
         * @param autoHeadroomPercentage Number between 0-200 to control the headroom %!o(MISSING)f the specific Virtual Node Group. Effective when cluster.autoScaler.headroom.automatic.`is_enabled` = true is set on the Ocean cluster.
         * 
         * @return builder
         * 
         */
        public Builder autoHeadroomPercentage(Integer autoHeadroomPercentage) {
            return autoHeadroomPercentage(Output.of(autoHeadroomPercentage));
        }

        public OceanLaunchSpecAutoscaleHeadroomsAutomaticArgs build() {
            return $;
        }
    }

}
