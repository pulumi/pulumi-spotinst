// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.azure.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OceanNpSchedulingTaskParametersParametersClusterRollArgs extends com.pulumi.resources.ResourceArgs {

    public static final OceanNpSchedulingTaskParametersParametersClusterRollArgs Empty = new OceanNpSchedulingTaskParametersParametersClusterRollArgs();

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

    @Import(name="respectRestrictScaleDown")
    private @Nullable Output<Boolean> respectRestrictScaleDown;

    public Optional<Output<Boolean>> respectRestrictScaleDown() {
        return Optional.ofNullable(this.respectRestrictScaleDown);
    }

    @Import(name="vngIds")
    private @Nullable Output<List<String>> vngIds;

    public Optional<Output<List<String>>> vngIds() {
        return Optional.ofNullable(this.vngIds);
    }

    private OceanNpSchedulingTaskParametersParametersClusterRollArgs() {}

    private OceanNpSchedulingTaskParametersParametersClusterRollArgs(OceanNpSchedulingTaskParametersParametersClusterRollArgs $) {
        this.batchMinHealthyPercentage = $.batchMinHealthyPercentage;
        this.batchSizePercentage = $.batchSizePercentage;
        this.comment = $.comment;
        this.respectPdb = $.respectPdb;
        this.respectRestrictScaleDown = $.respectRestrictScaleDown;
        this.vngIds = $.vngIds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OceanNpSchedulingTaskParametersParametersClusterRollArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OceanNpSchedulingTaskParametersParametersClusterRollArgs $;

        public Builder() {
            $ = new OceanNpSchedulingTaskParametersParametersClusterRollArgs();
        }

        public Builder(OceanNpSchedulingTaskParametersParametersClusterRollArgs defaults) {
            $ = new OceanNpSchedulingTaskParametersParametersClusterRollArgs(Objects.requireNonNull(defaults));
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

        public Builder respectRestrictScaleDown(@Nullable Output<Boolean> respectRestrictScaleDown) {
            $.respectRestrictScaleDown = respectRestrictScaleDown;
            return this;
        }

        public Builder respectRestrictScaleDown(Boolean respectRestrictScaleDown) {
            return respectRestrictScaleDown(Output.of(respectRestrictScaleDown));
        }

        public Builder vngIds(@Nullable Output<List<String>> vngIds) {
            $.vngIds = vngIds;
            return this;
        }

        public Builder vngIds(List<String> vngIds) {
            return vngIds(Output.of(vngIds));
        }

        public Builder vngIds(String... vngIds) {
            return vngIds(List.of(vngIds));
        }

        public OceanNpSchedulingTaskParametersParametersClusterRollArgs build() {
            return $;
        }
    }

}
