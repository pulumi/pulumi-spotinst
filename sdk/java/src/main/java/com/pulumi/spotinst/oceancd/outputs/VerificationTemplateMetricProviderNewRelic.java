// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.oceancd.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VerificationTemplateMetricProviderNewRelic {
    /**
     * @return A raw newrelic NRQL query to perform.
     * 
     */
    private String newRelicQuery;
    /**
     * @return The name of the secret holding NR account configuration.
     * 
     */
    private @Nullable String profile;

    private VerificationTemplateMetricProviderNewRelic() {}
    /**
     * @return A raw newrelic NRQL query to perform.
     * 
     */
    public String newRelicQuery() {
        return this.newRelicQuery;
    }
    /**
     * @return The name of the secret holding NR account configuration.
     * 
     */
    public Optional<String> profile() {
        return Optional.ofNullable(this.profile);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VerificationTemplateMetricProviderNewRelic defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String newRelicQuery;
        private @Nullable String profile;
        public Builder() {}
        public Builder(VerificationTemplateMetricProviderNewRelic defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.newRelicQuery = defaults.newRelicQuery;
    	      this.profile = defaults.profile;
        }

        @CustomType.Setter
        public Builder newRelicQuery(String newRelicQuery) {
            if (newRelicQuery == null) {
              throw new MissingRequiredPropertyException("VerificationTemplateMetricProviderNewRelic", "newRelicQuery");
            }
            this.newRelicQuery = newRelicQuery;
            return this;
        }
        @CustomType.Setter
        public Builder profile(@Nullable String profile) {

            this.profile = profile;
            return this;
        }
        public VerificationTemplateMetricProviderNewRelic build() {
            final var _resultValue = new VerificationTemplateMetricProviderNewRelic();
            _resultValue.newRelicQuery = newRelicQuery;
            _resultValue.profile = profile;
            return _resultValue;
        }
    }
}
