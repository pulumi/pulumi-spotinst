// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ElastigroupResourceTagSpecification {
    /**
     * @return Tag specification for AMI resources.
     * 
     */
    private @Nullable Boolean shouldTagAmis;
    /**
     * @return Tag specification for ENI resources.
     * 
     */
    private @Nullable Boolean shouldTagEnis;
    /**
     * @return Tag specification for Snapshot resources.
     * 
     */
    private @Nullable Boolean shouldTagSnapshots;
    /**
     * @return Tag specification for Volume resources.
     * 
     */
    private @Nullable Boolean shouldTagVolumes;

    private ElastigroupResourceTagSpecification() {}
    /**
     * @return Tag specification for AMI resources.
     * 
     */
    public Optional<Boolean> shouldTagAmis() {
        return Optional.ofNullable(this.shouldTagAmis);
    }
    /**
     * @return Tag specification for ENI resources.
     * 
     */
    public Optional<Boolean> shouldTagEnis() {
        return Optional.ofNullable(this.shouldTagEnis);
    }
    /**
     * @return Tag specification for Snapshot resources.
     * 
     */
    public Optional<Boolean> shouldTagSnapshots() {
        return Optional.ofNullable(this.shouldTagSnapshots);
    }
    /**
     * @return Tag specification for Volume resources.
     * 
     */
    public Optional<Boolean> shouldTagVolumes() {
        return Optional.ofNullable(this.shouldTagVolumes);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ElastigroupResourceTagSpecification defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean shouldTagAmis;
        private @Nullable Boolean shouldTagEnis;
        private @Nullable Boolean shouldTagSnapshots;
        private @Nullable Boolean shouldTagVolumes;
        public Builder() {}
        public Builder(ElastigroupResourceTagSpecification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.shouldTagAmis = defaults.shouldTagAmis;
    	      this.shouldTagEnis = defaults.shouldTagEnis;
    	      this.shouldTagSnapshots = defaults.shouldTagSnapshots;
    	      this.shouldTagVolumes = defaults.shouldTagVolumes;
        }

        @CustomType.Setter
        public Builder shouldTagAmis(@Nullable Boolean shouldTagAmis) {

            this.shouldTagAmis = shouldTagAmis;
            return this;
        }
        @CustomType.Setter
        public Builder shouldTagEnis(@Nullable Boolean shouldTagEnis) {

            this.shouldTagEnis = shouldTagEnis;
            return this;
        }
        @CustomType.Setter
        public Builder shouldTagSnapshots(@Nullable Boolean shouldTagSnapshots) {

            this.shouldTagSnapshots = shouldTagSnapshots;
            return this;
        }
        @CustomType.Setter
        public Builder shouldTagVolumes(@Nullable Boolean shouldTagVolumes) {

            this.shouldTagVolumes = shouldTagVolumes;
            return this;
        }
        public ElastigroupResourceTagSpecification build() {
            final var _resultValue = new ElastigroupResourceTagSpecification();
            _resultValue.shouldTagAmis = shouldTagAmis;
            _resultValue.shouldTagEnis = shouldTagEnis;
            _resultValue.shouldTagSnapshots = shouldTagSnapshots;
            _resultValue.shouldTagVolumes = shouldTagVolumes;
            return _resultValue;
        }
    }
}
