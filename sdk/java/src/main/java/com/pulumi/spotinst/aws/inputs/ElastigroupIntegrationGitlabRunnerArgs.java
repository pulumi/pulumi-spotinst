// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ElastigroupIntegrationGitlabRunnerArgs extends com.pulumi.resources.ResourceArgs {

    public static final ElastigroupIntegrationGitlabRunnerArgs Empty = new ElastigroupIntegrationGitlabRunnerArgs();

    /**
     * Specifies whether the scaling policy described in this block is enabled.
     * 
     */
    @Import(name="isEnabled")
    private @Nullable Output<Boolean> isEnabled;

    /**
     * @return Specifies whether the scaling policy described in this block is enabled.
     * 
     */
    public Optional<Output<Boolean>> isEnabled() {
        return Optional.ofNullable(this.isEnabled);
    }

    private ElastigroupIntegrationGitlabRunnerArgs() {}

    private ElastigroupIntegrationGitlabRunnerArgs(ElastigroupIntegrationGitlabRunnerArgs $) {
        this.isEnabled = $.isEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ElastigroupIntegrationGitlabRunnerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ElastigroupIntegrationGitlabRunnerArgs $;

        public Builder() {
            $ = new ElastigroupIntegrationGitlabRunnerArgs();
        }

        public Builder(ElastigroupIntegrationGitlabRunnerArgs defaults) {
            $ = new ElastigroupIntegrationGitlabRunnerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param isEnabled Specifies whether the scaling policy described in this block is enabled.
         * 
         * @return builder
         * 
         */
        public Builder isEnabled(@Nullable Output<Boolean> isEnabled) {
            $.isEnabled = isEnabled;
            return this;
        }

        /**
         * @param isEnabled Specifies whether the scaling policy described in this block is enabled.
         * 
         * @return builder
         * 
         */
        public Builder isEnabled(Boolean isEnabled) {
            return isEnabled(Output.of(isEnabled));
        }

        public ElastigroupIntegrationGitlabRunnerArgs build() {
            return $;
        }
    }

}
