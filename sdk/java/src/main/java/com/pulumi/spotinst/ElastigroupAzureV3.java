// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.spotinst.ElastigroupAzureV3Args;
import com.pulumi.spotinst.Utilities;
import com.pulumi.spotinst.inputs.ElastigroupAzureV3State;
import com.pulumi.spotinst.outputs.ElastigroupAzureV3Image;
import com.pulumi.spotinst.outputs.ElastigroupAzureV3Login;
import com.pulumi.spotinst.outputs.ElastigroupAzureV3ManagedServiceIdentity;
import com.pulumi.spotinst.outputs.ElastigroupAzureV3Network;
import com.pulumi.spotinst.outputs.ElastigroupAzureV3Strategy;
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
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.spotinst.ElastigroupAzureV3;
 * import com.pulumi.spotinst.ElastigroupAzureV3Args;
 * import com.pulumi.spotinst.inputs.ElastigroupAzureV3ImageArgs;
 * import com.pulumi.spotinst.inputs.ElastigroupAzureV3LoginArgs;
 * import com.pulumi.spotinst.inputs.ElastigroupAzureV3ManagedServiceIdentityArgs;
 * import com.pulumi.spotinst.inputs.ElastigroupAzureV3NetworkArgs;
 * import com.pulumi.spotinst.inputs.ElastigroupAzureV3StrategyArgs;
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
 *             .customData(&#34;IyEvYmluL2Jhc2gKZWNobyAidGVzdCI=&#34;)
 *             .desiredCapacity(1)
 *             .images(ElastigroupAzureV3ImageArgs.builder()
 *                 .marketplaces(ElastigroupAzureV3ImageMarketplaceArgs.builder()
 *                     .offer(&#34;UbuntuServer&#34;)
 *                     .publisher(&#34;Canonical&#34;)
 *                     .sku(&#34;18.04-LTS&#34;)
 *                     .version(&#34;latest&#34;)
 *                     .build())
 *                 .build())
 *             .login(ElastigroupAzureV3LoginArgs.builder()
 *                 .sshPublicKey(&#34;33a2s1f3g5a1df5g1ad3f2g1adfg56dfg==&#34;)
 *                 .userName(&#34;admin&#34;)
 *                 .build())
 *             .managedServiceIdentities(ElastigroupAzureV3ManagedServiceIdentityArgs.builder()
 *                 .name(&#34;ocean-westus-dev-aks-agentpool&#34;)
 *                 .resourceGroupName(&#34;MC_ocean-westus-dev_ocean-westus-dev-aks_westus&#34;)
 *                 .build())
 *             .maxSize(1)
 *             .minSize(0)
 *             .network(ElastigroupAzureV3NetworkArgs.builder()
 *                 .networkInterfaces(ElastigroupAzureV3NetworkNetworkInterfaceArgs.builder()
 *                     .additionalIpConfigs(ElastigroupAzureV3NetworkNetworkInterfaceAdditionalIpConfigArgs.builder()
 *                         .privateIPVersion(&#34;IPv4&#34;)
 *                         .name(&#34;SecondaryIPConfig&#34;)
 *                         .build())
 *                     .applicationSecurityGroup(%!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference))
 *                     .assignPublicIp(false)
 *                     .isPrimary(true)
 *                     .subnetName(&#34;default&#34;)
 *                     .build())
 *                 .resourceGroupName(&#34;ResourceGroup&#34;)
 *                 .virtualNetworkName(&#34;VirtualNetworkName&#34;)
 *                 .build())
 *             .odSizes(            
 *                 &#34;standard_a1_v1&#34;,
 *                 &#34;standard_a1_v2&#34;)
 *             .os(&#34;Linux&#34;)
 *             .region(&#34;eastus&#34;)
 *             .resourceGroupName(&#34;spotinst-azure&#34;)
 *             .spotSizes(            
 *                 &#34;standard_a1_v1&#34;,
 *                 &#34;standard_a1_v2&#34;)
 *             .strategy(ElastigroupAzureV3StrategyArgs.builder()
 *                 .drainingTimeout(300)
 *                 .fallbackToOnDemand(true)
 *                 .odCount(1)
 *                 .spotPercentage(65)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 */
@ResourceType(type="spotinst:index/elastigroupAzureV3:ElastigroupAzureV3")
public class ElastigroupAzureV3 extends com.pulumi.resources.CustomResource {
    /**
     * Custom init script file or text in Base64 encoded format.
     * 
     */
    @Export(name="customData", type=String.class, parameters={})
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
    @Export(name="desiredCapacity", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> desiredCapacity;

    /**
     * @return The desired number of instances the group should have at any time.
     * 
     */
    public Output<Optional<Integer>> desiredCapacity() {
        return Codegen.optional(this.desiredCapacity);
    }
    @Export(name="images", type=List.class, parameters={ElastigroupAzureV3Image.class})
    private Output</* @Nullable */ List<ElastigroupAzureV3Image>> images;

    public Output<Optional<List<ElastigroupAzureV3Image>>> images() {
        return Codegen.optional(this.images);
    }
    @Export(name="login", type=ElastigroupAzureV3Login.class, parameters={})
    private Output</* @Nullable */ ElastigroupAzureV3Login> login;

    public Output<Optional<ElastigroupAzureV3Login>> login() {
        return Codegen.optional(this.login);
    }
    /**
     * List of Managed Service Identity objects.
     * 
     */
    @Export(name="managedServiceIdentities", type=List.class, parameters={ElastigroupAzureV3ManagedServiceIdentity.class})
    private Output</* @Nullable */ List<ElastigroupAzureV3ManagedServiceIdentity>> managedServiceIdentities;

    /**
     * @return List of Managed Service Identity objects.
     * 
     */
    public Output<Optional<List<ElastigroupAzureV3ManagedServiceIdentity>>> managedServiceIdentities() {
        return Codegen.optional(this.managedServiceIdentities);
    }
    /**
     * The maximum number of instances the group should have at any time.
     * 
     */
    @Export(name="maxSize", type=Integer.class, parameters={})
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
    @Export(name="minSize", type=Integer.class, parameters={})
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
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the Managed Service Identity.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    @Export(name="network", type=ElastigroupAzureV3Network.class, parameters={})
    private Output<ElastigroupAzureV3Network> network;

    public Output<ElastigroupAzureV3Network> network() {
        return this.network;
    }
    /**
     * Available On-Demand sizes
     * 
     */
    @Export(name="odSizes", type=List.class, parameters={String.class})
    private Output<List<String>> odSizes;

    /**
     * @return Available On-Demand sizes
     * 
     */
    public Output<List<String>> odSizes() {
        return this.odSizes;
    }
    /**
     * Type of the operating system. Valid values: `&#34;Linux&#34;`, `&#34;Windows&#34;`.
     * 
     */
    @Export(name="os", type=String.class, parameters={})
    private Output<String> os;

    /**
     * @return Type of the operating system. Valid values: `&#34;Linux&#34;`, `&#34;Windows&#34;`.
     * 
     */
    public Output<String> os() {
        return this.os;
    }
    /**
     * The region your Azure group will be created in.
     * 
     */
    @Export(name="region", type=String.class, parameters={})
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
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return Name of the Azure Resource Group where the Managed Service Identity is located.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * Available Low-Priority sizes.
     * 
     */
    @Export(name="spotSizes", type=List.class, parameters={String.class})
    private Output<List<String>> spotSizes;

    /**
     * @return Available Low-Priority sizes.
     * 
     */
    public Output<List<String>> spotSizes() {
        return this.spotSizes;
    }
    @Export(name="strategy", type=ElastigroupAzureV3Strategy.class, parameters={})
    private Output<ElastigroupAzureV3Strategy> strategy;

    public Output<ElastigroupAzureV3Strategy> strategy() {
        return this.strategy;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ElastigroupAzureV3(String name) {
        this(name, ElastigroupAzureV3Args.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ElastigroupAzureV3(String name, ElastigroupAzureV3Args args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ElastigroupAzureV3(String name, ElastigroupAzureV3Args args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("spotinst:index/elastigroupAzureV3:ElastigroupAzureV3", name, args == null ? ElastigroupAzureV3Args.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ElastigroupAzureV3(String name, Output<String> id, @Nullable ElastigroupAzureV3State state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("spotinst:index/elastigroupAzureV3:ElastigroupAzureV3", name, state, makeResourceOptions(options, id));
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
    public static ElastigroupAzureV3 get(String name, Output<String> id, @Nullable ElastigroupAzureV3State state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ElastigroupAzureV3(name, id, state, options);
    }
}
