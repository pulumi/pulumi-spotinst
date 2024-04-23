// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ElastigroupIntegrationEcsBatch {
    private List<String> jobQueueNames;

    private ElastigroupIntegrationEcsBatch() {}
    public List<String> jobQueueNames() {
        return this.jobQueueNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ElastigroupIntegrationEcsBatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> jobQueueNames;
        public Builder() {}
        public Builder(ElastigroupIntegrationEcsBatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jobQueueNames = defaults.jobQueueNames;
        }

        @CustomType.Setter
        public Builder jobQueueNames(List<String> jobQueueNames) {
            if (jobQueueNames == null) {
              throw new MissingRequiredPropertyException("ElastigroupIntegrationEcsBatch", "jobQueueNames");
            }
            this.jobQueueNames = jobQueueNames;
            return this;
        }
        public Builder jobQueueNames(String... jobQueueNames) {
            return jobQueueNames(List.of(jobQueueNames));
        }
        public ElastigroupIntegrationEcsBatch build() {
            final var _resultValue = new ElastigroupIntegrationEcsBatch();
            _resultValue.jobQueueNames = jobQueueNames;
            return _resultValue;
        }
    }
}
