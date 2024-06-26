// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.oceancd.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.spotinst.oceancd.outputs.RolloutSpecTrafficIstioDestinationRule;
import com.pulumi.spotinst.oceancd.outputs.RolloutSpecTrafficIstioVirtualService;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RolloutSpecTrafficIstio {
    /**
     * @return It references to an Istio DestinationRule to modify and shape traffic. `DestinationRule` field belongs only to the Subset Level approach.
     * 
     */
    private @Nullable RolloutSpecTrafficIstioDestinationRule destinationRule;
    /**
     * @return Defines a set of traffic routing rules to apply when a host is addressed.
     * 
     */
    private List<RolloutSpecTrafficIstioVirtualService> virtualServices;

    private RolloutSpecTrafficIstio() {}
    /**
     * @return It references to an Istio DestinationRule to modify and shape traffic. `DestinationRule` field belongs only to the Subset Level approach.
     * 
     */
    public Optional<RolloutSpecTrafficIstioDestinationRule> destinationRule() {
        return Optional.ofNullable(this.destinationRule);
    }
    /**
     * @return Defines a set of traffic routing rules to apply when a host is addressed.
     * 
     */
    public List<RolloutSpecTrafficIstioVirtualService> virtualServices() {
        return this.virtualServices;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RolloutSpecTrafficIstio defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable RolloutSpecTrafficIstioDestinationRule destinationRule;
        private List<RolloutSpecTrafficIstioVirtualService> virtualServices;
        public Builder() {}
        public Builder(RolloutSpecTrafficIstio defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationRule = defaults.destinationRule;
    	      this.virtualServices = defaults.virtualServices;
        }

        @CustomType.Setter
        public Builder destinationRule(@Nullable RolloutSpecTrafficIstioDestinationRule destinationRule) {

            this.destinationRule = destinationRule;
            return this;
        }
        @CustomType.Setter
        public Builder virtualServices(List<RolloutSpecTrafficIstioVirtualService> virtualServices) {
            if (virtualServices == null) {
              throw new MissingRequiredPropertyException("RolloutSpecTrafficIstio", "virtualServices");
            }
            this.virtualServices = virtualServices;
            return this;
        }
        public Builder virtualServices(RolloutSpecTrafficIstioVirtualService... virtualServices) {
            return virtualServices(List.of(virtualServices));
        }
        public RolloutSpecTrafficIstio build() {
            final var _resultValue = new RolloutSpecTrafficIstio();
            _resultValue.destinationRule = destinationRule;
            _resultValue.virtualServices = virtualServices;
            return _resultValue;
        }
    }
}
