// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package spotinst

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-spotinst/sdk/v3/go/spotinst/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Spotinst subscription resource.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-spotinst/sdk/v3/go/spotinst"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := spotinst.NewSubscription(ctx, "default-subscription", &spotinst.SubscriptionArgs{
//				Endpoint:  pulumi.String("http://endpoint.com"),
//				EventType: pulumi.String("AWS_EC2_INSTANCE_LAUNCH"),
//				Format: pulumi.AnyMap{
//					"event":         pulumi.Any("%event%"),
//					"instance_id":   pulumi.Any("%instance-id%"),
//					"resource_id":   pulumi.Any("%resource-id%"),
//					"resource_name": pulumi.Any("%resource-name%"),
//					"tags":          pulumi.Any("foo,baz,baz"),
//				},
//				Protocol:   pulumi.String("http"),
//				ResourceId: pulumi.Any(spotinst_elastigroup_aws.MyEg.Id),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
type Subscription struct {
	pulumi.CustomResourceState

	// The endpoint the notification will be sent to. url in case of `"http"`/`"https"`/`"web"`, email address in case of `"email"`/`"email-json"` and sns-topic-arn in case of `"aws-sns"`.
	Endpoint pulumi.StringOutput `pulumi:"endpoint"`
	// The event to send the notification when triggered. Valid values: `"AWS_EC2_INSTANCE_TERMINATE"`, `"AWS_EC2_INSTANCE_TERMINATED"`, `"AWS_EC2_INSTANCE_LAUNCH"`, `"AWS_EC2_INSTANCE_READY_SIGNAL_TIMEOUT"`, `"AWS_EC2_CANT_SPIN_OD"`, `"AWS_EC2_INSTANCE_UNHEALTHY_IN_ELB"`, `"GROUP_ROLL_FAILED"`, `"GROUP_ROLL_FINISHED"`,
	// `"CANT_SCALE_UP_GROUP_MAX_CAPACITY"`,
	// `"GROUP_UPDATED"`,
	// `"AWS_EMR_PROVISION_TIMEOUT"`,
	// `"GROUP_BEANSTALK_INIT_READY"`,
	// `"AZURE_VM_TERMINATED"`,
	// `"AZURE_VM_TERMINATE"`,
	// `"AWS_EC2_MANAGED_INSTANCE_PAUSING"`,
	// `"AWS_EC2_MANAGED_INSTANCE_RESUMING"`,
	// `"AWS_EC2_MANAGED_INSTANCE_RECYCLING"`,`"AWS_EC2_MANAGED_INSTANCE_DELETING"`.
	// Ocean Events:`"CLUSTER_ROLL_FINISHED"`,`"GROUP_ROLL_FAILED"`.
	EventType pulumi.StringOutput `pulumi:"eventType"`
	// The format of the notification content (JSON Format - Key+Value). Valid Values : `"instance-id"`, `"event"`, `"resource-id"`, `"resource-name"`, `"subnet-id"`, `"availability-zone"`, `"reason"`, `"private-ip"`, `"launchspec-id"`
	// Example: {"event": `"event"`, `"resourceId"`: `"resource-id"`, `"resourceName"`: `"resource-name"`", `"myCustomKey"`: `"My content is set here"` }
	// Default: {`"event"`: `"<event>"`, `"instanceId"`: `"<instance-id>"`, `"resourceId"`: `"<resource-id>"`, `"resourceName"`: `"<resource-name>"` }.
	Format pulumi.MapOutput `pulumi:"format"`
	// The protocol to send the notification. Valid values: `"email"`, `"email-json"`, `"aws-sns"`, `"web"`.
	// The following values are deprecated: `"http"` , `"https"`
	// You can use the generic `"web"` protocol instead.
	// `"aws-sns"` is only supported with AWS provider
	Protocol pulumi.StringOutput `pulumi:"protocol"`
	// Spotinst Resource id (Elastigroup or Ocean ID).
	ResourceId pulumi.StringOutput `pulumi:"resourceId"`
}

// NewSubscription registers a new resource with the given unique name, arguments, and options.
func NewSubscription(ctx *pulumi.Context,
	name string, args *SubscriptionArgs, opts ...pulumi.ResourceOption) (*Subscription, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Endpoint == nil {
		return nil, errors.New("invalid value for required argument 'Endpoint'")
	}
	if args.EventType == nil {
		return nil, errors.New("invalid value for required argument 'EventType'")
	}
	if args.Protocol == nil {
		return nil, errors.New("invalid value for required argument 'Protocol'")
	}
	if args.ResourceId == nil {
		return nil, errors.New("invalid value for required argument 'ResourceId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Subscription
	err := ctx.RegisterResource("spotinst:index/subscription:Subscription", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSubscription gets an existing Subscription resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSubscription(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SubscriptionState, opts ...pulumi.ResourceOption) (*Subscription, error) {
	var resource Subscription
	err := ctx.ReadResource("spotinst:index/subscription:Subscription", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Subscription resources.
type subscriptionState struct {
	// The endpoint the notification will be sent to. url in case of `"http"`/`"https"`/`"web"`, email address in case of `"email"`/`"email-json"` and sns-topic-arn in case of `"aws-sns"`.
	Endpoint *string `pulumi:"endpoint"`
	// The event to send the notification when triggered. Valid values: `"AWS_EC2_INSTANCE_TERMINATE"`, `"AWS_EC2_INSTANCE_TERMINATED"`, `"AWS_EC2_INSTANCE_LAUNCH"`, `"AWS_EC2_INSTANCE_READY_SIGNAL_TIMEOUT"`, `"AWS_EC2_CANT_SPIN_OD"`, `"AWS_EC2_INSTANCE_UNHEALTHY_IN_ELB"`, `"GROUP_ROLL_FAILED"`, `"GROUP_ROLL_FINISHED"`,
	// `"CANT_SCALE_UP_GROUP_MAX_CAPACITY"`,
	// `"GROUP_UPDATED"`,
	// `"AWS_EMR_PROVISION_TIMEOUT"`,
	// `"GROUP_BEANSTALK_INIT_READY"`,
	// `"AZURE_VM_TERMINATED"`,
	// `"AZURE_VM_TERMINATE"`,
	// `"AWS_EC2_MANAGED_INSTANCE_PAUSING"`,
	// `"AWS_EC2_MANAGED_INSTANCE_RESUMING"`,
	// `"AWS_EC2_MANAGED_INSTANCE_RECYCLING"`,`"AWS_EC2_MANAGED_INSTANCE_DELETING"`.
	// Ocean Events:`"CLUSTER_ROLL_FINISHED"`,`"GROUP_ROLL_FAILED"`.
	EventType *string `pulumi:"eventType"`
	// The format of the notification content (JSON Format - Key+Value). Valid Values : `"instance-id"`, `"event"`, `"resource-id"`, `"resource-name"`, `"subnet-id"`, `"availability-zone"`, `"reason"`, `"private-ip"`, `"launchspec-id"`
	// Example: {"event": `"event"`, `"resourceId"`: `"resource-id"`, `"resourceName"`: `"resource-name"`", `"myCustomKey"`: `"My content is set here"` }
	// Default: {`"event"`: `"<event>"`, `"instanceId"`: `"<instance-id>"`, `"resourceId"`: `"<resource-id>"`, `"resourceName"`: `"<resource-name>"` }.
	Format map[string]interface{} `pulumi:"format"`
	// The protocol to send the notification. Valid values: `"email"`, `"email-json"`, `"aws-sns"`, `"web"`.
	// The following values are deprecated: `"http"` , `"https"`
	// You can use the generic `"web"` protocol instead.
	// `"aws-sns"` is only supported with AWS provider
	Protocol *string `pulumi:"protocol"`
	// Spotinst Resource id (Elastigroup or Ocean ID).
	ResourceId *string `pulumi:"resourceId"`
}

type SubscriptionState struct {
	// The endpoint the notification will be sent to. url in case of `"http"`/`"https"`/`"web"`, email address in case of `"email"`/`"email-json"` and sns-topic-arn in case of `"aws-sns"`.
	Endpoint pulumi.StringPtrInput
	// The event to send the notification when triggered. Valid values: `"AWS_EC2_INSTANCE_TERMINATE"`, `"AWS_EC2_INSTANCE_TERMINATED"`, `"AWS_EC2_INSTANCE_LAUNCH"`, `"AWS_EC2_INSTANCE_READY_SIGNAL_TIMEOUT"`, `"AWS_EC2_CANT_SPIN_OD"`, `"AWS_EC2_INSTANCE_UNHEALTHY_IN_ELB"`, `"GROUP_ROLL_FAILED"`, `"GROUP_ROLL_FINISHED"`,
	// `"CANT_SCALE_UP_GROUP_MAX_CAPACITY"`,
	// `"GROUP_UPDATED"`,
	// `"AWS_EMR_PROVISION_TIMEOUT"`,
	// `"GROUP_BEANSTALK_INIT_READY"`,
	// `"AZURE_VM_TERMINATED"`,
	// `"AZURE_VM_TERMINATE"`,
	// `"AWS_EC2_MANAGED_INSTANCE_PAUSING"`,
	// `"AWS_EC2_MANAGED_INSTANCE_RESUMING"`,
	// `"AWS_EC2_MANAGED_INSTANCE_RECYCLING"`,`"AWS_EC2_MANAGED_INSTANCE_DELETING"`.
	// Ocean Events:`"CLUSTER_ROLL_FINISHED"`,`"GROUP_ROLL_FAILED"`.
	EventType pulumi.StringPtrInput
	// The format of the notification content (JSON Format - Key+Value). Valid Values : `"instance-id"`, `"event"`, `"resource-id"`, `"resource-name"`, `"subnet-id"`, `"availability-zone"`, `"reason"`, `"private-ip"`, `"launchspec-id"`
	// Example: {"event": `"event"`, `"resourceId"`: `"resource-id"`, `"resourceName"`: `"resource-name"`", `"myCustomKey"`: `"My content is set here"` }
	// Default: {`"event"`: `"<event>"`, `"instanceId"`: `"<instance-id>"`, `"resourceId"`: `"<resource-id>"`, `"resourceName"`: `"<resource-name>"` }.
	Format pulumi.MapInput
	// The protocol to send the notification. Valid values: `"email"`, `"email-json"`, `"aws-sns"`, `"web"`.
	// The following values are deprecated: `"http"` , `"https"`
	// You can use the generic `"web"` protocol instead.
	// `"aws-sns"` is only supported with AWS provider
	Protocol pulumi.StringPtrInput
	// Spotinst Resource id (Elastigroup or Ocean ID).
	ResourceId pulumi.StringPtrInput
}

func (SubscriptionState) ElementType() reflect.Type {
	return reflect.TypeOf((*subscriptionState)(nil)).Elem()
}

type subscriptionArgs struct {
	// The endpoint the notification will be sent to. url in case of `"http"`/`"https"`/`"web"`, email address in case of `"email"`/`"email-json"` and sns-topic-arn in case of `"aws-sns"`.
	Endpoint string `pulumi:"endpoint"`
	// The event to send the notification when triggered. Valid values: `"AWS_EC2_INSTANCE_TERMINATE"`, `"AWS_EC2_INSTANCE_TERMINATED"`, `"AWS_EC2_INSTANCE_LAUNCH"`, `"AWS_EC2_INSTANCE_READY_SIGNAL_TIMEOUT"`, `"AWS_EC2_CANT_SPIN_OD"`, `"AWS_EC2_INSTANCE_UNHEALTHY_IN_ELB"`, `"GROUP_ROLL_FAILED"`, `"GROUP_ROLL_FINISHED"`,
	// `"CANT_SCALE_UP_GROUP_MAX_CAPACITY"`,
	// `"GROUP_UPDATED"`,
	// `"AWS_EMR_PROVISION_TIMEOUT"`,
	// `"GROUP_BEANSTALK_INIT_READY"`,
	// `"AZURE_VM_TERMINATED"`,
	// `"AZURE_VM_TERMINATE"`,
	// `"AWS_EC2_MANAGED_INSTANCE_PAUSING"`,
	// `"AWS_EC2_MANAGED_INSTANCE_RESUMING"`,
	// `"AWS_EC2_MANAGED_INSTANCE_RECYCLING"`,`"AWS_EC2_MANAGED_INSTANCE_DELETING"`.
	// Ocean Events:`"CLUSTER_ROLL_FINISHED"`,`"GROUP_ROLL_FAILED"`.
	EventType string `pulumi:"eventType"`
	// The format of the notification content (JSON Format - Key+Value). Valid Values : `"instance-id"`, `"event"`, `"resource-id"`, `"resource-name"`, `"subnet-id"`, `"availability-zone"`, `"reason"`, `"private-ip"`, `"launchspec-id"`
	// Example: {"event": `"event"`, `"resourceId"`: `"resource-id"`, `"resourceName"`: `"resource-name"`", `"myCustomKey"`: `"My content is set here"` }
	// Default: {`"event"`: `"<event>"`, `"instanceId"`: `"<instance-id>"`, `"resourceId"`: `"<resource-id>"`, `"resourceName"`: `"<resource-name>"` }.
	Format map[string]interface{} `pulumi:"format"`
	// The protocol to send the notification. Valid values: `"email"`, `"email-json"`, `"aws-sns"`, `"web"`.
	// The following values are deprecated: `"http"` , `"https"`
	// You can use the generic `"web"` protocol instead.
	// `"aws-sns"` is only supported with AWS provider
	Protocol string `pulumi:"protocol"`
	// Spotinst Resource id (Elastigroup or Ocean ID).
	ResourceId string `pulumi:"resourceId"`
}

// The set of arguments for constructing a Subscription resource.
type SubscriptionArgs struct {
	// The endpoint the notification will be sent to. url in case of `"http"`/`"https"`/`"web"`, email address in case of `"email"`/`"email-json"` and sns-topic-arn in case of `"aws-sns"`.
	Endpoint pulumi.StringInput
	// The event to send the notification when triggered. Valid values: `"AWS_EC2_INSTANCE_TERMINATE"`, `"AWS_EC2_INSTANCE_TERMINATED"`, `"AWS_EC2_INSTANCE_LAUNCH"`, `"AWS_EC2_INSTANCE_READY_SIGNAL_TIMEOUT"`, `"AWS_EC2_CANT_SPIN_OD"`, `"AWS_EC2_INSTANCE_UNHEALTHY_IN_ELB"`, `"GROUP_ROLL_FAILED"`, `"GROUP_ROLL_FINISHED"`,
	// `"CANT_SCALE_UP_GROUP_MAX_CAPACITY"`,
	// `"GROUP_UPDATED"`,
	// `"AWS_EMR_PROVISION_TIMEOUT"`,
	// `"GROUP_BEANSTALK_INIT_READY"`,
	// `"AZURE_VM_TERMINATED"`,
	// `"AZURE_VM_TERMINATE"`,
	// `"AWS_EC2_MANAGED_INSTANCE_PAUSING"`,
	// `"AWS_EC2_MANAGED_INSTANCE_RESUMING"`,
	// `"AWS_EC2_MANAGED_INSTANCE_RECYCLING"`,`"AWS_EC2_MANAGED_INSTANCE_DELETING"`.
	// Ocean Events:`"CLUSTER_ROLL_FINISHED"`,`"GROUP_ROLL_FAILED"`.
	EventType pulumi.StringInput
	// The format of the notification content (JSON Format - Key+Value). Valid Values : `"instance-id"`, `"event"`, `"resource-id"`, `"resource-name"`, `"subnet-id"`, `"availability-zone"`, `"reason"`, `"private-ip"`, `"launchspec-id"`
	// Example: {"event": `"event"`, `"resourceId"`: `"resource-id"`, `"resourceName"`: `"resource-name"`", `"myCustomKey"`: `"My content is set here"` }
	// Default: {`"event"`: `"<event>"`, `"instanceId"`: `"<instance-id>"`, `"resourceId"`: `"<resource-id>"`, `"resourceName"`: `"<resource-name>"` }.
	Format pulumi.MapInput
	// The protocol to send the notification. Valid values: `"email"`, `"email-json"`, `"aws-sns"`, `"web"`.
	// The following values are deprecated: `"http"` , `"https"`
	// You can use the generic `"web"` protocol instead.
	// `"aws-sns"` is only supported with AWS provider
	Protocol pulumi.StringInput
	// Spotinst Resource id (Elastigroup or Ocean ID).
	ResourceId pulumi.StringInput
}

func (SubscriptionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*subscriptionArgs)(nil)).Elem()
}

type SubscriptionInput interface {
	pulumi.Input

	ToSubscriptionOutput() SubscriptionOutput
	ToSubscriptionOutputWithContext(ctx context.Context) SubscriptionOutput
}

func (*Subscription) ElementType() reflect.Type {
	return reflect.TypeOf((**Subscription)(nil)).Elem()
}

func (i *Subscription) ToSubscriptionOutput() SubscriptionOutput {
	return i.ToSubscriptionOutputWithContext(context.Background())
}

func (i *Subscription) ToSubscriptionOutputWithContext(ctx context.Context) SubscriptionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SubscriptionOutput)
}

// SubscriptionArrayInput is an input type that accepts SubscriptionArray and SubscriptionArrayOutput values.
// You can construct a concrete instance of `SubscriptionArrayInput` via:
//
//	SubscriptionArray{ SubscriptionArgs{...} }
type SubscriptionArrayInput interface {
	pulumi.Input

	ToSubscriptionArrayOutput() SubscriptionArrayOutput
	ToSubscriptionArrayOutputWithContext(context.Context) SubscriptionArrayOutput
}

type SubscriptionArray []SubscriptionInput

func (SubscriptionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Subscription)(nil)).Elem()
}

func (i SubscriptionArray) ToSubscriptionArrayOutput() SubscriptionArrayOutput {
	return i.ToSubscriptionArrayOutputWithContext(context.Background())
}

func (i SubscriptionArray) ToSubscriptionArrayOutputWithContext(ctx context.Context) SubscriptionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SubscriptionArrayOutput)
}

// SubscriptionMapInput is an input type that accepts SubscriptionMap and SubscriptionMapOutput values.
// You can construct a concrete instance of `SubscriptionMapInput` via:
//
//	SubscriptionMap{ "key": SubscriptionArgs{...} }
type SubscriptionMapInput interface {
	pulumi.Input

	ToSubscriptionMapOutput() SubscriptionMapOutput
	ToSubscriptionMapOutputWithContext(context.Context) SubscriptionMapOutput
}

type SubscriptionMap map[string]SubscriptionInput

func (SubscriptionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Subscription)(nil)).Elem()
}

func (i SubscriptionMap) ToSubscriptionMapOutput() SubscriptionMapOutput {
	return i.ToSubscriptionMapOutputWithContext(context.Background())
}

func (i SubscriptionMap) ToSubscriptionMapOutputWithContext(ctx context.Context) SubscriptionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SubscriptionMapOutput)
}

type SubscriptionOutput struct{ *pulumi.OutputState }

func (SubscriptionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Subscription)(nil)).Elem()
}

func (o SubscriptionOutput) ToSubscriptionOutput() SubscriptionOutput {
	return o
}

func (o SubscriptionOutput) ToSubscriptionOutputWithContext(ctx context.Context) SubscriptionOutput {
	return o
}

// The endpoint the notification will be sent to. url in case of `"http"`/`"https"`/`"web"`, email address in case of `"email"`/`"email-json"` and sns-topic-arn in case of `"aws-sns"`.
func (o SubscriptionOutput) Endpoint() pulumi.StringOutput {
	return o.ApplyT(func(v *Subscription) pulumi.StringOutput { return v.Endpoint }).(pulumi.StringOutput)
}

// The event to send the notification when triggered. Valid values: `"AWS_EC2_INSTANCE_TERMINATE"`, `"AWS_EC2_INSTANCE_TERMINATED"`, `"AWS_EC2_INSTANCE_LAUNCH"`, `"AWS_EC2_INSTANCE_READY_SIGNAL_TIMEOUT"`, `"AWS_EC2_CANT_SPIN_OD"`, `"AWS_EC2_INSTANCE_UNHEALTHY_IN_ELB"`, `"GROUP_ROLL_FAILED"`, `"GROUP_ROLL_FINISHED"`,
// `"CANT_SCALE_UP_GROUP_MAX_CAPACITY"`,
// `"GROUP_UPDATED"`,
// `"AWS_EMR_PROVISION_TIMEOUT"`,
// `"GROUP_BEANSTALK_INIT_READY"`,
// `"AZURE_VM_TERMINATED"`,
// `"AZURE_VM_TERMINATE"`,
// `"AWS_EC2_MANAGED_INSTANCE_PAUSING"`,
// `"AWS_EC2_MANAGED_INSTANCE_RESUMING"`,
// `"AWS_EC2_MANAGED_INSTANCE_RECYCLING"`,`"AWS_EC2_MANAGED_INSTANCE_DELETING"`.
// Ocean Events:`"CLUSTER_ROLL_FINISHED"`,`"GROUP_ROLL_FAILED"`.
func (o SubscriptionOutput) EventType() pulumi.StringOutput {
	return o.ApplyT(func(v *Subscription) pulumi.StringOutput { return v.EventType }).(pulumi.StringOutput)
}

// The format of the notification content (JSON Format - Key+Value). Valid Values : `"instance-id"`, `"event"`, `"resource-id"`, `"resource-name"`, `"subnet-id"`, `"availability-zone"`, `"reason"`, `"private-ip"`, `"launchspec-id"`
// Example: {"event": `"event"`, `"resourceId"`: `"resource-id"`, `"resourceName"`: `"resource-name"`", `"myCustomKey"`: `"My content is set here"` }
// Default: {`"event"`: `"<event>"`, `"instanceId"`: `"<instance-id>"`, `"resourceId"`: `"<resource-id>"`, `"resourceName"`: `"<resource-name>"` }.
func (o SubscriptionOutput) Format() pulumi.MapOutput {
	return o.ApplyT(func(v *Subscription) pulumi.MapOutput { return v.Format }).(pulumi.MapOutput)
}

// The protocol to send the notification. Valid values: `"email"`, `"email-json"`, `"aws-sns"`, `"web"`.
// The following values are deprecated: `"http"` , `"https"`
// You can use the generic `"web"` protocol instead.
// `"aws-sns"` is only supported with AWS provider
func (o SubscriptionOutput) Protocol() pulumi.StringOutput {
	return o.ApplyT(func(v *Subscription) pulumi.StringOutput { return v.Protocol }).(pulumi.StringOutput)
}

// Spotinst Resource id (Elastigroup or Ocean ID).
func (o SubscriptionOutput) ResourceId() pulumi.StringOutput {
	return o.ApplyT(func(v *Subscription) pulumi.StringOutput { return v.ResourceId }).(pulumi.StringOutput)
}

type SubscriptionArrayOutput struct{ *pulumi.OutputState }

func (SubscriptionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Subscription)(nil)).Elem()
}

func (o SubscriptionArrayOutput) ToSubscriptionArrayOutput() SubscriptionArrayOutput {
	return o
}

func (o SubscriptionArrayOutput) ToSubscriptionArrayOutputWithContext(ctx context.Context) SubscriptionArrayOutput {
	return o
}

func (o SubscriptionArrayOutput) Index(i pulumi.IntInput) SubscriptionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Subscription {
		return vs[0].([]*Subscription)[vs[1].(int)]
	}).(SubscriptionOutput)
}

type SubscriptionMapOutput struct{ *pulumi.OutputState }

func (SubscriptionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Subscription)(nil)).Elem()
}

func (o SubscriptionMapOutput) ToSubscriptionMapOutput() SubscriptionMapOutput {
	return o
}

func (o SubscriptionMapOutput) ToSubscriptionMapOutputWithContext(ctx context.Context) SubscriptionMapOutput {
	return o
}

func (o SubscriptionMapOutput) MapIndex(k pulumi.StringInput) SubscriptionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Subscription {
		return vs[0].(map[string]*Subscription)[vs[1].(string)]
	}).(SubscriptionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SubscriptionInput)(nil)).Elem(), &Subscription{})
	pulumi.RegisterInputType(reflect.TypeOf((*SubscriptionArrayInput)(nil)).Elem(), SubscriptionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SubscriptionMapInput)(nil)).Elem(), SubscriptionMap{})
	pulumi.RegisterOutputType(SubscriptionOutput{})
	pulumi.RegisterOutputType(SubscriptionArrayOutput{})
	pulumi.RegisterOutputType(SubscriptionMapOutput{})
}
