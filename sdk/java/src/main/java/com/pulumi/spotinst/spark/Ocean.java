// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.spark;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.spotinst.Utilities;
import com.pulumi.spotinst.spark.OceanArgs;
import com.pulumi.spotinst.spark.inputs.OceanState;
import com.pulumi.spotinst.spark.outputs.OceanCompute;
import com.pulumi.spotinst.spark.outputs.OceanIngress;
import com.pulumi.spotinst.spark.outputs.OceanLogCollection;
import com.pulumi.spotinst.spark.outputs.OceanSpark;
import com.pulumi.spotinst.spark.outputs.OceanWebhook;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages a Spotinst Ocean Spark resource on AWS or GCP.
 * 
 * ## Prerequisites
 * 
 * An existing Ocean cluster is required by this resource. See e.g. the `spotinst.aws.Ocean` resource.
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
 * import com.pulumi.spotinst.spark.Ocean;
 * import com.pulumi.spotinst.spark.OceanArgs;
 * import com.pulumi.spotinst.spark.inputs.OceanIngressArgs;
 * import com.pulumi.spotinst.spark.inputs.OceanIngressControllerArgs;
 * import com.pulumi.spotinst.spark.inputs.OceanIngressLoadBalancerArgs;
 * import com.pulumi.spotinst.spark.inputs.OceanIngressCustomEndpointArgs;
 * import com.pulumi.spotinst.spark.inputs.OceanIngressPrivateLinkArgs;
 * import com.pulumi.spotinst.spark.inputs.OceanComputeArgs;
 * import com.pulumi.spotinst.spark.inputs.OceanLogCollectionArgs;
 * import com.pulumi.spotinst.spark.inputs.OceanWebhookArgs;
 * import com.pulumi.spotinst.spark.inputs.OceanSparkArgs;
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
 *         var example = new Ocean("example", OceanArgs.builder()
 *             .oceanClusterId("ocean-cluster-id")
 *             .ingress(OceanIngressArgs.builder()
 *                 .controller(OceanIngressControllerArgs.builder()
 *                     .managed(true)
 *                     .build())
 *                 .loadBalancer(OceanIngressLoadBalancerArgs.builder()
 *                     .managed(true)
 *                     .targetGroupArn("arn:aws:elasticloadbalancing:eu-north-1:XXXXXXXXXXXX:targetgroup/my-spark-cluster-nlb-tg/a38c2b83XXXXXXXX")
 *                     .serviceAnnotations(Map.ofEntries(
 *                         Map.entry("service.beta.kubernetes.io/aws-load-balancer-security-groups", "sg-XXXXXXXXXXXXXXXXX"),
 *                         Map.entry("some-service-annotation-2", "some-service-annotation-value-2")
 *                     ))
 *                     .build())
 *                 .customEndpoint(OceanIngressCustomEndpointArgs.builder()
 *                     .enabled(false)
 *                     .address("my-spark-cluster-nlb-8cbb8da7XXXXXXXX.elb.us-east-1.amazonaws.com")
 *                     .build())
 *                 .privateLink(OceanIngressPrivateLinkArgs.builder()
 *                     .enabled(false)
 *                     .vpcEndpointService("com.amazonaws.vpce.eu-north-1.vpce-svc-XXXXXXXXXXXXXXXXX")
 *                     .build())
 *                 .build())
 *             .compute(OceanComputeArgs.builder()
 *                 .createVngs(true)
 *                 .useTaints(true)
 *                 .build())
 *             .logCollection(OceanLogCollectionArgs.builder()
 *                 .collectAppLogs(true)
 *                 .build())
 *             .webhook(OceanWebhookArgs.builder()
 *                 .useHostNetwork(false)
 *                 .hostNetworkPorts(25554)
 *                 .build())
 *             .spark(OceanSparkArgs.builder()
 *                 .additionalAppNamespaces(                
 *                     "extra-spark-app-ns-1",
 *                     "extra-spark-app-ns-2")
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
@ResourceType(type="spotinst:spark/ocean:Ocean")
public class Ocean extends com.pulumi.resources.CustomResource {
    @Export(name="compute", refs={OceanCompute.class}, tree="[0]")
    private Output<OceanCompute> compute;

    public Output<OceanCompute> compute() {
        return this.compute;
    }
    @Export(name="ingress", refs={OceanIngress.class}, tree="[0]")
    private Output<OceanIngress> ingress;

    public Output<OceanIngress> ingress() {
        return this.ingress;
    }
    @Export(name="logCollection", refs={OceanLogCollection.class}, tree="[0]")
    private Output<OceanLogCollection> logCollection;

    public Output<OceanLogCollection> logCollection() {
        return this.logCollection;
    }
    /**
     * - The ID of the Ocean cluster that Ocean for Apache Spark should be installed on.
     * 
     */
    @Export(name="oceanClusterId", refs={String.class}, tree="[0]")
    private Output<String> oceanClusterId;

    /**
     * @return - The ID of the Ocean cluster that Ocean for Apache Spark should be installed on.
     * 
     */
    public Output<String> oceanClusterId() {
        return this.oceanClusterId;
    }
    @Export(name="spark", refs={OceanSpark.class}, tree="[0]")
    private Output<OceanSpark> spark;

    public Output<OceanSpark> spark() {
        return this.spark;
    }
    @Export(name="webhook", refs={OceanWebhook.class}, tree="[0]")
    private Output<OceanWebhook> webhook;

    public Output<OceanWebhook> webhook() {
        return this.webhook;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Ocean(java.lang.String name) {
        this(name, OceanArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Ocean(java.lang.String name, OceanArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Ocean(java.lang.String name, OceanArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("spotinst:spark/ocean:Ocean", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Ocean(java.lang.String name, Output<java.lang.String> id, @Nullable OceanState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("spotinst:spark/ocean:Ocean", name, state, makeResourceOptions(options, id), false);
    }

    private static OceanArgs makeArgs(OceanArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? OceanArgs.Empty : args;
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
    public static Ocean get(java.lang.String name, Output<java.lang.String> id, @Nullable OceanState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Ocean(name, id, state, options);
    }
}
