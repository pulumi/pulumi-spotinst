// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.azure;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.spotinst.azure.inputs.OceanVirtualNodeGroupAutoscaleArgs;
import com.pulumi.spotinst.azure.inputs.OceanVirtualNodeGroupLabelArgs;
import com.pulumi.spotinst.azure.inputs.OceanVirtualNodeGroupLaunchSpecificationArgs;
import com.pulumi.spotinst.azure.inputs.OceanVirtualNodeGroupResourceLimitArgs;
import com.pulumi.spotinst.azure.inputs.OceanVirtualNodeGroupTaintArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OceanVirtualNodeGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final OceanVirtualNodeGroupArgs Empty = new OceanVirtualNodeGroupArgs();

    /**
     * .
     * 
     */
    @Import(name="autoscales")
    private @Nullable Output<List<OceanVirtualNodeGroupAutoscaleArgs>> autoscales;

    /**
     * @return .
     * 
     */
    public Optional<Output<List<OceanVirtualNodeGroupAutoscaleArgs>>> autoscales() {
        return Optional.ofNullable(this.autoscales);
    }

    /**
     * Additional labels for the virtual node group. Only custom user labels are allowed. Kubernetes built-in labels and Spot internal labels are not allowed.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<List<OceanVirtualNodeGroupLabelArgs>> labels;

    /**
     * @return Additional labels for the virtual node group. Only custom user labels are allowed. Kubernetes built-in labels and Spot internal labels are not allowed.
     * 
     */
    public Optional<Output<List<OceanVirtualNodeGroupLabelArgs>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * .
     * 
     */
    @Import(name="launchSpecifications")
    private @Nullable Output<List<OceanVirtualNodeGroupLaunchSpecificationArgs>> launchSpecifications;

    /**
     * @return .
     * 
     */
    public Optional<Output<List<OceanVirtualNodeGroupLaunchSpecificationArgs>>> launchSpecifications() {
        return Optional.ofNullable(this.launchSpecifications);
    }

    /**
     * Set name for the virtual node group.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Set name for the virtual node group.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The Ocean cluster ID.
     * 
     */
    @Import(name="oceanId", required=true)
    private Output<String> oceanId;

    /**
     * @return The Ocean cluster ID.
     * 
     */
    public Output<String> oceanId() {
        return this.oceanId;
    }

    /**
     * .
     * 
     */
    @Import(name="resourceLimits")
    private @Nullable Output<List<OceanVirtualNodeGroupResourceLimitArgs>> resourceLimits;

    /**
     * @return .
     * 
     */
    public Optional<Output<List<OceanVirtualNodeGroupResourceLimitArgs>>> resourceLimits() {
        return Optional.ofNullable(this.resourceLimits);
    }

    /**
     * Additional taints for the virtual node group. Only custom user labels are allowed. Kubernetes built-in labels and Spot internal labels are not allowed.
     * 
     */
    @Import(name="taints")
    private @Nullable Output<List<OceanVirtualNodeGroupTaintArgs>> taints;

    /**
     * @return Additional taints for the virtual node group. Only custom user labels are allowed. Kubernetes built-in labels and Spot internal labels are not allowed.
     * 
     */
    public Optional<Output<List<OceanVirtualNodeGroupTaintArgs>>> taints() {
        return Optional.ofNullable(this.taints);
    }

    /**
     * An Array holding Availability Zones, this configures the availability zones the Ocean may launch instances in per VNG.
     * 
     */
    @Import(name="zones")
    private @Nullable Output<List<String>> zones;

    /**
     * @return An Array holding Availability Zones, this configures the availability zones the Ocean may launch instances in per VNG.
     * 
     */
    public Optional<Output<List<String>>> zones() {
        return Optional.ofNullable(this.zones);
    }

    private OceanVirtualNodeGroupArgs() {}

    private OceanVirtualNodeGroupArgs(OceanVirtualNodeGroupArgs $) {
        this.autoscales = $.autoscales;
        this.labels = $.labels;
        this.launchSpecifications = $.launchSpecifications;
        this.name = $.name;
        this.oceanId = $.oceanId;
        this.resourceLimits = $.resourceLimits;
        this.taints = $.taints;
        this.zones = $.zones;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OceanVirtualNodeGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OceanVirtualNodeGroupArgs $;

        public Builder() {
            $ = new OceanVirtualNodeGroupArgs();
        }

        public Builder(OceanVirtualNodeGroupArgs defaults) {
            $ = new OceanVirtualNodeGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoscales .
         * 
         * @return builder
         * 
         */
        public Builder autoscales(@Nullable Output<List<OceanVirtualNodeGroupAutoscaleArgs>> autoscales) {
            $.autoscales = autoscales;
            return this;
        }

        /**
         * @param autoscales .
         * 
         * @return builder
         * 
         */
        public Builder autoscales(List<OceanVirtualNodeGroupAutoscaleArgs> autoscales) {
            return autoscales(Output.of(autoscales));
        }

        /**
         * @param autoscales .
         * 
         * @return builder
         * 
         */
        public Builder autoscales(OceanVirtualNodeGroupAutoscaleArgs... autoscales) {
            return autoscales(List.of(autoscales));
        }

        /**
         * @param labels Additional labels for the virtual node group. Only custom user labels are allowed. Kubernetes built-in labels and Spot internal labels are not allowed.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<List<OceanVirtualNodeGroupLabelArgs>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Additional labels for the virtual node group. Only custom user labels are allowed. Kubernetes built-in labels and Spot internal labels are not allowed.
         * 
         * @return builder
         * 
         */
        public Builder labels(List<OceanVirtualNodeGroupLabelArgs> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param labels Additional labels for the virtual node group. Only custom user labels are allowed. Kubernetes built-in labels and Spot internal labels are not allowed.
         * 
         * @return builder
         * 
         */
        public Builder labels(OceanVirtualNodeGroupLabelArgs... labels) {
            return labels(List.of(labels));
        }

        /**
         * @param launchSpecifications .
         * 
         * @return builder
         * 
         */
        public Builder launchSpecifications(@Nullable Output<List<OceanVirtualNodeGroupLaunchSpecificationArgs>> launchSpecifications) {
            $.launchSpecifications = launchSpecifications;
            return this;
        }

        /**
         * @param launchSpecifications .
         * 
         * @return builder
         * 
         */
        public Builder launchSpecifications(List<OceanVirtualNodeGroupLaunchSpecificationArgs> launchSpecifications) {
            return launchSpecifications(Output.of(launchSpecifications));
        }

        /**
         * @param launchSpecifications .
         * 
         * @return builder
         * 
         */
        public Builder launchSpecifications(OceanVirtualNodeGroupLaunchSpecificationArgs... launchSpecifications) {
            return launchSpecifications(List.of(launchSpecifications));
        }

        /**
         * @param name Set name for the virtual node group.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Set name for the virtual node group.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param oceanId The Ocean cluster ID.
         * 
         * @return builder
         * 
         */
        public Builder oceanId(Output<String> oceanId) {
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
         * @param resourceLimits .
         * 
         * @return builder
         * 
         */
        public Builder resourceLimits(@Nullable Output<List<OceanVirtualNodeGroupResourceLimitArgs>> resourceLimits) {
            $.resourceLimits = resourceLimits;
            return this;
        }

        /**
         * @param resourceLimits .
         * 
         * @return builder
         * 
         */
        public Builder resourceLimits(List<OceanVirtualNodeGroupResourceLimitArgs> resourceLimits) {
            return resourceLimits(Output.of(resourceLimits));
        }

        /**
         * @param resourceLimits .
         * 
         * @return builder
         * 
         */
        public Builder resourceLimits(OceanVirtualNodeGroupResourceLimitArgs... resourceLimits) {
            return resourceLimits(List.of(resourceLimits));
        }

        /**
         * @param taints Additional taints for the virtual node group. Only custom user labels are allowed. Kubernetes built-in labels and Spot internal labels are not allowed.
         * 
         * @return builder
         * 
         */
        public Builder taints(@Nullable Output<List<OceanVirtualNodeGroupTaintArgs>> taints) {
            $.taints = taints;
            return this;
        }

        /**
         * @param taints Additional taints for the virtual node group. Only custom user labels are allowed. Kubernetes built-in labels and Spot internal labels are not allowed.
         * 
         * @return builder
         * 
         */
        public Builder taints(List<OceanVirtualNodeGroupTaintArgs> taints) {
            return taints(Output.of(taints));
        }

        /**
         * @param taints Additional taints for the virtual node group. Only custom user labels are allowed. Kubernetes built-in labels and Spot internal labels are not allowed.
         * 
         * @return builder
         * 
         */
        public Builder taints(OceanVirtualNodeGroupTaintArgs... taints) {
            return taints(List.of(taints));
        }

        /**
         * @param zones An Array holding Availability Zones, this configures the availability zones the Ocean may launch instances in per VNG.
         * 
         * @return builder
         * 
         */
        public Builder zones(@Nullable Output<List<String>> zones) {
            $.zones = zones;
            return this;
        }

        /**
         * @param zones An Array holding Availability Zones, this configures the availability zones the Ocean may launch instances in per VNG.
         * 
         * @return builder
         * 
         */
        public Builder zones(List<String> zones) {
            return zones(Output.of(zones));
        }

        /**
         * @param zones An Array holding Availability Zones, this configures the availability zones the Ocean may launch instances in per VNG.
         * 
         * @return builder
         * 
         */
        public Builder zones(String... zones) {
            return zones(List.of(zones));
        }

        public OceanVirtualNodeGroupArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.oceanId = Objects.requireNonNull($.oceanId, "expected parameter 'oceanId' to be non-null");
            return $;
        }
    }

}
