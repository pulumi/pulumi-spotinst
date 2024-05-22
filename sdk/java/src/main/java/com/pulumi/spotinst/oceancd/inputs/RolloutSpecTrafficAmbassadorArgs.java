// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.oceancd.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class RolloutSpecTrafficAmbassadorArgs extends com.pulumi.resources.ResourceArgs {

    public static final RolloutSpecTrafficAmbassadorArgs Empty = new RolloutSpecTrafficAmbassadorArgs();

    @Import(name="mappings", required=true)
    private Output<List<String>> mappings;

    public Output<List<String>> mappings() {
        return this.mappings;
    }

    private RolloutSpecTrafficAmbassadorArgs() {}

    private RolloutSpecTrafficAmbassadorArgs(RolloutSpecTrafficAmbassadorArgs $) {
        this.mappings = $.mappings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RolloutSpecTrafficAmbassadorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RolloutSpecTrafficAmbassadorArgs $;

        public Builder() {
            $ = new RolloutSpecTrafficAmbassadorArgs();
        }

        public Builder(RolloutSpecTrafficAmbassadorArgs defaults) {
            $ = new RolloutSpecTrafficAmbassadorArgs(Objects.requireNonNull(defaults));
        }

        public Builder mappings(Output<List<String>> mappings) {
            $.mappings = mappings;
            return this;
        }

        public Builder mappings(List<String> mappings) {
            return mappings(Output.of(mappings));
        }

        public Builder mappings(String... mappings) {
            return mappings(List.of(mappings));
        }

        public RolloutSpecTrafficAmbassadorArgs build() {
            if ($.mappings == null) {
                throw new MissingRequiredPropertyException("RolloutSpecTrafficAmbassadorArgs", "mappings");
            }
            return $;
        }
    }

}
