// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.organization;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.spotinst.Utilities;
import com.pulumi.spotinst.organization.ProgrammaticUserArgs;
import com.pulumi.spotinst.organization.inputs.ProgrammaticUserState;
import com.pulumi.spotinst.organization.outputs.ProgrammaticUserAccount;
import com.pulumi.spotinst.organization.outputs.ProgrammaticUserPolicy;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Spotinst programmatic user in the creator&#39;s organization.
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
 * import com.pulumi.spotinst.organization.ProgrammaticUser;
 * import com.pulumi.spotinst.organization.ProgrammaticUserArgs;
 * import com.pulumi.spotinst.organization.inputs.ProgrammaticUserPolicyArgs;
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
 *         var terraformProgUser = new ProgrammaticUser("terraformProgUser", ProgrammaticUserArgs.builder()
 *             .name("test-prog-user")
 *             .description("creating programmatic user")
 *             .policies(ProgrammaticUserPolicyArgs.builder()
 *                 .policyId("pol-g75d8c06")
 *                 .policyAccountIds("act-a1b2c3d4")
 *                 .build())
 *             .userGroupIds(            
 *                 "ugr-abcd1234",
 *                 "ugr-defg8763")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="spotinst:organization/programmaticUser:ProgrammaticUser")
public class ProgrammaticUser extends com.pulumi.resources.CustomResource {
    /**
     * All the accounts the programmatic user will have access to.
     * If used - Cannot be empty.
     * 
     */
    @Export(name="accounts", refs={List.class,ProgrammaticUserAccount.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ProgrammaticUserAccount>> accounts;

    /**
     * @return All the accounts the programmatic user will have access to.
     * If used - Cannot be empty.
     * 
     */
    public Output<Optional<List<ProgrammaticUserAccount>>> accounts() {
        return Codegen.optional(this.accounts);
    }
    /**
     * Brief description of the user.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Brief description of the user.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Name of the programmatic user.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the programmatic user.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * All the policies the programmatic user will have access to.
     * If used - Cannot be empty.
     * 
     */
    @Export(name="policies", refs={List.class,ProgrammaticUserPolicy.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ProgrammaticUserPolicy>> policies;

    /**
     * @return All the policies the programmatic user will have access to.
     * If used - Cannot be empty.
     * 
     */
    public Output<Optional<List<ProgrammaticUserPolicy>>> policies() {
        return Codegen.optional(this.policies);
    }
    /**
     * A list of the user groups to register the given user to (should be existing user groups only)
     * 
     */
    @Export(name="userGroupIds", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> userGroupIds;

    /**
     * @return A list of the user groups to register the given user to (should be existing user groups only)
     * 
     */
    public Output<Optional<List<String>>> userGroupIds() {
        return Codegen.optional(this.userGroupIds);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ProgrammaticUser(java.lang.String name) {
        this(name, ProgrammaticUserArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ProgrammaticUser(java.lang.String name, @Nullable ProgrammaticUserArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ProgrammaticUser(java.lang.String name, @Nullable ProgrammaticUserArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("spotinst:organization/programmaticUser:ProgrammaticUser", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ProgrammaticUser(java.lang.String name, Output<java.lang.String> id, @Nullable ProgrammaticUserState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("spotinst:organization/programmaticUser:ProgrammaticUser", name, state, makeResourceOptions(options, id), false);
    }

    private static ProgrammaticUserArgs makeArgs(@Nullable ProgrammaticUserArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ProgrammaticUserArgs.Empty : args;
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
    public static ProgrammaticUser get(java.lang.String name, Output<java.lang.String> id, @Nullable ProgrammaticUserState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ProgrammaticUser(name, id, state, options);
    }
}
