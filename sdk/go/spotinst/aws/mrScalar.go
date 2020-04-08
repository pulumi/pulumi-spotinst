// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

// nolint: lll
package aws

import (
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// Provides a Spotinst AWS MrScaler resource.
//
// ## Provisioning Timeout (Clone, New strategies)
//
// * `timeout` - (Optional) The amount of time (minutes) after which the cluster is automatically terminated if it's still in provisioning status. Minimum: '15'.
// * `timeoutAction` - (Optional) The action to take if the timeout is exceeded. Valid values: `terminate`, `terminateAndRetry`.
//
// <a id="cluster-config"></a>
// ## Cluster Configuration (New strategy only)
//
// * `logUri` - (Optional) The path to the Amazon S3 location where logs for this cluster are stored.
// * `additionalInfo` - (Optional) This is meta information about third-party applications that third-party vendors use for testing purposes.
// * `securityConfig` - (Optional) The name of the security configuration applied to the cluster.
// * `serviceRole` - (Optional) The IAM role that will be assumed by the Amazon EMR service to access AWS resources on your behalf.
// * `jobFlowRole` - (Optional) The IAM role that was specified when the job flow was launched. The EC2 instances of the job flow assume this role.
// * `terminationProtected` - (Optional) Specifies whether the Amazon EC2 instances in the cluster are protected from termination by API calls, user intervention, or in the event of a job-flow error.
// * `keepJobFlowAlive` - (Optional) Specifies whether the cluster should remain available after completing all steps.
// * `retries` - (Optional) Specifies the maximum number of times a capacity provisioning should be retried if the provisioning timeout is exceeded.
//
// <a id="task-group"></a>
// ## Task Group (Wrap, Clone, and New strategies)
//
// * `taskInstanceTypes` - (Required) The MrScaler instance types for the task nodes.
// * `taskTarget` - (Required) amount of instances in task group.
// * `taskMaximum` - (Optional) maximal amount of instances in task group.
// * `taskMinimum` - (Optional) The minimal amount of instances in task group.
// * `taskLifecycle` - (Required) The MrScaler lifecycle for instances in task group. Allowed values are 'SPOT' and 'ON_DEMAND'.
// * `taskEbsOptimized` - (Optional) EBS Optimization setting for instances in group.
// * `taskEbsBlockDevice` - (Required) This determines the ebs configuration for your task group instances. Only a single block is allowed.
//     * `volumesPerInstance` - (Optional; Default 1) Amount of volumes per instance in the task group.
//     * `volumeType` - (Required) volume type. Allowed values are 'gp2', 'io1' and others.
//     * `sizeInGb` - (Required) Size of the volume, in GBs.
//     * `iops` - (Optional) IOPS for the volume. Required in some volume types, such as io1.
//
// <a id="core-group"></a>
// ## Core Group (Clone, New strategies)
//
// * `coreInstanceTypes` - (Required) The MrScaler instance types for the core nodes.
// * `coreTarget` - (Required) amount of instances in core group.
// * `coreMaximum` - (Optional) maximal amount of instances in core group.
// * `coreMinimum` - (Optional) The minimal amount of instances in core group.
// * `coreLifecycle` - (Required) The MrScaler lifecycle for instances in core group. Allowed values are 'SPOT' and 'ON_DEMAND'.
// * `coreEbsOptimized` - (Optional) EBS Optimization setting for instances in group.
// * `coreEbsBlockDevice` - (Required) This determines the ebs configuration for your core group instances. Only a single block is allowed.
//     * `volumesPerInstance` - (Optional; Default 1) Amount of volumes per instance in the core group.
//     * `volumeType` - (Required) volume type. Allowed values are 'gp2', 'io1' and others.
//     * `sizeInGb` - (Required) Size of the volume, in GBs.
//     * `iops` - (Optional) IOPS for the volume. Required in some volume types, such as io1.
//
// <a id="master-group"></a>
// ## Master Group (Clone, New strategies)
//
// * `masterInstanceTypes` - (Required) The MrScaler instance types for the master nodes.
// * `masterLifecycle` - (Required) The MrScaler lifecycle for instances in master group. Allowed values are 'SPOT' and 'ON_DEMAND'.
// * `masterEbsOptimized` - (Optional) EBS Optimization setting for instances in group.
// * `masterEbsBlockDevice` - (Required) This determines the ebs configuration for your master group instances. Only a single block is allowed.
//     * `volumesPerInstance` - (Optional; Default 1) Amount of volumes per instance in the master group.
//     * `volumeType` - (Required) volume type. Allowed values are 'gp2', 'io1' and others.
//     * `sizeInGb` - (Required) Size of the volume, in GBs.
//     * `iops` - (Optional) IOPS for the volume. Required in some volume types, such as io1.
//
// <a id="tags"></a>
// ## Tags (Clone, New strategies)
//
// * `tags` - (Optional) A list of tags to assign to the resource. You may define multiple tags.
//     * `key` - (Required) Tag key.
//     * `value` - (Required) Tag value.
//
// <a id="Optional Compute Parameters"></a>
// ## Optional Compute Parameters (New strategy)
//
// * `managedPrimarySecurityGroup` - (Optional) EMR Managed Security group that will be set to the primary instance group.
// * `managedReplicaSecurityGroup` - (Optional) EMR Managed Security group that will be set to the replica instance group.
// * `serviceAccessSecurityGroup` - (Optional) The identifier of the Amazon EC2 security group for the Amazon EMR service to access clusters in VPC private subnets.
// * `additionalPrimarySecurityGroups` - (Optional) A list of additional Amazon EC2 security group IDs for the master node.
// * `additionalReplicaSecurityGroups` - (Optional) A list of additional Amazon EC2 security group IDs for the core and task nodes.
// * `customAmiId` - (Optional) The ID of a custom Amazon EBS-backed Linux AMI if the cluster uses a custom AMI.
// * `repoUpgradeOnBoot` - (Optional) Applies only when `customAmiId` is used. Specifies the type of updates that are applied from the Amazon Linux AMI package repositories when an instance boots using the AMI. Possible values include: `SECURITY`, `NONE`.
// * `ec2KeyName` - (Optional) The name of an Amazon EC2 key pair that can be used to ssh to the master node.
// * `applications` - (Optional) A case-insensitive list of applications for Amazon EMR to install and configure when launching the cluster
//     * `args` - (Optional) Arguments for EMR to pass to the application.
//     * `name` - (Required) The application name.
//     * `version`- (Optional)T he version of the application.
// * `instanceWeights` - (Optional) Describes the instance and weights. Check out [Elastigroup Weighted Instances](https://api.spotinst.com/elastigroup-for-aws/concepts/general-concepts/elastigroup-capacity-instances-or-weighted) for more info.
//     * `instanceType` - (Required) The type of the instance.
//     * `weightedCapacity` - (Required) The weight given to the associated instance type.
//
// <a id="availability-zone"></a>
// ## Availability Zones (Clone, New strategies)
//
// * `availabilityZones` - (Required in Clone) List of AZs and their subnet Ids. See example above for usage.
//
// <a id="configurations"></a>
// ## Configurations (Clone, New strategies)
//
// * `configurationsFile` - (Optional) Describes path to S3 file containing description of configurations. [More Information](https://api.spotinst.com/elastigroup-for-aws/services-integrations/elastic-mapreduce/import-an-emr-cluster/advanced/)
//     * `bucket` - (Required) S3 Bucket name for configurations.
//     * `key`- (Required) S3 key for configurations.
//
// <a id="steps"></a>
// ## Steps (Clone, New strategies)
//
// * `stepsFile` - (Optional) Steps from S3.
//     * `bucket` - (Required) S3 Bucket name for steps.
//     * `key`- (Required) S3 key for steps.
//
// <a id="boostrap-actions"></a>
// ## Bootstrap Actions (Clone, New strategies)
//
// * `bootstrapActionsFile` - (Optional) Describes path to S3 file containing description of bootstrap actions. [More Information](https://api.spotinst.com/elastigroup-for-aws/services-integrations/elastic-mapreduce/import-an-emr-cluster/advanced/)
//     * `bucket` - (Required) S3 Bucket name for bootstrap actions.
//     * `key`- (Required) S3 key for bootstrap actions.
//
// <a id="scaling-policy"></a>
// ## Scaling Policies
//
// Possible task group scaling policies (Wrap, Clone, and New strategies):
// * `taskScalingUpPolicy`
// * `taskScalingDownPolicy`
//
// Possible core group scaling policies (Clone, New strategies):
// * `coreScalingUpPolicy`
// * `coreScalingDownPolicy`
//
// Each `*_scaling_*_policy` supports the following:
//
// * `policyName` - (Required) The name of the policy.
// * `metricName` - (Required) The name of the metric, with or without spaces.
// * `statistic` - (Required) The metric statistics to return. For information about specific statistics go to [Statistics](http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/index.html?CHAP_TerminologyandKeyConcepts.html#Statistic) in the Amazon CloudWatch Developer Guide.
// * `unit` - (Required) The unit for the metric.
// * `threshold` - (Required) The value against which the specified statistic is compared.
// * `adjustment` - (Optional) The number of instances to add/remove to/from the target capacity when scale is needed.
// * `minTargetCapacity` - (Optional) Min target capacity for scale up.
// * `maxTargetCapacity` - (Optional) Max target capacity for scale down.
// * `namespace` - (Required) The namespace for the metric.
// * `operator` - (Required) The operator to use. Allowed values are : 'gt', 'gte', 'lt' , 'lte'.
// * `evaluationPeriods` - (Required) The number of periods over which data is compared to the specified threshold.
// * `period` - (Required) The granularity, in seconds, of the returned datapoints. Period must be at least 60 seconds and must be a multiple of 60.
// * `cooldown` - (Required) The amount of time, in seconds, after a scaling activity completes and before the next scaling activity can start.
// * `dimensions` - (Optional) A mapping of dimensions describing qualities of the metric.
// * `minimum` - (Optional) The minimum to set when scale is needed.
// * `maximum` - (Optional) The maximum to set when scale is needed.
// * `target` - (Optional) The number of instances to set when scale is needed.
// * `actionType` - (Required) The type of action to perform. Allowed values are : 'adjustment', 'setMinTarget', 'setMaxTarget', 'updateCapacity', 'percentageAdjustment'
//
// <a id="scheduled-task"></a>
// ## Scheduled Tasks
//
// * `scheduledTask` - (Optional) An array of scheduled tasks.
// * `isEnabled` - (Optional) Enable/Disable the specified scheduling task.
// * `taskType` - (Required) The type of task to be scheduled. Valid values: `setCapacity`.
// * `instanceGroupType` - (Required) Select the EMR instance groups to execute the scheduled task on. Valid values: `task`.
// * `cron` - (Required) A cron expression representing the schedule for the task.
// * `desiredCapacity` - (Optional) New desired capacity for the elastigroup.
// * `minCapacity` - (Optional) New min capacity for the elastigroup.
// * `maxCapacity` - (Optional) New max capacity for the elastigroup.
//
// > This content is derived from https://github.com/terraform-providers/terraform-provider-spotinst/blob/master/website/docs/r/mrscaler_aws.html.markdown.
type MrScalar struct {
	pulumi.CustomResourceState

	AdditionalInfo                  pulumi.StringPtrOutput                  `pulumi:"additionalInfo"`
	AdditionalPrimarySecurityGroups pulumi.StringArrayOutput                `pulumi:"additionalPrimarySecurityGroups"`
	AdditionalReplicaSecurityGroups pulumi.StringArrayOutput                `pulumi:"additionalReplicaSecurityGroups"`
	Applications                    MrScalarApplicationArrayOutput          `pulumi:"applications"`
	AvailabilityZones               pulumi.StringArrayOutput                `pulumi:"availabilityZones"`
	BootstrapActionsFiles           MrScalarBootstrapActionsFileArrayOutput `pulumi:"bootstrapActionsFiles"`
	// The MrScaler cluster id.
	ClusterId               pulumi.StringPtrOutput                   `pulumi:"clusterId"`
	ConfigurationsFiles     MrScalarConfigurationsFileArrayOutput    `pulumi:"configurationsFiles"`
	CoreDesiredCapacity     pulumi.IntPtrOutput                      `pulumi:"coreDesiredCapacity"`
	CoreEbsBlockDevices     MrScalarCoreEbsBlockDeviceArrayOutput    `pulumi:"coreEbsBlockDevices"`
	CoreEbsOptimized        pulumi.BoolPtrOutput                     `pulumi:"coreEbsOptimized"`
	CoreInstanceTypes       pulumi.StringArrayOutput                 `pulumi:"coreInstanceTypes"`
	CoreLifecycle           pulumi.StringPtrOutput                   `pulumi:"coreLifecycle"`
	CoreMaxSize             pulumi.IntPtrOutput                      `pulumi:"coreMaxSize"`
	CoreMinSize             pulumi.IntPtrOutput                      `pulumi:"coreMinSize"`
	CoreScalingDownPolicies MrScalarCoreScalingDownPolicyArrayOutput `pulumi:"coreScalingDownPolicies"`
	CoreScalingUpPolicies   MrScalarCoreScalingUpPolicyArrayOutput   `pulumi:"coreScalingUpPolicies"`
	CustomAmiId             pulumi.StringPtrOutput                   `pulumi:"customAmiId"`
	// The MrScaler description.
	Description                 pulumi.StringPtrOutput                  `pulumi:"description"`
	EbsRootVolumeSize           pulumi.IntPtrOutput                     `pulumi:"ebsRootVolumeSize"`
	Ec2KeyName                  pulumi.StringPtrOutput                  `pulumi:"ec2KeyName"`
	ExposeClusterId             pulumi.BoolPtrOutput                    `pulumi:"exposeClusterId"`
	InstanceWeights             MrScalarInstanceWeightArrayOutput       `pulumi:"instanceWeights"`
	JobFlowRole                 pulumi.StringPtrOutput                  `pulumi:"jobFlowRole"`
	KeepJobFlowAlive            pulumi.BoolPtrOutput                    `pulumi:"keepJobFlowAlive"`
	LogUri                      pulumi.StringPtrOutput                  `pulumi:"logUri"`
	ManagedPrimarySecurityGroup pulumi.StringPtrOutput                  `pulumi:"managedPrimarySecurityGroup"`
	ManagedReplicaSecurityGroup pulumi.StringPtrOutput                  `pulumi:"managedReplicaSecurityGroup"`
	MasterEbsBlockDevices       MrScalarMasterEbsBlockDeviceArrayOutput `pulumi:"masterEbsBlockDevices"`
	MasterEbsOptimized          pulumi.BoolPtrOutput                    `pulumi:"masterEbsOptimized"`
	MasterInstanceTypes         pulumi.StringArrayOutput                `pulumi:"masterInstanceTypes"`
	MasterLifecycle             pulumi.StringPtrOutput                  `pulumi:"masterLifecycle"`
	// The MrScaler name.
	Name                pulumi.StringOutput                  `pulumi:"name"`
	OutputClusterId     pulumi.StringOutput                  `pulumi:"outputClusterId"`
	ProvisioningTimeout MrScalarProvisioningTimeoutPtrOutput `pulumi:"provisioningTimeout"`
	// The MrScaler region.
	Region                     pulumi.StringPtrOutput           `pulumi:"region"`
	ReleaseLabel               pulumi.StringPtrOutput           `pulumi:"releaseLabel"`
	RepoUpgradeOnBoot          pulumi.StringPtrOutput           `pulumi:"repoUpgradeOnBoot"`
	Retries                    pulumi.IntPtrOutput              `pulumi:"retries"`
	ScheduledTasks             MrScalarScheduledTaskArrayOutput `pulumi:"scheduledTasks"`
	SecurityConfig             pulumi.StringPtrOutput           `pulumi:"securityConfig"`
	ServiceAccessSecurityGroup pulumi.StringPtrOutput           `pulumi:"serviceAccessSecurityGroup"`
	ServiceRole                pulumi.StringPtrOutput           `pulumi:"serviceRole"`
	StepsFiles                 MrScalarStepsFileArrayOutput     `pulumi:"stepsFiles"`
	// The MrScaler strategy. Allowed values are `new` `clone` and `wrap`.
	Strategy                pulumi.StringOutput                      `pulumi:"strategy"`
	Tags                    MrScalarTagArrayOutput                   `pulumi:"tags"`
	TaskDesiredCapacity     pulumi.IntPtrOutput                      `pulumi:"taskDesiredCapacity"`
	TaskEbsBlockDevices     MrScalarTaskEbsBlockDeviceArrayOutput    `pulumi:"taskEbsBlockDevices"`
	TaskEbsOptimized        pulumi.BoolPtrOutput                     `pulumi:"taskEbsOptimized"`
	TaskInstanceTypes       pulumi.StringArrayOutput                 `pulumi:"taskInstanceTypes"`
	TaskLifecycle           pulumi.StringPtrOutput                   `pulumi:"taskLifecycle"`
	TaskMaxSize             pulumi.IntPtrOutput                      `pulumi:"taskMaxSize"`
	TaskMinSize             pulumi.IntPtrOutput                      `pulumi:"taskMinSize"`
	TaskScalingDownPolicies MrScalarTaskScalingDownPolicyArrayOutput `pulumi:"taskScalingDownPolicies"`
	TaskScalingUpPolicies   MrScalarTaskScalingUpPolicyArrayOutput   `pulumi:"taskScalingUpPolicies"`
	TerminationProtected    pulumi.BoolPtrOutput                     `pulumi:"terminationProtected"`
	VisibleToAllUsers       pulumi.BoolPtrOutput                     `pulumi:"visibleToAllUsers"`
}

// NewMrScalar registers a new resource with the given unique name, arguments, and options.
func NewMrScalar(ctx *pulumi.Context,
	name string, args *MrScalarArgs, opts ...pulumi.ResourceOption) (*MrScalar, error) {
	if args == nil || args.Strategy == nil {
		return nil, errors.New("missing required argument 'Strategy'")
	}
	if args == nil {
		args = &MrScalarArgs{}
	}
	var resource MrScalar
	err := ctx.RegisterResource("spotinst:aws/mrScalar:MrScalar", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetMrScalar gets an existing MrScalar resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetMrScalar(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *MrScalarState, opts ...pulumi.ResourceOption) (*MrScalar, error) {
	var resource MrScalar
	err := ctx.ReadResource("spotinst:aws/mrScalar:MrScalar", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering MrScalar resources.
type mrScalarState struct {
	AdditionalInfo                  *string                        `pulumi:"additionalInfo"`
	AdditionalPrimarySecurityGroups []string                       `pulumi:"additionalPrimarySecurityGroups"`
	AdditionalReplicaSecurityGroups []string                       `pulumi:"additionalReplicaSecurityGroups"`
	Applications                    []MrScalarApplication          `pulumi:"applications"`
	AvailabilityZones               []string                       `pulumi:"availabilityZones"`
	BootstrapActionsFiles           []MrScalarBootstrapActionsFile `pulumi:"bootstrapActionsFiles"`
	// The MrScaler cluster id.
	ClusterId               *string                         `pulumi:"clusterId"`
	ConfigurationsFiles     []MrScalarConfigurationsFile    `pulumi:"configurationsFiles"`
	CoreDesiredCapacity     *int                            `pulumi:"coreDesiredCapacity"`
	CoreEbsBlockDevices     []MrScalarCoreEbsBlockDevice    `pulumi:"coreEbsBlockDevices"`
	CoreEbsOptimized        *bool                           `pulumi:"coreEbsOptimized"`
	CoreInstanceTypes       []string                        `pulumi:"coreInstanceTypes"`
	CoreLifecycle           *string                         `pulumi:"coreLifecycle"`
	CoreMaxSize             *int                            `pulumi:"coreMaxSize"`
	CoreMinSize             *int                            `pulumi:"coreMinSize"`
	CoreScalingDownPolicies []MrScalarCoreScalingDownPolicy `pulumi:"coreScalingDownPolicies"`
	CoreScalingUpPolicies   []MrScalarCoreScalingUpPolicy   `pulumi:"coreScalingUpPolicies"`
	CustomAmiId             *string                         `pulumi:"customAmiId"`
	// The MrScaler description.
	Description                 *string                        `pulumi:"description"`
	EbsRootVolumeSize           *int                           `pulumi:"ebsRootVolumeSize"`
	Ec2KeyName                  *string                        `pulumi:"ec2KeyName"`
	ExposeClusterId             *bool                          `pulumi:"exposeClusterId"`
	InstanceWeights             []MrScalarInstanceWeight       `pulumi:"instanceWeights"`
	JobFlowRole                 *string                        `pulumi:"jobFlowRole"`
	KeepJobFlowAlive            *bool                          `pulumi:"keepJobFlowAlive"`
	LogUri                      *string                        `pulumi:"logUri"`
	ManagedPrimarySecurityGroup *string                        `pulumi:"managedPrimarySecurityGroup"`
	ManagedReplicaSecurityGroup *string                        `pulumi:"managedReplicaSecurityGroup"`
	MasterEbsBlockDevices       []MrScalarMasterEbsBlockDevice `pulumi:"masterEbsBlockDevices"`
	MasterEbsOptimized          *bool                          `pulumi:"masterEbsOptimized"`
	MasterInstanceTypes         []string                       `pulumi:"masterInstanceTypes"`
	MasterLifecycle             *string                        `pulumi:"masterLifecycle"`
	// The MrScaler name.
	Name                *string                      `pulumi:"name"`
	OutputClusterId     *string                      `pulumi:"outputClusterId"`
	ProvisioningTimeout *MrScalarProvisioningTimeout `pulumi:"provisioningTimeout"`
	// The MrScaler region.
	Region                     *string                 `pulumi:"region"`
	ReleaseLabel               *string                 `pulumi:"releaseLabel"`
	RepoUpgradeOnBoot          *string                 `pulumi:"repoUpgradeOnBoot"`
	Retries                    *int                    `pulumi:"retries"`
	ScheduledTasks             []MrScalarScheduledTask `pulumi:"scheduledTasks"`
	SecurityConfig             *string                 `pulumi:"securityConfig"`
	ServiceAccessSecurityGroup *string                 `pulumi:"serviceAccessSecurityGroup"`
	ServiceRole                *string                 `pulumi:"serviceRole"`
	StepsFiles                 []MrScalarStepsFile     `pulumi:"stepsFiles"`
	// The MrScaler strategy. Allowed values are `new` `clone` and `wrap`.
	Strategy                *string                         `pulumi:"strategy"`
	Tags                    []MrScalarTag                   `pulumi:"tags"`
	TaskDesiredCapacity     *int                            `pulumi:"taskDesiredCapacity"`
	TaskEbsBlockDevices     []MrScalarTaskEbsBlockDevice    `pulumi:"taskEbsBlockDevices"`
	TaskEbsOptimized        *bool                           `pulumi:"taskEbsOptimized"`
	TaskInstanceTypes       []string                        `pulumi:"taskInstanceTypes"`
	TaskLifecycle           *string                         `pulumi:"taskLifecycle"`
	TaskMaxSize             *int                            `pulumi:"taskMaxSize"`
	TaskMinSize             *int                            `pulumi:"taskMinSize"`
	TaskScalingDownPolicies []MrScalarTaskScalingDownPolicy `pulumi:"taskScalingDownPolicies"`
	TaskScalingUpPolicies   []MrScalarTaskScalingUpPolicy   `pulumi:"taskScalingUpPolicies"`
	TerminationProtected    *bool                           `pulumi:"terminationProtected"`
	VisibleToAllUsers       *bool                           `pulumi:"visibleToAllUsers"`
}

type MrScalarState struct {
	AdditionalInfo                  pulumi.StringPtrInput
	AdditionalPrimarySecurityGroups pulumi.StringArrayInput
	AdditionalReplicaSecurityGroups pulumi.StringArrayInput
	Applications                    MrScalarApplicationArrayInput
	AvailabilityZones               pulumi.StringArrayInput
	BootstrapActionsFiles           MrScalarBootstrapActionsFileArrayInput
	// The MrScaler cluster id.
	ClusterId               pulumi.StringPtrInput
	ConfigurationsFiles     MrScalarConfigurationsFileArrayInput
	CoreDesiredCapacity     pulumi.IntPtrInput
	CoreEbsBlockDevices     MrScalarCoreEbsBlockDeviceArrayInput
	CoreEbsOptimized        pulumi.BoolPtrInput
	CoreInstanceTypes       pulumi.StringArrayInput
	CoreLifecycle           pulumi.StringPtrInput
	CoreMaxSize             pulumi.IntPtrInput
	CoreMinSize             pulumi.IntPtrInput
	CoreScalingDownPolicies MrScalarCoreScalingDownPolicyArrayInput
	CoreScalingUpPolicies   MrScalarCoreScalingUpPolicyArrayInput
	CustomAmiId             pulumi.StringPtrInput
	// The MrScaler description.
	Description                 pulumi.StringPtrInput
	EbsRootVolumeSize           pulumi.IntPtrInput
	Ec2KeyName                  pulumi.StringPtrInput
	ExposeClusterId             pulumi.BoolPtrInput
	InstanceWeights             MrScalarInstanceWeightArrayInput
	JobFlowRole                 pulumi.StringPtrInput
	KeepJobFlowAlive            pulumi.BoolPtrInput
	LogUri                      pulumi.StringPtrInput
	ManagedPrimarySecurityGroup pulumi.StringPtrInput
	ManagedReplicaSecurityGroup pulumi.StringPtrInput
	MasterEbsBlockDevices       MrScalarMasterEbsBlockDeviceArrayInput
	MasterEbsOptimized          pulumi.BoolPtrInput
	MasterInstanceTypes         pulumi.StringArrayInput
	MasterLifecycle             pulumi.StringPtrInput
	// The MrScaler name.
	Name                pulumi.StringPtrInput
	OutputClusterId     pulumi.StringPtrInput
	ProvisioningTimeout MrScalarProvisioningTimeoutPtrInput
	// The MrScaler region.
	Region                     pulumi.StringPtrInput
	ReleaseLabel               pulumi.StringPtrInput
	RepoUpgradeOnBoot          pulumi.StringPtrInput
	Retries                    pulumi.IntPtrInput
	ScheduledTasks             MrScalarScheduledTaskArrayInput
	SecurityConfig             pulumi.StringPtrInput
	ServiceAccessSecurityGroup pulumi.StringPtrInput
	ServiceRole                pulumi.StringPtrInput
	StepsFiles                 MrScalarStepsFileArrayInput
	// The MrScaler strategy. Allowed values are `new` `clone` and `wrap`.
	Strategy                pulumi.StringPtrInput
	Tags                    MrScalarTagArrayInput
	TaskDesiredCapacity     pulumi.IntPtrInput
	TaskEbsBlockDevices     MrScalarTaskEbsBlockDeviceArrayInput
	TaskEbsOptimized        pulumi.BoolPtrInput
	TaskInstanceTypes       pulumi.StringArrayInput
	TaskLifecycle           pulumi.StringPtrInput
	TaskMaxSize             pulumi.IntPtrInput
	TaskMinSize             pulumi.IntPtrInput
	TaskScalingDownPolicies MrScalarTaskScalingDownPolicyArrayInput
	TaskScalingUpPolicies   MrScalarTaskScalingUpPolicyArrayInput
	TerminationProtected    pulumi.BoolPtrInput
	VisibleToAllUsers       pulumi.BoolPtrInput
}

func (MrScalarState) ElementType() reflect.Type {
	return reflect.TypeOf((*mrScalarState)(nil)).Elem()
}

type mrScalarArgs struct {
	AdditionalInfo                  *string                        `pulumi:"additionalInfo"`
	AdditionalPrimarySecurityGroups []string                       `pulumi:"additionalPrimarySecurityGroups"`
	AdditionalReplicaSecurityGroups []string                       `pulumi:"additionalReplicaSecurityGroups"`
	Applications                    []MrScalarApplication          `pulumi:"applications"`
	AvailabilityZones               []string                       `pulumi:"availabilityZones"`
	BootstrapActionsFiles           []MrScalarBootstrapActionsFile `pulumi:"bootstrapActionsFiles"`
	// The MrScaler cluster id.
	ClusterId               *string                         `pulumi:"clusterId"`
	ConfigurationsFiles     []MrScalarConfigurationsFile    `pulumi:"configurationsFiles"`
	CoreDesiredCapacity     *int                            `pulumi:"coreDesiredCapacity"`
	CoreEbsBlockDevices     []MrScalarCoreEbsBlockDevice    `pulumi:"coreEbsBlockDevices"`
	CoreEbsOptimized        *bool                           `pulumi:"coreEbsOptimized"`
	CoreInstanceTypes       []string                        `pulumi:"coreInstanceTypes"`
	CoreLifecycle           *string                         `pulumi:"coreLifecycle"`
	CoreMaxSize             *int                            `pulumi:"coreMaxSize"`
	CoreMinSize             *int                            `pulumi:"coreMinSize"`
	CoreScalingDownPolicies []MrScalarCoreScalingDownPolicy `pulumi:"coreScalingDownPolicies"`
	CoreScalingUpPolicies   []MrScalarCoreScalingUpPolicy   `pulumi:"coreScalingUpPolicies"`
	CustomAmiId             *string                         `pulumi:"customAmiId"`
	// The MrScaler description.
	Description                 *string                        `pulumi:"description"`
	EbsRootVolumeSize           *int                           `pulumi:"ebsRootVolumeSize"`
	Ec2KeyName                  *string                        `pulumi:"ec2KeyName"`
	ExposeClusterId             *bool                          `pulumi:"exposeClusterId"`
	InstanceWeights             []MrScalarInstanceWeight       `pulumi:"instanceWeights"`
	JobFlowRole                 *string                        `pulumi:"jobFlowRole"`
	KeepJobFlowAlive            *bool                          `pulumi:"keepJobFlowAlive"`
	LogUri                      *string                        `pulumi:"logUri"`
	ManagedPrimarySecurityGroup *string                        `pulumi:"managedPrimarySecurityGroup"`
	ManagedReplicaSecurityGroup *string                        `pulumi:"managedReplicaSecurityGroup"`
	MasterEbsBlockDevices       []MrScalarMasterEbsBlockDevice `pulumi:"masterEbsBlockDevices"`
	MasterEbsOptimized          *bool                          `pulumi:"masterEbsOptimized"`
	MasterInstanceTypes         []string                       `pulumi:"masterInstanceTypes"`
	MasterLifecycle             *string                        `pulumi:"masterLifecycle"`
	// The MrScaler name.
	Name                *string                      `pulumi:"name"`
	ProvisioningTimeout *MrScalarProvisioningTimeout `pulumi:"provisioningTimeout"`
	// The MrScaler region.
	Region                     *string                 `pulumi:"region"`
	ReleaseLabel               *string                 `pulumi:"releaseLabel"`
	RepoUpgradeOnBoot          *string                 `pulumi:"repoUpgradeOnBoot"`
	Retries                    *int                    `pulumi:"retries"`
	ScheduledTasks             []MrScalarScheduledTask `pulumi:"scheduledTasks"`
	SecurityConfig             *string                 `pulumi:"securityConfig"`
	ServiceAccessSecurityGroup *string                 `pulumi:"serviceAccessSecurityGroup"`
	ServiceRole                *string                 `pulumi:"serviceRole"`
	StepsFiles                 []MrScalarStepsFile     `pulumi:"stepsFiles"`
	// The MrScaler strategy. Allowed values are `new` `clone` and `wrap`.
	Strategy                string                          `pulumi:"strategy"`
	Tags                    []MrScalarTag                   `pulumi:"tags"`
	TaskDesiredCapacity     *int                            `pulumi:"taskDesiredCapacity"`
	TaskEbsBlockDevices     []MrScalarTaskEbsBlockDevice    `pulumi:"taskEbsBlockDevices"`
	TaskEbsOptimized        *bool                           `pulumi:"taskEbsOptimized"`
	TaskInstanceTypes       []string                        `pulumi:"taskInstanceTypes"`
	TaskLifecycle           *string                         `pulumi:"taskLifecycle"`
	TaskMaxSize             *int                            `pulumi:"taskMaxSize"`
	TaskMinSize             *int                            `pulumi:"taskMinSize"`
	TaskScalingDownPolicies []MrScalarTaskScalingDownPolicy `pulumi:"taskScalingDownPolicies"`
	TaskScalingUpPolicies   []MrScalarTaskScalingUpPolicy   `pulumi:"taskScalingUpPolicies"`
	TerminationProtected    *bool                           `pulumi:"terminationProtected"`
	VisibleToAllUsers       *bool                           `pulumi:"visibleToAllUsers"`
}

// The set of arguments for constructing a MrScalar resource.
type MrScalarArgs struct {
	AdditionalInfo                  pulumi.StringPtrInput
	AdditionalPrimarySecurityGroups pulumi.StringArrayInput
	AdditionalReplicaSecurityGroups pulumi.StringArrayInput
	Applications                    MrScalarApplicationArrayInput
	AvailabilityZones               pulumi.StringArrayInput
	BootstrapActionsFiles           MrScalarBootstrapActionsFileArrayInput
	// The MrScaler cluster id.
	ClusterId               pulumi.StringPtrInput
	ConfigurationsFiles     MrScalarConfigurationsFileArrayInput
	CoreDesiredCapacity     pulumi.IntPtrInput
	CoreEbsBlockDevices     MrScalarCoreEbsBlockDeviceArrayInput
	CoreEbsOptimized        pulumi.BoolPtrInput
	CoreInstanceTypes       pulumi.StringArrayInput
	CoreLifecycle           pulumi.StringPtrInput
	CoreMaxSize             pulumi.IntPtrInput
	CoreMinSize             pulumi.IntPtrInput
	CoreScalingDownPolicies MrScalarCoreScalingDownPolicyArrayInput
	CoreScalingUpPolicies   MrScalarCoreScalingUpPolicyArrayInput
	CustomAmiId             pulumi.StringPtrInput
	// The MrScaler description.
	Description                 pulumi.StringPtrInput
	EbsRootVolumeSize           pulumi.IntPtrInput
	Ec2KeyName                  pulumi.StringPtrInput
	ExposeClusterId             pulumi.BoolPtrInput
	InstanceWeights             MrScalarInstanceWeightArrayInput
	JobFlowRole                 pulumi.StringPtrInput
	KeepJobFlowAlive            pulumi.BoolPtrInput
	LogUri                      pulumi.StringPtrInput
	ManagedPrimarySecurityGroup pulumi.StringPtrInput
	ManagedReplicaSecurityGroup pulumi.StringPtrInput
	MasterEbsBlockDevices       MrScalarMasterEbsBlockDeviceArrayInput
	MasterEbsOptimized          pulumi.BoolPtrInput
	MasterInstanceTypes         pulumi.StringArrayInput
	MasterLifecycle             pulumi.StringPtrInput
	// The MrScaler name.
	Name                pulumi.StringPtrInput
	ProvisioningTimeout MrScalarProvisioningTimeoutPtrInput
	// The MrScaler region.
	Region                     pulumi.StringPtrInput
	ReleaseLabel               pulumi.StringPtrInput
	RepoUpgradeOnBoot          pulumi.StringPtrInput
	Retries                    pulumi.IntPtrInput
	ScheduledTasks             MrScalarScheduledTaskArrayInput
	SecurityConfig             pulumi.StringPtrInput
	ServiceAccessSecurityGroup pulumi.StringPtrInput
	ServiceRole                pulumi.StringPtrInput
	StepsFiles                 MrScalarStepsFileArrayInput
	// The MrScaler strategy. Allowed values are `new` `clone` and `wrap`.
	Strategy                pulumi.StringInput
	Tags                    MrScalarTagArrayInput
	TaskDesiredCapacity     pulumi.IntPtrInput
	TaskEbsBlockDevices     MrScalarTaskEbsBlockDeviceArrayInput
	TaskEbsOptimized        pulumi.BoolPtrInput
	TaskInstanceTypes       pulumi.StringArrayInput
	TaskLifecycle           pulumi.StringPtrInput
	TaskMaxSize             pulumi.IntPtrInput
	TaskMinSize             pulumi.IntPtrInput
	TaskScalingDownPolicies MrScalarTaskScalingDownPolicyArrayInput
	TaskScalingUpPolicies   MrScalarTaskScalingUpPolicyArrayInput
	TerminationProtected    pulumi.BoolPtrInput
	VisibleToAllUsers       pulumi.BoolPtrInput
}

func (MrScalarArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*mrScalarArgs)(nil)).Elem()
}
