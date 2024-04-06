// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.ecs.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OceanUpdatePolicyRollConfig {
    /**
     * @return Default: 50. Indicates the threshold of minimum healthy instances in single batch. If the amount of healthy instances in single batch is under the threshold, the cluster roll will fail. If exists, the parameter value will be in range of 1-100. In case of null as value, the default value in the backend will be 50%. Value of param should represent the number in percentage (%) of the batch.
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
    private @Nullable Integer batchMinHealthyPercentage;
    /**
     * @return Sets the percentage of the instances to deploy in each batch.
     * 
     */
    private Integer batchSizePercentage;

    private OceanUpdatePolicyRollConfig() {}
    /**
     * @return Default: 50. Indicates the threshold of minimum healthy instances in single batch. If the amount of healthy instances in single batch is under the threshold, the cluster roll will fail. If exists, the parameter value will be in range of 1-100. In case of null as value, the default value in the backend will be 50%. Value of param should represent the number in percentage (%) of the batch.
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
    public Optional<Integer> batchMinHealthyPercentage() {
        return Optional.ofNullable(this.batchMinHealthyPercentage);
    }
    /**
     * @return Sets the percentage of the instances to deploy in each batch.
     * 
     */
    public Integer batchSizePercentage() {
        return this.batchSizePercentage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OceanUpdatePolicyRollConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer batchMinHealthyPercentage;
        private Integer batchSizePercentage;
        public Builder() {}
        public Builder(OceanUpdatePolicyRollConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.batchMinHealthyPercentage = defaults.batchMinHealthyPercentage;
    	      this.batchSizePercentage = defaults.batchSizePercentage;
        }

        @CustomType.Setter
        public Builder batchMinHealthyPercentage(@Nullable Integer batchMinHealthyPercentage) {

            this.batchMinHealthyPercentage = batchMinHealthyPercentage;
            return this;
        }
        @CustomType.Setter
        public Builder batchSizePercentage(Integer batchSizePercentage) {
            if (batchSizePercentage == null) {
              throw new MissingRequiredPropertyException("OceanUpdatePolicyRollConfig", "batchSizePercentage");
            }
            this.batchSizePercentage = batchSizePercentage;
            return this;
        }
        public OceanUpdatePolicyRollConfig build() {
            final var _resultValue = new OceanUpdatePolicyRollConfig();
            _resultValue.batchMinHealthyPercentage = batchMinHealthyPercentage;
            _resultValue.batchSizePercentage = batchSizePercentage;
            return _resultValue;
        }
    }
}
