// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ElastigroupSignal {
    /**
     * @return The name of the signal defined for the group. Valid Values: `&#34;INSTANCE_READY&#34;`, `&#34;INSTANCE_READY_TO_SHUTDOWN&#34;`
     * 
     */
    private String name;
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
    private @Nullable Integer timeout;

    private ElastigroupSignal() {}
    /**
     * @return The name of the signal defined for the group. Valid Values: `&#34;INSTANCE_READY&#34;`, `&#34;INSTANCE_READY_TO_SHUTDOWN&#34;`
     * 
     */
    public String name() {
        return this.name;
    }
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
    public Optional<Integer> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ElastigroupSignal defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private @Nullable Integer timeout;
        public Builder() {}
        public Builder(ElastigroupSignal defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.timeout = defaults.timeout;
        }

        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder timeout(@Nullable Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public ElastigroupSignal build() {
            final var o = new ElastigroupSignal();
            o.name = name;
            o.timeout = timeout;
            return o;
        }
    }
}
