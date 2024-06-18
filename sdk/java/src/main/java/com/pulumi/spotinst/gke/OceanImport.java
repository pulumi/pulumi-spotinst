// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.gke;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.spotinst.Utilities;
import com.pulumi.spotinst.gke.OceanImportArgs;
import com.pulumi.spotinst.gke.inputs.OceanImportState;
import com.pulumi.spotinst.gke.outputs.OceanImportAutoscaler;
import com.pulumi.spotinst.gke.outputs.OceanImportBackendService;
import com.pulumi.spotinst.gke.outputs.OceanImportScheduledTask;
import com.pulumi.spotinst.gke.outputs.OceanImportShieldedInstanceConfig;
import com.pulumi.spotinst.gke.outputs.OceanImportStrategy;
import com.pulumi.spotinst.gke.outputs.OceanImportUpdatePolicy;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Spotinst Ocean GKE resource.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.spotinst.gke.OceanImport;
 * import com.pulumi.spotinst.gke.OceanImportArgs;
 * import com.pulumi.spotinst.gke.inputs.OceanImportBackendServiceArgs;
 * import com.pulumi.spotinst.gke.inputs.OceanImportShieldedInstanceConfigArgs;
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
 *         var example = new OceanImport("example", OceanImportArgs.builder()
 *             .clusterName("example-cluster-name")
 *             .controllerClusterId("example-controller-123124")
 *             .location("us-central1-a")
 *             .minSize(0)
 *             .maxSize(2)
 *             .desiredCapacity(0)
 *             .whitelists(            
 *                 "n1-standard-1",
 *                 "n1-standard-2")
 *             .backendServices(OceanImportBackendServiceArgs.builder()
 *                 .serviceName("example-backend-service")
 *                 .locationType("regional")
 *                 .scheme("INTERNAL")
 *                 .namedPorts(OceanImportBackendServiceNamedPortArgs.builder()
 *                     .name("http")
 *                     .ports(                    
 *                         80,
 *                         8080)
 *                     .build())
 *                 .build())
 *             .rootVolumeType("pd-ssd")
 *             .shieldedInstanceConfig(OceanImportShieldedInstanceConfigArgs.builder()
 *                 .enableSecureBoot(true)
 *                 .enableIntegrityMonitoring(true)
 *                 .build())
 *             .useAsTemplateOnly(false)
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="spotinst:gke/oceanImport:OceanImport")
public class OceanImport extends com.pulumi.resources.CustomResource {
    /**
     * The Ocean Kubernetes Autoscaler object.
     * 
     */
    @Export(name="autoscaler", refs={OceanImportAutoscaler.class}, tree="[0]")
    private Output<OceanImportAutoscaler> autoscaler;

    /**
     * @return The Ocean Kubernetes Autoscaler object.
     * 
     */
    public Output<OceanImportAutoscaler> autoscaler() {
        return this.autoscaler;
    }
    /**
     * Describes the backend service configurations.
     * 
     */
    @Export(name="backendServices", refs={List.class,OceanImportBackendService.class}, tree="[0,1]")
    private Output</* @Nullable */ List<OceanImportBackendService>> backendServices;

    /**
     * @return Describes the backend service configurations.
     * 
     */
    public Output<Optional<List<OceanImportBackendService>>> backendServices() {
        return Codegen.optional(this.backendServices);
    }
    /**
     * Instance types to avoid launching in the Ocean cluster. Cannot be configured if whitelist list is configured.
     * 
     */
    @Export(name="blacklists", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> blacklists;

    /**
     * @return Instance types to avoid launching in the Ocean cluster. Cannot be configured if whitelist list is configured.
     * 
     */
    public Output<Optional<List<String>>> blacklists() {
        return Codegen.optional(this.blacklists);
    }
    @Export(name="clusterControllerId", refs={String.class}, tree="[0]")
    private Output<String> clusterControllerId;

    public Output<String> clusterControllerId() {
        return this.clusterControllerId;
    }
    /**
     * The GKE cluster name.
     * 
     */
    @Export(name="clusterName", refs={String.class}, tree="[0]")
    private Output<String> clusterName;

    /**
     * @return The GKE cluster name.
     * 
     */
    public Output<String> clusterName() {
        return this.clusterName;
    }
    /**
     * A unique identifier used for connecting the Ocean SaaS platform and the Kubernetes cluster. Typically, the cluster name is used as its identifier.
     * 
     */
    @Export(name="controllerClusterId", refs={String.class}, tree="[0]")
    private Output<String> controllerClusterId;

    /**
     * @return A unique identifier used for connecting the Ocean SaaS platform and the Kubernetes cluster. Typically, the cluster name is used as its identifier.
     * 
     */
    public Output<String> controllerClusterId() {
        return this.controllerClusterId;
    }
    /**
     * The number of instances to launch and maintain in the cluster.
     * 
     */
    @Export(name="desiredCapacity", refs={Integer.class}, tree="[0]")
    private Output<Integer> desiredCapacity;

    /**
     * @return The number of instances to launch and maintain in the cluster.
     * 
     */
    public Output<Integer> desiredCapacity() {
        return this.desiredCapacity;
    }
    /**
     * The zone the master cluster is located in.
     * 
     */
    @Export(name="location", refs={String.class}, tree="[0]")
    private Output<String> location;

    /**
     * @return The zone the master cluster is located in.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The upper limit of instances the cluster can scale up to.
     * 
     */
    @Export(name="maxSize", refs={Integer.class}, tree="[0]")
    private Output<Integer> maxSize;

    /**
     * @return The upper limit of instances the cluster can scale up to.
     * 
     */
    public Output<Integer> maxSize() {
        return this.maxSize;
    }
    /**
     * The lower limit of instances the cluster can scale down to.
     * 
     */
    @Export(name="minSize", refs={Integer.class}, tree="[0]")
    private Output<Integer> minSize;

    /**
     * @return The lower limit of instances the cluster can scale down to.
     * 
     */
    public Output<Integer> minSize() {
        return this.minSize;
    }
    /**
     * The root volume disk type.
     * 
     */
    @Export(name="rootVolumeType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> rootVolumeType;

    /**
     * @return The root volume disk type.
     * 
     */
    public Output<Optional<String>> rootVolumeType() {
        return Codegen.optional(this.rootVolumeType);
    }
    /**
     * Set scheduling object.
     * 
     */
    @Export(name="scheduledTasks", refs={List.class,OceanImportScheduledTask.class}, tree="[0,1]")
    private Output</* @Nullable */ List<OceanImportScheduledTask>> scheduledTasks;

    /**
     * @return Set scheduling object.
     * 
     */
    public Output<Optional<List<OceanImportScheduledTask>>> scheduledTasks() {
        return Codegen.optional(this.scheduledTasks);
    }
    /**
     * The Ocean shielded instance configuration object.
     * 
     */
    @Export(name="shieldedInstanceConfig", refs={OceanImportShieldedInstanceConfig.class}, tree="[0]")
    private Output<OceanImportShieldedInstanceConfig> shieldedInstanceConfig;

    /**
     * @return The Ocean shielded instance configuration object.
     * 
     */
    public Output<OceanImportShieldedInstanceConfig> shieldedInstanceConfig() {
        return this.shieldedInstanceConfig;
    }
    /**
     * Strategy object.
     * 
     */
    @Export(name="strategies", refs={List.class,OceanImportStrategy.class}, tree="[0,1]")
    private Output</* @Nullable */ List<OceanImportStrategy>> strategies;

    /**
     * @return Strategy object.
     * 
     */
    public Output<Optional<List<OceanImportStrategy>>> strategies() {
        return Codegen.optional(this.strategies);
    }
    @Export(name="updatePolicy", refs={OceanImportUpdatePolicy.class}, tree="[0]")
    private Output</* @Nullable */ OceanImportUpdatePolicy> updatePolicy;

    public Output<Optional<OceanImportUpdatePolicy>> updatePolicy() {
        return Codegen.optional(this.updatePolicy);
    }
    /**
     * launch specification defined on the Ocean object will function only as a template for virtual node groups.
     * 
     */
    @Export(name="useAsTemplateOnly", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> useAsTemplateOnly;

    /**
     * @return launch specification defined on the Ocean object will function only as a template for virtual node groups.
     * 
     */
    public Output<Optional<Boolean>> useAsTemplateOnly() {
        return Codegen.optional(this.useAsTemplateOnly);
    }
    /**
     * Instance types allowed in the Ocean cluster. Cannot be configured if blacklist list is configured.
     * 
     */
    @Export(name="whitelists", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> whitelists;

    /**
     * @return Instance types allowed in the Ocean cluster. Cannot be configured if blacklist list is configured.
     * 
     */
    public Output<Optional<List<String>>> whitelists() {
        return Codegen.optional(this.whitelists);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public OceanImport(String name) {
        this(name, OceanImportArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public OceanImport(String name, OceanImportArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public OceanImport(String name, OceanImportArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("spotinst:gke/oceanImport:OceanImport", name, args == null ? OceanImportArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private OceanImport(String name, Output<String> id, @Nullable OceanImportState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("spotinst:gke/oceanImport:OceanImport", name, state, makeResourceOptions(options, id));
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
    public static OceanImport get(String name, Output<String> id, @Nullable OceanImportState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new OceanImport(name, id, state, options);
    }
}
