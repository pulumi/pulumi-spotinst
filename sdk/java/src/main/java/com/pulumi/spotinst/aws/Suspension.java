// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.spotinst.Utilities;
import com.pulumi.spotinst.aws.SuspensionArgs;
import com.pulumi.spotinst.aws.inputs.SuspensionState;
import com.pulumi.spotinst.aws.outputs.SuspensionSuspension;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
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
 * import com.pulumi.spotinst.aws.Suspension;
 * import com.pulumi.spotinst.aws.SuspensionArgs;
 * import com.pulumi.spotinst.aws.inputs.SuspensionSuspensionArgs;
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
 *         // Create a suspension for Elastigroup
 *         var resourceName = new Suspension("resourceName", SuspensionArgs.builder()
 *             .groupId("sig-12345678")
 *             .suspensions(            
 *                 SuspensionSuspensionArgs.builder()
 *                     .name("OUT_OF_STRATEGY")
 *                     .build(),
 *                 SuspensionSuspensionArgs.builder()
 *                     .name("REVERT_PREFERRED")
 *                     .build(),
 *                 SuspensionSuspensionArgs.builder()
 *                     .name("PREVENTIVE_REPLACEMENT")
 *                     .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="spotinst:aws/suspension:Suspension")
public class Suspension extends com.pulumi.resources.CustomResource {
    /**
     * Elastigroup ID to apply the suspensions on.
     * 
     */
    @Export(name="groupId", refs={String.class}, tree="[0]")
    private Output<String> groupId;

    /**
     * @return Elastigroup ID to apply the suspensions on.
     * 
     */
    public Output<String> groupId() {
        return this.groupId;
    }
    /**
     * block of single process to suspend.
     * 
     */
    @Export(name="suspensions", refs={List.class,SuspensionSuspension.class}, tree="[0,1]")
    private Output<List<SuspensionSuspension>> suspensions;

    /**
     * @return block of single process to suspend.
     * 
     */
    public Output<List<SuspensionSuspension>> suspensions() {
        return this.suspensions;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Suspension(java.lang.String name) {
        this(name, SuspensionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Suspension(java.lang.String name, SuspensionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Suspension(java.lang.String name, SuspensionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("spotinst:aws/suspension:Suspension", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Suspension(java.lang.String name, Output<java.lang.String> id, @Nullable SuspensionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("spotinst:aws/suspension:Suspension", name, state, makeResourceOptions(options, id), false);
    }

    private static SuspensionArgs makeArgs(SuspensionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? SuspensionArgs.Empty : args;
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
    public static Suspension get(java.lang.String name, Output<java.lang.String> id, @Nullable SuspensionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Suspension(name, id, state, options);
    }
}
