// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.oceancd.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RolloutSpecTrafficAlbStickinessConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final RolloutSpecTrafficAlbStickinessConfigArgs Empty = new RolloutSpecTrafficAlbStickinessConfigArgs();

    /**
     * Defines how long the load balancer should consistently route the user&#39;s request to the same target.
     * 
     */
    @Import(name="durationSeconds")
    private @Nullable Output<Integer> durationSeconds;

    /**
     * @return Defines how long the load balancer should consistently route the user&#39;s request to the same target.
     * 
     */
    public Optional<Output<Integer>> durationSeconds() {
        return Optional.ofNullable(this.durationSeconds);
    }

    /**
     * Enables the load balancer to bind a user&#39;s session to a specific target.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Enables the load balancer to bind a user&#39;s session to a specific target.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    private RolloutSpecTrafficAlbStickinessConfigArgs() {}

    private RolloutSpecTrafficAlbStickinessConfigArgs(RolloutSpecTrafficAlbStickinessConfigArgs $) {
        this.durationSeconds = $.durationSeconds;
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RolloutSpecTrafficAlbStickinessConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RolloutSpecTrafficAlbStickinessConfigArgs $;

        public Builder() {
            $ = new RolloutSpecTrafficAlbStickinessConfigArgs();
        }

        public Builder(RolloutSpecTrafficAlbStickinessConfigArgs defaults) {
            $ = new RolloutSpecTrafficAlbStickinessConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param durationSeconds Defines how long the load balancer should consistently route the user&#39;s request to the same target.
         * 
         * @return builder
         * 
         */
        public Builder durationSeconds(@Nullable Output<Integer> durationSeconds) {
            $.durationSeconds = durationSeconds;
            return this;
        }

        /**
         * @param durationSeconds Defines how long the load balancer should consistently route the user&#39;s request to the same target.
         * 
         * @return builder
         * 
         */
        public Builder durationSeconds(Integer durationSeconds) {
            return durationSeconds(Output.of(durationSeconds));
        }

        /**
         * @param enabled Enables the load balancer to bind a user&#39;s session to a specific target.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Enables the load balancer to bind a user&#39;s session to a specific target.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public RolloutSpecTrafficAlbStickinessConfigArgs build() {
            return $;
        }
    }

}
