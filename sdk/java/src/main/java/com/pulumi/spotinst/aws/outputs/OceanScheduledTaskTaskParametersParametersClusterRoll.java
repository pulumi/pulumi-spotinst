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
    /**
     * @return Indicates the threshold of minimum healthy instances in single batch. If the amount of healthy instances in single batch is under the threshold, the cluster roll will fail. If exists, the parameter value will be in range of 1-100. In case of null as value, the default value in the backend will be 50%. Value of param should represent the number in percentage (%) of the batch.
     * 
     */
    private @Nullable Integer batchMinHealthyPercentage;
    /**
     * @return Value as a percent to set the size of a batch in a roll. Valid values are 0-100.
     * 
     */
    private @Nullable Integer batchSizePercentage;
    /**
     * @return Add a `comment` description for the roll. The `comment` is limited to 256 chars
     * 
     */
    private @Nullable String comment;
    /**
     * @return During the roll, if the parameter is set to true we honor PDB during the instance replacement.
     * 
     */
    private @Nullable Boolean respectPdb;

    private OceanScheduledTaskTaskParametersParametersClusterRoll() {}
    /**
     * @return Indicates the threshold of minimum healthy instances in single batch. If the amount of healthy instances in single batch is under the threshold, the cluster roll will fail. If exists, the parameter value will be in range of 1-100. In case of null as value, the default value in the backend will be 50%. Value of param should represent the number in percentage (%) of the batch.
     * 
     */
    public Optional<Integer> batchMinHealthyPercentage() {
        return Optional.ofNullable(this.batchMinHealthyPercentage);
    }
    /**
     * @return Value as a percent to set the size of a batch in a roll. Valid values are 0-100.
     * 
     */
    public Optional<Integer> batchSizePercentage() {
        return Optional.ofNullable(this.batchSizePercentage);
    }
    /**
     * @return Add a `comment` description for the roll. The `comment` is limited to 256 chars
     * 
     */
    public Optional<String> comment() {
        return Optional.ofNullable(this.comment);
    }
    /**
     * @return During the roll, if the parameter is set to true we honor PDB during the instance replacement.
     * 
     */
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
