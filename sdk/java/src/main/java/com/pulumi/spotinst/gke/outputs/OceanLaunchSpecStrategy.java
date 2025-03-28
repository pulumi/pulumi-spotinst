// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.gke.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OceanLaunchSpecStrategy {
    /**
     * @return Defines the desired preemptible percentage for this launch specification.
     * 
     */
    private @Nullable Integer preemptiblePercentage;
    /**
     * @return Valid Values: `&#34;cost&#34;, &#34;availability&#34;, &#34;balanced&#34;`. Set this value to control the approach that Ocean takes when launching nodes.
     * 
     */
    private @Nullable String scalingOrientation;

    private OceanLaunchSpecStrategy() {}
    /**
     * @return Defines the desired preemptible percentage for this launch specification.
     * 
     */
    public Optional<Integer> preemptiblePercentage() {
        return Optional.ofNullable(this.preemptiblePercentage);
    }
    /**
     * @return Valid Values: `&#34;cost&#34;, &#34;availability&#34;, &#34;balanced&#34;`. Set this value to control the approach that Ocean takes when launching nodes.
     * 
     */
    public Optional<String> scalingOrientation() {
        return Optional.ofNullable(this.scalingOrientation);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OceanLaunchSpecStrategy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer preemptiblePercentage;
        private @Nullable String scalingOrientation;
        public Builder() {}
        public Builder(OceanLaunchSpecStrategy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.preemptiblePercentage = defaults.preemptiblePercentage;
    	      this.scalingOrientation = defaults.scalingOrientation;
        }

        @CustomType.Setter
        public Builder preemptiblePercentage(@Nullable Integer preemptiblePercentage) {

            this.preemptiblePercentage = preemptiblePercentage;
            return this;
        }
        @CustomType.Setter
        public Builder scalingOrientation(@Nullable String scalingOrientation) {

            this.scalingOrientation = scalingOrientation;
            return this;
        }
        public OceanLaunchSpecStrategy build() {
            final var _resultValue = new OceanLaunchSpecStrategy();
            _resultValue.preemptiblePercentage = preemptiblePercentage;
            _resultValue.scalingOrientation = scalingOrientation;
            return _resultValue;
        }
    }
}
