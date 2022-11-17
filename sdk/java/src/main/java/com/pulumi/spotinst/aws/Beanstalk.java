// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.spotinst.Utilities;
import com.pulumi.spotinst.aws.BeanstalkArgs;
import com.pulumi.spotinst.aws.inputs.BeanstalkState;
import com.pulumi.spotinst.aws.outputs.BeanstalkDeploymentPreferences;
import com.pulumi.spotinst.aws.outputs.BeanstalkManagedActions;
import com.pulumi.spotinst.aws.outputs.BeanstalkScheduledTask;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Spotinst AWS group resource using Elastic Beanstalk.
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
 *         var elastigoup_aws_beanstalk = new Beanstalk(&#34;elastigoup-aws-beanstalk&#34;, BeanstalkArgs.builder()        
 *             .beanstalkEnvironmentId(&#34;e-example&#34;)
 *             .beanstalkEnvironmentName(&#34;example-env&#34;)
 *             .deploymentPreferences(BeanstalkDeploymentPreferencesArgs.builder()
 *                 .automaticRoll(true)
 *                 .batchSizePercentage(100)
 *                 .gracePeriod(90)
 *                 .strategies(BeanstalkDeploymentPreferencesStrategyArgs.builder()
 *                     .action(&#34;REPLACE_SERVER&#34;)
 *                     .shouldDrainInstances(true)
 *                     .build())
 *                 .build())
 *             .desiredCapacity(0)
 *             .instanceTypesSpots(            
 *                 &#34;t2.micro&#34;,
 *                 &#34;t2.medium&#34;,
 *                 &#34;t2.large&#34;)
 *             .managedActions(BeanstalkManagedActionsArgs.builder()
 *                 .platformUpdate(BeanstalkManagedActionsPlatformUpdateArgs.builder()
 *                     .performAt(&#34;timeWindow&#34;)
 *                     .timeWindow(&#34;Mon:23:50-Tue:00:20&#34;)
 *                     .updateLevel(&#34;minorAndPatch&#34;)
 *                     .build())
 *                 .build())
 *             .maxSize(1)
 *             .minSize(0)
 *             .product(&#34;Linux/UNIX&#34;)
 *             .region(&#34;us-west-2&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 */
@ResourceType(type="spotinst:aws/beanstalk:Beanstalk")
public class Beanstalk extends com.pulumi.resources.CustomResource {
    /**
     * The id of an existing Beanstalk environment.
     * 
     */
    @Export(name="beanstalkEnvironmentId", type=String.class, parameters={})
    private Output</* @Nullable */ String> beanstalkEnvironmentId;

    /**
     * @return The id of an existing Beanstalk environment.
     * 
     */
    public Output<Optional<String>> beanstalkEnvironmentId() {
        return Codegen.optional(this.beanstalkEnvironmentId);
    }
    /**
     * The name of an existing Beanstalk environment.
     * 
     */
    @Export(name="beanstalkEnvironmentName", type=String.class, parameters={})
    private Output</* @Nullable */ String> beanstalkEnvironmentName;

    /**
     * @return The name of an existing Beanstalk environment.
     * 
     */
    public Output<Optional<String>> beanstalkEnvironmentName() {
        return Codegen.optional(this.beanstalkEnvironmentName);
    }
    /**
     * Preferences when performing a roll
     * 
     */
    @Export(name="deploymentPreferences", type=BeanstalkDeploymentPreferences.class, parameters={})
    private Output</* @Nullable */ BeanstalkDeploymentPreferences> deploymentPreferences;

    /**
     * @return Preferences when performing a roll
     * 
     */
    public Output<Optional<BeanstalkDeploymentPreferences>> deploymentPreferences() {
        return Codegen.optional(this.deploymentPreferences);
    }
    /**
     * The desired number of instances the group should have at any time.
     * 
     */
    @Export(name="desiredCapacity", type=Integer.class, parameters={})
    private Output<Integer> desiredCapacity;

    /**
     * @return The desired number of instances the group should have at any time.
     * 
     */
    public Output<Integer> desiredCapacity() {
        return this.desiredCapacity;
    }
    /**
     * One or more instance types. To maximize the availability of Spot instances, select as many instance types as possible.
     * 
     */
    @Export(name="instanceTypesSpots", type=List.class, parameters={String.class})
    private Output<List<String>> instanceTypesSpots;

    /**
     * @return One or more instance types. To maximize the availability of Spot instances, select as many instance types as possible.
     * 
     */
    public Output<List<String>> instanceTypesSpots() {
        return this.instanceTypesSpots;
    }
    @Export(name="maintenance", type=String.class, parameters={})
    private Output</* @Nullable */ String> maintenance;

    public Output<Optional<String>> maintenance() {
        return Codegen.optional(this.maintenance);
    }
    /**
     * Managed Actions parameters
     * 
     */
    @Export(name="managedActions", type=BeanstalkManagedActions.class, parameters={})
    private Output</* @Nullable */ BeanstalkManagedActions> managedActions;

    /**
     * @return Managed Actions parameters
     * 
     */
    public Output<Optional<BeanstalkManagedActions>> managedActions() {
        return Codegen.optional(this.managedActions);
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
     * The group name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The group name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Operation system type. Valid values: `&#34;Linux/UNIX&#34;`, `&#34;SUSE Linux&#34;`, `&#34;Windows&#34;`.
     * For EC2 Classic instances:  `&#34;Linux/UNIX (Amazon VPC)&#34;`, `&#34;SUSE Linux (Amazon VPC)&#34;`, `&#34;Windows (Amazon VPC)&#34;`.
     * 
     */
    @Export(name="product", type=String.class, parameters={})
    private Output<String> product;

    /**
     * @return Operation system type. Valid values: `&#34;Linux/UNIX&#34;`, `&#34;SUSE Linux&#34;`, `&#34;Windows&#34;`.
     * For EC2 Classic instances:  `&#34;Linux/UNIX (Amazon VPC)&#34;`, `&#34;SUSE Linux (Amazon VPC)&#34;`, `&#34;Windows (Amazon VPC)&#34;`.
     * 
     */
    public Output<String> product() {
        return this.product;
    }
    /**
     * The AWS region your group will be created in. Cannot be changed after the group has been created.
     * 
     */
    @Export(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return The AWS region your group will be created in. Cannot be changed after the group has been created.
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    @Export(name="scheduledTasks", type=List.class, parameters={BeanstalkScheduledTask.class})
    private Output</* @Nullable */ List<BeanstalkScheduledTask>> scheduledTasks;

    public Output<Optional<List<BeanstalkScheduledTask>>> scheduledTasks() {
        return Codegen.optional(this.scheduledTasks);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Beanstalk(String name) {
        this(name, BeanstalkArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Beanstalk(String name, BeanstalkArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Beanstalk(String name, BeanstalkArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("spotinst:aws/beanstalk:Beanstalk", name, args == null ? BeanstalkArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Beanstalk(String name, Output<String> id, @Nullable BeanstalkState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("spotinst:aws/beanstalk:Beanstalk", name, state, makeResourceOptions(options, id));
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
    public static Beanstalk get(String name, Output<String> id, @Nullable BeanstalkState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Beanstalk(name, id, state, options);
    }
}
