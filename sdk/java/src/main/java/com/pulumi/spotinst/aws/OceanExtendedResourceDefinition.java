// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.spotinst.Utilities;
import com.pulumi.spotinst.aws.OceanExtendedResourceDefinitionArgs;
import com.pulumi.spotinst.aws.inputs.OceanExtendedResourceDefinitionState;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a Spotinst Ocean AWS Extended Resource Definition resource.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.spotinst.aws.OceanExtendedResourceDefinition;
 * import com.pulumi.spotinst.aws.OceanExtendedResourceDefinitionArgs;
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
 *         var example = new OceanExtendedResourceDefinition(&#34;example&#34;, OceanExtendedResourceDefinitionArgs.builder()        
 *             .resourceMapping(Map.ofEntries(
 *                 Map.entry(&#34;c3.large&#34;, &#34;2Ki&#34;),
 *                 Map.entry(&#34;c3.xlarge&#34;, &#34;4Ki&#34;)
 *             ))
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="spotinst:aws/oceanExtendedResourceDefinition:OceanExtendedResourceDefinition")
public class OceanExtendedResourceDefinition extends com.pulumi.resources.CustomResource {
    /**
     * The extended resource name as should be requested by your pods and registered to the nodes. Cannot be updated.
     * The name should be a valid Kubernetes extended resource name.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The extended resource name as should be requested by your pods and registered to the nodes. Cannot be updated.
     * The name should be a valid Kubernetes extended resource name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A mapping between AWS instanceType or * as default and its value for the given extended resource.
     * 
     */
    @Export(name="resourceMapping", refs={Map.class,String.class,Object.class}, tree="[0,1,2]")
    private Output<Map<String,Object>> resourceMapping;

    /**
     * @return A mapping between AWS instanceType or * as default and its value for the given extended resource.
     * 
     */
    public Output<Map<String,Object>> resourceMapping() {
        return this.resourceMapping;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public OceanExtendedResourceDefinition(String name) {
        this(name, OceanExtendedResourceDefinitionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public OceanExtendedResourceDefinition(String name, OceanExtendedResourceDefinitionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public OceanExtendedResourceDefinition(String name, OceanExtendedResourceDefinitionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("spotinst:aws/oceanExtendedResourceDefinition:OceanExtendedResourceDefinition", name, args == null ? OceanExtendedResourceDefinitionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private OceanExtendedResourceDefinition(String name, Output<String> id, @Nullable OceanExtendedResourceDefinitionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("spotinst:aws/oceanExtendedResourceDefinition:OceanExtendedResourceDefinition", name, state, makeResourceOptions(options, id));
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
    public static OceanExtendedResourceDefinition get(String name, Output<String> id, @Nullable OceanExtendedResourceDefinitionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new OceanExtendedResourceDefinition(name, id, state, options);
    }
}
