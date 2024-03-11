// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.gke.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OceanImportScheduledTaskTaskTaskParametersClusterRollArgs extends com.pulumi.resources.ResourceArgs {

    public static final OceanImportScheduledTaskTaskTaskParametersClusterRollArgs Empty = new OceanImportScheduledTaskTaskTaskParametersClusterRollArgs();

    @Import(name="batchMinHealthyPercentage")
    private @Nullable Output<Integer> batchMinHealthyPercentage;

    public Optional<Output<Integer>> batchMinHealthyPercentage() {
        return Optional.ofNullable(this.batchMinHealthyPercentage);
    }

    /**
     * Value in %!t(MISSING)o set size of batch in roll. Valid values are 0-100
     * Example: 20.
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
    @Import(name="batchSizePercentage")
    private @Nullable Output<Integer> batchSizePercentage;

    /**
     * @return Value in %!t(MISSING)o set size of batch in roll. Valid values are 0-100
     * Example: 20.
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
    public Optional<Output<Integer>> batchSizePercentage() {
        return Optional.ofNullable(this.batchSizePercentage);
    }

    @Import(name="comment")
    private @Nullable Output<String> comment;

    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    @Import(name="respectPdb")
    private @Nullable Output<Boolean> respectPdb;

    public Optional<Output<Boolean>> respectPdb() {
        return Optional.ofNullable(this.respectPdb);
    }

    private OceanImportScheduledTaskTaskTaskParametersClusterRollArgs() {}

    private OceanImportScheduledTaskTaskTaskParametersClusterRollArgs(OceanImportScheduledTaskTaskTaskParametersClusterRollArgs $) {
        this.batchMinHealthyPercentage = $.batchMinHealthyPercentage;
        this.batchSizePercentage = $.batchSizePercentage;
        this.comment = $.comment;
        this.respectPdb = $.respectPdb;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OceanImportScheduledTaskTaskTaskParametersClusterRollArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OceanImportScheduledTaskTaskTaskParametersClusterRollArgs $;

        public Builder() {
            $ = new OceanImportScheduledTaskTaskTaskParametersClusterRollArgs();
        }

        public Builder(OceanImportScheduledTaskTaskTaskParametersClusterRollArgs defaults) {
            $ = new OceanImportScheduledTaskTaskTaskParametersClusterRollArgs(Objects.requireNonNull(defaults));
        }

        public Builder batchMinHealthyPercentage(@Nullable Output<Integer> batchMinHealthyPercentage) {
            $.batchMinHealthyPercentage = batchMinHealthyPercentage;
            return this;
        }

        public Builder batchMinHealthyPercentage(Integer batchMinHealthyPercentage) {
            return batchMinHealthyPercentage(Output.of(batchMinHealthyPercentage));
        }

        /**
         * @param batchSizePercentage Value in %!t(MISSING)o set size of batch in roll. Valid values are 0-100
         * Example: 20.
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
         * @return builder
         * 
         */
        public Builder batchSizePercentage(@Nullable Output<Integer> batchSizePercentage) {
            $.batchSizePercentage = batchSizePercentage;
            return this;
        }

        /**
         * @param batchSizePercentage Value in %!t(MISSING)o set size of batch in roll. Valid values are 0-100
         * Example: 20.
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
         * @return builder
         * 
         */
        public Builder batchSizePercentage(Integer batchSizePercentage) {
            return batchSizePercentage(Output.of(batchSizePercentage));
        }

        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        public Builder respectPdb(@Nullable Output<Boolean> respectPdb) {
            $.respectPdb = respectPdb;
            return this;
        }

        public Builder respectPdb(Boolean respectPdb) {
            return respectPdb(Output.of(respectPdb));
        }

        public OceanImportScheduledTaskTaskTaskParametersClusterRollArgs build() {
            return $;
        }
    }

}
