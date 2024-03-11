// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ElastigroupIntegrationBeanstalkManagedActionsPlatformUpdate {
    /**
     * @return In the event of a fallback to On-Demand instances, select the time period to revert back to Spot. Supported Arguments – always (default), timeWindow, never. For timeWindow or never to be valid the group must have availabilityOriented OR persistence defined.
     * 
     */
    private @Nullable String performAt;
    /**
     * @return Time Window for when action occurs ex. Mon:23:50-Tue:00:20
     * 
     */
    private @Nullable String timeWindow;
    /**
     * @return Level to update
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
    private @Nullable String updateLevel;

    private ElastigroupIntegrationBeanstalkManagedActionsPlatformUpdate() {}
    /**
     * @return In the event of a fallback to On-Demand instances, select the time period to revert back to Spot. Supported Arguments – always (default), timeWindow, never. For timeWindow or never to be valid the group must have availabilityOriented OR persistence defined.
     * 
     */
    public Optional<String> performAt() {
        return Optional.ofNullable(this.performAt);
    }
    /**
     * @return Time Window for when action occurs ex. Mon:23:50-Tue:00:20
     * 
     */
    public Optional<String> timeWindow() {
        return Optional.ofNullable(this.timeWindow);
    }
    /**
     * @return Level to update
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
    public Optional<String> updateLevel() {
        return Optional.ofNullable(this.updateLevel);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ElastigroupIntegrationBeanstalkManagedActionsPlatformUpdate defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String performAt;
        private @Nullable String timeWindow;
        private @Nullable String updateLevel;
        public Builder() {}
        public Builder(ElastigroupIntegrationBeanstalkManagedActionsPlatformUpdate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.performAt = defaults.performAt;
    	      this.timeWindow = defaults.timeWindow;
    	      this.updateLevel = defaults.updateLevel;
        }

        @CustomType.Setter
        public Builder performAt(@Nullable String performAt) {

            this.performAt = performAt;
            return this;
        }
        @CustomType.Setter
        public Builder timeWindow(@Nullable String timeWindow) {

            this.timeWindow = timeWindow;
            return this;
        }
        @CustomType.Setter
        public Builder updateLevel(@Nullable String updateLevel) {

            this.updateLevel = updateLevel;
            return this;
        }
        public ElastigroupIntegrationBeanstalkManagedActionsPlatformUpdate build() {
            final var _resultValue = new ElastigroupIntegrationBeanstalkManagedActionsPlatformUpdate();
            _resultValue.performAt = performAt;
            _resultValue.timeWindow = timeWindow;
            _resultValue.updateLevel = updateLevel;
            return _resultValue;
        }
    }
}
