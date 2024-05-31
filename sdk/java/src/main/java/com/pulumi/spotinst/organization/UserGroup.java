// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.organization;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.spotinst.Utilities;
import com.pulumi.spotinst.organization.UserGroupArgs;
import com.pulumi.spotinst.organization.inputs.UserGroupState;
import com.pulumi.spotinst.organization.outputs.UserGroupPolicy;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Spotinst user-group of your Spot organization.
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
 * import com.pulumi.spotinst.organization.UserGroup;
 * import com.pulumi.spotinst.organization.UserGroupArgs;
 * import com.pulumi.spotinst.organization.inputs.UserGroupPolicyArgs;
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
 *         var terraformUserGroup = new UserGroup("terraformUserGroup", UserGroupArgs.builder()
 *             .name("test_user_group")
 *             .description("user group by terraform")
 *             .userIds("u-372gf6ae")
 *             .policies(UserGroupPolicyArgs.builder()
 *                 .accountIds("act-a1b2c3d4")
 *                 .policyId("pol-vv7d8c06")
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="spotinst:organization/userGroup:UserGroup")
public class UserGroup extends com.pulumi.resources.CustomResource {
    /**
     * User group description.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return User group description.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * User group name.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return User group name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The policies to register under the given group
     * (should be existing policies only).
     * 
     */
    @Export(name="policies", refs={List.class,UserGroupPolicy.class}, tree="[0,1]")
    private Output</* @Nullable */ List<UserGroupPolicy>> policies;

    /**
     * @return The policies to register under the given group
     * (should be existing policies only).
     * 
     */
    public Output<Optional<List<UserGroupPolicy>>> policies() {
        return Codegen.optional(this.policies);
    }
    /**
     * The users to register under the created group
     * (should be existing users only).
     * 
     */
    @Export(name="userIds", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> userIds;

    /**
     * @return The users to register under the created group
     * (should be existing users only).
     * 
     */
    public Output<Optional<List<String>>> userIds() {
        return Codegen.optional(this.userIds);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public UserGroup(String name) {
        this(name, UserGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public UserGroup(String name, @Nullable UserGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public UserGroup(String name, @Nullable UserGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("spotinst:organization/userGroup:UserGroup", name, args == null ? UserGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private UserGroup(String name, Output<String> id, @Nullable UserGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("spotinst:organization/userGroup:UserGroup", name, state, makeResourceOptions(options, id));
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
    public static UserGroup get(String name, Output<String> id, @Nullable UserGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new UserGroup(name, id, state, options);
    }
}