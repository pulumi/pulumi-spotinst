// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OceanLaunchSpecInstanceMetadataOptions {
    /**
     * @return An integer from 1 through 64. The desired HTTP PUT response hop limit for instance metadata requests. The larger the number, the further the instance metadata requests can travel.
     * 
     */
    private @Nullable Integer httpPutResponseHopLimit;
    /**
     * @return Determines if a signed token is required or not. Valid values: `optional` or `required`.
     * 
     */
    private String httpTokens;

    private OceanLaunchSpecInstanceMetadataOptions() {}
    /**
     * @return An integer from 1 through 64. The desired HTTP PUT response hop limit for instance metadata requests. The larger the number, the further the instance metadata requests can travel.
     * 
     */
    public Optional<Integer> httpPutResponseHopLimit() {
        return Optional.ofNullable(this.httpPutResponseHopLimit);
    }
    /**
     * @return Determines if a signed token is required or not. Valid values: `optional` or `required`.
     * 
     */
    public String httpTokens() {
        return this.httpTokens;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OceanLaunchSpecInstanceMetadataOptions defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer httpPutResponseHopLimit;
        private String httpTokens;
        public Builder() {}
        public Builder(OceanLaunchSpecInstanceMetadataOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpPutResponseHopLimit = defaults.httpPutResponseHopLimit;
    	      this.httpTokens = defaults.httpTokens;
        }

        @CustomType.Setter
        public Builder httpPutResponseHopLimit(@Nullable Integer httpPutResponseHopLimit) {
            this.httpPutResponseHopLimit = httpPutResponseHopLimit;
            return this;
        }
        @CustomType.Setter
        public Builder httpTokens(String httpTokens) {
            this.httpTokens = Objects.requireNonNull(httpTokens);
            return this;
        }
        public OceanLaunchSpecInstanceMetadataOptions build() {
            final var _resultValue = new OceanLaunchSpecInstanceMetadataOptions();
            _resultValue.httpPutResponseHopLimit = httpPutResponseHopLimit;
            _resultValue.httpTokens = httpTokens;
            return _resultValue;
        }
    }
}
