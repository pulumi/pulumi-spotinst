// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.azure.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.spotinst.azure.inputs.OceanNpAutoscalerArgs;
import com.pulumi.spotinst.azure.inputs.OceanNpFiltersArgs;
import com.pulumi.spotinst.azure.inputs.OceanNpHeadroomArgs;
import com.pulumi.spotinst.azure.inputs.OceanNpHealthArgs;
import com.pulumi.spotinst.azure.inputs.OceanNpSchedulingArgs;
import com.pulumi.spotinst.azure.inputs.OceanNpTaintArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OceanNpState extends com.pulumi.resources.ResourceArgs {

    public static final OceanNpState Empty = new OceanNpState();

    @Import(name="aksClusterName")
    private @Nullable Output<String> aksClusterName;

    public Optional<Output<String>> aksClusterName() {
        return Optional.ofNullable(this.aksClusterName);
    }

    @Import(name="aksInfrastructureResourceGroupName")
    private @Nullable Output<String> aksInfrastructureResourceGroupName;

    public Optional<Output<String>> aksInfrastructureResourceGroupName() {
        return Optional.ofNullable(this.aksInfrastructureResourceGroupName);
    }

    @Import(name="aksRegion")
    private @Nullable Output<String> aksRegion;

    public Optional<Output<String>> aksRegion() {
        return Optional.ofNullable(this.aksRegion);
    }

    @Import(name="aksResourceGroupName")
    private @Nullable Output<String> aksResourceGroupName;

    public Optional<Output<String>> aksResourceGroupName() {
        return Optional.ofNullable(this.aksResourceGroupName);
    }

    @Import(name="autoscaler")
    private @Nullable Output<OceanNpAutoscalerArgs> autoscaler;

    public Optional<Output<OceanNpAutoscalerArgs>> autoscaler() {
        return Optional.ofNullable(this.autoscaler);
    }

    @Import(name="availabilityZones")
    private @Nullable Output<List<String>> availabilityZones;

    public Optional<Output<List<String>>> availabilityZones() {
        return Optional.ofNullable(this.availabilityZones);
    }

    @Import(name="controllerClusterId")
    private @Nullable Output<String> controllerClusterId;

    public Optional<Output<String>> controllerClusterId() {
        return Optional.ofNullable(this.controllerClusterId);
    }

    @Import(name="enableNodePublicIp")
    private @Nullable Output<Boolean> enableNodePublicIp;

    public Optional<Output<Boolean>> enableNodePublicIp() {
        return Optional.ofNullable(this.enableNodePublicIp);
    }

    @Import(name="fallbackToOndemand")
    private @Nullable Output<Boolean> fallbackToOndemand;

    public Optional<Output<Boolean>> fallbackToOndemand() {
        return Optional.ofNullable(this.fallbackToOndemand);
    }

    @Import(name="filters")
    private @Nullable Output<OceanNpFiltersArgs> filters;

    public Optional<Output<OceanNpFiltersArgs>> filters() {
        return Optional.ofNullable(this.filters);
    }

    @Import(name="headrooms")
    private @Nullable Output<List<OceanNpHeadroomArgs>> headrooms;

    public Optional<Output<List<OceanNpHeadroomArgs>>> headrooms() {
        return Optional.ofNullable(this.headrooms);
    }

    @Import(name="health")
    private @Nullable Output<OceanNpHealthArgs> health;

    public Optional<Output<OceanNpHealthArgs>> health() {
        return Optional.ofNullable(this.health);
    }

    @Import(name="labels")
    private @Nullable Output<Map<String,Object>> labels;

    public Optional<Output<Map<String,Object>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    @Import(name="maxCount")
    private @Nullable Output<Integer> maxCount;

    public Optional<Output<Integer>> maxCount() {
        return Optional.ofNullable(this.maxCount);
    }

    @Import(name="maxPodsPerNode")
    private @Nullable Output<Integer> maxPodsPerNode;

    public Optional<Output<Integer>> maxPodsPerNode() {
        return Optional.ofNullable(this.maxPodsPerNode);
    }

    @Import(name="minCount")
    private @Nullable Output<Integer> minCount;

    public Optional<Output<Integer>> minCount() {
        return Optional.ofNullable(this.minCount);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="osDiskSizeGb")
    private @Nullable Output<Integer> osDiskSizeGb;

    public Optional<Output<Integer>> osDiskSizeGb() {
        return Optional.ofNullable(this.osDiskSizeGb);
    }

    @Import(name="osDiskType")
    private @Nullable Output<String> osDiskType;

    public Optional<Output<String>> osDiskType() {
        return Optional.ofNullable(this.osDiskType);
    }

    @Import(name="osSku")
    private @Nullable Output<String> osSku;

    public Optional<Output<String>> osSku() {
        return Optional.ofNullable(this.osSku);
    }

    @Import(name="osType")
    private @Nullable Output<String> osType;

    public Optional<Output<String>> osType() {
        return Optional.ofNullable(this.osType);
    }

    @Import(name="scheduling")
    private @Nullable Output<OceanNpSchedulingArgs> scheduling;

    public Optional<Output<OceanNpSchedulingArgs>> scheduling() {
        return Optional.ofNullable(this.scheduling);
    }

    @Import(name="spotPercentage")
    private @Nullable Output<Integer> spotPercentage;

    public Optional<Output<Integer>> spotPercentage() {
        return Optional.ofNullable(this.spotPercentage);
    }

    @Import(name="tags")
    private @Nullable Output<Map<String,Object>> tags;

    public Optional<Output<Map<String,Object>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    @Import(name="taints")
    private @Nullable Output<List<OceanNpTaintArgs>> taints;

    public Optional<Output<List<OceanNpTaintArgs>>> taints() {
        return Optional.ofNullable(this.taints);
    }

    private OceanNpState() {}

    private OceanNpState(OceanNpState $) {
        this.aksClusterName = $.aksClusterName;
        this.aksInfrastructureResourceGroupName = $.aksInfrastructureResourceGroupName;
        this.aksRegion = $.aksRegion;
        this.aksResourceGroupName = $.aksResourceGroupName;
        this.autoscaler = $.autoscaler;
        this.availabilityZones = $.availabilityZones;
        this.controllerClusterId = $.controllerClusterId;
        this.enableNodePublicIp = $.enableNodePublicIp;
        this.fallbackToOndemand = $.fallbackToOndemand;
        this.filters = $.filters;
        this.headrooms = $.headrooms;
        this.health = $.health;
        this.labels = $.labels;
        this.maxCount = $.maxCount;
        this.maxPodsPerNode = $.maxPodsPerNode;
        this.minCount = $.minCount;
        this.name = $.name;
        this.osDiskSizeGb = $.osDiskSizeGb;
        this.osDiskType = $.osDiskType;
        this.osSku = $.osSku;
        this.osType = $.osType;
        this.scheduling = $.scheduling;
        this.spotPercentage = $.spotPercentage;
        this.tags = $.tags;
        this.taints = $.taints;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OceanNpState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OceanNpState $;

        public Builder() {
            $ = new OceanNpState();
        }

        public Builder(OceanNpState defaults) {
            $ = new OceanNpState(Objects.requireNonNull(defaults));
        }

        public Builder aksClusterName(@Nullable Output<String> aksClusterName) {
            $.aksClusterName = aksClusterName;
            return this;
        }

        public Builder aksClusterName(String aksClusterName) {
            return aksClusterName(Output.of(aksClusterName));
        }

        public Builder aksInfrastructureResourceGroupName(@Nullable Output<String> aksInfrastructureResourceGroupName) {
            $.aksInfrastructureResourceGroupName = aksInfrastructureResourceGroupName;
            return this;
        }

        public Builder aksInfrastructureResourceGroupName(String aksInfrastructureResourceGroupName) {
            return aksInfrastructureResourceGroupName(Output.of(aksInfrastructureResourceGroupName));
        }

        public Builder aksRegion(@Nullable Output<String> aksRegion) {
            $.aksRegion = aksRegion;
            return this;
        }

        public Builder aksRegion(String aksRegion) {
            return aksRegion(Output.of(aksRegion));
        }

        public Builder aksResourceGroupName(@Nullable Output<String> aksResourceGroupName) {
            $.aksResourceGroupName = aksResourceGroupName;
            return this;
        }

        public Builder aksResourceGroupName(String aksResourceGroupName) {
            return aksResourceGroupName(Output.of(aksResourceGroupName));
        }

        public Builder autoscaler(@Nullable Output<OceanNpAutoscalerArgs> autoscaler) {
            $.autoscaler = autoscaler;
            return this;
        }

        public Builder autoscaler(OceanNpAutoscalerArgs autoscaler) {
            return autoscaler(Output.of(autoscaler));
        }

        public Builder availabilityZones(@Nullable Output<List<String>> availabilityZones) {
            $.availabilityZones = availabilityZones;
            return this;
        }

        public Builder availabilityZones(List<String> availabilityZones) {
            return availabilityZones(Output.of(availabilityZones));
        }

        public Builder availabilityZones(String... availabilityZones) {
            return availabilityZones(List.of(availabilityZones));
        }

        public Builder controllerClusterId(@Nullable Output<String> controllerClusterId) {
            $.controllerClusterId = controllerClusterId;
            return this;
        }

        public Builder controllerClusterId(String controllerClusterId) {
            return controllerClusterId(Output.of(controllerClusterId));
        }

        public Builder enableNodePublicIp(@Nullable Output<Boolean> enableNodePublicIp) {
            $.enableNodePublicIp = enableNodePublicIp;
            return this;
        }

        public Builder enableNodePublicIp(Boolean enableNodePublicIp) {
            return enableNodePublicIp(Output.of(enableNodePublicIp));
        }

        public Builder fallbackToOndemand(@Nullable Output<Boolean> fallbackToOndemand) {
            $.fallbackToOndemand = fallbackToOndemand;
            return this;
        }

        public Builder fallbackToOndemand(Boolean fallbackToOndemand) {
            return fallbackToOndemand(Output.of(fallbackToOndemand));
        }

        public Builder filters(@Nullable Output<OceanNpFiltersArgs> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(OceanNpFiltersArgs filters) {
            return filters(Output.of(filters));
        }

        public Builder headrooms(@Nullable Output<List<OceanNpHeadroomArgs>> headrooms) {
            $.headrooms = headrooms;
            return this;
        }

        public Builder headrooms(List<OceanNpHeadroomArgs> headrooms) {
            return headrooms(Output.of(headrooms));
        }

        public Builder headrooms(OceanNpHeadroomArgs... headrooms) {
            return headrooms(List.of(headrooms));
        }

        public Builder health(@Nullable Output<OceanNpHealthArgs> health) {
            $.health = health;
            return this;
        }

        public Builder health(OceanNpHealthArgs health) {
            return health(Output.of(health));
        }

        public Builder labels(@Nullable Output<Map<String,Object>> labels) {
            $.labels = labels;
            return this;
        }

        public Builder labels(Map<String,Object> labels) {
            return labels(Output.of(labels));
        }

        public Builder maxCount(@Nullable Output<Integer> maxCount) {
            $.maxCount = maxCount;
            return this;
        }

        public Builder maxCount(Integer maxCount) {
            return maxCount(Output.of(maxCount));
        }

        public Builder maxPodsPerNode(@Nullable Output<Integer> maxPodsPerNode) {
            $.maxPodsPerNode = maxPodsPerNode;
            return this;
        }

        public Builder maxPodsPerNode(Integer maxPodsPerNode) {
            return maxPodsPerNode(Output.of(maxPodsPerNode));
        }

        public Builder minCount(@Nullable Output<Integer> minCount) {
            $.minCount = minCount;
            return this;
        }

        public Builder minCount(Integer minCount) {
            return minCount(Output.of(minCount));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder osDiskSizeGb(@Nullable Output<Integer> osDiskSizeGb) {
            $.osDiskSizeGb = osDiskSizeGb;
            return this;
        }

        public Builder osDiskSizeGb(Integer osDiskSizeGb) {
            return osDiskSizeGb(Output.of(osDiskSizeGb));
        }

        public Builder osDiskType(@Nullable Output<String> osDiskType) {
            $.osDiskType = osDiskType;
            return this;
        }

        public Builder osDiskType(String osDiskType) {
            return osDiskType(Output.of(osDiskType));
        }

        public Builder osSku(@Nullable Output<String> osSku) {
            $.osSku = osSku;
            return this;
        }

        public Builder osSku(String osSku) {
            return osSku(Output.of(osSku));
        }

        public Builder osType(@Nullable Output<String> osType) {
            $.osType = osType;
            return this;
        }

        public Builder osType(String osType) {
            return osType(Output.of(osType));
        }

        public Builder scheduling(@Nullable Output<OceanNpSchedulingArgs> scheduling) {
            $.scheduling = scheduling;
            return this;
        }

        public Builder scheduling(OceanNpSchedulingArgs scheduling) {
            return scheduling(Output.of(scheduling));
        }

        public Builder spotPercentage(@Nullable Output<Integer> spotPercentage) {
            $.spotPercentage = spotPercentage;
            return this;
        }

        public Builder spotPercentage(Integer spotPercentage) {
            return spotPercentage(Output.of(spotPercentage));
        }

        public Builder tags(@Nullable Output<Map<String,Object>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,Object> tags) {
            return tags(Output.of(tags));
        }

        public Builder taints(@Nullable Output<List<OceanNpTaintArgs>> taints) {
            $.taints = taints;
            return this;
        }

        public Builder taints(List<OceanNpTaintArgs> taints) {
            return taints(Output.of(taints));
        }

        public Builder taints(OceanNpTaintArgs... taints) {
            return taints(List.of(taints));
        }

        public OceanNpState build() {
            return $;
        }
    }

}
