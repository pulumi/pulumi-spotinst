// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.azure.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OceanAutoscalerAutoscaleHeadroomAutomaticArgs extends com.pulumi.resources.ResourceArgs {

    public static final OceanAutoscalerAutoscaleHeadroomAutomaticArgs Empty = new OceanAutoscalerAutoscaleHeadroomAutomaticArgs();

    @Import(name="isEnabled")
    private @Nullable Output<Boolean> isEnabled;

    public Optional<Output<Boolean>> isEnabled() {
        return Optional.ofNullable(this.isEnabled);
    }

    @Import(name="percentage")
    private @Nullable Output<Integer> percentage;

    public Optional<Output<Integer>> percentage() {
        return Optional.ofNullable(this.percentage);
    }

    private OceanAutoscalerAutoscaleHeadroomAutomaticArgs() {}

    private OceanAutoscalerAutoscaleHeadroomAutomaticArgs(OceanAutoscalerAutoscaleHeadroomAutomaticArgs $) {
        this.isEnabled = $.isEnabled;
        this.percentage = $.percentage;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OceanAutoscalerAutoscaleHeadroomAutomaticArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OceanAutoscalerAutoscaleHeadroomAutomaticArgs $;

        public Builder() {
            $ = new OceanAutoscalerAutoscaleHeadroomAutomaticArgs();
        }

        public Builder(OceanAutoscalerAutoscaleHeadroomAutomaticArgs defaults) {
            $ = new OceanAutoscalerAutoscaleHeadroomAutomaticArgs(Objects.requireNonNull(defaults));
        }

        public Builder isEnabled(@Nullable Output<Boolean> isEnabled) {
            $.isEnabled = isEnabled;
            return this;
        }

        public Builder isEnabled(Boolean isEnabled) {
            return isEnabled(Output.of(isEnabled));
        }

        public Builder percentage(@Nullable Output<Integer> percentage) {
            $.percentage = percentage;
            return this;
        }

        public Builder percentage(Integer percentage) {
            return percentage(Output.of(percentage));
        }

        public OceanAutoscalerAutoscaleHeadroomAutomaticArgs build() {
            return $;
        }
    }

}
