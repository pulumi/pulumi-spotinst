// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.oceancd.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RolloutSpecTrafficSmiArgs extends com.pulumi.resources.ResourceArgs {

    public static final RolloutSpecTrafficSmiArgs Empty = new RolloutSpecTrafficSmiArgs();

    /**
     * Holds the name of service that clients use to communicate.
     * 
     */
    @Import(name="smiRootService")
    private @Nullable Output<String> smiRootService;

    /**
     * @return Holds the name of service that clients use to communicate.
     * 
     */
    public Optional<Output<String>> smiRootService() {
        return Optional.ofNullable(this.smiRootService);
    }

    /**
     * Holds the name of the TrafficSplit.
     * 
     */
    @Import(name="trafficSplitName")
    private @Nullable Output<String> trafficSplitName;

    /**
     * @return Holds the name of the TrafficSplit.
     * 
     */
    public Optional<Output<String>> trafficSplitName() {
        return Optional.ofNullable(this.trafficSplitName);
    }

    private RolloutSpecTrafficSmiArgs() {}

    private RolloutSpecTrafficSmiArgs(RolloutSpecTrafficSmiArgs $) {
        this.smiRootService = $.smiRootService;
        this.trafficSplitName = $.trafficSplitName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RolloutSpecTrafficSmiArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RolloutSpecTrafficSmiArgs $;

        public Builder() {
            $ = new RolloutSpecTrafficSmiArgs();
        }

        public Builder(RolloutSpecTrafficSmiArgs defaults) {
            $ = new RolloutSpecTrafficSmiArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param smiRootService Holds the name of service that clients use to communicate.
         * 
         * @return builder
         * 
         */
        public Builder smiRootService(@Nullable Output<String> smiRootService) {
            $.smiRootService = smiRootService;
            return this;
        }

        /**
         * @param smiRootService Holds the name of service that clients use to communicate.
         * 
         * @return builder
         * 
         */
        public Builder smiRootService(String smiRootService) {
            return smiRootService(Output.of(smiRootService));
        }

        /**
         * @param trafficSplitName Holds the name of the TrafficSplit.
         * 
         * @return builder
         * 
         */
        public Builder trafficSplitName(@Nullable Output<String> trafficSplitName) {
            $.trafficSplitName = trafficSplitName;
            return this;
        }

        /**
         * @param trafficSplitName Holds the name of the TrafficSplit.
         * 
         * @return builder
         * 
         */
        public Builder trafficSplitName(String trafficSplitName) {
            return trafficSplitName(Output.of(trafficSplitName));
        }

        public RolloutSpecTrafficSmiArgs build() {
            return $;
        }
    }

}
