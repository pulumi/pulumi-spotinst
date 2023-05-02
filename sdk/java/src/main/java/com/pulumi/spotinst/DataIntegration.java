// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.spotinst.DataIntegrationArgs;
import com.pulumi.spotinst.Utilities;
import com.pulumi.spotinst.inputs.DataIntegrationState;
import com.pulumi.spotinst.outputs.DataIntegrationS3;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Spotinst Data Integration resource.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.spotinst.DataIntegration;
 * import com.pulumi.spotinst.DataIntegrationArgs;
 * import com.pulumi.spotinst.inputs.DataIntegrationS3Args;
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
 *         var example = new DataIntegration(&#34;example&#34;, DataIntegrationArgs.builder()        
 *             .name(&#34;foo&#34;)
 *             .s3(DataIntegrationS3Args.builder()
 *                 .bucketName(&#34;terraform-test-do-not-delete&#34;)
 *                 .subdir(&#34;terraform-test-data-integration&#34;)
 *                 .build())
 *             .status(&#34;enabled&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 */
@ResourceType(type="spotinst:index/dataIntegration:DataIntegration")
public class DataIntegration extends com.pulumi.resources.CustomResource {
    /**
     * The name of the data integration.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the data integration.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * When vendor value is s3, the following fields are included:
     * 
     */
    @Export(name="s3", type=DataIntegrationS3.class, parameters={})
    private Output</* @Nullable */ DataIntegrationS3> s3;

    /**
     * @return When vendor value is s3, the following fields are included:
     * 
     */
    public Output<Optional<DataIntegrationS3>> s3() {
        return Codegen.optional(this.s3);
    }
    /**
     * Determines if this data integration is on or off. Valid values: `&#34;enabled&#34;`, `&#34;disabled&#34;`
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output</* @Nullable */ String> status;

    /**
     * @return Determines if this data integration is on or off. Valid values: `&#34;enabled&#34;`, `&#34;disabled&#34;`
     * 
     */
    public Output<Optional<String>> status() {
        return Codegen.optional(this.status);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DataIntegration(String name) {
        this(name, DataIntegrationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DataIntegration(String name, DataIntegrationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DataIntegration(String name, DataIntegrationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("spotinst:index/dataIntegration:DataIntegration", name, args == null ? DataIntegrationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DataIntegration(String name, Output<String> id, @Nullable DataIntegrationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("spotinst:index/dataIntegration:DataIntegration", name, state, makeResourceOptions(options, id));
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
    public static DataIntegration get(String name, Output<String> id, @Nullable DataIntegrationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DataIntegration(name, id, state, options);
    }
}
