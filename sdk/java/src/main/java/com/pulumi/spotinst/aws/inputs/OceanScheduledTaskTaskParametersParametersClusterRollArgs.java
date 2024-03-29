// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OceanScheduledTaskTaskParametersParametersClusterRollArgs extends com.pulumi.resources.ResourceArgs {

    public static final OceanScheduledTaskTaskParametersParametersClusterRollArgs Empty = new OceanScheduledTaskTaskParametersParametersClusterRollArgs();

    @Import(name="batchMinHealthyPercentage")
    private @Nullable Output<Integer> batchMinHealthyPercentage;

    public Optional<Output<Integer>> batchMinHealthyPercentage() {
        return Optional.ofNullable(this.batchMinHealthyPercentage);
    }

    @Import(name="batchSizePercentage")
    private @Nullable Output<Integer> batchSizePercentage;

    public Optional<Output<Integer>> batchSizePercentage() {
        return Optional.ofNullable(this.batchSizePercentage);
    }

    @Import(name="comment")
    private @Nullable Output<String> comment;

    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    @Import(name="respectPdb")
    private @Nullable Output<Boolean> respectPdb;

    public Optional<Output<Boolean>> respectPdb() {
        return Optional.ofNullable(this.respectPdb);
    }

    private OceanScheduledTaskTaskParametersParametersClusterRollArgs() {}

    private OceanScheduledTaskTaskParametersParametersClusterRollArgs(OceanScheduledTaskTaskParametersParametersClusterRollArgs $) {
        this.batchMinHealthyPercentage = $.batchMinHealthyPercentage;
        this.batchSizePercentage = $.batchSizePercentage;
        this.comment = $.comment;
        this.respectPdb = $.respectPdb;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OceanScheduledTaskTaskParametersParametersClusterRollArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OceanScheduledTaskTaskParametersParametersClusterRollArgs $;

        public Builder() {
            $ = new OceanScheduledTaskTaskParametersParametersClusterRollArgs();
        }

        public Builder(OceanScheduledTaskTaskParametersParametersClusterRollArgs defaults) {
            $ = new OceanScheduledTaskTaskParametersParametersClusterRollArgs(Objects.requireNonNull(defaults));
        }

        public Builder batchMinHealthyPercentage(@Nullable Output<Integer> batchMinHealthyPercentage) {
            $.batchMinHealthyPercentage = batchMinHealthyPercentage;
            return this;
        }

        public Builder batchMinHealthyPercentage(Integer batchMinHealthyPercentage) {
            return batchMinHealthyPercentage(Output.of(batchMinHealthyPercentage));
        }

        public Builder batchSizePercentage(@Nullable Output<Integer> batchSizePercentage) {
            $.batchSizePercentage = batchSizePercentage;
            return this;
        }

        public Builder batchSizePercentage(Integer batchSizePercentage) {
            return batchSizePercentage(Output.of(batchSizePercentage));
        }

        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        public Builder respectPdb(@Nullable Output<Boolean> respectPdb) {
            $.respectPdb = respectPdb;
            return this;
        }

        public Builder respectPdb(Boolean respectPdb) {
            return respectPdb(Output.of(respectPdb));
        }

        public OceanScheduledTaskTaskParametersParametersClusterRollArgs build() {
            return $;
        }
    }

}
