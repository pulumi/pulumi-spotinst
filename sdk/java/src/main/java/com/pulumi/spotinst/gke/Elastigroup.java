// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.gke;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.spotinst.Utilities;
import com.pulumi.spotinst.gke.ElastigroupArgs;
import com.pulumi.spotinst.gke.inputs.ElastigroupState;
import com.pulumi.spotinst.gke.outputs.ElastigroupBackendService;
import com.pulumi.spotinst.gke.outputs.ElastigroupDisk;
import com.pulumi.spotinst.gke.outputs.ElastigroupGpu;
import com.pulumi.spotinst.gke.outputs.ElastigroupInstanceTypesCustom;
import com.pulumi.spotinst.gke.outputs.ElastigroupIntegrationDockerSwarm;
import com.pulumi.spotinst.gke.outputs.ElastigroupIntegrationGke;
import com.pulumi.spotinst.gke.outputs.ElastigroupLabel;
import com.pulumi.spotinst.gke.outputs.ElastigroupMetadata;
import com.pulumi.spotinst.gke.outputs.ElastigroupNetworkInterface;
import com.pulumi.spotinst.gke.outputs.ElastigroupRevertToPreemptible;
import com.pulumi.spotinst.gke.outputs.ElastigroupScalingDownPolicy;
import com.pulumi.spotinst.gke.outputs.ElastigroupScalingUpPolicy;
import com.pulumi.spotinst.gke.outputs.ElastigroupShieldedInstanceConfig;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Spotinst Elastigroup GKE resource. Please see [Importing a GKE cluster](https://api.spotinst.com/elastigroup-for-google-cloud/tutorials/import-a-gke-cluster-as-an-elastigroup/) for detailed information.
 * 
 * ## Example Usage
 * 
 * A spotinst.gke.Elastigroup supports all of the fields defined in spotinst_elastigroup_gcp.
 * 
 * There are two main differences:
 * 
 * * you must include `cluster_zone_name` and `cluster_id`
 * * a handful of parameters are created remotely and will not appear in the diff. A complete list can be found below.
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.spotinst.gke.Elastigroup;
 * import com.pulumi.spotinst.gke.ElastigroupArgs;
 * import com.pulumi.spotinst.gke.inputs.ElastigroupIntegrationGkeArgs;
 * import com.pulumi.spotinst.gke.inputs.ElastigroupIntegrationGkeAutoscaleHeadroomArgs;
 * import com.pulumi.spotinst.gke.inputs.ElastigroupIntegrationGkeAutoscaleDownArgs;
 * import com.pulumi.spotinst.gke.inputs.ElastigroupBackendServiceArgs;
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
 *         var example_gke_elastigroup = new Elastigroup("example-gke-elastigroup", ElastigroupArgs.builder()
 *             .name("example-gke")
 *             .clusterZoneName("us-central1-a")
 *             .nodeImage("COS")
 *             .maxSize(5)
 *             .minSize(1)
 *             .desiredCapacity(3)
 *             .instanceTypesOndemand("n1-standard-1")
 *             .instanceTypesPreemptibles(            
 *                 "n1-standard-1",
 *                 "n1-standard-2")
 *             .preemptiblePercentage(100)
 *             .integrationGke(ElastigroupIntegrationGkeArgs.builder()
 *                 .location("us-central1-a")
 *                 .clusterId("example-cluster-id")
 *                 .autoscaleIsEnabled(true)
 *                 .autoscaleIsAutoConfig(false)
 *                 .autoscaleCooldown(300)
 *                 .autoscaleHeadroom(ElastigroupIntegrationGkeAutoscaleHeadroomArgs.builder()
 *                     .cpuPerUnit(1024)
 *                     .memoryPerUnit(512)
 *                     .numOfUnits(2)
 *                     .build())
 *                 .autoscaleDown(ElastigroupIntegrationGkeAutoscaleDownArgs.builder()
 *                     .evaluationPeriods(300)
 *                     .build())
 *                 .autoscaleLabels(ElastigroupIntegrationGkeAutoscaleLabelArgs.builder()
 *                     .key("label_key")
 *                     .value("label_value")
 *                     .build())
 *                 .build())
 *             .backendServices(ElastigroupBackendServiceArgs.builder()
 *                 .serviceName("backend-service")
 *                 .locationType("global")
 *                 .namedPorts(ElastigroupBackendServiceNamedPortArgs.builder()
 *                     .name("http")
 *                     .ports(                    
 *                         80,
 *                         8080)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="spotinst:gke/elastigroup:Elastigroup")
public class Elastigroup extends com.pulumi.resources.CustomResource {
    @Export(name="backendServices", refs={List.class,ElastigroupBackendService.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ElastigroupBackendService>> backendServices;

    public Output<Optional<List<ElastigroupBackendService>>> backendServices() {
        return Codegen.optional(this.backendServices);
    }
    /**
     * @deprecated
     * Please define cluster_id under integration_gke
     * 
     */
    @Deprecated /* Please define cluster_id under integration_gke */
    @Export(name="clusterId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> clusterId;

    public Output<Optional<String>> clusterId() {
        return Codegen.optional(this.clusterId);
    }
    @Export(name="clusterZoneName", refs={String.class}, tree="[0]")
    private Output<String> clusterZoneName;

    public Output<String> clusterZoneName() {
        return this.clusterZoneName;
    }
    @Export(name="desiredCapacity", refs={Integer.class}, tree="[0]")
    private Output<Integer> desiredCapacity;

    public Output<Integer> desiredCapacity() {
        return this.desiredCapacity;
    }
    @Export(name="disks", refs={List.class,ElastigroupDisk.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ElastigroupDisk>> disks;

    public Output<Optional<List<ElastigroupDisk>>> disks() {
        return Codegen.optional(this.disks);
    }
    @Export(name="drainingTimeout", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> drainingTimeout;

    public Output<Optional<Integer>> drainingTimeout() {
        return Codegen.optional(this.drainingTimeout);
    }
    @Export(name="fallbackToOndemand", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> fallbackToOndemand;

    public Output<Optional<Boolean>> fallbackToOndemand() {
        return Codegen.optional(this.fallbackToOndemand);
    }
    @Export(name="gpu", refs={List.class,ElastigroupGpu.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ElastigroupGpu>> gpu;

    public Output<Optional<List<ElastigroupGpu>>> gpu() {
        return Codegen.optional(this.gpu);
    }
    @Export(name="instanceNamePrefix", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> instanceNamePrefix;

    public Output<Optional<String>> instanceNamePrefix() {
        return Codegen.optional(this.instanceNamePrefix);
    }
    @Export(name="instanceTypesCustoms", refs={List.class,ElastigroupInstanceTypesCustom.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ElastigroupInstanceTypesCustom>> instanceTypesCustoms;

    public Output<Optional<List<ElastigroupInstanceTypesCustom>>> instanceTypesCustoms() {
        return Codegen.optional(this.instanceTypesCustoms);
    }
    @Export(name="instanceTypesOndemand", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> instanceTypesOndemand;

    public Output<Optional<String>> instanceTypesOndemand() {
        return Codegen.optional(this.instanceTypesOndemand);
    }
    @Export(name="instanceTypesPreemptibles", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> instanceTypesPreemptibles;

    public Output<Optional<List<String>>> instanceTypesPreemptibles() {
        return Codegen.optional(this.instanceTypesPreemptibles);
    }
    @Export(name="integrationDockerSwarm", refs={ElastigroupIntegrationDockerSwarm.class}, tree="[0]")
    private Output</* @Nullable */ ElastigroupIntegrationDockerSwarm> integrationDockerSwarm;

    public Output<Optional<ElastigroupIntegrationDockerSwarm>> integrationDockerSwarm() {
        return Codegen.optional(this.integrationDockerSwarm);
    }
    @Export(name="integrationGke", refs={ElastigroupIntegrationGke.class}, tree="[0]")
    private Output</* @Nullable */ ElastigroupIntegrationGke> integrationGke;

    public Output<Optional<ElastigroupIntegrationGke>> integrationGke() {
        return Codegen.optional(this.integrationGke);
    }
    @Export(name="ipForwarding", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> ipForwarding;

    public Output<Optional<Boolean>> ipForwarding() {
        return Codegen.optional(this.ipForwarding);
    }
    @Export(name="labels", refs={List.class,ElastigroupLabel.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ElastigroupLabel>> labels;

    public Output<Optional<List<ElastigroupLabel>>> labels() {
        return Codegen.optional(this.labels);
    }
    @Export(name="maxSize", refs={Integer.class}, tree="[0]")
    private Output<Integer> maxSize;

    public Output<Integer> maxSize() {
        return this.maxSize;
    }
    @Export(name="metadatas", refs={List.class,ElastigroupMetadata.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ElastigroupMetadata>> metadatas;

    public Output<Optional<List<ElastigroupMetadata>>> metadatas() {
        return Codegen.optional(this.metadatas);
    }
    @Export(name="minCpuPlatform", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> minCpuPlatform;

    public Output<Optional<String>> minCpuPlatform() {
        return Codegen.optional(this.minCpuPlatform);
    }
    @Export(name="minSize", refs={Integer.class}, tree="[0]")
    private Output<Integer> minSize;

    public Output<Integer> minSize() {
        return this.minSize;
    }
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }
    @Export(name="networkInterfaces", refs={List.class,ElastigroupNetworkInterface.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ElastigroupNetworkInterface>> networkInterfaces;

    public Output<Optional<List<ElastigroupNetworkInterface>>> networkInterfaces() {
        return Codegen.optional(this.networkInterfaces);
    }
    @Export(name="nodeImage", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> nodeImage;

    public Output<Optional<String>> nodeImage() {
        return Codegen.optional(this.nodeImage);
    }
    @Export(name="ondemandCount", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> ondemandCount;

    public Output<Optional<Integer>> ondemandCount() {
        return Codegen.optional(this.ondemandCount);
    }
    @Export(name="optimizationWindows", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> optimizationWindows;

    public Output<Optional<List<String>>> optimizationWindows() {
        return Codegen.optional(this.optimizationWindows);
    }
    @Export(name="preemptiblePercentage", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> preemptiblePercentage;

    public Output<Optional<Integer>> preemptiblePercentage() {
        return Codegen.optional(this.preemptiblePercentage);
    }
    @Export(name="provisioningModel", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> provisioningModel;

    public Output<Optional<String>> provisioningModel() {
        return Codegen.optional(this.provisioningModel);
    }
    @Export(name="revertToPreemptibles", refs={List.class,ElastigroupRevertToPreemptible.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ElastigroupRevertToPreemptible>> revertToPreemptibles;

    public Output<Optional<List<ElastigroupRevertToPreemptible>>> revertToPreemptibles() {
        return Codegen.optional(this.revertToPreemptibles);
    }
    @Export(name="scalingDownPolicies", refs={List.class,ElastigroupScalingDownPolicy.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ElastigroupScalingDownPolicy>> scalingDownPolicies;

    public Output<Optional<List<ElastigroupScalingDownPolicy>>> scalingDownPolicies() {
        return Codegen.optional(this.scalingDownPolicies);
    }
    @Export(name="scalingUpPolicies", refs={List.class,ElastigroupScalingUpPolicy.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ElastigroupScalingUpPolicy>> scalingUpPolicies;

    public Output<Optional<List<ElastigroupScalingUpPolicy>>> scalingUpPolicies() {
        return Codegen.optional(this.scalingUpPolicies);
    }
    @Export(name="serviceAccount", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> serviceAccount;

    public Output<Optional<String>> serviceAccount() {
        return Codegen.optional(this.serviceAccount);
    }
    @Export(name="shieldedInstanceConfig", refs={ElastigroupShieldedInstanceConfig.class}, tree="[0]")
    private Output</* @Nullable */ ElastigroupShieldedInstanceConfig> shieldedInstanceConfig;

    public Output<Optional<ElastigroupShieldedInstanceConfig>> shieldedInstanceConfig() {
        return Codegen.optional(this.shieldedInstanceConfig);
    }
    @Export(name="shouldUtilizeCommitments", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> shouldUtilizeCommitments;

    public Output<Optional<Boolean>> shouldUtilizeCommitments() {
        return Codegen.optional(this.shouldUtilizeCommitments);
    }
    @Export(name="shutdownScript", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> shutdownScript;

    public Output<Optional<String>> shutdownScript() {
        return Codegen.optional(this.shutdownScript);
    }
    @Export(name="startupScript", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> startupScript;

    public Output<Optional<String>> startupScript() {
        return Codegen.optional(this.startupScript);
    }
    @Export(name="tags", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> tags;

    public Output<Optional<List<String>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Elastigroup(java.lang.String name) {
        this(name, ElastigroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Elastigroup(java.lang.String name, ElastigroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Elastigroup(java.lang.String name, ElastigroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("spotinst:gke/elastigroup:Elastigroup", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Elastigroup(java.lang.String name, Output<java.lang.String> id, @Nullable ElastigroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("spotinst:gke/elastigroup:Elastigroup", name, state, makeResourceOptions(options, id), false);
    }

    private static ElastigroupArgs makeArgs(ElastigroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ElastigroupArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
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
    public static Elastigroup get(java.lang.String name, Output<java.lang.String> id, @Nullable ElastigroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Elastigroup(name, id, state, options);
    }
}
