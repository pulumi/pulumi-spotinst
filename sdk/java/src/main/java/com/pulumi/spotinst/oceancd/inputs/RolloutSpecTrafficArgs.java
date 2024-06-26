// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.oceancd.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.spotinst.oceancd.inputs.RolloutSpecTrafficAlbArgs;
import com.pulumi.spotinst.oceancd.inputs.RolloutSpecTrafficAmbassadorArgs;
import com.pulumi.spotinst.oceancd.inputs.RolloutSpecTrafficIstioArgs;
import com.pulumi.spotinst.oceancd.inputs.RolloutSpecTrafficNginxArgs;
import com.pulumi.spotinst.oceancd.inputs.RolloutSpecTrafficPingPongArgs;
import com.pulumi.spotinst.oceancd.inputs.RolloutSpecTrafficSmiArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RolloutSpecTrafficArgs extends com.pulumi.resources.ResourceArgs {

    public static final RolloutSpecTrafficArgs Empty = new RolloutSpecTrafficArgs();

    /**
     * Holds ALB Ingress specific configuration to route traffic.
     * 
     */
    @Import(name="alb")
    private @Nullable Output<RolloutSpecTrafficAlbArgs> alb;

    /**
     * @return Holds ALB Ingress specific configuration to route traffic.
     * 
     */
    public Optional<Output<RolloutSpecTrafficAlbArgs>> alb() {
        return Optional.ofNullable(this.alb);
    }

    /**
     * Holds specific configuration to use Ambassador to route traffic.
     * 
     */
    @Import(name="ambassador")
    private @Nullable Output<RolloutSpecTrafficAmbassadorArgs> ambassador;

    /**
     * @return Holds specific configuration to use Ambassador to route traffic.
     * 
     */
    public Optional<Output<RolloutSpecTrafficAmbassadorArgs>> ambassador() {
        return Optional.ofNullable(this.ambassador);
    }

    /**
     * The canary service name.
     * 
     */
    @Import(name="canaryService")
    private @Nullable Output<String> canaryService;

    /**
     * @return The canary service name.
     * 
     */
    public Optional<Output<String>> canaryService() {
        return Optional.ofNullable(this.canaryService);
    }

    /**
     * Holds Istio specific configuration to route traffic.
     * 
     */
    @Import(name="istio")
    private @Nullable Output<RolloutSpecTrafficIstioArgs> istio;

    /**
     * @return Holds Istio specific configuration to route traffic.
     * 
     */
    public Optional<Output<RolloutSpecTrafficIstioArgs>> istio() {
        return Optional.ofNullable(this.istio);
    }

    /**
     * Holds Nginx Ingress specific configuration to route traffic.
     * 
     */
    @Import(name="nginx")
    private @Nullable Output<RolloutSpecTrafficNginxArgs> nginx;

    /**
     * @return Holds Nginx Ingress specific configuration to route traffic.
     * 
     */
    public Optional<Output<RolloutSpecTrafficNginxArgs>> nginx() {
        return Optional.ofNullable(this.nginx);
    }

    /**
     * Holds the ping and pong services. You can use `pingPong` field only when using ALB as a traffic manager with the IP Mode approach.
     * 
     */
    @Import(name="pingPong")
    private @Nullable Output<RolloutSpecTrafficPingPongArgs> pingPong;

    /**
     * @return Holds the ping and pong services. You can use `pingPong` field only when using ALB as a traffic manager with the IP Mode approach.
     * 
     */
    public Optional<Output<RolloutSpecTrafficPingPongArgs>> pingPong() {
        return Optional.ofNullable(this.pingPong);
    }

    /**
     * Holds TrafficSplit specific configuration to route traffic.
     * 
     */
    @Import(name="smi")
    private @Nullable Output<RolloutSpecTrafficSmiArgs> smi;

    /**
     * @return Holds TrafficSplit specific configuration to route traffic.
     * 
     */
    public Optional<Output<RolloutSpecTrafficSmiArgs>> smi() {
        return Optional.ofNullable(this.smi);
    }

    /**
     * The stable service name.
     * 
     */
    @Import(name="stableService")
    private @Nullable Output<String> stableService;

    /**
     * @return The stable service name.
     * 
     */
    public Optional<Output<String>> stableService() {
        return Optional.ofNullable(this.stableService);
    }

    private RolloutSpecTrafficArgs() {}

    private RolloutSpecTrafficArgs(RolloutSpecTrafficArgs $) {
        this.alb = $.alb;
        this.ambassador = $.ambassador;
        this.canaryService = $.canaryService;
        this.istio = $.istio;
        this.nginx = $.nginx;
        this.pingPong = $.pingPong;
        this.smi = $.smi;
        this.stableService = $.stableService;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RolloutSpecTrafficArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RolloutSpecTrafficArgs $;

        public Builder() {
            $ = new RolloutSpecTrafficArgs();
        }

        public Builder(RolloutSpecTrafficArgs defaults) {
            $ = new RolloutSpecTrafficArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param alb Holds ALB Ingress specific configuration to route traffic.
         * 
         * @return builder
         * 
         */
        public Builder alb(@Nullable Output<RolloutSpecTrafficAlbArgs> alb) {
            $.alb = alb;
            return this;
        }

        /**
         * @param alb Holds ALB Ingress specific configuration to route traffic.
         * 
         * @return builder
         * 
         */
        public Builder alb(RolloutSpecTrafficAlbArgs alb) {
            return alb(Output.of(alb));
        }

        /**
         * @param ambassador Holds specific configuration to use Ambassador to route traffic.
         * 
         * @return builder
         * 
         */
        public Builder ambassador(@Nullable Output<RolloutSpecTrafficAmbassadorArgs> ambassador) {
            $.ambassador = ambassador;
            return this;
        }

        /**
         * @param ambassador Holds specific configuration to use Ambassador to route traffic.
         * 
         * @return builder
         * 
         */
        public Builder ambassador(RolloutSpecTrafficAmbassadorArgs ambassador) {
            return ambassador(Output.of(ambassador));
        }

        /**
         * @param canaryService The canary service name.
         * 
         * @return builder
         * 
         */
        public Builder canaryService(@Nullable Output<String> canaryService) {
            $.canaryService = canaryService;
            return this;
        }

        /**
         * @param canaryService The canary service name.
         * 
         * @return builder
         * 
         */
        public Builder canaryService(String canaryService) {
            return canaryService(Output.of(canaryService));
        }

        /**
         * @param istio Holds Istio specific configuration to route traffic.
         * 
         * @return builder
         * 
         */
        public Builder istio(@Nullable Output<RolloutSpecTrafficIstioArgs> istio) {
            $.istio = istio;
            return this;
        }

        /**
         * @param istio Holds Istio specific configuration to route traffic.
         * 
         * @return builder
         * 
         */
        public Builder istio(RolloutSpecTrafficIstioArgs istio) {
            return istio(Output.of(istio));
        }

        /**
         * @param nginx Holds Nginx Ingress specific configuration to route traffic.
         * 
         * @return builder
         * 
         */
        public Builder nginx(@Nullable Output<RolloutSpecTrafficNginxArgs> nginx) {
            $.nginx = nginx;
            return this;
        }

        /**
         * @param nginx Holds Nginx Ingress specific configuration to route traffic.
         * 
         * @return builder
         * 
         */
        public Builder nginx(RolloutSpecTrafficNginxArgs nginx) {
            return nginx(Output.of(nginx));
        }

        /**
         * @param pingPong Holds the ping and pong services. You can use `pingPong` field only when using ALB as a traffic manager with the IP Mode approach.
         * 
         * @return builder
         * 
         */
        public Builder pingPong(@Nullable Output<RolloutSpecTrafficPingPongArgs> pingPong) {
            $.pingPong = pingPong;
            return this;
        }

        /**
         * @param pingPong Holds the ping and pong services. You can use `pingPong` field only when using ALB as a traffic manager with the IP Mode approach.
         * 
         * @return builder
         * 
         */
        public Builder pingPong(RolloutSpecTrafficPingPongArgs pingPong) {
            return pingPong(Output.of(pingPong));
        }

        /**
         * @param smi Holds TrafficSplit specific configuration to route traffic.
         * 
         * @return builder
         * 
         */
        public Builder smi(@Nullable Output<RolloutSpecTrafficSmiArgs> smi) {
            $.smi = smi;
            return this;
        }

        /**
         * @param smi Holds TrafficSplit specific configuration to route traffic.
         * 
         * @return builder
         * 
         */
        public Builder smi(RolloutSpecTrafficSmiArgs smi) {
            return smi(Output.of(smi));
        }

        /**
         * @param stableService The stable service name.
         * 
         * @return builder
         * 
         */
        public Builder stableService(@Nullable Output<String> stableService) {
            $.stableService = stableService;
            return this;
        }

        /**
         * @param stableService The stable service name.
         * 
         * @return builder
         * 
         */
        public Builder stableService(String stableService) {
            return stableService(Output.of(stableService));
        }

        public RolloutSpecTrafficArgs build() {
            return $;
        }
    }

}
