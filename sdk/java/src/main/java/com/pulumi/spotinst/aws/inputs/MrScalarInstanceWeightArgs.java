// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class MrScalarInstanceWeightArgs extends com.pulumi.resources.ResourceArgs {

    public static final MrScalarInstanceWeightArgs Empty = new MrScalarInstanceWeightArgs();

    @Import(name="instanceType", required=true)
    private Output<String> instanceType;

    public Output<String> instanceType() {
        return this.instanceType;
    }

    @Import(name="weightedCapacity", required=true)
    private Output<Integer> weightedCapacity;

    public Output<Integer> weightedCapacity() {
        return this.weightedCapacity;
    }

    private MrScalarInstanceWeightArgs() {}

    private MrScalarInstanceWeightArgs(MrScalarInstanceWeightArgs $) {
        this.instanceType = $.instanceType;
        this.weightedCapacity = $.weightedCapacity;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MrScalarInstanceWeightArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MrScalarInstanceWeightArgs $;

        public Builder() {
            $ = new MrScalarInstanceWeightArgs();
        }

        public Builder(MrScalarInstanceWeightArgs defaults) {
            $ = new MrScalarInstanceWeightArgs(Objects.requireNonNull(defaults));
        }

        public Builder instanceType(Output<String> instanceType) {
            $.instanceType = instanceType;
            return this;
        }

        public Builder instanceType(String instanceType) {
            return instanceType(Output.of(instanceType));
        }

        public Builder weightedCapacity(Output<Integer> weightedCapacity) {
            $.weightedCapacity = weightedCapacity;
            return this;
        }

        public Builder weightedCapacity(Integer weightedCapacity) {
            return weightedCapacity(Output.of(weightedCapacity));
        }

        public MrScalarInstanceWeightArgs build() {
            if ($.instanceType == null) {
                throw new MissingRequiredPropertyException("MrScalarInstanceWeightArgs", "instanceType");
            }
            if ($.weightedCapacity == null) {
                throw new MissingRequiredPropertyException("MrScalarInstanceWeightArgs", "weightedCapacity");
            }
            return $;
        }
    }

}
