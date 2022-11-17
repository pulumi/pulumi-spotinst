// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.gke.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.spotinst.gke.inputs.OceanLaunchSpecAutoscaleHeadroomArgs;
import com.pulumi.spotinst.gke.inputs.OceanLaunchSpecAutoscaleHeadroomsAutomaticArgs;
import com.pulumi.spotinst.gke.inputs.OceanLaunchSpecLabelArgs;
import com.pulumi.spotinst.gke.inputs.OceanLaunchSpecMetadataArgs;
import com.pulumi.spotinst.gke.inputs.OceanLaunchSpecResourceLimitsArgs;
import com.pulumi.spotinst.gke.inputs.OceanLaunchSpecSchedulingTaskArgs;
import com.pulumi.spotinst.gke.inputs.OceanLaunchSpecShieldedInstanceConfigArgs;
import com.pulumi.spotinst.gke.inputs.OceanLaunchSpecStorageArgs;
import com.pulumi.spotinst.gke.inputs.OceanLaunchSpecStrategyArgs;
import com.pulumi.spotinst.gke.inputs.OceanLaunchSpecTaintArgs;
import com.pulumi.spotinst.gke.inputs.OceanLaunchSpecUpdatePolicyArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OceanLaunchSpecState extends com.pulumi.resources.ResourceArgs {

    public static final OceanLaunchSpecState Empty = new OceanLaunchSpecState();

    /**
     * Set custom headroom per launch spec. provide list of headrooms object.
     * 
     */
    @Import(name="autoscaleHeadrooms")
    private @Nullable Output<List<OceanLaunchSpecAutoscaleHeadroomArgs>> autoscaleHeadrooms;

    /**
     * @return Set custom headroom per launch spec. provide list of headrooms object.
     * 
     */
    public Optional<Output<List<OceanLaunchSpecAutoscaleHeadroomArgs>>> autoscaleHeadrooms() {
        return Optional.ofNullable(this.autoscaleHeadrooms);
    }

    /**
     * Set automatic headroom per launch spec.
     * 
     */
    @Import(name="autoscaleHeadroomsAutomatics")
    private @Nullable Output<List<OceanLaunchSpecAutoscaleHeadroomsAutomaticArgs>> autoscaleHeadroomsAutomatics;

    /**
     * @return Set automatic headroom per launch spec.
     * 
     */
    public Optional<Output<List<OceanLaunchSpecAutoscaleHeadroomsAutomaticArgs>>> autoscaleHeadroomsAutomatics() {
        return Optional.ofNullable(this.autoscaleHeadroomsAutomatics);
    }

    /**
     * List of supported machine types for the Launch Spec.
     * 
     */
    @Import(name="instanceTypes")
    private @Nullable Output<List<String>> instanceTypes;

    /**
     * @return List of supported machine types for the Launch Spec.
     * 
     */
    public Optional<Output<List<String>>> instanceTypes() {
        return Optional.ofNullable(this.instanceTypes);
    }

    /**
     * Optionally adds labels to instances launched in an Ocean cluster.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<List<OceanLaunchSpecLabelArgs>> labels;

    /**
     * @return Optionally adds labels to instances launched in an Ocean cluster.
     * 
     */
    public Optional<Output<List<OceanLaunchSpecLabelArgs>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Cluster&#39;s metadata.
     * 
     */
    @Import(name="metadatas")
    private @Nullable Output<List<OceanLaunchSpecMetadataArgs>> metadatas;

    /**
     * @return Cluster&#39;s metadata.
     * 
     */
    public Optional<Output<List<OceanLaunchSpecMetadataArgs>>> metadatas() {
        return Optional.ofNullable(this.metadatas);
    }

    /**
     * The launch specification name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The launch specification name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The node pool you wish to use in your Launch Spec.
     * 
     */
    @Import(name="nodePoolName")
    private @Nullable Output<String> nodePoolName;

    /**
     * @return The node pool you wish to use in your Launch Spec.
     * 
     */
    public Optional<Output<String>> nodePoolName() {
        return Optional.ofNullable(this.nodePoolName);
    }

    /**
     * The Ocean cluster ID.
     * 
     */
    @Import(name="oceanId")
    private @Nullable Output<String> oceanId;

    /**
     * @return The Ocean cluster ID.
     * 
     */
    public Optional<Output<String>> oceanId() {
        return Optional.ofNullable(this.oceanId);
    }

    /**
     * The Ocean virtual node group resource limits object.
     * 
     */
    @Import(name="resourceLimits")
    private @Nullable Output<OceanLaunchSpecResourceLimitsArgs> resourceLimits;

    /**
     * @return The Ocean virtual node group resource limits object.
     * 
     */
    public Optional<Output<OceanLaunchSpecResourceLimitsArgs>> resourceLimits() {
        return Optional.ofNullable(this.resourceLimits);
    }

    /**
     * Boolean. When set to `true`, VNG nodes will be treated as if all pods running have the restrict-scale-down label. Therefore, Ocean will not scale nodes down unless empty.
     * 
     */
    @Import(name="restrictScaleDown")
    private @Nullable Output<Boolean> restrictScaleDown;

    /**
     * @return Boolean. When set to `true`, VNG nodes will be treated as if all pods running have the restrict-scale-down label. Therefore, Ocean will not scale nodes down unless empty.
     * 
     */
    public Optional<Output<Boolean>> restrictScaleDown() {
        return Optional.ofNullable(this.restrictScaleDown);
    }

    /**
     * Root volume size (in GB).
     * 
     */
    @Import(name="rootVolumeSize")
    private @Nullable Output<Integer> rootVolumeSize;

    /**
     * @return Root volume size (in GB).
     * 
     */
    public Optional<Output<Integer>> rootVolumeSize() {
        return Optional.ofNullable(this.rootVolumeSize);
    }

    /**
     * Root volume disk type. Valid values: `&#34;pd-standard&#34;`, `&#34;pd-ssd&#34;`.
     * 
     */
    @Import(name="rootVolumeType")
    private @Nullable Output<String> rootVolumeType;

    /**
     * @return Root volume disk type. Valid values: `&#34;pd-standard&#34;`, `&#34;pd-ssd&#34;`.
     * 
     */
    public Optional<Output<String>> rootVolumeType() {
        return Optional.ofNullable(this.rootVolumeType);
    }

    /**
     * Used to define scheduled tasks such as a manual headroom update.
     * 
     */
    @Import(name="schedulingTasks")
    private @Nullable Output<List<OceanLaunchSpecSchedulingTaskArgs>> schedulingTasks;

    /**
     * @return Used to define scheduled tasks such as a manual headroom update.
     * 
     */
    public Optional<Output<List<OceanLaunchSpecSchedulingTaskArgs>>> schedulingTasks() {
        return Optional.ofNullable(this.schedulingTasks);
    }

    /**
     * The account used by applications running on the VM to call GCP APIs.
     * 
     */
    @Import(name="serviceAccount")
    private @Nullable Output<String> serviceAccount;

    /**
     * @return The account used by applications running on the VM to call GCP APIs.
     * 
     */
    public Optional<Output<String>> serviceAccount() {
        return Optional.ofNullable(this.serviceAccount);
    }

    /**
     * The Ocean shielded instance configuration object.
     * 
     */
    @Import(name="shieldedInstanceConfig")
    private @Nullable Output<OceanLaunchSpecShieldedInstanceConfigArgs> shieldedInstanceConfig;

    /**
     * @return The Ocean shielded instance configuration object.
     * 
     */
    public Optional<Output<OceanLaunchSpecShieldedInstanceConfigArgs>> shieldedInstanceConfig() {
        return Optional.ofNullable(this.shieldedInstanceConfig);
    }

    /**
     * Image URL.
     * 
     */
    @Import(name="sourceImage")
    private @Nullable Output<String> sourceImage;

    /**
     * @return Image URL.
     * 
     */
    public Optional<Output<String>> sourceImage() {
        return Optional.ofNullable(this.sourceImage);
    }

    /**
     * The Ocean virtual node group storage object.
     * 
     */
    @Import(name="storage")
    private @Nullable Output<OceanLaunchSpecStorageArgs> storage;

    /**
     * @return The Ocean virtual node group storage object.
     * 
     */
    public Optional<Output<OceanLaunchSpecStorageArgs>> storage() {
        return Optional.ofNullable(this.storage);
    }

    /**
     * The Ocean Launch Spec Strategy object.
     * 
     */
    @Import(name="strategies")
    private @Nullable Output<List<OceanLaunchSpecStrategyArgs>> strategies;

    /**
     * @return The Ocean Launch Spec Strategy object.
     * 
     */
    public Optional<Output<List<OceanLaunchSpecStrategyArgs>>> strategies() {
        return Optional.ofNullable(this.strategies);
    }

    /**
     * Optionally adds labels to instances launched in an Ocean cluster.
     * 
     */
    @Import(name="taints")
    private @Nullable Output<List<OceanLaunchSpecTaintArgs>> taints;

    /**
     * @return Optionally adds labels to instances launched in an Ocean cluster.
     * 
     */
    public Optional<Output<List<OceanLaunchSpecTaintArgs>>> taints() {
        return Optional.ofNullable(this.taints);
    }

    @Import(name="updatePolicy")
    private @Nullable Output<OceanLaunchSpecUpdatePolicyArgs> updatePolicy;

    public Optional<Output<OceanLaunchSpecUpdatePolicyArgs>> updatePolicy() {
        return Optional.ofNullable(this.updatePolicy);
    }

    private OceanLaunchSpecState() {}

    private OceanLaunchSpecState(OceanLaunchSpecState $) {
        this.autoscaleHeadrooms = $.autoscaleHeadrooms;
        this.autoscaleHeadroomsAutomatics = $.autoscaleHeadroomsAutomatics;
        this.instanceTypes = $.instanceTypes;
        this.labels = $.labels;
        this.metadatas = $.metadatas;
        this.name = $.name;
        this.nodePoolName = $.nodePoolName;
        this.oceanId = $.oceanId;
        this.resourceLimits = $.resourceLimits;
        this.restrictScaleDown = $.restrictScaleDown;
        this.rootVolumeSize = $.rootVolumeSize;
        this.rootVolumeType = $.rootVolumeType;
        this.schedulingTasks = $.schedulingTasks;
        this.serviceAccount = $.serviceAccount;
        this.shieldedInstanceConfig = $.shieldedInstanceConfig;
        this.sourceImage = $.sourceImage;
        this.storage = $.storage;
        this.strategies = $.strategies;
        this.taints = $.taints;
        this.updatePolicy = $.updatePolicy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OceanLaunchSpecState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OceanLaunchSpecState $;

        public Builder() {
            $ = new OceanLaunchSpecState();
        }

        public Builder(OceanLaunchSpecState defaults) {
            $ = new OceanLaunchSpecState(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoscaleHeadrooms Set custom headroom per launch spec. provide list of headrooms object.
         * 
         * @return builder
         * 
         */
        public Builder autoscaleHeadrooms(@Nullable Output<List<OceanLaunchSpecAutoscaleHeadroomArgs>> autoscaleHeadrooms) {
            $.autoscaleHeadrooms = autoscaleHeadrooms;
            return this;
        }

        /**
         * @param autoscaleHeadrooms Set custom headroom per launch spec. provide list of headrooms object.
         * 
         * @return builder
         * 
         */
        public Builder autoscaleHeadrooms(List<OceanLaunchSpecAutoscaleHeadroomArgs> autoscaleHeadrooms) {
            return autoscaleHeadrooms(Output.of(autoscaleHeadrooms));
        }

        /**
         * @param autoscaleHeadrooms Set custom headroom per launch spec. provide list of headrooms object.
         * 
         * @return builder
         * 
         */
        public Builder autoscaleHeadrooms(OceanLaunchSpecAutoscaleHeadroomArgs... autoscaleHeadrooms) {
            return autoscaleHeadrooms(List.of(autoscaleHeadrooms));
        }

        /**
         * @param autoscaleHeadroomsAutomatics Set automatic headroom per launch spec.
         * 
         * @return builder
         * 
         */
        public Builder autoscaleHeadroomsAutomatics(@Nullable Output<List<OceanLaunchSpecAutoscaleHeadroomsAutomaticArgs>> autoscaleHeadroomsAutomatics) {
            $.autoscaleHeadroomsAutomatics = autoscaleHeadroomsAutomatics;
            return this;
        }

        /**
         * @param autoscaleHeadroomsAutomatics Set automatic headroom per launch spec.
         * 
         * @return builder
         * 
         */
        public Builder autoscaleHeadroomsAutomatics(List<OceanLaunchSpecAutoscaleHeadroomsAutomaticArgs> autoscaleHeadroomsAutomatics) {
            return autoscaleHeadroomsAutomatics(Output.of(autoscaleHeadroomsAutomatics));
        }

        /**
         * @param autoscaleHeadroomsAutomatics Set automatic headroom per launch spec.
         * 
         * @return builder
         * 
         */
        public Builder autoscaleHeadroomsAutomatics(OceanLaunchSpecAutoscaleHeadroomsAutomaticArgs... autoscaleHeadroomsAutomatics) {
            return autoscaleHeadroomsAutomatics(List.of(autoscaleHeadroomsAutomatics));
        }

        /**
         * @param instanceTypes List of supported machine types for the Launch Spec.
         * 
         * @return builder
         * 
         */
        public Builder instanceTypes(@Nullable Output<List<String>> instanceTypes) {
            $.instanceTypes = instanceTypes;
            return this;
        }

        /**
         * @param instanceTypes List of supported machine types for the Launch Spec.
         * 
         * @return builder
         * 
         */
        public Builder instanceTypes(List<String> instanceTypes) {
            return instanceTypes(Output.of(instanceTypes));
        }

        /**
         * @param instanceTypes List of supported machine types for the Launch Spec.
         * 
         * @return builder
         * 
         */
        public Builder instanceTypes(String... instanceTypes) {
            return instanceTypes(List.of(instanceTypes));
        }

        /**
         * @param labels Optionally adds labels to instances launched in an Ocean cluster.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<List<OceanLaunchSpecLabelArgs>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Optionally adds labels to instances launched in an Ocean cluster.
         * 
         * @return builder
         * 
         */
        public Builder labels(List<OceanLaunchSpecLabelArgs> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param labels Optionally adds labels to instances launched in an Ocean cluster.
         * 
         * @return builder
         * 
         */
        public Builder labels(OceanLaunchSpecLabelArgs... labels) {
            return labels(List.of(labels));
        }

        /**
         * @param metadatas Cluster&#39;s metadata.
         * 
         * @return builder
         * 
         */
        public Builder metadatas(@Nullable Output<List<OceanLaunchSpecMetadataArgs>> metadatas) {
            $.metadatas = metadatas;
            return this;
        }

        /**
         * @param metadatas Cluster&#39;s metadata.
         * 
         * @return builder
         * 
         */
        public Builder metadatas(List<OceanLaunchSpecMetadataArgs> metadatas) {
            return metadatas(Output.of(metadatas));
        }

        /**
         * @param metadatas Cluster&#39;s metadata.
         * 
         * @return builder
         * 
         */
        public Builder metadatas(OceanLaunchSpecMetadataArgs... metadatas) {
            return metadatas(List.of(metadatas));
        }

        /**
         * @param name The launch specification name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The launch specification name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param nodePoolName The node pool you wish to use in your Launch Spec.
         * 
         * @return builder
         * 
         */
        public Builder nodePoolName(@Nullable Output<String> nodePoolName) {
            $.nodePoolName = nodePoolName;
            return this;
        }

        /**
         * @param nodePoolName The node pool you wish to use in your Launch Spec.
         * 
         * @return builder
         * 
         */
        public Builder nodePoolName(String nodePoolName) {
            return nodePoolName(Output.of(nodePoolName));
        }

        /**
         * @param oceanId The Ocean cluster ID.
         * 
         * @return builder
         * 
         */
        public Builder oceanId(@Nullable Output<String> oceanId) {
            $.oceanId = oceanId;
            return this;
        }

        /**
         * @param oceanId The Ocean cluster ID.
         * 
         * @return builder
         * 
         */
        public Builder oceanId(String oceanId) {
            return oceanId(Output.of(oceanId));
        }

        /**
         * @param resourceLimits The Ocean virtual node group resource limits object.
         * 
         * @return builder
         * 
         */
        public Builder resourceLimits(@Nullable Output<OceanLaunchSpecResourceLimitsArgs> resourceLimits) {
            $.resourceLimits = resourceLimits;
            return this;
        }

        /**
         * @param resourceLimits The Ocean virtual node group resource limits object.
         * 
         * @return builder
         * 
         */
        public Builder resourceLimits(OceanLaunchSpecResourceLimitsArgs resourceLimits) {
            return resourceLimits(Output.of(resourceLimits));
        }

        /**
         * @param restrictScaleDown Boolean. When set to `true`, VNG nodes will be treated as if all pods running have the restrict-scale-down label. Therefore, Ocean will not scale nodes down unless empty.
         * 
         * @return builder
         * 
         */
        public Builder restrictScaleDown(@Nullable Output<Boolean> restrictScaleDown) {
            $.restrictScaleDown = restrictScaleDown;
            return this;
        }

        /**
         * @param restrictScaleDown Boolean. When set to `true`, VNG nodes will be treated as if all pods running have the restrict-scale-down label. Therefore, Ocean will not scale nodes down unless empty.
         * 
         * @return builder
         * 
         */
        public Builder restrictScaleDown(Boolean restrictScaleDown) {
            return restrictScaleDown(Output.of(restrictScaleDown));
        }

        /**
         * @param rootVolumeSize Root volume size (in GB).
         * 
         * @return builder
         * 
         */
        public Builder rootVolumeSize(@Nullable Output<Integer> rootVolumeSize) {
            $.rootVolumeSize = rootVolumeSize;
            return this;
        }

        /**
         * @param rootVolumeSize Root volume size (in GB).
         * 
         * @return builder
         * 
         */
        public Builder rootVolumeSize(Integer rootVolumeSize) {
            return rootVolumeSize(Output.of(rootVolumeSize));
        }

        /**
         * @param rootVolumeType Root volume disk type. Valid values: `&#34;pd-standard&#34;`, `&#34;pd-ssd&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder rootVolumeType(@Nullable Output<String> rootVolumeType) {
            $.rootVolumeType = rootVolumeType;
            return this;
        }

        /**
         * @param rootVolumeType Root volume disk type. Valid values: `&#34;pd-standard&#34;`, `&#34;pd-ssd&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder rootVolumeType(String rootVolumeType) {
            return rootVolumeType(Output.of(rootVolumeType));
        }

        /**
         * @param schedulingTasks Used to define scheduled tasks such as a manual headroom update.
         * 
         * @return builder
         * 
         */
        public Builder schedulingTasks(@Nullable Output<List<OceanLaunchSpecSchedulingTaskArgs>> schedulingTasks) {
            $.schedulingTasks = schedulingTasks;
            return this;
        }

        /**
         * @param schedulingTasks Used to define scheduled tasks such as a manual headroom update.
         * 
         * @return builder
         * 
         */
        public Builder schedulingTasks(List<OceanLaunchSpecSchedulingTaskArgs> schedulingTasks) {
            return schedulingTasks(Output.of(schedulingTasks));
        }

        /**
         * @param schedulingTasks Used to define scheduled tasks such as a manual headroom update.
         * 
         * @return builder
         * 
         */
        public Builder schedulingTasks(OceanLaunchSpecSchedulingTaskArgs... schedulingTasks) {
            return schedulingTasks(List.of(schedulingTasks));
        }

        /**
         * @param serviceAccount The account used by applications running on the VM to call GCP APIs.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccount(@Nullable Output<String> serviceAccount) {
            $.serviceAccount = serviceAccount;
            return this;
        }

        /**
         * @param serviceAccount The account used by applications running on the VM to call GCP APIs.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccount(String serviceAccount) {
            return serviceAccount(Output.of(serviceAccount));
        }

        /**
         * @param shieldedInstanceConfig The Ocean shielded instance configuration object.
         * 
         * @return builder
         * 
         */
        public Builder shieldedInstanceConfig(@Nullable Output<OceanLaunchSpecShieldedInstanceConfigArgs> shieldedInstanceConfig) {
            $.shieldedInstanceConfig = shieldedInstanceConfig;
            return this;
        }

        /**
         * @param shieldedInstanceConfig The Ocean shielded instance configuration object.
         * 
         * @return builder
         * 
         */
        public Builder shieldedInstanceConfig(OceanLaunchSpecShieldedInstanceConfigArgs shieldedInstanceConfig) {
            return shieldedInstanceConfig(Output.of(shieldedInstanceConfig));
        }

        /**
         * @param sourceImage Image URL.
         * 
         * @return builder
         * 
         */
        public Builder sourceImage(@Nullable Output<String> sourceImage) {
            $.sourceImage = sourceImage;
            return this;
        }

        /**
         * @param sourceImage Image URL.
         * 
         * @return builder
         * 
         */
        public Builder sourceImage(String sourceImage) {
            return sourceImage(Output.of(sourceImage));
        }

        /**
         * @param storage The Ocean virtual node group storage object.
         * 
         * @return builder
         * 
         */
        public Builder storage(@Nullable Output<OceanLaunchSpecStorageArgs> storage) {
            $.storage = storage;
            return this;
        }

        /**
         * @param storage The Ocean virtual node group storage object.
         * 
         * @return builder
         * 
         */
        public Builder storage(OceanLaunchSpecStorageArgs storage) {
            return storage(Output.of(storage));
        }

        /**
         * @param strategies The Ocean Launch Spec Strategy object.
         * 
         * @return builder
         * 
         */
        public Builder strategies(@Nullable Output<List<OceanLaunchSpecStrategyArgs>> strategies) {
            $.strategies = strategies;
            return this;
        }

        /**
         * @param strategies The Ocean Launch Spec Strategy object.
         * 
         * @return builder
         * 
         */
        public Builder strategies(List<OceanLaunchSpecStrategyArgs> strategies) {
            return strategies(Output.of(strategies));
        }

        /**
         * @param strategies The Ocean Launch Spec Strategy object.
         * 
         * @return builder
         * 
         */
        public Builder strategies(OceanLaunchSpecStrategyArgs... strategies) {
            return strategies(List.of(strategies));
        }

        /**
         * @param taints Optionally adds labels to instances launched in an Ocean cluster.
         * 
         * @return builder
         * 
         */
        public Builder taints(@Nullable Output<List<OceanLaunchSpecTaintArgs>> taints) {
            $.taints = taints;
            return this;
        }

        /**
         * @param taints Optionally adds labels to instances launched in an Ocean cluster.
         * 
         * @return builder
         * 
         */
        public Builder taints(List<OceanLaunchSpecTaintArgs> taints) {
            return taints(Output.of(taints));
        }

        /**
         * @param taints Optionally adds labels to instances launched in an Ocean cluster.
         * 
         * @return builder
         * 
         */
        public Builder taints(OceanLaunchSpecTaintArgs... taints) {
            return taints(List.of(taints));
        }

        public Builder updatePolicy(@Nullable Output<OceanLaunchSpecUpdatePolicyArgs> updatePolicy) {
            $.updatePolicy = updatePolicy;
            return this;
        }

        public Builder updatePolicy(OceanLaunchSpecUpdatePolicyArgs updatePolicy) {
            return updatePolicy(Output.of(updatePolicy));
        }

        public OceanLaunchSpecState build() {
            return $;
        }
    }

}
