// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.spotinst.HealthCheckArgs;
import com.pulumi.spotinst.Utilities;
import com.pulumi.spotinst.inputs.HealthCheckState;
import com.pulumi.spotinst.outputs.HealthCheckCheck;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Spotinst Health Check resource.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var httpCheck = new HealthCheck(&#34;httpCheck&#34;, HealthCheckArgs.builder()        
 *             .check(HealthCheckCheckArgs.builder()
 *                 .endpoint(&#34;http://endpoint.com&#34;)
 *                 .healthy(1)
 *                 .interval(10)
 *                 .port(1337)
 *                 .protocol(&#34;http&#34;)
 *                 .timeout(10)
 *                 .unhealthy(1)
 *                 .build())
 *             .proxyAddress(&#34;http://proxy.com&#34;)
 *             .proxyPort(80)
 *             .resourceId(&#34;sig-123&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 */
@ResourceType(type="spotinst:index/healthCheck:HealthCheck")
public class HealthCheck extends com.pulumi.resources.CustomResource {
    /**
     * Describes the check to execute.
     * 
     */
    @Export(name="check", type=HealthCheckCheck.class, parameters={})
    private Output</* @Nullable */ HealthCheckCheck> check;

    /**
     * @return Describes the check to execute.
     * 
     */
    public Output<Optional<HealthCheckCheck>> check() {
        return Codegen.optional(this.check);
    }
    /**
     * The name of the health check.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the health check.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    @Export(name="proxyAddress", type=String.class, parameters={})
    private Output<String> proxyAddress;

    public Output<String> proxyAddress() {
        return this.proxyAddress;
    }
    @Export(name="proxyPort", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> proxyPort;

    public Output<Optional<Integer>> proxyPort() {
        return Codegen.optional(this.proxyPort);
    }
    /**
     * The ID of the resource to check.
     * 
     */
    @Export(name="resourceId", type=String.class, parameters={})
    private Output<String> resourceId;

    /**
     * @return The ID of the resource to check.
     * 
     */
    public Output<String> resourceId() {
        return this.resourceId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public HealthCheck(String name) {
        this(name, HealthCheckArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public HealthCheck(String name, HealthCheckArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public HealthCheck(String name, HealthCheckArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("spotinst:index/healthCheck:HealthCheck", name, args == null ? HealthCheckArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private HealthCheck(String name, Output<String> id, @Nullable HealthCheckState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("spotinst:index/healthCheck:HealthCheck", name, state, makeResourceOptions(options, id));
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
    public static HealthCheck get(String name, Output<String> id, @Nullable HealthCheckState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new HealthCheck(name, id, state, options);
    }
}
