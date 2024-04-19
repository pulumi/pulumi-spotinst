// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.azure;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.spotinst.Utilities;
import com.pulumi.spotinst.azure.ElastigroupArgs;
import com.pulumi.spotinst.azure.inputs.ElastigroupState;
import com.pulumi.spotinst.azure.outputs.ElastigroupHealthCheck;
import com.pulumi.spotinst.azure.outputs.ElastigroupImage;
import com.pulumi.spotinst.azure.outputs.ElastigroupIntegrationKubernetes;
import com.pulumi.spotinst.azure.outputs.ElastigroupIntegrationMultaiRuntime;
import com.pulumi.spotinst.azure.outputs.ElastigroupLoadBalancer;
import com.pulumi.spotinst.azure.outputs.ElastigroupLogin;
import com.pulumi.spotinst.azure.outputs.ElastigroupManagedServiceIdentity;
import com.pulumi.spotinst.azure.outputs.ElastigroupNetwork;
import com.pulumi.spotinst.azure.outputs.ElastigroupScalingDownPolicy;
import com.pulumi.spotinst.azure.outputs.ElastigroupScalingUpPolicy;
import com.pulumi.spotinst.azure.outputs.ElastigroupScheduledTask;
import com.pulumi.spotinst.azure.outputs.ElastigroupStrategy;
import com.pulumi.spotinst.azure.outputs.ElastigroupUpdatePolicy;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Spotinst elastigroup Azure resource.
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
 * import com.pulumi.spotinst.ElastigroupAzureV3;
 * import com.pulumi.spotinst.ElastigroupAzureV3Args;
 * import com.pulumi.spotinst.inputs.ElastigroupAzureV3ManagedServiceIdentityArgs;
 * import com.pulumi.spotinst.inputs.ElastigroupAzureV3TagArgs;
 * import com.pulumi.spotinst.inputs.ElastigroupAzureV3ImageArgs;
 * import com.pulumi.spotinst.inputs.ElastigroupAzureV3NetworkArgs;
 * import com.pulumi.spotinst.inputs.ElastigroupAzureV3LoginArgs;
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
 *         var testAzureGroup = new ElastigroupAzureV3(&#34;testAzureGroup&#34;, ElastigroupAzureV3Args.builder()        
 *             .name(&#34;example_elastigroup_azure&#34;)
 *             .resourceGroupName(&#34;spotinst-azure&#34;)
 *             .region(&#34;eastus&#34;)
 *             .os(&#34;Linux&#34;)
 *             .minSize(0)
 *             .maxSize(1)
 *             .desiredCapacity(1)
 *             .odSizes(            
 *                 &#34;standard_a1_v1&#34;,
 *                 &#34;standard_a1_v2&#34;)
 *             .spotSizes(            
 *                 &#34;standard_a1_v1&#34;,
 *                 &#34;standard_a1_v2&#34;)
 *             .customData(&#34;IyEvYmluL2Jhc2gKZWNobyAidGVzdCI=&#34;)
 *             .managedServiceIdentities(ElastigroupAzureV3ManagedServiceIdentityArgs.builder()
 *                 .resourceGroupName(&#34;MC_ocean-westus-dev_ocean-westus-dev-aks_westus&#34;)
 *                 .name(&#34;ocean-westus-dev-aks-agentpool&#34;)
 *                 .build())
 *             .tags(            
 *                 ElastigroupAzureV3TagArgs.builder()
 *                     .key(&#34;key1&#34;)
 *                     .value(&#34;value1&#34;)
 *                     .build(),
 *                 ElastigroupAzureV3TagArgs.builder()
 *                     .key(&#34;key2&#34;)
 *                     .value(&#34;value2&#34;)
 *                     .build())
 *             .images(ElastigroupAzureV3ImageArgs.builder()
 *                 .marketplaces(ElastigroupAzureV3ImageMarketplaceArgs.builder()
 *                     .publisher(&#34;Canonical&#34;)
 *                     .offer(&#34;UbuntuServer&#34;)
 *                     .sku(&#34;18.04-LTS&#34;)
 *                     .version(&#34;latest&#34;)
 *                     .build())
 *                 .build())
 *             .spotPercentage(65)
 *             .drainingTimeout(300)
 *             .fallbackToOnDemand(true)
 *             .network(ElastigroupAzureV3NetworkArgs.builder()
 *                 .virtualNetworkName(&#34;VirtualNetworkName&#34;)
 *                 .resourceGroupName(&#34;ResourceGroup&#34;)
 *                 .networkInterfaces(ElastigroupAzureV3NetworkNetworkInterfaceArgs.builder()
 *                     .subnetName(&#34;default&#34;)
 *                     .assignPublicIp(false)
 *                     .isPrimary(true)
 *                     .additionalIpConfigs(ElastigroupAzureV3NetworkNetworkInterfaceAdditionalIpConfigArgs.builder()
 *                         .name(&#34;SecondaryIPConfig&#34;)
 *                         .privateIPVersion(&#34;IPv4&#34;)
 *                         .build())
 *                     .applicationSecurityGroups(ElastigroupAzureV3NetworkNetworkInterfaceApplicationSecurityGroupArgs.builder()
 *                         .name(&#34;ApplicationSecurityGroupName&#34;)
 *                         .resourceGroupName(&#34;ResourceGroup&#34;)
 *                         .build())
 *                     .build())
 *                 .build())
 *             .login(ElastigroupAzureV3LoginArgs.builder()
 *                 .userName(&#34;admin&#34;)
 *                 .sshPublicKey(&#34;33a2s1f3g5a1df5g1ad3f2g1adfg56dfg==&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Strategy
 * 
 * * `spot_percentage` - (Optional) Percentage of Spot-VMs to maintain. Required if `on_demand_count` is not specified.
 * * `on_demand_count` - (Optional) Number of On-Demand VMs to maintain. Required if `spot_percentage` is not specified.
 * * `fallback_to_on_demand` -
 * * `draining_timeout` - (Optional, Default `120`) Time (seconds) to allow the instance to be drained from incoming TCP connections and detached from MLB before terminating it during a scale-down operation.
 * 
 * &lt;a id=&#34;image&#34;&gt;&lt;/a&gt;
 * 
 */
@ResourceType(type="spotinst:azure/elastigroup:Elastigroup")
public class Elastigroup extends com.pulumi.resources.CustomResource {
    /**
     * Custom init script file or text in Base64 encoded format.
     * 
     */
    @Export(name="customData", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> customData;

    /**
     * @return Custom init script file or text in Base64 encoded format.
     * 
     */
    public Output<Optional<String>> customData() {
        return Codegen.optional(this.customData);
    }
    /**
     * The desired number of instances the group should have at any time.
     * 
     */
    @Export(name="desiredCapacity", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> desiredCapacity;

    /**
     * @return The desired number of instances the group should have at any time.
     * 
     */
    public Output<Optional<Integer>> desiredCapacity() {
        return Codegen.optional(this.desiredCapacity);
    }
    @Export(name="healthCheck", refs={ElastigroupHealthCheck.class}, tree="[0]")
    private Output</* @Nullable */ ElastigroupHealthCheck> healthCheck;

    public Output<Optional<ElastigroupHealthCheck>> healthCheck() {
        return Codegen.optional(this.healthCheck);
    }
    @Export(name="images", refs={List.class,ElastigroupImage.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ElastigroupImage>> images;

    public Output<Optional<List<ElastigroupImage>>> images() {
        return Codegen.optional(this.images);
    }
    @Export(name="integrationKubernetes", refs={ElastigroupIntegrationKubernetes.class}, tree="[0]")
    private Output</* @Nullable */ ElastigroupIntegrationKubernetes> integrationKubernetes;

    public Output<Optional<ElastigroupIntegrationKubernetes>> integrationKubernetes() {
        return Codegen.optional(this.integrationKubernetes);
    }
    @Export(name="integrationMultaiRuntime", refs={ElastigroupIntegrationMultaiRuntime.class}, tree="[0]")
    private Output</* @Nullable */ ElastigroupIntegrationMultaiRuntime> integrationMultaiRuntime;

    public Output<Optional<ElastigroupIntegrationMultaiRuntime>> integrationMultaiRuntime() {
        return Codegen.optional(this.integrationMultaiRuntime);
    }
    @Export(name="loadBalancers", refs={List.class,ElastigroupLoadBalancer.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ElastigroupLoadBalancer>> loadBalancers;

    public Output<Optional<List<ElastigroupLoadBalancer>>> loadBalancers() {
        return Codegen.optional(this.loadBalancers);
    }
    @Export(name="login", refs={ElastigroupLogin.class}, tree="[0]")
    private Output</* @Nullable */ ElastigroupLogin> login;

    public Output<Optional<ElastigroupLogin>> login() {
        return Codegen.optional(this.login);
    }
    @Export(name="lowPrioritySizes", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> lowPrioritySizes;

    public Output<List<String>> lowPrioritySizes() {
        return this.lowPrioritySizes;
    }
    @Export(name="managedServiceIdentities", refs={List.class,ElastigroupManagedServiceIdentity.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ElastigroupManagedServiceIdentity>> managedServiceIdentities;

    public Output<Optional<List<ElastigroupManagedServiceIdentity>>> managedServiceIdentities() {
        return Codegen.optional(this.managedServiceIdentities);
    }
    /**
     * The maximum number of instances the group should have at any time.
     * 
     */
    @Export(name="maxSize", refs={Integer.class}, tree="[0]")
    private Output<Integer> maxSize;

    /**
     * @return The maximum number of instances the group should have at any time.
     * 
     */
    public Output<Integer> maxSize() {
        return this.maxSize;
    }
    /**
     * The minimum number of instances the group should have at any time.
     * 
     */
    @Export(name="minSize", refs={Integer.class}, tree="[0]")
    private Output<Integer> minSize;

    /**
     * @return The minimum number of instances the group should have at any time.
     * 
     */
    public Output<Integer> minSize() {
        return this.minSize;
    }
    /**
     * Name of the Managed Service Identity.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the Managed Service Identity.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    @Export(name="network", refs={ElastigroupNetwork.class}, tree="[0]")
    private Output<ElastigroupNetwork> network;

    public Output<ElastigroupNetwork> network() {
        return this.network;
    }
    /**
     * Available On-Demand sizes
     * 
     */
    @Export(name="odSizes", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> odSizes;

    /**
     * @return Available On-Demand sizes
     * 
     */
    public Output<List<String>> odSizes() {
        return this.odSizes;
    }
    @Export(name="product", refs={String.class}, tree="[0]")
    private Output<String> product;

    public Output<String> product() {
        return this.product;
    }
    /**
     * The region your Azure group will be created in.
     * 
     */
    @Export(name="region", refs={String.class}, tree="[0]")
    private Output<String> region;

    /**
     * @return The region your Azure group will be created in.
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * Name of the Azure Resource Group where the Managed Service Identity is located.
     * 
     */
    @Export(name="resourceGroupName", refs={String.class}, tree="[0]")
    private Output<String> resourceGroupName;

    /**
     * @return Name of the Azure Resource Group where the Managed Service Identity is located.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
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
    @Export(name="scheduledTasks", refs={List.class,ElastigroupScheduledTask.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ElastigroupScheduledTask>> scheduledTasks;

    public Output<Optional<List<ElastigroupScheduledTask>>> scheduledTasks() {
        return Codegen.optional(this.scheduledTasks);
    }
    @Export(name="shutdownScript", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> shutdownScript;

    public Output<Optional<String>> shutdownScript() {
        return Codegen.optional(this.shutdownScript);
    }
    @Export(name="strategy", refs={ElastigroupStrategy.class}, tree="[0]")
    private Output<ElastigroupStrategy> strategy;

    public Output<ElastigroupStrategy> strategy() {
        return this.strategy;
    }
    @Export(name="updatePolicy", refs={ElastigroupUpdatePolicy.class}, tree="[0]")
    private Output</* @Nullable */ ElastigroupUpdatePolicy> updatePolicy;

    public Output<Optional<ElastigroupUpdatePolicy>> updatePolicy() {
        return Codegen.optional(this.updatePolicy);
    }
    @Export(name="userData", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> userData;

    public Output<Optional<String>> userData() {
        return Codegen.optional(this.userData);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Elastigroup(String name) {
        this(name, ElastigroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Elastigroup(String name, ElastigroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Elastigroup(String name, ElastigroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("spotinst:azure/elastigroup:Elastigroup", name, args == null ? ElastigroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Elastigroup(String name, Output<String> id, @Nullable ElastigroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("spotinst:azure/elastigroup:Elastigroup", name, state, makeResourceOptions(options, id));
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
    public static Elastigroup get(String name, Output<String> id, @Nullable ElastigroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Elastigroup(name, id, state, options);
    }
}
