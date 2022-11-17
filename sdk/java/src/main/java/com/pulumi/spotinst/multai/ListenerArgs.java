// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.multai;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.spotinst.multai.inputs.ListenerTagArgs;
import com.pulumi.spotinst.multai.inputs.ListenerTlsConfigArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListenerArgs extends com.pulumi.resources.ResourceArgs {

    public static final ListenerArgs Empty = new ListenerArgs();

    @Import(name="balancerId", required=true)
    private Output<String> balancerId;

    public Output<String> balancerId() {
        return this.balancerId;
    }

    @Import(name="port", required=true)
    private Output<Integer> port;

    public Output<Integer> port() {
        return this.port;
    }

    @Import(name="protocol", required=true)
    private Output<String> protocol;

    public Output<String> protocol() {
        return this.protocol;
    }

    @Import(name="tags")
    private @Nullable Output<List<ListenerTagArgs>> tags;

    public Optional<Output<List<ListenerTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    @Import(name="tlsConfig")
    private @Nullable Output<ListenerTlsConfigArgs> tlsConfig;

    public Optional<Output<ListenerTlsConfigArgs>> tlsConfig() {
        return Optional.ofNullable(this.tlsConfig);
    }

    private ListenerArgs() {}

    private ListenerArgs(ListenerArgs $) {
        this.balancerId = $.balancerId;
        this.port = $.port;
        this.protocol = $.protocol;
        this.tags = $.tags;
        this.tlsConfig = $.tlsConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListenerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListenerArgs $;

        public Builder() {
            $ = new ListenerArgs();
        }

        public Builder(ListenerArgs defaults) {
            $ = new ListenerArgs(Objects.requireNonNull(defaults));
        }

        public Builder balancerId(Output<String> balancerId) {
            $.balancerId = balancerId;
            return this;
        }

        public Builder balancerId(String balancerId) {
            return balancerId(Output.of(balancerId));
        }

        public Builder port(Output<Integer> port) {
            $.port = port;
            return this;
        }

        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        public Builder protocol(Output<String> protocol) {
            $.protocol = protocol;
            return this;
        }

        public Builder protocol(String protocol) {
            return protocol(Output.of(protocol));
        }

        public Builder tags(@Nullable Output<List<ListenerTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(List<ListenerTagArgs> tags) {
            return tags(Output.of(tags));
        }

        public Builder tags(ListenerTagArgs... tags) {
            return tags(List.of(tags));
        }

        public Builder tlsConfig(@Nullable Output<ListenerTlsConfigArgs> tlsConfig) {
            $.tlsConfig = tlsConfig;
            return this;
        }

        public Builder tlsConfig(ListenerTlsConfigArgs tlsConfig) {
            return tlsConfig(Output.of(tlsConfig));
        }

        public ListenerArgs build() {
            $.balancerId = Objects.requireNonNull($.balancerId, "expected parameter 'balancerId' to be non-null");
            $.port = Objects.requireNonNull($.port, "expected parameter 'port' to be non-null");
            $.protocol = Objects.requireNonNull($.protocol, "expected parameter 'protocol' to be non-null");
            return $;
        }
    }

}
