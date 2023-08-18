// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.spotinst.inputs.StatefulNodeAzureStrategyCapacityReservationCapacityReservationGroupArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StatefulNodeAzureStrategyCapacityReservationArgs extends com.pulumi.resources.ResourceArgs {

    public static final StatefulNodeAzureStrategyCapacityReservationArgs Empty = new StatefulNodeAzureStrategyCapacityReservationArgs();

    @Import(name="capacityReservationGroups")
    private @Nullable Output<List<StatefulNodeAzureStrategyCapacityReservationCapacityReservationGroupArgs>> capacityReservationGroups;

    public Optional<Output<List<StatefulNodeAzureStrategyCapacityReservationCapacityReservationGroupArgs>>> capacityReservationGroups() {
        return Optional.ofNullable(this.capacityReservationGroups);
    }

    @Import(name="shouldUtilize", required=true)
    private Output<Boolean> shouldUtilize;

    public Output<Boolean> shouldUtilize() {
        return this.shouldUtilize;
    }

    @Import(name="utilizationStrategy", required=true)
    private Output<String> utilizationStrategy;

    public Output<String> utilizationStrategy() {
        return this.utilizationStrategy;
    }

    private StatefulNodeAzureStrategyCapacityReservationArgs() {}

    private StatefulNodeAzureStrategyCapacityReservationArgs(StatefulNodeAzureStrategyCapacityReservationArgs $) {
        this.capacityReservationGroups = $.capacityReservationGroups;
        this.shouldUtilize = $.shouldUtilize;
        this.utilizationStrategy = $.utilizationStrategy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StatefulNodeAzureStrategyCapacityReservationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StatefulNodeAzureStrategyCapacityReservationArgs $;

        public Builder() {
            $ = new StatefulNodeAzureStrategyCapacityReservationArgs();
        }

        public Builder(StatefulNodeAzureStrategyCapacityReservationArgs defaults) {
            $ = new StatefulNodeAzureStrategyCapacityReservationArgs(Objects.requireNonNull(defaults));
        }

        public Builder capacityReservationGroups(@Nullable Output<List<StatefulNodeAzureStrategyCapacityReservationCapacityReservationGroupArgs>> capacityReservationGroups) {
            $.capacityReservationGroups = capacityReservationGroups;
            return this;
        }

        public Builder capacityReservationGroups(List<StatefulNodeAzureStrategyCapacityReservationCapacityReservationGroupArgs> capacityReservationGroups) {
            return capacityReservationGroups(Output.of(capacityReservationGroups));
        }

        public Builder capacityReservationGroups(StatefulNodeAzureStrategyCapacityReservationCapacityReservationGroupArgs... capacityReservationGroups) {
            return capacityReservationGroups(List.of(capacityReservationGroups));
        }

        public Builder shouldUtilize(Output<Boolean> shouldUtilize) {
            $.shouldUtilize = shouldUtilize;
            return this;
        }

        public Builder shouldUtilize(Boolean shouldUtilize) {
            return shouldUtilize(Output.of(shouldUtilize));
        }

        public Builder utilizationStrategy(Output<String> utilizationStrategy) {
            $.utilizationStrategy = utilizationStrategy;
            return this;
        }

        public Builder utilizationStrategy(String utilizationStrategy) {
            return utilizationStrategy(Output.of(utilizationStrategy));
        }

        public StatefulNodeAzureStrategyCapacityReservationArgs build() {
            $.shouldUtilize = Objects.requireNonNull($.shouldUtilize, "expected parameter 'shouldUtilize' to be non-null");
            $.utilizationStrategy = Objects.requireNonNull($.utilizationStrategy, "expected parameter 'utilizationStrategy' to be non-null");
            return $;
        }
    }

}
