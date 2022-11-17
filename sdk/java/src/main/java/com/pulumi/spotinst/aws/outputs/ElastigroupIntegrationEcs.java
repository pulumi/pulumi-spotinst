// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.spotinst.aws.outputs.ElastigroupIntegrationEcsAutoscaleAttribute;
import com.pulumi.spotinst.aws.outputs.ElastigroupIntegrationEcsAutoscaleDown;
import com.pulumi.spotinst.aws.outputs.ElastigroupIntegrationEcsAutoscaleHeadroom;
import com.pulumi.spotinst.aws.outputs.ElastigroupIntegrationEcsBatch;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ElastigroupIntegrationEcs {
    /**
     * @return A key/value mapping of tags to assign to the resource.
     * 
     */
    private @Nullable List<ElastigroupIntegrationEcsAutoscaleAttribute> autoscaleAttributes;
    /**
     * @return The amount of time, in seconds, after a scaling activity completes before any further trigger-related scaling activities can start.
     * 
     */
    private @Nullable Integer autoscaleCooldown;
    /**
     * @return Settings for scale down actions.
     * 
     */
    private @Nullable ElastigroupIntegrationEcsAutoscaleDown autoscaleDown;
    /**
     * @return An option to set compute reserve for the cluster.
     * 
     */
    private @Nullable ElastigroupIntegrationEcsAutoscaleHeadroom autoscaleHeadroom;
    /**
     * @return Enabling the automatic k8s auto-scaler functionality. For more information please see: [Kubernetes auto scaler](https://api.spotinst.com/integration-docs/elastigroup/container-management/kubernetes/autoscaler/).
     * 
     */
    private @Nullable Boolean autoscaleIsAutoConfig;
    /**
     * @return Specifies whether the auto scaling feature is enabled.
     * 
     */
    private @Nullable Boolean autoscaleIsEnabled;
    /**
     * @return Determines whether to scale down non-service tasks.
     * 
     */
    private @Nullable Boolean autoscaleScaleDownNonServiceTasks;
    /**
     * @return Batch configuration object:
     * 
     */
    private @Nullable ElastigroupIntegrationEcsBatch batch;
    /**
     * @return The name of the EC2 Container Service cluster.
     * 
     */
    private String clusterName;

    private ElastigroupIntegrationEcs() {}
    /**
     * @return A key/value mapping of tags to assign to the resource.
     * 
     */
    public List<ElastigroupIntegrationEcsAutoscaleAttribute> autoscaleAttributes() {
        return this.autoscaleAttributes == null ? List.of() : this.autoscaleAttributes;
    }
    /**
     * @return The amount of time, in seconds, after a scaling activity completes before any further trigger-related scaling activities can start.
     * 
     */
    public Optional<Integer> autoscaleCooldown() {
        return Optional.ofNullable(this.autoscaleCooldown);
    }
    /**
     * @return Settings for scale down actions.
     * 
     */
    public Optional<ElastigroupIntegrationEcsAutoscaleDown> autoscaleDown() {
        return Optional.ofNullable(this.autoscaleDown);
    }
    /**
     * @return An option to set compute reserve for the cluster.
     * 
     */
    public Optional<ElastigroupIntegrationEcsAutoscaleHeadroom> autoscaleHeadroom() {
        return Optional.ofNullable(this.autoscaleHeadroom);
    }
    /**
     * @return Enabling the automatic k8s auto-scaler functionality. For more information please see: [Kubernetes auto scaler](https://api.spotinst.com/integration-docs/elastigroup/container-management/kubernetes/autoscaler/).
     * 
     */
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
     * @return Determines whether to scale down non-service tasks.
     * 
     */
    public Optional<Boolean> autoscaleScaleDownNonServiceTasks() {
        return Optional.ofNullable(this.autoscaleScaleDownNonServiceTasks);
    }
    /**
     * @return Batch configuration object:
     * 
     */
    public Optional<ElastigroupIntegrationEcsBatch> batch() {
        return Optional.ofNullable(this.batch);
    }
    /**
     * @return The name of the EC2 Container Service cluster.
     * 
     */
    public String clusterName() {
        return this.clusterName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ElastigroupIntegrationEcs defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<ElastigroupIntegrationEcsAutoscaleAttribute> autoscaleAttributes;
        private @Nullable Integer autoscaleCooldown;
        private @Nullable ElastigroupIntegrationEcsAutoscaleDown autoscaleDown;
        private @Nullable ElastigroupIntegrationEcsAutoscaleHeadroom autoscaleHeadroom;
        private @Nullable Boolean autoscaleIsAutoConfig;
        private @Nullable Boolean autoscaleIsEnabled;
        private @Nullable Boolean autoscaleScaleDownNonServiceTasks;
        private @Nullable ElastigroupIntegrationEcsBatch batch;
        private String clusterName;
        public Builder() {}
        public Builder(ElastigroupIntegrationEcs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoscaleAttributes = defaults.autoscaleAttributes;
    	      this.autoscaleCooldown = defaults.autoscaleCooldown;
    	      this.autoscaleDown = defaults.autoscaleDown;
    	      this.autoscaleHeadroom = defaults.autoscaleHeadroom;
    	      this.autoscaleIsAutoConfig = defaults.autoscaleIsAutoConfig;
    	      this.autoscaleIsEnabled = defaults.autoscaleIsEnabled;
    	      this.autoscaleScaleDownNonServiceTasks = defaults.autoscaleScaleDownNonServiceTasks;
    	      this.batch = defaults.batch;
    	      this.clusterName = defaults.clusterName;
        }

        @CustomType.Setter
        public Builder autoscaleAttributes(@Nullable List<ElastigroupIntegrationEcsAutoscaleAttribute> autoscaleAttributes) {
            this.autoscaleAttributes = autoscaleAttributes;
            return this;
        }
        public Builder autoscaleAttributes(ElastigroupIntegrationEcsAutoscaleAttribute... autoscaleAttributes) {
            return autoscaleAttributes(List.of(autoscaleAttributes));
        }
        @CustomType.Setter
        public Builder autoscaleCooldown(@Nullable Integer autoscaleCooldown) {
            this.autoscaleCooldown = autoscaleCooldown;
            return this;
        }
        @CustomType.Setter
        public Builder autoscaleDown(@Nullable ElastigroupIntegrationEcsAutoscaleDown autoscaleDown) {
            this.autoscaleDown = autoscaleDown;
            return this;
        }
        @CustomType.Setter
        public Builder autoscaleHeadroom(@Nullable ElastigroupIntegrationEcsAutoscaleHeadroom autoscaleHeadroom) {
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
        public Builder autoscaleScaleDownNonServiceTasks(@Nullable Boolean autoscaleScaleDownNonServiceTasks) {
            this.autoscaleScaleDownNonServiceTasks = autoscaleScaleDownNonServiceTasks;
            return this;
        }
        @CustomType.Setter
        public Builder batch(@Nullable ElastigroupIntegrationEcsBatch batch) {
            this.batch = batch;
            return this;
        }
        @CustomType.Setter
        public Builder clusterName(String clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }
        public ElastigroupIntegrationEcs build() {
            final var o = new ElastigroupIntegrationEcs();
            o.autoscaleAttributes = autoscaleAttributes;
            o.autoscaleCooldown = autoscaleCooldown;
            o.autoscaleDown = autoscaleDown;
            o.autoscaleHeadroom = autoscaleHeadroom;
            o.autoscaleIsAutoConfig = autoscaleIsAutoConfig;
            o.autoscaleIsEnabled = autoscaleIsEnabled;
            o.autoscaleScaleDownNonServiceTasks = autoscaleScaleDownNonServiceTasks;
            o.batch = batch;
            o.clusterName = clusterName;
            return o;
        }
    }
}
