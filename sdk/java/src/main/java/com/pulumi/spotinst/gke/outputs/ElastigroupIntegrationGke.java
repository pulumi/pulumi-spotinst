// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.gke.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.spotinst.gke.outputs.ElastigroupIntegrationGkeAutoscaleDown;
import com.pulumi.spotinst.gke.outputs.ElastigroupIntegrationGkeAutoscaleHeadroom;
import com.pulumi.spotinst.gke.outputs.ElastigroupIntegrationGkeAutoscaleLabel;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ElastigroupIntegrationGke {
    private @Nullable Boolean autoUpdate;
    /**
     * @return The amount of time, in seconds, after a scaling activity completes before any further trigger-related scaling activities can start.
     * 
     */
    private @Nullable Integer autoscaleCooldown;
    /**
     * @return Enabling scale down.
     * 
     */
    private @Nullable ElastigroupIntegrationGkeAutoscaleDown autoscaleDown;
    /**
     * @return Headroom for the cluster.
     * 
     */
    private @Nullable ElastigroupIntegrationGkeAutoscaleHeadroom autoscaleHeadroom;
    private @Nullable Boolean autoscaleIsAutoConfig;
    /**
     * @return Specifies whether the auto scaling feature is enabled.
     * 
     */
    private @Nullable Boolean autoscaleIsEnabled;
    /**
     * @return Labels to assign to the resource.
     * 
     */
    private @Nullable List<ElastigroupIntegrationGkeAutoscaleLabel> autoscaleLabels;
    private @Nullable String clusterId;
    /**
     * @return The location of your GKE cluster.
     * 
     */
    private @Nullable String location;

    private ElastigroupIntegrationGke() {}
    public Optional<Boolean> autoUpdate() {
        return Optional.ofNullable(this.autoUpdate);
    }
    /**
     * @return The amount of time, in seconds, after a scaling activity completes before any further trigger-related scaling activities can start.
     * 
     */
    public Optional<Integer> autoscaleCooldown() {
        return Optional.ofNullable(this.autoscaleCooldown);
    }
    /**
     * @return Enabling scale down.
     * 
     */
    public Optional<ElastigroupIntegrationGkeAutoscaleDown> autoscaleDown() {
        return Optional.ofNullable(this.autoscaleDown);
    }
    /**
     * @return Headroom for the cluster.
     * 
     */
    public Optional<ElastigroupIntegrationGkeAutoscaleHeadroom> autoscaleHeadroom() {
        return Optional.ofNullable(this.autoscaleHeadroom);
    }
    public Optional<Boolean> autoscaleIsAutoConfig() {
        return Optional.ofNullable(this.autoscaleIsAutoConfig);
    }
    /**
     * @return Specifies whether the auto scaling feature is enabled.
     * 
     */
    public Optional<Boolean> autoscaleIsEnabled() {
        return Optional.ofNullable(this.autoscaleIsEnabled);
    }
    /**
     * @return Labels to assign to the resource.
     * 
     */
    public List<ElastigroupIntegrationGkeAutoscaleLabel> autoscaleLabels() {
        return this.autoscaleLabels == null ? List.of() : this.autoscaleLabels;
    }
    public Optional<String> clusterId() {
        return Optional.ofNullable(this.clusterId);
    }
    /**
     * @return The location of your GKE cluster.
     * 
     */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ElastigroupIntegrationGke defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean autoUpdate;
        private @Nullable Integer autoscaleCooldown;
        private @Nullable ElastigroupIntegrationGkeAutoscaleDown autoscaleDown;
        private @Nullable ElastigroupIntegrationGkeAutoscaleHeadroom autoscaleHeadroom;
        private @Nullable Boolean autoscaleIsAutoConfig;
        private @Nullable Boolean autoscaleIsEnabled;
        private @Nullable List<ElastigroupIntegrationGkeAutoscaleLabel> autoscaleLabels;
        private @Nullable String clusterId;
        private @Nullable String location;
        public Builder() {}
        public Builder(ElastigroupIntegrationGke defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoUpdate = defaults.autoUpdate;
    	      this.autoscaleCooldown = defaults.autoscaleCooldown;
    	      this.autoscaleDown = defaults.autoscaleDown;
    	      this.autoscaleHeadroom = defaults.autoscaleHeadroom;
    	      this.autoscaleIsAutoConfig = defaults.autoscaleIsAutoConfig;
    	      this.autoscaleIsEnabled = defaults.autoscaleIsEnabled;
    	      this.autoscaleLabels = defaults.autoscaleLabels;
    	      this.clusterId = defaults.clusterId;
    	      this.location = defaults.location;
        }

        @CustomType.Setter
        public Builder autoUpdate(@Nullable Boolean autoUpdate) {

            this.autoUpdate = autoUpdate;
            return this;
        }
        @CustomType.Setter
        public Builder autoscaleCooldown(@Nullable Integer autoscaleCooldown) {

            this.autoscaleCooldown = autoscaleCooldown;
            return this;
        }
        @CustomType.Setter
        public Builder autoscaleDown(@Nullable ElastigroupIntegrationGkeAutoscaleDown autoscaleDown) {

            this.autoscaleDown = autoscaleDown;
            return this;
        }
        @CustomType.Setter
        public Builder autoscaleHeadroom(@Nullable ElastigroupIntegrationGkeAutoscaleHeadroom autoscaleHeadroom) {

            this.autoscaleHeadroom = autoscaleHeadroom;
            return this;
        }
        @CustomType.Setter
        public Builder autoscaleIsAutoConfig(@Nullable Boolean autoscaleIsAutoConfig) {

            this.autoscaleIsAutoConfig = autoscaleIsAutoConfig;
            return this;
        }
        @CustomType.Setter
        public Builder autoscaleIsEnabled(@Nullable Boolean autoscaleIsEnabled) {

            this.autoscaleIsEnabled = autoscaleIsEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder autoscaleLabels(@Nullable List<ElastigroupIntegrationGkeAutoscaleLabel> autoscaleLabels) {

            this.autoscaleLabels = autoscaleLabels;
            return this;
        }
        public Builder autoscaleLabels(ElastigroupIntegrationGkeAutoscaleLabel... autoscaleLabels) {
            return autoscaleLabels(List.of(autoscaleLabels));
        }
        @CustomType.Setter
        public Builder clusterId(@Nullable String clusterId) {

            this.clusterId = clusterId;
            return this;
        }
        @CustomType.Setter
        public Builder location(@Nullable String location) {

            this.location = location;
            return this;
        }
        public ElastigroupIntegrationGke build() {
            final var _resultValue = new ElastigroupIntegrationGke();
            _resultValue.autoUpdate = autoUpdate;
            _resultValue.autoscaleCooldown = autoscaleCooldown;
            _resultValue.autoscaleDown = autoscaleDown;
            _resultValue.autoscaleHeadroom = autoscaleHeadroom;
            _resultValue.autoscaleIsAutoConfig = autoscaleIsAutoConfig;
            _resultValue.autoscaleIsEnabled = autoscaleIsEnabled;
            _resultValue.autoscaleLabels = autoscaleLabels;
            _resultValue.clusterId = clusterId;
            _resultValue.location = location;
            return _resultValue;
        }
    }
}
