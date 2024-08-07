// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class ElastigroupIntegrationEcsBatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final ElastigroupIntegrationEcsBatchArgs Empty = new ElastigroupIntegrationEcsBatchArgs();

    /**
     * Array of strings.
     * 
     * Usage:
     * 
     */
    @Import(name="jobQueueNames", required=true)
    private Output<List<String>> jobQueueNames;

    /**
     * @return Array of strings.
     * 
     * Usage:
     * 
     */
    public Output<List<String>> jobQueueNames() {
        return this.jobQueueNames;
    }

    private ElastigroupIntegrationEcsBatchArgs() {}

    private ElastigroupIntegrationEcsBatchArgs(ElastigroupIntegrationEcsBatchArgs $) {
        this.jobQueueNames = $.jobQueueNames;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ElastigroupIntegrationEcsBatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ElastigroupIntegrationEcsBatchArgs $;

        public Builder() {
            $ = new ElastigroupIntegrationEcsBatchArgs();
        }

        public Builder(ElastigroupIntegrationEcsBatchArgs defaults) {
            $ = new ElastigroupIntegrationEcsBatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param jobQueueNames Array of strings.
         * 
         * Usage:
         * 
         * @return builder
         * 
         */
        public Builder jobQueueNames(Output<List<String>> jobQueueNames) {
            $.jobQueueNames = jobQueueNames;
            return this;
        }

        /**
         * @param jobQueueNames Array of strings.
         * 
         * Usage:
         * 
         * @return builder
         * 
         */
        public Builder jobQueueNames(List<String> jobQueueNames) {
            return jobQueueNames(Output.of(jobQueueNames));
        }

        /**
         * @param jobQueueNames Array of strings.
         * 
         * Usage:
         * 
         * @return builder
         * 
         */
        public Builder jobQueueNames(String... jobQueueNames) {
            return jobQueueNames(List.of(jobQueueNames));
        }

        public ElastigroupIntegrationEcsBatchArgs build() {
            if ($.jobQueueNames == null) {
                throw new MissingRequiredPropertyException("ElastigroupIntegrationEcsBatchArgs", "jobQueueNames");
            }
            return $;
        }
    }

}
