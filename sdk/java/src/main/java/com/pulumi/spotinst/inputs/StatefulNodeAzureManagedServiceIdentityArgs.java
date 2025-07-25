// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StatefulNodeAzureManagedServiceIdentityArgs extends com.pulumi.resources.ResourceArgs {

    public static final StatefulNodeAzureManagedServiceIdentityArgs Empty = new StatefulNodeAzureManagedServiceIdentityArgs();

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

    @Import(name="subscriptionId")
    private @Nullable Output<String> subscriptionId;

    public Optional<Output<String>> subscriptionId() {
        return Optional.ofNullable(this.subscriptionId);
    }

    private StatefulNodeAzureManagedServiceIdentityArgs() {}

    private StatefulNodeAzureManagedServiceIdentityArgs(StatefulNodeAzureManagedServiceIdentityArgs $) {
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.subscriptionId = $.subscriptionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StatefulNodeAzureManagedServiceIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StatefulNodeAzureManagedServiceIdentityArgs $;

        public Builder() {
            $ = new StatefulNodeAzureManagedServiceIdentityArgs();
        }

        public Builder(StatefulNodeAzureManagedServiceIdentityArgs defaults) {
            $ = new StatefulNodeAzureManagedServiceIdentityArgs(Objects.requireNonNull(defaults));
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

        public Builder subscriptionId(@Nullable Output<String> subscriptionId) {
            $.subscriptionId = subscriptionId;
            return this;
        }

        public Builder subscriptionId(String subscriptionId) {
            return subscriptionId(Output.of(subscriptionId));
        }

        public StatefulNodeAzureManagedServiceIdentityArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("StatefulNodeAzureManagedServiceIdentityArgs", "name");
            }
            if ($.resourceGroupName == null) {
                throw new MissingRequiredPropertyException("StatefulNodeAzureManagedServiceIdentityArgs", "resourceGroupName");
            }
            return $;
        }
    }

}
