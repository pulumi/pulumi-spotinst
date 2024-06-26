// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.spotinst.aws.inputs.ElastigroupIntegrationRoute53DomainRecordSetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ElastigroupIntegrationRoute53DomainArgs extends com.pulumi.resources.ResourceArgs {

    public static final ElastigroupIntegrationRoute53DomainArgs Empty = new ElastigroupIntegrationRoute53DomainArgs();

    @Import(name="hostedZoneId", required=true)
    private Output<String> hostedZoneId;

    public Output<String> hostedZoneId() {
        return this.hostedZoneId;
    }

    @Import(name="recordSetType")
    private @Nullable Output<String> recordSetType;

    public Optional<Output<String>> recordSetType() {
        return Optional.ofNullable(this.recordSetType);
    }

    @Import(name="recordSets", required=true)
    private Output<List<ElastigroupIntegrationRoute53DomainRecordSetArgs>> recordSets;

    public Output<List<ElastigroupIntegrationRoute53DomainRecordSetArgs>> recordSets() {
        return this.recordSets;
    }

    @Import(name="spotinstAcctId")
    private @Nullable Output<String> spotinstAcctId;

    public Optional<Output<String>> spotinstAcctId() {
        return Optional.ofNullable(this.spotinstAcctId);
    }

    private ElastigroupIntegrationRoute53DomainArgs() {}

    private ElastigroupIntegrationRoute53DomainArgs(ElastigroupIntegrationRoute53DomainArgs $) {
        this.hostedZoneId = $.hostedZoneId;
        this.recordSetType = $.recordSetType;
        this.recordSets = $.recordSets;
        this.spotinstAcctId = $.spotinstAcctId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ElastigroupIntegrationRoute53DomainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ElastigroupIntegrationRoute53DomainArgs $;

        public Builder() {
            $ = new ElastigroupIntegrationRoute53DomainArgs();
        }

        public Builder(ElastigroupIntegrationRoute53DomainArgs defaults) {
            $ = new ElastigroupIntegrationRoute53DomainArgs(Objects.requireNonNull(defaults));
        }

        public Builder hostedZoneId(Output<String> hostedZoneId) {
            $.hostedZoneId = hostedZoneId;
            return this;
        }

        public Builder hostedZoneId(String hostedZoneId) {
            return hostedZoneId(Output.of(hostedZoneId));
        }

        public Builder recordSetType(@Nullable Output<String> recordSetType) {
            $.recordSetType = recordSetType;
            return this;
        }

        public Builder recordSetType(String recordSetType) {
            return recordSetType(Output.of(recordSetType));
        }

        public Builder recordSets(Output<List<ElastigroupIntegrationRoute53DomainRecordSetArgs>> recordSets) {
            $.recordSets = recordSets;
            return this;
        }

        public Builder recordSets(List<ElastigroupIntegrationRoute53DomainRecordSetArgs> recordSets) {
            return recordSets(Output.of(recordSets));
        }

        public Builder recordSets(ElastigroupIntegrationRoute53DomainRecordSetArgs... recordSets) {
            return recordSets(List.of(recordSets));
        }

        public Builder spotinstAcctId(@Nullable Output<String> spotinstAcctId) {
            $.spotinstAcctId = spotinstAcctId;
            return this;
        }

        public Builder spotinstAcctId(String spotinstAcctId) {
            return spotinstAcctId(Output.of(spotinstAcctId));
        }

        public ElastigroupIntegrationRoute53DomainArgs build() {
            if ($.hostedZoneId == null) {
                throw new MissingRequiredPropertyException("ElastigroupIntegrationRoute53DomainArgs", "hostedZoneId");
            }
            if ($.recordSets == null) {
                throw new MissingRequiredPropertyException("ElastigroupIntegrationRoute53DomainArgs", "recordSets");
            }
            return $;
        }
    }

}
