// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.azure.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.spotinst.azure.outputs.OceanNpUpdatePolicyRollConfig;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OceanNpUpdatePolicy {
    /**
     * @return Spot will perform a cluster Roll in accordance with a relevant modification of the cluster’s settings. When set to true , only specific changes in the cluster’s configuration will trigger a cluster roll (such as availability_zones, max_pods_per_node, enable_node_public_ip, os_disk_size_gb, os_disk_type, os_sku, kubernetes_version, vnet_subnet_ids, pod_subnet_ids, labels, taints and tags).
     * 
     */
    private @Nullable Boolean conditionedRoll;
    /**
     * @return While used, you can control whether the group should perform a deployment after an update to the configuration.
     * 
     */
    private @Nullable OceanNpUpdatePolicyRollConfig rollConfig;
    /**
     * @return If set to true along with the cluster update, roll will be triggered.
     * 
     */
    private Boolean shouldRoll;

    private OceanNpUpdatePolicy() {}
    /**
     * @return Spot will perform a cluster Roll in accordance with a relevant modification of the cluster’s settings. When set to true , only specific changes in the cluster’s configuration will trigger a cluster roll (such as availability_zones, max_pods_per_node, enable_node_public_ip, os_disk_size_gb, os_disk_type, os_sku, kubernetes_version, vnet_subnet_ids, pod_subnet_ids, labels, taints and tags).
     * 
     */
    public Optional<Boolean> conditionedRoll() {
        return Optional.ofNullable(this.conditionedRoll);
    }
    /**
     * @return While used, you can control whether the group should perform a deployment after an update to the configuration.
     * 
     */
    public Optional<OceanNpUpdatePolicyRollConfig> rollConfig() {
        return Optional.ofNullable(this.rollConfig);
    }
    /**
     * @return If set to true along with the cluster update, roll will be triggered.
     * 
     */
    public Boolean shouldRoll() {
        return this.shouldRoll;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OceanNpUpdatePolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean conditionedRoll;
        private @Nullable OceanNpUpdatePolicyRollConfig rollConfig;
        private Boolean shouldRoll;
        public Builder() {}
        public Builder(OceanNpUpdatePolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditionedRoll = defaults.conditionedRoll;
    	      this.rollConfig = defaults.rollConfig;
    	      this.shouldRoll = defaults.shouldRoll;
        }

        @CustomType.Setter
        public Builder conditionedRoll(@Nullable Boolean conditionedRoll) {

            this.conditionedRoll = conditionedRoll;
            return this;
        }
        @CustomType.Setter
        public Builder rollConfig(@Nullable OceanNpUpdatePolicyRollConfig rollConfig) {

            this.rollConfig = rollConfig;
            return this;
        }
        @CustomType.Setter
        public Builder shouldRoll(Boolean shouldRoll) {
            if (shouldRoll == null) {
              throw new MissingRequiredPropertyException("OceanNpUpdatePolicy", "shouldRoll");
            }
            this.shouldRoll = shouldRoll;
            return this;
        }
        public OceanNpUpdatePolicy build() {
            final var _resultValue = new OceanNpUpdatePolicy();
            _resultValue.conditionedRoll = conditionedRoll;
            _resultValue.rollConfig = rollConfig;
            _resultValue.shouldRoll = shouldRoll;
            return _resultValue;
        }
    }
}
