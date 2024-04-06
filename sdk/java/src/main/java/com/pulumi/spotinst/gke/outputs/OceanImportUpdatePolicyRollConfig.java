// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.gke.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OceanImportUpdatePolicyRollConfig {
    private @Nullable Integer batchMinHealthyPercentage;
    /**
     * @return Value in % to set size of batch in roll. Valid values are 0-100
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
    private Integer batchSizePercentage;
    private @Nullable List<String> launchSpecIds;
    private @Nullable Boolean respectPdb;

    private OceanImportUpdatePolicyRollConfig() {}
    public Optional<Integer> batchMinHealthyPercentage() {
        return Optional.ofNullable(this.batchMinHealthyPercentage);
    }
    /**
     * @return Value in % to set size of batch in roll. Valid values are 0-100
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
    public Integer batchSizePercentage() {
        return this.batchSizePercentage;
    }
    public List<String> launchSpecIds() {
        return this.launchSpecIds == null ? List.of() : this.launchSpecIds;
    }
    public Optional<Boolean> respectPdb() {
        return Optional.ofNullable(this.respectPdb);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OceanImportUpdatePolicyRollConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer batchMinHealthyPercentage;
        private Integer batchSizePercentage;
        private @Nullable List<String> launchSpecIds;
        private @Nullable Boolean respectPdb;
        public Builder() {}
        public Builder(OceanImportUpdatePolicyRollConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.batchMinHealthyPercentage = defaults.batchMinHealthyPercentage;
    	      this.batchSizePercentage = defaults.batchSizePercentage;
    	      this.launchSpecIds = defaults.launchSpecIds;
    	      this.respectPdb = defaults.respectPdb;
        }

        @CustomType.Setter
        public Builder batchMinHealthyPercentage(@Nullable Integer batchMinHealthyPercentage) {

            this.batchMinHealthyPercentage = batchMinHealthyPercentage;
            return this;
        }
        @CustomType.Setter
        public Builder batchSizePercentage(Integer batchSizePercentage) {
            if (batchSizePercentage == null) {
              throw new MissingRequiredPropertyException("OceanImportUpdatePolicyRollConfig", "batchSizePercentage");
            }
            this.batchSizePercentage = batchSizePercentage;
            return this;
        }
        @CustomType.Setter
        public Builder launchSpecIds(@Nullable List<String> launchSpecIds) {

            this.launchSpecIds = launchSpecIds;
            return this;
        }
        public Builder launchSpecIds(String... launchSpecIds) {
            return launchSpecIds(List.of(launchSpecIds));
        }
        @CustomType.Setter
        public Builder respectPdb(@Nullable Boolean respectPdb) {

            this.respectPdb = respectPdb;
            return this;
        }
        public OceanImportUpdatePolicyRollConfig build() {
            final var _resultValue = new OceanImportUpdatePolicyRollConfig();
            _resultValue.batchMinHealthyPercentage = batchMinHealthyPercentage;
            _resultValue.batchSizePercentage = batchSizePercentage;
            _resultValue.launchSpecIds = launchSpecIds;
            _resultValue.respectPdb = respectPdb;
            return _resultValue;
        }
    }
}
