// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.azure.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class OceanVmSize {
    /**
     * @return VM types allowed in the Ocean cluster.
     * 
     */
    private @Nullable List<String> whitelists;

    private OceanVmSize() {}
    /**
     * @return VM types allowed in the Ocean cluster.
     * 
     */
    public List<String> whitelists() {
        return this.whitelists == null ? List.of() : this.whitelists;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OceanVmSize defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> whitelists;
        public Builder() {}
        public Builder(OceanVmSize defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.whitelists = defaults.whitelists;
        }

        @CustomType.Setter
        public Builder whitelists(@Nullable List<String> whitelists) {

            this.whitelists = whitelists;
            return this;
        }
        public Builder whitelists(String... whitelists) {
            return whitelists(List.of(whitelists));
        }
        public OceanVmSize build() {
            final var _resultValue = new OceanVmSize();
            _resultValue.whitelists = whitelists;
            return _resultValue;
        }
    }
}
