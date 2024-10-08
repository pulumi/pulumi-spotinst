// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OceanLaunchSpecCreateOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final OceanLaunchSpecCreateOptionsArgs Empty = new OceanLaunchSpecCreateOptionsArgs();

    /**
     * When set to an integer greater than 0, a corresponding amount of nodes will be launched from the created Virtual Node Group. The parameter is recommended in case the use_as_template_only (in spotinst.aws.Ocean resource) is set to true during Ocean resource creation.
     * 
     */
    @Import(name="initialNodes")
    private @Nullable Output<Integer> initialNodes;

    /**
     * @return When set to an integer greater than 0, a corresponding amount of nodes will be launched from the created Virtual Node Group. The parameter is recommended in case the use_as_template_only (in spotinst.aws.Ocean resource) is set to true during Ocean resource creation.
     * 
     */
    public Optional<Output<Integer>> initialNodes() {
        return Optional.ofNullable(this.initialNodes);
    }

    private OceanLaunchSpecCreateOptionsArgs() {}

    private OceanLaunchSpecCreateOptionsArgs(OceanLaunchSpecCreateOptionsArgs $) {
        this.initialNodes = $.initialNodes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OceanLaunchSpecCreateOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OceanLaunchSpecCreateOptionsArgs $;

        public Builder() {
            $ = new OceanLaunchSpecCreateOptionsArgs();
        }

        public Builder(OceanLaunchSpecCreateOptionsArgs defaults) {
            $ = new OceanLaunchSpecCreateOptionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param initialNodes When set to an integer greater than 0, a corresponding amount of nodes will be launched from the created Virtual Node Group. The parameter is recommended in case the use_as_template_only (in spotinst.aws.Ocean resource) is set to true during Ocean resource creation.
         * 
         * @return builder
         * 
         */
        public Builder initialNodes(@Nullable Output<Integer> initialNodes) {
            $.initialNodes = initialNodes;
            return this;
        }

        /**
         * @param initialNodes When set to an integer greater than 0, a corresponding amount of nodes will be launched from the created Virtual Node Group. The parameter is recommended in case the use_as_template_only (in spotinst.aws.Ocean resource) is set to true during Ocean resource creation.
         * 
         * @return builder
         * 
         */
        public Builder initialNodes(Integer initialNodes) {
            return initialNodes(Output.of(initialNodes));
        }

        public OceanLaunchSpecCreateOptionsArgs build() {
            return $;
        }
    }

}