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
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.spotinst.azure.Elastigroup;
 * import com.pulumi.spotinst.azure.ElastigroupArgs;
 * import com.pulumi.spotinst.azure.inputs.ElastigroupHealthCheckArgs;
 * import com.pulumi.spotinst.azure.inputs.ElastigroupImageArgs;
 * import com.pulumi.spotinst.azure.inputs.ElastigroupLoadBalancerArgs;
 * import com.pulumi.spotinst.azure.inputs.ElastigroupLoginArgs;
 * import com.pulumi.spotinst.azure.inputs.ElastigroupManagedServiceIdentityArgs;
 * import com.pulumi.spotinst.azure.inputs.ElastigroupNetworkArgs;
 * import com.pulumi.spotinst.azure.inputs.ElastigroupScalingDownPolicyArgs;
 * import com.pulumi.spotinst.azure.inputs.ElastigroupScalingUpPolicyArgs;
 * import com.pulumi.spotinst.azure.inputs.ElastigroupScheduledTaskArgs;
 * import com.pulumi.spotinst.azure.inputs.ElastigroupStrategyArgs;
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
 *         var testAzureGroup = new Elastigroup(&#34;testAzureGroup&#34;, ElastigroupArgs.builder()        
 *             .desiredCapacity(1)
 *             .healthCheck(ElastigroupHealthCheckArgs.builder()
 *                 .autoHealing(true)
 *                 .gracePeriod(120)
 *                 .healthCheckType(&#34;INSTANCE_STATE&#34;)
 *                 .build())
 *             .images(ElastigroupImageArgs.builder()
 *                 .marketplaces(ElastigroupImageMarketplaceArgs.builder()
 *                     .offer(&#34;UbuntuServer&#34;)
 *                     .publisher(&#34;Canonical&#34;)
 *                     .sku(&#34;16.04-LTS&#34;)
 *                     .build())
 *                 .build())
 *             .loadBalancers(ElastigroupLoadBalancerArgs.builder()
 *                 .autoWeight(true)
 *                 .balancerId(&#34;lb-1ee2e3q&#34;)
 *                 .targetSetId(&#34;ts-3eq&#34;)
 *                 .type(&#34;MULTAI_TARGET_SET&#34;)
 *                 .build())
 *             .login(ElastigroupLoginArgs.builder()
 *                 .sshPublicKey(&#34;33a2s1f3g5a1df5g1ad3f2g1adfg56dfg==&#34;)
 *                 .userName(&#34;admin&#34;)
 *                 .build())
 *             .lowPrioritySizes(            
 *                 &#34;standard_a1_v1&#34;,
 *                 &#34;standard_a1_v2&#34;)
 *             .managedServiceIdentities(ElastigroupManagedServiceIdentityArgs.builder()
 *                 .name(&#34;example-identity&#34;)
 *                 .resourceGroupName(&#34;spotinst-azure&#34;)
 *                 .build())
 *             .maxSize(1)
 *             .minSize(0)
 *             .network(ElastigroupNetworkArgs.builder()
 *                 .assignPublicIp(true)
 *                 .resourceGroupName(&#34;subnetResourceGroup&#34;)
 *                 .subnetName(&#34;my-subnet-name&#34;)
 *                 .virtualNetworkName(&#34;vname&#34;)
 *                 .build())
 *             .odSizes(            
 *                 &#34;standard_a1_v1&#34;,
 *                 &#34;standard_a1_v2&#34;)
 *             .product(&#34;Linux&#34;)
 *             .region(&#34;eastus&#34;)
 *             .resourceGroupName(&#34;spotinst-azure&#34;)
 *             .scalingDownPolicies(ElastigroupScalingDownPolicyArgs.builder()
 *                 .actionType(&#34;adjustment&#34;)
 *                 .adjustment(&#34;MIN(5,10)&#34;)
 *                 .cooldown(60)
 *                 .dimensions(ElastigroupScalingDownPolicyDimensionArgs.builder()
 *                     .name(&#34;name-1&#34;)
 *                     .value(&#34;value-1&#34;)
 *                     .build())
 *                 .evaluationPeriods(&#34;10&#34;)
 *                 .metricName(&#34;CPUUtilization&#34;)
 *                 .namespace(&#34;Microsoft.Compute&#34;)
 *                 .operator(&#34;gt&#34;)
 *                 .period(&#34;60&#34;)
 *                 .policyName(&#34;policy-name&#34;)
 *                 .statistic(&#34;average&#34;)
 *                 .threshold(10)
 *                 .unit(&#34;percent&#34;)
 *                 .build())
 *             .scalingUpPolicies(ElastigroupScalingUpPolicyArgs.builder()
 *                 .actionType(&#34;setMinTarget&#34;)
 *                 .cooldown(60)
 *                 .dimensions(                
 *                     ElastigroupScalingUpPolicyDimensionArgs.builder()
 *                         .name(&#34;resourceName&#34;)
 *                         .value(&#34;resource-name&#34;)
 *                         .build(),
 *                     ElastigroupScalingUpPolicyDimensionArgs.builder()
 *                         .name(&#34;resourceGroupName&#34;)
 *                         .value(&#34;resource-group-name&#34;)
 *                         .build())
 *                 .evaluationPeriods(&#34;10&#34;)
 *                 .metricName(&#34;CPUUtilization&#34;)
 *                 .minTargetCapacity(1)
 *                 .namespace(&#34;Microsoft.Compute&#34;)
 *                 .operator(&#34;gt&#34;)
 *                 .period(&#34;60&#34;)
 *                 .policyName(&#34;policy-name&#34;)
 *                 .statistic(&#34;average&#34;)
 *                 .threshold(10)
 *                 .unit(&#34;percent&#34;)
 *                 .build())
 *             .scheduledTasks(ElastigroupScheduledTaskArgs.builder()
 *                 .adjustment(2)
 *                 .adjustmentPercentage(50)
 *                 .batchSizePercentage(33)
 *                 .cronExpression(&#34;* * * * *&#34;)
 *                 .gracePeriod(300)
 *                 .isEnabled(true)
 *                 .scaleMaxCapacity(8)
 *                 .scaleMinCapacity(5)
 *                 .scaleTargetCapacity(6)
 *                 .taskType(&#34;scale&#34;)
 *                 .build())
 *             .shutdownScript(&#34;&#34;)
 *             .strategy(ElastigroupStrategyArgs.builder()
 *                 .drainingTimeout(300)
 *                 .odCount(1)
 *                 .build())
 *             .userData(&#34;&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 */
@ResourceType(type="spotinst:azure/elastigroup:Elastigroup")
public class Elastigroup extends com.pulumi.resources.CustomResource {
    @Export(name="customData", type=String.class, parameters={})
    private Output</* @Nullable */ String> customData;

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
    @Export(name="healthCheck", type=ElastigroupHealthCheck.class, parameters={})
    private Output</* @Nullable */ ElastigroupHealthCheck> healthCheck;

    public Output<Optional<ElastigroupHealthCheck>> healthCheck() {
        return Codegen.optional(this.healthCheck);
    }
    @Export(name="images", type=List.class, parameters={ElastigroupImage.class})
    private Output</* @Nullable */ List<ElastigroupImage>> images;

    public Output<Optional<List<ElastigroupImage>>> images() {
        return Codegen.optional(this.images);
    }
    /**
     * Describes the [Kubernetes](https://kubernetes.io/) integration.
     * 
     */
    @Export(name="integrationKubernetes", type=ElastigroupIntegrationKubernetes.class, parameters={})
    private Output</* @Nullable */ ElastigroupIntegrationKubernetes> integrationKubernetes;

    /**
     * @return Describes the [Kubernetes](https://kubernetes.io/) integration.
     * 
     */
    public Output<Optional<ElastigroupIntegrationKubernetes>> integrationKubernetes() {
        return Codegen.optional(this.integrationKubernetes);
    }
    /**
     * Describes the [Multai Runtime](https://spotinst.com/) integration.
     * 
     */
    @Export(name="integrationMultaiRuntime", type=ElastigroupIntegrationMultaiRuntime.class, parameters={})
    private Output</* @Nullable */ ElastigroupIntegrationMultaiRuntime> integrationMultaiRuntime;

    /**
     * @return Describes the [Multai Runtime](https://spotinst.com/) integration.
     * 
     */
    public Output<Optional<ElastigroupIntegrationMultaiRuntime>> integrationMultaiRuntime() {
        return Codegen.optional(this.integrationMultaiRuntime);
    }
    @Export(name="loadBalancers", type=List.class, parameters={ElastigroupLoadBalancer.class})
    private Output</* @Nullable */ List<ElastigroupLoadBalancer>> loadBalancers;

    public Output<Optional<List<ElastigroupLoadBalancer>>> loadBalancers() {
        return Codegen.optional(this.loadBalancers);
    }
    @Export(name="login", type=ElastigroupLogin.class, parameters={})
    private Output</* @Nullable */ ElastigroupLogin> login;

    public Output<Optional<ElastigroupLogin>> login() {
        return Codegen.optional(this.login);
    }
    /**
     * Available Low-Priority sizes.
     * 
     */
    @Export(name="lowPrioritySizes", type=List.class, parameters={String.class})
    private Output<List<String>> lowPrioritySizes;

    /**
     * @return Available Low-Priority sizes.
     * 
     */
    public Output<List<String>> lowPrioritySizes() {
        return this.lowPrioritySizes;
    }
    @Export(name="managedServiceIdentities", type=List.class, parameters={ElastigroupManagedServiceIdentity.class})
    private Output</* @Nullable */ List<ElastigroupManagedServiceIdentity>> managedServiceIdentities;

    public Output<Optional<List<ElastigroupManagedServiceIdentity>>> managedServiceIdentities() {
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
     * The name of the managed identity.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the managed identity.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    @Export(name="network", type=ElastigroupNetwork.class, parameters={})
    private Output<ElastigroupNetwork> network;

    public Output<ElastigroupNetwork> network() {
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
     * Operation system type. Valid values: `&#34;Linux&#34;`, `&#34;Windows&#34;`.
     * 
     */
    @Export(name="product", type=String.class, parameters={})
    private Output<String> product;

    /**
     * @return Operation system type. Valid values: `&#34;Linux&#34;`, `&#34;Windows&#34;`.
     * 
     */
    public Output<String> product() {
        return this.product;
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
     * The Resource Group that the user-assigned managed identity resides in.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The Resource Group that the user-assigned managed identity resides in.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    @Export(name="scalingDownPolicies", type=List.class, parameters={ElastigroupScalingDownPolicy.class})
    private Output</* @Nullable */ List<ElastigroupScalingDownPolicy>> scalingDownPolicies;

    public Output<Optional<List<ElastigroupScalingDownPolicy>>> scalingDownPolicies() {
        return Codegen.optional(this.scalingDownPolicies);
    }
    @Export(name="scalingUpPolicies", type=List.class, parameters={ElastigroupScalingUpPolicy.class})
    private Output</* @Nullable */ List<ElastigroupScalingUpPolicy>> scalingUpPolicies;

    public Output<Optional<List<ElastigroupScalingUpPolicy>>> scalingUpPolicies() {
        return Codegen.optional(this.scalingUpPolicies);
    }
    /**
     * Describes the configuration of one or more scheduled tasks.
     * 
     */
    @Export(name="scheduledTasks", type=List.class, parameters={ElastigroupScheduledTask.class})
    private Output</* @Nullable */ List<ElastigroupScheduledTask>> scheduledTasks;

    /**
     * @return Describes the configuration of one or more scheduled tasks.
     * 
     */
    public Output<Optional<List<ElastigroupScheduledTask>>> scheduledTasks() {
        return Codegen.optional(this.scheduledTasks);
    }
    /**
     * Shutdown script for the group. Value should be passed as a string encoded at Base64 only.
     * 
     */
    @Export(name="shutdownScript", type=String.class, parameters={})
    private Output</* @Nullable */ String> shutdownScript;

    /**
     * @return Shutdown script for the group. Value should be passed as a string encoded at Base64 only.
     * 
     */
    public Output<Optional<String>> shutdownScript() {
        return Codegen.optional(this.shutdownScript);
    }
    /**
     * Describes the deployment strategy.
     * 
     */
    @Export(name="strategy", type=ElastigroupStrategy.class, parameters={})
    private Output<ElastigroupStrategy> strategy;

    /**
     * @return Describes the deployment strategy.
     * 
     */
    public Output<ElastigroupStrategy> strategy() {
        return this.strategy;
    }
    @Export(name="updatePolicy", type=ElastigroupUpdatePolicy.class, parameters={})
    private Output</* @Nullable */ ElastigroupUpdatePolicy> updatePolicy;

    public Output<Optional<ElastigroupUpdatePolicy>> updatePolicy() {
        return Codegen.optional(this.updatePolicy);
    }
    /**
     * Base64-encoded MIME user data to make available to the instances.
     * 
     */
    @Export(name="userData", type=String.class, parameters={})
    private Output</* @Nullable */ String> userData;

    /**
     * @return Base64-encoded MIME user data to make available to the instances.
     * 
     */
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
