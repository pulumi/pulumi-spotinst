// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.spotinst.aws.outputs.ElastigroupIntegrationGitlabRunner;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ElastigroupIntegrationGitlab {
    /**
     * @return Settings for Gitlab runner.
     * 
     */
    private @Nullable ElastigroupIntegrationGitlabRunner runner;

    private ElastigroupIntegrationGitlab() {}
    /**
     * @return Settings for Gitlab runner.
     * 
     */
    public Optional<ElastigroupIntegrationGitlabRunner> runner() {
        return Optional.ofNullable(this.runner);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ElastigroupIntegrationGitlab defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ElastigroupIntegrationGitlabRunner runner;
        public Builder() {}
        public Builder(ElastigroupIntegrationGitlab defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.runner = defaults.runner;
        }

        @CustomType.Setter
        public Builder runner(@Nullable ElastigroupIntegrationGitlabRunner runner) {
            this.runner = runner;
            return this;
        }
        public ElastigroupIntegrationGitlab build() {
            final var o = new ElastigroupIntegrationGitlab();
            o.runner = runner;
            return o;
        }
    }
}
