// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.organization;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.spotinst.Utilities;
import com.pulumi.spotinst.organization.PolicyArgs;
import com.pulumi.spotinst.organization.inputs.PolicyState;
import com.pulumi.spotinst.organization.outputs.PolicyPolicyContent;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Spotinst access policy.
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
 * import com.pulumi.spotinst.organization.Policy;
 * import com.pulumi.spotinst.organization.PolicyArgs;
 * import com.pulumi.spotinst.organization.inputs.PolicyPolicyContentArgs;
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
 *         var terraformPolicy = new Policy(&#34;terraformPolicy&#34;, PolicyArgs.builder()        
 *             .description(&#34;policy by terraform&#34;)
 *             .policyContents(PolicyPolicyContentArgs.builder()
 *                 .statements(                
 *                     PolicyPolicyContentStatementArgs.builder()
 *                         .actions(&#34;ocean:deleteCluster&#34;)
 *                         .effect(&#34;DENY&#34;)
 *                         .resources(                        
 *                             &#34;o-abcd1234&#34;,
 *                             &#34;o-defg6789&#34;)
 *                         .build(),
 *                     PolicyPolicyContentStatementArgs.builder()
 *                         .actions(&#34;ocean:createCluster&#34;)
 *                         .effect(&#34;DENY&#34;)
 *                         .resources(                        
 *                             &#34;o-fhau4752&#34;,
 *                             &#34;o-761owf4r3&#34;)
 *                         .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="spotinst:organization/policy:Policy")
public class Policy extends com.pulumi.resources.CustomResource {
    /**
     * Short description of policy.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Short description of policy.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Name of the Policy.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the Policy.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Set permissions objects list.
     * 
     */
    @Export(name="policyContents", refs={List.class,PolicyPolicyContent.class}, tree="[0,1]")
    private Output<List<PolicyPolicyContent>> policyContents;

    /**
     * @return Set permissions objects list.
     * 
     */
    public Output<List<PolicyPolicyContent>> policyContents() {
        return this.policyContents;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Policy(String name) {
        this(name, PolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Policy(String name, PolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Policy(String name, PolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("spotinst:organization/policy:Policy", name, args == null ? PolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Policy(String name, Output<String> id, @Nullable PolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("spotinst:organization/policy:Policy", name, state, makeResourceOptions(options, id));
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
    public static Policy get(String name, Output<String> id, @Nullable PolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Policy(name, id, state, options);
    }
}
