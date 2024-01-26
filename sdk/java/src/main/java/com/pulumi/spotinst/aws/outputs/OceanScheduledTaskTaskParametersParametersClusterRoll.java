// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OceanScheduledTaskTaskParametersParametersClusterRoll {
    private @Nullable Integer batchMinHealthyPercentage;
    private @Nullable Integer batchSizePercentage;
    private @Nullable String comment;
    private @Nullable Boolean respectPdb;

    private OceanScheduledTaskTaskParametersParametersClusterRoll() {}
    public Optional<Integer> batchMinHealthyPercentage() {
        return Optional.ofNullable(this.batchMinHealthyPercentage);
    }
    public Optional<Integer> batchSizePercentage() {
        return Optional.ofNullable(this.batchSizePercentage);
    }
    public Optional<String> comment() {
        return Optional.ofNullable(this.comment);
    }
    public Optional<Boolean> respectPdb() {
        return Optional.ofNullable(this.respectPdb);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OceanScheduledTaskTaskParametersParametersClusterRoll defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer batchMinHealthyPercentage;
        private @Nullable Integer batchSizePercentage;
        private @Nullable String comment;
        private @Nullable Boolean respectPdb;
        public Builder() {}
        public Builder(OceanScheduledTaskTaskParametersParametersClusterRoll defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.batchMinHealthyPercentage = defaults.batchMinHealthyPercentage;
    	      this.batchSizePercentage = defaults.batchSizePercentage;
    	      this.comment = defaults.comment;
    	      this.respectPdb = defaults.respectPdb;
        }

        @CustomType.Setter
        public Builder batchMinHealthyPercentage(@Nullable Integer batchMinHealthyPercentage) {

            this.batchMinHealthyPercentage = batchMinHealthyPercentage;
            return this;
        }
        @CustomType.Setter
        public Builder batchSizePercentage(@Nullable Integer batchSizePercentage) {

            this.batchSizePercentage = batchSizePercentage;
            return this;
        }
        @CustomType.Setter
        public Builder comment(@Nullable String comment) {

            this.comment = comment;
            return this;
        }
        @CustomType.Setter
        public Builder respectPdb(@Nullable Boolean respectPdb) {

            this.respectPdb = respectPdb;
            return this;
        }
        public OceanScheduledTaskTaskParametersParametersClusterRoll build() {
            final var _resultValue = new OceanScheduledTaskTaskParametersParametersClusterRoll();
            _resultValue.batchMinHealthyPercentage = batchMinHealthyPercentage;
            _resultValue.batchSizePercentage = batchSizePercentage;
            _resultValue.comment = comment;
            _resultValue.respectPdb = respectPdb;
            return _resultValue;
        }
    }
}
