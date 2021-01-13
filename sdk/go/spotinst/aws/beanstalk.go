// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package aws

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Provides a Spotinst AWS group resource using Elastic Beanstalk.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-spotinst/sdk/v2/go/spotinst/aws"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := aws.NewBeanstalk(ctx, "elastigoup_aws_beanstalk", &aws.BeanstalkArgs{
// 			BeanstalkEnvironmentId:   pulumi.String("e-example"),
// 			BeanstalkEnvironmentName: pulumi.String("example-env"),
// 			DeploymentPreferences: &aws.BeanstalkDeploymentPreferencesArgs{
// 				AutomaticRoll:       pulumi.Bool(true),
// 				BatchSizePercentage: pulumi.Int(100),
// 				GracePeriod:         pulumi.Int(90),
// 				Strategies: aws.BeanstalkDeploymentPreferencesStrategyArray{
// 					&aws.BeanstalkDeploymentPreferencesStrategyArgs{
// 						Action:               pulumi.String("REPLACE_SERVER"),
// 						ShouldDrainInstances: pulumi.Bool(true),
// 					},
// 				},
// 			},
// 			DesiredCapacity: pulumi.Int(0),
// 			InstanceTypesSpots: pulumi.StringArray{
// 				pulumi.String("t2.micro"),
// 				pulumi.String("t2.medium"),
// 				pulumi.String("t2.large"),
// 			},
// 			ManagedActions: &aws.BeanstalkManagedActionsArgs{
// 				PlatformUpdate: &aws.BeanstalkManagedActionsPlatformUpdateArgs{
// 					PerformAt:   pulumi.String("timeWindow"),
// 					TimeWindow:  pulumi.String("Mon:23:50-Tue:00:20"),
// 					UpdateLevel: pulumi.String("minorAndPatch"),
// 				},
// 			},
// 			MaxSize: pulumi.Int(1),
// 			MinSize: pulumi.Int(0),
// 			Product: pulumi.String("Linux/UNIX"),
// 			Region:  pulumi.String("us-west-2"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
// ## Scheduled Tasks
//
// Each `scheduledTask` supports the following:
//
// * `taskType` - (Required) The task type to run. Supported task types are: `"scale"`, `"backupAmi"`, `"roll"`, `"scaleUp"`, `"percentageScaleUp"`, `"scaleDown"`, `"percentageScaleDown"`, `"statefulUpdateCapacity"`.
// * `cronExpression` - (Optional; Required if not using `frequency`) A valid cron expression. The cron is running in UTC time zone and is in [Unix cron format](https://en.wikipedia.org/wiki/Cron).
// * `startTime` - (Optional; Format: ISO 8601) Set a start time for one time tasks.
// * `frequency` - (Optional; Required if not using `cronExpression`) The recurrence frequency to run this task. Supported values are `"hourly"`, `"daily"`, `"weekly"` and `"continuous"`.
// * `scaleTargetCapacity` - (Optional) The desired number of instances the group should have.
// * `scaleMinCapacity` - (Optional) The minimum number of instances the group should have.
// * `scaleMaxCapacity` - (Optional) The maximum number of instances the group should have.
// * `isEnabled` - (Optional, Default: `true`) Setting the task to being enabled or disabled.
// * `targetCapacity` - (Optional; Only valid for statefulUpdateCapacity) The desired number of instances the group should have.
// * `minCapacity` - (Optional; Only valid for statefulUpdateCapacity) The minimum number of instances the group should have.
// * `maxCapacity` - (Optional; Only valid for statefulUpdateCapacity) The maximum number of instances the group should have.
// * `batchSizePercentage` - (Optional; Required when the `taskType` is `"roll"`.) The percentage size of each batch in the scheduled deployment roll.
// * `gracePeriod` - (Optional) The period of time (seconds) to wait before checking a batch's health after it's deployment.
// * `adjustment` - (Optional; Min 1) The number of instances to add or remove.
// * `adjustmentPercentage` - (Optional; Min 1) The percentage of instances to add or remove.
//
// Usage:
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		return nil
// 	})
// }
// ```
type Beanstalk struct {
	pulumi.CustomResourceState

	// The id of an existing Beanstalk environment.
	BeanstalkEnvironmentId pulumi.StringPtrOutput `pulumi:"beanstalkEnvironmentId"`
	// The name of an existing Beanstalk environment.
	BeanstalkEnvironmentName pulumi.StringPtrOutput `pulumi:"beanstalkEnvironmentName"`
	// Preferences when performing a roll
	DeploymentPreferences BeanstalkDeploymentPreferencesPtrOutput `pulumi:"deploymentPreferences"`
	// The desired number of instances the group should have at any time.
	DesiredCapacity pulumi.IntOutput `pulumi:"desiredCapacity"`
	// One or more instance types. To maximize the availability of Spot instances, select as many instance types as possible.
	InstanceTypesSpots pulumi.StringArrayOutput `pulumi:"instanceTypesSpots"`
	Maintenance        pulumi.StringPtrOutput   `pulumi:"maintenance"`
	// Managed Actions parameters
	ManagedActions BeanstalkManagedActionsPtrOutput `pulumi:"managedActions"`
	// The maximum number of instances the group should have at any time.
	MaxSize pulumi.IntOutput `pulumi:"maxSize"`
	// The minimum number of instances the group should have at any time.
	MinSize pulumi.IntOutput `pulumi:"minSize"`
	// The group name.
	Name pulumi.StringOutput `pulumi:"name"`
	// Operation system type. Valid values: `"Linux/UNIX"`, `"SUSE Linux"`, `"Windows"`.
	// For EC2 Classic instances:  `"Linux/UNIX (Amazon VPC)"`, `"SUSE Linux (Amazon VPC)"`, `"Windows (Amazon VPC)"`.
	Product pulumi.StringOutput `pulumi:"product"`
	// The AWS region your group will be created in. Cannot be changed after the group has been created.
	Region         pulumi.StringOutput               `pulumi:"region"`
	ScheduledTasks BeanstalkScheduledTaskArrayOutput `pulumi:"scheduledTasks"`
}

// NewBeanstalk registers a new resource with the given unique name, arguments, and options.
func NewBeanstalk(ctx *pulumi.Context,
	name string, args *BeanstalkArgs, opts ...pulumi.ResourceOption) (*Beanstalk, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DesiredCapacity == nil {
		return nil, errors.New("invalid value for required argument 'DesiredCapacity'")
	}
	if args.InstanceTypesSpots == nil {
		return nil, errors.New("invalid value for required argument 'InstanceTypesSpots'")
	}
	if args.MaxSize == nil {
		return nil, errors.New("invalid value for required argument 'MaxSize'")
	}
	if args.MinSize == nil {
		return nil, errors.New("invalid value for required argument 'MinSize'")
	}
	if args.Product == nil {
		return nil, errors.New("invalid value for required argument 'Product'")
	}
	if args.Region == nil {
		return nil, errors.New("invalid value for required argument 'Region'")
	}
	var resource Beanstalk
	err := ctx.RegisterResource("spotinst:aws/beanstalk:Beanstalk", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetBeanstalk gets an existing Beanstalk resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetBeanstalk(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *BeanstalkState, opts ...pulumi.ResourceOption) (*Beanstalk, error) {
	var resource Beanstalk
	err := ctx.ReadResource("spotinst:aws/beanstalk:Beanstalk", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Beanstalk resources.
type beanstalkState struct {
	// The id of an existing Beanstalk environment.
	BeanstalkEnvironmentId *string `pulumi:"beanstalkEnvironmentId"`
	// The name of an existing Beanstalk environment.
	BeanstalkEnvironmentName *string `pulumi:"beanstalkEnvironmentName"`
	// Preferences when performing a roll
	DeploymentPreferences *BeanstalkDeploymentPreferences `pulumi:"deploymentPreferences"`
	// The desired number of instances the group should have at any time.
	DesiredCapacity *int `pulumi:"desiredCapacity"`
	// One or more instance types. To maximize the availability of Spot instances, select as many instance types as possible.
	InstanceTypesSpots []string `pulumi:"instanceTypesSpots"`
	Maintenance        *string  `pulumi:"maintenance"`
	// Managed Actions parameters
	ManagedActions *BeanstalkManagedActions `pulumi:"managedActions"`
	// The maximum number of instances the group should have at any time.
	MaxSize *int `pulumi:"maxSize"`
	// The minimum number of instances the group should have at any time.
	MinSize *int `pulumi:"minSize"`
	// The group name.
	Name *string `pulumi:"name"`
	// Operation system type. Valid values: `"Linux/UNIX"`, `"SUSE Linux"`, `"Windows"`.
	// For EC2 Classic instances:  `"Linux/UNIX (Amazon VPC)"`, `"SUSE Linux (Amazon VPC)"`, `"Windows (Amazon VPC)"`.
	Product *string `pulumi:"product"`
	// The AWS region your group will be created in. Cannot be changed after the group has been created.
	Region         *string                  `pulumi:"region"`
	ScheduledTasks []BeanstalkScheduledTask `pulumi:"scheduledTasks"`
}

type BeanstalkState struct {
	// The id of an existing Beanstalk environment.
	BeanstalkEnvironmentId pulumi.StringPtrInput
	// The name of an existing Beanstalk environment.
	BeanstalkEnvironmentName pulumi.StringPtrInput
	// Preferences when performing a roll
	DeploymentPreferences BeanstalkDeploymentPreferencesPtrInput
	// The desired number of instances the group should have at any time.
	DesiredCapacity pulumi.IntPtrInput
	// One or more instance types. To maximize the availability of Spot instances, select as many instance types as possible.
	InstanceTypesSpots pulumi.StringArrayInput
	Maintenance        pulumi.StringPtrInput
	// Managed Actions parameters
	ManagedActions BeanstalkManagedActionsPtrInput
	// The maximum number of instances the group should have at any time.
	MaxSize pulumi.IntPtrInput
	// The minimum number of instances the group should have at any time.
	MinSize pulumi.IntPtrInput
	// The group name.
	Name pulumi.StringPtrInput
	// Operation system type. Valid values: `"Linux/UNIX"`, `"SUSE Linux"`, `"Windows"`.
	// For EC2 Classic instances:  `"Linux/UNIX (Amazon VPC)"`, `"SUSE Linux (Amazon VPC)"`, `"Windows (Amazon VPC)"`.
	Product pulumi.StringPtrInput
	// The AWS region your group will be created in. Cannot be changed after the group has been created.
	Region         pulumi.StringPtrInput
	ScheduledTasks BeanstalkScheduledTaskArrayInput
}

func (BeanstalkState) ElementType() reflect.Type {
	return reflect.TypeOf((*beanstalkState)(nil)).Elem()
}

type beanstalkArgs struct {
	// The id of an existing Beanstalk environment.
	BeanstalkEnvironmentId *string `pulumi:"beanstalkEnvironmentId"`
	// The name of an existing Beanstalk environment.
	BeanstalkEnvironmentName *string `pulumi:"beanstalkEnvironmentName"`
	// Preferences when performing a roll
	DeploymentPreferences *BeanstalkDeploymentPreferences `pulumi:"deploymentPreferences"`
	// The desired number of instances the group should have at any time.
	DesiredCapacity int `pulumi:"desiredCapacity"`
	// One or more instance types. To maximize the availability of Spot instances, select as many instance types as possible.
	InstanceTypesSpots []string `pulumi:"instanceTypesSpots"`
	Maintenance        *string  `pulumi:"maintenance"`
	// Managed Actions parameters
	ManagedActions *BeanstalkManagedActions `pulumi:"managedActions"`
	// The maximum number of instances the group should have at any time.
	MaxSize int `pulumi:"maxSize"`
	// The minimum number of instances the group should have at any time.
	MinSize int `pulumi:"minSize"`
	// The group name.
	Name *string `pulumi:"name"`
	// Operation system type. Valid values: `"Linux/UNIX"`, `"SUSE Linux"`, `"Windows"`.
	// For EC2 Classic instances:  `"Linux/UNIX (Amazon VPC)"`, `"SUSE Linux (Amazon VPC)"`, `"Windows (Amazon VPC)"`.
	Product string `pulumi:"product"`
	// The AWS region your group will be created in. Cannot be changed after the group has been created.
	Region         string                   `pulumi:"region"`
	ScheduledTasks []BeanstalkScheduledTask `pulumi:"scheduledTasks"`
}

// The set of arguments for constructing a Beanstalk resource.
type BeanstalkArgs struct {
	// The id of an existing Beanstalk environment.
	BeanstalkEnvironmentId pulumi.StringPtrInput
	// The name of an existing Beanstalk environment.
	BeanstalkEnvironmentName pulumi.StringPtrInput
	// Preferences when performing a roll
	DeploymentPreferences BeanstalkDeploymentPreferencesPtrInput
	// The desired number of instances the group should have at any time.
	DesiredCapacity pulumi.IntInput
	// One or more instance types. To maximize the availability of Spot instances, select as many instance types as possible.
	InstanceTypesSpots pulumi.StringArrayInput
	Maintenance        pulumi.StringPtrInput
	// Managed Actions parameters
	ManagedActions BeanstalkManagedActionsPtrInput
	// The maximum number of instances the group should have at any time.
	MaxSize pulumi.IntInput
	// The minimum number of instances the group should have at any time.
	MinSize pulumi.IntInput
	// The group name.
	Name pulumi.StringPtrInput
	// Operation system type. Valid values: `"Linux/UNIX"`, `"SUSE Linux"`, `"Windows"`.
	// For EC2 Classic instances:  `"Linux/UNIX (Amazon VPC)"`, `"SUSE Linux (Amazon VPC)"`, `"Windows (Amazon VPC)"`.
	Product pulumi.StringInput
	// The AWS region your group will be created in. Cannot be changed after the group has been created.
	Region         pulumi.StringInput
	ScheduledTasks BeanstalkScheduledTaskArrayInput
}

func (BeanstalkArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*beanstalkArgs)(nil)).Elem()
}

type BeanstalkInput interface {
	pulumi.Input

	ToBeanstalkOutput() BeanstalkOutput
	ToBeanstalkOutputWithContext(ctx context.Context) BeanstalkOutput
}

func (Beanstalk) ElementType() reflect.Type {
	return reflect.TypeOf((*Beanstalk)(nil)).Elem()
}

func (i Beanstalk) ToBeanstalkOutput() BeanstalkOutput {
	return i.ToBeanstalkOutputWithContext(context.Background())
}

func (i Beanstalk) ToBeanstalkOutputWithContext(ctx context.Context) BeanstalkOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BeanstalkOutput)
}

type BeanstalkOutput struct {
	*pulumi.OutputState
}

func (BeanstalkOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*BeanstalkOutput)(nil)).Elem()
}

func (o BeanstalkOutput) ToBeanstalkOutput() BeanstalkOutput {
	return o
}

func (o BeanstalkOutput) ToBeanstalkOutputWithContext(ctx context.Context) BeanstalkOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(BeanstalkOutput{})
}
