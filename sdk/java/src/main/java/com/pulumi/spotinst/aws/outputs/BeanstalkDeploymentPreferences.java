// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.spotinst.aws.outputs.BeanstalkDeploymentPreferencesStrategy;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BeanstalkDeploymentPreferences {
    /**
     * @return Should roll perform automatically
     * 
     */
    private @Nullable Boolean automaticRoll;
    /**
     * @return Percent size of each batch
     * 
     */
    private @Nullable Integer batchSizePercentage;
    /**
     * @return Amount of time to wait between batches
     * 
     */
    private @Nullable Integer gracePeriod;
    /**
     * @return Strategy parameters
     * 
     */
    private @Nullable List<BeanstalkDeploymentPreferencesStrategy> strategies;

    private BeanstalkDeploymentPreferences() {}
    /**
     * @return Should roll perform automatically
     * 
     */
    public Optional<Boolean> automaticRoll() {
        return Optional.ofNullable(this.automaticRoll);
    }
    /**
     * @return Percent size of each batch
     * 
     */
    public Optional<Integer> batchSizePercentage() {
        return Optional.ofNullable(this.batchSizePercentage);
    }
    /**
     * @return Amount of time to wait between batches
     * 
     */
    public Optional<Integer> gracePeriod() {
        return Optional.ofNullable(this.gracePeriod);
    }
    /**
     * @return Strategy parameters
     * 
     */
    public List<BeanstalkDeploymentPreferencesStrategy> strategies() {
        return this.strategies == null ? List.of() : this.strategies;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BeanstalkDeploymentPreferences defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean automaticRoll;
        private @Nullable Integer batchSizePercentage;
        private @Nullable Integer gracePeriod;
        private @Nullable List<BeanstalkDeploymentPreferencesStrategy> strategies;
        public Builder() {}
        public Builder(BeanstalkDeploymentPreferences defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automaticRoll = defaults.automaticRoll;
    	      this.batchSizePercentage = defaults.batchSizePercentage;
    	      this.gracePeriod = defaults.gracePeriod;
    	      this.strategies = defaults.strategies;
        }

        @CustomType.Setter
        public Builder automaticRoll(@Nullable Boolean automaticRoll) {
            this.automaticRoll = automaticRoll;
            return this;
        }
        @CustomType.Setter
        public Builder batchSizePercentage(@Nullable Integer batchSizePercentage) {
            this.batchSizePercentage = batchSizePercentage;
            return this;
        }
        @CustomType.Setter
        public Builder gracePeriod(@Nullable Integer gracePeriod) {
            this.gracePeriod = gracePeriod;
            return this;
        }
        @CustomType.Setter
        public Builder strategies(@Nullable List<BeanstalkDeploymentPreferencesStrategy> strategies) {
            this.strategies = strategies;
            return this;
        }
        public Builder strategies(BeanstalkDeploymentPreferencesStrategy... strategies) {
            return strategies(List.of(strategies));
        }
        public BeanstalkDeploymentPreferences build() {
            final var o = new BeanstalkDeploymentPreferences();
            o.automaticRoll = automaticRoll;
            o.batchSizePercentage = batchSizePercentage;
            o.gracePeriod = gracePeriod;
            o.strategies = strategies;
            return o;
        }
    }
}
