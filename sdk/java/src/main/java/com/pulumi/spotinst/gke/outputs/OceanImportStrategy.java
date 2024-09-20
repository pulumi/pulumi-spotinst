// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.gke.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OceanImportStrategy {
    /**
     * @return The draining timeout (in seconds) before terminating the instance. If no draining timeout is defined, the default draining timeout will be used.
     * 
     */
    private @Nullable Integer drainingTimeout;
    /**
     * @return Defines the desired preemptible percentage for the cluster.
     * 
     */
    private @Nullable Integer preemptiblePercentage;
    /**
     * @return Define the provisioning model of the launched instances. Valid values: `SPOT`, `PREEMPTIBLE`.
     * 
     */
    private @Nullable String provisioningModel;
    /**
     * @return Enable committed use discounts utilization.
     * 
     */
    private @Nullable Boolean shouldUtilizeCommitments;

    private OceanImportStrategy() {}
    /**
     * @return The draining timeout (in seconds) before terminating the instance. If no draining timeout is defined, the default draining timeout will be used.
     * 
     */
    public Optional<Integer> drainingTimeout() {
        return Optional.ofNullable(this.drainingTimeout);
    }
    /**
     * @return Defines the desired preemptible percentage for the cluster.
     * 
     */
    public Optional<Integer> preemptiblePercentage() {
        return Optional.ofNullable(this.preemptiblePercentage);
    }
    /**
     * @return Define the provisioning model of the launched instances. Valid values: `SPOT`, `PREEMPTIBLE`.
     * 
     */
    public Optional<String> provisioningModel() {
        return Optional.ofNullable(this.provisioningModel);
    }
    /**
     * @return Enable committed use discounts utilization.
     * 
     */
    public Optional<Boolean> shouldUtilizeCommitments() {
        return Optional.ofNullable(this.shouldUtilizeCommitments);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OceanImportStrategy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer drainingTimeout;
        private @Nullable Integer preemptiblePercentage;
        private @Nullable String provisioningModel;
        private @Nullable Boolean shouldUtilizeCommitments;
        public Builder() {}
        public Builder(OceanImportStrategy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.drainingTimeout = defaults.drainingTimeout;
    	      this.preemptiblePercentage = defaults.preemptiblePercentage;
    	      this.provisioningModel = defaults.provisioningModel;
    	      this.shouldUtilizeCommitments = defaults.shouldUtilizeCommitments;
        }

        @CustomType.Setter
        public Builder drainingTimeout(@Nullable Integer drainingTimeout) {

            this.drainingTimeout = drainingTimeout;
            return this;
        }
        @CustomType.Setter
        public Builder preemptiblePercentage(@Nullable Integer preemptiblePercentage) {

            this.preemptiblePercentage = preemptiblePercentage;
            return this;
        }
        @CustomType.Setter
        public Builder provisioningModel(@Nullable String provisioningModel) {

            this.provisioningModel = provisioningModel;
            return this;
        }
        @CustomType.Setter
        public Builder shouldUtilizeCommitments(@Nullable Boolean shouldUtilizeCommitments) {

            this.shouldUtilizeCommitments = shouldUtilizeCommitments;
            return this;
        }
        public OceanImportStrategy build() {
            final var _resultValue = new OceanImportStrategy();
            _resultValue.drainingTimeout = drainingTimeout;
            _resultValue.preemptiblePercentage = preemptiblePercentage;
            _resultValue.provisioningModel = provisioningModel;
            _resultValue.shouldUtilizeCommitments = shouldUtilizeCommitments;
            return _resultValue;
        }
    }
}
