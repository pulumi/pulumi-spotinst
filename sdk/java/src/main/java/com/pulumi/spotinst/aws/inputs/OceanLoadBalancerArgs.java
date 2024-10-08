// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OceanLoadBalancerArgs extends com.pulumi.resources.ResourceArgs {

    public static final OceanLoadBalancerArgs Empty = new OceanLoadBalancerArgs();

    /**
     * Required if type is set to `TARGET_GROUP`
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return Required if type is set to `TARGET_GROUP`
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * Required if type is set to `CLASSIC`
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Required if type is set to `CLASSIC`
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Can be set to `CLASSIC` or `TARGET_GROUP`
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Can be set to `CLASSIC` or `TARGET_GROUP`
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private OceanLoadBalancerArgs() {}

    private OceanLoadBalancerArgs(OceanLoadBalancerArgs $) {
        this.arn = $.arn;
        this.name = $.name;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OceanLoadBalancerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OceanLoadBalancerArgs $;

        public Builder() {
            $ = new OceanLoadBalancerArgs();
        }

        public Builder(OceanLoadBalancerArgs defaults) {
            $ = new OceanLoadBalancerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn Required if type is set to `TARGET_GROUP`
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn Required if type is set to `TARGET_GROUP`
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param name Required if type is set to `CLASSIC`
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Required if type is set to `CLASSIC`
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param type Can be set to `CLASSIC` or `TARGET_GROUP`
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Can be set to `CLASSIC` or `TARGET_GROUP`
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public OceanLoadBalancerArgs build() {
            return $;
        }
    }

}