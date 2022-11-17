// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.spotinst.aws.inputs.OceanLaunchSpecElasticIpPoolTagSelectorArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OceanLaunchSpecElasticIpPoolArgs extends com.pulumi.resources.ResourceArgs {

    public static final OceanLaunchSpecElasticIpPoolArgs Empty = new OceanLaunchSpecElasticIpPoolArgs();

    /**
     * A key-value pair, which defines an Elastic IP from the customer pool. Can be null.
     * 
     */
    @Import(name="tagSelector")
    private @Nullable Output<OceanLaunchSpecElasticIpPoolTagSelectorArgs> tagSelector;

    /**
     * @return A key-value pair, which defines an Elastic IP from the customer pool. Can be null.
     * 
     */
    public Optional<Output<OceanLaunchSpecElasticIpPoolTagSelectorArgs>> tagSelector() {
        return Optional.ofNullable(this.tagSelector);
    }

    private OceanLaunchSpecElasticIpPoolArgs() {}

    private OceanLaunchSpecElasticIpPoolArgs(OceanLaunchSpecElasticIpPoolArgs $) {
        this.tagSelector = $.tagSelector;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OceanLaunchSpecElasticIpPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OceanLaunchSpecElasticIpPoolArgs $;

        public Builder() {
            $ = new OceanLaunchSpecElasticIpPoolArgs();
        }

        public Builder(OceanLaunchSpecElasticIpPoolArgs defaults) {
            $ = new OceanLaunchSpecElasticIpPoolArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param tagSelector A key-value pair, which defines an Elastic IP from the customer pool. Can be null.
         * 
         * @return builder
         * 
         */
        public Builder tagSelector(@Nullable Output<OceanLaunchSpecElasticIpPoolTagSelectorArgs> tagSelector) {
            $.tagSelector = tagSelector;
            return this;
        }

        /**
         * @param tagSelector A key-value pair, which defines an Elastic IP from the customer pool. Can be null.
         * 
         * @return builder
         * 
         */
        public Builder tagSelector(OceanLaunchSpecElasticIpPoolTagSelectorArgs tagSelector) {
            return tagSelector(Output.of(tagSelector));
        }

        public OceanLaunchSpecElasticIpPoolArgs build() {
            return $;
        }
    }

}
