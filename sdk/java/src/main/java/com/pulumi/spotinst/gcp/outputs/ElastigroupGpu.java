// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.gcp.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ElastigroupGpu {
    /**
     * @return The number of GPUs. Must be 0, 2, 4, 6, 8.
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
    private Integer count;
    /**
     * @return The type of GPU instance. Valid values: `nvidia-tesla-v100`, `nvidia-tesla-p100`, `nvidia-tesla-k80`.
     * 
     */
    private String type;

    private ElastigroupGpu() {}
    /**
     * @return The number of GPUs. Must be 0, 2, 4, 6, 8.
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
    public Integer count() {
        return this.count;
    }
    /**
     * @return The type of GPU instance. Valid values: `nvidia-tesla-v100`, `nvidia-tesla-p100`, `nvidia-tesla-k80`.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ElastigroupGpu defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer count;
        private String type;
        public Builder() {}
        public Builder(ElastigroupGpu defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder count(Integer count) {
            if (count == null) {
              throw new MissingRequiredPropertyException("ElastigroupGpu", "count");
            }
            this.count = count;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("ElastigroupGpu", "type");
            }
            this.type = type;
            return this;
        }
        public ElastigroupGpu build() {
            final var _resultValue = new ElastigroupGpu();
            _resultValue.count = count;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
