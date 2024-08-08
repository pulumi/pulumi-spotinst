// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.gke;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.spotinst.Utilities;
import com.pulumi.spotinst.gke.OceanLaunchSpecImportArgs;
import com.pulumi.spotinst.gke.inputs.OceanLaunchSpecImportState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages a custom Spotinst Ocean GKE Launch Spec Import resource.
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
 * import com.pulumi.spotinst.gke.OceanLaunchSpecImport;
 * import com.pulumi.spotinst.gke.OceanLaunchSpecImportArgs;
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
 *         var example = new OceanLaunchSpecImport("example", OceanLaunchSpecImportArgs.builder()
 *             .oceanId("o-123456")
 *             .nodePoolName("default-pool")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="spotinst:gke/oceanLaunchSpecImport:OceanLaunchSpecImport")
public class OceanLaunchSpecImport extends com.pulumi.resources.CustomResource {
    /**
     * The node pool you wish to use in your launchSpec.
     * 
     */
    @Export(name="nodePoolName", refs={String.class}, tree="[0]")
    private Output<String> nodePoolName;

    /**
     * @return The node pool you wish to use in your launchSpec.
     * 
     */
    public Output<String> nodePoolName() {
        return this.nodePoolName;
    }
    /**
     * The Ocean cluster ID required for launchSpec create.
     * 
     */
    @Export(name="oceanId", refs={String.class}, tree="[0]")
    private Output<String> oceanId;

    /**
     * @return The Ocean cluster ID required for launchSpec create.
     * 
     */
    public Output<String> oceanId() {
        return this.oceanId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public OceanLaunchSpecImport(java.lang.String name) {
        this(name, OceanLaunchSpecImportArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public OceanLaunchSpecImport(java.lang.String name, OceanLaunchSpecImportArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public OceanLaunchSpecImport(java.lang.String name, OceanLaunchSpecImportArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("spotinst:gke/oceanLaunchSpecImport:OceanLaunchSpecImport", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private OceanLaunchSpecImport(java.lang.String name, Output<java.lang.String> id, @Nullable OceanLaunchSpecImportState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("spotinst:gke/oceanLaunchSpecImport:OceanLaunchSpecImport", name, state, makeResourceOptions(options, id), false);
    }

    private static OceanLaunchSpecImportArgs makeArgs(OceanLaunchSpecImportArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? OceanLaunchSpecImportArgs.Empty : args;
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
    public static OceanLaunchSpecImport get(java.lang.String name, Output<java.lang.String> id, @Nullable OceanLaunchSpecImportState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new OceanLaunchSpecImport(name, id, state, options);
    }
}
