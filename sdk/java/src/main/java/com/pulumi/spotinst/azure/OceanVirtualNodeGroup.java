// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.azure;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.spotinst.Utilities;
import com.pulumi.spotinst.azure.OceanVirtualNodeGroupArgs;
import com.pulumi.spotinst.azure.inputs.OceanVirtualNodeGroupState;
import com.pulumi.spotinst.azure.outputs.OceanVirtualNodeGroupAutoscale;
import com.pulumi.spotinst.azure.outputs.OceanVirtualNodeGroupLabel;
import com.pulumi.spotinst.azure.outputs.OceanVirtualNodeGroupLaunchSpecification;
import com.pulumi.spotinst.azure.outputs.OceanVirtualNodeGroupResourceLimit;
import com.pulumi.spotinst.azure.outputs.OceanVirtualNodeGroupTaint;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Spotinst Ocean AKS Virtual Node Group resource.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.spotinst.azure.OceanVirtualNodeGroup;
 * import com.pulumi.spotinst.azure.OceanVirtualNodeGroupArgs;
 * import com.pulumi.spotinst.azure.inputs.OceanVirtualNodeGroupAutoscaleArgs;
 * import com.pulumi.spotinst.azure.inputs.OceanVirtualNodeGroupLabelArgs;
 * import com.pulumi.spotinst.azure.inputs.OceanVirtualNodeGroupLaunchSpecificationArgs;
 * import com.pulumi.spotinst.azure.inputs.OceanVirtualNodeGroupLaunchSpecificationOsDiskArgs;
 * import com.pulumi.spotinst.azure.inputs.OceanVirtualNodeGroupResourceLimitArgs;
 * import com.pulumi.spotinst.azure.inputs.OceanVirtualNodeGroupTaintArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var example = new OceanVirtualNodeGroup(&#34;example&#34;, OceanVirtualNodeGroupArgs.builder()        
 *             .autoscales(OceanVirtualNodeGroupAutoscaleArgs.builder()
 *                 .autoHeadroomPercentage(5)
 *                 .autoscaleHeadrooms(OceanVirtualNodeGroupAutoscaleAutoscaleHeadroomArgs.builder()
 *                     .cpuPerUnit(4)
 *                     .gpuPerUnit(8)
 *                     .memoryPerUnit(100)
 *                     .numOfUnits(16)
 *                     .build())
 *                 .build())
 *             .labels(OceanVirtualNodeGroupLabelArgs.builder()
 *                 .key(&#34;label_key&#34;)
 *                 .value(&#34;label_value&#34;)
 *                 .build())
 *             .launchSpecifications(OceanVirtualNodeGroupLaunchSpecificationArgs.builder()
 *                 .maxPods(30)
 *                 .osDisk(OceanVirtualNodeGroupLaunchSpecificationOsDiskArgs.builder()
 *                     .sizeGb(100)
 *                     .type(&#34;Standard_LRS&#34;)
 *                     .utilizeEphemeralStorage(false)
 *                     .build())
 *                 .tags(OceanVirtualNodeGroupLaunchSpecificationTagArgs.builder()
 *                     .key(&#34;label_key&#34;)
 *                     .value(&#34;label_value&#34;)
 *                     .build())
 *                 .build())
 *             .oceanId(&#34;o-12345&#34;)
 *             .resourceLimits(OceanVirtualNodeGroupResourceLimitArgs.builder()
 *                 .maxInstanceCount(4)
 *                 .build())
 *             .taints(OceanVirtualNodeGroupTaintArgs.builder()
 *                 .effect(&#34;NoSchedule&#34;)
 *                 .key(&#34;taint_key&#34;)
 *                 .value(&#34;taint_value&#34;)
 *                 .build())
 *             .zones(            
 *                 &#34;1&#34;,
 *                 &#34;2&#34;,
 *                 &#34;3&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         ctx.export(&#34;oceanId&#34;, spotinst_ocean_aks_.example().id());
 *     }
 * }
 * ```
 * 
 */
@ResourceType(type="spotinst:azure/oceanVirtualNodeGroup:OceanVirtualNodeGroup")
public class OceanVirtualNodeGroup extends com.pulumi.resources.CustomResource {
    /**
     * .
     * 
     */
    @Export(name="autoscales", refs={List.class,OceanVirtualNodeGroupAutoscale.class}, tree="[0,1]")
    private Output</* @Nullable */ List<OceanVirtualNodeGroupAutoscale>> autoscales;

    /**
     * @return .
     * 
     */
    public Output<Optional<List<OceanVirtualNodeGroupAutoscale>>> autoscales() {
        return Codegen.optional(this.autoscales);
    }
    /**
     * Additional labels for the virtual node group. Only custom user labels are allowed. Kubernetes built-in labels and Spot internal labels are not allowed.
     * 
     */
    @Export(name="labels", refs={List.class,OceanVirtualNodeGroupLabel.class}, tree="[0,1]")
    private Output</* @Nullable */ List<OceanVirtualNodeGroupLabel>> labels;

    /**
     * @return Additional labels for the virtual node group. Only custom user labels are allowed. Kubernetes built-in labels and Spot internal labels are not allowed.
     * 
     */
    public Output<Optional<List<OceanVirtualNodeGroupLabel>>> labels() {
        return Codegen.optional(this.labels);
    }
    /**
     * .
     * 
     */
    @Export(name="launchSpecifications", refs={List.class,OceanVirtualNodeGroupLaunchSpecification.class}, tree="[0,1]")
    private Output</* @Nullable */ List<OceanVirtualNodeGroupLaunchSpecification>> launchSpecifications;

    /**
     * @return .
     * 
     */
    public Output<Optional<List<OceanVirtualNodeGroupLaunchSpecification>>> launchSpecifications() {
        return Codegen.optional(this.launchSpecifications);
    }
    /**
     * Set name for the virtual node group.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
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
    @Export(name="oceanId", refs={String.class}, tree="[0]")
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
    @Export(name="resourceLimits", refs={List.class,OceanVirtualNodeGroupResourceLimit.class}, tree="[0,1]")
    private Output</* @Nullable */ List<OceanVirtualNodeGroupResourceLimit>> resourceLimits;

    /**
     * @return .
     * 
     */
    public Output<Optional<List<OceanVirtualNodeGroupResourceLimit>>> resourceLimits() {
        return Codegen.optional(this.resourceLimits);
    }
    /**
     * Additional taints for the virtual node group. Only custom user labels are allowed. Kubernetes built-in labels and Spot internal labels are not allowed.
     * 
     */
    @Export(name="taints", refs={List.class,OceanVirtualNodeGroupTaint.class}, tree="[0,1]")
    private Output</* @Nullable */ List<OceanVirtualNodeGroupTaint>> taints;

    /**
     * @return Additional taints for the virtual node group. Only custom user labels are allowed. Kubernetes built-in labels and Spot internal labels are not allowed.
     * 
     */
    public Output<Optional<List<OceanVirtualNodeGroupTaint>>> taints() {
        return Codegen.optional(this.taints);
    }
    /**
     * An Array holding Availability Zones, this configures the availability zones the Ocean may launch instances in per VNG.
     * 
     */
    @Export(name="zones", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> zones;

    /**
     * @return An Array holding Availability Zones, this configures the availability zones the Ocean may launch instances in per VNG.
     * 
     */
    public Output<Optional<List<String>>> zones() {
        return Codegen.optional(this.zones);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public OceanVirtualNodeGroup(String name) {
        this(name, OceanVirtualNodeGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public OceanVirtualNodeGroup(String name, OceanVirtualNodeGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public OceanVirtualNodeGroup(String name, OceanVirtualNodeGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("spotinst:azure/oceanVirtualNodeGroup:OceanVirtualNodeGroup", name, args == null ? OceanVirtualNodeGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private OceanVirtualNodeGroup(String name, Output<String> id, @Nullable OceanVirtualNodeGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("spotinst:azure/oceanVirtualNodeGroup:OceanVirtualNodeGroup", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static OceanVirtualNodeGroup get(String name, Output<String> id, @Nullable OceanVirtualNodeGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new OceanVirtualNodeGroup(name, id, state, options);
    }
}
