// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.azure.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.spotinst.azure.inputs.OceanVirtualNodeGroupAutoscaleAutoscaleHeadroomArgs;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OceanVirtualNodeGroupAutoscaleArgs extends com.pulumi.resources.ResourceArgs {

    public static final OceanVirtualNodeGroupAutoscaleArgs Empty = new OceanVirtualNodeGroupAutoscaleArgs();

    /**
     * Number between 0-200 to control the headroom % of the specific Virtual Node Group. Effective when `cluster.autoScaler.headroom.automatic.is_enabled` = true is set on the Ocean cluster.
     * 
     */
    @Import(name="autoHeadroomPercentage")
    private @Nullable Output<Integer> autoHeadroomPercentage;

    /**
     * @return Number between 0-200 to control the headroom % of the specific Virtual Node Group. Effective when `cluster.autoScaler.headroom.automatic.is_enabled` = true is set on the Ocean cluster.
     * 
     */
    public Optional<Output<Integer>> autoHeadroomPercentage() {
        return Optional.ofNullable(this.autoHeadroomPercentage);
    }

    @Import(name="autoscaleHeadrooms")
    private @Nullable Output<List<OceanVirtualNodeGroupAutoscaleAutoscaleHeadroomArgs>> autoscaleHeadrooms;

    public Optional<Output<List<OceanVirtualNodeGroupAutoscaleAutoscaleHeadroomArgs>>> autoscaleHeadrooms() {
        return Optional.ofNullable(this.autoscaleHeadrooms);
    }

    private OceanVirtualNodeGroupAutoscaleArgs() {}

    private OceanVirtualNodeGroupAutoscaleArgs(OceanVirtualNodeGroupAutoscaleArgs $) {
        this.autoHeadroomPercentage = $.autoHeadroomPercentage;
        this.autoscaleHeadrooms = $.autoscaleHeadrooms;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OceanVirtualNodeGroupAutoscaleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OceanVirtualNodeGroupAutoscaleArgs $;

        public Builder() {
            $ = new OceanVirtualNodeGroupAutoscaleArgs();
        }

        public Builder(OceanVirtualNodeGroupAutoscaleArgs defaults) {
            $ = new OceanVirtualNodeGroupAutoscaleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoHeadroomPercentage Number between 0-200 to control the headroom % of the specific Virtual Node Group. Effective when `cluster.autoScaler.headroom.automatic.is_enabled` = true is set on the Ocean cluster.
         * 
         * @return builder
         * 
         */
        public Builder autoHeadroomPercentage(@Nullable Output<Integer> autoHeadroomPercentage) {
            $.autoHeadroomPercentage = autoHeadroomPercentage;
            return this;
        }

        /**
         * @param autoHeadroomPercentage Number between 0-200 to control the headroom % of the specific Virtual Node Group. Effective when `cluster.autoScaler.headroom.automatic.is_enabled` = true is set on the Ocean cluster.
         * 
         * @return builder
         * 
         */
        public Builder autoHeadroomPercentage(Integer autoHeadroomPercentage) {
            return autoHeadroomPercentage(Output.of(autoHeadroomPercentage));
        }

        public Builder autoscaleHeadrooms(@Nullable Output<List<OceanVirtualNodeGroupAutoscaleAutoscaleHeadroomArgs>> autoscaleHeadrooms) {
            $.autoscaleHeadrooms = autoscaleHeadrooms;
            return this;
        }

        public Builder autoscaleHeadrooms(List<OceanVirtualNodeGroupAutoscaleAutoscaleHeadroomArgs> autoscaleHeadrooms) {
            return autoscaleHeadrooms(Output.of(autoscaleHeadrooms));
        }

        public Builder autoscaleHeadrooms(OceanVirtualNodeGroupAutoscaleAutoscaleHeadroomArgs... autoscaleHeadrooms) {
            return autoscaleHeadrooms(List.of(autoscaleHeadrooms));
        }

        public OceanVirtualNodeGroupAutoscaleArgs build() {
            return $;
        }
    }

}
