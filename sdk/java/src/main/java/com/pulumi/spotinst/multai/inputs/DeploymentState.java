// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.multai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeploymentState extends com.pulumi.resources.ResourceArgs {

    public static final DeploymentState Empty = new DeploymentState();

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private DeploymentState() {}

    private DeploymentState(DeploymentState $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeploymentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeploymentState $;

        public Builder() {
            $ = new DeploymentState();
        }

        public Builder(DeploymentState defaults) {
            $ = new DeploymentState(Objects.requireNonNull(defaults));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public DeploymentState build() {
            return $;
        }
    }

}