// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.gke.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OceanImportAutoscalerResourceLimitsArgs extends com.pulumi.resources.ResourceArgs {

    public static final OceanImportAutoscalerResourceLimitsArgs Empty = new OceanImportAutoscalerResourceLimitsArgs();

    /**
     * The maximum memory in GiB units that can be allocated to the cluster.
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
     * &lt;a id=&#34;strategy&#34;&gt;&lt;/a&gt;
     * 
     */
    @Import(name="maxMemoryGib")
    private @Nullable Output<Integer> maxMemoryGib;

    /**
     * @return The maximum memory in GiB units that can be allocated to the cluster.
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
     * &lt;a id=&#34;strategy&#34;&gt;&lt;/a&gt;
     * 
     */
    public Optional<Output<Integer>> maxMemoryGib() {
        return Optional.ofNullable(this.maxMemoryGib);
    }

    /**
     * The maximum cpu in vCpu units that can be allocated to the cluster.
     * 
     */
    @Import(name="maxVcpu")
    private @Nullable Output<Integer> maxVcpu;

    /**
     * @return The maximum cpu in vCpu units that can be allocated to the cluster.
     * 
     */
    public Optional<Output<Integer>> maxVcpu() {
        return Optional.ofNullable(this.maxVcpu);
    }

    private OceanImportAutoscalerResourceLimitsArgs() {}

    private OceanImportAutoscalerResourceLimitsArgs(OceanImportAutoscalerResourceLimitsArgs $) {
        this.maxMemoryGib = $.maxMemoryGib;
        this.maxVcpu = $.maxVcpu;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OceanImportAutoscalerResourceLimitsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OceanImportAutoscalerResourceLimitsArgs $;

        public Builder() {
            $ = new OceanImportAutoscalerResourceLimitsArgs();
        }

        public Builder(OceanImportAutoscalerResourceLimitsArgs defaults) {
            $ = new OceanImportAutoscalerResourceLimitsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param maxMemoryGib The maximum memory in GiB units that can be allocated to the cluster.
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
         * &lt;a id=&#34;strategy&#34;&gt;&lt;/a&gt;
         * 
         * @return builder
         * 
         */
        public Builder maxMemoryGib(@Nullable Output<Integer> maxMemoryGib) {
            $.maxMemoryGib = maxMemoryGib;
            return this;
        }

        /**
         * @param maxMemoryGib The maximum memory in GiB units that can be allocated to the cluster.
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
         * &lt;a id=&#34;strategy&#34;&gt;&lt;/a&gt;
         * 
         * @return builder
         * 
         */
        public Builder maxMemoryGib(Integer maxMemoryGib) {
            return maxMemoryGib(Output.of(maxMemoryGib));
        }

        /**
         * @param maxVcpu The maximum cpu in vCpu units that can be allocated to the cluster.
         * 
         * @return builder
         * 
         */
        public Builder maxVcpu(@Nullable Output<Integer> maxVcpu) {
            $.maxVcpu = maxVcpu;
            return this;
        }

        /**
         * @param maxVcpu The maximum cpu in vCpu units that can be allocated to the cluster.
         * 
         * @return builder
         * 
         */
        public Builder maxVcpu(Integer maxVcpu) {
            return maxVcpu(Output.of(maxVcpu));
        }

        public OceanImportAutoscalerResourceLimitsArgs build() {
            return $;
        }
    }

}
