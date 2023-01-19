// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.multai;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.spotinst.Utilities;
import com.pulumi.spotinst.multai.ListenerArgs;
import com.pulumi.spotinst.multai.inputs.ListenerState;
import com.pulumi.spotinst.multai.outputs.ListenerTag;
import com.pulumi.spotinst.multai.outputs.ListenerTlsConfig;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="spotinst:multai/listener:Listener")
public class Listener extends com.pulumi.resources.CustomResource {
    @Export(name="balancerId", type=String.class, parameters={})
    private Output<String> balancerId;

    public Output<String> balancerId() {
        return this.balancerId;
    }
    @Export(name="port", type=Integer.class, parameters={})
    private Output<Integer> port;

    public Output<Integer> port() {
        return this.port;
    }
    @Export(name="protocol", type=String.class, parameters={})
    private Output<String> protocol;

    public Output<String> protocol() {
        return this.protocol;
    }
    @Export(name="tags", type=List.class, parameters={ListenerTag.class})
    private Output</* @Nullable */ List<ListenerTag>> tags;

    public Output<Optional<List<ListenerTag>>> tags() {
        return Codegen.optional(this.tags);
    }
    @Export(name="tlsConfig", type=ListenerTlsConfig.class, parameters={})
    private Output</* @Nullable */ ListenerTlsConfig> tlsConfig;

    public Output<Optional<ListenerTlsConfig>> tlsConfig() {
        return Codegen.optional(this.tlsConfig);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Listener(String name) {
        this(name, ListenerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Listener(String name, ListenerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Listener(String name, ListenerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("spotinst:multai/listener:Listener", name, args == null ? ListenerArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Listener(String name, Output<String> id, @Nullable ListenerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("spotinst:multai/listener:Listener", name, state, makeResourceOptions(options, id));
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
    public static Listener get(String name, Output<String> id, @Nullable ListenerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Listener(name, id, state, options);
    }
}