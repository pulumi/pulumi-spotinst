// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.oceancd.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.spotinst.oceancd.inputs.RolloutSpecTrafficIstioDestinationRuleArgs;
import com.pulumi.spotinst.oceancd.inputs.RolloutSpecTrafficIstioVirtualServiceArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RolloutSpecTrafficIstioArgs extends com.pulumi.resources.ResourceArgs {

    public static final RolloutSpecTrafficIstioArgs Empty = new RolloutSpecTrafficIstioArgs();

    /**
     * It references to an Istio DestinationRule to modify and shape traffic. `DestinationRule` field belongs only to the Subset Level approach.
     * 
     */
    @Import(name="destinationRule")
    private @Nullable Output<RolloutSpecTrafficIstioDestinationRuleArgs> destinationRule;

    /**
     * @return It references to an Istio DestinationRule to modify and shape traffic. `DestinationRule` field belongs only to the Subset Level approach.
     * 
     */
    public Optional<Output<RolloutSpecTrafficIstioDestinationRuleArgs>> destinationRule() {
        return Optional.ofNullable(this.destinationRule);
    }

    /**
     * Defines a set of traffic routing rules to apply when a host is addressed.
     * 
     */
    @Import(name="virtualServices", required=true)
    private Output<List<RolloutSpecTrafficIstioVirtualServiceArgs>> virtualServices;

    /**
     * @return Defines a set of traffic routing rules to apply when a host is addressed.
     * 
     */
    public Output<List<RolloutSpecTrafficIstioVirtualServiceArgs>> virtualServices() {
        return this.virtualServices;
    }

    private RolloutSpecTrafficIstioArgs() {}

    private RolloutSpecTrafficIstioArgs(RolloutSpecTrafficIstioArgs $) {
        this.destinationRule = $.destinationRule;
        this.virtualServices = $.virtualServices;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RolloutSpecTrafficIstioArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RolloutSpecTrafficIstioArgs $;

        public Builder() {
            $ = new RolloutSpecTrafficIstioArgs();
        }

        public Builder(RolloutSpecTrafficIstioArgs defaults) {
            $ = new RolloutSpecTrafficIstioArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param destinationRule It references to an Istio DestinationRule to modify and shape traffic. `DestinationRule` field belongs only to the Subset Level approach.
         * 
         * @return builder
         * 
         */
        public Builder destinationRule(@Nullable Output<RolloutSpecTrafficIstioDestinationRuleArgs> destinationRule) {
            $.destinationRule = destinationRule;
            return this;
        }

        /**
         * @param destinationRule It references to an Istio DestinationRule to modify and shape traffic. `DestinationRule` field belongs only to the Subset Level approach.
         * 
         * @return builder
         * 
         */
        public Builder destinationRule(RolloutSpecTrafficIstioDestinationRuleArgs destinationRule) {
            return destinationRule(Output.of(destinationRule));
        }

        /**
         * @param virtualServices Defines a set of traffic routing rules to apply when a host is addressed.
         * 
         * @return builder
         * 
         */
        public Builder virtualServices(Output<List<RolloutSpecTrafficIstioVirtualServiceArgs>> virtualServices) {
            $.virtualServices = virtualServices;
            return this;
        }

        /**
         * @param virtualServices Defines a set of traffic routing rules to apply when a host is addressed.
         * 
         * @return builder
         * 
         */
        public Builder virtualServices(List<RolloutSpecTrafficIstioVirtualServiceArgs> virtualServices) {
            return virtualServices(Output.of(virtualServices));
        }

        /**
         * @param virtualServices Defines a set of traffic routing rules to apply when a host is addressed.
         * 
         * @return builder
         * 
         */
        public Builder virtualServices(RolloutSpecTrafficIstioVirtualServiceArgs... virtualServices) {
            return virtualServices(List.of(virtualServices));
        }

        public RolloutSpecTrafficIstioArgs build() {
            if ($.virtualServices == null) {
                throw new MissingRequiredPropertyException("RolloutSpecTrafficIstioArgs", "virtualServices");
            }
            return $;
        }
    }

}
