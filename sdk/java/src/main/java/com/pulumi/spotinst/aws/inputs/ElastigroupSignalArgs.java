// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ElastigroupSignalArgs extends com.pulumi.resources.ResourceArgs {

    public static final ElastigroupSignalArgs Empty = new ElastigroupSignalArgs();

    /**
     * The name of the signal defined for the group. Valid Values: `&#34;INSTANCE_READY&#34;`, `&#34;INSTANCE_READY_TO_SHUTDOWN&#34;`
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the signal defined for the group. Valid Values: `&#34;INSTANCE_READY&#34;`, `&#34;INSTANCE_READY_TO_SHUTDOWN&#34;`
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The signals defined timeout- default is 40 minutes (1800 seconds).
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
    @Import(name="timeout")
    private @Nullable Output<Integer> timeout;

    /**
     * @return The signals defined timeout- default is 40 minutes (1800 seconds).
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
    public Optional<Output<Integer>> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    private ElastigroupSignalArgs() {}

    private ElastigroupSignalArgs(ElastigroupSignalArgs $) {
        this.name = $.name;
        this.timeout = $.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ElastigroupSignalArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ElastigroupSignalArgs $;

        public Builder() {
            $ = new ElastigroupSignalArgs();
        }

        public Builder(ElastigroupSignalArgs defaults) {
            $ = new ElastigroupSignalArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the signal defined for the group. Valid Values: `&#34;INSTANCE_READY&#34;`, `&#34;INSTANCE_READY_TO_SHUTDOWN&#34;`
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the signal defined for the group. Valid Values: `&#34;INSTANCE_READY&#34;`, `&#34;INSTANCE_READY_TO_SHUTDOWN&#34;`
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param timeout The signals defined timeout- default is 40 minutes (1800 seconds).
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
        public Builder timeout(@Nullable Output<Integer> timeout) {
            $.timeout = timeout;
            return this;
        }

        /**
         * @param timeout The signals defined timeout- default is 40 minutes (1800 seconds).
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
        public Builder timeout(Integer timeout) {
            return timeout(Output.of(timeout));
        }

        public ElastigroupSignalArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
