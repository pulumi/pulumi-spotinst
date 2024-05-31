// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.spotinst.inputs.ElastigroupAzureV3ImageArgs;
import com.pulumi.spotinst.inputs.ElastigroupAzureV3LoginArgs;
import com.pulumi.spotinst.inputs.ElastigroupAzureV3ManagedServiceIdentityArgs;
import com.pulumi.spotinst.inputs.ElastigroupAzureV3NetworkArgs;
import com.pulumi.spotinst.inputs.ElastigroupAzureV3TagArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ElastigroupAzureV3State extends com.pulumi.resources.ResourceArgs {

    public static final ElastigroupAzureV3State Empty = new ElastigroupAzureV3State();

    @Import(name="customData")
    private @Nullable Output<String> customData;

    public Optional<Output<String>> customData() {
        return Optional.ofNullable(this.customData);
    }

    @Import(name="desiredCapacity")
    private @Nullable Output<Integer> desiredCapacity;

    public Optional<Output<Integer>> desiredCapacity() {
        return Optional.ofNullable(this.desiredCapacity);
    }

    @Import(name="drainingTimeout")
    private @Nullable Output<Integer> drainingTimeout;

    public Optional<Output<Integer>> drainingTimeout() {
        return Optional.ofNullable(this.drainingTimeout);
    }

    @Import(name="fallbackToOnDemand")
    private @Nullable Output<Boolean> fallbackToOnDemand;

    public Optional<Output<Boolean>> fallbackToOnDemand() {
        return Optional.ofNullable(this.fallbackToOnDemand);
    }

    @Import(name="images")
    private @Nullable Output<List<ElastigroupAzureV3ImageArgs>> images;

    public Optional<Output<List<ElastigroupAzureV3ImageArgs>>> images() {
        return Optional.ofNullable(this.images);
    }

    @Import(name="login")
    private @Nullable Output<ElastigroupAzureV3LoginArgs> login;

    public Optional<Output<ElastigroupAzureV3LoginArgs>> login() {
        return Optional.ofNullable(this.login);
    }

    @Import(name="managedServiceIdentities")
    private @Nullable Output<List<ElastigroupAzureV3ManagedServiceIdentityArgs>> managedServiceIdentities;

    public Optional<Output<List<ElastigroupAzureV3ManagedServiceIdentityArgs>>> managedServiceIdentities() {
        return Optional.ofNullable(this.managedServiceIdentities);
    }

    @Import(name="maxSize")
    private @Nullable Output<Integer> maxSize;

    public Optional<Output<Integer>> maxSize() {
        return Optional.ofNullable(this.maxSize);
    }

    @Import(name="minSize")
    private @Nullable Output<Integer> minSize;

    public Optional<Output<Integer>> minSize() {
        return Optional.ofNullable(this.minSize);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="network")
    private @Nullable Output<ElastigroupAzureV3NetworkArgs> network;

    public Optional<Output<ElastigroupAzureV3NetworkArgs>> network() {
        return Optional.ofNullable(this.network);
    }

    @Import(name="odSizes")
    private @Nullable Output<List<String>> odSizes;

    public Optional<Output<List<String>>> odSizes() {
        return Optional.ofNullable(this.odSizes);
    }

    @Import(name="onDemandCount")
    private @Nullable Output<Integer> onDemandCount;

    public Optional<Output<Integer>> onDemandCount() {
        return Optional.ofNullable(this.onDemandCount);
    }

    @Import(name="os")
    private @Nullable Output<String> os;

    public Optional<Output<String>> os() {
        return Optional.ofNullable(this.os);
    }

    @Import(name="region")
    private @Nullable Output<String> region;

    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    @Import(name="spotPercentage")
    private @Nullable Output<Integer> spotPercentage;

    public Optional<Output<Integer>> spotPercentage() {
        return Optional.ofNullable(this.spotPercentage);
    }

    @Import(name="spotSizes")
    private @Nullable Output<List<String>> spotSizes;

    public Optional<Output<List<String>>> spotSizes() {
        return Optional.ofNullable(this.spotSizes);
    }

    @Import(name="tags")
    private @Nullable Output<List<ElastigroupAzureV3TagArgs>> tags;

    public Optional<Output<List<ElastigroupAzureV3TagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private ElastigroupAzureV3State() {}

    private ElastigroupAzureV3State(ElastigroupAzureV3State $) {
        this.customData = $.customData;
        this.desiredCapacity = $.desiredCapacity;
        this.drainingTimeout = $.drainingTimeout;
        this.fallbackToOnDemand = $.fallbackToOnDemand;
        this.images = $.images;
        this.login = $.login;
        this.managedServiceIdentities = $.managedServiceIdentities;
        this.maxSize = $.maxSize;
        this.minSize = $.minSize;
        this.name = $.name;
        this.network = $.network;
        this.odSizes = $.odSizes;
        this.onDemandCount = $.onDemandCount;
        this.os = $.os;
        this.region = $.region;
        this.resourceGroupName = $.resourceGroupName;
        this.spotPercentage = $.spotPercentage;
        this.spotSizes = $.spotSizes;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ElastigroupAzureV3State defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ElastigroupAzureV3State $;

        public Builder() {
            $ = new ElastigroupAzureV3State();
        }

        public Builder(ElastigroupAzureV3State defaults) {
            $ = new ElastigroupAzureV3State(Objects.requireNonNull(defaults));
        }

        public Builder customData(@Nullable Output<String> customData) {
            $.customData = customData;
            return this;
        }

        public Builder customData(String customData) {
            return customData(Output.of(customData));
        }

        public Builder desiredCapacity(@Nullable Output<Integer> desiredCapacity) {
            $.desiredCapacity = desiredCapacity;
            return this;
        }

        public Builder desiredCapacity(Integer desiredCapacity) {
            return desiredCapacity(Output.of(desiredCapacity));
        }

        public Builder drainingTimeout(@Nullable Output<Integer> drainingTimeout) {
            $.drainingTimeout = drainingTimeout;
            return this;
        }

        public Builder drainingTimeout(Integer drainingTimeout) {
            return drainingTimeout(Output.of(drainingTimeout));
        }

        public Builder fallbackToOnDemand(@Nullable Output<Boolean> fallbackToOnDemand) {
            $.fallbackToOnDemand = fallbackToOnDemand;
            return this;
        }

        public Builder fallbackToOnDemand(Boolean fallbackToOnDemand) {
            return fallbackToOnDemand(Output.of(fallbackToOnDemand));
        }

        public Builder images(@Nullable Output<List<ElastigroupAzureV3ImageArgs>> images) {
            $.images = images;
            return this;
        }

        public Builder images(List<ElastigroupAzureV3ImageArgs> images) {
            return images(Output.of(images));
        }

        public Builder images(ElastigroupAzureV3ImageArgs... images) {
            return images(List.of(images));
        }

        public Builder login(@Nullable Output<ElastigroupAzureV3LoginArgs> login) {
            $.login = login;
            return this;
        }

        public Builder login(ElastigroupAzureV3LoginArgs login) {
            return login(Output.of(login));
        }

        public Builder managedServiceIdentities(@Nullable Output<List<ElastigroupAzureV3ManagedServiceIdentityArgs>> managedServiceIdentities) {
            $.managedServiceIdentities = managedServiceIdentities;
            return this;
        }

        public Builder managedServiceIdentities(List<ElastigroupAzureV3ManagedServiceIdentityArgs> managedServiceIdentities) {
            return managedServiceIdentities(Output.of(managedServiceIdentities));
        }

        public Builder managedServiceIdentities(ElastigroupAzureV3ManagedServiceIdentityArgs... managedServiceIdentities) {
            return managedServiceIdentities(List.of(managedServiceIdentities));
        }

        public Builder maxSize(@Nullable Output<Integer> maxSize) {
            $.maxSize = maxSize;
            return this;
        }

        public Builder maxSize(Integer maxSize) {
            return maxSize(Output.of(maxSize));
        }

        public Builder minSize(@Nullable Output<Integer> minSize) {
            $.minSize = minSize;
            return this;
        }

        public Builder minSize(Integer minSize) {
            return minSize(Output.of(minSize));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder network(@Nullable Output<ElastigroupAzureV3NetworkArgs> network) {
            $.network = network;
            return this;
        }

        public Builder network(ElastigroupAzureV3NetworkArgs network) {
            return network(Output.of(network));
        }

        public Builder odSizes(@Nullable Output<List<String>> odSizes) {
            $.odSizes = odSizes;
            return this;
        }

        public Builder odSizes(List<String> odSizes) {
            return odSizes(Output.of(odSizes));
        }

        public Builder odSizes(String... odSizes) {
            return odSizes(List.of(odSizes));
        }

        public Builder onDemandCount(@Nullable Output<Integer> onDemandCount) {
            $.onDemandCount = onDemandCount;
            return this;
        }

        public Builder onDemandCount(Integer onDemandCount) {
            return onDemandCount(Output.of(onDemandCount));
        }

        public Builder os(@Nullable Output<String> os) {
            $.os = os;
            return this;
        }

        public Builder os(String os) {
            return os(Output.of(os));
        }

        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        public Builder region(String region) {
            return region(Output.of(region));
        }

        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder spotPercentage(@Nullable Output<Integer> spotPercentage) {
            $.spotPercentage = spotPercentage;
            return this;
        }

        public Builder spotPercentage(Integer spotPercentage) {
            return spotPercentage(Output.of(spotPercentage));
        }

        public Builder spotSizes(@Nullable Output<List<String>> spotSizes) {
            $.spotSizes = spotSizes;
            return this;
        }

        public Builder spotSizes(List<String> spotSizes) {
            return spotSizes(Output.of(spotSizes));
        }

        public Builder spotSizes(String... spotSizes) {
            return spotSizes(List.of(spotSizes));
        }

        public Builder tags(@Nullable Output<List<ElastigroupAzureV3TagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(List<ElastigroupAzureV3TagArgs> tags) {
            return tags(Output.of(tags));
        }

        public Builder tags(ElastigroupAzureV3TagArgs... tags) {
            return tags(List.of(tags));
        }

        public ElastigroupAzureV3State build() {
            return $;
        }
    }

}