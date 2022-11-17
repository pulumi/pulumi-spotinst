// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class StatefulNodeAzureDataDiskArgs extends com.pulumi.resources.ResourceArgs {

    public static final StatefulNodeAzureDataDiskArgs Empty = new StatefulNodeAzureDataDiskArgs();

    @Import(name="lun", required=true)
    private Output<Integer> lun;

    public Output<Integer> lun() {
        return this.lun;
    }

    @Import(name="sizeGb", required=true)
    private Output<Integer> sizeGb;

    public Output<Integer> sizeGb() {
        return this.sizeGb;
    }

    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    private StatefulNodeAzureDataDiskArgs() {}

    private StatefulNodeAzureDataDiskArgs(StatefulNodeAzureDataDiskArgs $) {
        this.lun = $.lun;
        this.sizeGb = $.sizeGb;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StatefulNodeAzureDataDiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StatefulNodeAzureDataDiskArgs $;

        public Builder() {
            $ = new StatefulNodeAzureDataDiskArgs();
        }

        public Builder(StatefulNodeAzureDataDiskArgs defaults) {
            $ = new StatefulNodeAzureDataDiskArgs(Objects.requireNonNull(defaults));
        }

        public Builder lun(Output<Integer> lun) {
            $.lun = lun;
            return this;
        }

        public Builder lun(Integer lun) {
            return lun(Output.of(lun));
        }

        public Builder sizeGb(Output<Integer> sizeGb) {
            $.sizeGb = sizeGb;
            return this;
        }

        public Builder sizeGb(Integer sizeGb) {
            return sizeGb(Output.of(sizeGb));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public StatefulNodeAzureDataDiskArgs build() {
            $.lun = Objects.requireNonNull($.lun, "expected parameter 'lun' to be non-null");
            $.sizeGb = Objects.requireNonNull($.sizeGb, "expected parameter 'sizeGb' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
