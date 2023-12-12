// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ElastigroupEphemeralBlockDevice {
    /**
     * @return The name of the block device to mount on the instance.
     * 
     */
    private String deviceName;
    /**
     * @return The [Instance Store Device Name](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html#InstanceStoreDeviceNames)
     * (e.g. `&#34;ephemeral0&#34;`).
     * 
     * Usage:
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *     }
     * }
     * ```
     * 
     */
    private String virtualName;

    private ElastigroupEphemeralBlockDevice() {}
    /**
     * @return The name of the block device to mount on the instance.
     * 
     */
    public String deviceName() {
        return this.deviceName;
    }
    /**
     * @return The [Instance Store Device Name](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html#InstanceStoreDeviceNames)
     * (e.g. `&#34;ephemeral0&#34;`).
     * 
     * Usage:
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *     }
     * }
     * ```
     * 
     */
    public String virtualName() {
        return this.virtualName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ElastigroupEphemeralBlockDevice defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String deviceName;
        private String virtualName;
        public Builder() {}
        public Builder(ElastigroupEphemeralBlockDevice defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceName = defaults.deviceName;
    	      this.virtualName = defaults.virtualName;
        }

        @CustomType.Setter
        public Builder deviceName(String deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }
        @CustomType.Setter
        public Builder virtualName(String virtualName) {
            this.virtualName = Objects.requireNonNull(virtualName);
            return this;
        }
        public ElastigroupEphemeralBlockDevice build() {
            final var _resultValue = new ElastigroupEphemeralBlockDevice();
            _resultValue.deviceName = deviceName;
            _resultValue.virtualName = virtualName;
            return _resultValue;
        }
    }
}
