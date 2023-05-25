// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ElastigroupStatefulDeallocationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ElastigroupStatefulDeallocationArgs Empty = new ElastigroupStatefulDeallocationArgs();

    /**
     * For stateful groups: remove persistent images.
     * 
     */
    @Import(name="shouldDeleteImages")
    private @Nullable Output<Boolean> shouldDeleteImages;

    /**
     * @return For stateful groups: remove persistent images.
     * 
     */
    public Optional<Output<Boolean>> shouldDeleteImages() {
        return Optional.ofNullable(this.shouldDeleteImages);
    }

    /**
     * For stateful groups: remove network interfaces.
     * 
     */
    @Import(name="shouldDeleteNetworkInterfaces")
    private @Nullable Output<Boolean> shouldDeleteNetworkInterfaces;

    /**
     * @return For stateful groups: remove network interfaces.
     * 
     */
    public Optional<Output<Boolean>> shouldDeleteNetworkInterfaces() {
        return Optional.ofNullable(this.shouldDeleteNetworkInterfaces);
    }

    /**
     * For stateful groups: remove snapshots.
     * 
     * Usage:
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
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
     *     }
     * }
     * ```
     * 
     */
    @Import(name="shouldDeleteSnapshots")
    private @Nullable Output<Boolean> shouldDeleteSnapshots;

    /**
     * @return For stateful groups: remove snapshots.
     * 
     * Usage:
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
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
     *     }
     * }
     * ```
     * 
     */
    public Optional<Output<Boolean>> shouldDeleteSnapshots() {
        return Optional.ofNullable(this.shouldDeleteSnapshots);
    }

    /**
     * For stateful groups: remove persistent volumes.
     * 
     */
    @Import(name="shouldDeleteVolumes")
    private @Nullable Output<Boolean> shouldDeleteVolumes;

    /**
     * @return For stateful groups: remove persistent volumes.
     * 
     */
    public Optional<Output<Boolean>> shouldDeleteVolumes() {
        return Optional.ofNullable(this.shouldDeleteVolumes);
    }

    private ElastigroupStatefulDeallocationArgs() {}

    private ElastigroupStatefulDeallocationArgs(ElastigroupStatefulDeallocationArgs $) {
        this.shouldDeleteImages = $.shouldDeleteImages;
        this.shouldDeleteNetworkInterfaces = $.shouldDeleteNetworkInterfaces;
        this.shouldDeleteSnapshots = $.shouldDeleteSnapshots;
        this.shouldDeleteVolumes = $.shouldDeleteVolumes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ElastigroupStatefulDeallocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ElastigroupStatefulDeallocationArgs $;

        public Builder() {
            $ = new ElastigroupStatefulDeallocationArgs();
        }

        public Builder(ElastigroupStatefulDeallocationArgs defaults) {
            $ = new ElastigroupStatefulDeallocationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param shouldDeleteImages For stateful groups: remove persistent images.
         * 
         * @return builder
         * 
         */
        public Builder shouldDeleteImages(@Nullable Output<Boolean> shouldDeleteImages) {
            $.shouldDeleteImages = shouldDeleteImages;
            return this;
        }

        /**
         * @param shouldDeleteImages For stateful groups: remove persistent images.
         * 
         * @return builder
         * 
         */
        public Builder shouldDeleteImages(Boolean shouldDeleteImages) {
            return shouldDeleteImages(Output.of(shouldDeleteImages));
        }

        /**
         * @param shouldDeleteNetworkInterfaces For stateful groups: remove network interfaces.
         * 
         * @return builder
         * 
         */
        public Builder shouldDeleteNetworkInterfaces(@Nullable Output<Boolean> shouldDeleteNetworkInterfaces) {
            $.shouldDeleteNetworkInterfaces = shouldDeleteNetworkInterfaces;
            return this;
        }

        /**
         * @param shouldDeleteNetworkInterfaces For stateful groups: remove network interfaces.
         * 
         * @return builder
         * 
         */
        public Builder shouldDeleteNetworkInterfaces(Boolean shouldDeleteNetworkInterfaces) {
            return shouldDeleteNetworkInterfaces(Output.of(shouldDeleteNetworkInterfaces));
        }

        /**
         * @param shouldDeleteSnapshots For stateful groups: remove snapshots.
         * 
         * Usage:
         * ```java
         * package generated_program;
         * 
         * import com.pulumi.Context;
         * import com.pulumi.Pulumi;
         * import com.pulumi.core.Output;
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
         *     }
         * }
         * ```
         * 
         * @return builder
         * 
         */
        public Builder shouldDeleteSnapshots(@Nullable Output<Boolean> shouldDeleteSnapshots) {
            $.shouldDeleteSnapshots = shouldDeleteSnapshots;
            return this;
        }

        /**
         * @param shouldDeleteSnapshots For stateful groups: remove snapshots.
         * 
         * Usage:
         * ```java
         * package generated_program;
         * 
         * import com.pulumi.Context;
         * import com.pulumi.Pulumi;
         * import com.pulumi.core.Output;
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
         *     }
         * }
         * ```
         * 
         * @return builder
         * 
         */
        public Builder shouldDeleteSnapshots(Boolean shouldDeleteSnapshots) {
            return shouldDeleteSnapshots(Output.of(shouldDeleteSnapshots));
        }

        /**
         * @param shouldDeleteVolumes For stateful groups: remove persistent volumes.
         * 
         * @return builder
         * 
         */
        public Builder shouldDeleteVolumes(@Nullable Output<Boolean> shouldDeleteVolumes) {
            $.shouldDeleteVolumes = shouldDeleteVolumes;
            return this;
        }

        /**
         * @param shouldDeleteVolumes For stateful groups: remove persistent volumes.
         * 
         * @return builder
         * 
         */
        public Builder shouldDeleteVolumes(Boolean shouldDeleteVolumes) {
            return shouldDeleteVolumes(Output.of(shouldDeleteVolumes));
        }

        public ElastigroupStatefulDeallocationArgs build() {
            return $;
        }
    }

}
