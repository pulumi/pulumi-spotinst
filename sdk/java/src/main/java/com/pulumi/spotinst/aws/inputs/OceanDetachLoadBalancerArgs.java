// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OceanDetachLoadBalancerArgs extends com.pulumi.resources.ResourceArgs {

    public static final OceanDetachLoadBalancerArgs Empty = new OceanDetachLoadBalancerArgs();

    /**
     * If type is &#34;TARGET_GROUP&#34; then an ARN is required. Otherwise is not allowed.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return If type is &#34;TARGET_GROUP&#34; then an ARN is required. Otherwise is not allowed.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * If type is &#34;CLASSIC&#34; then a name is required. Otherwise is not allowed.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return If type is &#34;CLASSIC&#34; then a name is required. Otherwise is not allowed.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Type of load balancer to use.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Type of load balancer to use.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private OceanDetachLoadBalancerArgs() {}

    private OceanDetachLoadBalancerArgs(OceanDetachLoadBalancerArgs $) {
        this.arn = $.arn;
        this.name = $.name;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OceanDetachLoadBalancerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OceanDetachLoadBalancerArgs $;

        public Builder() {
            $ = new OceanDetachLoadBalancerArgs();
        }

        public Builder(OceanDetachLoadBalancerArgs defaults) {
            $ = new OceanDetachLoadBalancerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn If type is &#34;TARGET_GROUP&#34; then an ARN is required. Otherwise is not allowed.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn If type is &#34;TARGET_GROUP&#34; then an ARN is required. Otherwise is not allowed.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param name If type is &#34;CLASSIC&#34; then a name is required. Otherwise is not allowed.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name If type is &#34;CLASSIC&#34; then a name is required. Otherwise is not allowed.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param type Type of load balancer to use.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of load balancer to use.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public OceanDetachLoadBalancerArgs build() {
            if ($.type == null) {
                throw new MissingRequiredPropertyException("OceanDetachLoadBalancerArgs", "type");
            }
            return $;
        }
    }

}
