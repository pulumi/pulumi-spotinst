// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.gke;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.spotinst.Utilities;
import com.pulumi.spotinst.gke.OceanLaunchSpecArgs;
import com.pulumi.spotinst.gke.inputs.OceanLaunchSpecState;
import com.pulumi.spotinst.gke.outputs.OceanLaunchSpecAutoscaleHeadroom;
import com.pulumi.spotinst.gke.outputs.OceanLaunchSpecAutoscaleHeadroomsAutomatic;
import com.pulumi.spotinst.gke.outputs.OceanLaunchSpecLabel;
import com.pulumi.spotinst.gke.outputs.OceanLaunchSpecMetadata;
import com.pulumi.spotinst.gke.outputs.OceanLaunchSpecNetworkInterface;
import com.pulumi.spotinst.gke.outputs.OceanLaunchSpecResourceLimits;
import com.pulumi.spotinst.gke.outputs.OceanLaunchSpecSchedulingTask;
import com.pulumi.spotinst.gke.outputs.OceanLaunchSpecShieldedInstanceConfig;
import com.pulumi.spotinst.gke.outputs.OceanLaunchSpecStorage;
import com.pulumi.spotinst.gke.outputs.OceanLaunchSpecStrategy;
import com.pulumi.spotinst.gke.outputs.OceanLaunchSpecTaint;
import com.pulumi.spotinst.gke.outputs.OceanLaunchSpecUpdatePolicy;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a custom Spotinst Ocean GKE Launch Spec resource.
 * 
 * &gt; This resource can be imported from GKE node pool or not. If you want to import the node pool and create the VNG from it, please provide `node_pool_name`.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.spotinst.gke.OceanLaunchSpec;
 * import com.pulumi.spotinst.gke.OceanLaunchSpecArgs;
 * import com.pulumi.spotinst.gke.inputs.OceanLaunchSpecAutoscaleHeadroomArgs;
 * import com.pulumi.spotinst.gke.inputs.OceanLaunchSpecAutoscaleHeadroomsAutomaticArgs;
 * import com.pulumi.spotinst.gke.inputs.OceanLaunchSpecLabelArgs;
 * import com.pulumi.spotinst.gke.inputs.OceanLaunchSpecMetadataArgs;
 * import com.pulumi.spotinst.gke.inputs.OceanLaunchSpecNetworkInterfaceArgs;
 * import com.pulumi.spotinst.gke.inputs.OceanLaunchSpecResourceLimitsArgs;
 * import com.pulumi.spotinst.gke.inputs.OceanLaunchSpecSchedulingTaskArgs;
 * import com.pulumi.spotinst.gke.inputs.OceanLaunchSpecShieldedInstanceConfigArgs;
 * import com.pulumi.spotinst.gke.inputs.OceanLaunchSpecStorageArgs;
 * import com.pulumi.spotinst.gke.inputs.OceanLaunchSpecStrategyArgs;
 * import com.pulumi.spotinst.gke.inputs.OceanLaunchSpecTaintArgs;
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
 *         var example = new OceanLaunchSpec(&#34;example&#34;, OceanLaunchSpecArgs.builder()        
 *             .autoscaleHeadrooms(OceanLaunchSpecAutoscaleHeadroomArgs.builder()
 *                 .cpuPerUnit(1000)
 *                 .gpuPerUnit(0)
 *                 .memoryPerUnit(2048)
 *                 .numOfUnits(5)
 *                 .build())
 *             .autoscaleHeadroomsAutomatics(OceanLaunchSpecAutoscaleHeadroomsAutomaticArgs.builder()
 *                 .autoHeadroomPercentage(5)
 *                 .build())
 *             .instanceTypes(&#34;n1-standard-1, n1-standard-2&#34;)
 *             .labels(OceanLaunchSpecLabelArgs.builder()
 *                 .key(&#34;labelKey&#34;)
 *                 .value(&#34;labelVal&#34;)
 *                 .build())
 *             .metadatas(OceanLaunchSpecMetadataArgs.builder()
 *                 .key(&#34;gci-update-strategy&#34;)
 *                 .value(&#34;update_disabled&#34;)
 *                 .build())
 *             .networkInterfaces(OceanLaunchSpecNetworkInterfaceArgs.builder()
 *                 .accessConfigs(OceanLaunchSpecNetworkInterfaceAccessConfigArgs.builder()
 *                     .name(&#34;external-nat-vng&#34;)
 *                     .type(&#34;ONE_TO_ONE_NAT&#34;)
 *                     .build())
 *                 .aliasIpRanges(OceanLaunchSpecNetworkInterfaceAliasIpRangeArgs.builder()
 *                     .ipCidrRange(&#34;/25&#34;)
 *                     .subnetworkRangeName(&#34;gke-test-native-vpc-pods-123456-vng&#34;)
 *                     .build())
 *                 .network(&#34;test-vng-network&#34;)
 *                 .projectId(&#34;test-vng-network-project&#34;)
 *                 .build())
 *             .nodePoolName(&#34;default-pool&#34;)
 *             .oceanId(&#34;o-123456&#34;)
 *             .resourceLimits(OceanLaunchSpecResourceLimitsArgs.builder()
 *                 .maxInstanceCount(3)
 *                 .minInstanceCount(0)
 *                 .build())
 *             .restrictScaleDown(true)
 *             .rootVolumeSize(10)
 *             .rootVolumeType(&#34;pd-standard&#34;)
 *             .schedulingTasks(OceanLaunchSpecSchedulingTaskArgs.builder()
 *                 .cronExpression(&#34;0 1 * * *&#34;)
 *                 .isEnabled(true)
 *                 .taskHeadrooms(OceanLaunchSpecSchedulingTaskTaskHeadroomArgs.builder()
 *                     .cpuPerUnit(1000)
 *                     .gpuPerUnit(0)
 *                     .memoryPerUnit(2048)
 *                     .numOfUnits(5)
 *                     .build())
 *                 .taskType(&#34;manualHeadroomUpdate&#34;)
 *                 .build())
 *             .serviceAccount(&#34;default&#34;)
 *             .shieldedInstanceConfig(OceanLaunchSpecShieldedInstanceConfigArgs.builder()
 *                 .enableIntegrityMonitoring(true)
 *                 .enableSecureBoot(false)
 *                 .build())
 *             .sourceImage(&#34;image&#34;)
 *             .storage(OceanLaunchSpecStorageArgs.builder()
 *                 .localSsdCount(5)
 *                 .build())
 *             .strategies(OceanLaunchSpecStrategyArgs.builder()
 *                 .preemptiblePercentage(30)
 *                 .build())
 *             .tags(            
 *                 &#34;tag1&#34;,
 *                 &#34;tag2&#34;)
 *             .taints(OceanLaunchSpecTaintArgs.builder()
 *                 .effect(&#34;taintEffect&#34;)
 *                 .key(&#34;taintKey&#34;)
 *                 .value(&#34;taintVal&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * &lt;!--Start PulumiCodeChooser --&gt;
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
 *         ctx.export(&#34;oceanLaunchspecId&#34;, spotinst_ocean_gke_launch_spec.example().id());
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Update Policy
 * 
 * * `update_policy` - (Optional)
 *   * `should_roll` - (Required) Enables the roll.
 *   * `roll_config` - (Required) Holds the roll configuration.
 *     * `batch_size_percentage` - (Required) Sets the percentage of the instances to deploy in each batch.
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
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
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="spotinst:gke/oceanLaunchSpec:OceanLaunchSpec")
public class OceanLaunchSpec extends com.pulumi.resources.CustomResource {
    /**
     * Set custom headroom per launch spec. provide list of headrooms object.
     * 
     */
    @Export(name="autoscaleHeadrooms", refs={List.class,OceanLaunchSpecAutoscaleHeadroom.class}, tree="[0,1]")
    private Output</* @Nullable */ List<OceanLaunchSpecAutoscaleHeadroom>> autoscaleHeadrooms;

    /**
     * @return Set custom headroom per launch spec. provide list of headrooms object.
     * 
     */
    public Output<Optional<List<OceanLaunchSpecAutoscaleHeadroom>>> autoscaleHeadrooms() {
        return Codegen.optional(this.autoscaleHeadrooms);
    }
    /**
     * Set automatic headroom per launch spec.
     * 
     */
    @Export(name="autoscaleHeadroomsAutomatics", refs={List.class,OceanLaunchSpecAutoscaleHeadroomsAutomatic.class}, tree="[0,1]")
    private Output</* @Nullable */ List<OceanLaunchSpecAutoscaleHeadroomsAutomatic>> autoscaleHeadroomsAutomatics;

    /**
     * @return Set automatic headroom per launch spec.
     * 
     */
    public Output<Optional<List<OceanLaunchSpecAutoscaleHeadroomsAutomatic>>> autoscaleHeadroomsAutomatics() {
        return Codegen.optional(this.autoscaleHeadroomsAutomatics);
    }
    /**
     * List of supported machine types for the Launch Spec.
     * 
     */
    @Export(name="instanceTypes", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> instanceTypes;

    /**
     * @return List of supported machine types for the Launch Spec.
     * 
     */
    public Output<List<String>> instanceTypes() {
        return this.instanceTypes;
    }
    /**
     * Optionally adds labels to instances launched in an Ocean cluster.
     * 
     */
    @Export(name="labels", refs={List.class,OceanLaunchSpecLabel.class}, tree="[0,1]")
    private Output<List<OceanLaunchSpecLabel>> labels;

    /**
     * @return Optionally adds labels to instances launched in an Ocean cluster.
     * 
     */
    public Output<List<OceanLaunchSpecLabel>> labels() {
        return this.labels;
    }
    /**
     * Cluster&#39;s metadata.
     * 
     */
    @Export(name="metadatas", refs={List.class,OceanLaunchSpecMetadata.class}, tree="[0,1]")
    private Output<List<OceanLaunchSpecMetadata>> metadatas;

    /**
     * @return Cluster&#39;s metadata.
     * 
     */
    public Output<List<OceanLaunchSpecMetadata>> metadatas() {
        return this.metadatas;
    }
    /**
     * The name of the access configuration.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the access configuration.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Settings for network interfaces.
     * 
     */
    @Export(name="networkInterfaces", refs={List.class,OceanLaunchSpecNetworkInterface.class}, tree="[0,1]")
    private Output</* @Nullable */ List<OceanLaunchSpecNetworkInterface>> networkInterfaces;

    /**
     * @return Settings for network interfaces.
     * 
     */
    public Output<Optional<List<OceanLaunchSpecNetworkInterface>>> networkInterfaces() {
        return Codegen.optional(this.networkInterfaces);
    }
    /**
     * The node pool you wish to use in your Launch Spec.
     * 
     */
    @Export(name="nodePoolName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> nodePoolName;

    /**
     * @return The node pool you wish to use in your Launch Spec.
     * 
     */
    public Output<Optional<String>> nodePoolName() {
        return Codegen.optional(this.nodePoolName);
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
     * The Ocean virtual node group resource limits object.
     * 
     */
    @Export(name="resourceLimits", refs={OceanLaunchSpecResourceLimits.class}, tree="[0]")
    private Output</* @Nullable */ OceanLaunchSpecResourceLimits> resourceLimits;

    /**
     * @return The Ocean virtual node group resource limits object.
     * 
     */
    public Output<Optional<OceanLaunchSpecResourceLimits>> resourceLimits() {
        return Codegen.optional(this.resourceLimits);
    }
    /**
     * Boolean. When set to `true`, VNG nodes will be treated as if all pods running have the restrict-scale-down label. Therefore, Ocean will not scale nodes down unless empty.
     * 
     */
    @Export(name="restrictScaleDown", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> restrictScaleDown;

    /**
     * @return Boolean. When set to `true`, VNG nodes will be treated as if all pods running have the restrict-scale-down label. Therefore, Ocean will not scale nodes down unless empty.
     * 
     */
    public Output<Boolean> restrictScaleDown() {
        return this.restrictScaleDown;
    }
    /**
     * Root volume size (in GB).
     * 
     */
    @Export(name="rootVolumeSize", refs={Integer.class}, tree="[0]")
    private Output<Integer> rootVolumeSize;

    /**
     * @return Root volume size (in GB).
     * 
     */
    public Output<Integer> rootVolumeSize() {
        return this.rootVolumeSize;
    }
    /**
     * Root volume disk type. Valid values: `&#34;pd-standard&#34;`, `&#34;pd-ssd&#34;`.
     * 
     */
    @Export(name="rootVolumeType", refs={String.class}, tree="[0]")
    private Output<String> rootVolumeType;

    /**
     * @return Root volume disk type. Valid values: `&#34;pd-standard&#34;`, `&#34;pd-ssd&#34;`.
     * 
     */
    public Output<String> rootVolumeType() {
        return this.rootVolumeType;
    }
    /**
     * Used to define scheduled tasks such as a manual headroom update.
     * 
     */
    @Export(name="schedulingTasks", refs={List.class,OceanLaunchSpecSchedulingTask.class}, tree="[0,1]")
    private Output</* @Nullable */ List<OceanLaunchSpecSchedulingTask>> schedulingTasks;

    /**
     * @return Used to define scheduled tasks such as a manual headroom update.
     * 
     */
    public Output<Optional<List<OceanLaunchSpecSchedulingTask>>> schedulingTasks() {
        return Codegen.optional(this.schedulingTasks);
    }
    /**
     * The account used by applications running on the VM to call GCP APIs.
     * 
     */
    @Export(name="serviceAccount", refs={String.class}, tree="[0]")
    private Output<String> serviceAccount;

    /**
     * @return The account used by applications running on the VM to call GCP APIs.
     * 
     */
    public Output<String> serviceAccount() {
        return this.serviceAccount;
    }
    /**
     * The Ocean shielded instance configuration object.
     * 
     */
    @Export(name="shieldedInstanceConfig", refs={OceanLaunchSpecShieldedInstanceConfig.class}, tree="[0]")
    private Output<OceanLaunchSpecShieldedInstanceConfig> shieldedInstanceConfig;

    /**
     * @return The Ocean shielded instance configuration object.
     * 
     */
    public Output<OceanLaunchSpecShieldedInstanceConfig> shieldedInstanceConfig() {
        return this.shieldedInstanceConfig;
    }
    /**
     * Image URL.
     * 
     */
    @Export(name="sourceImage", refs={String.class}, tree="[0]")
    private Output<String> sourceImage;

    /**
     * @return Image URL.
     * 
     */
    public Output<String> sourceImage() {
        return this.sourceImage;
    }
    /**
     * The Ocean virtual node group storage object.
     * 
     */
    @Export(name="storage", refs={OceanLaunchSpecStorage.class}, tree="[0]")
    private Output<OceanLaunchSpecStorage> storage;

    /**
     * @return The Ocean virtual node group storage object.
     * 
     */
    public Output<OceanLaunchSpecStorage> storage() {
        return this.storage;
    }
    /**
     * The Ocean Launch Spec Strategy object.
     * 
     */
    @Export(name="strategies", refs={List.class,OceanLaunchSpecStrategy.class}, tree="[0,1]")
    private Output</* @Nullable */ List<OceanLaunchSpecStrategy>> strategies;

    /**
     * @return The Ocean Launch Spec Strategy object.
     * 
     */
    public Output<Optional<List<OceanLaunchSpecStrategy>>> strategies() {
        return Codegen.optional(this.strategies);
    }
    /**
     * Every node launched from this configuration will be tagged with those tags. Note: during creation some tags are automatically imported to the state file, it is required to manually add it to the template configuration
     * 
     */
    @Export(name="tags", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> tags;

    /**
     * @return Every node launched from this configuration will be tagged with those tags. Note: during creation some tags are automatically imported to the state file, it is required to manually add it to the template configuration
     * 
     */
    public Output<List<String>> tags() {
        return this.tags;
    }
    /**
     * Optionally adds labels to instances launched in an Ocean cluster.
     * 
     */
    @Export(name="taints", refs={List.class,OceanLaunchSpecTaint.class}, tree="[0,1]")
    private Output<List<OceanLaunchSpecTaint>> taints;

    /**
     * @return Optionally adds labels to instances launched in an Ocean cluster.
     * 
     */
    public Output<List<OceanLaunchSpecTaint>> taints() {
        return this.taints;
    }
    @Export(name="updatePolicy", refs={OceanLaunchSpecUpdatePolicy.class}, tree="[0]")
    private Output</* @Nullable */ OceanLaunchSpecUpdatePolicy> updatePolicy;

    public Output<Optional<OceanLaunchSpecUpdatePolicy>> updatePolicy() {
        return Codegen.optional(this.updatePolicy);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public OceanLaunchSpec(String name) {
        this(name, OceanLaunchSpecArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public OceanLaunchSpec(String name, OceanLaunchSpecArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public OceanLaunchSpec(String name, OceanLaunchSpecArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("spotinst:gke/oceanLaunchSpec:OceanLaunchSpec", name, args == null ? OceanLaunchSpecArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private OceanLaunchSpec(String name, Output<String> id, @Nullable OceanLaunchSpecState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("spotinst:gke/oceanLaunchSpec:OceanLaunchSpec", name, state, makeResourceOptions(options, id));
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
    public static OceanLaunchSpec get(String name, Output<String> id, @Nullable OceanLaunchSpecState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new OceanLaunchSpec(name, id, state, options);
    }
}
