// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.oceancd.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.spotinst.oceancd.outputs.VerificationTemplateMetricProviderWebWebHeader;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VerificationTemplateMetricProviderWeb {
    /**
     * @return The body of the web metric.
     * 
     */
    private @Nullable String body;
    /**
     * @return Skips host TLS verification.
     * 
     */
    private @Nullable Boolean insecure;
    /**
     * @return A JSON Path to use as the result variable. Default is &#34;{$}&#34;
     * 
     */
    private @Nullable String jsonPath;
    /**
     * @return The method of the web metric.  Enum: &#34;GET&#34; &#34;POST&#34; &#34;PUT&#34;
     * 
     */
    private @Nullable String method;
    /**
     * @return The timeout for the request in seconds. Default is 10.
     * 
     */
    private @Nullable Integer timeoutSeconds;
    /**
     * @return The address of the web metric.
     * 
     */
    private String url;
    /**
     * @return Optional HTTP headers to use in the request.
     * 
     */
    private @Nullable List<VerificationTemplateMetricProviderWebWebHeader> webHeaders;

    private VerificationTemplateMetricProviderWeb() {}
    /**
     * @return The body of the web metric.
     * 
     */
    public Optional<String> body() {
        return Optional.ofNullable(this.body);
    }
    /**
     * @return Skips host TLS verification.
     * 
     */
    public Optional<Boolean> insecure() {
        return Optional.ofNullable(this.insecure);
    }
    /**
     * @return A JSON Path to use as the result variable. Default is &#34;{$}&#34;
     * 
     */
    public Optional<String> jsonPath() {
        return Optional.ofNullable(this.jsonPath);
    }
    /**
     * @return The method of the web metric.  Enum: &#34;GET&#34; &#34;POST&#34; &#34;PUT&#34;
     * 
     */
    public Optional<String> method() {
        return Optional.ofNullable(this.method);
    }
    /**
     * @return The timeout for the request in seconds. Default is 10.
     * 
     */
    public Optional<Integer> timeoutSeconds() {
        return Optional.ofNullable(this.timeoutSeconds);
    }
    /**
     * @return The address of the web metric.
     * 
     */
    public String url() {
        return this.url;
    }
    /**
     * @return Optional HTTP headers to use in the request.
     * 
     */
    public List<VerificationTemplateMetricProviderWebWebHeader> webHeaders() {
        return this.webHeaders == null ? List.of() : this.webHeaders;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VerificationTemplateMetricProviderWeb defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String body;
        private @Nullable Boolean insecure;
        private @Nullable String jsonPath;
        private @Nullable String method;
        private @Nullable Integer timeoutSeconds;
        private String url;
        private @Nullable List<VerificationTemplateMetricProviderWebWebHeader> webHeaders;
        public Builder() {}
        public Builder(VerificationTemplateMetricProviderWeb defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.body = defaults.body;
    	      this.insecure = defaults.insecure;
    	      this.jsonPath = defaults.jsonPath;
    	      this.method = defaults.method;
    	      this.timeoutSeconds = defaults.timeoutSeconds;
    	      this.url = defaults.url;
    	      this.webHeaders = defaults.webHeaders;
        }

        @CustomType.Setter
        public Builder body(@Nullable String body) {

            this.body = body;
            return this;
        }
        @CustomType.Setter
        public Builder insecure(@Nullable Boolean insecure) {

            this.insecure = insecure;
            return this;
        }
        @CustomType.Setter
        public Builder jsonPath(@Nullable String jsonPath) {

            this.jsonPath = jsonPath;
            return this;
        }
        @CustomType.Setter
        public Builder method(@Nullable String method) {

            this.method = method;
            return this;
        }
        @CustomType.Setter
        public Builder timeoutSeconds(@Nullable Integer timeoutSeconds) {

            this.timeoutSeconds = timeoutSeconds;
            return this;
        }
        @CustomType.Setter
        public Builder url(String url) {
            if (url == null) {
              throw new MissingRequiredPropertyException("VerificationTemplateMetricProviderWeb", "url");
            }
            this.url = url;
            return this;
        }
        @CustomType.Setter
        public Builder webHeaders(@Nullable List<VerificationTemplateMetricProviderWebWebHeader> webHeaders) {

            this.webHeaders = webHeaders;
            return this;
        }
        public Builder webHeaders(VerificationTemplateMetricProviderWebWebHeader... webHeaders) {
            return webHeaders(List.of(webHeaders));
        }
        public VerificationTemplateMetricProviderWeb build() {
            final var _resultValue = new VerificationTemplateMetricProviderWeb();
            _resultValue.body = body;
            _resultValue.insecure = insecure;
            _resultValue.jsonPath = jsonPath;
            _resultValue.method = method;
            _resultValue.timeoutSeconds = timeoutSeconds;
            _resultValue.url = url;
            _resultValue.webHeaders = webHeaders;
            return _resultValue;
        }
    }
}
