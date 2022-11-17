// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StatefulNodeAzureLoadBalancerArgs extends com.pulumi.resources.ResourceArgs {

    public static final StatefulNodeAzureLoadBalancerArgs Empty = new StatefulNodeAzureLoadBalancerArgs();

    @Import(name="backendPoolNames", required=true)
    private Output<List<String>> backendPoolNames;

    public Output<List<String>> backendPoolNames() {
        return this.backendPoolNames;
    }

    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    @Import(name="sku")
    private @Nullable Output<String> sku;

    public Optional<Output<String>> sku() {
        return Optional.ofNullable(this.sku);
    }

    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    private StatefulNodeAzureLoadBalancerArgs() {}

    private StatefulNodeAzureLoadBalancerArgs(StatefulNodeAzureLoadBalancerArgs $) {
        this.backendPoolNames = $.backendPoolNames;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.sku = $.sku;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StatefulNodeAzureLoadBalancerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StatefulNodeAzureLoadBalancerArgs $;

        public Builder() {
            $ = new StatefulNodeAzureLoadBalancerArgs();
        }

        public Builder(StatefulNodeAzureLoadBalancerArgs defaults) {
            $ = new StatefulNodeAzureLoadBalancerArgs(Objects.requireNonNull(defaults));
        }

        public Builder backendPoolNames(Output<List<String>> backendPoolNames) {
            $.backendPoolNames = backendPoolNames;
            return this;
        }

        public Builder backendPoolNames(List<String> backendPoolNames) {
            return backendPoolNames(Output.of(backendPoolNames));
        }

        public Builder backendPoolNames(String... backendPoolNames) {
            return backendPoolNames(List.of(backendPoolNames));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder sku(@Nullable Output<String> sku) {
            $.sku = sku;
            return this;
        }

        public Builder sku(String sku) {
            return sku(Output.of(sku));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public StatefulNodeAzureLoadBalancerArgs build() {
            $.backendPoolNames = Objects.requireNonNull($.backendPoolNames, "expected parameter 'backendPoolNames' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
