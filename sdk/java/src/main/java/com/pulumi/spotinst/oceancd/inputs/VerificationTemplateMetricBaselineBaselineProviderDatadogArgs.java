// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.oceancd.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VerificationTemplateMetricBaselineBaselineProviderDatadogArgs extends com.pulumi.resources.ResourceArgs {

    public static final VerificationTemplateMetricBaselineBaselineProviderDatadogArgs Empty = new VerificationTemplateMetricBaselineBaselineProviderDatadogArgs();

    /**
     * A request for information retrieved from Datadog.
     * 
     */
    @Import(name="datadogQuery", required=true)
    private Output<String> datadogQuery;

    /**
     * @return A request for information retrieved from Datadog.
     * 
     */
    public Output<String> datadogQuery() {
        return this.datadogQuery;
    }

    /**
     * The window of time we are looking at in DataDog.
     * 
     */
    @Import(name="duration")
    private @Nullable Output<String> duration;

    /**
     * @return The window of time we are looking at in DataDog.
     * 
     */
    public Optional<Output<String>> duration() {
        return Optional.ofNullable(this.duration);
    }

    private VerificationTemplateMetricBaselineBaselineProviderDatadogArgs() {}

    private VerificationTemplateMetricBaselineBaselineProviderDatadogArgs(VerificationTemplateMetricBaselineBaselineProviderDatadogArgs $) {
        this.datadogQuery = $.datadogQuery;
        this.duration = $.duration;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VerificationTemplateMetricBaselineBaselineProviderDatadogArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VerificationTemplateMetricBaselineBaselineProviderDatadogArgs $;

        public Builder() {
            $ = new VerificationTemplateMetricBaselineBaselineProviderDatadogArgs();
        }

        public Builder(VerificationTemplateMetricBaselineBaselineProviderDatadogArgs defaults) {
            $ = new VerificationTemplateMetricBaselineBaselineProviderDatadogArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param datadogQuery A request for information retrieved from Datadog.
         * 
         * @return builder
         * 
         */
        public Builder datadogQuery(Output<String> datadogQuery) {
            $.datadogQuery = datadogQuery;
            return this;
        }

        /**
         * @param datadogQuery A request for information retrieved from Datadog.
         * 
         * @return builder
         * 
         */
        public Builder datadogQuery(String datadogQuery) {
            return datadogQuery(Output.of(datadogQuery));
        }

        /**
         * @param duration The window of time we are looking at in DataDog.
         * 
         * @return builder
         * 
         */
        public Builder duration(@Nullable Output<String> duration) {
            $.duration = duration;
            return this;
        }

        /**
         * @param duration The window of time we are looking at in DataDog.
         * 
         * @return builder
         * 
         */
        public Builder duration(String duration) {
            return duration(Output.of(duration));
        }

        public VerificationTemplateMetricBaselineBaselineProviderDatadogArgs build() {
            if ($.datadogQuery == null) {
                throw new MissingRequiredPropertyException("VerificationTemplateMetricBaselineBaselineProviderDatadogArgs", "datadogQuery");
            }
            return $;
        }
    }

}
