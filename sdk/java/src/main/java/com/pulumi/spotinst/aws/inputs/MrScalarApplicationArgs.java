// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MrScalarApplicationArgs extends com.pulumi.resources.ResourceArgs {

    public static final MrScalarApplicationArgs Empty = new MrScalarApplicationArgs();

    /**
     * Arguments for EMR to pass to the application.
     * 
     */
    @Import(name="args")
    private @Nullable Output<List<String>> args;

    /**
     * @return Arguments for EMR to pass to the application.
     * 
     */
    public Optional<Output<List<String>>> args() {
        return Optional.ofNullable(this.args);
    }

    /**
     * The MrScaler name.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The MrScaler name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * T he version of the application.
     * 
     */
    @Import(name="version")
    private @Nullable Output<String> version;

    /**
     * @return T he version of the application.
     * 
     */
    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    private MrScalarApplicationArgs() {}

    private MrScalarApplicationArgs(MrScalarApplicationArgs $) {
        this.args = $.args;
        this.name = $.name;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MrScalarApplicationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MrScalarApplicationArgs $;

        public Builder() {
            $ = new MrScalarApplicationArgs();
        }

        public Builder(MrScalarApplicationArgs defaults) {
            $ = new MrScalarApplicationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param args Arguments for EMR to pass to the application.
         * 
         * @return builder
         * 
         */
        public Builder args(@Nullable Output<List<String>> args) {
            $.args = args;
            return this;
        }

        /**
         * @param args Arguments for EMR to pass to the application.
         * 
         * @return builder
         * 
         */
        public Builder args(List<String> args) {
            return args(Output.of(args));
        }

        /**
         * @param args Arguments for EMR to pass to the application.
         * 
         * @return builder
         * 
         */
        public Builder args(String... args) {
            return args(List.of(args));
        }

        /**
         * @param name The MrScaler name.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The MrScaler name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param version T he version of the application.
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version T he version of the application.
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        public MrScalarApplicationArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}