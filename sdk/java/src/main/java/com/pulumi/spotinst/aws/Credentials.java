// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.spotinst.Utilities;
import com.pulumi.spotinst.aws.CredentialsArgs;
import com.pulumi.spotinst.aws.inputs.CredentialsState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a Spotinst credential AWS resource.
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
 * import com.pulumi.spotinst.aws.Credentials;
 * import com.pulumi.spotinst.aws.CredentialsArgs;
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
 *         // set credential AWS
 *         var credential = new Credentials("credential", CredentialsArgs.builder()
 *             .iamrole("arn:aws:iam::1234567890:role/Spot_Iam_Role")
 *             .accountId("act-123456")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="spotinst:aws/credentials:Credentials")
public class Credentials extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the account associated with your token.
     * 
     */
    @Export(name="accountId", refs={String.class}, tree="[0]")
    private Output<String> accountId;

    /**
     * @return The ID of the account associated with your token.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }
    /**
     * Provide the IAM Role ARN connected to another AWS account 922761411349 and with the latest Spot Policy - &lt;https://docs.spot.io/administration/api/spot-policy-in-aws&gt;
     * 
     */
    @Export(name="iamrole", refs={String.class}, tree="[0]")
    private Output<String> iamrole;

    /**
     * @return Provide the IAM Role ARN connected to another AWS account 922761411349 and with the latest Spot Policy - &lt;https://docs.spot.io/administration/api/spot-policy-in-aws&gt;
     * 
     */
    public Output<String> iamrole() {
        return this.iamrole;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Credentials(java.lang.String name) {
        this(name, CredentialsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Credentials(java.lang.String name, CredentialsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Credentials(java.lang.String name, CredentialsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("spotinst:aws/credentials:Credentials", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Credentials(java.lang.String name, Output<java.lang.String> id, @Nullable CredentialsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("spotinst:aws/credentials:Credentials", name, state, makeResourceOptions(options, id), false);
    }

    private static CredentialsArgs makeArgs(CredentialsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? CredentialsArgs.Empty : args;
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
    public static Credentials get(java.lang.String name, Output<java.lang.String> id, @Nullable CredentialsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Credentials(name, id, state, options);
    }
}
