// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ElastigroupAzureV3SchedulingTaskArgs extends com.pulumi.resources.ResourceArgs {

    public static final ElastigroupAzureV3SchedulingTaskArgs Empty = new ElastigroupAzureV3SchedulingTaskArgs();

    @Import(name="adjustment")
    private @Nullable Output<String> adjustment;

    public Optional<Output<String>> adjustment() {
        return Optional.ofNullable(this.adjustment);
    }

    @Import(name="adjustmentPercentage")
    private @Nullable Output<String> adjustmentPercentage;

    public Optional<Output<String>> adjustmentPercentage() {
        return Optional.ofNullable(this.adjustmentPercentage);
    }

    @Import(name="batchSizePercentage")
    private @Nullable Output<String> batchSizePercentage;

    public Optional<Output<String>> batchSizePercentage() {
        return Optional.ofNullable(this.batchSizePercentage);
    }

    @Import(name="cronExpression", required=true)
    private Output<String> cronExpression;

    public Output<String> cronExpression() {
        return this.cronExpression;
    }

    @Import(name="gracePeriod")
    private @Nullable Output<String> gracePeriod;

    public Optional<Output<String>> gracePeriod() {
        return Optional.ofNullable(this.gracePeriod);
    }

    @Import(name="isEnabled", required=true)
    private Output<Boolean> isEnabled;

    public Output<Boolean> isEnabled() {
        return this.isEnabled;
    }

    @Import(name="scaleMaxCapacity")
    private @Nullable Output<String> scaleMaxCapacity;

    public Optional<Output<String>> scaleMaxCapacity() {
        return Optional.ofNullable(this.scaleMaxCapacity);
    }

    @Import(name="scaleMinCapacity")
    private @Nullable Output<String> scaleMinCapacity;

    public Optional<Output<String>> scaleMinCapacity() {
        return Optional.ofNullable(this.scaleMinCapacity);
    }

    @Import(name="scaleTargetCapacity")
    private @Nullable Output<String> scaleTargetCapacity;

    public Optional<Output<String>> scaleTargetCapacity() {
        return Optional.ofNullable(this.scaleTargetCapacity);
    }

    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    private ElastigroupAzureV3SchedulingTaskArgs() {}

    private ElastigroupAzureV3SchedulingTaskArgs(ElastigroupAzureV3SchedulingTaskArgs $) {
        this.adjustment = $.adjustment;
        this.adjustmentPercentage = $.adjustmentPercentage;
        this.batchSizePercentage = $.batchSizePercentage;
        this.cronExpression = $.cronExpression;
        this.gracePeriod = $.gracePeriod;
        this.isEnabled = $.isEnabled;
        this.scaleMaxCapacity = $.scaleMaxCapacity;
        this.scaleMinCapacity = $.scaleMinCapacity;
        this.scaleTargetCapacity = $.scaleTargetCapacity;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ElastigroupAzureV3SchedulingTaskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ElastigroupAzureV3SchedulingTaskArgs $;

        public Builder() {
            $ = new ElastigroupAzureV3SchedulingTaskArgs();
        }

        public Builder(ElastigroupAzureV3SchedulingTaskArgs defaults) {
            $ = new ElastigroupAzureV3SchedulingTaskArgs(Objects.requireNonNull(defaults));
        }

        public Builder adjustment(@Nullable Output<String> adjustment) {
            $.adjustment = adjustment;
            return this;
        }

        public Builder adjustment(String adjustment) {
            return adjustment(Output.of(adjustment));
        }

        public Builder adjustmentPercentage(@Nullable Output<String> adjustmentPercentage) {
            $.adjustmentPercentage = adjustmentPercentage;
            return this;
        }

        public Builder adjustmentPercentage(String adjustmentPercentage) {
            return adjustmentPercentage(Output.of(adjustmentPercentage));
        }

        public Builder batchSizePercentage(@Nullable Output<String> batchSizePercentage) {
            $.batchSizePercentage = batchSizePercentage;
            return this;
        }

        public Builder batchSizePercentage(String batchSizePercentage) {
            return batchSizePercentage(Output.of(batchSizePercentage));
        }

        public Builder cronExpression(Output<String> cronExpression) {
            $.cronExpression = cronExpression;
            return this;
        }

        public Builder cronExpression(String cronExpression) {
            return cronExpression(Output.of(cronExpression));
        }

        public Builder gracePeriod(@Nullable Output<String> gracePeriod) {
            $.gracePeriod = gracePeriod;
            return this;
        }

        public Builder gracePeriod(String gracePeriod) {
            return gracePeriod(Output.of(gracePeriod));
        }

        public Builder isEnabled(Output<Boolean> isEnabled) {
            $.isEnabled = isEnabled;
            return this;
        }

        public Builder isEnabled(Boolean isEnabled) {
            return isEnabled(Output.of(isEnabled));
        }

        public Builder scaleMaxCapacity(@Nullable Output<String> scaleMaxCapacity) {
            $.scaleMaxCapacity = scaleMaxCapacity;
            return this;
        }

        public Builder scaleMaxCapacity(String scaleMaxCapacity) {
            return scaleMaxCapacity(Output.of(scaleMaxCapacity));
        }

        public Builder scaleMinCapacity(@Nullable Output<String> scaleMinCapacity) {
            $.scaleMinCapacity = scaleMinCapacity;
            return this;
        }

        public Builder scaleMinCapacity(String scaleMinCapacity) {
            return scaleMinCapacity(Output.of(scaleMinCapacity));
        }

        public Builder scaleTargetCapacity(@Nullable Output<String> scaleTargetCapacity) {
            $.scaleTargetCapacity = scaleTargetCapacity;
            return this;
        }

        public Builder scaleTargetCapacity(String scaleTargetCapacity) {
            return scaleTargetCapacity(Output.of(scaleTargetCapacity));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ElastigroupAzureV3SchedulingTaskArgs build() {
            if ($.cronExpression == null) {
                throw new MissingRequiredPropertyException("ElastigroupAzureV3SchedulingTaskArgs", "cronExpression");
            }
            if ($.isEnabled == null) {
                throw new MissingRequiredPropertyException("ElastigroupAzureV3SchedulingTaskArgs", "isEnabled");
            }
            if ($.type == null) {
                throw new MissingRequiredPropertyException("ElastigroupAzureV3SchedulingTaskArgs", "type");
            }
            return $;
        }
    }

}
