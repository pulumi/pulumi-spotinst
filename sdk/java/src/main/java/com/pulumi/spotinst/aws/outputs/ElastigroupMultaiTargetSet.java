// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ElastigroupMultaiTargetSet {
    /**
     * @return ID of Multai Load Balancer.
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
    private String balancerId;
    /**
     * @return ID of Multai target set.
     * 
     */
    private String targetSetId;

    private ElastigroupMultaiTargetSet() {}
    /**
     * @return ID of Multai Load Balancer.
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
    public String balancerId() {
        return this.balancerId;
    }
    /**
     * @return ID of Multai target set.
     * 
     */
    public String targetSetId() {
        return this.targetSetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ElastigroupMultaiTargetSet defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String balancerId;
        private String targetSetId;
        public Builder() {}
        public Builder(ElastigroupMultaiTargetSet defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.balancerId = defaults.balancerId;
    	      this.targetSetId = defaults.targetSetId;
        }

        @CustomType.Setter
        public Builder balancerId(String balancerId) {
            if (balancerId == null) {
              throw new MissingRequiredPropertyException("ElastigroupMultaiTargetSet", "balancerId");
            }
            this.balancerId = balancerId;
            return this;
        }
        @CustomType.Setter
        public Builder targetSetId(String targetSetId) {
            if (targetSetId == null) {
              throw new MissingRequiredPropertyException("ElastigroupMultaiTargetSet", "targetSetId");
            }
            this.targetSetId = targetSetId;
            return this;
        }
        public ElastigroupMultaiTargetSet build() {
            final var _resultValue = new ElastigroupMultaiTargetSet();
            _resultValue.balancerId = balancerId;
            _resultValue.targetSetId = targetSetId;
            return _resultValue;
        }
    }
}
