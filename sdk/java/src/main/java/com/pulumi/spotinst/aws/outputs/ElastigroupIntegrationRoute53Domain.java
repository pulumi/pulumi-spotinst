// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.spotinst.aws.outputs.ElastigroupIntegrationRoute53DomainRecordSet;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ElastigroupIntegrationRoute53Domain {
    private String hostedZoneId;
    private @Nullable String recordSetType;
    private List<ElastigroupIntegrationRoute53DomainRecordSet> recordSets;
    private @Nullable String spotinstAcctId;

    private ElastigroupIntegrationRoute53Domain() {}
    public String hostedZoneId() {
        return this.hostedZoneId;
    }
    public Optional<String> recordSetType() {
        return Optional.ofNullable(this.recordSetType);
    }
    public List<ElastigroupIntegrationRoute53DomainRecordSet> recordSets() {
        return this.recordSets;
    }
    public Optional<String> spotinstAcctId() {
        return Optional.ofNullable(this.spotinstAcctId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ElastigroupIntegrationRoute53Domain defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String hostedZoneId;
        private @Nullable String recordSetType;
        private List<ElastigroupIntegrationRoute53DomainRecordSet> recordSets;
        private @Nullable String spotinstAcctId;
        public Builder() {}
        public Builder(ElastigroupIntegrationRoute53Domain defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostedZoneId = defaults.hostedZoneId;
    	      this.recordSetType = defaults.recordSetType;
    	      this.recordSets = defaults.recordSets;
    	      this.spotinstAcctId = defaults.spotinstAcctId;
        }

        @CustomType.Setter
        public Builder hostedZoneId(String hostedZoneId) {
            if (hostedZoneId == null) {
              throw new MissingRequiredPropertyException("ElastigroupIntegrationRoute53Domain", "hostedZoneId");
            }
            this.hostedZoneId = hostedZoneId;
            return this;
        }
        @CustomType.Setter
        public Builder recordSetType(@Nullable String recordSetType) {

            this.recordSetType = recordSetType;
            return this;
        }
        @CustomType.Setter
        public Builder recordSets(List<ElastigroupIntegrationRoute53DomainRecordSet> recordSets) {
            if (recordSets == null) {
              throw new MissingRequiredPropertyException("ElastigroupIntegrationRoute53Domain", "recordSets");
            }
            this.recordSets = recordSets;
            return this;
        }
        public Builder recordSets(ElastigroupIntegrationRoute53DomainRecordSet... recordSets) {
            return recordSets(List.of(recordSets));
        }
        @CustomType.Setter
        public Builder spotinstAcctId(@Nullable String spotinstAcctId) {

            this.spotinstAcctId = spotinstAcctId;
            return this;
        }
        public ElastigroupIntegrationRoute53Domain build() {
            final var _resultValue = new ElastigroupIntegrationRoute53Domain();
            _resultValue.hostedZoneId = hostedZoneId;
            _resultValue.recordSetType = recordSetType;
            _resultValue.recordSets = recordSets;
            _resultValue.spotinstAcctId = spotinstAcctId;
            return _resultValue;
        }
    }
}
