// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.spotinst.outputs.ElastigroupAzureV3VmSizesSpotSizeAttributes;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ElastigroupAzureV3VmSizes {
    private @Nullable List<String> excludedVmSizes;
    private List<String> odSizes;
    private @Nullable List<String> preferredSpotSizes;
    private @Nullable ElastigroupAzureV3VmSizesSpotSizeAttributes spotSizeAttributes;
    private @Nullable List<String> spotSizes;

    private ElastigroupAzureV3VmSizes() {}
    public List<String> excludedVmSizes() {
        return this.excludedVmSizes == null ? List.of() : this.excludedVmSizes;
    }
    public List<String> odSizes() {
        return this.odSizes;
    }
    public List<String> preferredSpotSizes() {
        return this.preferredSpotSizes == null ? List.of() : this.preferredSpotSizes;
    }
    public Optional<ElastigroupAzureV3VmSizesSpotSizeAttributes> spotSizeAttributes() {
        return Optional.ofNullable(this.spotSizeAttributes);
    }
    public List<String> spotSizes() {
        return this.spotSizes == null ? List.of() : this.spotSizes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ElastigroupAzureV3VmSizes defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> excludedVmSizes;
        private List<String> odSizes;
        private @Nullable List<String> preferredSpotSizes;
        private @Nullable ElastigroupAzureV3VmSizesSpotSizeAttributes spotSizeAttributes;
        private @Nullable List<String> spotSizes;
        public Builder() {}
        public Builder(ElastigroupAzureV3VmSizes defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.excludedVmSizes = defaults.excludedVmSizes;
    	      this.odSizes = defaults.odSizes;
    	      this.preferredSpotSizes = defaults.preferredSpotSizes;
    	      this.spotSizeAttributes = defaults.spotSizeAttributes;
    	      this.spotSizes = defaults.spotSizes;
        }

        @CustomType.Setter
        public Builder excludedVmSizes(@Nullable List<String> excludedVmSizes) {

            this.excludedVmSizes = excludedVmSizes;
            return this;
        }
        public Builder excludedVmSizes(String... excludedVmSizes) {
            return excludedVmSizes(List.of(excludedVmSizes));
        }
        @CustomType.Setter
        public Builder odSizes(List<String> odSizes) {
            if (odSizes == null) {
              throw new MissingRequiredPropertyException("ElastigroupAzureV3VmSizes", "odSizes");
            }
            this.odSizes = odSizes;
            return this;
        }
        public Builder odSizes(String... odSizes) {
            return odSizes(List.of(odSizes));
        }
        @CustomType.Setter
        public Builder preferredSpotSizes(@Nullable List<String> preferredSpotSizes) {

            this.preferredSpotSizes = preferredSpotSizes;
            return this;
        }
        public Builder preferredSpotSizes(String... preferredSpotSizes) {
            return preferredSpotSizes(List.of(preferredSpotSizes));
        }
        @CustomType.Setter
        public Builder spotSizeAttributes(@Nullable ElastigroupAzureV3VmSizesSpotSizeAttributes spotSizeAttributes) {

            this.spotSizeAttributes = spotSizeAttributes;
            return this;
        }
        @CustomType.Setter
        public Builder spotSizes(@Nullable List<String> spotSizes) {

            this.spotSizes = spotSizes;
            return this;
        }
        public Builder spotSizes(String... spotSizes) {
            return spotSizes(List.of(spotSizes));
        }
        public ElastigroupAzureV3VmSizes build() {
            final var _resultValue = new ElastigroupAzureV3VmSizes();
            _resultValue.excludedVmSizes = excludedVmSizes;
            _resultValue.odSizes = odSizes;
            _resultValue.preferredSpotSizes = preferredSpotSizes;
            _resultValue.spotSizeAttributes = spotSizeAttributes;
            _resultValue.spotSizes = spotSizes;
            return _resultValue;
        }
    }
}
