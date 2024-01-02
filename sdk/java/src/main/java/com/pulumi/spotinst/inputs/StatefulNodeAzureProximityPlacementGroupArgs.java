// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class StatefulNodeAzureProximityPlacementGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final StatefulNodeAzureProximityPlacementGroupArgs Empty = new StatefulNodeAzureProximityPlacementGroupArgs();

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

    private StatefulNodeAzureProximityPlacementGroupArgs() {}

    private StatefulNodeAzureProximityPlacementGroupArgs(StatefulNodeAzureProximityPlacementGroupArgs $) {
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StatefulNodeAzureProximityPlacementGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StatefulNodeAzureProximityPlacementGroupArgs $;

        public Builder() {
            $ = new StatefulNodeAzureProximityPlacementGroupArgs();
        }

        public Builder(StatefulNodeAzureProximityPlacementGroupArgs defaults) {
            $ = new StatefulNodeAzureProximityPlacementGroupArgs(Objects.requireNonNull(defaults));
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

        public StatefulNodeAzureProximityPlacementGroupArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("StatefulNodeAzureProximityPlacementGroupArgs", "name");
            }
            if ($.resourceGroupName == null) {
                throw new MissingRequiredPropertyException("StatefulNodeAzureProximityPlacementGroupArgs", "resourceGroupName");
            }
            return $;
        }
    }

}
