// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OceanLaunchSpecElasticIpPoolTagSelectorArgs extends com.pulumi.resources.ResourceArgs {

    public static final OceanLaunchSpecElasticIpPoolTagSelectorArgs Empty = new OceanLaunchSpecElasticIpPoolTagSelectorArgs();

    /**
     * Elastic IP tag key. The Virtual Node Group will consider all Elastic IPs tagged with this tag as a part of the Elastic IP pool to use.
     * 
     */
    @Import(name="tagKey", required=true)
    private Output<String> tagKey;

    /**
     * @return Elastic IP tag key. The Virtual Node Group will consider all Elastic IPs tagged with this tag as a part of the Elastic IP pool to use.
     * 
     */
    public Output<String> tagKey() {
        return this.tagKey;
    }

    /**
     * Elastic IP tag value. Can be null.
     * 
     */
    @Import(name="tagValue")
    private @Nullable Output<String> tagValue;

    /**
     * @return Elastic IP tag value. Can be null.
     * 
     */
    public Optional<Output<String>> tagValue() {
        return Optional.ofNullable(this.tagValue);
    }

    private OceanLaunchSpecElasticIpPoolTagSelectorArgs() {}

    private OceanLaunchSpecElasticIpPoolTagSelectorArgs(OceanLaunchSpecElasticIpPoolTagSelectorArgs $) {
        this.tagKey = $.tagKey;
        this.tagValue = $.tagValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OceanLaunchSpecElasticIpPoolTagSelectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OceanLaunchSpecElasticIpPoolTagSelectorArgs $;

        public Builder() {
            $ = new OceanLaunchSpecElasticIpPoolTagSelectorArgs();
        }

        public Builder(OceanLaunchSpecElasticIpPoolTagSelectorArgs defaults) {
            $ = new OceanLaunchSpecElasticIpPoolTagSelectorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param tagKey Elastic IP tag key. The Virtual Node Group will consider all Elastic IPs tagged with this tag as a part of the Elastic IP pool to use.
         * 
         * @return builder
         * 
         */
        public Builder tagKey(Output<String> tagKey) {
            $.tagKey = tagKey;
            return this;
        }

        /**
         * @param tagKey Elastic IP tag key. The Virtual Node Group will consider all Elastic IPs tagged with this tag as a part of the Elastic IP pool to use.
         * 
         * @return builder
         * 
         */
        public Builder tagKey(String tagKey) {
            return tagKey(Output.of(tagKey));
        }

        /**
         * @param tagValue Elastic IP tag value. Can be null.
         * 
         * @return builder
         * 
         */
        public Builder tagValue(@Nullable Output<String> tagValue) {
            $.tagValue = tagValue;
            return this;
        }

        /**
         * @param tagValue Elastic IP tag value. Can be null.
         * 
         * @return builder
         * 
         */
        public Builder tagValue(String tagValue) {
            return tagValue(Output.of(tagValue));
        }

        public OceanLaunchSpecElasticIpPoolTagSelectorArgs build() {
            $.tagKey = Objects.requireNonNull($.tagKey, "expected parameter 'tagKey' to be non-null");
            return $;
        }
    }

}
