// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.spotinst.SubscriptionArgs;
import com.pulumi.spotinst.Utilities;
import com.pulumi.spotinst.inputs.SubscriptionState;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Spotinst subscription resource.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.spotinst.Subscription;
 * import com.pulumi.spotinst.SubscriptionArgs;
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
 *         var default_subscription = new Subscription(&#34;default-subscription&#34;, SubscriptionArgs.builder()        
 *             .endpoint(&#34;http://endpoint.com&#34;)
 *             .eventType(&#34;AWS_EC2_INSTANCE_LAUNCH&#34;)
 *             .format(Map.ofEntries(
 *                 Map.entry(&#34;event&#34;, &#34;%event%&#34;),
 *                 Map.entry(&#34;instance_id&#34;, &#34;%instance-id%&#34;),
 *                 Map.entry(&#34;resource_id&#34;, &#34;%resource-id%&#34;),
 *                 Map.entry(&#34;resource_name&#34;, &#34;%resource-name%&#34;),
 *                 Map.entry(&#34;tags&#34;, &#34;foo,baz,baz&#34;)
 *             ))
 *             .protocol(&#34;http&#34;)
 *             .resourceId(spotinst_elastigroup_aws.my-eg().id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 */
@ResourceType(type="spotinst:index/subscription:Subscription")
public class Subscription extends com.pulumi.resources.CustomResource {
    /**
     * The endpoint the notification will be sent to. url in case of `&#34;http&#34;`/`&#34;https&#34;`/`&#34;web&#34;`, email address in case of `&#34;email&#34;`/`&#34;email-json&#34;` and sns-topic-arn in case of `&#34;aws-sns&#34;`.
     * 
     */
    @Export(name="endpoint", type=String.class, parameters={})
    private Output<String> endpoint;

    /**
     * @return The endpoint the notification will be sent to. url in case of `&#34;http&#34;`/`&#34;https&#34;`/`&#34;web&#34;`, email address in case of `&#34;email&#34;`/`&#34;email-json&#34;` and sns-topic-arn in case of `&#34;aws-sns&#34;`.
     * 
     */
    public Output<String> endpoint() {
        return this.endpoint;
    }
    /**
     * The event to send the notification when triggered. Valid values: `&#34;AWS_EC2_INSTANCE_TERMINATE&#34;`, `&#34;AWS_EC2_INSTANCE_TERMINATED&#34;`, `&#34;AWS_EC2_INSTANCE_LAUNCH&#34;`, `&#34;AWS_EC2_INSTANCE_READY_SIGNAL_TIMEOUT&#34;`, `&#34;AWS_EC2_CANT_SPIN_OD&#34;`, `&#34;AWS_EC2_INSTANCE_UNHEALTHY_IN_ELB&#34;`, `&#34;GROUP_ROLL_FAILED&#34;`, `&#34;GROUP_ROLL_FINISHED&#34;`,
     * `&#34;CANT_SCALE_UP_GROUP_MAX_CAPACITY&#34;`,
     * `&#34;GROUP_UPDATED&#34;`,
     * `&#34;AWS_EMR_PROVISION_TIMEOUT&#34;`,
     * `&#34;GROUP_BEANSTALK_INIT_READY&#34;`,
     * `&#34;AZURE_VM_TERMINATED&#34;`,
     * `&#34;AZURE_VM_TERMINATE&#34;`,
     * `&#34;AWS_EC2_MANAGED_INSTANCE_PAUSING&#34;`,
     * `&#34;AWS_EC2_MANAGED_INSTANCE_RESUMING&#34;`,
     * `&#34;AWS_EC2_MANAGED_INSTANCE_RECYCLING&#34;`,`&#34;AWS_EC2_MANAGED_INSTANCE_DELETING&#34;`.
     * Ocean Events:`&#34;CLUSTER_ROLL_FINISHED&#34;`,`&#34;GROUP_ROLL_FAILED&#34;`.
     * 
     */
    @Export(name="eventType", type=String.class, parameters={})
    private Output<String> eventType;

    /**
     * @return The event to send the notification when triggered. Valid values: `&#34;AWS_EC2_INSTANCE_TERMINATE&#34;`, `&#34;AWS_EC2_INSTANCE_TERMINATED&#34;`, `&#34;AWS_EC2_INSTANCE_LAUNCH&#34;`, `&#34;AWS_EC2_INSTANCE_READY_SIGNAL_TIMEOUT&#34;`, `&#34;AWS_EC2_CANT_SPIN_OD&#34;`, `&#34;AWS_EC2_INSTANCE_UNHEALTHY_IN_ELB&#34;`, `&#34;GROUP_ROLL_FAILED&#34;`, `&#34;GROUP_ROLL_FINISHED&#34;`,
     * `&#34;CANT_SCALE_UP_GROUP_MAX_CAPACITY&#34;`,
     * `&#34;GROUP_UPDATED&#34;`,
     * `&#34;AWS_EMR_PROVISION_TIMEOUT&#34;`,
     * `&#34;GROUP_BEANSTALK_INIT_READY&#34;`,
     * `&#34;AZURE_VM_TERMINATED&#34;`,
     * `&#34;AZURE_VM_TERMINATE&#34;`,
     * `&#34;AWS_EC2_MANAGED_INSTANCE_PAUSING&#34;`,
     * `&#34;AWS_EC2_MANAGED_INSTANCE_RESUMING&#34;`,
     * `&#34;AWS_EC2_MANAGED_INSTANCE_RECYCLING&#34;`,`&#34;AWS_EC2_MANAGED_INSTANCE_DELETING&#34;`.
     * Ocean Events:`&#34;CLUSTER_ROLL_FINISHED&#34;`,`&#34;GROUP_ROLL_FAILED&#34;`.
     * 
     */
    public Output<String> eventType() {
        return this.eventType;
    }
    /**
     * The format of the notification content (JSON Format - Key+Value). Valid Values : `&#34;instance-id&#34;`, `&#34;event&#34;`, `&#34;resource-id&#34;`, `&#34;resource-name&#34;`, `&#34;subnet-id&#34;`, `&#34;availability-zone&#34;`, `&#34;reason&#34;`, `&#34;private-ip&#34;`, `&#34;launchspec-id&#34;`
     * Example: {&#34;event&#34;: `&#34;event&#34;`, `&#34;resourceId&#34;`: `&#34;resource-id&#34;`, `&#34;resourceName&#34;`: `&#34;resource-name&#34;`&#34;, `&#34;myCustomKey&#34;`: `&#34;My content is set here&#34;` }
     * Default: {`&#34;event&#34;`: `&#34;&lt;event&gt;&#34;`, `&#34;instanceId&#34;`: `&#34;&lt;instance-id&gt;&#34;`, `&#34;resourceId&#34;`: `&#34;&lt;resource-id&gt;&#34;`, `&#34;resourceName&#34;`: `&#34;&lt;resource-name&gt;&#34;` }.
     * 
     */
    @Export(name="format", type=Map.class, parameters={String.class, Object.class})
    private Output</* @Nullable */ Map<String,Object>> format;

    /**
     * @return The format of the notification content (JSON Format - Key+Value). Valid Values : `&#34;instance-id&#34;`, `&#34;event&#34;`, `&#34;resource-id&#34;`, `&#34;resource-name&#34;`, `&#34;subnet-id&#34;`, `&#34;availability-zone&#34;`, `&#34;reason&#34;`, `&#34;private-ip&#34;`, `&#34;launchspec-id&#34;`
     * Example: {&#34;event&#34;: `&#34;event&#34;`, `&#34;resourceId&#34;`: `&#34;resource-id&#34;`, `&#34;resourceName&#34;`: `&#34;resource-name&#34;`&#34;, `&#34;myCustomKey&#34;`: `&#34;My content is set here&#34;` }
     * Default: {`&#34;event&#34;`: `&#34;&lt;event&gt;&#34;`, `&#34;instanceId&#34;`: `&#34;&lt;instance-id&gt;&#34;`, `&#34;resourceId&#34;`: `&#34;&lt;resource-id&gt;&#34;`, `&#34;resourceName&#34;`: `&#34;&lt;resource-name&gt;&#34;` }.
     * 
     */
    public Output<Optional<Map<String,Object>>> format() {
        return Codegen.optional(this.format);
    }
    /**
     * The protocol to send the notification. Valid values: `&#34;email&#34;`, `&#34;email-json&#34;`, `&#34;aws-sns&#34;`, `&#34;web&#34;`.
     * The following values are deprecated: `&#34;http&#34;` , `&#34;https&#34;`
     * You can use the generic `&#34;web&#34;` protocol instead.
     * `&#34;aws-sns&#34;` is only supported with AWS provider
     * 
     */
    @Export(name="protocol", type=String.class, parameters={})
    private Output<String> protocol;

    /**
     * @return The protocol to send the notification. Valid values: `&#34;email&#34;`, `&#34;email-json&#34;`, `&#34;aws-sns&#34;`, `&#34;web&#34;`.
     * The following values are deprecated: `&#34;http&#34;` , `&#34;https&#34;`
     * You can use the generic `&#34;web&#34;` protocol instead.
     * `&#34;aws-sns&#34;` is only supported with AWS provider
     * 
     */
    public Output<String> protocol() {
        return this.protocol;
    }
    /**
     * Spotinst Resource id (Elastigroup or Ocean ID).
     * 
     */
    @Export(name="resourceId", type=String.class, parameters={})
    private Output<String> resourceId;

    /**
     * @return Spotinst Resource id (Elastigroup or Ocean ID).
     * 
     */
    public Output<String> resourceId() {
        return this.resourceId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Subscription(String name) {
        this(name, SubscriptionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Subscription(String name, SubscriptionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Subscription(String name, SubscriptionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("spotinst:index/subscription:Subscription", name, args == null ? SubscriptionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Subscription(String name, Output<String> id, @Nullable SubscriptionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("spotinst:index/subscription:Subscription", name, state, makeResourceOptions(options, id));
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
    public static Subscription get(String name, Output<String> id, @Nullable SubscriptionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Subscription(name, id, state, options);
    }
}