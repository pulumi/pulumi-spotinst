// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OceanRightSizingRuleRecommendationApplicationHpaArgs extends com.pulumi.resources.ResourceArgs {

    public static final OceanRightSizingRuleRecommendationApplicationHpaArgs Empty = new OceanRightSizingRuleRecommendationApplicationHpaArgs();

    @Import(name="allowHpaRecommendations")
    private @Nullable Output<Boolean> allowHpaRecommendations;

    public Optional<Output<Boolean>> allowHpaRecommendations() {
        return Optional.ofNullable(this.allowHpaRecommendations);
    }

    private OceanRightSizingRuleRecommendationApplicationHpaArgs() {}

    private OceanRightSizingRuleRecommendationApplicationHpaArgs(OceanRightSizingRuleRecommendationApplicationHpaArgs $) {
        this.allowHpaRecommendations = $.allowHpaRecommendations;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OceanRightSizingRuleRecommendationApplicationHpaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OceanRightSizingRuleRecommendationApplicationHpaArgs $;

        public Builder() {
            $ = new OceanRightSizingRuleRecommendationApplicationHpaArgs();
        }

        public Builder(OceanRightSizingRuleRecommendationApplicationHpaArgs defaults) {
            $ = new OceanRightSizingRuleRecommendationApplicationHpaArgs(Objects.requireNonNull(defaults));
        }

        public Builder allowHpaRecommendations(@Nullable Output<Boolean> allowHpaRecommendations) {
            $.allowHpaRecommendations = allowHpaRecommendations;
            return this;
        }

        public Builder allowHpaRecommendations(Boolean allowHpaRecommendations) {
            return allowHpaRecommendations(Output.of(allowHpaRecommendations));
        }

        public OceanRightSizingRuleRecommendationApplicationHpaArgs build() {
            return $;
        }
    }

}
