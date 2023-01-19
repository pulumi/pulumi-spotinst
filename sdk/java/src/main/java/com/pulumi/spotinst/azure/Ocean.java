// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.azure;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.spotinst.Utilities;
import com.pulumi.spotinst.azure.OceanArgs;
import com.pulumi.spotinst.azure.inputs.OceanState;
import com.pulumi.spotinst.azure.outputs.OceanAutoscaler;
import com.pulumi.spotinst.azure.outputs.OceanExtension;
import com.pulumi.spotinst.azure.outputs.OceanHealth;
import com.pulumi.spotinst.azure.outputs.OceanImage;
import com.pulumi.spotinst.azure.outputs.OceanLoadBalancer;
import com.pulumi.spotinst.azure.outputs.OceanManagedServiceIdentity;
import com.pulumi.spotinst.azure.outputs.OceanNetwork;
import com.pulumi.spotinst.azure.outputs.OceanOsDisk;
import com.pulumi.spotinst.azure.outputs.OceanStrategy;
import com.pulumi.spotinst.azure.outputs.OceanTag;
import com.pulumi.spotinst.azure.outputs.OceanVmSize;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.spotinst.azure.Ocean;
 * import com.pulumi.spotinst.azure.OceanArgs;
 * import com.pulumi.spotinst.azure.inputs.OceanAutoscalerArgs;
 * import com.pulumi.spotinst.azure.inputs.OceanAutoscalerAutoscaleDownArgs;
 * import com.pulumi.spotinst.azure.inputs.OceanAutoscalerAutoscaleHeadroomArgs;
 * import com.pulumi.spotinst.azure.inputs.OceanAutoscalerAutoscaleHeadroomAutomaticArgs;
 * import com.pulumi.spotinst.azure.inputs.OceanAutoscalerResourceLimitsArgs;
 * import com.pulumi.spotinst.azure.inputs.OceanExtensionArgs;
 * import com.pulumi.spotinst.azure.inputs.OceanHealthArgs;
 * import com.pulumi.spotinst.azure.inputs.OceanImageArgs;
 * import com.pulumi.spotinst.azure.inputs.OceanLoadBalancerArgs;
 * import com.pulumi.spotinst.azure.inputs.OceanManagedServiceIdentityArgs;
 * import com.pulumi.spotinst.azure.inputs.OceanNetworkArgs;
 * import com.pulumi.spotinst.azure.inputs.OceanOsDiskArgs;
 * import com.pulumi.spotinst.azure.inputs.OceanStrategyArgs;
 * import com.pulumi.spotinst.azure.inputs.OceanTagArgs;
 * import com.pulumi.spotinst.azure.inputs.OceanVmSizeArgs;
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
 *         var example = new Ocean(&#34;example&#34;, OceanArgs.builder()        
 *             .acdIdentifier(&#34;acd-12345678&#34;)
 *             .aksName(&#34;ocean-westus-dev-aks&#34;)
 *             .aksResourceGroupName(&#34;ocean-westus-dev&#34;)
 *             .autoscaler(OceanAutoscalerArgs.builder()
 *                 .autoscaleDown(OceanAutoscalerAutoscaleDownArgs.builder()
 *                     .maxScaleDownPercentage(10)
 *                     .build())
 *                 .autoscaleHeadroom(OceanAutoscalerAutoscaleHeadroomArgs.builder()
 *                     .automatic(OceanAutoscalerAutoscaleHeadroomAutomaticArgs.builder()
 *                         .isEnabled(true)
 *                         .percentage(10)
 *                         .build())
 *                     .build())
 *                 .autoscaleIsEnabled(true)
 *                 .resourceLimits(OceanAutoscalerResourceLimitsArgs.builder()
 *                     .maxMemoryGib(40)
 *                     .maxVcpu(1024)
 *                     .build())
 *                 .build())
 *             .controllerClusterId(&#34;ocean-westus-dev-aks&#34;)
 *             .customData(&#34;[... redacted ...]&#34;)
 *             .extensions(OceanExtensionArgs.builder()
 *                 .apiVersion(&#34;1.0&#34;)
 *                 .minorVersionAutoUpgrade(true)
 *                 .name(&#34;extension-name&#34;)
 *                 .publisher(&#34;Microsoft.Azure.Extensions&#34;)
 *                 .type(&#34;Linux&#34;)
 *                 .build())
 *             .health(OceanHealthArgs.builder()
 *                 .gracePeriod(10)
 *                 .build())
 *             .images(OceanImageArgs.builder()
 *                 .marketplaces(OceanImageMarketplaceArgs.builder()
 *                     .offer(&#34;UbuntuServer&#34;)
 *                     .publisher(&#34;Canonical&#34;)
 *                     .sku(&#34;18.04-LTS&#34;)
 *                     .version(&#34;latest&#34;)
 *                     .build())
 *                 .build())
 *             .loadBalancers(OceanLoadBalancerArgs.builder()
 *                 .backendPoolNames(&#34;terraform-backend-pool&#34;)
 *                 .loadBalancerSku(&#34;Standard&#34;)
 *                 .name(&#34;load-balancer-name&#34;)
 *                 .resourceGroupName(&#34;resource-group-name&#34;)
 *                 .type(&#34;loadBalancer&#34;)
 *                 .build())
 *             .managedServiceIdentities(OceanManagedServiceIdentityArgs.builder()
 *                 .name(&#34;ocean-westus-dev-aks-agentpool&#34;)
 *                 .resourceGroupName(&#34;MC_ocean-westus-dev_ocean-westus-dev-aks_westus&#34;)
 *                 .build())
 *             .maxPods(30)
 *             .network(OceanNetworkArgs.builder()
 *                 .networkInterfaces(OceanNetworkNetworkInterfaceArgs.builder()
 *                     .additionalIpConfig(%!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference))
 *                     .assignPublicIp(false)
 *                     .isPrimary(false)
 *                     .subnetName(&#34;subnet-name&#34;)
 *                     .build())
 *                 .resourceGroupName(&#34;ocean-westus-dev&#34;)
 *                 .virtualNetworkName(&#34;vn-name&#34;)
 *                 .build())
 *             .osDisk(OceanOsDiskArgs.builder()
 *                 .sizeGb(130)
 *                 .type(&#34;Standard_LRS&#34;)
 *                 .build())
 *             .resourceGroupName(&#34;some-resource-group-name&#34;)
 *             .sshPublicKey(&#34;ssh-rsa [... redacted ...] generated-by-azure&#34;)
 *             .strategies(OceanStrategyArgs.builder()
 *                 .fallbackToOndemand(true)
 *                 .spotPercentage(40)
 *                 .build())
 *             .tags(OceanTagArgs.builder()
 *                 .key(&#34;Environment&#34;)
 *                 .value(&#34;Dev&#34;)
 *                 .build())
 *             .userName(&#34;some-name&#34;)
 *             .vmSizes(OceanVmSizeArgs.builder()
 *                 .whitelists(&#34;standard_ds2_v2&#34;)
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
 *         ctx.export(&#34;oceanId&#34;, spotinst_ocean_aks.example().id());
 *     }
 * }
 * ```
 * 
 */
@ResourceType(type="spotinst:azure/ocean:Ocean")
public class Ocean extends com.pulumi.resources.CustomResource {
    /**
     * The AKS identifier. A valid identifier should be formatted as `acd-nnnnnnnn` and previously used identifiers cannot be reused.
     * 
     */
    @Export(name="acdIdentifier", type=String.class, parameters={})
    private Output<String> acdIdentifier;

    /**
     * @return The AKS identifier. A valid identifier should be formatted as `acd-nnnnnnnn` and previously used identifiers cannot be reused.
     * 
     */
    public Output<String> acdIdentifier() {
        return this.acdIdentifier;
    }
    /**
     * The AKS cluster name.
     * 
     */
    @Export(name="aksName", type=String.class, parameters={})
    private Output<String> aksName;

    /**
     * @return The AKS cluster name.
     * 
     */
    public Output<String> aksName() {
        return this.aksName;
    }
    /**
     * Name of the Azure Resource Group where the AKS cluster is located.
     * 
     */
    @Export(name="aksResourceGroupName", type=String.class, parameters={})
    private Output<String> aksResourceGroupName;

    /**
     * @return Name of the Azure Resource Group where the AKS cluster is located.
     * 
     */
    public Output<String> aksResourceGroupName() {
        return this.aksResourceGroupName;
    }
    /**
     * The Ocean Kubernetes Autoscaler object.
     * 
     */
    @Export(name="autoscaler", type=OceanAutoscaler.class, parameters={})
    private Output</* @Nullable */ OceanAutoscaler> autoscaler;

    /**
     * @return The Ocean Kubernetes Autoscaler object.
     * 
     */
    public Output<Optional<OceanAutoscaler>> autoscaler() {
        return Codegen.optional(this.autoscaler);
    }
    /**
     * A unique identifier used for connecting the Ocean SaaS platform and the Kubernetes cluster. Typically, the cluster name is used as its identifier.
     * 
     */
    @Export(name="controllerClusterId", type=String.class, parameters={})
    private Output<String> controllerClusterId;

    /**
     * @return A unique identifier used for connecting the Ocean SaaS platform and the Kubernetes cluster. Typically, the cluster name is used as its identifier.
     * 
     */
    public Output<String> controllerClusterId() {
        return this.controllerClusterId;
    }
    /**
     * Must contain a valid Base64 encoded string.
     * 
     */
    @Export(name="customData", type=String.class, parameters={})
    private Output<String> customData;

    /**
     * @return Must contain a valid Base64 encoded string.
     * 
     */
    public Output<String> customData() {
        return this.customData;
    }
    /**
     * List of Azure extension objects.
     * 
     */
    @Export(name="extensions", type=List.class, parameters={OceanExtension.class})
    private Output<List<OceanExtension>> extensions;

    /**
     * @return List of Azure extension objects.
     * 
     */
    public Output<List<OceanExtension>> extensions() {
        return this.extensions;
    }
    /**
     * The Ocean AKS Health object.
     * 
     */
    @Export(name="health", type=OceanHealth.class, parameters={})
    private Output<OceanHealth> health;

    /**
     * @return The Ocean AKS Health object.
     * 
     */
    public Output<OceanHealth> health() {
        return this.health;
    }
    /**
     * Image of VM. An image is a template for creating new VMs. Choose from Azure image catalogue (marketplace).
     * 
     */
    @Export(name="images", type=List.class, parameters={OceanImage.class})
    private Output<List<OceanImage>> images;

    /**
     * @return Image of VM. An image is a template for creating new VMs. Choose from Azure image catalogue (marketplace).
     * 
     */
    public Output<List<OceanImage>> images() {
        return this.images;
    }
    /**
     * Configure Load Balancer.
     * 
     */
    @Export(name="loadBalancers", type=List.class, parameters={OceanLoadBalancer.class})
    private Output<List<OceanLoadBalancer>> loadBalancers;

    /**
     * @return Configure Load Balancer.
     * 
     */
    public Output<List<OceanLoadBalancer>> loadBalancers() {
        return this.loadBalancers;
    }
    /**
     * List of Managed Service Identity objects.
     * 
     */
    @Export(name="managedServiceIdentities", type=List.class, parameters={OceanManagedServiceIdentity.class})
    private Output</* @Nullable */ List<OceanManagedServiceIdentity>> managedServiceIdentities;

    /**
     * @return List of Managed Service Identity objects.
     * 
     */
    public Output<Optional<List<OceanManagedServiceIdentity>>> managedServiceIdentities() {
        return Codegen.optional(this.managedServiceIdentities);
    }
    /**
     * The maximum number of pods per node in an AKS cluster.
     * 
     */
    @Export(name="maxPods", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> maxPods;

    /**
     * @return The maximum number of pods per node in an AKS cluster.
     * 
     */
    public Output<Optional<Integer>> maxPods() {
        return Codegen.optional(this.maxPods);
    }
    /**
     * Name of the Load Balancer.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the Load Balancer.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Define the Virtual Network and Subnet.
     * 
     */
    @Export(name="network", type=OceanNetwork.class, parameters={})
    private Output<OceanNetwork> network;

    /**
     * @return Define the Virtual Network and Subnet.
     * 
     */
    public Output<OceanNetwork> network() {
        return this.network;
    }
    /**
     * OS disk specifications.
     * 
     */
    @Export(name="osDisk", type=OceanOsDisk.class, parameters={})
    private Output</* @Nullable */ OceanOsDisk> osDisk;

    /**
     * @return OS disk specifications.
     * 
     */
    public Output<Optional<OceanOsDisk>> osDisk() {
        return Codegen.optional(this.osDisk);
    }
    /**
     * The Resource Group name of the Load Balancer.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The Resource Group name of the Load Balancer.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * SSH public key for admin access to Linux VMs.
     * 
     */
    @Export(name="sshPublicKey", type=String.class, parameters={})
    private Output<String> sshPublicKey;

    /**
     * @return SSH public key for admin access to Linux VMs.
     * 
     */
    public Output<String> sshPublicKey() {
        return this.sshPublicKey;
    }
    /**
     * The Ocean AKS strategy object.
     * 
     */
    @Export(name="strategies", type=List.class, parameters={OceanStrategy.class})
    private Output</* @Nullable */ List<OceanStrategy>> strategies;

    /**
     * @return The Ocean AKS strategy object.
     * 
     */
    public Output<Optional<List<OceanStrategy>>> strategies() {
        return Codegen.optional(this.strategies);
    }
    /**
     * Unique key-value pairs that will be used to tag VMs that are launched in the cluster.
     * 
     */
    @Export(name="tags", type=List.class, parameters={OceanTag.class})
    private Output</* @Nullable */ List<OceanTag>> tags;

    /**
     * @return Unique key-value pairs that will be used to tag VMs that are launched in the cluster.
     * 
     */
    public Output<Optional<List<OceanTag>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Username for admin access to VMs.
     * 
     */
    @Export(name="userName", type=String.class, parameters={})
    private Output<String> userName;

    /**
     * @return Username for admin access to VMs.
     * 
     */
    public Output<String> userName() {
        return this.userName;
    }
    /**
     * The types of virtual machines that may or may not be a part of the Ocean cluster.
     * 
     */
    @Export(name="vmSizes", type=List.class, parameters={OceanVmSize.class})
    private Output</* @Nullable */ List<OceanVmSize>> vmSizes;

    /**
     * @return The types of virtual machines that may or may not be a part of the Ocean cluster.
     * 
     */
    public Output<Optional<List<OceanVmSize>>> vmSizes() {
        return Codegen.optional(this.vmSizes);
    }
    /**
     * An Array holding default Availability Zones, this configures the availability zones the Ocean may launch instances in.
     * 
     */
    @Export(name="zones", type=List.class, parameters={String.class})
    private Output<List<String>> zones;

    /**
     * @return An Array holding default Availability Zones, this configures the availability zones the Ocean may launch instances in.
     * 
     */
    public Output<List<String>> zones() {
        return this.zones;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Ocean(String name) {
        this(name, OceanArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Ocean(String name, OceanArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Ocean(String name, OceanArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("spotinst:azure/ocean:Ocean", name, args == null ? OceanArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Ocean(String name, Output<String> id, @Nullable OceanState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("spotinst:azure/ocean:Ocean", name, state, makeResourceOptions(options, id));
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
    public static Ocean get(String name, Output<String> id, @Nullable OceanState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Ocean(name, id, state, options);
    }
}