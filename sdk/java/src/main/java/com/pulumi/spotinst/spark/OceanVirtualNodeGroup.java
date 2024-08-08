// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.spark;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.spotinst.Utilities;
import com.pulumi.spotinst.spark.OceanVirtualNodeGroupArgs;
import com.pulumi.spotinst.spark.inputs.OceanVirtualNodeGroupState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manage a dedicated Spotinst Ocean Spark Virtual Node Group resource
 * 
 * ## Prerequisites
 * 
 * An existing Ocean cluster and Ocean VNG is required by this resource
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
 * import com.pulumi.spotinst.spark.OceanVirtualNodeGroup;
 * import com.pulumi.spotinst.spark.OceanVirtualNodeGroupArgs;
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
 *         var example = new OceanVirtualNodeGroup("example", OceanVirtualNodeGroupArgs.builder()
 *             .virtualNodeGroupId("vng_id")
 *             .oceanSparkClusterId("cluster_id")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="spotinst:spark/oceanVirtualNodeGroup:OceanVirtualNodeGroup")
public class OceanVirtualNodeGroup extends com.pulumi.resources.CustomResource {
    @Export(name="oceanSparkClusterId", refs={String.class}, tree="[0]")
    private Output<String> oceanSparkClusterId;

    public Output<String> oceanSparkClusterId() {
        return this.oceanSparkClusterId;
    }
    @Export(name="virtualNodeGroupId", refs={String.class}, tree="[0]")
    private Output<String> virtualNodeGroupId;

    public Output<String> virtualNodeGroupId() {
        return this.virtualNodeGroupId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public OceanVirtualNodeGroup(java.lang.String name) {
        this(name, OceanVirtualNodeGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public OceanVirtualNodeGroup(java.lang.String name, OceanVirtualNodeGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public OceanVirtualNodeGroup(java.lang.String name, OceanVirtualNodeGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("spotinst:spark/oceanVirtualNodeGroup:OceanVirtualNodeGroup", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private OceanVirtualNodeGroup(java.lang.String name, Output<java.lang.String> id, @Nullable OceanVirtualNodeGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("spotinst:spark/oceanVirtualNodeGroup:OceanVirtualNodeGroup", name, state, makeResourceOptions(options, id), false);
    }

    private static OceanVirtualNodeGroupArgs makeArgs(OceanVirtualNodeGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? OceanVirtualNodeGroupArgs.Empty : args;
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
    public static OceanVirtualNodeGroup get(java.lang.String name, Output<java.lang.String> id, @Nullable OceanVirtualNodeGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new OceanVirtualNodeGroup(name, id, state, options);
    }
}
