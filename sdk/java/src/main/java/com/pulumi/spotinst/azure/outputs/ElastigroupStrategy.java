// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.azure.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ElastigroupStrategy {
    private @Nullable Integer drainingTimeout;
    private @Nullable Integer lowPriorityPercentage;
    private @Nullable Integer odCount;

    private ElastigroupStrategy() {}
    public Optional<Integer> drainingTimeout() {
        return Optional.ofNullable(this.drainingTimeout);
    }
    public Optional<Integer> lowPriorityPercentage() {
        return Optional.ofNullable(this.lowPriorityPercentage);
    }
    public Optional<Integer> odCount() {
        return Optional.ofNullable(this.odCount);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ElastigroupStrategy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer drainingTimeout;
        private @Nullable Integer lowPriorityPercentage;
        private @Nullable Integer odCount;
        public Builder() {}
        public Builder(ElastigroupStrategy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.drainingTimeout = defaults.drainingTimeout;
    	      this.lowPriorityPercentage = defaults.lowPriorityPercentage;
    	      this.odCount = defaults.odCount;
        }

        @CustomType.Setter
        public Builder drainingTimeout(@Nullable Integer drainingTimeout) {

            this.drainingTimeout = drainingTimeout;
            return this;
        }
        @CustomType.Setter
        public Builder lowPriorityPercentage(@Nullable Integer lowPriorityPercentage) {

            this.lowPriorityPercentage = lowPriorityPercentage;
            return this;
        }
        @CustomType.Setter
        public Builder odCount(@Nullable Integer odCount) {

            this.odCount = odCount;
            return this;
        }
        public ElastigroupStrategy build() {
            final var _resultValue = new ElastigroupStrategy();
            _resultValue.drainingTimeout = drainingTimeout;
            _resultValue.lowPriorityPercentage = lowPriorityPercentage;
            _resultValue.odCount = odCount;
            return _resultValue;
        }
    }
}
