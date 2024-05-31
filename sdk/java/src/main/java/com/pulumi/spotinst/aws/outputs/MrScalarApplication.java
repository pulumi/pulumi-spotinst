// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MrScalarApplication {
    private @Nullable List<String> args;
    /**
     * @return The MrScaler name.
     * 
     */
    private String name;
    private @Nullable String version;

    private MrScalarApplication() {}
    public List<String> args() {
        return this.args == null ? List.of() : this.args;
    }
    /**
     * @return The MrScaler name.
     * 
     */
    public String name() {
        return this.name;
    }
    public Optional<String> version() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MrScalarApplication defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> args;
        private String name;
        private @Nullable String version;
        public Builder() {}
        public Builder(MrScalarApplication defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.args = defaults.args;
    	      this.name = defaults.name;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder args(@Nullable List<String> args) {

            this.args = args;
            return this;
        }
        public Builder args(String... args) {
            return args(List.of(args));
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("MrScalarApplication", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder version(@Nullable String version) {

            this.version = version;
            return this;
        }
        public MrScalarApplication build() {
            final var _resultValue = new MrScalarApplication();
            _resultValue.args = args;
            _resultValue.name = name;
            _resultValue.version = version;
            return _resultValue;
        }
    }
}