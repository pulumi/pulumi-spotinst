// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ElastigroupIntegrationRoute53DomainRecordSet {
    /**
     * @return The group name.
     * 
     */
    private String name;
    private @Nullable Boolean usePublicDns;
    private @Nullable Boolean usePublicIp;

    private ElastigroupIntegrationRoute53DomainRecordSet() {}
    /**
     * @return The group name.
     * 
     */
    public String name() {
        return this.name;
    }
    public Optional<Boolean> usePublicDns() {
        return Optional.ofNullable(this.usePublicDns);
    }
    public Optional<Boolean> usePublicIp() {
        return Optional.ofNullable(this.usePublicIp);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ElastigroupIntegrationRoute53DomainRecordSet defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private @Nullable Boolean usePublicDns;
        private @Nullable Boolean usePublicIp;
        public Builder() {}
        public Builder(ElastigroupIntegrationRoute53DomainRecordSet defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.usePublicDns = defaults.usePublicDns;
    	      this.usePublicIp = defaults.usePublicIp;
        }

        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("ElastigroupIntegrationRoute53DomainRecordSet", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder usePublicDns(@Nullable Boolean usePublicDns) {

            this.usePublicDns = usePublicDns;
            return this;
        }
        @CustomType.Setter
        public Builder usePublicIp(@Nullable Boolean usePublicIp) {

            this.usePublicIp = usePublicIp;
            return this;
        }
        public ElastigroupIntegrationRoute53DomainRecordSet build() {
            final var _resultValue = new ElastigroupIntegrationRoute53DomainRecordSet();
            _resultValue.name = name;
            _resultValue.usePublicDns = usePublicDns;
            _resultValue.usePublicIp = usePublicIp;
            return _resultValue;
        }
    }
}
