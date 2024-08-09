// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.spotinst.Utilities;
import com.pulumi.spotinst.aws.MrScalarArgs;
import com.pulumi.spotinst.aws.inputs.MrScalarState;
import com.pulumi.spotinst.aws.outputs.MrScalarApplication;
import com.pulumi.spotinst.aws.outputs.MrScalarBootstrapActionsFile;
import com.pulumi.spotinst.aws.outputs.MrScalarConfigurationsFile;
import com.pulumi.spotinst.aws.outputs.MrScalarCoreEbsBlockDevice;
import com.pulumi.spotinst.aws.outputs.MrScalarCoreScalingDownPolicy;
import com.pulumi.spotinst.aws.outputs.MrScalarCoreScalingUpPolicy;
import com.pulumi.spotinst.aws.outputs.MrScalarInstanceWeight;
import com.pulumi.spotinst.aws.outputs.MrScalarMasterEbsBlockDevice;
import com.pulumi.spotinst.aws.outputs.MrScalarProvisioningTimeout;
import com.pulumi.spotinst.aws.outputs.MrScalarScheduledTask;
import com.pulumi.spotinst.aws.outputs.MrScalarStepsFile;
import com.pulumi.spotinst.aws.outputs.MrScalarTag;
import com.pulumi.spotinst.aws.outputs.MrScalarTaskEbsBlockDevice;
import com.pulumi.spotinst.aws.outputs.MrScalarTaskScalingDownPolicy;
import com.pulumi.spotinst.aws.outputs.MrScalarTaskScalingUpPolicy;
import com.pulumi.spotinst.aws.outputs.MrScalarTerminationPolicy;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Spotinst AWS MrScaler resource.
 * 
 * ## Example Usage
 * 
 * ### New Strategy
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.spotinst.aws.MrScalar;
 * import com.pulumi.spotinst.aws.MrScalarArgs;
 * import com.pulumi.spotinst.aws.inputs.MrScalarMasterEbsBlockDeviceArgs;
 * import com.pulumi.spotinst.aws.inputs.MrScalarCoreEbsBlockDeviceArgs;
 * import com.pulumi.spotinst.aws.inputs.MrScalarTaskEbsBlockDeviceArgs;
 * import com.pulumi.spotinst.aws.inputs.MrScalarTagArgs;
 * import com.pulumi.spotinst.aws.inputs.MrScalarTaskScalingDownPolicyArgs;
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
 *         var sample_MrScaler_01 = new MrScalar("sample-MrScaler-01", MrScalarArgs.builder()
 *             .name("sample-MrScaler-01")
 *             .description("Testing MrScaler creation")
 *             .region("us-west-2")
 *             .strategy("clone")
 *             .clusterId("j-123456789")
 *             .exposeClusterId(true)
 *             .availabilityZones("us-west-2a:subnet-12345678")
 *             .masterInstanceTypes("c3.xlarge")
 *             .masterLifecycle("SPOT")
 *             .masterEbsOptimized(true)
 *             .masterTarget(1)
 *             .masterEbsBlockDevices(MrScalarMasterEbsBlockDeviceArgs.builder()
 *                 .volumesPerInstance(1)
 *                 .volumeType("gp2")
 *                 .sizeInGb(30)
 *                 .build())
 *             .coreInstanceTypes(            
 *                 "c3.xlarge",
 *                 "c4.xlarge")
 *             .coreMinSize(1)
 *             .coreMaxSize(1)
 *             .coreDesiredCapacity(1)
 *             .coreLifecycle("ON_DEMAND")
 *             .coreEbsOptimized(false)
 *             .coreUnit("instance")
 *             .coreEbsBlockDevices(MrScalarCoreEbsBlockDeviceArgs.builder()
 *                 .volumesPerInstance(2)
 *                 .volumeType("gp2")
 *                 .sizeInGb(40)
 *                 .build())
 *             .taskInstanceTypes(            
 *                 "c3.xlarge",
 *                 "c4.xlarge")
 *             .taskMinSize(0)
 *             .taskMaxSize(30)
 *             .taskDesiredCapacity(1)
 *             .taskLifecycle("SPOT")
 *             .taskEbsOptimized(false)
 *             .taskUnit("instance")
 *             .taskEbsBlockDevices(MrScalarTaskEbsBlockDeviceArgs.builder()
 *                 .volumesPerInstance(2)
 *                 .volumeType("gp2")
 *                 .sizeInGb(40)
 *                 .build())
 *             .tags(MrScalarTagArgs.builder()
 *                 .key("Creator")
 *                 .value("Pulumi")
 *                 .build())
 *             .taskScalingDownPolicies(MrScalarTaskScalingDownPolicyArgs.builder()
 *                 .policyName("policy-name")
 *                 .metricName("CPUUtilization")
 *                 .namespace("AWS/EC2")
 *                 .statistic("average")
 *                 .unit("")
 *                 .threshold(10)
 *                 .adjustment("1")
 *                 .cooldown(60)
 *                 .dimensions(Map.ofEntries(
 *                     Map.entry("name", "name-1"),
 *                     Map.entry("value", "value-1")
 *                 ))
 *                 .operator("gt")
 *                 .evaluationPeriods(10)
 *                 .period(60)
 *                 .actionType("")
 *                 .minimum(0)
 *                 .maximum(10)
 *                 .target(5)
 *                 .maxTargetCapacity(1)
 *                 .build())
 *             .build());
 * 
 *         ctx.export("mrscaler-name", sample_MrScaler_01.name());
 *         ctx.export("mrscaler-created-cluster-id", sample_MrScaler_01.outputClusterId());
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Wrap Strategy
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.spotinst.aws.MrScalar;
 * import com.pulumi.spotinst.aws.MrScalarArgs;
 * import com.pulumi.spotinst.aws.inputs.MrScalarTaskEbsBlockDeviceArgs;
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
 *         // Create a Mr Scaler with Wrap strategy
 *         var example_scaler_2 = new MrScalar("example-scaler-2", MrScalarArgs.builder()
 *             .name("spotinst-mr-scaler-2")
 *             .description("created by Pulumi")
 *             .region("us-west-2")
 *             .strategy("wrap")
 *             .clusterId("j-27UVDEHXL4OQM")
 *             .taskInstanceTypes(            
 *                 "c3.xlarge",
 *                 "c4.xlarge")
 *             .taskDesiredCapacity(2)
 *             .taskMinSize(0)
 *             .taskMaxSize(4)
 *             .taskLifecycle("SPOT")
 *             .taskUnit("instance")
 *             .taskEbsBlockDevices(MrScalarTaskEbsBlockDeviceArgs.builder()
 *                 .volumesPerInstance(1)
 *                 .volumeType("gp2")
 *                 .sizeInGb(20)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### New Strategy
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.spotinst.aws.MrScalar;
 * import com.pulumi.spotinst.aws.MrScalarArgs;
 * import com.pulumi.spotinst.aws.inputs.MrScalarProvisioningTimeoutArgs;
 * import com.pulumi.spotinst.aws.inputs.MrScalarApplicationArgs;
 * import com.pulumi.spotinst.aws.inputs.MrScalarInstanceWeightArgs;
 * import com.pulumi.spotinst.aws.inputs.MrScalarStepsFileArgs;
 * import com.pulumi.spotinst.aws.inputs.MrScalarConfigurationsFileArgs;
 * import com.pulumi.spotinst.aws.inputs.MrScalarBootstrapActionsFileArgs;
 * import com.pulumi.spotinst.aws.inputs.MrScalarMasterEbsBlockDeviceArgs;
 * import com.pulumi.spotinst.aws.inputs.MrScalarCoreEbsBlockDeviceArgs;
 * import com.pulumi.spotinst.aws.inputs.MrScalarTaskEbsBlockDeviceArgs;
 * import com.pulumi.spotinst.aws.inputs.MrScalarTagArgs;
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
 *         // Create a Mr Scaler with New strategy
 *         var sample_MrScaler_01 = new MrScalar("sample-MrScaler-01", MrScalarArgs.builder()
 *             .name("sample-MrScaler-01")
 *             .description("Testing MrScaler creation")
 *             .region("us-west-2")
 *             .strategy("new")
 *             .releaseLabel("emr-5.17.0")
 *             .retries(2)
 *             .availabilityZones("us-west-2a:subnet-123456")
 *             .provisioningTimeout(MrScalarProvisioningTimeoutArgs.builder()
 *                 .timeout(15)
 *                 .timeoutAction("terminateAndRetry")
 *                 .build())
 *             .logUri("s3://example-logs")
 *             .additionalInfo("{'test':'more information'}")
 *             .jobFlowRole("EMR_EC2_ExampleRole")
 *             .securityConfig("example-config")
 *             .serviceRole("example-role")
 *             .terminationProtected(false)
 *             .keepJobFlowAlive(true)
 *             .customAmiId("ami-123456")
 *             .repoUpgradeOnBoot("NONE")
 *             .ec2KeyName("test-key")
 *             .managedPrimarySecurityGroup("sg-123456")
 *             .managedReplicaSecurityGroup("sg-987654")
 *             .serviceAccessSecurityGroup("access-example")
 *             .additionalPrimarySecurityGroups("sg-456321")
 *             .additionalReplicaSecurityGroups("sg-123654")
 *             .applications(            
 *                 MrScalarApplicationArgs.builder()
 *                     .name("Ganglia")
 *                     .version("1.0")
 *                     .build(),
 *                 MrScalarApplicationArgs.builder()
 *                     .name("Hadoop")
 *                     .build(),
 *                 MrScalarApplicationArgs.builder()
 *                     .name("Pig")
 *                     .args(                    
 *                         "fake",
 *                         "args")
 *                     .build())
 *             .instanceWeights(            
 *                 MrScalarInstanceWeightArgs.builder()
 *                     .instanceType("t2.small")
 *                     .weightedCapacity(10)
 *                     .build(),
 *                 MrScalarInstanceWeightArgs.builder()
 *                     .instanceType("t2.medium")
 *                     .weightedCapacity(90)
 *                     .build())
 *             .stepsFiles(MrScalarStepsFileArgs.builder()
 *                 .bucket("example-bucket")
 *                 .key("steps.json")
 *                 .build())
 *             .configurationsFiles(MrScalarConfigurationsFileArgs.builder()
 *                 .bucket("example-bucket")
 *                 .key("configurations.json")
 *                 .build())
 *             .bootstrapActionsFiles(MrScalarBootstrapActionsFileArgs.builder()
 *                 .bucket("sample-emr-test")
 *                 .key("bootstrap-actions.json")
 *                 .build())
 *             .masterInstanceTypes("c3.xlarge")
 *             .masterLifecycle("SPOT")
 *             .masterEbsOptimized(true)
 *             .masterTarget(1)
 *             .masterEbsBlockDevices(MrScalarMasterEbsBlockDeviceArgs.builder()
 *                 .volumesPerInstance(1)
 *                 .volumeType("gp2")
 *                 .sizeInGb(30)
 *                 .build())
 *             .coreInstanceTypes(            
 *                 "c3.xlarge",
 *                 "c4.xlarge")
 *             .coreMinSize(1)
 *             .coreMaxSize(1)
 *             .coreDesiredCapacity(1)
 *             .coreLifecycle("ON_DEMAND")
 *             .coreEbsOptimized(false)
 *             .coreUnit("instance")
 *             .coreEbsBlockDevices(MrScalarCoreEbsBlockDeviceArgs.builder()
 *                 .volumesPerInstance(2)
 *                 .volumeType("gp2")
 *                 .sizeInGb(40)
 *                 .build())
 *             .taskInstanceTypes(            
 *                 "c3.xlarge",
 *                 "c4.xlarge")
 *             .taskMinSize(0)
 *             .taskMaxSize(30)
 *             .taskDesiredCapacity(1)
 *             .taskLifecycle("SPOT")
 *             .taskEbsOptimized(false)
 *             .taskUnit("instance")
 *             .taskEbsBlockDevices(MrScalarTaskEbsBlockDeviceArgs.builder()
 *                 .volumesPerInstance(2)
 *                 .volumeType("gp2")
 *                 .sizeInGb(40)
 *                 .build())
 *             .tags(MrScalarTagArgs.builder()
 *                 .key("Creator")
 *                 .value("Pulumi")
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="spotinst:aws/mrScalar:MrScalar")
public class MrScalar extends com.pulumi.resources.CustomResource {
    @Export(name="additionalInfo", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> additionalInfo;

    public Output<Optional<String>> additionalInfo() {
        return Codegen.optional(this.additionalInfo);
    }
    @Export(name="additionalPrimarySecurityGroups", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> additionalPrimarySecurityGroups;

    public Output<Optional<List<String>>> additionalPrimarySecurityGroups() {
        return Codegen.optional(this.additionalPrimarySecurityGroups);
    }
    @Export(name="additionalReplicaSecurityGroups", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> additionalReplicaSecurityGroups;

    public Output<Optional<List<String>>> additionalReplicaSecurityGroups() {
        return Codegen.optional(this.additionalReplicaSecurityGroups);
    }
    @Export(name="applications", refs={List.class,MrScalarApplication.class}, tree="[0,1]")
    private Output</* @Nullable */ List<MrScalarApplication>> applications;

    public Output<Optional<List<MrScalarApplication>>> applications() {
        return Codegen.optional(this.applications);
    }
    @Export(name="availabilityZones", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> availabilityZones;

    public Output<Optional<List<String>>> availabilityZones() {
        return Codegen.optional(this.availabilityZones);
    }
    @Export(name="bootstrapActionsFiles", refs={List.class,MrScalarBootstrapActionsFile.class}, tree="[0,1]")
    private Output</* @Nullable */ List<MrScalarBootstrapActionsFile>> bootstrapActionsFiles;

    public Output<Optional<List<MrScalarBootstrapActionsFile>>> bootstrapActionsFiles() {
        return Codegen.optional(this.bootstrapActionsFiles);
    }
    /**
     * The MrScaler cluster id.
     * 
     */
    @Export(name="clusterId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> clusterId;

    /**
     * @return The MrScaler cluster id.
     * 
     */
    public Output<Optional<String>> clusterId() {
        return Codegen.optional(this.clusterId);
    }
    @Export(name="configurationsFiles", refs={List.class,MrScalarConfigurationsFile.class}, tree="[0,1]")
    private Output</* @Nullable */ List<MrScalarConfigurationsFile>> configurationsFiles;

    public Output<Optional<List<MrScalarConfigurationsFile>>> configurationsFiles() {
        return Codegen.optional(this.configurationsFiles);
    }
    @Export(name="coreDesiredCapacity", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> coreDesiredCapacity;

    public Output<Optional<Integer>> coreDesiredCapacity() {
        return Codegen.optional(this.coreDesiredCapacity);
    }
    @Export(name="coreEbsBlockDevices", refs={List.class,MrScalarCoreEbsBlockDevice.class}, tree="[0,1]")
    private Output</* @Nullable */ List<MrScalarCoreEbsBlockDevice>> coreEbsBlockDevices;

    public Output<Optional<List<MrScalarCoreEbsBlockDevice>>> coreEbsBlockDevices() {
        return Codegen.optional(this.coreEbsBlockDevices);
    }
    @Export(name="coreEbsOptimized", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> coreEbsOptimized;

    public Output<Optional<Boolean>> coreEbsOptimized() {
        return Codegen.optional(this.coreEbsOptimized);
    }
    @Export(name="coreInstanceTypes", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> coreInstanceTypes;

    public Output<Optional<List<String>>> coreInstanceTypes() {
        return Codegen.optional(this.coreInstanceTypes);
    }
    @Export(name="coreLifecycle", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> coreLifecycle;

    public Output<Optional<String>> coreLifecycle() {
        return Codegen.optional(this.coreLifecycle);
    }
    @Export(name="coreMaxSize", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> coreMaxSize;

    public Output<Optional<Integer>> coreMaxSize() {
        return Codegen.optional(this.coreMaxSize);
    }
    @Export(name="coreMinSize", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> coreMinSize;

    public Output<Optional<Integer>> coreMinSize() {
        return Codegen.optional(this.coreMinSize);
    }
    @Export(name="coreScalingDownPolicies", refs={List.class,MrScalarCoreScalingDownPolicy.class}, tree="[0,1]")
    private Output</* @Nullable */ List<MrScalarCoreScalingDownPolicy>> coreScalingDownPolicies;

    public Output<Optional<List<MrScalarCoreScalingDownPolicy>>> coreScalingDownPolicies() {
        return Codegen.optional(this.coreScalingDownPolicies);
    }
    @Export(name="coreScalingUpPolicies", refs={List.class,MrScalarCoreScalingUpPolicy.class}, tree="[0,1]")
    private Output</* @Nullable */ List<MrScalarCoreScalingUpPolicy>> coreScalingUpPolicies;

    public Output<Optional<List<MrScalarCoreScalingUpPolicy>>> coreScalingUpPolicies() {
        return Codegen.optional(this.coreScalingUpPolicies);
    }
    @Export(name="coreUnit", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> coreUnit;

    public Output<Optional<String>> coreUnit() {
        return Codegen.optional(this.coreUnit);
    }
    @Export(name="customAmiId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> customAmiId;

    public Output<Optional<String>> customAmiId() {
        return Codegen.optional(this.customAmiId);
    }
    /**
     * The MrScaler description.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The MrScaler description.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    @Export(name="ebsRootVolumeSize", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> ebsRootVolumeSize;

    public Output<Optional<Integer>> ebsRootVolumeSize() {
        return Codegen.optional(this.ebsRootVolumeSize);
    }
    @Export(name="ec2KeyName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> ec2KeyName;

    public Output<Optional<String>> ec2KeyName() {
        return Codegen.optional(this.ec2KeyName);
    }
    /**
     * Allow the `cluster_id` to set a provider output variable.
     * 
     */
    @Export(name="exposeClusterId", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> exposeClusterId;

    /**
     * @return Allow the `cluster_id` to set a provider output variable.
     * 
     */
    public Output<Optional<Boolean>> exposeClusterId() {
        return Codegen.optional(this.exposeClusterId);
    }
    @Export(name="instanceWeights", refs={List.class,MrScalarInstanceWeight.class}, tree="[0,1]")
    private Output</* @Nullable */ List<MrScalarInstanceWeight>> instanceWeights;

    public Output<Optional<List<MrScalarInstanceWeight>>> instanceWeights() {
        return Codegen.optional(this.instanceWeights);
    }
    @Export(name="jobFlowRole", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> jobFlowRole;

    public Output<Optional<String>> jobFlowRole() {
        return Codegen.optional(this.jobFlowRole);
    }
    @Export(name="keepJobFlowAlive", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> keepJobFlowAlive;

    public Output<Optional<Boolean>> keepJobFlowAlive() {
        return Codegen.optional(this.keepJobFlowAlive);
    }
    @Export(name="logUri", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> logUri;

    public Output<Optional<String>> logUri() {
        return Codegen.optional(this.logUri);
    }
    @Export(name="managedPrimarySecurityGroup", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> managedPrimarySecurityGroup;

    public Output<Optional<String>> managedPrimarySecurityGroup() {
        return Codegen.optional(this.managedPrimarySecurityGroup);
    }
    @Export(name="managedReplicaSecurityGroup", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> managedReplicaSecurityGroup;

    public Output<Optional<String>> managedReplicaSecurityGroup() {
        return Codegen.optional(this.managedReplicaSecurityGroup);
    }
    @Export(name="masterEbsBlockDevices", refs={List.class,MrScalarMasterEbsBlockDevice.class}, tree="[0,1]")
    private Output</* @Nullable */ List<MrScalarMasterEbsBlockDevice>> masterEbsBlockDevices;

    public Output<Optional<List<MrScalarMasterEbsBlockDevice>>> masterEbsBlockDevices() {
        return Codegen.optional(this.masterEbsBlockDevices);
    }
    @Export(name="masterEbsOptimized", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> masterEbsOptimized;

    public Output<Optional<Boolean>> masterEbsOptimized() {
        return Codegen.optional(this.masterEbsOptimized);
    }
    @Export(name="masterInstanceTypes", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> masterInstanceTypes;

    public Output<Optional<List<String>>> masterInstanceTypes() {
        return Codegen.optional(this.masterInstanceTypes);
    }
    @Export(name="masterLifecycle", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> masterLifecycle;

    public Output<Optional<String>> masterLifecycle() {
        return Codegen.optional(this.masterLifecycle);
    }
    @Export(name="masterTarget", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> masterTarget;

    public Output<Optional<Integer>> masterTarget() {
        return Codegen.optional(this.masterTarget);
    }
    /**
     * The MrScaler name.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The MrScaler name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    @Export(name="outputClusterId", refs={String.class}, tree="[0]")
    private Output<String> outputClusterId;

    public Output<String> outputClusterId() {
        return this.outputClusterId;
    }
    @Export(name="provisioningTimeout", refs={MrScalarProvisioningTimeout.class}, tree="[0]")
    private Output</* @Nullable */ MrScalarProvisioningTimeout> provisioningTimeout;

    public Output<Optional<MrScalarProvisioningTimeout>> provisioningTimeout() {
        return Codegen.optional(this.provisioningTimeout);
    }
    /**
     * The MrScaler region.
     * 
     */
    @Export(name="region", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> region;

    /**
     * @return The MrScaler region.
     * 
     */
    public Output<Optional<String>> region() {
        return Codegen.optional(this.region);
    }
    @Export(name="releaseLabel", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> releaseLabel;

    public Output<Optional<String>> releaseLabel() {
        return Codegen.optional(this.releaseLabel);
    }
    @Export(name="repoUpgradeOnBoot", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> repoUpgradeOnBoot;

    public Output<Optional<String>> repoUpgradeOnBoot() {
        return Codegen.optional(this.repoUpgradeOnBoot);
    }
    @Export(name="retries", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> retries;

    public Output<Optional<Integer>> retries() {
        return Codegen.optional(this.retries);
    }
    @Export(name="scheduledTasks", refs={List.class,MrScalarScheduledTask.class}, tree="[0,1]")
    private Output</* @Nullable */ List<MrScalarScheduledTask>> scheduledTasks;

    public Output<Optional<List<MrScalarScheduledTask>>> scheduledTasks() {
        return Codegen.optional(this.scheduledTasks);
    }
    @Export(name="securityConfig", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> securityConfig;

    public Output<Optional<String>> securityConfig() {
        return Codegen.optional(this.securityConfig);
    }
    @Export(name="serviceAccessSecurityGroup", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> serviceAccessSecurityGroup;

    public Output<Optional<String>> serviceAccessSecurityGroup() {
        return Codegen.optional(this.serviceAccessSecurityGroup);
    }
    @Export(name="serviceRole", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> serviceRole;

    public Output<Optional<String>> serviceRole() {
        return Codegen.optional(this.serviceRole);
    }
    @Export(name="stepsFiles", refs={List.class,MrScalarStepsFile.class}, tree="[0,1]")
    private Output</* @Nullable */ List<MrScalarStepsFile>> stepsFiles;

    public Output<Optional<List<MrScalarStepsFile>>> stepsFiles() {
        return Codegen.optional(this.stepsFiles);
    }
    /**
     * The MrScaler strategy. Allowed values are `new` `clone` and `wrap`.
     * 
     */
    @Export(name="strategy", refs={String.class}, tree="[0]")
    private Output<String> strategy;

    /**
     * @return The MrScaler strategy. Allowed values are `new` `clone` and `wrap`.
     * 
     */
    public Output<String> strategy() {
        return this.strategy;
    }
    @Export(name="tags", refs={List.class,MrScalarTag.class}, tree="[0,1]")
    private Output</* @Nullable */ List<MrScalarTag>> tags;

    public Output<Optional<List<MrScalarTag>>> tags() {
        return Codegen.optional(this.tags);
    }
    @Export(name="taskDesiredCapacity", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> taskDesiredCapacity;

    public Output<Optional<Integer>> taskDesiredCapacity() {
        return Codegen.optional(this.taskDesiredCapacity);
    }
    @Export(name="taskEbsBlockDevices", refs={List.class,MrScalarTaskEbsBlockDevice.class}, tree="[0,1]")
    private Output</* @Nullable */ List<MrScalarTaskEbsBlockDevice>> taskEbsBlockDevices;

    public Output<Optional<List<MrScalarTaskEbsBlockDevice>>> taskEbsBlockDevices() {
        return Codegen.optional(this.taskEbsBlockDevices);
    }
    @Export(name="taskEbsOptimized", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> taskEbsOptimized;

    public Output<Optional<Boolean>> taskEbsOptimized() {
        return Codegen.optional(this.taskEbsOptimized);
    }
    @Export(name="taskInstanceTypes", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> taskInstanceTypes;

    public Output<Optional<List<String>>> taskInstanceTypes() {
        return Codegen.optional(this.taskInstanceTypes);
    }
    @Export(name="taskLifecycle", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> taskLifecycle;

    public Output<Optional<String>> taskLifecycle() {
        return Codegen.optional(this.taskLifecycle);
    }
    @Export(name="taskMaxSize", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> taskMaxSize;

    public Output<Optional<Integer>> taskMaxSize() {
        return Codegen.optional(this.taskMaxSize);
    }
    @Export(name="taskMinSize", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> taskMinSize;

    public Output<Optional<Integer>> taskMinSize() {
        return Codegen.optional(this.taskMinSize);
    }
    @Export(name="taskScalingDownPolicies", refs={List.class,MrScalarTaskScalingDownPolicy.class}, tree="[0,1]")
    private Output</* @Nullable */ List<MrScalarTaskScalingDownPolicy>> taskScalingDownPolicies;

    public Output<Optional<List<MrScalarTaskScalingDownPolicy>>> taskScalingDownPolicies() {
        return Codegen.optional(this.taskScalingDownPolicies);
    }
    @Export(name="taskScalingUpPolicies", refs={List.class,MrScalarTaskScalingUpPolicy.class}, tree="[0,1]")
    private Output</* @Nullable */ List<MrScalarTaskScalingUpPolicy>> taskScalingUpPolicies;

    public Output<Optional<List<MrScalarTaskScalingUpPolicy>>> taskScalingUpPolicies() {
        return Codegen.optional(this.taskScalingUpPolicies);
    }
    @Export(name="taskUnit", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> taskUnit;

    public Output<Optional<String>> taskUnit() {
        return Codegen.optional(this.taskUnit);
    }
    /**
     * Allows defining termination policies for EMR clusters based on CloudWatch Metrics.
     * 
     */
    @Export(name="terminationPolicies", refs={List.class,MrScalarTerminationPolicy.class}, tree="[0,1]")
    private Output</* @Nullable */ List<MrScalarTerminationPolicy>> terminationPolicies;

    /**
     * @return Allows defining termination policies for EMR clusters based on CloudWatch Metrics.
     * 
     */
    public Output<Optional<List<MrScalarTerminationPolicy>>> terminationPolicies() {
        return Codegen.optional(this.terminationPolicies);
    }
    @Export(name="terminationProtected", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> terminationProtected;

    public Output<Optional<Boolean>> terminationProtected() {
        return Codegen.optional(this.terminationProtected);
    }
    /**
     * @deprecated
     * This field has been removed from our API and is no longer functional.
     * 
     */
    @Deprecated /* This field has been removed from our API and is no longer functional. */
    @Export(name="visibleToAllUsers", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> visibleToAllUsers;

    public Output<Optional<Boolean>> visibleToAllUsers() {
        return Codegen.optional(this.visibleToAllUsers);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MrScalar(java.lang.String name) {
        this(name, MrScalarArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MrScalar(java.lang.String name, MrScalarArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MrScalar(java.lang.String name, MrScalarArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("spotinst:aws/mrScalar:MrScalar", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private MrScalar(java.lang.String name, Output<java.lang.String> id, @Nullable MrScalarState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("spotinst:aws/mrScalar:MrScalar", name, state, makeResourceOptions(options, id), false);
    }

    private static MrScalarArgs makeArgs(MrScalarArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? MrScalarArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static MrScalar get(java.lang.String name, Output<java.lang.String> id, @Nullable MrScalarState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new MrScalar(name, id, state, options);
    }
}
