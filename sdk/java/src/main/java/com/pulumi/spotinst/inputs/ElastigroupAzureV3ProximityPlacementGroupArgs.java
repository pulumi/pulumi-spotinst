// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class ElastigroupAzureV3ProximityPlacementGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final ElastigroupAzureV3ProximityPlacementGroupArgs Empty = new ElastigroupAzureV3ProximityPlacementGroupArgs();

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

    private ElastigroupAzureV3ProximityPlacementGroupArgs() {}

    private ElastigroupAzureV3ProximityPlacementGroupArgs(ElastigroupAzureV3ProximityPlacementGroupArgs $) {
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ElastigroupAzureV3ProximityPlacementGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ElastigroupAzureV3ProximityPlacementGroupArgs $;

        public Builder() {
            $ = new ElastigroupAzureV3ProximityPlacementGroupArgs();
        }

        public Builder(ElastigroupAzureV3ProximityPlacementGroupArgs defaults) {
            $ = new ElastigroupAzureV3ProximityPlacementGroupArgs(Objects.requireNonNull(defaults));
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

        public ElastigroupAzureV3ProximityPlacementGroupArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("ElastigroupAzureV3ProximityPlacementGroupArgs", "name");
            }
            if ($.resourceGroupName == null) {
                throw new MissingRequiredPropertyException("ElastigroupAzureV3ProximityPlacementGroupArgs", "resourceGroupName");
            }
            return $;
        }
    }

}
