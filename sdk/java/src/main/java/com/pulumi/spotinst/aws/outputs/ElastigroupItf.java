// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.spotinst.aws.outputs.ElastigroupItfDefaultStaticTargetGroup;
import com.pulumi.spotinst.aws.outputs.ElastigroupItfLoadBalancer;
import com.pulumi.spotinst.aws.outputs.ElastigroupItfTargetGroupConfig;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ElastigroupItf {
    private @Nullable ElastigroupItfDefaultStaticTargetGroup defaultStaticTargetGroup;
    private Boolean fixedTargetGroups;
    private List<ElastigroupItfLoadBalancer> loadBalancers;
    private @Nullable Integer migrationHealthinessThreshold;
    private List<ElastigroupItfTargetGroupConfig> targetGroupConfigs;
    private String weightStrategy;

    private ElastigroupItf() {}
    public Optional<ElastigroupItfDefaultStaticTargetGroup> defaultStaticTargetGroup() {
        return Optional.ofNullable(this.defaultStaticTargetGroup);
    }
    public Boolean fixedTargetGroups() {
        return this.fixedTargetGroups;
    }
    public List<ElastigroupItfLoadBalancer> loadBalancers() {
        return this.loadBalancers;
    }
    public Optional<Integer> migrationHealthinessThreshold() {
        return Optional.ofNullable(this.migrationHealthinessThreshold);
    }
    public List<ElastigroupItfTargetGroupConfig> targetGroupConfigs() {
        return this.targetGroupConfigs;
    }
    public String weightStrategy() {
        return this.weightStrategy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ElastigroupItf defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ElastigroupItfDefaultStaticTargetGroup defaultStaticTargetGroup;
        private Boolean fixedTargetGroups;
        private List<ElastigroupItfLoadBalancer> loadBalancers;
        private @Nullable Integer migrationHealthinessThreshold;
        private List<ElastigroupItfTargetGroupConfig> targetGroupConfigs;
        private String weightStrategy;
        public Builder() {}
        public Builder(ElastigroupItf defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultStaticTargetGroup = defaults.defaultStaticTargetGroup;
    	      this.fixedTargetGroups = defaults.fixedTargetGroups;
    	      this.loadBalancers = defaults.loadBalancers;
    	      this.migrationHealthinessThreshold = defaults.migrationHealthinessThreshold;
    	      this.targetGroupConfigs = defaults.targetGroupConfigs;
    	      this.weightStrategy = defaults.weightStrategy;
        }

        @CustomType.Setter
        public Builder defaultStaticTargetGroup(@Nullable ElastigroupItfDefaultStaticTargetGroup defaultStaticTargetGroup) {

            this.defaultStaticTargetGroup = defaultStaticTargetGroup;
            return this;
        }
        @CustomType.Setter
        public Builder fixedTargetGroups(Boolean fixedTargetGroups) {
            if (fixedTargetGroups == null) {
              throw new MissingRequiredPropertyException("ElastigroupItf", "fixedTargetGroups");
            }
            this.fixedTargetGroups = fixedTargetGroups;
            return this;
        }
        @CustomType.Setter
        public Builder loadBalancers(List<ElastigroupItfLoadBalancer> loadBalancers) {
            if (loadBalancers == null) {
              throw new MissingRequiredPropertyException("ElastigroupItf", "loadBalancers");
            }
            this.loadBalancers = loadBalancers;
            return this;
        }
        public Builder loadBalancers(ElastigroupItfLoadBalancer... loadBalancers) {
            return loadBalancers(List.of(loadBalancers));
        }
        @CustomType.Setter
        public Builder migrationHealthinessThreshold(@Nullable Integer migrationHealthinessThreshold) {

            this.migrationHealthinessThreshold = migrationHealthinessThreshold;
            return this;
        }
        @CustomType.Setter
        public Builder targetGroupConfigs(List<ElastigroupItfTargetGroupConfig> targetGroupConfigs) {
            if (targetGroupConfigs == null) {
              throw new MissingRequiredPropertyException("ElastigroupItf", "targetGroupConfigs");
            }
            this.targetGroupConfigs = targetGroupConfigs;
            return this;
        }
        public Builder targetGroupConfigs(ElastigroupItfTargetGroupConfig... targetGroupConfigs) {
            return targetGroupConfigs(List.of(targetGroupConfigs));
        }
        @CustomType.Setter
        public Builder weightStrategy(String weightStrategy) {
            if (weightStrategy == null) {
              throw new MissingRequiredPropertyException("ElastigroupItf", "weightStrategy");
            }
            this.weightStrategy = weightStrategy;
            return this;
        }
        public ElastigroupItf build() {
            final var _resultValue = new ElastigroupItf();
            _resultValue.defaultStaticTargetGroup = defaultStaticTargetGroup;
            _resultValue.fixedTargetGroups = fixedTargetGroups;
            _resultValue.loadBalancers = loadBalancers;
            _resultValue.migrationHealthinessThreshold = migrationHealthinessThreshold;
            _resultValue.targetGroupConfigs = targetGroupConfigs;
            _resultValue.weightStrategy = weightStrategy;
            return _resultValue;
        }
    }
}
