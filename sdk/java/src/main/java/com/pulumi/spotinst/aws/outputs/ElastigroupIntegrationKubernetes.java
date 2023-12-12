// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.spotinst.aws.outputs.ElastigroupIntegrationKubernetesAutoscaleDown;
import com.pulumi.spotinst.aws.outputs.ElastigroupIntegrationKubernetesAutoscaleHeadroom;
import com.pulumi.spotinst.aws.outputs.ElastigroupIntegrationKubernetesAutoscaleLabel;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ElastigroupIntegrationKubernetes {
    /**
     * @return The public IP of the DC/OS Master.
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
    private @Nullable String apiServer;
    /**
     * @return The amount of time, in seconds, after a scaling activity completes before any further trigger-related scaling activities can start.
     * 
     */
    private @Nullable Integer autoscaleCooldown;
    /**
     * @return Settings for scale down actions.
     * 
     */
    private @Nullable ElastigroupIntegrationKubernetesAutoscaleDown autoscaleDown;
    /**
     * @return An option to set compute reserve for the cluster.
     * 
     */
    private @Nullable ElastigroupIntegrationKubernetesAutoscaleHeadroom autoscaleHeadroom;
    /**
     * @return Enabling the automatic k8s auto-scaler functionality. For more information please see: [Kubernetes auto scaler](https://api.spotinst.com/integration-docs/elastigroup/container-management/kubernetes/autoscaler/).
     * 
     */
    private @Nullable Boolean autoscaleIsAutoConfig;
    /**
     * @return Specifies whether the auto scaling feature is enabled.
     * 
     */
    private @Nullable Boolean autoscaleIsEnabled;
    /**
     * @return A key/value mapping of tags to assign to the resource.
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
    private @Nullable List<ElastigroupIntegrationKubernetesAutoscaleLabel> autoscaleLabels;
    private @Nullable String clusterIdentifier;
    /**
     * @return Valid values: `&#34;saas&#34;`, `&#34;pod&#34;`.
     * 
     */
    private @Nullable String integrationMode;
    /**
     * @return Kubernetes Token
     * 
     */
    private @Nullable String token;

    private ElastigroupIntegrationKubernetes() {}
    /**
     * @return The public IP of the DC/OS Master.
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
    public Optional<String> apiServer() {
        return Optional.ofNullable(this.apiServer);
    }
    /**
     * @return The amount of time, in seconds, after a scaling activity completes before any further trigger-related scaling activities can start.
     * 
     */
    public Optional<Integer> autoscaleCooldown() {
        return Optional.ofNullable(this.autoscaleCooldown);
    }
    /**
     * @return Settings for scale down actions.
     * 
     */
    public Optional<ElastigroupIntegrationKubernetesAutoscaleDown> autoscaleDown() {
        return Optional.ofNullable(this.autoscaleDown);
    }
    /**
     * @return An option to set compute reserve for the cluster.
     * 
     */
    public Optional<ElastigroupIntegrationKubernetesAutoscaleHeadroom> autoscaleHeadroom() {
        return Optional.ofNullable(this.autoscaleHeadroom);
    }
    /**
     * @return Enabling the automatic k8s auto-scaler functionality. For more information please see: [Kubernetes auto scaler](https://api.spotinst.com/integration-docs/elastigroup/container-management/kubernetes/autoscaler/).
     * 
     */
    public Optional<Boolean> autoscaleIsAutoConfig() {
        return Optional.ofNullable(this.autoscaleIsAutoConfig);
    }
    /**
     * @return Specifies whether the auto scaling feature is enabled.
     * 
     */
    public Optional<Boolean> autoscaleIsEnabled() {
        return Optional.ofNullable(this.autoscaleIsEnabled);
    }
    /**
     * @return A key/value mapping of tags to assign to the resource.
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
    public List<ElastigroupIntegrationKubernetesAutoscaleLabel> autoscaleLabels() {
        return this.autoscaleLabels == null ? List.of() : this.autoscaleLabels;
    }
    public Optional<String> clusterIdentifier() {
        return Optional.ofNullable(this.clusterIdentifier);
    }
    /**
     * @return Valid values: `&#34;saas&#34;`, `&#34;pod&#34;`.
     * 
     */
    public Optional<String> integrationMode() {
        return Optional.ofNullable(this.integrationMode);
    }
    /**
     * @return Kubernetes Token
     * 
     */
    public Optional<String> token() {
        return Optional.ofNullable(this.token);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ElastigroupIntegrationKubernetes defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String apiServer;
        private @Nullable Integer autoscaleCooldown;
        private @Nullable ElastigroupIntegrationKubernetesAutoscaleDown autoscaleDown;
        private @Nullable ElastigroupIntegrationKubernetesAutoscaleHeadroom autoscaleHeadroom;
        private @Nullable Boolean autoscaleIsAutoConfig;
        private @Nullable Boolean autoscaleIsEnabled;
        private @Nullable List<ElastigroupIntegrationKubernetesAutoscaleLabel> autoscaleLabels;
        private @Nullable String clusterIdentifier;
        private @Nullable String integrationMode;
        private @Nullable String token;
        public Builder() {}
        public Builder(ElastigroupIntegrationKubernetes defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiServer = defaults.apiServer;
    	      this.autoscaleCooldown = defaults.autoscaleCooldown;
    	      this.autoscaleDown = defaults.autoscaleDown;
    	      this.autoscaleHeadroom = defaults.autoscaleHeadroom;
    	      this.autoscaleIsAutoConfig = defaults.autoscaleIsAutoConfig;
    	      this.autoscaleIsEnabled = defaults.autoscaleIsEnabled;
    	      this.autoscaleLabels = defaults.autoscaleLabels;
    	      this.clusterIdentifier = defaults.clusterIdentifier;
    	      this.integrationMode = defaults.integrationMode;
    	      this.token = defaults.token;
        }

        @CustomType.Setter
        public Builder apiServer(@Nullable String apiServer) {
            this.apiServer = apiServer;
            return this;
        }
        @CustomType.Setter
        public Builder autoscaleCooldown(@Nullable Integer autoscaleCooldown) {
            this.autoscaleCooldown = autoscaleCooldown;
            return this;
        }
        @CustomType.Setter
        public Builder autoscaleDown(@Nullable ElastigroupIntegrationKubernetesAutoscaleDown autoscaleDown) {
            this.autoscaleDown = autoscaleDown;
            return this;
        }
        @CustomType.Setter
        public Builder autoscaleHeadroom(@Nullable ElastigroupIntegrationKubernetesAutoscaleHeadroom autoscaleHeadroom) {
            this.autoscaleHeadroom = autoscaleHeadroom;
            return this;
        }
        @CustomType.Setter
        public Builder autoscaleIsAutoConfig(@Nullable Boolean autoscaleIsAutoConfig) {
            this.autoscaleIsAutoConfig = autoscaleIsAutoConfig;
            return this;
        }
        @CustomType.Setter
        public Builder autoscaleIsEnabled(@Nullable Boolean autoscaleIsEnabled) {
            this.autoscaleIsEnabled = autoscaleIsEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder autoscaleLabels(@Nullable List<ElastigroupIntegrationKubernetesAutoscaleLabel> autoscaleLabels) {
            this.autoscaleLabels = autoscaleLabels;
            return this;
        }
        public Builder autoscaleLabels(ElastigroupIntegrationKubernetesAutoscaleLabel... autoscaleLabels) {
            return autoscaleLabels(List.of(autoscaleLabels));
        }
        @CustomType.Setter
        public Builder clusterIdentifier(@Nullable String clusterIdentifier) {
            this.clusterIdentifier = clusterIdentifier;
            return this;
        }
        @CustomType.Setter
        public Builder integrationMode(@Nullable String integrationMode) {
            this.integrationMode = integrationMode;
            return this;
        }
        @CustomType.Setter
        public Builder token(@Nullable String token) {
            this.token = token;
            return this;
        }
        public ElastigroupIntegrationKubernetes build() {
            final var _resultValue = new ElastigroupIntegrationKubernetes();
            _resultValue.apiServer = apiServer;
            _resultValue.autoscaleCooldown = autoscaleCooldown;
            _resultValue.autoscaleDown = autoscaleDown;
            _resultValue.autoscaleHeadroom = autoscaleHeadroom;
            _resultValue.autoscaleIsAutoConfig = autoscaleIsAutoConfig;
            _resultValue.autoscaleIsEnabled = autoscaleIsEnabled;
            _resultValue.autoscaleLabels = autoscaleLabels;
            _resultValue.clusterIdentifier = clusterIdentifier;
            _resultValue.integrationMode = integrationMode;
            _resultValue.token = token;
            return _resultValue;
        }
    }
}
