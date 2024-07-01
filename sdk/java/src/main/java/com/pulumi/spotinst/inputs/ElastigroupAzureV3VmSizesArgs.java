// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class ElastigroupAzureV3VmSizesArgs extends com.pulumi.resources.ResourceArgs {

    public static final ElastigroupAzureV3VmSizesArgs Empty = new ElastigroupAzureV3VmSizesArgs();

    @Import(name="odSizes", required=true)
    private Output<List<String>> odSizes;

    public Output<List<String>> odSizes() {
        return this.odSizes;
    }

    @Import(name="spotSizes", required=true)
    private Output<List<String>> spotSizes;

    public Output<List<String>> spotSizes() {
        return this.spotSizes;
    }

    private ElastigroupAzureV3VmSizesArgs() {}

    private ElastigroupAzureV3VmSizesArgs(ElastigroupAzureV3VmSizesArgs $) {
        this.odSizes = $.odSizes;
        this.spotSizes = $.spotSizes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ElastigroupAzureV3VmSizesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ElastigroupAzureV3VmSizesArgs $;

        public Builder() {
            $ = new ElastigroupAzureV3VmSizesArgs();
        }

        public Builder(ElastigroupAzureV3VmSizesArgs defaults) {
            $ = new ElastigroupAzureV3VmSizesArgs(Objects.requireNonNull(defaults));
        }

        public Builder odSizes(Output<List<String>> odSizes) {
            $.odSizes = odSizes;
            return this;
        }

        public Builder odSizes(List<String> odSizes) {
            return odSizes(Output.of(odSizes));
        }

        public Builder odSizes(String... odSizes) {
            return odSizes(List.of(odSizes));
        }

        public Builder spotSizes(Output<List<String>> spotSizes) {
            $.spotSizes = spotSizes;
            return this;
        }

        public Builder spotSizes(List<String> spotSizes) {
            return spotSizes(Output.of(spotSizes));
        }

        public Builder spotSizes(String... spotSizes) {
            return spotSizes(List.of(spotSizes));
        }

        public ElastigroupAzureV3VmSizesArgs build() {
            if ($.odSizes == null) {
                throw new MissingRequiredPropertyException("ElastigroupAzureV3VmSizesArgs", "odSizes");
            }
            if ($.spotSizes == null) {
                throw new MissingRequiredPropertyException("ElastigroupAzureV3VmSizesArgs", "spotSizes");
            }
            return $;
        }
    }

}
