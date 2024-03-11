// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ElastigroupStatefulDeallocation {
    /**
     * @return For stateful groups: remove persistent images.
     * 
     */
    private @Nullable Boolean shouldDeleteImages;
    /**
     * @return For stateful groups: remove network interfaces.
     * 
     */
    private @Nullable Boolean shouldDeleteNetworkInterfaces;
    /**
     * @return For stateful groups: remove snapshots.
     * 
     * Usage:
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
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
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    private @Nullable Boolean shouldDeleteSnapshots;
    /**
     * @return For stateful groups: remove persistent volumes.
     * 
     */
    private @Nullable Boolean shouldDeleteVolumes;

    private ElastigroupStatefulDeallocation() {}
    /**
     * @return For stateful groups: remove persistent images.
     * 
     */
    public Optional<Boolean> shouldDeleteImages() {
        return Optional.ofNullable(this.shouldDeleteImages);
    }
    /**
     * @return For stateful groups: remove network interfaces.
     * 
     */
    public Optional<Boolean> shouldDeleteNetworkInterfaces() {
        return Optional.ofNullable(this.shouldDeleteNetworkInterfaces);
    }
    /**
     * @return For stateful groups: remove snapshots.
     * 
     * Usage:
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
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
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public Optional<Boolean> shouldDeleteSnapshots() {
        return Optional.ofNullable(this.shouldDeleteSnapshots);
    }
    /**
     * @return For stateful groups: remove persistent volumes.
     * 
     */
    public Optional<Boolean> shouldDeleteVolumes() {
        return Optional.ofNullable(this.shouldDeleteVolumes);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ElastigroupStatefulDeallocation defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean shouldDeleteImages;
        private @Nullable Boolean shouldDeleteNetworkInterfaces;
        private @Nullable Boolean shouldDeleteSnapshots;
        private @Nullable Boolean shouldDeleteVolumes;
        public Builder() {}
        public Builder(ElastigroupStatefulDeallocation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.shouldDeleteImages = defaults.shouldDeleteImages;
    	      this.shouldDeleteNetworkInterfaces = defaults.shouldDeleteNetworkInterfaces;
    	      this.shouldDeleteSnapshots = defaults.shouldDeleteSnapshots;
    	      this.shouldDeleteVolumes = defaults.shouldDeleteVolumes;
        }

        @CustomType.Setter
        public Builder shouldDeleteImages(@Nullable Boolean shouldDeleteImages) {

            this.shouldDeleteImages = shouldDeleteImages;
            return this;
        }
        @CustomType.Setter
        public Builder shouldDeleteNetworkInterfaces(@Nullable Boolean shouldDeleteNetworkInterfaces) {

            this.shouldDeleteNetworkInterfaces = shouldDeleteNetworkInterfaces;
            return this;
        }
        @CustomType.Setter
        public Builder shouldDeleteSnapshots(@Nullable Boolean shouldDeleteSnapshots) {

            this.shouldDeleteSnapshots = shouldDeleteSnapshots;
            return this;
        }
        @CustomType.Setter
        public Builder shouldDeleteVolumes(@Nullable Boolean shouldDeleteVolumes) {

            this.shouldDeleteVolumes = shouldDeleteVolumes;
            return this;
        }
        public ElastigroupStatefulDeallocation build() {
            final var _resultValue = new ElastigroupStatefulDeallocation();
            _resultValue.shouldDeleteImages = shouldDeleteImages;
            _resultValue.shouldDeleteNetworkInterfaces = shouldDeleteNetworkInterfaces;
            _resultValue.shouldDeleteSnapshots = shouldDeleteSnapshots;
            _resultValue.shouldDeleteVolumes = shouldDeleteVolumes;
            return _resultValue;
        }
    }
}
